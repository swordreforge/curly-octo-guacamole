package miuix.animation.internal;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.internal.TransitionInfo;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AnimManager implements TransitionInfo.IUpdateInfoCreator {
    IAnimTarget mTarget;
    private List<UpdateInfo> mUpdateList;
    final Set<Object> mStartAnim = new HashSet();
    final Set<Object> mBeginAnim = new HashSet();
    final ConcurrentHashMap<Integer, Object> mSetupInfo = new ConcurrentHashMap<>();
    final ConcurrentHashMap<FloatProperty, UpdateInfo> mUpdateMap = new ConcurrentHashMap<>();
    final ConcurrentHashMap<Object, TransitionInfo> mRunningInfo = new ConcurrentHashMap<>();
    final ConcurrentHashMap<Object, TransitionInfo> mPendingRemovedInfo = new ConcurrentHashMap<>();
    final ConcurrentLinkedQueue<TransitionInfo> mWaitState = new ConcurrentLinkedQueue<>();

    private void clearRunningInfo() {
        Iterator<TransitionInfo> it = this.mRunningInfo.values().iterator();
        while (it.hasNext()) {
            TransitionInfo.sMap.remove(Integer.valueOf(it.next().id));
        }
        this.mRunningInfo.clear();
    }

    private boolean containProperties(TransitionInfo transitionInfo, FloatProperty... floatPropertyArr) {
        for (FloatProperty floatProperty : floatPropertyArr) {
            if (transitionInfo.containsProperty(floatProperty)) {
                return true;
            }
        }
        return false;
    }

    private boolean pendState(TransitionInfo transitionInfo) {
        if (!CommonUtils.hasFlags(transitionInfo.to.flags, 1L)) {
            return false;
        }
        this.mWaitState.add(transitionInfo);
        return true;
    }

    private void removeSameAnim(TransitionInfo transitionInfo) {
        for (TransitionInfo transitionInfo2 : this.mRunningInfo.values()) {
            if (transitionInfo2 != transitionInfo) {
                List<UpdateInfo> list = transitionInfo2.updateList;
                if (this.mUpdateList == null) {
                    this.mUpdateList = new ArrayList();
                }
                for (UpdateInfo updateInfo : list) {
                    if (!transitionInfo.to.contains(updateInfo.property)) {
                        this.mUpdateList.add(updateInfo);
                    }
                }
                if (this.mUpdateList.isEmpty()) {
                    if (transitionInfo2.id != transitionInfo.id) {
                        notifyTransitionEnd(transitionInfo2, 5, 4);
                    }
                } else if (this.mUpdateList.size() != transitionInfo2.updateList.size()) {
                    transitionInfo2.updateList = this.mUpdateList;
                    this.mUpdateList = null;
                    transitionInfo2.setupTasks(false);
                } else {
                    this.mUpdateList.clear();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setTargetValue(AnimState animState, AnimConfigLink animConfigLink) {
        Iterator<Object> it = animState.keySet().iterator();
        while (it.hasNext()) {
            FloatProperty tempProperty = animState.getTempProperty(it.next());
            double d2 = animState.get(this.mTarget, tempProperty);
            UpdateInfo updateInfo = this.mTarget.animManager.mUpdateMap.get(tempProperty);
            if (updateInfo != null) {
                updateInfo.animInfo.setToValue = d2;
            }
            if (tempProperty instanceof IIntValueProperty) {
                this.mTarget.setIntValue((IIntValueProperty) tempProperty, (int) d2);
            } else {
                this.mTarget.setValue(tempProperty, (float) d2);
            }
            this.mTarget.trackVelocity(tempProperty, d2);
        }
        this.mTarget.setToNotify(animState, animConfigLink);
    }

    public void clear() {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("- AnimManager.clear() " + Log.getStackTraceString(new Throwable()), new Object[0]);
        }
        this.mStartAnim.clear();
        this.mBeginAnim.clear();
        this.mUpdateMap.clear();
        clearRunningInfo();
        this.mPendingRemovedInfo.clear();
        this.mWaitState.clear();
        this.mSetupInfo.clear();
    }

    public int getTotalAnimCount() {
        Iterator<TransitionInfo> it = this.mRunningInfo.values().iterator();
        int animCount = 0;
        while (it.hasNext()) {
            animCount += it.next().getAnimCount();
        }
        return animCount;
    }

    void getTransitionInfos(List<TransitionInfo> list) {
        for (TransitionInfo transitionInfo : this.mRunningInfo.values()) {
            if (transitionInfo.updateList != null && !transitionInfo.updateList.isEmpty()) {
                list.add(transitionInfo);
            }
        }
    }

    @Override // miuix.animation.internal.TransitionInfo.IUpdateInfoCreator
    public UpdateInfo getUpdateInfo(FloatProperty floatProperty) {
        UpdateInfo updateInfo = this.mUpdateMap.get(floatProperty);
        if (updateInfo != null) {
            return updateInfo;
        }
        UpdateInfo updateInfo2 = new UpdateInfo(floatProperty);
        UpdateInfo updateInfoPutIfAbsent = this.mUpdateMap.putIfAbsent(floatProperty, updateInfo2);
        return updateInfoPutIfAbsent != null ? updateInfoPutIfAbsent : updateInfo2;
    }

    public double getVelocity(FloatProperty floatProperty) {
        return getUpdateInfo(floatProperty).velocity;
    }

    public boolean isAnimRunning(FloatProperty... floatPropertyArr) {
        if (CommonUtils.isArrayEmpty(floatPropertyArr) && (!this.mRunningInfo.isEmpty() || !this.mWaitState.isEmpty())) {
            return true;
        }
        Iterator<TransitionInfo> it = this.mRunningInfo.values().iterator();
        while (it.hasNext()) {
            if (containProperties(it.next(), floatPropertyArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAnimSetup() {
        return !this.mSetupInfo.isEmpty();
    }

    void notifyTransitionEnd(final TransitionInfo transitionInfo, int i2, int i3) {
        if (!this.mStartAnim.remove(transitionInfo.key)) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("-- notifyTransitionEnd 1, msg = " + i2 + ", info = " + transitionInfo, new Object[0]);
            }
            removeRunningInfo(transitionInfo, false);
            this.mTarget.executeOnInitialized(new Runnable() { // from class: miuix.animation.internal.AnimManager.1
                @Override // java.lang.Runnable
                public void run() {
                    AnimManager.this.mTarget.getNotifier().removeListeners(transitionInfo.key);
                }
            });
            return;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("-- notifyTransitionEnd 0, msg = " + i2 + ", info = " + transitionInfo, new Object[0]);
        }
        this.mBeginAnim.remove(transitionInfo.key);
        removeRunningInfo(transitionInfo, true);
        TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.id), transitionInfo);
        this.mTarget.handler.obtainMessage(i2, transitionInfo.id, i3, transitionInfo).sendToTarget();
    }

    boolean removePendingRemovedInfo(TransitionInfo transitionInfo) {
        boolean z2;
        TransitionInfo transitionInfo2 = this.mPendingRemovedInfo.get(transitionInfo.key);
        if (transitionInfo2 == null || transitionInfo2.id != transitionInfo.id) {
            z2 = false;
        } else {
            this.mPendingRemovedInfo.remove(transitionInfo2.key);
            z2 = true;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("----- removePendingRemovedInfo", "removed = " + z2, "id = " + transitionInfo.id, "key = " + transitionInfo.key + " " + transitionInfo.key.hashCode(), "mRunningInfo.size = " + this.mRunningInfo.size(), "info.startTime = " + transitionInfo.startTime, "pendingInfo = " + transitionInfo2);
        }
        return z2;
    }

    boolean removeRunningInfo(TransitionInfo transitionInfo, boolean z2) {
        boolean z3;
        TransitionInfo transitionInfo2 = this.mRunningInfo.get(transitionInfo.key);
        if (transitionInfo2 == null || transitionInfo2.id != transitionInfo.id) {
            z3 = false;
        } else {
            this.mRunningInfo.remove(transitionInfo.key);
            if (z2) {
                this.mPendingRemovedInfo.put(transitionInfo.key, transitionInfo2);
            }
            z3 = true;
        }
        boolean zIsAnimRunning = isAnimRunning(new FloatProperty[0]);
        if (!zIsAnimRunning) {
            this.mUpdateMap.clear();
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("----- removeRunningInfo, pending = " + z2, "removed = " + z3, "id = " + transitionInfo.id, "key = " + transitionInfo.key + " " + transitionInfo.key.hashCode(), "mRunningInfo.size = " + this.mRunningInfo.size(), "info.startTime = " + transitionInfo.startTime, "isAnimRunning = " + zIsAnimRunning, "target = " + this.mTarget);
            if (this.mRunningInfo.size() > 0) {
                Iterator<TransitionInfo> it = this.mRunningInfo.values().iterator();
                while (it.hasNext()) {
                    LogUtils.debug("------ after remove resetRunInfo = " + it.next(), new Object[0]);
                }
            }
        }
        return z3;
    }

    public void setTarget(IAnimTarget iAnimTarget) {
        this.mTarget = iAnimTarget;
    }

    public void setTo(AnimState animState, AnimConfigLink animConfigLink) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("setTo, target = " + this.mTarget, "to = " + animState);
        }
        if (animState.keySet().size() > 150) {
            AnimRunner.sRunnerHandler.addSetToState(this.mTarget, animState);
        } else {
            setTargetValue(animState, animConfigLink);
        }
    }

    public void setVelocity(FloatProperty floatProperty, float f2) {
        getUpdateInfo(floatProperty).velocity = f2;
    }

    void setupTransition(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("-- setupTransition " + transitionInfo, new Object[0]);
        }
        this.mRunningInfo.put(transitionInfo.key, transitionInfo);
        transitionInfo.initUpdateList(this);
        transitionInfo.setupTasks(true);
        removeSameAnim(transitionInfo);
        boolean zContains = transitionInfo.target.animManager.mStartAnim.contains(transitionInfo.key);
        if (transitionInfo.config.listeners.isEmpty() || !zContains) {
            return;
        }
        TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.id), transitionInfo);
        transitionInfo.target.handler.obtainMessage(4, transitionInfo.id, 0, transitionInfo).sendToTarget();
    }

    public void startAnim(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("- AnimManager.startAnim ", new Object[0]);
        }
        if (!pendState(transitionInfo)) {
            TransitionInfo.sMap.put(Integer.valueOf(transitionInfo.id), transitionInfo);
            this.mSetupInfo.put(Integer.valueOf(transitionInfo.id), transitionInfo);
            AnimRunner.sRunnerHandler.obtainMessage(1, transitionInfo.id, 0).sendToTarget();
        } else {
            LogUtils.debug(this + ".startAnim, pendState", new Object[0]);
        }
    }

    public void update(boolean z2) {
        this.mTarget.handler.runUpdate(z2);
    }
}
