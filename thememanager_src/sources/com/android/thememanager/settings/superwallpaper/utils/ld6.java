package com.android.thememanager.settings.superwallpaper.utils;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.google.gson.C4871g;
import com.google.gson.C4872h;

/* JADX INFO: compiled from: RecyclerViewStatUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f60975ld6 = 1;

    /* JADX INFO: renamed from: p */
    private static final int f15776p = 0;

    /* JADX INFO: renamed from: s */
    public static final String f15777s = "RVStatistics";

    /* JADX INFO: renamed from: y */
    private static final int f15778y = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private HandlerThread f60976f7l8;

    /* JADX INFO: renamed from: g */
    private volatile int f15779g;

    /* JADX INFO: renamed from: k */
    private Handler f15780k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private RecyclerView f60977toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private RecyclerView f60978zy;

    /* JADX INFO: renamed from: q */
    private volatile int f15782q = -1;

    /* JADX INFO: renamed from: n */
    private volatile int f15781n = -1;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.ld6$k */
    /* JADX INFO: compiled from: RecyclerViewStatUtil.java */
    class HandlerC2664k extends Handler {
        HandlerC2664k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i2 = msg.what;
            if (i2 == 0) {
                ld6.this.f15779g = 0;
                ld6 ld6Var = ld6.this;
                ld6Var.m9276p(ld6Var.f60978zy);
            } else {
                if (i2 != 1) {
                    return;
                }
                ld6.this.f15779g = 1;
                ld6 ld6Var2 = ld6.this;
                ld6Var2.m9276p(ld6Var2.f60977toq);
            }
        }
    }

    public ld6(RecyclerView systemRecyclerView, RecyclerView onlineRecyclerview) {
        HandlerThread handlerThread = new HandlerThread("recyclerview-stat");
        this.f60976f7l8 = handlerThread;
        this.f60978zy = systemRecyclerView;
        this.f60977toq = onlineRecyclerview;
        handlerThread.start();
        this.f15780k = new HandlerC2664k(this.f60976f7l8.getLooper());
    }

    private int[] f7l8(GridLayoutManager manager) {
        return new int[]{manager.findFirstVisibleItemPosition(), manager.findLastVisibleItemPosition()};
    }

    /* JADX INFO: renamed from: g */
    private int[] m9273g(int[] startPos, int[] endPos) {
        int i2 = startPos[0];
        int i3 = endPos[0];
        for (int i4 = 1; i4 < startPos.length; i4++) {
            int i5 = startPos[i4];
            if (i2 > i5) {
                i2 = i5;
            }
        }
        for (int i6 = 1; i6 < endPos.length; i6++) {
            int i7 = endPos[i6];
            if (i3 < i7) {
                i3 = i7;
            }
        }
        return new int[]{i2, i3};
    }

    private boolean ld6(View view, int orientation) {
        int measuredWidth;
        int measuredHeight;
        if (view != null && view.getVisibility() == 0 && view.isShown() && view.getGlobalVisibleRect(new Rect())) {
            if (view.getGlobalVisibleRect(new Rect())) {
                if (orientation == 1 && (measuredHeight = view.getMeasuredHeight()) > 0 && (r1.bottom - r1.top) / measuredHeight >= 0.5f) {
                    return true;
                }
                if (orientation == 0 && (measuredWidth = view.getMeasuredWidth()) > 0 && (r1.right - r1.left) / measuredWidth >= 0.5f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private void m9275n(int type, int position) {
        ArrayMap arrayMap = new ArrayMap(2);
        if (position != -1) {
            arrayMap.put(com.android.thememanager.basemodule.analysis.toq.eaj, Integer.valueOf(type));
            arrayMap.put(com.android.thememanager.basemodule.analysis.toq.hm7, Integer.valueOf(position));
            String strO1t = null;
            try {
                strO1t = new C4871g().o1t(arrayMap);
            } catch (C4872h unused) {
            }
            if (strO1t != null) {
                com.android.thememanager.basemodule.analysis.kja0.m6641s("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.nr0, com.android.thememanager.basemodule.analysis.toq.kp3, strO1t);
                C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.nr0, com.android.thememanager.basemodule.analysis.toq.kp3, arrayMap));
            }
            arrayMap.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m9276p(RecyclerView rview) {
        int orientation;
        if (rview != null && rview.getVisibility() == 0 && rview.isShown() && rview.getGlobalVisibleRect(new Rect())) {
            try {
                int[] iArrM9278s = new int[2];
                RecyclerView.AbstractC1048h layoutManager = rview.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    iArrM9278s = m9279y((LinearLayoutManager) layoutManager);
                    orientation = ((LinearLayoutManager) layoutManager).getOrientation();
                } else {
                    if (layoutManager instanceof GridLayoutManager) {
                        iArrM9278s = f7l8((GridLayoutManager) layoutManager);
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        iArrM9278s = m9278s((StaggeredGridLayoutManager) layoutManager);
                    }
                    orientation = 1;
                }
                if (iArrM9278s == null || iArrM9278s.length < 2 || !rview.getGlobalVisibleRect(new Rect())) {
                    return;
                }
                for (int i2 = iArrM9278s[0]; i2 <= iArrM9278s[1]; i2++) {
                    if (ld6(layoutManager.findViewByPosition(i2), orientation)) {
                        qrj(i2);
                    }
                }
            } catch (Exception e2) {
                Log.d(f15777s, "getVisible fail.", e2);
            }
        }
    }

    private void qrj(int position) {
        if (this.f15779g == 1) {
            if (position > this.f15782q) {
                this.f15782q = position;
            }
        } else if (position > this.f15781n) {
            this.f15781n = position;
        }
    }

    /* JADX INFO: renamed from: s */
    private int[] m9278s(StaggeredGridLayoutManager manager) {
        int[] iArr = new int[manager.fti()];
        int[] iArr2 = new int[manager.fti()];
        manager.ki(iArr);
        manager.fn3e(iArr2);
        return m9273g(iArr, iArr2);
    }

    /* JADX INFO: renamed from: y */
    private int[] m9279y(LinearLayoutManager manager) {
        return new int[]{manager.findFirstVisibleItemPosition(), manager.findLastVisibleItemPosition()};
    }

    public void n7h() {
        m9275n(0, this.f15781n);
        m9275n(1, this.f15782q);
        this.f15781n = -1;
        this.f15782q = -1;
    }

    public void x2(int type) {
        if (type == 0) {
            this.f15780k.sendEmptyMessage(0);
        } else {
            this.f15780k.sendEmptyMessage(1);
        }
    }
}
