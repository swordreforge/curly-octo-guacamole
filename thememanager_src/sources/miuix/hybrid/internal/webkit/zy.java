package miuix.hybrid.internal.webkit;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import miuix.appcompat.app.dd;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: compiled from: DefaultDeviceAccountLogin.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends C7143q implements Handler.Callback {

    /* JADX INFO: renamed from: h */
    private static final String f40323h = "dialog";

    /* JADX INFO: renamed from: i */
    private static final int f40324i = 0;

    /* JADX INFO: renamed from: t */
    private static final int f40325t = 500;

    /* JADX INFO: renamed from: z */
    private static final int f40326z = 1;

    /* JADX INFO: renamed from: p */
    private C7146k f40327p;

    /* JADX INFO: renamed from: s */
    private final Handler f40328s;

    /* JADX INFO: renamed from: y */
    private final miuix.hybrid.internal.provider.zy f40329y;

    /* JADX INFO: renamed from: miuix.hybrid.internal.webkit.zy$k */
    /* JADX INFO: compiled from: DefaultDeviceAccountLogin.java */
    public static class C7146k extends androidx.fragment.app.zy {
        @Override // androidx.fragment.app.zy
        @lvui
        public Dialog nnh(Bundle savedInstanceState) {
            dd ddVar = new dd(getActivity());
            ddVar.n5r1(getString(R.string.resource_account_login));
            ddVar.m24877x(true);
            ddVar.setCancelable(false);
            return ddVar;
        }
    }

    public zy(Activity activity, miuix.hybrid.internal.provider.zy webView) {
        super(activity);
        this.f40329y = webView;
        this.f40328s = new Handler(Looper.getMainLooper(), this);
    }

    private void f7l8() {
        this.f40328s.removeMessages(0);
        C7146k c7146k = this.f40327p;
        if (c7146k != null && c7146k.isAdded()) {
            this.f40327p.mo4377w();
        }
        this.f40327p = null;
    }

    /* JADX INFO: renamed from: y */
    private void m25899y() {
        f7l8();
        C7146k c7146k = new C7146k();
        this.f40327p = c7146k;
        Activity activity = this.f40316k;
        if (!(activity instanceof ActivityC0891q)) {
            C7794k.f7l8("activity not AppCompat.");
        } else {
            try {
                c7146k.cyoe(((ActivityC0891q) activity).getSupportFragmentManager(), f40323h);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // miuix.hybrid.internal.webkit.C7143q
    /* JADX INFO: renamed from: g */
    public void mo25883g(String url) {
        this.f40329y.cdj(url);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        int i2 = msg.what;
        if (i2 == 0) {
            m25899y();
        } else if (i2 == 1) {
            f7l8();
            this.f40329y.mo25854i(0);
        }
        return true;
    }

    @Override // miuix.hybrid.internal.webkit.C7143q
    /* JADX INFO: renamed from: n */
    public void mo25885n() {
        this.f40328s.sendEmptyMessageDelayed(0, 500L);
    }

    @Override // miuix.hybrid.internal.webkit.C7143q
    /* JADX INFO: renamed from: q */
    public void mo25886q() {
        this.f40328s.sendEmptyMessageDelayed(1, 500L);
    }

    @Override // miuix.hybrid.internal.webkit.C7143q
    public void toq() {
        f7l8();
        this.f40329y.mo25854i(0);
    }

    @Override // miuix.hybrid.internal.webkit.C7143q
    public void zy() {
        f7l8();
        this.f40329y.mo25854i(0);
        C7794k.m28196p(f40323h, "sso login fail.");
    }
}
