package com.airbnb.lottie.model;

import androidx.collection.ld6;
import zy.dd;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: LottieCompositionCache.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class f7l8 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final f7l8 f56026toq = new f7l8();

    /* JADX INFO: renamed from: k */
    private final ld6<String, com.airbnb.lottie.ld6> f8050k = new ld6<>(20);

    @yz
    f7l8() {
    }

    public static f7l8 zy() {
        return f56026toq;
    }

    /* JADX INFO: renamed from: k */
    public void m6057k() {
        this.f8050k.m841q();
    }

    /* JADX INFO: renamed from: n */
    public void m6058n(int i2) {
        this.f8050k.qrj(i2);
    }

    /* JADX INFO: renamed from: q */
    public void m6059q(@dd String str, com.airbnb.lottie.ld6 ld6Var) {
        if (str == null) {
            return;
        }
        this.f8050k.m840p(str, ld6Var);
    }

    @dd
    public com.airbnb.lottie.ld6 toq(@dd String str) {
        if (str == null) {
            return null;
        }
        return this.f8050k.m836g(str);
    }
}
