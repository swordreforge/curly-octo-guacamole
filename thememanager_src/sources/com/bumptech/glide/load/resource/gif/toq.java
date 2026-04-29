package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: GifBitmapProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements InterfaceC2974k.k {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3008n f18807k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f62966toq;

    public toq(InterfaceC3008n interfaceC3008n) {
        this(interfaceC3008n, null);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k.k
    /* JADX INFO: renamed from: g */
    public void mo10594g(@lvui int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar = this.f62966toq;
        if (toqVar == null) {
            return;
        }
        toqVar.put(iArr);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k.k
    /* JADX INFO: renamed from: k */
    public void mo10595k(@lvui Bitmap bitmap) {
        this.f18807k.mo10669q(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k.k
    /* JADX INFO: renamed from: n */
    public void mo10596n(@lvui byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar = this.f62966toq;
        if (toqVar == null) {
            return;
        }
        toqVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k.k
    @lvui
    /* JADX INFO: renamed from: q */
    public int[] mo10597q(int i2) {
        com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar = this.f62966toq;
        return toqVar == null ? new int[i2] : (int[]) toqVar.zy(i2, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k.k
    @lvui
    public byte[] toq(int i2) {
        com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar = this.f62966toq;
        return toqVar == null ? new byte[i2] : (byte[]) toqVar.zy(i2, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.InterfaceC2974k.k
    @lvui
    public Bitmap zy(int i2, int i3, @lvui Bitmap.Config config) {
        return this.f18807k.f7l8(i2, i3, config);
    }

    public toq(InterfaceC3008n interfaceC3008n, @dd com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this.f18807k = interfaceC3008n;
        this.f62966toq = toqVar;
    }
}
