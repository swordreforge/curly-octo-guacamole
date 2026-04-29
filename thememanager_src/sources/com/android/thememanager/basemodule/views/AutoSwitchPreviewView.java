package com.android.thememanager.basemodule.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cnbm.C1404k;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.base.BaseTemplateView;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.ch;
import com.miui.clock.MiuiClockView;
import ek5k.C6002g;
import i1.C6077k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import miui.util.InputStreamLoader;
import miuix.animation.base.AnimConfig;
import miuix.animation.utils.EaseManager;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class AutoSwitchPreviewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private static final String f10497a = "ASPV";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f57829bo = -1;

    /* JADX INFO: renamed from: d */
    public static final int f10498d = 1;

    /* JADX INFO: renamed from: u */
    private static final int f10499u = 255;

    /* JADX INFO: renamed from: v */
    public static final int f10500v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f10501w = 2;

    /* JADX INFO: renamed from: x */
    private static final long f10502x = 300;

    /* JADX INFO: renamed from: b */
    private VideoDetailActivity.InterfaceC2013g f10503b;

    /* JADX INFO: renamed from: c */
    private ImageView f10504c;

    /* JADX INFO: renamed from: e */
    private toq f10505e;

    /* JADX INFO: renamed from: f */
    private ImageView f10506f;

    /* JADX INFO: renamed from: g */
    private ValueAnimator f10507g;

    /* JADX INFO: renamed from: h */
    private MiuiClockView f10508h;

    /* JADX INFO: renamed from: i */
    private View f10509i;

    /* JADX INFO: renamed from: j */
    private int f10510j;

    /* JADX INFO: renamed from: k */
    private boolean f10511k;

    /* JADX INFO: renamed from: l */
    private View f10512l;

    /* JADX INFO: renamed from: m */
    private boolean f10513m;

    /* JADX INFO: renamed from: n */
    private boolean f10514n;

    /* JADX INFO: renamed from: o */
    private int f10515o;

    /* JADX INFO: renamed from: p */
    private ImageView f10516p;

    /* JADX INFO: renamed from: q */
    private boolean f10517q;

    /* JADX INFO: renamed from: r */
    private BitmapDrawable f10518r;

    /* JADX INFO: renamed from: s */
    private Animator.AnimatorListener f10519s;

    /* JADX INFO: renamed from: t */
    private Bitmap f10520t;

    /* JADX INFO: renamed from: y */
    private ValueAnimator.AnimatorUpdateListener f10521y;

    /* JADX INFO: renamed from: z */
    private TemplateConfig f10522z;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.AutoSwitchPreviewView$k */
    class C1841k implements Animator.AnimatorListener {
        C1841k() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AutoSwitchPreviewView.this.f10514n = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AutoSwitchPreviewView.this.f10514n = false;
            AutoSwitchPreviewView.this.f10511k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AutoSwitchPreviewView.this.f10514n = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class toq extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f57830f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f10524g;

        /* JADX INFO: renamed from: k */
        private Bitmap f10525k;

        /* JADX INFO: renamed from: n */
        private Map<String, Integer> f10526n;

        /* JADX INFO: renamed from: q */
        private int f10527q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Bitmap f57831toq;

        /* JADX INFO: renamed from: y */
        private String f10528y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<AutoSwitchPreviewView> f57832zy;

        toq(AutoSwitchPreviewView view, Bitmap wallpaperBitmap, String uri, String videoThumbPath, boolean updateLauncherPreview) {
            this.f10525k = wallpaperBitmap;
            this.f57830f7l8 = uri;
            this.f10528y = videoThumbPath;
            this.f10527q = view.f10510j;
            this.f57832zy = new WeakReference<>(view);
            this.f10524g = updateLauncherPreview;
            Log.w(AutoSwitchPreviewView.f10497a, "GetColorModeAndPreviewTask mUpdateLauncherPreview :" + this.f10524g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8(File file, String str, Bitmap bitmap) {
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str);
            try {
                if (m7302g(file2.lastModified())) {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 70, new FileOutputStream(file2));
                    Log.w(AutoSwitchPreviewView.f10497a, "getHomePreviewBitmap: cache success, cacheFileName: " + str);
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: n */
        private String m7300n() {
            if (!C1807g.wvg() && !C1807g.lvui()) {
                return com.android.thememanager.basemodule.resource.constants.toq.ga8;
            }
            boolean zNcyb = C1819o.ncyb(bf2.toq.toq());
            Log.w(AutoSwitchPreviewView.f10497a, "getHomePreviewCacheFileName land: " + zNcyb);
            return zNcyb ? com.android.thememanager.basemodule.resource.constants.toq.u02j : com.android.thememanager.basemodule.resource.constants.toq.qode;
        }

        /* JADX INFO: renamed from: q */
        private Bitmap m7301q() {
            final Bitmap bitmapM7006n = bf2.m7006n(this.f10527q, false, true);
            final String strM7300n = m7300n();
            final File file = new File(bf2.toq.toq().getCacheDir(), com.android.thememanager.basemodule.resource.constants.toq.dcmf);
            if (bitmapM7006n != null) {
                C6002g.ld6().execute(new Runnable() { // from class: com.android.thememanager.basemodule.views.zy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10633k.f7l8(file, strM7300n, bitmapM7006n);
                    }
                });
                Log.w(AutoSwitchPreviewView.f10497a, "getHomePreviewBitmap: return result success form home");
                return bitmapM7006n;
            }
            Log.w(AutoSwitchPreviewView.f10497a, "getHomePreviewBitmap: result is null from home");
            File file2 = new File(file, strM7300n);
            if (file2.exists() && !file2.isDirectory()) {
                bitmapM7006n = com.android.thememanager.lockscreen.lock.wallpaper.toq.f12529k.m8158n(file2.getAbsolutePath(), -1, -1);
            }
            if (bitmapM7006n == null) {
                Log.w(AutoSwitchPreviewView.f10497a, "getHomePreviewBitmap: use cache");
                return bitmapM7006n;
            }
            Log.w(AutoSwitchPreviewView.f10497a, "getHomePreviewBitmap: use Default");
            return bf2.m7007q();
        }

        /* JADX INFO: renamed from: g */
        public boolean m7302g(long fileModflyTime) {
            return System.currentTimeMillis() - fileModflyTime >= 900000;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            if (!TextUtils.isEmpty(this.f10528y) && (mcp.m7139n() || ch.vyq(this.f10528y))) {
                if (!this.f10528y.startsWith("https") && !this.f10528y.startsWith("http") && !this.f10528y.startsWith("content://") && !this.f10528y.startsWith(com.android.thememanager.h5.f7l8.f12010h)) {
                    this.f10528y = com.android.thememanager.h5.f7l8.f12010h + this.f10528y;
                }
                this.f10525k = C2763c.x2(new InputStreamLoader(bf2.toq.toq(), Uri.parse(this.f10528y)), 4, true);
            }
            if (this.f10525k == null && !TextUtils.isEmpty(this.f57830f7l8)) {
                this.f10525k = com.android.thememanager.basemodule.video.f7l8.toq(this.f57830f7l8, -1L, 2);
                Log.w("AutoSwitchPreviewView", "mUri=" + this.f57830f7l8 + ",bmp=" + this.f10525k);
            }
            Bitmap bitmap = this.f10525k;
            int iM7005k = 0;
            if (bitmap == null) {
                Log.w(AutoSwitchPreviewView.f10497a, "wallpaper Bitmap is null: color pick false");
            } else if (bitmap.isRecycled()) {
                Log.w("AutoSwitchPreviewView", "can not get wallpaper color mode. bitmap recycled!");
            } else {
                Bitmap bitmapZy = C1807g.zurt() ? zy(this.f10525k) : this.f10525k;
                if (o1t.m7171i()) {
                    iM7005k = C1404k.m5866n(bitmapZy, false) ? 0 : 2;
                } else {
                    iM7005k = bf2.m7005k(bitmapZy, 5);
                }
                this.f10526n = C1404k.m5869s(bitmapZy, null);
            }
            if (this.f10527q == iM7005k && !this.f10524g) {
                Log.w(AutoSwitchPreviewView.f10497a, "don't update home preview");
                return null;
            }
            this.f10527q = iM7005k;
            this.f57831toq = m7301q();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void params) {
            AutoSwitchPreviewView autoSwitchPreviewView = this.f57832zy.get();
            if (autoSwitchPreviewView == null || !C1819o.eqxt((Activity) autoSwitchPreviewView.getContext())) {
                return;
            }
            autoSwitchPreviewView.m7292i(this.f10525k, this.f57831toq, this.f10527q, this.f10524g, this.f10526n);
        }

        public Bitmap zy(Bitmap bitmap) {
            if (!C1807g.zurt()) {
                return bitmap;
            }
            try {
                Point pointFn3e = y9n.fn3e();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(pointFn3e.x, pointFn3e.y), Math.max(pointFn3e.x, pointFn3e.y), Bitmap.Config.ARGB_8888);
                C2763c.f7l8(bitmap, bitmapCreateBitmap, null);
                return bitmapCreateBitmap;
            } catch (Exception unused) {
                return bitmap;
            }
        }
    }

    public AutoSwitchPreviewView(@lvui Context context) {
        super(context);
        this.f10511k = true;
        this.f10517q = false;
        this.f10514n = false;
        this.f10510j = -1;
        this.f10515o = 1;
        this.f10513m = false;
        ki();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public void cdj(ValueAnimator animation) {
        float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
        if (this.f10511k) {
            if (this.f10513m) {
                MiuiClockView miuiClockView = this.f10508h;
                if (miuiClockView != null) {
                    miuiClockView.setVisibility(0);
                    this.f10508h.setClockAlpha(0.0f);
                }
                this.f10512l.setAlpha(kja0() ? fFloatValue : 1.0f - fFloatValue);
                this.f10506f.setAlpha(fFloatValue);
                this.f10504c.setAlpha(1.0f - fFloatValue);
                return;
            }
            if (o1t.m7171i()) {
                View view = this.f10509i;
                if (view != null) {
                    if (!x2()) {
                        fFloatValue = 1.0f - fFloatValue;
                    }
                    view.setAlpha(fFloatValue);
                    return;
                }
                return;
            }
            MiuiClockView miuiClockView2 = this.f10508h;
            if (miuiClockView2 != null) {
                if (!x2()) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                miuiClockView2.setClockAlpha(fFloatValue);
                return;
            }
            return;
        }
        if (!n7h() && this.f10513m) {
            this.f10512l.setAlpha(kja0() ? fFloatValue : 1.0f - fFloatValue);
            if (kja0()) {
                this.f10506f.setAlpha(fFloatValue);
                this.f10504c.setAlpha(1.0f - fFloatValue);
            }
            if (x2()) {
                this.f10506f.setAlpha(1.0f - fFloatValue);
                this.f10504c.setAlpha(fFloatValue);
            }
        }
        if (!kja0()) {
            if (o1t.m7171i()) {
                View view2 = this.f10509i;
                if (view2 != null) {
                    view2.setAlpha(x2() ? fFloatValue : 1.0f - fFloatValue);
                }
            } else {
                MiuiClockView miuiClockView3 = this.f10508h;
                if (miuiClockView3 != null) {
                    miuiClockView3.setClockAlpha(x2() ? fFloatValue : 1.0f - fFloatValue);
                }
            }
        }
        if (this.f10517q) {
            if (x2() && this.f10513m) {
                return;
            }
            BitmapDrawable bitmapDrawable = this.f10518r;
            if (!n7h()) {
                fFloatValue = 1.0f - fFloatValue;
            }
            bitmapDrawable.setAlpha((int) (fFloatValue * 255.0f));
            this.f10516p.setImageDrawable(this.f10518r);
        }
    }

    private void fn3e(Bitmap wallpaper, String videoPath, String videoThumbPath, boolean updateLauncherPreview) {
        toq toqVar = this.f10505e;
        if (toqVar != null) {
            toqVar.cancel(true);
        }
        toq toqVar2 = new toq(this, wallpaper, videoPath, videoThumbPath, updateLauncherPreview);
        this.f10505e = toqVar2;
        toqVar2.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    private void m7290g() {
        int i2 = !this.f10513m ? 1 : 0;
        int i3 = this.f10515o + 1;
        this.f10515o = i3;
        if (i3 <= 2) {
            this.f10515o = i3;
        } else {
            this.f10515o = i2;
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m7291h() {
        return o1t.m7171i() && !com.android.thememanager.superwallpaper.util.toq.m9512q(this.f10522z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m7292i(Bitmap wallpaperBitmap, Bitmap homePreviewBitmap, int colorMode, boolean mUpdateLauncherPreview, Map<String, Integer> map) {
        MiuiClockView miuiClockView;
        View view;
        this.f10517q = true;
        boolean zM7171i = o1t.m7171i();
        StringBuilder sb = new StringBuilder();
        sb.append("updateColorModeAndPreview: wallpaperBitmap = null ");
        sb.append(wallpaperBitmap == null);
        sb.append(",homePreviewBitmap == null ? ");
        sb.append(homePreviewBitmap == null);
        Log.d(f10497a, sb.toString());
        if (zM7171i && wallpaperBitmap != null && (view = this.f10509i) != null) {
            ((BaseTemplateView) view).jp0y(wallpaperBitmap);
        }
        if (this.f10510j != colorMode || mUpdateLauncherPreview) {
            this.f10510j = colorMode;
            Bitmap bitmap = this.f10520t;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f10520t.recycle();
            }
            this.f10520t = homePreviewBitmap;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f10520t);
            this.f10518r = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, C1819o.jk(getContext()), C1819o.mcp(getContext()));
            if (!n7h()) {
                this.f10518r.setAlpha(0);
            }
            Log.d(f10497a, "updateColorModeAndPreview: updateHomePreview");
            this.f10516p.setImageDrawable(this.f10518r);
            if (!zM7171i && (miuiClockView = this.f10508h) != null) {
                miuiClockView.setTextColorDark(this.f10510j != 0);
            }
            if (this.f10511k) {
                t8r();
            }
        }
    }

    private void ki() {
        this.f10521y = new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.basemodule.views.toq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10626k.cdj(valueAnimator);
            }
        };
        this.f10519s = new C1841k();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10507g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f10507g.setDuration(300L);
        this.f10507g.addUpdateListener(this.f10521y);
        this.f10507g.addListener(this.f10519s);
        this.f10516p = new ImageView(getContext());
        if (C1807g.lvui() && (getContext() instanceof AbstractActivityC1717k) && C1819o.dd((Activity) getContext())) {
            this.f10516p.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        addView(this.f10516p, -1, -1);
        this.f10522z = C2670y.m9306k();
    }

    private boolean kja0() {
        return this.f10515o == 0;
    }

    private boolean n7h() {
        return this.f10515o == 2;
    }

    private boolean x2() {
        return this.f10515o == 1;
    }

    /* JADX INFO: renamed from: y */
    private void m7296y(Boolean show) {
        C6077k.m22367g(this.f10516p);
        AnimConfig animConfig = new AnimConfig();
        if (show.booleanValue()) {
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.7f));
            C6077k.m22373q(this.f10516p, animConfig);
        } else {
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.3f));
            C6077k.toq(this.f10516p, animConfig);
        }
    }

    public int getCurrentStatus() {
        return this.f10515o;
    }

    public void ld6(MiuiClockView clock, View pictureDescription, ImageView picPreview, ImageView buttonPreview) {
        this.f10513m = true;
        this.f10515o = 0;
        this.f10508h = clock;
        this.f10512l = pictureDescription;
        if (clock != null) {
            clock.setVisibility(4);
            this.f10508h.setClockAlpha(0.0f);
        }
        View view = this.f10512l;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        this.f10506f = picPreview;
        this.f10504c = buttonPreview;
    }

    public void ni7(String videoPath, String videoThumbPath, boolean updateLauncherPreview) {
        fn3e(null, videoPath, videoThumbPath, updateLauncherPreview);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f10520t;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f10520t.recycle();
        }
        toq toqVar = this.f10505e;
        if (toqVar != null) {
            toqVar.cancel(false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m7297p(View templateView) {
        View view;
        this.f10509i = templateView;
        if (!o1t.m7171i() || (view = this.f10509i) == null) {
            return;
        }
        view.setAlpha(0.0f);
    }

    public boolean qrj() {
        return x2();
    }

    /* JADX INFO: renamed from: s */
    public void m7298s(MiuiClockView clock) {
        this.f10508h = clock;
        if (clock != null) {
            clock.setClockAlpha(0.0f);
        }
        this.f10513m = false;
        this.f10515o = 1;
    }

    public void setSwitchListener(VideoDetailActivity.InterfaceC2013g switchListener) {
        this.f10503b = switchListener;
    }

    public void setmCurrentStatus(int status) {
        this.f10515o = status;
    }

    public boolean t8r() {
        if (this.f10514n || !this.f10517q) {
            return false;
        }
        if (!this.f10511k) {
            m7290g();
        }
        this.f10507g.start();
        VideoDetailActivity.InterfaceC2013g interfaceC2013g = this.f10503b;
        if (interfaceC2013g == null) {
            return true;
        }
        interfaceC2013g.mo7848k();
        return true;
    }

    public void zurt(Bitmap wallpaper, boolean updateLauncherPreview) {
        fn3e(wallpaper, null, null, updateLauncherPreview);
    }

    public AutoSwitchPreviewView(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f10511k = true;
        this.f10517q = false;
        this.f10514n = false;
        this.f10510j = -1;
        this.f10515o = 1;
        this.f10513m = false;
        ki();
    }

    public AutoSwitchPreviewView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f10511k = true;
        this.f10517q = false;
        this.f10514n = false;
        this.f10510j = -1;
        this.f10515o = 1;
        this.f10513m = false;
        ki();
    }
}
