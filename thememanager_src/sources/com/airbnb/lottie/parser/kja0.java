package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.C1456q;
import java.util.List;

/* JADX INFO: compiled from: GradientColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 implements InterfaceC1496r<C1456q> {

    /* JADX INFO: renamed from: k */
    private int f8155k;

    public kja0(int i2) {
        this.f8155k = i2;
    }

    private void toq(C1456q c1456q, List<Float> list) {
        int i2 = this.f8155k * 4;
        if (list.size() <= i2) {
            return;
        }
        int size = (list.size() - i2) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                dArr[i3] = list.get(i2).floatValue();
            } else {
                dArr2[i3] = list.get(i2).floatValue();
                i3++;
            }
            i2++;
        }
        for (int i4 = 0; i4 < c1456q.zy(); i4++) {
            int i5 = c1456q.m6043k()[i4];
            c1456q.m6043k()[i4] = Color.argb(zy(c1456q.toq()[i4], dArr, dArr2), Color.red(i5), Color.green(i5), Color.blue(i5));
        }
    }

    @zy.a9(from = 0, to = 255)
    private int zy(double d2, double[] dArr, double[] dArr2) {
        double dM6239p;
        int i2 = 1;
        while (true) {
            if (i2 >= dArr.length) {
                dM6239p = dArr2[dArr2.length - 1];
                break;
            }
            int i3 = i2 - 1;
            double d4 = dArr[i3];
            double d5 = dArr[i2];
            if (d5 >= d2) {
                dM6239p = com.airbnb.lottie.utils.f7l8.m6239p(dArr2[i3], dArr2[i2], com.airbnb.lottie.utils.f7l8.toq((d2 - d4) / (d5 - d4), 0.0d, 1.0d));
                break;
            }
            i2++;
        }
        return (int) (dM6239p * 255.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    @Override // com.airbnb.lottie.parser.InterfaceC1496r
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.airbnb.lottie.model.content.C1456q mo6143k(com.airbnb.lottie.parser.moshi.zy r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.kja0.mo6143k(com.airbnb.lottie.parser.moshi.zy, float):com.airbnb.lottie.model.content.q");
    }
}
