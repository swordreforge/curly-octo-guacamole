package miuix.appcompat.app.floatingactivity;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import gb.toq;
import miuix.appcompat.app.floatingactivity.helper.AbstractC6920k;
import miuix.core.util.C7080i;
import miuix.internal.util.C7164n;

/* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.k */
/* JADX INFO: compiled from: FloatingABOLayoutSpec.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6927k {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f86853kja0 = "FloatingABOLayoutSpec";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private TypedValue f86854f7l8;

    /* JADX INFO: renamed from: g */
    private TypedValue f38870g;

    /* JADX INFO: renamed from: k */
    private Context f38871k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private TypedValue f86855ld6;

    /* JADX INFO: renamed from: n */
    private TypedValue f38872n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private Point f86856n7h;

    /* JADX INFO: renamed from: p */
    private TypedValue f38873p;

    /* JADX INFO: renamed from: q */
    private boolean f38874q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private DisplayMetrics f86857qrj;

    /* JADX INFO: renamed from: s */
    private TypedValue f38875s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f86858toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private TypedValue f86859x2;

    /* JADX INFO: renamed from: y */
    private TypedValue f38876y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f86860zy;

    public C6927k(Context context) {
        this(context, null);
    }

    private TypedValue f7l8() {
        if (this.f86858toq && this.f86860zy) {
            return this.f86859x2;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private TypedValue m24937k() {
        if (this.f86858toq && this.f86860zy) {
            return this.f38870g;
        }
        return null;
    }

    private void ki(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.h9w7);
        int i2 = toq.ki.sy9g;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            TypedValue typedValue = new TypedValue();
            this.f38872n = typedValue;
            typedArrayObtainStyledAttributes.getValue(i2, typedValue);
        }
        int i3 = toq.ki.v7x;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            TypedValue typedValue2 = new TypedValue();
            this.f38870g = typedValue2;
            typedArrayObtainStyledAttributes.getValue(i3, typedValue2);
        }
        int i4 = toq.ki.mqz;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            TypedValue typedValue3 = new TypedValue();
            this.f86854f7l8 = typedValue3;
            typedArrayObtainStyledAttributes.getValue(i4, typedValue3);
        }
        int i5 = toq.ki.nou;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            TypedValue typedValue4 = new TypedValue();
            this.f38876y = typedValue4;
            typedArrayObtainStyledAttributes.getValue(i5, typedValue4);
        }
        int i6 = toq.ki.ojf7;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            TypedValue typedValue5 = new TypedValue();
            this.f38875s = typedValue5;
            typedArrayObtainStyledAttributes.getValue(i6, typedValue5);
        }
        int i7 = toq.ki.gx4;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            TypedValue typedValue6 = new TypedValue();
            this.f38873p = typedValue6;
            typedArrayObtainStyledAttributes.getValue(i7, typedValue6);
        }
        int i8 = toq.ki.p69;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            TypedValue typedValue7 = new TypedValue();
            this.f86859x2 = typedValue7;
            typedArrayObtainStyledAttributes.getValue(i8, typedValue7);
        }
        int i9 = toq.ki.n9t;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            TypedValue typedValue8 = new TypedValue();
            this.f86855ld6 = typedValue8;
            typedArrayObtainStyledAttributes.getValue(i9, typedValue8);
        }
        this.f86858toq = typedArrayObtainStyledAttributes.getBoolean(toq.ki.i2en, false);
        this.f86860zy = AbstractC6920k.m24912s(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean kja0() {
        return this.f38871k.getApplicationContext().getResources().getConfiguration().orientation == 1;
    }

    private int ld6(int i2, boolean z2, TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3, TypedValue typedValue4) {
        if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return i2;
        }
        boolean zKja0 = kja0();
        if (!zKja0) {
            typedValue = typedValue2;
        }
        int iT8r = t8r(typedValue, z2);
        if (iT8r > 0) {
            return View.MeasureSpec.makeMeasureSpec(iT8r, 1073741824);
        }
        if (!zKja0) {
            typedValue3 = typedValue4;
        }
        int iT8r2 = t8r(typedValue3, z2);
        return iT8r2 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(iT8r2, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE) : i2;
    }

    /* JADX INFO: renamed from: p */
    private TypedValue m24938p() {
        if (this.f86858toq && this.f86860zy) {
            return this.f38875s;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private TypedValue m24939q() {
        if (this.f86858toq && this.f86860zy) {
            return this.f38872n;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private TypedValue m24940s() {
        if (this.f86858toq && this.f86860zy) {
            return this.f38873p;
        }
        return null;
    }

    private int t8r(TypedValue typedValue, boolean z2) {
        int i2;
        float fraction;
        if (typedValue != null && (i2 = typedValue.type) != 0) {
            if (i2 == 5) {
                fraction = typedValue.getDimension(this.f86857qrj);
            } else if (i2 == 6) {
                float f2 = z2 ? this.f86856n7h.x : this.f86856n7h.y;
                fraction = typedValue.getFraction(f2, f2);
            }
            return (int) fraction;
        }
        return 0;
    }

    private TypedValue toq() {
        if (this.f86858toq && this.f86860zy) {
            return this.f38876y;
        }
        return null;
    }

    private int x2(ContextThemeWrapper contextThemeWrapper) {
        try {
            return ((Integer) miuix.reflect.toq.ld6(contextThemeWrapper, miuix.reflect.toq.m26540s(contextThemeWrapper.getClass(), "getThemeResId", null), null)).intValue();
        } catch (RuntimeException e2) {
            Log.w(f86853kja0, "catch theme resource get exception", e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: y */
    private TypedValue m24941y() {
        if (this.f86858toq && this.f86860zy) {
            return this.f86855ld6;
        }
        return null;
    }

    private TypedValue zy() {
        if (this.f86858toq && this.f86860zy) {
            return this.f86854f7l8;
        }
        return null;
    }

    public void cdj(boolean z2) {
        if (this.f86858toq) {
            this.f86860zy = z2;
        }
    }

    public void fn3e(Context context) {
        this.f86857qrj = context.getResources().getDisplayMetrics();
        this.f86856n7h = C7080i.qrj(context);
    }

    /* JADX INFO: renamed from: g */
    public int m24942g(int i2) {
        return ld6(i2, false, this.f38876y, this.f38870g, this.f86855ld6, this.f86859x2);
    }

    /* JADX INFO: renamed from: h */
    public void m24943h() {
        int iX2;
        Context contextThemeWrapper = this.f38871k;
        if (this.f38874q && (contextThemeWrapper instanceof ContextThemeWrapper) && (iX2 = x2((ContextThemeWrapper) contextThemeWrapper)) > 0) {
            contextThemeWrapper = new ContextThemeWrapper(this.f38871k.getApplicationContext(), iX2);
        }
        this.f38872n = C7164n.x2(contextThemeWrapper, toq.C6055q.oz47);
        this.f38870g = C7164n.x2(contextThemeWrapper, toq.C6055q.kxp3);
        this.f86854f7l8 = C7164n.x2(contextThemeWrapper, toq.C6055q.mxfl);
        this.f38876y = C7164n.x2(contextThemeWrapper, toq.C6055q.f5k);
        this.f38875s = C7164n.x2(contextThemeWrapper, toq.C6055q.lbq);
        this.f38873p = C7164n.x2(contextThemeWrapper, toq.C6055q.n96);
        this.f86855ld6 = C7164n.x2(contextThemeWrapper, toq.C6055q.g7);
        this.f86859x2 = C7164n.x2(contextThemeWrapper, toq.C6055q.z7);
        fn3e(contextThemeWrapper);
    }

    /* JADX INFO: renamed from: i */
    public void m24944i(boolean z2) {
        this.f38874q = z2;
    }

    /* JADX INFO: renamed from: n */
    public int m24945n(int i2) {
        return ld6(i2, false, toq(), m24937k(), m24941y(), f7l8());
    }

    public int n7h(int i2) {
        return ld6(i2, true, this.f38872n, this.f86854f7l8, this.f38875s, this.f38873p);
    }

    public int qrj(int i2) {
        return ld6(i2, true, m24939q(), zy(), m24938p(), m24940s());
    }

    public C6927k(Context context, AttributeSet attributeSet) {
        this.f86858toq = false;
        this.f86860zy = false;
        this.f38871k = context;
        this.f86856n7h = new Point();
        fn3e(context);
        ki(context, attributeSet);
    }
}
