package miuix.appcompat.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import gb.toq;
import miuix.graphics.shadow.C7113k;
import miuix.internal.util.C7164n;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class OutDropShadowView extends View {

    /* JADX INFO: renamed from: g */
    private float f39358g;

    /* JADX INFO: renamed from: k */
    private int f39359k;

    /* JADX INFO: renamed from: n */
    private Path f39360n;

    /* JADX INFO: renamed from: q */
    private miuix.graphics.shadow.toq f39361q;

    public OutDropShadowView(Context context) {
        super(context);
        this.f39359k = 0;
        this.f39360n = new Path();
        m25252k();
    }

    /* JADX INFO: renamed from: k */
    private void m25252k() {
        this.f39358g = getContext().getResources().getDisplayMetrics().densityDpi;
        miuix.graphics.shadow.zy zyVar = new miuix.graphics.shadow.zy(getContext(), new C7113k.k(50.0f).m25758n(6).m25757k(), C7164n.m25951q(getContext(), toq.C6055q.fl, true));
        this.f39361q = zyVar;
        zyVar.mo25760g(0, 0, getMeasuredWidth(), getMeasuredHeight());
        setBackgroundColor(0);
        setImportantForAccessibility(4);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        if (this.f39361q != null) {
            canvas.clipOutPath(this.f39360n);
            this.f39361q.m25762k(canvas, this.f39359k);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39361q.toq(this, true, 2);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        miuix.graphics.shadow.toq toqVar;
        if (configuration.densityDpi == this.f39358g || (toqVar = this.f39361q) == null) {
            return;
        }
        toqVar.m25763q(configuration, C7164n.m25951q(getContext(), toq.C6055q.fl, true));
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        miuix.graphics.shadow.toq toqVar = this.f39361q;
        if (toqVar != null) {
            toqVar.mo25760g(i2, i3, i4, i5);
            this.f39360n.reset();
            Path path = this.f39360n;
            RectF rectFZy = this.f39361q.zy();
            int i6 = this.f39359k;
            path.addRoundRect(rectFZy, i6, i6, Path.Direction.CW);
        }
    }

    public void setShadowHostViewRadius(int i2) {
        this.f39359k = i2;
        this.f39360n.reset();
        Path path = this.f39360n;
        RectF rectFZy = this.f39361q.zy();
        int i3 = this.f39359k;
        path.addRoundRect(rectFZy, i3, i3, Path.Direction.CW);
    }

    public void toq() {
        this.f39361q.toq(this, false, 2);
    }

    public OutDropShadowView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39359k = 0;
        this.f39360n = new Path();
        m25252k();
    }

    public OutDropShadowView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39359k = 0;
        this.f39360n = new Path();
        m25252k();
    }

    public OutDropShadowView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f39359k = 0;
        this.f39360n = new Path();
        m25252k();
    }
}
