package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: compiled from: FloatParser.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 implements InterfaceC1496r<Float> {

    /* JADX INFO: renamed from: k */
    public static final x2 f8231k = new x2();

    private x2() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public Float mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        return Float.valueOf(t8r.f7l8(zyVar) * f2);
    }
}
