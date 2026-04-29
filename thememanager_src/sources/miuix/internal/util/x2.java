package miuix.internal.util;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* JADX INFO: compiled from: ViewDragHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f87773a9 = 8;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f87774d2ok = 600;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f87775d3 = 3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f87776eqxt = 256;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f87777fti = 15;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f87778fu4 = -1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f87779gvn7 = 2;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f87780jk = 4;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f87781jp0y = 1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final Interpolator f87782lvui = new InterpolatorC7171k();

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f87783mcp = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f87784ni7 = "ViewDragHelper";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f87785o1t = 1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f87786oc = 20;

    /* JADX INFO: renamed from: t */
    public static final int f40387t = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f87787wvg = 2;

    /* JADX INFO: renamed from: z */
    public static final int f40388z = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Scroller f87788cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private float[] f87789f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final ViewGroup f87790fn3e;

    /* JADX INFO: renamed from: g */
    private float[] f40389g;

    /* JADX INFO: renamed from: h */
    private int f40390h;

    /* JADX INFO: renamed from: i */
    private boolean f40391i;

    /* JADX INFO: renamed from: k */
    private int f40392k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final zy f87791ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f87792kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f87793ld6;

    /* JADX INFO: renamed from: n */
    private float[] f40393n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f87794n7h;

    /* JADX INFO: renamed from: p */
    private int[] f40394p;

    /* JADX INFO: renamed from: q */
    private float[] f40395q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f87795qrj;

    /* JADX INFO: renamed from: s */
    private int[] f40396s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private View f87796t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f87797toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private VelocityTracker f87798x2;

    /* JADX INFO: renamed from: y */
    private int[] f40397y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f87800zy = -1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final Runnable f87799zurt = new toq();

    /* JADX INFO: renamed from: miuix.internal.util.x2$k */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    class InterpolatorC7171k implements Interpolator {
        InterpolatorC7171k() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: ViewDragHelper.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x2.this.ncyb(0);
        }
    }

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public static abstract class zy {
        public boolean f7l8(int i2) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public void m25991g(int i2, int i3) {
        }

        /* JADX INFO: renamed from: k */
        public int m25992k(View view, int i2, int i3) {
            return 0;
        }

        public void ld6(View view, int i2, int i3, int i4, int i5) {
        }

        /* JADX INFO: renamed from: n */
        public int m25993n(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: p */
        public void m25994p(int i2) {
        }

        /* JADX INFO: renamed from: q */
        public int m25995q(View view) {
            return 0;
        }

        public abstract boolean qrj(View view, int i2);

        /* JADX INFO: renamed from: s */
        public void m25996s(View view, int i2) {
        }

        public int toq(View view, int i2, int i3) {
            return 0;
        }

        public void x2(View view, float f2, float f3) {
        }

        /* JADX INFO: renamed from: y */
        public void m25997y(int i2, int i3) {
        }

        public int zy(int i2) {
            return i2;
        }
    }

    private x2(Context context, ViewGroup viewGroup, zy zyVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (zyVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f87790fn3e = viewGroup;
        this.f87791ki = zyVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f87792kja0 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f87797toq = viewConfiguration.getScaledTouchSlop();
        this.f87795qrj = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f87794n7h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f87788cdj = new Scroller(context, f87782lvui);
    }

    public static x2 cdj(ViewGroup viewGroup, zy zyVar) {
        return new x2(viewGroup.getContext(), viewGroup, zyVar);
    }

    private void dd(float f2, float f3, int i2) {
        fn3e(i2);
        float[] fArr = this.f40395q;
        this.f40389g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f40393n;
        this.f87789f7l8[i2] = f3;
        fArr2[i2] = f3;
        this.f40397y[i2] = m25982t((int) f2, (int) f3);
        this.f87793ld6 |= 1 << i2;
    }

    private void fn3e(int i2) {
        float[] fArr = this.f40395q;
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
                float[] fArr6 = this.f40393n;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f40389g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f87789f7l8;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f40397y;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f40396s;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f40394p;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f40395q = fArr2;
            this.f40393n = fArr3;
            this.f40389g = fArr4;
            this.f87789f7l8 = fArr5;
            this.f40397y = iArr;
            this.f40396s = iArr2;
            this.f40394p = iArr3;
        }
    }

    private boolean fu4(int i2, int i3, int i4, int i5) {
        int left = this.f87796t8r.getLeft();
        int top = this.f87796t8r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f87788cdj.abortAnimation();
            ncyb(0);
            return false;
        }
        this.f87788cdj.startScroll(left, top, i6, i7, n7h(this.f87796t8r, i6, i7, i4, i5));
        ncyb(2);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static x2 m25976h(ViewGroup viewGroup, float f2, zy zyVar) {
        x2 x2VarCdj = cdj(viewGroup, zyVar);
        x2VarCdj.f87797toq = (int) (x2VarCdj.f87797toq * (1.0f / f2));
        return x2VarCdj;
    }

    /* JADX INFO: renamed from: i */
    private void m25977i(int i2, int i3, int i4, int i5) {
        int left = this.f87796t8r.getLeft();
        int top = this.f87796t8r.getTop();
        if (i4 != 0) {
            i2 = this.f87791ki.m25992k(this.f87796t8r, i2, i4);
            this.f87796t8r.offsetLeftAndRight(i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.f87791ki.toq(this.f87796t8r, i3, i5);
            this.f87796t8r.offsetTopAndBottom(i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f87791ki.ld6(this.f87796t8r, i6, i7, i6 - left, i7 - top);
    }

    private void ki(float f2, float f3) {
        this.f40391i = true;
        this.f87791ki.x2(this.f87796t8r, f2, f3);
        this.f40391i = false;
        if (this.f40392k == 1) {
            ncyb(0);
        }
    }

    private void ld6() {
        float[] fArr = this.f40395q;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f40393n, 0.0f);
        Arrays.fill(this.f40389g, 0.0f);
        Arrays.fill(this.f87789f7l8, 0.0f);
        Arrays.fill(this.f40397y, 0);
        Arrays.fill(this.f40396s, 0);
        Arrays.fill(this.f40394p, 0);
        this.f87793ld6 = 0;
    }

    private void lvui() {
        this.f87798x2.computeCurrentVelocity(1000, this.f87795qrj);
        ki(m25981s(this.f87798x2.getXVelocity(this.f87800zy), this.f87794n7h, this.f87795qrj), m25981s(this.f87798x2.getYVelocity(this.f87800zy), this.f87794n7h, this.f87795qrj));
    }

    /* JADX INFO: renamed from: n */
    private boolean m25978n(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f40397y[i2] & i3) != i3 || (this.f40390h & i3) == 0 || (this.f40394p[i2] & i3) == i3 || (this.f40396s[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f87797toq;
        if (fAbs <= i4 && fAbs2 <= i4) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f87791ki.f7l8(i3)) {
            return (this.f40396s[i2] & i3) == 0 && fAbs > ((float) this.f87797toq);
        }
        int[] iArr = this.f40394p;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private int n7h(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int iM25979p = m25979p(i4, (int) this.f87794n7h, (int) this.f87795qrj);
        int iM25979p2 = m25979p(i5, (int) this.f87794n7h, (int) this.f87795qrj);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iM25979p);
        int iAbs4 = Math.abs(iM25979p2);
        int i6 = iAbs3 + iAbs4;
        int i7 = iAbs + iAbs2;
        if (iM25979p != 0) {
            f2 = iAbs3;
            f3 = i6;
        } else {
            f2 = iAbs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (iM25979p2 != 0) {
            f4 = iAbs4;
            f5 = i6;
        } else {
            f4 = iAbs2;
            f5 = i7;
        }
        return (int) ((qrj(i2, iM25979p, this.f87791ki.m25995q(view)) * f6) + (qrj(i3, iM25979p2, this.f87791ki.m25993n(view)) * (f4 / f5)));
    }

    private boolean oc(int i2) {
        if (d3(i2)) {
            return true;
        }
        Log.e(f87784ni7, "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: p */
    private int m25979p(int i2, int i3, int i4) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        return iAbs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private int qrj(int i2, int i3, int i4) {
        int iAbs = 0;
        if (i2 == 0) {
            return 0;
        }
        int width = this.f87790fn3e.getWidth();
        float f2 = width / 2;
        float fT8r = f2 + (t8r(Math.min(1.0f, Math.abs(i2) / width)) * f2);
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fT8r / iAbs2) * 1000.0f) * 4;
        } else if (i4 != 0) {
            iAbs = (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
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
    /* JADX WARN: Type inference failed for: r3v3, types: [miuix.internal.util.x2$zy] */
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
    /* JADX INFO: renamed from: r */
    private void m25980r(float f2, float f3, int i2) {
        boolean zM25978n = m25978n(f2, f3, i2, 1);
        ?? r0 = zM25978n;
        if (m25978n(f3, f2, i2, 4)) {
            r0 = (zM25978n ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (m25978n(f2, f3, i2, 2)) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r03 = r02;
        if (m25978n(f3, f2, i2, 8)) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.f40396s;
            iArr[i2] = iArr[i2] | r03;
            this.f87791ki.m25991g(r03, i2);
        }
    }

    /* JADX INFO: renamed from: s */
    private float m25981s(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    /* JADX INFO: renamed from: t */
    private int m25982t(int i2, int i3) {
        int i4 = i2 < this.f87790fn3e.getLeft() + this.f87792kja0 ? 1 : 0;
        if (i3 < this.f87790fn3e.getTop() + this.f87792kja0) {
            i4 |= 4;
        }
        if (i2 > this.f87790fn3e.getRight() - this.f87792kja0) {
            i4 |= 2;
        }
        return i3 > this.f87790fn3e.getBottom() - this.f87792kja0 ? i4 | 8 : i4;
    }

    private float t8r(float f2) {
        return (float) Math.sin((float) (((double) (f2 - 0.5f)) * 0.4712389167638204d));
    }

    private void x2(int i2) {
        if (this.f40395q == null || !d3(i2)) {
            return;
        }
        this.f40395q[i2] = 0.0f;
        this.f40393n[i2] = 0.0f;
        this.f40389g[i2] = 0.0f;
        this.f87789f7l8[i2] = 0.0f;
        this.f40397y[i2] = 0;
        this.f40396s[i2] = 0;
        this.f40394p[i2] = 0;
        this.f87793ld6 = (~(1 << i2)) & this.f87793ld6;
    }

    private void x9kr(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (oc(pointerId)) {
                float x3 = motionEvent.getX(i2);
                float y3 = motionEvent.getY(i2);
                this.f40389g[pointerId] = x3;
                this.f87789f7l8[pointerId] = y3;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m25983y(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f87791ki.m25995q(view) > 0;
        boolean z3 = this.f87791ki.m25993n(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f3) < ((float) this.f87797toq) && Math.abs(f2) > ((float) this.f87797toq) : z3 && Math.abs(f2) < ((float) this.f87797toq) && Math.abs(f3) > ((float) this.f87797toq);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.f87797toq;
        return f4 > ((float) (i2 * i2));
    }

    public int a9() {
        return this.f40392k;
    }

    /* JADX INFO: renamed from: c */
    public boolean m25984c(View view, int i2, int i3) {
        this.f87796t8r = view;
        this.f87800zy = -1;
        return fu4(i2, i3, 0, 0);
    }

    public void d2ok(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            zy();
        }
        if (this.f87798x2 == null) {
            this.f87798x2 = VelocityTracker.obtain();
        }
        this.f87798x2.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewZurt = zurt((int) x3, (int) y3);
            dd(x3, y3, pointerId);
            lrht(viewZurt, pointerId);
            int i4 = this.f40397y[pointerId];
            int i5 = this.f40390h;
            if ((i4 & i5) != 0) {
                this.f87791ki.m25997y(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f40392k == 1) {
                lvui();
            }
            zy();
            return;
        }
        if (actionMasked == 2) {
            if (this.f40392k == 1) {
                if (oc(this.f87800zy) && (iFindPointerIndex = motionEvent.findPointerIndex(this.f87800zy)) >= 0 && iFindPointerIndex < motionEvent.getPointerCount()) {
                    float x4 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f40389g;
                    int i6 = this.f87800zy;
                    int i7 = (int) (x4 - fArr[i6]);
                    int i8 = (int) (y4 - this.f87789f7l8[i6]);
                    m25977i(this.f87796t8r.getLeft() + i7, this.f87796t8r.getTop() + i8, i7, i8);
                    x9kr(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (oc(pointerId2)) {
                    float x5 = motionEvent.getX(i3);
                    float y5 = motionEvent.getY(i3);
                    float f2 = x5 - this.f40395q[pointerId2];
                    float f3 = y5 - this.f40393n[pointerId2];
                    m25980r(f2, f3, pointerId2);
                    if (this.f40392k != 1) {
                        View viewZurt2 = zurt((int) x5, (int) y5);
                        if (m25983y(viewZurt2, f2, f3) && lrht(viewZurt2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            x9kr(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f40392k == 1) {
                ki(0.0f, 0.0f);
            }
            zy();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x6 = motionEvent.getX(actionIndex);
            float y6 = motionEvent.getY(actionIndex);
            dd(x6, y6, pointerId3);
            if (this.f40392k != 0) {
                if (fti((int) x6, (int) y6)) {
                    lrht(this.f87796t8r, pointerId3);
                    return;
                }
                return;
            } else {
                lrht(zurt((int) x6, (int) y6), pointerId3);
                int i9 = this.f40397y[pointerId3];
                int i10 = this.f40390h;
                if ((i9 & i10) != 0) {
                    this.f87791ki.m25997y(i9 & i10, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f40392k == 1 && pointerId4 == this.f87800zy) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f87800zy) {
                    View viewZurt3 = zurt((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view = this.f87796t8r;
                    if (viewZurt3 == view && lrht(view, pointerId5)) {
                        i2 = this.f87800zy;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                lvui();
            }
        }
        x2(pointerId4);
    }

    public boolean d3(int i2) {
        return ((1 << i2) & this.f87793ld6) != 0;
    }

    public boolean eqxt(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m25985f(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.internal.util.x2.m25985f(android.view.MotionEvent):boolean");
    }

    public boolean f7l8(int i2, int i3) {
        if (!d3(i3)) {
            return false;
        }
        boolean z2 = (i2 & 1) == 1;
        boolean z3 = (i2 & 2) == 2;
        float f2 = this.f40389g[i3] - this.f40395q[i3];
        float f3 = this.f87789f7l8[i3] - this.f40393n[i3];
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f87797toq) : z3 && Math.abs(f3) > ((float) this.f87797toq);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i4 = this.f87797toq;
        return f4 > ((float) (i4 * i4));
    }

    public boolean fti(int i2, int i3) {
        return eqxt(this.f87796t8r, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public boolean m25986g(int i2) {
        int length = this.f40395q.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (f7l8(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean gvn7(int i2, int i3) {
        return d3(i3) && (i2 & this.f40397y[i3]) != 0;
    }

    public boolean hyr(int i2, int i3) {
        if (this.f40391i) {
            return fu4(i2, i3, (int) this.f87798x2.getXVelocity(this.f87800zy), (int) this.f87798x2.getYVelocity(this.f87800zy));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public int jk() {
        return this.f87797toq;
    }

    public boolean jp0y(int i2) {
        int length = this.f40397y.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (gvn7(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m25987k() {
        zy();
        if (this.f40392k == 2) {
            int currX = this.f87788cdj.getCurrX();
            int currY = this.f87788cdj.getCurrY();
            this.f87788cdj.abortAnimation();
            int currX2 = this.f87788cdj.getCurrX();
            int currY2 = this.f87788cdj.getCurrY();
            this.f87791ki.ld6(this.f87796t8r, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        ncyb(0);
    }

    public boolean kja0(boolean z2) {
        if (this.f40392k == 2) {
            boolean zComputeScrollOffset = this.f87788cdj.computeScrollOffset();
            int currX = this.f87788cdj.getCurrX();
            int currY = this.f87788cdj.getCurrY();
            int left = currX - this.f87796t8r.getLeft();
            int top = currY - this.f87796t8r.getTop();
            if (left != 0) {
                this.f87796t8r.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f87796t8r.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f87791ki.ld6(this.f87796t8r, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f87788cdj.getFinalX() && currY == this.f87788cdj.getFinalY()) {
                this.f87788cdj.abortAnimation();
                zComputeScrollOffset = this.f87788cdj.isFinished();
            }
            if (!zComputeScrollOffset) {
                if (z2) {
                    this.f87790fn3e.post(this.f87799zurt);
                } else {
                    ncyb(0);
                }
            }
        }
        return this.f40392k == 2;
    }

    /* JADX INFO: renamed from: l */
    public void m25988l(int i2) {
        this.f40390h = i2;
    }

    boolean lrht(View view, int i2) {
        if (view == this.f87796t8r && this.f87800zy == i2) {
            return true;
        }
        if (view == null || !this.f87791ki.qrj(view, i2)) {
            return false;
        }
        this.f87800zy = i2;
        m25989q(view, i2);
        return true;
    }

    public float mcp() {
        return this.f87794n7h;
    }

    public void n5r1(float f2) {
        this.f87794n7h = f2;
    }

    void ncyb(int i2) {
        if (this.f40392k != i2) {
            this.f40392k = i2;
            this.f87791ki.m25994p(i2);
            if (i2 == 0) {
                this.f87796t8r = null;
            }
        }
    }

    public void ni7(int i2, int i3, int i4, int i5) {
        if (!this.f40391i) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f87788cdj.fling(this.f87796t8r.getLeft(), this.f87796t8r.getTop(), (int) this.f87798x2.getXVelocity(this.f87800zy), (int) this.f87798x2.getYVelocity(this.f87800zy), i2, i4, i3, i5);
        ncyb(2);
    }

    public View o1t() {
        return this.f87796t8r;
    }

    /* JADX INFO: renamed from: q */
    public void m25989q(View view, int i2) {
        if (view.getParent() == this.f87790fn3e) {
            this.f87796t8r = view;
            this.f87800zy = i2;
            this.f87791ki.m25996s(view, i2);
            ncyb(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f87790fn3e + ")");
    }

    protected boolean toq(View view, boolean z2, int i2, int i3, int i4, int i5) {
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

    public int wvg() {
        return this.f87792kja0;
    }

    /* JADX INFO: renamed from: z */
    public int m25990z() {
        return this.f87800zy;
    }

    public View zurt(int i2, int i3) {
        for (int childCount = this.f87790fn3e.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f87790fn3e.getChildAt(this.f87791ki.zy(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void zy() {
        this.f87800zy = -1;
        ld6();
        VelocityTracker velocityTracker = this.f87798x2;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f87798x2 = null;
        }
    }
}
