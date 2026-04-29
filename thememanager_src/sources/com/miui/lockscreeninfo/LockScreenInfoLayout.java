package com.miui.lockscreeninfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Color;
import android.os.Handler;
import android.os.UserHandle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.miui.lockscreeninfo.C5117k;
import com.miui.lockscreeninfo.model.MagazineA;
import com.miui.lockscreeninfo.model.MagazineB;
import com.miui.lockscreeninfo.model.ModelFactory;
import com.miui.lockscreeninfo.model.SignatureInfo;
import gcp.C6062n;
import java.util.Map;
import o05.C7419k;
import o05.C7420n;
import o05.C7421q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LockScreenInfoLayout extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    private final ContentObserver f29404c;

    /* JADX INFO: renamed from: f */
    private Map<String, Integer> f29405f;

    /* JADX INFO: renamed from: g */
    private SignatureInfo f29406g;

    /* JADX INFO: renamed from: h */
    private UserHandle f29407h;

    /* JADX INFO: renamed from: i */
    private BroadcastReceiver f29408i;

    /* JADX INFO: renamed from: k */
    private BaseTextView f29409k;

    /* JADX INFO: renamed from: l */
    private boolean f29410l;

    /* JADX INFO: renamed from: n */
    private BaseTextView f29411n;

    /* JADX INFO: renamed from: p */
    private int f29412p;

    /* JADX INFO: renamed from: q */
    private SignatureView f29413q;

    /* JADX INFO: renamed from: r */
    private boolean f29414r;

    /* JADX INFO: renamed from: s */
    private final Handler f29415s;

    /* JADX INFO: renamed from: t */
    private boolean f29416t;

    /* JADX INFO: renamed from: y */
    private Context f29417y;

    /* JADX INFO: renamed from: z */
    private ContentObserver f29418z;

    /* JADX INFO: renamed from: com.miui.lockscreeninfo.LockScreenInfoLayout$k */
    class C5116k extends BroadcastReceiver {
        C5116k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && com.miui.clock.zy.f29318a.equals(intent.getAction())) {
                LockScreenInfoLayout.this.f29412p = intent.getIntExtra(com.miui.clock.zy.f72058zp, 0);
                Log.i("LockScreenInfoLayout", "onReceive User Switch Broadcast mCurrentUserId = " + LockScreenInfoLayout.this.f29412p);
                LockScreenInfoLayout.this.t8r();
            }
        }
    }

    class toq extends ContentObserver {
        toq(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            Log.i("LockScreenInfoLayout", "parentView is " + LockScreenInfoLayout.this.getParent());
            LockScreenInfoLayout.this.t8r();
        }
    }

    class zy extends ContentObserver {
        zy(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            LockScreenInfoLayout lockScreenInfoLayout = LockScreenInfoLayout.this;
            lockScreenInfoLayout.f29416t = Settings.System.getInt(lockScreenInfoLayout.f29417y.getContentResolver(), "power_supersave_mode_open", 0) != 0;
            Log.i("LockScreenInfoLayout", "isSurperSaveOpen on change " + LockScreenInfoLayout.this.f29416t);
            if (LockScreenInfoLayout.this.f29409k == null || LockScreenInfoLayout.this.f29406g == null) {
                return;
            }
            LockScreenInfoLayout.this.f29409k.setSuperSaveOpen(LockScreenInfoLayout.this.f29416t);
            LockScreenInfoLayout.this.f29409k.mo17806s(LockScreenInfoLayout.this.f29406g);
        }
    }

    public LockScreenInfoLayout(Context context) {
        this(context, null);
    }

    public LockScreenInfoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LockScreenInfoLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Handler handler = new Handler();
        this.f29415s = handler;
        this.f29416t = false;
        this.f29414r = false;
        this.f29410l = false;
        this.f29404c = new toq(handler);
        f7l8(context);
    }

    private void cdj() {
        this.f29412p = C7419k.m26815k();
    }

    private void f7l8(Context context) {
        this.f29417y = context;
        this.f29413q = new SignatureView(context);
        this.f29411n = new BaseTextView(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        SignatureView signatureView = this.f29413q;
        this.f29409k = signatureView;
        addView(signatureView);
        if (ld6()) {
            cdj();
        }
        this.f29416t = Settings.System.getInt(this.f29417y.getContentResolver(), "power_supersave_mode_open", 0) != 0;
    }

    /* JADX INFO: renamed from: g */
    private void m17808g() {
        this.f29406g = null;
        this.f29409k.setText("");
    }

    private boolean getBackgroundBlurEnabled() {
        return (ld6() ? C7421q.m26817k(this.f29417y.getContentResolver(), C6062n.f77039x2, 0, this.f29412p) : Settings.Secure.getInt(this.f29417y.getContentResolver(), C6062n.f77039x2, 0)) == 1;
    }

    private boolean getHighTextContrastEnabled() {
        return (ld6() ? C7421q.m26817k(this.f29417y.getContentResolver(), C6062n.f35041g, 0, this.f29412p) : Settings.Secure.getInt(this.f29417y.getContentResolver(), C6062n.f35041g, 0)) == 1;
    }

    private String getJson() {
        if (!ld6()) {
            return Settings.Secure.getString(this.f29417y.getContentResolver(), "constant_lockscreen_info");
        }
        String qVar = C7421q.toq(this.f29417y.getContentResolver(), "constant_lockscreen_info", this.f29412p);
        Log.i("LockScreenInfoLayout", "getStringForUser, mCurrentUserId = " + this.f29412p);
        return qVar;
    }

    /* JADX INFO: renamed from: k */
    private int m17810k(int i2) {
        return Math.round(r0.getResources().getDimensionPixelSize(i2) * C5118q.m17821k(this.f29417y.getApplicationContext() == null ? this.f29417y : this.f29417y.getApplicationContext()));
    }

    private void kja0() {
        if (this.f29418z != null) {
            this.f29417y.getContentResolver().unregisterContentObserver(this.f29418z);
        }
    }

    private boolean ld6() {
        return "com.android.systemui".equals(this.f29417y.getPackageName());
    }

    /* JADX INFO: renamed from: n */
    private RelativeLayout.LayoutParams m17811n(MagazineB magazineB) {
        setGravity(1);
        setPadding(0, m17810k(C5118q.m17820i(this.f29417y) ? C5117k.k.f72112ld6 : C5117k.k.f29433p), 0, 0);
        this.f29409k.setPadding(0, 0, 0, 0);
        return new RelativeLayout.LayoutParams(m17810k(C5117k.k.f72115t8r), m17810k(C5117k.k.f72118zy));
    }

    /* JADX INFO: renamed from: q */
    private RelativeLayout.LayoutParams m17813q(MagazineA magazineA) {
        if (!magazineA.isVerticalMode()) {
            setPadding(0, m17810k(C5117k.k.f29435s), 0, 0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m17810k(C5117k.k.f72110ki), m17810k(C5117k.k.f72116toq));
            this.f29409k.setPadding(m17810k(C5117k.k.f29432n), 0, m17810k(C5117k.k.f72109f7l8), 0);
            return layoutParams;
        }
        int i2 = C5117k.k.f29429g;
        int iM17810k = m17810k(i2);
        setPadding(0, m17810k(C5117k.k.f29436y) - iM17810k, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m17810k(C5117k.k.f72108cdj), m17810k(C5117k.k.f72116toq) + iM17810k);
        if (magazineA.getAlignment() == 101) {
            this.f29409k.setPadding(m17810k(i2), iM17810k, 0, 0);
            return layoutParams2;
        }
        if (magazineA.getAlignment() != 102) {
            return layoutParams2;
        }
        this.f29409k.setPadding(0, iM17810k, m17810k(i2), 0);
        return layoutParams2;
    }

    private void setModelFromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("signatureInfo"));
        String string = jSONObject.getString("templateId");
        String string2 = jSONObject.getString("content");
        int i2 = jSONObject.getInt("primaryColor");
        int i3 = jSONObject.getInt("alignment");
        boolean z2 = jSONObject.getBoolean("isAutoPrimaryColor");
        SignatureInfo signatureInfoCreateModel = ModelFactory.createModel(string);
        signatureInfoCreateModel.setContent(string2);
        signatureInfoCreateModel.setAlignment(i3);
        signatureInfoCreateModel.setPrimaryColor(i2);
        signatureInfoCreateModel.setAutoPrimaryColor(z2);
        setModel(signatureInfoCreateModel);
        Log.i("LockScreenInfoLayout", "setModelFromJson: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r() {
        try {
            String json = getJson();
            if (TextUtils.isEmpty(json)) {
                m17808g();
                Log.e("LockScreenInfoLayout", "ContentObserver fail, constant_lockscreen_info value is Empty");
            } else {
                setModelFromJson(json);
            }
        } catch (Exception e2) {
            m17808g();
            Log.e("LockScreenInfoLayout", "ContentObserver fail, msg = " + e2);
        }
    }

    private void x2() {
        if (this.f29418z == null) {
            this.f29418z = new zy(new Handler());
        }
        this.f29417y.getContentResolver().registerContentObserver(Settings.System.getUriFor("power_supersave_mode_open"), false, this.f29418z);
        this.f29418z.onChange(false);
    }

    @Keep
    public void buildFromSetting() {
        this.f29410l = true;
        registerModelListener();
        t8r();
    }

    public SignatureInfo getModel() {
        return this.f29406g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ld6()) {
            cdj();
        }
        this.f29416t = Settings.System.getInt(this.f29417y.getContentResolver(), "power_supersave_mode_open", 0) != 0;
        x2();
        if (this.f29410l) {
            registerModelListener();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f29406g != null) {
            Log.i("LockScreenInfoLayout", "onConfigurationChanged");
            setModel(this.f29406g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kja0();
        if (this.f29410l) {
            unregisterModelListener();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        Map<String, Integer> map;
        super.onWindowFocusChanged(z2);
        if (!z2 || (map = this.f29405f) == null) {
            return;
        }
        setClockPalette(this.f29414r, map);
    }

    @Keep
    public void registerModelListener() {
        m17815y(ld6());
    }

    @Keep
    public void setClockPalette(boolean z2, Map<String, Integer> map) {
        this.f29414r = z2;
        this.f29405f = map;
        SignatureInfo signatureInfo = this.f29406g;
        if (signatureInfo == null) {
            Log.e("LockScreenInfoLayout", "mModel is " + this.f29406g);
            return;
        }
        if (!signatureInfo.isAutoPrimaryColor() || getHighTextContrastEnabled()) {
            Log.e("LockScreenInfoLayout", "isAutoPrimaryColor =" + this.f29406g.isAutoPrimaryColor() + " getHighTextContrastEnabled = " + getHighTextContrastEnabled());
            C5118q.toq(this.f29409k);
            C5118q.m17823p(this.f29409k);
            this.f29409k.setTextColor(this.f29406g.getPrimaryColor());
            return;
        }
        boolean z3 = C5118q.f29439n;
        if (z3 && getBackgroundBlurEnabled() && C5118q.m17822n()) {
            this.f29406g.setPrimaryColor(-1);
            int primaryColor = z2 ? (map == null || map.get("neutral-variant30") == null) ? this.f29406g.getPrimaryColor() : map.get("neutral-variant30").intValue() : Color.parseColor("#FFABABAB");
            int iIntValue = z2 ? (map == null || map.get("secondary70") == null) ? primaryColor : map.get("secondary70").intValue() : Color.parseColor("#FFBEBEBE");
            this.f29406g.setBlendColor(primaryColor);
            this.f29406g.setAodBlendColor(iIntValue);
            this.f29406g.setTextDark(z2);
            this.f29409k.setTextColor(this.f29406g.getPrimaryColor());
            C5118q.m17826y(this.f29409k, m17810k(C5117k.k.f29431k));
            C5118q.zy(this.f29409k, z2, this.f29406g.getBlendColor(), this.f29406g.getPrimaryColor());
        } else {
            C5118q.toq(this.f29409k);
            C5118q.m17823p(this.f29409k);
            this.f29406g.setPrimaryColor(z2 ? (map == null || map.get("secondary20") == null) ? this.f29406g.getPrimaryColor() : map.get("secondary20").intValue() : -1);
            this.f29409k.setTextColor(this.f29406g.getPrimaryColor());
        }
        Log.i("LockScreenInfoLayout", "setClockPalette: blendColor = " + String.format("#%08X", Integer.valueOf(this.f29406g.getBlendColor())) + ",aodBlendColor = " + String.format("#%08X", Integer.valueOf(this.f29406g.getAodBlendColor())) + ",textDark = " + z2 + ",PrimaryColor = " + String.format("#%08X", Integer.valueOf(this.f29406g.getPrimaryColor())) + ",Properties = " + z3 + ",Settings = " + getBackgroundBlurEnabled() + ",DeviceBlurEnabled= " + C5118q.m17822n());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setModel(com.miui.lockscreeninfo.model.SignatureInfo r3) {
        /*
            r2 = this;
            if (r3 != 0) goto Ld
            r2.m17808g()
            java.lang.String r3 = "LockScreenInfoLayout"
            java.lang.String r0 = "SignatureInfo is null"
            android.util.Log.e(r3, r0)
            return
        Ld:
            r2.f29406g = r3
            int r0 = r3.getAlignment()
            switch(r0) {
                case 101: goto L1b;
                case 102: goto L19;
                case 103: goto L1b;
                case 104: goto L17;
                case 105: goto L19;
                case 106: goto L17;
                default: goto L16;
            }
        L16:
            goto L1f
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = 5
            goto L1c
        L1b:
            r0 = 3
        L1c:
            r2.setGravity(r0)
        L1f:
            boolean r0 = r3 instanceof com.miui.lockscreeninfo.model.MagazineA
            if (r0 == 0) goto L3d
            com.miui.lockscreeninfo.BaseTextView r0 = r2.f29409k
            r2.removeView(r0)
            com.miui.lockscreeninfo.SignatureView r0 = r2.f29413q
            r2.f29409k = r0
            r0 = r3
            com.miui.lockscreeninfo.model.MagazineA r0 = (com.miui.lockscreeninfo.model.MagazineA) r0
            android.widget.RelativeLayout$LayoutParams r0 = r2.m17813q(r0)
            com.miui.lockscreeninfo.BaseTextView r1 = r2.f29409k
            r1.setLayoutParams(r0)
            com.miui.lockscreeninfo.BaseTextView r0 = r2.f29409k
            r2.addView(r0)
        L3d:
            boolean r0 = r3 instanceof com.miui.lockscreeninfo.model.MagazineB
            if (r0 == 0) goto L59
            com.miui.lockscreeninfo.BaseTextView r0 = r2.f29409k
            r2.removeView(r0)
            com.miui.lockscreeninfo.BaseTextView r0 = r2.f29411n
            r2.f29409k = r0
            r2.addView(r0)
            r0 = r3
            com.miui.lockscreeninfo.model.MagazineB r0 = (com.miui.lockscreeninfo.model.MagazineB) r0
            android.widget.RelativeLayout$LayoutParams r0 = r2.m17811n(r0)
            com.miui.lockscreeninfo.BaseTextView r1 = r2.f29409k
            r1.setLayoutParams(r0)
        L59:
            com.miui.lockscreeninfo.BaseTextView r0 = r2.f29409k
            boolean r1 = r2.f29416t
            r0.setSuperSaveOpen(r1)
            boolean r0 = r2.f29414r
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f29405f
            r2.setClockPalette(r0, r1)
            com.miui.lockscreeninfo.BaseTextView r0 = r2.f29409k
            r0.mo17806s(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.lockscreeninfo.LockScreenInfoLayout.setModel(com.miui.lockscreeninfo.model.SignatureInfo):void");
    }

    @Keep
    public void unregisterModelListener() {
        this.f29417y.getContentResolver().unregisterContentObserver(this.f29404c);
        BroadcastReceiver broadcastReceiver = this.f29408i;
        if (broadcastReceiver != null) {
            this.f29417y.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m17815y(boolean z2) {
        Log.i("LockScreenInfoLayout", "registerClockBeanListener isSystemUI = " + z2);
        if (!z2) {
            this.f29417y.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("constant_lockscreen_info"), false, this.f29404c);
            return;
        }
        this.f29408i = new C5116k();
        cdj();
        UserHandle userHandleM26816k = C7420n.m26816k(-1);
        this.f29407h = userHandleM26816k;
        o05.zy.m26819k(this.f29417y, this.f29408i, userHandleM26816k, new IntentFilter(com.miui.clock.zy.f29318a), null, null);
        o05.toq.m26818k(this.f29417y.getContentResolver(), Settings.Secure.getUriFor("constant_lockscreen_info"), false, this.f29404c, this.f29407h);
    }
}
