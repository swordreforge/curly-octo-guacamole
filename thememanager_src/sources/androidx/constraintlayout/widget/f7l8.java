package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: SharedValues.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f48581zy = -1;

    /* JADX INFO: renamed from: k */
    private SparseIntArray f2696k = new SparseIntArray();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<InterfaceC0393k>>> f48582toq = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.f7l8$k */
    /* JADX INFO: compiled from: SharedValues.java */
    public interface InterfaceC0393k {
        /* JADX INFO: renamed from: k */
        void mo1565k(int key, int newValue, int oldValue);
    }

    /* JADX INFO: renamed from: g */
    public void m1631g(InterfaceC0393k listener) {
        Iterator<Integer> it = this.f48582toq.keySet().iterator();
        while (it.hasNext()) {
            m1633n(it.next().intValue(), listener);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1632k(int key, InterfaceC0393k listener) {
        HashSet<WeakReference<InterfaceC0393k>> hashSet = this.f48582toq.get(Integer.valueOf(key));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f48582toq.put(Integer.valueOf(key), hashSet);
        }
        hashSet.add(new WeakReference<>(listener));
    }

    /* JADX INFO: renamed from: n */
    public void m1633n(int key, InterfaceC0393k listener) {
        HashSet<WeakReference<InterfaceC0393k>> hashSet = this.f48582toq.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<InterfaceC0393k> weakReference : hashSet) {
            InterfaceC0393k interfaceC0393k = weakReference.get();
            if (interfaceC0393k == null || interfaceC0393k == listener) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public int m1634q(int key) {
        return this.f2696k.get(key, -1);
    }

    public void toq() {
        this.f48582toq.clear();
    }

    public void zy(int key, int value) {
        int i2 = this.f2696k.get(key, -1);
        if (i2 == value) {
            return;
        }
        this.f2696k.put(key, value);
        HashSet<WeakReference<InterfaceC0393k>> hashSet = this.f48582toq.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<InterfaceC0393k>> it = hashSet.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            InterfaceC0393k interfaceC0393k = it.next().get();
            if (interfaceC0393k != null) {
                interfaceC0393k.mo1565k(key, value, i2);
            } else {
                z2 = true;
            }
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<InterfaceC0393k> weakReference : hashSet) {
                if (weakReference.get() == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }
}
