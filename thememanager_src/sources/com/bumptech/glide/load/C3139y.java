package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.zurt;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.y */
/* JADX INFO: compiled from: MultiTransformation.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3139y<T> implements n7h<T> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Collection<? extends n7h<T>> f62978zy;

    @SafeVarargs
    public C3139y(@lvui n7h<T>... n7hVarArr) {
        if (n7hVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f62978zy = Arrays.asList(n7hVarArr);
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (obj instanceof C3139y) {
            return this.f62978zy.equals(((C3139y) obj).f62978zy);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        return this.f62978zy.hashCode();
    }

    @Override // com.bumptech.glide.load.n7h
    @lvui
    /* JADX INFO: renamed from: k */
    public zurt<T> mo6744k(@lvui Context context, @lvui zurt<T> zurtVar, int i2, int i3) {
        Iterator<? extends n7h<T>> it = this.f62978zy.iterator();
        zurt<T> zurtVar2 = zurtVar;
        while (it.hasNext()) {
            zurt<T> zurtVarMo6744k = it.next().mo6744k(context, zurtVar2, i2, i3);
            if (zurtVar2 != null && !zurtVar2.equals(zurtVar) && !zurtVar2.equals(zurtVarMo6744k)) {
                zurtVar2.toq();
            }
            zurtVar2 = zurtVarMo6744k;
        }
        return zurtVar2;
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        Iterator<? extends n7h<T>> it = this.f62978zy.iterator();
        while (it.hasNext()) {
            it.next().toq(messageDigest);
        }
    }

    public C3139y(@lvui Collection<? extends n7h<T>> collection) {
        if (!collection.isEmpty()) {
            this.f62978zy = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
