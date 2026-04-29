package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.EnumC3050k;
import com.bumptech.glide.load.data.InterfaceC3000q;
import java.io.FileNotFoundException;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: compiled from: LocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x2<T> implements InterfaceC3000q<T> {

    /* JADX INFO: renamed from: g */
    private static final String f18248g = "LocalUriFetcher";

    /* JADX INFO: renamed from: k */
    private final Uri f18249k;

    /* JADX INFO: renamed from: n */
    private T f18250n;

    /* JADX INFO: renamed from: q */
    private final ContentResolver f18251q;

    public x2(ContentResolver contentResolver, Uri uri) {
        this.f18251q = contentResolver;
        this.f18249k = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    /* JADX INFO: renamed from: g */
    public final void mo10647g(@lvui EnumC3159p enumC3159p, @lvui InterfaceC3000q.k<? super T> kVar) {
        try {
            T tMo10635q = mo10635q(this.f18249k, this.f18251q);
            this.f18250n = tMo10635q;
            kVar.mo10657q(tMo10635q);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable(f18248g, 3)) {
                Log.d(f18248g, "Failed to open Uri", e2);
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
    protected abstract T mo10635q(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    public void toq() {
        T t2 = this.f18250n;
        if (t2 != null) {
            try {
                zy(t2);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void zy(T t2) throws IOException;
}
