package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0184b;
import ij.C6095k;

/* JADX INFO: loaded from: classes2.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: k */
    public final CharSequence f25126k;

    /* JADX INFO: renamed from: n */
    public final int f25127n;

    /* JADX INFO: renamed from: q */
    public final Drawable f25128q;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0184b c0184bFti = C0184b.fti(context, attributeSet, C6095k.kja0.ynka);
        this.f25126k = c0184bFti.fu4(C6095k.kja0.m3);
        this.f25128q = c0184bFti.m553y(C6095k.kja0.k4);
        this.f25127n = c0184bFti.fn3e(C6095k.kja0.y8mq, 0);
        c0184bFti.d3();
    }
}
