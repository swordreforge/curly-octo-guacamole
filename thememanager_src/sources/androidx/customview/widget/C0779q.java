package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C0683f;
import java.util.Arrays;
import zy.InterfaceC7833l;
import zy.a9;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.customview.widget.q */
/* JADX INFO: compiled from: ViewDragHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C0779q {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f50992a9 = 4;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f50993d2ok = 256;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f50994d3 = 2;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f50995eqxt = 20;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f50996fti = 8;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f50997fu4 = "ViewDragHelper";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f50998gvn7 = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f50999jk = 2;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f51000jp0y = 15;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f51001lvui = 600;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f51002mcp = 1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f51003o1t = 0;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f51004oc = 3;

    /* JADX INFO: renamed from: r */
    private static final Interpolator f4332r = new k();

    /* JADX INFO: renamed from: t */
    public static final int f4333t = 2;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f51005wvg = 1;

    /* JADX INFO: renamed from: z */
    public static final int f4334z = -1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f51006cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float[] f51007f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f51008fn3e;

    /* JADX INFO: renamed from: g */
    private float[] f4335g;

    /* JADX INFO: renamed from: h */
    private final int f4336h;

    /* JADX INFO: renamed from: i */
    private View f4337i;

    /* JADX INFO: renamed from: k */
    private int f4338k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private OverScroller f51009ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f51010kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f51011ld6;

    /* JADX INFO: renamed from: n */
    private float[] f4339n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f51012n7h;

    /* JADX INFO: renamed from: p */
    private int[] f4340p;

    /* JADX INFO: renamed from: q */
    private float[] f4341q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f51014qrj;

    /* JADX INFO: renamed from: s */
    private int[] f4342s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final zy f51015t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f51016toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private VelocityTracker f51017x2;

    /* JADX INFO: renamed from: y */
    private int[] f4343y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final ViewGroup f51018zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f51019zy = -1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final Runnable f51013ni7 = new toq();

    /* JADX INFO: renamed from: androidx.customview.widget.q$k */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    class k implements Interpolator {
        k() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.q$toq */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0779q.this.m3746l(0);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.q$zy */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    public static abstract class zy {
        public boolean f7l8(int i2) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public void mo3750g(int i2, int i3) {
        }

        /* JADX INFO: renamed from: k */
        public int mo3751k(@lvui View view, int i2, int i3) {
            return 0;
        }

        public void ld6(@lvui View view, int i2, int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        }

        /* JADX INFO: renamed from: n */
        public int mo3752n(@lvui View view) {
            return 0;
        }

        /* JADX INFO: renamed from: p */
        public void mo3753p(int i2) {
        }

        /* JADX INFO: renamed from: q */
        public int mo3754q(@lvui View view) {
            return 0;
        }

        public abstract boolean qrj(@lvui View view, int i2);

        /* JADX INFO: renamed from: s */
        public void mo3755s(@lvui View view, int i2) {
        }

        public int toq(@lvui View view, int i2, int i3) {
            return 0;
        }

        public void x2(@lvui View view, float f2, float f3) {
        }

        /* JADX INFO: renamed from: y */
        public void mo3756y(int i2, int i3) {
        }

        public int zy(int i2) {
            return i2;
        }
    }

    private C0779q(@lvui Context context, @lvui ViewGroup viewGroup, @lvui zy zyVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (zyVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f51018zurt = viewGroup;
        this.f51015t8r = zyVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4336h = i2;
        this.f51010kja0 = i2;
        this.f51016toq = viewConfiguration.getScaledTouchSlop();
        this.f51014qrj = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f51012n7h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f51009ki = new OverScroller(context, f4332r);
    }

    public static C0779q cdj(@lvui ViewGroup viewGroup, @lvui zy zyVar) {
        return new C0779q(viewGroup.getContext(), viewGroup, zyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.q$zy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void dd(float f2, float f3, int i2) {
        boolean zM3737n = m3737n(f2, f3, i2, 1);
        ?? r0 = zM3737n;
        if (m3737n(f3, f2, i2, 4)) {
            r0 = (zM3737n ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (m3737n(f2, f3, i2, 2)) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r03 = r02;
        if (m3737n(f3, f2, i2, 8)) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.f4342s;
            iArr[i2] = iArr[i2] | r03;
            this.f51015t8r.mo3750g(r03, i2);
        }
    }

    private boolean eqxt(int i2) {
        if (oc(i2)) {
            return true;
        }
        Log.e(f50997fu4, "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void fn3e(int i2) {
        float[] fArr = this.f4341q;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4339n;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4335g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f51007f7l8;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4343y;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4342s;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4340p;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4341q = fArr2;
            this.f4339n = fArr3;
            this.f4335g = fArr4;
            this.f51007f7l8 = fArr5;
            this.f4343y = iArr;
            this.f4342s = iArr2;
            this.f4340p = iArr3;
        }
    }

    private boolean fu4(int i2, int i3, int i4, int i5) {
        int left = this.f4337i.getLeft();
        int top = this.f4337i.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f51009ki.abortAnimation();
            m3746l(0);
            return false;
        }
        this.f51009ki.startScroll(left, top, i6, i7, n7h(this.f4337i, i6, i7, i4, i5));
        m3746l(2);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static C0779q m3735h(@lvui ViewGroup viewGroup, float f2, @lvui zy zyVar) {
        C0779q c0779qCdj = cdj(viewGroup, zyVar);
        c0779qCdj.f51016toq = (int) (c0779qCdj.f51016toq * (1.0f / f2));
        return c0779qCdj;
    }

    /* JADX INFO: renamed from: i */
    private void m3736i(int i2, int i3, int i4, int i5) {
        int left = this.f4337i.getLeft();
        int top = this.f4337i.getTop();
        if (i4 != 0) {
            i2 = this.f51015t8r.mo3751k(this.f4337i, i2, i4);
            C0683f.gc3c(this.f4337i, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.f51015t8r.toq(this.f4337i, i3, i5);
            C0683f.zkd(this.f4337i, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f51015t8r.ld6(this.f4337i, i6, i7, i6 - left, i7 - top);
    }

    private void ki(float f2, float f3) {
        this.f51008fn3e = true;
        this.f51015t8r.x2(this.f4337i, f2, f3);
        this.f51008fn3e = false;
        if (this.f4338k == 1) {
            m3746l(0);
        }
    }

    private void ld6() {
        float[] fArr = this.f4341q;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f4339n, 0.0f);
        Arrays.fill(this.f4335g, 0.0f);
        Arrays.fill(this.f51007f7l8, 0.0f);
        Arrays.fill(this.f4343y, 0);
        Arrays.fill(this.f4342s, 0);
        Arrays.fill(this.f4340p, 0);
        this.f51011ld6 = 0;
    }

    private int mcp(int i2, int i3) {
        int i4 = i2 < this.f51018zurt.getLeft() + this.f51010kja0 ? 1 : 0;
        if (i3 < this.f51018zurt.getTop() + this.f51010kja0) {
            i4 |= 4;
        }
        if (i2 > this.f51018zurt.getRight() - this.f51010kja0) {
            i4 |= 2;
        }
        return i3 > this.f51018zurt.getBottom() - this.f51010kja0 ? i4 | 8 : i4;
    }

    /* JADX INFO: renamed from: n */
    private boolean m3737n(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f4343y[i2] & i3) != i3 || (this.f51006cdj & i3) == 0 || (this.f4340p[i2] & i3) == i3 || (this.f4342s[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f51016toq;
        if (fAbs <= i4 && fAbs2 <= i4) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f51015t8r.f7l8(i3)) {
            return (this.f4342s[i2] & i3) == 0 && fAbs > ((float) this.f51016toq);
        }
        int[] iArr = this.f4340p;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private int n7h(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int iM3738p = m3738p(i4, (int) this.f51012n7h, (int) this.f51014qrj);
        int iM3738p2 = m3738p(i5, (int) this.f51012n7h, (int) this.f51014qrj);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iM3738p);
        int iAbs4 = Math.abs(iM3738p2);
        int i6 = iAbs3 + iAbs4;
        int i7 = iAbs + iAbs2;
        if (iM3738p != 0) {
            f2 = iAbs3;
            f3 = i6;
        } else {
            f2 = iAbs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (iM3738p2 != 0) {
            f4 = iAbs4;
            f5 = i6;
        } else {
            f4 = iAbs2;
            f5 = i7;
        }
        return (int) ((qrj(i2, iM3738p, this.f51015t8r.mo3754q(view)) * f6) + (qrj(i3, iM3738p2, this.f51015t8r.mo3752n(view)) * (f4 / f5)));
    }

    private void ncyb(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (eqxt(pointerId)) {
                float x3 = motionEvent.getX(i2);
                float y3 = motionEvent.getY(i2);
                this.f4335g[pointerId] = x3;
                this.f51007f7l8[pointerId] = y3;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private int m3738p(int i2, int i3, int i4) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        return iAbs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private int qrj(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.f51018zurt.getWidth();
        float f2 = width / 2;
        float fT8r = f2 + (t8r(Math.min(1.0f, Math.abs(i2) / width)) * f2);
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fT8r / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: r */
    private void m3739r() {
        this.f51017x2.computeCurrentVelocity(1000, this.f51014qrj);
        ki(m3740s(this.f51017x2.getXVelocity(this.f51019zy), this.f51012n7h, this.f51014qrj), m3740s(this.f51017x2.getYVelocity(this.f51019zy), this.f51012n7h, this.f51014qrj));
    }

    /* JADX INFO: renamed from: s */
    private float m3740s(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private float t8r(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void x2(int i2) {
        if (this.f4341q == null || !oc(i2)) {
            return;
        }
        this.f4341q[i2] = 0.0f;
        this.f4339n[i2] = 0.0f;
        this.f4335g[i2] = 0.0f;
        this.f51007f7l8[i2] = 0.0f;
        this.f4343y[i2] = 0;
        this.f4342s[i2] = 0;
        this.f4340p[i2] = 0;
        this.f51011ld6 = (~(1 << i2)) & this.f51011ld6;
    }

    private void x9kr(float f2, float f3, int i2) {
        fn3e(i2);
        float[] fArr = this.f4341q;
        this.f4335g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f4339n;
        this.f51007f7l8[i2] = f3;
        fArr2[i2] = f3;
        this.f4343y[i2] = mcp((int) f2, (int) f3);
        this.f51011ld6 |= 1 << i2;
    }

    /* JADX INFO: renamed from: y */
    private boolean m3741y(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f51015t8r.mo3754q(view) > 0;
        boolean z3 = this.f51015t8r.mo3752n(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f51016toq) : z3 && Math.abs(f3) > ((float) this.f51016toq);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.f51016toq;
        return f4 > ((float) (i2 * i2));
    }

    @InterfaceC7833l
    public int a9() {
        return this.f51016toq;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3742c(int i2, int i3) {
        if (this.f51008fn3e) {
            return fu4(i2, i3, (int) this.f51017x2.getXVelocity(this.f51019zy), (int) this.f51017x2.getYVelocity(this.f51019zy));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean d2ok(@dd View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public boolean d3(int i2, int i3) {
        return oc(i3) && (i2 & this.f4343y[i3]) != 0;
    }

    /* JADX INFO: renamed from: f */
    public void m3743f(float f2) {
        this.f51012n7h = f2;
    }

    public boolean f7l8(int i2, int i3) {
        if (!oc(i3)) {
            return false;
        }
        boolean z2 = (i2 & 1) == 1;
        boolean z3 = (i2 & 2) == 2;
        float f2 = this.f4335g[i3] - this.f4341q[i3];
        float f3 = this.f51007f7l8[i3] - this.f4339n[i3];
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f51016toq) : z3 && Math.abs(f3) > ((float) this.f51016toq);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i4 = this.f51016toq;
        return f4 > ((float) (i4 * i4));
    }

    public int fti() {
        return this.f4338k;
    }

    /* JADX INFO: renamed from: g */
    public boolean m3744g(int i2) {
        int length = this.f4341q.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (f7l8(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean gvn7(int i2) {
        int length = this.f4343y.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (d3(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public void hyr(int i2) {
        this.f51006cdj = i2;
    }

    public float jk() {
        return this.f51012n7h;
    }

    public boolean jp0y(int i2, int i3) {
        return d2ok(this.f4337i, i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public void m3745k() {
        zy();
        if (this.f4338k == 2) {
            int currX = this.f51009ki.getCurrX();
            int currY = this.f51009ki.getCurrY();
            this.f51009ki.abortAnimation();
            int currX2 = this.f51009ki.getCurrX();
            int currY2 = this.f51009ki.getCurrY();
            this.f51015t8r.ld6(this.f4337i, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m3746l(0);
    }

    public boolean kja0(boolean z2) {
        if (this.f4338k == 2) {
            boolean zComputeScrollOffset = this.f51009ki.computeScrollOffset();
            int currX = this.f51009ki.getCurrX();
            int currY = this.f51009ki.getCurrY();
            int left = currX - this.f4337i.getLeft();
            int top = currY - this.f4337i.getTop();
            if (left != 0) {
                C0683f.gc3c(this.f4337i, left);
            }
            if (top != 0) {
                C0683f.zkd(this.f4337i, top);
            }
            if (left != 0 || top != 0) {
                this.f51015t8r.ld6(this.f4337i, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f51009ki.getFinalX() && currY == this.f51009ki.getFinalY()) {
                this.f51009ki.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z2) {
                    this.f51018zurt.post(this.f51013ni7);
                } else {
                    m3746l(0);
                }
            }
        }
        return this.f4338k == 2;
    }

    /* JADX INFO: renamed from: l */
    void m3746l(int i2) {
        this.f51018zurt.removeCallbacks(this.f51013ni7);
        if (this.f4338k != i2) {
            this.f4338k = i2;
            this.f51015t8r.mo3753p(i2);
            if (this.f4338k == 0) {
                this.f4337i = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean lrht(@zy.lvui android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C0779q.lrht(android.view.MotionEvent):boolean");
    }

    public void lvui(@lvui MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            zy();
        }
        if (this.f51017x2 == null) {
            this.f51017x2 = VelocityTracker.obtain();
        }
        this.f51017x2.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewZurt = zurt((int) x3, (int) y3);
            x9kr(x3, y3, pointerId);
            vyq(viewZurt, pointerId);
            int i4 = this.f4343y[pointerId];
            int i5 = this.f51006cdj;
            if ((i4 & i5) != 0) {
                this.f51015t8r.mo3756y(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f4338k == 1) {
                m3739r();
            }
            zy();
            return;
        }
        if (actionMasked == 2) {
            if (this.f4338k == 1) {
                if (eqxt(this.f51019zy)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f51019zy);
                    float x4 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f4335g;
                    int i6 = this.f51019zy;
                    int i7 = (int) (x4 - fArr[i6]);
                    int i8 = (int) (y4 - this.f51007f7l8[i6]);
                    m3736i(this.f4337i.getLeft() + i7, this.f4337i.getTop() + i8, i7, i8);
                    ncyb(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (eqxt(pointerId2)) {
                    float x5 = motionEvent.getX(i3);
                    float y5 = motionEvent.getY(i3);
                    float f2 = x5 - this.f4341q[pointerId2];
                    float f3 = y5 - this.f4339n[pointerId2];
                    dd(f2, f3, pointerId2);
                    if (this.f4338k != 1) {
                        View viewZurt2 = zurt((int) x5, (int) y5);
                        if (m3741y(viewZurt2, f2, f3) && vyq(viewZurt2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            ncyb(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f4338k == 1) {
                ki(0.0f, 0.0f);
            }
            zy();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x6 = motionEvent.getX(actionIndex);
            float y6 = motionEvent.getY(actionIndex);
            x9kr(x6, y6, pointerId3);
            if (this.f4338k != 0) {
                if (jp0y((int) x6, (int) y6)) {
                    vyq(this.f4337i, pointerId3);
                    return;
                }
                return;
            } else {
                vyq(zurt((int) x6, (int) y6), pointerId3);
                int i9 = this.f4343y[pointerId3];
                int i10 = this.f51006cdj;
                if ((i9 & i10) != 0) {
                    this.f51015t8r.mo3756y(i9 & i10, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f4338k == 1 && pointerId4 == this.f51019zy) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f51019zy) {
                    View viewZurt3 = zurt((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view = this.f4337i;
                    if (viewZurt3 == view && vyq(view, pointerId5)) {
                        i2 = this.f51019zy;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                m3739r();
            }
        }
        x2(pointerId4);
    }

    public void n5r1(@InterfaceC7833l @a9(from = 0) int i2) {
        this.f51010kja0 = i2;
    }

    public void ni7(int i2, int i3, int i4, int i5) {
        if (!this.f51008fn3e) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f51009ki.fling(this.f4337i.getLeft(), this.f4337i.getTop(), (int) this.f51017x2.getXVelocity(this.f51019zy), (int) this.f51017x2.getYVelocity(this.f51019zy), i2, i4, i3, i5);
        m3746l(2);
    }

    @dd
    public View o1t() {
        return this.f4337i;
    }

    public boolean oc(int i2) {
        return ((1 << i2) & this.f51011ld6) != 0;
    }

    /* JADX INFO: renamed from: q */
    public void m3747q(@lvui View view, int i2) {
        if (view.getParent() == this.f51018zurt) {
            this.f4337i = view;
            this.f51019zy = i2;
            this.f51015t8r.mo3755s(view, i2);
            m3746l(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f51018zurt + ")");
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: t */
    public int m3748t() {
        return this.f51010kja0;
    }

    protected boolean toq(@lvui View view, boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && toq(childAt, true, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && (view.canScrollHorizontally(-i2) || view.canScrollVertically(-i3));
    }

    public boolean uv6(@lvui View view, int i2, int i3) {
        this.f4337i = view;
        this.f51019zy = -1;
        boolean zFu4 = fu4(i2, i3, 0, 0);
        if (!zFu4 && this.f4338k == 0 && this.f4337i != null) {
            this.f4337i = null;
        }
        return zFu4;
    }

    boolean vyq(View view, int i2) {
        if (view == this.f4337i && this.f51019zy == i2) {
            return true;
        }
        if (view == null || !this.f51015t8r.qrj(view, i2)) {
            return false;
        }
        this.f51019zy = i2;
        m3747q(view, i2);
        return true;
    }

    @InterfaceC7833l
    public int wvg() {
        return this.f4336h;
    }

    /* JADX INFO: renamed from: z */
    public int m3749z() {
        return this.f51019zy;
    }

    @dd
    public View zurt(int i2, int i3) {
        for (int childCount = this.f51018zurt.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f51018zurt.getChildAt(this.f51015t8r.zy(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void zy() {
        this.f51019zy = -1;
        ld6();
        VelocityTracker velocityTracker = this.f51017x2;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f51017x2 = null;
        }
    }
}
