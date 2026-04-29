package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: SpreadBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class t8iq {

    /* JADX INFO: renamed from: k */
    private final ArrayList<Object> f36443k;

    public t8iq(int i2) {
        this.f36443k = new ArrayList<>(i2);
    }

    /* JADX INFO: renamed from: k */
    public void m23149k(Object obj) {
        this.f36443k.add(obj);
    }

    /* JADX INFO: renamed from: q */
    public Object[] m23150q(Object[] objArr) {
        return this.f36443k.toArray(objArr);
    }

    public void toq(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f36443k;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f36443k, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f36443k.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f36443k.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f36443k.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int zy() {
        return this.f36443k.size();
    }
}
