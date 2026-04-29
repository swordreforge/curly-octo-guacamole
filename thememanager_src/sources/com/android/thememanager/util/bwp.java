package com.android.thememanager.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.ExtraRingtoneManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.FileProvider;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.mine.local.view.fragment.LocalAodFragment;
import com.android.thememanager.mine.local.view.fragment.LocalIconFragment;
import com.android.thememanager.mine.local.view.fragment.LocalLargeIconFragment;
import com.android.thememanager.mine.local.view.fragment.LocalLauncherFragment;
import com.android.thememanager.mine.local.view.fragment.LocalLockStyleFragment;
import com.android.thememanager.mine.local.view.fragment.LocalMiWallpaperFragment;
import com.android.thememanager.mine.local.view.fragment.LocalResourceFragment;
import com.android.thememanager.mine.local.view.fragment.LocalThemeFragment;
import com.android.thememanager.mine.local.view.fragment.LocalWallpaperFragment;
import com.android.thememanager.settings.LocalRingFragment;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.util.ThemeAudioBatchHandler;
import java.io.File;
import miuix.appcompat.app.ki;
import miuix.hybrid.C7148k;
import miuix.provider.C7317k;
import miuix.view.C7385p;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: UIHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class bwp implements p001b.f7l8, InterfaceC1789q {

    /* JADX INFO: renamed from: k */
    private static final String f16319k = "UIHelper";

    /* JADX INFO: compiled from: UIHelper.java */
    class f7l8 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewTreeObserver.OnDrawListener f16320k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f16321q;

        /* JADX INFO: renamed from: com.android.thememanager.util.bwp$f7l8$k */
        /* JADX INFO: compiled from: UIHelper.java */
        class ViewTreeObserverOnDrawListenerC2757k implements ViewTreeObserver.OnDrawListener {

            /* JADX INFO: renamed from: k */
            boolean f16322k = true;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver f61201toq;

            /* JADX INFO: renamed from: com.android.thememanager.util.bwp$f7l8$k$k */
            /* JADX INFO: compiled from: UIHelper.java */
            class k implements Runnable {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ ViewTreeObserver.OnDrawListener f16323k;

                k(final ViewTreeObserver.OnDrawListener val$listener) {
                    this.f16323k = val$listener;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ViewTreeObserverOnDrawListenerC2757k.this.f61201toq.removeOnDrawListener(this.f16323k);
                }
            }

            ViewTreeObserverOnDrawListenerC2757k(final ViewTreeObserver val$observer) {
                this.f61201toq = val$observer;
            }

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                if (this.f16322k) {
                    this.f16322k = false;
                    f7l8.this.f16320k.onDraw();
                    f7l8.this.f16321q.post(new k(this));
                }
            }
        }

        f7l8(final ViewTreeObserver.OnDrawListener val$onDrawListener, final View val$targetView) {
            this.f16320k = val$onDrawListener;
            this.f16321q = val$targetView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(final View v2) {
            ViewTreeObserver viewTreeObserver = v2.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new ViewTreeObserverOnDrawListenerC2757k(viewTreeObserver));
            this.f16321q.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v2) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.bwp$g */
    /* JADX INFO: compiled from: UIHelper.java */
    class DialogInterfaceOnClickListenerC2758g implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C7148k f16325k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ThemeAudioBatchHandler.toq f16326q;

        DialogInterfaceOnClickListenerC2758g(final C7148k val$hybridCallback, final ThemeAudioBatchHandler.toq val$nativeCallback) {
            this.f16325k = val$hybridCallback;
            this.f16326q = val$nativeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C7148k c7148k = this.f16325k;
            if (c7148k != null) {
                c7148k.m25906k(new miuix.hybrid.o1t(100));
                return;
            }
            ThemeAudioBatchHandler.toq toqVar = this.f16326q;
            if (toqVar != null) {
                toqVar.mo8996k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.bwp$k */
    /* JADX INFO: compiled from: UIHelper.java */
    class DialogInterfaceOnClickListenerC2759k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ThemeAudioBatchHandler.toq f16327g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f16328k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C7148k f16329n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ActivityC0891q f16330q;

        DialogInterfaceOnClickListenerC2759k(final Resource val$resource, final ActivityC0891q val$activity, final C7148k val$hybridCallback, final ThemeAudioBatchHandler.toq val$nativeCallback) {
            this.f16328k = val$resource;
            this.f16330q = val$activity;
            this.f16329n = val$hybridCallback;
            this.f16327g = val$nativeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Intent intent = new Intent();
            String contentPath = this.f16328k.getContentPath();
            intent.putExtra("RESPONSE_PICKED_RESOURCE", contentPath);
            intent.putExtra("android.intent.extra.ringtone.PICKED_URI", com.android.thememanager.basemodule.utils.ek5k.m7045q(contentPath));
            this.f16330q.setResult(-1, intent);
            this.f16330q.finish();
            C7148k c7148k = this.f16329n;
            if (c7148k != null) {
                c7148k.m25906k(new miuix.hybrid.o1t(0));
                return;
            }
            ThemeAudioBatchHandler.toq toqVar = this.f16327g;
            if (toqVar != null) {
                toqVar.mo8996k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.bwp$n */
    /* JADX INFO: compiled from: UIHelper.java */
    class DialogInterfaceOnCancelListenerC2760n implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C7148k f16331k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ThemeAudioBatchHandler.toq f16332q;

        DialogInterfaceOnCancelListenerC2760n(final C7148k val$hybridCallback, final ThemeAudioBatchHandler.toq val$nativeCallback) {
            this.f16331k = val$hybridCallback;
            this.f16332q = val$nativeCallback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialog) {
            C7148k c7148k = this.f16331k;
            if (c7148k != null) {
                c7148k.m25906k(new miuix.hybrid.o1t(100));
                return;
            }
            ThemeAudioBatchHandler.toq toqVar = this.f16332q;
            if (toqVar != null) {
                toqVar.mo8996k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.bwp$q */
    /* JADX INFO: compiled from: UIHelper.java */
    class DialogInterfaceOnClickListenerC2761q implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C7148k f16333g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f16334k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ActivityC0891q f16335n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ com.android.thememanager.fu4 f16336q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ThemeAudioBatchHandler.toq f16337y;

        DialogInterfaceOnClickListenerC2761q(final Resource val$resource, final com.android.thememanager.fu4 val$resContext, final ActivityC0891q val$activity, final C7148k val$hybridCallback, final ThemeAudioBatchHandler.toq val$nativeCallback) {
            this.f16334k = val$resource;
            this.f16336q = val$resContext;
            this.f16335n = val$activity;
            this.f16333g = val$hybridCallback;
            this.f16337y = val$nativeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Intent intent = new Intent();
            String strX2 = bwp.x2(this.f16334k, this.f16336q);
            intent.putExtra("RESPONSE_PICKED_RESOURCE", strX2);
            intent.putExtra("android.intent.extra.ringtone.PICKED_URI", com.android.thememanager.basemodule.utils.ek5k.m7045q(strX2));
            this.f16336q.setCurrentUsingPath(strX2);
            this.f16335n.setResult(-1, intent);
            this.f16335n.finish();
            C7148k c7148k = this.f16333g;
            if (c7148k != null) {
                c7148k.m25906k(new miuix.hybrid.o1t(0));
                return;
            }
            ThemeAudioBatchHandler.toq toqVar = this.f16337y;
            if (toqVar != null) {
                toqVar.mo8996k();
            }
        }
    }

    /* JADX INFO: compiled from: UIHelper.java */
    class toq implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C7148k f16338k;

        toq(final C7148k val$hybridCallback) {
            this.f16338k = val$hybridCallback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialog) {
            C7148k c7148k = this.f16338k;
            if (c7148k != null) {
                c7148k.m25906k(new miuix.hybrid.o1t(100));
            }
        }
    }

    /* JADX INFO: compiled from: UIHelper.java */
    class zy implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C7148k f16339k;

        zy(final C7148k val$hybridCallback) {
            this.f16339k = val$hybridCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C7148k c7148k = this.f16339k;
            if (c7148k != null) {
                c7148k.m25906k(new miuix.hybrid.o1t(100));
            }
        }
    }

    private bwp() {
    }

    public static boolean a9(String resourceCode) {
        int iM9627h = m9627h(resourceCode);
        return iM9627h == 3 || iM9627h == 2;
    }

    public static int cdj(String resourceCode) {
        if ("ringtone".equals(resourceCode)) {
            return 1;
        }
        if (com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode)) {
            return 2;
        }
        if ("alarm".equals(resourceCode)) {
            return 4;
        }
        return "bootaudio".equals(resourceCode) ? 32 : 1;
    }

    public static void d2ok(final com.android.thememanager.fu4 resContext, final C7148k hybridCallback, final ThemeAudioBatchHandler.toq nativeCallback, final ActivityC0891q activity, final Resource resource) {
        if (resContext.isPicker()) {
            if (ki(resContext.getResourceCode())) {
                new ki.C6947k(activity).lrht(R.string.resource_title_select_ringtone).m25039i(android.R.attr.alertDialogIcon).fu4(R.string.resource_select_audio_confirm_picker).mcp(android.R.string.cancel, new DialogInterfaceOnClickListenerC2758g(hybridCallback, nativeCallback)).gvn7(new DialogInterfaceOnCancelListenerC2760n(hybridCallback, nativeCallback)).dd(android.R.string.ok, new DialogInterfaceOnClickListenerC2761q(resource, resContext, activity, hybridCallback, nativeCallback)).hb();
                return;
            }
            Intent intent = new Intent();
            String strX2 = x2(resource, resContext);
            intent.putExtra("RESPONSE_PICKED_RESOURCE", strX2);
            intent.putExtra("android.intent.extra.ringtone.PICKED_URI", com.android.thememanager.basemodule.utils.ek5k.m7045q(strX2));
            resContext.setCurrentUsingPath(strX2);
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        if (!ki(resContext.getResourceCode())) {
            resContext.setCurrentUsingPath(x2(resource, resContext));
            vq.m10057n(activity, resContext, resource);
            if (hybridCallback != null) {
                hybridCallback.m25906k(new miuix.hybrid.o1t(0));
                return;
            }
            return;
        }
        if (jk(resContext.getResourceCode())) {
            new com.android.thememanager.view.lvui(activity, hybridCallback, nativeCallback, resource).m10388h();
            return;
        }
        ki.C6947k c6947k = new ki.C6947k(activity);
        final boolean zM7176s = com.android.thememanager.basemodule.utils.o1t.m7176s(activity);
        ((zM7176s || C1902k.bq.equals(resource.getLocalId())) ? c6947k.uv6(activity.getString(R.string.resource_select_boot_audio_confirm)) : c6947k.uv6(activity.getString(R.string.boot_audio_dialog_title)).m25050z(activity.getString(R.string.boot_audio_dialog_content))).m25047s(true).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.z4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                bwp.d3(activity, resContext, resource, nativeCallback, zM7176s, dialogInterface, i2);
            }
        }).mcp(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.yqrt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                bwp.oc(nativeCallback, dialogInterface, i2);
            }
        }).gvn7(new DialogInterface.OnCancelListener() { // from class: com.android.thememanager.util.kcsr
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bwp.eqxt(nativeCallback, dialogInterface);
            }
        }).m25037g().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d3(ActivityC0891q activityC0891q, com.android.thememanager.fu4 fu4Var, Resource resource, ThemeAudioBatchHandler.toq toqVar, boolean z2, DialogInterface dialogInterface, int i2) {
        vq.m10057n(activityC0891q, fu4Var, resource);
        if (toqVar != null) {
            toqVar.mo8996k();
        }
        if (C1792n.jk()) {
            if (C1902k.bq.equals(resource.getLocalId()) && z2) {
                com.android.thememanager.basemodule.utils.o1t.m7177t(activityC0891q, false);
            } else if (!z2) {
                com.android.thememanager.basemodule.utils.o1t.m7177t(activityC0891q, true);
            }
        }
        dialogInterface.dismiss();
    }

    public static boolean dd(String resourceCode) {
        return t8r(resourceCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void eqxt(ThemeAudioBatchHandler.toq toqVar, DialogInterface dialogInterface) {
        if (toqVar != null) {
            toqVar.mo8996k();
        }
    }

    public static void f7l8(int ringtoneType, String extraRingtoneTitle, ActivityC0891q activity, String path) {
        Parcelable parcelableM7045q;
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_PICKED_RESOURCE", path);
        if (path.startsWith(C1788k.f10175k) && C1788k.m6921k()) {
            String callingPackage = activity.getCallingPackage();
            if (com.android.thememanager.basemodule.utils.ch.m7024p(callingPackage)) {
                parcelableM7045q = com.android.thememanager.basemodule.utils.ek5k.m7045q(com.android.thememanager.basemodule.utils.ch.m7025q(path));
            } else {
                Uri uriM2162g = FileProvider.m2162g(activity, com.android.thememanager.basemodule.resource.constants.toq.o9qk, new File(path));
                Log.i(f16319k, "audioApplyOrPick2, calling pkg is: " + callingPackage);
                if (!TextUtils.isEmpty(callingPackage) && uriM2162g != null) {
                    activity.grantUriPermission(callingPackage, uriM2162g, C7385p.f92248ni7);
                    intent.addFlags(C7385p.f92248ni7);
                }
                parcelableM7045q = uriM2162g;
            }
        } else {
            parcelableM7045q = com.android.thememanager.basemodule.utils.ek5k.m7045q(path);
        }
        intent.putExtra("android.intent.extra.ringtone.PICKED_URI", parcelableM7045q);
        activity.setResult(-1, intent);
        if (!C1802c.toq(activity.getIntent())) {
            activity.finish();
            return;
        }
        if (ringtoneType < 0) {
            ringtoneType = activity.getIntent().getIntExtra("android.intent.extra.ringtone.TYPE", 7);
        }
        if (extraRingtoneTitle == null) {
            extraRingtoneTitle = activity.getIntent().getStringExtra("android.intent.extra.ringtone.TITLE");
            if (TextUtils.isEmpty(extraRingtoneTitle)) {
                extraRingtoneTitle = activity.getString(R.string.component_title_ringtone);
            }
        }
        try {
            Log.i(f16319k, "saveDefaultSound,audioApply2, " + path + ", type=" + ringtoneType);
            com.android.thememanager.basemodule.utils.ld6.m7115k(ringtoneType);
            bo.m9624s(bf2.toq.toq(), ringtoneType, com.android.thememanager.basemodule.utils.ek5k.m7045q(path));
            if (4 == ringtoneType) {
                Settings.System.putString(activity.getContentResolver(), C7317k.toq.f41536k, TextUtils.isEmpty(path) ? null : path);
            }
        } catch (Exception e2) {
            Log.e(f16319k, "saveDefaultSound failed type = " + extraRingtoneTitle + " path = " + path + " error message = " + e2);
        }
    }

    public static boolean fn3e(String resourceCode) {
        return "fonts".equals(resourceCode) || "fonts_fallback".equals(resourceCode);
    }

    public static boolean fti(String resourceCode) {
        return C1792n.fti(resourceCode);
    }

    public static boolean fu4(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m9626g(com.android.thememanager.fu4 resContext, ActivityC0891q activity, String path) {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_PICKED_RESOURCE", path);
        intent.putExtra("android.intent.extra.ringtone.PICKED_URI", com.android.thememanager.basemodule.utils.ek5k.m7045q(path));
        if (activity == null) {
            Log.w(f16319k, "audioApplyOrPick: activity is null");
            return;
        }
        activity.setResult(-1, intent);
        resContext.setCurrentUsingPath(path);
        if (resContext.isMiuiRingtonePicker()) {
            f7l8(((Integer) resContext.getExtraMeta("android.intent.extra.ringtone.TYPE")).intValue(), (String) resContext.getExtraMeta("android.intent.extra.ringtone.TITLE"), activity, path);
        } else {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void gvn7(ActivityC0891q activityC0891q, Resource resource, ThemeAudioBatchHandler.toq toqVar, boolean z2, DialogInterface dialogInterface, int i2) {
        g1.m9747k(activityC0891q, resource.getContentPath());
        if (toqVar != null) {
            toqVar.mo8996k();
        }
        if (C1792n.jk()) {
            if (C1902k.bq.equals(resource.getLocalId()) && z2) {
                com.android.thememanager.basemodule.utils.o1t.m7177t(activityC0891q, false);
            } else if (!z2) {
                com.android.thememanager.basemodule.utils.o1t.m7177t(activityC0891q, true);
            }
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static int m9627h(String resourceCode) {
        if (t8r(resourceCode)) {
            return 1;
        }
        if (ni7(resourceCode)) {
            return 2;
        }
        if (ki(resourceCode)) {
            return 3;
        }
        return C1792n.m6937j(resourceCode) ? 4 : 5;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9628i(String resourceCode) {
        return "theme".equals(resourceCode) || (!InterfaceC1789q.iwp.equals(resourceCode) && ki(resourceCode)) || ni7(resourceCode);
    }

    public static boolean jk(String resourceCode) {
        return "ringtone".equals(resourceCode) || com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode) || "alarm".equals(resourceCode);
    }

    public static boolean jp0y(String resourceCode) {
        return (ki(resourceCode) || ni7(resourceCode)) ? false : true;
    }

    public static boolean ki(String resourceCode) {
        return "bootaudio".equals(resourceCode) || "ringtone".equals(resourceCode) || com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode) || "alarm".equals(resourceCode) || InterfaceC1789q.iwp.equals(resourceCode);
    }

    public static String kja0(String resourceCode) {
        if (t8r(resourceCode)) {
            return ".mtz";
        }
        if (ni7(resourceCode)) {
            return com.android.thememanager.basemodule.resource.constants.toq.ybu;
        }
        if (ki(resourceCode)) {
            return com.android.thememanager.basemodule.resource.constants.toq.pm14;
        }
        if (!C1792n.m6937j(resourceCode)) {
            fn3e(resourceCode);
        }
        return ".mtz";
    }

    public static Class<? extends Fragment> ld6(@zy.lvui String resourceCode) {
        return C1792n.wvg(resourceCode) ? LocalThemeFragment.class : C1792n.d2ok(resourceCode) ? LocalWallpaperFragment.class : C1792n.x9kr(resourceCode) ? LocalMiWallpaperFragment.class : C1792n.dd(resourceCode) ? LocalLockStyleFragment.class : C1792n.eqxt(resourceCode) ? LocalIconFragment.class : C1792n.hb(resourceCode) ? com.android.thememanager.activity.ktq.class : C1792n.m6949z(resourceCode) ? LocalRingFragment.class : C1792n.fu4(resourceCode) ? LocalAodFragment.class : C1792n.lvui(resourceCode) ? LocalLargeIconFragment.class : C1792n.m6945r(resourceCode) ? LocalLauncherFragment.class : (C1792n.uv6(resourceCode) || C1792n.m6939l(resourceCode) || C1792n.mcp(resourceCode) || C1792n.m6945r(resourceCode) || C1792n.o1t(resourceCode)) ? LocalResourceFragment.class : com.android.thememanager.activity.bz2.class;
    }

    public static void lvui(String resCode, final C7148k hybridCallback, final ThemeAudioBatchHandler.toq nativeCallback, final ActivityC0891q activity, final Resource resource, boolean isLongRingtone) {
        if (C1802c.zy(activity.getIntent())) {
            if (ki(resCode)) {
                new ki.C6947k(activity).lrht(R.string.resource_title_select_ringtone).m25039i(android.R.attr.alertDialogIcon).fu4(R.string.resource_select_audio_confirm_picker).mcp(android.R.string.cancel, new zy(hybridCallback)).gvn7(new toq(hybridCallback)).dd(android.R.string.ok, new DialogInterfaceOnClickListenerC2759k(resource, activity, hybridCallback, nativeCallback)).hb();
                return;
            }
            Intent intent = new Intent();
            String contentPath = resource.getContentPath();
            intent.putExtra("RESPONSE_PICKED_RESOURCE", contentPath);
            intent.putExtra("android.intent.extra.ringtone.PICKED_URI", com.android.thememanager.basemodule.utils.ek5k.m7045q(contentPath));
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        if (!ki(resCode)) {
            C2320q.x2(activity, resource.getContentPath());
            if (hybridCallback != null) {
                hybridCallback.m25906k(new miuix.hybrid.o1t(0));
                return;
            }
            return;
        }
        if (jk(resCode)) {
            new com.android.thememanager.view.lvui(activity, hybridCallback, nativeCallback, resource, isLongRingtone).m10388h();
            return;
        }
        ki.C6947k c6947k = new ki.C6947k(activity);
        final boolean zM7176s = com.android.thememanager.basemodule.utils.o1t.m7176s(activity);
        ((zM7176s || C1902k.bq.equals(resource.getLocalId())) ? c6947k.uv6(activity.getString(R.string.resource_select_boot_audio_confirm)) : c6947k.uv6(activity.getString(R.string.boot_audio_dialog_title)).m25050z(activity.getString(R.string.boot_audio_dialog_content))).m25047s(true).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.w831
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                bwp.gvn7(activity, resource, nativeCallback, zM7176s, dialogInterface, i2);
            }
        }).mcp(android.R.string.cancel, null).m25037g().show();
    }

    public static boolean mcp(String resourceCode) {
        return true;
    }

    public static String n7h(com.android.thememanager.fu4 resContext) {
        String resourceCode = resContext.getResourceCode();
        if (jk(resourceCode)) {
            int iIntValue = ((Integer) resContext.getExtraMeta("android.intent.extra.ringtone.TYPE", 1)).intValue();
            return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 4 ? resourceCode : "alarm" : com.android.thememanager.basemodule.analysis.toq.mle : "ringtone";
        }
        if (!ni7(resourceCode)) {
            return resourceCode;
        }
        String str = (String) resContext.getExtraMeta(InterfaceC1357q.f53952vep5, "wallpaper");
        return com.android.thememanager.basemodule.utils.bf2.f57718qrj.equals(str) ? "lockscreen" : "wallpaper".equals(str) ? "wallpaper" : resourceCode;
    }

    public static boolean ni7(String resourceCode) {
        return "wallpaper".equals(resourceCode) || "lockscreen".equals(resourceCode);
    }

    public static boolean o1t(String resourceCode) {
        return "miwallpaper".equals(resourceCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void oc(ThemeAudioBatchHandler.toq toqVar, DialogInterface dialogInterface, int i2) {
        if (toqVar != null) {
            toqVar.mo8996k();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static int m9631p(String resourceCode) {
        if ("theme".equals(resourceCode) || "framework".equals(resourceCode) || "bootanimation".equals(resourceCode) || "mms".equals(resourceCode) || InterfaceC1789q.yb3p.equals(resourceCode) || InterfaceC1789q.qwyf.equals(resourceCode) || InterfaceC1789q.gx2z.equals(resourceCode) || "launcher".equals(resourceCode) || "miwallpaper".equals(resourceCode) || "alarmscreen".equals(resourceCode)) {
            return 7;
        }
        if ("lockscreen".equals(resourceCode) || "wallpaper".equals(resourceCode)) {
            return 9;
        }
        if (fn3e(resourceCode)) {
            return 4;
        }
        if ("icons".equals(resourceCode) || zurt(resourceCode)) {
            return 5;
        }
        if (ki(resourceCode)) {
            return 2;
        }
        if ("aod".equals(resourceCode)) {
            return 10;
        }
        return "largeicons".equals(resourceCode) ? 12 : 1;
    }

    public static int qrj(String resourceCode) {
        return m9631p(resourceCode) == 7 ? 100 : 0;
    }

    /* JADX INFO: renamed from: r */
    public static void m9633r(final View targetView, final ViewTreeObserver.OnDrawListener onDrawListener) {
        if (targetView == null || onDrawListener == null) {
            return;
        }
        f7l8 f7l8Var = new f7l8(onDrawListener, targetView);
        targetView.addOnAttachStateChangeListener(f7l8Var);
        if (targetView.isAttachedToWindow()) {
            f7l8Var.onViewAttachedToWindow(targetView);
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m9634s(Context context, String code) {
        if ("ringtone".equals(code)) {
            return com.android.thememanager.basemodule.utils.ek5k.toq(RingtoneManager.getActualDefaultRingtoneUri(context, 1));
        }
        if (com.android.thememanager.basemodule.analysis.toq.mle.equals(code)) {
            return com.android.thememanager.basemodule.utils.ek5k.toq(RingtoneManager.getActualDefaultRingtoneUri(context, 2));
        }
        if ("alarm".equals(code)) {
            return com.android.thememanager.basemodule.utils.ek5k.toq(RingtoneManager.getActualDefaultRingtoneUri(context, 4));
        }
        if (InterfaceC1789q.no.equals(code)) {
            return com.android.thememanager.basemodule.utils.ek5k.toq(ExtraRingtoneManager.getDefaultSoundActualUri(context, 16));
        }
        String strNi7 = com.android.thememanager.basemodule.utils.vyq.ni7(code);
        if (TextUtils.isEmpty(strNi7) && !"bootaudio".equals(code)) {
            if (InterfaceC1789q.gx2z.equals(code) && com.android.thememanager.basemodule.utils.vyq.ni7("splockscreen") != null) {
                return null;
            }
            if (!"launcher".equals(code) || com.android.thememanager.basemodule.utils.vyq.ni7("spwallpaper") == null) {
                return p001b.toq.t8r(code);
            }
            return null;
        }
        if ("miwallpaper".equals(code) && com.android.thememanager.basemodule.utils.bf2.zy(context) != 1) {
            return null;
        }
        if ("wallpaper".equals(code) && com.android.thememanager.basemodule.utils.bf2.zy(context) != 0) {
            return null;
        }
        if (TextUtils.equals("aod", code) && C2663k.m9269q(bf2.toq.toq()) == 1) {
            return null;
        }
        return strNi7;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m9635t(String resourceCode) {
        return (ki(resourceCode) || ni7(resourceCode)) ? false : true;
    }

    public static boolean t8r(String resourceCode) {
        return "theme".equals(resourceCode);
    }

    public static boolean wvg(String resourceCode) {
        return (ki(resourceCode) || ni7(resourceCode)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String x2(Resource r2, com.android.thememanager.fu4 resContext) {
        return TextUtils.isEmpty(r2.getContentPath()) ? com.android.thememanager.o1t.f7l8(r2, resContext) : r2.getContentPath();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9636y(Context context, String packageName) {
        try {
            context.getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m9637z(String resourceCode) {
        return (C1792n.fti(resourceCode) || ni7(resourceCode)) ? false : true;
    }

    public static boolean zurt(String resourceCode) {
        return InterfaceC1789q.ekha.equals(resourceCode) || "photoframe_2x2".equals(resourceCode) || InterfaceC1789q.w5.equals(resourceCode) || "photoframe_2x4".equals(resourceCode) || InterfaceC1789q.gun.equals(resourceCode) || "photoframe_4x4".equals(resourceCode);
    }
}
