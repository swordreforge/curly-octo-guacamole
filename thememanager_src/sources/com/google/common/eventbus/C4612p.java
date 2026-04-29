package com.google.common.eventbus;

import com.google.common.base.C4280z;
import com.google.common.base.dd;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import com.google.common.cache.AbstractC4282g;
import com.google.common.cache.C4304q;
import com.google.common.cache.InterfaceC4303p;
import com.google.common.collect.ab;
import com.google.common.collect.lw;
import com.google.common.collect.r8s8;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.wlev;
import com.google.common.collect.zwy;
import com.google.common.reflect.qrj;
import com.google.common.util.concurrent.bo;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: renamed from: com.google.common.eventbus.p */
/* JADX INFO: compiled from: SubscriberRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4612p {

    /* JADX INFO: renamed from: k */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<f7l8>> f26849k = vy.m16010c();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Weak
    private final C4611n f68259toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final InterfaceC4303p<Class<?>, se<Method>> f68258zy = C4304q.jk().lvui().toq(new k());

    /* JADX INFO: renamed from: q */
    private static final InterfaceC4303p<Class<?>, vep5<Class<?>>> f26848q = C4304q.jk().lvui().toq(new toq());

    /* JADX INFO: renamed from: com.google.common.eventbus.p$k */
    /* JADX INFO: compiled from: SubscriberRegistry.java */
    static class k extends AbstractC4282g<Class<?>, se<Method>> {
        k() {
        }

        @Override // com.google.common.cache.AbstractC4282g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public se<Method> load(Class<?> cls) throws Exception {
            return C4612p.m16171n(cls);
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.p$toq */
    /* JADX INFO: compiled from: SubscriberRegistry.java */
    static class toq extends AbstractC4282g<Class<?>, vep5<Class<?>>> {
        toq() {
        }

        @Override // com.google.common.cache.AbstractC4282g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public vep5<Class<?>> load(Class<?> cls) {
            return vep5.copyOf((Collection) qrj.of((Class) cls).getTypes().rawTypes());
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.p$zy */
    /* JADX INFO: compiled from: SubscriberRegistry.java */
    private static final class zy {

        /* JADX INFO: renamed from: k */
        private final String f26850k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final List<Class<?>> f68260toq;

        zy(Method method) {
            this.f26850k = method.getName();
            this.f68260toq = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.f26850k.equals(zyVar.f26850k) && this.f68260toq.equals(zyVar.f68260toq);
        }

        public int hashCode() {
            return C4280z.toq(this.f26850k, this.f68260toq);
        }
    }

    C4612p(C4611n c4611n) {
        this.f68259toq = (C4611n) jk.a9(c4611n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static se<Method> m16171n(Class<?> cls) {
        Set setRawTypes = qrj.of((Class) cls).getTypes().rawTypes();
        HashMap mapVyq = vy.vyq();
        Iterator it = setRawTypes.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(InterfaceC4609g.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    jk.ni7(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters.Subscriber methods must have exactly 1 parameter.", method, parameterTypes.length);
                    zy zyVar = new zy(method);
                    if (!mapVyq.containsKey(zyVar)) {
                        mapVyq.put(zyVar, method);
                    }
                }
            }
        }
        return se.copyOf(mapVyq.values());
    }

    /* JADX INFO: renamed from: q */
    private static se<Method> m16172q(Class<?> cls) {
        return f68258zy.getUnchecked(cls);
    }

    private lw<Class<?>, f7l8> toq(Object obj) {
        r8s8 r8s8VarCreate = r8s8.create();
        ab<Method> it = m16172q(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            r8s8VarCreate.put(next.getParameterTypes()[0], f7l8.m16162q(this.f68259toq, obj, next));
        }
        return r8s8VarCreate;
    }

    @InterfaceC7732q
    static vep5<Class<?>> zy(Class<?> cls) {
        try {
            return f26848q.getUnchecked(cls);
        } catch (bo e2) {
            throw dd.cdj(e2.getCause());
        }
    }

    @InterfaceC7732q
    Set<f7l8> f7l8(Class<?> cls) {
        return (Set) fu4.m15351k(this.f26849k.get(cls), vep5.of());
    }

    /* JADX INFO: renamed from: g */
    Iterator<f7l8> m16173g(Object obj) {
        vep5<Class<?>> vep5VarZy = zy(obj.getClass());
        ArrayList arrayListFn3e = wlev.fn3e(vep5VarZy.size());
        ab<Class<?>> it = vep5VarZy.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<f7l8> copyOnWriteArraySet = this.f26849k.get(it.next());
            if (copyOnWriteArraySet != null) {
                arrayListFn3e.add(copyOnWriteArraySet.iterator());
            }
        }
        return zwy.m16133s(arrayListFn3e.iterator());
    }

    /* JADX INFO: renamed from: s */
    void m16174s(Object obj) {
        for (Map.Entry<Class<?>, Collection<f7l8>> entry : toq(obj).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<f7l8> value = entry.getValue();
            CopyOnWriteArraySet<f7l8> copyOnWriteArraySet = this.f26849k.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + obj + " registered?");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    void m16175y(Object obj) {
        for (Map.Entry<Class<?>, Collection<f7l8>> entry : toq(obj).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<f7l8> value = entry.getValue();
            CopyOnWriteArraySet<f7l8> copyOnWriteArraySet = this.f26849k.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<f7l8> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) fu4.m15351k(this.f26849k.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }
}
