package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: LibraryLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t8r {

    /* JADX INFO: renamed from: q */
    private static final String f23290q = "LibraryLoader";

    /* JADX INFO: renamed from: k */
    private String[] f23291k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f67083toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f67084zy;

    public t8r(String... strArr) {
        this.f23291k = strArr;
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m13733k() {
        if (this.f67083toq) {
            return this.f67084zy;
        }
        this.f67083toq = true;
        try {
            for (String str : this.f23291k) {
                System.loadLibrary(str);
            }
            this.f67084zy = true;
        } catch (UnsatisfiedLinkError unused) {
            String strValueOf = String.valueOf(Arrays.toString(this.f23291k));
            ni7.qrj(f23290q, strValueOf.length() != 0 ? "Failed to load ".concat(strValueOf) : new String("Failed to load "));
        }
        return this.f67084zy;
    }

    public synchronized void toq(String... strArr) {
        C3844k.m13631p(!this.f67083toq, "Cannot set libraries after loading");
        this.f23291k = strArr;
    }
}
