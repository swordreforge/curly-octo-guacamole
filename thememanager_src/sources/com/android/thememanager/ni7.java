package com.android.thememanager;

import com.android.thememanager.util.bwp;

/* JADX INFO: compiled from: RecommendResourceContextManager.java */
/* JADX INFO: loaded from: classes.dex */
public class ni7 {

    /* JADX INFO: renamed from: k */
    public static final int f13436k = 100;

    /* JADX INFO: renamed from: q */
    public static int m8426q(int displayType) {
        if (displayType == 100) {
            return R.layout.resource_item_vertical_text;
        }
        return 0;
    }

    public static int toq(int displayType) {
        return displayType == 100 ? 2 : 1;
    }

    public static int zy(int displayType) {
        if (displayType == 100) {
            return R.fraction.resource_preview_ratio;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public fu4 m8427k(fu4 resContext) {
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(resContext.getResourceCode());
        fu4VarM10535g.setDisplayType(bwp.qrj(resContext.getResourceCode()));
        resContext.getExtraMeta().putAll(fu4VarM10535g.getExtraMeta());
        return fu4VarM10535g;
    }
}
