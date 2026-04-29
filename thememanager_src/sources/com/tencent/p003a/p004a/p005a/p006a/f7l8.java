package com.tencent.p003a.p004a.p005a.p006a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: q */
    private static f7l8 f29892q;

    /* JADX INFO: renamed from: k */
    private Map<Integer, AbstractC5357g> f29893k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f72521toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Context f72522zy;

    private f7l8(Context context) {
        this.f29893k = null;
        this.f72522zy = null;
        this.f72522zy = context.getApplicationContext();
        HashMap map = new HashMap(3);
        this.f29893k = map;
        map.put(1, new C5359n(context));
        this.f29893k.put(2, new toq(context));
        this.f29893k.put(4, new C5360q(context));
    }

    /* JADX INFO: renamed from: k */
    public static synchronized f7l8 m18225k(Context context) {
        if (f29892q == null) {
            f29892q = new f7l8(context);
        }
        return f29892q;
    }

    private zy zy(List<Integer> list) {
        zy zyVarM18228n;
        if (list.size() >= 0) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                AbstractC5357g abstractC5357g = this.f29893k.get(it.next());
                if (abstractC5357g != null && (zyVarM18228n = abstractC5357g.m18228n()) != null && C5361y.f7l8(zyVarM18228n.f72524zy)) {
                    return zyVarM18228n;
                }
            }
        }
        return new zy();
    }

    /* JADX INFO: renamed from: q */
    public final zy m18226q() {
        return zy(new ArrayList(Arrays.asList(1, 2, 4)));
    }

    public final void toq(String str) {
        zy zyVarM18226q = m18226q();
        zyVarM18226q.f72524zy = str;
        if (!C5361y.m18231g(zyVarM18226q.f29895k)) {
            zyVarM18226q.f29895k = C5361y.m18232k(this.f72522zy);
        }
        if (!C5361y.m18231g(zyVarM18226q.f72523toq)) {
            zyVarM18226q.f72523toq = C5361y.m18233n(this.f72522zy);
        }
        zyVarM18226q.f29896q = System.currentTimeMillis();
        Iterator<Map.Entry<Integer, AbstractC5357g>> it = this.f29893k.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m18227k(zyVarM18226q);
        }
    }
}
