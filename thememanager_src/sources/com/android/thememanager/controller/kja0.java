package com.android.thememanager.controller;

import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.settings.eqxt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WallpaperDataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 extends C1950s {
    public kja0(fu4 context) {
        super(context);
    }

    @Override // com.android.thememanager.controller.C1950s
    protected List<Resource> y2(String dataFolder) {
        if (!com.android.thememanager.basemodule.resource.constants.toq.trbh.equals(dataFolder)) {
            return super.y2(dataFolder);
        }
        if (!new File(dataFolder).exists()) {
            return Collections.emptyList();
        }
        List<com.android.thememanager.settings.subsettings.f7l8> listKi = eqxt.ki(false, false);
        ArrayList arrayList = new ArrayList();
        for (com.android.thememanager.settings.subsettings.f7l8 f7l8Var : listKi) {
            List<Resource> list = f7l8Var.f60866zy;
            if (list != null && list.size() > 0) {
                for (Resource resource : f7l8Var.f60866zy) {
                    if (TextUtils.equals(resource.getCategory(), this.f11062k.getResourceCode())) {
                        arrayList.add(resource);
                    }
                }
            }
        }
        return arrayList;
    }
}
