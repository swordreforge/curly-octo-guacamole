package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;
import zy.InterfaceC7839p;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n5r1;

/* JADX INFO: renamed from: com.bumptech.glide.s */
/* JADX INFO: compiled from: ModelTypes.java */
/* JADX INFO: loaded from: classes2.dex */
interface InterfaceC3195s<T> {
    @InterfaceC7839p
    @lvui
    T cdj(@dd Object obj);

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: g */
    T mo6747g(@dd byte[] bArr);

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: i */
    T mo6748i(@dd String str);

    @InterfaceC7839p
    @lvui
    T ki(@dd @fn3e @n5r1 Integer num);

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: n */
    T mo6750n(@dd Uri uri);

    @InterfaceC7839p
    @lvui
    T n7h(@dd Bitmap bitmap);

    @InterfaceC7839p
    @Deprecated
    /* JADX INFO: renamed from: q */
    T mo6752q(@dd URL url);

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: s */
    T mo6754s(@dd Drawable drawable);

    @InterfaceC7839p
    @lvui
    /* JADX INFO: renamed from: y */
    T mo6758y(@dd File file);
}
