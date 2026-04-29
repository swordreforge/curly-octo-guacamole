package com.android.thememanager.controller.strategy;

import com.android.thememanager.activity.dxef;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1804f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.controller.strategy.y */
/* JADX INFO: compiled from: SystemWallpaperSortStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1956y extends C1953n {
    @Override // com.android.thememanager.controller.strategy.C1953n, com.android.thememanager.controller.strategy.f7l8
    /* JADX INFO: renamed from: k */
    public List<Resource> mo7685k(List<Resource> resources) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1804f.toq qVar = C1804f.toq();
        for (Resource resource : resources) {
            String title = resource.getTitle();
            if (title != null) {
                boolean zStartsWith = title.startsWith("custom_");
                boolean z2 = qVar != null && title.startsWith(qVar.kja0());
                if (zStartsWith && !z2) {
                    arrayList2.add(resource);
                } else if (title.endsWith(dxef.f8986h) || title.endsWith(dxef.f8987i)) {
                    arrayList.add(resource);
                    arrayList2.add(resource);
                }
            }
        }
        resources.removeAll(arrayList2);
        arrayList.addAll(super.mo7685k(resources));
        return arrayList;
    }
}
