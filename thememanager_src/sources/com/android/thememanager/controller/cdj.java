package com.android.thememanager.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.ArrayMap;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.util.m4;
import com.android.thememanager.util.mbx;
import ek5k.C6002g;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: WallpaperGalleryManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    public static final String f10839k = "wallpaperGalleryType";

    /* JADX INFO: renamed from: q */
    private static toq f10840q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57896toq = "wallpaperGalleryTypeId";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57897zy = "setWallpaperGalleryTime";

    /* JADX INFO: renamed from: com.android.thememanager.controller.cdj$k */
    /* JADX INFO: compiled from: WallpaperGalleryManager.java */
    class DialogInterfaceOnClickListenerC1899k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f10841k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Bundle f10842q;

        /* JADX INFO: renamed from: com.android.thememanager.controller.cdj$k$k */
        /* JADX INFO: compiled from: WallpaperGalleryManager.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ki f10843k;

            k(final ki val$alertDialog) {
                this.f10843k = val$alertDialog;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f10843k.t8r()) {
                    mbx.m9867h(DialogInterfaceOnClickListenerC1899k.this.f10841k, true);
                }
                DialogInterfaceOnClickListenerC1899k dialogInterfaceOnClickListenerC1899k = DialogInterfaceOnClickListenerC1899k.this;
                mbx.toq(dialogInterfaceOnClickListenerC1899k.f10841k, dialogInterfaceOnClickListenerC1899k.f10842q);
            }
        }

        DialogInterfaceOnClickListenerC1899k(final Context val$context, final Bundle val$bundle) {
            this.f10841k = val$context;
            this.f10842q = val$bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C6002g.m22240g(new k((ki) dialog));
        }
    }

    /* JADX INFO: compiled from: WallpaperGalleryManager.java */
    public interface toq {
        /* JADX INFO: renamed from: c */
        void mo6444c(Bundle result);

        void i1(Bundle result);
    }

    /* JADX INFO: renamed from: k */
    public static void m7457k(Bundle bundle) {
        if (!bundle.getBoolean(mbx.f16638y, false)) {
            toq toqVar = f10840q;
            if (toqVar != null) {
                toqVar.i1(bundle);
                return;
            }
            return;
        }
        toq toqVar2 = f10840q;
        if (toqVar2 != null) {
            toqVar2.mo6444c(bundle);
        }
        nn86.toq(bf2.toq.toq().getString(R.string.set_wallpaper_group_success, bundle.getString(mbx.f61358x2, null)), 0);
        ArrayMap arrayMap = new ArrayMap(3);
        arrayMap.put(f57896toq, bundle.getString(mbx.f61345f7l8, null));
        arrayMap.put(f10839k, bundle.getString(mbx.f61358x2, null));
        arrayMap.put(f57897zy, String.valueOf(System.currentTimeMillis()));
        m4.m9864n(arrayMap);
    }

    /* JADX INFO: renamed from: q */
    public static void m7458q() {
        f10840q = null;
    }

    public static void toq(toq newInterface) {
        f10840q = newInterface;
    }

    public static void zy(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ki.C6947k c6947k = new ki.C6947k(context);
        c6947k.m25044p(true, context.getString(R.string.dialog_show_never));
        String string = bundle.getString(mbx.f61358x2, "");
        String str = String.format(context.getString(R.string.warning_subscribe_wallpaper_group_content), string);
        int iIndexOf = str.indexOf(string);
        if (iIndexOf > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.dialog_highlight_color)), iIndexOf, string.length() + iIndexOf, 33);
            c6947k.m25050z(spannableStringBuilder);
        } else {
            c6947k.m25050z(str);
        }
        c6947k.lrht(R.string.desk_loop_will_change).m25047s(true).mcp(R.string.i_know, new DialogInterfaceOnClickListenerC1899k(context, bundle)).hb();
    }
}
