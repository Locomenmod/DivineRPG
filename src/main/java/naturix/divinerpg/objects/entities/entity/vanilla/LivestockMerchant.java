package naturix.divinerpg.objects.entities.entity.vanilla;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.objects.entities.entity.EntityDivineRPGVillager;
import naturix.divinerpg.registry.ModItems;
import naturix.divinerpg.registry.ModSounds;
import naturix.divinerpg.utils.GUIHandler;
import naturix.divinerpg.utils.MessageLocalizer;
import naturix.divinerpg.utils.Reference;
import naturix.divinerpg.utils.Utils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class LivestockMerchant extends EntityDivineRPGVillager {
    private static final String[] MESSAGE = { "message.livestock.travel", "message.livestock.sell",
            "message.livestock.hi", "message.livestock.snapper" };

    public LivestockMerchant(World worldIn) {
        super(worldIn);
        this.setSize(0.8F, 2f);
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        if (!this.world.isRemote) {
            player.openGui(DivineRPG.instance, GUIHandler.LIVESTOCK_MERCHANT_GUI_ID, this.world, getEntityId(), 0, 0);
        }
        return super.processInteract(player, hand);
    }

    @Override
    public void extraInteract(EntityPlayer player) {
        player.sendMessage(Utils.getChatComponent(MessageLocalizer.normal("entity.divinerpg.livestock_merchant.name")
                + ": " + MessageLocalizer.normal(MESSAGE[rand.nextInt(MESSAGE.length)])));
    }

    @Override
    public void addRecipies(MerchantRecipeList list) {
        list.add(new MerchantRecipe(new ItemStack(Blocks.LOG, 32, 0), new ItemStack(ModItems.shadowCoins, 4),
                getSpawnEggs("ehu", 2)));
        list.add(new MerchantRecipe(new ItemStack(Blocks.LOG, 64, 0), new ItemStack(ModItems.shadowCoins, 7),
                getSpawnEggs("husk", 2)));
        list.add(new MerchantRecipe(new ItemStack(Blocks.STONE, 64), new ItemStack(ModItems.shadowCoins, 3),
                getSpawnEggs("stone_golem", 1)));
        list.add(new MerchantRecipe(new ItemStack(Blocks.NETHER_BRICK, 32), new ItemStack(ModItems.shadowCoins, 5),
                getSpawnEggs("smelter", 1)));
        list.add(new MerchantRecipe(new ItemStack(ModItems.jungleStone, 2), new ItemStack(ModItems.shadowCoins, 4),
                getSpawnEggs("snapper", 3)));
        list.add(new MerchantRecipe(new ItemStack(Items.LEATHER, 10), new ItemStack(ModItems.shadowCoins, 8),
                getSpawnEggs("grizzle_white", 2)));
        list.add(new MerchantRecipe(new ItemStack(Items.LEATHER, 10), new ItemStack(ModItems.shadowCoins, 8),
                getSpawnEggs("grizzle", 2)));
    }

    private ItemStack getSpawnEggs(String name, int num) {
        ItemStack spawnEggs = new ItemStack(Items.SPAWN_EGG, num);
        name = Reference.MODID + "." + name;
        ItemMonsterPlacer.applyEntityIdToItemStack(spawnEggs, new ResourceLocation(Reference.MODID, name));
        return spawnEggs;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.LIVESTOCK_MERCHANT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.LIVESTOCK_MERCHANT_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.LIVESTOCK_MERCHANT_HURT;
    }

    @Override
    public boolean getCanSpawnHere() {
        return world.provider.getDimension() == 0 && super.getCanSpawnHere();
    }
}
