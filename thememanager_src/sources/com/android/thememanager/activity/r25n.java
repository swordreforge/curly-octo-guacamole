package com.android.thememanager.activity;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: WallpaperDetailLoadViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public class r25n extends androidx.lifecycle.lrht {

    /* JADX INFO: renamed from: g */
    private HashMap<Integer, androidx.lifecycle.fti<WeakReference<Bitmap>>> f9323g = new HashMap<>();

    private boolean hyr(Bitmap oldBitmap, Bitmap newBitmap) {
        if (oldBitmap == null || newBitmap == null || oldBitmap.isRecycled() || newBitmap.isRecycled()) {
            return false;
        }
        return oldBitmap.sameAs(newBitmap);
    }

    /* JADX INFO: renamed from: f */
    public void m6475f(int position, Bitmap bitmap) {
        androidx.lifecycle.fti<WeakReference<Bitmap>> ftiVar = this.f9323g.get(Integer.valueOf(position));
        if (ftiVar == null) {
            ftiVar = new androidx.lifecycle.fti<>();
        } else if (ftiVar.m4388g() != null && ftiVar.m4388g().get() != null && hyr(bitmap, ftiVar.m4388g().get())) {
            return;
        }
        ftiVar.n7h(new WeakReference<>(bitmap));
        this.f9323g.put(Integer.valueOf(position), ftiVar);
    }

    public androidx.lifecycle.fti<WeakReference<Bitmap>> n5r1(int position) {
        androidx.lifecycle.fti<WeakReference<Bitmap>> ftiVar = this.f9323g.get(Integer.valueOf(position));
        if (ftiVar == null) {
            ftiVar = new androidx.lifecycle.fti<>(new WeakReference(null));
        }
        this.f9323g.put(Integer.valueOf(position), ftiVar);
        return ftiVar;
    }
}
