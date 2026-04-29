package com.google.gson.internal;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import e5.InterfaceC5997k;
import e5.InterfaceC5998n;
import e5.InterfaceC5999q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.gson.internal.q */
/* JADX INFO: compiled from: Excluder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4905q implements InterfaceC4928z, Cloneable {

    /* JADX INFO: renamed from: h */
    public static final C4905q f27766h = new C4905q();

    /* JADX INFO: renamed from: p */
    private static final double f27767p = -1.0d;

    /* JADX INFO: renamed from: g */
    private boolean f27768g;

    /* JADX INFO: renamed from: k */
    private double f27769k = f27767p;

    /* JADX INFO: renamed from: q */
    private int f27771q = 136;

    /* JADX INFO: renamed from: n */
    private boolean f27770n = true;

    /* JADX INFO: renamed from: y */
    private List<com.google.gson.toq> f27773y = Collections.emptyList();

    /* JADX INFO: renamed from: s */
    private List<com.google.gson.toq> f27772s = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.q$k */
    /* JADX INFO: compiled from: Excluder.java */
    class k<T> extends fu4<T> {

        /* JADX INFO: renamed from: k */
        private fu4<T> f27775k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C4922k f27776n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C4871g f27777q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ boolean f68782toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ boolean f68783zy;

        k(boolean z2, boolean z3, C4871g c4871g, C4922k c4922k) {
            this.f68782toq = z2;
            this.f68783zy = z3;
            this.f27777q = c4871g;
            this.f27776n = c4922k;
        }

        /* JADX INFO: renamed from: p */
        private fu4<T> m17181p() {
            fu4<T> fu4Var = this.f27775k;
            if (fu4Var != null) {
                return fu4Var;
            }
            fu4<T> fu4VarKi = this.f27777q.ki(C4905q.this, this.f27776n);
            this.f27775k = fu4VarKi;
            return fu4VarKi;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: n */
        public T mo7087n(C4924k c4924k) throws IOException {
            if (!this.f68782toq) {
                return m17181p().mo7087n(c4924k);
            }
            c4924k.h4b();
            return null;
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: s */
        public void mo7089s(C4926q c4926q, T t2) throws IOException {
            if (this.f68783zy) {
                c4926q.hyr();
            } else {
                m17181p().mo7089s(c4926q, t2);
            }
        }
    }

    private boolean cdj(Class<?> cls) {
        return cls.isMemberClass() && !ki(cls);
    }

    private boolean fn3e(InterfaceC5999q interfaceC5999q, InterfaceC5998n interfaceC5998n) {
        return t8r(interfaceC5999q) && m17175i(interfaceC5998n);
    }

    /* JADX INFO: renamed from: i */
    private boolean m17175i(InterfaceC5998n interfaceC5998n) {
        return interfaceC5998n == null || interfaceC5998n.value() > this.f27769k;
    }

    private boolean ki(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean kja0(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* JADX INFO: renamed from: s */
    private boolean m17176s(Class<?> cls, boolean z2) {
        Iterator<com.google.gson.toq> it = (z2 ? this.f27773y : this.f27772s).iterator();
        while (it.hasNext()) {
            if (it.next().toq(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean t8r(InterfaceC5999q interfaceC5999q) {
        return interfaceC5999q == null || interfaceC5999q.value() <= this.f27769k;
    }

    /* JADX INFO: renamed from: y */
    private boolean m17177y(Class<?> cls) {
        if (this.f27769k == f27767p || fn3e((InterfaceC5999q) cls.getAnnotation(InterfaceC5999q.class), (InterfaceC5998n) cls.getAnnotation(InterfaceC5998n.class))) {
            return (!this.f27770n && cdj(cls)) || kja0(cls);
        }
        return true;
    }

    public C4905q fu4(double d2) {
        C4905q c4905qClone = clone();
        c4905qClone.f27769k = d2;
        return c4905qClone;
    }

    /* JADX INFO: renamed from: g */
    public boolean m17178g(Class<?> cls, boolean z2) {
        return m17177y(cls) || m17176s(cls, z2);
    }

    @Override // com.google.gson.InterfaceC4928z
    /* JADX INFO: renamed from: k */
    public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
        Class<? super T> rawType = c4922k.getRawType();
        boolean zM17177y = m17177y(rawType);
        boolean z2 = zM17177y || m17176s(rawType, true);
        boolean z3 = zM17177y || m17176s(rawType, false);
        if (z2 || z3) {
            return new k(z3, z2, c4871g, c4922k);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public C4905q m17179n() {
        C4905q c4905qClone = clone();
        c4905qClone.f27770n = false;
        return c4905qClone;
    }

    public C4905q n7h() {
        C4905q c4905qClone = clone();
        c4905qClone.f27768g = true;
        return c4905qClone;
    }

    public C4905q ni7(int... iArr) {
        C4905q c4905qClone = clone();
        c4905qClone.f27771q = 0;
        for (int i2 : iArr) {
            c4905qClone.f27771q = i2 | c4905qClone.f27771q;
        }
        return c4905qClone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C4905q clone() {
        try {
            return (C4905q) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean qrj(Field field, boolean z2) {
        InterfaceC5997k interfaceC5997k;
        if ((this.f27771q & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f27769k != f27767p && !fn3e((InterfaceC5999q) field.getAnnotation(InterfaceC5999q.class), (InterfaceC5998n) field.getAnnotation(InterfaceC5998n.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f27768g && ((interfaceC5997k = (InterfaceC5997k) field.getAnnotation(InterfaceC5997k.class)) == null || (!z2 ? interfaceC5997k.deserialize() : interfaceC5997k.serialize()))) {
            return true;
        }
        if ((!this.f27770n && cdj(field.getType())) || kja0(field.getType())) {
            return true;
        }
        List<com.google.gson.toq> list = z2 ? this.f27773y : this.f27772s;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.zy zyVar = new com.google.gson.zy(field);
        Iterator<com.google.gson.toq> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m17234k(zyVar)) {
                return true;
            }
        }
        return false;
    }

    public C4905q zurt(com.google.gson.toq toqVar, boolean z2, boolean z3) {
        C4905q c4905qClone = clone();
        if (z2) {
            ArrayList arrayList = new ArrayList(this.f27773y);
            c4905qClone.f27773y = arrayList;
            arrayList.add(toqVar);
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList(this.f27772s);
            c4905qClone.f27772s = arrayList2;
            arrayList2.add(toqVar);
        }
        return c4905qClone;
    }
}
