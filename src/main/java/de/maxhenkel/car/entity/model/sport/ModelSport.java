package de.maxhenkel.car.entity.model.sport;

import de.maxhenkel.car.entity.car.base.EntityCarBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSport extends ModelBase {
	
	public ModelRenderer Haube;
    public ModelRenderer Right;
    public ModelRenderer Left;
    public ModelRenderer Back;
    public ModelRenderer Front;
    public ModelRenderer FrontWindow;
    public ModelRenderer Rear;
    public ModelRenderer Bottom;
    public ModelRenderer Spoiler;
    public ModelRenderer Wheel1a;
    public ModelRenderer Wheel1b;
    public ModelRenderer Wheel1c;
    public ModelRenderer Wheel1d;
    public ModelRenderer Wheel1e;
    public ModelRenderer Wheel1f;
    public ModelRenderer Wheel1g;
    public ModelRenderer Wheel2a;
    public ModelRenderer Wheel2b;
    public ModelRenderer Wheel2c;
    public ModelRenderer Wheel2d;
    public ModelRenderer Wheel2e;
    public ModelRenderer Wheel2f;
    public ModelRenderer Wheel2g;
    public ModelRenderer Wheel3a;
    public ModelRenderer Wheel3b;
    public ModelRenderer Wheel3c;
    public ModelRenderer Wheel3d;
    public ModelRenderer Wheel3e;
    public ModelRenderer Wheel3f;
    public ModelRenderer Wheel3g;
    public ModelRenderer Wheel4a;
    public ModelRenderer Wheel4b;
    public ModelRenderer Wheel4c;
    public ModelRenderer Wheel4d;
    public ModelRenderer Wheel4e;
    public ModelRenderer Wheel4f;
    public ModelRenderer Wheel4g;

	public ModelSport() {
		textureWidth = 128;
		textureHeight = 128;

		this.Haube = new ModelRenderer(this, 76, 46);
        this.Haube.setRotationPoint(-8.0F, -11.4F, 5.0F);
        this.Haube.addBox(0.0F, 0.0F, 0.0F, 16, 1, 8);
        this.Right = new ModelRenderer(this, 0, 43);
        this.Right.setRotationPoint(8.0F, -11.4F, -15.0F);
        this.Right.addBox(0.0F, 0.0F, 0.0F, 1, 8, 29);
        this.Left = new ModelRenderer(this, 0, 86);
        this.Left.setRotationPoint(-9.0F, -11.4F, -15.0F);
        this.Left.addBox(0.0F, 0.0F, 0.0F, 1, 8, 29);
        this.Back = new ModelRenderer(this, 0, 32);
        this.Back.setRotationPoint(-8.0F, -11.4F, 13.0F);
        this.Back.addBox(0.0F, 0.0F, 0.0F, 16, 8, 1);
        this.Front = new ModelRenderer(this, 94, 72);
        this.Front.setRotationPoint(-8.0F, -11.4F, -16.0F);
        this.Front.addBox(0.0F, 0.0F, 0.0F, 16, 8, 1);
        this.FrontWindow = new ModelRenderer(this, 94, 84);
        this.FrontWindow.setRotationPoint(-8.0F, -20.0F, -10.0F);
        this.FrontWindow.addBox(0.0F, 0.0F, 0.0F, 16, 9, 1);
        this.Rear = new ModelRenderer(this, 82, 60);
        this.Rear.setRotationPoint(-8.0F, -11.4F, -15.0F);
        this.Rear.addBox(0.0F, 0.0F, 0.0F, 16, 1, 5);
        this.Bottom = new ModelRenderer(this, 24, 0);
        this.Bottom.setRotationPoint(-9.0F, -3.3999996F, -15.0F);
        this.Bottom.addBox(0.0F, 0.0F, 0.0F, 18, 1, 29);
        this.Spoiler = new ModelRenderer(this, 94, 39);
        this.Spoiler.setRotationPoint(-8.0F, -5.3999996F, -17.0F);
        this.Spoiler.addBox(0.0F, 0.0F, 0.0F, 16, 2, 1);
        this.Wheel1a = new ModelRenderer(this, 8, 2);
        this.Wheel1a.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1a.addBox(0.0F, -3.0F, -2.0F, 1, 6, 1);
        this.Wheel1b = new ModelRenderer(this, 12, 0);
        this.Wheel1b.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1b.addBox(0.0F, -4.0F, -1.0F, 1, 8, 2);
        this.Wheel1c = new ModelRenderer(this, 4, 3);
        this.Wheel1c.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1c.addBox(0.0F, -2.0F, -3.0F, 1, 4, 1);
        this.Wheel1d = new ModelRenderer(this, 26, 4);
        this.Wheel1d.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1d.addBox(0.0F, -1.0F, -4.0F, 1, 2, 1);
        this.Wheel1e = new ModelRenderer(this, 0, 4);
        this.Wheel1e.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1e.addBox(0.0F, -1.0F, 3.0F, 1, 2, 1);
        this.Wheel1f = new ModelRenderer(this, 4, 3);
        this.Wheel1f.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1f.addBox(0.0F, -2.0F, 2.0F, 1, 4, 1);
        this.Wheel1g = new ModelRenderer(this, 8, 2);
        this.Wheel1g.setRotationPoint(9.0F, -3.3999996F, 8.0F);
        this.Wheel1g.addBox(0.0F, -3.0F, 1.0F, 1, 6, 1);
        this.Wheel2a = new ModelRenderer(this, 8, 2);
        this.Wheel2a.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2a.addBox(0.0F, -3.0F, 1.0F, 1, 6, 1);
        this.Wheel2b = new ModelRenderer(this, 12, 0);
        this.Wheel2b.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2b.addBox(0.0F, -4.0F, -1.0F, 1, 8, 2);
        this.Wheel2c = new ModelRenderer(this, 22, 3);
        this.Wheel2c.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2c.addBox(0.0F, -2.0F, 2.0F, 1, 4, 1);
        this.Wheel2d = new ModelRenderer(this, 0, 4);
        this.Wheel2d.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2d.addBox(0.0F, -1.0F, -4.0F, 1, 2, 1);
        this.Wheel2e = new ModelRenderer(this, 0, 4);
        this.Wheel2e.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2e.addBox(0.0F, -1.0F, 3.0F, 1, 2, 1);
        this.Wheel2f = new ModelRenderer(this, 4, 3);
        this.Wheel2f.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2f.addBox(0.0F, -2.0F, -3.0F, 1, 4, 1);
        this.Wheel2g = new ModelRenderer(this, 8, 2);
        this.Wheel2g.setRotationPoint(-10.0F, -3.3999996F, 8.0F);
        this.Wheel2g.addBox(0.0F, -3.0F, -2.0F, 1, 6, 1);
        this.Wheel3a = new ModelRenderer(this, 0, 4);
        this.Wheel3a.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3a.addBox(0.0F, -1.0F, 3.0F, 1, 2, 1);
        this.Wheel3b = new ModelRenderer(this, 4, 3);
        this.Wheel3b.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3b.addBox(0.0F, -2.0F, 2.0F, 1, 4, 1);
        this.Wheel3c = new ModelRenderer(this, 8, 2);
        this.Wheel3c.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3c.addBox(0.0F, -3.0F, 1.0F, 1, 6, 1);
        this.Wheel3d = new ModelRenderer(this, 12, 0);
        this.Wheel3d.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3d.addBox(0.0F, -4.0F, -1.0F, 1, 8, 2);
        this.Wheel3e = new ModelRenderer(this, 19, 2);
        this.Wheel3e.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3e.addBox(0.0F, -3.0F, -2.0F, 1, 6, 1);
        this.Wheel3f = new ModelRenderer(this, 4, 3);
        this.Wheel3f.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3f.addBox(0.0F, -2.0F, -3.0F, 1, 4, 1);
        this.Wheel3g = new ModelRenderer(this, 26, 4);
        this.Wheel3g.setRotationPoint(9.0F, -3.3999996F, -9.0F);
        this.Wheel3g.addBox(0.0F, -1.0F, -4.0F, 1, 2, 1);
        this.Wheel4a = new ModelRenderer(this, 0, 4);
        this.Wheel4a.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4a.addBox(0.0F, -1.0F, 3.0F, 1, 2, 1);
        this.Wheel4b = new ModelRenderer(this, 22, 3);
        this.Wheel4b.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4b.addBox(0.0F, -2.0F, 2.0F, 1, 4, 1);
        this.Wheel4c = new ModelRenderer(this, 8, 2);
        this.Wheel4c.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4c.addBox(0.0F, -3.0F, 1.0F, 1, 6, 1);
        this.Wheel4d = new ModelRenderer(this, 12, 0);
        this.Wheel4d.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4d.addBox(0.0F, -4.0F, -1.0F, 1, 8, 2);
        this.Wheel4e = new ModelRenderer(this, 8, 2);
        this.Wheel4e.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4e.addBox(0.0F, -3.0F, -2.0F, 1, 6, 1);
        this.Wheel4f = new ModelRenderer(this, 4, 3);
        this.Wheel4f.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4f.addBox(0.0F, -2.0F, -3.0F, 1, 4, 1);
        this.Wheel4g = new ModelRenderer(this, 22, 4);
        this.Wheel4g.setRotationPoint(-10.0F, -3.3999996F, -9.0F);
        this.Wheel4g.addBox(0.0F, -1.0F, -4.0F, 1, 2, 1);
	}
	
	public void setWheelRotation(float rot){
		setRotation(Wheel1a, rot, 0F, 0F);
		setRotation(Wheel1b, rot, 0F, 0F);
		setRotation(Wheel1c, rot, 0F, 0F);
		setRotation(Wheel1d, rot, 0F, 0F);
		setRotation(Wheel1e, rot, 0F, 0F);
		setRotation(Wheel1f, rot, 0F, 0F);
		setRotation(Wheel1g, rot, 0F, 0F);
		setRotation(Wheel2a, rot, 0F, 0F);
		setRotation(Wheel2b, rot, 0F, 0F);
		setRotation(Wheel2c, rot, 0F, 0F);
		setRotation(Wheel2d, rot, 0F, 0F);
		setRotation(Wheel2e, rot, 0F, 0F);
		setRotation(Wheel2f, rot, 0F, 0F);
		setRotation(Wheel2g, rot, 0F, 0F);
		setRotation(Wheel3a, rot, 0F, 0F);
		setRotation(Wheel3b, rot, 0F, 0F);
		setRotation(Wheel3c, rot, 0F, 0F);
		setRotation(Wheel3d, rot, 0F, 0F);
		setRotation(Wheel3e, rot, 0F, 0F);
		setRotation(Wheel3f, rot, 0F, 0F);
		setRotation(Wheel3g, rot, 0F, 0F);
		setRotation(Wheel4a, rot, 0F, 0F);
		setRotation(Wheel4b, rot, 0F, 0F);
		setRotation(Wheel4c, rot, 0F, 0F);
		setRotation(Wheel4d, rot, 0F, 0F);
		setRotation(Wheel4e, rot, 0F, 0F);
		setRotation(Wheel4f, rot, 0F, 0F);
		setRotation(Wheel4g, rot, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);

        GlStateManager.pushMatrix();
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);

		EntityCarBase car=(EntityCarBase) entity;
		
		setWheelRotation(car.updateWheelRotation(f5));
		
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		this.Haube.render(f5);
        this.Right.render(f5);
        this.Left.render(f5);
        this.Back.render(f5);
        this.Front.render(f5);
        this.FrontWindow.render(f5);
        this.Rear.render(f5);
        this.Bottom.render(f5);
        this.Spoiler.render(f5);
        this.Wheel1a.render(f5);
        this.Wheel1b.render(f5);
        this.Wheel1c.render(f5);
        this.Wheel1d.render(f5);
        this.Wheel1e.render(f5);
        this.Wheel1f.render(f5);
        this.Wheel1g.render(f5);
        this.Wheel2a.render(f5);
        this.Wheel2b.render(f5);
        this.Wheel2c.render(f5);
        this.Wheel2d.render(f5);
        this.Wheel2e.render(f5);
        this.Wheel2f.render(f5);
        this.Wheel2g.render(f5);
        this.Wheel3a.render(f5);
        this.Wheel3b.render(f5);
        this.Wheel3c.render(f5);
        this.Wheel3d.render(f5);
        this.Wheel3e.render(f5);
        this.Wheel3f.render(f5);
        this.Wheel3g.render(f5);
        this.Wheel4a.render(f5);
        this.Wheel4b.render(f5);
        this.Wheel4c.render(f5);
        this.Wheel4d.render(f5);
        this.Wheel4e.render(f5);
        this.Wheel4f.render(f5);
        this.Wheel4g.render(f5);

        GlStateManager.popMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
