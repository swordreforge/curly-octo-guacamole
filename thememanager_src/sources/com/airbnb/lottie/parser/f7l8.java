package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;

/* JADX INFO: compiled from: ColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 implements InterfaceC1496r<Integer> {

    /* JADX INFO: renamed from: k */
    public static final f7l8 f8142k = new f7l8();

    private f7l8() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public Integer mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        boolean z2 = zyVar.d2ok() == zy.toq.BEGIN_ARRAY;
        if (z2) {
            zyVar.zy();
        }
        double dMo6171h = zyVar.mo6171h();
        double dMo6171h2 = zyVar.mo6171h();
        double dMo6171h3 = zyVar.mo6171h();
        double dMo6171h4 = zyVar.d2ok() == zy.toq.NUMBER ? zyVar.mo6171h() : 1.0d;
        if (z2) {
            zyVar.mo6174y();
        }
        if (dMo6171h <= 1.0d && dMo6171h2 <= 1.0d && dMo6171h3 <= 1.0d) {
            dMo6171h *= 255.0d;
            dMo6171h2 *= 255.0d;
            dMo6171h3 *= 255.0d;
            if (dMo6171h4 <= 1.0d) {
                dMo6171h4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo6171h4, (int) dMo6171h, (int) dMo6171h2, (int) dMo6171h3));
    }
}
