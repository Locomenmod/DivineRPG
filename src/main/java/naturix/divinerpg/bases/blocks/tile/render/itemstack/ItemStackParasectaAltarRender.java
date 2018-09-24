package naturix.divinerpg.bases.blocks.tile.render.itemstack;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.bases.blocks.tile.model.ParasectaAltarModel;
import naturix.divinerpg.registry.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ItemStackParasectaAltarRender extends TileEntityItemStackRenderer {
    public final TileEntityItemStackRenderer PARENT;
    private final ParasectaAltarModel MODEL_SHIELD = new ParasectaAltarModel();
    private final ResourceLocation SHIELD_PARTS_TEXTURE = new ResourceLocation(DivineRPG.modId + ":textures/model/altar_parasecta.png");

    public ItemStackParasectaAltarRender(TileEntityItemStackRenderer previous) {
    	PARENT = previous;
    }

    @Override
    public void renderByItem(ItemStack stack) {
    	this.renderByItem(stack, 1.0F);
    }

    @Override
	public void renderByItem(ItemStack stack, float partialTicks) {
        if ((!stack.isEmpty())) {
            ItemStack item = new ItemStack(ModBlocks.altarParasecta);
            Minecraft.getMinecraft().getTextureManager().bindTexture(SHIELD_PARTS_TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0, -1.0, -1.0);
            MODEL_SHIELD.render(1);
            GlStateManager.popMatrix();

            GlStateManager.pushMatrix();
            GlStateManager.scale(1.25, 1.25, 1.25);
            GlStateManager.translate(0, 0, 0.08125);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            renderItem(item.getItem().getDefaultInstance());
            GlStateManager.popMatrix();
        }
        else
            PARENT.renderByItem(stack);
    }

    private void renderItem(ItemStack stack){
        Minecraft.getMinecraft().getRenderItem().renderItem(stack, Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(stack, (World) null, (EntityLivingBase) null));
    }
}