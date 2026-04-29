package com.android.thememanager.service;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.service.wallpaper.WallpaperService;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.service.InterfaceC2492g;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.util.g1;
import com.google.android.exoplayer2.util.wvg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import miuix.core.util.C7083n;
import qkj8.C7617k;

/* JADX INFO: loaded from: classes2.dex */
public class VideoWallpaperService extends WallpaperService {

    /* JADX INFO: renamed from: g */
    private static final String f14788g = "VideoWallpaper";

    /* JADX INFO: renamed from: p */
    public static boolean f14789p = false;

    /* JADX INFO: renamed from: s */
    public static boolean f14790s = false;

    /* JADX INFO: renamed from: y */
    public static boolean f14791y = true;

    /* JADX INFO: renamed from: k */
    private zy f14792k;

    /* JADX INFO: renamed from: n */
    private toq f14793n;

    /* JADX INFO: renamed from: q */
    private int f14794q = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.service.VideoWallpaperService$q */
    class C2491q extends WallpaperService.Engine implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: g */
        private InterfaceC2492g f14796g;

        /* JADX INFO: renamed from: h */
        private boolean f14797h;

        /* JADX INFO: renamed from: i */
        private boolean f14798i;

        /* JADX INFO: renamed from: k */
        private final Context f14799k;

        /* JADX INFO: renamed from: l */
        private q f14800l;

        /* JADX INFO: renamed from: n */
        private PowerManager f14801n;

        /* JADX INFO: renamed from: p */
        private boolean f14802p;

        /* JADX INFO: renamed from: q */
        private AudioManager f14803q;

        /* JADX INFO: renamed from: r */
        private final BroadcastReceiver f14804r;

        /* JADX INFO: renamed from: s */
        private boolean f14805s;

        /* JADX INFO: renamed from: t */
        private final BroadcastReceiver f14806t;

        /* JADX INFO: renamed from: y */
        private final String f14807y;

        /* JADX INFO: renamed from: z */
        private final zy f14808z;

        /* JADX INFO: renamed from: com.android.thememanager.service.VideoWallpaperService$q$k */
        class k extends BroadcastReceiver {
            k() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (p001b.f7l8.f53809sc.equals(intent.getAction())) {
                    C2491q.this.f14805s = intent.getBooleanExtra(p001b.f7l8.mete, false);
                    C2491q.this.f14802p = intent.getBooleanExtra(p001b.f7l8.k4jz, false);
                    C2491q.this.f14797h = intent.getBooleanExtra(p001b.f7l8.zma, false);
                    C2491q.this.f14798i = intent.getBooleanExtra(p001b.f7l8.vg, true);
                    if (TextUtils.isEmpty(C2491q.this.f14807y)) {
                        throw new IllegalArgumentException("path must not null");
                    }
                    C2789j.m9825g(VideoWallpaperService.f14788g, "change desktop video wallpaper, media path %s, sounds %s", C2491q.this.f14807y, Boolean.valueOf(C2491q.this.f14805s));
                    try {
                        C2491q.this.fu4(true);
                    } catch (ExceptionInInitializerError | IllegalStateException e2) {
                        C2789j.x2(VideoWallpaperService.f14788g, "update error: " + e2.getMessage(), new Object[0]);
                    }
                    C2491q.this.fn3e(true);
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.service.VideoWallpaperService$q$q */
        private class q extends AsyncTask<Boolean, Void, String> {
            private q() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public String doInBackground(Boolean... booleans) {
                return C2491q.this.ni7(booleans[0].booleanValue()).getPath();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(String mediaSource) {
                if (C2491q.this.f14796g == null || isCancelled()) {
                    return;
                }
                C2491q.this.zurt(mediaSource);
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.service.VideoWallpaperService$q$toq */
        class toq extends BroadcastReceiver {
            toq() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String strZy;
                if (C2491q.this.f14802p) {
                    strZy = C7617k.toq().zy();
                    String action = intent.getAction();
                    action.hashCode();
                    switch (action) {
                        case "android.intent.action.SCREEN_OFF":
                            VideoWallpaperService.f14791y = false;
                            VideoWallpaperService.f14790s = true;
                            VideoWallpaperService.f14789p = false;
                            C2491q.this.f14798i = "com.android.thememanager.theme_lock_live_wallpaper".equals(strZy);
                            C2491q.this.onVisibilityChanged(false);
                            break;
                        case "android.intent.action.SCREEN_ON":
                            VideoWallpaperService.f14791y = true;
                            VideoWallpaperService.f14790s = false;
                            VideoWallpaperService.f14789p = false;
                            if (C2491q.this.f14798i) {
                                C2491q.this.onVisibilityChanged(true);
                                break;
                            }
                            break;
                        case "android.intent.action.USER_PRESENT":
                            VideoWallpaperService.f14791y = true;
                            VideoWallpaperService.f14790s = false;
                            VideoWallpaperService.f14789p = true;
                            if (!C2491q.this.f14798i) {
                                C2491q.this.onVisibilityChanged(true);
                                break;
                            }
                            break;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.service.VideoWallpaperService$q$zy */
        class zy implements InterfaceC2492g.toq {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ SurfaceHolder f14812k;

            zy(final SurfaceHolder val$surfaceHolder) {
                this.f14812k = val$surfaceHolder;
            }

            @Override // com.android.thememanager.service.InterfaceC2492g.toq
            /* JADX INFO: renamed from: k */
            public void mo8929k(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
                C2789j.m9825g(VideoWallpaperService.f14788g, "onVideoSizeChanged, wight = %s, height = %s, unappliedRotationDegrees = %s, pixelWidthHeightRatio = %s", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(unappliedRotationDegrees), Float.valueOf(pixelWidthHeightRatio));
                float f2 = (height == 0 || width == 0) ? 1.0f : (width * pixelWidthHeightRatio) / height;
                Point pointFn3e = y9n.fn3e();
                int iMin = Math.min(pointFn3e.y, pointFn3e.x);
                int iMax = Math.max(pointFn3e.y, pointFn3e.x);
                float f3 = iMin;
                float f4 = iMax;
                float f5 = (f2 / (f3 / f4)) - 1.0f;
                if (Math.abs(f5) > 0.01f) {
                    if (f5 > 0.0f) {
                        iMin = (int) (f4 * f2);
                    } else {
                        iMax = (int) (f3 / f2);
                    }
                }
                C2789j.m9825g(VideoWallpaperService.f14788g, "set fixed size, wight = %s, height = %s， compress=%b", Integer.valueOf(iMin), Integer.valueOf(iMax), Boolean.valueOf(C2491q.this.f14797h));
                if (C2491q.this.f14797h) {
                    C2491q.this.f14796g.a9(true);
                } else {
                    C2491q.this.f14796g.a9(false);
                }
                this.f14812k.setFixedSize(iMin, iMax);
                if (C1807g.m7081r()) {
                    C2491q.this.f14796g.a9(false);
                    this.f14812k.setSizeFromLayout();
                }
            }
        }

        C2491q() {
            super(VideoWallpaperService.this);
            this.f14799k = VideoWallpaperService.this;
            this.f14807y = p001b.f7l8.f53825z4j7;
            this.f14806t = new k();
            this.f14804r = new toq();
            this.f14808z = new zy() { // from class: com.android.thememanager.service.i
                @Override // com.android.thememanager.service.VideoWallpaperService.zy
                /* JADX INFO: renamed from: k */
                public final void mo8931k() {
                    this.f14816k.t8r();
                }
            };
        }

        private void cdj(final SurfaceHolder surfaceHolder) {
            if (this.f14796g == null) {
                this.f14796g = new File("/data/system/theme/player_exo").exists() ^ true ? new qrj() : new ld6(this.f14799k);
                C2789j.m9825g(VideoWallpaperService.f14788g, "create player. " + this.f14796g, new Object[0]);
                this.f14796g.f7l8(this.f14805s);
                this.f14796g.zy(surfaceHolder);
                if (m8927z()) {
                    this.f14796g.d3(new zy(surfaceHolder));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"StaticFieldLeak"})
        public void fn3e(boolean forceBackup) {
            if (this.f14796g != null) {
                q qVar = this.f14800l;
                if (qVar != null) {
                    qVar.cancel(false);
                }
                q qVar2 = new q();
                this.f14800l = qVar2;
                qVar2.execute(Boolean.valueOf(forceBackup));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fu4(boolean force) throws IllegalStateException, ExceptionInInitializerError {
            if (VideoWallpaperService.this.toq()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f14799k.createDeviceProtectedStorageContext());
                if (force || !defaultSharedPreferences.contains(g1.f16473t)) {
                    defaultSharedPreferences.edit().putBoolean(g1.f16462i, this.f14805s).putBoolean(g1.f16479z, this.f14802p).putBoolean(p001b.f7l8.zma, this.f14797h).putString(g1.f16473t, this.f14807y).apply();
                }
            }
            if (force) {
                g1.gyi(g1.f16462i, this.f14805s);
                g1.gyi(g1.f16479z, this.f14802p);
                g1.gyi(p001b.f7l8.zma, this.f14797h);
                g1.qkj8(g1.f16473t, this.f14807y);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m8920i(Configuration configuration) {
            o1t();
        }

        private void ki(SurfaceHolder surfaceHolder) {
            if (this.f14796g != null) {
                C2789j.m9825g(VideoWallpaperService.f14788g, "destroy player", new Object[0]);
                this.f14796g.eqxt(surfaceHolder);
                this.f14796g = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File ni7(boolean forceBackup) {
            Context contextCreateDeviceProtectedStorageContext = this.f14799k;
            if (VideoWallpaperService.this.toq()) {
                contextCreateDeviceProtectedStorageContext = this.f14799k.createDeviceProtectedStorageContext();
            }
            File file = new File(contextCreateDeviceProtectedStorageContext.getFilesDir(), "video");
            File file2 = new File(file, C7083n.m25584g(this.f14807y));
            if (!forceBackup && file2.exists()) {
                return file2;
            }
            if (file.exists()) {
                for (File file3 : file.listFiles()) {
                    file3.delete();
                }
            } else {
                file.mkdir();
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.f14807y));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = fileInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i2);
                        }
                        fileOutputStream.close();
                        fileInputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
                C2789j.x2(VideoWallpaperService.f14788g, "backup video wallpaper failed", new Object[0]);
            }
            return file2;
        }

        private void o1t() {
            InterfaceC2492g interfaceC2492g = this.f14796g;
            if (interfaceC2492g == null) {
                return;
            }
            interfaceC2492g.mo8932i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t8r() {
            this.f14796g.jp0y();
        }

        /* JADX INFO: renamed from: z */
        private boolean m8927z() {
            try {
                getClass().getMethod("setFixedSizeAllowed", Boolean.TYPE).invoke(this, Boolean.TRUE);
                return true;
            } catch (Exception e2) {
                C2789j.m9829q(VideoWallpaperService.f14788g, e2, "fail setFixedSizeAllowed", new Object[0]);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zurt(String mediaSource) {
            this.f14796g.gvn7(!this.f14802p);
            this.f14796g.dd(mediaSource);
            if (!this.f14805s) {
                this.f14796g.toq(0.0f);
            } else if (this.f14803q.requestAudioFocus(this, 3, 1) == 1) {
                this.f14796g.toq(0.5f);
            }
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
            InterfaceC2492g interfaceC2492g;
            C2789j.m9825g(VideoWallpaperService.f14788g, "onAudioFocusChange: " + focusChange, new Object[0]);
            if (this.f14805s && (interfaceC2492g = this.f14796g) != null) {
                if (focusChange == -3) {
                    interfaceC2492g.toq(0.1f);
                    return;
                }
                if (focusChange == -2 || focusChange == -1) {
                    interfaceC2492g.toq(0.0f);
                } else {
                    if (focusChange != 1) {
                        return;
                    }
                    interfaceC2492g.toq(0.5f);
                }
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onCreate(final SurfaceHolder surfaceHolder) {
            super.onCreate(surfaceHolder);
            this.f14803q = (AudioManager) VideoWallpaperService.this.getSystemService(wvg.f67137toq);
            this.f14801n = (PowerManager) VideoWallpaperService.this.getSystemService(PowerManager.class);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(p001b.f7l8.f53809sc);
            VideoWallpaperService.this.registerReceiver(this.f14806t, intentFilter);
            VideoWallpaperService.this.m8917q(this.f14808z);
            if (C1807g.vyq()) {
                VideoWallpaperService.this.zy(new toq() { // from class: com.android.thememanager.service.t8r
                    @Override // com.android.thememanager.service.VideoWallpaperService.toq
                    /* JADX INFO: renamed from: k */
                    public final void mo8930k(Configuration configuration) {
                        this.f14868k.m8920i(configuration);
                    }
                });
            }
            this.f14798i = "com.android.thememanager.theme_lock_live_wallpaper".equals(C7617k.toq().zy());
            VideoWallpaperService.f14789p = true;
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.USER_PRESENT");
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.setPriority(1000);
            VideoWallpaperService.this.registerReceiver(this.f14804r, intentFilter2);
            if (VideoWallpaperService.this.toq()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f14799k.createDeviceProtectedStorageContext());
                if (defaultSharedPreferences.contains(g1.f16473t)) {
                    this.f14805s = defaultSharedPreferences.getBoolean(g1.f16462i, false);
                    this.f14802p = defaultSharedPreferences.getBoolean(g1.f16479z, false);
                    this.f14797h = defaultSharedPreferences.getBoolean(p001b.f7l8.zma, false);
                }
            }
            if (TextUtils.isEmpty(this.f14807y)) {
                try {
                    this.f14805s = g1.x2(g1.f16462i, false);
                    this.f14802p = g1.x2(g1.f16479z, false);
                    this.f14797h = g1.x2(p001b.f7l8.zma, false);
                    fu4(false);
                } catch (ExceptionInInitializerError | IllegalStateException e2) {
                    C2789j.x2(VideoWallpaperService.f14788g, "get media path error: " + e2.getMessage(), new Object[0]);
                }
            }
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onDestroy() {
            super.onDestroy();
            this.f14803q.abandonAudioFocus(this);
            VideoWallpaperService.this.unregisterReceiver(this.f14806t);
            VideoWallpaperService.this.unregisterReceiver(this.f14804r);
            VideoWallpaperService.this.m8917q(null);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(SurfaceHolder holder) {
            super.onSurfaceCreated(holder);
            cdj(holder);
            fn3e(false);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceDestroyed(SurfaceHolder holder) {
            super.onSurfaceDestroyed(holder);
            ki(holder);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onVisibilityChanged(boolean visible) {
            super.onVisibilityChanged(visible);
            C2789j.m9825g(VideoWallpaperService.f14788g, "onVisibilityChanged: " + visible, new Object[0]);
            InterfaceC2492g interfaceC2492g = this.f14796g;
            if (interfaceC2492g == null) {
                return;
            }
            if (!this.f14802p) {
                interfaceC2492g.t8r(visible);
                return;
            }
            if (this.f14801n != null) {
                VideoWallpaperService.f14790s = !r0.isInteractive();
            }
            boolean z2 = this.f14798i;
            if (z2 || VideoWallpaperService.f14789p || VideoWallpaperService.f14790s) {
                this.f14796g.fti(visible, VideoWallpaperService.f14791y, VideoWallpaperService.f14790s, VideoWallpaperService.f14789p, z2);
            }
        }
    }

    interface toq {
        /* JADX INFO: renamed from: k */
        void mo8930k(Configuration newConfig);
    }

    interface zy {
        /* JADX INFO: renamed from: k */
        void mo8931k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean toq() {
        return true;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.f14792k != null && C1807g.zurt()) {
            this.f14792k.mo8931k();
        }
        C2789j.m9825g(f14788g, "onConfigurationChanged: newOrientation" + newConfig.orientation + ",mOrientation = " + this.f14794q, new Object[0]);
        toq toqVar = this.f14793n;
        if (toqVar != null && this.f14794q != newConfig.orientation) {
            toqVar.mo8930k(newConfig);
        }
        this.f14794q = newConfig.orientation;
    }

    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        this.f14794q = getApplicationContext().getResources().getConfiguration().orientation;
        return new C2491q();
    }

    /* JADX INFO: renamed from: q */
    public void m8917q(zy mGLEngineUpdateCallback) {
        this.f14792k = mGLEngineUpdateCallback;
    }

    public void zy(toq c2) {
        this.f14793n = c2;
    }
}
