package com.lolcerdef.zoolimstuff.entity.custom;

import com.lolcerdef.zoolimstuff.block.ZBlocks;
import com.lolcerdef.zoolimstuff.entity.ModEntities;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class LonglegsEntity extends Animal {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public LonglegsEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1, (stack) -> stack.is(ZBlocks.BRUTALIAN_CONCRETE.asItem()), false));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1, (stack) -> stack.is(Items.WHITE_CONCRETE), false));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1));
    }




    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.FOLLOW_RANGE, 24d)
                .add(Attributes.MAX_HEALTH, 15d)
                .add(Attributes.MOVEMENT_SPEED, 0.15d);
    }


    @Override
    public boolean isFood(ItemStack itemStack) {
        return itemStack.is(ZBlocks.BRUTALIAN_CONCRETE.asItem());
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.LONGLEGS.get().create(serverLevel);
    }

    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
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
