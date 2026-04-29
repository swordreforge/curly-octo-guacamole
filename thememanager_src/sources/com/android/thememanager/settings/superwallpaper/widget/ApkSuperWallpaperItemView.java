package com.android.thememanager.settings.superwallpaper.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import b3e.C1358k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.views.LoadingView;
import com.android.thememanager.f7l8;
import com.android.thememanager.settings.subsettings.n7h;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.superwallpaper.activity.UnitySuperWallpaperDetailActivity;
import com.android.thememanager.x2;
import com.market.sdk.a9;
import com.market.sdk.fu4;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ApkSuperWallpaperItemView extends FrameLayout implements C2640k.toq {
    public static final int ac = 3;
    public static final int ad = 4;
    public static final int aj = 8;
    public static final int am = 5;
    public static final int ar = 11;
    public static final int ax = 1;
    public static final int ay = 6;
    private static final String az = "SuperWallpaperItem";
    public static final int ba = 0;
    private static final int bc = 3001;
    private static final int bd = 3005;
    public static final int be = 7;
    public static final int bq = 2;
    public static final int bs = 9;
    private static final int bu = 3002;
    public static final int k0 = 10;
    private static final int tgs = 1;
    private static final int tlhn = 3007;
    private static final int w97r = 3009;
    private static final int yl25 = 2;
    public static final String zmmu = "updated";

    /* JADX INFO: renamed from: a */
    private int f15833a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f61010ab;
    private int an;
    private final Handler as;

    /* JADX INFO: renamed from: b */
    private float f15834b;
    private int bb;
    private BroadcastReceiver bg;
    private InterfaceC2675g bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f61011bo;
    private String bp;
    private int bv;

    /* JADX INFO: renamed from: c */
    private SuperWallpaperSummaryData f15835c;

    /* JADX INFO: renamed from: d */
    private int f15836d;

    /* JADX INFO: renamed from: e */
    private int f15837e;

    /* JADX INFO: renamed from: f */
    private boolean f15838f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f15839g;

    /* JADX INFO: renamed from: h */
    private FrameLayout f15840h;

    /* JADX INFO: renamed from: i */
    private ImageView f15841i;
    private boolean id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private float f15842j;

    /* JADX INFO: renamed from: k */
    private Context f15843k;

    /* JADX INFO: renamed from: l */
    private String f15844l;

    /* JADX INFO: renamed from: m */
    private float f15845m;

    /* JADX INFO: renamed from: n */
    private ImageView f15846n;

    /* JADX INFO: renamed from: o */
    private float f15847o;

    /* JADX INFO: renamed from: p */
    private TextView f15848p;

    /* JADX INFO: renamed from: q */
    private View f15849q;

    /* JADX INFO: renamed from: r */
    private ProgressBar f15850r;

    /* JADX INFO: renamed from: s */
    private TextView f15851s;

    /* JADX INFO: renamed from: t */
    private Button f15852t;

    /* JADX INFO: renamed from: u */
    private boolean f15853u;

    /* JADX INFO: renamed from: v */
    private String f15854v;

    /* JADX INFO: renamed from: w */
    private n7h f15855w;

    /* JADX INFO: renamed from: x */
    private int f15856x;

    /* JADX INFO: renamed from: y */
    private TextView f15857y;

    /* JADX INFO: renamed from: z */
    private LoadingView f15858z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView$g */
    public interface InterfaceC2675g {
        /* JADX INFO: renamed from: k */
        void mo9210k();
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView$k */
    class HandlerC2676k extends Handler {
        HandlerC2676k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i2 = msg.what;
            if (i2 == 1) {
                if (ApkSuperWallpaperItemView.this.bl != null) {
                    ApkSuperWallpaperItemView.this.bl.mo9210k();
                }
                Log.d(ApkSuperWallpaperItemView.az, "MSG_SUPER_WALLPAPER_PACKAGE_STATUS_CHANGED ");
                C2640k.m9216n().m9220k(ApkSuperWallpaperItemView.this);
                return;
            }
            if (i2 != 2) {
                return;
            }
            if (ApkSuperWallpaperItemView.this.id) {
                ApkSuperWallpaperItemView.this.f15858z.setVisibility(8);
                ApkSuperWallpaperItemView.this.f15840h.setVisibility(0);
                return;
            }
            ApkSuperWallpaperItemView.this.id = true;
            ApkSuperWallpaperItemView.this.f15858z.setVisibility(0);
            ApkSuperWallpaperItemView.this.f15840h.setVisibility(8);
            ApkSuperWallpaperItemView.this.as.removeMessages(2);
            ApkSuperWallpaperItemView.this.as.sendEmptyMessageDelayed(2, 500L);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView$n */
    class ViewOnClickListenerC2677n implements View.OnClickListener {
        ViewOnClickListenerC2677n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            Activity activity = (Activity) ApkSuperWallpaperItemView.this.getContext();
            if (activity.getIntent().getBooleanExtra(f7l8.f58072zy, false)) {
                x2.f17856k.m10531k().zy(ApkSuperWallpaperItemView.this.f15835c, activity);
                return;
            }
            if (ApkSuperWallpaperItemView.this.f15835c.f15594f != null && ApkSuperWallpaperItemView.this.f15835c.f15594f.f15615n != null && ApkSuperWallpaperItemView.this.f15835c.f15594f.f15615n.length > 1) {
                C2640k.m9216n().x2(ApkSuperWallpaperItemView.this.f15835c);
            }
            Intent intent = new Intent();
            intent.setClass(ApkSuperWallpaperItemView.this.f15843k, UnitySuperWallpaperDetailActivity.class);
            String str2 = null;
            if (ApkSuperWallpaperItemView.this.f15835c != null) {
                str2 = ApkSuperWallpaperItemView.this.f15835c.f15607s;
                intent.putExtra("id", str2);
                str = ApkSuperWallpaperItemView.this.f15835c.f15597i;
            } else {
                str = "";
            }
            if (ApkSuperWallpaperItemView.this.f15838f && !TextUtils.isEmpty(ApkSuperWallpaperItemView.this.f15844l)) {
                str = ApkSuperWallpaperItemView.this.f15844l;
            }
            intent.putExtra("package_name", str);
            intent.putExtra(C2656k.f60919ki, ApkSuperWallpaperItemView.this.f15837e);
            intent.putExtra("clock_position_x", ApkSuperWallpaperItemView.this.f15842j);
            intent.putExtra("clock_position_y", ApkSuperWallpaperItemView.this.f15847o);
            intent.putExtra("dual_clock_position_x_anchor_right", ApkSuperWallpaperItemView.this.f15845m);
            intent.putExtra("dual_clock_position_y", ApkSuperWallpaperItemView.this.f15834b);
            ApkSuperWallpaperItemView.this.f15843k.startActivity(intent);
            if (ApkSuperWallpaperItemView.this.f61011bo) {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.nl6, str2));
            } else {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.nr0, C1358k.f53983f7l8, str2));
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView$q */
    class ViewOnClickListenerC2678q implements View.OnClickListener {
        ViewOnClickListenerC2678q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            ApkSuperWallpaperItemView apkSuperWallpaperItemView = ApkSuperWallpaperItemView.this;
            apkSuperWallpaperItemView.lvui(apkSuperWallpaperItemView.f15835c.f15610z);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (ApkSuperWallpaperItemView.this.f15835c == null || ApkSuperWallpaperItemView.this.f15835c.f15606r || TextUtils.isEmpty(ApkSuperWallpaperItemView.this.f15835c.f15610z)) {
                return;
            }
            if (ApkSuperWallpaperItemView.this.f61011bo) {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.haw, ApkSuperWallpaperItemView.this.f15835c.f15607s));
            } else {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.nr0, C1358k.f7235p, ApkSuperWallpaperItemView.this.f15835c.f15607s));
            }
            if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(ApkSuperWallpaperItemView.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.settings.superwallpaper.widget.zy
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f15914k.toq();
                    }
                });
            } else {
                ApkSuperWallpaperItemView apkSuperWallpaperItemView = ApkSuperWallpaperItemView.this;
                apkSuperWallpaperItemView.lvui(apkSuperWallpaperItemView.f15835c.f15610z);
            }
        }
    }

    class toq extends BroadcastReceiver {
        toq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.d(ApkSuperWallpaperItemView.az, "onReceive action " + action);
            if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(action) && ApkSuperWallpaperItemView.this.f15844l.equals(intent.getStringExtra("packageName"))) {
                int intExtra = intent.getIntExtra("errorCode", -1);
                int intExtra2 = intent.getIntExtra("progress", -1);
                int intExtra3 = intent.getIntExtra("status", 0);
                Log.d(ApkSuperWallpaperItemView.az, "ACTION_XIAOMI_MARKET_DOWNLOAD_INSTALL_RESULT errorCode = " + intExtra + "progress = " + intExtra2 + "status = " + intExtra3 + "taskId = " + intent.getLongExtra("taskId", -1L) + "reason = " + intent.getIntExtra("reason", -1) + "appId = " + intent.getStringExtra("appId"));
                ApkSuperWallpaperItemView.this.f15856x = intExtra2;
                switch (intExtra) {
                    case -8:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.cancel_download), 0).show();
                        break;
                    case -7:
                    case 0:
                    default:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        break;
                    case -6:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.no_cta_agreed), 0).show();
                        break;
                    case -5:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.already_newest_version), 0).show();
                        break;
                    case -4:
                        if (intExtra3 != 0) {
                            ApkSuperWallpaperItemView.this.f15833a = 6;
                            Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.no_install_permission), 0).show();
                        }
                        break;
                    case -3:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.install_failed), 0).show();
                        break;
                    case -2:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        if (ApkSuperWallpaperItemView.this.bv != -8) {
                            Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.download_failed), 0).show();
                        }
                        break;
                    case -1:
                        ApkSuperWallpaperItemView.this.f15833a = 6;
                        Toast.makeText(ApkSuperWallpaperItemView.this.getContext(), ApkSuperWallpaperItemView.this.a9(R.string.task_already_exist), 0).show();
                        break;
                    case 1:
                        ApkSuperWallpaperItemView.this.f15833a = 2;
                        break;
                    case 2:
                        ApkSuperWallpaperItemView.this.f15833a = 7;
                        break;
                    case 3:
                        ApkSuperWallpaperItemView.this.f15833a = 8;
                        break;
                    case 4:
                        ni7.m7146k().zy(ApkSuperWallpaperItemView.zmmu, new Intent(ApkSuperWallpaperItemView.zmmu));
                        ApkSuperWallpaperItemView.this.f15833a = 10;
                        break;
                    case 5:
                        ApkSuperWallpaperItemView.this.f15833a = 3;
                        break;
                }
                ApkSuperWallpaperItemView.this.bv = intExtra;
                if (intExtra3 != -5) {
                    if (intExtra3 != -4) {
                        if (intExtra3 == -3) {
                            ApkSuperWallpaperItemView.this.f15833a = 5;
                        } else if (intExtra3 != -2) {
                            if (intExtra3 == -1 && intExtra == 5) {
                                ApkSuperWallpaperItemView.this.f15833a = 1;
                            }
                        } else if (intExtra == 5) {
                            ApkSuperWallpaperItemView.this.f15833a = 3;
                        }
                    } else if (intExtra == 5) {
                        ApkSuperWallpaperItemView.this.f15833a = 9;
                    }
                } else if (intExtra == 5) {
                    ApkSuperWallpaperItemView.this.f15833a = 1;
                }
                if (ApkSuperWallpaperItemView.this.f15833a == 10) {
                    ApkSuperWallpaperItemView.this.as.removeMessages(1);
                    ApkSuperWallpaperItemView.this.as.sendEmptyMessageDelayed(1, 100L);
                }
                if (ApkSuperWallpaperItemView.this.f15835c != null && !ApkSuperWallpaperItemView.this.f15835c.f15606r && !ApkSuperWallpaperItemView.this.f15835c.f15597i.equals(ApkSuperWallpaperItemView.this.f15844l) && ApkSuperWallpaperItemView.this.f15833a == 6) {
                    ApkSuperWallpaperItemView.this.f15833a = 11;
                }
                ApkSuperWallpaperItemView.this.f61010ab = intExtra3;
                ApkSuperWallpaperItemView.this.bb = intExtra2;
                StringBuilder sb = new StringBuilder();
                sb.append("ACTION_XIAOMI_MARKET_DOWNLOAD_INSTALL_RESULT mSuperWallpaperDownloadStatus = ");
                ApkSuperWallpaperItemView apkSuperWallpaperItemView = ApkSuperWallpaperItemView.this;
                sb.append(apkSuperWallpaperItemView.m9338r(apkSuperWallpaperItemView.f15833a));
                Log.d(ApkSuperWallpaperItemView.az, sb.toString());
                ApkSuperWallpaperItemView apkSuperWallpaperItemView2 = ApkSuperWallpaperItemView.this;
                apkSuperWallpaperItemView2.x9kr(apkSuperWallpaperItemView2.f15833a);
            }
        }
    }

    class zy implements View.OnClickListener {
        zy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m9345q() {
            ApkSuperWallpaperItemView.this.eqxt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zy() {
            ApkSuperWallpaperItemView apkSuperWallpaperItemView = ApkSuperWallpaperItemView.this;
            apkSuperWallpaperItemView.lvui(apkSuperWallpaperItemView.f15835c.f15597i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            int i2 = ApkSuperWallpaperItemView.this.f15833a;
            if (i2 != 0) {
                if (i2 == 3) {
                    ApkSuperWallpaperItemView.this.oc();
                    return;
                }
                if (i2 == 5) {
                    if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                        com.android.thememanager.basemodule.privacy.x2.m6916q(ApkSuperWallpaperItemView.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.settings.superwallpaper.widget.toq
                            @Override // p000a.toq
                            public final void onSuccess() {
                                this.f15913k.m9345q();
                            }
                        });
                        return;
                    } else {
                        ApkSuperWallpaperItemView.this.eqxt();
                        return;
                    }
                }
                if (i2 != 6) {
                    return;
                }
            }
            if (ApkSuperWallpaperItemView.this.f61011bo) {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.tc, ApkSuperWallpaperItemView.this.f15835c.f15607s));
            } else {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.nr0, C1358k.f7235p, ApkSuperWallpaperItemView.this.f15835c.f15607s));
            }
            if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(ApkSuperWallpaperItemView.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.settings.superwallpaper.widget.k
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f15912k.zy();
                    }
                });
            } else {
                ApkSuperWallpaperItemView apkSuperWallpaperItemView = ApkSuperWallpaperItemView.this;
                apkSuperWallpaperItemView.lvui(apkSuperWallpaperItemView.f15835c.f15597i);
            }
        }
    }

    public ApkSuperWallpaperItemView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a9(int resId) {
        return getResources().getString(resId);
    }

    private void d2ok() {
        if (this.as.hasMessages(2)) {
            return;
        }
        this.as.sendEmptyMessage(2);
    }

    public static void d3(Context context, String appPkg) {
        try {
            if (TextUtils.isEmpty(appPkg)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + appPkg));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, "failed", 1).show();
        }
    }

    private void dd() {
        Pair<Integer, Integer> pair;
        boolean z2;
        SuperWallpaperSummaryData superWallpaperSummaryData = this.f15835c;
        if (superWallpaperSummaryData != null && (((z2 = superWallpaperSummaryData.f15606r) || superWallpaperSummaryData.f15600l) && superWallpaperSummaryData.f15592c == null)) {
            if (z2) {
                x9kr(10);
            } else {
                x9kr(11);
            }
            setOnClickListener(new ViewOnClickListenerC2677n());
            return;
        }
        setOnClickListener(null);
        SuperWallpaperSummaryData superWallpaperSummaryData2 = this.f15835c;
        int iIntValue = -1;
        if (superWallpaperSummaryData2 != null && (pair = superWallpaperSummaryData2.f15592c) != null) {
            iIntValue = ((Integer) pair.first).intValue();
        }
        if (iIntValue != -3) {
            if (iIntValue == -2 || iIntValue == 3001) {
                x9kr(3);
                eqxt();
                return;
            }
            if (iIntValue != 3002) {
                if (iIntValue != bd) {
                    if (iIntValue != tlhn) {
                        x9kr(6);
                        return;
                    }
                }
            }
            x9kr(10);
            return;
        }
        this.f15856x = ((Integer) this.f15835c.f15592c.second).intValue();
        if (!this.f15853u) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
            this.f15843k.registerReceiver(this.bg, intentFilter);
            this.f15853u = true;
        }
        x9kr(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt() {
        SuperWallpaperSummaryData superWallpaperSummaryData = this.f15835c;
        if (superWallpaperSummaryData != null && superWallpaperSummaryData.f15592c != null) {
            this.bp = jk(superWallpaperSummaryData.f15610z);
            if (!this.f15853u) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                this.f15843k.registerReceiver(this.bg, intentFilter);
                this.f15853u = true;
            }
        }
        com.android.thememanager.basemodule.ad.zy.zy().m6602g(this.bp);
    }

    private void gvn7() {
        this.f15846n = (ImageView) findViewById(R.id.item_background);
        this.f15849q = findViewById(R.id.download_mask);
        this.f15839g = (LinearLayout) findViewById(R.id.wallpaper_content);
        this.f15857y = (TextView) findViewById(R.id.super_wallpaper_item_title);
        this.f15851s = (TextView) findViewById(R.id.super_wallpaper_item_summary);
        this.f15858z = (LoadingView) findViewById(R.id.loading_view);
        this.f15848p = (TextView) findViewById(R.id.download_percentage);
        this.f15840h = (FrameLayout) findViewById(R.id.download_button_container);
        ImageView imageView = (ImageView) findViewById(R.id.download_status);
        this.f15841i = imageView;
        imageView.setOnClickListener(new zy());
        Button button = (Button) findViewById(R.id.update_button);
        this.f15852t = button;
        button.setOnClickListener(new ViewOnClickListenerC2678q());
        this.f15850r = (ProgressBar) findViewById(R.id.download_progressbar);
    }

    private String jk(String packageName) {
        String strZy;
        String strM17378q = "";
        this.f15844l = packageName;
        try {
            strZy = com.market.sdk.silentupdate.toq.zy();
            try {
                strM17378q = com.market.sdk.silentupdate.toq.m17378q(strZy, "2882303761518335529", packageName, "miwallpaper", "5821833552529");
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                e.printStackTrace();
            } catch (InvalidKeyException e3) {
                e = e3;
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e6) {
            e = e6;
            strZy = "";
        }
        this.bp = "market://details/detailfloat?packageName=" + packageName + "&ref=miwallpaper&appClientId=2882303761518335529&senderPackageName=com.android.thememanager&appSignature=" + strM17378q + "&nonce=" + strZy + "&show_cta=true&startDownload=true&overlayPosition=1";
        StringBuilder sb = new StringBuilder();
        sb.append("startDownload data = ");
        sb.append(this.bp);
        Log.d(az, sb.toString());
        return this.bp;
    }

    private void jp0y(int status) {
        Log.d(az, "initDownloadStatus " + m9338r(status) + " " + status);
        this.f15852t.setVisibility(8);
        switch (status) {
            case 1:
                d2ok();
                this.f15848p.setVisibility(0);
                int iM9243p = C2656k.m9243p(this.f15856x, 0, 100);
                this.f15848p.setText(iM9243p + "%");
                this.f15850r.setVisibility(0);
                this.f15850r.setProgress(this.f15856x, true);
                this.f15849q.setVisibility(0);
                this.f15839g.setVisibility(8);
                break;
            case 2:
                d2ok();
                this.f15841i.setImageResource(R.drawable.download_pending);
                this.f15850r.setProgress(0, true);
                this.f15848p.setVisibility(0);
                this.f15848p.setText("0%");
                this.f15850r.setVisibility(0);
                this.f15850r.setProgressDrawable(getResources().getDrawable(R.drawable.download_progress_bg));
                this.f15849q.setVisibility(0);
                this.f15839g.setVisibility(8);
                break;
            case 3:
                d2ok();
                this.f15841i.setImageResource(R.drawable.download_pause);
                this.f15841i.setContentDescription(a9(R.string.resource_waiting_pause));
                this.f15848p.setVisibility(0);
                int iM9243p2 = C2656k.m9243p(this.f15856x, 0, 100);
                this.f15848p.setText(iM9243p2 + "%");
                this.f15850r.setVisibility(0);
                if (this.an != 3) {
                    this.f15850r.setProgressDrawable(getResources().getDrawable(R.drawable.download_progress_bg));
                }
                this.f15850r.setProgress(this.f15856x, true);
                this.f15849q.setVisibility(0);
                this.f15839g.setVisibility(8);
                break;
            case 4:
            case 6:
                this.as.removeMessages(2);
                this.f15841i.setVisibility(0);
                this.f15841i.setImageResource(R.drawable.download_start);
                this.f15841i.setContentDescription(a9(R.string.resource_download));
                this.f15848p.setVisibility(8);
                this.f15850r.setVisibility(8);
                this.f15849q.setVisibility(8);
                this.f15839g.setVisibility(0);
                n7h n7hVar = this.f15855w;
                if (n7hVar != null) {
                    n7hVar.cdj(this.f15836d);
                }
                break;
            case 5:
                this.as.removeMessages(2);
                this.f15841i.setVisibility(0);
                this.f15841i.setImageResource(R.drawable.download_resume);
                this.f15841i.setContentDescription(a9(R.string.resource_continue));
                this.f15848p.setVisibility(0);
                int iM9243p3 = C2656k.m9243p(this.f15856x, 0, 100);
                this.f15848p.setText(iM9243p3 + "%");
                this.f15850r.setVisibility(0);
                this.f15850r.setProgress(this.f15856x, true);
                this.f15850r.setProgressDrawable(getResources().getDrawable(R.drawable.download_progress_pause_bg));
                this.f15849q.setVisibility(0);
                this.f15839g.setVisibility(8);
                break;
            case 7:
                this.f15856x = 100;
                this.f15841i.setVisibility(8);
                this.f15848p.setVisibility(0);
                int iM9243p4 = C2656k.m9243p(this.f15856x, 0, 100);
                this.f15848p.setText(iM9243p4 + "%");
                this.f15850r.setVisibility(0);
                this.f15850r.setProgress(this.f15856x, true);
                this.f15849q.setVisibility(0);
                this.f15839g.setVisibility(8);
                break;
            case 8:
                break;
            case 9:
                this.f15841i.setVisibility(8);
                this.f15848p.setVisibility(0);
                int iM9243p5 = C2656k.m9243p(this.f15856x, 0, 100);
                this.f15848p.setText(iM9243p5 + "%");
                this.f15850r.setVisibility(0);
                this.f15850r.setProgress(this.f15856x, true);
                this.f15849q.setVisibility(0);
                this.f15839g.setVisibility(8);
                break;
            case 10:
                this.f15841i.setVisibility(8);
                this.f15848p.setVisibility(8);
                this.f15850r.setVisibility(8);
                this.f15849q.setVisibility(8);
                this.f15839g.setVisibility(0);
                break;
            case 11:
                this.f15852t.setVisibility(0);
                this.f15841i.setVisibility(8);
                this.f15841i.setImageResource(R.drawable.super_wallpaper_item_update_button_background);
                this.f15848p.setVisibility(8);
                this.f15850r.setVisibility(8);
                this.f15849q.setVisibility(8);
                this.f15839g.setVisibility(0);
                break;
            default:
                this.f15841i.setVisibility(8);
                this.f15848p.setVisibility(8);
                this.f15850r.setVisibility(8);
                this.f15849q.setVisibility(8);
                this.f15839g.setVisibility(0);
                break;
        }
        this.an = status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui(String packageName) {
        this.bp = jk(packageName);
        Log.d(az, "startDownload result = " + com.android.thememanager.basemodule.ad.zy.zy().toq(this.bp));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
        this.f15843k.registerReceiver(this.bg, intentFilter);
        this.f15853u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oc() {
        com.android.thememanager.basemodule.ad.zy.zy().m6604n(this.bp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public String m9338r(int status) {
        switch (status) {
            case 0:
                return "none";
            case 1:
                return "download_pending";
            case 2:
                return "download_start";
            case 3:
                return "downloading";
            case 4:
                return "download_cancel";
            case 5:
                return "download_pause";
            case 6:
                return "download_failed";
            case 7:
                return "download_success";
            case 8:
                return "install_start";
            case 9:
                return "installing";
            case 10:
                return "install_success";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x9kr(int status) {
        this.f15833a = status;
        jp0y(status);
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    public void c8jq(SuperWallpaperSummaryData[] datas) {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s;
        if (this.f15835c == null || (superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15835c.f15607s)) == null) {
            return;
        }
        setBaseContents(superWallpaperSummaryDataM9221s, this.f15836d);
    }

    public boolean fti() {
        return this.in;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7h n7hVar = this.f15855w;
        if (n7hVar != null && this.bb > -1) {
            n7hVar.ni7(this.f15836d, new Pair<>(Integer.valueOf(this.f61010ab), Integer.valueOf(this.bb)));
        }
        if (this.f15853u) {
            this.f15843k.unregisterReceiver(this.bg);
            this.f15853u = false;
        }
        this.f15844l = null;
        this.f61010ab = 0;
        this.bb = -1;
        this.in = false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        gvn7();
        dd();
    }

    public void setAdapter(n7h adapter) {
        this.f15855w = adapter;
    }

    public void setBaseContents(SuperWallpaperSummaryData data, int position) {
        this.f15836d = position;
        if (TextUtils.isEmpty(this.f15844l)) {
            this.f15844l = data.f15597i;
        }
        setBaseContents(data, (String) null);
    }

    public void setIsSuperWallpaperListPage(boolean isSuperWallpaperListPage) {
        this.f61011bo = isSuperWallpaperListPage;
    }

    public void setSuperWallpaperStatusChangeCallback(InterfaceC2675g changeCallback) {
        this.bl = changeCallback;
    }

    public ApkSuperWallpaperItemView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ApkSuperWallpaperItemView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15833a = 0;
        this.bb = -1;
        this.in = false;
        this.as = new HandlerC2676k(Looper.getMainLooper());
        this.bg = new toq();
        this.f15843k = context;
        a9.m17288p(true);
        a9.ni7(fu4.PRODUCT);
    }

    public void setBaseContents(SuperWallpaperSummaryData data, String imageUrl) {
        this.f15835c = data;
        this.f15854v = imageUrl;
        this.in = true;
        if (TextUtils.isEmpty(this.f15844l)) {
            this.f15844l = data.f15597i;
        }
        if (data != null) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.s5qd, data.f15607s));
            this.f15857y.setText(data.f15604p);
            this.f15851s.setText(data.f15596h);
            Icon icon = data.f15608t;
            if (icon != null) {
                this.f15846n.setImageDrawable(icon.loadDrawable(getContext()));
            } else if (!TextUtils.isEmpty(this.f15854v)) {
                com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.f15843k, this.f15854v, this.f15846n, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(com.android.thememanager.basemodule.imageloader.x2.kja0(0)));
            }
            if (data.f15606r || data.f15600l) {
                this.f15837e = data.f15599k;
                this.f15842j = data.f15605q;
                this.f15847o = data.f15602n;
                this.f15845m = data.f15595g;
                this.f15834b = data.f15609y;
            }
        }
        dd();
    }

    public ApkSuperWallpaperItemView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }
}
