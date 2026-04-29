package com.android.thememanager.controller.strategy;

import com.android.thememanager.basemodule.resource.model.Resource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.controller.strategy.q */
/* JADX INFO: compiled from: ModifiedTimeSortStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1954q extends f7l8 {

    /* JADX INFO: renamed from: com.android.thememanager.controller.strategy.q$k */
    /* JADX INFO: compiled from: ModifiedTimeSortStrategy.java */
    class k implements Comparator<Resource> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Resource lhs, Resource rhs) {
            return Long.signum(rhs.getModifiedTime() - lhs.getModifiedTime());
        }
    }

    @Override // com.android.thememanager.controller.strategy.f7l8
    /* JADX INFO: renamed from: k */
    public List<Resource> mo7685k(List<Resource> resources) {
        Collections.sort(resources, new k());
        return resources;
    }
}
