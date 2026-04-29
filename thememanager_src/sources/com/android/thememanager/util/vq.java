package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.ThemeBugreportDumpReceiver;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.library.util.app.C2088k;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.router.app.entity.ThemeStatus;
import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import m4.C6795k;
import miui.app.constants.ThemeManagerConstants;
import miui.drm.DrmManager;
import miui.telephony.TelephonyManager;
import miui.util.HashUtils;
import miuix.appcompat.app.ki;
import yz.C7794k;

/* JADX INFO: compiled from: ThemeApplyUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class vq implements p001b.f7l8, InterfaceC1789q {

    /* JADX INFO: renamed from: g */
    private static long f16856g = 0;

    /* JADX INFO: renamed from: k */
    private static final String f16857k = "ThemeApplyUtils";

    /* JADX INFO: renamed from: n */
    private static final String f16858n = "theme_multi_sim_mms_ringtone_settings_remind_again";

    /* JADX INFO: renamed from: q */
    private static final String f16859q = "theme_multi_sim_ringtone_settings_remind_again";

    /* JADX INFO: renamed from: com.android.thememanager.util.vq$k */
    /* JADX INFO: compiled from: ThemeApplyUtils.java */
    class RunnableC2814k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f16860k;

        RunnableC2814k(final Context val$context) {
            this.f16860k = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.thememanager.basemodule.utils.o1t.jp0y();
            com.android.thememanager.basemodule.utils.o1t.gvn7();
            ((PowerManager) this.f16860k.getSystemService("power")).reboot("font files change");
        }
    }

    /* JADX INFO: compiled from: ThemeApplyUtils.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ androidx.lifecycle.fti f16861g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f16862k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f16863n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ApplyThemeInfo f16864q;

        toq(final Resource val$resource, final ApplyThemeInfo val$applyThemeInfo, final boolean val$isInMultiWindow, final androidx.lifecycle.fti val$observableApplyStatus) {
            this.f16862k = val$resource;
            this.f16864q = val$applyThemeInfo;
            this.f16863n = val$isInMultiWindow;
            this.f16861g = val$observableApplyStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Bundle bundle;
            ThemeStatus themeStatus;
            com.android.thememanager.basemodule.utils.o1t.jp0y();
            if (!g1.nn86() || this.f16862k.getFontWeightList() == null || this.f16862k.getFontWeightList().size() <= 0) {
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putIntegerArrayList(InterfaceC1789q.qjdr, this.f16862k.getFontWeightList());
            }
            ApplyThemeInfo applyThemeInfo = this.f16864q;
            if (applyThemeInfo == null || (applyThemeInfo.getFontScale() <= 0 && this.f16864q.getFontWeight() < 0)) {
                C6795k.m24740q(InterfaceC1789q.h60v, bundle, this.f16863n);
            } else if (this.f16863n) {
                com.android.thememanager.basemodule.utils.cdj.toq(this.f16864q.getFontScale(), this.f16864q.getFontWeight(), InterfaceC1789q.h60v, bundle);
            } else {
                com.android.thememanager.basemodule.utils.cdj.m7014k(this.f16864q.getFontScale(), this.f16864q.getFontWeight(), InterfaceC1789q.h60v, bundle);
            }
            com.android.thememanager.basemodule.utils.o1t.gvn7();
            androidx.lifecycle.fti ftiVar = this.f16861g;
            if (ftiVar == null || (themeStatus = (ThemeStatus) ftiVar.m4388g()) == null) {
                return;
            }
            themeStatus.status = 99;
            this.f16861g.cdj(themeStatus);
        }
    }

    /* JADX INFO: compiled from: ThemeApplyUtils.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.thememanager.basemodule.utils.o1t.gvn7();
        }
    }

    public static void f7l8(final Activity activity, final com.android.thememanager.fu4 resContext, final Resource resource, ApplyThemeInfo applyThemeInfo, androidx.lifecycle.fti<ThemeStatus> observableApplyStatus) {
        Runnable zyVar;
        ApplyThemeInfo applyThemeInfo2 = applyThemeInfo != null ? applyThemeInfo : new ApplyThemeInfo();
        final Set<String> ignoreCodeSet = applyThemeInfo2.getIgnoreCodeSet();
        String resourceCode = resContext.getResourceCode();
        String metaPath = new ResourceResolver(resource, resContext).getMetaPath();
        final Context contextM8026k = C2088k.m8026k();
        if ("wallpaper".equals(resourceCode)) {
            Log.d(C2755a.f16307g, "applyResource resourceCode is " + resourceCode);
            return;
        }
        if ("lockscreen".equals(resourceCode)) {
            Log.d(C2755a.f16307g, "applyResource resourceCode is " + resourceCode);
            return;
        }
        if ("bootaudio".equals(resourceCode)) {
            g1.m9747k(contextM8026k, metaPath);
            return;
        }
        boolean z2 = false;
        if ("ringtone".equals(resourceCode)) {
            if (activity != null) {
                m10061y(activity, metaPath);
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.theme_apply_success, 0);
                return;
            }
            return;
        }
        if (com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode)) {
            g1.vq(contextM8026k, 2, metaPath);
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.theme_apply_success, 0);
            return;
        }
        if ("alarm".equals(resourceCode)) {
            g1.vq(contextM8026k, 4, metaPath);
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.theme_apply_success, 0);
            return;
        }
        if (InterfaceC1789q.no.equals(resourceCode)) {
            if (activity != null) {
                m10059q(activity, metaPath);
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.theme_apply_success, 0);
                return;
            }
            return;
        }
        if (!g1.was()) {
            ignoreCodeSet.add("fonts");
        }
        if (!g1.g1()) {
            ignoreCodeSet.add(InterfaceC1789q.iwp);
        }
        if ("theme".equals(resourceCode)) {
            if (!g1.zy(contextM8026k)) {
                for (String str : InterfaceC1789q.nh83) {
                    ignoreCodeSet.add(str);
                }
            }
            ignoreCodeSet.add("fonts");
            ignoreCodeSet.add(InterfaceC1789q.ta3f);
        }
        boolean zVyq = g1.vyq(resourceCode, resource, metaPath);
        if (zVyq && !g1.d8wk() && activity != null && applyThemeInfo2.isShowToastOfSuccess()) {
            ki.C6947k c6947k = new ki.C6947k(activity);
            final ApplyThemeInfo applyThemeInfo3 = applyThemeInfo2;
            c6947k.lrht(R.string.resource_apply).fu4(R.string.apply_font_tip).m25039i(android.R.attr.alertDialogIcon).dd(R.string.apply_font_btn_reboot, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    vq.x2(contextM8026k, activity, resContext, resource, applyThemeInfo3, dialogInterface, i2);
                }
            }).mcp(android.R.string.cancel, null);
            if (!"fonts".equals(resourceCode)) {
                final ApplyThemeInfo applyThemeInfo4 = applyThemeInfo2;
                c6947k.a9(R.string.apply_font_btn_exclude, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.mu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        vq.qrj(ignoreCodeSet, activity, resContext, resource, applyThemeInfo4, dialogInterface, i2);
                    }
                });
            }
            c6947k.hb();
            return;
        }
        boolean z3 = C1807g.lvui() && C1819o.m7164r(bf2.toq.toq()) && (activity == null || gc3c.ki(activity));
        if (zVyq) {
            toq toqVar = new toq(resource, applyThemeInfo, z3, observableApplyStatus);
            if ("theme".equals(resourceCode)) {
                Iterator<RelatedResource> it = resource.getSubResources().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (bwp.fn3e(it.next().getResourceCode())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                if (applyThemeInfo2.getMixIgnoreCodeSet() != null && applyThemeInfo2.getMixIgnoreCodeSet().contains("fonts")) {
                    ignoreCodeSet.add("fonts");
                }
            } else if (!"fonts".equals(resourceCode)) {
                ignoreCodeSet.add("fonts");
            }
            zyVar = toqVar;
        } else {
            zyVar = new zy();
        }
        m10058p(activity, resContext, resource, applyThemeInfo2, zyVar, observableApplyStatus);
    }

    /* JADX INFO: renamed from: g */
    public static void m10054g(final Activity context, final com.android.thememanager.fu4 resContext, final Resource resource, ApplyThemeInfo applyThemeInfo) {
        f7l8(context, resContext, resource, applyThemeInfo, null);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m10055h(@zy.lvui String contentPath, @zy.lvui String rightsPath) {
        String[] list;
        File file = new File(ThemeBugreportDumpReceiver.f8697k);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                C7794k.m28195n(f16857k, "create drm.log failed: " + e2);
            }
        }
        d8wk.qrj(file.getAbsolutePath());
        File file2 = new File(contentPath);
        File file3 = new File(rightsPath);
        if (file2.exists() && !Arrays.asList(ThemeManagerConstants.DRM_WHITE_LIST).contains(file2.getName())) {
            if (file2.isDirectory()) {
                for (File file4 : file2.listFiles()) {
                    if (!m10055h(file4.getAbsolutePath(), rightsPath)) {
                        return false;
                    }
                }
            } else {
                DrmManager.DrmResult drmResultIsLegal = DrmManager.isLegal(bf2.toq.toq(), file2, file3);
                if (drmResultIsLegal != DrmManager.DrmResult.DRM_SUCCESS) {
                    DrmManager.exportFatalLog(f16857k, "illegal theme component found: " + file2.getAbsolutePath() + " hash:" + HashUtils.getSHA1(file2) + " " + drmResultIsLegal);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checking rightFolder: ");
                    sb2.append(file3.getAbsolutePath());
                    sb.append(sb2.toString());
                    if (file3.isDirectory() && (list = file3.list()) != null) {
                        for (String str : list) {
                            sb.append(" " + str);
                        }
                    }
                    DrmManager.exportFatalLog(f16857k, sb.toString());
                    return false;
                }
            }
        }
        return true;
    }

    private static void kja0(final Activity context, final boolean isMmsRingtone) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = f16856g;
        if (jCurrentTimeMillis - j2 > 0 && jCurrentTimeMillis - j2 < 100) {
            Log.d(f16857k, "can`t showApplyMultiSimDialog by time not match.");
        } else {
            f16856g = jCurrentTimeMillis;
            new ki.C6947k(context).uv6(context.getString(R.string.multi_sim_ringtone_settings_dialog_title)).m25047s(false).m25044p(false, context.getString(R.string.multi_sim_ringtone_settings_dialog_remind_never)).m25050z(context.getString(isMmsRingtone ? R.string.multi_sim_mms_ringtone_settings_dialog_message : R.string.multi_sim_ringtone_settings_dialog_message)).x9kr(context.getString(R.string.multi_sim_ringtone_settings_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.ikck
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    vq.n7h(isMmsRingtone, context, dialogInterface, i2);
                }
            }).hb();
        }
    }

    public static boolean ld6(@zy.lvui Resource resource, @zy.dd String componentCode, @zy.lvui ApplyThemeInfo applyThemeInfo) {
        return (TextUtils.isEmpty(componentCode) || !C1792n.ni7(resource, componentCode) || applyThemeInfo.getMixIgnoreCodeSet().contains(componentCode)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public static void m10057n(final Activity context, final com.android.thememanager.fu4 resContext, final Resource resource) {
        m10054g(context, resContext, resource, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n7h(boolean z2, Activity activity, DialogInterface dialogInterface, int i2) {
        if (((miuix.appcompat.app.ki) dialogInterface).t8r()) {
            String str = z2 ? f16858n : f16859q;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
            editorEdit.putBoolean(str, false);
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m10058p(Activity context, com.android.thememanager.fu4 resContext, Resource resource, ApplyThemeInfo applyThemeInfo, Runnable lastRun, androidx.lifecycle.fti<ThemeStatus> observableApplyStatus) {
        if (com.android.thememanager.basemodule.utils.o1t.fu4()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.apply_not_support_in_second_space, 0);
            return;
        }
        if (oc.ncyb(context)) {
            return;
        }
        qrj qrjVar = new qrj(context, resContext, resource, applyThemeInfo);
        if (observableApplyStatus != null) {
            qrjVar.oc(observableApplyStatus);
        }
        if (lastRun != null) {
            qrjVar.eqxt(lastRun);
        }
        qrjVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: q */
    private static void m10059q(final Activity context, String metaPath) {
        if (TelephonyManager.getDefault().getPhoneCount() > 1) {
            if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f16858n, true)) {
                kja0(context, true);
            }
            g1.vq(context, 1024, metaPath);
            g1.vq(context, 2048, metaPath);
        }
        g1.vq(context, 16, metaPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void qrj(Set set, Activity activity, com.android.thememanager.fu4 fu4Var, Resource resource, ApplyThemeInfo applyThemeInfo, DialogInterface dialogInterface, int i2) {
        set.add("fonts");
        m10060s(activity, fu4Var, resource, applyThemeInfo, null);
        com.android.thememanager.basemodule.utils.o1t.jp0y();
        com.android.thememanager.basemodule.utils.o1t.gvn7();
    }

    /* JADX INFO: renamed from: s */
    public static void m10060s(Activity context, com.android.thememanager.fu4 resContext, Resource resource, ApplyThemeInfo applyThemeInfo, Runnable lastRun) {
        m10058p(context, resContext, resource, applyThemeInfo, lastRun, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x2(Context context, Activity activity, com.android.thememanager.fu4 fu4Var, Resource resource, ApplyThemeInfo applyThemeInfo, DialogInterface dialogInterface, int i2) {
        m10060s(activity, fu4Var, resource, applyThemeInfo, new RunnableC2814k(context));
    }

    /* JADX INFO: renamed from: y */
    public static void m10061y(final Activity context, String metaPath) {
        if (TelephonyManager.getDefault().getPhoneCount() > 1) {
            if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f16859q, true)) {
                kja0(context, false);
            }
            g1.vq(context, 64, metaPath);
            g1.vq(context, 128, metaPath);
        }
        g1.vq(context, 1, metaPath);
    }
}
