package com.google.gson;

import com.google.gson.internal.C4899k;
import com.google.gson.internal.C4905q;
import com.google.gson.reflect.C4922k;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: GsonBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f68694f7l8;

    /* JADX INFO: renamed from: g */
    private final List<InterfaceC4928z> f27635g;

    /* JADX INFO: renamed from: h */
    private boolean f27636h;

    /* JADX INFO: renamed from: k */
    private C4905q f27637k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f68695kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f68696ld6;

    /* JADX INFO: renamed from: n */
    private final List<InterfaceC4928z> f27638n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f68697n7h;

    /* JADX INFO: renamed from: p */
    private int f27639p;

    /* JADX INFO: renamed from: q */
    private final Map<Type, InterfaceC4927y<?>> f27640q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f68698qrj;

    /* JADX INFO: renamed from: s */
    private int f27641s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ni7 f68699toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f68700x2;

    /* JADX INFO: renamed from: y */
    private String f27642y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private InterfaceC4918n f68701zy;

    public f7l8() {
        this.f27637k = C4905q.f27766h;
        this.f68699toq = ni7.DEFAULT;
        this.f68701zy = EnumC4921q.IDENTITY;
        this.f27640q = new HashMap();
        this.f27638n = new ArrayList();
        this.f27635g = new ArrayList();
        this.f68694f7l8 = false;
        this.f27641s = 2;
        this.f27639p = 2;
        this.f68696ld6 = false;
        this.f68700x2 = false;
        this.f68698qrj = true;
        this.f68697n7h = false;
        this.f68695kja0 = false;
        this.f27636h = false;
    }

    private void zy(String str, int i2, int i3, List<InterfaceC4928z> list) {
        C4917k c4917k;
        C4917k c4917k2;
        C4917k c4917k3;
        if (str != null && !"".equals(str.trim())) {
            c4917k = new C4917k((Class<? extends Date>) Date.class, str);
            c4917k2 = new C4917k((Class<? extends Date>) Timestamp.class, str);
            c4917k3 = new C4917k((Class<? extends Date>) java.sql.Date.class, str);
        } else {
            if (i2 == 2 || i3 == 2) {
                return;
            }
            C4917k c4917k4 = new C4917k(Date.class, i2, i3);
            C4917k c4917k5 = new C4917k(Timestamp.class, i2, i3);
            C4917k c4917k6 = new C4917k(java.sql.Date.class, i2, i3);
            c4917k = c4917k4;
            c4917k2 = c4917k5;
            c4917k3 = c4917k6;
        }
        list.add(com.google.gson.internal.bind.n7h.toq(Date.class, c4917k));
        list.add(com.google.gson.internal.bind.n7h.toq(Timestamp.class, c4917k2));
        list.add(com.google.gson.internal.bind.n7h.toq(java.sql.Date.class, c4917k3));
    }

    public f7l8 cdj(int i2, int i3) {
        this.f27641s = i2;
        this.f27639p = i3;
        this.f27642y = null;
        return this;
    }

    public f7l8 f7l8() {
        this.f68696ld6 = true;
        return this;
    }

    public f7l8 fn3e(InterfaceC4918n interfaceC4918n) {
        this.f68701zy = interfaceC4918n;
        return this;
    }

    public f7l8 fu4() {
        this.f68697n7h = true;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public f7l8 m17076g() {
        this.f27637k = this.f27637k.m17179n();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public f7l8 m17077h(int i2) {
        this.f27641s = i2;
        this.f27642y = null;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public f7l8 m17078i(EnumC4921q enumC4921q) {
        this.f68701zy = enumC4921q;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public f7l8 m17079k(toq toqVar) {
        this.f27637k = this.f27637k.zurt(toqVar, false, true);
        return this;
    }

    public f7l8 ki(String str) {
        this.f27642y = str;
        return this;
    }

    public f7l8 kja0() {
        this.f68700x2 = true;
        return this;
    }

    public f7l8 ld6(Type type, Object obj) {
        boolean z2 = obj instanceof InterfaceC4873i;
        C4899k.m17165k(z2 || (obj instanceof ld6) || (obj instanceof InterfaceC4927y) || (obj instanceof fu4));
        if (obj instanceof InterfaceC4927y) {
            this.f27640q.put(type, (InterfaceC4927y) obj);
        }
        if (z2 || (obj instanceof ld6)) {
            this.f27638n.add(com.google.gson.internal.bind.x2.x2(C4922k.get(type), obj));
        }
        if (obj instanceof fu4) {
            this.f27638n.add(com.google.gson.internal.bind.n7h.m17117k(C4922k.get(type), (fu4) obj));
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public f7l8 m17080n() {
        this.f68698qrj = false;
        return this;
    }

    public f7l8 n7h() {
        this.f68694f7l8 = true;
        return this;
    }

    public f7l8 ni7(ni7 ni7Var) {
        this.f68699toq = ni7Var;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public f7l8 m17081p() {
        this.f68695kja0 = true;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C4871g m17082q() {
        List<InterfaceC4928z> arrayList = new ArrayList<>(this.f27638n.size() + this.f27635g.size() + 3);
        arrayList.addAll(this.f27638n);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f27635g);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        zy(this.f27642y, this.f27641s, this.f27639p, arrayList);
        return new C4871g(this.f27637k, this.f68701zy, this.f27640q, this.f68694f7l8, this.f68696ld6, this.f68695kja0, this.f68698qrj, this.f68697n7h, this.f27636h, this.f68700x2, this.f68699toq, this.f27642y, this.f27641s, this.f27639p, this.f27638n, this.f27635g, arrayList);
    }

    public f7l8 qrj(Class<?> cls, Object obj) {
        boolean z2 = obj instanceof InterfaceC4873i;
        C4899k.m17165k(z2 || (obj instanceof ld6) || (obj instanceof fu4));
        if ((obj instanceof ld6) || z2) {
            this.f27635g.add(com.google.gson.internal.bind.x2.qrj(cls, obj));
        }
        if (obj instanceof fu4) {
            this.f27638n.add(com.google.gson.internal.bind.n7h.m17118n(cls, (fu4) obj));
        }
        return this;
    }

    /* JADX INFO: renamed from: s */
    public f7l8 m17083s() {
        this.f27637k = this.f27637k.n7h();
        return this;
    }

    public f7l8 t8r(toq... toqVarArr) {
        for (toq toqVar : toqVarArr) {
            this.f27637k = this.f27637k.zurt(toqVar, true, true);
        }
        return this;
    }

    public f7l8 toq(toq toqVar) {
        this.f27637k = this.f27637k.zurt(toqVar, true, false);
        return this;
    }

    public f7l8 x2(InterfaceC4928z interfaceC4928z) {
        this.f27638n.add(interfaceC4928z);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public f7l8 m17084y(int... iArr) {
        this.f27637k = this.f27637k.ni7(iArr);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public f7l8 m17085z(double d2) {
        this.f27637k = this.f27637k.fu4(d2);
        return this;
    }

    public f7l8 zurt() {
        this.f27636h = true;
        return this;
    }

    f7l8(C4871g c4871g) {
        this.f27637k = C4905q.f27766h;
        this.f68699toq = ni7.DEFAULT;
        this.f68701zy = EnumC4921q.IDENTITY;
        HashMap map = new HashMap();
        this.f27640q = map;
        ArrayList arrayList = new ArrayList();
        this.f27638n = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f27635g = arrayList2;
        this.f68694f7l8 = false;
        this.f27641s = 2;
        this.f27639p = 2;
        this.f68696ld6 = false;
        this.f68700x2 = false;
        this.f68698qrj = true;
        this.f68697n7h = false;
        this.f68695kja0 = false;
        this.f27636h = false;
        this.f27637k = c4871g.f27648g;
        this.f68701zy = c4871g.f68710f7l8;
        map.putAll(c4871g.f27656y);
        this.f68694f7l8 = c4871g.f27655s;
        this.f68696ld6 = c4871g.f27653p;
        this.f68695kja0 = c4871g.f68714ld6;
        this.f68698qrj = c4871g.f68719x2;
        this.f68697n7h = c4871g.f68716qrj;
        this.f27636h = c4871g.f68715n7h;
        this.f68700x2 = c4871g.f68713kja0;
        this.f68699toq = c4871g.f68717t8r;
        this.f27642y = c4871g.f27649h;
        this.f27641s = c4871g.f68709cdj;
        this.f27639p = c4871g.f68712ki;
        arrayList.addAll(c4871g.f27650i);
        arrayList2.addAll(c4871g.f68711fn3e);
    }
}
