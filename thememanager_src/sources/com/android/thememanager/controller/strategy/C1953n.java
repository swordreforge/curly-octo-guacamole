package com.android.thememanager.controller.strategy;

import com.android.thememanager.basemodule.resource.model.Resource;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.controller.strategy.n */
/* JADX INFO: compiled from: NameSortStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1953n extends f7l8 {

    /* JADX INFO: renamed from: com.android.thememanager.controller.strategy.n$k */
    /* JADX INFO: compiled from: NameSortStrategy.java */
    class k implements Comparator<Resource> {

        /* JADX INFO: renamed from: k */
        private Collator f11091k = Collator.getInstance();

        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Resource lhs, Resource rhs) {
            if (lhs.getTitle() == null) {
                return 1;
            }
            if (rhs.getTitle() == null) {
                return -1;
            }
            return this.f11091k.compare(rhs.getTitle(), lhs.getTitle());
        }
    }

    @Override // com.android.thememanager.controller.strategy.f7l8
    /* JADX INFO: renamed from: k */
    public List<Resource> mo7685k(List<Resource> resources) {
        Collections.sort(resources, new k());
        return resources;
    }
}
