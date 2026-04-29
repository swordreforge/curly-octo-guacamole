package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t8r;

/* JADX INFO: compiled from: SmoothCalendarLayoutManager.java */
/* JADX INFO: loaded from: classes2.dex */
class kja0 extends LinearLayoutManager {

    /* JADX INFO: renamed from: k */
    private static final float f24342k = 100.0f;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.kja0$k */
    /* JADX INFO: compiled from: SmoothCalendarLayoutManager.java */
    class C4010k extends t8r {
        C4010k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.t8r
        protected float ni7(DisplayMetrics displayMetrics) {
            return kja0.f24342k / displayMetrics.densityDpi;
        }
    }

    kja0(Context context, int i2, boolean z2) {
        super(context, i2, z2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.mcp mcpVar, int i2) {
        C4010k c4010k = new C4010k(recyclerView.getContext());
        c4010k.cdj(i2);
        startSmoothScroll(c4010k);
    }
}
