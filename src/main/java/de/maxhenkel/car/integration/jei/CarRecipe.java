package de.maxhenkel.car.integration.jei;

import de.maxhenkel.car.blocks.tileentity.TileEntityCarWorkshop;
import de.maxhenkel.car.entity.car.base.EntityGenericCar;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import java.util.Arrays;
import java.util.List;

public class CarRecipe {

    private EntityGenericCar car;
    private List<ItemStack> inputs;

    public CarRecipe(List<ItemStack> inputs) {
        this.inputs = inputs;
    }

    public CarRecipe(ItemStack... inputs) {
        this.inputs = Arrays.asList(inputs);
    }

    public List<ItemStack> getInputs() {
        return inputs;
    }

    @OnlyIn(Dist.CLIENT)
    public EntityGenericCar getCar() {
        if (car == null) {
            car = createCar(Minecraft.getInstance().level);
        }
        return car;
    }

    private EntityGenericCar createCar(Level world) {
        return TileEntityCarWorkshop.createCar(world, inputs);
    }
}
