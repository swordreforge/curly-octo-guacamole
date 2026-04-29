package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C0683f;
import com.google.android.material.color.kja0;
import ij.C6095k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements InterfaceC4134k {

    /* JADX INFO: renamed from: k */
    private TextView f25115k;

    /* JADX INFO: renamed from: n */
    private int f25116n;

    /* JADX INFO: renamed from: q */
    private Button f25117q;

    public SnackbarContentLayout(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    private boolean m14947n(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f25115k.getPaddingTop() == i3 && this.f25115k.getPaddingBottom() == i4) {
            return z2;
        }
        m14948q(this.f25115k, i3, i4);
        return true;
    }

    /* JADX INFO: renamed from: q */
    private static void m14948q(@lvui View view, int i2, int i3) {
        if (C0683f.w831(view)) {
            C0683f.u38j(view, C0683f.i1(view), i2, C0683f.bf2(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    public Button getActionView() {
        return this.f25117q;
    }

    public TextView getMessageView() {
        return this.f25115k;
    }

    @Override // com.google.android.material.snackbar.InterfaceC4134k
    /* JADX INFO: renamed from: k */
    public void mo14949k(int i2, int i3) {
        this.f25115k.setAlpha(0.0f);
        long j2 = i3;
        long j3 = i2;
        this.f25115k.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f25117q.getVisibility() == 0) {
            this.f25117q.setAlpha(0.0f);
            this.f25117q.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f25115k = (TextView) findViewById(C6095k.y.cb);
        this.f25117q = (Button) findViewById(C6095k.y.qexj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = ij.C6095k.g.f78958ngy
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = ij.C6095k.g.f78975pjz9
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f25115k
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L48
            int r5 = r7.f25116n
            if (r5 <= 0) goto L48
            android.widget.Button r5 = r7.f25117q
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f25116n
            if (r5 <= r6) goto L48
            int r2 = r0 - r2
            boolean r0 = r7.m14947n(r1, r0, r2)
            if (r0 == 0) goto L53
            goto L54
        L48:
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            boolean r0 = r7.m14947n(r4, r0, r0)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            if (r1 == 0) goto L59
            super.onMeasure(r8, r9)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f25116n = i2;
    }

    @Override // com.google.android.material.snackbar.InterfaceC4134k
    public void toq(int i2, int i3) {
        this.f25115k.setAlpha(1.0f);
        long j2 = i3;
        long j3 = i2;
        this.f25115k.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f25117q.getVisibility() == 0) {
            this.f25117q.setAlpha(1.0f);
            this.f25117q.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    void zy(float f2) {
        if (f2 != 1.0f) {
            this.f25117q.setTextColor(kja0.qrj(kja0.m14285q(this, C6095k.zy.f80274sc), this.f25117q.getCurrentTextColor(), f2));
        }
    }

    public SnackbarContentLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
