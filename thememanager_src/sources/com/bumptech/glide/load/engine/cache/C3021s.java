package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.engine.cache.InterfaceC3018p;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.util.C3204p;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.cache.s */
/* JADX INFO: compiled from: LruResourceCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3021s extends C3204p<com.bumptech.glide.load.f7l8, zurt<?>> implements InterfaceC3018p {

    /* JADX INFO: renamed from: n */
    private InterfaceC3018p.k f18309n;

    public C3021s(long j2) {
        super(j2);
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3018p
    @dd
    public /* bridge */ /* synthetic */ zurt f7l8(@lvui com.bumptech.glide.load.f7l8 f7l8Var) {
        return (zurt) super.m11241h(f7l8Var);
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3018p
    @dd
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ zurt mo10713g(@lvui com.bumptech.glide.load.f7l8 f7l8Var, @dd zurt zurtVar) {
        return (zurt) super.kja0(f7l8Var, zurtVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3018p
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: k */
    public void mo10714k(int i2) {
        if (i2 >= 40) {
            toq();
        } else if (i2 >= 20 || i2 == 15) {
            cdj(m11242n() / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.C3204p
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public int qrj(@dd zurt<?> zurtVar) {
        return zurtVar == null ? super.qrj(null) : zurtVar.zy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.C3204p
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public void n7h(@lvui com.bumptech.glide.load.f7l8 f7l8Var, @dd zurt<?> zurtVar) {
        InterfaceC3018p.k kVar = this.f18309n;
        if (kVar == null || zurtVar == null) {
            return;
        }
        kVar.mo10721k(zurtVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3018p
    /* JADX INFO: renamed from: y */
    public void mo10717y(@lvui InterfaceC3018p.k kVar) {
        this.f18309n = kVar;
    }
}
