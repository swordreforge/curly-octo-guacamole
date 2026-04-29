package com.android.thememanager.settings.subsettings;

import android.app.Activity;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.ch;
import kotlin.collections.fu4;
import kotlin.collections.ni7;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WallpaperPageGroupsBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nWallpaperPageGroupsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallpaperPageGroupsBuilder.kt\ncom/android/thememanager/settings/subsettings/WallpaperPageGroupsBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n766#2:47\n857#2,2:48\n1549#2:50\n1620#2,3:51\n*S KotlinDebug\n*F\n+ 1 WallpaperPageGroupsBuilder.kt\ncom/android/thememanager/settings/subsettings/WallpaperPageGroupsBuilder\n*L\n37#1:47\n37#1:48,2\n37#1:50\n37#1:51,3\n*E\n"})
public final class x2 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final List<PageGroup> m9185k(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        List listD2ok = ni7.d2ok(new ch(activity.getResources().getString(R.string.wallpaper_static), 8, Boolean.FALSE), new ch(activity.getResources().getString(R.string.wallpaper_dynamic), 9, Boolean.valueOf(activity.getIntent().getBooleanExtra(com.android.thememanager.f7l8.f11609q, false))), new ch(activity.getResources().getString(R.string.de_icon_text_favorite), 12, Boolean.valueOf(activity.getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) && !C1688q.cdj().wvg())));
        ArrayList<ch> arrayList = new ArrayList();
        for (Object obj : listD2ok) {
            if (!((Boolean) ((ch) obj).getThird()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fu4.vyq(arrayList, 10));
        for (ch chVar : arrayList) {
            String str = (String) chVar.component1();
            int iIntValue = ((Number) chVar.component2()).intValue();
            PageGroup pageGroup = new PageGroup();
            Page page = new Page();
            page.setFlag(iIntValue | 0);
            pageGroup.addPage(page);
            pageGroup.setTitle(str);
            arrayList2.add(pageGroup);
        }
        return arrayList2;
    }
}
