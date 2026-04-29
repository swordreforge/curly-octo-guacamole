package com.airbnb.lottie;

import android.util.Log;
import androidx.core.util.C0639p;
import com.airbnb.lottie.utils.C1507g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PerformanceTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class uv6 {

    /* JADX INFO: renamed from: k */
    private boolean f8293k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Set<toq> f56189toq = new androidx.collection.zy();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<String, C1507g> f56190zy = new HashMap();

    /* JADX INFO: renamed from: q */
    private final Comparator<C0639p<String, Float>> f8294q = new C1513k();

    /* JADX INFO: renamed from: com.airbnb.lottie.uv6$k */
    /* JADX INFO: compiled from: PerformanceTracker.java */
    class C1513k implements Comparator<C0639p<String, Float>> {
        C1513k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(C0639p<String, Float> c0639p, C0639p<String, Float> c0639p2) {
            float fFloatValue = c0639p.f50633toq.floatValue();
            float fFloatValue2 = c0639p2.f50633toq.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: compiled from: PerformanceTracker.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m6274k(float f2);
    }

    void f7l8(boolean z2) {
        this.f8293k = z2;
    }

    /* JADX INFO: renamed from: g */
    public void m6269g(toq toqVar) {
        this.f56189toq.remove(toqVar);
    }

    /* JADX INFO: renamed from: k */
    public void m6270k(toq toqVar) {
        this.f56189toq.add(toqVar);
    }

    /* JADX INFO: renamed from: n */
    public void m6271n(String str, float f2) {
        if (this.f8293k) {
            C1507g c1507g = this.f56190zy.get(str);
            if (c1507g == null) {
                c1507g = new C1507g();
                this.f56190zy.put(str, c1507g);
            }
            c1507g.m6243k(f2);
            if (str.equals("__container")) {
                Iterator<toq> it = this.f56189toq.iterator();
                while (it.hasNext()) {
                    it.next().m6274k(f2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6272q() {
        if (this.f8293k) {
            List<C0639p<String, Float>> listZy = zy();
            Log.d(C1476n.f56118toq, "Render times:");
            for (int i2 = 0; i2 < listZy.size(); i2++) {
                C0639p<String, Float> c0639p = listZy.get(i2);
                Log.d(C1476n.f56118toq, String.format("\t\t%30s:%.2f", c0639p.f3889k, c0639p.f50633toq));
            }
        }
    }

    public void toq() {
        this.f56190zy.clear();
    }

    public List<C0639p<String, Float>> zy() {
        if (!this.f8293k) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f56190zy.size());
        for (Map.Entry<String, C1507g> entry : this.f56190zy.entrySet()) {
            arrayList.add(new C0639p(entry.getKey(), Float.valueOf(entry.getValue().toq())));
        }
        Collections.sort(arrayList, this.f8294q);
        return arrayList;
    }
}
