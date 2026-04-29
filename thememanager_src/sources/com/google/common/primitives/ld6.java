package com.google.common.primitives;

/* JADX INFO: compiled from: ParseRequest.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class ld6 {

    /* JADX INFO: renamed from: k */
    final String f27289k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final int f68580toq;

    private ld6(String str, int i2) {
        this.f27289k = str;
        this.f68580toq = i2;
    }

    /* JADX INFO: renamed from: k */
    static ld6 m16662k(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = str.charAt(0);
        int i2 = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (cCharAt == '#') {
            str = str.substring(1);
        } else if (cCharAt != '0' || str.length() <= 1) {
            i2 = 10;
        } else {
            str = str.substring(1);
            i2 = 8;
        }
        return new ld6(str, i2);
    }
}
