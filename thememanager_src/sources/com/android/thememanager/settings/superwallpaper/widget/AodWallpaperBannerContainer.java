package com.android.thememanager.settings.superwallpaper.widget;

import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b3e.C1358k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodWallpaperBannerContainer extends FrameLayout implements C2640k.toq {

    /* JADX INFO: renamed from: f */
    private static final String f15817f = "support_change_with_time";

    /* JADX INFO: renamed from: l */
    private static final String f15818l = AodWallpaperBannerContainer.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    private boolean f15819g;

    /* JADX INFO: renamed from: h */
    private float f15820h;

    /* JADX INFO: renamed from: i */
    private float f15821i;

    /* JADX INFO: renamed from: k */
    private Context f15822k;

    /* JADX INFO: renamed from: n */
    private ImageView f15823n;

    /* JADX INFO: renamed from: p */
    private float f15824p;

    /* JADX INFO: renamed from: q */
    private ImageView f15825q;

    /* JADX INFO: renamed from: r */
    private String f15826r;

    /* JADX INFO: renamed from: s */
    private float f15827s;

    /* JADX INFO: renamed from: t */
    private ComponentName f15828t;

    /* JADX INFO: renamed from: y */
    private boolean f15829y;

    /* JADX INFO: renamed from: z */
    private WallpaperManager f15830z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.AodWallpaperBannerContainer$k */
    class ViewOnClickListenerC2674k implements View.OnClickListener {
        ViewOnClickListenerC2674k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            try {
                Intent qVar = C2663k.toq(AodWallpaperBannerContainer.this.f15829y, AodWallpaperBannerContainer.this.f15827s, AodWallpaperBannerContainer.this.f15824p, AodWallpaperBannerContainer.this.f15820h, AodWallpaperBannerContainer.this.f15821i);
                WallpaperManager wallpaperManager = (WallpaperManager) AodWallpaperBannerContainer.this.f15822k.getSystemService("wallpaper");
                if (wallpaperManager.getWallpaperInfo() != null && wallpaperManager.getWallpaperInfo().getServiceInfo() != null && wallpaperManager.getWallpaperInfo().getServiceInfo().name.contains("Earth")) {
                    qVar.putExtra(AodWallpaperBannerContainer.f15817f, 1);
                }
                AodWallpaperBannerContainer.this.f15822k.startActivity(qVar);
                kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.nr0, C1358k.f7233k, null);
            } catch (ActivityNotFoundException e2) {
                Log.e(AodWallpaperBannerContainer.f15818l, "startActivity not found " + e2.getMessage());
            } catch (Exception e3) {
                Log.e(AodWallpaperBannerContainer.f15818l, "startActivity " + e3.getMessage());
            }
        }
    }

    class toq extends AsyncTask<Void, Void, Bitmap> {
        toq() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... params) {
            return AodWallpaperBannerContainer.this.f15829y ? C2663k.m9267n(AodWallpaperBannerContainer.this.getContext(), AodWallpaperBannerContainer.this.f15827s, AodWallpaperBannerContainer.this.f15824p, AodWallpaperBannerContainer.this.f15820h, AodWallpaperBannerContainer.this.f15821i) : C2663k.m9270s(AodWallpaperBannerContainer.this.getContext());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap result) {
            if (result == null) {
                return;
            }
            AodWallpaperBannerContainer.this.f15825q.setImageBitmap(result);
        }
    }

    public AodWallpaperBannerContainer(@lvui Context context) {
        this(context, null);
    }

    @hyr(api = 23)
    private void ld6() {
        if (!this.f15819g) {
            this.f15823n.setImageDrawable(this.f15822k.getDrawable(R.drawable.aod_none));
            this.f15823n.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        if (!this.f15829y || this.f15830z.getWallpaperInfo() == null) {
            this.f15823n.setImageDrawable(null);
        } else {
            this.f15828t = this.f15830z.getWallpaperInfo().getComponent();
            SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15826r);
            if (superWallpaperSummaryDataM9221s != null) {
                x2(superWallpaperSummaryDataM9221s);
            } else {
                C2640k.m9216n().m9220k(this);
            }
        }
        this.f15823n.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @hyr(api = 23)
    private void x2(SuperWallpaperSummaryData data) {
        if (data.f15594f != null) {
            if (com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() || com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().kja0()) {
                this.f15823n.setImageIcon(data.f15594f.f15619y);
            } else {
                this.f15823n.setImageIcon(data.f15594f.f15611g);
            }
        }
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    public void c8jq(SuperWallpaperSummaryData[] data) {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15826r);
        if (superWallpaperSummaryDataM9221s != null) {
            x2(superWallpaperSummaryDataM9221s);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15825q = (ImageView) findViewById(R.id.aod_wallpaper_banner_container_image);
        this.f15823n = (ImageView) findViewById(R.id.aod_wallpaper_banner_container_background);
        setOnClickListener(new ViewOnClickListenerC2674k());
    }

    /* JADX INFO: renamed from: p */
    public void m9328p() {
        if (this.f15819g) {
            new toq().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            this.f15825q.setImageDrawable(null);
        }
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: s */
    public void m9329s(boolean isSuperWallpaper, Bundle superWallpaperData) {
        Log.d(f15818l, "init isSuperWallpaper = " + isSuperWallpaper);
        this.f15819g = C2663k.m9268p(this.f15822k);
        this.f15829y = isSuperWallpaper;
        if (superWallpaperData != null) {
            this.f15826r = superWallpaperData.getString("id");
            this.f15827s = superWallpaperData.getFloat("clock_position_x");
            this.f15824p = superWallpaperData.getFloat("clock_position_y");
            this.f15820h = superWallpaperData.getFloat("dual_clock_position_x_anchor_right");
            this.f15821i = superWallpaperData.getFloat("dual_clock_position_y");
        } else {
            this.f15827s = 0.0f;
            this.f15824p = 0.0f;
            this.f15820h = 0.0f;
            this.f15821i = 0.0f;
        }
        ld6();
        m9328p();
    }

    public AodWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AodWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15822k = context;
        this.f15830z = (WallpaperManager) context.getSystemService("wallpaper");
    }

    public AodWallpaperBannerContainer(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }
}
