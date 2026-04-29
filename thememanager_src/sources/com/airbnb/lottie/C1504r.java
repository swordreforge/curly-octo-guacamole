package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.animation.C1418k;
import com.airbnb.lottie.manager.C1441k;
import com.airbnb.lottie.model.C1471n;
import com.airbnb.lottie.model.C1475y;
import com.airbnb.lottie.utils.C1510q;
import com.airbnb.lottie.utils.ChoreographerFrameCallbackC1509n;
import com.airbnb.lottie.value.C1517p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.r */
/* JADX INFO: compiled from: LottieDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class C1504r extends Drawable implements Drawable.Callback, Animatable {
    public static final int ax = -1;
    public static final int az = 1;
    public static final int ba = 2;

    /* JADX INFO: renamed from: a */
    private boolean f8241a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Rect f56183ab;
    private Rect an;
    private Matrix as;

    /* JADX INFO: renamed from: b */
    private boolean f8242b;
    private RectF bb;
    private boolean bg;
    private Matrix bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f56184bo;
    private Paint bp;
    private Rect bv;

    /* JADX INFO: renamed from: c */
    private boolean f8243c;

    /* JADX INFO: renamed from: d */
    private Bitmap f8244d;

    /* JADX INFO: renamed from: e */
    private boolean f8245e;

    /* JADX INFO: renamed from: f */
    @zy.dd
    hb f8246f;

    /* JADX INFO: renamed from: g */
    private boolean f8247g;

    /* JADX INFO: renamed from: h */
    private final ValueAnimator.AnimatorUpdateListener f8248h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private com.airbnb.lottie.manager.toq f8249i;
    private RectF id;
    private RectF in;

    /* JADX INFO: renamed from: j */
    private boolean f8250j;

    /* JADX INFO: renamed from: k */
    private ld6 f8251k;

    /* JADX INFO: renamed from: l */
    @zy.dd
    com.airbnb.lottie.zy f8252l;

    /* JADX INFO: renamed from: m */
    private int f8253m;

    /* JADX INFO: renamed from: n */
    private boolean f8254n;

    /* JADX INFO: renamed from: o */
    @zy.dd
    private com.airbnb.lottie.model.layer.zy f8255o;

    /* JADX INFO: renamed from: p */
    private final ArrayList<zy> f8256p;

    /* JADX INFO: renamed from: q */
    private final ChoreographerFrameCallbackC1509n f8257q;

    /* JADX INFO: renamed from: r */
    @zy.dd
    private C1441k f8258r;

    /* JADX INFO: renamed from: s */
    private q f8259s;

    /* JADX INFO: renamed from: t */
    @zy.dd
    private InterfaceC1503q f8260t;

    /* JADX INFO: renamed from: u */
    private EnumC1430e f8261u;

    /* JADX INFO: renamed from: v */
    private final Matrix f8262v;

    /* JADX INFO: renamed from: w */
    private Canvas f8263w;

    /* JADX INFO: renamed from: x */
    private boolean f8264x;

    /* JADX INFO: renamed from: y */
    private boolean f8265y;

    /* JADX INFO: renamed from: z */
    @zy.dd
    private String f8266z;

    /* JADX INFO: renamed from: com.airbnb.lottie.r$k */
    /* JADX INFO: compiled from: LottieDrawable.java */
    class k implements ValueAnimator.AnimatorUpdateListener {
        k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C1504r.this.f8255o != null) {
                C1504r.this.f8255o.d2ok(C1504r.this.f8257q.n7h());
            }
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.r$n */
    /* JADX INFO: compiled from: LottieDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.r$q */
    /* JADX INFO: compiled from: LottieDrawable.java */
    private enum q {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.airbnb.lottie.r$toq */
    /* JADX INFO: compiled from: LottieDrawable.java */
    class toq<T> extends C1517p<T> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.airbnb.lottie.value.x2 f8270q;

        toq(com.airbnb.lottie.value.x2 x2Var) {
            this.f8270q = x2Var;
        }

        @Override // com.airbnb.lottie.value.C1517p
        /* JADX INFO: renamed from: k */
        public T mo5884k(com.airbnb.lottie.value.toq<T> toqVar) {
            return (T) this.f8270q.m6295k(toqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.airbnb.lottie.r$zy */
    /* JADX INFO: compiled from: LottieDrawable.java */
    interface zy {
        /* JADX INFO: renamed from: k */
        void mo5885k(ld6 ld6Var);
    }

    public C1504r() {
        ChoreographerFrameCallbackC1509n choreographerFrameCallbackC1509n = new ChoreographerFrameCallbackC1509n();
        this.f8257q = choreographerFrameCallbackC1509n;
        this.f8254n = true;
        this.f8247g = false;
        this.f8265y = false;
        this.f8259s = q.NONE;
        this.f8256p = new ArrayList<>();
        k kVar = new k();
        this.f8248h = kVar;
        this.f8245e = false;
        this.f8250j = true;
        this.f8253m = 255;
        this.f8261u = EnumC1430e.AUTOMATIC;
        this.f56184bo = false;
        this.f8262v = new Matrix();
        this.bg = false;
        choreographerFrameCallbackC1509n.addUpdateListener(kVar);
    }

    private void a9(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bo(int i2, ld6 ld6Var) {
        kcsr(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c8jq(float f2, ld6 ld6Var) {
        se(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m6211d(String str, ld6 ld6Var) {
        ktq(str);
    }

    private void d2ok(int i2, int i3) {
        Bitmap bitmap = this.f8244d;
        if (bitmap == null || bitmap.getWidth() < i2 || this.f8244d.getHeight() < i3) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            this.f8244d = bitmapCreateBitmap;
            this.f8263w.setBitmap(bitmapCreateBitmap);
            this.bg = true;
            return;
        }
        if (this.f8244d.getWidth() > i2 || this.f8244d.getHeight() > i3) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f8244d, 0, 0, i2, i3);
            this.f8244d = bitmapCreateBitmap2;
            this.f8263w.setBitmap(bitmapCreateBitmap2);
            this.bg = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dr(String str, ld6 ld6Var) {
        zkd(str);
    }

    /* JADX INFO: renamed from: f */
    private com.airbnb.lottie.manager.toq m6212f() {
        if (getCallback() == null) {
            return null;
        }
        com.airbnb.lottie.manager.toq toqVar = this.f8249i;
        if (toqVar != null && !toqVar.zy(ncyb())) {
            this.f8249i = null;
        }
        if (this.f8249i == null) {
            this.f8249i = new com.airbnb.lottie.manager.toq(getCallback(), this.f8266z, this.f8260t, this.f8251k.m5976p());
        }
        return this.f8249i;
    }

    private void gbni(Canvas canvas, com.airbnb.lottie.model.layer.zy zyVar) {
        if (this.f8251k == null || zyVar == null) {
            return;
        }
        lvui();
        canvas.getMatrix(this.bl);
        canvas.getClipBounds(this.f56183ab);
        jk(this.f56183ab, this.bb);
        this.bl.mapRect(this.bb);
        a9(this.bb, this.f56183ab);
        if (this.f8250j) {
            this.in.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            zyVar.mo5886g(this.in, null, false);
        }
        this.bl.mapRect(this.in);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        ltg8(this.in, fWidth, fHeight);
        if (!i1()) {
            RectF rectF = this.in;
            Rect rect = this.f56183ab;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.in.width());
        int iCeil2 = (int) Math.ceil(this.in.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        d2ok(iCeil, iCeil2);
        if (this.bg) {
            this.f8262v.set(this.bl);
            this.f8262v.preScale(fWidth, fHeight);
            Matrix matrix = this.f8262v;
            RectF rectF2 = this.in;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f8244d.eraseColor(0);
            zyVar.mo5890y(this.f8263w, this.f8262v, this.f8253m);
            this.bl.invert(this.as);
            this.as.mapRect(this.id, this.in);
            a9(this.id, this.an);
        }
        this.bv.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f8244d, this.bv, this.an, this.bp);
    }

    private void gvn7(Canvas canvas) {
        com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
        ld6 ld6Var = this.f8251k;
        if (zyVar == null || ld6Var == null) {
            return;
        }
        this.f8262v.reset();
        if (!getBounds().isEmpty()) {
            this.f8262v.preScale(r2.width() / ld6Var.toq().width(), r2.height() / ld6Var.toq().height());
        }
        zyVar.mo5890y(canvas, this.f8262v, this.f8253m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gyi(int i2, int i3, ld6 ld6Var) {
        gc3c(i2, i3);
    }

    private boolean i1() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ikck(int i2, ld6 ld6Var) {
        jz5(i2);
    }

    private void jk(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: l */
    private C1441k m6216l() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f8258r == null) {
            this.f8258r = new C1441k(getCallback(), this.f8252l);
        }
        return this.f8258r;
    }

    private void ltg8(RectF rectF, float f2, float f3) {
        rectF.set(rectF.left * f2, rectF.top * f3, rectF.right * f2, rectF.bottom * f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lv5(ld6 ld6Var) {
        qo();
    }

    private void lvui() {
        if (this.f8263w != null) {
            return;
        }
        this.f8263w = new Canvas();
        this.in = new RectF();
        this.bl = new Matrix();
        this.as = new Matrix();
        this.f56183ab = new Rect();
        this.bb = new RectF();
        this.bp = new C1418k();
        this.bv = new Rect();
        this.an = new Rect();
        this.id = new RectF();
    }

    private void mcp() {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            return;
        }
        this.f56184bo = this.f8261u.useSoftwareRendering(Build.VERSION.SDK_INT, ld6Var.m5973i(), ld6Var.n7h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mu(float f2, ld6 ld6Var) {
        b3e(f2);
    }

    @zy.dd
    private Context ncyb() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nmn5(C1471n c1471n, Object obj, C1517p c1517p, ld6 ld6Var) {
        ni7(c1471n, obj, c1517p);
    }

    private void o1t() {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            return;
        }
        com.airbnb.lottie.model.layer.zy zyVar = new com.airbnb.lottie.model.layer.zy(this, com.airbnb.lottie.parser.zurt.m6205k(ld6Var), ld6Var.ld6(), ld6Var);
        this.f8255o = zyVar;
        if (this.f8241a) {
            zyVar.oc(true);
        }
        this.f8255o.ncyb(this.f8250j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t8iq(ld6 ld6Var) {
        py();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m6221u(int i2, ld6 ld6Var) {
        sok(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m6222v(float f2, float f3, ld6 ld6Var) {
        uj2j(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vq(float f2, ld6 ld6Var) {
        h7am(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xwq3(String str, String str2, boolean z2, ld6 ld6Var) {
        bz2(str, str2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(String str, ld6 ld6Var) {
        bwp(str);
    }

    /* JADX INFO: renamed from: z */
    private boolean m6224z() {
        return this.f8254n || this.f8247g;
    }

    /* JADX INFO: renamed from: a */
    boolean m6225a() {
        if (isVisible()) {
            return this.f8257q.isRunning();
        }
        q qVar = this.f8259s;
        return qVar == q.PLAY || qVar == q.RESUME;
    }

    public boolean a98o() {
        ChoreographerFrameCallbackC1509n choreographerFrameCallbackC1509n = this.f8257q;
        if (choreographerFrameCallbackC1509n == null) {
            return false;
        }
        return choreographerFrameCallbackC1509n.isRunning();
    }

    /* JADX INFO: renamed from: b */
    public boolean m6226b() {
        com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
        return zyVar != null && zyVar.dd();
    }

    public void b3e(final float f2) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.jp0y
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f7953k.mu(f2, ld6Var2);
                }
            });
        } else {
            jz5((int) com.airbnb.lottie.utils.f7l8.ld6(ld6Var.ki(), this.f8251k.m5971g(), f2));
        }
    }

    public void bek6(boolean z2) {
        if (this.f8241a == z2) {
            return;
        }
        this.f8241a = z2;
        com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
        if (zyVar != null) {
            zyVar.oc(z2);
        }
    }

    public boolean bf2() {
        com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
        return zyVar != null && zyVar.x9kr();
    }

    public void bwp(final String str) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.oc
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f8134k.y2(str, ld6Var2);
                }
            });
            return;
        }
        C1475y c1475yX2 = ld6Var.x2(str);
        if (c1475yX2 != null) {
            kcsr((int) (c1475yX2.f56112toq + c1475yX2.f56113zy));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void bz2(final String str, final String str2, final boolean z2) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.eqxt
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f7933k.xwq3(str, str2, z2, ld6Var2);
                }
            });
            return;
        }
        C1475y c1475yX2 = ld6Var.x2(str);
        if (c1475yX2 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i2 = (int) c1475yX2.f56112toq;
        C1475y c1475yX22 = this.f8251k.x2(str2);
        if (c1475yX22 != null) {
            gc3c(i2, (int) (c1475yX22.f56112toq + (z2 ? 1.0f : 0.0f)));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
    }

    @zy.dd
    /* JADX INFO: renamed from: c */
    public String m6227c() {
        return this.f8266z;
    }

    public void cfr(boolean z2) {
        this.f8247g = z2;
    }

    public boolean ch() {
        return this.f8243c;
    }

    public void cv06(boolean z2) {
        this.f8242b = z2;
        ld6 ld6Var = this.f8251k;
        if (ld6Var != null) {
            ld6Var.o1t(z2);
        }
    }

    public void d3(boolean z2) {
        if (this.f8243c == z2) {
            return;
        }
        this.f8243c = z2;
        if (this.f8251k != null) {
            o1t();
        }
    }

    public void d8wk(Animator.AnimatorListener animatorListener) {
        this.f8257q.removeListener(animatorListener);
    }

    public boolean dd() {
        return this.f8250j;
    }

    @zy.dd
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public Bitmap m28250do(String str, @zy.dd Bitmap bitmap) {
        com.airbnb.lottie.manager.toq toqVarM6212f = m6212f();
        if (toqVarM6212f == null) {
            C1510q.m6255n("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapM5994g = toqVarM6212f.m5994g(str, bitmap);
        invalidateSelf();
        return bitmapM5994g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@zy.lvui Canvas canvas) {
        C1476n.m6103k("Drawable#draw");
        if (this.f8265y) {
            try {
                if (this.f56184bo) {
                    gbni(canvas, this.f8255o);
                } else {
                    gvn7(canvas);
                }
            } catch (Throwable th) {
                C1510q.zy("Lottie crashed in draw!", th);
            }
        } else if (this.f56184bo) {
            gbni(canvas, this.f8255o);
        } else {
            gvn7(canvas);
        }
        this.bg = false;
        C1476n.toq("Drawable#draw");
    }

    /* JADX INFO: renamed from: e */
    public float m6228e() {
        return this.f8257q.t8r();
    }

    public float ek5k() {
        return this.f8257q.m6249i();
    }

    @zy.oc
    public void eqxt() {
        this.f8256p.clear();
        this.f8257q.qrj();
        if (isVisible()) {
            return;
        }
        this.f8259s = q.NONE;
    }

    public void etdu(com.airbnb.lottie.zy zyVar) {
        this.f8252l = zyVar;
        C1441k c1441k = this.f8258r;
        if (c1441k != null) {
            c1441k.m5992q(zyVar);
        }
    }

    @zy.hyr(api = 19)
    public void fn3e(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f8257q.addPauseListener(animatorPauseListener);
    }

    public void fnq8() {
        this.f8256p.clear();
        this.f8257q.zurt();
        if (isVisible()) {
            return;
        }
        this.f8259s = q.NONE;
    }

    @Deprecated
    public void fti() {
    }

    public <T> void fu4(C1471n c1471n, T t2, com.airbnb.lottie.value.x2<T> x2Var) {
        ni7(c1471n, t2, new toq(x2Var));
    }

    @zy.hyr(api = 19)
    public void g1(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f8257q.removePauseListener(animatorPauseListener);
    }

    public void gc3c(final int i2, final int i3) {
        if (this.f8251k == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.mcp
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f7975k.gyi(i2, i3, ld6Var);
                }
            });
        } else {
            this.f8257q.fti(i2, i3 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8253m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            return -1;
        }
        return ld6Var.toq().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            return -1;
        }
        return ld6Var.toq().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h7am(@zy.zurt(from = 0.0d, to = 1.0d) final float f2) {
        if (this.f8251k == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f8541k.vq(f2, ld6Var);
                }
            });
            return;
        }
        C1476n.m6103k("Drawable#setProgress");
        this.f8257q.jk(this.f8251k.m5979y(f2));
        C1476n.toq("Drawable#setProgress");
    }

    @zy.zurt(from = 0.0d, to = 1.0d)
    public float hb() {
        return this.f8257q.n7h();
    }

    @Deprecated
    @zy.dd
    public Bitmap hyr(String str) {
        com.airbnb.lottie.manager.toq toqVarM6212f = m6212f();
        if (toqVarM6212f != null) {
            return toqVarM6212f.m5995k(str);
        }
        ld6 ld6Var = this.f8251k;
        dd ddVar = ld6Var == null ? null : ld6Var.m5976p().get(str);
        if (ddVar != null) {
            return ddVar.m5955k();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m6229i(Animator.AnimatorListener animatorListener) {
        this.f8257q.addListener(animatorListener);
    }

    public void i9jn() {
        this.f8257q.m6251t();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@zy.lvui Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.bg) {
            return;
        }
        this.bg = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return a98o();
    }

    public void ixz(hb hbVar) {
        this.f8246f = hbVar;
    }

    /* JADX INFO: renamed from: j */
    public EnumC1430e m6230j() {
        return this.f56184bo ? EnumC1430e.SOFTWARE : EnumC1430e.HARDWARE;
    }

    public void jbh(int i2) {
        this.f8257q.setRepeatMode(i2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void jp0y(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
        ld6 ld6Var = this.f8251k;
        if (zyVar == null || ld6Var == null) {
            return;
        }
        if (this.f56184bo) {
            canvas.save();
            canvas.concat(matrix);
            gbni(canvas, zyVar);
            canvas.restore();
        } else {
            zyVar.mo5890y(canvas, matrix, this.f8253m);
        }
        this.bg = false;
    }

    public void jz5(final int i2) {
        if (this.f8251k == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.fti
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f7940k.ikck(i2, ld6Var);
                }
            });
        } else {
            this.f8257q.jp0y(i2);
        }
    }

    public void kcsr(final int i2) {
        if (this.f8251k == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.gvn7
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f7945k.bo(i2, ld6Var);
                }
            });
        } else {
            this.f8257q.a9(i2 + 0.99f);
        }
    }

    public void ktq(final String str) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.d2ok
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f7925k.m6211d(str, ld6Var2);
                }
            });
            return;
        }
        C1475y c1475yX2 = ld6Var.x2(str);
        if (c1475yX2 != null) {
            jz5((int) c1475yX2.f56112toq);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @zy.dd
    public dd lrht(String str) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            return null;
        }
        return ld6Var.m5976p().get(str);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public int m6231m() {
        return this.f8257q.getRepeatMode();
    }

    public void m4(boolean z2) {
        if (z2 != this.f8250j) {
            this.f8250j = z2;
            com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
            if (zyVar != null) {
                zyVar.ncyb(z2);
            }
            invalidateSelf();
        }
    }

    public void mbx(int i2) {
        this.f8257q.setRepeatCount(i2);
    }

    public int n5r1() {
        return (int) this.f8257q.kja0();
    }

    public <T> void ni7(final C1471n c1471n, final T t2, @zy.dd final C1517p<T> c1517p) {
        com.airbnb.lottie.model.layer.zy zyVar = this.f8255o;
        if (zyVar == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.lvui
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f7966k.nmn5(c1471n, t2, c1517p, ld6Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c1471n == C1471n.f56103zy) {
            zyVar.mo5889q(t2, c1517p);
        } else if (c1471n.m6090q() != null) {
            c1471n.m6090q().mo5889q(t2, c1517p);
        } else {
            List<C1471n> listZsr0 = zsr0(c1471n);
            for (int i2 = 0; i2 < listZsr0.size(); i2++) {
                listZsr0.get(i2).m6090q().mo5889q(t2, c1517p);
            }
            zIsEmpty = true ^ listZsr0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t2 == n5r1.f56121a9) {
                h7am(hb());
            }
        }
    }

    @zy.dd
    public uv6 nn86() {
        ld6 ld6Var = this.f8251k;
        if (ld6Var != null) {
            return ld6Var.kja0();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public int m6232o() {
        return this.f8257q.getRepeatCount();
    }

    public boolean oc() {
        return this.f8243c;
    }

    @zy.oc
    public void py() {
        if (this.f8255o == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.d3
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f7926k.t8iq(ld6Var);
                }
            });
            return;
        }
        mcp();
        if (m6224z() || m6232o() == 0) {
            if (isVisible()) {
                this.f8257q.wvg();
            } else {
                this.f8259s = q.RESUME;
            }
        }
        if (m6224z()) {
            return;
        }
        sok((int) (ek5k() < 0.0f ? m6228e() : vyq()));
        this.f8257q.qrj();
        if (isVisible()) {
            return;
        }
        this.f8259s = q.NONE;
    }

    @Deprecated
    public void qkj8(boolean z2) {
        this.f8257q.setRepeatCount(z2 ? -1 : 0);
    }

    @zy.oc
    public void qo() {
        if (this.f8255o == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.wvg
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f8537k.lv5(ld6Var);
                }
            });
            return;
        }
        mcp();
        if (m6224z() || m6232o() == 0) {
            if (isVisible()) {
                this.f8257q.ni7();
            } else {
                this.f8259s = q.PLAY;
            }
        }
        if (m6224z()) {
            return;
        }
        sok((int) (ek5k() < 0.0f ? m6228e() : vyq()));
        this.f8257q.qrj();
        if (isVisible()) {
            return;
        }
        this.f8259s = q.NONE;
    }

    @zy.dd
    /* JADX INFO: renamed from: r */
    public Bitmap m6233r(String str) {
        com.airbnb.lottie.manager.toq toqVarM6212f = m6212f();
        if (toqVarM6212f != null) {
            return toqVarM6212f.m5995k(str);
        }
        return null;
    }

    public void r8s8(boolean z2) {
        this.f8264x = z2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@zy.lvui Drawable drawable, @zy.lvui Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    public void se(@zy.zurt(from = 0.0d, to = 1.0d) final float f2) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.o1t
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f8133k.c8jq(f2, ld6Var2);
                }
            });
        } else {
            kcsr((int) com.airbnb.lottie.utils.f7l8.ld6(ld6Var.ki(), this.f8251k.m5971g(), f2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@zy.a9(from = 0, to = 255) int i2) {
        this.f8253m = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@zy.dd ColorFilter colorFilter) {
        C1510q.m6255n("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean z5 = !isVisible();
        boolean visible = super.setVisible(z2, z3);
        if (z2) {
            q qVar = this.f8259s;
            if (qVar == q.PLAY) {
                qo();
            } else if (qVar == q.RESUME) {
                py();
            }
        } else if (this.f8257q.isRunning()) {
            fnq8();
            this.f8259s = q.RESUME;
        } else if (!z5) {
            this.f8259s = q.NONE;
        }
        return visible;
    }

    public void sok(final int i2) {
        if (this.f8251k == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.t
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var) {
                    this.f8271k.m6221u(i2, ld6Var);
                }
            });
        } else {
            this.f8257q.jk(i2);
        }
    }

    @Override // android.graphics.drawable.Animatable
    @zy.oc
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        qo();
    }

    @Override // android.graphics.drawable.Animatable
    @zy.oc
    public void stop() {
        eqxt();
    }

    /* JADX INFO: renamed from: t */
    public void m6234t() {
        if (this.f8257q.isRunning()) {
            this.f8257q.cancel();
            if (!isVisible()) {
                this.f8259s = q.NONE;
            }
        }
        this.f8251k = null;
        this.f8255o = null;
        this.f8249i = null;
        this.f8257q.m6250s();
        invalidateSelf();
    }

    public void tfm() {
        this.f8257q.removeAllListeners();
    }

    public void uc(float f2) {
        this.f8257q.gvn7(f2);
    }

    public void uj2j(@zy.zurt(from = 0.0d, to = 1.0d) final float f2, @zy.zurt(from = 0.0d, to = 1.0d) final float f3) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.a9
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f7799k.m6222v(f2, f3, ld6Var2);
                }
            });
        } else {
            gc3c((int) com.airbnb.lottie.utils.f7l8.ld6(ld6Var.ki(), this.f8251k.m5971g(), f2), (int) com.airbnb.lottie.utils.f7l8.ld6(this.f8251k.ki(), this.f8251k.m5971g(), f3));
        }
    }

    public boolean ukdy() {
        return this.f8246f == null && this.f8251k.zy().a9() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@zy.lvui Drawable drawable, @zy.lvui Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean uv6() {
        return this.f8245e;
    }

    public boolean v0af(ld6 ld6Var) {
        if (this.f8251k == ld6Var) {
            return false;
        }
        this.bg = true;
        m6234t();
        this.f8251k = ld6Var;
        o1t();
        this.f8257q.mcp(ld6Var);
        h7am(this.f8257q.getAnimatedFraction());
        Iterator it = new ArrayList(this.f8256p).iterator();
        while (it.hasNext()) {
            zy zyVar = (zy) it.next();
            if (zyVar != null) {
                zyVar.mo5885k(ld6Var);
            }
            it.remove();
        }
        this.f8256p.clear();
        ld6Var.o1t(this.f8242b);
        mcp();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void vep5(EnumC1430e enumC1430e) {
        this.f8261u = enumC1430e;
        mcp();
    }

    public float vyq() {
        return this.f8257q.ki();
    }

    public void w831(InterfaceC1503q interfaceC1503q) {
        this.f8260t = interfaceC1503q;
        com.airbnb.lottie.manager.toq toqVar = this.f8249i;
        if (toqVar != null) {
            toqVar.m5996n(interfaceC1503q);
        }
    }

    public void was(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8257q.removeUpdateListener(animatorUpdateListener);
    }

    public void wo() {
        this.f8257q.removeAllUpdateListeners();
        this.f8257q.addUpdateListener(this.f8248h);
    }

    public void wvg() {
        this.f8256p.clear();
        this.f8257q.cancel();
        if (isVisible()) {
            return;
        }
        this.f8259s = q.NONE;
    }

    void wx16(Boolean bool) {
        this.f8254n = bool.booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public boolean m6235x() {
        return this.f8257q.getRepeatCount() == -1;
    }

    public ld6 x9kr() {
        return this.f8251k;
    }

    @zy.dd
    public Typeface y9n(String str, String str2) {
        C1441k c1441kM6216l = m6216l();
        if (c1441kM6216l != null) {
            return c1441kM6216l.toq(str, str2);
        }
        return null;
    }

    public void yl(boolean z2) {
        this.f8265y = z2;
    }

    public void yqrt(boolean z2) {
        this.f8245e = z2;
    }

    @zy.dd
    public hb yz() {
        return this.f8246f;
    }

    public void z4(@zy.dd String str) {
        this.f8266z = str;
    }

    public void zkd(final String str) {
        ld6 ld6Var = this.f8251k;
        if (ld6Var == null) {
            this.f8256p.add(new zy() { // from class: com.airbnb.lottie.jk
                @Override // com.airbnb.lottie.C1504r.zy
                /* JADX INFO: renamed from: k */
                public final void mo5885k(ld6 ld6Var2) {
                    this.f7952k.dr(str, ld6Var2);
                }
            });
            return;
        }
        C1475y c1475yX2 = ld6Var.x2(str);
        if (c1475yX2 != null) {
            int i2 = (int) c1475yX2.f56112toq;
            gc3c(i2, ((int) c1475yX2.f56113zy) + i2);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public boolean zp() {
        return this.f8264x;
    }

    public List<C1471n> zsr0(C1471n c1471n) {
        if (this.f8255o == null) {
            C1510q.m6255n("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f8255o.mo5888n(c1471n, 0, arrayList, new C1471n(new String[0]));
        return arrayList;
    }

    public void zurt(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8257q.addUpdateListener(animatorUpdateListener);
    }
}
