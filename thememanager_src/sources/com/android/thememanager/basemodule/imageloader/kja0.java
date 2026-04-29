package com.android.thememanager.basemodule.imageloader;

import android.content.Context;
import com.bumptech.glide.load.C3139y;
import com.bumptech.glide.load.engine.zurt;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import yz.C7794k;

/* JADX INFO: compiled from: ThemeGlideTransformProxy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class kja0<T> extends C3139y<T> {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final List<com.bumptech.glide.load.n7h<T>> f9920q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kja0(@InterfaceC7396q List<? extends com.bumptech.glide.load.n7h<T>> bitmapTransFormations) {
        super(bitmapTransFormations);
        d2ok.m23075h(bitmapTransFormations, "bitmapTransFormations");
        this.f9920q = bitmapTransFormations;
    }

    @Override // com.bumptech.glide.load.C3139y, com.bumptech.glide.load.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public zurt<T> mo6744k(@InterfaceC7396q Context context, @InterfaceC7396q zurt<T> resource, int i2, int i3) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(resource, "resource");
        zurt<T> zurtVar = resource;
        for (com.bumptech.glide.load.n7h<T> n7hVar : this.f9920q) {
            if (n7hVar instanceof toq) {
                zurt<T> zurtVarMo6744k = n7hVar.mo6744k(context, zurtVar, i2, i3);
                d2ok.kja0(zurtVarMo6744k, "transform(...)");
                if (!d2ok.f7l8(zurtVar, resource) && !d2ok.f7l8(zurtVar, zurtVarMo6744k)) {
                    zurtVar.toq();
                }
                zurtVar = zurtVarMo6744k;
            } else {
                C7794k.f7l8("Transformation must extend BaseBitmapTransformation " + n7hVar.getClass().getName());
            }
        }
        return zurtVar;
    }
}
