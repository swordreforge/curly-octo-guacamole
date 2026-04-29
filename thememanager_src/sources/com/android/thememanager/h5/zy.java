package com.android.thememanager.h5;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1790g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a98o;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.fu4;
import com.android.thememanager.h5.C2069n;
import com.android.thememanager.h5.webcache.C2072k;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.share.C2703k;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.nmn5;
import com.android.thememanager.util.py;
import com.android.thememanager.v9.data.LoginLoader;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import miui.app.constants.ThemeManagerConstants;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.dd;
import miuix.appcompat.app.t8r;
import miuix.hybrid.C7123i;
import miuix.hybrid.HybridView;
import miuix.hybrid.cdj;
import miuix.hybrid.ki;
import miuix.hybrid.kja0;
import miuix.hybrid.wvg;
import p001b.InterfaceC1357q;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: compiled from: ThemeHybridFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends kja0 implements InterfaceC1357q, InterfaceC1925p, ThemeManagerConstants, C2069n.k, LoginLoader.InterfaceC2849k {
    private static final String ac = "http";
    private static final String ad = "https";
    public static final SparseArray<WeakReference<zy>> aj = new SparseArray<>();
    private static final String am = "file";
    protected static final long as = 2;
    protected static final long ax = 32;
    public static final String ay = "isSupportShare";
    protected static final long az = 8;
    protected static final long ba = 16;
    public static final String be = "isMultiple";
    protected static final long bg = 4;
    protected static final long bl = 1;
    private static final String bq = "errorLocalEntry";

    /* JADX INFO: renamed from: a */
    private String f12271a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f60322ab;

    /* JADX INFO: renamed from: b */
    private com.android.thememanager.basemodule.views.ld6 f12272b;
    private dd bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private qrj f60323bo;
    private LoginLoader bp;
    private long bv;

    /* JADX INFO: renamed from: c */
    private HybridView f12273c;

    /* JADX INFO: renamed from: d */
    private boolean f12274d;

    /* JADX INFO: renamed from: e */
    private ViewGroup f12275e;

    /* JADX INFO: renamed from: f */
    private PageGroup f12276f;

    /* JADX INFO: renamed from: j */
    private Button f12277j;

    /* JADX INFO: renamed from: l */
    private Uri f12278l;

    /* JADX INFO: renamed from: m */
    private View f12279m;

    /* JADX INFO: renamed from: o */
    private Handler f12280o;

    /* JADX INFO: renamed from: r */
    private String f12281r;

    /* JADX INFO: renamed from: u */
    private volatile C1790g f12282u;

    /* JADX INFO: renamed from: v */
    private boolean f12283v;

    /* JADX INFO: renamed from: w */
    private com.android.thememanager.h5.jsinterface.zy f12284w;

    /* JADX INFO: renamed from: x */
    private boolean f12285x;
    private com.android.thememanager.share.toq an = new C2075k();
    private View.OnClickListener id = new toq();
    private final jp0y<Intent> in = new C7923zy();

    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class f7l8 implements View.OnClickListener {
        f7l8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            fu4 fu4VarA98o = ch.a98o(zy.this.getActivity());
            if (fu4VarA98o == null || !TextUtils.equals(zy.this.f12271a, fu4VarA98o.getResourceCode())) {
                fu4VarA98o = C2082k.zy().m8001n().m10535g(zy.this.f12271a);
            }
            zy.this.getActivity().startActivityForResult(RecommendItemResolver.getForwardLocalIntent(fu4VarA98o), 1);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$g */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class ViewOnClickListenerC2074g implements View.OnClickListener {
        ViewOnClickListenerC2074g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            zy.this.kt06();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!C1781k.toq(zy.this.getContext())) {
                zy.this.ew(true);
                return;
            }
            boolean zF7l8 = com.android.thememanager.basemodule.privacy.x2.f7l8();
            zy.this.d1ts(zF7l8);
            if (zF7l8) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(zy.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.h5.q
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f12245k.toq();
                    }
                });
            } else if (zy.this.f12273c.getUrl() == null) {
                zy.this.kt06();
            } else {
                zy.this.uo();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$k */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class C2075k implements com.android.thememanager.share.toq {
        C2075k() {
        }

        @Override // com.android.thememanager.share.toq
        /* JADX INFO: renamed from: k */
        public void mo7981k(int flag, int result) {
            if (result == 0) {
                String queryParameter = zy.this.f12278l.getQueryParameter("activity-id");
                zy zyVar = zy.this;
                zyVar.mub(queryParameter, zyVar);
            }
        }
    }

    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    protected class ld6 extends C7123i {
        protected ld6() {
        }

        @Override // miuix.hybrid.C7123i
        public cdj f7l8(HybridView view, String url) {
            if (url != null) {
                try {
                    if (url.startsWith("http") || url.startsWith("https")) {
                        cdj qVar = C2072k.toq(url);
                        if (qVar != null) {
                            return qVar;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return super.f7l8(view, url);
        }

        @Override // miuix.hybrid.C7123i
        /* JADX INFO: renamed from: k */
        public void mo7982k(HybridView view, String url) {
            super.mo7982k(view, url);
            if (TextUtils.isEmpty(zy.this.f60322ab)) {
                return;
            }
            if (!(zy.this.getActivity() instanceof t8r)) {
                C7794k.f7l8("activity not AppCompatActivity");
                return;
            }
            AbstractC6946k appCompatActionBar = ((t8r) zy.this.getActivity()).getAppCompatActionBar();
            if (appCompatActionBar != null) {
                appCompatActionBar.mo173v(zy.this.f60322ab);
            }
            o1t.wvg(appCompatActionBar, 0);
        }

        @Override // miuix.hybrid.C7123i
        /* JADX INFO: renamed from: n */
        public void mo7983n(HybridView view, wvg handler, SslError error) {
            if (handler != null) {
                return;
            }
            int primaryError = error.getPrimaryError();
            if (primaryError == 0 || primaryError == 1 || primaryError == 2 || primaryError == 3 || primaryError == 4 || primaryError == 5) {
                handler.mo25872k();
            }
            handler.toq();
        }

        @Override // miuix.hybrid.C7123i
        public void toq(HybridView view, String url, Bitmap favicon) {
            zy.this.f12285x = false;
            super.toq(view, url, favicon);
            if (zy.this.f12284w != null) {
                zy.this.f12284w.m7958p();
            }
        }

        @Override // miuix.hybrid.C7123i
        /* JADX INFO: renamed from: y */
        public boolean mo7984y(HybridView view, String url) {
            if (zy.this.i3x9()) {
                return false;
            }
            return super.mo7984y(view, url) || zy.this.wwp(url);
        }

        @Override // miuix.hybrid.C7123i
        public void zy(HybridView view, int errorCode, String description, String failingUrl) {
            zy.this.f12285x = true;
            zy.this.zuf();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$n */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class RunnableC2076n implements Runnable {
        RunnableC2076n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zy.this.ab();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$p */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    protected class C2077p implements DownloadListener {
        protected C2077p() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
            Uri uri = Uri.parse(url);
            if (!mcp.m7140q(uri)) {
                Log.d("webView download", "onDownloadStart: uri is not mi host");
            } else {
                zy.this.startActivity(new Intent("android.intent.action.VIEW", uri));
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$q */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class RunnableC2078q implements Runnable {
        RunnableC2078q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zy.this.sc();
        }
    }

    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    public interface qrj {
        void onPause();

        void onResume();

        void onVisible();
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$s */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    protected class C2079s extends miuix.hybrid.qrj {
        protected C2079s() {
        }

        @Override // miuix.hybrid.qrj
        public void ki(HybridView view, int progress) {
            if (progress > 80 && !zy.this.f12285x) {
                zy.this.ab();
                zy.this.f12279m.setVisibility(8);
            }
            super.ki(view, progress);
        }
    }

    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - zy.this.bv > 1000) {
                zy.this.bv = jCurrentTimeMillis;
                C2703k.m9441g(zy.this.an);
                zy.this.f12273c.x2("javascript:themeNativeToWeb.share()");
            }
        }
    }

    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    private static class x2 extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: k */
        private WeakReference<zy> f12294k;

        public x2(zy fragment) {
            this.f12294k = new WeakReference<>(fragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... id) {
            try {
                C1915g.f7l8(com.android.thememanager.controller.online.ld6.m7574p(id[0]));
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            zy zyVar = this.f12294k.get();
            if (zyVar != null) {
                zyVar.b7();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            zy zyVar = this.f12294k.get();
            if (zyVar != null) {
                zyVar.c25();
                zyVar.kz28(zyVar.f12278l);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$y */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class C2080y implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C1688q f12295k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Uri f60325toq;

        C2080y(final C1688q val$login, final Uri val$urlAfterLogin) {
            this.f12295k = val$login;
            this.f60325toq = val$urlAfterLogin;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            ActivityC0891q activity = zy.this.getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                ch.yz(activity);
            } else {
                nn86.m7150k(R.string.fail_to_add_account, 0);
            }
            Uri uriHyow = zy.this.hyow();
            Uri uri = this.f60325toq;
            if (!(uri == null && uriHyow == null) && (uri == null || !uri.equals(uriHyow))) {
                return;
            }
            activity.finish();
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            ActivityC0891q activity = zy.this.getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            if (this.f12295k.x2() == null) {
                zy.this.le7();
            } else {
                com.android.thememanager.controller.online.fu4.m7547q();
                zy.this.kz28(this.f60325toq);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ThemeHybridFragment.java */
    class C7923zy implements jp0y<Intent> {
        C7923zy() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (!com.android.thememanager.basemodule.privacy.x2.f7l8() || zy.this.f12273c == null || zy.this.getView() == null) {
                return;
            }
            zy.this.zuf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        if (isAdded()) {
            f3f();
            this.f12275e.setVisibility(8);
            this.f12273c.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b7() {
        if (C1819o.eqxt(getActivity())) {
            dd ddVar = this.bb;
            if (ddVar != null && ddVar.isShowing()) {
                this.bb.dismiss();
                this.bb = null;
            }
            dd ddVar2 = new dd(getActivity());
            this.bb = ddVar2;
            ddVar2.setTitle(R.string.theme_favorite_waiting);
            this.bb.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c25() {
        dd ddVar = this.bb;
        if (ddVar == null || !ddVar.isShowing()) {
            return;
        }
        this.bb.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1ts(boolean isLocalMode) {
        ViewGroup viewGroup = this.f12275e;
        if (viewGroup != null) {
            ((TextView) viewGroup.findViewById(R.id.reload_info)).setText(isLocalMode ? R.string.local_mode_hint : R.string.no_data);
        }
    }

    private void f3f() {
        if (this.f12275e == null) {
            PageGroup pageGroupXtb7 = xtb7();
            int i2 = 1;
            if (pageGroupXtb7 != null && !TextUtils.isEmpty(pageGroupXtb7.getResourceCode())) {
                String resourceCode = pageGroupXtb7.getResourceCode();
                if (!resourceCode.equals("theme")) {
                    if (resourceCode.equals("ringtone")) {
                        i2 = 3;
                    } else if (resourceCode.equals("fonts")) {
                        i2 = 4;
                    } else if (resourceCode.equals("wallpaper")) {
                        i2 = 2;
                    }
                }
            }
            ViewStub viewStub = (ViewStub) getView().findViewById(R.id.webview_reload_stub);
            com.android.thememanager.basemodule.views.ld6 ld6Var = new com.android.thememanager.basemodule.views.ld6();
            this.f12272b = ld6Var;
            ViewGroup viewGroupM7337k = ld6Var.m7337k(viewStub, i2);
            this.f12275e = viewGroupM7337k;
            viewGroupM7337k.setOnClickListener(new ViewOnClickListenerC2074g());
            Button button = (Button) this.f12275e.findViewById(R.id.local_entry);
            this.f12277j = button;
            button.setOnClickListener(new f7l8());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i3x9() {
        return C1819o.eqxt(getActivity()) && (getActivity() instanceof ThemeTabActivity) && ((ThemeTabActivity) getActivity()).pc();
    }

    private void kl7m() {
        if (this.f12282u != null) {
            this.f12282u.kja0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kt06() {
        ula6(8);
        tjz5();
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le7() {
        if (this.bp == null) {
            this.bp = new LoginLoader(this);
            getLifecycle().mo4451k(this.bp);
        }
        this.bp.m10149n();
    }

    private long lk(Uri uri) {
        try {
            return Long.parseLong(uri.getQueryParameter(InterfaceC1925p.en));
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mub(final String activityId, zy fragment) {
        new x2(fragment).executeOnExecutor(C6002g.x2(), activityId);
    }

    private boolean nyj(Uri uri) {
        return (lk(uri) & 24) != 0;
    }

    private void oph(final Uri urlAfterLogin) {
        C1688q c1688qCdj = C1688q.cdj();
        c1688qCdj.fti(getActivity(), new C2080y(c1688qCdj, urlAfterLogin));
    }

    public static zy pnt2(View view) {
        WeakReference<zy> weakReference = aj.get(view == null ? -1 : view.hashCode());
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sc() {
        if (isAdded()) {
            f3f();
            this.f12273c.setVisibility(8);
            this.f12275e.setVisibility(0);
            ula6(0);
        }
    }

    private void ula6(int visibility) {
        int childCount = this.f12275e.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f12275e.getChildAt(i2).setVisibility(visibility);
        }
        com.android.thememanager.basemodule.views.ld6 ld6Var = this.f12272b;
        if (ld6Var != null) {
            ld6Var.toq(visibility == 0);
        }
        if (TextUtils.isEmpty(this.f12271a)) {
            this.f12277j.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uo() {
        ula6(8);
        this.f12273c.qrj();
    }

    private boolean vss1(Uri uri) {
        return (lk(uri) & 8) != 0;
    }

    protected void exv8(HybridView webView) {
        com.android.thememanager.h5.jsinterface.zy zyVar = this.f12284w;
        if (zyVar == null) {
            return;
        }
        webView.toq(zyVar, com.android.thememanager.h5.jsinterface.zy.f12228y);
    }

    @Override // com.android.thememanager.v9.data.LoginLoader.InterfaceC2849k
    public void gbni() {
        com.android.thememanager.controller.online.fu4.m7547q();
        kz28(this.f12278l);
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.h5.C2069n.k
    public boolean gyi() {
        if (i3x9() && C1819o.eqxt(getActivity())) {
            Intent intent = new Intent();
            intent.putExtra(ThemeTabActivity.az, ((ThemeTabActivity) getActivity()).mbx());
            getActivity().setResult(0, intent);
        }
        com.android.thememanager.h5.jsinterface.zy zyVar = this.f12284w;
        if (zyVar == null || zyVar.m7959y() <= 0) {
            return false;
        }
        com.android.thememanager.h5.jsinterface.zy.f7l8(this.f12273c, com.android.thememanager.h5.jsinterface.zy.f12227s);
        return true;
    }

    protected Uri hyow() {
        String strXblq = getArguments() != null ? xblq() : null;
        if (strXblq == null) {
            return null;
        }
        return Uri.parse(strXblq);
    }

    public void i1an(qrj listener) {
        y9n.m7255s();
        this.f60323bo = listener;
    }

    protected void kz28(Uri uri) {
        if (!C1915g.m7549k() || com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            zuf();
            return;
        }
        if (!com.android.thememanager.h5.f7l8.ld6().kja0(uri) || "http".equals(uri.getScheme())) {
            nn86.toq("Invalid url !", 0);
            return;
        }
        if (vss1(uri) && C1688q.cdj().fn3e() == null) {
            nn86.toq("error: failed token", 0);
            return;
        }
        if (this.f12273c == null) {
            return;
        }
        if ((lk(uri) & 1) != 0) {
            this.f12273c.getSettings().mo25894q(2);
        } else {
            this.f12273c.getSettings().mo25894q(-1);
        }
        String queryParameter = uri.getQueryParameter(bq);
        this.f12271a = TextUtils.isEmpty(queryParameter) ? null : p001b.toq.m5744q(queryParameter);
        String finalGetUrl = vwb(uri).getFinalGetUrl();
        Uri.parse(finalGetUrl);
        this.f12273c.x2(finalGetUrl);
    }

    public void m8() {
        y9n.m7255s();
        this.f60323bo = null;
    }

    public C1790g mi1u() {
        if (this.f12282u == null) {
            synchronized (this) {
                if (this.f12282u == null) {
                    this.f12282u = new C1790g(getActivity());
                }
            }
        }
        return this.f12282u;
    }

    @Override // com.android.thememanager.h5.C2069n.k
    public void n2t(String url) {
        HybridView hybridView = this.f12273c;
        if (hybridView != null) {
            hybridView.x2(url);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(InterfaceC1357q.f53909m4)) {
            this.f60322ab = arguments.getString(InterfaceC1357q.f53909m4);
        }
        ni7.m7146k().toq(com.android.thememanager.basemodule.privacy.x2.f57643qrj, this.in);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(@lvui LayoutInflater inflater, @zy.dd ViewGroup container, @zy.dd Bundle savedInstanceState) {
        return inflater.inflate(R.layout.theme_hybrid_view, container, false);
    }

    @Override // miuix.hybrid.kja0, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f12282u != null) {
            this.f12282u.n7h();
            this.f12282u = null;
        }
        HybridView hybridView = this.f12273c;
        if (hybridView != null) {
            hybridView.m25765g();
        }
        C2703k.m9441g(null);
        c25();
        ni7.m7146k().m7147n(com.android.thememanager.basemodule.privacy.x2.f57643qrj, this.in);
    }

    @Override // miuix.hybrid.kja0, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        com.android.thememanager.basemodule.views.ld6 ld6Var;
        super.onPause();
        kl7m();
        ViewGroup viewGroup = this.f12275e;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || (ld6Var = this.f12272b) == null) {
            return;
        }
        ld6Var.toq(false);
    }

    @Override // miuix.hybrid.kja0, androidx.fragment.app.Fragment
    public void onResume() {
        com.android.thememanager.basemodule.views.ld6 ld6Var;
        super.onResume();
        ViewGroup viewGroup = this.f12275e;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || (ld6Var = this.f12272b) == null) {
            return;
        }
        ld6Var.toq(false);
    }

    protected DownloadListener qh4d() {
        return new C2077p();
    }

    @Override // com.android.thememanager.h5.C2069n.k
    public void qo(boolean visibleToUser) {
        this.f12283v = visibleToUser;
        qrj qrjVar = this.f60323bo;
        if (qrjVar != null && visibleToUser) {
            qrjVar.onVisible();
        }
        if (!this.f12274d && visibleToUser) {
            this.f12274d = true;
            tjz5();
        }
        if (visibleToUser) {
            return;
        }
        kl7m();
    }

    public void tjz5() {
        this.f12280o = new Handler(Looper.getMainLooper());
        if (getView() == null) {
            C7794k.f7l8("fragment getView null");
            return;
        }
        if (i3x9()) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).topMargin = C1819o.fu4(getActivity());
        }
        this.f12273c = (HybridView) getView().findViewById(R.id.hybrid_view);
        this.f12279m = getView().findViewById(R.id.web_mask);
        this.f12284w = new com.android.thememanager.h5.jsinterface.zy(getActivity(), this.f12273c);
        ki settings = this.f12273c.getSettings();
        settings.mo25893p(true);
        settings.n7h(true);
        settings.ld6(true);
        settings.qrj(100);
        settings.mo25892n(true);
        settings.mo25890g(true);
        settings.zy(false);
        this.f12273c.setOverScrollMode(2);
        settings.mo25894q(-1);
        if (C2063g.m7949k()) {
            settings.mo25894q(2);
        }
        exv8(this.f12273c);
        aj.put(this.f12273c.hashCode(), new WeakReference<>(this));
        this.f12273c.setHybridFragment(this);
        ec(this.f12273c, z4t());
        this.f12273c.setHybridViewClient(xzl());
        this.f12273c.setHybridChromeClient(z617());
        this.f12273c.setDownloadListener(qh4d());
        this.f12284w.ld6(this.f12273c);
        com.android.thememanager.controller.online.fu4.m7547q();
        a98o.toq(this.f12273c);
        Uri uriHyow = hyow();
        this.f12278l = uriHyow;
        if (uriHyow != null) {
            if (!am.equals(uriHyow.getScheme()) && !com.android.thememanager.controller.online.fu4.m7546k(this.f12278l) && !com.android.thememanager.controller.online.fu4.toq(this.f12278l)) {
                nn86.toq("Invalid url !", 0);
                getActivity().finish();
                return;
            }
            if (C1688q.cdj().fn3e() == null && nyj(this.f12278l)) {
                oph(this.f12278l);
            } else {
                kz28(this.f12278l);
            }
            this.f12273c.setAllowMultiple(this.f12278l.getBooleanQueryParameter(be, true));
            boolean booleanQueryParameter = this.f12278l.getBooleanQueryParameter(ay, true);
            if ((getActivity() instanceof com.android.thememanager.activity.t8r) && this.f12281r.contains(py.f16716y)) {
                if (!booleanQueryParameter) {
                    if (((com.android.thememanager.activity.t8r) getActivity()).m6709b() != null) {
                        ((com.android.thememanager.activity.t8r) getActivity()).m6709b().ij(null);
                    }
                } else if (o1t.n7h()) {
                    ((com.android.thememanager.activity.t8r) getActivity()).uj2j(this.id, R.string.accessibiliy_description_content_share, R.drawable.action_share);
                } else {
                    ((com.android.thememanager.activity.t8r) getActivity()).uj2j(this.id, R.string.accessibiliy_description_content_share, R.drawable.h5_share);
                }
            }
        }
    }

    protected zurt vwb(Uri uri) {
        zurt zurtVar = new zurt(uri);
        long jLk = lk(uri);
        if ((2 & jLk) != 0) {
            zurtVar.setHttpMethod(zurt.toq.POST);
        }
        if ((4 & jLk) != 0) {
            zurtVar.addRequestFlag(1);
        }
        if ((jLk & 8) != 0) {
            zurtVar.addRequestFlag(4);
        }
        com.android.thememanager.controller.online.ld6.m7572n(zurtVar);
        return zurtVar;
    }

    public void wtop() {
        if (y9n.m7250l()) {
            ab();
        } else {
            this.f12280o.post(new RunnableC2076n());
        }
    }

    protected boolean wwp(String originUrl) {
        Uri uri = Uri.parse(originUrl);
        if (am.equals(uri.getScheme()) && com.android.thememanager.h5.f7l8.f12011i.equals(uri.getHost())) {
            kz28(Uri.parse(com.android.thememanager.h5.f7l8.ld6().m7914p(originUrl)));
            return true;
        }
        if (("zhuti.xiaomi.com".equals(uri.getHost()) || InterfaceC1925p.gdzl.equals(uri.getHost())) && uri.getPath() != null && (uri.getPath().matches(InterfaceC1925p.mm) || uri.getPath().startsWith(InterfaceC1357q.f53894jz5))) {
            startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        }
        if ((("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) && (lk(uri) & 32) == 0) ? false : true) {
            x9kr.m7239g(getActivity(), uri, originUrl);
            return true;
        }
        if (nyj(uri)) {
            if (C1688q.cdj().fn3e() == null) {
                oph(uri);
            } else {
                kz28(uri);
            }
            return true;
        }
        if (nmn5.f7l8(getActivity(), uri)) {
            return true;
        }
        if (!InterfaceC1925p.cgz.equals(uri.getHost())) {
            return false;
        }
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.previewPath = originUrl;
        videoInfo.path = originUrl;
        videoInfo.sizeBytes = -1L;
        C2451n.qrj(getActivity(), null, videoInfo, false);
        return true;
    }

    @Override // com.android.thememanager.h5.C2069n.k
    /* JADX INFO: renamed from: x */
    public void mo7961x() {
        qrj qrjVar = this.f60323bo;
        if (qrjVar != null) {
            qrjVar.onResume();
        }
    }

    protected String xblq() {
        if (this.f12281r == null && getArguments() != null) {
            this.f12281r = com.android.thememanager.h5.f7l8.ld6().m7914p(getArguments().getString(InterfaceC1357q.f53885i1));
        }
        return this.f12281r;
    }

    protected PageGroup xtb7() {
        if (this.f12276f == null) {
            this.f12276f = (PageGroup) getArguments().getSerializable(InterfaceC1357q.f53848bf2);
        }
        return this.f12276f;
    }

    protected C7123i xzl() {
        return new ld6();
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        super.y9n(agree);
        if (agree) {
            uo();
        }
    }

    @Override // com.android.thememanager.h5.C2069n.k
    public void yqrt() {
        qrj qrjVar = this.f60323bo;
        if (qrjVar != null) {
            qrjVar.onPause();
        }
    }

    public boolean z4j7() {
        return this.f12283v;
    }

    protected miuix.hybrid.qrj z617() {
        return new C2079s();
    }

    public void zuf() {
        if (y9n.m7250l()) {
            sc();
        } else {
            this.f12280o.post(new RunnableC2078q());
        }
    }
}
