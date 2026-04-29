package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.q */
/* JADX INFO: compiled from: CanvasSubtitleOutput.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3762q extends View implements SubtitleView.InterfaceC3733k {

    /* JADX INFO: renamed from: g */
    private float f22835g;

    /* JADX INFO: renamed from: k */
    private final List<x9kr> f22836k;

    /* JADX INFO: renamed from: n */
    private int f22837n;

    /* JADX INFO: renamed from: q */
    private List<com.google.android.exoplayer2.text.toq> f22838q;

    /* JADX INFO: renamed from: s */
    private float f22839s;

    /* JADX INFO: renamed from: y */
    private C3760n f22840y;

    public C3762q(Context context) {
        this(context, null);
    }

    private static com.google.android.exoplayer2.text.toq toq(com.google.android.exoplayer2.text.toq toqVar) {
        toq.zy zyVarM12943t = toqVar.toq().ni7(-3.4028235E38f).fu4(Integer.MIN_VALUE).m12943t(null);
        if (toqVar.f22005s == 0) {
            zyVarM12943t.m12937i(1.0f - toqVar.f22007y, 0);
        } else {
            zyVarM12943t.m12937i((-toqVar.f22007y) - 1.0f, 1);
        }
        int i2 = toqVar.f22002p;
        if (i2 == 0) {
            zyVarM12943t.fn3e(2);
        } else if (i2 == 2) {
            zyVarM12943t.fn3e(0);
        }
        return zyVarM12943t.m12938k();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<com.google.android.exoplayer2.text.toq> list = this.f22838q;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i2 = paddingBottom - paddingTop;
        float fM13325y = n5r1.m13325y(this.f22837n, this.f22835g, height, i2);
        if (fM13325y <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            com.google.android.exoplayer2.text.toq qVar = list.get(i3);
            if (qVar.f21993e != Integer.MIN_VALUE) {
                qVar = toq(qVar);
            }
            com.google.android.exoplayer2.text.toq toqVar = qVar;
            int i4 = paddingBottom;
            this.f22836k.get(i3).toq(toqVar, this.f22840y, fM13325y, n5r1.m13325y(toqVar.f21994f, toqVar.f21992c, height, i2), this.f22839s, canvas, paddingLeft, paddingTop, width, i4);
            i3++;
            size = size;
            i2 = i2;
            paddingBottom = i4;
            width = width;
        }
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.InterfaceC3733k
    /* JADX INFO: renamed from: k */
    public void mo13248k(List<com.google.android.exoplayer2.text.toq> list, C3760n c3760n, float f2, int i2, float f3) {
        this.f22838q = list;
        this.f22840y = c3760n;
        this.f22835g = f2;
        this.f22837n = i2;
        this.f22839s = f3;
        while (this.f22836k.size() < list.size()) {
            this.f22836k.add(new x9kr(getContext()));
        }
        invalidate();
    }

    public C3762q(Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22836k = new ArrayList();
        this.f22838q = Collections.emptyList();
        this.f22837n = 0;
        this.f22835g = 0.0533f;
        this.f22840y = C3760n.f66706qrj;
        this.f22839s = 0.08f;
    }
}
