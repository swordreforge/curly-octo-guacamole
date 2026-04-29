package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.toq;
import com.airbnb.lottie.parser.moshi.zy;
import java.io.IOException;
import v5yj.C7704k;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.s */
/* JADX INFO: compiled from: DocumentDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C1497s implements InterfaceC1496r<com.airbnb.lottie.model.toq> {

    /* JADX INFO: renamed from: k */
    public static final C1497s f8225k = new C1497s();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy.C1492k f56178toq = zy.C1492k.m6178k("t", "f", C7704k.y.toq.f44691k, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C1497s() {
    }

    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.toq mo6143k(com.airbnb.lottie.parser.moshi.zy zyVar, float f2) throws IOException {
        toq.EnumC1474k enumC1474k = toq.EnumC1474k.CENTER;
        zyVar.mo6173q();
        toq.EnumC1474k enumC1474k2 = enumC1474k;
        String strWvg = null;
        String strWvg2 = null;
        int iKi = 0;
        int iM6201q = 0;
        int iM6201q2 = 0;
        float fMo6171h = 0.0f;
        float fMo6171h2 = 0.0f;
        float fMo6171h3 = 0.0f;
        float fMo6171h4 = 0.0f;
        boolean zX2 = true;
        while (zyVar.ld6()) {
            switch (zyVar.mo6170f(f56178toq)) {
                case 0:
                    strWvg = zyVar.wvg();
                    break;
                case 1:
                    strWvg2 = zyVar.wvg();
                    break;
                case 2:
                    fMo6171h = (float) zyVar.mo6171h();
                    break;
                case 3:
                    int iKi2 = zyVar.ki();
                    enumC1474k2 = toq.EnumC1474k.CENTER;
                    if (iKi2 <= enumC1474k2.ordinal() && iKi2 >= 0) {
                        enumC1474k2 = toq.EnumC1474k.values()[iKi2];
                    }
                    break;
                case 4:
                    iKi = zyVar.ki();
                    break;
                case 5:
                    fMo6171h2 = (float) zyVar.mo6171h();
                    break;
                case 6:
                    fMo6171h3 = (float) zyVar.mo6171h();
                    break;
                case 7:
                    iM6201q = t8r.m6201q(zyVar);
                    break;
                case 8:
                    iM6201q2 = t8r.m6201q(zyVar);
                    break;
                case 9:
                    fMo6171h4 = (float) zyVar.mo6171h();
                    break;
                case 10:
                    zX2 = zyVar.x2();
                    break;
                default:
                    zyVar.yz();
                    zyVar.y9n();
                    break;
            }
        }
        zyVar.mo6172p();
        return new com.airbnb.lottie.model.toq(strWvg, strWvg2, fMo6171h, enumC1474k2, iKi, fMo6171h2, fMo6171h3, iM6201q, iM6201q2, fMo6171h4, zX2);
    }
}
