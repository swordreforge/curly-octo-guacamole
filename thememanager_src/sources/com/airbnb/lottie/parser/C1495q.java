package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.C1442g;
import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.model.animatable.C1445p;
import com.airbnb.lottie.model.animatable.C1446q;
import com.airbnb.lottie.model.animatable.C1448y;
import com.airbnb.lottie.utils.C1512y;
import com.airbnb.lottie.value.C1515k;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.q */
/* JADX INFO: compiled from: AnimatableValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C1495q {
    private C1495q() {
    }

    static com.airbnb.lottie.model.animatable.zy f7l8(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, int i2) throws IOException {
        return new com.airbnb.lottie.model.animatable.zy(toq(zyVar, ld6Var, new kja0(i2)));
    }

    /* JADX INFO: renamed from: g */
    public static com.airbnb.lottie.model.animatable.toq m6190g(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, boolean z2) throws IOException {
        return new com.airbnb.lottie.model.animatable.toq(m6191k(zyVar, z2 ? C1512y.m6260n() : 1.0f, ld6Var, x2.f8231k));
    }

    /* JADX INFO: renamed from: k */
    private static <T> List<C1515k<T>> m6191k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2, com.airbnb.lottie.ld6 ld6Var, InterfaceC1496r<T> interfaceC1496r) throws IOException {
        return fn3e.m6144k(zyVar, ld6Var, f2, interfaceC1496r, false);
    }

    static C1448y ld6(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return new C1448y(m6191k(zyVar, C1512y.m6260n(), ld6Var, gvn7.f8146k));
    }

    /* JADX INFO: renamed from: n */
    public static com.airbnb.lottie.model.animatable.toq m6192n(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return m6190g(zyVar, ld6Var, true);
    }

    /* JADX INFO: renamed from: p */
    static com.airbnb.lottie.model.animatable.f7l8 m6193p(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return new com.airbnb.lottie.model.animatable.f7l8((List<C1515k<com.airbnb.lottie.value.ld6>>) toq(zyVar, ld6Var, jp0y.f8152k));
    }

    /* JADX INFO: renamed from: q */
    static C1445p m6194q(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return new C1445p(toq(zyVar, ld6Var, C1497s.f8225k));
    }

    /* JADX INFO: renamed from: s */
    static C1442g m6195s(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return new C1442g(fn3e.m6144k(zyVar, ld6Var, C1512y.m6260n(), C1498t.f8226k, true));
    }

    private static <T> List<C1515k<T>> toq(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, InterfaceC1496r<T> interfaceC1496r) throws IOException {
        return fn3e.m6144k(zyVar, ld6Var, 1.0f, interfaceC1496r, false);
    }

    /* JADX INFO: renamed from: y */
    static C1446q m6196y(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return new C1446q(toq(zyVar, ld6Var, ki.f8154k));
    }

    static C1443k zy(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var) throws IOException {
        return new C1443k(toq(zyVar, ld6Var, f7l8.f8142k));
    }
}
