package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.t */
/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0017\u0013B\u0017\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J3\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010'\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0011\u0010*\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/t;", "", C0846k.d9i, "", "index", "element", "Lkotlinx/coroutines/internal/Core;", "n", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/t;", "oldHead", "newHead", "qrj", "(II)Lkotlinx/coroutines/internal/t;", "", "p", "()J", "state", "zy", "(J)Lkotlinx/coroutines/internal/t;", "toq", "", "q", "()Z", "k", "(Ljava/lang/Object;)I", "x2", "()Ljava/lang/Object;", "ld6", "()Lkotlinx/coroutines/internal/t;", "R", "Lkotlin/Function1;", "transform", "", C7704k.y.toq.f44691k, "(Lcyoe/x2;)Ljava/util/List;", "f7l8", com.market.sdk.reflect.toq.f28131g, "capacity", com.market.sdk.reflect.toq.f68929toq, "singleConsumer", "mask", AnimatedProperty.PROPERTY_NAME_Y, "isEmpty", C7704k.y.toq.f95579toq, "()I", "size", C4991s.f28129n, "(IZ)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6692t<E> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f82027cdj = 61;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f82029fn3e = 0;

    /* JADX INFO: renamed from: h */
    public static final long f37239h = 1152921504606846976L;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final long f82030ki = 2305843009213693952L;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f82031kja0 = 60;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f82032ld6 = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final long f82033n7h = 1152921503533105152L;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f82034ni7 = 2;

    /* JADX INFO: renamed from: p */
    public static final int f37242p = 1073741823;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f82035qrj = 30;

    /* JADX INFO: renamed from: s */
    public static final int f37243s = 30;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f82036t8r = 1024;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final long f82037x2 = 1073741823;

    /* JADX INFO: renamed from: y */
    public static final int f37244y = 8;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f82038zurt = 1;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _next = null;

    @InterfaceC7396q
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: k */
    private final int f37245k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private /* synthetic */ AtomicReferenceArray f37246q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f82039toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f82040zy;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final k f37241n = new k(null);

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C6679l f37240i = new C6679l("REMOVE_FROZEN");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37238g = AtomicReferenceFieldUpdater.newUpdater(C6692t.class, Object.class, "_next");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f82028f7l8 = AtomicLongFieldUpdater.newUpdater(C6692t.class, "_state");

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.t$k */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/t$k;", "", "", C2690k.k.f61039ld6, "n", "", "newHead", "toq", "newTail", "zy", C0846k.zaso, "Lkotlin/Function2;", "Lkotlin/c;", "name", C3678q.f65826kja0, "tail", "block", "q", "(JLcyoe/h;)Ljava/lang/Object;", "k", "ADD_CLOSED", com.market.sdk.reflect.toq.f28131g, "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", com.market.sdk.reflect.toq.f68928f7l8, "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/l;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/l;", "TAIL_MASK", "TAIL_SHIFT", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final int m24411k(long j2) {
            return (j2 & C6692t.f82030ki) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: n */
        public final long m24412n(long j2, long j3) {
            return j2 & (~j3);
        }

        /* JADX INFO: renamed from: q */
        public final <T> T m24413q(long j2, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, ? extends T> interfaceC5979h) {
            return interfaceC5979h.invoke(Integer.valueOf((int) ((C6692t.f82037x2 & j2) >> 0)), Integer.valueOf((int) ((j2 & C6692t.f82033n7h) >> 30)));
        }

        public final long toq(long j2, int i2) {
            return m24412n(j2, C6692t.f82037x2) | (((long) i2) << 0);
        }

        public final long zy(long j2, int i2) {
            return m24412n(j2, C6692t.f82033n7h) | (((long) i2) << 30);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.t$toq */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/t$toq;", "", "", "k", com.market.sdk.reflect.toq.f28131g, "index", C4991s.f28129n, "(I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        public final int f37247k;

        public toq(int i2) {
            this.f37247k = i2;
        }
    }

    public C6692t(int i2, boolean z2) {
        this.f37245k = i2;
        this.f82039toq = z2;
        int i3 = i2 - 1;
        this.f82040zy = i3;
        this.f37246q = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: renamed from: n */
    private final C6692t<E> m24404n(int i2, E e2) {
        Object obj = this.f37246q.get(this.f82040zy & i2);
        if (!(obj instanceof toq) || ((toq) obj).f37247k != i2) {
            return null;
        }
        this.f37246q.set(i2 & this.f82040zy, e2);
        return this;
    }

    /* JADX INFO: renamed from: p */
    private final long m24405p() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & f37239h) != 0) {
                return j2;
            }
            j3 = j2 | f37239h;
        } while (!f82028f7l8.compareAndSet(this, j2, j3));
        return j3;
    }

    private final C6692t<E> qrj(int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = this._state;
            i4 = (int) ((f82037x2 & j2) >> 0);
            if ((f37239h & j2) != 0) {
                return ld6();
            }
        } while (!f82028f7l8.compareAndSet(this, j2, f37241n.toq(j2, i3)));
        this.f37246q.set(i4 & this.f82040zy, null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C6692t<E> toq(long j2) {
        C6692t<E> c6692t = new C6692t<>(this.f37245k * 2, this.f82039toq);
        int i2 = (int) ((f82037x2 & j2) >> 0);
        int i3 = (int) ((f82033n7h & j2) >> 30);
        while (true) {
            int i4 = this.f82040zy;
            if ((i2 & i4) == (i3 & i4)) {
                c6692t._state = f37241n.m24412n(j2, f37239h);
                return c6692t;
            }
            Object toqVar = this.f37246q.get(i4 & i2);
            if (toqVar == null) {
                toqVar = new toq(i2);
            }
            c6692t.f37246q.set(c6692t.f82040zy & i2, toqVar);
            i2++;
        }
    }

    private final C6692t<E> zy(long j2) {
        while (true) {
            C6692t<E> c6692t = (C6692t) this._next;
            if (c6692t != null) {
                return c6692t;
            }
            androidx.concurrent.futures.toq.m906k(f37238g, this, null, toq(j2));
        }
    }

    public final boolean f7l8() {
        return (this._state & f82030ki) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m24406g() {
        long j2 = this._state;
        return (((int) ((j2 & f82033n7h) >> 30)) - ((int) ((f82037x2 & j2) >> 0))) & f37242p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m24407k(@mub.InterfaceC7396q E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.t$k r13 = kotlinx.coroutines.internal.C6692t.f37241n
            int r13 = r13.m24411k(r2)
            return r13
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f82040zy
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L2e
            return r5
        L2e:
            boolean r1 = r12.f82039toq
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f37246q
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4d
            int r1 = r12.f37245k
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L4c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C6692t.f82028f7l8
            kotlinx.coroutines.internal.t$k r4 = kotlinx.coroutines.internal.C6692t.f37241n
            long r4 = r4.zy(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f37246q
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L68:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L72
            goto L7c
        L72:
            kotlinx.coroutines.internal.t r0 = r0.ld6()
            kotlinx.coroutines.internal.t r0 = r0.m24404n(r9, r13)
            if (r0 != 0) goto L68
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6692t.m24407k(java.lang.Object):int");
    }

    @InterfaceC7396q
    public final C6692t<E> ld6() {
        return zy(m24405p());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m24408q() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & f82030ki) != 0) {
                return true;
            }
            if ((f37239h & j2) != 0) {
                return false;
            }
        } while (!f82028f7l8.compareAndSet(this, j2, j2 | f82030ki));
        return true;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final <R> List<R> m24409s(@InterfaceC7396q cyoe.x2<? super E, ? extends R> x2Var) {
        ArrayList arrayList = new ArrayList(this.f37245k);
        long j2 = this._state;
        int i2 = (int) ((f82037x2 & j2) >> 0);
        int i3 = (int) ((j2 & f82033n7h) >> 30);
        while (true) {
            int i4 = this.f82040zy;
            if ((i2 & i4) == (i3 & i4)) {
                return arrayList;
            }
            a98o.toq toqVar = (Object) this.f37246q.get(i4 & i2);
            if (toqVar != null && !(toqVar instanceof toq)) {
                arrayList.add(x2Var.invoke(toqVar));
            }
            i2++;
        }
    }

    @InterfaceC7395n
    public final Object x2() {
        while (true) {
            long j2 = this._state;
            if ((f37239h & j2) != 0) {
                return f37240i;
            }
            int i2 = (int) ((f82037x2 & j2) >> 0);
            int i3 = (int) ((f82033n7h & j2) >> 30);
            int i4 = this.f82040zy;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.f37246q.get(i4 & i2);
            if (obj == null) {
                if (this.f82039toq) {
                    return null;
                }
            } else {
                if (obj instanceof toq) {
                    return null;
                }
                int i5 = (i2 + 1) & f37242p;
                if (f82028f7l8.compareAndSet(this, j2, f37241n.toq(j2, i5))) {
                    this.f37246q.set(this.f82040zy & i2, null);
                    return obj;
                }
                if (this.f82039toq) {
                    C6692t<E> c6692tQrj = this;
                    do {
                        c6692tQrj = c6692tQrj.qrj(i2, i5);
                    } while (c6692tQrj != null);
                    return obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m24410y() {
        long j2 = this._state;
        return ((int) ((f82037x2 & j2) >> 0)) == ((int) ((j2 & f82033n7h) >> 30));
    }
}
