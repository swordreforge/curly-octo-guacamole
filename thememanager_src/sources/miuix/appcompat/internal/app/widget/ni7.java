package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0096k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import androidx.viewpager.widget.AbstractC1288k;
import java.util.ArrayList;
import zy.lvui;

/* JADX INFO: compiled from: ActionBarViewPagerController.java */
/* JADX INFO: loaded from: classes3.dex */
class ni7 extends AbstractC1288k {

    /* JADX INFO: renamed from: g */
    private FragmentManager f39265g;

    /* JADX INFO: renamed from: n */
    private Context f39266n;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ArrayList<C6995k> f86923f7l8 = new ArrayList<>();

    /* JADX INFO: renamed from: y */
    private o1t f39268y = null;

    /* JADX INFO: renamed from: s */
    private Fragment f39267s = null;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ni7$k */
    /* JADX INFO: compiled from: ActionBarViewPagerController.java */
    class C6995k {

        /* JADX INFO: renamed from: g */
        boolean f39269g;

        /* JADX INFO: renamed from: k */
        String f39270k;

        /* JADX INFO: renamed from: n */
        AbstractC0096k.g f39271n;

        /* JADX INFO: renamed from: q */
        Bundle f39272q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Class<? extends Fragment> f86925toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Fragment f86926zy = null;

        C6995k(String str, Class<? extends Fragment> cls, Bundle bundle, AbstractC0096k.g gVar, boolean z2) {
            this.f39270k = str;
            this.f86925toq = cls;
            this.f39272q = bundle;
            this.f39271n = gVar;
            this.f39269g = z2;
        }
    }

    public ni7(Context context, FragmentManager fragmentManager) {
        this.f39266n = context;
        this.f39265g = fragmentManager;
    }

    private void a9() {
        o1t o1tVarKi = this.f39265g.ki();
        int size = this.f86923f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            o1tVarKi.fu4(m25226z(i2, false));
        }
        o1tVarKi.n7h();
        this.f39265g.a98o();
    }

    private void d3(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.getFragmentManager()) == null) {
            return;
        }
        o1t o1tVarKi = fragmentManager.ki();
        o1tVarKi.fu4(fragment);
        o1tVarKi.n7h();
        fragmentManager.a98o();
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void cdj(@lvui ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f39267s;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f39267s.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f39267s = fragment;
        }
    }

    int d2ok(int i2) {
        if (!mcp()) {
            return i2;
        }
        int size = this.f86923f7l8.size() - 1;
        if (size > i2) {
            return size - i2;
        }
        return 0;
    }

    void eqxt(int i2, boolean z2) {
        C6995k c6995k = this.f86923f7l8.get(d2ok(i2));
        if (c6995k.f39269g != z2) {
            c6995k.f39269g = z2;
            x2();
        }
    }

    int fti(AbstractC0096k.g gVar) {
        int size = this.f86923f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            C6995k c6995k = this.f86923f7l8.get(i2);
            if (c6995k.f39271n == gVar) {
                d3(c6995k.f86926zy);
                this.f86923f7l8.remove(i2);
                if (this.f39267s == c6995k.f86926zy) {
                    this.f39267s = null;
                }
                x2();
                return d2ok(i2);
            }
        }
        return -1;
    }

    int fu4(String str) {
        int size = this.f86923f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f86923f7l8.get(i2).f39270k.equals(str)) {
                return d2ok(i2);
            }
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: g */
    public int mo5572g(Object obj) {
        int size = this.f86923f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj == this.f86923f7l8.get(i2).f86926zy) {
                return i2;
            }
        }
        return -2;
    }

    void gvn7(int i2) {
        d3(m25226z(i2, false));
        this.f86923f7l8.remove(d2ok(i2));
        x2();
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: i */
    public void mo4275i(@lvui ViewGroup viewGroup) {
    }

    void jk() {
        a9();
        this.f86923f7l8.clear();
        this.f39267s = null;
        x2();
    }

    int jp0y(Fragment fragment) {
        int size = this.f86923f7l8.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (o1t(i2, false, false) == fragment) {
                d3(fragment);
                this.f86923f7l8.remove(i2);
                if (this.f39267s == fragment) {
                    this.f39267s = null;
                }
                x2();
                return d2ok(i2);
            }
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public boolean ld6(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    boolean mcp() {
        return this.f39266n.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: n */
    public int mo5575n() {
        return this.f86923f7l8.size();
    }

    int ni7(String str, Class<? extends Fragment> cls, Bundle bundle, AbstractC0096k.g gVar, boolean z2) {
        if (mcp()) {
            this.f86923f7l8.add(0, new C6995k(str, cls, bundle, gVar, z2));
        } else {
            this.f86923f7l8.add(new C6995k(str, cls, bundle, gVar, z2));
        }
        x2();
        return this.f86923f7l8.size() - 1;
    }

    Fragment o1t(int i2, boolean z2, boolean z3) {
        Class<? extends Fragment> cls;
        if (this.f86923f7l8.isEmpty() || i2 < 0 || i2 > this.f86923f7l8.size() - 1) {
            return null;
        }
        ArrayList<C6995k> arrayList = this.f86923f7l8;
        if (z3) {
            i2 = d2ok(i2);
        }
        C6995k c6995k = arrayList.get(i2);
        if (c6995k.f86926zy == null) {
            Fragment fragmentNmn5 = this.f39265g.nmn5(c6995k.f39270k);
            c6995k.f86926zy = fragmentNmn5;
            if (fragmentNmn5 == null && z2 && (cls = c6995k.f86925toq) != null) {
                c6995k.f86926zy = Fragment.instantiate(this.f39266n, cls.getName(), c6995k.f39272q);
                c6995k.f86925toq = null;
                c6995k.f39272q = null;
            }
        }
        return c6995k.f86926zy;
    }

    void oc(String str, int i2, Class<? extends Fragment> cls, Bundle bundle, AbstractC0096k.g gVar, boolean z2) {
        d3(m25226z(i2, false));
        this.f86923f7l8.remove(d2ok(i2));
        C6995k c6995k = new C6995k(str, cls, bundle, gVar, z2);
        if (!mcp()) {
            this.f86923f7l8.add(i2, c6995k);
        } else if (i2 >= this.f86923f7l8.size()) {
            this.f86923f7l8.add(0, c6995k);
        } else {
            this.f86923f7l8.add(d2ok(i2) + 1, c6995k);
        }
        x2();
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: p */
    public Object mo4276p(ViewGroup viewGroup, int i2) {
        if (this.f39268y == null) {
            this.f39268y = this.f39265g.ki();
        }
        Fragment fragmentO1t = o1t(i2, true, false);
        if (fragmentO1t.getFragmentManager() != null) {
            this.f39268y.x2(fragmentO1t);
        } else {
            this.f39268y.zy(viewGroup.getId(), fragmentO1t, this.f86923f7l8.get(i2).f39270k);
        }
        if (fragmentO1t != this.f39267s) {
            fragmentO1t.setMenuVisibility(false);
            fragmentO1t.setUserVisibleHint(false);
        }
        return fragmentO1t;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: q */
    public void mo4277q(@lvui ViewGroup viewGroup) {
        o1t o1tVar = this.f39268y;
        if (o1tVar != null) {
            o1tVar.n7h();
            this.f39268y = null;
            this.f39265g.a98o();
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m25225t(int i2) {
        if (i2 < 0 || i2 >= this.f86923f7l8.size()) {
            return false;
        }
        return this.f86923f7l8.get(i2).f39269g;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(@lvui ViewGroup viewGroup, int i2, Object obj) {
        if (this.f39268y == null) {
            this.f39268y = this.f39265g.ki();
        }
        this.f39268y.ki((Fragment) obj);
    }

    AbstractC0096k.g wvg(int i2) {
        return this.f86923f7l8.get(i2).f39271n;
    }

    /* JADX INFO: renamed from: z */
    Fragment m25226z(int i2, boolean z2) {
        return o1t(i2, z2, true);
    }

    int zurt(String str, int i2, Class<? extends Fragment> cls, Bundle bundle, AbstractC0096k.g gVar, boolean z2) {
        C6995k c6995k = new C6995k(str, cls, bundle, gVar, z2);
        if (!mcp()) {
            this.f86923f7l8.add(i2, c6995k);
        } else if (i2 >= this.f86923f7l8.size()) {
            this.f86923f7l8.add(0, c6995k);
        } else {
            this.f86923f7l8.add(d2ok(i2) + 1, c6995k);
        }
        x2();
        return i2;
    }
}
