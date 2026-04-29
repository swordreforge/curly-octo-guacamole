package com.google.common.util.concurrent;

import com.google.common.collect.e5;
import com.google.common.collect.g0ad;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.wlev;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: CycleDetectingLockFactory.java */
/* JADX INFO: loaded from: classes3.dex */
@CanIgnoreReturnValue
@InterfaceC7731k
@wlev.zy
public class ni7 {

    /* JADX INFO: renamed from: k */
    final InterfaceC4829p f27494k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, C4832y>> f68637toq = new e5().x2().m15642s();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Logger f68638zy = Logger.getLogger(ni7.class.getName());

    /* JADX INFO: renamed from: q */
    private static final ThreadLocal<ArrayList<C4832y>> f27493q = new C4827k();

    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    private static class f7l8 extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final vep5<String> EXCLUDED_CLASS_NAMES = vep5.of(ni7.class.getName(), f7l8.class.getName(), C4832y.class.getName());

        f7l8(C4832y c4832y, C4832y c4832y2) {
            super(c4832y.m16991q() + " -> " + c4832y2.m16991q());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (x2.class.getName().equals(stackTrace[i2].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else {
                    if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i2].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2, length));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$k */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    static class C4827k extends ThreadLocal<ArrayList<C4832y>> {
        C4827k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ArrayList<C4832y> initialValue() {
            return wlev.fn3e(3);
        }
    }

    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    @InterfaceC7731k
    public static final class ld6 extends f7l8 {
        private final f7l8 conflictingStackTrace;

        /* synthetic */ ld6(C4832y c4832y, C4832y c4832y2, f7l8 f7l8Var, C4827k c4827k) {
            this(c4832y, c4832y2, f7l8Var);
        }

        public f7l8 getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable cause = this.conflictingStackTrace; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }

        private ld6(C4832y c4832y, C4832y c4832y2, f7l8 f7l8Var) {
            super(c4832y, c4832y2);
            this.conflictingStackTrace = f7l8Var;
            initCause(f7l8Var);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$n */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    final class C4828n extends ReentrantReadWriteLock implements toq {
        private final C4832y lockGraphNode;
        private final C4830q readLock;
        private final C4826g writeLock;

        /* synthetic */ C4828n(ni7 ni7Var, C4832y c4832y, boolean z2, C4827k c4827k) {
            this(c4832y, z2);
        }

        @Override // com.google.common.util.concurrent.ni7.toq
        public C4832y getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.ni7.toq
        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        private C4828n(C4832y c4832y, boolean z2) {
            super(z2);
            this.readLock = ni7.this.new C4830q(this);
            this.writeLock = ni7.this.new C4826g(this);
            this.lockGraphNode = (C4832y) com.google.common.base.jk.a9(c4832y);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$p */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    @InterfaceC7731k
    public interface InterfaceC4829p {
        void handlePotentialDeadlock(ld6 ld6Var);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$s */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    @InterfaceC7731k
    public static abstract class EnumC4831s implements InterfaceC4829p {
        public static final EnumC4831s DISABLED;
        public static final EnumC4831s THROW;
        public static final EnumC4831s WARN;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4831s[] f27495k;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$s$toq */
        /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
        enum toq extends EnumC4831s {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.util.concurrent.ni7.InterfaceC4829p
            public void handlePotentialDeadlock(ld6 ld6Var) {
                ni7.f68638zy.log(Level.SEVERE, "Detected potential deadlock", (Throwable) ld6Var);
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$s$zy */
        /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
        enum zy extends EnumC4831s {
            zy(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.util.concurrent.ni7.InterfaceC4829p
            public void handlePotentialDeadlock(ld6 ld6Var) {
            }
        }

        static {
            k kVar = new k("THROW", 0);
            THROW = kVar;
            toq toqVar = new toq("WARN", 1);
            WARN = toqVar;
            zy zyVar = new zy("DISABLED", 2);
            DISABLED = zyVar;
            f27495k = new EnumC4831s[]{kVar, toqVar, zyVar};
        }

        private EnumC4831s(String str, int i2) {
        }

        public static EnumC4831s valueOf(String str) {
            return (EnumC4831s) Enum.valueOf(EnumC4831s.class, str);
        }

        public static EnumC4831s[] values() {
            return (EnumC4831s[]) f27495k.clone();
        }

        /* synthetic */ EnumC4831s(String str, int i2, C4827k c4827k) {
            this(str, i2);
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$s$k */
        /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
        enum k extends EnumC4831s {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.util.concurrent.ni7.InterfaceC4829p
            public void handlePotentialDeadlock(ld6 ld6Var) {
                throw ld6Var;
            }
        }
    }

    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    private interface toq {
        C4832y getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    @InterfaceC7731k
    public static final class x2<E extends Enum<E>> extends ni7 {

        /* JADX INFO: renamed from: n */
        private final Map<E, C4832y> f27496n;

        @InterfaceC7732q
        x2(InterfaceC4829p interfaceC4829p, Map<E, C4832y> map) {
            super(interfaceC4829p, null);
            this.f27496n = map;
        }

        public ReentrantReadWriteLock cdj(E e2) {
            return ki(e2, false);
        }

        /* JADX INFO: renamed from: h */
        public ReentrantLock m16989h(E e2, boolean z2) {
            return this.f27494k == EnumC4831s.DISABLED ? new ReentrantLock(z2) : new zy(this, this.f27496n.get(e2), z2, null);
        }

        public ReentrantReadWriteLock ki(E e2, boolean z2) {
            return this.f27494k == EnumC4831s.DISABLED ? new ReentrantReadWriteLock(z2) : new C4828n(this, this.f27496n.get(e2), z2, null);
        }

        public ReentrantLock kja0(E e2) {
            return m16989h(e2, false);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$y */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    private static class C4832y {

        /* JADX INFO: renamed from: k */
        final Map<C4832y, f7l8> f27497k = new e5().x2().m15642s();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Map<C4832y, ld6> f68639toq = new e5().x2().m15642s();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final String f68640zy;

        C4832y(String str) {
            this.f68640zy = (String) com.google.common.base.jk.a9(str);
        }

        @NullableDecl
        private f7l8 zy(C4832y c4832y, Set<C4832y> set) {
            if (!set.add(this)) {
                return null;
            }
            f7l8 f7l8Var = this.f27497k.get(c4832y);
            if (f7l8Var != null) {
                return f7l8Var;
            }
            for (Map.Entry<C4832y, f7l8> entry : this.f27497k.entrySet()) {
                C4832y key = entry.getKey();
                f7l8 f7l8VarZy = key.zy(c4832y, set);
                if (f7l8VarZy != null) {
                    f7l8 f7l8Var2 = new f7l8(key, this);
                    f7l8Var2.setStackTrace(entry.getValue().getStackTrace());
                    f7l8Var2.initCause(f7l8VarZy);
                    return f7l8Var2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        void m16990k(InterfaceC4829p interfaceC4829p, C4832y c4832y) {
            com.google.common.base.jk.gyi(this != c4832y, "Attempted to acquire multiple locks with the same rank %s", c4832y.m16991q());
            if (this.f27497k.containsKey(c4832y)) {
                return;
            }
            ld6 ld6Var = this.f68639toq.get(c4832y);
            C4827k c4827k = null;
            if (ld6Var != null) {
                interfaceC4829p.handlePotentialDeadlock(new ld6(c4832y, this, ld6Var.getConflictingStackTrace(), c4827k));
                return;
            }
            f7l8 f7l8VarZy = c4832y.zy(this, g0ad.o1t());
            if (f7l8VarZy == null) {
                this.f27497k.put(c4832y, new f7l8(c4832y, this));
                return;
            }
            ld6 ld6Var2 = new ld6(c4832y, this, f7l8VarZy, c4827k);
            this.f68639toq.put(c4832y, ld6Var2);
            interfaceC4829p.handlePotentialDeadlock(ld6Var2);
        }

        /* JADX INFO: renamed from: q */
        String m16991q() {
            return this.f68640zy;
        }

        void toq(InterfaceC4829p interfaceC4829p, List<C4832y> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                m16990k(interfaceC4829p, list.get(i2));
            }
        }
    }

    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    final class zy extends ReentrantLock implements toq {
        private final C4832y lockGraphNode;

        /* synthetic */ zy(ni7 ni7Var, C4832y c4832y, boolean z2, C4827k c4827k) {
            this(c4832y, z2);
        }

        @Override // com.google.common.util.concurrent.ni7.toq
        public C4832y getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.ni7.toq
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            ni7.this.m16982k(this);
            try {
                super.lock();
            } finally {
                ni7.m16987y(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            ni7.this.m16982k(this);
            try {
                super.lockInterruptibly();
            } finally {
                ni7.m16987y(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            ni7.this.m16982k(this);
            try {
                return super.tryLock();
            } finally {
                ni7.m16987y(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                ni7.m16987y(this);
            }
        }

        private zy(C4832y c4832y, boolean z2) {
            super(z2);
            this.lockGraphNode = (C4832y) com.google.common.base.jk.a9(c4832y);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            ni7.this.m16982k(this);
            try {
                return super.tryLock(j2, timeUnit);
            } finally {
                ni7.m16987y(this);
            }
        }
    }

    /* synthetic */ ni7(InterfaceC4829p interfaceC4829p, C4827k c4827k) {
        this(interfaceC4829p);
    }

    private static Map<? extends Enum, C4832y> f7l8(Class<? extends Enum> cls) {
        ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, C4832y>> concurrentMap = f68637toq;
        Map<? extends Enum, C4832y> map = concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map<? extends Enum, C4832y> mapM16983n = m16983n(cls);
        return (Map) com.google.common.base.fu4.m15351k(concurrentMap.putIfAbsent(cls, mapM16983n), mapM16983n);
    }

    /* JADX INFO: renamed from: g */
    private static String m16981g(Enum<?> r2) {
        return r2.getDeclaringClass().getSimpleName() + "." + r2.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m16982k(toq toqVar) {
        if (toqVar.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C4832y> arrayList = f27493q.get();
        C4832y lockGraphNode = toqVar.getLockGraphNode();
        lockGraphNode.toq(this.f27494k, arrayList);
        arrayList.add(lockGraphNode);
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: n */
    static <E extends Enum<E>> Map<E, C4832y> m16983n(Class<E> cls) {
        EnumMap enumMapLrht = vy.lrht(cls);
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        ArrayList arrayListFn3e = wlev.fn3e(length);
        int i2 = 0;
        for (E e2 : enumConstants) {
            C4832y c4832y = new C4832y(m16981g(e2));
            arrayListFn3e.add(c4832y);
            enumMapLrht.put(e2, c4832y);
        }
        for (int i3 = 1; i3 < length; i3++) {
            ((C4832y) arrayListFn3e.get(i3)).toq(EnumC4831s.THROW, arrayListFn3e.subList(0, i3));
        }
        while (i2 < length - 1) {
            i2++;
            ((C4832y) arrayListFn3e.get(i2)).toq(EnumC4831s.DISABLED, arrayListFn3e.subList(i2, length));
        }
        return Collections.unmodifiableMap(enumMapLrht);
    }

    /* JADX INFO: renamed from: p */
    public static <E extends Enum<E>> x2<E> m16984p(Class<E> cls, InterfaceC4829p interfaceC4829p) {
        com.google.common.base.jk.a9(cls);
        com.google.common.base.jk.a9(interfaceC4829p);
        return new x2<>(interfaceC4829p, f7l8(cls));
    }

    /* JADX INFO: renamed from: s */
    public static ni7 m16986s(InterfaceC4829p interfaceC4829p) {
        return new ni7(interfaceC4829p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static void m16987y(toq toqVar) {
        if (toqVar.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C4832y> arrayList = f27493q.get();
        C4832y lockGraphNode = toqVar.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public ReentrantLock ld6(String str) {
        return x2(str, false);
    }

    public ReentrantReadWriteLock n7h(String str, boolean z2) {
        return this.f27494k == EnumC4831s.DISABLED ? new ReentrantReadWriteLock(z2) : new C4828n(this, new C4832y(str), z2, null);
    }

    public ReentrantReadWriteLock qrj(String str) {
        return n7h(str, false);
    }

    public ReentrantLock x2(String str, boolean z2) {
        return this.f27494k == EnumC4831s.DISABLED ? new ReentrantLock(z2) : new zy(this, new C4832y(str), z2, null);
    }

    private ni7(InterfaceC4829p interfaceC4829p) {
        this.f27494k = (InterfaceC4829p) com.google.common.base.jk.a9(interfaceC4829p);
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$g */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    private class C4826g extends ReentrantReadWriteLock.WriteLock {

        @Weak
        final C4828n readWriteLock;

        C4826g(C4828n c4828n) {
            super(c4828n);
            this.readWriteLock = c4828n;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            ni7.this.m16982k(this.readWriteLock);
            try {
                super.lock();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            ni7.this.m16982k(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            ni7.this.m16982k(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            ni7.this.m16982k(this.readWriteLock);
            try {
                return super.tryLock(j2, timeUnit);
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ni7$q */
    /* JADX INFO: compiled from: CycleDetectingLockFactory.java */
    private class C4830q extends ReentrantReadWriteLock.ReadLock {

        @Weak
        final C4828n readWriteLock;

        C4830q(C4828n c4828n) {
            super(c4828n);
            this.readWriteLock = c4828n;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            ni7.this.m16982k(this.readWriteLock);
            try {
                super.lock();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            ni7.this.m16982k(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            ni7.this.m16982k(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            ni7.this.m16982k(this.readWriteLock);
            try {
                return super.tryLock(j2, timeUnit);
            } finally {
                ni7.m16987y(this.readWriteLock);
            }
        }
    }
}
