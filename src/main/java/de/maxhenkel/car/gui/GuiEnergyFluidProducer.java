package de.maxhenkel.car.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import de.maxhenkel.car.blocks.tileentity.TileEntityEnergyFluidProducer;
import de.maxhenkel.corelib.inventory.ScreenBase;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.player.Inventory;

import java.util.ArrayList;
import java.util.List;

public abstract class GuiEnergyFluidProducer<T extends ContainerEnergyFluidProducer> extends ScreenBase<T> {

    private Inventory playerInv;
    private TileEntityEnergyFluidProducer tile;

    public GuiEnergyFluidProducer(ResourceLocation texture, T container, Inventory playerInventory, Component title) {
        super(texture, container, playerInventory, title);
        this.playerInv = playerInventory;
        this.tile = container.getTile();

        imageWidth = 176;
        imageHeight = 166;
    }

    public String getUnlocalizedTooltipEnergy() {
        return "tooltip.energy";
    }

    public String getUnlocalizedTooltipProgress() {
        return "tooltip.progress";
    }

    public abstract String getUnlocalizedTooltipLiquid();

    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        super.renderLabels(matrixStack, mouseX, mouseY);

        // Titles
        font.draw(matrixStack, getTitle().getVisualOrderText(), 38, 6, FONT_COLOR);
        font.draw(matrixStack, playerInv.getDisplayName().getVisualOrderText(), 8, this.imageHeight - 96 + 2, FONT_COLOR);

        if (mouseX >= leftPos + 11 && mouseX <= leftPos + 16 + 11) {
            if (mouseY >= topPos + 8 && mouseY <= topPos + 57 + 8) {
                List<FormattedCharSequence> list = new ArrayList<>();
                list.add(new TranslatableComponent(getUnlocalizedTooltipEnergy(), tile.getStoredEnergy()).getVisualOrderText());
                renderTooltip(matrixStack, list, mouseX - leftPos, mouseY - topPos);
            }
        }

        if (mouseX >= leftPos + 148 && mouseX <= leftPos + 16 + 148) {
            if (mouseY >= topPos + 8 && mouseY <= topPos + 57 + 8) {
                List<FormattedCharSequence> list = new ArrayList<>();
                list.add(new TranslatableComponent(getUnlocalizedTooltipLiquid(), tile.getCurrentMillibuckets()).getVisualOrderText());
                renderTooltip(matrixStack, list, mouseX - leftPos, mouseY - topPos);
            }
        }

        if (mouseX >= leftPos + 79 && mouseX <= leftPos + 24 + 79) {
            if (mouseY >= topPos + 34 && mouseY <= topPos + 17 + 34) {
                List<FormattedCharSequence> list = new ArrayList<>();
                list.add(new TranslatableComponent(getUnlocalizedTooltipProgress(), ((int) (getProgress() * 100F))).getVisualOrderText());
                renderTooltip(matrixStack, list, mouseX - leftPos, mouseY - topPos);
            }
        }
    }

    public void drawEnergy(PoseStack matrixStack) {
        float perc = getEnergy();

        int texX = 176;
        int texY = 17;
        int texW = 16;
        int texH = 57;
        int targetX = 11;
        int targetY = 8;

        int scHeight = (int) (texH * (1F - perc));
        int i = this.leftPos;
        int j = this.topPos;
        blit(matrixStack, i + targetX, j + targetY + scHeight, texX, texY + scHeight, texW, texH - scHeight);
    }

    public void drawFluid(PoseStack matrixStack) {
        float perc = getFluid();

        int texX = 192;
        int texY = 17;
        int texW = 16;
        int texH = 57;
        int targetX = 148;
        int targetY = 8;

        int scHeight = (int) (texH * (1F - perc));
        int i = this.leftPos;
        int j = this.topPos;
        blit(matrixStack, i + targetX, j + targetY + scHeight, texX, texY + scHeight, texW, texH - scHeight);
    }

    public void drawProgress(PoseStack matrixStack) {
        float perc = getProgress();

        int texX = 176;
        int texY = 0;
        int texW = 24;
        int texH = 17;
        int targetX = 79;
        int targetY = 34;

        int scWidth = (int) (texW * perc);
        int i = this.leftPos;
        int j = this.topPos;
        blit(matrixStack, i + targetX, j + targetY, texX, texY, scWidth, texH);
    }

    public float getEnergy() {
        return ((float) tile.getStoredEnergy()) / ((float) tile.getMaxEnergy());
    }

    public float getFluid() {
        return ((float) tile.getCurrentMillibuckets()) / ((float) tile.getFluidAmount());
    }

    public float getProgress() {
        if (tile.getTimeToGenerate() == 0) {
            return 0F;
        }
        return ((float) tile.getGeneratingTime()) / ((float) tile.getTimeToGenerate());
    }

    @Override
    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        super.renderBg(matrixStack, partialTicks, mouseX, mouseY);
        drawEnergy(matrixStack);
        drawFluid(matrixStack);
        drawProgress(matrixStack);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

}
