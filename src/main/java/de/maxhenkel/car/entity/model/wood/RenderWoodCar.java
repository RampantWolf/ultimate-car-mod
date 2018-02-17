package de.maxhenkel.car.entity.model.wood;

import de.maxhenkel.car.Main;
import de.maxhenkel.car.entity.car.EntityCarWood;
import de.maxhenkel.car.entity.model.RenderCarBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWoodCar extends RenderCarBase<EntityCarWood> {
	
	private ModelBase model;
	
	public RenderWoodCar(RenderManager renderManagerIn) {
		super(renderManagerIn);
		this.model=new ModelWoodCar();
	}
	
	@Override
	public ModelBase getModel(EntityCarWood entity) {
		return model;
	}

	@Override
	public void translateNumberPlate() {
		GlStateManager.translate(0F, -0.45F, -0.94F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCarWood entity) {
		switch(entity.getType()){
		case OAK:
			return new ResourceLocation(Main.MODID, "textures/entity/car_wood_oak.png");
		case ACACIA:
			return new ResourceLocation(Main.MODID, "textures/entity/car_wood_acacia.png");
		case BIRCH:
			return new ResourceLocation(Main.MODID, "textures/entity/car_wood_birch.png");
		case DARK_OAK:
			return new ResourceLocation(Main.MODID, "textures/entity/car_wood_dark_oak.png");
		case JUNGLE:
			return new ResourceLocation(Main.MODID, "textures/entity/car_wood_jungle.png");
		case SPRUCE:
			return new ResourceLocation(Main.MODID, "textures/entity/car_wood_spruce.png");
		}
		return null;
	}

	@Override
	public float getHeightOffset() {
		return 1.48F;
	}
}
