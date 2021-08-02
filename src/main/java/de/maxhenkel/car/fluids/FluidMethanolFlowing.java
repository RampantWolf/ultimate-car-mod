package de.maxhenkel.car.fluids;

import de.maxhenkel.car.Main;
import de.maxhenkel.car.blocks.ModBlocks;
import de.maxhenkel.car.items.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fluids.FluidAttributes;

public class FluidMethanolFlowing extends CarFluidFlowing {

    protected FluidMethanolFlowing() {
        super(
                FluidAttributes.builder(
                        new ResourceLocation(Main.MODID, "block/methanol_still"),
                        new ResourceLocation(Main.MODID, "block/methanol_flowing")).sound(SoundEvents.BUCKET_FILL),
                () -> ModBlocks.METHANOL,
                () -> ModFluids.METHANOL,
                () -> ModFluids.METHANOL_FLOWING,
                () -> ModItems.METHANOL_BUCKET
        );
        setRegistryName(new ResourceLocation(Main.MODID, "methanol_flowing"));
    }

    @Override
    public void applyEffects(Entity entity, BlockState state, Level worldIn, BlockPos pos) {
        ModFluids.METHANOL.applyEffects(entity, state, worldIn, pos);
    }
}
