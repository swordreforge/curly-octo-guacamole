package com.android.thememanager.basemodule.config.model;

import android.text.TextUtils;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.mcp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001b.toq;

/* JADX INFO: loaded from: classes.dex */
public class Config implements Serializable {
    private static final long serialVersionUID = 2;
    public AbTestResult abTest_result;
    public String expIds;
    public String font_downloadUrl;
    public String font_file_hash;
    public String main_tab_sort;
    public String myPage_adTagId;
    public String myPage_detail_adTagId;
    public String partner_domain;
    public int research_satisfaction_period;
    public String research_satisfaction_url;
    public boolean video_wallpaper_mute;
    public boolean wallpaper_gallery_icon_open;
    public String wallpaper_online_library_page_id;
    public String xunfei_domain;
    public int video_wallpaper_gif_interval = -1;
    public boolean research_aod_display = true;
    public int ring_page_style = -1;
    public boolean close_self_stats = false;
    public int wallpaper_detail_page_style = 0;

    public static class AbTestResult implements Serializable {
        public String main_tab_sort;
    }

    public List<String> getCurrentTabCodeList() {
        String str = TextUtils.isEmpty(this.main_tab_sort) ? toq.f7204c : this.main_tab_sort;
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            arrayList.add(str2.trim());
        }
        return arrayList;
    }

    public String[] getPartnerDomain() {
        if (TextUtils.isEmpty(this.partner_domain)) {
            return mcp.f10361q;
        }
        String[] strArrSplit = this.partner_domain.split(",");
        String[] strArr = mcp.f10361q;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + strArrSplit.length);
        System.arraycopy(strArrSplit, 0, strArr2, strArr.length, strArrSplit.length);
        return strArr2;
    }

    public String getWallpaperOnlineLibraryTrackId() {
        return C1807g.zurt() ? toq.f7214m : TextUtils.isEmpty(this.wallpaper_online_library_page_id) ? C1807g.lvui() ? toq.f7211j : toq.f7206e : this.wallpaper_online_library_page_id;
    }

    public String[] getXunFeiDomain() {
        if (TextUtils.isEmpty(this.xunfei_domain)) {
            return mcp.f10360n;
        }
        String[] strArrSplit = this.xunfei_domain.split(",");
        String[] strArr = mcp.f10360n;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + strArrSplit.length);
        System.arraycopy(strArrSplit, 0, strArr2, strArr.length, strArrSplit.length);
        return strArr2;
    }
}
