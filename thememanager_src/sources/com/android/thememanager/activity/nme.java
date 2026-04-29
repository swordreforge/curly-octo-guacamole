package com.android.thememanager.activity;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.view.WallpaperView;
import ek5k.C6002g;

/* JADX INFO: compiled from: WallpaperDetailFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class nme extends AbstractViewOnClickListenerC1611m {
    private TextView qnoq;

    private void je1q(int[] offsets, int wallpaperWidth, int screenWidth, float enlarge) {
        if (enlarge <= 0.0f) {
            offsets[0] = 0;
            offsets[1] = wallpaperWidth - screenWidth;
        } else {
            RectF matrixRectF = this.in.getMatrixRectF();
            offsets[0] = 0;
            float f2 = screenWidth;
            offsets[1] = (int) (((enlarge - 1.0f) * f2) + ((matrixRectF.width() - (f2 * enlarge)) / 2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p6(final String str, final int i2, final String str2, final WallpaperApplyInfos wallpaperApplyInfos, final int i3) {
        Log.i("WallpaperDetailFragment", "onApplyWallpaper: start prepare bitmap");
        Bitmap bitmapA8p6 = a8p6(this.f9070b.getContentPath(), str, this.in.getImageBitmap().getWidth(), this.in.getImageBitmap().getHeight());
        if (bitmapA8p6 == null) {
            bitmapA8p6 = this.in.getImageBitmap();
        }
        final Bitmap bitmap = bitmapA8p6;
        ActivityC0891q activity = getActivity();
        if (isAdded() && C1819o.eqxt(activity)) {
            boolean z2 = com.android.thememanager.basemodule.utils.o1t.m7179z() && (com.android.thememanager.util.ch.vyq(this.f9070b.getContentPath()) || com.android.thememanager.util.ch.n5r1(this.f9070b.getContentPath()));
            String strM28220k = z2 ? zsr0.toq.m28220k(this.f9070b.getContentPath()) : null;
            final Bitmap bitmapA8p62 = TextUtils.isEmpty(strM28220k) ? null : a8p6(strM28220k, null, this.in.getImageBitmap().getWidth(), this.in.getImageBitmap().getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("onApplyWallpaper: prepare bitmap is ok, bitmap: ");
            sb.append(bitmap == null);
            sb.append(" supportDarkMode: ");
            sb.append(z2);
            sb.append(" darkBitmap: ");
            sb.append(bitmapA8p62 == null);
            Log.i("WallpaperDetailFragment", sb.toString());
            if (C1819o.eqxt(activity)) {
                activity.runOnUiThread(new Runnable() { // from class: com.android.thememanager.activity.b9ub
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8927k.zxa9(i2, str, bitmap, str2, bitmapA8p62, wallpaperApplyInfos, i3);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zxa9(int i2, String str, Bitmap bitmap, String str2, Bitmap bitmap2, WallpaperApplyInfos wallpaperApplyInfos, int i3) {
        Log.i("WallpaperDetailFragment", "onApplyWallpaper start apply wallpaper Task : applyType: " + i2);
        com.android.thememanager.controller.n7h n7hVar = new com.android.thememanager.controller.n7h(this.f9070b, str, this.f9059l, this.p2c, i2, this.f9877s, this.k6e, this.in.getImageMatrix(), this.w97r, this.tgs, this.tlhn, this.in.cdj(), bitmap, jyr(0), str2, this.in.ni7(), bitmap2, wallpaperApplyInfos, i3);
        this.xy8 = n7hVar;
        n7hVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected void b6(final String sourceType, final String onlineUrl, final int applyType, final WallpaperApplyInfos applyInfos) {
        if (applyType == 32) {
            com.android.thememanager.controller.cdj.toq(this);
        }
        final int i2 = getResources().getDisplayMetrics().densityDpi;
        if (com.android.thememanager.basemodule.utils.a9.m6993h(this.f9074f)) {
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.activity.b8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8920k.p6(onlineUrl, applyType, sourceType, applyInfos, i2);
                }
            });
            return;
        }
        Log.i("WallpaperDetailFragment", "onApplyWallpaper not support Dark Wallpaper, start apply wallpaper Task : applyType: " + applyType);
        com.android.thememanager.controller.n7h n7hVar = new com.android.thememanager.controller.n7h(this.f9070b, onlineUrl, this.f9059l, this.p2c, applyType, this.f9877s, this.k6e, this.in.getImageMatrix(), this.w97r, this.tgs, this.tlhn, this.in.cdj(), this.in.getImageBitmap(), jyr(0), sourceType, this.in.ni7(), null, applyInfos, i2);
        this.xy8 = n7hVar;
        n7hVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected boolean cp() {
        return false;
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected boolean jog(boolean reset, boolean firstShow) {
        if (this.ar == null) {
            return true;
        }
        if (this.tlhn) {
            float fZy = com.android.thememanager.util.lvui.zy(this.in.getImageBitmap(), this.yf, this.in.ni7(), this.in.getImageMatrix());
            this.tgs[0] = (int) (this.w97r[0] * fZy);
            if (fZy == 1.1f) {
                float f2 = this.in.getMatrixRectF().right;
                int i2 = this.w97r[0];
                if (f2 - i2 < i2 * 0.1f) {
                    this.in.m10302h(1.1f, new Point(0, this.w97r[1] / 2));
                }
            }
            int[] iArr = this.yl25;
            int i3 = this.tgs[0];
            int i4 = this.w97r[0];
            if (this.in.ni7()) {
                fZy = -1.0f;
            }
            je1q(iArr, i3, i4, fZy);
        } else {
            int[] iArr2 = this.tgs;
            int[] iArr3 = this.w97r;
            iArr2[0] = iArr3[0];
            iArr2[1] = iArr3[1];
            int[] iArr4 = this.yl25;
            iArr4[1] = 0;
            iArr4[0] = 0;
        }
        WallpaperView wallpaperView = this.in;
        int[] iArr5 = this.yl25;
        wallpaperView.setOffsets(iArr5[0], iArr5[1]);
        WallpaperView wallpaperView2 = this.in;
        int[] iArr6 = this.tgs;
        boolean zM10305t = wallpaperView2.m10305t(iArr6[0], iArr6[1], reset, firstShow, true);
        this.in.n5r1();
        if (!zM10305t) {
            com.android.thememanager.basemodule.utils.nn86.toq(getResources().getString(R.string.the_picture_is_too_small), 0);
            this.f9074f.finish();
        }
        return zM10305t;
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected void jre() {
        Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
        boolean zNcyb = C1819o.ncyb(getContext());
        int iMax = Math.max(pointFn3e.x, pointFn3e.y);
        int iMin = Math.min(pointFn3e.x, pointFn3e.y);
        if (zNcyb) {
            int[] iArr = this.w97r;
            iArr[0] = iMax;
            iArr[1] = iMin;
            int[] iArr2 = this.tgs;
            iArr2[0] = iMax;
            iArr2[1] = iMin;
            return;
        }
        int[] iArr3 = this.tgs;
        int[] iArr4 = this.w97r;
        iArr4[0] = iMin;
        iArr3[0] = iMin;
        iArr4[1] = iMax;
        iArr3[1] = iMax;
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected void oaex(boolean show) {
        super.oaex(show);
        TextView textView = this.qnoq;
        if (textView != null) {
            textView.setText(this.ut ? R.string.wallpaper_light_mode_image_preview_tip : R.string.wallpaper_dark_mode_image_preview_tip);
            if (show) {
                this.qnoq.setVisibility(0);
            } else {
                this.qnoq.setVisibility(4);
            }
        }
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected void qla(boolean show) {
        super.qla(show);
        TextView textView = this.qnoq;
        if (textView != null) {
            textView.setText(R.string.wallpaper_magic_mode_preview_tip);
            if (show) {
                this.qnoq.setVisibility(0);
            } else {
                this.qnoq.setVisibility(4);
            }
        }
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected boolean wqp() {
        return super.wqp() && !C1807g.n5r1();
    }

    @Override // com.android.thememanager.activity.AbstractViewOnClickListenerC1611m
    protected void zi4o() {
        this.qnoq = (TextView) tww7(R.id.image_mode_tip);
        super.zi4o();
    }
}
