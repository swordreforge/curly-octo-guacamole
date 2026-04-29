package miuix.animation.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class AnimConfig {
    public static final long FLAG_DELTA = 1;
    public static final long FLAG_INIT = 2;
    public static final long FLAG_INT = 4;
    public static final int TINT_ALPHA = 0;
    public static final int TINT_AUTO = -1;
    public static final int TINT_OPAQUE = 1;
    public static final int TINT_REGION_USER_DEFINED = 3;
    public static final EaseManager.EaseStyle sDefEase = EaseManager.getStyle(-2, 0.85f, 0.3f);
    public long delay;
    public EaseManager.EaseStyle ease;
    public long flags;
    public float fromSpeed;
    public final HashSet<TransitionListener> listeners;
    private final Map<String, AnimSpecialConfig> mSpecialNameMap;

    @Deprecated
    public long minDuration;
    public Object tag;
    public int tintMode;

    public AnimConfig() {
        this(false);
    }

    public AnimConfig addListeners(TransitionListener... transitionListenerArr) {
        Collections.addAll(this.listeners, transitionListenerArr);
        return this;
    }

    public void addSpecialConfigs(AnimConfig animConfig) {
        this.mSpecialNameMap.putAll(animConfig.mSpecialNameMap);
    }

    public void clear() {
        this.delay = 0L;
        this.ease = null;
        this.listeners.clear();
        this.tag = null;
        this.flags = 0L;
        this.fromSpeed = Float.MAX_VALUE;
        this.minDuration = 0L;
        this.tintMode = -1;
        Map<String, AnimSpecialConfig> map = this.mSpecialNameMap;
        if (map != null) {
            map.clear();
        }
    }

    public void copy(AnimConfig animConfig) {
        if (animConfig == null || animConfig == this) {
            return;
        }
        this.delay = animConfig.delay;
        this.ease = animConfig.ease;
        this.listeners.addAll(animConfig.listeners);
        this.tag = animConfig.tag;
        this.flags = animConfig.flags;
        this.fromSpeed = animConfig.fromSpeed;
        this.minDuration = animConfig.minDuration;
        this.tintMode = animConfig.tintMode;
        Map<String, AnimSpecialConfig> map = this.mSpecialNameMap;
        if (map != null) {
            map.clear();
            this.mSpecialNameMap.putAll(animConfig.mSpecialNameMap);
        }
    }

    public AnimSpecialConfig getSpecialConfig(FloatProperty floatProperty) {
        return queryAndCreateSpecial(floatProperty, false);
    }

    public AnimSpecialConfig queryAndCreateSpecial(FloatProperty floatProperty) {
        return queryAndCreateSpecial(floatProperty, true);
    }

    public AnimConfig removeListeners(TransitionListener... transitionListenerArr) {
        if (transitionListenerArr.length == 0) {
            this.listeners.clear();
        } else {
            this.listeners.removeAll(Arrays.asList(transitionListenerArr));
        }
        return this;
    }

    public AnimConfig setDelay(long j2) {
        this.delay = j2;
        return this;
    }

    public AnimConfig setEase(EaseManager.EaseStyle easeStyle) {
        this.ease = easeStyle;
        return this;
    }

    public AnimConfig setFromSpeed(float f2) {
        this.fromSpeed = f2;
        return this;
    }

    public AnimConfig setMinDuration(long j2) {
        this.minDuration = j2;
        return this;
    }

    public AnimConfig setSpecial(String str, long j2, float... fArr) {
        return setSpecial(str, (EaseManager.EaseStyle) null, j2, fArr);
    }

    public AnimConfig setTag(Object obj) {
        this.tag = obj;
        return this;
    }

    public AnimConfig setTintMode(int i2) {
        this.tintMode = i2;
        return this;
    }

    public String toString() {
        return "AnimConfig{delay=" + this.delay + ", minDuration=" + this.minDuration + ", ease=" + this.ease + ", fromSpeed=" + this.fromSpeed + ", tintMode=" + this.tintMode + ", tag=" + this.tag + ", flags=" + this.flags + ", listeners=" + this.listeners + ", specialNameMap = " + ((Object) CommonUtils.mapToString(this.mSpecialNameMap, "    ")) + '}';
    }

    public AnimConfig(boolean z2) {
        this.fromSpeed = Float.MAX_VALUE;
        this.tintMode = -1;
        if (z2) {
            this.mSpecialNameMap = null;
            this.listeners = null;
        } else {
            this.mSpecialNameMap = new HashMap();
            this.listeners = new HashSet<>();
        }
    }

    public AnimSpecialConfig getSpecialConfig(String str) {
        return queryAndCreateSpecial(str, false);
    }

    public AnimSpecialConfig queryAndCreateSpecial(String str) {
        return queryAndCreateSpecial(str, true);
    }

    public AnimConfig setEase(int i2, float... fArr) {
        this.ease = EaseManager.getStyle(i2, fArr);
        return this;
    }

    public AnimConfig setSpecial(String str, EaseManager.EaseStyle easeStyle, float... fArr) {
        return setSpecial(str, easeStyle, 0L, fArr);
    }

    private AnimSpecialConfig queryAndCreateSpecial(FloatProperty floatProperty, boolean z2) {
        if (floatProperty == null) {
            return null;
        }
        return queryAndCreateSpecial(floatProperty.getName(), z2);
    }

    public AnimConfig setSpecial(String str, EaseManager.EaseStyle easeStyle, long j2, float... fArr) {
        setSpecial(queryAndCreateSpecial(str, true), easeStyle, j2, fArr);
        return this;
    }

    private AnimSpecialConfig queryAndCreateSpecial(String str, boolean z2) {
        AnimSpecialConfig animSpecialConfig = this.mSpecialNameMap.get(str);
        if (animSpecialConfig != null || !z2) {
            return animSpecialConfig;
        }
        AnimSpecialConfig animSpecialConfig2 = new AnimSpecialConfig();
        this.mSpecialNameMap.put(str, animSpecialConfig2);
        return animSpecialConfig2;
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, long j2, float... fArr) {
        return setSpecial(floatProperty, (EaseManager.EaseStyle) null, j2, fArr);
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, EaseManager.EaseStyle easeStyle, float... fArr) {
        setSpecial(floatProperty, easeStyle, -1L, fArr);
        return this;
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, EaseManager.EaseStyle easeStyle, long j2, float... fArr) {
        setSpecial(queryAndCreateSpecial(floatProperty, true), easeStyle, j2, fArr);
        return this;
    }

    public AnimConfig(AnimConfig animConfig) {
        this(false);
        copy(animConfig);
    }

    void setSpecial(AnimSpecialConfig animSpecialConfig, EaseManager.EaseStyle easeStyle, long j2, float... fArr) {
        if (easeStyle != null) {
            animSpecialConfig.setEase(easeStyle);
        }
        if (j2 > 0) {
            animSpecialConfig.setDelay(j2);
        }
        if (fArr.length > 0) {
            animSpecialConfig.setFromSpeed(fArr[0]);
        }
    }

    public AnimConfig setSpecial(FloatProperty floatProperty, AnimSpecialConfig animSpecialConfig) {
        if (animSpecialConfig != null) {
            this.mSpecialNameMap.put(floatProperty.getName(), animSpecialConfig);
        } else {
            this.mSpecialNameMap.remove(floatProperty.getName());
        }
        return this;
    }

    public AnimConfig setSpecial(String str, AnimSpecialConfig animSpecialConfig) {
        if (animSpecialConfig != null) {
            this.mSpecialNameMap.put(str, animSpecialConfig);
        } else {
            this.mSpecialNameMap.remove(str);
        }
        return this;
    }
}
