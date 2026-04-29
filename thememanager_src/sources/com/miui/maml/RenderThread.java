package com.miui.maml;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.miui.maml.util.MamlLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RenderThread extends Thread {
    private static final String LOG_TAG = "RenderThread";
    private static RenderThread sGlobalThread;
    private static Object sGlobalThreadLock = new Object();
    private CommandThreadHandler mCmdHanlder;
    private HandlerThread mCmdThread;
    private boolean mPaused;
    private ArrayList<RendererController> mRendererControllerList;
    private Object mResumeSignal;
    private boolean mSignaled;
    private Object mSleepSignal;
    private boolean mStarted;
    private boolean mStop;

    private class CommandThreadHandler extends Handler {
        private static final int MSG_PAUSE = 0;
        private static final int MSG_RESUME = 1;

        public CommandThreadHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                RenderThread.this.setPausedImpl(true);
            } else {
                if (i2 != 1) {
                    return;
                }
                RenderThread.this.setPausedImpl(false);
            }
        }

        public void setPause(boolean z2) {
            Message message = new Message();
            message.what = !z2 ? 1 : 0;
            sendMessage(message);
        }
    }

    public RenderThread(RendererController rendererController) {
        super("MAML RenderThread");
        this.mRendererControllerList = new ArrayList<>();
        this.mPaused = true;
        this.mResumeSignal = new Object();
        this.mSleepSignal = new Object();
        initCmdThread();
    }

    private void doFinish() {
        synchronized (this.mRendererControllerList) {
            if (this.mRendererControllerList.size() == 0) {
                return;
            }
            int size = this.mRendererControllerList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mRendererControllerList.get(i2).finish();
            }
        }
    }

    private void doInit() {
        synchronized (this.mRendererControllerList) {
            if (this.mRendererControllerList.size() == 0) {
                return;
            }
            int size = this.mRendererControllerList.size();
            for (int i2 = 0; i2 < size; i2++) {
                RendererController rendererController = this.mRendererControllerList.get(i2);
                rendererController.init();
                rendererController.requestUpdate();
            }
        }
    }

    private void doPause() {
        synchronized (this.mRendererControllerList) {
            if (this.mRendererControllerList.size() == 0) {
                return;
            }
            int size = this.mRendererControllerList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mRendererControllerList.get(i2);
            }
        }
    }

    private void doResume() {
        synchronized (this.mRendererControllerList) {
            if (this.mRendererControllerList.size() == 0) {
                return;
            }
            int size = this.mRendererControllerList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mRendererControllerList.get(i2);
            }
        }
    }

    public static RenderThread globalThread() {
        return globalThread(false);
    }

    public static void globalThreadStop() {
        synchronized (sGlobalThreadLock) {
            RenderThread renderThread = sGlobalThread;
            if (renderThread != null) {
                renderThread.setStop();
                sGlobalThread = null;
            }
        }
    }

    private void initCmdThread() {
        HandlerThread handlerThread = new HandlerThread("cmd");
        this.mCmdThread = handlerThread;
        handlerThread.start();
        this.mCmdHanlder = new CommandThreadHandler(this.mCmdThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPausedImpl(boolean z2) {
        if (this.mStop) {
            signal();
        }
        if (this.mPaused == z2) {
            return;
        }
        synchronized (this.mResumeSignal) {
            this.mPaused = z2;
            if (!z2) {
                this.mResumeSignal.notify();
            }
        }
        signal();
    }

    private final void waitSleep(long j2) {
        if (this.mSignaled || j2 <= 0) {
            return;
        }
        synchronized (this.mSleepSignal) {
            if (!this.mSignaled) {
                try {
                    this.mSleepSignal.wait(j2);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void waiteForResume() {
        try {
            this.mResumeSignal.wait();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public void addRendererController(RendererController rendererController) {
        synchronized (this.mRendererControllerList) {
            if (this.mRendererControllerList.contains(rendererController)) {
                MamlLog.m17854w(LOG_TAG, "addRendererController: RendererController already exists");
            } else {
                this.mRendererControllerList.add(rendererController);
                setPaused(false);
            }
        }
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void removeRendererController(RendererController rendererController) {
        synchronized (this.mRendererControllerList) {
            this.mRendererControllerList.remove(rendererController);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        MamlLog.m17853i(LOG_TAG, "RenderThread started");
        try {
            doInit();
            this.mStarted = true;
            while (!this.mStop) {
                if (this.mPaused) {
                    synchronized (this.mResumeSignal) {
                        if (this.mPaused) {
                            doPause();
                            MamlLog.m17853i(LOG_TAG, "RenderThread paused, waiting for signal");
                            waiteForResume();
                            MamlLog.m17853i(LOG_TAG, "RenderThread resumed");
                            doResume();
                        }
                    }
                }
                if (this.mStop) {
                    break;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = Long.MAX_VALUE;
                synchronized (this.mRendererControllerList) {
                    int size = this.mRendererControllerList.size();
                    boolean z2 = true;
                    for (int i2 = 0; i2 < size && !this.mPaused; i2++) {
                        RendererController rendererController = this.mRendererControllerList.get(i2);
                        if (!rendererController.isSelfPaused() || rendererController.hasRunnable()) {
                            if (!rendererController.hasInited()) {
                                rendererController.init();
                            }
                            long jUpdateIfNeeded = rendererController.updateIfNeeded(jElapsedRealtime);
                            if (jUpdateIfNeeded < j2) {
                                j2 = jUpdateIfNeeded;
                            }
                            z2 = false;
                        }
                    }
                    if (size == 0 || z2) {
                        this.mPaused = true;
                        MamlLog.m17853i(LOG_TAG, "All controllers paused.");
                    } else {
                        waitSleep(j2);
                        this.mSignaled = false;
                    }
                }
            }
        } catch (Exception | OutOfMemoryError e2) {
            MamlLog.m17851e(LOG_TAG, e2.toString());
        }
        doFinish();
        this.mCmdThread.quit();
        MamlLog.m17853i(LOG_TAG, "RenderThread stopped");
    }

    public void setPaused(boolean z2) {
        this.mCmdHanlder.setPause(z2);
    }

    public void setStop() {
        this.mStop = true;
        setPaused(false);
    }

    public void signal() {
        if (this.mSignaled) {
            return;
        }
        synchronized (this.mSleepSignal) {
            this.mSignaled = true;
            this.mSleepSignal.notify();
        }
    }

    public static RenderThread globalThread(boolean z2) {
        RenderThread renderThread;
        synchronized (sGlobalThreadLock) {
            if (sGlobalThread == null) {
                sGlobalThread = new RenderThread();
            }
            if (z2 && !sGlobalThread.isStarted()) {
                try {
                    sGlobalThread.start();
                } catch (IllegalThreadStateException unused) {
                }
            }
            renderThread = sGlobalThread;
        }
        return renderThread;
    }

    public RenderThread() {
        super("MAML RenderThread");
        this.mRendererControllerList = new ArrayList<>();
        this.mPaused = true;
        this.mResumeSignal = new Object();
        this.mSleepSignal = new Object();
        initCmdThread();
    }
}
