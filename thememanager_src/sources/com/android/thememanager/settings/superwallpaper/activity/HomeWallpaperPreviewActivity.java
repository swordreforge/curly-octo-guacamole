package com.android.thememanager.settings.superwallpaper.activity;

import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperEngine;
import android.service.wallpaper.IWallpaperService;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bek6.C1367k;
import com.android.thememanager.R;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k;
import com.android.thememanager.settings.superwallpaper.basesuperwallpaper.C2651k;
import com.android.thememanager.settings.superwallpaper.opengl.HomeGLSurfaceView;
import com.android.thememanager.settings.superwallpaper.utils.C2668s;
import com.android.thememanager.settings.superwallpaper.utils.f7l8;
import h7am.C6071k;

/* JADX INFO: loaded from: classes2.dex */
public class HomeWallpaperPreviewActivity extends ActivityC0891q implements View.OnClickListener, InterfaceC2644k, C2640k.toq {

    /* JADX INFO: renamed from: c */
    private static final String f15508c = HomeWallpaperPreviewActivity.class.getSimpleName();

    /* JADX INFO: renamed from: f */
    private SuperWallpaperSummaryData f15509f;

    /* JADX INFO: renamed from: g */
    private HomeGLSurfaceView f15510g;

    /* JADX INFO: renamed from: h */
    private Intent f15511h;

    /* JADX INFO: renamed from: i */
    private boolean f15512i;

    /* JADX INFO: renamed from: k */
    private RelativeLayout f15513k;

    /* JADX INFO: renamed from: l */
    private C2641k f15514l;

    /* JADX INFO: renamed from: n */
    private LinearLayout f15515n;

    /* JADX INFO: renamed from: p */
    private WallpaperConnection f15516p;

    /* JADX INFO: renamed from: q */
    private Button f15517q;

    /* JADX INFO: renamed from: r */
    private FragmentManager f15518r;

    /* JADX INFO: renamed from: s */
    private WallpaperManager f15519s;

    /* JADX INFO: renamed from: t */
    private ComponentName f15520t;

    /* JADX INFO: renamed from: y */
    private ImageView f15521y;

    /* JADX INFO: renamed from: z */
    private String f15522z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.HomeWallpaperPreviewActivity$k */
    class C2623k extends FragmentManager.qrj {
        C2623k() {
        }

        @Override // androidx.fragment.app.FragmentManager.qrj
        public void f7l8(FragmentManager fm, Fragment f2, Context context) {
            if (f2 instanceof C2641k) {
                ((C2641k) f2).v5yj(HomeWallpaperPreviewActivity.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.HomeWallpaperPreviewActivity$q */
    class AsyncTaskC2624q extends AsyncTask<Void, Void, Boolean> {
        AsyncTaskC2624q() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... params) throws Throwable {
            HomeWallpaperPreviewActivity homeWallpaperPreviewActivity = HomeWallpaperPreviewActivity.this;
            Bitmap bitmapM9254g = f7l8.m9254g(homeWallpaperPreviewActivity, homeWallpaperPreviewActivity.f15519s);
            boolean z2 = false;
            if (bitmapM9254g != null) {
                try {
                    if (com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(HomeWallpaperPreviewActivity.this, bitmapM9254g) != 0) {
                        z2 = true;
                    }
                } catch (Exception e2) {
                    Log.e(HomeWallpaperPreviewActivity.f15508c, "initActionbarView create bitmap exception: " + e2.getMessage());
                }
            }
            return Boolean.valueOf(z2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean isLight) {
            HomeWallpaperPreviewActivity.this.f15517q.setBackgroundResource(isLight.booleanValue() ? R.drawable.miuix_appcompat_action_bar_back_light : R.drawable.miuix_appcompat_action_bar_back_dark);
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HomeWallpaperPreviewActivity.this.f15516p == null || HomeWallpaperPreviewActivity.this.f15516p.connect()) {
                return;
            }
            HomeWallpaperPreviewActivity.this.f15516p = null;
        }
    }

    class zy extends AsyncTask<Void, Void, Bitmap> {
        zy() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... params) throws Throwable {
            HomeWallpaperPreviewActivity homeWallpaperPreviewActivity = HomeWallpaperPreviewActivity.this;
            Bitmap bitmapM9254g = f7l8.m9254g(homeWallpaperPreviewActivity, homeWallpaperPreviewActivity.f15519s);
            return f7l8.m9257q(HomeWallpaperPreviewActivity.this, bitmapM9254g != null ? com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(HomeWallpaperPreviewActivity.this, bitmapM9254g) : 1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap result) {
            HomeWallpaperPreviewActivity.this.f15521y.setImageBitmap(result);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9186a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C1367k.f54006zy, this.f15520t);
        bundle.putString("super_wallpaper_id", this.f15522z);
        bundle.putBoolean(C2641k.f15628b, false);
        C2641k c2641k = (C2641k) this.f15518r.vq().mo4213k(getClassLoader(), C2641k.class.getName());
        this.f15514l = c2641k;
        c2641k.setArguments(bundle);
        this.f15514l.v5yj(this);
    }

    /* JADX INFO: renamed from: b */
    private void m9187b() {
        if (this.f15512i) {
            this.f15512i = false;
            this.f15513k.setVisibility(0);
            if (this.f15518r.nmn5(C2641k.f15629m) != null) {
                this.f15518r.ki().fn3e(this.f15514l).n7h();
            }
        }
    }

    private void i1() {
        new AsyncTaskC2624q().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void lv5() {
        m9192x();
        i1();
    }

    private void nmn5() {
        Bundle bundle;
        WallpaperInfo wallpaperInfo = this.f15519s.getWallpaperInfo();
        if (wallpaperInfo == null || !C2656k.m9245s(this, wallpaperInfo)) {
            this.f15511h = null;
            this.f15510g.mo9247k(false, null);
            this.f15510g.setVisibility(0);
            return;
        }
        Intent className = new Intent("android.service.wallpaper.WallpaperService").setClassName(wallpaperInfo.getPackageName(), wallpaperInfo.getServiceName().substring(0, r2.length() - 14) + "PreviewSuperWallpaper");
        this.f15511h = className;
        this.f15520t = className.getComponent();
        this.f15516p = new WallpaperConnection(this.f15511h);
        ServiceInfo serviceInfo = wallpaperInfo.getServiceInfo();
        if (serviceInfo != null && (bundle = serviceInfo.metaData) != null) {
            this.f15522z = bundle.getString("id");
        }
        if (this.f15522z != null) {
            C2640k.m9216n().m9220k(this);
        }
        this.f15515n.setVisibility(8);
        this.f15510g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8iq() {
        Intent intent = new Intent(C1367k.f7257k);
        intent.putExtra(C1367k.f54006zy, this.f15511h.getComponent());
        sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: x */
    private void m9192x() {
        new zy().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void zp() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f15518r = supportFragmentManager;
        supportFragmentManager.m28244do(new C2623k(), false);
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    public void c8jq(SuperWallpaperSummaryData[] data) {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15522z);
        this.f15509f = superWallpaperSummaryDataM9221s;
        if (superWallpaperSummaryDataM9221s == null || !superWallpaperSummaryDataM9221s.f15606r || superWallpaperSummaryDataM9221s.f15599k <= 1) {
            return;
        }
        this.f15515n.setVisibility(0);
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k
    public void mcp(int position) {
        C2656k.ld6(this, this.f15520t.getClassName(), position);
        C2656k.ld6(this, this.f15520t.getClassName() + C6071k.f77062x2, position);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().post(new toq());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentNmn5 = this.f15518r.nmn5(C2641k.f15629m);
        if (fragmentNmn5 == null || !fragmentNmn5.isVisible()) {
            super.onBackPressed();
        } else {
            m9187b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_btn) {
            finish();
            return;
        }
        if (id != R.id.choose_position_btn) {
            if (id == R.id.choose_position_back_btn) {
                m9187b();
            }
        } else {
            if (this.f15512i) {
                return;
            }
            this.f15512i = true;
            this.f15513k.setVisibility(8);
            if (this.f15518r.nmn5(C2641k.f15629m) != null) {
                this.f15518r.ki().x9kr(this.f15514l).n7h();
            } else {
                this.f15518r.ki().zy(R.id.container, this.f15514l, C2641k.f15629m).n7h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_wallpaper_preview);
        this.f15513k = (RelativeLayout) findViewById(R.id.preview_container);
        Button button = (Button) findViewById(R.id.back_btn);
        this.f15517q = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15664k.onClick(view);
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.choose_position_btn);
        this.f15515n = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15664k.onClick(view);
            }
        });
        this.f15510g = (HomeGLSurfaceView) findViewById(R.id.wallpaper);
        this.f15521y = (ImageView) findViewById(R.id.preview);
        this.f15519s = (WallpaperManager) getSystemService("wallpaper");
        nmn5();
        lv5();
        zp();
        m9186a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WallpaperConnection wallpaperConnection = this.f15516p;
        if (wallpaperConnection != null) {
            wallpaperConnection.disconnect();
        }
        this.f15516p = null;
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onPause() {
        IWallpaperEngine iWallpaperEngine;
        super.onPause();
        WallpaperConnection wallpaperConnection = this.f15516p;
        if (wallpaperConnection != null && (iWallpaperEngine = wallpaperConnection.mEngine) != null) {
            try {
                iWallpaperEngine.setVisibility(false);
            } catch (RemoteException e2) {
                Log.e(f15508c, "onPause " + e2.getMessage());
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        m9192x();
        i1();
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k
    public void zy(int position) {
        WallpaperConnection wallpaperConnection = this.f15516p;
        if (wallpaperConnection == null || wallpaperConnection.mEngine == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            IWallpaperEngine iWallpaperEngine = this.f15516p.mEngine;
            if (iWallpaperEngine != null) {
                iWallpaperEngine.dispatchWallpaperCommand(C2651k.f60891kja0, 0, 0, 0, bundle);
            }
        } catch (RemoteException e2) {
            Log.e(f15508c, "setSuperWallpaperLand " + e2.getMessage());
        }
        Log.d(f15508c, " apply succeed");
        Intent intent = new Intent(C2651k.f15688i);
        intent.putExtra("position", position);
        sendBroadcast(intent);
    }

    class WallpaperConnection extends IWallpaperConnection.Stub implements ServiceConnection {
        boolean mConnected;
        IWallpaperEngine mEngine;
        final Intent mIntent;
        IWallpaperService mService;

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
                        Log.d(HomeWallpaperPreviewActivity.f15508c, "attachEngine " + e2.getMessage());
                    }
                } else {
                    try {
                        engine.destroy();
                    } catch (RemoteException e3) {
                        Log.d(HomeWallpaperPreviewActivity.f15508c, "attachEngine " + e3.getMessage());
                    }
                }
            }
        }

        public boolean connect() {
            synchronized (this) {
                if (!HomeWallpaperPreviewActivity.this.bindService(this.mIntent, this, 1)) {
                    return false;
                }
                HomeWallpaperPreviewActivity.this.t8iq();
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
                    } catch (RemoteException e2) {
                        Log.e(HomeWallpaperPreviewActivity.f15508c, "disconnect " + e2.getMessage());
                    }
                    this.mEngine = null;
                    try {
                        HomeWallpaperPreviewActivity.this.unbindService(this);
                    } catch (IllegalArgumentException e3) {
                        Log.e(HomeWallpaperPreviewActivity.f15508c, "Can't unbind wallpaper service. It might have crashed, just ignoring.", e3);
                    }
                    this.mService = null;
                } else {
                    HomeWallpaperPreviewActivity.this.unbindService(this);
                    this.mService = null;
                }
            }
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void engineShown(IWallpaperEngine engine) throws RemoteException {
            engine.dispatchWallpaperCommand(C2651k.f60896toq, 0, 0, 0, null);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            if (HomeWallpaperPreviewActivity.this.f15516p == this) {
                this.mService = IWallpaperService.Stub.asInterface(service);
                try {
                    View decorView = HomeWallpaperPreviewActivity.this.getWindow().getDecorView();
                    C2668s.m9299k(this.mService, this, decorView.getWindowToken(), 1001, true, decorView.getWidth(), decorView.getHeight());
                } catch (RemoteException e2) {
                    Log.e(HomeWallpaperPreviewActivity.f15508c, "Failed attaching wallpaper; clearing", e2);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            this.mService = null;
            this.mEngine = null;
            if (HomeWallpaperPreviewActivity.this.f15516p == this) {
                Log.w(HomeWallpaperPreviewActivity.f15508c, "Wallpaper service gone: " + name);
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
                        engine.setVisibility(true);
                    } catch (RemoteException e2) {
                        Log.d(HomeWallpaperPreviewActivity.f15508c, "attachEngine " + e2.getMessage());
                    }
                } else {
                    try {
                        engine.destroy();
                    } catch (RemoteException e3) {
                        Log.d(HomeWallpaperPreviewActivity.f15508c, "attachEngine " + e3.getMessage());
                    }
                }
            }
        }
    }
}
