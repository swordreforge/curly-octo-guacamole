package com.android.thememanager.superwallpaper.activity;

import android.app.Activity;
import android.app.WallpaperColors;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperEngine;
import android.service.wallpaper.IWallpaperService;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import bek6.C1367k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.basesuperwallpaper.C2651k;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.settings.superwallpaper.utils.C2668s;
import com.android.thememanager.settings.superwallpaper.utils.zy;
import com.android.thememanager.superwallpaper.base.AbstractC2721k;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s;
import cv06.InterfaceC5977k;

/* JADX INFO: loaded from: classes2.dex */
public class UnitySuperWallpaperDetailActivity extends AbstractViewOnClickListenerC2725s {
    public static final int dy = 1;
    private static final String sk1t = "SuperWallpaper.12.5";
    private WallpaperConnection tgs;
    private String tlhn;
    private String w97r;
    private Intent yl25;
    private Intent zmmu;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.activity.UnitySuperWallpaperDetailActivity$k */
    class RunnableC2718k implements Runnable {
        RunnableC2718k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnitySuperWallpaperDetailActivity.this.tgs == null || UnitySuperWallpaperDetailActivity.this.tgs.connect()) {
                return;
            }
            UnitySuperWallpaperDetailActivity.this.tgs = null;
        }
    }

    class toq implements InterfaceC5977k.k {
        toq() {
        }

        @Override // cv06.InterfaceC5977k.k
        /* JADX INFO: renamed from: k */
        public void mo9489k(InterfaceC5977k.toq sceneType) {
            if (UnitySuperWallpaperDetailActivity.this.tgs == null || UnitySuperWallpaperDetailActivity.this.tgs.mEngine == null) {
                Log.i("SuperWallpaper.12.5", "changeScene mWallpaperConnection == null or mWallpaperConnection.mEngine == null");
                return;
            }
            String str = null;
            try {
                if (InterfaceC5977k.toq.AOD == UnitySuperWallpaperDetailActivity.this.zurt() && o1t.f7l8()) {
                    str = C2651k.f15686g;
                } else if (InterfaceC5977k.toq.LOCKSCREEN == UnitySuperWallpaperDetailActivity.this.zurt()) {
                    str = C2651k.f15692q;
                } else if (InterfaceC5977k.toq.DESKTOP == UnitySuperWallpaperDetailActivity.this.zurt()) {
                    str = C2651k.f15689k;
                }
                String str2 = str;
                if (str2 != null) {
                    Log.e("SuperWallpaper.12.5", "unity onSceneChanged dispatchWallpaperCommand " + str2);
                    UnitySuperWallpaperDetailActivity.this.tgs.mEngine.dispatchWallpaperCommand(str2, 0, 0, 0, null);
                }
            } catch (RemoteException e2) {
                Log.e("SuperWallpaper.12.5", "changeScene " + e2.getMessage());
            }
        }
    }

    private void b8(String msg) {
        Toast.makeText(this, msg, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b9ub() {
        Intent intent = new Intent(C1367k.f7257k);
        intent.putExtra(C1367k.f54006zy, this.yl25.getComponent());
        sendBroadcast(intent);
    }

    private void cnbm() {
        Intent intent = getIntent();
        if (intent != null) {
            this.tlhn = getIntent().getStringExtra("id");
            this.w97r = intent.getStringExtra("package_name");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o05() {
        if (getIntent() != null) {
            this.tlhn = C1367k.f7260q;
            this.w97r = "com.miui.miwallpaper";
        }
    }

    public static void r25n(Context context, Bundle serviceBundle, String packageName, int requestCode) {
        if ("com.miui.miwallpaper.miweatherwallpaper".equals(packageName)) {
            Log.w("SuperWallpaper.12.5", "ignore mi weather wallpaper. Deprecated!");
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, UnitySuperWallpaperDetailActivity.class);
        intent.putExtra("id", serviceBundle.getString("id"));
        intent.putExtra("package_name", packageName);
        intent.putExtra(C2656k.f60919ki, serviceBundle.getInt(C2656k.f60919ki));
        intent.putExtra("clock_position_x", serviceBundle.getFloat("clock_position_x"));
        intent.putExtra("clock_position_y", serviceBundle.getFloat("clock_position_y"));
        intent.putExtra("dual_clock_position_x_anchor_right", serviceBundle.getFloat("dual_clock_position_x_anchor_right"));
        intent.putExtra("dual_clock_position_y", serviceBundle.getFloat("dual_clock_position_y"));
        if (!(context instanceof Activity) || requestCode == -1) {
            context.startActivity(intent);
        } else {
            ((Activity) context).startActivityForResult(intent, requestCode);
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    public int bek6() {
        return 2;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev) {
        WallpaperConnection wallpaperConnection;
        if (ev.getAction() == 0) {
            onUserInteraction();
        }
        boolean zSuperDispatchTouchEvent = getWindow().superDispatchTouchEvent(ev);
        if (!zSuperDispatchTouchEvent) {
            zSuperDispatchTouchEvent = onTouchEvent(ev);
        }
        if (!zSuperDispatchTouchEvent && (wallpaperConnection = this.tgs) != null && wallpaperConnection.mEngine != null) {
            try {
                this.tgs.mEngine.dispatchPointer(MotionEvent.obtainNoHistory(ev));
            } catch (RemoteException e2) {
                Log.e("SuperWallpaper.12.5", "dispatchTouchEvent " + e2.getMessage());
            }
            int actionMasked = ev.getActionMasked();
            try {
                if (actionMasked == 1) {
                    this.tgs.mEngine.dispatchWallpaperCommand("android.wallpaper.tap", (int) ev.getX(), (int) ev.getY(), 0, null);
                } else if (actionMasked == 6) {
                    int actionIndex = ev.getActionIndex();
                    this.tgs.mEngine.dispatchWallpaperCommand("android.wallpaper.secondaryTap", (int) ev.getX(actionIndex), (int) ev.getY(actionIndex), 0, null);
                }
            } catch (RemoteException e3) {
                Log.e("SuperWallpaper.12.5", "dispatchTouchEvent " + e3.getMessage());
            }
        }
        return zSuperDispatchTouchEvent;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s, com.android.thememanager.superwallpaper.base.ld6
    public void gvn7(boolean isSuccess) {
        IWallpaperEngine iWallpaperEngine;
        super.gvn7(isSuccess);
        if (isSuccess) {
            if (o1t.m7178y()) {
                b8(getString(R.string.apply_succeed));
            } else {
                nn86.m7150k(R.string.apply_success_not_enable_aod, 1);
            }
            WallpaperConnection wallpaperConnection = this.tgs;
            if (wallpaperConnection == null || (iWallpaperEngine = wallpaperConnection.mEngine) == null) {
                return;
            }
            try {
                iWallpaperEngine.setVisibility(false);
                this.tgs.mEngine.setVisibility(true);
            } catch (RemoteException e2) {
                Log.e("SuperWallpaper.12.5", e2.getLocalizedMessage());
            }
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected String h7am() {
        return com.android.thememanager.basemodule.analysis.toq.vibj;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected void ixz() {
        super.ixz();
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected AbstractC2723p ktq() {
        return new com.android.thememanager.superwallpaper.presenter.toq(this, this.tlhn);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().post(new RunnableC2718k());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WallpaperConnection wallpaperConnection = this.tgs;
        if (wallpaperConnection != null) {
            wallpaperConnection.disconnect();
        }
        this.tgs = null;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        IWallpaperEngine iWallpaperEngine;
        super.onPause();
        WallpaperConnection wallpaperConnection = this.tgs;
        if (wallpaperConnection == null || (iWallpaperEngine = wallpaperConnection.mEngine) == null) {
            return;
        }
        try {
            iWallpaperEngine.setVisibility(false);
        } catch (RemoteException e2) {
            Log.e("SuperWallpaper.12.5", "onPause " + e2.getMessage());
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        IWallpaperEngine iWallpaperEngine;
        super.onResume();
        if (!this.f16118c) {
            n2t(InterfaceC5977k.k.EnumC8043k.SCENE_RESUME);
        }
        WallpaperConnection wallpaperConnection = this.tgs;
        if (wallpaperConnection != null && (wallpaperConnection.mService == null || wallpaperConnection.mEngine == null)) {
            wallpaperConnection.connect();
            this.f16127x = InterfaceC5977k.toq.DESKTOP;
            n2t(InterfaceC5977k.k.EnumC8043k.SCENE_DESTROY);
        }
        WallpaperConnection wallpaperConnection2 = this.tgs;
        if (wallpaperConnection2 == null || (iWallpaperEngine = wallpaperConnection2.mEngine) == null) {
            return;
        }
        try {
            iWallpaperEngine.setVisibility(true);
        } catch (RemoteException e2) {
            Log.e("SuperWallpaper.12.5", "onResume " + e2.getMessage());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Log.d("SuperWallpaper.12.5", "onWindowFocusChanged:" + hasFocus);
        WallpaperConnection wallpaperConnection = this.tgs;
        if (wallpaperConnection == null || wallpaperConnection.mEngine == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C1367k.f54001ld6, hasFocus);
            Log.d("SuperWallpaper.12.5", "onWindowFocusChanged dispatchWallpaperCommand " + hasFocus);
            this.tgs.mEngine.dispatchWallpaperCommand(C2651k.f60890ki, 0, 0, 0, bundle);
        } catch (RemoteException e2) {
            Log.e("SuperWallpaper.12.5", "onWindowFocusChanged " + e2.getMessage());
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected void uc() {
        super.uc();
        this.yl25 = new Intent("android.service.wallpaper.WallpaperService").setClassName(this.w97r, this.w97r + ".superwallpaper." + zy.ld6(this.tlhn) + "PreviewSuperWallpaper");
        this.zmmu = new Intent("android.service.wallpaper.WallpaperService").setClassName(getPackageName(), getPackageName() + ".superwallpaper." + zy.ld6(this.tlhn) + "PreviewSuperWallpaper");
        this.tgs = new WallpaperConnection(this.yl25);
        this.f16123o.add(new toq());
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected AbstractC2721k uj2j() {
        return new com.android.thememanager.superwallpaper.recyclerview.zy(this, this.f16121j);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected String vep5() {
        return this.tlhn;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s, com.android.thememanager.superwallpaper.base.AbstractC2723p.k
    public void vyq(int position) {
        super.vyq(position);
        WallpaperConnection wallpaperConnection = this.tgs;
        if (wallpaperConnection == null || wallpaperConnection.mEngine == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            if (this.tgs.mEngine != null) {
                Log.d("SuperWallpaper.12.5", "unity activity onLandPositionChanged " + position);
                this.tgs.mEngine.dispatchWallpaperCommand(C2651k.f60891kja0, 0, 0, 0, bundle);
            }
        } catch (RemoteException e2) {
            Log.e("SuperWallpaper.12.5", "setSuperWallpaperLand " + e2.getMessage());
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractViewOnClickListenerC2725s
    protected boolean zkd() {
        cnbm();
        return !TextUtils.isEmpty(this.tlhn);
    }

    class WallpaperConnection extends IWallpaperConnection.Stub implements ServiceConnection {
        boolean mConnected;
        IWallpaperEngine mEngine;
        final Intent mIntent;
        IWallpaperService mService;

        /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.activity.UnitySuperWallpaperDetailActivity$WallpaperConnection$k */
        class RunnableC2717k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f16099k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ IBinder f16101q;

            RunnableC2717k(final View val$root, final IBinder val$service) {
                this.f16099k = val$root;
                this.f16101q = val$service;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    WallpaperConnection wallpaperConnection = WallpaperConnection.this;
                    C2668s.m9299k(wallpaperConnection.mService, wallpaperConnection, this.f16099k.getWindowToken(), 1001, true, this.f16099k.getWidth(), this.f16099k.getHeight());
                    Log.d("SuperWallpaper.12.5", "onServiceConnected:" + this.f16101q);
                    ((AbstractViewOnClickListenerC2725s) UnitySuperWallpaperDetailActivity.this).f16121j.mo9493p(null);
                } catch (RemoteException e2) {
                    Log.e("SuperWallpaper.12.5", "Failed attaching wallpaper; clearing", e2);
                }
            }
        }

        WallpaperConnection(Intent intent) {
            this.mIntent = intent;
        }

        public void attachEngine(IWallpaperEngine engine) {
            synchronized (this) {
                if (this.mConnected) {
                    this.mEngine = engine;
                    try {
                        engine.setVisibility(true);
                    } catch (RemoteException e2) {
                        Log.e("SuperWallpaper.12.5", e2.getLocalizedMessage());
                    }
                } else {
                    try {
                        engine.destroy();
                    } catch (RemoteException e3) {
                        Log.e("SuperWallpaper.12.5", e3.getLocalizedMessage());
                    }
                }
            }
        }

        public boolean connect() {
            synchronized (this) {
                if (!UnitySuperWallpaperDetailActivity.this.bindService(this.mIntent, this, 1)) {
                    UnitySuperWallpaperDetailActivity unitySuperWallpaperDetailActivity = UnitySuperWallpaperDetailActivity.this;
                    unitySuperWallpaperDetailActivity.yl25 = unitySuperWallpaperDetailActivity.zmmu;
                    UnitySuperWallpaperDetailActivity.this.o05();
                    Log.d("SuperWallpaper.12.5", "connect not successful and bind default");
                    UnitySuperWallpaperDetailActivity unitySuperWallpaperDetailActivity2 = UnitySuperWallpaperDetailActivity.this;
                    if (!unitySuperWallpaperDetailActivity2.bindService(unitySuperWallpaperDetailActivity2.zmmu, this, 1)) {
                        Log.d("SuperWallpaper.12.5", "connect not successful for bind default");
                        return false;
                    }
                }
                UnitySuperWallpaperDetailActivity.this.b9ub();
                Log.d("SuperWallpaper.12.5", "connect successful");
                this.mConnected = true;
                return true;
            }
        }

        public void disconnect() {
            synchronized (this) {
                this.mConnected = false;
                IWallpaperEngine iWallpaperEngine = this.mEngine;
                if (iWallpaperEngine != null) {
                    try {
                        iWallpaperEngine.destroy();
                    } catch (RemoteException unused) {
                    }
                    this.mEngine = null;
                }
                try {
                    UnitySuperWallpaperDetailActivity.this.unbindService(this);
                } catch (IllegalArgumentException e2) {
                    Log.e("SuperWallpaper.12.5", "Can't unbind wallpaper service. It might have crashed, just ignoring.", e2);
                }
                this.mService = null;
            }
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void engineShown(IWallpaperEngine engine) throws RemoteException {
            Log.d("SuperWallpaper.12.5", "engineShown");
            engine.dispatchWallpaperCommand(C2663k.qrj() ? C2651k.f15686g : C2651k.f15692q, 0, 0, 0, null);
            UnitySuperWallpaperDetailActivity.this.jbh();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            if (UnitySuperWallpaperDetailActivity.this.tgs == this) {
                this.mService = IWallpaperService.Stub.asInterface(service);
                View decorView = UnitySuperWallpaperDetailActivity.this.getWindow().getDecorView();
                decorView.post(new RunnableC2717k(decorView, service));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            this.mService = null;
            this.mEngine = null;
            if (UnitySuperWallpaperDetailActivity.this.tgs == this) {
                Log.w("SuperWallpaper.12.5", "Wallpaper service gone: " + name);
            }
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void onWallpaperColorsChanged(WallpaperColors colors, int displayId) throws RemoteException {
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public ParcelFileDescriptor setWallpaper(String name) {
            return null;
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void attachEngine(IWallpaperEngine engine, int displayId) {
            synchronized (this) {
                if (this.mConnected) {
                    this.mEngine = engine;
                    try {
                        Log.d("SuperWallpaper.12.5", "attachEngine mConnected");
                        engine.setVisibility(true);
                        engine.dispatchWallpaperCommand(o1t.f7l8() ? C2651k.f15686g : C2651k.f15692q, 0, 0, 0, null);
                    } catch (RemoteException e2) {
                        Log.e("SuperWallpaper.12.5", "RemoteException:" + e2.getLocalizedMessage());
                    }
                } else {
                    try {
                        Log.d("SuperWallpaper.12.5", "attachEngine destroy");
                        engine.destroy();
                    } catch (RemoteException e3) {
                        Log.e("SuperWallpaper.12.5", e3.getLocalizedMessage());
                    }
                }
            }
        }
    }
}
