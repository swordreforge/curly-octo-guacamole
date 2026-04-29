package com.bumptech.glide.signature;

import android.content.Context;
import com.bumptech.glide.load.f7l8;
import com.bumptech.glide.util.kja0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.signature.k */
/* JADX INFO: compiled from: AndroidResourceSignature.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3196k implements f7l8 {

    /* JADX INFO: renamed from: q */
    private final f7l8 f19065q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f63065zy;

    private C3196k(int i2, f7l8 f7l8Var) {
        this.f63065zy = i2;
        this.f19065q = f7l8Var;
    }

    @lvui
    public static f7l8 zy(@lvui Context context) {
        return new C3196k(context.getResources().getConfiguration().uiMode & 48, toq.zy(context));
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (!(obj instanceof C3196k)) {
            return false;
        }
        C3196k c3196k = (C3196k) obj;
        return this.f63065zy == c3196k.f63065zy && this.f19065q.equals(c3196k.f19065q);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return kja0.cdj(this.f19065q, this.f63065zy);
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        this.f19065q.toq(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f63065zy).array());
    }
}
