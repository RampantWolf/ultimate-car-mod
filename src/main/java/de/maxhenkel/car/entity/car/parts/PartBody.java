package de.maxhenkel.car.entity.car.parts;

import de.maxhenkel.corelib.client.obj.OBJModel;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.joml.Vector3d;

import java.util.List;
import java.util.function.Supplier;

public class PartBody extends PartModel {

    protected Vector3d[] wheelOffsets;
    protected Vector3d[] playerOffsets;
    protected Vector3d numberPlateOffset;
    protected float width;
    protected float height;
    protected float minRotationSpeed;
    protected float maxRotationSpeed;
    protected Supplier<Float> fuelEfficiency;
    protected Supplier<Float> acceleration;
    protected Supplier<Float> maxSpeed;
    protected String translationKey;
    protected String materialTranslationKey;

    public PartBody(OBJModel model, ResourceLocation texture, Vector3d offset, String translationKey, String materialTranslationKey) {
        super(model, texture, offset);
        this.translationKey = translationKey;
        this.materialTranslationKey = materialTranslationKey;
    }

    public Vector3d[] getWheelOffsets() {
        return wheelOffsets;
    }

    public Vector3d[] getPlayerOffsets() {
        return playerOffsets;
    }

    public Vector3d getNumberPlateOffset() {
        return numberPlateOffset;
    }

    public float getMinRotationSpeed() {
        return minRotationSpeed;
    }

    public float getMaxRotationSpeed() {
        return maxRotationSpeed;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    protected int getWheelAmount() {
        return wheelOffsets.length;
    }

    public float getFuelEfficiency() {
        return fuelEfficiency.get();
    }

    public float getAcceleration() {
        return acceleration.get();
    }

    public float getMaxSpeed() {
        return maxSpeed.get();
    }

    public String getTranslationKey() {
        return translationKey;
    }

    public String getMaterialTranslationKey() {
        return materialTranslationKey;
    }

    public boolean canFitWheel(PartWheelBase wheel) {
        return wheel instanceof PartWheel;
    }

    @Override
    public boolean validate(List<Part> parts, List<Component> messages) {
        int wheelAmount = getAmount(parts, part -> part instanceof PartWheelBase);
        if (wheelAmount < getWheelAmount()) {
            messages.add(Component.translatable("message.parts.too_few_wheels", getWheelAmount()));
        } else if (wheelAmount > getWheelAmount()) {
            messages.add(Component.translatable("message.parts.too_many_wheels", getWheelAmount()));
        }

        int engineAmount = getAmount(parts, part -> part instanceof PartEngine);
        if (engineAmount <= 0) {
            messages.add(Component.translatable("message.parts.no_engine"));
        } else if (engineAmount > 1) {
            messages.add(Component.translatable("message.parts.too_many_engines"));
        }

        if (getAmount(parts, part -> part instanceof PartLicensePlateHolder) > 1) {
            messages.add(Component.translatable("message.parts.too_many_license_plate_holders"));
        }

        if (getAmount(parts, part -> part instanceof PartBumper) > 1) {
            messages.add(Component.translatable("message.parts.too_many_bumpers"));
        }

        if (getAmount(parts, part -> part instanceof PartContainer) > 1) {
            messages.add(Component.translatable("message.parts.too_many_containers"));
        }

        return true;
    }

}
