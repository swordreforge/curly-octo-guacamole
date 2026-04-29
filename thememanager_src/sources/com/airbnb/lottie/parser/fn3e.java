package com.airbnb.lottie.parser;

import com.airbnb.lottie.animation.keyframe.C1426s;
import com.airbnb.lottie.parser.moshi.zy;
import com.airbnb.lottie.value.C1515k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes.dex */
class fn3e {

    /* JADX INFO: renamed from: k */
    static zy.C1492k f8143k = zy.C1492k.m6178k("k");

    private fn3e() {
    }

    /* JADX INFO: renamed from: k */
    static <T> List<C1515k<T>> m6144k(com.airbnb.lottie.parser.moshi.zy zyVar, com.airbnb.lottie.ld6 ld6Var, float f2, InterfaceC1496r<T> interfaceC1496r, boolean z2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (zyVar.d2ok() == zy.toq.STRING) {
            ld6Var.m5974k("Lottie doesn't support expressions.");
            return arrayList;
        }
        zyVar.mo6173q();
        while (zyVar.ld6()) {
            if (zyVar.mo6170f(f8143k) != 0) {
                zyVar.y9n();
            } else if (zyVar.d2ok() == zy.toq.BEGIN_ARRAY) {
                zyVar.zy();
                if (zyVar.d2ok() == zy.toq.NUMBER) {
                    arrayList.add(C1486i.zy(zyVar, ld6Var, f2, interfaceC1496r, false, z2));
                } else {
                    while (zyVar.ld6()) {
                        arrayList.add(C1486i.zy(zyVar, ld6Var, f2, interfaceC1496r, true, z2));
                    }
                }
                zyVar.mo6174y();
            } else {
                arrayList.add(C1486i.zy(zyVar, ld6Var, f2, interfaceC1496r, false, z2));
            }
        }
        zyVar.mo6172p();
        toq(arrayList);
        return arrayList;
    }

    public static <T> void toq(List<? extends C1515k<T>> list) {
        int i2;
        T t2;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            C1515k<T> c1515k = list.get(i3);
            i3++;
            C1515k<T> c1515k2 = list.get(i3);
            c1515k.f8306y = Float.valueOf(c1515k2.f56193f7l8);
            if (c1515k.f56200zy == null && (t2 = c1515k2.f56198toq) != null) {
                c1515k.f56200zy = t2;
                if (c1515k instanceof C1426s) {
                    ((C1426s) c1515k).m5939s();
                }
            }
        }
        C1515k<T> c1515k3 = list.get(i2);
        if ((c1515k3.f56198toq == null || c1515k3.f56200zy == null) && list.size() > 1) {
            list.remove(c1515k3);
        }
    }
}
