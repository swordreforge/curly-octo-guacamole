package com.android.thememanager.controller.online;

import android.content.SharedPreferences;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.y9n;
import java.util.Iterator;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.t */
/* JADX INFO: compiled from: ThemeOperationCacheHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1933t {
    LIKE("like"),
    FAVORITE("favorite");


    /* JADX INFO: renamed from: k */
    private static final String f10989k = "sync_from_server";

    /* JADX INFO: renamed from: q */
    private static final int f10991q = 50;
    private String prefName;
    private SharedPreferences sharedPreferences;

    EnumC1933t(String prefName) {
        this.prefName = prefName;
        this.sharedPreferences = C2082k.zy().toq().getSharedPreferences(prefName, 0);
    }

    public static String[] getResourceIds(Resource... resources) {
        String[] strArr = new String[resources.length];
        for (int i2 = 0; i2 < resources.length; i2++) {
            strArr[i2] = resources[i2].getOnlineId();
        }
        return strArr;
    }

    private boolean toq() {
        return this.sharedPreferences.getInt(f10989k, -1) <= 0;
    }

    private void zy(a98o.zy<Resource> totalList) {
        if (totalList == null) {
            return;
        }
        int i2 = this.sharedPreferences.getInt(f10989k, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.clear();
        Iterator<Resource> it = totalList.iterator();
        while (it.hasNext()) {
            editorEdit.putLong(it.next().getOnlineId(), jCurrentTimeMillis);
        }
        editorEdit.putInt(f10989k, i2 + 1);
        editorEdit.apply();
    }

    public void add(String... productIds) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : productIds) {
            editorEdit.putLong(str, jCurrentTimeMillis);
        }
        editorEdit.apply();
    }

    public boolean contains(Resource resource) {
        return contains(resource.getOnlineId());
    }

    public void remove(String... productIds) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        for (String str : productIds) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }

    public void syncFavoriteWithServer() {
        a98o.zy<Resource> zyVarFu4;
        y9n.m7257y();
        if (C1688q.cdj().wvg()) {
            C2965z c2965zM8001n = C2082k.zy().m8001n();
            com.android.thememanager.controller.ld6 ld6VarM7690k = c2965zM8001n.ld6(c2965zM8001n.m10536k()).m7690k();
            a98o.zy<Resource> zyVar = null;
            for (int i2 = 0; i2 < 50 && (zyVarFu4 = ld6VarM7690k.fu4(ld6.x2(i2))) != null && zyVarFu4.size() != 0; i2++) {
                if (zyVar == null) {
                    zyVar = new a98o.zy<>();
                }
                zyVar.addAll(zyVarFu4);
                if (zyVarFu4.isLast()) {
                    break;
                }
            }
            zy(zyVar);
        }
    }

    public void syncWithServerIfNeed() {
        if ("favorite".equals(this.prefName) && toq()) {
            syncFavoriteWithServer();
        }
    }

    public boolean contains(String productId) {
        return this.sharedPreferences.contains(productId);
    }
}
