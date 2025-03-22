package com.lolcerdef.zoolimstuff.entity.custom;

import com.lolcerdef.zoolimstuff.entity.ModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class GolboEntity extends Animal {
    public static final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public static final AnimationState fallingAnimationState = new AnimationState();
    private int fallingAnimationTimeout = 0;

    public GolboEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 12d)
                .add(Attributes.MOVEMENT_SPEED, 0d)
                .add(Attributes.FOLLOW_RANGE, 0d)
                .add(Attributes.FALL_DAMAGE_MULTIPLIER, 0);
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return itemStack.is(Items.AIR);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.GOLBO.get().create(serverLevel);
    }

    private void setupAnimationStates() {
        if (this.fallDistance > 0) {
            if (this.fallingAnimationTimeout <= 0) {
                this.fallingAnimationTimeout = 40;
                this.fallingAnimationState.start(this.tickCount);
            } else {
                --this.fallingAnimationTimeout;
            }
        } else {
            if (this.idleAnimationTimeout <= 0) {
                this.idleAnimationTimeout = 10;
                this.idleAnimationState.start(this.tickCount);
            } else {
                --this.idleAnimationTimeout;
            }
        }
    }

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide) {
            this.setupAnimationStates();
        }
    }
}
