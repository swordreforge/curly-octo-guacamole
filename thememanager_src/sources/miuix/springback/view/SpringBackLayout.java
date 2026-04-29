package miuix.springback.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import androidx.core.view.fti;
import androidx.core.view.gvn7;
import androidx.core.view.jk;
import androidx.core.view.oc;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.kja0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.core.util.C7085q;
import qh4d.C7616q;
import qh4d.InterfaceC7613g;
import qh4d.InterfaceC7615n;
import ula6.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class SpringBackLayout extends ViewGroup implements gvn7, jk, qh4d.zy, InterfaceC7615n {
    public static final int ac = 1;
    public static final int ad = 2;
    private static final int aj = 4;
    private static final int am = -1;
    public static final int ax = 2;
    private static final int ay = -1;
    public static final int az = 0;
    public static final int ba = 1;
    private static final int be = 2000;
    private static final String bg = "SpringBackLayout";
    public static final int bq = 4;

    /* JADX INFO: renamed from: a */
    private float f41858a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected int f90393ab;
    private boolean an;
    private int as;

    /* JADX INFO: renamed from: b */
    private float f41859b;
    protected int bb;
    private InterfaceC7358k bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f90394bo;
    private float bp;
    private float bv;

    /* JADX INFO: renamed from: c */
    private final int[] f41860c;

    /* JADX INFO: renamed from: d */
    private zy f41861d;

    /* JADX INFO: renamed from: e */
    private int f41862e;

    /* JADX INFO: renamed from: f */
    private final int[] f41863f;

    /* JADX INFO: renamed from: g */
    private float f41864g;

    /* JADX INFO: renamed from: h */
    private boolean f41865h;

    /* JADX INFO: renamed from: i */
    private int f41866i;
    private boolean id;
    private List<InterfaceC7613g> in;

    /* JADX INFO: renamed from: j */
    private boolean f41867j;

    /* JADX INFO: renamed from: k */
    private View f41868k;

    /* JADX INFO: renamed from: l */
    private final int[] f41869l;

    /* JADX INFO: renamed from: m */
    private float f41870m;

    /* JADX INFO: renamed from: n */
    private int f41871n;

    /* JADX INFO: renamed from: o */
    private boolean f41872o;

    /* JADX INFO: renamed from: p */
    private float f41873p;

    /* JADX INFO: renamed from: q */
    private int f41874q;

    /* JADX INFO: renamed from: r */
    private final fti f41875r;

    /* JADX INFO: renamed from: s */
    private float f41876s;

    /* JADX INFO: renamed from: t */
    private final oc f41877t;

    /* JADX INFO: renamed from: u */
    private int f41878u;

    /* JADX INFO: renamed from: v */
    private int f41879v;

    /* JADX INFO: renamed from: w */
    private C7359k f41880w;

    /* JADX INFO: renamed from: x */
    private int f41881x;

    /* JADX INFO: renamed from: y */
    private float f41882y;

    /* JADX INFO: renamed from: z */
    private int f41883z;

    /* JADX INFO: renamed from: miuix.springback.view.SpringBackLayout$k */
    public interface InterfaceC7358k {
        /* JADX INFO: renamed from: k */
        boolean mo26719k();
    }

    public SpringBackLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a9(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.springback.view.SpringBackLayout.a9(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d2ok(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.springback.view.SpringBackLayout.d2ok(android.view.MotionEvent):boolean");
    }

    private boolean d3(MotionEvent motionEvent, int i2, int i3) {
        float fSignum;
        float fMcp;
        int actionIndex;
        if (i2 == 0) {
            this.f41866i = motionEvent.getPointerId(0);
            m26721g(i3);
        } else {
            if (i2 == 1) {
                if (motionEvent.findPointerIndex(this.f41866i) < 0) {
                    Log.e(bg, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f41865h) {
                    this.f41865h = false;
                    ncyb(i3);
                }
                this.f41866i = -1;
                return false;
            }
            if (i2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f41866i);
                if (iFindPointerIndex < 0) {
                    Log.e(bg, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                if (this.f41865h) {
                    if (i3 == 2) {
                        float y3 = motionEvent.getY(iFindPointerIndex);
                        fSignum = Math.signum(y3 - this.f41882y);
                        fMcp = mcp(y3 - this.f41882y, i3);
                    } else {
                        float x3 = motionEvent.getX(iFindPointerIndex);
                        fSignum = Math.signum(x3 - this.f41873p);
                        fMcp = mcp(x3 - this.f41873p, i3);
                    }
                    m26730r(true);
                    o1t(fSignum * fMcp, i3);
                }
            } else {
                if (i2 == 3) {
                    return false;
                }
                if (i2 == 5) {
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f41866i);
                    if (iFindPointerIndex2 < 0) {
                        Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                        return false;
                    }
                    if (i3 == 2) {
                        float y4 = motionEvent.getY(iFindPointerIndex2) - this.f41864g;
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        float y5 = motionEvent.getY(actionIndex) - y4;
                        this.f41864g = y5;
                        this.f41882y = y5;
                    } else {
                        float x4 = motionEvent.getX(iFindPointerIndex2) - this.f41876s;
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        float x5 = motionEvent.getX(actionIndex) - x4;
                        this.f41876s = x5;
                        this.f41873p = x5;
                    }
                    this.f41866i = motionEvent.getPointerId(actionIndex);
                } else if (i2 == 6) {
                    eqxt(motionEvent);
                }
            }
        }
        return true;
    }

    private void eqxt(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f41866i) {
            this.f41866i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m26720f() {
        return (this.f41879v & 1) != 0;
    }

    private void f7l8(int i2) {
        if (!(getScrollY() != 0)) {
            this.f41865h = false;
            return;
        }
        this.f41865h = true;
        float fJk = jk(Math.abs(getScrollY()), Math.abs(m26731t(i2)), 2);
        if (getScrollY() < 0) {
            this.f41864g -= fJk;
        } else {
            this.f41864g += fJk;
        }
        this.f41882y = this.f41864g;
    }

    private boolean fn3e(int i2) {
        if (i2 != 2) {
            return !this.f41868k.canScrollHorizontally(-1);
        }
        return this.f41868k instanceof ListView ? !kja0.m3656k((ListView) r3, -1) : !r3.canScrollVertically(-1);
    }

    private boolean fti(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return (fn3e(1) || m26722i(1)) ? m26722i(1) ? oc(motionEvent, actionMasked, 1) : gvn7(motionEvent, actionMasked, 1) : d3(motionEvent, actionMasked, 1);
    }

    /* JADX INFO: renamed from: g */
    private void m26721g(int i2) {
        if (i2 == 2) {
            f7l8(i2);
        } else {
            m26725q(i2);
        }
    }

    private boolean gvn7(MotionEvent motionEvent, int i2, int i3) {
        float fSignum;
        float fMcp;
        int actionIndex;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f41866i);
                    if (iFindPointerIndex < 0) {
                        Log.e(bg, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    if (this.f41865h) {
                        if (i3 == 2) {
                            float y3 = motionEvent.getY(iFindPointerIndex);
                            fSignum = Math.signum(y3 - this.f41882y);
                            fMcp = mcp(y3 - this.f41882y, i3);
                        } else {
                            float x3 = motionEvent.getX(iFindPointerIndex);
                            fSignum = Math.signum(x3 - this.f41873p);
                            fMcp = mcp(x3 - this.f41873p, i3);
                        }
                        float f2 = fSignum * fMcp;
                        if (f2 <= 0.0f) {
                            o1t(0.0f, i3);
                            return false;
                        }
                        m26730r(true);
                        o1t(f2, i3);
                    }
                } else if (i2 != 3) {
                    if (i2 == 5) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f41866i);
                        if (iFindPointerIndex2 < 0) {
                            Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                            return false;
                        }
                        if (i3 == 2) {
                            float y4 = motionEvent.getY(iFindPointerIndex2) - this.f41864g;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float y5 = motionEvent.getY(actionIndex) - y4;
                            this.f41864g = y5;
                            this.f41882y = y5;
                        } else {
                            float x4 = motionEvent.getX(iFindPointerIndex2) - this.f41876s;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float x5 = motionEvent.getX(actionIndex) - x4;
                            this.f41876s = x5;
                            this.f41873p = x5;
                        }
                        this.f41866i = motionEvent.getPointerId(actionIndex);
                    } else if (i2 == 6) {
                        eqxt(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f41866i) < 0) {
                Log.e(bg, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f41865h) {
                this.f41865h = false;
                ncyb(i3);
            }
            this.f41866i = -1;
            return false;
        }
        this.f41866i = motionEvent.getPointerId(0);
        m26721g(i3);
        return true;
    }

    private boolean hyr() {
        return (this.f41879v & 2) != 0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m26722i(int i2) {
        if (i2 != 2) {
            return !this.f41868k.canScrollHorizontally(1);
        }
        return this.f41868k instanceof ListView ? !kja0.m3656k((ListView) r3, 1) : !r3.canScrollVertically(1);
    }

    private void jp0y(int i2, @lvui int[] iArr, int i3) {
        boolean z2 = this.f41881x == 2;
        int i4 = z2 ? 2 : 1;
        int iAbs = Math.abs(z2 ? getScrollY() : getScrollX());
        float f2 = 0.0f;
        if (i3 == 0) {
            if (i2 > 0) {
                float f3 = this.f41859b;
                if (f3 > 0.0f) {
                    float f4 = i2;
                    if (f4 > f3) {
                        m26727y((int) f3, iArr, i4);
                        this.f41859b = 0.0f;
                    } else {
                        this.f41859b = f3 - f4;
                        m26727y(i2, iArr, i4);
                    }
                    m26724p(1);
                    o1t(mcp(this.f41859b, i4), i4);
                    return;
                }
            }
            if (i2 < 0) {
                float f5 = this.f41858a;
                if ((-f5) < 0.0f) {
                    float f6 = i2;
                    if (f6 < (-f5)) {
                        m26727y((int) f5, iArr, i4);
                        this.f41858a = 0.0f;
                    } else {
                        this.f41858a = f5 + f6;
                        m26727y(i2, iArr, i4);
                    }
                    m26724p(1);
                    o1t(-mcp(this.f41858a, i4), i4);
                    return;
                }
                return;
            }
            return;
        }
        float f7 = i4 == 2 ? this.bv : this.bp;
        if (i2 > 0) {
            float f8 = this.f41859b;
            if (f8 > 0.0f) {
                if (f7 <= 2000.0f) {
                    if (!this.an) {
                        this.an = true;
                        x9kr(f7, i4, false);
                    }
                    if (this.f41861d.m26735k()) {
                        scrollTo(this.f41861d.zy(), this.f41861d.m26737q());
                        this.f41859b = jk(iAbs, Math.abs(m26731t(i4)), i4);
                    } else {
                        this.f41859b = 0.0f;
                    }
                    m26727y(i2, iArr, i4);
                    return;
                }
                float fMcp = mcp(f8, i4);
                float f9 = i2;
                if (f9 > fMcp) {
                    m26727y((int) fMcp, iArr, i4);
                    this.f41859b = 0.0f;
                } else {
                    m26727y(i2, iArr, i4);
                    f2 = fMcp - f9;
                    this.f41859b = jk(f2, Math.signum(f2) * Math.abs(m26731t(i4)), i4);
                }
                o1t(f2, i4);
                m26724p(1);
                return;
            }
        }
        if (i2 < 0) {
            float f10 = this.f41858a;
            if ((-f10) < 0.0f) {
                if (f7 >= -2000.0f) {
                    if (!this.an) {
                        this.an = true;
                        x9kr(f7, i4, false);
                    }
                    if (this.f41861d.m26735k()) {
                        scrollTo(this.f41861d.zy(), this.f41861d.m26737q());
                        this.f41858a = jk(iAbs, Math.abs(m26731t(i4)), i4);
                    } else {
                        this.f41858a = 0.0f;
                    }
                    m26727y(i2, iArr, i4);
                    return;
                }
                float fMcp2 = mcp(f10, i4);
                float f11 = i2;
                if (f11 < (-fMcp2)) {
                    m26727y((int) fMcp2, iArr, i4);
                    this.f41858a = 0.0f;
                } else {
                    m26727y(i2, iArr, i4);
                    f2 = fMcp2 + f11;
                    this.f41858a = jk(f2, Math.signum(f2) * Math.abs(m26731t(i4)), i4);
                }
                m26724p(1);
                o1t(-f2, i4);
                return;
            }
        }
        if (i2 != 0) {
            if ((this.f41858a == 0.0f || this.f41859b == 0.0f) && this.an && getScrollY() == 0) {
                m26727y(i2, iArr, i4);
            }
        }
    }

    private boolean ki() {
        return !this.f41868k.canScrollHorizontally(-1);
    }

    private boolean lvui(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return (fn3e(2) || m26722i(2)) ? m26722i(2) ? oc(motionEvent, actionMasked, 2) : gvn7(motionEvent, actionMasked, 2) : d3(motionEvent, actionMasked, 2);
    }

    /* JADX INFO: renamed from: n */
    private void m26723n(MotionEvent motionEvent) {
        int i2;
        this.f41880w.m26732k(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C7359k c7359k = this.f41880w;
            this.f41864g = c7359k.f90396toq;
            this.f41876s = c7359k.f90397zy;
            this.f41866i = c7359k.f41888q;
            if (getScrollY() != 0) {
                this.f41878u = 2;
                m26730r(true);
            } else if (getScrollX() != 0) {
                this.f41878u = 1;
                m26730r(true);
            } else {
                this.f41878u = 0;
            }
            if ((this.f90394bo & 2) != 0) {
                m26721g(2);
                return;
            } else {
                m26721g(1);
                return;
            }
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f41878u != 0 || (i2 = this.f41880w.f41887n) == 0) {
                    return;
                }
                this.f41878u = i2;
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                eqxt(motionEvent);
                return;
            }
        }
        m26726s(false);
        if ((this.f90394bo & 2) != 0) {
            ncyb(2);
        } else {
            ncyb(1);
        }
    }

    private void n5r1(int i2) {
        this.f41867j = false;
        if (!this.an) {
            ncyb(i2);
            return;
        }
        if (this.f41861d.m26734g()) {
            x9kr(i2 == 2 ? this.bv : this.bp, i2, false);
        }
        postInvalidateOnAnimation();
    }

    private void ncyb(int i2) {
        x9kr(0.0f, i2, true);
    }

    private void o1t(float f2, int i2) {
        if (i2 == 2) {
            scrollTo(0, (int) (-f2));
        } else {
            scrollTo((int) (-f2), 0);
        }
    }

    private boolean oc(MotionEvent motionEvent, int i2, int i3) {
        float fSignum;
        float fMcp;
        int actionIndex;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f41866i);
                    if (iFindPointerIndex < 0) {
                        Log.e(bg, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    if (this.f41865h) {
                        if (i3 == 2) {
                            float y3 = motionEvent.getY(iFindPointerIndex);
                            fSignum = Math.signum(this.f41882y - y3);
                            fMcp = mcp(this.f41882y - y3, i3);
                        } else {
                            float x3 = motionEvent.getX(iFindPointerIndex);
                            fSignum = Math.signum(this.f41873p - x3);
                            fMcp = mcp(this.f41873p - x3, i3);
                        }
                        float f2 = fSignum * fMcp;
                        if (f2 <= 0.0f) {
                            o1t(0.0f, i3);
                            return false;
                        }
                        m26730r(true);
                        o1t(-f2, i3);
                    }
                } else if (i2 != 3) {
                    if (i2 == 5) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f41866i);
                        if (iFindPointerIndex2 < 0) {
                            Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                            return false;
                        }
                        if (i3 == 2) {
                            float y4 = motionEvent.getY(iFindPointerIndex2) - this.f41864g;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float y5 = motionEvent.getY(actionIndex) - y4;
                            this.f41864g = y5;
                            this.f41882y = y5;
                        } else {
                            float x4 = motionEvent.getX(iFindPointerIndex2) - this.f41876s;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e(bg, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float x5 = motionEvent.getX(actionIndex) - x4;
                            this.f41876s = x5;
                            this.f41873p = x5;
                        }
                        this.f41866i = motionEvent.getPointerId(actionIndex);
                    } else if (i2 == 6) {
                        eqxt(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f41866i) < 0) {
                Log.e(bg, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f41865h) {
                this.f41865h = false;
                ncyb(i3);
            }
            this.f41866i = -1;
            return false;
        }
        this.f41866i = motionEvent.getPointerId(0);
        m26721g(i3);
        return true;
    }

    /* JADX INFO: renamed from: p */
    private void m26724p(int i2) {
        int i3 = this.as;
        if (i3 != i2) {
            this.as = i2;
            Iterator<InterfaceC7613g> it = this.in.iterator();
            while (it.hasNext()) {
                it.next().mo26156k(i3, i2, this.f41861d.m26734g());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m26725q(int i2) {
        if (!(getScrollX() != 0)) {
            this.f41865h = false;
            return;
        }
        this.f41865h = true;
        float fJk = jk(Math.abs(getScrollX()), Math.abs(m26731t(i2)), 2);
        if (getScrollX() < 0) {
            this.f41876s -= fJk;
        } else {
            this.f41876s += fJk;
        }
        this.f41873p = this.f41876s;
    }

    /* JADX INFO: renamed from: s */
    private void m26726s(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean t8r(int i2) {
        return this.f41878u == i2;
    }

    private void x2() {
        if (this.f41868k == null) {
            int i2 = this.f41874q;
            if (i2 == -1) {
                throw new IllegalArgumentException("invalid target Id");
            }
            this.f41868k = findViewById(i2);
        }
        if (this.f41868k == null) {
            throw new IllegalArgumentException("fail to get target");
        }
        if (isEnabled()) {
            View view = this.f41868k;
            if ((view instanceof jk) && !view.isNestedScrollingEnabled()) {
                this.f41868k.setNestedScrollingEnabled(true);
            }
        }
        if (this.f41868k.getOverScrollMode() != 2) {
            this.f41868k.setOverScrollMode(2);
        }
    }

    private void x9kr(float f2, int i2, boolean z2) {
        InterfaceC7358k interfaceC7358k = this.bl;
        if (interfaceC7358k == null || !interfaceC7358k.mo26719k()) {
            this.f41861d.toq();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            this.f41861d.f7l8(scrollX, 0.0f, scrollY, 0.0f, f2, i2, false);
            if (scrollX == 0 && scrollY == 0 && f2 == 0.0f) {
                m26724p(0);
            } else {
                m26724p(2);
            }
            if (z2) {
                postInvalidateOnAnimation();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m26727y(int i2, @lvui int[] iArr, int i3) {
        if (i3 == 2) {
            iArr[1] = i2;
        } else {
            iArr[0] = i2;
        }
    }

    private boolean zurt() {
        return this.f41868k instanceof ListView ? !kja0.m3656k((ListView) r0, -1) : !r0.canScrollVertically(-1);
    }

    public void cdj(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f41861d.m26735k()) {
            scrollTo(this.f41861d.zy(), this.f41861d.m26737q());
            if (!this.f41861d.m26734g()) {
                postInvalidateOnAnimation();
                return;
            }
            if (getScrollX() != 0 || getScrollY() != 0) {
                if (this.as != 2) {
                    Log.d(bg, "Scroll stop but state is not correct.");
                    ncyb(this.f41881x == 2 ? 2 : 1);
                    return;
                }
            }
            m26724p(0);
        }
    }

    public void dd(int i2, int i3) {
        if (i2 - getScrollX() == 0 && i3 - getScrollY() == 0) {
            return;
        }
        this.f41861d.toq();
        this.f41861d.f7l8(getScrollX(), i2, getScrollY(), i3, 0.0f, 2, true);
        m26724p(2);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f41875r.mo3266k(f2, f3, z2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f41875r.toq(f2, f3);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int i2, int i3, @dd int[] iArr, @dd int[] iArr2, int i4) {
        return this.f41875r.mo3268q(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.jk
    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @lvui int[] iArr2) {
        this.f41875r.mo3267n(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.as == 2 && this.f41880w.toq(motionEvent)) {
            m26724p(1);
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && this.as != 2) {
            m26724p(0);
        }
        return zDispatchTouchEvent;
    }

    @Override // androidx.core.view.jp0y
    public void fu4(@lvui View view, int i2, int i3, int i4, int i5, int i6) {
        ni7(view, i2, i3, i4, i5, i6, this.f41860c);
    }

    public int getSpringBackMode() {
        return this.f41879v;
    }

    public View getTarget() {
        return this.f41868k;
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(@lvui View view, int i2, int i3, @lvui int[] iArr, int i4) {
        if (this.id) {
            if (this.f41881x == 2) {
                jp0y(i3, iArr, i4);
            } else {
                jp0y(i2, iArr, i4);
            }
        }
        int[] iArr2 = this.f41869l;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null, i4)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // androidx.core.view.mcp
    public boolean hasNestedScrollingParent(int i2) {
        return this.f41875r.x2(i2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return this.f41875r.qrj();
    }

    protected float jk(float f2, float f3, int i2) {
        int iQrj = qrj(i2);
        if (Math.abs(f2) >= Math.abs(f3)) {
            f2 = f3;
        }
        double d2 = iQrj;
        return (float) (d2 - (Math.pow(d2, 0.6666666666666666d) * Math.pow(iQrj - (f2 * 3.0f), 0.3333333333333333d)));
    }

    @Override // qh4d.InterfaceC7615n
    /* JADX INFO: renamed from: k */
    public void mo26728k(InterfaceC7613g interfaceC7613g) {
        this.in.add(interfaceC7613g);
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@lvui View view, int i2) {
        this.f41877t.m3398n(view, i2);
        stopNestedScroll(i2);
        if (this.id) {
            boolean z2 = this.f41881x == 2;
            int i3 = z2 ? 2 : 1;
            if (!this.f41872o) {
                if (this.f41867j) {
                    n5r1(i3);
                    return;
                }
                return;
            }
            this.f41872o = false;
            float scrollY = z2 ? getScrollY() : getScrollX();
            if (!this.f41867j && scrollY != 0.0f) {
                ncyb(i3);
            } else if (scrollY != 0.0f) {
                n5r1(i3);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m26729l() {
        return this.id;
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@lvui View view, @lvui View view2, int i2, int i3) {
        if (this.id) {
            boolean z2 = this.f41881x == 2;
            int i4 = z2 ? 2 : 1;
            float scrollY = z2 ? getScrollY() : getScrollX();
            if (i3 != 0) {
                if (scrollY == 0.0f) {
                    this.f41870m = 0.0f;
                } else {
                    this.f41870m = jk(Math.abs(scrollY), Math.abs(m26731t(i4)), i4);
                }
                this.f41867j = true;
                this.f41883z = 0;
            } else {
                if (scrollY == 0.0f) {
                    this.f41859b = 0.0f;
                    this.f41858a = 0.0f;
                } else if (scrollY < 0.0f) {
                    this.f41859b = jk(Math.abs(scrollY), Math.abs(m26731t(i4)), i4);
                    this.f41858a = 0.0f;
                } else {
                    this.f41859b = 0.0f;
                    this.f41858a = jk(Math.abs(scrollY), Math.abs(m26731t(i4)), i4);
                }
                this.f41872o = true;
            }
            this.bv = 0.0f;
            this.bp = 0.0f;
            this.an = false;
            this.f41861d.toq();
        }
        onNestedScrollAccepted(view, view2, i2);
    }

    protected float mcp(float f2, int i2) {
        int iQrj = qrj(i2);
        return wvg(Math.min(Math.abs(f2) / iQrj, 1.0f), iQrj);
    }

    public boolean n7h() {
        return this.bl != null;
    }

    @Override // androidx.core.view.gvn7
    public void ni7(@lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
        boolean z2 = this.f41881x == 2;
        int i7 = z2 ? i3 : i2;
        int i8 = z2 ? iArr[1] : iArr[0];
        dispatchNestedScroll(i2, i3, i4, i5, this.f41863f, i6, iArr);
        if (this.id) {
            int i9 = (z2 ? iArr[1] : iArr[0]) - i8;
            int i10 = z2 ? i5 - i9 : i4 - i9;
            int i11 = i10 != 0 ? i10 : 0;
            int i12 = z2 ? 2 : 1;
            if (i11 < 0 && fn3e(i12) && m26720f()) {
                if (i6 == 0) {
                    if (this.f41861d.m26734g()) {
                        this.f41859b += Math.abs(i11);
                        m26724p(1);
                        o1t(mcp(this.f41859b, i12), i12);
                        iArr[1] = iArr[1] + i10;
                        return;
                    }
                    return;
                }
                float fM26731t = m26731t(i12);
                if (this.bv != 0.0f || this.bp != 0.0f) {
                    this.an = true;
                    if (i7 != 0 && (-i11) <= fM26731t) {
                        this.f41861d.m26738y(i11);
                    }
                    m26724p(2);
                    return;
                }
                if (this.f41859b != 0.0f) {
                    return;
                }
                float f2 = fM26731t - this.f41870m;
                if (this.f41883z < 4) {
                    if (f2 <= Math.abs(i11)) {
                        this.f41870m += f2;
                        iArr[1] = (int) (iArr[1] + f2);
                    } else {
                        this.f41870m += Math.abs(i11);
                        iArr[1] = iArr[1] + i10;
                    }
                    m26724p(2);
                    o1t(mcp(this.f41870m, i12), i12);
                    this.f41883z++;
                    return;
                }
                return;
            }
            if (i11 > 0 && m26722i(i12) && hyr()) {
                if (i6 == 0) {
                    if (this.f41861d.m26734g()) {
                        this.f41858a += Math.abs(i11);
                        m26724p(1);
                        o1t(-mcp(this.f41858a, i12), i12);
                        iArr[1] = iArr[1] + i10;
                        return;
                    }
                    return;
                }
                float fM26731t2 = m26731t(i12);
                if (this.bv != 0.0f || this.bp != 0.0f) {
                    this.an = true;
                    if (i7 != 0 && i11 <= fM26731t2) {
                        this.f41861d.m26738y(i11);
                    }
                    m26724p(2);
                    return;
                }
                if (this.f41858a != 0.0f) {
                    return;
                }
                float f3 = fM26731t2 - this.f41870m;
                if (this.f41883z < 4) {
                    if (f3 <= Math.abs(i11)) {
                        this.f41870m += f3;
                        iArr[1] = (int) (iArr[1] + f3);
                    } else {
                        this.f41870m += Math.abs(i11);
                        iArr[1] = iArr[1] + i10;
                    }
                    m26724p(2);
                    o1t(-mcp(this.f41870m, i12), i12);
                    this.f41883z++;
                }
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Point pointM25600g = C7085q.m25600g(getContext());
        this.f90393ab = pointM25600g.x;
        this.bb = pointM25600g.y;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f41862e = getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.id || !isEnabled() || this.f41867j || this.f41872o || this.f41868k.isNestedScrollingEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f41861d.m26734g() && actionMasked == 0) {
            this.f41861d.toq();
        }
        if (!m26720f() && !hyr()) {
            return false;
        }
        int i2 = this.f90394bo;
        if ((i2 & 4) != 0) {
            m26723n(motionEvent);
            if (t8r(2) && (this.f90394bo & 1) != 0 && getScrollX() == 0.0f) {
                return false;
            }
            if (t8r(1) && (this.f90394bo & 2) != 0 && getScrollY() == 0.0f) {
                return false;
            }
            if (t8r(2) || t8r(1)) {
                m26726s(true);
            }
        } else {
            this.f41878u = i2;
        }
        if (t8r(2)) {
            return d2ok(motionEvent);
        }
        if (t8r(1)) {
            return a9(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f41868k.getVisibility() != 8) {
            int measuredWidth = this.f41868k.getMeasuredWidth();
            int measuredHeight = this.f41868k.getMeasuredHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f41868k.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        x2();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        measureChild(this.f41868k, i2, i3);
        setMeasuredDimension(mode == 0 ? this.f41868k.getMeasuredWidth() + getPaddingLeft() + getPaddingRight() : mode == 1073741824 ? View.MeasureSpec.getSize(i2) : Math.min(View.MeasureSpec.getSize(i2), this.f41868k.getMeasuredWidth() + getPaddingLeft() + getPaddingRight()), mode2 == 0 ? this.f41868k.getMeasuredHeight() + getPaddingTop() + getPaddingBottom() : mode2 == 1073741824 ? View.MeasureSpec.getSize(i3) : Math.min(View.MeasureSpec.getSize(i3), this.f41868k.getMeasuredHeight() + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        ni7(view, i2, i3, i4, i5, 0, this.f41860c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f41877t.toq(view, view2, i2);
        startNestedScroll(i2 & 2);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        Iterator<InterfaceC7613g> it = this.in.iterator();
        while (it.hasNext()) {
            it.next().onScrollChange(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || this.f41867j || this.f41872o || this.f41868k.isNestedScrollingEnabled()) {
            return false;
        }
        if (!this.f41861d.m26734g() && actionMasked == 0) {
            this.f41861d.toq();
        }
        if (t8r(2)) {
            return lvui(motionEvent);
        }
        if (t8r(1)) {
            return fti(motionEvent);
        }
        return false;
    }

    protected int qrj(int i2) {
        return i2 == 2 ? this.bb : this.f90393ab;
    }

    /* JADX INFO: renamed from: r */
    public void m26730r(boolean z2) {
        ViewParent parent = getParent();
        parent.requestDisallowInterceptTouchEvent(z2);
        while (parent != null) {
            if (parent instanceof SpringBackLayout) {
                ((SpringBackLayout) parent).cdj(z2);
            }
            parent = parent.getParent();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (isEnabled() && this.id) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        View view = this.f41868k;
        if (view == null || !(view instanceof jk) || z2 == view.isNestedScrollingEnabled()) {
            return;
        }
        this.f41868k.setNestedScrollingEnabled(z2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean z2) {
        this.f41875r.mo3264h(z2);
    }

    public void setOnSpringListener(InterfaceC7358k interfaceC7358k) {
        this.bl = interfaceC7358k;
    }

    public void setScrollOrientation(int i2) {
        this.f90394bo = i2;
        this.f41880w.f41885g = i2;
    }

    public void setSpringBackEnable(boolean z2) {
        this.id = z2;
    }

    public void setSpringBackMode(int i2) {
        this.f41879v = i2;
    }

    public void setTarget(@lvui View view) {
        this.f41868k = view;
        if (!(view instanceof jk) || view.isNestedScrollingEnabled()) {
            return;
        }
        this.f41868k.setNestedScrollingEnabled(true);
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int i2, int i3) {
        return this.f41875r.t8r(i2, i3);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void stopNestedScroll() {
        this.f41875r.mo3265i();
    }

    /* JADX INFO: renamed from: t */
    protected float m26731t(int i2) {
        return wvg(1.0f, qrj(i2));
    }

    @Override // qh4d.InterfaceC7615n
    public void toq(InterfaceC7613g interfaceC7613g) {
        this.in.remove(interfaceC7613g);
    }

    protected float wvg(float f2, int i2) {
        double dMin = Math.min(f2, 1.0f);
        return ((float) (((Math.pow(dMin, 3.0d) / 3.0d) - Math.pow(dMin, 2.0d)) + dMin)) * i2;
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@lvui View view, @lvui View view2, int i2, int i3) {
        this.f41881x = i2;
        boolean z2 = i2 == 2;
        if (((z2 ? 2 : 1) & this.f90394bo) == 0) {
            return false;
        }
        if (this.id) {
            if (!onStartNestedScroll(view, view, i2)) {
                return false;
            }
            float scrollY = z2 ? getScrollY() : getScrollX();
            if (i3 != 0 && scrollY != 0.0f && (this.f41868k instanceof NestedScrollView)) {
                return false;
            }
        }
        this.f41875r.t8r(i2, i3);
        return true;
    }

    @Override // qh4d.zy
    public boolean zy(float f2, float f3) {
        this.bp = f2;
        this.bv = f3;
        return true;
    }

    public SpringBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41866i = -1;
        this.f41883z = 0;
        this.f41869l = new int[2];
        this.f41863f = new int[2];
        this.f41860c = new int[2];
        this.id = true;
        this.in = new ArrayList();
        this.as = 0;
        this.f41877t = new oc(this);
        this.f41875r = C7616q.zurt(this);
        this.f41871n = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C7695p.f44493d);
        this.f41874q = typedArrayObtainStyledAttributes.getResourceId(toq.C7695p.f95167vq, -1);
        this.f90394bo = typedArrayObtainStyledAttributes.getInt(toq.C7695p.f95152mu, 2);
        this.f41879v = typedArrayObtainStyledAttributes.getInt(toq.C7695p.f95161qkj8, 3);
        typedArrayObtainStyledAttributes.recycle();
        this.f41861d = new zy();
        this.f41880w = new C7359k(this, this.f90394bo);
        setNestedScrollingEnabled(true);
        Point pointM25600g = C7085q.m25600g(context);
        this.f90393ab = pointM25600g.x;
        this.bb = pointM25600g.y;
        if (miuix.os.toq.f40717k) {
            this.id = false;
        }
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f41875r.zy(i2, i3, iArr, iArr2);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6) {
        return this.f41875r.f7l8(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean startNestedScroll(int i2) {
        return this.f41875r.ki(i2);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int i2) {
        this.f41875r.fn3e(i2);
    }
}
