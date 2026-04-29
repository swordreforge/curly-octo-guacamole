package miuix.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import gb.toq;
import miuix.appcompat.app.floatingactivity.C6927k;

/* JADX INFO: loaded from: classes3.dex */
public class DialogParentPanel extends ConstraintLayout {
    private static final String ay = "DialogParentPanel";
    private LinearLayout ac;
    private final int[] ad;
    private int[] am;
    private boolean as;
    private View ax;
    private View az;
    private View ba;
    private Barrier bg;
    private C6927k bl;
    private View bq;

    public DialogParentPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = new int[0];
        C6927k c6927k = new C6927k(context, attributeSet);
        this.bl = c6927k;
        c6927k.m24944i(true);
    }

    private void ek5k() {
        this.bq = findViewById(toq.C6054p.f76438w831);
        int i2 = toq.C6054p.i0;
        this.az = findViewById(i2);
        int i3 = toq.C6054p.f76399pc;
        this.ba = findViewById(i3);
        int i4 = toq.C6054p.f76440wlev;
        this.ax = findViewById(i4);
        this.ac = (LinearLayout) findViewById(toq.C6054p.f76290cfr);
        this.am = new int[]{i2, i3, i4};
    }

    /* JADX INFO: renamed from: j */
    private void m26019j(ConstraintLayout.toq toqVar, int i2) {
        toqVar.f2643i = i2;
        toqVar.f48522zurt = i2;
    }

    /* JADX INFO: renamed from: m */
    private ConstraintLayout.toq m26020m(View view) {
        if (view != null) {
            return (ConstraintLayout.toq) view.getLayoutParams();
        }
        Log.d(ay, "Child View is null!");
        return new ConstraintLayout.toq(0, 0);
    }

    /* JADX INFO: renamed from: o */
    private void m26021o(ConstraintLayout.toq toqVar, int i2) {
        toqVar.f2653s = i2;
        toqVar.f48516x2 = i2;
    }

    public void hb() {
        ConstraintLayout.toq toqVarM26020m = m26020m(this.bq);
        ConstraintLayout.toq toqVarM26020m2 = m26020m(this.az);
        ConstraintLayout.toq toqVarM26020m3 = m26020m(this.ba);
        ConstraintLayout.toq toqVarM26020m4 = m26020m(this.ax);
        if (yz()) {
            this.bg.setType(6);
            this.bg.setReferencedIds(this.am);
            this.ac.setOrientation(1);
            toqVarM26020m2.f2638c = 0.5f;
            toqVarM26020m2.f2643i = 0;
            toqVarM26020m2.f2653s = 0;
            toqVarM26020m2.f48522zurt = -1;
            toqVarM26020m3.f2638c = 0.5f;
            toqVarM26020m3.f2643i = 0;
            toqVarM26020m3.f48522zurt = -1;
            toqVarM26020m3.f2650p = toq.C6054p.i0;
            ((ViewGroup.MarginLayoutParams) toqVarM26020m3).height = 0;
            toqVarM26020m3.f48489hb = false;
            toqVarM26020m3.f48503ncyb = 0;
            toqVarM26020m4.f2638c = 0.5f;
            toqVarM26020m4.f2643i = 0;
            toqVarM26020m4.f2650p = toq.C6054p.f76399pc;
            toqVarM26020m4.f48522zurt = -1;
            toqVarM26020m4.f48496ld6 = -1;
            toqVarM26020m4.f48516x2 = 0;
            ((ViewGroup.MarginLayoutParams) toqVarM26020m4).height = 0;
            toqVarM26020m4.f48489hb = false;
            toqVarM26020m4.f48503ncyb = 0;
            toqVarM26020m.f2638c = 0.5f;
            toqVarM26020m.f2643i = -1;
            toqVarM26020m.f2650p = -1;
            toqVarM26020m.f48522zurt = 0;
            m26021o(toqVarM26020m, 0);
        } else {
            this.bg.setReferencedIds(this.ad);
            this.ac.setOrientation(0);
            toqVarM26020m2.f2638c = 1.0f;
            m26019j(toqVarM26020m2, 0);
            toqVarM26020m2.f2653s = 0;
            toqVarM26020m3.f2638c = 1.0f;
            toqVarM26020m3.f48489hb = true;
            ((ViewGroup.MarginLayoutParams) toqVarM26020m3).height = -2;
            m26019j(toqVarM26020m3, 0);
            toqVarM26020m4.f2638c = 1.0f;
            toqVarM26020m4.f48489hb = true;
            ((ViewGroup.MarginLayoutParams) toqVarM26020m4).height = -2;
            m26019j(toqVarM26020m4, 0);
            toqVarM26020m4.f48496ld6 = toq.C6054p.f76438w831;
            toqVarM26020m.f2638c = 1.0f;
            m26019j(toqVarM26020m, 0);
            toqVarM26020m.f48511t8r = -1;
            toqVarM26020m.f2653s = -1;
            toqVarM26020m.f2650p = toq.C6054p.f76440wlev;
            toqVarM26020m.f48516x2 = 0;
        }
        this.bq.setLayoutParams(toqVarM26020m);
        this.az.setLayoutParams(toqVarM26020m2);
        this.ba.setLayoutParams(toqVarM26020m3);
        this.ax.setLayoutParams(toqVarM26020m4);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.bl.m24943h();
        hb();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ek5k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iM24942g = this.bl.m24942g(i3);
        if (yz()) {
            iM24942g = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iM24942g), 1073741824);
        }
        super.onMeasure(this.bl.n7h(i2), iM24942g);
    }

    public void setShouldAdjustLayout(boolean z2) {
        this.as = z2;
    }

    public boolean yz() {
        return this.as;
    }
}
