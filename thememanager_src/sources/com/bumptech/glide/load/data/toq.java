package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: compiled from: AssetPathFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class toq<T> implements InterfaceC3000q<T> {

    /* JADX INFO: renamed from: g */
    private static final String f18244g = "AssetPathFetcher";

    /* JADX INFO: renamed from: k */
    private final String f18245k;

    /* JADX INFO: renamed from: n */
    private T f18246n;

    /* JADX INFO: renamed from: q */
    private final AssetManager f18247q;

    public toq(AssetManager assetManager, String str) {
        this.f18247q = assetManager;
        this.f18245k = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    /* JADX INFO: renamed from: g */
    public void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super T> kVar) {
        try {
            T tMo10658q = mo10658q(this.f18247q, this.f18245k);
            this.f18246n = tMo10658q;
            kVar.mo10657q(tMo10658q);
        } catch (IOException e2) {
            if (Log.isLoggable(f18244g, 3)) {
                Log.d(f18244g, "Failed to load data from asset manager", e2);
            }
            kVar.zy(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: n */
    public EnumC3050k mo10648n() {
        return EnumC3050k.LOCAL;
    }

    /* JADX INFO: renamed from: q */
    protected abstract T mo10658q(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void toq() {
        T t2 = this.f18246n;
        if (t2 == null) {
            return;
        }
        try {
            zy(t2);
        } catch (IOException unused) {
        }
    }

    protected abstract void zy(T t2) throws IOException;
}
