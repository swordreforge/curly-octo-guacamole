package miuix.animation.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.IAnimTarget;
import miuix.animation.ViewTarget;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.ForegroundColorStyle;
import miuix.animation.utils.LogUtils;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public final class TargetHandler extends Handler {
    public static final int ANIM_MSG_END = 2;
    public static final int ANIM_MSG_REMOVE_WAIT = 3;
    public static final int ANIM_MSG_REPLACED = 5;
    public static final int ANIM_MSG_START_TAG = 0;
    public static final int ANIM_MSG_UPDATE_LISTENER = 4;
    private static final int MASS_UPDATE_THRESHOLD = 40000;
    private final IAnimTarget mTarget;
    private final List<TransitionInfo> mTransList;
    public final long threadId;

    public TargetHandler(IAnimTarget iAnimTarget) {
        super(Looper.myLooper());
        this.mTransList = new ArrayList();
        this.mTarget = iAnimTarget;
        this.threadId = Looper.myLooper().getThread().getId();
    }

    private static void notifyStartOrEnd(TransitionInfo transitionInfo, boolean z2) {
        if (transitionInfo.getAnimCount() > 4000) {
            return;
        }
        for (UpdateInfo updateInfo : transitionInfo.updateList) {
            if (updateInfo.property == ViewPropertyExt.FOREGROUND) {
                if (z2) {
                    ForegroundColorStyle.start(transitionInfo.target, updateInfo);
                } else {
                    ForegroundColorStyle.end(transitionInfo.target, updateInfo);
                }
            }
        }
    }

    private void onEnd(TransitionInfo transitionInfo, int i2) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("<<< onEnd, info.id = " + transitionInfo.id + ", reason = " + i2 + ", info.key = " + transitionInfo.key + " " + transitionInfo.key.hashCode() + ", info.startTime = " + transitionInfo.startTime + ", target = " + this.mTarget, new Object[0]);
        }
        update(false, transitionInfo);
        notifyStartOrEnd(transitionInfo, false);
        transitionInfo.target.animManager.removePendingRemovedInfo(transitionInfo);
        if (i2 == 4) {
            transitionInfo.target.getNotifier().notifyCancelAll(transitionInfo.key, transitionInfo.tag);
        } else {
            transitionInfo.target.getNotifier().notifyEndAll(transitionInfo.key, transitionInfo.tag);
        }
        transitionInfo.target.getNotifier().removeListeners(transitionInfo.key);
    }

    private void onReplaced(TransitionInfo transitionInfo) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("<<< onReplaced, info.id = " + transitionInfo.id + ", info.key = " + transitionInfo.key + " " + transitionInfo.key.hashCode() + ", info.startTime = " + transitionInfo.startTime + ", target = " + this.mTarget, new Object[0]);
        }
        transitionInfo.target.animManager.removePendingRemovedInfo(transitionInfo);
        if (transitionInfo.getAnimCount() <= 4000) {
            this.mTarget.getNotifier().notifyPropertyEnd(transitionInfo.key, transitionInfo.tag, transitionInfo.updateList);
        }
        this.mTarget.getNotifier().notifyCancelAll(transitionInfo.key, transitionInfo.tag);
        this.mTarget.getNotifier().removeListeners(transitionInfo.key);
    }

    private void onStart(TransitionInfo transitionInfo) {
        if (transitionInfo.hasNotifyStart) {
            LogUtils.debug(">>> onStart, warning!! this transition has notified start: info.id = " + transitionInfo.id + ", info.key = " + transitionInfo.key, new Object[0]);
            return;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug(">>> onStart, info.id = " + transitionInfo.id + ", info.key = " + transitionInfo.key + ", info.starTime = " + transitionInfo.startTime + ", mRunningInfo.contains = " + transitionInfo.target.animManager.mRunningInfo.contains(transitionInfo) + ", target = " + this.mTarget, new Object[0]);
        }
        transitionInfo.hasNotifyStart = true;
        transitionInfo.target.getNotifier().addListeners(transitionInfo.key, transitionInfo.config);
        transitionInfo.target.getNotifier().notifyBegin(transitionInfo.key, transitionInfo.tag);
        List<UpdateInfo> list = transitionInfo.updateList;
        if (!list.isEmpty() && list.size() <= 4000) {
            transitionInfo.target.getNotifier().notifyPropertyBegin(transitionInfo.key, transitionInfo.tag, list);
        }
        notifyStartOrEnd(transitionInfo, true);
    }

    private static void setValueAndNotify(IAnimTarget iAnimTarget, Object obj, Object obj2, List<UpdateInfo> list, boolean z2) {
        if (!z2 || (iAnimTarget instanceof ViewTarget)) {
            updateValueAndVelocity(iAnimTarget, list);
        }
        if (list.size() > 40000) {
            iAnimTarget.getNotifier().notifyMassUpdate(obj, obj2);
        } else {
            iAnimTarget.getNotifier().notifyPropertyEnd(obj, obj2, list);
            iAnimTarget.getNotifier().notifyUpdate(obj, obj2, list);
        }
    }

    private static void updateValueAndVelocity(IAnimTarget iAnimTarget, List<UpdateInfo> list) {
        for (UpdateInfo updateInfo : list) {
            if (!AnimValueUtils.isInvalid(updateInfo.animInfo.value)) {
                updateInfo.setTargetValue(iAnimTarget);
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(@lvui Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            TransitionInfo transitionInfoRemove = TransitionInfo.sMap.remove(Integer.valueOf(message.arg1));
            if (transitionInfoRemove != null) {
                onStart(transitionInfoRemove);
                return;
            }
            return;
        }
        if (i2 == 2) {
            TransitionInfo transitionInfoRemove2 = TransitionInfo.sMap.remove(Integer.valueOf(message.arg1));
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("<<< handler ANIM_MSG_END, , info = " + transitionInfoRemove2 + ", info.id = " + message.arg1 + ", obj info = " + message.obj + ", target " + this.mTarget, new Object[0]);
            }
            if (transitionInfoRemove2 == null) {
                transitionInfoRemove2 = (TransitionInfo) message.obj;
            }
            if (transitionInfoRemove2 != null) {
                onEnd(transitionInfoRemove2, message.arg2);
                return;
            }
            return;
        }
        if (i2 == 3) {
            this.mTarget.animManager.mWaitState.clear();
            return;
        }
        if (i2 == 4) {
            TransitionInfo transitionInfoRemove3 = TransitionInfo.sMap.remove(Integer.valueOf(message.arg1));
            if (transitionInfoRemove3 != null) {
                this.mTarget.getNotifier().removeListeners(transitionInfoRemove3.key);
                this.mTarget.getNotifier().addListeners(transitionInfoRemove3.key, transitionInfoRemove3.config);
                return;
            }
            return;
        }
        if (i2 != 5) {
            return;
        }
        TransitionInfo transitionInfoRemove4 = TransitionInfo.sMap.remove(Integer.valueOf(message.arg1));
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("<<< handler ANIM_MSG_REPLACED, , info = " + transitionInfoRemove4 + ", info.id = " + message.arg1 + ", obj info = " + message.obj + ", target " + this.mTarget, new Object[0]);
        }
        if (transitionInfoRemove4 == null) {
            transitionInfoRemove4 = (TransitionInfo) message.obj;
        }
        if (transitionInfoRemove4 != null) {
            onReplaced(transitionInfoRemove4);
        }
    }

    public boolean isInTargetThread() {
        return Looper.myLooper() == getLooper();
    }

    public void runUpdate(final boolean z2) {
        if (Looper.myLooper() != getLooper()) {
            post(new Runnable() { // from class: miuix.animation.internal.TargetHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    TargetHandler.this.update(z2);
                }
            });
        } else {
            update(z2);
        }
    }

    public void sendStartMsg(TransitionInfo transitionInfo) {
        obtainMessage(0, transitionInfo.id, 0).sendToTarget();
    }

    public void update(boolean z2) {
        this.mTarget.animManager.getTransitionInfos(this.mTransList);
        Iterator<TransitionInfo> it = this.mTransList.iterator();
        while (it.hasNext()) {
            update(z2, it.next());
        }
        this.mTransList.clear();
    }

    private void update(boolean z2, TransitionInfo transitionInfo) {
        if (transitionInfo.updateList == null || transitionInfo.updateList.isEmpty()) {
            return;
        }
        if (this.mTarget.shouldCheckValue()) {
            ArrayList arrayList = new ArrayList(transitionInfo.updateList.size());
            for (UpdateInfo updateInfo : transitionInfo.updateList) {
                if (!AnimValueUtils.isInvalid(updateInfo.animInfo.value)) {
                    arrayList.add(updateInfo);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (!transitionInfo.hasNotifyStart) {
                onStart(transitionInfo);
            }
            setValueAndNotify(transitionInfo.target, transitionInfo.key, transitionInfo.tag, arrayList, z2);
            return;
        }
        if (!transitionInfo.hasNotifyStart) {
            onStart(transitionInfo);
        }
        setValueAndNotify(transitionInfo.target, transitionInfo.key, transitionInfo.tag, transitionInfo.updateList, z2);
    }
}
