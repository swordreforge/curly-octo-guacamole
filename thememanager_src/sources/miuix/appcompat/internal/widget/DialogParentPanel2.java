package miuix.appcompat.internal.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import gb.toq;
import miuix.core.util.C7080i;
import miuix.core.util.C7085q;
import miuix.internal.util.C7164n;
import miuix.os.toq;
import miuix.os.zy;
import miuix.smooth.C7334n;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class DialogParentPanel2 extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private float f39606g;

    /* JADX INFO: renamed from: k */
    private final C7043k f39607k;

    /* JADX INFO: renamed from: n */
    private final Path f39608n;

    /* JADX INFO: renamed from: q */
    private final RectF f39609q;

    /* JADX INFO: renamed from: y */
    private int f39610y;

    /* JADX INFO: renamed from: miuix.appcompat.internal.widget.DialogParentPanel2$k */
    private static class C7043k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private TypedValue f87084f7l8;

        /* JADX INFO: renamed from: g */
        private TypedValue f39611g;

        /* JADX INFO: renamed from: h */
        private int f39612h;

        /* JADX INFO: renamed from: k */
        private final Context f39613k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private boolean f87085kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private TypedValue f87086ld6;

        /* JADX INFO: renamed from: n */
        private int f39614n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private TypedValue f87087n7h;

        /* JADX INFO: renamed from: p */
        private TypedValue f39615p;

        /* JADX INFO: renamed from: q */
        private boolean f39616q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private TypedValue f87088qrj;

        /* JADX INFO: renamed from: s */
        private TypedValue f39617s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Point f87089toq = new Point();

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private TypedValue f87090x2;

        /* JADX INFO: renamed from: y */
        private TypedValue f39618y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f87091zy;

        public C7043k(Context context, AttributeSet attributeSet) {
            this.f39613k = context;
            m25402s(context, attributeSet);
            this.f87091zy = m25405n();
            this.f39616q = C7085q.cdj(context);
            this.f87085kja0 = toq.f40718n && zy.m26178g(context);
            this.f39612h = context.getResources().getConfiguration().orientation;
        }

        private boolean f7l8(Context context) {
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    return true;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            return false;
        }

        private boolean ld6() {
            if (this.f87085kja0) {
                return false;
            }
            return m25403y() || this.f87091zy >= 500;
        }

        /* JADX INFO: renamed from: p */
        private int m25400p(TypedValue typedValue, boolean z2) {
            int i2;
            float fraction;
            if (typedValue != null && (i2 = typedValue.type) != 0) {
                if (i2 == 5) {
                    fraction = typedValue.getDimension(this.f39613k.getResources().getDisplayMetrics());
                } else if (i2 == 6) {
                    float f2 = z2 ? this.f87089toq.x : this.f87089toq.y;
                    fraction = typedValue.getFraction(f2, f2);
                }
                return (int) fraction;
            }
            return 0;
        }

        /* JADX INFO: renamed from: q */
        private int m25401q(int i2, boolean z2, TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3, TypedValue typedValue4) {
            if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
                return i2;
            }
            boolean z3 = this.f87085kja0 && this.f39612h == 1;
            if ((!z2 && this.f39616q) || z3) {
                return View.MeasureSpec.makeMeasureSpec(C7085q.n7h(this.f39613k).y - this.f39614n, Integer.MIN_VALUE);
            }
            boolean zLd6 = ld6();
            if (!zLd6) {
                typedValue = typedValue2;
            }
            int iM25400p = m25400p(typedValue, z2);
            if (iM25400p > 0) {
                return View.MeasureSpec.makeMeasureSpec(iM25400p, 1073741824);
            }
            if (!zLd6) {
                typedValue3 = typedValue4;
            }
            int iM25400p2 = m25400p(typedValue3, z2);
            return iM25400p2 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(iM25400p2, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE) : i2;
        }

        /* JADX INFO: renamed from: s */
        private void m25402s(Context context, AttributeSet attributeSet) {
            if (attributeSet == null) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.h9w7);
            int i2 = toq.ki.sy9g;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                TypedValue typedValue = new TypedValue();
                this.f39611g = typedValue;
                typedArrayObtainStyledAttributes.getValue(i2, typedValue);
            }
            int i3 = toq.ki.v7x;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                TypedValue typedValue2 = new TypedValue();
                this.f87084f7l8 = typedValue2;
                typedArrayObtainStyledAttributes.getValue(i3, typedValue2);
            }
            int i4 = toq.ki.mqz;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                TypedValue typedValue3 = new TypedValue();
                this.f39618y = typedValue3;
                typedArrayObtainStyledAttributes.getValue(i4, typedValue3);
            }
            int i5 = toq.ki.nou;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                TypedValue typedValue4 = new TypedValue();
                this.f39617s = typedValue4;
                typedArrayObtainStyledAttributes.getValue(i5, typedValue4);
            }
            int i6 = toq.ki.ojf7;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                TypedValue typedValue5 = new TypedValue();
                this.f39615p = typedValue5;
                typedArrayObtainStyledAttributes.getValue(i6, typedValue5);
            }
            int i7 = toq.ki.gx4;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                TypedValue typedValue6 = new TypedValue();
                this.f87086ld6 = typedValue6;
                typedArrayObtainStyledAttributes.getValue(i7, typedValue6);
            }
            int i8 = toq.ki.p69;
            if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                TypedValue typedValue7 = new TypedValue();
                this.f87088qrj = typedValue7;
                typedArrayObtainStyledAttributes.getValue(i8, typedValue7);
            }
            int i9 = toq.ki.n9t;
            if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                TypedValue typedValue8 = new TypedValue();
                this.f87090x2 = typedValue8;
                typedArrayObtainStyledAttributes.getValue(i9, typedValue8);
            }
            int i10 = toq.ki.apb;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                TypedValue typedValue9 = new TypedValue();
                this.f87087n7h = typedValue9;
                typedArrayObtainStyledAttributes.getValue(i10, typedValue9);
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: y */
        private boolean m25403y() {
            return (Build.VERSION.SDK_INT >= 31 || f7l8(this.f39613k)) ? this.f39613k.getResources().getConfiguration().orientation == 1 : this.f39613k.getApplicationContext().getResources().getConfiguration().orientation == 1;
        }

        /* JADX INFO: renamed from: g */
        public int m25404g(int i2) {
            return m25401q(i2, true, this.f39611g, this.f39618y, this.f39615p, this.f87086ld6);
        }

        /* JADX INFO: renamed from: n */
        public int m25405n() {
            C7080i.f7l8(this.f39613k, this.f87089toq);
            return (int) (this.f87089toq.y / this.f39613k.getResources().getDisplayMetrics().density);
        }

        public void toq(int i2) {
            if (this.f87091zy != i2) {
                this.f39611g = C7164n.x2(this.f39613k, toq.C6055q.oz47);
                this.f87084f7l8 = C7164n.x2(this.f39613k, toq.C6055q.kxp3);
                this.f39618y = C7164n.x2(this.f39613k, toq.C6055q.mxfl);
                this.f39617s = C7164n.x2(this.f39613k, toq.C6055q.f5k);
                this.f39615p = C7164n.x2(this.f39613k, toq.C6055q.lbq);
                this.f87086ld6 = C7164n.x2(this.f39613k, toq.C6055q.n96);
                this.f87090x2 = C7164n.x2(this.f39613k, toq.C6055q.g7);
                this.f87087n7h = C7164n.x2(this.f39613k, toq.C6055q.zq);
                this.f87088qrj = C7164n.x2(this.f39613k, toq.C6055q.z7);
                this.f87091zy = i2;
            }
            this.f39616q = C7085q.cdj(this.f39613k);
            this.f87085kja0 = miuix.os.toq.f40718n && zy.m26178g(this.f39613k);
            this.f39612h = this.f39613k.getResources().getConfiguration().orientation;
        }

        public int zy(int i2) {
            return m25401q(i2, false, this.f39617s, this.f87084f7l8, this.f87090x2, this.f87085kja0 ? this.f87087n7h : this.f87088qrj);
        }
    }

    public DialogParentPanel2(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m25398k(Canvas canvas) {
        this.f39608n.reset();
        Path path = this.f39608n;
        RectF rectF = this.f39609q;
        float f2 = this.f39606g;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.clipPath(this.f39608n);
    }

    private void setCornerRadius(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f39606g = f2;
        zy();
    }

    private void setSmoothCornerEnable(boolean z2) {
        C7334n.m26604g(this, z2);
    }

    private void toq() {
        this.f39607k.toq(this.f39607k.m25405n());
    }

    private void zy() {
        invalidateOutline();
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        m25398k(canvas);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.densityDpi;
        if (i2 != this.f39610y) {
            this.f39610y = i2;
            setCornerRadius(getResources().getDimension(toq.f7l8.f75478mub));
        }
        toq();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        toq();
        super.onMeasure(this.f39607k.m25404g(i2), this.f39607k.zy(i3));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f39609q.set(0.0f, 0.0f, i2, i3);
    }

    public void setVerticalAvoidSpace(int i2) {
        this.f39607k.f39614n = i2;
    }

    public DialogParentPanel2(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogParentPanel2(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39609q = new RectF();
        this.f39608n = new Path();
        setSmoothCornerEnable(true);
        Resources resources = getResources();
        setCornerRadius(resources.getDimension(toq.f7l8.f75478mub));
        this.f39610y = resources.getDisplayMetrics().densityDpi;
        this.f39607k = new C7043k(context, attributeSet);
    }
}
