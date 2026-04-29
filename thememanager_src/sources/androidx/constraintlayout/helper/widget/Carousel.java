package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.t8r;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import java.util.ArrayList;
import java.util.Iterator;
import zy.hyr;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public static final int as = 1;
    public static final int bg = 2;
    private static final String bl = "Carousel";
    private static final boolean in = false;

    /* JADX INFO: renamed from: a */
    private int f2096a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f47996ab;
    int an;

    /* JADX INFO: renamed from: b */
    private boolean f2097b;
    private float bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f47997bo;
    private int bp;
    private int bv;

    /* JADX INFO: renamed from: c */
    private final ArrayList<View> f2098c;

    /* JADX INFO: renamed from: d */
    private int f2099d;

    /* JADX INFO: renamed from: e */
    private int f2100e;

    /* JADX INFO: renamed from: f */
    private toq f2101f;
    Runnable id;

    /* JADX INFO: renamed from: j */
    private int f2102j;

    /* JADX INFO: renamed from: m */
    private int f2103m;

    /* JADX INFO: renamed from: o */
    private MotionLayout f2104o;

    /* JADX INFO: renamed from: u */
    private int f2105u;

    /* JADX INFO: renamed from: v */
    private float f2106v;

    /* JADX INFO: renamed from: w */
    private int f2107w;

    /* JADX INFO: renamed from: x */
    private int f2108x;

    /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$k */
    class RunnableC0347k implements Runnable {

        /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$k$k */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ float f2110k;

            k(final float val$v) {
                this.f2110k = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.f2104o.uc(5, 1.0f, this.f2110k);
            }
        }

        RunnableC0347k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f2104o.setProgress(0.0f);
            Carousel.this.m1362e();
            Carousel.this.f2101f.m1369k(Carousel.this.f2102j);
            float velocity = Carousel.this.f2104o.getVelocity();
            if (Carousel.this.f47996ab != 2 || velocity <= Carousel.this.bb || Carousel.this.f2102j >= Carousel.this.f2101f.count() - 1) {
                return;
            }
            float f2 = velocity * Carousel.this.f2106v;
            if (Carousel.this.f2102j != 0 || Carousel.this.f2100e <= Carousel.this.f2102j) {
                if (Carousel.this.f2102j != Carousel.this.f2101f.count() - 1 || Carousel.this.f2100e >= Carousel.this.f2102j) {
                    Carousel.this.f2104o.post(new k(f2));
                }
            }
        }
    }

    public interface toq {
        int count();

        /* JADX INFO: renamed from: k */
        void m1369k(int index);

        void toq(View view, int index);
    }

    public Carousel(Context context) {
        super(context);
        this.f2101f = null;
        this.f2098c = new ArrayList<>();
        this.f2100e = 0;
        this.f2102j = 0;
        this.f2103m = -1;
        this.f2097b = false;
        this.f2096a = -1;
        this.f2108x = -1;
        this.f2105u = -1;
        this.f47997bo = -1;
        this.f2106v = 0.9f;
        this.f2099d = 0;
        this.f2107w = 4;
        this.f47996ab = 1;
        this.bb = 2.0f;
        this.bp = -1;
        this.bv = 200;
        this.an = -1;
        this.id = new RunnableC0347k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m1362e() {
        toq toqVar = this.f2101f;
        if (toqVar == null || this.f2104o == null || toqVar.count() == 0) {
            return;
        }
        int size = this.f2098c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2098c.get(i2);
            int iCount = (this.f2102j + i2) - this.f2099d;
            if (this.f2097b) {
                if (iCount < 0) {
                    int i3 = this.f2107w;
                    if (i3 != 4) {
                        hb(view, i3);
                    } else {
                        hb(view, 0);
                    }
                    if (iCount % this.f2101f.count() == 0) {
                        this.f2101f.toq(view, 0);
                    } else {
                        toq toqVar2 = this.f2101f;
                        toqVar2.toq(view, toqVar2.count() + (iCount % this.f2101f.count()));
                    }
                } else if (iCount >= this.f2101f.count()) {
                    if (iCount == this.f2101f.count()) {
                        iCount = 0;
                    } else if (iCount > this.f2101f.count()) {
                        iCount %= this.f2101f.count();
                    }
                    int i4 = this.f2107w;
                    if (i4 != 4) {
                        hb(view, i4);
                    } else {
                        hb(view, 0);
                    }
                    this.f2101f.toq(view, iCount);
                } else {
                    hb(view, 0);
                    this.f2101f.toq(view, iCount);
                }
            } else if (iCount < 0) {
                hb(view, this.f2107w);
            } else if (iCount >= this.f2101f.count()) {
                hb(view, this.f2107w);
            } else {
                hb(view, 0);
                this.f2101f.toq(view, iCount);
            }
        }
        int i5 = this.bp;
        if (i5 != -1 && i5 != this.f2102j) {
            this.f2104o.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2171k.lrht();
                }
            });
        } else if (i5 == this.f2102j) {
            this.bp = -1;
        }
        if (this.f2096a == -1 || this.f2108x == -1) {
            Log.w(bl, "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.f2097b) {
            return;
        }
        int iCount2 = this.f2101f.count();
        if (this.f2102j == 0) {
            hyr(this.f2096a, false);
        } else {
            hyr(this.f2096a, true);
            this.f2104o.setTransition(this.f2096a);
        }
        if (this.f2102j == iCount2 - 1) {
            hyr(this.f2108x, false);
        } else {
            hyr(this.f2108x, true);
            this.f2104o.setTransition(this.f2108x);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m1363f(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.cr3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.mla) {
                    this.f2103m = typedArrayObtainStyledAttributes.getResourceId(index, this.f2103m);
                } else if (index == C0394g.qrj.bf5) {
                    this.f2096a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2096a);
                } else if (index == C0394g.qrj.wu) {
                    this.f2108x = typedArrayObtainStyledAttributes.getResourceId(index, this.f2108x);
                } else if (index == C0394g.qrj.l7o) {
                    this.f2107w = typedArrayObtainStyledAttributes.getInt(index, this.f2107w);
                } else if (index == C0394g.qrj.lg4k) {
                    this.f2105u = typedArrayObtainStyledAttributes.getResourceId(index, this.f2105u);
                } else if (index == C0394g.qrj.d6od) {
                    this.f47997bo = typedArrayObtainStyledAttributes.getResourceId(index, this.f47997bo);
                } else if (index == C0394g.qrj.ydj3) {
                    this.f2106v = typedArrayObtainStyledAttributes.getFloat(index, this.f2106v);
                } else if (index == C0394g.qrj.a3dw) {
                    this.f47996ab = typedArrayObtainStyledAttributes.getInt(index, this.f47996ab);
                } else if (index == C0394g.qrj.f26p) {
                    this.bb = typedArrayObtainStyledAttributes.getFloat(index, this.bb);
                } else if (index == C0394g.qrj.y3) {
                    this.f2097b = typedArrayObtainStyledAttributes.getBoolean(index, this.f2097b);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean hb(View view, int visibility) {
        MotionLayout motionLayout = this.f2104o;
        if (motionLayout == null) {
            return false;
        }
        boolean zNn86 = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            zNn86 |= nn86(i2, view, visibility);
        }
        return zNn86;
    }

    private boolean hyr(int transitionID, boolean enable) {
        MotionLayout motionLayout;
        t8r.toq toqVarW831;
        if (transitionID == -1 || (motionLayout = this.f2104o) == null || (toqVarW831 = motionLayout.w831(transitionID)) == null || enable == toqVarW831.eqxt()) {
            return false;
        }
        toqVarW831.ncyb(enable);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lrht() {
        this.f2104o.setTransitionDuration(this.bv);
        if (this.bp < this.f2102j) {
            this.f2104o.pc(this.f2105u, this.bv);
        } else {
            this.f2104o.pc(this.f47997bo, this.bv);
        }
    }

    private void n5r1(boolean enable) {
        Iterator<t8r.toq> it = this.f2104o.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().ncyb(enable);
        }
    }

    private boolean nn86(int constraintSetId, View view, int visibility) {
        C0397q.k kVarI1;
        C0397q c0397qV0af = this.f2104o.v0af(constraintSetId);
        if (c0397qV0af == null || (kVarI1 = c0397qV0af.i1(view.getId())) == null) {
            return false;
        }
        kVarI1.f49834zy.f49861zy = 1;
        view.setVisibility(visibility);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m1366c(int index) {
        this.f2102j = Math.max(0, Math.min(getCount() - 1, index));
        uv6();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.x2
    /* JADX INFO: renamed from: g */
    public void mo1367g(MotionLayout motionLayout, int currentId) {
        int i2 = this.f2102j;
        this.f2100e = i2;
        if (currentId == this.f47997bo) {
            this.f2102j = i2 + 1;
        } else if (currentId == this.f2105u) {
            this.f2102j = i2 - 1;
        }
        if (this.f2097b) {
            if (this.f2102j >= this.f2101f.count()) {
                this.f2102j = 0;
            }
            if (this.f2102j < 0) {
                this.f2102j = this.f2101f.count() - 1;
            }
        } else {
            if (this.f2102j >= this.f2101f.count()) {
                this.f2102j = this.f2101f.count() - 1;
            }
            if (this.f2102j < 0) {
                this.f2102j = 0;
            }
        }
        if (this.f2100e != this.f2102j) {
            this.f2104o.post(this.id);
        }
    }

    public int getCount() {
        toq toqVar = this.f2101f;
        if (toqVar != null) {
            return toqVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f2102j;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.x2
    /* JADX INFO: renamed from: k */
    public void mo1368k(MotionLayout motionLayout, int startId, int endId, float progress) {
        this.an = startId;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @hyr(api = 17)
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i2 = 0; i2 < this.f2604q; i2++) {
                int i3 = this.f2601k[i2];
                View viewDd = motionLayout.dd(i3);
                if (this.f2103m == i3) {
                    this.f2099d = i2;
                }
                this.f2098c.add(viewDd);
            }
            this.f2104o = motionLayout;
            if (this.f47996ab == 2) {
                t8r.toq toqVarW831 = motionLayout.w831(this.f2108x);
                if (toqVarW831 != null) {
                    toqVarW831.m1550f(5);
                }
                t8r.toq toqVarW8312 = this.f2104o.w831(this.f2096a);
                if (toqVarW8312 != null) {
                    toqVarW8312.m1550f(5);
                }
            }
            m1362e();
        }
    }

    public void setAdapter(toq adapter) {
        this.f2101f = adapter;
    }

    public void uv6() {
        int size = this.f2098c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2098c.get(i2);
            if (this.f2101f.count() == 0) {
                hb(view, this.f2107w);
            } else {
                hb(view, 0);
            }
        }
        this.f2104o.cv06();
        m1362e();
    }

    public void vyq(int index, int delay) {
        this.bp = Math.max(0, Math.min(getCount() - 1, index));
        int iMax = Math.max(0, delay);
        this.bv = iMax;
        this.f2104o.setTransitionDuration(iMax);
        if (index < this.f2102j) {
            this.f2104o.pc(this.f2105u, this.bv);
        } else {
            this.f2104o.pc(this.f47997bo, this.bv);
        }
    }

    public Carousel(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2101f = null;
        this.f2098c = new ArrayList<>();
        this.f2100e = 0;
        this.f2102j = 0;
        this.f2103m = -1;
        this.f2097b = false;
        this.f2096a = -1;
        this.f2108x = -1;
        this.f2105u = -1;
        this.f47997bo = -1;
        this.f2106v = 0.9f;
        this.f2099d = 0;
        this.f2107w = 4;
        this.f47996ab = 1;
        this.bb = 2.0f;
        this.bp = -1;
        this.bv = 200;
        this.an = -1;
        this.id = new RunnableC0347k();
        m1363f(context, attrs);
    }

    public Carousel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2101f = null;
        this.f2098c = new ArrayList<>();
        this.f2100e = 0;
        this.f2102j = 0;
        this.f2103m = -1;
        this.f2097b = false;
        this.f2096a = -1;
        this.f2108x = -1;
        this.f2105u = -1;
        this.f47997bo = -1;
        this.f2106v = 0.9f;
        this.f2099d = 0;
        this.f2107w = 4;
        this.f47996ab = 1;
        this.bb = 2.0f;
        this.bp = -1;
        this.bv = 200;
        this.an = -1;
        this.id = new RunnableC0347k();
        m1363f(context, attrs);
    }
}
