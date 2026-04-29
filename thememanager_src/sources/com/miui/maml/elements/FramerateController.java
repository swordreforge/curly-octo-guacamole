package com.miui.maml.elements;

import android.graphics.Canvas;
import android.text.TextUtils;
import com.android.thememanager.controller.local.qrj;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class FramerateController extends ScreenElement {
    public static final String INNER_TAG = "ControlPoint";
    public static final String TAG_NAME = "FramerateController";
    private ArrayList<ControlPoint> mControlPoints;
    private long mDelay;
    private long mLastUpdateTime;
    private Object mLock;
    private boolean mLoop;
    private long mNextUpdateInterval;
    private long mStartTime;
    private boolean mStopped;
    private String mTag;
    private long mTimeRange;

    public static class ControlPoint {
        public int mFramerate;
        public long mTime;

        public ControlPoint(Element element) {
            this.mTime = Utils.getAttrAsLongThrows(element, "time");
            this.mFramerate = Utils.getAttrAsInt(element, qrj.f57924fn3e, -1);
        }
    }

    public FramerateController(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mControlPoints = new ArrayList<>();
        this.mLock = new Object();
        this.mLoop = Boolean.parseBoolean(element.getAttribute("loop"));
        this.mTag = element.getAttribute("tag");
        String attribute = element.getAttribute("delay");
        if (!TextUtils.isEmpty(attribute)) {
            try {
                this.mDelay = Long.parseLong(attribute);
            } catch (NumberFormatException unused) {
                MamlLog.m17854w(TAG_NAME, "invalid delay attribute");
            }
        }
        NodeList elementsByTagName = element.getElementsByTagName(INNER_TAG);
        boolean z2 = false;
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            this.mControlPoints.add(new ControlPoint((Element) elementsByTagName.item(i2)));
        }
        ArrayList<ControlPoint> arrayList = this.mControlPoints;
        long j2 = arrayList.get(arrayList.size() - 1).mTime;
        this.mTimeRange = j2;
        if (this.mLoop && j2 != 0) {
            z2 = true;
        }
        this.mLoop = z2;
    }

    private void restart(long j2) {
        synchronized (this.mLock) {
            this.mStartTime = j2 + this.mDelay;
            this.mStopped = false;
            this.mLastUpdateTime = 0L;
            this.mNextUpdateInterval = 0L;
            requestUpdate();
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void playAnim(long j2, long j3, long j4, boolean z2, boolean z3) {
        if (isVisible()) {
            super.playAnim(j2, j3, j4, z2, z3);
            restart(j2 - j3);
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void reset(long j2) {
        super.reset(j2);
        restart(j2);
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void setAnim(String[] strArr) {
        show(ScreenElement.isTagEnable(strArr, this.mTag));
    }

    public long updateFramerate(long j2) {
        updateVisibility();
        long j3 = Long.MAX_VALUE;
        if (!isVisible()) {
            return Long.MAX_VALUE;
        }
        synchronized (this.mLock) {
            if (this.mStopped) {
                return Long.MAX_VALUE;
            }
            long j4 = this.mLastUpdateTime;
            long j5 = 0;
            if (j4 > 0) {
                long j6 = j2 - j4;
                if (j6 >= 0) {
                    long j7 = this.mNextUpdateInterval;
                    if (j6 < j7) {
                        long j8 = j7 - j6;
                        this.mNextUpdateInterval = j8;
                        this.mLastUpdateTime = j2;
                        return j8;
                    }
                }
            }
            long j9 = j2 - this.mStartTime;
            if (j9 < 0) {
                j9 = 0;
            }
            if (this.mLoop) {
                j9 %= this.mTimeRange + 1;
            }
            int size = this.mControlPoints.size() - 1;
            while (size >= 0) {
                long j10 = this.mControlPoints.get(size).mTime;
                if (j9 >= j10) {
                    requestFramerate(r9.mFramerate);
                    if (!this.mLoop && size == this.mControlPoints.size() - 1) {
                        this.mStopped = true;
                    }
                    this.mLastUpdateTime = j2;
                    if (!this.mStopped) {
                        j3 = j5 - j9;
                    }
                    this.mNextUpdateInterval = j3;
                    return j3;
                }
                size--;
                j5 = j10;
            }
            return Long.MAX_VALUE;
        }
    }
}
