package com.miui.maml;

import com.miui.maml.util.MamlLog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class FramerateTokenList {
    private static final String LOG_TAG = "FramerateTokenList";
    private float mCurFramerate;
    private FramerateChangeListener mFramerateChangeListener;
    private ArrayList<FramerateToken> mList = new ArrayList<>();

    public interface FramerateChangeListener {
        void onFrameRateChage(float f2, float f3);
    }

    public class FramerateToken {
        public float mFramerate;
        public String mName;

        public FramerateToken(String str) {
            this.mName = str;
        }

        public float getFramerate() {
            return this.mFramerate;
        }

        public void requestFramerate(float f2) {
            if (this.mFramerate != f2) {
                if (FramerateTokenList.this.mFramerateChangeListener != null) {
                    FramerateTokenList.this.mFramerateChangeListener.onFrameRateChage(this.mFramerate, f2);
                }
                this.mFramerate = f2;
                FramerateTokenList.this.onChange();
            }
        }
    }

    public FramerateTokenList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChange() {
        float f2;
        synchronized (this.mList) {
            Iterator<FramerateToken> it = this.mList.iterator();
            f2 = 0.0f;
            while (it.hasNext()) {
                float f3 = it.next().mFramerate;
                if (f3 > f2) {
                    f2 = f3;
                }
            }
        }
        this.mCurFramerate = f2;
        MamlLog.m17850d(LOG_TAG, "Frame rate changed, current frame rate is " + this.mCurFramerate);
    }

    public void clear() {
        synchronized (this.mList) {
            this.mList.clear();
        }
    }

    public FramerateToken createToken(String str) {
        MamlLog.m17850d(LOG_TAG, "createToken: " + str);
        FramerateToken framerateToken = new FramerateToken(str);
        synchronized (this.mList) {
            this.mList.add(framerateToken);
        }
        return framerateToken;
    }

    public float getFramerate() {
        return this.mCurFramerate;
    }

    public void removeToken(FramerateToken framerateToken) {
        synchronized (this.mList) {
            this.mList.remove(framerateToken);
        }
    }

    public FramerateTokenList(FramerateChangeListener framerateChangeListener) {
        this.mFramerateChangeListener = framerateChangeListener;
    }
}
