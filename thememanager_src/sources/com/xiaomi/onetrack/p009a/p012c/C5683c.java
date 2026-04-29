package com.xiaomi.onetrack.p009a.p012c;

import com.xiaomi.onetrack.p009a.C5675a;
import com.xiaomi.onetrack.p009a.p011b.C5678a;
import com.xiaomi.onetrack.p018g.C5765b;
import com.xiaomi.onetrack.p018g.C5766c;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5805q;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.c.c */
/* JADX INFO: loaded from: classes3.dex */
public class C5683c {

    /* JADX INFO: renamed from: a */
    private static final String f31617a = "AdMonitorUploader";

    /* JADX INFO: renamed from: a */
    public static void m19687a() {
        ArrayList<C5678a> arrayList;
        try {
            if (m19688b()) {
                C5804p.m20342a(f31617a, "即将读取数据库并上传数据");
                int i2 = 0;
                while (i2 <= 20) {
                    C5675a.m19649a().m19658d();
                    C5681a c5681aM19655b = C5675a.m19649a().m19655b();
                    if (c5681aM19655b != null && (arrayList = c5681aM19655b.f31612b) != null && arrayList.size() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                        for (C5678a c5678a : c5681aM19655b.f31612b) {
                            boolean zM20108b = C5765b.m20108b(c5678a.m19670c());
                            int iM19667b = c5678a.m19667b();
                            if (zM20108b) {
                                arrayList2.add(Integer.valueOf(iM19667b));
                            } else {
                                arrayList3.add(Integer.valueOf(iM19667b));
                            }
                        }
                        if (arrayList2.size() > 0) {
                            C5675a.m19649a().m19652a(arrayList2);
                        }
                        if (arrayList3.size() > 0) {
                            C5675a.m19649a().m19656b(arrayList3);
                        }
                        i2++;
                        if (c5681aM19655b.f31613c) {
                            C5804p.m20342a(f31617a, "No more ad monitor records");
                            return;
                        }
                    }
                    C5804p.m20342a(f31617a, "满足条件的adMonitor记录为空，即将返回");
                    return;
                }
            }
        } catch (Throwable th) {
            C5804p.m20342a(f31617a, "uploadData Throwable:" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m19688b() {
        if (C5805q.m20361a(f31617a)) {
            C5804p.m20342a(f31617a, "the device is not provisioned, stop poll!");
            return false;
        }
        if (!C5766c.m20110a()) {
            C5804p.m20342a(f31617a, "network is unconnected, stop poll!");
            return false;
        }
        if (C5675a.m19649a().m19659e() != 0) {
            return true;
        }
        C5804p.m20342a(f31617a, "no data remain in db, stop poll!");
        return false;
    }
}
