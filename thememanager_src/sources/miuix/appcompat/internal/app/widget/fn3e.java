package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0096k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import androidx.viewpager.widget.OriginalViewPager;
import gb.toq;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.internal.app.widget.C6998s;
import miuix.internal.util.C7162g;
import miuix.springback.view.SpringBackLayout;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: ActionBarViewPagerController.java */
/* JADX INFO: loaded from: classes3.dex */
public class fn3e {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private AbstractC0096k.f7l8 f86914f7l8 = new C6988k();

    /* JADX INFO: renamed from: g */
    private ArrayList<AbstractC6946k.k> f39236g;

    /* JADX INFO: renamed from: k */
    private C6998s f39237k;

    /* JADX INFO: renamed from: n */
    private ni7 f39238n;

    /* JADX INFO: renamed from: q */
    private View f39239q;

    /* JADX INFO: renamed from: s */
    private ObjectAnimator f39240s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ViewPager f86915toq;

    /* JADX INFO: renamed from: y */
    private zy f39241y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private SpringBackLayout f86916zy;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.fn3e$k */
    /* JADX INFO: compiled from: ActionBarViewPagerController.java */
    class C6988k implements AbstractC0096k.f7l8 {
        C6988k() {
        }

        @Override // androidx.appcompat.app.AbstractC0096k.f7l8
        public void fn3e(AbstractC0096k.g gVar, o1t o1tVar) {
        }

        @Override // androidx.appcompat.app.AbstractC0096k.f7l8
        /* JADX INFO: renamed from: p */
        public void mo201p(AbstractC0096k.g gVar, o1t o1tVar) {
            int iMo5575n = fn3e.this.f39238n.mo5575n();
            for (int i2 = 0; i2 < iMo5575n; i2++) {
                if (fn3e.this.f39238n.wvg(i2) == gVar) {
                    fn3e.this.f86915toq.setCurrentItem(i2, gVar instanceof C6998s.y ? ((C6998s.y) gVar).f39302p : true);
                    return;
                }
            }
        }

        @Override // androidx.appcompat.app.AbstractC0096k.f7l8
        /* JADX INFO: renamed from: z */
        public void mo202z(AbstractC0096k.g gVar, o1t o1tVar) {
        }
    }

    /* JADX INFO: compiled from: ActionBarViewPagerController.java */
    class toq implements OriginalViewPager.InterfaceC1274p {

        /* JADX INFO: renamed from: k */
        C6989q f39247k = new C6989q(null);

        toq() {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        /* JADX INFO: renamed from: k */
        public void mo5546k(int i2) {
            if (fn3e.this.f39236g != null) {
                Iterator it = fn3e.this.f39236g.iterator();
                while (it.hasNext()) {
                    ((AbstractC6946k.k) it.next()).mo6476k(i2);
                }
            }
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void toq(int i2) {
            int iD2ok = fn3e.this.f39238n.d2ok(i2);
            fn3e.this.f39237k.mo172u(iD2ok);
            fn3e.this.f39238n.cdj(fn3e.this.f86915toq, i2, fn3e.this.f39238n.o1t(i2, false, false));
            if (fn3e.this.f39236g != null) {
                Iterator it = fn3e.this.f39236g.iterator();
                while (it.hasNext()) {
                    ((AbstractC6946k.k) it.next()).toq(iD2ok);
                }
            }
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void zy(int i2, float f2, int i3) {
            this.f39247k.m25218q(i2, f2);
            if (this.f39247k.f86919zy || fn3e.this.f39236g == null) {
                return;
            }
            boolean zM25225t = fn3e.this.f39238n.m25225t(this.f39247k.f39245n);
            boolean zM25225t2 = fn3e.this.f39238n.m25225t(this.f39247k.f39243g);
            if (fn3e.this.f39238n.mcp()) {
                i2 = fn3e.this.f39238n.d2ok(i2);
                if (!this.f39247k.f39246q) {
                    i2--;
                    f2 = 1.0f - f2;
                }
            }
            Iterator it = fn3e.this.f39236g.iterator();
            while (it.hasNext()) {
                ((AbstractC6946k.k) it.next()).d3(i2, f2, zM25225t, zM25225t2);
            }
        }
    }

    /* JADX INFO: compiled from: ActionBarViewPagerController.java */
    class zy {

        /* JADX INFO: renamed from: k */
        private int f39248k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f86921toq;

        zy() {
        }

        /* JADX INFO: renamed from: k */
        void m25219k(int i2, boolean z2) {
            this.f39248k = i2;
            this.f86921toq = z2;
        }

        public void toq(float f2) {
            if (fn3e.this.f39236g != null) {
                for (AbstractC6946k.k kVar : fn3e.this.f39236g) {
                    if (kVar instanceof ActionBarContainer) {
                        boolean z2 = this.f86921toq;
                        kVar.d3(this.f39248k, 1.0f - f2, z2, !z2);
                    }
                }
            }
        }
    }

    fn3e(C6998s c6998s, FragmentManager fragmentManager, androidx.lifecycle.kja0 kja0Var, boolean z2) {
        this.f39237k = c6998s;
        ActionBarOverlayLayout actionBarOverlayLayoutAb = c6998s.ab();
        Context context = actionBarOverlayLayoutAb.getContext();
        int i2 = toq.C6054p.xx;
        View viewFindViewById = actionBarOverlayLayoutAb.findViewById(i2);
        if (viewFindViewById instanceof ViewPager) {
            this.f86915toq = (ViewPager) viewFindViewById;
        } else {
            ViewPager viewPager = new ViewPager(context);
            this.f86915toq = viewPager;
            viewPager.setId(i2);
            SpringBackLayout springBackLayout = new SpringBackLayout(context);
            this.f86916zy = springBackLayout;
            springBackLayout.setScrollOrientation(5);
            springBackLayout.addView(this.f86915toq, new OriginalViewPager.f7l8());
            springBackLayout.setTarget(this.f86915toq);
            springBackLayout.setSpringBackEnable(this.f86915toq.nn86());
            ((ViewGroup) actionBarOverlayLayoutAb.findViewById(R.id.content)).addView(springBackLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        ni7 ni7Var = new ni7(context, fragmentManager);
        this.f39238n = ni7Var;
        this.f86915toq.setAdapter(ni7Var);
        this.f86915toq.zy(new toq());
        if (z2 && C7162g.m25943k()) {
            f7l8(new fu4(this.f86915toq, this.f39238n));
        }
    }

    void cdj(String str, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z2) {
        this.f39237k.zma(i2);
        this.f39238n.oc(str, i2, cls, bundle, this.f39237k.mo176z(i2), z2);
    }

    void f7l8(AbstractC6946k.k kVar) {
        if (this.f39236g == null) {
            this.f39236g = new ArrayList<>();
        }
        this.f39236g.add(kVar);
    }

    void fn3e(int i2) {
        this.f86915toq.setOffscreenPageLimit(i2);
    }

    /* JADX INFO: renamed from: g */
    int m25210g(String str, AbstractC0096k.g gVar, Class<? extends Fragment> cls, Bundle bundle, boolean z2) {
        ((C6998s.y) gVar).fn3e(this.f86914f7l8);
        this.f39237k.i1an(gVar);
        int iNi7 = this.f39238n.ni7(str, cls, bundle, gVar, z2);
        if (this.f39238n.mcp()) {
            this.f86915toq.setCurrentItem(this.f39238n.mo5575n() - 1);
        }
        return iNi7;
    }

    /* JADX INFO: renamed from: h */
    void m25211h(AbstractC6946k.k kVar) {
        ArrayList<AbstractC6946k.k> arrayList = this.f39236g;
        if (arrayList != null) {
            arrayList.remove(kVar);
        }
    }

    /* JADX INFO: renamed from: i */
    void m25212i(boolean z2) {
        this.f86915toq.setDraggable(z2);
        SpringBackLayout springBackLayout = this.f86916zy;
        if (springBackLayout != null) {
            springBackLayout.setSpringBackEnable(z2);
        }
    }

    void ki(int i2, boolean z2) {
        this.f39238n.eqxt(i2, z2);
        if (i2 == this.f86915toq.getCurrentItem()) {
            if (this.f39241y == null) {
                zy zyVar = new zy();
                this.f39241y = zyVar;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(zyVar, "Value", 0.0f, 1.0f);
                this.f39240s = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(C7162g.m25943k() ? this.f86915toq.getContext().getResources().getInteger(R.integer.config_shortAnimTime) : 0L);
            }
            this.f39241y.m25219k(i2, z2);
            this.f39240s.start();
        }
    }

    void kja0(String str) {
        int iFu4 = this.f39238n.fu4(str);
        if (iFu4 >= 0) {
            qrj(iFu4);
        }
    }

    void ld6() {
        this.f39237k.wwp();
        this.f39238n.jk();
    }

    /* JADX INFO: renamed from: n */
    int m25213n(String str, AbstractC0096k.g gVar, int i2, Class<? extends Fragment> cls, Bundle bundle, boolean z2) {
        ((C6998s.y) gVar).fn3e(this.f86914f7l8);
        this.f39237k.uo(gVar, i2);
        int iZurt = this.f39238n.zurt(str, i2, cls, bundle, gVar, z2);
        if (this.f39238n.mcp()) {
            this.f86915toq.setCurrentItem(this.f39238n.mo5575n() - 1);
        }
        return iZurt;
    }

    void n7h(AbstractC0096k.g gVar) {
        this.f39237k.zuf(gVar);
        this.f39238n.fti(gVar);
    }

    /* JADX INFO: renamed from: p */
    int m25214p() {
        return this.f86915toq.getOffscreenPageLimit();
    }

    void qrj(int i2) {
        this.f39238n.gvn7(i2);
        this.f39237k.sc(i2);
    }

    /* JADX INFO: renamed from: s */
    int m25215s() {
        return this.f39238n.mo5575n();
    }

    void t8r(View view) {
        View view2 = this.f39239q;
        if (view2 != null) {
            this.f86915toq.removeView(view2);
        }
        if (view != null) {
            this.f39239q = view;
            OriginalViewPager.f7l8 f7l8Var = new OriginalViewPager.f7l8();
            f7l8Var.f6964k = true;
            this.f86915toq.addView(this.f39239q, -1, f7l8Var);
        }
    }

    void x2(Fragment fragment) {
        int iJp0y = this.f39238n.jp0y(fragment);
        if (iJp0y >= 0) {
            this.f39237k.sc(iJp0y);
        }
    }

    /* JADX INFO: renamed from: y */
    Fragment m25216y(int i2) {
        return this.f39238n.m25226z(i2, true);
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.fn3e$q */
    /* JADX INFO: compiled from: ActionBarViewPagerController.java */
    private static class C6989q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final float f86917f7l8 = 1.0E-4f;

        /* JADX INFO: renamed from: g */
        int f39243g;

        /* JADX INFO: renamed from: k */
        private int f39244k;

        /* JADX INFO: renamed from: n */
        int f39245n;

        /* JADX INFO: renamed from: q */
        boolean f39246q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f86918toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f86919zy;

        private C6989q() {
            this.f39244k = -1;
        }

        /* JADX INFO: renamed from: k */
        private void m25217k(int i2, float f2) {
            this.f86919zy = false;
            boolean z2 = f2 > this.f86918toq;
            this.f39245n = z2 ? i2 : i2 + 1;
            if (z2) {
                i2++;
            }
            this.f39243g = i2;
        }

        private void toq() {
            this.f39245n = this.f39243g;
            this.f39244k = -1;
            this.f86918toq = 0.0f;
            this.f39246q = true;
        }

        private void zy(int i2, float f2) {
            this.f39244k = i2;
            this.f86918toq = f2;
            this.f86919zy = true;
            this.f39246q = false;
        }

        /* JADX INFO: renamed from: q */
        void m25218q(int i2, float f2) {
            if (f2 < 1.0E-4f) {
                toq();
            } else if (this.f39244k != i2) {
                zy(i2, f2);
            } else if (this.f86919zy) {
                m25217k(i2, f2);
            }
        }

        /* synthetic */ C6989q(C6988k c6988k) {
            this();
        }
    }
}
