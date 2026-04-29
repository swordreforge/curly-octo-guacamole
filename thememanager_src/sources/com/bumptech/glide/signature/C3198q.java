package com.bumptech.glide.signature;

import com.bumptech.glide.load.f7l8;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.signature.q */
/* JADX INFO: compiled from: MediaStoreSignature.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3198q implements f7l8 {

    /* JADX INFO: renamed from: n */
    private final int f19066n;

    /* JADX INFO: renamed from: q */
    private final long f19067q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final String f63067zy;

    public C3198q(@dd String str, long j2, int i2) {
        this.f63067zy = str == null ? "" : str;
        this.f19067q = j2;
        this.f19066n = i2;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3198q c3198q = (C3198q) obj;
        return this.f19067q == c3198q.f19067q && this.f19066n == c3198q.f19066n && this.f63067zy.equals(c3198q.f63067zy);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        int iHashCode = this.f63067zy.hashCode() * 31;
        long j2 = this.f19067q;
        return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f19066n;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f19067q).putInt(this.f19066n).array());
        messageDigest.update(this.f63067zy.getBytes(f7l8.f62824toq));
    }
}
