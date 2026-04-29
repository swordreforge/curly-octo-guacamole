package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC3449k;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.InterfaceC3612m;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ConcatenatingMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 extends f7l8<C3609n> {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final tfm f65415ab = new tfm.zy().eqxt(Uri.EMPTY).m13065k();

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f65416bo = 2;

    /* JADX INFO: renamed from: d */
    private static final int f21568d = 4;

    /* JADX INFO: renamed from: u */
    private static final int f21569u = 1;

    /* JADX INFO: renamed from: v */
    private static final int f21570v = 3;

    /* JADX INFO: renamed from: w */
    private static final int f21571w = 5;

    /* JADX INFO: renamed from: x */
    private static final int f21572x = 0;

    /* JADX INFO: renamed from: a */
    private InterfaceC3612m f21573a;

    /* JADX INFO: renamed from: b */
    private Set<C3610q> f21574b;

    /* JADX INFO: renamed from: c */
    private final Map<Object, C3609n> f21575c;

    /* JADX INFO: renamed from: e */
    private final Set<C3609n> f21576e;

    /* JADX INFO: renamed from: f */
    private final IdentityHashMap<jk, C3609n> f21577f;

    /* JADX INFO: renamed from: j */
    private final boolean f21578j;

    /* JADX INFO: renamed from: l */
    private final List<C3609n> f21579l;

    /* JADX INFO: renamed from: m */
    private boolean f21580m;

    /* JADX INFO: renamed from: o */
    private final boolean f21581o;

    /* JADX INFO: renamed from: r */
    @zy.o1t("this")
    @zy.dd
    private Handler f21582r;

    /* JADX INFO: renamed from: t */
    @zy.o1t("this")
    private final Set<C3610q> f21583t;

    /* JADX INFO: renamed from: z */
    @zy.o1t("this")
    private final List<C3609n> f21584z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ld6$g */
    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    private static final class C3607g<T> {

        /* JADX INFO: renamed from: k */
        public final int f21585k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final T f65417toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        public final C3610q f65418zy;

        public C3607g(int i2, T t2, @zy.dd C3610q c3610q) {
            this.f21585k = i2;
            this.f65417toq = t2;
            this.f65418zy = c3610q;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ld6$n */
    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    static final class C3609n {

        /* JADX INFO: renamed from: g */
        public boolean f21586g;

        /* JADX INFO: renamed from: k */
        public final o1t f21587k;

        /* JADX INFO: renamed from: n */
        public int f21588n;

        /* JADX INFO: renamed from: q */
        public int f21589q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final List<fti.C3596k> f65420zy = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final Object f65419toq = new Object();

        public C3609n(fti ftiVar, boolean z2) {
            this.f21587k = new o1t(ftiVar, z2);
        }

        /* JADX INFO: renamed from: k */
        public void m12752k(int i2, int i3) {
            this.f21589q = i2;
            this.f21588n = i3;
            this.f21586g = false;
            this.f65420zy.clear();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ld6$q */
    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    private static final class C3610q {

        /* JADX INFO: renamed from: k */
        private final Handler f21590k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Runnable f65421toq;

        public C3610q(Handler handler, Runnable runnable) {
            this.f21590k = handler;
            this.f65421toq = runnable;
        }

        /* JADX INFO: renamed from: k */
        public void m12753k() {
            this.f21590k.post(this.f65421toq);
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    private static final class toq extends AbstractC3449k {

        /* JADX INFO: renamed from: c */
        private final HashMap<Object, Integer> f21591c;

        /* JADX INFO: renamed from: f */
        private final Object[] f21592f;

        /* JADX INFO: renamed from: i */
        private final int f21593i;

        /* JADX INFO: renamed from: l */
        private final pc[] f21594l;

        /* JADX INFO: renamed from: r */
        private final int[] f21595r;

        /* JADX INFO: renamed from: t */
        private final int[] f21596t;

        /* JADX INFO: renamed from: z */
        private final int f21597z;

        public toq(Collection<C3609n> collection, InterfaceC3612m interfaceC3612m, boolean z2) {
            super(z2, interfaceC3612m);
            int size = collection.size();
            this.f21596t = new int[size];
            this.f21595r = new int[size];
            this.f21594l = new pc[size];
            this.f21592f = new Object[size];
            this.f21591c = new HashMap<>();
            int iZurt = 0;
            int iQrj = 0;
            int i2 = 0;
            for (C3609n c3609n : collection) {
                this.f21594l[i2] = c3609n.f21587k.m12811f();
                this.f21595r[i2] = iZurt;
                this.f21596t[i2] = iQrj;
                iZurt += this.f21594l[i2].zurt();
                iQrj += this.f21594l[i2].qrj();
                Object[] objArr = this.f21592f;
                Object obj = c3609n.f65419toq;
                objArr[i2] = obj;
                this.f21591c.put(obj, Integer.valueOf(i2));
                i2++;
            }
            this.f21593i = iZurt;
            this.f21597z = iQrj;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected pc d2ok(int i2) {
            return this.f21594l[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int d3(int i2) {
            return this.f21595r[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected Object fti(int i2) {
            return this.f21592f[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int gvn7(int i2) {
            return this.f21596t[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int mcp(int i2) {
            return com.google.android.exoplayer2.util.lrht.m13670s(this.f21595r, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.pc
        public int qrj() {
            return this.f21597z;
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        /* JADX INFO: renamed from: t */
        protected int mo12146t(int i2) {
            return com.google.android.exoplayer2.util.lrht.m13670s(this.f21596t, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractC3449k
        protected int wvg(Object obj) {
            Integer num = this.f21591c.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.pc
        public int zurt() {
            return this.f21593i;
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    private static final class zy extends AbstractC3605k {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.source.fti
        /* JADX INFO: renamed from: g */
        public void mo12564g(jk jkVar) {
        }

        @Override // com.google.android.exoplayer2.source.fti
        /* JADX INFO: renamed from: k */
        public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.AbstractC3605k
        protected void mcp() {
        }

        @Override // com.google.android.exoplayer2.source.fti
        /* JADX INFO: renamed from: n */
        public tfm mo12566n() {
            return ld6.f65415ab;
        }

        @Override // com.google.android.exoplayer2.source.fti
        public void n7h() {
        }

        @Override // com.google.android.exoplayer2.source.AbstractC3605k
        protected void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        }
    }

    public ld6(fti... ftiVarArr) {
        this(false, ftiVarArr);
    }

    private synchronized void a98o(Set<C3610q> set) {
        Iterator<C3610q> it = set.iterator();
        while (it.hasNext()) {
            it.next().m12753k();
        }
        this.f21583t.removeAll(set);
    }

    @zy.o1t("this")
    @zy.dd
    private C3610q bf2(@zy.dd Handler handler, @zy.dd Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C3610q c3610q = new C3610q(handler, runnable);
        this.f21583t.add(c3610q);
        return c3610q;
    }

    private static Object c8jq(C3609n c3609n, Object obj) {
        return AbstractC3449k.jp0y(c3609n.f65419toq, obj);
    }

    private void ch(C3609n c3609n) {
        this.f21576e.add(c3609n);
        jp0y(c3609n);
    }

    private void gbni() {
        zsr0(null);
    }

    private Handler gyi() {
        return (Handler) C3844k.f7l8(this.f21582r);
    }

    private void i1() {
        Iterator<C3609n> it = this.f21576e.iterator();
        while (it.hasNext()) {
            C3609n next = it.next();
            if (next.f65420zy.isEmpty()) {
                fti(next);
                it.remove();
            }
        }
    }

    private void ikck(C3609n c3609n) {
        if (c3609n.f21586g && c3609n.f65420zy.isEmpty()) {
            this.f21576e.remove(c3609n);
            x9kr(c3609n);
        }
    }

    private void lrht(int i2, C3609n c3609n) {
        if (i2 > 0) {
            C3609n c3609n2 = this.f21579l.get(i2 - 1);
            c3609n.m12752k(i2, c3609n2.f21588n + c3609n2.f21587k.m12811f().zurt());
        } else {
            c3609n.m12752k(i2, 0);
        }
        y9n(i2, 1, c3609n.f21587k.m12811f().zurt());
        this.f21579l.add(i2, c3609n);
        this.f21575c.put(c3609n.f65419toq, c3609n);
        dd(c3609n, c3609n.f21587k);
        if (o1t() && this.f21577f.isEmpty()) {
            this.f21576e.add(c3609n);
        } else {
            fti(c3609n);
        }
    }

    private static Object lv5(Object obj) {
        return AbstractC3449k.jk(obj);
    }

    @zy.o1t("this")
    /* JADX INFO: renamed from: m */
    private void m12743m(int i2, Collection<fti> collection, @zy.dd Handler handler, @zy.dd Runnable runnable) {
        C3844k.m13629k((handler == null) == (runnable == null));
        Handler handler2 = this.f21582r;
        Iterator<fti> it = collection.iterator();
        while (it.hasNext()) {
            C3844k.f7l8(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<fti> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C3609n(it2.next(), this.f21581o));
        }
        this.f21584z.addAll(i2, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new C3607g(i2, arrayList, bf2(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void m4() {
        this.f21580m = false;
        Set<C3610q> set = this.f21574b;
        this.f21574b = new HashSet();
        m12741t(new toq(this.f21579l, this.f21573a, this.f21578j));
        gyi().obtainMessage(5, set).sendToTarget();
    }

    /* JADX INFO: renamed from: o */
    private void m12744o(int i2, Collection<C3609n> collection) {
        Iterator<C3609n> it = collection.iterator();
        while (it.hasNext()) {
            lrht(i2, it.next());
            i2++;
        }
    }

    @zy.o1t("this")
    private void py(InterfaceC3612m interfaceC3612m, @zy.dd Handler handler, @zy.dd Runnable runnable) {
        C3844k.m13629k((handler == null) == (runnable == null));
        Handler handler2 = this.f21582r;
        if (handler2 != null) {
            int iDr = dr();
            if (interfaceC3612m.getLength() != iDr) {
                interfaceC3612m = interfaceC3612m.mo12768n().f7l8(0, iDr);
            }
            handler2.obtainMessage(3, new C3607g(0, interfaceC3612m, bf2(handler, runnable))).sendToTarget();
            return;
        }
        if (interfaceC3612m.getLength() > 0) {
            interfaceC3612m = interfaceC3612m.mo12768n();
        }
        this.f21573a = interfaceC3612m;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    @zy.o1t("this")
    private void qkj8(int i2, int i3, @zy.dd Handler handler, @zy.dd Runnable runnable) {
        C3844k.m13629k((handler == null) == (runnable == null));
        Handler handler2 = this.f21582r;
        List<C3609n> list = this.f21584z;
        list.add(i3, list.remove(i2));
        if (handler2 != null) {
            handler2.obtainMessage(2, new C3607g(i2, Integer.valueOf(i3), bf2(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void r8s8(C3609n c3609n, pc pcVar) {
        if (c3609n.f21589q + 1 < this.f21579l.size()) {
            int iZurt = pcVar.zurt() - (this.f21579l.get(c3609n.f21589q + 1).f21588n - c3609n.f21588n);
            if (iZurt != 0) {
                y9n(c3609n.f21589q + 1, 0, iZurt);
            }
        }
        gbni();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public boolean m12745v(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            C3607g c3607g = (C3607g) com.google.android.exoplayer2.util.lrht.ld6(message.obj);
            this.f21573a = this.f21573a.f7l8(c3607g.f21585k, ((Collection) c3607g.f65417toq).size());
            m12744o(c3607g.f21585k, (Collection) c3607g.f65417toq);
            zsr0(c3607g.f65418zy);
        } else if (i2 == 1) {
            C3607g c3607g2 = (C3607g) com.google.android.exoplayer2.util.lrht.ld6(message.obj);
            int i3 = c3607g2.f21585k;
            int iIntValue = ((Integer) c3607g2.f65417toq).intValue();
            if (i3 == 0 && iIntValue == this.f21573a.getLength()) {
                this.f21573a = this.f21573a.mo12768n();
            } else {
                this.f21573a = this.f21573a.mo12767k(i3, iIntValue);
            }
            for (int i4 = iIntValue - 1; i4 >= i3; i4--) {
                wo(i4);
            }
            zsr0(c3607g2.f65418zy);
        } else if (i2 == 2) {
            C3607g c3607g3 = (C3607g) com.google.android.exoplayer2.util.lrht.ld6(message.obj);
            InterfaceC3612m interfaceC3612m = this.f21573a;
            int i5 = c3607g3.f21585k;
            InterfaceC3612m interfaceC3612mMo12767k = interfaceC3612m.mo12767k(i5, i5 + 1);
            this.f21573a = interfaceC3612mMo12767k;
            this.f21573a = interfaceC3612mMo12767k.f7l8(((Integer) c3607g3.f65417toq).intValue(), 1);
            vq(c3607g3.f21585k, ((Integer) c3607g3.f65417toq).intValue());
            zsr0(c3607g3.f65418zy);
        } else if (i2 == 3) {
            C3607g c3607g4 = (C3607g) com.google.android.exoplayer2.util.lrht.ld6(message.obj);
            this.f21573a = (InterfaceC3612m) c3607g4.f65417toq;
            zsr0(c3607g4.f65418zy);
        } else if (i2 == 4) {
            m4();
        } else {
            if (i2 != 5) {
                throw new IllegalStateException();
            }
            a98o((Set) com.google.android.exoplayer2.util.lrht.ld6(message.obj));
        }
        return true;
    }

    private void vq(int i2, int i3) {
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int iZurt = this.f21579l.get(iMin).f21588n;
        List<C3609n> list = this.f21579l;
        list.add(i3, list.remove(i2));
        while (iMin <= iMax) {
            C3609n c3609n = this.f21579l.get(iMin);
            c3609n.f21589q = iMin;
            c3609n.f21588n = iZurt;
            iZurt += c3609n.f21587k.m12811f().zurt();
            iMin++;
        }
    }

    @zy.o1t("this")
    private void was(int i2, int i3, @zy.dd Handler handler, @zy.dd Runnable runnable) {
        C3844k.m13629k((handler == null) == (runnable == null));
        Handler handler2 = this.f21582r;
        com.google.android.exoplayer2.util.lrht.uj2j(this.f21584z, i2, i3);
        if (handler2 != null) {
            handler2.obtainMessage(1, new C3607g(i2, Integer.valueOf(i3), bf2(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void wo(int i2) {
        C3609n c3609nRemove = this.f21579l.remove(i2);
        this.f21575c.remove(c3609nRemove.f65419toq);
        y9n(i2, -1, -c3609nRemove.f21587k.m12811f().zurt());
        c3609nRemove.f21586g = true;
        ikck(c3609nRemove);
    }

    private static Object y2(Object obj) {
        return AbstractC3449k.a9(obj);
    }

    private void y9n(int i2, int i3, int i4) {
        while (i2 < this.f21579l.size()) {
            C3609n c3609n = this.f21579l.get(i2);
            c3609n.f21589q += i3;
            c3609n.f21588n += i4;
            i2++;
        }
    }

    private void zsr0(@zy.dd C3610q c3610q) {
        if (!this.f21580m) {
            gyi().obtainMessage(4).sendToTarget();
            this.f21580m = true;
        }
        if (c3610q != null) {
            this.f21574b.add(c3610q);
        }
    }

    public synchronized fti bo(int i2) {
        return this.f21584z.get(i2).f21587k;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m12746c(fti ftiVar, Handler handler, Runnable runnable) {
        hyr(this.f21584z.size(), ftiVar, handler, runnable);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m12747d(int i2, int i3) {
        qkj8(i2, i3, null, null);
    }

    public synchronized void d8wk(int i2, int i3) {
        was(i2, i3, null, null);
    }

    public synchronized int dr() {
        return this.f21584z.size();
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m12748e(int i2, Collection<fti> collection, Handler handler, Runnable runnable) {
        m12743m(i2, collection, handler, runnable);
    }

    public synchronized void ek5k() {
        d8wk(0, dr());
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m12749f(fti ftiVar) {
        n5r1(this.f21584z.size(), ftiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: fnq8, reason: merged with bridge method [inline-methods] */
    public void lvui(C3609n c3609n, fti ftiVar, pc pcVar) {
        r8s8(c3609n, pcVar);
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected void fu4() {
        super.fu4();
        this.f21576e.clear();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: g */
    public void mo12564g(jk jkVar) {
        C3609n c3609n = (C3609n) C3844k.f7l8(this.f21577f.remove(jkVar));
        c3609n.f21587k.mo12564g(jkVar);
        c3609n.f65420zy.remove(((C3634z) jkVar).f21762k);
        if (!this.f21577f.isEmpty()) {
            i1();
        }
        ikck(c3609n);
    }

    public synchronized void g1(int i2, int i3, Handler handler, Runnable runnable) {
        was(i2, i3, handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: h */
    public synchronized pc mo12713h() {
        return new toq(this.f21584z, this.f21573a.getLength() != this.f21584z.size() ? this.f21573a.mo12768n().f7l8(0, this.f21584z.size()) : this.f21573a, this.f21578j);
    }

    public synchronized void hb(Collection<fti> collection) {
        m12743m(this.f21584z.size(), collection, null, null);
    }

    public synchronized void hyr(int i2, fti ftiVar, Handler handler, Runnable runnable) {
        m12743m(i2, Collections.singletonList(ftiVar), handler, runnable);
    }

    public synchronized void i9jn(InterfaceC3612m interfaceC3612m) {
        py(interfaceC3612m, null, null);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m12750j(Collection<fti> collection, Handler handler, Runnable runnable) {
        m12743m(this.f21584z.size(), collection, handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: k */
    public jk mo12565k(fti.C3596k c3596k, com.google.android.exoplayer2.upstream.toq toqVar, long j2) {
        Object objY2 = y2(c3596k.f21225k);
        fti.C3596k c3596kMo12557k = c3596k.mo12557k(lv5(c3596k.f21225k));
        C3609n c3609n = this.f21575c.get(objY2);
        if (c3609n == null) {
            c3609n = new C3609n(new zy(), this.f21581o);
            c3609n.f21586g = true;
            dd(c3609n, c3609n.f21587k);
        }
        ch(c3609n);
        c3609n.f65420zy.add(c3596kMo12557k);
        C3634z c3634zMo12565k = c3609n.f21587k.mo12565k(c3596kMo12557k, toqVar, j2);
        this.f21577f.put(c3634zMo12565k, c3609n);
        i1();
        return c3634zMo12565k;
    }

    @Override // com.google.android.exoplayer2.source.fti
    public boolean kja0() {
        return false;
    }

    public synchronized void ltg8(InterfaceC3612m interfaceC3612m, Handler handler, Runnable runnable) {
        py(interfaceC3612m, handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected synchronized void mcp() {
        super.mcp();
        this.f21579l.clear();
        this.f21576e.clear();
        this.f21575c.clear();
        this.f21573a = this.f21573a.mo12768n();
        Handler handler = this.f21582r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f21582r = null;
        }
        this.f21580m = false;
        this.f21574b.clear();
        a98o(this.f21583t);
    }

    public synchronized void mu(int i2, int i3, Handler handler, Runnable runnable) {
        qkj8(i2, i3, handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: n */
    public tfm mo12566n() {
        return f65415ab;
    }

    public synchronized void n5r1(int i2, fti ftiVar) {
        m12743m(i2, Collections.singletonList(ftiVar), null, null);
    }

    public synchronized fti qo(int i2) {
        fti ftiVarBo;
        ftiVarBo = bo(i2);
        was(i2, i2 + 1, null, null);
        return ftiVarBo;
    }

    public synchronized fti tfm(int i2, Handler handler, Runnable runnable) {
        fti ftiVarBo;
        ftiVarBo = bo(i2);
        was(i2, i2 + 1, handler, runnable);
        return ftiVarBo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    @zy.dd
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public fti.C3596k gvn7(C3609n c3609n, fti.C3596k c3596k) {
        for (int i2 = 0; i2 < c3609n.f65420zy.size(); i2++) {
            if (c3609n.f65420zy.get(i2).f21227q == c3596k.f21227q) {
                return c3596k.mo12557k(c8jq(c3609n, c3596k.f21225k));
            }
        }
        return null;
    }

    public synchronized void uv6(int i2, Collection<fti> collection) {
        m12743m(i2, collection, null, null);
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    protected synchronized void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        super.wvg(uv6Var);
        this.f21582r = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f21679k.m12745v(message);
            }
        });
        if (this.f21584z.isEmpty()) {
            m4();
        } else {
            this.f21573a = this.f21573a.f7l8(0, this.f21584z.size());
            m12744o(0, this.f21584z);
            gbni();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.f7l8
    /* JADX INFO: renamed from: xwq3, reason: merged with bridge method [inline-methods] */
    public int d2ok(C3609n c3609n, int i2) {
        return i2 + c3609n.f21588n;
    }

    public synchronized void yz(Handler handler, Runnable runnable) {
        g1(0, dr(), handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.f7l8, com.google.android.exoplayer2.source.AbstractC3605k
    /* JADX INFO: renamed from: z */
    protected void mo12594z() {
    }

    public ld6(boolean z2, fti... ftiVarArr) {
        this(z2, new InterfaceC3612m.k(0), ftiVarArr);
    }

    public ld6(boolean z2, InterfaceC3612m interfaceC3612m, fti... ftiVarArr) {
        this(z2, false, interfaceC3612m, ftiVarArr);
    }

    public ld6(boolean z2, boolean z3, InterfaceC3612m interfaceC3612m, fti... ftiVarArr) {
        for (fti ftiVar : ftiVarArr) {
            C3844k.f7l8(ftiVar);
        }
        this.f21573a = interfaceC3612m.getLength() > 0 ? interfaceC3612m.mo12768n() : interfaceC3612m;
        this.f21577f = new IdentityHashMap<>();
        this.f21575c = new HashMap();
        this.f21584z = new ArrayList();
        this.f21579l = new ArrayList();
        this.f21574b = new HashSet();
        this.f21583t = new HashSet();
        this.f21576e = new HashSet();
        this.f21578j = z2;
        this.f21581o = z3;
        hb(Arrays.asList(ftiVarArr));
    }
}
