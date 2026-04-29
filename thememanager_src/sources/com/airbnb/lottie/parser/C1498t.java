package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.t */
/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C1498t implements InterfaceC1496r<PointF> {

    /* JADX INFO: renamed from: k */
    public static final C1498t f8226k = new C1498t();

    private C1498t() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public PointF mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        zy.toq toqVarD2ok = zyVar.d2ok();
        if (toqVarD2ok == zy.toq.BEGIN_ARRAY) {
            return t8r.m6200n(zyVar, f2);
        }
        if (toqVarD2ok == zy.toq.BEGIN_OBJECT) {
            return t8r.m6200n(zyVar, f2);
        }
        if (toqVarD2ok == zy.toq.NUMBER) {
            PointF pointF = new PointF(((float) zyVar.mo6171h()) * f2, ((float) zyVar.mo6171h()) * f2);
            while (zyVar.ld6()) {
                zyVar.y9n();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + toqVarD2ok);
    }
}
