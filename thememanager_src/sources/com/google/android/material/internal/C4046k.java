package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.InterfaceC4057y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.InterfaceC7843t;
import zy.dd;
import zy.ek5k;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.k */
/* JADX INFO: compiled from: CheckableGroup.java */
/* JADX INFO: loaded from: classes2.dex */
@ek5k
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4046k<T extends InterfaceC4057y<T>> {

    /* JADX INFO: renamed from: n */
    private boolean f24547n;

    /* JADX INFO: renamed from: q */
    private boolean f24548q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private toq f67645zy;

    /* JADX INFO: renamed from: k */
    private final Map<Integer, T> f24546k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Set<Integer> f67644toq = new HashSet();

    /* JADX INFO: renamed from: com.google.android.material.internal.k$k */
    /* JADX INFO: compiled from: CheckableGroup.java */
    class k implements InterfaceC4057y.k<T> {
        k() {
        }

        @Override // com.google.android.material.internal.InterfaceC4057y.k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo14551k(T t2, boolean z2) {
            if (!z2) {
                C4046k c4046k = C4046k.this;
                if (!c4046k.m14542i(t2, c4046k.f24547n)) {
                    return;
                }
            } else if (!C4046k.this.f7l8(t2)) {
                return;
            }
            C4046k.this.n7h();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.k$toq */
    /* JADX INFO: compiled from: CheckableGroup.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo14238k(@lvui Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f7l8(@lvui InterfaceC4057y<T> interfaceC4057y) {
        int id = interfaceC4057y.getId();
        if (this.f67644toq.contains(Integer.valueOf(id))) {
            return false;
        }
        T t2 = this.f24546k.get(Integer.valueOf(ld6()));
        if (t2 != null) {
            m14542i(t2, false);
        }
        boolean zAdd = this.f67644toq.add(Integer.valueOf(id));
        if (!interfaceC4057y.isChecked()) {
            interfaceC4057y.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public boolean m14542i(@lvui InterfaceC4057y<T> interfaceC4057y, boolean z2) {
        int id = interfaceC4057y.getId();
        if (!this.f67644toq.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z2 && this.f67644toq.size() == 1 && this.f67644toq.contains(Integer.valueOf(id))) {
            interfaceC4057y.setChecked(true);
            return false;
        }
        boolean zRemove = this.f67644toq.remove(Integer.valueOf(id));
        if (interfaceC4057y.isChecked()) {
            interfaceC4057y.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h() {
        toq toqVar = this.f67645zy;
        if (toqVar != null) {
            toqVar.mo14238k(m14549s());
        }
    }

    public void cdj(boolean z2) {
        this.f24547n = z2;
    }

    /* JADX INFO: renamed from: g */
    public void m14545g(@InterfaceC7843t int i2) {
        T t2 = this.f24546k.get(Integer.valueOf(i2));
        if (t2 != null && f7l8(t2)) {
            n7h();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m14546h(@dd toq toqVar) {
        this.f67645zy = toqVar;
    }

    public void ki(boolean z2) {
        if (this.f24548q != z2) {
            this.f24548q = z2;
            m14550y();
        }
    }

    public void kja0(T t2) {
        t2.setInternalOnCheckedChangeListener(null);
        this.f24546k.remove(Integer.valueOf(t2.getId()));
        this.f67644toq.remove(Integer.valueOf(t2.getId()));
    }

    @InterfaceC7843t
    public int ld6() {
        if (!this.f24548q || this.f67644toq.isEmpty()) {
            return -1;
        }
        return this.f67644toq.iterator().next().intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public void m14547n(T t2) {
        this.f24546k.put(Integer.valueOf(t2.getId()), t2);
        if (t2.isChecked()) {
            f7l8(t2);
        }
        t2.setInternalOnCheckedChangeListener(new k());
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public List<Integer> m14548p(@lvui ViewGroup viewGroup) {
        Set<Integer> setM14549s = m14549s();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof InterfaceC4057y) && setM14549s.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public boolean qrj() {
        return this.f24548q;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public Set<Integer> m14549s() {
        return new HashSet(this.f67644toq);
    }

    public void t8r(@InterfaceC7843t int i2) {
        T t2 = this.f24546k.get(Integer.valueOf(i2));
        if (t2 != null && m14542i(t2, this.f24547n)) {
            n7h();
        }
    }

    public boolean x2() {
        return this.f24547n;
    }

    /* JADX INFO: renamed from: y */
    public void m14550y() {
        boolean z2 = !this.f67644toq.isEmpty();
        Iterator<T> it = this.f24546k.values().iterator();
        while (it.hasNext()) {
            m14542i(it.next(), false);
        }
        if (z2) {
            n7h();
        }
    }
}
