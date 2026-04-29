package com.google.android.exoplayer2;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h7am {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final h7am f64789toq = new h7am(false);

    /* JADX INFO: renamed from: k */
    public final boolean f20547k;

    public h7am(boolean z2) {
        this.f20547k = z2;
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h7am.class == obj.getClass() && this.f20547k == ((h7am) obj).f20547k;
    }

    public int hashCode() {
        return !this.f20547k ? 1 : 0;
    }
}
