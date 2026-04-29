package com.xiaomi.push;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class fnq8 {

    /* JADX INFO: renamed from: k */
    private String f32941k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73333toq;

    public fnq8(String str, int i2) {
        this.f32941k = str;
        this.f73333toq = i2;
    }

    /* JADX INFO: renamed from: q */
    public static InetSocketAddress m20879q(String str, int i2) {
        fnq8 qVar = toq(str, i2);
        return new InetSocketAddress(qVar.zy(), qVar.m20880k());
    }

    public static fnq8 toq(String str, int i2) {
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(0, iLastIndexOf);
            try {
                int i3 = Integer.parseInt(str.substring(iLastIndexOf + 1));
                if (i3 > 0) {
                    i2 = i3;
                }
            } catch (NumberFormatException unused) {
            }
            str = strSubstring;
        }
        return new fnq8(str, i2);
    }

    /* JADX INFO: renamed from: k */
    public int m20880k() {
        return this.f73333toq;
    }

    public String toString() {
        if (this.f73333toq <= 0) {
            return this.f32941k;
        }
        return this.f32941k + ":" + this.f73333toq;
    }

    public String zy() {
        return this.f32941k;
    }
}
