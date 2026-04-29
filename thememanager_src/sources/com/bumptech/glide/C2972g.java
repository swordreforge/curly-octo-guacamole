package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.bumptech.glide.g */
/* JADX INFO: compiled from: GlideExperiments.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2972g {

    /* JADX INFO: renamed from: k */
    private final Map<Class<?>, toq> f17925k;

    /* JADX INFO: renamed from: com.bumptech.glide.g$k */
    /* JADX INFO: compiled from: GlideExperiments.java */
    static final class k {

        /* JADX INFO: renamed from: k */
        private final Map<Class<?>, toq> f17926k = new HashMap();

        k() {
        }

        /* JADX INFO: renamed from: q */
        k m10583q(toq toqVar, boolean z2) {
            if (z2) {
                toq(toqVar);
            } else {
                this.f17926k.remove(toqVar.getClass());
            }
            return this;
        }

        k toq(toq toqVar) {
            this.f17926k.put(toqVar.getClass(), toqVar);
            return this;
        }

        C2972g zy() {
            return new C2972g(this);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.g$toq */
    /* JADX INFO: compiled from: GlideExperiments.java */
    interface toq {
    }

    C2972g(k kVar) {
        this.f17925k = Collections.unmodifiableMap(new HashMap(kVar.f17926k));
    }

    @dd
    /* JADX INFO: renamed from: k */
    <T extends toq> T m10581k(Class<T> cls) {
        return (T) this.f17925k.get(cls);
    }

    public boolean toq(Class<? extends toq> cls) {
        return this.f17925k.containsKey(cls);
    }
}
