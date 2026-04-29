package com.android.thememanager.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.activity.OtaUpdateDialogActivity;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import java.util.HashSet;
import java.util.Set;
import miui.content.res.ThemeResources;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: OtaUpdateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class yz extends fn3e {
    public static Set<String> cw14 = null;
    public static final String dy = "ota_closed";
    public static final String hp = "miui.showAction";
    public static final String k6e = "bc_desk_status";
    public static final String mjvl = "theme_ota_update_time";
    public static final String s8y = "desk";
    public static final String sk1t = "getBackupStatusWhenOtaClosed";
    public static final String tgs = "ota_mode";
    public static final String tlhn = "OtaUpdateManager";
    public static final String vb6 = "bc_lock_status";
    public static final String w97r = ThemeResources.THEME_MAGIC_PATH + "ota_update/";
    public static final String xk5 = "lock";
    public static final String yl25 = "getMagazineServiceStatus";
    public static final String zmmu = "setOtaStatusWhenClose";

    /* JADX INFO: renamed from: com.android.thememanager.util.yz$k */
    /* JADX INFO: compiled from: OtaUpdateManager.java */
    public static class AsyncTaskC2822k extends AsyncTask<Void, Void, Void> {
        /* JADX INFO: renamed from: k */
        private void m10093k() {
            Log.i(yz.tlhn, "OtaUpdateTask current fold default wallpaper is darkModeWallpaper");
            h7am.toq(false, true);
            h7am.toq(true, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            if (C1807g.zurt() && com.android.thememanager.basemodule.utils.o1t.m7179z() && com.android.thememanager.ncyb.x2()) {
                m10093k();
                return null;
            }
            new yz().d2ok();
            return null;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        cw14 = hashSet;
        hashSet.add("theme");
        cw14.add("wallpaper");
        cw14.add("miwallpaper");
        cw14.add(InterfaceC1789q.gx2z);
        cw14.add("lockscreen");
        cw14.add("aod");
        cw14.add("icons");
        cw14.add("fonts");
        cw14.add(InterfaceC1789q.ekha);
        cw14.add(InterfaceC1789q.w5);
        cw14.add(InterfaceC1789q.gun);
        cw14.add(InterfaceC1789q.jci);
    }

    public yz() {
        super(w97r, tgs, cw14);
    }

    private Bundle dd(Context context, Uri providerUri, String callMethod, String args, Bundle extras) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        ContentProviderClient contentProviderClient = null;
        try {
            contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(providerUri);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                return null;
            }
            try {
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(callMethod, args, extras);
                contentProviderClientAcquireUnstableContentProviderClient.close();
                return bundleCall;
            } catch (Exception unused) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m10090f() {
        toq.m10012n();
        if (!uc.ch()) {
            Log.w(tlhn, "setupNewUiForDefaultWallpaper");
            uc.m10023g(bf2.toq.toq(), true);
            uc.m10023g(bf2.toq.toq(), false);
        }
        zurt();
    }

    public void d2ok() {
        com.theme.loopwallpaper.controller.toq.m18514q();
        if (com.android.thememanager.basemodule.utils.o1t.ki()) {
            Log.w(tlhn, "MIUI14 do nothing");
            return;
        }
        if (fn3e.t8r() || !(fn3e.kja0() || fn3e.ki())) {
            Log.w(tlhn, "setupNewUi");
            m10090f();
        } else if (com.android.thememanager.basemodule.utils.o1t.cdj()) {
            Log.w(tlhn, "do nothing! 12.5 -> 13 all compatible!");
        } else {
            Log.w(tlhn, "removeRuntimeDataExceptCompatibleData");
            jp0y();
        }
    }

    public void eqxt() throws Throwable {
        m9729y();
        m9727q();
        m9724g();
        ld6();
        m9726p();
    }

    public void hyr() {
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra(InterfaceC1357q.f53900kx3, true);
        PendingIntent activity = PendingIntent.getActivity(this.f16443r, 0, intent, 201326592);
        Intent intent2 = new Intent(this.f16443r, (Class<?>) OtaUpdateDialogActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean(hp, true);
        com.android.thememanager.basemodule.utils.jk.m7102g(this.f16443r, 4, com.android.thememanager.basemodule.utils.jk.f10344k, new Notification.Builder(this.f16443r).setSmallIcon(R.drawable.theme_icon).setContentIntent(activity).setContentTitle(this.f16443r.getResources().getString(R.string.ota_recovery_theme_notity_title)).setContentText(this.f16443r.getResources().getString(R.string.ota_recovery_theme_notity_content)).addAction(0, this.f16443r.getResources().getString(R.string.ota_recovery_theme_notity_btn), PendingIntent.getActivity(this.f16443r, 1, intent2, 201326592)).setExtras(bundle).setAutoCancel(true));
    }

    /* JADX INFO: renamed from: l */
    public void m10091l() {
        wvg();
        fu4();
        o1t();
        jk();
        a9();
    }

    public void lvui() {
        ((NotificationManager) this.f16443r.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle)).cancel(4);
    }

    public void n5r1() {
        this.f16445t.putLong(mjvl, System.currentTimeMillis());
        this.f16445t.apply();
    }

    public void ncyb(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(dy, true);
        if (bundle != null) {
            bundle2.putBoolean(vb6, bundle.getBoolean(xk5));
            bundle2.putBoolean(k6e, bundle.getBoolean(s8y));
        }
        mbx.m9868k(this.f16443r, Uri.parse(mbx.f16633k), zmmu, bundle2);
    }

    /* JADX INFO: renamed from: r */
    public void m10092r() {
        ncyb(mbx.m9868k(this.f16443r, Uri.parse(mbx.f16633k), yl25, null));
        mbx.zy();
        uc.ch();
        toq.m10012n();
        zurt();
    }

    public long x9kr() {
        return System.currentTimeMillis() - this.f16447z.getLong(mjvl, System.currentTimeMillis());
    }
}
