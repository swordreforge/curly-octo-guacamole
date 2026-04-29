package miuix.animation;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;
import com.google.android.exoplayer2.audio.n5r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import miuix.animation.controller.FolmeBlink;
import miuix.animation.controller.FolmeFont;
import miuix.animation.controller.FolmeHover;
import miuix.animation.controller.FolmeTouch;
import miuix.animation.controller.FolmeVisible;
import miuix.animation.controller.ListViewTouchListener;
import miuix.animation.controller.StateComposer;
import miuix.animation.internal.AnimRunner;
import miuix.animation.internal.ThreadPoolUtil;
import miuix.animation.physics.AnimationHandler;
import miuix.animation.property.FloatProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;
import miuix.animation.utils.ObjectPool;
import pnt2.toq;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class Folme {
    private static final float DEFALUT_FRICTION = 0.4761905f;
    private static float DEFAULT_THRESHOLD_VELOCITY = 0.0f;
    private static final long DELAY_TIME = 20000;
    private static final long DELAY_TIME_MSG_TARGET_CLEAN_DIE_MUCH = 1000;
    private static final long DELAY_TIME_MSG_TARGET_CLEAN_UI_FREE = 20000;
    private static final int MSG_TARGET = 1;
    private static final int MSG_TARGET_CLEAN_DIE_MUCH = 2;
    private static final int MSG_TARGET_CLEAN_UI_FREE = 1;
    private static final long THRESHOLD_LIMIT = 1024;
    private static final double USE_PHY_MIN_VELOCITY = 1000.0d;
    private static final ConcurrentHashMap<IAnimTarget, FolmeImpl> sImplMap;
    private static volatile Handler sMainHandler;
    private static Looper sRunLooper;
    private static AtomicReference<Float> sTimeRatio;

    private static class FolmeImpl implements IFolme {
        private IBlinkStyle mBlink;
        private IHoverStyle mHover;
        private IStateStyle mState;
        private IAnimTarget[] mTargets;
        private ITouchStyle mTouch;
        private IVisibleStyle mVisible;

        @Override // miuix.animation.IFolme
        public IBlinkStyle blink() {
            if (this.mBlink == null) {
                this.mBlink = new FolmeBlink(this.mTargets);
            }
            return this.mBlink;
        }

        void clean() {
            ITouchStyle iTouchStyle = this.mTouch;
            if (iTouchStyle != null) {
                iTouchStyle.clean();
            }
            IVisibleStyle iVisibleStyle = this.mVisible;
            if (iVisibleStyle != null) {
                iVisibleStyle.clean();
            }
            IStateStyle iStateStyle = this.mState;
            if (iStateStyle != null) {
                iStateStyle.clean();
            }
            IHoverStyle iHoverStyle = this.mHover;
            if (iHoverStyle != null) {
                iHoverStyle.clean();
            }
        }

        void end() {
            ITouchStyle iTouchStyle = this.mTouch;
            if (iTouchStyle != null) {
                iTouchStyle.end(new Object[0]);
            }
            IVisibleStyle iVisibleStyle = this.mVisible;
            if (iVisibleStyle != null) {
                iVisibleStyle.end(new Object[0]);
            }
            IStateStyle iStateStyle = this.mState;
            if (iStateStyle != null) {
                iStateStyle.end(new Object[0]);
            }
            IHoverStyle iHoverStyle = this.mHover;
            if (iHoverStyle != null) {
                iHoverStyle.end(new Object[0]);
            }
        }

        @Override // miuix.animation.IFolme
        public IHoverStyle hover() {
            if (this.mHover == null) {
                this.mHover = new FolmeHover(this.mTargets);
            }
            return this.mHover;
        }

        @Override // miuix.animation.IFolme
        public IStateStyle state() {
            if (this.mState == null) {
                this.mState = StateComposer.composeStyle(this.mTargets);
            }
            return this.mState;
        }

        @Override // miuix.animation.IFolme
        public ITouchStyle touch() {
            if (this.mTouch == null) {
                FolmeTouch folmeTouch = new FolmeTouch(this.mTargets);
                folmeTouch.setFontStyle(new FolmeFont());
                this.mTouch = folmeTouch;
            }
            return this.mTouch;
        }

        @Override // miuix.animation.IFolme
        public IVisibleStyle visible() {
            if (this.mVisible == null) {
                this.mVisible = new FolmeVisible(this.mTargets);
            }
            return this.mVisible;
        }

        private FolmeImpl(IAnimTarget... iAnimTargetArr) {
            this.mTargets = iAnimTargetArr;
            Folme.sendToTargetMessage(false);
            Folme.performTargetCleanForTooMuchInvalid();
        }
    }

    public interface FontType {
        public static final int MITYPE = 1;
        public static final int MITYPE_MONO = 2;
        public static final int MIUI = 0;
    }

    public interface FontWeight {
        public static final int BOLD = 8;
        public static final int DEMI_BOLD = 6;
        public static final int EXTRA_LIGHT = 1;
        public static final int HEAVY = 9;
        public static final int LIGHT = 2;
        public static final int MEDIUM = 5;
        public static final int NORMAL = 3;
        public static final int REGULAR = 4;
        public static final int SEMI_BOLD = 7;
        public static final int THIN = 0;
    }

    static {
        ThreadPoolUtil.post(new Runnable() { // from class: miuix.animation.Folme.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtils.getLogEnableInfo();
            }
        });
        Looper mainLooper = Looper.getMainLooper();
        sRunLooper = mainLooper;
        createMainHandler(mainLooper);
        sTimeRatio = new AtomicReference<>(Float.valueOf(1.0f));
        sImplMap = new ConcurrentHashMap<>();
        DEFAULT_THRESHOLD_VELOCITY = 12.5f;
    }

    public static float afterFrictionValue(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        float f4 = f2 >= 0.0f ? 1.0f : -1.0f;
        float fMin = Math.min(Math.abs(f2) / f3, 1.0f);
        float f5 = fMin * fMin;
        return f4 * ((((f5 * fMin) / 3.0f) - f5) + fMin) * f3;
    }

    @SafeVarargs
    public static <T> void clean(T... tArr) {
        if (CommonUtils.isArrayEmpty(tArr)) {
            Iterator<IAnimTarget> it = sImplMap.keySet().iterator();
            while (it.hasNext()) {
                cleanAnimTarget(it.next());
            }
        } else {
            for (T t2 : tArr) {
                doClean(t2);
            }
        }
    }

    private static void cleanAnimTarget(IAnimTarget iAnimTarget) {
        if (iAnimTarget != null) {
            iAnimTarget.clean();
            FolmeImpl folmeImplRemove = sImplMap.remove(iAnimTarget);
            iAnimTarget.animManager.clear();
            iAnimTarget.getNotifier().removeListeners();
            if (folmeImplRemove != null) {
                folmeImplRemove.clean();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearInvalidTargets(List<IAnimTarget> list) {
        for (IAnimTarget iAnimTarget : list) {
            if (!iAnimTarget.isValid() && !iAnimTarget.animManager.isAnimRunning(new FloatProperty[0]) && !iAnimTarget.animManager.isAnimSetup() && iAnimTarget.isValidFlag()) {
                clean(iAnimTarget);
            }
        }
    }

    private static void clearTargetMessage(int i2) {
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.removeMessages(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearTargets() {
        for (IAnimTarget iAnimTarget : sImplMap.keySet()) {
            if (!iAnimTarget.isValid() || (iAnimTarget.hasFlags(1L) && !iAnimTarget.animManager.isAnimRunning(new FloatProperty[0]) && !iAnimTarget.animManager.isAnimSetup() && iAnimTarget.isValidFlag())) {
                clean(iAnimTarget);
            }
        }
    }

    private static void createMainHandler(Looper looper) {
        if (looper == null) {
            return;
        }
        sMainHandler = new Handler(looper) { // from class: miuix.animation.Folme.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    Folme.clearTargets();
                    Folme.sendToTargetMessage(true);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    Folme.clearInvalidTargets((List) message.obj);
                }
            }
        };
    }

    private static <T> void doClean(T t2) {
        cleanAnimTarget(getTarget(t2, null));
    }

    public static <T> void end(T... tArr) {
        FolmeImpl folmeImpl;
        for (T t2 : tArr) {
            IAnimTarget target = getTarget(t2, null);
            if (target != null && (folmeImpl = sImplMap.get(target)) != null) {
                folmeImpl.end();
            }
        }
    }

    private static FolmeImpl fillTargetArrayAndGetImpl(View[] viewArr, IAnimTarget[] iAnimTargetArr) {
        FolmeImpl folmeImpl = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < viewArr.length; i2++) {
            IAnimTarget target = getTarget(viewArr[i2], ViewTarget.sCreator);
            iAnimTargetArr[i2] = target;
            FolmeImpl folmeImpl2 = sImplMap.get(target);
            if (folmeImpl == null) {
                folmeImpl = folmeImpl2;
            } else if (folmeImpl != folmeImpl2) {
                z2 = true;
            }
        }
        if (z2) {
            return null;
        }
        return folmeImpl;
    }

    public static float getDefaultThresholdVelocity() {
        return DEFAULT_THRESHOLD_VELOCITY;
    }

    public static Looper getLooper() {
        if (sRunLooper == null) {
            sRunLooper = Looper.getMainLooper();
        }
        return sRunLooper;
    }

    @dd
    public static Handler getMainHandler() {
        return sMainHandler;
    }

    private static float getPredict(float f2, float f3) {
        return (-f2) / (f3 * (-4.2f));
    }

    private static float getPredict(float f2, float f3, float f4) {
        return getPredict(f2, f3) - getPredict(f4, f3);
    }

    public static float getPredictDistance(float f2) {
        return getPredict(f2, DEFALUT_FRICTION);
    }

    public static float getPredictDistanceWithFriction(float f2, float f3, float... fArr) {
        return (fArr == null || fArr.length <= 0) ? getPredict(f2, f3) : getPredict(f2, f3, fArr[0]);
    }

    public static float getPredictFriction(float f2, float f3, float f4, float... fArr) {
        float f5 = f3 - f2;
        if (f4 * f5 <= 0.0f) {
            return -1.0f;
        }
        float fSignum = Math.signum(f4) * Math.abs(getDefaultThresholdVelocity());
        if (fArr != null && fArr.length > 0) {
            fSignum = Math.signum(f4) * Math.abs(fArr[0]);
        }
        return (f4 - fSignum) / (f5 * 4.2f);
    }

    public static <T> IAnimTarget getTarget(T t2) {
        return getTarget(t2, null);
    }

    public static IAnimTarget getTargetById(int i2) {
        for (IAnimTarget iAnimTarget : sImplMap.keySet()) {
            if (iAnimTarget.id == i2) {
                return iAnimTarget;
            }
        }
        return null;
    }

    public static Collection<IAnimTarget> getTargets() {
        if (LogUtils.isLogEnabled()) {
            Iterator<IAnimTarget> it = sImplMap.keySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (!it.next().isValid()) {
                    i2++;
                }
            }
            LogUtils.debug("current sImplMap total : " + sImplMap.size() + "  , target invalid count :  " + i2, new Object[0]);
        }
        return sImplMap.keySet();
    }

    public static float getTimeRatio() {
        return sTimeRatio.get().floatValue();
    }

    public static <T> ValueTarget getValueTarget(T t2) {
        return (ValueTarget) getTarget(t2, ValueTarget.sCreator);
    }

    public static boolean isInDraggingState(View view) {
        return view.getTag(toq.C8134toq.f43969q) != null;
    }

    public static void onListViewTouchEvent(AbsListView absListView, MotionEvent motionEvent) {
        ListViewTouchListener listViewTouchListener = FolmeTouch.getListViewTouchListener(absListView);
        if (listViewTouchListener != null) {
            listViewTouchListener.onTouch(absListView, motionEvent);
        }
    }

    public static float perFromValue(float f2, float f3, float f4) {
        if (f4 == f3) {
            return 0.0f;
        }
        return (f2 - f3) / (f4 - f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void performTargetCleanForTooMuchInvalid() {
        ConcurrentHashMap<IAnimTarget, FolmeImpl> concurrentHashMap = sImplMap;
        if (concurrentHashMap.size() <= 0 || ((long) concurrentHashMap.size()) % 1024 != 0) {
            return;
        }
        ThreadPoolUtil.post(new Runnable() { // from class: miuix.animation.Folme.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                for (IAnimTarget iAnimTarget : Folme.sImplMap.keySet()) {
                    if (!iAnimTarget.isValid()) {
                        arrayList.add(iAnimTarget);
                    }
                }
                Handler mainHandler = Folme.getMainHandler();
                if (mainHandler == null || arrayList.size() <= 0) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.obj = arrayList;
                messageObtain.what = 2;
                mainHandler.sendMessageDelayed(messageObtain, 1000L);
            }
        });
    }

    public static <T> void post(T t2, Runnable runnable) {
        IAnimTarget target = getTarget(t2, null);
        if (target != null) {
            target.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendToTargetMessage(boolean z2) {
        clearTargetMessage(1);
        if (z2 && LogUtils.isLogEnabled()) {
            for (IAnimTarget iAnimTarget : sImplMap.keySet()) {
                LogUtils.debug("exist target:" + iAnimTarget.getTargetObject() + " , target isValid : " + iAnimTarget.isValid(), new Object[0]);
            }
        }
        if (sImplMap.size() <= 0) {
            clearTargetMessage(1);
            return;
        }
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.sendEmptyMessageDelayed(1, n5r1.f63474zurt);
        }
    }

    public static void setAnimPlayRatio(float f2) {
        sTimeRatio.set(Float.valueOf(f2));
    }

    public static void setDraggingState(View view, boolean z2) {
        if (z2) {
            view.setTag(toq.C8134toq.f43969q, Boolean.TRUE);
        } else {
            view.setTag(toq.C8134toq.f43969q, null);
        }
    }

    public static void setLooper(Looper looper) {
        sRunLooper = looper;
        createMainHandler(looper);
        ObjectPool.createMainHandler(sRunLooper);
        AnimRunner.createMainHandler(sRunLooper);
        AnimationHandler.getInstance().recreateProvider();
    }

    public static void setThreadPriority(int i2) {
        AnimRunner.setThreadPriority(i2);
        ThreadPoolUtil.setThreadPriority(i2);
    }

    public static IFolme useAt(IAnimTarget iAnimTarget) {
        ConcurrentHashMap<IAnimTarget, FolmeImpl> concurrentHashMap = sImplMap;
        FolmeImpl folmeImpl = concurrentHashMap.get(iAnimTarget);
        if (folmeImpl != null) {
            return folmeImpl;
        }
        FolmeImpl folmeImpl2 = new FolmeImpl(new IAnimTarget[]{iAnimTarget});
        FolmeImpl folmeImplPutIfAbsent = concurrentHashMap.putIfAbsent(iAnimTarget, folmeImpl2);
        return folmeImplPutIfAbsent != null ? folmeImplPutIfAbsent : folmeImpl2;
    }

    public static void useSystemAnimatorDurationScale(Context context) {
        sTimeRatio.set(Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
    }

    public static IStateStyle useValue(Object... objArr) {
        IFolme iFolmeUseAt;
        if (objArr.length > 0) {
            iFolmeUseAt = useAt(getTarget(objArr[0], ValueTarget.sCreator));
        } else {
            ValueTarget valueTarget = new ValueTarget();
            valueTarget.setFlags(1L);
            iFolmeUseAt = useAt(valueTarget);
        }
        return iFolmeUseAt.state();
    }

    public static IVarFontStyle useVarFontAt(TextView textView, int i2, int i3) {
        return new FolmeFont().useAt(textView, i2, i3);
    }

    public static float valueFromPer(float f2, float f3, float f4) {
        return f3 + ((f4 - f3) * f2);
    }

    public static float getPredictDistance(float f2, float... fArr) {
        return (fArr == null || fArr.length <= 0) ? getPredict(f2, DEFALUT_FRICTION) : getPredict(f2, DEFALUT_FRICTION, fArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> IAnimTarget getTarget(T t2, ITargetCreator<T> iTargetCreator) {
        IAnimTarget iAnimTargetCreateTarget;
        if (t2 == 0) {
            return null;
        }
        if (t2 instanceof IAnimTarget) {
            return (IAnimTarget) t2;
        }
        for (IAnimTarget iAnimTarget : sImplMap.keySet()) {
            Object targetObject = iAnimTarget.getTargetObject();
            if (targetObject != null && targetObject.equals(t2)) {
                return iAnimTarget;
            }
        }
        if (iTargetCreator == null || (iAnimTargetCreateTarget = iTargetCreator.createTarget(t2)) == null) {
            return null;
        }
        useAt(iAnimTargetCreateTarget);
        return iAnimTargetCreateTarget;
    }

    public static IFolme useAt(View... viewArr) {
        if (viewArr.length != 0) {
            if (viewArr.length == 1) {
                return useAt(getTarget(viewArr[0], ViewTarget.sCreator));
            }
            int length = viewArr.length;
            IAnimTarget[] iAnimTargetArr = new IAnimTarget[length];
            FolmeImpl folmeImplFillTargetArrayAndGetImpl = fillTargetArrayAndGetImpl(viewArr, iAnimTargetArr);
            if (folmeImplFillTargetArrayAndGetImpl == null) {
                folmeImplFillTargetArrayAndGetImpl = new FolmeImpl(iAnimTargetArr);
                for (int i2 = 0; i2 < length; i2++) {
                    FolmeImpl folmeImplPut = sImplMap.put(iAnimTargetArr[i2], folmeImplFillTargetArrayAndGetImpl);
                    if (folmeImplPut != null) {
                        folmeImplPut.clean();
                    }
                }
            }
            return folmeImplFillTargetArrayAndGetImpl;
        }
        throw new IllegalArgumentException("useAt can not be applied to empty views array");
    }

    public static void getTargets(Collection<IAnimTarget> collection) {
        for (IAnimTarget iAnimTarget : sImplMap.keySet()) {
            if (iAnimTarget.isValid() && (!iAnimTarget.hasFlags(1L) || iAnimTarget.animManager.isAnimRunning(new FloatProperty[0]))) {
                collection.add(iAnimTarget);
            } else {
                clean(iAnimTarget);
            }
        }
    }
}
