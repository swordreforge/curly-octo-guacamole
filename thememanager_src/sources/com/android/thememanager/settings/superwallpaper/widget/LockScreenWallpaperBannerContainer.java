package com.android.thememanager.settings.superwallpaper.widget;

import android.app.WallpaperManager;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.opengl.LockScreenGLSurfaceView;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.miui.clock.MiuiClockView;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LockScreenWallpaperBannerContainer extends FrameLayout implements C2640k.toq {

    /* JADX INFO: renamed from: z */
    private static final String f15897z = LockScreenWallpaperBannerContainer.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    private boolean f15898g;

    /* JADX INFO: renamed from: h */
    private SuperWallpaperSummaryData f15899h;

    /* JADX INFO: renamed from: i */
    ContentObserver f15900i;

    /* JADX INFO: renamed from: k */
    private Context f15901k;

    /* JADX INFO: renamed from: n */
    private MiuiClockView f15902n;

    /* JADX INFO: renamed from: p */
    private String f15903p;

    /* JADX INFO: renamed from: q */
    private LockScreenGLSurfaceView f15904q;

    /* JADX INFO: renamed from: s */
    private WallpaperManager f15905s;

    /* JADX INFO: renamed from: y */
    private boolean f15906y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.LockScreenWallpaperBannerContainer$k */
    class C2682k extends ContentObserver {
        C2682k(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            LockScreenWallpaperBannerContainer.this.f7l8();
        }
    }

    private static class toq extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f61014f7l8 = 1;

        /* JADX INFO: renamed from: g */
        public static final int f15908g = 0;

        /* JADX INFO: renamed from: k */
        private WeakReference<LockScreenWallpaperBannerContainer> f15909k;

        /* JADX INFO: renamed from: n */
        private SuperWallpaperSummaryData f15910n;

        /* JADX INFO: renamed from: q */
        private String f15911q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Context f61015toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f61016zy;

        public toq(LockScreenWallpaperBannerContainer view, int type) {
            this.f15909k = new WeakReference<>(view);
            this.f61015toq = view.getContext();
            this.f61016zy = type;
            this.f15911q = view.f15903p;
            this.f15910n = C2640k.m9216n().m9221s(this.f15911q);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @hyr(api = 23)
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... params) {
            Drawable drawableLoadDrawable;
            if (this.f61016zy == 0) {
                drawableLoadDrawable = C2670y.m9307n(this.f61015toq);
            } else {
                SuperWallpaperSummaryData superWallpaperSummaryData = this.f15910n;
                drawableLoadDrawable = (superWallpaperSummaryData == null || superWallpaperSummaryData.f15594f == null) ? null : (com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() || com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().kja0()) ? this.f15910n.f15594f.f15616p.loadDrawable(this.f61015toq) : this.f15910n.f15594f.f15618s.loadDrawable(this.f61015toq);
            }
            Bitmap bitmapM7107k = ki.m7107k(drawableLoadDrawable);
            boolean z2 = true;
            if (bitmapM7107k == null || bitmapM7107k.isRecycled()) {
                Log.w(LockScreenWallpaperBannerContainer.f15897z, "getBitmapByDrawable got an error bitmap " + bitmapM7107k);
            } else if (com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(this.f61015toq, bitmapM7107k) == 0) {
                z2 = false;
            }
            Log.d(LockScreenWallpaperBannerContainer.f15897z, "GetColorModeTask isLight" + z2);
            return Boolean.valueOf(z2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            LockScreenWallpaperBannerContainer lockScreenWallpaperBannerContainer = this.f15909k.get();
            if (lockScreenWallpaperBannerContainer == null) {
                return;
            }
            lockScreenWallpaperBannerContainer.f15902n.setTextColorDark(result.booleanValue());
        }
    }

    public LockScreenWallpaperBannerContainer(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        if (this.f15902n == null) {
            return;
        }
        try {
            this.f15902n.setClockStyle(Settings.System.getInt(this.f15901k.getContentResolver(), com.miui.clock.zy.f72057yz));
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            Log.e(f15897z, "mClockPositionObserver " + e2.getMessage());
        }
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: n */
    private void m9365n() {
        new toq(this, this.f15898g ? 1 : 0).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    @hyr(api = 23)
    public void c8jq(SuperWallpaperSummaryData[] data) {
        if (data == null) {
            return;
        }
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15903p);
        this.f15899h = superWallpaperSummaryDataM9221s;
        if (superWallpaperSummaryDataM9221s != null) {
            m9365n();
        }
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: g */
    public void m9367g(boolean isSuperWallpaper, String swServiceName, String superWallpaperId) {
        Log.d(f15897z, "init isSuperWallpaper = " + isSuperWallpaper);
        this.f15898g = isSuperWallpaper;
        this.f15903p = superWallpaperId;
        f7l8();
        this.f15904q.mo9247k(isSuperWallpaper, swServiceName);
        if (this.f15898g) {
            this.f15899h = C2640k.m9216n().m9221s(this.f15903p);
        }
        if (this.f15899h == null) {
            C2640k.m9216n().m9220k(this);
        } else {
            m9365n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15901k.getContentResolver().registerContentObserver(Settings.System.getUriFor(com.miui.clock.zy.f72057yz), false, this.f15900i);
        this.f15900i.onChange(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15901k.getContentResolver().unregisterContentObserver(this.f15900i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15904q = (LockScreenGLSurfaceView) findViewById(R.id.lock_screen_wallpaper_banner_container_background);
        MiuiClockView miuiClockView = (MiuiClockView) findViewById(R.id.lock_screen_clock_view);
        this.f15902n = miuiClockView;
        miuiClockView.setVisibility(4);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (!hasFocus || this.f15902n == null || this.f15906y) {
            return;
        }
        Point pointZy = com.android.thememanager.settings.superwallpaper.utils.zy.zy(this.f15901k);
        int iMin = Math.min(pointZy.x, pointZy.y);
        this.f15902n.setScaleRatio(r0.getWidth() / iMin);
        this.f15902n.setVisibility(0);
        this.f15906y = true;
    }

    public LockScreenWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LockScreenWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15900i = new C2682k(new Handler());
        this.f15901k = context;
        this.f15905s = (WallpaperManager) context.getSystemService("wallpaper");
    }

    public LockScreenWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }
}
