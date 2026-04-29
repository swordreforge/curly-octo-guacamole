package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.manager.cdj;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.lvui;

/* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
/* JADX INFO: loaded from: classes2.dex */
final class n7h {

    /* JADX INFO: renamed from: k */
    final Map<androidx.lifecycle.kja0, com.bumptech.glide.kja0> f18903k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final cdj.toq f62988toq;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n7h$k */
    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    class C3147k implements qrj {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ androidx.lifecycle.kja0 f18904k;

        C3147k(androidx.lifecycle.kja0 kja0Var) {
            this.f18904k = kja0Var;
        }

        @Override // com.bumptech.glide.manager.qrj
        /* JADX INFO: renamed from: k */
        public void mo10580k() {
        }

        @Override // com.bumptech.glide.manager.qrj
        public void onDestroy() {
            n7h.this.f18903k.remove(this.f18904k);
        }

        @Override // com.bumptech.glide.manager.qrj
        public void onStop() {
        }
    }

    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    private final class toq implements ki {

        /* JADX INFO: renamed from: k */
        private final FragmentManager f18906k;

        toq(FragmentManager fragmentManager) {
            this.f18906k = fragmentManager;
        }

        private void toq(FragmentManager fragmentManager, Set<com.bumptech.glide.kja0> set) {
            List<Fragment> listFnq8 = fragmentManager.fnq8();
            int size = listFnq8.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = listFnq8.get(i2);
                toq(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.kja0 kja0VarM11105k = n7h.this.m11105k(fragment.getLifecycle());
                if (kja0VarM11105k != null) {
                    set.add(kja0VarM11105k);
                }
            }
        }

        @Override // com.bumptech.glide.manager.ki
        @lvui
        /* JADX INFO: renamed from: k */
        public Set<com.bumptech.glide.kja0> mo11084k() {
            HashSet hashSet = new HashSet();
            toq(this.f18906k, hashSet);
            return hashSet;
        }
    }

    n7h(@lvui cdj.toq toqVar) {
        this.f62988toq = toqVar;
    }

    /* JADX INFO: renamed from: k */
    com.bumptech.glide.kja0 m11105k(androidx.lifecycle.kja0 kja0Var) {
        com.bumptech.glide.util.kja0.toq();
        return this.f18903k.get(kja0Var);
    }

    com.bumptech.glide.kja0 toq(Context context, com.bumptech.glide.zy zyVar, androidx.lifecycle.kja0 kja0Var, FragmentManager fragmentManager, boolean z2) {
        com.bumptech.glide.util.kja0.toq();
        com.bumptech.glide.kja0 kja0VarM11105k = m11105k(kja0Var);
        if (kja0VarM11105k != null) {
            return kja0VarM11105k;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(kja0Var);
        com.bumptech.glide.kja0 kja0VarMo10620k = this.f62988toq.mo10620k(zyVar, lifecycleLifecycle, new toq(fragmentManager), context);
        this.f18903k.put(kja0Var, kja0VarMo10620k);
        lifecycleLifecycle.toq(new C3147k(kja0Var));
        if (z2) {
            kja0VarMo10620k.mo10580k();
        }
        return kja0VarMo10620k;
    }
}
