package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.C0247k;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o1t;
import com.bumptech.glide.C2972g;
import com.bumptech.glide.C3164q;
import com.bumptech.glide.load.resource.bitmap.ni7;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: RequestManagerRetriever.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj implements Handler.Callback {

    /* JADX INFO: renamed from: c */
    private static final int f18844c = 2;

    /* JADX INFO: renamed from: e */
    private static final String f18845e = "key";

    /* JADX INFO: renamed from: f */
    private static final int f18846f = 1;

    /* JADX INFO: renamed from: j */
    private static final toq f18847j = new C3140k();

    /* JADX INFO: renamed from: l */
    private static final int f18848l = 1;

    /* JADX INFO: renamed from: r */
    private static final String f18849r = "RMRetriever";

    /* JADX INFO: renamed from: t */
    @yz
    static final String f18850t = "com.bumptech.glide.manager";

    /* JADX INFO: renamed from: g */
    private final Handler f18851g;

    /* JADX INFO: renamed from: i */
    private final ld6 f18853i;

    /* JADX INFO: renamed from: k */
    private volatile com.bumptech.glide.kja0 f18854k;

    /* JADX INFO: renamed from: y */
    private final toq f18859y;

    /* JADX INFO: renamed from: z */
    private final n7h f18860z;

    /* JADX INFO: renamed from: q */
    @yz
    final Map<FragmentManager, FragmentC3143h> f18857q = new HashMap();

    /* JADX INFO: renamed from: n */
    @yz
    final Map<androidx.fragment.app.FragmentManager, fn3e> f18855n = new HashMap();

    /* JADX INFO: renamed from: s */
    private final C0247k<View, Fragment> f18858s = new C0247k<>();

    /* JADX INFO: renamed from: p */
    private final C0247k<View, android.app.Fragment> f18856p = new C0247k<>();

    /* JADX INFO: renamed from: h */
    private final Bundle f18852h = new Bundle();

    /* JADX INFO: renamed from: com.bumptech.glide.manager.cdj$k */
    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    class C3140k implements toq {
        C3140k() {
        }

        @Override // com.bumptech.glide.manager.cdj.toq
        @lvui
        /* JADX INFO: renamed from: k */
        public com.bumptech.glide.kja0 mo10620k(@lvui com.bumptech.glide.zy zyVar, @lvui x2 x2Var, @lvui ki kiVar, @lvui Context context) {
            return new com.bumptech.glide.kja0(zyVar, x2Var, kiVar, context);
        }
    }

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public interface toq {
        @lvui
        /* JADX INFO: renamed from: k */
        com.bumptech.glide.kja0 mo10620k(@lvui com.bumptech.glide.zy zyVar, @lvui x2 x2Var, @lvui ki kiVar, @lvui Context context);
    }

    public cdj(@dd toq toqVar, C2972g c2972g) {
        toqVar = toqVar == null ? f18847j : toqVar;
        this.f18859y = toqVar;
        this.f18851g = new Handler(Looper.getMainLooper(), this);
        this.f18860z = new n7h(toqVar);
        this.f18853i = toq(c2972g);
    }

    @Deprecated
    @dd
    private android.app.Fragment f7l8(@lvui View view, @lvui Activity activity) {
        this.f18856p.clear();
        m11078q(activity.getFragmentManager(), this.f18856p);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f18856p.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f18856p.clear();
        return fragment;
    }

    private static boolean fn3e(Context context) {
        Activity activityZy = zy(context);
        return activityZy == null || !activityZy.isFinishing();
    }

    /* JADX INFO: renamed from: g */
    private static void m11073g(@dd Collection<Fragment> collection, @lvui Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m11073g(fragment.getChildFragmentManager().fnq8(), map);
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: h */
    private com.bumptech.glide.kja0 m11074h(@lvui Context context) {
        if (this.f18854k == null) {
            synchronized (this) {
                if (this.f18854k == null) {
                    this.f18854k = this.f18859y.mo10620k(com.bumptech.glide.zy.m11283n(context.getApplicationContext()), new com.bumptech.glide.manager.toq(), new C3151y(), context.getApplicationContext());
                }
            }
        }
        return this.f18854k;
    }

    @lvui
    /* JADX INFO: renamed from: i */
    private fn3e m11075i(@lvui androidx.fragment.app.FragmentManager fragmentManager, @dd Fragment fragment) {
        fn3e fn3eVar = this.f18855n.get(fragmentManager);
        if (fn3eVar != null) {
            return fn3eVar;
        }
        fn3e fn3eVar2 = (fn3e) fragmentManager.nmn5(f18850t);
        if (fn3eVar2 == null) {
            fn3eVar2 = new fn3e();
            fn3eVar2.nnh(fragment);
            this.f18855n.put(fragmentManager, fn3eVar2);
            fragmentManager.ki().f7l8(fn3eVar2, f18850t).n7h();
            this.f18851g.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return fn3eVar2;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: k */
    private static void m11076k(@lvui Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @lvui
    private FragmentC3143h ki(@lvui FragmentManager fragmentManager, @dd android.app.Fragment fragment) {
        FragmentC3143h fragmentC3143h = this.f18857q.get(fragmentManager);
        if (fragmentC3143h != null) {
            return fragmentC3143h;
        }
        FragmentC3143h fragmentC3143h2 = (FragmentC3143h) fragmentManager.findFragmentByTag(f18850t);
        if (fragmentC3143h2 == null) {
            fragmentC3143h2 = new FragmentC3143h();
            fragmentC3143h2.m11092p(fragment);
            this.f18857q.put(fragmentManager, fragmentC3143h2);
            fragmentManager.beginTransaction().add(fragmentC3143h2, f18850t).commitAllowingStateLoss();
            this.f18851g.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC3143h2;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    private void m11077n(@lvui FragmentManager fragmentManager, @lvui C0247k<View, android.app.Fragment> c0247k) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.f18852h.putInt("key", i2);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f18852h, "key");
            } catch (Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                c0247k.put(fragment.getView(), fragment);
                m11078q(fragment.getChildFragmentManager(), c0247k);
            }
            i2 = i3;
        }
    }

    private boolean ni7(androidx.fragment.app.FragmentManager fragmentManager, boolean z2) {
        fn3e fn3eVar = this.f18855n.get(fragmentManager);
        fn3e fn3eVar2 = (fn3e) fragmentManager.nmn5(f18850t);
        if (fn3eVar2 == fn3eVar) {
            return true;
        }
        if (fn3eVar2 != null && fn3eVar2.m11083w() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + fn3eVar2 + " New: " + fn3eVar);
        }
        if (z2 || fragmentManager.r8s8()) {
            if (fragmentManager.r8s8()) {
                if (Log.isLoggable(f18849r, 5)) {
                    Log.w(f18849r, "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable(f18849r, 6)) {
                Log.e(f18849r, "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            fn3eVar.ix().zy();
            return true;
        }
        o1t o1tVarF7l8 = fragmentManager.ki().f7l8(fn3eVar, f18850t);
        if (fn3eVar2 != null) {
            o1tVarF7l8.fu4(fn3eVar2);
        }
        o1tVarF7l8.mo4296h();
        this.f18851g.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
        if (Log.isLoggable(f18849r, 3)) {
            Log.d(f18849r, "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    @TargetApi(26)
    @Deprecated
    /* JADX INFO: renamed from: q */
    private void m11078q(@lvui FragmentManager fragmentManager, @lvui C0247k<View, android.app.Fragment> c0247k) {
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                c0247k.put(fragment.getView(), fragment);
                m11078q(fragment.getChildFragmentManager(), c0247k);
            }
        }
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    private com.bumptech.glide.kja0 m11079s(@lvui Context context, @lvui FragmentManager fragmentManager, @dd android.app.Fragment fragment, boolean z2) {
        FragmentC3143h fragmentC3143hKi = ki(fragmentManager, fragment);
        com.bumptech.glide.kja0 kja0VarM11091n = fragmentC3143hKi.m11091n();
        if (kja0VarM11091n == null) {
            kja0VarM11091n = this.f18859y.mo10620k(com.bumptech.glide.zy.m11283n(context), fragmentC3143hKi.zy(), fragmentC3143hKi.m11090g(), context);
            if (z2) {
                kja0VarM11091n.mo10580k();
            }
            fragmentC3143hKi.ld6(kja0VarM11091n);
        }
        return kja0VarM11091n;
    }

    private static ld6 toq(C2972g c2972g) {
        return (ni7.f18738s && ni7.f18739y) ? c2972g.toq(C3164q.f7l8.class) ? new ComponentCallbacks2C3150s() : new C3148p() : new f7l8();
    }

    @dd
    /* JADX INFO: renamed from: y */
    private Fragment m11080y(@lvui View view, @lvui ActivityC0891q activityC0891q) {
        this.f18858s.clear();
        m11073g(activityC0891q.getSupportFragmentManager().fnq8(), this.f18858s);
        View viewFindViewById = activityC0891q.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f18858s.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f18858s.clear();
        return fragment;
    }

    private boolean zurt(FragmentManager fragmentManager, boolean z2) {
        FragmentC3143h fragmentC3143h = this.f18857q.get(fragmentManager);
        FragmentC3143h fragmentC3143h2 = (FragmentC3143h) fragmentManager.findFragmentByTag(f18850t);
        if (fragmentC3143h2 == fragmentC3143h) {
            return true;
        }
        if (fragmentC3143h2 != null && fragmentC3143h2.m11091n() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + fragmentC3143h2 + " New: " + fragmentC3143h);
        }
        if (z2 || fragmentManager.isDestroyed()) {
            if (Log.isLoggable(f18849r, 5)) {
                if (fragmentManager.isDestroyed()) {
                    Log.w(f18849r, "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w(f18849r, "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            fragmentC3143h.zy().zy();
            return true;
        }
        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(fragmentC3143h, f18850t);
        if (fragmentC3143h2 != null) {
            fragmentTransactionAdd.remove(fragmentC3143h2);
        }
        fragmentTransactionAdd.commitAllowingStateLoss();
        this.f18851g.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        if (Log.isLoggable(f18849r, 3)) {
            Log.d(f18849r, "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    @dd
    private static Activity zy(@lvui Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return zy(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @lvui
    @Deprecated
    FragmentC3143h cdj(Activity activity) {
        return ki(activity.getFragmentManager(), null);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z5 = message.arg1 == 1;
        int i2 = message.what;
        Object objRemove = null;
        if (i2 != 1) {
            if (i2 != 2) {
                z3 = false;
            } else {
                androidx.fragment.app.FragmentManager fragmentManager3 = (androidx.fragment.app.FragmentManager) message.obj;
                if (ni7(fragmentManager3, z5)) {
                    objRemove = this.f18855n.remove(fragmentManager3);
                    fragmentManager = fragmentManager3;
                    z2 = true;
                    fragmentManager2 = fragmentManager;
                }
            }
            fragmentManager2 = null;
        } else {
            FragmentManager fragmentManager4 = (FragmentManager) message.obj;
            if (zurt(fragmentManager4, z5)) {
                objRemove = this.f18857q.remove(fragmentManager4);
                fragmentManager = fragmentManager4;
                z2 = true;
                fragmentManager2 = fragmentManager;
            }
            fragmentManager2 = null;
        }
        if (Log.isLoggable(f18849r, 5) && z2 && objRemove == null) {
            Log.w(f18849r, "Failed to remove expected request manager fragment, manager: " + fragmentManager2);
        }
        return z3;
    }

    @lvui
    public com.bumptech.glide.kja0 kja0(@lvui ActivityC0891q activityC0891q) {
        if (com.bumptech.glide.util.kja0.m11227i()) {
            return x2(activityC0891q.getApplicationContext());
        }
        m11076k(activityC0891q);
        this.f18853i.mo11082k(activityC0891q);
        boolean zFn3e = fn3e(activityC0891q);
        return this.f18860z.toq(activityC0891q, com.bumptech.glide.zy.m11283n(activityC0891q.getApplicationContext()), activityC0891q.getLifecycle(), activityC0891q.getSupportFragmentManager(), zFn3e);
    }

    @lvui
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.kja0 ld6(@lvui android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (com.bumptech.glide.util.kja0.m11227i()) {
            return x2(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f18853i.mo11082k(fragment.getActivity());
        }
        return m11079s(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @lvui
    public com.bumptech.glide.kja0 n7h(@lvui Fragment fragment) {
        com.bumptech.glide.util.qrj.m11261n(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.util.kja0.m11227i()) {
            return x2(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f18853i.mo11082k(fragment.getActivity());
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f18860z.toq(context, com.bumptech.glide.zy.m11283n(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: p */
    public com.bumptech.glide.kja0 m11081p(@lvui Activity activity) {
        if (com.bumptech.glide.util.kja0.m11227i()) {
            return x2(activity.getApplicationContext());
        }
        if (activity instanceof ActivityC0891q) {
            return kja0((ActivityC0891q) activity);
        }
        m11076k(activity);
        this.f18853i.mo11082k(activity);
        return m11079s(activity, activity.getFragmentManager(), null, fn3e(activity));
    }

    @lvui
    public com.bumptech.glide.kja0 qrj(@lvui View view) {
        if (com.bumptech.glide.util.kja0.m11227i()) {
            return x2(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.qrj.m11262q(view);
        com.bumptech.glide.util.qrj.m11261n(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityZy = zy(view.getContext());
        if (activityZy == null) {
            return x2(view.getContext().getApplicationContext());
        }
        if (!(activityZy instanceof ActivityC0891q)) {
            android.app.Fragment fragmentF7l8 = f7l8(view, activityZy);
            return fragmentF7l8 == null ? m11081p(activityZy) : ld6(fragmentF7l8);
        }
        ActivityC0891q activityC0891q = (ActivityC0891q) activityZy;
        Fragment fragmentM11080y = m11080y(view, activityC0891q);
        return fragmentM11080y != null ? n7h(fragmentM11080y) : kja0(activityC0891q);
    }

    @lvui
    fn3e t8r(androidx.fragment.app.FragmentManager fragmentManager) {
        return m11075i(fragmentManager, null);
    }

    @lvui
    public com.bumptech.glide.kja0 x2(@lvui Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.kja0.fn3e() && !(context instanceof Application)) {
            if (context instanceof ActivityC0891q) {
                return kja0((ActivityC0891q) context);
            }
            if (context instanceof Activity) {
                return m11081p((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return x2(contextWrapper.getBaseContext());
                }
            }
        }
        return m11074h(context);
    }
}
