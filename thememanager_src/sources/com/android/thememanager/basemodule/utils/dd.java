package com.android.thememanager.basemodule.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.basemodule.views.InterfaceC1865s;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import yz.C7794k;

/* JADX INFO: compiled from: RecycleViewScrollManager.java */
/* JADX INFO: loaded from: classes.dex */
public class dd {

    /* JADX INFO: renamed from: n */
    public static final int f10295n = 4;

    /* JADX INFO: renamed from: q */
    public static final int f10296q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57731toq = "RecycleViewScrollManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57732zy = 1;

    /* JADX INFO: renamed from: k */
    private final Map<Integer, WeakReference<InterfaceC1865s>> f10297k = new HashMap(3);

    private void f7l8(RecyclerView recyclerView, StaggeredGridLayoutManager layoutManager) {
        int[] iArrKi = layoutManager.ki(null);
        int[] iArrFn3e = layoutManager.fn3e(null);
        if (iArrKi == null || iArrFn3e == null) {
            return;
        }
        int iOrElse = Arrays.stream(iArrKi).min().orElse(-1);
        int iOrElse2 = Arrays.stream(iArrFn3e).max().orElse(-1);
        if (iOrElse == -1 || iOrElse2 == -1) {
            return;
        }
        m7032s(iOrElse, iOrElse2, recyclerView);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7028g(View v2, int minWidthVisiblePercent) {
        return v2.getLocalVisibleRect(new Rect()) && v2.getVisibility() == 0 && m7031q(v2) >= minWidthVisiblePercent;
    }

    /* JADX INFO: renamed from: k */
    private void m7029k() {
        HashMap map = new HashMap();
        if (this.f10297k.isEmpty()) {
            return;
        }
        for (WeakReference<InterfaceC1865s> weakReference : this.f10297k.values()) {
            InterfaceC1865s interfaceC1865s = weakReference.get();
            if (interfaceC1865s != null && interfaceC1865s.mo7369p()) {
                map.put(Integer.valueOf(interfaceC1865s.hashCode()), weakReference);
            }
        }
        this.f10297k.clear();
        this.f10297k.putAll(map);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m7030n(View v2, int minHeightVisiblePercent) {
        return v2.getLocalVisibleRect(new Rect()) && v2.getVisibility() == 0 && zy(v2) >= minHeightVisiblePercent;
    }

    /* JADX INFO: renamed from: q */
    public static int m7031q(View v2) {
        Rect rect = new Rect();
        if (!v2.getLocalVisibleRect(rect) || v2.getMeasuredWidth() <= 0) {
            return -1;
        }
        return (rect.width() * 100) / v2.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: s */
    private void m7032s(int firstItemPosition, int lastItemPosition, RecyclerView recyclerView) {
        m7029k();
        while (firstItemPosition <= lastItemPosition) {
            Object objFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(firstItemPosition);
            if (objFindViewHolderForLayoutPosition instanceof InterfaceC1865s) {
                InterfaceC1865s interfaceC1865s = (InterfaceC1865s) objFindViewHolderForLayoutPosition;
                if ((interfaceC1865s.x2() & 4) != 0) {
                    interfaceC1865s.qrj(4);
                }
                if (!this.f10297k.containsKey(Integer.valueOf(interfaceC1865s.hashCode()))) {
                    this.f10297k.put(Integer.valueOf(interfaceC1865s.hashCode()), new WeakReference<>(interfaceC1865s));
                }
            }
            firstItemPosition++;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m7033y(RecyclerView recyclerView, LinearLayoutManager layoutManager) {
        m7032s(layoutManager.findFirstVisibleItemPosition(), layoutManager.findLastVisibleItemPosition(), recyclerView);
    }

    public static int zy(View v2) {
        Rect rect = new Rect();
        if (!v2.getLocalVisibleRect(rect) || v2.getMeasuredHeight() <= 0) {
            return -1;
        }
        return (rect.height() * 100) / v2.getMeasuredHeight();
    }

    public void ld6(RecyclerView recyclerView, int newState) {
        if (newState == 0) {
            m7034p(recyclerView);
            return;
        }
        if (this.f10297k.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC1865s>> it = this.f10297k.values().iterator();
        while (it.hasNext()) {
            InterfaceC1865s interfaceC1865s = it.next().get();
            if (interfaceC1865s != null && (interfaceC1865s.x2() & 1) != 0) {
                interfaceC1865s.qrj(1);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m7034p(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        RecyclerView.AbstractC1048h layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            f7l8(recyclerView, (StaggeredGridLayoutManager) layoutManager);
        } else if (layoutManager instanceof LinearLayoutManager) {
            m7033y(recyclerView, (LinearLayoutManager) layoutManager);
        } else {
            C7794k.m28194k(f57731toq, "Unrecognized or null LayoutManager");
        }
    }

    public void toq() {
        this.f10297k.clear();
    }

    public void x2() {
        if (this.f10297k.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC1865s>> it = this.f10297k.values().iterator();
        while (it.hasNext()) {
            InterfaceC1865s interfaceC1865s = it.next().get();
            if (interfaceC1865s != null && (interfaceC1865s.x2() & 2) != 0) {
                interfaceC1865s.qrj(2);
            }
        }
    }
}
