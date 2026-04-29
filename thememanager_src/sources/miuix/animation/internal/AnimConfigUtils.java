package miuix.animation.internal;

import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class AnimConfigUtils {
    private AnimConfigUtils() {
    }

    public static float chooseSpeed(float f2, float f3) {
        return AnimValueUtils.isInvalid((double) f2) ? f3 : AnimValueUtils.isInvalid((double) f3) ? f2 : Math.max(f2, f3);
    }

    static long getDelay(AnimConfig animConfig, AnimSpecialConfig animSpecialConfig) {
        return Math.max(animConfig.delay, animSpecialConfig != null ? animSpecialConfig.delay : 0L);
    }

    static EaseManager.EaseStyle getEase(AnimConfig animConfig, AnimSpecialConfig animSpecialConfig) {
        EaseManager.EaseStyle easeStyle;
        if (animSpecialConfig == null || (easeStyle = animSpecialConfig.ease) == null || easeStyle == AnimConfig.sDefEase) {
            easeStyle = animConfig.ease;
        }
        return easeStyle == null ? AnimConfig.sDefEase : easeStyle;
    }

    static float getFromSpeed(AnimConfig animConfig, AnimSpecialConfig animSpecialConfig) {
        return (animSpecialConfig == null || AnimValueUtils.isInvalid((double) animSpecialConfig.fromSpeed)) ? animConfig.fromSpeed : animSpecialConfig.fromSpeed;
    }

    static int getTintMode(AnimConfig animConfig, AnimSpecialConfig animSpecialConfig) {
        return Math.max(animConfig.tintMode, animSpecialConfig != null ? animSpecialConfig.tintMode : -1);
    }
}
