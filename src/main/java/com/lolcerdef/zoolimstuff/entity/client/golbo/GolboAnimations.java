package com.lolcerdef.zoolimstuff.entity.client.golbo;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class GolboAnimations {

    public static final AnimationDefinition GOLBO_FALL = AnimationDefinition.Builder.withLength(2.04167f).looping()
            .addAnimation("frontleg3",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(20f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.66667f, KeyframeAnimations.degreeVec(27.86f, 8.86f, 4.65f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.41667f, KeyframeAnimations.degreeVec(41.72f, -2.81f, -1.26f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(20f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("frontleg2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(32.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.66667f, KeyframeAnimations.degreeVec(65.46f, -8.26f, -5.31f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.54167f, KeyframeAnimations.degreeVec(25.77f, -3.16f, -2.03f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(32.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("backleg1",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(22.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.45833f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.125f, KeyframeAnimations.degreeVec(43.16f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.79167f, KeyframeAnimations.degreeVec(18.13f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2.04167f, KeyframeAnimations.degreeVec(22.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("backleg2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(32.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.875f, KeyframeAnimations.degreeVec(75.52f, -6.34f, -13.62f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.70833f, KeyframeAnimations.degreeVec(12.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(32.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("tail",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -0.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, -0.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("tail",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 25f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.54167f, KeyframeAnimations.degreeVec(0f, 0f, 32.5f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.16667f, KeyframeAnimations.degreeVec(0f, 0f, 6.88f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.625f, KeyframeAnimations.degreeVec(0f, 7.5f, 16.37f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 25f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -30f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.125f, KeyframeAnimations.degreeVec(0f, 0f, -40f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, -30f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(0.66667f, KeyframeAnimations.degreeVec(-10f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1.41667f, KeyframeAnimations.degreeVec(10f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();
    public static final AnimationDefinition GOLBO_IDLE = AnimationDefinition.Builder.withLength(0.5f).looping().build();
    public static final AnimationDefinition GOLBO_WALK = AnimationDefinition.Builder.withLength(0.5f).looping().build();
}
