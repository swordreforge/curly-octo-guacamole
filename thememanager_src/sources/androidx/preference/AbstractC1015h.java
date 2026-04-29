package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.InterfaceC0051n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.C0683f;
import androidx.fragment.app.C0903y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import androidx.lifecycle.InterfaceC0954z;
import androidx.preference.fn3e;
import androidx.preference.qrj;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.android.thememanager.util.hb;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.C5693g;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import vy.C7718q;
import zy.InterfaceC7842s;

/* JADX INFO: renamed from: androidx.preference.h */
/* JADX INFO: compiled from: PreferenceHeaderFragmentCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0017J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J\b\u0010\u001c\u001a\u00020\u000eH&J\u001a\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J\u0012\u0010\u001f\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0001H\u0016R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/preference/h;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/qrj$g;", "Landroid/view/LayoutInflater;", "inflater", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "ix", "Landroidx/preference/Preference;", "header", "Lkotlin/was;", "v5yj", "Landroid/content/Intent;", C7718q.f97043a9, "ps", "Landroidx/preference/qrj;", "caller", "pref", "", "uc", "Landroid/content/Context;", "context", "onAttach", "Landroid/view/ViewGroup;", C3678q.f65827lrht, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "m2t", C5693g.ae, "onViewCreated", "onViewStateRestored", AnimatedProperty.PROPERTY_NAME_W, "Landroidx/activity/zy;", "k", "Landroidx/activity/zy;", "onBackPressedCallback", "kx3", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", C4991s.f28129n, "()V", "preference_release"}, m22787k = 1, mv = {1, 6, 0})
public abstract class AbstractC1015h extends Fragment implements qrj.InterfaceC1028g {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private androidx.activity.zy f5543k;

    /* JADX INFO: renamed from: androidx.preference.h$k */
    /* JADX INFO: compiled from: PreferenceHeaderFragmentCompat.kt */
    @d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/preference/h$k;", "Landroidx/activity/zy;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$g;", "Lkotlin/was;", "n", "Landroid/view/View;", "panel", "", "slideOffset", "zy", "k", "toq", "Landroidx/preference/h;", "Landroidx/preference/h;", "caller", C4991s.f28129n, "(Landroidx/preference/h;)V", "preference_release"}, m22787k = 1, mv = {1, 6, 0})
    private static final class k extends androidx.activity.zy implements SlidingPaneLayout.InterfaceC1161g {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final AbstractC1015h f51964zy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@InterfaceC7396q AbstractC1015h caller) {
            super(true);
            d2ok.m23075h(caller, "caller");
            this.f51964zy = caller;
            caller.kx3().m5251k(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.InterfaceC1161g
        /* JADX INFO: renamed from: k */
        public void mo4685k(@InterfaceC7396q View panel) {
            d2ok.m23075h(panel, "panel");
            m89s(true);
        }

        @Override // androidx.activity.zy
        /* JADX INFO: renamed from: n */
        public void mo21n() {
            this.f51964zy.kx3().m5252q();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.InterfaceC1161g
        public void toq(@InterfaceC7396q View panel) {
            d2ok.m23075h(panel, "panel");
            m89s(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.InterfaceC1161g
        public void zy(@InterfaceC7396q View panel, float f2) {
            d2ok.m23075h(panel, "panel");
        }
    }

    /* JADX INFO: renamed from: androidx.preference.h$toq */
    /* JADX INFO: compiled from: View.kt */
    @d3(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", C5693g.ae, "", "left", "top", "right", hb.f61266fu4, "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/was;", "onLayoutChange", "core-ktx_release", "androidx/core/view/bo$zy"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq implements View.OnLayoutChangeListener {
        public toq() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@InterfaceC7396q View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            d2ok.cdj(view, "view");
            view.removeOnLayoutChangeListener(this);
            androidx.activity.zy zyVar = AbstractC1015h.this.f5543k;
            d2ok.qrj(zyVar);
            zyVar.m89s(AbstractC1015h.this.kx3().kja0() && AbstractC1015h.this.kx3().isOpen());
        }
    }

    private final SlidingPaneLayout ix(LayoutInflater layoutInflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(fn3e.C1007g.f5464q);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(fn3e.C1007g.f51769zy);
        SlidingPaneLayout.C1163n c1163n = new SlidingPaneLayout.C1163n(getResources().getDimensionPixelSize(fn3e.C1011q.f51948f7l8), -1);
        c1163n.f6323k = getResources().getInteger(fn3e.f7l8.f51766toq);
        slidingPaneLayout.addView(fragmentContainerView, c1163n);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(fn3e.C1007g.f51768toq);
        SlidingPaneLayout.C1163n c1163n2 = new SlidingPaneLayout.C1163n(getResources().getDimensionPixelSize(fn3e.C1011q.f5524g), -1);
        c1163n2.f6323k = getResources().getInteger(fn3e.f7l8.f5460k);
        slidingPaneLayout.addView(fragmentContainerView2, c1163n2);
        return slidingPaneLayout;
    }

    private final void ps(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u38j(AbstractC1015h this$0) {
        d2ok.m23075h(this$0, "this$0");
        androidx.activity.zy zyVar = this$0.f5543k;
        d2ok.qrj(zyVar);
        zyVar.m89s(this$0.getChildFragmentManager().xwq3() == 0);
    }

    private final void v5yj(Preference preference) {
        if (preference.m4652h() == null) {
            ps(preference.m4653i());
            return;
        }
        String strM4652h = preference.m4652h();
        Fragment fragmentMo4213k = strM4652h == null ? null : getChildFragmentManager().vq().mo4213k(requireContext().getClassLoader(), strM4652h);
        if (fragmentMo4213k != null) {
            fragmentMo4213k.setArguments(preference.n7h());
        }
        if (getChildFragmentManager().xwq3() > 0) {
            FragmentManager.ld6 ld6VarDr = getChildFragmentManager().dr(0);
            d2ok.kja0(ld6VarDr, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().cv06(ld6VarDr.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        d2ok.kja0(childFragmentManager, "childFragmentManager");
        o1t o1tVarKi = childFragmentManager.ki();
        d2ok.kja0(o1tVarKi, "beginTransaction()");
        o1tVarKi.lvui(true);
        int i2 = fn3e.C1007g.f51768toq;
        d2ok.qrj(fragmentMo4213k);
        o1tVarKi.m4317z(i2, fragmentMo4213k);
        if (kx3().isOpen()) {
            o1tVarKi.m4313r(4099);
        }
        kx3().ki();
        o1tVarKi.qrj();
    }

    @InterfaceC7396q
    public final SlidingPaneLayout kx3() {
        return (SlidingPaneLayout) requireView();
    }

    @InterfaceC7396q
    public abstract qrj m2t();

    @Override // androidx.fragment.app.Fragment
    @InterfaceC7842s
    public void onAttach(@InterfaceC7396q Context context) {
        d2ok.m23075h(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        d2ok.kja0(parentFragmentManager, "parentFragmentManager");
        o1t o1tVarKi = parentFragmentManager.ki();
        d2ok.kja0(o1tVarKi, "beginTransaction()");
        o1tVarKi.d2ok(this);
        o1tVarKi.qrj();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC7396q
    @InterfaceC7842s
    public View onCreateView(@InterfaceC7396q LayoutInflater inflater, @InterfaceC7395n ViewGroup viewGroup, @InterfaceC7395n Bundle bundle) {
        d2ok.m23075h(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayoutIx = ix(inflater);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i2 = fn3e.C1007g.f51769zy;
        if (childFragmentManager.ch(i2) == null) {
            qrj qrjVarM2t = m2t();
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            d2ok.kja0(childFragmentManager2, "childFragmentManager");
            o1t o1tVarKi = childFragmentManager2.ki();
            d2ok.kja0(o1tVarKi, "beginTransaction()");
            o1tVarKi.lvui(true);
            o1tVarKi.toq(i2, qrjVarM2t);
            o1tVarKi.qrj();
        }
        slidingPaneLayoutIx.setLockMode(3);
        return slidingPaneLayoutIx;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC7842s
    public void onViewCreated(@InterfaceC7396q View view, @InterfaceC7395n Bundle bundle) {
        d2ok.m23075h(view, "view");
        super.onViewCreated(view, bundle);
        this.f5543k = new k(this);
        SlidingPaneLayout slidingPaneLayoutKx3 = kx3();
        if (!C0683f.v0af(slidingPaneLayoutKx3) || slidingPaneLayoutKx3.isLayoutRequested()) {
            slidingPaneLayoutKx3.addOnLayoutChangeListener(new toq());
        } else {
            androidx.activity.zy zyVar = this.f5543k;
            d2ok.qrj(zyVar);
            zyVar.m89s(kx3().kja0() && kx3().isOpen());
        }
        getChildFragmentManager().qrj(new FragmentManager.kja0() { // from class: androidx.preference.kja0
            @Override // androidx.fragment.app.FragmentManager.kja0
            public final void onBackStackChanged() {
                AbstractC1015h.u38j(this.f5562k);
            }
        });
        Object objRequireContext = requireContext();
        InterfaceC0051n interfaceC0051n = objRequireContext instanceof InterfaceC0051n ? (InterfaceC0051n) objRequireContext : null;
        if (interfaceC0051n == null) {
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = interfaceC0051n.getOnBackPressedDispatcher();
        InterfaceC0954z viewLifecycleOwner = getViewLifecycleOwner();
        androidx.activity.zy zyVar2 = this.f5543k;
        d2ok.qrj(zyVar2);
        onBackPressedDispatcher.toq(viewLifecycleOwner, zyVar2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@InterfaceC7395n Bundle bundle) {
        Fragment fragmentM4684w;
        super.onViewStateRestored(bundle);
        if (bundle != null || (fragmentM4684w = m4684w()) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        d2ok.kja0(childFragmentManager, "childFragmentManager");
        o1t o1tVarKi = childFragmentManager.ki();
        d2ok.kja0(o1tVarKi, "beginTransaction()");
        o1tVarKi.lvui(true);
        o1tVarKi.m4317z(fn3e.C1007g.f51768toq, fragmentM4684w);
        o1tVarKi.qrj();
    }

    @Override // androidx.preference.qrj.InterfaceC1028g
    @InterfaceC7842s
    public boolean uc(@InterfaceC7396q qrj caller, @InterfaceC7396q Preference pref) {
        d2ok.m23075h(caller, "caller");
        d2ok.m23075h(pref, "pref");
        if (caller.getId() == fn3e.C1007g.f51769zy) {
            v5yj(pref);
            return true;
        }
        int id = caller.getId();
        int i2 = fn3e.C1007g.f51768toq;
        if (id != i2) {
            return false;
        }
        C0903y c0903yVq = getChildFragmentManager().vq();
        ClassLoader classLoader = requireContext().getClassLoader();
        String strM4652h = pref.m4652h();
        d2ok.qrj(strM4652h);
        Fragment fragmentMo4213k = c0903yVq.mo4213k(classLoader, strM4652h);
        d2ok.kja0(fragmentMo4213k, "childFragmentManager.fra….fragment!!\n            )");
        fragmentMo4213k.setArguments(pref.n7h());
        FragmentManager childFragmentManager = getChildFragmentManager();
        d2ok.kja0(childFragmentManager, "childFragmentManager");
        o1t o1tVarKi = childFragmentManager.ki();
        d2ok.kja0(o1tVarKi, "beginTransaction()");
        o1tVarKi.lvui(true);
        o1tVarKi.m4317z(i2, fragmentMo4213k);
        o1tVarKi.m4313r(4099);
        o1tVarKi.ld6(null);
        o1tVarKi.qrj();
        return true;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: w */
    public Fragment m4684w() {
        Fragment fragmentCh = getChildFragmentManager().ch(fn3e.C1007g.f51769zy);
        if (fragmentCh == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        }
        qrj qrjVar = (qrj) fragmentCh;
        if (qrjVar.getPreferenceScreen().uc() <= 0) {
            return null;
        }
        int i2 = 0;
        int iUc = qrjVar.getPreferenceScreen().uc();
        while (i2 < iUc) {
            int i3 = i2 + 1;
            Preference preferenceYl = qrjVar.getPreferenceScreen().yl(i2);
            d2ok.kja0(preferenceYl, "headerFragment.preferenc…reen.getPreference(index)");
            if (preferenceYl.m4652h() != null) {
                String strM4652h = preferenceYl.m4652h();
                if (strM4652h == null) {
                    return null;
                }
                return getChildFragmentManager().vq().mo4213k(requireContext().getClassLoader(), strM4652h);
            }
            i2 = i3;
        }
        return null;
    }
}
