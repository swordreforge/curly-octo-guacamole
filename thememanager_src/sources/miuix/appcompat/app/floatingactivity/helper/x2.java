package miuix.appcompat.app.floatingactivity.helper;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.floatingactivity.InterfaceC6939y;
import miuix.appcompat.app.t8r;
import miuix.appcompat.widget.dialoganim.C7058k;
import miuix.core.util.C7103y;
import miuix.internal.util.C7164n;
import miuix.internal.util.n7h;
import miuix.internal.widget.RoundFrameLayout;
import miuix.view.C7380g;
import zy.lvui;

/* JADX INFO: compiled from: TabletFloatingActivityHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x2 extends AbstractC6920k {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f86849ab = 90;
    private static final int bb = 500;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f86850bo = "init";

    /* JADX INFO: renamed from: d */
    private static final float f38837d = 0.5f;

    /* JADX INFO: renamed from: v */
    private static final String f38838v = "dismiss";

    /* JADX INFO: renamed from: w */
    private static final float f38839w = 0.3f;

    /* JADX INFO: renamed from: c */
    private float f38842c;

    /* JADX INFO: renamed from: f */
    private float f38844f;

    /* JADX INFO: renamed from: g */
    private View f38845g;

    /* JADX INFO: renamed from: h */
    private GestureDetector f38846h;

    /* JADX INFO: renamed from: i */
    private ViewGroup.LayoutParams f38847i;

    /* JADX INFO: renamed from: j */
    private float f38848j;

    /* JADX INFO: renamed from: k */
    protected t8r f38849k;

    /* JADX INFO: renamed from: l */
    private float f38850l;

    /* JADX INFO: renamed from: n */
    private View f38852n;

    /* JADX INFO: renamed from: p */
    private RoundFrameLayout f38854p;

    /* JADX INFO: renamed from: q */
    private View f38855q;

    /* JADX INFO: renamed from: r */
    private float f38856r;

    /* JADX INFO: renamed from: s */
    private View f38857s;

    /* JADX INFO: renamed from: t */
    private InterfaceC6939y f38858t;

    /* JADX INFO: renamed from: x */
    private final Drawable f38860x;

    /* JADX INFO: renamed from: y */
    private View f38861y;

    /* JADX INFO: renamed from: z */
    private miuix.appcompat.app.floatingactivity.f7l8 f38862z;

    /* JADX INFO: renamed from: e */
    private boolean f38843e = true;

    /* JADX INFO: renamed from: o */
    private final Handler f38853o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    private boolean f38851m = false;

    /* JADX INFO: renamed from: b */
    private boolean f38841b = true;

    /* JADX INFO: renamed from: a */
    private boolean f38840a = true;

    /* JADX INFO: renamed from: u */
    private int f38859u = 0;

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.helper.x2$k */
    /* JADX INFO: compiled from: TabletFloatingActivityHelper.java */
    class C6925k extends GestureDetector.SimpleOnGestureListener {
        C6925k() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (x2.this.f38843e && !x2.this.f38851m && !x2.this.f38849k.isFinishing()) {
                x2.this.n5r1();
                x2.this.m24929m();
                x2.this.bf2();
                x2.this.nmn5(true, 2);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: TabletFloatingActivityHelper.java */
    private static class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<x2> f38864k;

        /* JADX INFO: renamed from: q */
        private WeakReference<t8r> f38865q;

        public toq(x2 x2Var, t8r t8rVar) {
            this.f38864k = new WeakReference<>(x2Var);
            this.f38865q = new WeakReference<>(t8rVar);
        }

        /* JADX INFO: renamed from: q */
        private void m24936q(t8r t8rVar, x2 x2Var, boolean z2) {
            if (z2) {
                miuix.appcompat.app.floatingactivity.toq.m24990p(t8rVar, x2Var.f38841b);
            }
        }

        private void toq(t8r t8rVar, x2 x2Var, boolean z2, int i2, boolean z3) {
            if (x2Var.lrht()) {
                x2Var.m24933x(z2, i2);
            } else if (t8rVar != null) {
                t8rVar.realFinish();
                m24936q(t8rVar, x2Var, z3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zy(boolean z2) {
            x2 x2Var = this.f38864k.get();
            if (x2Var != null) {
                x2Var.lv5(3);
            }
            t8r t8rVar = this.f38865q.get();
            if (x2Var != null) {
                toq(t8rVar, x2Var, true, 3, z2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            zy(false);
        }
    }

    /* JADX INFO: compiled from: TabletFloatingActivityHelper.java */
    private static class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<x2> f38866k;

        /* JADX INFO: renamed from: n */
        private boolean f38867n;

        /* JADX INFO: renamed from: q */
        private int f38868q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f86851toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f86852zy;

        /* synthetic */ zy(x2 x2Var, boolean z2, int i2, int i3, C6925k c6925k) {
            this(x2Var, z2, i2, i3);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            WeakReference<x2> weakReference = this.f38866k;
            x2 x2Var = weakReference == null ? null : weakReference.get();
            if (x2Var != null) {
                x2Var.i1(obj);
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            WeakReference<x2> weakReference = this.f38866k;
            x2 x2Var = weakReference == null ? null : weakReference.get();
            if (x2Var != null) {
                x2Var.i1(obj);
            }
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindBy = UpdateInfo.findBy(collection, ViewProperty.TRANSLATION_Y);
            if (!this.f86852zy || updateInfoFindBy == null) {
                return;
            }
            x2 x2Var = this.f38866k.get();
            if (this.f38867n || updateInfoFindBy.getFloatValue() <= this.f38868q * 0.6f || x2Var == null) {
                return;
            }
            this.f38867n = true;
            x2Var.dd();
        }

        private zy(x2 x2Var, boolean z2, int i2, int i3) {
            this.f38867n = false;
            this.f38866k = new WeakReference<>(x2Var);
            this.f86851toq = i3;
            this.f86852zy = z2;
            this.f38868q = i2;
        }
    }

    public x2(t8r t8rVar) {
        this.f38849k = t8rVar;
        this.f38860x = C7164n.m25952s(t8rVar, R.attr.windowBackground);
    }

    /* JADX INFO: renamed from: a */
    private void m24921a(View view) {
        this.f38861y = view;
    }

    private void a98o() {
        if (this.f38841b) {
            final float alpha = this.f38854p.getAlpha();
            this.f38854p.setAlpha(0.0f);
            this.f38854p.postDelayed(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.helper.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38833k.m24930o(alpha);
                }
            }, 90L);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24922b() {
        InterfaceC6939y interfaceC6939y = this.f38858t;
        if (interfaceC6939y != null) {
            interfaceC6939y.mo24899k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bf2() {
        InterfaceC6939y interfaceC6939y = this.f38858t;
        if (interfaceC6939y != null) {
            interfaceC6939y.mo24897g();
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m24923c() {
        InterfaceC6939y interfaceC6939y = this.f38858t;
        if (interfaceC6939y == null) {
            return true;
        }
        return interfaceC6939y.f7l8();
    }

    private void ch(int i2) {
        m24929m();
        bf2();
        vyq(true, i2);
    }

    private void d2ok(float f2) {
        this.f38852n.setAlpha((1.0f - Math.max(0.0f, Math.min(f2, 1.0f))) * f38839w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m24924e() {
        if (m24925f()) {
            ek5k();
            ncyb();
        }
    }

    private void ek5k() {
        InterfaceC6939y interfaceC6939y = this.f38858t;
        if (interfaceC6939y != null) {
            interfaceC6939y.ld6(this.f38849k);
        }
    }

    private boolean eqxt() {
        new toq(this, this.f38849k).zy(true);
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m24925f() {
        return this.f38841b && m24923c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hb() {
        this.f38857s.setOnTouchListener(new View.OnTouchListener() { // from class: miuix.appcompat.app.floatingactivity.helper.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f38827k.nn86(view, motionEvent);
            }
        });
    }

    private void hyr(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m24922b();
            float rawY = motionEvent.getRawY();
            this.f38856r = rawY;
            this.f38850l = rawY;
            this.f38844f = 0.0f;
            m24929m();
            return;
        }
        if (action == 1) {
            boolean z2 = motionEvent.getRawY() - this.f38856r > ((float) this.f38845g.getHeight()) * 0.5f;
            lv5(1);
            if (!z2) {
                vyq(false, 1);
                return;
            }
            n5r1();
            InterfaceC6939y interfaceC6939y = this.f38858t;
            vyq(interfaceC6939y == null || !interfaceC6939y.mo24902q(1), 1);
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY2 = motionEvent.getRawY();
        float f2 = this.f38844f + (rawY2 - this.f38850l);
        this.f38844f = f2;
        if (f2 >= 0.0f) {
            yz(f2);
            d2ok(this.f38844f / this.f38848j);
        }
        this.f38850l = rawY2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(Object obj) {
        if (TextUtils.equals(f38838v, obj.toString())) {
            this.f38849k.realFinish();
        } else if (TextUtils.equals(f86850bo, obj.toString())) {
            y9n();
        }
        this.f38851m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean m24927j(View view, MotionEvent motionEvent) {
        if (!this.f38843e) {
            return true;
        }
        hyr(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: l */
    private View m24928l() {
        View view = this.f38861y;
        return view == null ? this.f38845g : view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lrht() {
        InterfaceC6939y interfaceC6939y;
        return this.f38841b && ((interfaceC6939y = this.f38858t) == null || interfaceC6939y.toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lv5(int i2) {
        this.f38859u = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m24929m() {
        View viewM24928l = m24928l();
        this.f38848j = viewM24928l.getHeight() + ((this.f38857s.getHeight() - viewM24928l.getHeight()) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n5r1() {
        InterfaceC6939y interfaceC6939y;
        if (miuix.appcompat.app.floatingactivity.toq.m24987g() || (interfaceC6939y = this.f38858t) == null || !this.f38843e) {
            return;
        }
        interfaceC6939y.zy(this.f38849k);
    }

    private void ncyb() {
        View viewM24928l = m24928l();
        int height = viewM24928l.getHeight() + ((this.f38857s.getHeight() - viewM24928l.getHeight()) / 2);
        IStateStyle iStateStyleState = Folme.useAt(viewM24928l).state();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_Y;
        iStateStyleState.setTo(viewProperty, Integer.valueOf(height)).to(viewProperty, 0, miuix.appcompat.app.floatingactivity.zy.qrj(1, null));
        C7058k.toq(this.f38852n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nmn5(boolean z2, int i2) {
        lv5(i2);
        if (!z2) {
            vyq(false, i2);
            return;
        }
        miuix.appcompat.app.floatingactivity.f7l8 f7l8Var = this.f38862z;
        if (f7l8Var != null && f7l8Var.mo24902q(i2)) {
            vyq(false, i2);
        } else {
            InterfaceC6939y interfaceC6939y = this.f38858t;
            vyq(interfaceC6939y == null || !interfaceC6939y.mo24902q(i2), i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean nn86(View view, MotionEvent motionEvent) {
        this.f38846h.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m24930o(float f2) {
        this.f38854p.setAlpha(f2);
    }

    private void oc(int i2) {
        lv5(i2);
        if (!lrht()) {
            this.f38849k.realFinish();
            miuix.appcompat.app.floatingactivity.toq.x2(this.f38849k);
        } else if (!this.f38851m) {
            ch(i2);
        }
        lvui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void vyq(final boolean z2, final int i2) {
        float f2;
        Object obj;
        int i3;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f38849k.runOnUiThread(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.helper.ld6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38828k.vyq(z2, i2);
                }
            });
            return;
        }
        if (this.f38851m && z2) {
            return;
        }
        this.f38851m = true;
        if (z2) {
            i3 = (int) this.f38848j;
            f2 = 0.0f;
            obj = f38838v;
        } else {
            f2 = 0.3f;
            obj = f86850bo;
            i3 = 0;
        }
        AnimConfig animConfigQrj = miuix.appcompat.app.floatingactivity.zy.qrj(z2 ? 2 : 1, null);
        animConfigQrj.addListeners(new zy(this, z2, i3, i2, null));
        AnimState animStateAdd = new AnimState(obj).add(ViewProperty.TRANSLATION_Y, i3);
        AnimState animStateAdd2 = new AnimState(obj).add(ViewProperty.ALPHA, f2);
        Folme.useAt(m24928l()).state().to(animStateAdd, animConfigQrj);
        Folme.useAt(this.f38852n).state().to(animStateAdd2, new AnimConfig[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m24933x(boolean z2, int i2) {
        if (!z2 || this.f38851m) {
            return;
        }
        m24929m();
        bf2();
        vyq(true, i2);
    }

    private void x9kr() {
        this.f38845g.post(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.helper.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f38835k.m24924e();
            }
        });
    }

    private void y9n() {
        InterfaceC6939y interfaceC6939y = this.f38858t;
        if (interfaceC6939y != null) {
            interfaceC6939y.mo24904y();
        }
    }

    private void yz(float f2) {
        m24928l().setTranslationY(f2);
    }

    private void zp(@lvui RoundFrameLayout roundFrameLayout) {
        if (this.f38841b && this.f38840a) {
            roundFrameLayout.setBorder(this.f38849k.getResources().getDimensionPixelSize(toq.f7l8.krto), C7164n.m25947g(this.f38849k, toq.C6055q.t2et, 0));
        } else {
            roundFrameLayout.setBorder(0.0f, 0);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public boolean cdj() {
        return true;
    }

    public void dd() {
        InterfaceC6939y interfaceC6939y = this.f38858t;
        if (interfaceC6939y != null) {
            interfaceC6939y.mo24900n();
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeCloseEnterAnimation() {
        if (this.f38841b) {
            miuix.appcompat.app.floatingactivity.zy.toq(this.f38845g);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeCloseExitAnimation() {
        if (this.f38841b) {
            miuix.appcompat.app.floatingactivity.zy.m24998q(this.f38845g);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeOpenEnterAnimation() {
        if (this.f38841b) {
            miuix.appcompat.app.floatingactivity.zy.m24994g(this.f38845g);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeOpenExitAnimation() {
        if (this.f38841b) {
            miuix.appcompat.app.floatingactivity.zy.m25000y(this.f38845g);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    @SuppressLint({"ClickableViewAccessibility"})
    public void f7l8(View view, boolean z2) {
        this.f38855q = view.findViewById(toq.C6054p.je1q);
        View viewFindViewById = view.findViewById(toq.C6054p.f76429uv6);
        this.f38852n = viewFindViewById;
        viewFindViewById.setVisibility(z2 ? 0 : 8);
        this.f38852n.setAlpha(f38839w);
        this.f38845g = view.findViewById(toq.C6054p.f34891e);
        this.f38857s = view.findViewById(toq.C6054p.f76437vyq);
        this.f38841b = z2;
        this.f38846h = new GestureDetector(view.getContext(), new C6925k());
        this.f38857s.postDelayed(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.helper.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f38826k.hb();
            }
        }, 500L);
        this.f38855q.setOnTouchListener(new View.OnTouchListener() { // from class: miuix.appcompat.app.floatingactivity.helper.y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f38869k.m24927j(view2, motionEvent);
            }
        });
        x9kr();
        this.f38849k.getWindow().setBackgroundDrawableResource(toq.C6050g.q4lv);
        if (this.f38841b || !n7h.qrj(this.f38849k)) {
            this.f38845g.setBackground(this.f38860x);
        } else {
            this.f38845g.setBackground(new ColorDrawable(-16777216));
        }
        if (this.f38843e && this.f38841b) {
            this.f38855q.setVisibility(0);
        } else {
            this.f38855q.setVisibility(8);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: g */
    public void mo24913g() {
        this.f38852n.setVisibility(8);
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: h */
    public void mo24914h(miuix.appcompat.app.floatingactivity.f7l8 f7l8Var) {
        this.f38862z = f7l8Var;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: k */
    public boolean mo24915k() {
        if (miuix.appcompat.app.floatingactivity.toq.m24987g()) {
            return eqxt();
        }
        if (this.f38841b) {
            n5r1();
            this.f38853o.postDelayed(new toq(this, this.f38849k), 110L);
            return true;
        }
        this.f38849k.realFinish();
        lvui();
        return true;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void ki() {
        this.f38845g.setVisibility(0);
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void kja0(InterfaceC6939y interfaceC6939y) {
        this.f38858t = interfaceC6939y;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public ViewGroup ld6(View view, boolean z2) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f38849k, toq.qrj.f76729m4, null);
        View viewFindViewById = viewGroup.findViewById(toq.C6054p.f34891e);
        View viewFindViewById2 = viewGroup.findViewById(toq.C6054p.je1q);
        if (viewFindViewById2 != null && (viewFindViewById2.getParent() instanceof ViewGroup)) {
            ((ViewGroup) viewFindViewById2.getParent()).removeView(viewFindViewById2);
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).addView(viewFindViewById2);
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, 17);
        this.f38847i = layoutParams2;
        if (z2) {
            ((ViewGroup.LayoutParams) layoutParams2).height = -2;
            ((ViewGroup.LayoutParams) layoutParams2).width = -2;
        } else {
            ((ViewGroup.LayoutParams) layoutParams2).width = -1;
            ((ViewGroup.LayoutParams) layoutParams2).height = -1;
        }
        viewGroup.removeView(viewFindViewById);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.f38842c = this.f38849k.getResources().getDimensionPixelSize(toq.f7l8.xzk4);
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(this.f38849k);
        this.f38854p = roundFrameLayout;
        roundFrameLayout.setLayoutParams(this.f38847i);
        this.f38854p.addView(view);
        this.f38854p.setRadius(z2 ? this.f38842c : 0.0f);
        zp(this.f38854p);
        a98o();
        viewGroup.addView(this.f38854p);
        m24921a(this.f38854p);
        return viewGroup;
    }

    public void lvui() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: n */
    public void mo24916n() {
        this.f38845g.setVisibility(8);
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void n7h(boolean z2) {
        this.f38841b = z2;
        if (!C7103y.toq(this.f38849k.getIntent())) {
            C7380g.m26779k(this.f38849k, true);
        }
        if (this.f38852n != null && this.f38858t.mo24901p()) {
            this.f38852n.setVisibility(z2 ? 0 : 8);
        }
        if (this.f38854p != null) {
            float dimensionPixelSize = this.f38849k.getResources().getDimensionPixelSize(toq.f7l8.xzk4);
            this.f38842c = dimensionPixelSize;
            RoundFrameLayout roundFrameLayout = this.f38854p;
            if (!z2) {
                dimensionPixelSize = 0.0f;
            }
            roundFrameLayout.setRadius(dimensionPixelSize);
            zp(this.f38854p);
        }
        if (this.f38845g != null) {
            if (z2 || !n7h.qrj(this.f38849k)) {
                this.f38845g.setBackground(this.f38860x);
            } else {
                this.f38845g.setBackground(new ColorDrawable(-16777216));
            }
        }
        View view = this.f38855q;
        if (view != null) {
            if (this.f38843e && this.f38841b) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: p */
    public void mo24917p() {
        if (this.f38841b && !miuix.appcompat.app.floatingactivity.toq.m24987g()) {
            n5r1();
        }
        oc(4);
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: q */
    public ViewGroup.LayoutParams mo24918q() {
        return this.f38847i;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void qrj(boolean z2) {
        this.f38840a = z2;
        RoundFrameLayout roundFrameLayout = this.f38854p;
        if (roundFrameLayout != null) {
            zp(roundFrameLayout);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void toq() {
        n5r1();
        m24929m();
        bf2();
        nmn5(true, 0);
    }

    protected boolean uv6() {
        return this.f38841b;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void x2(boolean z2) {
        this.f38843e = z2;
        if (z2 && this.f38841b) {
            this.f38855q.setVisibility(0);
        } else {
            this.f38855q.setVisibility(8);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public View zy() {
        return this.f38845g;
    }
}
