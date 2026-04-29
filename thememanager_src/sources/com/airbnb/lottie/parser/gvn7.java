package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.C1461k;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ShapeDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class gvn7 implements InterfaceC1496r<com.airbnb.lottie.model.content.n7h> {

    /* JADX INFO: renamed from: k */
    public static final gvn7 f8146k = new gvn7();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56157toq = zy.C1492k.m6178k("c", "v", "i", "o");

    private gvn7() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.n7h mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        if (zyVar.d2ok() == zy.toq.BEGIN_ARRAY) {
            zyVar.zy();
        }
        zyVar.mo6173q();
        List<PointF> listM6198g = null;
        List<PointF> listM6198g2 = null;
        List<PointF> listM6198g3 = null;
        boolean zX2 = false;
        while (zyVar.ld6()) {
            int iMo6170f = zyVar.mo6170f(f56157toq);
            if (iMo6170f == 0) {
                zX2 = zyVar.x2();
            } else if (iMo6170f == 1) {
                listM6198g = t8r.m6198g(zyVar, f2);
            } else if (iMo6170f == 2) {
                listM6198g2 = t8r.m6198g(zyVar, f2);
            } else if (iMo6170f != 3) {
                zyVar.yz();
                zyVar.y9n();
            } else {
                listM6198g3 = t8r.m6198g(zyVar, f2);
            }
        }
        zyVar.mo6172p();
        if (zyVar.d2ok() == zy.toq.END_ARRAY) {
            zyVar.mo6174y();
        }
        if (listM6198g == null || listM6198g2 == null || listM6198g3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listM6198g.isEmpty()) {
            return new com.airbnb.lottie.model.content.n7h(new PointF(), false, Collections.emptyList());
        }
        int size = listM6198g.size();
        PointF pointF = listM6198g.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = listM6198g.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new C1461k(com.airbnb.lottie.utils.f7l8.m6237k(listM6198g.get(i3), listM6198g3.get(i3)), com.airbnb.lottie.utils.f7l8.m6237k(pointF2, listM6198g2.get(i2)), pointF2));
        }
        if (zX2) {
            PointF pointF3 = listM6198g.get(0);
            int i4 = size - 1;
            arrayList.add(new C1461k(com.airbnb.lottie.utils.f7l8.m6237k(listM6198g.get(i4), listM6198g3.get(i4)), com.airbnb.lottie.utils.f7l8.m6237k(pointF3, listM6198g2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.n7h(pointF, zX2, arrayList);
    }
}
