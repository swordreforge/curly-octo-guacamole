package com.airbnb.lottie.parser;

import java.io.IOException;

/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class ki implements InterfaceC1496r<Integer> {

    /* JADX INFO: renamed from: k */
    public static final ki f8154k = new ki();

    private ki() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public Integer mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        return Integer.valueOf(Math.round(t8r.f7l8(zyVar) * f2));
    }
}
