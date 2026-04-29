package androidx.room;

import androidx.sqlite.db.InterfaceC1176y;
import java.util.Iterator;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.s */
/* JADX INFO: compiled from: EntityDeletionOrUpdateAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC1140s<T> extends oc {
    public AbstractC1140s(AbstractC1141t abstractC1141t) {
        super(abstractC1141t);
    }

    protected abstract void f7l8(InterfaceC1176y interfaceC1176y, T t2);

    /* JADX INFO: renamed from: p */
    public final int m5179p(T[] tArr) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            int iMo5277z = 0;
            for (T t2 : tArr) {
                f7l8(interfaceC1176yM5168k, t2);
                iMo5277z += interfaceC1176yM5168k.mo5277z();
            }
            return iMo5277z;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    @Override // androidx.room.oc
    /* JADX INFO: renamed from: q */
    protected abstract String mo5169q();

    /* JADX INFO: renamed from: s */
    public final int m5180s(Iterable<? extends T> iterable) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        int iMo5277z = 0;
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                f7l8(interfaceC1176yM5168k, it.next());
                iMo5277z += interfaceC1176yM5168k.mo5277z();
            }
            return iMo5277z;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m5181y(T t2) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            f7l8(interfaceC1176yM5168k, t2);
            return interfaceC1176yM5168k.mo5277z();
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }
}
