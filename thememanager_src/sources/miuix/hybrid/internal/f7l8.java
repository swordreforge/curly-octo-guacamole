package miuix.hybrid.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import miuix.hybrid.C7123i;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.HybridView;
import miuix.hybrid.InterfaceC7154t;
import miuix.hybrid.fu4;
import miuix.hybrid.ki;
import miuix.hybrid.n7h;
import miuix.hybrid.ni7;
import miuix.hybrid.o1t;
import miuix.hybrid.zurt;

/* JADX INFO: compiled from: HybridManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f87699ld6 = "hybrid";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static String f87700x2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private fu4 f87701f7l8;

    /* JADX INFO: renamed from: g */
    private ld6 f40250g;

    /* JADX INFO: renamed from: k */
    private final Activity f40251k;

    /* JADX INFO: renamed from: n */
    private C7128n f40252n;

    /* JADX INFO: renamed from: p */
    private InterfaceC7154t<Uri[]> f40253p;

    /* JADX INFO: renamed from: q */
    private ni7 f40254q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final HybridView f87702toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f87703zy;

    /* JADX INFO: renamed from: y */
    private final Set<zurt> f40256y = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: s */
    private final ConcurrentHashMap<String, C7156z> f40255s = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: miuix.hybrid.internal.f7l8$k */
    /* JADX INFO: compiled from: HybridManager.java */
    class ViewOnAttachStateChangeListenerC7125k implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC7125k() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v2) {
            f7l8.this.f87703zy = false;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v2) {
            f7l8.this.f87703zy = true;
        }
    }

    /* JADX INFO: compiled from: HybridManager.java */
    private static class toq implements Runnable {

        /* JADX INFO: renamed from: g */
        private final String f40258g;

        /* JADX INFO: renamed from: k */
        private final WeakReference<f7l8> f40259k;

        /* JADX INFO: renamed from: n */
        private final String f40260n;

        /* JADX INFO: renamed from: q */
        private final miuix.hybrid.n7h f40261q;

        public toq(f7l8 hybridManager, miuix.hybrid.n7h feature, String key, String jsCallback) {
            this.f40259k = new WeakReference<>(hybridManager);
            this.f40261q = feature;
            this.f40260n = key;
            this.f40258g = jsCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7156z c7156z;
            f7l8 f7l8Var = this.f40259k.get();
            if (f7l8Var == null || (c7156z = (C7156z) f7l8Var.f40255s.remove(this.f40260n)) == null || f7l8Var.qrj().isFinishing() || f7l8Var.qrj().isDestroyed()) {
                return;
            }
            o1t o1tVarInvoke = this.f40261q.invoke(c7156z);
            if (this.f40261q.getInvocationMode(c7156z) == n7h.EnumC7150k.ASYNC) {
                f7l8Var.m25805s(o1tVarInvoke, c7156z.m25923q(), this.f40258g);
            }
        }
    }

    /* JADX INFO: compiled from: HybridManager.java */
    private class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        private final o1t f40262k;

        /* JADX INFO: renamed from: q */
        private final String f40264q;

        public zy(o1t response, String jsCallback) {
            this.f40262k = response;
            this.f40264q = jsCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM25797g = f7l8.this.m25797g(this.f40262k, this.f40264q);
            f7l8.this.f87702toq.x2("javascript:" + strM25797g);
        }
    }

    public f7l8(Activity activity, HybridView view) {
        this.f40251k = activity;
        this.f87702toq = view;
    }

    private String cdj(String original) {
        if (f87700x2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(original);
            sb.append(" XiaoMi/HybridView/");
            sb.append(this.f40251k.getPackageName());
            sb.append("/");
            Activity activity = this.f40251k;
            sb.append(m25798h(activity, activity.getPackageName()).versionName);
            f87700x2 = sb.toString();
        }
        return f87700x2;
    }

    private miuix.hybrid.n7h f7l8(String feature) throws C7126g {
        if (this.f40250g.toq(this.f87701f7l8.toq())) {
            return this.f40252n.toq(feature);
        }
        throw new C7126g(203, "feature not permitted: " + feature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public String m25797g(o1t response, String callback) {
        if (TextUtils.isEmpty(callback)) {
            return "";
        }
        return callback + "('" + response.toString().replace("\\", "\\\\").replace("'", "\\'") + "');";
    }

    private String gvn7(String original) {
        if (Pattern.compile("^[a-z-]+://").matcher(original).find()) {
            return original;
        }
        if (original.charAt(0) == '/') {
            original = original.substring(1);
        }
        return "file:///android_asset/hybrid/" + original;
    }

    /* JADX INFO: renamed from: h */
    private static PackageInfo m25798h(Context context, String packageName) {
        try {
            return context.getPackageManager().getPackageInfo(packageName, 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m25799i() {
        t8r(this.f87702toq.getSettings());
        this.f87702toq.setHybridViewClient(new C7123i());
        this.f87702toq.setHybridChromeClient(new miuix.hybrid.qrj());
        this.f87702toq.toq(new C7147y(this), C7147y.f87742toq);
        this.f87702toq.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7125k());
    }

    private String kja0(String feature, String action, String rawParams, String jsCallback) {
        return feature + action + rawParams + jsCallback;
    }

    private C7127k ni7(int configResId) {
        try {
            return (configResId == 0 ? kja0.zy(this.f40251k) : kja0.m25820q(this.f40251k, configResId)).mo25823k(null);
        } catch (C7126g e2) {
            throw new RuntimeException("cannot load config: " + e2.getMessage());
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void t8r(ki settings) {
        settings.mo25893p(true);
        settings.kja0(cdj(settings.mo25891k()));
    }

    private String x2(C7127k config, boolean checkSecurity) {
        if (checkSecurity) {
            qrj qrjVar = new qrj(config, this.f40251k.getApplicationContext());
            if (qrjVar.zy() || !qrjVar.m25868q()) {
                return new o1t(202).toString();
            }
        }
        this.f40252n = new C7128n(config, this.f40251k.getClassLoader());
        this.f40250g = new ld6(config);
        return new o1t(0).toString();
    }

    /* JADX INFO: renamed from: y */
    private C7156z m25802y(String feature, String action, String rawParams) {
        C7156z c7156z = new C7156z();
        c7156z.f7l8(action);
        c7156z.ld6(rawParams);
        c7156z.m25922p(this.f87701f7l8);
        c7156z.x2(this.f87702toq);
        c7156z.m25924s(this.f40254q);
        return c7156z;
    }

    public void a9() {
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    public void d3(fu4 pageContext) {
        this.f87701f7l8 = pageContext;
    }

    public String fn3e(String feature, String action, String rawParams, String jsCallback) {
        try {
            miuix.hybrid.n7h n7hVarF7l8 = f7l8(feature);
            C7156z c7156zM25802y = m25802y(feature, action, rawParams);
            n7h.EnumC7150k invocationMode = n7hVarF7l8.getInvocationMode(c7156zM25802y);
            if (invocationMode == n7h.EnumC7150k.SYNC) {
                m25805s(new o1t(1), this.f87701f7l8, jsCallback);
                return n7hVarF7l8.invoke(c7156zM25802y).toString();
            }
            String strKja0 = kja0(feature, action, rawParams, jsCallback);
            this.f40255s.put(strKja0, c7156zM25802y);
            if (invocationMode == n7h.EnumC7150k.ASYNC) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new toq(this, n7hVarF7l8, strKja0, jsCallback));
                return new o1t(2).toString();
            }
            c7156zM25802y.m25925y(new C7148k(this, this.f87701f7l8, jsCallback));
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new toq(this, n7hVarF7l8, strKja0, jsCallback));
            return new o1t(3).toString();
        } catch (C7126g e2) {
            o1t response = e2.getResponse();
            m25805s(response, this.f87701f7l8, jsCallback);
            return response.toString();
        }
    }

    public void fti() {
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }

    public String fu4(String feature, String action) {
        try {
            if (f7l8(feature).getInvocationMode(m25802y(feature, action, null)) != null) {
                return new o1t(0).toString();
            }
            return new o1t(205, "action not supported: " + action).toString();
        } catch (C7126g e2) {
            return e2.getResponse().toString();
        }
    }

    public void jk(InterfaceC7154t<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (this.f87702toq.getHybridFragmentWeakReference() == null || this.f87702toq.getHybridFragmentWeakReference().get() == null) {
            Log.d("hybrid", "onShowFileChooser: fragment is null");
            return;
        }
        Fragment fragment = this.f87702toq.getHybridFragmentWeakReference().get();
        this.f40253p = filePathCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f87702toq.m25767p());
        if (fileChooserParams == null || fileChooserParams.getAcceptTypes() == null || fileChooserParams.getAcceptTypes().length == 0) {
            Log.d("hybrid", "onShowFileChooser: The accept attribute is not set on the H5");
            intent.setType("*/*");
        } else {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            Log.d("hybrid", "onShowFileChooser: file type = " + Arrays.toString(acceptTypes));
            if (acceptTypes.length == 1) {
                intent.setType(acceptTypes[0]);
            } else {
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
            }
        }
        fragment.startActivityForResult(intent, 6004);
    }

    public void jp0y(zurt listener) {
        this.f40256y.remove(listener);
    }

    public void ki(int configResId, String url) {
        this.f40254q = new ni7(this);
        C7127k c7127kNi7 = ni7(configResId);
        x2(c7127kNi7, false);
        m25799i();
        if (url == null && !TextUtils.isEmpty(c7127kNi7.m25808g())) {
            url = gvn7(c7127kNi7.m25808g());
        }
        if (url != null) {
            this.f87702toq.x2(url);
        }
    }

    public String ld6(String config) {
        try {
            return x2(C7135s.m25871q(config).mo25823k(null), true);
        } catch (C7126g e2) {
            return new o1t(201, e2.getMessage()).toString();
        }
    }

    public void mcp() {
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m25803n(zurt listener) {
        this.f40256y.add(listener);
    }

    public HybridView n7h() {
        return this.f87702toq;
    }

    public void o1t() {
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m25804p() {
        this.f40255s.clear();
    }

    public Activity qrj() {
        return this.f40251k;
    }

    /* JADX INFO: renamed from: s */
    public void m25805s(o1t response, fu4 pageContext, String jsCallback) {
        if (response == null || TextUtils.isEmpty(jsCallback) || !pageContext.equals(this.f87701f7l8) || this.f87703zy || this.f40251k.isFinishing()) {
            return;
        }
        if (Log.isLoggable("hybrid", 3)) {
            Log.d("hybrid", "non-blocking response is " + response.toString());
        }
        this.f40251k.runOnUiThread(new zy(response, jsCallback));
    }

    /* JADX INFO: renamed from: t */
    public void m25806t() {
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void wvg() {
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onPageChange();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m25807z(int requestCode, int resultCode, Intent data) {
        Uri[] uriArr;
        Iterator<zurt> it = this.f40256y.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(requestCode, resultCode, data);
        }
        Log.d("hybrid", "onActivityResult: requestCode = " + requestCode + " resultCode = " + resultCode);
        if (requestCode == 6004) {
            if (this.f40253p == null) {
                Log.d("hybrid", "onActivityResult: break by FilePathCallback is null");
                return;
            }
            if (resultCode != -1 || data == null) {
                uriArr = null;
            } else {
                ClipData clipData = data.getClipData();
                if (clipData != null) {
                    uriArr = new Uri[clipData.getItemCount()];
                    for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                        uriArr[i2] = clipData.getItemAt(i2).getUri();
                    }
                } else {
                    uriArr = null;
                }
                String dataString = data.getDataString();
                if (dataString != null) {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                }
            }
            InterfaceC7154t<Uri[]> interfaceC7154t = this.f40253p;
            if (interfaceC7154t != null) {
                interfaceC7154t.onReceiveValue(uriArr);
            }
            this.f40253p = null;
        }
    }

    public boolean zurt() {
        return this.f87703zy;
    }
}
