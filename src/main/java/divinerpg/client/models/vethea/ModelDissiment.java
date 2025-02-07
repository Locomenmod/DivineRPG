package divinerpg.client.models.vethea;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.*;

public class ModelDissiment<T extends Entity> extends SegmentedModel<T>
{
    //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part10;
    ModelRenderer part11;
    ModelRenderer part12;
    ModelRenderer part13;
    ModelRenderer part14;
    ModelRenderer part15;
    ModelRenderer part16;
    ModelRenderer part17;
    ModelRenderer part18;
    ModelRenderer part19;
    ModelRenderer part20;
    ModelRenderer part21;
    ModelRenderer part22;
    ModelRenderer part23;

    public ModelDissiment()
    {
        texWidth = 64;
        texHeight = 32;

        Shape1 = new ModelRenderer(this, 22, 0);
        Shape1.addBox(0F, 0F, 0F, 10, 10, 1);
        Shape1.setPos(-5F, 1F, -3F);
        Shape1.setTexSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(0F, 0F, 0F, 10, 10, 1);
        Shape2.setPos(-5F, 1F, -5F);
        Shape2.setTexSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 41, 12);
        Shape3.addBox(0F, 0F, 0F, 10, 10, 1);
        Shape3.setPos(-5F, 1F, 4F);
        Shape3.setTexSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 22, 0);
        Shape4.addBox(0F, 0F, 0F, 10, 10, 1);
        Shape4.setPos(-5F, 1F, 2F);
        Shape4.setTexSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 22, 0);
        Shape5.addBox(0F, 0F, 0F, 10, 10, 1);
        Shape5.setPos(-5F, 1F, -1F);
        Shape5.setTexSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 22, 0);
        Shape6.addBox(0F, 0F, 0F, 10, 10, 1);
        Shape6.setPos(-5F, 1F, 0F);
        Shape6.setTexSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        part1 = new ModelRenderer(this, 13, 12);
        part1.addBox(-9F, -18F, -2F, 1, 4, 1);
        part1.setPos(0F, 5F, 0F);
        part1.setTexSize(64, 32);
        part1.mirror = true;
        setRotation(part1, 0F, 0F, -1.570796F);
        part2 = new ModelRenderer(this, 36, 24);
        part2.addBox(-8F, -15F, -2F, 10, 4, 4);
        part2.setPos(0F, 5F, 0F);
        part2.setTexSize(64, 32);
        part2.mirror = true;
        setRotation(part2, 0F, 0F, -1.570796F);
        part3 = new ModelRenderer(this, 36, 24);
        part3.addBox(-5F, -13F, -2F, 10, 4, 4);
        part3.setPos(0F, 5F, 0F);
        part3.setTexSize(64, 32);
        part3.mirror = true;
        setRotation(part3, 0F, 0F, 0F);
        part4 = new ModelRenderer(this, 0, 20);
        part4.addBox(-9F, -14F, -3F, 5, 6, 6);
        part4.setPos(0F, 5F, 0F);
        part4.setTexSize(64, 32);
        part4.mirror = true;
        setRotation(part4, 0F, 0F, 0F);
        part5 = new ModelRenderer(this, 36, 24);
        part5.addBox(-5F, -14F, -2F, 10, 4, 4);
        part5.setPos(0F, 5F, 0F);
        part5.setTexSize(64, 32);
        part5.mirror = true;
        setRotation(part5, 0F, 0F, -0.9599311F);
        part6 = new ModelRenderer(this, 0, 20);
        part6.addBox(-9F, -15F, -3F, 5, 6, 6);
        part6.setPos(0F, 5F, 0F);
        part6.setTexSize(64, 32);
        part6.mirror = true;
        setRotation(part6, 0F, 0F, -0.9599311F);
        part7 = new ModelRenderer(this, 0, 20);
        part7.addBox(4F, -14F, -3F, 5, 6, 6);
        part7.setPos(0F, 5F, 0F);
        part7.setTexSize(64, 32);
        part7.mirror = true;
        setRotation(part7, 0F, 0F, 0F);
        part8 = new ModelRenderer(this, 13, 12);
        part8.addBox(-11F, -19F, 1F, 1, 4, 1);
        part8.setPos(0F, 5F, 0F);
        part8.setTexSize(64, 32);
        part8.mirror = true;
        setRotation(part8, 0F, 0F, -1.570796F);
        part9 = new ModelRenderer(this, 13, 12);
        part9.addBox(-10F, -17F, 0F, 1, 4, 1);
        part9.setPos(0F, 4F, 0F);
        part9.setTexSize(64, 32);
        part9.mirror = true;
        setRotation(part9, 0F, 0F, -1.570796F);
        part10 = new ModelRenderer(this, 13, 12);
        part10.addBox(6F, -16F, 1F, 1, 4, 1);
        part10.setPos(0F, 5F, 0F);
        part10.setTexSize(64, 32);
        part10.mirror = true;
        setRotation(part10, 0F, 0F, 0F);
        part11 = new ModelRenderer(this, 13, 12);
        part11.addBox(5F, -16F, -1F, 1, 4, 1);
        part11.setPos(0F, 5F, 0F);
        part11.setTexSize(64, 32);
        part11.mirror = true;
        setRotation(part11, 0F, 0F, 0F);
        part12 = new ModelRenderer(this, 13, 12);
        part12.addBox(7F, -16F, -2F, 1, 4, 1);
        part12.setPos(0F, 4F, 0F);
        part12.setTexSize(64, 32);
        part12.mirror = true;
        setRotation(part12, 0F, 0F, 0F);
        part13 = new ModelRenderer(this, 13, 12);
        part13.addBox(-7F, -17F, -1F, 1, 4, 1);
        part13.setPos(0F, 5F, 0F);
        part13.setTexSize(64, 32);
        part13.mirror = true;
        setRotation(part13, 0F, 0F, 0F);
        part14 = new ModelRenderer(this, 13, 12);
        part14.addBox(-6F, -16F, 1F, 1, 4, 1);
        part14.setPos(0F, 5F, 0F);
        part14.setTexSize(64, 32);
        part14.mirror = true;
        setRotation(part14, 0F, 0F, 0F);
        part15 = new ModelRenderer(this, 13, 12);
        part15.addBox(-8F, -16F, -2F, 1, 4, 1);
        part15.setPos(0F, 4F, 0F);
        part15.setTexSize(64, 32);
        part15.mirror = true;
        setRotation(part15, 0F, 0F, 0F);
        part16 = new ModelRenderer(this, 13, 12);
        part16.addBox(-8F, -18F, 1F, 1, 4, 1);
        part16.setPos(0F, 5F, 0F);
        part16.setTexSize(64, 32);
        part16.mirror = true;
        setRotation(part16, 0F, 0F, -0.9599311F);
        part17 = new ModelRenderer(this, 13, 12);
        part17.addBox(-6F, -17F, 1F, 1, 4, 1);
        part17.setPos(0F, 5F, 0F);
        part17.setTexSize(64, 32);
        part17.mirror = true;
        setRotation(part17, 0F, 0F, -0.9599311F);
        part18 = new ModelRenderer(this, 13, 12);
        part18.addBox(-8F, -16F, -2F, 1, 4, 1);
        part18.setPos(0F, 4F, 0F);
        part18.setTexSize(64, 32);
        part18.mirror = true;
        setRotation(part18, 0F, 0F, -0.9599311F);
        part19 = new ModelRenderer(this, 24, 22);
        part19.addBox(0F, -13F, -2F, 2, 6, 4);
        part19.setPos(0F, 5F, 0F);
        part19.setTexSize(64, 32);
        part19.mirror = true;
        setRotation(part19, 0F, 0F, 0.5235988F);
        part20 = new ModelRenderer(this, 0, 20);
        part20.addBox(-12F, -16F, -3F, 5, 6, 6);
        part20.setPos(0F, 5F, 0F);
        part20.setTexSize(64, 32);
        part20.mirror = true;
        setRotation(part20, 0F, 0F, -1.570796F);
        part21 = new ModelRenderer(this, 24, 22);
        part21.addBox(-1F, -13F, -2F, 2, 6, 4);
        part21.setPos(0F, 5F, 0F);
        part21.setTexSize(64, 32);
        part21.mirror = true;
        setRotation(part21, 0F, 0F, -0.5235988F);
        part22 = new ModelRenderer(this, 24, 22);
        part22.addBox(-6F, -12F, -2F, 2, 6, 4);
        part22.setPos(0F, 5F, 0F);
        part22.setTexSize(64, 32);
        part22.mirror = true;
        setRotation(part22, 0F, 0F, -1.047198F);
        part23 = new ModelRenderer(this, 24, 22);
        part23.addBox(-4F, -16F, -2F, 2, 6, 4);
        part23.setPos(0F, 5F, 0F);
        part23.setTexSize(64, 32);
        part23.mirror = true;
        setRotation(part23, 0F, 0F, -2.094395F);
    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(Shape1, Shape2, Shape3, Shape4, Shape5, Shape6, part1, part2, part3, part4, part5, part6, part7, part8, part9, part10, part11, part12, part13, part14, part15, part16, part17, part18, part19, part20, part21, part22, part23);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }

    @Override
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.part1.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part2.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part3.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part4.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part5.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part6.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part7.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part8.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part9.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part10.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part11.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part12.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part13.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part14.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part15.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part16.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part17.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part18.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part19.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part20.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part21.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part22.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.part23.zRot += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }

}