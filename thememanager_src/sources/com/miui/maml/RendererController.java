package com.miui.maml;

import android.view.MotionEvent;
import com.miui.maml.FramerateTokenList;
import com.miui.maml.elements.FramerateController;
import com.miui.maml.util.HideSdkDependencyUtils;
import com.miui.maml.util.MamlLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class RendererController implements FramerateTokenList.FramerateChangeListener {
    private static final String LOG_TAG = "RendererController";
    private static final int MAX_MSG_COUNT = 3;
    private float mCurFramerate;
    private FramerateTokenList mFramerateTokenList;
    private boolean mInited;
    private long mLastUpdateSystemTime;
    private Listener mListener;
    private LinkedList<MotionEvent> mMsgQueue;
    private boolean mNeedReset;
    private boolean mPendingRender;
    private boolean mSelfRender;
    private boolean mShouldUpdate;
    private ArrayList<FramerateController> mFramerateControllers = new ArrayList<>();
    private boolean mSelfPaused = true;
    private byte[] mLock = new byte[0];
    private long mFrameTime = Long.MAX_VALUE;
    private Object mMsgLock = new Object();
    private float mTouchX = -1.0f;
    private float mTouchY = -1.0f;
    private ArrayList<Runnable> mWriteRunnableQueue = new ArrayList<>();
    private ArrayList<Runnable> mReadRunnableQueue = new ArrayList<>();
    private Object mWriteRunnableQueueLock = new Object();

    public static abstract class EmptyListener implements Listener {
        @Override // com.miui.maml.RendererController.IRenderable
        public void doRender() {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void finish() {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void init() {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void onHover(MotionEvent motionEvent) {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void onTouch(MotionEvent motionEvent) {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void pause() {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void resume() {
        }

        @Override // com.miui.maml.RendererController.Listener
        public void tick(long j2) {
        }
    }

    public interface IRenderable {
        void doRender();
    }

    public interface ISelfUpdateRenderable extends IRenderable {
        void forceUpdate();

        void triggerUpdate();
    }

    public interface Listener extends ISelfUpdateRenderable {
        void finish();

        void init();

        void onHover(MotionEvent motionEvent);

        void onTouch(MotionEvent motionEvent);

        void pause();

        void resume();

        void tick(long j2);
    }

    public RendererController() {
        this.mFramerateTokenList = new FramerateTokenList();
        this.mFramerateTokenList = new FramerateTokenList(this);
    }

    private void runRunnables() {
        ArrayList<Runnable> arrayList;
        if (this.mNeedReset) {
            return;
        }
        synchronized (this.mWriteRunnableQueueLock) {
            arrayList = this.mWriteRunnableQueue;
            this.mWriteRunnableQueue = this.mReadRunnableQueue;
            this.mReadRunnableQueue = arrayList;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mReadRunnableQueue.get(i2).run();
        }
        this.mReadRunnableQueue.clear();
    }

    public void addFramerateController(FramerateController framerateController) {
        if (this.mFramerateControllers.contains(framerateController)) {
            return;
        }
        this.mFramerateControllers.add(framerateController);
    }

    public final FramerateTokenList.FramerateToken createToken(String str) {
        return this.mFramerateTokenList.createToken(str);
    }

    public final void doRender() {
        Listener listener = this.mListener;
        if (listener != null) {
            this.mPendingRender = true;
            listener.doRender();
        }
    }

    public final void doneRender() {
        this.mPendingRender = false;
        triggerUpdate();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            r3 = this;
            byte[] r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mInited     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return
        L9:
            com.miui.maml.RendererController$Listener r1 = r3.mListener     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L1e
            r1.finish()     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L53
            goto L1e
        L11:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "RendererController"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L53
            com.miui.maml.util.MamlLog.m17851e(r2, r1)     // Catch: java.lang.Throwable -> L53
        L1e:
            java.lang.Object r1 = r3.mMsgLock     // Catch: java.lang.Throwable -> L53
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L53
            java.util.LinkedList<android.view.MotionEvent> r2 = r3.mMsgQueue     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L39
        L25:
            java.util.LinkedList<android.view.MotionEvent> r2 = r3.mMsgQueue     // Catch: java.lang.Throwable -> L50
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L50
            if (r2 <= 0) goto L39
            java.util.LinkedList<android.view.MotionEvent> r2 = r3.mMsgQueue     // Catch: java.lang.Throwable -> L50
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L50
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2     // Catch: java.lang.Throwable -> L50
            r2.recycle()     // Catch: java.lang.Throwable -> L50
            goto L25
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r3.mWriteRunnableQueueLock     // Catch: java.lang.Throwable -> L53
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList<java.lang.Runnable> r2 = r3.mWriteRunnableQueue     // Catch: java.lang.Throwable -> L4d
            r2.clear()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            r1 = 0
            r3.mInited = r1     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            com.miui.maml.FramerateTokenList r0 = r3.mFramerateTokenList
            r0.clear()
            return
        L4d:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.Throwable -> L53
        L50:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r2     // Catch: java.lang.Throwable -> L53
        L53:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.RendererController.finish():void");
    }

    public void forceUpdate() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.forceUpdate();
        }
        RenderVsyncUpdater.getInstance().forceUpdate();
    }

    public final MotionEvent getMessage() {
        MotionEvent motionEventPoll = null;
        if (this.mMsgQueue == null) {
            return null;
        }
        synchronized (this.mMsgLock) {
            LinkedList<MotionEvent> linkedList = this.mMsgQueue;
            if (linkedList != null) {
                motionEventPoll = linkedList.poll();
            }
        }
        return motionEventPoll;
    }

    public final boolean hasInited() {
        return this.mInited;
    }

    public final boolean hasMessage() {
        boolean z2 = false;
        if (this.mMsgQueue == null) {
            return false;
        }
        synchronized (this.mMsgLock) {
            LinkedList<MotionEvent> linkedList = this.mMsgQueue;
            if (linkedList != null && linkedList.size() > 0) {
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean hasRunnable() {
        boolean z2;
        synchronized (this.mWriteRunnableQueueLock) {
            z2 = !this.mWriteRunnableQueue.isEmpty();
        }
        return z2;
    }

    public void init() {
        synchronized (this.mLock) {
            if (this.mInited) {
                return;
            }
            Listener listener = this.mListener;
            if (listener != null) {
                try {
                    listener.init();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MamlLog.m17851e(LOG_TAG, e2.toString());
                }
            }
            this.mInited = true;
        }
    }

    public final boolean isSelfPaused() {
        return this.mSelfPaused;
    }

    @Override // com.miui.maml.FramerateTokenList.FramerateChangeListener
    public void onFrameRateChage(float f2, float f3) {
        if (f3 > 0.0f) {
            triggerUpdate();
        }
    }

    public void onHover(MotionEvent motionEvent) {
        Listener listener;
        if (motionEvent == null || (listener = this.mListener) == null) {
            return;
        }
        try {
            listener.onHover(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            MamlLog.m17851e(LOG_TAG, e2.toString());
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            MamlLog.m17851e(LOG_TAG, e3.toString());
        }
    }

    public void onTouch(MotionEvent motionEvent) {
        Listener listener;
        if (motionEvent == null || (listener = this.mListener) == null) {
            return;
        }
        try {
            listener.onTouch(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            MamlLog.m17851e(LOG_TAG, e2.toString());
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            MamlLog.m17851e(LOG_TAG, e3.toString());
        }
    }

    public final boolean pendingRender() {
        return this.mPendingRender;
    }

    @Deprecated
    public void postMessage(MotionEvent motionEvent) {
        synchronized (this.mMsgLock) {
            if (this.mMsgQueue == null) {
                this.mMsgQueue = new LinkedList<>();
            }
            if (motionEvent.getActionMasked() != 2 || motionEvent.getX() != this.mTouchX || motionEvent.getY() != this.mTouchY) {
                this.mMsgQueue.add(motionEvent);
                this.mTouchX = motionEvent.getX();
                this.mTouchY = motionEvent.getY();
            }
            if (this.mMsgQueue.size() > 3) {
                MotionEvent motionEvent2 = null;
                Iterator<MotionEvent> it = this.mMsgQueue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MotionEvent next = it.next();
                    if (next.getActionMasked() == 2) {
                        motionEvent2 = next;
                        break;
                    }
                }
                if (motionEvent2 != null) {
                    this.mMsgQueue.remove(motionEvent2);
                    motionEvent2.recycle();
                }
            }
        }
        forceUpdate();
    }

    public void postRunnable(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("postRunnable null");
        }
        synchronized (this.mWriteRunnableQueueLock) {
            if (!this.mWriteRunnableQueue.contains(runnable)) {
                this.mWriteRunnableQueue.add(runnable);
            }
        }
        requestUpdate();
    }

    public void postRunnableAtFrontOfQueue(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("postRunnable null");
        }
        synchronized (this.mWriteRunnableQueueLock) {
            if (!this.mWriteRunnableQueue.contains(runnable)) {
                this.mWriteRunnableQueue.add(0, runnable);
            }
        }
        requestUpdate();
    }

    public void removeFramerateController(FramerateController framerateController) {
        this.mFramerateControllers.remove(framerateController);
    }

    public final void removeToken(FramerateTokenList.FramerateToken framerateToken) {
        this.mFramerateTokenList.removeToken(framerateToken);
    }

    public final void requestUpdate() {
        this.mShouldUpdate = true;
        forceUpdate();
    }

    public void selfPause() {
        if (this.mInited) {
            synchronized (this.mLock) {
                if (!this.mSelfPaused) {
                    this.mSelfPaused = true;
                    Listener listener = this.mListener;
                    if (listener != null) {
                        listener.pause();
                    }
                }
            }
            this.mPendingRender = false;
        }
    }

    public void selfResume() {
        if (this.mInited) {
            synchronized (this.mLock) {
                if (this.mSelfPaused) {
                    this.mSelfPaused = false;
                    Listener listener = this.mListener;
                    if (listener != null) {
                        listener.resume();
                    }
                }
            }
            RenderVsyncUpdater.getInstance().onResume();
        }
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setNeedReset(boolean z2) {
        this.mNeedReset = z2;
    }

    public void setSelfRender(boolean z2) {
        this.mSelfRender = z2;
    }

    public void tick(long j2) {
        this.mShouldUpdate = false;
        Listener listener = this.mListener;
        if (listener != null) {
            try {
                listener.tick(j2);
            } catch (Exception e2) {
                e2.printStackTrace();
                MamlLog.m17851e(LOG_TAG, e2.toString());
            }
        }
        this.mLastUpdateSystemTime = j2;
    }

    public void triggerUpdate() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.triggerUpdate();
        }
        RenderVsyncUpdater.getInstance().triggerUpdate();
    }

    public long update(long j2) {
        long jUpdateFramerate = updateFramerate(j2);
        boolean zHasRunnable = hasRunnable();
        if (this.mPendingRender && !zHasRunnable) {
            return jUpdateFramerate;
        }
        runRunnables();
        MotionEvent message = getMessage();
        if (message != null) {
            if (HideSdkDependencyUtils.MotionEvent_isTouchEvent(message)) {
                onTouch(message);
            } else {
                onHover(message);
            }
        }
        tick(j2);
        if (!this.mSelfRender) {
            doRender();
        }
        if (this.mShouldUpdate || hasMessage()) {
            return 0L;
        }
        return jUpdateFramerate;
    }

    public final long updateFramerate(long j2) {
        int size = this.mFramerateControllers.size();
        long j3 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            long jUpdateFramerate = this.mFramerateControllers.get(i2).updateFramerate(j2);
            if (jUpdateFramerate < j3) {
                j3 = jUpdateFramerate;
            }
        }
        float framerate = this.mFramerateTokenList.getFramerate();
        float f2 = this.mCurFramerate;
        if (f2 != framerate) {
            if (f2 >= 1.0f && framerate < 1.0f) {
                requestUpdate();
            }
            this.mCurFramerate = framerate;
            this.mFrameTime = framerate != 0.0f ? (long) (1000.0f / framerate) : Long.MAX_VALUE;
        }
        long j4 = this.mFrameTime;
        return j4 < j3 ? j4 : j3;
    }

    public long updateIfNeeded(long j2) {
        long jUpdateFramerate = updateFramerate(j2);
        long j3 = this.mFrameTime;
        long j4 = j3 < Long.MAX_VALUE ? j3 - (j2 - this.mLastUpdateSystemTime) : Long.MAX_VALUE;
        boolean zHasRunnable = hasRunnable();
        if (j4 > 0 && !this.mShouldUpdate && !hasMessage() && !zHasRunnable) {
            return j4 < jUpdateFramerate ? j4 : jUpdateFramerate;
        }
        if (this.mPendingRender && !zHasRunnable) {
            return jUpdateFramerate;
        }
        runRunnables();
        MotionEvent message = getMessage();
        if (message != null) {
            if (HideSdkDependencyUtils.MotionEvent_isTouchEvent(message)) {
                onTouch(message);
            } else {
                onHover(message);
            }
        }
        tick(j2);
        if (!this.mSelfRender) {
            doRender();
        }
        if (this.mShouldUpdate || hasMessage()) {
            return 0L;
        }
        return jUpdateFramerate;
    }
}
