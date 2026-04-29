package androidx.room;

import androidx.sqlite.db.InterfaceC1176y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.p */
/* JADX INFO: compiled from: EntityInsertionAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC1136p<T> extends oc {
    public AbstractC1136p(AbstractC1141t abstractC1141t) {
        super(abstractC1141t);
    }

    public final List<Long> cdj(T[] tArr) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i2 = 0;
            for (T t2 : tArr) {
                f7l8(interfaceC1176yM5168k, t2);
                arrayList.add(i2, Long.valueOf(interfaceC1176yM5168k.mo5276v()));
                i2++;
            }
            return arrayList;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    protected abstract void f7l8(InterfaceC1176y interfaceC1176y, T t2);

    /* JADX INFO: renamed from: h */
    public final List<Long> m5170h(Collection<T> collection) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i2 = 0;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                f7l8(interfaceC1176yM5168k, it.next());
                arrayList.add(i2, Long.valueOf(interfaceC1176yM5168k.mo5276v()));
                i2++;
            }
            return arrayList;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    public final Long[] kja0(T[] tArr) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            Long[] lArr = new Long[tArr.length];
            int i2 = 0;
            for (T t2 : tArr) {
                f7l8(interfaceC1176yM5168k, t2);
                lArr[i2] = Long.valueOf(interfaceC1176yM5168k.mo5276v());
                i2++;
            }
            return lArr;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    public final long ld6(T t2) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            f7l8(interfaceC1176yM5168k, t2);
            return interfaceC1176yM5168k.mo5276v();
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    public final Long[] n7h(Collection<T> collection) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            Long[] lArr = new Long[collection.size()];
            int i2 = 0;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                f7l8(interfaceC1176yM5168k, it.next());
                lArr[i2] = Long.valueOf(interfaceC1176yM5168k.mo5276v());
                i2++;
            }
            return lArr;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5171p(T[] tArr) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            for (T t2 : tArr) {
                f7l8(interfaceC1176yM5168k, t2);
                interfaceC1176yM5168k.mo5276v();
            }
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    public final long[] qrj(T[] tArr) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            long[] jArr = new long[tArr.length];
            int i2 = 0;
            for (T t2 : tArr) {
                f7l8(interfaceC1176yM5168k, t2);
                jArr[i2] = interfaceC1176yM5168k.mo5276v();
                i2++;
            }
            return jArr;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5172s(T t2) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            f7l8(interfaceC1176yM5168k, t2);
            interfaceC1176yM5168k.mo5276v();
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    public final long[] x2(Collection<T> collection) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            long[] jArr = new long[collection.size()];
            int i2 = 0;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                f7l8(interfaceC1176yM5168k, it.next());
                jArr[i2] = interfaceC1176yM5168k.mo5276v();
                i2++;
            }
            return jArr;
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5173y(Iterable<? extends T> iterable) {
        InterfaceC1176y interfaceC1176yM5168k = m5168k();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                f7l8(interfaceC1176yM5168k, it.next());
                interfaceC1176yM5168k.mo5276v();
            }
        } finally {
            m5167g(interfaceC1176yM5168k);
        }
    }
}
