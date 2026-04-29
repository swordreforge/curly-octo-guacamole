package com.android.thememanager.share;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShareManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61063f7l8 = "WALLPAPER";

    /* JADX INFO: renamed from: g */
    private static final String f16013g = "THEME";

    /* JADX INFO: renamed from: k */
    private static final String f16014k = "ShareManager";

    /* JADX INFO: renamed from: n */
    private static final String f16015n = "wallpaperFeed/subjectPage/subjectPage?productUuid=%s";

    /* JADX INFO: renamed from: q */
    private static final String f16016q = "gh_eb6f678dbe73";

    /* JADX INFO: renamed from: s */
    private static final int f16017s = 150;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61064toq = "share_web_page";

    /* JADX INFO: renamed from: y */
    private static final String f16018y = "FONT";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f61065zy = "wx394263bf04c12659";

    public static void f7l8(Context context, String shareImageUrl, String title, String productId, String packId, String trackId, String pageId) {
        Intent intent = new Intent("android.intent.action.SEND");
        String str = String.format(InterfaceC1925p.v2k, productId) + "?miref=share&packId=" + packId;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.share_content_topic));
        sb.append(context.getResources().getString(R.string.share_content_text_first_theme, title));
        sb.append(context.getResources().getString(R.string.share_content_text_second, context.getResources().getString(R.string.share_share_suffix)));
        if (TextUtils.isEmpty(shareImageUrl)) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
        } else {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", com.android.thememanager.detail.theme.util.toq.f7l8(context, com.android.thememanager.detail.theme.util.toq.m7747n(context, productId)));
            intent.putExtra(C2702g.f16028y, 150);
            intent.putExtra(C2702g.f16026s, 150);
            intent.putExtra(C2702g.f61073gvn7, sb.toString());
        }
        intent.putExtra(C2702g.f61074jk, str);
        intent.putExtra(C2702g.f61086wvg, trackId);
        intent.putExtra(C2702g.f16027t, pageId);
        C2703k.m9445y(context, intent, zy(shareImageUrl, title, "theme", productId));
    }

    /* JADX INFO: renamed from: g */
    public static void m9435g(Context context, Uri imageUri, String title, String des, String webpageUrl, String productId, String qrCodeUrl, String trackId, String pageId) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", imageUri);
        intent.putExtra("android.intent.extra.SUBJECT", title);
        intent.putExtra("android.intent.extra.TEXT", des);
        intent.putExtra(C2702g.f61081ni7, f16016q);
        intent.putExtra(C2702g.f61072fu4, webpageUrl);
        intent.putExtra(C2702g.f16029z, String.format(f16015n, productId));
        intent.putExtra(C2702g.f61082o1t, qrCodeUrl);
        intent.putExtra(C2702g.f16028y, 150);
        intent.putExtra(C2702g.f16026s, 150);
        intent.putExtra(C2702g.f61086wvg, trackId);
        intent.putExtra(C2702g.f16027t, pageId);
        C2703k.m9445y(context, intent, m9437n(false));
    }

    /* JADX INFO: renamed from: k */
    public static String m9436k(String resourceCode) {
        if ("theme".equals(resourceCode)) {
            return bf2.toq.toq().getResources().getString(R.string.theme_component_title_all);
        }
        if ("wallpaper".equals(resourceCode)) {
            return bf2.toq.toq().getResources().getString(R.string.component_title_wallpaper);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private static Bundle m9437n(boolean miniParam) {
        Bundle bundle = new Bundle();
        bundle.putString(C2705n.f61101zy, f61065zy);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (miniParam) {
            arrayList.add(Integer.valueOf(C2706p.f61112jp0y));
            arrayList.add(Integer.valueOf(C2706p.f61110gvn7));
        } else {
            arrayList.add(Integer.valueOf(C2706p.f61102a9));
            arrayList.add(Integer.valueOf(C2706p.f61108fti));
        }
        bundle.putIntegerArrayList(C2705n.f61096ld6, arrayList);
        bundle.putBoolean(C2705n.f61098qrj, miniParam);
        return bundle;
    }

    /* JADX INFO: renamed from: q */
    private static Uri m9438q() {
        Resources resourcesM7999p = C2082k.m7999p();
        return Uri.parse(com.android.thememanager.basemodule.resource.constants.toq.hze4 + resourcesM7999p.getResourcePackageName(R.drawable.share_icon) + "/" + resourcesM7999p.getResourceTypeName(R.drawable.share_icon) + "/" + resourcesM7999p.getResourceEntryName(R.drawable.share_icon));
    }

    /* JADX INFO: renamed from: s */
    public static void m9439s(Context context, String title, String des, String webpageUrl) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", m9438q());
        intent.putExtra("android.intent.extra.SUBJECT", title);
        intent.putExtra("android.intent.extra.TEXT", des);
        intent.putExtra(C2702g.f16019g, webpageUrl);
        intent.putExtra(C2702g.f61069f7l8, -1);
        intent.putExtra(C2702g.f61086wvg, title);
        intent.putExtra(C2702g.f16027t, f61064toq);
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", "《" + title + "》" + des + webpageUrl);
        intent.putExtra(C2702g.f61068d3, intent2);
        C2703k.m9445y(context, intent, m9437n(false));
    }

    public static String toq(String componentType) {
        if ("THEME".equalsIgnoreCase(componentType)) {
            return bf2.toq.toq().getResources().getString(R.string.theme_component_title_all);
        }
        if ("WALLPAPER".equalsIgnoreCase(componentType)) {
            return bf2.toq.toq().getResources().getString(R.string.component_title_wallpaper);
        }
        if ("FONT".equalsIgnoreCase(componentType)) {
            return bf2.toq.toq().getResources().getString(R.string.theme_component_title_font);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static void m9440y(Context context, String shareImageUrl, String title, String subjectId, String productId, String trackId, String pageId, int index, boolean isSubject) {
        Intent intent = new Intent("android.intent.action.SEND");
        Object[] objArr = new Object[1];
        if (!isSubject) {
            subjectId = productId;
        }
        objArr[0] = subjectId;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getResources().getString(R.string.share_content_topic));
        sb.append(context.getResources().getString(R.string.share_content_text_first_wallpaper, title));
        sb.append(context.getResources().getString(R.string.share_content_text_second, context.getResources().getString(R.string.share_share_suffix)));
        if (TextUtils.isEmpty(shareImageUrl)) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
        } else {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", com.android.thememanager.detail.theme.util.toq.f7l8(context, com.android.thememanager.detail.theme.util.toq.m7747n(context, productId)));
            intent.putExtra(C2702g.f16028y, 70);
            intent.putExtra(C2702g.f16026s, 150);
            intent.putExtra(C2702g.f61073gvn7, sb.toString());
        }
        intent.putExtra(C2702g.f61074jk, String.format(InterfaceC1925p.io, objArr) + "&miref=share&productIndex=" + index + "&packId=" + productId + "&isSubject=" + isSubject);
        intent.putExtra(C2702g.f61086wvg, trackId);
        intent.putExtra(C2702g.f16027t, pageId);
        C2703k.m9445y(context, intent, zy(shareImageUrl, title, "wallpaper", productId));
    }

    private static Bundle zy(String shareImageUrl, String title, String resourceCode, String productId) {
        Bundle bundle = new Bundle();
        bundle.putString(C2705n.f61101zy, f61065zy);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (a9.m6999s("com.tencent.mm")) {
            arrayList.add(Integer.valueOf(C2706p.f61102a9));
            arrayList.add(Integer.valueOf(C2706p.f61108fti));
        }
        if (a9.m6999s(com.android.thememanager.detail.theme.util.toq.f11188g)) {
            arrayList.add(3);
        }
        if (a9.m6999s(com.android.thememanager.detail.theme.util.toq.f11190n)) {
            arrayList.add(4);
        }
        if (!TextUtils.isEmpty(shareImageUrl)) {
            arrayList.add(2);
        }
        arrayList.add(1);
        bundle.putIntegerArrayList(C2705n.f61096ld6, arrayList);
        bundle.putString(C2702g.f61079mcp, shareImageUrl);
        bundle.putString(C2702g.f61071fti, title);
        bundle.putString(C2702g.f61066a9, resourceCode);
        bundle.putString(C2702g.f61075jp0y, productId);
        return bundle;
    }
}
