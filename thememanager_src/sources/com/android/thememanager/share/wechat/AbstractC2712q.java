package com.android.thememanager.share.wechat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.share.C2705n;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.InterfaceC2707q;
import com.android.thememanager.share.delegate.AbstractC2694g;
import com.android.thememanager.share.ld6;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.thememanager.share.wechat.q */
/* JADX INFO: compiled from: WechatShareDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2712q extends AbstractC2694g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static toq f61131f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static final String f16066g = "com.tencent.mm.ui.tools.AddFavoriteUI";

    /* JADX INFO: renamed from: n */
    private static final String f16067n = "com.tencent.mm.ui.tools.ShareToTimeLineUI";

    /* JADX INFO: renamed from: q */
    private static final String f16068q = "com.tencent.mm.ui.tools.ShareImgUI";

    /* JADX INFO: renamed from: y */
    private static WeakReference<AbstractC2712q> f16069y;

    public AbstractC2712q(Bundle shareConfiguration, int type) {
        super(type, shareConfiguration);
    }

    /* JADX INFO: renamed from: h */
    private boolean m9468h(Intent result) {
        toq toqVar = f61131f7l8;
        return toqVar != null && toqVar.x2(result);
    }

    public static boolean kja0(Intent result) {
        WeakReference<AbstractC2712q> weakReference = f16069y;
        return (weakReference == null || weakReference.get() == null || !f16069y.get().m9468h(result)) ? false : true;
    }

    public static void ld6() {
        if (f61131f7l8 != null) {
            f61131f7l8 = null;
        }
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public CharSequence f7l8() {
        boolean z2 = true;
        if (C2706p.zy(this.f61061toq) != 1 && C2706p.zy(this.f61061toq) != 3) {
            z2 = false;
        }
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return z2 ? qVar.getResources().getString(R.string.miuishare_wechat_timeline_title) : qVar.getResources().getString(R.string.share_send_to_friend);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: k */
    public void mo9429k() {
        toq toqVar = f61131f7l8;
        if (toqVar != null) {
            toqVar.m9473n();
        }
        f61131f7l8 = null;
    }

    protected void n7h(InterfaceC2707q callback) {
        toq toqVarQrj = qrj();
        if (toqVarQrj == null || !toqVarQrj.m9474p()) {
            callback.mo9416k();
            Log.w("WechatShareDelegate", "isWechatAPIAvailable: WechatAPI没准备好或者微信分享SDK出了问题");
        }
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: p */
    public void mo9431p(Intent shareIntent, InterfaceC2707q callback) {
        n7h(callback);
        boolean z2 = true;
        if (C2706p.zy(this.f61061toq) != 1 && C2706p.zy(this.f61061toq) != 3) {
            z2 = false;
        }
        f16069y = new WeakReference<>(this);
        qrj().qrj(toq(), ld6.m9447h(shareIntent), z2);
        callback.mo9416k();
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: q */
    protected String mo9432q() {
        return "com.tencent.mm";
    }

    protected toq qrj() {
        if (f61131f7l8 == null) {
            Bundle bundle = this.f61062zy;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(C2705n.f61101zy);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            f61131f7l8 = new toq(toq(), string);
        }
        return f61131f7l8;
    }

    public toq x2() {
        return f61131f7l8;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: y */
    public boolean mo9434y(Intent shareIntent) {
        toq toqVarQrj = qrj();
        return toqVarQrj != null && toqVarQrj.m9475s();
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public Drawable zy(Intent shareIntent) {
        Intent intent = (Intent) shareIntent.clone();
        intent.setType("image/*");
        boolean z2 = true;
        if (C2706p.zy(this.f61061toq) != 1 && C2706p.zy(this.f61061toq) != 3) {
            z2 = false;
        }
        if (!z2) {
            return super.zy(intent);
        }
        Activity qVar = toq();
        return qVar == null ? super.zy(intent) : ld6.m9455y(intent, mo9432q(), f16067n, qVar);
    }
}
