package com.airbnb.lottie.parser.moshi;

import kotlin.text.eqxt;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.q */
/* JADX INFO: compiled from: JsonScope.java */
/* JADX INFO: loaded from: classes.dex */
final class C1491q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int f56168f7l8 = 7;

    /* JADX INFO: renamed from: g */
    static final int f8202g = 6;

    /* JADX INFO: renamed from: k */
    static final int f8203k = 1;

    /* JADX INFO: renamed from: n */
    static final int f8204n = 5;

    /* JADX INFO: renamed from: q */
    static final int f8205q = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final int f56169toq = 2;

    /* JADX INFO: renamed from: y */
    static final int f8206y = 8;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final int f56170zy = 3;

    private C1491q() {
    }

    /* JADX INFO: renamed from: k */
    static String m6175k(int i2, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append(eqxt.f81918zy);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = strArr[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
