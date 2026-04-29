package uj2j;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: LockScreenData.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private Bitmap f44441k;

    /* JADX INFO: renamed from: q */
    private boolean f44442q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Bitmap f95000toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f95001zy;

    public toq(Bitmap wallpaperBitmap, Bitmap blurWallpaperBitmap, boolean showClockView, boolean isThirdTheme) {
        this.f44441k = wallpaperBitmap;
        this.f95000toq = blurWallpaperBitmap;
        this.f95001zy = showClockView;
        this.f44442q = isThirdTheme;
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m28080k() {
        return this.f95000toq;
    }

    /* JADX INFO: renamed from: q */
    public boolean m28081q() {
        return this.f44442q;
    }

    public Bitmap toq() {
        return this.f44441k;
    }

    public boolean zy() {
        return this.f95001zy;
    }
}
