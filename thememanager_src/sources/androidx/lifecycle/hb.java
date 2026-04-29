package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: ViewModelStore.java */
/* JADX INFO: loaded from: classes.dex */
public class hb {

    /* JADX INFO: renamed from: k */
    private final HashMap<String, lrht> f5087k = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public final void m4441k() {
        Iterator<lrht> it = this.f5087k.values().iterator();
        while (it.hasNext()) {
            it.next().m4453r();
        }
        this.f5087k.clear();
    }

    /* JADX INFO: renamed from: q */
    final void m4442q(String str, lrht lrhtVar) {
        lrht lrhtVarPut = this.f5087k.put(str, lrhtVar);
        if (lrhtVarPut != null) {
            lrhtVarPut.ncyb();
        }
    }

    final lrht toq(String str) {
        return this.f5087k.get(str);
    }

    Set<String> zy() {
        return new HashSet(this.f5087k.keySet());
    }
}
