package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.source.C3634z;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MediaSourceList.java */
/* JADX INFO: loaded from: classes2.dex */
final class m4 {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f64916x2 = "MediaSourceList";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final HashMap<zy, toq> f64917f7l8;

    /* JADX INFO: renamed from: g */
    private final InterfaceC3312i.k f20623g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.upstream.uv6 f64918ld6;

    /* JADX INFO: renamed from: n */
    private final lvui.C3611k f20625n;

    /* JADX INFO: renamed from: p */
    private boolean f20626p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3456q f20627q;

    /* JADX INFO: renamed from: y */
    private final Set<zy> f20629y;

    /* JADX INFO: renamed from: s */
    private InterfaceC3612m f20628s = new InterfaceC3612m.k(0);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final IdentityHashMap<com.google.android.exoplayer2.source.jk, zy> f64919toq = new IdentityHashMap<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<Object, zy> f64920zy = new HashMap();

    /* JADX INFO: renamed from: k */
    private final List<zy> f20624k = new ArrayList();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.m4$k */
    /* JADX INFO: compiled from: MediaSourceList.java */
    private final class C3455k implements com.google.android.exoplayer2.source.lvui, InterfaceC3312i {

        /* JADX INFO: renamed from: k */
        private final zy f20631k;

        /* JADX INFO: renamed from: n */
        private InterfaceC3312i.k f20632n;

        /* JADX INFO: renamed from: q */
        private lvui.C3611k f20633q;

        public C3455k(zy zyVar) {
            this.f20633q = m4.this.f20625n;
            this.f20632n = m4.this.f20623g;
            this.f20631k = zyVar;
        }

        /* JADX INFO: renamed from: k */
        private boolean m12187k(int i2, @zy.dd fti.C3596k c3596k) {
            fti.C3596k c3596kKja0;
            if (c3596k != null) {
                c3596kKja0 = m4.kja0(this.f20631k, c3596k);
                if (c3596kKja0 == null) {
                    return false;
                }
            } else {
                c3596kKja0 = null;
            }
            int iT8r = m4.t8r(this.f20631k, i2);
            lvui.C3611k c3611k = this.f20633q;
            if (c3611k.f21599k != iT8r || !com.google.android.exoplayer2.util.lrht.zy(c3611k.f65422toq, c3596kKja0)) {
                this.f20633q = m4.this.f20625n.fti(iT8r, c3596kKja0, 0L);
            }
            InterfaceC3312i.k kVar = this.f20632n;
            if (kVar.f19660k == iT8r && com.google.android.exoplayer2.util.lrht.zy(kVar.f63617toq, c3596kKja0)) {
                return true;
            }
            this.f20632n = m4.this.f20623g.fn3e(iT8r, c3596kKja0);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.lvui
        /* JADX INFO: renamed from: a */
        public void mo11361a(int i2, @zy.dd fti.C3596k c3596k, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
            if (m12187k(i2, c3596k)) {
                this.f20633q.zurt(ni7Var, wvgVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void a9(int i2, @zy.dd fti.C3596k c3596k, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
            if (m12187k(i2, c3596k)) {
                this.f20633q.m12764t(ni7Var, wvgVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        /* JADX INFO: renamed from: b */
        public void mo11362b(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12187k(i2, c3596k)) {
                this.f20632n.m11637y();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void d3(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12187k(i2, c3596k)) {
                this.f20632n.m11636s();
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        /* JADX INFO: renamed from: i */
        public void mo11366i(int i2, @zy.dd fti.C3596k c3596k, com.google.android.exoplayer2.source.wvg wvgVar) {
            if (m12187k(i2, c3596k)) {
                this.f20633q.m12762p(wvgVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void nmn5(int i2, @zy.dd fti.C3596k c3596k, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar, IOException iOException, boolean z2) {
            if (m12187k(i2, c3596k)) {
                this.f20633q.m12765z(ni7Var, wvgVar, iOException, z2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void nn86(int i2, @zy.dd fti.C3596k c3596k, Exception exc) {
            if (m12187k(i2, c3596k)) {
                this.f20632n.x2(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void t8iq(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12187k(i2, c3596k)) {
                this.f20632n.m11635p();
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void vyq(int i2, @zy.dd fti.C3596k c3596k, com.google.android.exoplayer2.source.wvg wvgVar) {
            if (m12187k(i2, c3596k)) {
                this.f20633q.a9(wvgVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        /* JADX INFO: renamed from: x */
        public void mo11376x(int i2, @zy.dd fti.C3596k c3596k) {
            if (m12187k(i2, c3596k)) {
                this.f20632n.qrj();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3312i
        public void zp(int i2, @zy.dd fti.C3596k c3596k, int i3) {
            if (m12187k(i2, c3596k)) {
                this.f20632n.ld6(i3);
            }
        }

        @Override // com.google.android.exoplayer2.source.lvui
        public void zurt(int i2, @zy.dd fti.C3596k c3596k, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
            if (m12187k(i2, c3596k)) {
                this.f20633q.t8r(ni7Var, wvgVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.m4$q */
    /* JADX INFO: compiled from: MediaSourceList.java */
    public interface InterfaceC3456q {
        void toq();
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        public final com.google.android.exoplayer2.source.fti f20634k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final fti.toq f64921toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final C3455k f64922zy;

        public toq(com.google.android.exoplayer2.source.fti ftiVar, fti.toq toqVar, C3455k c3455k) {
            this.f20634k = ftiVar;
            this.f64921toq = toqVar;
            this.f64922zy = c3455k;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    static final class zy implements ltg8 {

        /* JADX INFO: renamed from: k */
        public final com.google.android.exoplayer2.source.o1t f20635k;

        /* JADX INFO: renamed from: n */
        public boolean f20636n;

        /* JADX INFO: renamed from: q */
        public int f20637q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final List<fti.C3596k> f64924zy = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final Object f64923toq = new Object();

        public zy(com.google.android.exoplayer2.source.fti ftiVar, boolean z2) {
            this.f20635k = new com.google.android.exoplayer2.source.o1t(ftiVar, z2);
        }

        @Override // com.google.android.exoplayer2.ltg8
        /* JADX INFO: renamed from: k */
        public Object mo12171k() {
            return this.f64923toq;
        }

        @Override // com.google.android.exoplayer2.ltg8
        public pc toq() {
            return this.f20635k.m12811f();
        }

        public void zy(int i2) {
            this.f20637q = i2;
            this.f20636n = false;
            this.f64924zy.clear();
        }
    }

    public m4(InterfaceC3456q interfaceC3456q, @zy.dd com.google.android.exoplayer2.analytics.zp zpVar, Handler handler) {
        this.f20627q = interfaceC3456q;
        lvui.C3611k c3611k = new lvui.C3611k();
        this.f20625n = c3611k;
        InterfaceC3312i.k kVar = new InterfaceC3312i.k();
        this.f20623g = kVar;
        this.f64917f7l8 = new HashMap<>();
        this.f20629y = new HashSet();
        if (zpVar != null) {
            c3611k.f7l8(handler, zpVar);
            kVar.f7l8(handler, zpVar);
        }
    }

    private static Object cdj(zy zyVar, Object obj) {
        return AbstractC3449k.jp0y(zyVar.f64923toq, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fn3e(com.google.android.exoplayer2.source.fti ftiVar, pc pcVar) {
        this.f20627q.toq();
    }

    /* JADX INFO: renamed from: h */
    private static Object m12176h(Object obj) {
        return AbstractC3449k.a9(obj);
    }

    private void jk(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            zy zyVarRemove = this.f20624k.remove(i4);
            this.f64920zy.remove(zyVarRemove.f64923toq);
            m12180y(i4, -zyVarRemove.f20635k.m12811f().zurt());
            zyVarRemove.f20636n = true;
            if (this.f20626p) {
                zurt(zyVarRemove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zy.dd
    public static fti.C3596k kja0(zy zyVar, fti.C3596k c3596k) {
        for (int i2 = 0; i2 < zyVar.f64924zy.size(); i2++) {
            if (zyVar.f64924zy.get(i2).f21227q == c3596k.f21227q) {
                return c3596k.mo12557k(cdj(zyVar, c3596k.f21225k));
            }
        }
        return null;
    }

    private void ld6(zy zyVar) {
        toq toqVar = this.f64917f7l8.get(zyVar);
        if (toqVar != null) {
            toqVar.f20634k.mo12714p(toqVar.f64921toq);
        }
    }

    private static Object n7h(Object obj) {
        return AbstractC3449k.jk(obj);
    }

    private void o1t(zy zyVar) {
        com.google.android.exoplayer2.source.o1t o1tVar = zyVar.f20635k;
        fti.toq toqVar = new fti.toq() { // from class: com.google.android.exoplayer2.r8s8
            @Override // com.google.android.exoplayer2.source.fti.toq
            /* JADX INFO: renamed from: s */
            public final void mo12410s(com.google.android.exoplayer2.source.fti ftiVar, pc pcVar) {
                this.f21192k.fn3e(ftiVar, pcVar);
            }
        };
        C3455k c3455k = new C3455k(zyVar);
        this.f64917f7l8.put(zyVar, new toq(o1tVar, toqVar, c3455k));
        o1tVar.zy(com.google.android.exoplayer2.util.lrht.wvg(), c3455k);
        o1tVar.x2(com.google.android.exoplayer2.util.lrht.wvg(), c3455k);
        o1tVar.f7l8(toqVar, this.f64918ld6);
    }

    private void qrj(zy zyVar) {
        this.f20629y.add(zyVar);
        toq toqVar = this.f64917f7l8.get(zyVar);
        if (toqVar != null) {
            toqVar.f20634k.mo12716y(toqVar.f64921toq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t8r(zy zyVar, int i2) {
        return i2 + zyVar.f20637q;
    }

    private void x2() {
        Iterator<zy> it = this.f20629y.iterator();
        while (it.hasNext()) {
            zy next = it.next();
            if (next.f64924zy.isEmpty()) {
                ld6(next);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m12180y(int i2, int i3) {
        while (i2 < this.f20624k.size()) {
            this.f20624k.get(i2).f20637q += i3;
            i2++;
        }
    }

    private void zurt(zy zyVar) {
        if (zyVar.f20636n && zyVar.f64924zy.isEmpty()) {
            toq toqVar = (toq) C3844k.f7l8(this.f64917f7l8.remove(zyVar));
            toqVar.f20634k.toq(toqVar.f64921toq);
            toqVar.f20634k.mo12715q(toqVar.f64922zy);
            toqVar.f20634k.qrj(toqVar.f64922zy);
            this.f20629y.remove(zyVar);
        }
    }

    public pc a9(List<zy> list, InterfaceC3612m interfaceC3612m) {
        jk(0, this.f20624k.size());
        return m12181g(this.f20624k.size(), list, interfaceC3612m);
    }

    public pc f7l8(@zy.dd InterfaceC3612m interfaceC3612m) {
        if (interfaceC3612m == null) {
            interfaceC3612m = this.f20628s.mo12768n();
        }
        this.f20628s = interfaceC3612m;
        jk(0, ki());
        return m12183p();
    }

    public pc fti(InterfaceC3612m interfaceC3612m) {
        int iKi = ki();
        if (interfaceC3612m.getLength() != iKi) {
            interfaceC3612m = interfaceC3612m.mo12768n().f7l8(0, iKi);
        }
        this.f20628s = interfaceC3612m;
        return m12183p();
    }

    public pc fu4(int i2, int i3, int i4, InterfaceC3612m interfaceC3612m) {
        C3844k.m13629k(i2 >= 0 && i2 <= i3 && i3 <= ki() && i4 >= 0);
        this.f20628s = interfaceC3612m;
        if (i2 == i3 || i2 == i4) {
            return m12183p();
        }
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(((i3 - i2) + i4) - 1, i3 - 1);
        int iZurt = this.f20624k.get(iMin).f20637q;
        com.google.android.exoplayer2.util.lrht.m4(this.f20624k, i2, i3, i4);
        while (iMin <= iMax) {
            zy zyVar = this.f20624k.get(iMin);
            zyVar.f20637q = iZurt;
            iZurt += zyVar.f20635k.m12811f().zurt();
            iMin++;
        }
        return m12183p();
    }

    /* JADX INFO: renamed from: g */
    public pc m12181g(int i2, List<zy> list, InterfaceC3612m interfaceC3612m) {
        if (!list.isEmpty()) {
            this.f20628s = interfaceC3612m;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zy zyVar = list.get(i3 - i2);
                if (i3 > 0) {
                    zy zyVar2 = this.f20624k.get(i3 - 1);
                    zyVar.zy(zyVar2.f20637q + zyVar2.f20635k.m12811f().zurt());
                } else {
                    zyVar.zy(0);
                }
                m12180y(i3, zyVar.f20635k.m12811f().zurt());
                this.f20624k.add(i3, zyVar);
                this.f64920zy.put(zyVar.f64923toq, zyVar);
                if (this.f20626p) {
                    o1t(zyVar);
                    if (this.f64919toq.isEmpty()) {
                        this.f20629y.add(zyVar);
                    } else {
                        ld6(zyVar);
                    }
                }
            }
        }
        return m12183p();
    }

    /* JADX INFO: renamed from: i */
    public boolean m12182i() {
        return this.f20626p;
    }

    public int ki() {
        return this.f20624k.size();
    }

    public pc mcp(int i2, int i3, InterfaceC3612m interfaceC3612m) {
        C3844k.m13629k(i2 >= 0 && i2 <= i3 && i3 <= ki());
        this.f20628s = interfaceC3612m;
        jk(i2, i3);
        return m12183p();
    }

    public pc ni7(int i2, int i3, InterfaceC3612m interfaceC3612m) {
        return fu4(i2, i2 + 1, i3, interfaceC3612m);
    }

    /* JADX INFO: renamed from: p */
    public pc m12183p() {
        if (this.f20624k.isEmpty()) {
            return pc.f21113k;
        }
        int iZurt = 0;
        for (int i2 = 0; i2 < this.f20624k.size(); i2++) {
            zy zyVar = this.f20624k.get(i2);
            zyVar.f20637q = iZurt;
            iZurt += zyVar.f20635k.m12811f().zurt();
        }
        return new jz5(this.f20624k, this.f20628s);
    }

    /* JADX INFO: renamed from: s */
    public com.google.android.exoplayer2.source.jk m12184s(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        Object objM12176h = m12176h(c3596k.f21225k);
        fti.C3596k c3596kMo12557k = c3596k.mo12557k(n7h(c3596k.f21225k));
        zy zyVar = (zy) C3844k.f7l8(this.f64920zy.get(objM12176h));
        qrj(zyVar);
        zyVar.f64924zy.add(c3596kMo12557k);
        C3634z c3634zMo12565k = zyVar.f20635k.mo12565k(c3596kMo12557k, toqVar, j2);
        this.f64919toq.put(c3634zMo12565k, zyVar);
        x2();
        return c3634zMo12565k;
    }

    /* JADX INFO: renamed from: t */
    public void m12185t(com.google.android.exoplayer2.source.jk jkVar) {
        zy zyVar = (zy) C3844k.f7l8(this.f64919toq.remove(jkVar));
        zyVar.f20635k.mo12564g(jkVar);
        zyVar.f64924zy.remove(((C3634z) jkVar).f21762k);
        if (!this.f64919toq.isEmpty()) {
            x2();
        }
        zurt(zyVar);
    }

    public void wvg() {
        for (toq toqVar : this.f64917f7l8.values()) {
            try {
                toqVar.f20634k.toq(toqVar.f64921toq);
            } catch (RuntimeException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(f64916x2, "Failed to release child source.", e2);
            }
            toqVar.f20634k.mo12715q(toqVar.f64922zy);
            toqVar.f20634k.qrj(toqVar.f64922zy);
        }
        this.f64917f7l8.clear();
        this.f20629y.clear();
        this.f20626p = false;
    }

    /* JADX INFO: renamed from: z */
    public void m12186z(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        C3844k.m13633s(!this.f20626p);
        this.f64918ld6 = uv6Var;
        for (int i2 = 0; i2 < this.f20624k.size(); i2++) {
            zy zyVar = this.f20624k.get(i2);
            o1t(zyVar);
            this.f20629y.add(zyVar);
        }
        this.f20626p = true;
    }
}
