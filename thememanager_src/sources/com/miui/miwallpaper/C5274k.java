package com.miui.miwallpaper;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.miui.miwallpaper.k */
/* JADX INFO: compiled from: BitmapRef.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5274k {

    /* JADX INFO: renamed from: k */
    private Bitmap f29490k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AtomicInteger f72138toq = new AtomicInteger(0);

    public C5274k(Bitmap bitmap) {
        this.f29490k = bitmap;
    }

    public void f7l8(Bitmap bitmap) {
        this.f72138toq.set(0);
        this.f29490k = bitmap;
    }

    /* JADX INFO: renamed from: g */
    public void m17864g() {
        Bitmap bitmap = this.f29490k;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f72138toq.set(0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m17865k() {
        return this.f72138toq.get() == 0;
    }

    /* JADX INFO: renamed from: n */
    public void m17866n() {
        this.f72138toq.incrementAndGet();
    }

    /* JADX INFO: renamed from: q */
    public Bitmap m17867q() {
        return this.f29490k;
    }

    public String toString() {
        return "BitmapRef{" + this.f29490k + ", " + this.f72138toq + '}';
    }

    public int toq() {
        if (this.f72138toq.get() == 0) {
            return 0;
        }
        return this.f72138toq.decrementAndGet();
    }

    public boolean zy(C5274k c5274k) {
        return c5274k != null && this.f29490k == c5274k.m17867q();
    }
}
