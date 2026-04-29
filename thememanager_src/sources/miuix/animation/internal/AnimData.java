package miuix.animation.internal;

import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class AnimData {
    public long delay;
    public EaseManager.EaseStyle ease;
    public int frameCount;
    public long initTime;
    public boolean isCompleted;
    boolean justEnd;
    boolean logEnabled;
    public byte op;
    public double progress;
    public FloatProperty property;
    public long startTime;
    public double velocity;
    public int tintMode = -1;
    public double startValue = Double.MAX_VALUE;
    public double targetValue = Double.MAX_VALUE;
    public double value = Double.MAX_VALUE;

    void clear() {
        this.property = null;
        this.ease = null;
    }

    void from(UpdateInfo updateInfo, AnimConfig animConfig, AnimSpecialConfig animSpecialConfig) {
        this.property = updateInfo.property;
        this.velocity = updateInfo.velocity;
        this.frameCount = updateInfo.frameCount;
        this.op = updateInfo.animInfo.op;
        this.initTime = updateInfo.animInfo.initTime;
        this.startTime = updateInfo.animInfo.startTime;
        this.progress = updateInfo.animInfo.progress;
        this.startValue = updateInfo.animInfo.startValue;
        this.targetValue = updateInfo.animInfo.targetValue;
        this.value = updateInfo.animInfo.value;
        this.isCompleted = updateInfo.isCompleted;
        this.justEnd = updateInfo.animInfo.justEnd;
        this.tintMode = AnimConfigUtils.getTintMode(animConfig, animSpecialConfig);
        this.ease = AnimConfigUtils.getEase(animConfig, animSpecialConfig);
        this.delay = AnimConfigUtils.getDelay(animConfig, animSpecialConfig);
    }

    void reset() {
        this.isCompleted = false;
        this.frameCount = 0;
        this.justEnd = false;
    }

    public void setOp(byte b2) {
        this.op = b2;
        this.isCompleted = b2 == 0 || b2 > 2;
    }

    void to(UpdateInfo updateInfo) {
        updateInfo.frameCount = this.frameCount;
        updateInfo.animInfo.op = this.op;
        updateInfo.animInfo.delay = this.delay;
        updateInfo.animInfo.tintMode = this.tintMode;
        updateInfo.animInfo.initTime = this.initTime;
        updateInfo.animInfo.startTime = this.startTime;
        updateInfo.animInfo.progress = this.progress;
        updateInfo.animInfo.startValue = this.startValue;
        updateInfo.animInfo.targetValue = this.targetValue;
        updateInfo.isCompleted = this.isCompleted;
        updateInfo.animInfo.value = this.value;
        updateInfo.velocity = this.velocity;
        updateInfo.animInfo.justEnd = this.justEnd;
        clear();
    }
}
