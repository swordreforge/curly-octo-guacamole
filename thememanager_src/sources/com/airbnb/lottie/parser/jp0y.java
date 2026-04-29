package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: ScaleXYParser.java */
/* JADX INFO: loaded from: classes.dex */
public class jp0y implements InterfaceC1496r<com.airbnb.lottie.value.ld6> {

    /* JADX INFO: renamed from: k */
    public static final jp0y f8152k = new jp0y();

    private jp0y() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.ld6 mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        boolean z2 = zyVar.d2ok() == zy.toq.BEGIN_ARRAY;
        if (z2) {
            zyVar.zy();
        }
        float fMo6171h = (float) zyVar.mo6171h();
        float fMo6171h2 = (float) zyVar.mo6171h();
        while (zyVar.ld6()) {
            zyVar.y9n();
        }
        if (z2) {
            zyVar.mo6174y();
        }
        return new com.airbnb.lottie.value.ld6((fMo6171h / 100.0f) * f2, (fMo6171h2 / 100.0f) * f2);
    }
}
