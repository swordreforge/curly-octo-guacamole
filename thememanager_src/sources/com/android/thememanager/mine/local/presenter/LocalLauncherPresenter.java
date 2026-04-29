package com.android.thememanager.mine.local.presenter;

import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.kja0;
import gbni.InterfaceC6058k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLauncherPresenter extends BaseLocalPresenter<InterfaceC6058k.toq> implements InterfaceC6058k.k<InterfaceC6058k.toq> {

    /* JADX INFO: renamed from: f */
    public static final String f12722f = "LocalLauncherPresenter";

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.presenter.LocalLauncherPresenter$k */
    class C2160k implements Comparator<Resource> {
        C2160k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Resource o1, Resource o2) {
            if (o1 == null && o2 == null) {
                return 0;
            }
            if (o1 == null) {
                return -1;
            }
            if (o2 != null && o1.getModifiedTime() <= o2.getModifiedTime()) {
                return o2.getModifiedTime() > o1.getModifiedTime() ? -1 : 0;
            }
            return 1;
        }
    }

    public LocalLauncherPresenter(boolean registerImportListener, boolean fromCustomize) {
        super(registerImportListener, fromCustomize, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.local.presenter.BaseLocalPresenter
    /* JADX INFO: renamed from: vyq */
    public void m8218c(String resourceCode) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f12708g) {
            arrayList.addAll(C2320q.jp0y());
            List<Resource> listA9 = C2320q.a9("spwallpaper", this.f12708g);
            if (listA9 != null) {
                for (Resource resource : listA9) {
                    if (C1792n.d3(resource)) {
                        if (resource.getParentResources() != null) {
                            Iterator<RelatedResource> it = resource.getParentResources().iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().getLocalId());
                            }
                        }
                        arrayList.add(resource);
                    }
                }
            }
        }
        List<Resource> listA92 = C2320q.a9("launcher", this.f12708g);
        if (listA92 != null) {
            for (Resource resource2 : listA92) {
                boolean z2 = false;
                if (resource2.getParentResources() != null) {
                    Iterator<RelatedResource> it2 = resource2.getParentResources().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (arrayList2.contains(it2.next().getLocalId())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!z2) {
                    arrayList.add(resource2);
                }
            }
        }
        List<Resource> listJk = C2320q.jk("miwallpaper");
        if (!kja0.qrj(listJk)) {
            for (Resource resource3 : listJk) {
                if ("miwallpaper".equals(C1792n.m6942o(resource3))) {
                    arrayList.add(resource3);
                }
            }
        }
        Collections.sort(arrayList, new C2160k());
        CopyOnWriteArrayList<Resource> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(arrayList);
        this.f12711n.n7h(copyOnWriteArrayList);
    }
}
