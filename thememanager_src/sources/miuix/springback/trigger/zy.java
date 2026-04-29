package miuix.springback.trigger;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;
import miuix.springback.trigger.AbstractC7346k;
import miuix.springback.trigger.toq;
import miuix.springback.view.SpringBackLayout;
import ula6.toq;

/* JADX INFO: compiled from: DefaultTrigger.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends miuix.springback.trigger.toq {

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final String f90379lv5 = "DefaultCustomTrigger";

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static int f90380t8iq;

    /* JADX INFO: renamed from: a */
    private toq.InterfaceC7351p f41846a;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public Pair<Integer, Integer> f90381a98o;

    /* JADX INFO: renamed from: b */
    private int f41847b;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public Pair<Integer, Integer> f90382bf2;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private AbstractC7346k.q.k f90383ch;

    /* JADX INFO: renamed from: e */
    private ViewGroup f41848e;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private TextView f90384ek5k;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private View f90385hb;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Pair<Integer, Integer> f90386i1;

    /* JADX INFO: renamed from: j */
    private ProgressBar f41849j;

    /* JADX INFO: renamed from: m */
    private TextView f41850m;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private AbstractC7346k.zy.k f90387nmn5;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private View f90388nn86;

    /* JADX INFO: renamed from: o */
    private ProgressBar f41851o;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private Context f90389vyq;

    /* JADX INFO: renamed from: x */
    private AbstractC7346k.toq.InterfaceC8114toq f41852x;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private int f90390y9n;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private int f90391yz;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private toq.ld6 f90392zp;

    /* JADX INFO: renamed from: miuix.springback.trigger.zy$k */
    /* JADX INFO: compiled from: DefaultTrigger.java */
    class C7355k implements toq.InterfaceC7351p {
        C7355k() {
        }

        @Override // miuix.springback.trigger.toq.InterfaceC7351p
        /* JADX INFO: renamed from: k */
        public void mo26716k(AbstractC7346k.toq toqVar, int i2) {
        }

        @Override // miuix.springback.trigger.toq.InterfaceC7351p
        /* JADX INFO: renamed from: n */
        public void mo26717n(AbstractC7346k.toq toqVar) {
            zy.this.f41849j.setVisibility(8);
            if (toqVar != null) {
                zy.this.f41850m.setText(toqVar.f41815g[3]);
            }
        }

        @Override // miuix.springback.trigger.toq.InterfaceC7351p
        /* JADX INFO: renamed from: q */
        public void mo26718q(AbstractC7346k.toq toqVar) {
        }

        @Override // miuix.springback.trigger.toq.InterfaceC7351p
        public void toq(AbstractC7346k.toq toqVar) {
            zy.this.f41849j.setVisibility(0);
            zy.this.f90388nn86.setVisibility(0);
            zy.this.f41850m.setVisibility(0);
            if (toqVar != null) {
                zy.this.f41850m.setText(toqVar.f41815g[2]);
            }
        }

        @Override // miuix.springback.trigger.toq.InterfaceC7351p
        public void zy(AbstractC7346k.toq toqVar) {
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.zy$n */
    /* JADX INFO: compiled from: DefaultTrigger.java */
    class C7356n implements AbstractC7346k.zy.k {
        C7356n() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        public void f7l8(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: g */
        public void mo26683g(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: k */
        public void mo26684k(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: n */
        public void mo26685n(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: p */
        public void mo26686p(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: q */
        public float mo26687q() {
            return -1.0f;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: s */
        public void mo26688s(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        public void toq(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        /* JADX INFO: renamed from: y */
        public void mo26689y(int i2) {
            zy.this.f41848e.setVisibility(0);
            AbstractC7346k.zy zyVarM26657s = zy.this.m26657s();
            if (zyVarM26657s == null || !zyVarM26657s.qrj()) {
                if (zyVarM26657s != null) {
                    zy.this.f90385hb.setVisibility(0);
                    zy.this.f41851o.setVisibility(0);
                    zy.this.f90384ek5k.setVisibility(0);
                    zy.this.f90384ek5k.setText(zyVarM26657s.f41821n[0]);
                    return;
                }
                return;
            }
            zy.this.f90385hb.setVisibility(8);
            zy.this.f41851o.setVisibility(8);
            if (zyVarM26657s.x2() < 3) {
                zy.this.f90384ek5k.setText(zyVarM26657s.f41821n[2]);
            } else {
                zy.this.f90384ek5k.setText(zyVarM26657s.f41821n[3]);
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.zy.k
        public void zy(int i2) {
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.zy$q */
    /* JADX INFO: compiled from: DefaultTrigger.java */
    class C7357q implements AbstractC7346k.q.k {
        C7357q() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        public void f7l8(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: g */
        public void mo26663g(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: k */
        public void mo26664k(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: n */
        public void mo26665n(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: p */
        public void mo26666p(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: q */
        public float mo26667q() {
            return -1.0f;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: s */
        public void mo26668s(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        public void toq(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        /* JADX INFO: renamed from: y */
        public void mo26669y(int i2) {
            zy.this.hb().setVisibility(0);
        }

        @Override // miuix.springback.trigger.AbstractC7346k.q.k
        public void zy(int i2) {
            zy zyVar = zy.this;
            zyVar.bek6(zyVar.hb());
            if (zy.this.yz()) {
                zy.this.f90388nn86.setVisibility(8);
                zy.this.f41850m.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: DefaultTrigger.java */
    class toq implements toq.ld6 {
        toq() {
        }

        @Override // miuix.springback.trigger.toq.ld6
        /* JADX INFO: renamed from: k */
        public void mo26713k(AbstractC7346k.zy zyVar) {
            zy.this.f41851o.setVisibility(8);
            zy.this.f90385hb.setVisibility(8);
            if (zyVar != null) {
                zy.this.f90384ek5k.setText(zyVar.f41821n[1]);
            }
        }

        @Override // miuix.springback.trigger.toq.ld6
        /* JADX INFO: renamed from: n */
        public void mo26714n(AbstractC7346k.zy zyVar) {
        }

        @Override // miuix.springback.trigger.toq.ld6
        /* JADX INFO: renamed from: q */
        public void mo26715q(AbstractC7346k.zy zyVar) {
            zy.this.f41851o.setVisibility(0);
            zy.this.f90384ek5k.setVisibility(0);
            if (zyVar != null) {
                zy.this.f90384ek5k.setText(zyVar.f41821n[0]);
            }
        }

        @Override // miuix.springback.trigger.toq.ld6
        public void toq(AbstractC7346k.zy zyVar) {
        }

        @Override // miuix.springback.trigger.toq.ld6
        public void zy(AbstractC7346k.zy zyVar, int i2) {
            if (zyVar != null && i2 < 3) {
                zy.this.f90384ek5k.setText(zyVar.f41821n[2]);
            } else if (zyVar != null) {
                zy.this.f90384ek5k.setText(zyVar.f41821n[3]);
            }
            zy.this.f41851o.setVisibility(8);
            zy.this.f90385hb.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultTrigger.java */
    class C8116zy implements AbstractC7346k.toq.InterfaceC8114toq {
        C8116zy() {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        public void f7l8(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: g */
        public void mo26675g(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: k */
        public void mo26676k(int i2) {
            zy.this.f41849j.setVisibility(0);
            zy.this.f90388nn86.setVisibility(0);
            zy.this.f41850m.setVisibility(0);
            AbstractC7346k.toq toqVarM26658y = zy.this.m26658y();
            if (toqVarM26658y != null) {
                zy.this.f41850m.setText(toqVarM26658y.f41815g[2]);
            }
            if (zy.this.f41849j.getVisibility() == 0) {
                zy.this.f41849j.setAlpha(1.0f);
                zy.this.f41849j.setScaleX(1.0f);
                zy.this.f41849j.setScaleY(1.0f);
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: n */
        public void mo26677n(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: p */
        public void mo26678p(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: q */
        public float mo26679q() {
            return -1.0f;
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: s */
        public void mo26680s(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        public void toq(int i2) {
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        /* JADX INFO: renamed from: y */
        public void mo26681y(int i2) {
            zy.this.f41849j.setVisibility(8);
            zy.this.f90388nn86.setVisibility(0);
            zy.this.f41850m.setVisibility(0);
            AbstractC7346k.toq toqVarM26658y = zy.this.m26658y();
            if (toqVarM26658y != null) {
                zy.this.f41850m.setText(toqVarM26658y.f41815g[0]);
            }
        }

        @Override // miuix.springback.trigger.AbstractC7346k.toq.InterfaceC8114toq
        public void zy(int i2) {
            zy.this.f90388nn86.setVisibility(0);
            zy.this.f41850m.setVisibility(0);
            if (zy.this.m26708b()) {
                zy.this.hb().setVisibility(8);
            }
        }
    }

    public zy(Context context) {
        super(context);
        this.f90391yz = 0;
        this.f90390y9n = 0;
        this.f41847b = 0;
        this.f41846a = new C7355k();
        this.f90392zp = new toq();
        this.f41852x = new C8116zy();
        this.f90383ch = new C7357q();
        this.f90387nmn5 = new C7356n();
        this.f90389vyq = context;
        m4(this.f41846a);
        cfr(this.f90392zp);
        f90380t8iq = context.getResources().getDimensionPixelSize(toq.zy.f95436fu4);
        this.f90382bf2 = new Pair<>(0, Integer.valueOf(this.f90389vyq.getResources().getDimensionPixelSize(toq.zy.f44593y) + 0));
        this.f90381a98o = new Pair<>(0, Integer.valueOf(this.f90389vyq.getResources().getDimensionPixelSize(toq.zy.f95443ld6) + 0));
        int dimensionPixelSize = this.f90389vyq.getResources().getDimensionPixelSize(toq.zy.f44591s);
        this.f90386i1 = new Pair<>(Integer.valueOf(dimensionPixelSize), Integer.valueOf(dimensionPixelSize));
    }

    private void b3e(Context context, int[] iArr, String[] strArr) {
        if (iArr != null) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                strArr[i2] = context.getResources().getString(iArr[i2]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bek6(View view) {
        if (view != null) {
            view.setVisibility(0);
            AnimState animState = new AnimState("start");
            ViewProperty viewProperty = ViewProperty.ALPHA;
            AnimState animStateAdd = animState.add(viewProperty, 0.0d);
            ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
            AnimState animStateAdd2 = animStateAdd.add(viewProperty2, -180.0d);
            AnimState animStateAdd3 = new AnimState("show").add(viewProperty, 1.0d).add(viewProperty2, 25.0d);
            Folme.useAt(view).state().setFlags(1L).fromTo(animStateAdd2, animStateAdd3, new AnimConfig().setEase(EaseManager.getStyle(4, 120.0f, 0.99f, 0.1f))).then(new AnimState("hide").add(viewProperty, 1.0d).add(viewProperty2, 0.0d), new AnimConfig().setEase(EaseManager.getStyle(4, 40.0f, 0.99f, 0.1f)));
        }
    }

    private void jz5() {
        this.f41848e = (ViewGroup) uv6().findViewById(toq.C7694n.f95097sok);
        this.f90385hb = uv6().findViewById(toq.C7694n.f95057etdu);
        this.f90384ek5k = (TextView) uv6().findViewById(toq.C7694n.f95048cfr);
        this.f41851o = (ProgressBar) uv6().findViewById(toq.C7694n.f44477m);
    }

    private void ktq() {
    }

    private void uj2j() {
        this.f90388nn86 = m26711j().findViewById(toq.C7694n.f95081m4);
        this.f41850m = (TextView) m26711j().findViewById(toq.C7694n.f95103v0af);
        this.f41849j = (ProgressBar) m26711j().findViewById(toq.C7694n.f44479o);
    }

    @Override // miuix.springback.trigger.AbstractC7346k
    /* JADX INFO: renamed from: g */
    public boolean mo26654g(AbstractC7346k.k kVar) {
        return super.mo26654g(kVar);
    }

    @Override // miuix.springback.trigger.toq
    public void i9jn(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (yz()) {
            for (int i10 = 0; i10 < f7l8().size(); i10++) {
                AbstractC7346k.k kVar = f7l8().get(i10);
                if (kVar instanceof AbstractC7346k.toq) {
                    AbstractC7346k.toq toqVar = (AbstractC7346k.toq) kVar;
                    if (f90380t8iq >= this.f90388nn86.getTop()) {
                        this.f41849j.offsetTopAndBottom(toqVar.f41812k - 0);
                        this.f90388nn86.offsetTopAndBottom(toqVar.f41812k - 0);
                        this.f41850m.offsetTopAndBottom(toqVar.f41812k - 0);
                    }
                }
            }
            if (this.f90388nn86.getVisibility() == 0 && m26709c() != null && (m26709c() instanceof AbstractC7346k.toq)) {
                if (this.f90391yz <= 0) {
                    this.f90391yz = this.f90388nn86.getBottom();
                }
                if (this.f90390y9n <= 0 || this.f41847b <= 0) {
                    this.f90390y9n = this.f41850m.getTop();
                    this.f41847b = this.f41850m.getBottom();
                }
                if ((this.f41849j.getVisibility() == 8 || this.f41849j.getVisibility() == 4) && lrht() != this.f41827l && m26711j().getHeight() > m26709c().f90341toq) {
                    this.f90388nn86.setBottom(this.f90391yz + (m26711j().getHeight() - m26709c().f90341toq));
                }
            }
        }
        if (m26708b() && hb().getVisibility() == 0 && hb().getTop() == 0) {
            hb().offsetTopAndBottom(this.f90373wvg - hb().getMeasuredHeight());
        }
    }

    @Override // miuix.springback.trigger.toq, miuix.springback.trigger.AbstractC7346k
    public boolean ld6() {
        return super.ld6();
    }

    @Override // miuix.springback.trigger.toq
    public void ltg8(SpringBackLayout springBackLayout, int i2, int i3, int i4) {
        if (i4 < 0 && y9n() && m26709c() != null && (m26709c() instanceof AbstractC7346k.zy)) {
            this.f41848e.setTranslationY(Math.max(uv6().getHeight() - m26657s().f90341toq, 0));
        }
        if (yz() && m26709c() != null && (m26709c() instanceof AbstractC7346k.toq)) {
            AbstractC7346k.toq toqVar = (AbstractC7346k.toq) m26709c();
            if (this.f90388nn86.getVisibility() == 0) {
                this.f90391yz = this.f90388nn86.getTop() + this.f90388nn86.getWidth();
                this.f90390y9n = this.f41850m.getTop();
                this.f41847b = this.f41850m.getBottom();
                float f2 = toqVar.f90341toq;
                float fMax = Math.max(0.0f, Math.min(m26711j().getHeight() / f2, 1.0f));
                float f3 = 0.5f * f2;
                float fMax2 = Math.max(0.0f, ((float) m26711j().getHeight()) < f3 ? 0.0f : Math.min((m26711j().getHeight() - f3) / f3, 1.0f));
                float fMax3 = Math.max(0.0f, ((float) m26711j().getHeight()) < f3 ? 0.0f : Math.min((m26711j().getHeight() - (0.7f * f2)) / (f2 * 0.3f), 1.0f));
                float f4 = (-this.f90388nn86.getWidth()) * (1.0f - fMax);
                this.f90388nn86.setAlpha(fMax2);
                this.f90388nn86.setScaleX(fMax);
                this.f90388nn86.setScaleY(fMax);
                this.f41850m.setAlpha(fMax3);
                this.f41850m.setTop(this.f90390y9n);
                this.f41850m.setBottom(this.f41847b);
                if (this.f41849j.getVisibility() == 0) {
                    this.f41849j.setAlpha(fMax2);
                    this.f41849j.setScaleX(fMax);
                    this.f41849j.setScaleY(fMax);
                }
                if (m26711j().getHeight() < toqVar.f90341toq) {
                    if (fMax3 > 0.0f) {
                        this.f41850m.setTranslationY(f4);
                    }
                    if (lrht() == this.f90375x9kr) {
                        this.f41850m.setText(toqVar.f41815g[0]);
                    }
                    this.f90388nn86.setBottom(this.f90391yz);
                } else if (m26711j().getHeight() >= toqVar.f90341toq) {
                    int height = this.f90391yz + (m26711j().getHeight() - toqVar.f90341toq);
                    if (this.f41849j.getVisibility() == 0 || lrht() == this.f41827l) {
                        this.f41850m.setTranslationY(0.0f);
                    } else {
                        this.f90388nn86.setBottom(height);
                        this.f41850m.setTranslationY(m26711j().getHeight() - toqVar.f90341toq);
                    }
                    if (lrht() == this.f90375x9kr) {
                        this.f41850m.setText(toqVar.f41815g[1]);
                    }
                }
            }
        }
        if (m26708b() && m26709c() != null && (m26709c() instanceof AbstractC7346k.q) && m26711j().getHeight() < m26709c().f41812k) {
            hb().setVisibility(8);
        } else if (m26708b() && m26709c() != null && (m26709c() instanceof AbstractC7346k.q) && m26711j().getHeight() >= m26709c().f41812k && hb().getVisibility() == 8) {
            hb().setVisibility(0);
            bek6(hb());
        }
        if (m26708b() && m26709c() != null && hb().getVisibility() == 0) {
            hb().offsetTopAndBottom(-i3);
        }
    }

    @Override // miuix.springback.trigger.toq, miuix.springback.trigger.AbstractC7346k
    /* JADX INFO: renamed from: n */
    public void mo26655n(AbstractC7346k.k kVar) {
        super.mo26655n(kVar);
        if (kVar instanceof AbstractC7346k.zy) {
            jz5();
            AbstractC7346k.zy zyVar = (AbstractC7346k.zy) kVar;
            etdu(this.f90387nmn5);
            b3e(this.f90389vyq, zyVar.f41822q, zyVar.f41821n);
            return;
        }
        if (kVar instanceof AbstractC7346k.toq) {
            uj2j();
            AbstractC7346k.toq toqVar = (AbstractC7346k.toq) kVar;
            v0af(this.f41852x);
            b3e(this.f90389vyq, toqVar.f41816n, toqVar.f41815g);
            return;
        }
        if (kVar instanceof AbstractC7346k.q) {
            ktq();
            sok(this.f90383ch);
        }
    }

    @Override // miuix.springback.trigger.toq, miuix.springback.trigger.AbstractC7346k
    public boolean x2(AbstractC7346k.k kVar) {
        return super.x2(kVar);
    }
}
