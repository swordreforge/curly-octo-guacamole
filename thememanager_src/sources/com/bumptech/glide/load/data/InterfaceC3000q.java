package com.bumptech.glide.load.data;

import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.EnumC3050k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.q */
/* JADX INFO: compiled from: DataFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3000q<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.q$k */
    /* JADX INFO: compiled from: DataFetcher.java */
    public interface k<T> {
        /* JADX INFO: renamed from: q */
        void mo10657q(@dd T t2);

        void zy(@lvui Exception exc);
    }

    void cancel();

    /* JADX INFO: renamed from: g */
    void mo10647g(@lvui EnumC3159p enumC3159p, @lvui k<? super T> kVar);

    @lvui
    /* JADX INFO: renamed from: k */
    Class<T> mo10634k();

    @lvui
    /* JADX INFO: renamed from: n */
    EnumC3050k mo10648n();

    void toq();
}
