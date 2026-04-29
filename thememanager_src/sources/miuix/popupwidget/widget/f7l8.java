package miuix.popupwidget.widget;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import c25.toq;
import miuix.core.util.C7080i;
import miuix.view.C7385p;
import miuix.view.HapticCompat;

/* JADX INFO: compiled from: GuidePopupWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 extends C7264k {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f88042a9 = 17;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f88043fti = 5000;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f88044fu4 = 8;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f88045jk = 18;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f88046mcp = 10;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f88047o1t = 32;

    /* JADX INFO: renamed from: t */
    public static final int f41064t = 9;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f88048wvg = 64;

    /* JADX INFO: renamed from: z */
    public static final int f41065z = 16;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f88049fn3e;

    /* JADX INFO: renamed from: i */
    private int f41066i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private LinearLayout f88050ki;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private Runnable f88051ni7;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f88052t8r;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f88053zurt;

    /* JADX INFO: renamed from: miuix.popupwidget.widget.f7l8$k */
    /* JADX INFO: compiled from: GuidePopupWindow.java */
    class RunnableC7262k implements Runnable {
        RunnableC7262k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f7l8.this.m26416k(true);
        }
    }

    public f7l8(Context context) {
        super(context);
        this.f88049fn3e = 0;
        this.f88051ni7 = new RunnableC7262k();
    }

    private int[] a9(View view, Point point) {
        view.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        return new int[]{view.getMeasuredHeight(), view.getMeasuredWidth()};
    }

    private void jk(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\n")) == null || strArrSplit.length == 0) {
            return;
        }
        Point point = new Point();
        C7080i.kja0(m26413g(), point);
        for (String str2 : strArrSplit) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(m26413g(), null, toq.zy.f55523uf);
            appCompatTextView.setMaxWidth(m26413g().getResources().getDimensionPixelSize(toq.C1385g.f54468rp));
            appCompatTextView.setText(str2);
            appCompatTextView.setTextDirection(5);
            int[] iArrA9 = a9(appCompatTextView, point);
            this.f41066i += iArrA9[0];
            this.f88049fn3e = Math.max(this.f88049fn3e, iArrA9[1]);
            this.f88050ki.addView(appCompatTextView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lvui(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.widget.f7l8.lvui(android.view.View):void");
    }

    public void d2ok(View view, boolean z2) {
        eqxt(view, 0, 0, z2);
    }

    public void d3(int i2) {
        this.f88052t8r = i2;
    }

    public void eqxt(View view, int i2, int i3, boolean z2) {
        n7h(z2);
        mcp(view, i2, i3);
        if (z2) {
            this.f41073k.postDelayed(this.f88051ni7, this.f88052t8r);
        }
        if (HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
            return;
        }
        HapticCompat.performHapticFeedback(view, C7385p.f92232cdj);
    }

    public void fti(int i2) {
        jp0y(m26413g().getString(i2));
    }

    public void gvn7(int i2, int i3) {
        this.f41073k.setOffset(i2, i3);
    }

    public void jp0y(String str) {
        jk(str);
    }

    @Override // miuix.popupwidget.widget.C7264k
    public void mcp(View view, int i2, int i3) {
        if (this.f88053zurt) {
            lvui(view);
        } else {
            super.mcp(view, i2, i3);
        }
    }

    public void oc(boolean z2) {
        this.f88053zurt = z2;
    }

    @Override // miuix.popupwidget.widget.C7264k
    protected void x2() {
        super.x2();
        this.f88052t8r = 5000;
        setFocusable(true);
        LinearLayout linearLayout = (LinearLayout) m26421y().inflate(toq.x2.f55344fti, (ViewGroup) null, false);
        this.f88050ki = linearLayout;
        setContentView(linearLayout);
        this.f41073k.m26397z(false);
    }

    public f7l8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88049fn3e = 0;
        this.f88051ni7 = new RunnableC7262k();
    }

    public f7l8(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f88049fn3e = 0;
        this.f88051ni7 = new RunnableC7262k();
    }

    public f7l8(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f88049fn3e = 0;
        this.f88051ni7 = new RunnableC7262k();
    }
}
