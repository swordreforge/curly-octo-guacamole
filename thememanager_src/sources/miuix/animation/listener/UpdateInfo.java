package miuix.animation.listener;

import java.util.Collection;
import miuix.animation.IAnimTarget;
import miuix.animation.internal.AnimInfo;
import miuix.animation.internal.AnimTask;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class UpdateInfo {
    public final AnimInfo animInfo = new AnimInfo();
    public volatile int frameCount;
    public volatile boolean isCompleted;
    public final FloatProperty property;
    public final boolean useInt;
    public volatile double velocity;

    public UpdateInfo(FloatProperty floatProperty) {
        this.property = floatProperty;
        this.useInt = floatProperty instanceof IIntValueProperty;
    }

    public static UpdateInfo findBy(Collection<UpdateInfo> collection, FloatProperty floatProperty) {
        for (UpdateInfo updateInfo : collection) {
            if (updateInfo.property.equals(floatProperty)) {
                return updateInfo;
            }
        }
        return null;
    }

    public static UpdateInfo findByName(Collection<UpdateInfo> collection, String str) {
        for (UpdateInfo updateInfo : collection) {
            if (updateInfo.property.getName().equals(str)) {
                return updateInfo;
            }
        }
        return null;
    }

    public float getFloatValue() {
        double d2 = this.animInfo.setToValue;
        if (d2 != Double.MAX_VALUE) {
            return (float) d2;
        }
        float f2 = (float) (this.animInfo.value < 3.4028234663852886E38d ? this.animInfo.value : 3.4028234663852886E38d);
        if (f2 != Float.MAX_VALUE) {
            return Math.max(-3.4028235E38f, f2);
        }
        LogUtils.debug("warning value is Float.MAX_VALUE !! correct to startValue " + this.animInfo.startValue + " " + this, new Object[0]);
        AnimInfo animInfo = this.animInfo;
        animInfo.value = animInfo.startValue;
        return (float) this.animInfo.startValue;
    }

    public int getIntValue() {
        double d2 = this.animInfo.setToValue;
        if (d2 != Double.MAX_VALUE) {
            return (int) d2;
        }
        int i2 = this.animInfo.value >= Double.MAX_VALUE ? Integer.MAX_VALUE : (int) this.animInfo.value;
        if (i2 != Integer.MAX_VALUE) {
            return Math.max(-2147483647, i2);
        }
        LogUtils.debug("warning value is Integer.MAX_VALUE !! correct to startValue " + this.animInfo.startValue + " " + this, new Object[0]);
        AnimInfo animInfo = this.animInfo;
        animInfo.value = animInfo.startValue;
        return (int) this.animInfo.startValue;
    }

    public Class<?> getType() {
        return this.property instanceof IIntValueProperty ? Integer.TYPE : Float.TYPE;
    }

    public <T> T getValue(Class<T> cls) {
        return (cls == Float.class || cls == Float.TYPE) ? (T) Float.valueOf(getFloatValue()) : (cls == Double.class || cls == Double.TYPE) ? (T) Double.valueOf(this.animInfo.value) : (T) Integer.valueOf(getIntValue());
    }

    public boolean isValid() {
        return this.property != null;
    }

    public void reset() {
        this.isCompleted = false;
        this.frameCount = 0;
    }

    public void setOp(byte b2) {
        this.isCompleted = b2 == 0 || b2 > 2;
        if (this.isCompleted && AnimTask.isRunning(this.animInfo.op)) {
            this.animInfo.justEnd = true;
        }
        this.animInfo.op = b2;
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("---- UpdateInfo setOp " + ((int) b2) + " justEnd " + this.animInfo.justEnd + " isCompleted " + this.isCompleted, new Object[0]);
        }
    }

    public void setTargetValue(IAnimTarget iAnimTarget) {
        if (this.useInt) {
            iAnimTarget.setIntValue((IIntValueProperty) this.property, getIntValue());
        } else {
            iAnimTarget.setValue(this.property, getFloatValue());
        }
    }

    public String toString() {
        return "UpdateInfo{, id=" + hashCode() + ", property=" + this.property + ", velocity=" + this.velocity + ", op = " + ((int) this.animInfo.op) + ", startValue = " + this.animInfo.startValue + ", targetValue = " + this.animInfo.targetValue + ", setToValue = " + this.animInfo.setToValue + ", value = " + this.animInfo.value + ", startTime = " + this.animInfo.startTime + ", useInt=" + this.useInt + ", frameCount=" + this.frameCount + ", isCompleted=" + this.isCompleted + '}';
    }
}
