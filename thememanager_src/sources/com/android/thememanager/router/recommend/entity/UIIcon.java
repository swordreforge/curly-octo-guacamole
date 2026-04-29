package com.android.thememanager.router.recommend.entity;

import android.content.Context;
import com.android.thememanager.basemodule.utils.C1819o;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class UIIcon implements Serializable {
    private static final long serialVersionUID = 2;
    public String iconDarkModeUrl;
    public String iconUrl;
    public UILink link;
    public boolean local;
    public String title;

    public String getImageUrl(Context context) {
        String str;
        return (!C1819o.d2ok(context) || (str = this.iconDarkModeUrl) == null) ? this.iconUrl : str;
    }
}
