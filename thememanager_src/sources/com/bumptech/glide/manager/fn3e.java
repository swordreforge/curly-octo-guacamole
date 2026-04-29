package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: SupportRequestManagerFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class fn3e extends Fragment {

    /* JADX INFO: renamed from: p */
    private static final String f18861p = "SupportRMFragment";

    /* JADX INFO: renamed from: g */
    @dd
    private fn3e f18862g;

    /* JADX INFO: renamed from: k */
    private final C3145k f18863k;

    /* JADX INFO: renamed from: n */
    private final Set<fn3e> f18864n;

    /* JADX INFO: renamed from: q */
    private final ki f18865q;

    /* JADX INFO: renamed from: s */
    @dd
    private Fragment f18866s;

    /* JADX INFO: renamed from: y */
    @dd
    private com.bumptech.glide.kja0 f18867y;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.fn3e$k */
    /* JADX INFO: compiled from: SupportRequestManagerFragment.java */
    private class C3141k implements ki {
        C3141k() {
        }

        @Override // com.bumptech.glide.manager.ki
        @lvui
        /* JADX INFO: renamed from: k */
        public Set<com.bumptech.glide.kja0> mo11084k() {
            Set<fn3e> setEw = fn3e.this.ew();
            HashSet hashSet = new HashSet(setEw.size());
            for (fn3e fn3eVar : setEw) {
                if (fn3eVar.m11083w() != null) {
                    hashSet.add(fn3eVar.m11083w());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + fn3e.this + "}";
        }
    }

    public fn3e() {
        this(new C3145k());
    }

    private void kiv() {
        fn3e fn3eVar = this.f18862g;
        if (fn3eVar != null) {
            fn3eVar.ra(this);
            this.f18862g = null;
        }
    }

    @dd
    private Fragment kx3() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f18866s;
    }

    private boolean ps(@lvui Fragment fragment) {
        Fragment fragmentKx3 = kx3();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentKx3)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void r25n(fn3e fn3eVar) {
        this.f18864n.add(fn3eVar);
    }

    private void ra(fn3e fn3eVar) {
        this.f18864n.remove(fn3eVar);
    }

    @dd
    private static FragmentManager u38j(@lvui Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private void v5yj(@lvui Context context, @lvui FragmentManager fragmentManager) {
        kiv();
        fn3e fn3eVarT8r = com.bumptech.glide.zy.m11283n(context).kja0().t8r(fragmentManager);
        this.f18862g = fn3eVarT8r;
        if (equals(fn3eVarT8r)) {
            return;
        }
        this.f18862g.r25n(this);
    }

    @lvui
    Set<fn3e> ew() {
        fn3e fn3eVar = this.f18862g;
        if (fn3eVar == null) {
            return Collections.emptySet();
        }
        if (equals(fn3eVar)) {
            return Collections.unmodifiableSet(this.f18864n);
        }
        HashSet hashSet = new HashSet();
        for (fn3e fn3eVar2 : this.f18862g.ew()) {
            if (ps(fn3eVar2.kx3())) {
                hashSet.add(fn3eVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @lvui
    C3145k ix() {
        return this.f18863k;
    }

    @lvui
    public ki m2t() {
        return this.f18865q;
    }

    void nnh(@dd Fragment fragment) {
        FragmentManager fragmentManagerU38j;
        this.f18866s = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerU38j = u38j(fragment)) == null) {
            return;
        }
        v5yj(fragment.getContext(), fragmentManagerU38j);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerU38j = u38j(this);
        if (fragmentManagerU38j == null) {
            if (Log.isLoggable(f18861p, 5)) {
                Log.w(f18861p, "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                v5yj(getContext(), fragmentManagerU38j);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable(f18861p, 5)) {
                    Log.w(f18861p, "Unable to register fragment with root", e2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f18863k.zy();
        kiv();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f18866s = null;
        kiv();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f18863k.m11103q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f18863k.m11102n();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + kx3() + "}";
    }

    public void uf(@dd com.bumptech.glide.kja0 kja0Var) {
        this.f18867y = kja0Var;
    }

    @dd
    /* JADX INFO: renamed from: w */
    public com.bumptech.glide.kja0 m11083w() {
        return this.f18867y;
    }

    @SuppressLint({"ValidFragment"})
    @yz
    public fn3e(@lvui C3145k c3145k) {
        this.f18865q = new C3141k();
        this.f18864n = new HashSet();
        this.f18863k = c3145k;
    }
}
