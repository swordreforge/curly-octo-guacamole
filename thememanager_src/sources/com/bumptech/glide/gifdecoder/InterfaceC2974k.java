package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.k */
/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2974k {

    /* JADX INFO: renamed from: k */
    public static final int f17935k = 0;

    /* JADX INFO: renamed from: n */
    public static final int f17936n = 0;

    /* JADX INFO: renamed from: q */
    public static final int f17937q = 3;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f61621toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f61622zy = 2;

    /* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.k$k */
    /* JADX INFO: compiled from: GifDecoder.java */
    public interface k {
        /* JADX INFO: renamed from: g */
        void mo10594g(@lvui int[] iArr);

        /* JADX INFO: renamed from: k */
        void mo10595k(@lvui Bitmap bitmap);

        /* JADX INFO: renamed from: n */
        void mo10596n(@lvui byte[] bArr);

        @lvui
        /* JADX INFO: renamed from: q */
        int[] mo10597q(int i2);

        @lvui
        byte[] toq(int i2);

        @lvui
        Bitmap zy(int i2, int i3, @lvui Bitmap.Config config);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.k$toq */
    /* JADX INFO: compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    int cdj(@dd InputStream inputStream, int i2);

    void clear();

    int f7l8(int i2);

    /* JADX INFO: renamed from: g */
    void mo10586g(@lvui Bitmap.Config config);

    @lvui
    ByteBuffer getData();

    int getStatus();

    /* JADX INFO: renamed from: h */
    int mo10587h();

    /* JADX INFO: renamed from: k */
    int mo10588k();

    int ki();

    void kja0(@lvui zy zyVar, @lvui ByteBuffer byteBuffer, int i2);

    int ld6();

    /* JADX INFO: renamed from: n */
    int mo10589n();

    int n7h();

    /* JADX INFO: renamed from: p */
    void mo10590p(@lvui zy zyVar, @lvui byte[] bArr);

    /* JADX INFO: renamed from: q */
    void mo10591q();

    void qrj(@lvui zy zyVar, @lvui ByteBuffer byteBuffer);

    int read(@dd byte[] bArr);

    @Deprecated
    /* JADX INFO: renamed from: s */
    int mo10592s();

    int toq();

    void x2();

    /* JADX INFO: renamed from: y */
    int mo10593y();

    @dd
    Bitmap zy();
}
