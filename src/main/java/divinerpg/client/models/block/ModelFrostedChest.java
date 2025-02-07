package divinerpg.client.models.block;

import com.mojang.blaze3d.matrix.*;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.model.*;

/**
 * Created by LiteWolf101 on Feb /08/2019
 */

public class ModelFrostedChest extends Model {
    ModelRenderer storage;
    public ModelRenderer lid;
    public ModelRenderer handle;

    public ModelFrostedChest() {
        super(RenderType::entityCutoutNoCull);
        this.texWidth = 64;
        this.texHeight = 64;

        this.storage = new ModelRenderer(this, 0, 19);
        this.storage.setPos(1.0F, 6.0F, 1.0F);
        this.storage.addBox(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
        this.handle = new ModelRenderer(this, 0, 0);
        this.handle.setPos(8.0F, 7.0F, 15.0F);
        this.handle.addBox(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
        this.lid = new ModelRenderer(this, 0, 0);
        this.lid.setPos(1.0F, 7.0F, 15.0F);
        this.lid.addBox(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
    }
    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder builder, int light, int overlay, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        this.handle.xRot = this.lid.xRot;
        storage.render(matrixStack, builder, light, overlay, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        lid.render(matrixStack, builder, light, overlay, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        handle.render(matrixStack, builder, light, overlay, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }
}
