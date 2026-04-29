package com.android.thememanager.detail.video.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.detail.video.model.VideoResource;
import com.miui.fastplayer.FastPlayer;
import com.miui.miwallpaper.opengl.EnumC5301t;
import ek5k.C6002g;
import java.io.IOException;
import java.util.Arrays;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FastVideoPlayer implements InterfaceC2010n, FastPlayer.FastPlayerListener {

    /* JADX INFO: renamed from: g */
    private TextureView f11432g;

    /* JADX INFO: renamed from: h */
    private Uri f11433h;

    /* JADX INFO: renamed from: i */
    private Uri f11434i;

    /* JADX INFO: renamed from: n */
    private final Context f11439n;

    /* JADX INFO: renamed from: r */
    private InterfaceC2011q f11443r;

    /* JADX INFO: renamed from: t */
    private int f11445t;

    /* JADX INFO: renamed from: y */
    private FastPlayer f11447y;

    /* JADX INFO: renamed from: z */
    private int f11448z;

    /* JADX INFO: renamed from: k */
    private final String f11436k = "FastVideoPlayer";

    /* JADX INFO: renamed from: q */
    private String f11442q = "video";

    /* JADX INFO: renamed from: s */
    public Surface f11444s = null;

    /* JADX INFO: renamed from: p */
    private boolean f11441p = true;

    /* JADX INFO: renamed from: l */
    private boolean f11437l = true;

    /* JADX INFO: renamed from: f */
    private boolean f11431f = false;

    /* JADX INFO: renamed from: c */
    private long f11429c = 0;

    /* JADX INFO: renamed from: e */
    private long f11430e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    private float f11435j = 0.17f;

    /* JADX INFO: renamed from: o */
    private float f11440o = 0.08f;

    /* JADX INFO: renamed from: m */
    private final float f11438m = 0.85f;

    /* JADX INFO: renamed from: b */
    public float[] f11428b = new float[16];

    /* JADX INFO: renamed from: a */
    public float[] f11427a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: x */
    private Runnable f11446x = new RunnableC2007k();

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.util.FastVideoPlayer$k */
    class RunnableC2007k implements Runnable {
        RunnableC2007k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FastVideoPlayer.this.f11437l = false;
            FastVideoPlayer fastVideoPlayer = FastVideoPlayer.this;
            fastVideoPlayer.fu4(fastVideoPlayer.f11433h);
            FastVideoPlayer.this.f11437l = true;
            if (FastVideoPlayer.this.f11431f) {
                FastVideoPlayer.this.pjz9(false);
            }
        }
    }

    class toq implements TextureView.SurfaceTextureListener {
        toq() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@lvui SurfaceTexture surface, int width, int height) {
            FastVideoPlayer.this.f11444s = new Surface(surface);
            C6002g.m22245p(FastVideoPlayer.this.f11446x);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@lvui SurfaceTexture surface) {
            FastVideoPlayer.this.cdj();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@lvui SurfaceTexture surface, int width, int height) {
            FastVideoPlayer.this.f11444s = new Surface(surface);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@lvui SurfaceTexture surface) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FastVideoPlayer(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "FastVideoPlayer"
            r4.f11436k = r0
            java.lang.String r1 = "video"
            r4.f11442q = r1
            r1 = 0
            r4.f11444s = r1
            r1 = 1
            r4.f11441p = r1
            r4.f11437l = r1
            r1 = 0
            r4.f11431f = r1
            r2 = 0
            r4.f11429c = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.f11430e = r2
            r2 = 1043207291(0x3e2e147b, float:0.17)
            r4.f11435j = r2
            r2 = 1034147594(0x3da3d70a, float:0.08)
            r4.f11440o = r2
            r2 = 1062836634(0x3f59999a, float:0.85)
            r4.f11438m = r2
            r2 = 16
            float[] r3 = new float[r2]
            r4.f11428b = r3
            float[] r2 = new float[r2]
            r2 = {x008c: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 1065353216, 0, 0, 0, 0, 1065353216} // fill-array
            r4.f11427a = r2
            com.android.thememanager.detail.video.util.FastVideoPlayer$k r2 = new com.android.thememanager.detail.video.util.FastVideoPlayer$k
            r2.<init>()
            r4.f11446x = r2
            r4.f11439n = r5
            com.android.thememanager.lockscreen.lock.TemplateConfig r5 = com.android.thememanager.settings.superwallpaper.utils.C2670y.m9306k()
            if (r5 == 0) goto L72
            com.android.thememanager.lockscreen.lock.WallpaperInfo r2 = r5.getWallpaperInfo()
            if (r2 == 0) goto L72
            com.android.thememanager.lockscreen.lock.WallpaperInfo r2 = r5.getWallpaperInfo()
            int r2 = r2.getMagicType()
            if (r2 == 0) goto L65
            com.android.thememanager.lockscreen.lock.WallpaperInfo r5 = r5.getWallpaperInfo()
            int r5 = r5.getMagicType()
            goto L73
        L65:
            com.android.thememanager.lockscreen.lock.WallpaperInfo r5 = r5.getWallpaperInfo()
            boolean r5 = r5.getEnableBlur()
            if (r5 == 0) goto L72
            r5 = 30000(0x7530, float:4.2039E-41)
            goto L73
        L72:
            r5 = r1
        L73:
            com.android.thememanager.basemodule.utils.qrj$toq r2 = com.android.thememanager.basemodule.utils.qrj.toq.NEW_LOCK_STYLE_SHADER
            boolean r2 = com.android.thememanager.basemodule.utils.qrj.zy(r2)
            if (r2 == 0) goto L81
            java.lang.String r5 = "middle device not support shader"
            android.util.Log.d(r0, r5)
            goto L82
        L81:
            r1 = r5
        L82:
            int r5 = r1 / 10000
            r4.f11448z = r5
            int r1 = r1 % 10000
            r4.f11445t = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.video.util.FastVideoPlayer.<init>(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj() {
        if (this.f11444s != null) {
            Log.d("FastVideoPlayer", "releaseSurface=============" + this.f11444s);
            this.f11444s.release();
            this.f11444s = null;
        }
    }

    private void fn3e(int index, FastPlayer mediaPlayer, Surface surface) {
        FastPlayer fastPlayer;
        if (mediaPlayer != null) {
            EnumC5301t valueByIndex = EnumC5301t.getValueByIndex(index);
            float fX2 = x2(valueByIndex);
            mediaPlayer.addShaderBitmap(this.f11439n, valueByIndex.normalTex, 0);
            mediaPlayer.addShaderBitmap(this.f11439n, valueByIndex.depthLightShadowTex, 1);
            mediaPlayer.setMoruGlassEffectUniform(valueByIndex.displacement, valueByIndex.darkness, 1.0f / valueByIndex.scaleX, 1.0f / valueByIndex.scaleY, 0.0f, 0.0f, fX2, 1.0f, valueByIndex.thickness, valueByIndex.distance, valueByIndex.ASP, valueByIndex.IOR, valueByIndex.lightness, valueByIndex.shadowness, 0.5f, 0.5f, valueByIndex.offsetX, 0.0f);
            try {
                fastPlayer = mediaPlayer;
            } catch (Exception e2) {
                e = e2;
                fastPlayer = mediaPlayer;
            }
            try {
                fastPlayer.addShaderSource(this.f11439n, 0, R.raw.a_blur_vertex);
                fastPlayer.addShaderSource(this.f11439n, 1, R.raw.a_moru_glass_fragment);
            } catch (Exception e3) {
                e = e3;
                Log.e("FastVideoPlayer", "debug player -  addShaderSource failed!");
                e.printStackTrace();
            }
            fastPlayer.setSurface(surface, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fu4(Uri source) {
        if (source == null) {
            Log.d("FastVideoPlayer", "setupFastPlayer : uri invalid.");
            return;
        }
        Surface surface = this.f11444s;
        if (surface == null || !surface.isValid()) {
            Log.d("FastVideoPlayer", "setupFastPlayer : mSurface invalid.");
            return;
        }
        try {
            pjz9(true);
            this.f11447y = new FastPlayer();
            if (this.f11444s != null) {
                Log.d("FastVideoPlayer", "addDataSource, Uri=" + source + ",mLoop=" + this.f11441p);
                this.f11447y.set_callback(this);
                this.f11447y.addDataSource(this.f11439n, source, 0);
                this.f11447y.setLoop(this.f11441p, 0);
                this.f11447y.setVideoClipping(this.f11429c, this.f11430e, 0);
                this.f11447y.setVideoScalingMode(2);
                this.f11447y.disableShader(true);
                this.f11434i = source;
                this.f11428b = m7844p();
                m7841z(this.f11447y, this.f11444s);
            }
        } catch (Exception e2) {
            this.f11437l = false;
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m7835h(int i2, int i3) {
        switch (i2) {
            case 1:
                this.f11443r.mo6437k(0);
                break;
            case 2:
                this.f11443r.mo6437k(1);
                break;
            case 3:
                this.f11443r.toq(kja0(), n7h());
                this.f11443r.mo6437k(2);
                break;
            case 4:
                this.f11443r.mo6437k(4);
                break;
            case 5:
                this.f11443r.mo6437k(6);
                break;
            case 6:
                this.f11443r.mo6437k(3);
                break;
            case 8:
            case 9:
                Log.d("FastVideoPlayer", "player mode change mode：" + i2 + " code：" + i3);
                this.f11443r.mo6437k(5);
                break;
        }
    }

    private void ki(FastPlayer mediaPlayer, Surface surface) {
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    private int kja0() {
        try {
            FastPlayer fastPlayer = this.f11447y;
            if (fastPlayer != null && this.f11437l) {
                return Integer.valueOf(fastPlayer.extractMetadata(18, 0)).intValue();
            }
            Log.d("FastVideoPlayer", "getVideoWidth fail. reason= addDataSourceDone = false");
            return -1;
        } catch (NumberFormatException e2) {
            Log.d("FastVideoPlayer", "get video width fail. reason=" + e2.getMessage());
            return -1;
        }
    }

    private float ld6(int glassId) {
        if (this.f11448z != 1) {
            return 1.0f;
        }
        if (glassId == 0) {
            return 1.08f;
        }
        if (glassId == 1) {
            return 1.28f;
        }
        if (glassId != 2) {
            return (glassId == 3 || glassId == 4) ? 1.14f : 1.0f;
        }
        return 1.08f;
    }

    private int n7h() {
        try {
            FastPlayer fastPlayer = this.f11447y;
            if (fastPlayer != null && this.f11437l) {
                return Integer.valueOf(fastPlayer.extractMetadata(19, 0)).intValue();
            }
            Log.d("FastVideoPlayer", "getVideoHeight fail. reason= addDataSourceDone = false");
            return -1;
        } catch (NumberFormatException e2) {
            Log.d("FastVideoPlayer", "get video height fail. reason=" + e2.getMessage());
            return -1;
        }
    }

    private void ni7(FastPlayer mediaPlayer, Surface surface) {
        if (mediaPlayer != null) {
            mediaPlayer.setPoorBlurEffectUniform(new float[]{1.0f, 1.0f, 0.0f, 0.0f}, 8.0f, 2, 3);
            try {
                mediaPlayer.addShaderSource(this.f11439n, 0, R.raw.blur_down_vet);
                mediaPlayer.addShaderSource(this.f11439n, 1, R.raw.blur_down_frag);
                mediaPlayer.addShaderSource(this.f11439n, 0, R.raw.blur_up_vet);
                mediaPlayer.addShaderSource(this.f11439n, 1, R.raw.blur_up_frag);
                mediaPlayer.addShaderSource(this.f11439n, 0, R.raw.blur_up_vet);
                mediaPlayer.addShaderSource(this.f11439n, 1, R.raw.blur_finalcolor);
                mediaPlayer.setSurface(surface, 9, null);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private void o1t(boolean isShowMatrix) {
        if (isShowMatrix) {
            this.f11447y.setVideoScalingMode(1);
            this.f11447y.setUseMatrix(this.f11428b);
        } else {
            this.f11447y.setVideoScalingMode(2);
            this.f11447y.setUseMatrix(this.f11427a);
        }
    }

    private float qrj() {
        float f2;
        float f3;
        Point pointFn3e = y9n.fn3e();
        if (!C1807g.zurt()) {
            if (C1807g.lvui()) {
                return (this.f11435j / ((Math.max(pointFn3e.x, pointFn3e.y) * 1.0f) / 1080.0f)) * 0.85f;
            }
            return 0.0f;
        }
        if (!b8.toq.toq(this.f11439n)) {
            f2 = this.f11435j;
            f3 = this.f11428b[0];
        } else {
            if (C1819o.ncyb(bf2.toq.toq())) {
                return (this.f11435j / (((pointFn3e.x * 1.0f) / pointFn3e.y) * 2.0f)) / this.f11428b[0];
            }
            f2 = this.f11435j / 2.0f;
            f3 = this.f11428b[0];
        }
        return f2 / f3;
    }

    /* JADX INFO: renamed from: s */
    private float[] m7839s(float videoWidth, float videoHeight, float surfaceWidth, float surfaceHeight) {
        float[] fArr = new float[16];
        float f2 = videoWidth / videoHeight;
        float f3 = surfaceWidth / surfaceHeight;
        Matrix.setIdentityM(fArr, 0);
        if (f2 == f3) {
            Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
        } else if (f2 < f3) {
            float f4 = (videoHeight / (videoWidth / surfaceWidth)) / surfaceHeight;
            if (f4 < 1.0f) {
                Matrix.scaleM(fArr, 0, 2.0f - f4, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(fArr, 0, 1.0f, f4, 1.0f);
            }
        } else {
            float f5 = (videoHeight / (videoWidth / surfaceHeight)) / surfaceWidth;
            if (f5 < 1.0f) {
                Matrix.scaleM(fArr, 0, 1.0f, 2.0f - f5, 1.0f);
            } else {
                Matrix.scaleM(fArr, 0, f5, 1.0f, 1.0f);
            }
        }
        if (this.f11448z == 1) {
            Matrix.scaleM(fArr, 0, ld6(this.f11445t), 1.0f, 1.0f);
        }
        Log.w("FastVideoPlayer", "bitmapWidth = " + videoWidth + ", bitmapHeight = " + videoHeight + ", surfaceWidth = " + surfaceWidth + ", surfaceHeight = " + surfaceHeight + ", matrix = " + Arrays.toString(fArr));
        return fArr;
    }

    private float x2(EnumC5301t moruGlassParam) {
        float f2;
        float f3;
        if (!C1807g.zurt()) {
            if (!C1807g.lvui()) {
                return moruGlassParam.uNormalScaleX;
            }
            Point pointFn3e = y9n.fn3e();
            return (moruGlassParam.uNormalScaleX / ((Math.max(pointFn3e.x, pointFn3e.y) * 1.0f) / 1080.0f)) * 0.85f;
        }
        Point pointFn3e2 = y9n.fn3e();
        if (!C1807g.wvg()) {
            f2 = moruGlassParam.uNormalScaleX;
            f3 = this.f11428b[0];
        } else if (C1819o.ncyb(bf2.toq.toq())) {
            f2 = moruGlassParam.uNormalScaleX / (((pointFn3e2.x * 1.0f) / pointFn3e2.y) * 2.0f);
            f3 = this.f11428b[0];
        } else {
            f2 = moruGlassParam.uNormalScaleX / 2.0f;
            f3 = this.f11428b[0];
        }
        return f2 / f3;
    }

    /* JADX INFO: renamed from: z */
    private void m7841z(FastPlayer mediaPlayer, Surface surface) {
        Log.d("FastVideoPlayer", "setupShader: mode " + this.f11448z + " index " + this.f11445t);
        int i2 = this.f11448z;
        if (i2 == 1) {
            fn3e(this.f11445t, mediaPlayer, surface);
        } else if (i2 != 3) {
            ki(mediaPlayer, surface);
        } else {
            ni7(mediaPlayer, surface);
        }
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    /* JADX INFO: renamed from: b */
    public void mo7842b(View view) {
        Log.d("FastVideoPlayer", "setPlayerView=" + view);
        if (view == null || !(view instanceof TextureView)) {
            return;
        }
        TextureView textureView = (TextureView) view;
        this.f11432g = textureView;
        textureView.setOpaque(false);
        cdj();
        if (this.f11432g.isAvailable()) {
            this.f11444s = new Surface(this.f11432g.getSurfaceTexture());
        } else {
            this.f11432g.setSurfaceTextureListener(new toq());
        }
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void b3e(long endTime) {
        this.f11430e = endTime;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void bwp(boolean enable) {
        FastPlayer fastPlayer = this.f11447y;
        if (fastPlayer != null) {
            if (!this.f11437l) {
                Log.d("FastVideoPlayer", "can not disable video shader because during add data source");
            } else {
                fastPlayer.disableShader(enable);
                o1t(!enable);
            }
        }
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void cfr(VideoResource resource) {
        Surface surface;
        this.f11433h = resource.getPreviewUri();
        Surface surface2 = this.f11444s;
        if (surface2 == null || !surface2.isValid() || (surface = this.f11444s) == null || !surface.isValid()) {
            return;
        }
        if (C6002g.kja0().getQueue().size() > 0) {
            C6002g.kja0().remove(this.f11446x);
            if (!C6002g.kja0().getQueue().isEmpty()) {
                C6002g.kja0().getQueue().remove();
            }
        }
        C6002g.m22245p(this.f11446x);
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void eqxt() {
        Surface surface;
        Uri uri;
        Log.d("FastVideoPlayer", "startPlay: ", new Throwable());
        if (this.f11447y == null || (surface = this.f11444s) == null || !surface.isValid() || (uri = this.f11433h) == null || !uri.equals(this.f11434i)) {
            return;
        }
        this.f11447y.start();
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public int etdu(float percentage, long targetTime, int datasourceId) {
        FastPlayer fastPlayer = this.f11447y;
        if (fastPlayer == null) {
            return 0;
        }
        return fastPlayer.seekto(percentage, targetTime, datasourceId);
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public long getDuration() {
        FastPlayer fastPlayer;
        if (this.f11433h != null && (fastPlayer = this.f11447y) != null) {
            try {
                if (this.f11437l) {
                    return Long.valueOf(fastPlayer.extractMetadata(9, 0)).longValue();
                }
                Log.w("FastVideoPlayer", "error getDuration, reason: addDataSourceDone = false");
                return 0L;
            } catch (NumberFormatException e2) {
                Log.d("FastVideoPlayer", "get duration fail. reason=" + e2.getMessage());
            }
        }
        return 0L;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void hyr() {
        FastPlayer fastPlayer = this.f11447y;
        if (fastPlayer != null) {
            fastPlayer.pause();
        }
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    /* JADX INFO: renamed from: i */
    public InterfaceC2010n mo7843i() {
        return this;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void lrht(String type) {
        this.f11442q = type;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        pjz9(false);
    }

    /* JADX INFO: renamed from: p */
    public float[] m7844p() {
        Point pointFn3e = y9n.fn3e();
        if (C1807g.zurt()) {
            this.f11428b = m7839s(kja0(), n7h(), pointFn3e.x, pointFn3e.y);
        } else {
            Matrix.setIdentityM(this.f11428b, 0);
            Matrix.scaleM(this.f11428b, 0, ld6(this.f11445t), 1.0f, 1.0f);
        }
        return this.f11428b;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void pjz9(boolean force) {
        FastPlayer fastPlayer;
        if ((force || this.f11437l) && (fastPlayer = this.f11447y) != null) {
            fastPlayer.release();
            Log.d("FastVideoPlayer", "releasePlayer=============" + this.f11447y);
            this.f11447y = null;
        }
    }

    @Override // com.miui.fastplayer.FastPlayer.FastPlayerListener
    public int playerModeChange(final int mode, final int code) {
        if (this.f11443r == null) {
            return 0;
        }
        C6002g.zurt(new Runnable() { // from class: com.android.thememanager.detail.video.util.zy
            @Override // java.lang.Runnable
            public final void run() {
                this.f11478k.m7835h(mode, code);
            }
        }, 200L);
        return 0;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        this.f11431f = false;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void ukdy(long startTime) {
        this.f11429c = startTime;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void vy(InterfaceC2011q playStateListener) {
        this.f11443r = playStateListener;
    }

    @Override // com.android.thememanager.detail.video.util.InterfaceC2010n
    public void y2() {
        FastPlayer fastPlayer = this.f11447y;
        if (fastPlayer == null) {
            return;
        }
        fastPlayer.pauseRenderFrame();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
        this.f11431f = true;
    }
}
