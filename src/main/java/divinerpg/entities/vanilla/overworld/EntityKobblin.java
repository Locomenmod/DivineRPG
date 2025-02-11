package divinerpg.entities.vanilla.overworld;

import divinerpg.entities.base.*;
import divinerpg.registries.*;
import divinerpg.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.nbt.*;
import net.minecraft.network.datasync.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

import javax.annotation.*;
import java.util.*;

public class EntityKobblin extends EntityDivineMob {
    private static final DataParameter<Boolean> PROVOKED = EntityDataManager.defineId(EntityKobblin.class, DataSerializers.BOOLEAN);

    public EntityKobblin(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static boolean canSpawnOn(EntityType<? extends MobEntity> typeIn, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn) {
        return true;
    }

    @Override
    public float getWalkTargetValue(BlockPos pos, IWorldReader reader) {
        return 0.0F;
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 0.9F;
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        entityData.define(PROVOKED, false);
    }

    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.kobblinHealth).add(Attributes.ATTACK_DAMAGE, EntityStats.kobblinDamage).add(Attributes.MOVEMENT_SPEED, EntityStats.kobblinSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.kobblinFollowRange);
    }

    @Override
    public int getMaxSpawnClusterSize() {return 1;
    }
    
    @Override
    protected void registerGoals() {
    	super.registerGoals();
    	this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1, true));
    }

    @Override
    public void setDeltaMovement(double x, double y, double z) {
        if (this.getProvoked())
            super.setDeltaMovement(x, y, z);
    }

    @Override
    public void tick() {
        super.tick();
        if(!this.level.isClientSide) {
        	PlayerEntity player = this.level.getNearestPlayer(this, 4.0D);
        	if(player == null) {
        		setProvoked(this.getTarget());
        	} else {
        		if(!getProvoked()) {
        			this.setDeltaMovement(0, 0.6, 0);
        		}
        		setProvoked(player);
        	}
        	setNoAi(!entityData.get(PROVOKED));
        }
        if (!this.getProvoked()) {
            this.xRotO = 0;
        }
    }
    public void readAdditionalSaveData(CompoundNBT tag) {
        super.readAdditionalSaveData(tag);
        if (tag.getBoolean("Provoked"))
            setProvoked(null);
    }

    public void addAdditionalSaveData(CompoundNBT tag) {
        super.addAdditionalSaveData(tag);
        tag.putBoolean("Provoked", this.getProvoked());
    }

    public boolean getProvoked() {
        return entityData.get(PROVOKED);
    }

    @Nullable
    public void setProvoked(LivingEntity entity) {
    	if (entity == null || entity.distanceTo(this) > 16.0f) {
			calmDown();
		} else {
			if(entity instanceof PlayerEntity) {
				PlayerEntity player = (PlayerEntity) entity;
				if(player.isCreative() || player.isSpectator()) {
					calmDown();
					return;
				}
			}
			entityData.set(PROVOKED, true);
			this.setTarget(entity);
		}
    }
    public void calmDown() {
		entityData.set(PROVOKED, false);
		this.setTarget(null);
	}
    @Override
    public boolean hurt(DamageSource source, float amount) {
        Entity entity = source.getDirectEntity();
        if (entity instanceof PlayerEntity && !getProvoked()) {
            PlayerEntity player = (PlayerEntity) entity;
            this.setProvoked(player);
            this.setDeltaMovement(0, 0.6, 0);
        }
        return super.hurt(source, amount);
    }
    public boolean needsSpecialAI() {
        return true;
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.KOBBLIN;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.KOBBLIN;
    }

}