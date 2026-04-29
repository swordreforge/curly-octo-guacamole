package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.C5625q;
import com.xiaomi.push.ek5k;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.xiaomi.clientreport.processor.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5636q implements toq {

    /* JADX INFO: renamed from: k */
    protected Context f31300k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private HashMap<String, HashMap<String, C5625q>> f73117toq;

    public C5636q(Context context) {
        this.f31300k = context;
    }

    /* JADX INFO: renamed from: g */
    public static String m19347g(C5625q c5625q) {
        return String.valueOf(c5625q.f31272k) + "#" + c5625q.f73110toq;
    }

    /* JADX INFO: renamed from: p */
    private String m19348p(C5625q c5625q) {
        String strM19349s = m19349s(c5625q);
        if (TextUtils.isEmpty(strM19349s)) {
            return null;
        }
        for (int i2 = 0; i2 < 20; i2++) {
            String str = strM19349s + i2;
            if (ek5k.f7l8(this.f31300k, str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private String m19349s(C5625q c5625q) {
        String str;
        int i2 = c5625q.f31272k;
        String str2 = c5625q.f73110toq;
        if (i2 <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i2) + "#" + str2;
        }
        File file = new File(this.f31300k.getFilesDir(), "perf");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5635n
    /* JADX INFO: renamed from: a */
    public void mo19346a() throws Throwable {
        ek5k.m20776q(this.f31300k, "perf", "perfUploading");
        File[] fileArrM20777s = ek5k.m20777s(this.f31300k, "perfUploading");
        if (fileArrM20777s == null || fileArrM20777s.length <= 0) {
            return;
        }
        for (File file : fileArrM20777s) {
            if (file != null) {
                List<String> listM19337n = f7l8.m19337n(this.f31300k, file.getAbsolutePath());
                file.delete();
                f7l8(listM19337n);
            }
        }
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5633g
    /* JADX INFO: renamed from: b */
    public void mo19342b() {
        HashMap<String, HashMap<String, C5625q>> map = this.f73117toq;
        if (map == null) {
            return;
        }
        if (map.size() > 0) {
            Iterator<String> it = this.f73117toq.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, C5625q> map2 = this.f73117toq.get(it.next());
                if (map2 != null && map2.size() > 0) {
                    C5625q[] c5625qArr = new C5625q[map2.size()];
                    map2.values().toArray(c5625qArr);
                    m19350y(c5625qArr);
                }
            }
        }
        this.f73117toq.clear();
    }

    public void f7l8(List<String> list) {
        ek5k.m20775n(this.f31300k, list);
    }

    @Override // com.xiaomi.clientreport.processor.toq
    public void toq(HashMap<String, HashMap<String, C5625q>> map) {
        this.f73117toq = map;
    }

    /* JADX INFO: renamed from: y */
    public void m19350y(C5625q[] c5625qArr) {
        String strM19348p = m19348p(c5625qArr[0]);
        if (TextUtils.isEmpty(strM19348p)) {
            return;
        }
        f7l8.f7l8(strM19348p, c5625qArr);
    }

    @Override // com.xiaomi.clientreport.processor.InterfaceC5633g
    public void zy(C5625q c5625q) {
        if ((c5625q instanceof com.xiaomi.clientreport.data.zy) && this.f73117toq != null) {
            com.xiaomi.clientreport.data.zy zyVar = (com.xiaomi.clientreport.data.zy) c5625q;
            String strM19347g = m19347g(zyVar);
            String strZy = f7l8.zy(zyVar);
            HashMap<String, C5625q> map = this.f73117toq.get(strM19347g);
            if (map == null) {
                map = new HashMap<>();
            }
            com.xiaomi.clientreport.data.zy zyVar2 = (com.xiaomi.clientreport.data.zy) map.get(strZy);
            if (zyVar2 != null) {
                zyVar.f31279s += zyVar2.f31279s;
                zyVar.f31278p += zyVar2.f31278p;
            }
            map.put(strZy, zyVar);
            this.f73117toq.put(strM19347g, map);
        }
    }
}
