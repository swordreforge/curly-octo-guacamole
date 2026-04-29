package com.android.thememanager.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0924e;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.controller.C1900g;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.database.C1960k;
import com.android.thememanager.database.ThemeDatabase;
import com.android.thememanager.module.detail.util.InterfaceC2245k;
import com.android.thememanager.presenter.C2309k;
import com.android.thememanager.util.C2774e;
import com.android.thememanager.util.C2821y;
import com.android.thememanager.view.C2940t;
import com.xiaomi.mipush.sdk.C5658n;
import java.lang.ref.WeakReference;
import miuix.animation.listener.TransitionListener;
import mub.InterfaceC7395n;
import yl.AbstractC7785k;
import yl.C7784g;
import yl.C7787p;
import yl.C7788q;
import yl.C7789s;
import yl.InterfaceC7786n;

/* JADX INFO: loaded from: classes.dex */
public class LargeIconPickerActivity extends AbstractActivityC1717k implements com.android.thememanager.view.mcp, View.OnClickListener, InterfaceC2245k, InterfaceC7786n {
    private static final String ac = "picker";
    public static final String ad = "packageName";
    public static final String aj = "isDefault";
    public static final String am = "originalPackageName";
    public static final int ax = 2;
    public static final String ay = "activityName";
    public static final int ba = 1;
    public static final String be = "isDualApp";
    public static final int bq = 1;
    public static final String bs = "launcherMode";

    /* JADX INFO: renamed from: a */
    private String f8783a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private yl.zy f57268ab;
    private HandlerC1544g an;
    private boolean as;
    private ViewGroup az;
    private yl.toq bb;
    private com.android.thememanager.basemodule.views.ld6 bg;
    private f7l8 bl;
    private yl.f7l8 bp;
    private C7784g bv;

    /* JADX INFO: renamed from: c */
    private ImageView f8785c;

    /* JADX INFO: renamed from: d */
    private boolean f8786d;

    /* JADX INFO: renamed from: e */
    private TextView f8787e;

    /* JADX INFO: renamed from: f */
    private ImageView f8788f;
    private IntentFilter id;
    private C2774e in;

    /* JADX INFO: renamed from: j */
    private View f8789j;

    /* JADX INFO: renamed from: l */
    private ViewGroup f8790l;

    /* JADX INFO: renamed from: m */
    private TextView f8791m;

    /* JADX INFO: renamed from: o */
    private com.android.thememanager.view.dd f8792o;

    /* JADX INFO: renamed from: r */
    private C2309k f8793r;

    /* JADX INFO: renamed from: v */
    private String f8795v;

    /* JADX INFO: renamed from: w */
    private View f8796w;

    /* JADX INFO: renamed from: x */
    private String f8797x;

    /* JADX INFO: renamed from: b */
    private boolean f8784b = false;

    /* JADX INFO: renamed from: u */
    private boolean f8794u = false;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f57269bo = false;

    private class f7l8 extends BroadcastReceiver {
        private f7l8() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || !com.android.thememanager.util.gc3c.cdj(LargeIconPickerActivity.this) || LargeIconPickerActivity.this.f8793r == null || intent.getBooleanExtra("noConnectivity", false)) {
                return;
            }
            LargeIconPickerActivity.this.f8793r.lrht().cdj(new C1723y<>(1));
        }

        /* synthetic */ f7l8(LargeIconPickerActivity largeIconPickerActivity, C1545k c1545k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.LargeIconPickerActivity$g */
    private static class HandlerC1544g extends Handler {

        /* JADX INFO: renamed from: g */
        private static final int f8799g = 1000;

        /* JADX INFO: renamed from: n */
        private static final int f8800n = 4;

        /* JADX INFO: renamed from: q */
        private static final int f8801q = 3;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f57270toq = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f57271zy = 2;

        /* JADX INFO: renamed from: k */
        private WeakReference<LargeIconPickerActivity> f8802k;

        /* synthetic */ HandlerC1544g(LargeIconPickerActivity largeIconPickerActivity, C1545k c1545k) {
            this(largeIconPickerActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@zy.lvui Message msg) {
            WeakReference<LargeIconPickerActivity> weakReference;
            Log.i("Theme", "handleMessage: " + msg.what);
            super.handleMessage(msg);
            int i2 = msg.what;
            if (i2 == 1) {
                if (this.f8802k.get() == null || C1915g.m7550n()) {
                    return;
                }
                this.f8802k.get().f8796w.setVisibility(8);
                this.f8802k.get().yl(null);
                return;
            }
            if (i2 == 2) {
                if (this.f8802k.get() != null) {
                    this.f8802k.get().f8796w.setVisibility(8);
                    this.f8802k.get().yl((C1960k) msg.obj);
                    return;
                }
                return;
            }
            if (i2 == 3) {
                if (this.f8802k.get() != null) {
                    this.f8802k.get().f8796w.setVisibility(8);
                    this.f8802k.get().o05((C1960k) msg.obj);
                    return;
                }
                return;
            }
            if (i2 == 4 && (weakReference = this.f8802k) != null && com.android.thememanager.util.gc3c.cdj(weakReference.get())) {
                Log.i("Theme", "Delay Exit");
                try {
                    this.f8802k.get().finish();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        private HandlerC1544g(LargeIconPickerActivity activity) {
            this.f8802k = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.LargeIconPickerActivity$k */
    class C1545k extends TransitionListener {
        C1545k() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            super.onComplete(toTag);
            LargeIconPickerActivity.this.n2t();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.LargeIconPickerActivity$n */
    class C1546n extends TransitionListener {
        C1546n() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            super.onComplete(toTag);
            LargeIconPickerActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.LargeIconPickerActivity$q */
    class C1547q implements C1900g.toq {
        C1547q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m6349q(C1960k c1960k) {
            if (c1960k == null || !c1960k.f11127q) {
                LargeIconPickerActivity.this.ixz(c1960k, 3);
            } else {
                LargeIconPickerActivity.this.f8786d = false;
                LargeIconPickerActivity.this.ixz(c1960k, 2);
            }
        }

        @Override // com.android.thememanager.controller.C1900g.toq
        /* JADX INFO: renamed from: k */
        public void mo6350k() {
            LargeIconPickerActivity.this.f8784b = false;
            LargeIconPickerActivity.this.f8786d = false;
            LargeIconPickerActivity.this.ixz(null, 1);
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void toq(C1960k largeIconInfo) {
            LargeIconPickerActivity.this.f8784b = false;
            if (largeIconInfo == null || !largeIconInfo.f11127q) {
                ThemeDatabase.wvg(bf2.toq.toq()).mo7698t().zy(LargeIconPickerActivity.this.f8783a).m4391p(LargeIconPickerActivity.this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.g1
                    @Override // androidx.lifecycle.jp0y
                    public final void toq(Object obj) {
                        this.f9053k.m6349q((C1960k) obj);
                    }
                });
            } else {
                LargeIconPickerActivity.this.f8786d = true;
                LargeIconPickerActivity.this.ixz(largeIconInfo, 2);
            }
        }
    }

    class toq implements C2821y.toq {
        toq() {
        }

        @Override // com.android.thememanager.util.C2821y.toq
        /* JADX INFO: renamed from: k */
        public void mo6352k() {
        }

        @Override // com.android.thememanager.util.C2821y.toq
        public void onDismiss() {
            LargeIconPickerActivity.this.f8793r.uv6().cdj(new C1723y<>(2));
        }
    }

    class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f8808k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f8809n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f8810q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f57272toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ boolean f57273zy;

        zy(final String val$tmpPackageName, final String val$tmpActivityName, final boolean val$tmpIsDualApp, final String val$tmpLauncherMode, final boolean val$tmpIsDefault) {
            this.f8808k = val$tmpPackageName;
            this.f57272toq = val$tmpActivityName;
            this.f57273zy = val$tmpIsDualApp;
            this.f8810q = val$tmpLauncherMode;
            this.f8809n = val$tmpIsDefault;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            super.onComplete(toTag);
            LargeIconPickerActivity.this.f8783a = this.f8808k;
            LargeIconPickerActivity.this.f8797x = this.f57272toq;
            LargeIconPickerActivity.this.f8794u = this.f57273zy;
            LargeIconPickerActivity.this.f8795v = this.f8810q;
            LargeIconPickerActivity.this.f57269bo = this.f8809n;
            LargeIconPickerActivity.this.n2t();
        }
    }

    private void b8(String packageName) {
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("app_package_name", packageName);
        arrayMap.put("content", "page");
        C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMap));
    }

    private void b9ub(View target, TransitionListener listener) {
        this.bp.m28167n(target);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bap7() {
        if (wx16()) {
            uc();
        }
    }

    private void cnbm() {
        C2940t.m10423n().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.ikck
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9100k.lw((Integer) obj);
            }
        });
        this.bp.m28166k().m4391p(this, this.bb);
        this.bp.m28166k().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.d
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f8978k.gcp((C7789s) obj);
            }
        });
    }

    private void ebn() {
        this.f57268ab.mo28171n(false);
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ga(C1723y c1723y) {
        Boolean bool = (Boolean) c1723y.m6720k();
        if (bool != null) {
            this.f8785c.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gcp(C7789s c7789s) {
        if (c7789s.m28177g() instanceof AbstractC7785k.toq) {
            if (c7789s.m28182y()) {
                jbh();
            } else {
                ebn();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h4b(View view) {
        if (!C1781k.toq(this)) {
            m6712j(null, true, new C1781k.f7l8() { // from class: com.android.thememanager.activity.qo
                @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
                public final void y9n(boolean z2) {
                    this.f9321k.pjz9(z2);
                }
            });
        } else if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            m6715x().m6909i(this, new C1781k.g() { // from class: com.android.thememanager.activity.tfm
                @Override // com.android.thememanager.basemodule.privacy.C1781k.g
                /* JADX INFO: renamed from: k */
                public final void mo6371k(boolean z2) {
                    this.f9339k.lh(z2);
                }
            });
        } else if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            com.android.thememanager.basemodule.privacy.x2.m6916q(this, new p000a.toq() { // from class: com.android.thememanager.activity.wo
                @Override // p000a.toq
                public final void onSuccess() {
                    this.f9367k.bap7();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ixz(C1960k info, int msg) {
        this.an.removeCallbacksAndMessages(null);
        if (msg != 2 && msg != 3) {
            this.an.sendEmptyMessageDelayed(msg, 300L);
            return;
        }
        Message messageObtainMessage = this.an.obtainMessage();
        messageObtainMessage.obj = info;
        messageObtainMessage.what = msg;
        this.an.sendMessageDelayed(messageObtainMessage, 300L);
    }

    private void jbh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lh(boolean z2) {
        if (z2 && wx16()) {
            uc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lw(Integer num) {
        this.bb.m28186q(true, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2t() {
        this.f8788f.setOnClickListener(this);
        this.f8785c.setOnClickListener(this);
        this.f8787e.setText(com.android.thememanager.basemodule.utils.a9.m6996n(this.f8783a, this.f8797x));
        this.f8793r.m8450c().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.mu
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9243k.ga((C1723y) obj);
            }
        });
        if (wx16()) {
            uc();
        }
    }

    private void nsb() {
        C7784g c7784g = new C7784g(this);
        this.bv = c7784g;
        c7784g.toq(getApplication());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o05(C1960k largeIconInfo) {
        String strM6996n = com.android.thememanager.basemodule.utils.a9.m6996n(this.f8783a, this.f8797x);
        if (strM6996n == null && largeIconInfo != null) {
            strM6996n = largeIconInfo.f58004zy;
        }
        Log.i("largeIcon", "notSupportPackage: " + this.f8783a);
        String str = String.format(getResources().getString(R.string.large_icon_not_support), strM6996n);
        if (this.f8791m == null) {
            this.f8791m = (TextView) findViewById(R.id.not_support_view);
        }
        this.f8791m.setVisibility(0);
        this.f8791m.setText(str);
        this.f8787e.setText(strM6996n);
        if (this.f8792o == null) {
            this.f8792o = new com.android.thememanager.view.dd(this, (ViewGroup) findViewById(R.id.container));
        }
        this.f8792o.f7l8(getResources().getString(R.string.large_icon_to_find_more));
        this.f8792o.m10339y(getResources().getDimension(R.dimen.large_icon_picker_page_purchase_button_text_size));
        this.f8792o.m10338s();
        this.f8792o.m10336g(new View.OnClickListener() { // from class: com.android.thememanager.activity.d8wk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8981k.vy(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean oki(C2821y c2821y) {
        c2821y.f1bi(new toq());
        return false;
    }

    private void pc() {
        this.bp = new yl.f7l8();
        if (C1807g.fu4()) {
            this.f57268ab = new C7788q();
        } else {
            this.f57268ab = new C7787p(this);
        }
        this.f57268ab.zy(this);
        this.bb = new yl.toq(bf2.toq.toq(), this.f57268ab, findViewById(R.id.container));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pjz9(boolean z2) {
        if (z2 && wx16()) {
            uc();
        }
    }

    private void uc() {
        if (this.f8784b) {
            return;
        }
        this.f8784b = true;
        this.f8796w.setVisibility(0);
        C1900g.zy().m7463s(false);
        C1900g.zy().m7464y(this, this.f8783a, this.f8797x, new C1547q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vy(View view) {
        startActivity(com.android.thememanager.toq.toq(this, "largeicons"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wlev(int i2) {
        if (i2 == 3 || i2 == 82) {
            ebn();
            this.bb.x2(0.0f);
        }
    }

    private boolean wx16() {
        if (C1781k.toq(this) && com.android.thememanager.basemodule.privacy.x2.zy() && !com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            ViewGroup viewGroup = this.az;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            return true;
        }
        if (this.az == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.reload_stub);
            com.android.thememanager.basemodule.views.ld6 ld6Var = new com.android.thememanager.basemodule.views.ld6();
            this.bg = ld6Var;
            ViewGroup viewGroupM7337k = ld6Var.m7337k(viewStub, 1);
            this.az = viewGroupM7337k;
            viewGroupM7337k.setBackgroundResource(android.R.color.transparent);
            ((TextView) this.az.findViewById(R.id.reload_info)).setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.no_data);
            View viewFindViewById = this.az.findViewById(R.id.local_entry);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        }
        this.az.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.qkj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9320k.h4b(view);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yl(C1960k largeIconInfo) {
        Log.i("largeIcon", "attachDetailFragment");
        com.android.thememanager.view.dd ddVar = this.f8792o;
        if (ddVar != null) {
            ddVar.m10337q();
        }
        TextView textView = this.f8791m;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (com.android.thememanager.util.gc3c.cdj(this)) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment fragmentNmn5 = supportFragmentManager.nmn5("picker");
            if (fragmentNmn5 == null) {
                androidx.fragment.app.o1t o1tVarKi = supportFragmentManager.ki();
                fragmentNmn5 = new yqrt();
                o1tVarKi.o1t(R.id.container, fragmentNmn5, "picker");
                o1tVarKi.n7h();
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("resource", null);
            bundle.putString("resource_code", "largeicons");
            bundle.putBoolean(com.android.thememanager.module.detail.view.y9n.f13386d, false);
            if (this.f8786d) {
                bundle.putString("packageName", this.f8783a + C5658n.f73185t8r + this.f8797x);
            } else {
                bundle.putString("packageName", this.f8783a);
            }
            if (largeIconInfo != null) {
                bundle.putString(am, largeIconInfo.f11128y);
            }
            bundle.putBoolean(be, this.f8794u);
            bundle.putBoolean(aj, this.f57269bo);
            fragmentNmn5.setArguments(bundle);
            this.f8785c.setVisibility(0);
        }
    }

    private void zwy() {
        C2774e c2774e = new C2774e(new com.android.thememanager.util.vyq() { // from class: com.android.thememanager.activity.fnq8
            @Override // com.android.thememanager.util.vyq
            /* JADX INFO: renamed from: k */
            public final void mo6409k(int i2) {
                this.f9048k.wlev(i2);
            }
        });
        this.in = c2774e;
        c2774e.m9705k(getApplicationContext());
    }

    @Override // com.android.thememanager.view.mcp
    public void eqxt() {
    }

    @Override // com.android.thememanager.view.mcp
    public void f7l8() {
        finish();
    }

    @Override // com.android.thememanager.view.mcp
    public void fu4(boolean isPageExit) {
    }

    @Override // com.android.thememanager.module.detail.util.InterfaceC2245k
    @zy.lvui
    /* JADX INFO: renamed from: h */
    public androidx.lifecycle.fti<C1723y<Integer>> mo6346h() {
        return this.f8793r.n5r1();
    }

    @Override // com.android.thememanager.module.detail.util.InterfaceC2245k
    public void ki(@zy.lvui String title) {
        this.f8793r.hyr().cdj(title);
    }

    @Override // yl.InterfaceC7786n
    /* JADX INFO: renamed from: l */
    public void mo6347l() {
        this.bp.m28167n(this.f8789j);
    }

    @Override // com.android.thememanager.view.mcp
    @InterfaceC7395n
    public int[] oc() {
        return new int[0];
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Fragment fragmentNmn5;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 111 && (fragmentNmn5 = getSupportFragmentManager().nmn5("picker")) != null && (fragmentNmn5 instanceof com.android.thememanager.module.detail.view.y9n)) {
            ((com.android.thememanager.module.detail.view.y9n) fragmentNmn5).onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            ukdy();
        } catch (Exception unused) {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() == R.id.cancel) {
            ukdy();
        } else if (v2.getId() == R.id.confirm) {
            this.f8793r.uv6().cdj(new C1723y<>(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!C1807g.m7077l()) {
            finish();
            Log.d("largeIcon", "not support,because miui version is low.");
        }
        m6711e(savedInstanceState);
        setContentView(R.layout.large_icon_pick_layout);
        this.f8789j = findViewById(R.id.dragLayer);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_bar);
        this.f8790l = viewGroup;
        this.f8788f = (ImageView) viewGroup.findViewById(R.id.cancel);
        this.f8785c = (ImageView) this.f8790l.findViewById(R.id.confirm);
        this.f8787e = (TextView) this.f8790l.findViewById(R.id.picker_title);
        this.f8796w = findViewById(R.id.process_bar);
        this.f8783a = getIntent().getStringExtra("packageName");
        this.f8797x = getIntent().getStringExtra(ay);
        this.f57269bo = getIntent().getBooleanExtra(aj, false);
        this.f8795v = getIntent().getStringExtra(bs);
        this.f8794u = getIntent().getBooleanExtra(be, false);
        Log.d("largeIcon", "onCreate: packageName = " + this.f8783a + ",activityName = " + this.f8797x + ",isDefault = " + this.f57269bo + ",launcherMode = " + this.f8795v + ",isDualApp = " + this.f8794u);
        C2309k c2309k = (C2309k) new C0924e(this).m4420k(C2309k.class);
        this.f8793r = c2309k;
        final C2821y c2821yBqie = C2821y.bqie(this, c2309k.n5r1(), this.f8793r.hyr(), this.f8793r.m8451f());
        pc();
        cnbm();
        nsb();
        zwy();
        b8(this.f8783a);
        this.id = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C1545k c1545k = null;
        this.bl = new f7l8(this, c1545k);
        this.an = new HandlerC1544g(this, c1545k);
        com.android.thememanager.settings.personalize.task.zy.f15309k.zy(this);
        this.bp.m28168q(this.f8789j, new C1545k());
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.android.thememanager.activity.vq
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return this.f9360k.oki(c2821yBqie);
            }
        });
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        try {
            this.bv.zy(getApplicationContext());
            this.an.removeCallbacksAndMessages(null);
            this.in.toq(getApplicationContext());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra(ay);
        boolean booleanExtra = intent.getBooleanExtra(be, false);
        boolean booleanExtra2 = getIntent().getBooleanExtra(aj, false);
        String stringExtra3 = getIntent().getStringExtra(bs);
        Log.d("largeIcon", "onNewIntent: " + stringExtra + "," + stringExtra2 + "," + stringExtra3 + "," + booleanExtra2 + "," + booleanExtra);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentNmn5 = supportFragmentManager.nmn5("picker");
        if (fragmentNmn5 != null) {
            supportFragmentManager.ki().fu4(fragmentNmn5).n7h();
        }
        C2821y c2821yBqie = C2821y.bqie(this, this.f8793r.n5r1(), this.f8793r.hyr(), this.f8793r.m8451f());
        if (c2821yBqie.u38j() != null && c2821yBqie.u38j().isShowing()) {
            c2821yBqie.kx3();
        }
        TextView textView = this.f8787e;
        if (textView != null) {
            textView.setText("");
        }
        com.android.thememanager.view.dd ddVar = this.f8792o;
        if (ddVar != null) {
            ddVar.toq();
            this.f8792o = null;
        }
        TextView textView2 = this.f8791m;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        this.bp.m28168q(this.f8789j, new zy(stringExtra, stringExtra2, booleanExtra, stringExtra3, booleanExtra2));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        try {
            if (this.as) {
                unregisterReceiver(this.bl);
            }
            this.as = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if (C1915g.m7550n() || this.as) {
                return;
            }
            registerReceiver(this.bl, this.id);
            this.as = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.android.thememanager.view.mcp
    public void qrj() {
    }

    protected void ukdy() {
        getWindow().addFlags(134217728);
        this.an.sendEmptyMessageDelayed(4, 1000L);
        b9ub(this.f8789j, new C1546n());
    }

    @Override // com.android.thememanager.module.detail.util.InterfaceC2245k
    /* JADX INFO: renamed from: y */
    public void mo6348y() {
        this.f8793r.m8451f().cdj(new C1723y<>(Boolean.TRUE));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected void y2(int newMode) {
        super.y2(newMode);
        if (wx16()) {
            uc();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        if (wx16()) {
            uc();
        }
    }
}
