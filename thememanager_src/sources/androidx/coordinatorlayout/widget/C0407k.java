package androidx.coordinatorlayout.widget;

import androidx.core.util.qrj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.coordinatorlayout.widget.k */
/* JADX INFO: compiled from: DirectedAcyclicGraph.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public final class C0407k<T> {

    /* JADX INFO: renamed from: k */
    private final qrj.InterfaceC0641k<ArrayList<T>> f3093k = new qrj.toq(10);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final androidx.collection.qrj<T, ArrayList<T>> f50029toq = new androidx.collection.qrj<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<T> f50030zy = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    private final HashSet<T> f3094q = new HashSet<>();

    @lvui
    /* JADX INFO: renamed from: g */
    private ArrayList<T> m1761g() {
        ArrayList<T> arrayListMo2983k = this.f3093k.mo2983k();
        return arrayListMo2983k == null ? new ArrayList<>() : arrayListMo2983k;
    }

    private void ld6(@lvui ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3093k.toq(arrayList);
    }

    /* JADX INFO: renamed from: n */
    private void m1762n(T t2, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t2)) {
            return;
        }
        if (hashSet.contains(t2)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t2);
        ArrayList<T> arrayList2 = this.f50029toq.get(t2);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                m1762n(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t2);
        arrayList.add(t2);
    }

    @dd
    public List f7l8(@lvui T t2) {
        return this.f50029toq.get(t2);
    }

    /* JADX INFO: renamed from: k */
    public void m1763k(@lvui T t2, @lvui T t3) {
        if (!this.f50029toq.containsKey(t2) || !this.f50029toq.containsKey(t3)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListM1761g = this.f50029toq.get(t2);
        if (arrayListM1761g == null) {
            arrayListM1761g = m1761g();
            this.f50029toq.put(t2, arrayListM1761g);
        }
        arrayListM1761g.add(t3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m1764p(@lvui T t2) {
        int size = this.f50029toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM873h = this.f50029toq.m873h(i2);
            if (arrayListM873h != null && arrayListM873h.contains(t2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m1765q(@lvui T t2) {
        return this.f50029toq.containsKey(t2);
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public ArrayList<T> m1766s() {
        this.f50030zy.clear();
        this.f3094q.clear();
        int size = this.f50029toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            m1762n(this.f50029toq.ld6(i2), this.f50030zy, this.f3094q);
        }
        return this.f50030zy;
    }

    public void toq(@lvui T t2) {
        if (this.f50029toq.containsKey(t2)) {
            return;
        }
        this.f50029toq.put(t2, null);
    }

    int x2() {
        return this.f50029toq.size();
    }

    @dd
    /* JADX INFO: renamed from: y */
    public List<T> m1767y(@lvui T t2) {
        int size = this.f50029toq.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM873h = this.f50029toq.m873h(i2);
            if (arrayListM873h != null && arrayListM873h.contains(t2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f50029toq.ld6(i2));
            }
        }
        return arrayList;
    }

    public void zy() {
        int size = this.f50029toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM873h = this.f50029toq.m873h(i2);
            if (arrayListM873h != null) {
                ld6(arrayListM873h);
            }
        }
        this.f50029toq.clear();
    }
}
