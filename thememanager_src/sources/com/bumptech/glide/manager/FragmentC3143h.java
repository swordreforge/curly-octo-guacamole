package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.manager.h */
/* JADX INFO: compiled from: RequestManagerFragment.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FragmentC3143h extends Fragment {

    /* JADX INFO: renamed from: p */
    private static final String f18870p = "RMFragment";

    /* JADX INFO: renamed from: g */
    @dd
    private com.bumptech.glide.kja0 f18871g;

    /* JADX INFO: renamed from: k */
    private final C3145k f18872k;

    /* JADX INFO: renamed from: n */
    private final Set<FragmentC3143h> f18873n;

    /* JADX INFO: renamed from: q */
    private final ki f18874q;

    /* JADX INFO: renamed from: s */
    @dd
    private Fragment f18875s;

    /* JADX INFO: renamed from: y */
    @dd
    private FragmentC3143h f18876y;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.h$k */
    /* JADX INFO: compiled from: RequestManagerFragment.java */
    private class k implements ki {
        k() {
        }

        @Override // com.bumptech.glide.manager.ki
        @lvui
        /* JADX INFO: renamed from: k */
        public Set<com.bumptech.glide.kja0> mo11084k() {
            Set<FragmentC3143h> qVar = FragmentC3143h.this.toq();
            HashSet hashSet = new HashSet(qVar.size());
            for (FragmentC3143h fragmentC3143h : qVar) {
                if (fragmentC3143h.m11091n() != null) {
                    hashSet.add(fragmentC3143h.m11091n());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC3143h.this + "}";
        }
    }

    public FragmentC3143h() {
        this(new C3145k());
    }

    @TargetApi(17)
    private boolean f7l8(@lvui Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m11086k(FragmentC3143h fragmentC3143h) {
        this.f18873n.add(fragmentC3143h);
    }

    @TargetApi(17)
    @dd
    /* JADX INFO: renamed from: q */
    private Fragment m11087q() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f18875s;
    }

    /* JADX INFO: renamed from: s */
    private void m11088s(FragmentC3143h fragmentC3143h) {
        this.f18873n.remove(fragmentC3143h);
    }

    private void x2() {
        FragmentC3143h fragmentC3143h = this.f18876y;
        if (fragmentC3143h != null) {
            fragmentC3143h.m11088s(this);
            this.f18876y = null;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m11089y(@lvui Activity activity) {
        x2();
        FragmentC3143h fragmentC3143hCdj = com.bumptech.glide.zy.m11283n(activity).kja0().cdj(activity);
        this.f18876y = fragmentC3143hCdj;
        if (equals(fragmentC3143hCdj)) {
            return;
        }
        this.f18876y.m11086k(this);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public ki m11090g() {
        return this.f18874q;
    }

    public void ld6(@dd com.bumptech.glide.kja0 kja0Var) {
        this.f18871g = kja0Var;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public com.bumptech.glide.kja0 m11091n() {
        return this.f18871g;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m11089y(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable(f18870p, 5)) {
                Log.w(f18870p, "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f18872k.zy();
        x2();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        x2();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f18872k.m11103q();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f18872k.m11102n();
    }

    /* JADX INFO: renamed from: p */
    void m11092p(@dd Fragment fragment) {
        this.f18875s = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m11089y(fragment.getActivity());
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m11087q() + "}";
    }

    @lvui
    @TargetApi(17)
    Set<FragmentC3143h> toq() {
        if (equals(this.f18876y)) {
            return Collections.unmodifiableSet(this.f18873n);
        }
        if (this.f18876y == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (FragmentC3143h fragmentC3143h : this.f18876y.toq()) {
            if (f7l8(fragmentC3143h.getParentFragment())) {
                hashSet.add(fragmentC3143h);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @lvui
    C3145k zy() {
        return this.f18872k;
    }

    @SuppressLint({"ValidFragment"})
    @yz
    FragmentC3143h(@lvui C3145k c3145k) {
        this.f18874q = new k();
        this.f18873n = new HashSet();
        this.f18872k = c3145k;
    }
}
