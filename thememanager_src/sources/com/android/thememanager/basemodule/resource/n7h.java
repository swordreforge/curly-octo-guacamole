package com.android.thememanager.basemodule.resource;

import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1804f;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ThemePreCustHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57685f7l8 = "affa78f6-dc08-4c52-aa66-4f8025057f53";

    /* JADX INFO: renamed from: g */
    public static final String f10221g = "350369c2-880c-48f5-a749-84a0439d8dc4";

    /* JADX INFO: renamed from: h */
    private static final Map<String, String> f10222h;

    /* JADX INFO: renamed from: k */
    public static final String f10223k = "c8701ec0-5b68-4291-96a6-933b921c2db4";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f57686kja0 = "d5fd2b45-8331-43e8-b203-f0cb6cdd7ba6";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f57687ld6 = "cfd320b2-e40f-42b1-91db-1ca8e9394352";

    /* JADX INFO: renamed from: n */
    public static final String f10224n = "63325499-2113-4471-99fa-7b5a19441503";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f57688n7h = "84ad7585-2855-494c-aa45-2e783dbe8b39";

    /* JADX INFO: renamed from: p */
    public static final String f10225p = "ebfce684-1d1e-4a70-ae14-f7ca038f4d34";

    /* JADX INFO: renamed from: q */
    public static final String f10226q = "6b8971d0-853f-4eaa-b585-7bd6e6fccfed";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f57689qrj = "6ece3373-ef35-4ca5-b35f-d9a9bd7681ab";

    /* JADX INFO: renamed from: s */
    public static final String f10227s = "f2ba0de9-d970-4e1a-945d-227381adee83";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57690toq = "5b3447fc-a4f6-42d1-805d-93ab6c389c1e";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f57691x2 = "da9c5438-e95b-41f8-af80-e6f4f2264ab4";

    /* JADX INFO: renamed from: y */
    public static final String f10228y = "6def7341-30b3-427b-b702-cccdf3fa201a";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57692zy = "e75f2b02-8ac5-486f-a9a0-4f19d872d6a5";

    static {
        HashMap map = new HashMap();
        f10222h = map;
        map.put(f57687ld6, "13");
        map.put(f57691x2, "12");
        map.put(f57686kja0, "11");
        map.put(f10227s, InterfaceC1925p.jvci);
        map.put(f10225p, InterfaceC1925p.jvci);
        map.put(f57689qrj, "5");
        map.put(f57688n7h, "e10");
    }

    /* JADX INFO: renamed from: g */
    public static void m6950g(List<Resource> list) {
        Resource resourceM6951k;
        if (list == null || (resourceM6951k = m6951k()) == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                i2 = -1;
                break;
            } else if (resourceM6951k.getOnlineId().equals(list.get(i2).getOnlineId())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            list.add(1, resourceM6951k);
            return;
        }
        Resource resourceRemove = list.remove(i2);
        if (list.isEmpty()) {
            list.add(resourceRemove);
        } else {
            list.add(1, resourceRemove);
        }
    }

    /* JADX INFO: renamed from: k */
    private static Resource m6951k() {
        C1804f.toq qVar = C1804f.toq();
        if (qVar == null || !qVar.m7057h()) {
            return null;
        }
        Resource resource = new Resource();
        resource.getLocalInfo().setTitle((String) fu4.f7l8(qVar.n7h(), fu4.m7067k()));
        resource.setOnlineId(qVar.x2());
        ArrayList arrayList = new ArrayList();
        PathEntry pathEntry = new PathEntry();
        pathEntry.setLocalPath(qVar.qrj());
        arrayList.add(pathEntry);
        resource.setThumbnails(arrayList);
        return resource;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m6952n(String localId) {
        return !TextUtils.isEmpty(f10222h.get(localId));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m6953q(Resource resource) {
        return !TextUtils.isEmpty(toq(resource));
    }

    public static String toq(Resource resource) {
        if (resource != null) {
            return f10222h.get(C1792n.m6948y(resource));
        }
        return null;
    }

    public static boolean zy(Resource resource) {
        C1804f.toq qVar = C1804f.toq();
        if (resource == null || qVar == null || qVar.cdj()) {
            return false;
        }
        return qVar.m7058p().equals(resource.getParentResources().size() != 0 ? resource.getParentResources().get(0).getLocalId() : resource.getLocalId());
    }
}
