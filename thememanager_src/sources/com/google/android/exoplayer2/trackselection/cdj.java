package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.trackselection.cdj;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import com.google.android.exoplayer2.util.wvg;
import com.google.common.collect.se;
import com.google.common.collect.zkd;
import com.google.common.primitives.C4746s;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: compiled from: TrackSelectionOverrides.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj implements InterfaceC3555s {

    /* JADX INFO: renamed from: n */
    private static final int f22224n = 0;

    /* JADX INFO: renamed from: k */
    private final zkd<C3564a, zy> f22226k;

    /* JADX INFO: renamed from: q */
    public static final cdj f22225q = new cdj(zkd.of());

    /* JADX INFO: renamed from: g */
    public static final InterfaceC3555s.k<cdj> f22223g = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.trackselection.h
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return cdj.m13074g(bundle);
        }
    };

    /* JADX INFO: compiled from: TrackSelectionOverrides.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final HashMap<C3564a, zy> f22227k;

        /* JADX INFO: renamed from: k */
        public toq m13078k(zy zyVar) {
            this.f22227k.put(zyVar.f22231k, zyVar);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public toq m13079n(zy zyVar) {
            m13080q(zyVar.toq());
            this.f22227k.put(zyVar.f22231k, zyVar);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m13080q(int i2) {
            Iterator<zy> it = this.f22227k.values().iterator();
            while (it.hasNext()) {
                if (it.next().toq() == i2) {
                    it.remove();
                }
            }
            return this;
        }

        public cdj toq() {
            return new cdj(this.f22227k);
        }

        public toq zy(C3564a c3564a) {
            this.f22227k.remove(c3564a);
            return this;
        }

        public toq() {
            this.f22227k = new HashMap<>();
        }

        private toq(Map<C3564a, zy> map) {
            this.f22227k = new HashMap<>(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ cdj m13074g(Bundle bundle) {
        List listZy = C3853q.zy(zy.f22230y, bundle.getParcelableArrayList(m13076n(0)), se.of());
        zkd.toq toqVar = new zkd.toq();
        for (int i2 = 0; i2 < listZy.size(); i2++) {
            zy zyVar = (zy) listZy.get(i2);
            toqVar.mo15592q(zyVar.f22231k, zyVar);
        }
        return new cdj(toqVar.mo15589k());
    }

    /* JADX INFO: renamed from: n */
    private static String m13076n(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cdj.class != obj.getClass()) {
            return false;
        }
        return this.f22226k.equals(((cdj) obj).f22226k);
    }

    public int hashCode() {
        return this.f22226k.hashCode();
    }

    @dd
    /* JADX INFO: renamed from: q */
    public zy m13077q(C3564a c3564a) {
        return this.f22226k.get(c3564a);
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m13076n(0), C3853q.f7l8(this.f22226k.values()));
        return bundle;
    }

    public se<zy> toq() {
        return se.copyOf((Collection) this.f22226k.values());
    }

    public toq zy() {
        return new toq(this.f22226k);
    }

    private cdj(Map<C3564a, zy> map) {
        this.f22226k = zkd.copyOf((Map) map);
    }

    /* JADX INFO: compiled from: TrackSelectionOverrides.java */
    public static final class zy implements InterfaceC3555s {

        /* JADX INFO: renamed from: g */
        private static final int f22228g = 1;

        /* JADX INFO: renamed from: n */
        private static final int f22229n = 0;

        /* JADX INFO: renamed from: y */
        public static final InterfaceC3555s.k<zy> f22230y = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.trackselection.ki
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return cdj.zy.m13082q(bundle);
            }
        };

        /* JADX INFO: renamed from: k */
        public final C3564a f22231k;

        /* JADX INFO: renamed from: q */
        public final se<Integer> f22232q;

        public zy(C3564a c3564a) {
            this.f22231k = c3564a;
            se.C4520k c4520k = new se.C4520k();
            for (int i2 = 0; i2 < c3564a.f21222k; i2++) {
                c4520k.mo15569k(Integer.valueOf(i2));
            }
            this.f22232q = c4520k.mo15570n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ zy m13082q(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(zy(0));
            C3844k.f7l8(bundle2);
            C3564a c3564a = (C3564a) C3564a.f21220s.mo11492k(bundle2);
            int[] intArray = bundle.getIntArray(zy(1));
            return intArray == null ? new zy(c3564a) : new zy(c3564a, C4746s.zy(intArray));
        }

        private static String zy(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zy.class != obj.getClass()) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.f22231k.equals(zyVar.f22231k) && this.f22232q.equals(zyVar.f22232q);
        }

        public int hashCode() {
            return this.f22231k.hashCode() + (this.f22232q.hashCode() * 31);
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(zy(0), this.f22231k.toBundle());
            bundle.putIntArray(zy(1), C4746s.m16720t(this.f22232q));
            return bundle;
        }

        public int toq() {
            return wvg.x2(this.f22231k.toq(0).f23682r);
        }

        public zy(C3564a c3564a, List<Integer> list) {
            if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c3564a.f21222k)) {
                throw new IndexOutOfBoundsException();
            }
            this.f22231k = c3564a;
            this.f22232q = se.copyOf((Collection) list);
        }
    }
}
