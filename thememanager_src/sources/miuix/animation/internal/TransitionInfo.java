package miuix.animation.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.LinkNode;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
class TransitionInfo extends LinkNode<TransitionInfo> {
    public List<AnimTask> animTasks;
    public volatile AnimConfig config;
    public volatile AnimState from;
    public volatile boolean hasNotifyStart;
    public final int id;
    public volatile Object key;
    private final AnimStats mAnimStats;
    public volatile long startTime;
    public final Object tag;
    public final IAnimTarget target;
    public volatile AnimState to;
    public volatile List<UpdateInfo> updateList;
    public static final Map<Integer, TransitionInfo> sMap = new ConcurrentHashMap();
    private static final AtomicInteger sIdGenerator = new AtomicInteger();

    public interface IUpdateInfoCreator {
        UpdateInfo getUpdateInfo(FloatProperty floatProperty);
    }

    public TransitionInfo(IAnimTarget iAnimTarget, AnimState animState, AnimState animState2, AnimConfigLink animConfigLink) {
        int iIncrementAndGet = sIdGenerator.incrementAndGet();
        this.id = iIncrementAndGet;
        this.config = new AnimConfig();
        this.animTasks = new ArrayList();
        this.mAnimStats = new AnimStats();
        this.target = iAnimTarget;
        this.from = getState(animState);
        this.to = getState(animState2);
        Object tag = this.to.getTag();
        this.tag = tag;
        if (animState2.isTemporary) {
            this.key = tag + String.valueOf(iIncrementAndGet);
        } else {
            this.key = tag;
        }
        this.updateList = null;
        initValueForColorProperty();
        this.config.copy(animState2.getConfig());
        if (animConfigLink != null) {
            animConfigLink.addTo(this.config);
        }
        iAnimTarget.getNotifier().addListeners(this.key, this.config);
    }

    static void decreaseStartCountForDelayAnim(AnimTask animTask, AnimStats animStats, UpdateInfo updateInfo, byte b2) {
        AnimStats animStats2;
        int i2;
        if (animTask == null || b2 != 1 || updateInfo.animInfo.delay <= 0 || (i2 = (animStats2 = animTask.animStats).startCount) <= 0) {
            return;
        }
        animStats2.startCount = i2 - 1;
        animStats.startCount--;
    }

    private AnimState getState(AnimState animState) {
        if (animState == null || !animState.isTemporary) {
            return animState;
        }
        AnimState animState2 = new AnimState();
        animState2.set(animState);
        return animState2;
    }

    private void initValueForColorProperty() {
        if (this.from == null) {
            return;
        }
        Iterator<Object> it = this.to.keySet().iterator();
        while (it.hasNext()) {
            FloatProperty tempProperty = this.to.getTempProperty(it.next());
            if ((tempProperty instanceof ColorProperty) && AnimValueUtils.isInvalid(AnimValueUtils.getValueOfTarget(this.target, tempProperty, Double.MAX_VALUE))) {
                double d2 = this.from.get(this.target, tempProperty);
                if (!AnimValueUtils.isInvalid(d2)) {
                    this.target.setIntValue((ColorProperty) tempProperty, (int) d2);
                }
            }
        }
    }

    public boolean containsProperty(FloatProperty floatProperty) {
        return this.to.contains(floatProperty);
    }

    public int getAnimCount() {
        return this.to.keySet().size();
    }

    public AnimStats getAnimStats() {
        this.mAnimStats.clear();
        Iterator<AnimTask> it = this.animTasks.iterator();
        while (it.hasNext()) {
            this.mAnimStats.add(it.next().animStats);
        }
        return this.mAnimStats;
    }

    public void initUpdateList(IUpdateInfoCreator iUpdateInfoCreator) {
        this.startTime = System.nanoTime();
        AnimState animState = this.from;
        AnimState animState2 = this.to;
        boolean zIsLogEnabled = LogUtils.isLogEnabled();
        if (zIsLogEnabled) {
            LogUtils.debug("-- doSetup, id = " + this.id + ", key = " + this.key + " " + this.key.hashCode() + ", startTime = " + this.startTime + ", target = " + this.target + ", f = " + animState + ", t = " + animState2 + "\nconfig = " + this.config, new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = animState2.keySet().iterator();
        while (it.hasNext()) {
            FloatProperty property = animState2.getProperty(it.next());
            UpdateInfo updateInfo = iUpdateInfoCreator.getUpdateInfo(property);
            if (updateInfo != null) {
                arrayList.add(updateInfo);
                if (updateInfo.animInfo.op == 5) {
                    updateInfo.animInfo.clear();
                    if (zIsLogEnabled) {
                        LogUtils.debug("-- doSetup, reset updateInfo = " + updateInfo, new Object[0]);
                    }
                }
                updateInfo.animInfo.targetValue = animState2.get(this.target, property);
                if (animState != null) {
                    updateInfo.animInfo.startValue = animState.get(this.target, property);
                } else {
                    double valueOfTarget = AnimValueUtils.getValueOfTarget(this.target, property, updateInfo.animInfo.startValue);
                    if (!AnimValueUtils.isInvalid(valueOfTarget)) {
                        updateInfo.animInfo.startValue = valueOfTarget;
                    }
                }
                if (updateInfo.animInfo.op == 5) {
                    AnimInfo animInfo = updateInfo.animInfo;
                    animInfo.value = animInfo.startValue;
                    if (zIsLogEnabled) {
                        LogUtils.debug("-- doSetup, after reset value = startValue " + updateInfo.animInfo.startValue + " " + updateInfo, new Object[0]);
                    }
                }
                AnimValueUtils.handleSetToValue(updateInfo);
                if (zIsLogEnabled) {
                    LogUtils.debug("-- doSetup, after handleSetToValue " + updateInfo + ", op = " + ((int) updateInfo.animInfo.op) + ", target = " + this.target, new Object[0]);
                }
            }
        }
        this.updateList = arrayList;
    }

    public void setupTasks(boolean z2) {
        int size = this.updateList.size();
        int iMax = Math.max(1, size / 4000);
        int iCeil = (int) Math.ceil(size / iMax);
        if (this.animTasks.size() > iMax) {
            List<AnimTask> list = this.animTasks;
            list.subList(iMax, list.size()).clear();
        } else {
            for (int size2 = this.animTasks.size(); size2 < iMax; size2++) {
                this.animTasks.add(new AnimTask());
            }
        }
        int i2 = 0;
        for (AnimTask animTask : this.animTasks) {
            animTask.info = this;
            int i3 = i2 + iCeil > size ? size - i2 : iCeil;
            animTask.setup(i2, i3);
            if (z2) {
                animTask.animStats.startCount = i3;
            } else {
                animTask.updateAnimStats();
            }
            i2 += i3;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionInfo{id = ");
        sb.append(this.id);
        sb.append(", key = ");
        sb.append(this.key);
        sb.append(" ");
        sb.append(this.key.hashCode());
        sb.append(", startTime = ");
        sb.append(this.startTime);
        sb.append(", target = ");
        IAnimTarget iAnimTarget = this.target;
        sb.append(iAnimTarget != null ? iAnimTarget.getTargetObject() : null);
        sb.append(", propSize = ");
        sb.append(this.to.keySet().size());
        sb.append(", next = ");
        sb.append(this.next);
        sb.append('}');
        return sb.toString();
    }
}
