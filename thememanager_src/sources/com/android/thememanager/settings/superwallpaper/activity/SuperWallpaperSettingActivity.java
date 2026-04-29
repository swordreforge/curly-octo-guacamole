package com.android.thememanager.settings.superwallpaper.activity;

import android.app.Activity;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperEngine;
import android.service.wallpaper.IWallpaperService;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b3e.C1358k;
import bek6.C1367k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.utils.cdj;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k;
import com.android.thememanager.settings.superwallpaper.basesuperwallpaper.C2651k;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.settings.superwallpaper.utils.C2668s;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.settings.superwallpaper.utils.n7h;
import com.android.thememanager.util.uc;
import com.miui.clock.MiuiClockView;
import miuix.androidbasewidget.widget.ProgressBar;
import qkj8.C7617k;
import zy.hyr;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SuperWallpaperSettingActivity extends ActivityC0891q implements InterfaceC2644k, C2640k.toq {
    private static final int as = 0;
    private static final int az = 2;
    private static final int ba = 0;
    private static final int bg = 1;
    public static final int bl = 1;
    private static final String in = "SuperWallpaperSettingActivity";

    /* JADX INFO: renamed from: a */
    private WallpaperConnection f15527a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private C2641k f60879ab;

    /* JADX INFO: renamed from: b */
    private WallpaperManager f15528b;
    private float bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ComponentName f60880bo;
    private float bp;
    private int bv;

    /* JADX INFO: renamed from: c */
    private int f15529c;

    /* JADX INFO: renamed from: d */
    private boolean f15530d;

    /* JADX INFO: renamed from: e */
    private float f15531e;

    /* JADX INFO: renamed from: f */
    private String f15532f;

    /* JADX INFO: renamed from: g */
    private ImageView f15533g;

    /* JADX INFO: renamed from: h */
    private ProgressBar f15534h;

    /* JADX INFO: renamed from: i */
    private ProgressBar f15535i;

    /* JADX INFO: renamed from: j */
    private float f15536j;

    /* JADX INFO: renamed from: k */
    private RelativeLayout f15537k;

    /* JADX INFO: renamed from: l */
    private String f15538l;

    /* JADX INFO: renamed from: m */
    private float f15539m;

    /* JADX INFO: renamed from: n */
    private LinearLayout f15540n;

    /* JADX INFO: renamed from: o */
    private float f15541o;

    /* JADX INFO: renamed from: p */
    private ImageView f15542p;

    /* JADX INFO: renamed from: q */
    private Button f15543q;

    /* JADX INFO: renamed from: r */
    private View f15544r;

    /* JADX INFO: renamed from: s */
    private MiuiClockView f15545s;

    /* JADX INFO: renamed from: t */
    private Button f15546t;

    /* JADX INFO: renamed from: u */
    private Intent f15547u;

    /* JADX INFO: renamed from: w */
    private FragmentManager f15549w;

    /* JADX INFO: renamed from: x */
    private Intent f15550x;

    /* JADX INFO: renamed from: y */
    private FrameLayout f15551y;

    /* JADX INFO: renamed from: z */
    private ProgressBar f15552z;

    /* JADX INFO: renamed from: v */
    private int f15548v = 0;
    private Handler an = new HandlerC2626k();
    View.OnClickListener id = new toq();

    class f7l8 implements Runnable {
        f7l8() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SuperWallpaperSettingActivity.this.f15527a.connect()) {
                return;
            }
            SuperWallpaperSettingActivity.this.f15527a = null;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.SuperWallpaperSettingActivity$g */
    class AsyncTaskC2625g extends AsyncTask<Void, Void, Bitmap> {
        AsyncTaskC2625g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... params) {
            return com.android.thememanager.settings.superwallpaper.utils.f7l8.m9257q(SuperWallpaperSettingActivity.this, 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap result) {
            SuperWallpaperSettingActivity.this.f15542p.setImageBitmap(result);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.SuperWallpaperSettingActivity$k */
    class HandlerC2626k extends Handler {
        HandlerC2626k() {
        }

        @Override // android.os.Handler
        @hyr(api = 24)
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what != 0) {
                return;
            }
            SuperWallpaperSettingActivity.this.b3e();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.SuperWallpaperSettingActivity$n */
    class AsyncTaskC2627n extends AsyncTask<Void, Void, Bitmap> {
        AsyncTaskC2627n() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... params) {
            SuperWallpaperSettingActivity superWallpaperSettingActivity = SuperWallpaperSettingActivity.this;
            return C2663k.m9267n(superWallpaperSettingActivity, superWallpaperSettingActivity.f15531e, SuperWallpaperSettingActivity.this.f15536j, SuperWallpaperSettingActivity.this.f15541o, SuperWallpaperSettingActivity.this.f15539m);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap result) {
            if (result == null) {
                return;
            }
            SuperWallpaperSettingActivity.this.f15533g.setImageBitmap(result);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.SuperWallpaperSettingActivity$q */
    class C2628q extends FragmentManager.qrj {
        C2628q() {
        }

        @Override // androidx.fragment.app.FragmentManager.qrj
        public void f7l8(FragmentManager fm, Fragment f2, Context context) {
            if (f2 instanceof C2641k) {
                ((C2641k) f2).v5yj(SuperWallpaperSettingActivity.this);
            }
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.back_btn) {
                SuperWallpaperSettingActivity.this.finish();
                return;
            }
            if (id != R.id.choose_position_btn) {
                if (id == R.id.apply_super_wallpaper_button) {
                    SuperWallpaperSettingActivity superWallpaperSettingActivity = SuperWallpaperSettingActivity.this;
                    SuperWallpaperSettingActivity.this.zsr0(C2656k.m9240g(superWallpaperSettingActivity, superWallpaperSettingActivity.f60880bo.getClassName()));
                    return;
                } else {
                    if (id == R.id.choose_position_back_btn) {
                        SuperWallpaperSettingActivity.this.i9jn();
                        return;
                    }
                    return;
                }
            }
            if (SuperWallpaperSettingActivity.this.f15530d) {
                return;
            }
            SuperWallpaperSettingActivity.this.r8s8(C2651k.f15689k, 2);
            SuperWallpaperSettingActivity.this.f15530d = true;
            SuperWallpaperSettingActivity.this.bv = 0;
            SuperWallpaperSettingActivity.this.an.removeMessages(0);
            SuperWallpaperSettingActivity.this.f15537k.setVisibility(8);
            if (SuperWallpaperSettingActivity.this.f15549w.nmn5(C2641k.f15629m) != null) {
                SuperWallpaperSettingActivity.this.f15549w.ki().x9kr(SuperWallpaperSettingActivity.this.f60879ab).n7h();
            } else {
                SuperWallpaperSettingActivity.this.f15549w.ki().zy(R.id.container, SuperWallpaperSettingActivity.this.f60879ab, C2641k.f15629m).n7h();
            }
            kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.huy, C1358k.f7237s, null);
        }
    }

    class zy extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f15559k;

        zy(final int val$position) {
            this.f15559k = val$position;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            ComponentName componentName = new ComponentName(SuperWallpaperSettingActivity.this.f15532f, SuperWallpaperSettingActivity.this.f15532f + ".superwallpaper." + com.android.thememanager.settings.superwallpaper.utils.zy.ld6(SuperWallpaperSettingActivity.this.f15538l) + "SuperWallpaper");
            cdj.zurt(SuperWallpaperSettingActivity.this.f15528b, componentName);
            if (!C2670y.m9305g()) {
                C7617k.toq().m27925k("com.miui.home.none_provider");
                uc.m10026j();
                uc.lrht(bf2.toq.toq(), false, false);
            }
            n7h.n7h(SuperWallpaperSettingActivity.this, "com.android.thememanager.theme_lock_live_wallpaper");
            SuperWallpaperSettingActivity superWallpaperSettingActivity = SuperWallpaperSettingActivity.this;
            C2663k.x2(superWallpaperSettingActivity, true, superWallpaperSettingActivity.f15531e, SuperWallpaperSettingActivity.this.f15536j, SuperWallpaperSettingActivity.this.f15541o, SuperWallpaperSettingActivity.this.f15539m, null);
            if (this.f15559k == -1) {
                return null;
            }
            C2656k.ld6(SuperWallpaperSettingActivity.this, componentName.getClassName(), this.f15559k);
            SuperWallpaperSettingActivity superWallpaperSettingActivity2 = SuperWallpaperSettingActivity.this;
            C2656k.ld6(superWallpaperSettingActivity2, superWallpaperSettingActivity2.f60880bo.getClassName(), this.f15559k);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            SuperWallpaperSettingActivity.this.finish();
            kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.huy, C1358k.f7238y, SuperWallpaperSettingActivity.this.f15538l);
            Intent intent = new Intent(miuix.android.content.toq.f86697toq);
            intent.putExtra("set_lock_wallpaper_result", true);
            SuperWallpaperSettingActivity.this.sendBroadcast(intent);
            Intent intent2 = new Intent(C2651k.f15688i);
            SuperWallpaperSettingActivity superWallpaperSettingActivity = SuperWallpaperSettingActivity.this;
            intent2.putExtra("position", C2656k.m9242n(superWallpaperSettingActivity, superWallpaperSettingActivity.f60880bo.getClassName()));
            SuperWallpaperSettingActivity.this.sendBroadcast(intent2);
            C2670y.m9310y(SuperWallpaperSettingActivity.this, 4);
            Log.d(SuperWallpaperSettingActivity.in, " apply succeed");
            SuperWallpaperSettingActivity superWallpaperSettingActivity2 = SuperWallpaperSettingActivity.this;
            superWallpaperSettingActivity2.zkd(superWallpaperSettingActivity2.getString(R.string.super_wallpaper_setting_apply_success_toast));
            if (SuperWallpaperSettingActivity.this.f15527a == null || SuperWallpaperSettingActivity.this.f15527a.mEngine == null) {
                return;
            }
            try {
                SuperWallpaperSettingActivity.this.f15527a.mEngine.setVisibility(false);
                SuperWallpaperSettingActivity.this.f15527a.mEngine.setVisibility(true);
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hyr(api = 24)
    public void b3e() {
        int i2 = this.bv + 1;
        this.bv = i2;
        int i3 = this.f15548v;
        String str = C2651k.f15692q;
        if (i3 == 0) {
            this.f15534h.setProgress(i2, true);
            this.f15535i.setProgress(0, true);
            this.f15552z.setProgress(0, true);
            if (this.bv >= 100) {
                this.bv = 0;
                r8s8(C2651k.f15692q, 1);
            }
        } else if (i3 == 1) {
            this.f15534h.setProgress(100, true);
            this.f15535i.setProgress(this.bv, true);
            this.f15552z.setProgress(0, true);
            if (this.bv >= 100) {
                this.bv = 0;
                r8s8(C2651k.f15689k, 2);
            }
        } else if (i3 == 2) {
            this.f15534h.setProgress(100, true);
            this.f15535i.setProgress(100, true);
            this.f15552z.setProgress(this.bv, true);
            if (this.bv >= 100) {
                this.bv = 0;
                if (C2663k.qrj()) {
                    str = C2651k.f15686g;
                }
                r8s8(str, !C2663k.qrj() ? 1 : 0);
            }
        }
        this.an.sendEmptyMessageDelayed(0, 100L);
    }

    private void bwp() {
        if (C2663k.qrj()) {
            v0af();
        }
        w831();
    }

    public static void bz2(Context context, Bundle serviceBundle, String packageName, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, SuperWallpaperSettingActivity.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void cfr() {
        if (getIntent() != null) {
            this.f15538l = C1367k.f7260q;
            this.f15532f = "com.miui.miwallpaper";
            this.f15529c = 0;
            this.f15531e = 0.0f;
            this.f15536j = 0.0f;
            this.f15541o = 0.0f;
            this.f15539m = 0.0f;
        }
        Log.d(in, "initIntentExtra " + this.f15538l + " " + this.f15532f + " " + this.f15529c);
    }

    private void etdu() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C1367k.f54006zy, this.f60880bo);
        bundle.putString("super_wallpaper_id", this.f15538l);
        C2641k c2641k = (C2641k) this.f15549w.vq().mo4213k(getClassLoader(), C2641k.class.getName());
        this.f60879ab = c2641k;
        c2641k.setArguments(bundle);
        this.f60879ab.v5yj(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i9jn() {
        if (this.f15530d) {
            this.an.sendEmptyMessageDelayed(0, 100L);
            this.f15530d = false;
            this.f15537k.setVisibility(0);
            if (this.f15549w.nmn5(C2641k.f15629m) != null) {
                this.f15549w.ki().fn3e(this.f60879ab).n7h();
            }
        }
    }

    private void ktq() {
        int i2 = this.f15548v;
        if (i2 == 0) {
            this.f15533g.setVisibility(0);
            this.f15551y.setVisibility(8);
            this.f15542p.setVisibility(8);
        } else if (i2 == 1) {
            this.f15533g.setVisibility(8);
            this.f15551y.setVisibility(0);
            this.f15542p.setVisibility(8);
        } else if (i2 == 2) {
            this.f15533g.setVisibility(8);
            this.f15551y.setVisibility(8);
            this.f15542p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r8s8(String action, int newScene) {
        IWallpaperEngine iWallpaperEngine;
        String str = in;
        Log.d(str, "changeScene action = " + action + " newScene = " + newScene + " mCurrentScene = " + this.f15548v);
        if (newScene == this.f15548v) {
            return;
        }
        WallpaperConnection wallpaperConnection = this.f15527a;
        if (wallpaperConnection == null || (iWallpaperEngine = wallpaperConnection.mEngine) == null) {
            Log.i(str, "changeScene mWallpaperConnection == null or mWallpaperConnection.mEngine == null");
            return;
        }
        try {
            iWallpaperEngine.dispatchWallpaperCommand(action, 0, 0, 0, null);
        } catch (RemoteException e2) {
            Log.e(in, "changeScene " + e2.getMessage());
        }
        this.f15548v = newScene;
        Log.d(in, "changeScene mCurrentScene = " + this.f15548v);
        ktq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void se() {
        Intent intent = new Intent(C1367k.f7257k);
        intent.putExtra(C1367k.f54006zy, this.f15550x.getComponent());
        sendBroadcast(intent);
    }

    private void sok() {
        this.f15543q.setOnClickListener(this.id);
        this.f15540n.setOnClickListener(this.id);
        this.f15546t.setOnClickListener(this.id);
    }

    private void uj2j(boolean isNext, boolean force) {
        int i2 = this.f15548v;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (isNext && !force) {
                        return;
                    }
                    if (isNext && C2663k.qrj()) {
                        r8s8(C2651k.f15686g, 0);
                    } else {
                        r8s8(C2651k.f15692q, 1);
                    }
                }
            } else if (isNext) {
                r8s8(C2651k.f15689k, 2);
            } else if (C2663k.qrj()) {
                r8s8(C2651k.f15686g, 0);
            }
        } else if (!isNext) {
            return;
        } else {
            r8s8(C2651k.f15692q, 1);
        }
        this.bv = 0;
    }

    private void v0af() {
        new AsyncTaskC2627n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void w831() {
        new AsyncTaskC2625g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void yqrt() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f15538l = getIntent().getStringExtra("id");
            this.f15532f = intent.getStringExtra("package_name");
            this.f15529c = intent.getIntExtra(C2656k.f60919ki, 0);
            this.f15531e = intent.getFloatExtra("clock_position_x", 0.0f);
            this.f15536j = intent.getFloatExtra("clock_position_y", 0.0f);
            this.f15541o = intent.getFloatExtra("dual_clock_position_x_anchor_right", 0.0f);
            this.f15539m = intent.getFloatExtra("dual_clock_position_y", 0.0f);
        }
        Log.d(in, "initIntentExtra " + this.f15538l + " " + this.f15532f + " " + this.f15529c);
    }

    private void z4() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f15549w = supportFragmentManager;
        supportFragmentManager.m28244do(new C2628q(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zkd(String msg) {
        Toast.makeText(this, msg, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zsr0(int position) {
        new zy(position).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    public void c8jq(SuperWallpaperSummaryData[] datas) {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15538l);
        if (superWallpaperSummaryDataM9221s == null || !superWallpaperSummaryDataM9221s.f15606r || superWallpaperSummaryDataM9221s.f15599k <= 1) {
            return;
        }
        this.f15540n.setVisibility(0);
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
        if (!zSuperDispatchTouchEvent && (wallpaperConnection = this.f15527a) != null && wallpaperConnection.mEngine != null) {
            try {
                this.f15527a.mEngine.dispatchPointer(MotionEvent.obtainNoHistory(ev));
            } catch (RemoteException e2) {
                Log.e(in, "dispatchTouchEvent " + e2.getMessage());
            }
            int actionMasked = ev.getActionMasked();
            try {
                if (actionMasked == 1) {
                    this.f15527a.mEngine.dispatchWallpaperCommand("android.wallpaper.tap", (int) ev.getX(), (int) ev.getY(), 0, null);
                } else if (actionMasked == 6) {
                    int actionIndex = ev.getActionIndex();
                    this.f15527a.mEngine.dispatchWallpaperCommand("android.wallpaper.secondaryTap", (int) ev.getX(actionIndex), (int) ev.getY(actionIndex), 0, null);
                }
            } catch (RemoteException e3) {
                Log.e(in, "dispatchTouchEvent " + e3.getMessage());
            }
        }
        return zSuperDispatchTouchEvent;
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k
    public void mcp(int position) {
        C2656k.x2(this, this.f60880bo.getClassName(), position);
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k
    /* JADX INFO: renamed from: n */
    public void mo9205n(int position) {
        zsr0(position);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().post(new f7l8());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentNmn5 = this.f15549w.nmn5(C2641k.f15629m);
        if (fragmentNmn5 == null || !fragmentNmn5.isVisible()) {
            super.onBackPressed();
        } else {
            i9jn();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yqrt();
        if (TextUtils.isEmpty(this.f15538l)) {
            finish();
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(1792);
        setContentView(R.layout.activity_super_wallpaper_settings);
        this.f15537k = (RelativeLayout) findViewById(R.id.preview_container);
        this.f15543q = (Button) findViewById(R.id.back_btn);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.choose_position_btn);
        this.f15540n = linearLayout;
        linearLayout.setVisibility(8);
        this.f15546t = (Button) findViewById(R.id.apply_super_wallpaper_button);
        this.f15533g = (ImageView) findViewById(R.id.super_wallpaper_setting_aod_preview);
        this.f15551y = (FrameLayout) findViewById(R.id.super_wallpaper_lock_screen_preview);
        MiuiClockView miuiClockView = (MiuiClockView) findViewById(R.id.super_wallpaper_setting_lock_screen_preview_clock);
        this.f15545s = miuiClockView;
        miuiClockView.setClockStyle(4);
        this.f15542p = (ImageView) findViewById(R.id.super_wallpaper_setting_desktop_preview);
        this.f15534h = (ProgressBar) findViewById(R.id.super_wallpaper_setting_progressbar_aod);
        this.f15535i = (ProgressBar) findViewById(R.id.super_wallpaper_setting_progressbar_lock_screen);
        this.f15552z = (ProgressBar) findViewById(R.id.super_wallpaper_setting_progressbar_desktop);
        this.f15544r = findViewById(R.id.loading);
        Intent className = new Intent("android.service.wallpaper.WallpaperService").setClassName(this.f15532f, this.f15532f + ".superwallpaper." + com.android.thememanager.settings.superwallpaper.utils.zy.ld6(this.f15538l) + "PreviewSuperWallpaper");
        this.f15550x = className;
        this.f60880bo = className.getComponent();
        C2640k.m9216n().m9220k(this);
        this.f15547u = new Intent("android.service.wallpaper.WallpaperService").setClassName(getPackageName(), getPackageName() + ".superwallpaper." + com.android.thememanager.settings.superwallpaper.utils.zy.ld6(this.f15538l) + "PreviewSuperWallpaper");
        String str = in;
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate ");
        sb.append(this.f15550x);
        Log.d(str, sb.toString());
        this.f15528b = WallpaperManager.getInstance(this);
        this.f15527a = new WallpaperConnection(this.f15550x);
        if (!C2663k.qrj()) {
            this.f15548v = 1;
            this.f15534h.setVisibility(8);
        }
        sok();
        bwp();
        ktq();
        z4();
        etdu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WallpaperConnection wallpaperConnection = this.f15527a;
        if (wallpaperConnection != null) {
            wallpaperConnection.disconnect();
        }
        this.f15527a = null;
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onPause() {
        IWallpaperEngine iWallpaperEngine;
        super.onPause();
        this.an.removeMessages(0);
        WallpaperConnection wallpaperConnection = this.f15527a;
        if (wallpaperConnection == null || (iWallpaperEngine = wallpaperConnection.mEngine) == null) {
            return;
        }
        try {
            iWallpaperEngine.setVisibility(false);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onResume() {
        IWallpaperEngine iWallpaperEngine;
        super.onResume();
        Fragment fragmentNmn5 = this.f15549w.nmn5(C2641k.f15629m);
        if (fragmentNmn5 == null || !fragmentNmn5.isVisible()) {
            this.an.sendEmptyMessage(0);
        }
        WallpaperConnection wallpaperConnection = this.f15527a;
        if (wallpaperConnection == null || (iWallpaperEngine = wallpaperConnection.mEngine) == null) {
            return;
        }
        try {
            iWallpaperEngine.setVisibility(true);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent event) {
        if (this.f15530d) {
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 0) {
            this.bb = event.getX();
        }
        if (event.getAction() == 1) {
            float x3 = event.getX();
            this.bp = x3;
            float f2 = this.bb;
            if (f2 - x3 > 100.0f) {
                uj2j(true, false);
            } else if (x3 - f2 > 100.0f) {
                uj2j(false, false);
            } else {
                uj2j(true, true);
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        WallpaperConnection wallpaperConnection = this.f15527a;
        if (wallpaperConnection == null || wallpaperConnection.mEngine == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C1367k.f54001ld6, hasFocus);
            this.f15527a.mEngine.dispatchWallpaperCommand(C2651k.f60890ki, 0, 0, 0, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k
    public void zy(int position) {
        WallpaperConnection wallpaperConnection = this.f15527a;
        if (wallpaperConnection == null || wallpaperConnection.mEngine == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            IWallpaperEngine iWallpaperEngine = this.f15527a.mEngine;
            if (iWallpaperEngine != null) {
                iWallpaperEngine.dispatchWallpaperCommand(C2651k.f60891kja0, 0, 0, 0, bundle);
            }
        } catch (RemoteException e2) {
            Log.e(in, "setSuperWallpaperLand " + e2.getMessage());
        }
    }

    class WallpaperConnection extends IWallpaperConnection.Stub implements ServiceConnection {
        boolean mConnected;
        IWallpaperEngine mEngine;
        final Intent mIntent;
        IWallpaperService mService;

        WallpaperConnection(Intent intent) {
            this.mIntent = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$engineShown$0() {
            SuperWallpaperSettingActivity.this.f15544r.setVisibility(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$engineShown$1() {
            SuperWallpaperSettingActivity.this.f15544r.animate().alpha(0.0f).setDuration(220L).setStartDelay(300L).setInterpolator(AnimationUtils.loadInterpolator(SuperWallpaperSettingActivity.this, 17563663)).withEndAction(new Runnable() { // from class: com.android.thememanager.settings.superwallpaper.activity.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15663k.lambda$engineShown$0();
                }
            });
        }

        public void attachEngine(IWallpaperEngine engine) {
            synchronized (this) {
                try {
                    if (this.mConnected) {
                        this.mEngine = engine;
                        engine.setVisibility(true);
                    } else {
                        engine.destroy();
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public boolean connect() {
            synchronized (this) {
                if (!SuperWallpaperSettingActivity.this.bindService(this.mIntent, this, 1)) {
                    SuperWallpaperSettingActivity superWallpaperSettingActivity = SuperWallpaperSettingActivity.this;
                    superWallpaperSettingActivity.f15550x = superWallpaperSettingActivity.f15547u;
                    SuperWallpaperSettingActivity.this.cfr();
                    SuperWallpaperSettingActivity superWallpaperSettingActivity2 = SuperWallpaperSettingActivity.this;
                    if (!superWallpaperSettingActivity2.bindService(superWallpaperSettingActivity2.f15547u, this, 1)) {
                        return false;
                    }
                }
                SuperWallpaperSettingActivity.this.se();
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
                    SuperWallpaperSettingActivity.this.unbindService(this);
                } catch (IllegalArgumentException e2) {
                    Log.e(SuperWallpaperSettingActivity.in, "Can't unbind wallpaper service. It might have crashed, just ignoring.", e2);
                }
                this.mService = null;
            }
        }

        @Override // android.service.wallpaper.IWallpaperConnection
        public void engineShown(IWallpaperEngine engine) throws RemoteException {
            engine.dispatchWallpaperCommand(C2663k.qrj() ? C2651k.f15686g : C2651k.f15692q, 0, 0, 0, null);
            SuperWallpaperSettingActivity.this.f15544r.post(new Runnable() { // from class: com.android.thememanager.settings.superwallpaper.activity.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15665k.lambda$engineShown$1();
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            if (SuperWallpaperSettingActivity.this.f15527a == this) {
                this.mService = IWallpaperService.Stub.asInterface(service);
                try {
                    View decorView = SuperWallpaperSettingActivity.this.getWindow().getDecorView();
                    C2668s.m9299k(this.mService, this, decorView.getWindowToken(), 1001, true, decorView.getWidth(), decorView.getHeight());
                } catch (RemoteException e2) {
                    Log.e(SuperWallpaperSettingActivity.in, "Failed attaching wallpaper; clearing", e2);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            this.mService = null;
            this.mEngine = null;
            if (SuperWallpaperSettingActivity.this.f15527a == this) {
                Log.w(SuperWallpaperSettingActivity.in, "Wallpaper service gone: " + name);
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
                try {
                    if (this.mConnected) {
                        this.mEngine = engine;
                        engine.setVisibility(true);
                        engine.dispatchWallpaperCommand(C2663k.qrj() ? C2651k.f15686g : C2651k.f15692q, 0, 0, 0, null);
                    } else {
                        engine.destroy();
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }
}
