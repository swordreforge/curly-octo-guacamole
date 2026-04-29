package com.android.thememanager.presenter;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.fti;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeBugreportDumpReceiver;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.C1826t;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.controller.x2;
import com.android.thememanager.maml.widget.qrj;
import com.android.thememanager.miuixcompat.C2206g;
import com.android.thememanager.module.detail.presenter.cdj;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.t8iq;
import com.android.thememanager.util.uc;
import com.google.android.exoplayer2.t8r;
import com.miui.privacypolicy.f7l8;
import ikck.toq;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miui.app.constants.ResourceBrowserConstants;
import miuix.appcompat.app.ki;
import retrofit2.C7639i;

/* JADX INFO: compiled from: PolicyPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends cdj implements toq.InterfaceC8049toq {
    public static final int cw14 = 1;
    private static final String dy = "PolicyPresenter";
    public static final int hp = -2;
    private static final int k6e = 2;
    public static final int mjvl = -1;
    public static final int q7k9 = 4;
    public static final int s8y = 0;
    public static final int th6 = 3;
    private static final String vb6 = "success";
    private static final int xk5 = 1;
    public static final int xy8 = 2;
    fti<Integer> sk1t;

    /* JADX INFO: renamed from: com.android.thememanager.presenter.zy$k */
    /* JADX INFO: compiled from: PolicyPresenter.java */
    public static class AsyncTaskC2312k extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: k */
        WeakReference<Activity> f13488k;

        /* JADX INFO: renamed from: q */
        private final boolean f13489q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final zy f60601toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f60602zy = C1688q.cdj().wvg();

        public AsyncTaskC2312k(Activity activity, zy viewModel, boolean rebootAfterApply) {
            this.f13488k = new WeakReference<>(activity);
            this.f60601toq = viewModel;
            this.f13489q = rebootAfterApply;
        }

        private Resource toq() {
            Resource resource = new Resource();
            ArrayList arrayList = new ArrayList();
            for (String str : InterfaceC1789q.bzx) {
                RelatedResource relatedResource = new RelatedResource();
                relatedResource.setResourceCode(str);
                relatedResource.setContentPath("");
                arrayList.add(relatedResource);
            }
            resource.setSubResources(arrayList);
            return resource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... params) {
            this.f60601toq.oki().n7h(2);
            zy.b9ub();
            String strQrj = C1807g.qrj();
            if (TextUtils.isEmpty(strQrj)) {
                strQrj = C1807g.m7079p(bf2.toq.toq());
            }
            if (TextUtils.isEmpty(strQrj)) {
                strQrj = com.android.thememanager.basemodule.privacy.zy.toq();
            }
            int iM18119q = f7l8.m18119q(bf2.toq.toq(), C1807g.m7081r() ? C1781k.f57617fn3e : C1781k.f57633t8r, strQrj);
            if (iM18119q != 1) {
                Log.i(zy.dy, " privacyRevoke error: " + iM18119q);
                return -2;
            }
            if (!this.f60602zy) {
                zy.wlev(t8r.f65475toq);
                return 0;
            }
            String strLw = zy.lw();
            Log.d(zy.dy, "clearOnlineUserData : " + strLw);
            if (!TextUtils.equals(strLw, zy.vb6)) {
                return -2;
            }
            for (int i2 = 0; i2 < 30; i2++) {
                zy.wlev(t8r.f65475toq);
                if (TextUtils.equals(zy.b8(), zy.vb6)) {
                    return 0;
                }
                if (!mcp.m7139n()) {
                    return -1;
                }
            }
            return -2;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            this.f60601toq.oki().cdj(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            super.onPostExecute(result);
            if (result.intValue() != 0) {
                this.f60601toq.oki().n7h(result);
                return;
            }
            Log.d(zy.dy, "ClearLocalDataAsyncTask begin ClearLocalDataAsyncTask");
            new toq(this.f13488k.get(), this.f13489q, this.f60601toq).execute(new Void[0]);
            Log.d(zy.dy, "ClearLocalDataAsyncTask end ClearLocalDataAsyncTask");
        }
    }

    /* JADX INFO: compiled from: PolicyPresenter.java */
    public static class toq extends AsyncTask<Void, Integer, Integer> {

        /* JADX INFO: renamed from: k */
        private WeakReference<Activity> f13490k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f60603toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private zy f60604zy;

        public toq(Activity activity, boolean rebootFinished, zy vm) {
            if (activity != null) {
                this.f13490k = new WeakReference<>(activity);
            }
            this.f60603toq = rebootFinished;
            this.f60604zy = vm;
        }

        /* JADX INFO: renamed from: q */
        private void m8454q() {
            t8iq.f7l8(false);
            uc.m10019b(bf2.toq.toq(), false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voids) {
            C1826t.f7l8(false);
            this.f60604zy.oki().n7h(2);
            Log.d(zy.dy, "ClearLocalDataAsyncTask syncPrivacyStatus");
            m8454q();
            Log.d(zy.dy, "ClearLocalDataAsyncTask restoreTheme end");
            zy.a5id();
            long j2 = C1807g.gvn7() ? 3500 : 2000;
            zy.wlev(j2);
            publishProgress(1);
            if (this.f60603toq) {
                zy.gcp();
            }
            this.f60604zy.oki().n7h(3);
            zy.wlev(j2);
            return 2;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            Log.d(zy.dy, "clear will end...");
            this.f60604zy.oki().cdj(4);
            if (this.f60603toq) {
                Log.i(zy.dy, "BEGIN reboot");
                ((PowerManager) bf2.toq.toq().getSystemService("power")).reboot("reset theme font.");
            } else {
                Log.i(zy.dy, "BEGIN clearApplicationData ");
                zy.vy(bf2.toq.toq());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... processes) {
            super.onProgressUpdate(processes);
            if (processes == null || processes.length <= 0 || processes[0].intValue() != 1) {
                return;
            }
            Log.i(zy.dy, "show home launcher");
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            WeakReference<Activity> weakReference = this.f13490k;
            if (weakReference != null && weakReference.get() != null) {
                this.f13490k.get().startActivity(intent);
            }
            if (y9n.vyq() && a9.m6999s(y9n.f10446p)) {
                Intent intent2 = new Intent(ThemeResourceProxyTabActivity.bg);
                intent2.setPackage(y9n.f10446p);
                WeakReference<Activity> weakReference2 = this.f13490k;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.f13490k.get().sendBroadcast(intent2);
            }
        }
    }

    public zy(Application app) {
        super(app);
        this.sk1t = new fti<>(-3);
    }

    @zy.y9n
    public static void a5id() {
        try {
            Log.i(dy, " begin clearMIUIData");
            String[] strArr = {".wallpaper", ".ringtone", ".videowallpaper", ".loopwallpaper", C2687z.f15942q, "theme"};
            String str = ResourceBrowserConstants.MIUI_PATH;
            for (int i2 = 0; i2 < 6; i2++) {
                C1821p.ki(new File(str, strArr[i2]).getPath());
            }
            C1821p.ki(C2206g.f60487kja0);
            C1821p.ki(ThemeBugreportDumpReceiver.f57252toq);
            if (C1807g.zurt()) {
                C1821p.cdj("/storage/emulated/0/.PC_WALLPAPER");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.i(dy, "clearMIUIData remove local Data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b8() {
        return (String) m58i(((InterfaceC2311q) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(InterfaceC2311q.class)).toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b9ub() {
        try {
            Log.d(dy, "begin pauseDownloadTask");
            List<ld6.C1749s> listM8435p = qrj.wvg().m8435p();
            if (listM8435p == null || listM8435p.size() <= 0) {
                return;
            }
            Iterator<ld6.C1749s> it = listM8435p.iterator();
            while (it.hasNext()) {
                qrj.wvg().jk(it.next().f57556toq);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cnbm(Activity activity, DialogInterface dialogInterface, int i2) {
        new AsyncTaskC2312k(activity, this, true).execute(new Void[0]);
    }

    private boolean e5(final Activity activity) {
        Resource resourceGa = ga();
        if (!g1.vyq("fonts", resourceGa, resourceGa.getMetaPath()) || g1.d8wk() || activity == null) {
            return false;
        }
        ki.C6947k c6947k = new ki.C6947k(activity);
        c6947k.lrht(R.string.resource_apply).fu4(R.string.apply_font_tip).m25039i(android.R.attr.alertDialogIcon).dd(R.string.apply_font_btn_reboot, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.presenter.toq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13486k.cnbm(activity, dialogInterface, i2);
            }
        }).mcp(android.R.string.cancel, null);
        c6947k.hb();
        return true;
    }

    private Resource ga() {
        return new x2(C2082k.zy().m8001n().m10535g("fonts")).m7690k().ld6();
    }

    public static boolean gcp() {
        Log.d(dy, "begin clearSelfData");
        try {
            String parent = bf2.toq.toq().getFilesDir().getParent();
            File[] fileArrListFiles = new File(parent, "shared_prefs").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    bf2.toq.toq().getSharedPreferences(o05(file.getName()), 0).edit().clear().apply();
                }
            }
            C1821p.ki(parent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            C1821p.ki(bf2.toq.toq().getExternalCacheDir().getParent());
            return true;
        } catch (Exception e3) {
            e3.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lw() {
        return (String) m58i(((InterfaceC2311q) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(InterfaceC2311q.class)).m8452k());
    }

    private static <T> T m58i(retrofit2.toq<CommonResponse<T>> call) {
        C7639i<CommonResponse<T>> c7639iF7l8;
        try {
            c7639iF7l8 = call.f7l8();
        } catch (IOException e2) {
            Log.w(dy, "toPage() :" + e2);
            c7639iF7l8 = null;
        }
        if (c7639iF7l8 == null) {
            Log.d(dy, "getResponseResult: null");
        } else if (c7639iF7l8.f7l8()) {
            CommonResponse<T> commonResponseM27986k = c7639iF7l8.m27986k();
            if (commonResponseM27986k != null) {
                return commonResponseM27986k.apiData;
            }
        } else {
            Log.d(dy, "getResponseResult: " + c7639iF7l8);
        }
        return null;
    }

    private static String o05(String path) {
        int iLastIndexOf = path.lastIndexOf(File.separator);
        int iLastIndexOf2 = path.lastIndexOf(".");
        if (iLastIndexOf < 0) {
            iLastIndexOf = 0;
        }
        if (iLastIndexOf2 < 0) {
            iLastIndexOf2 = path.length();
        }
        return path.substring(iLastIndexOf, iLastIndexOf2);
    }

    public static boolean vy(Context context) {
        ((ActivityManager) context.getSystemService(C1873k.f10652g)).clearApplicationUserData();
        Log.d(dy, "clearApplicationData: ");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wlev(long time) {
        SystemClock.sleep(time);
    }

    public void dxef(Activity activity) {
        boolean zE5 = e5(activity);
        Log.d(dy, "clearAllData: checkFont = " + zE5);
        if (zE5) {
            return;
        }
        new AsyncTaskC2312k(activity, this, false).execute(new Void[0]);
    }

    public fti<Integer> oki() {
        return this.sk1t;
    }
}
