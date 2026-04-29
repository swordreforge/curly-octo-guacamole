package com.android.thememanager.settings.superwallpaper.widget;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.settings.superwallpaper.opengl.HomeGLSurfaceView;
import com.android.thememanager.settings.superwallpaper.utils.f7l8;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class HomeWallpaperBannerContainer extends FrameLayout {

    /* JADX INFO: renamed from: y */
    private static final String f15891y = HomeWallpaperBannerContainer.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    private WallpaperManager f15892g;

    /* JADX INFO: renamed from: k */
    private Context f15893k;

    /* JADX INFO: renamed from: n */
    private ImageView f15894n;

    /* JADX INFO: renamed from: q */
    private HomeGLSurfaceView f15895q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.HomeWallpaperBannerContainer$k */
    class AsyncTaskC2681k extends AsyncTask<Void, Void, Bitmap> {
        AsyncTaskC2681k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... params) throws Throwable {
            Bitmap bitmapM9254g = f7l8.m9254g(HomeWallpaperBannerContainer.this.f15893k, HomeWallpaperBannerContainer.this.f15892g);
            int iM9300k = bitmapM9254g != null ? com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(HomeWallpaperBannerContainer.this.f15893k, bitmapM9254g) : 1;
            Log.d(HomeWallpaperBannerContainer.f15891y, "initPreview colorMode" + iM9300k);
            return f7l8.m9257q(HomeWallpaperBannerContainer.this.f15893k, iM9300k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap result) {
            HomeWallpaperBannerContainer.this.f15894n.setImageBitmap(result);
        }
    }

    public HomeWallpaperBannerContainer(@lvui Context context) {
        this(context, null);
    }

    private void f7l8(boolean isSuperWallpaper, String superWallpaperId) {
        this.f15895q.mo9247k(isSuperWallpaper, superWallpaperId);
    }

    /* JADX INFO: renamed from: g */
    public void m9361g() {
        new AsyncTaskC2681k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: renamed from: n */
    public void m9362n(boolean isSuperWallpaper, String superWallpaperId) {
        f7l8(isSuperWallpaper, superWallpaperId);
        m9361g();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15895q = (HomeGLSurfaceView) findViewById(R.id.home_wallpaper_banner_container_background);
        this.f15894n = (ImageView) findViewById(R.id.home_wallpaper_banner_container_image);
        this.f15892g = (WallpaperManager) getContext().getSystemService("wallpaper");
    }

    public HomeWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15893k = context;
    }

    public HomeWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }
}
