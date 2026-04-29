package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.was;
import kotlinx.coroutines.internal.C6673g;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0004\bR\u0010GJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001e\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00028\u00002\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0014¢\u0006\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R6\u0010<\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f07j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`88\u0002X\u0082\u0004¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010\u000bR$\u0010A\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010@R$\u0010D\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010@R$\u0010H\u001a\u00020(2\u0006\u0010=\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bE\u0010,\"\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010Q\u001a\u00020N8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lkotlinx/coroutines/channels/f7l8;", C0846k.d9i, "Lkotlinx/coroutines/channels/zy;", "Lkotlinx/coroutines/channels/s;", "", "cause", "", "uv6", "(Ljava/lang/Throwable;)Z", "Lkotlin/was;", "vyq", "()V", "Lkotlinx/coroutines/channels/f7l8$k;", "addSub", "removeSub", "bf2", "(Lkotlinx/coroutines/channels/f7l8$k;Lkotlinx/coroutines/channels/f7l8$k;)V", "", "e", "()J", "index", "nn86", "(J)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/d3;", "f7l8", "()Lkotlinx/coroutines/channels/d3;", "jp0y", "k", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "select", "dd", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "", C7704k.y.toq.f95579toq, com.market.sdk.reflect.toq.f28131g, "hb", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", AnimatedProperty.PROPERTY_NAME_Y, "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", C7704k.y.toq.f44691k, "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "p", "Ljava/util/List;", "getSubscribers$annotations", InterfaceC1925p.tgj1, "value", "j", "yz", "(J)V", C3678q.f65826kja0, "ek5k", "b", "tail", "o", "y9n", "(I)V", "size", "eqxt", "()Z", "isBufferAlwaysFull", "d2ok", "isBufferFull", "", "cdj", "()Ljava/lang/String;", "bufferDebugString", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class f7l8<E> extends zy<E> implements InterfaceC6511s<E> {

    @InterfaceC7396q
    private volatile /* synthetic */ long _head;

    @InterfaceC7396q
    private volatile /* synthetic */ int _size;

    @InterfaceC7396q
    private volatile /* synthetic */ long _tail;

    /* JADX INFO: renamed from: g */
    private final int f36803g;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final List<C6494k<E>> f36804p;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final Object[] f36805s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final ReentrantLock f36806y;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.f7l8$k */
    /* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006¨\u0006."}, d2 = {"Lkotlinx/coroutines/channels/f7l8$k;", C0846k.d9i, "Lkotlinx/coroutines/channels/k;", "Lkotlinx/coroutines/channels/d3;", "", "bo", "()Z", "", "y2", "()Ljava/lang/Object;", "", "cause", "jp0y", "(Ljava/lang/Throwable;)Z", "t8iq", "a", "Lkotlinx/coroutines/selects/g;", "select", "zp", "(Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f7l8;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/channels/f7l8;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", AnimatedProperty.PROPERTY_NAME_Y, "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "u", "()J", "c8jq", "(J)V", "subHead", "ek5k", "isBufferAlwaysEmpty", "yz", "isBufferEmpty", "eqxt", "isBufferAlwaysFull", "d2ok", "isBufferFull", C4991s.f28129n, "(Lkotlinx/coroutines/channels/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6494k<E> extends AbstractC6500k<E> implements d3<E> {

        @InterfaceC7396q
        private volatile /* synthetic */ long _subHead;

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        private final f7l8<E> f36807g;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        private final ReentrantLock f36808y;

        public C6494k(@InterfaceC7396q f7l8<E> f7l8Var) {
            super(null);
            this.f36807g = f7l8Var;
            this.f36808y = new ReentrantLock();
            this._subHead = 0L;
        }

        private final boolean bo() {
            if (ki() != null) {
                return false;
            }
            return (yz() && this.f36807g.ki() == null) ? false : true;
        }

        private final Object y2() {
            long jM23880u = m23880u();
            ni7<?> ni7VarKi = this.f36807g.ki();
            if (jM23880u >= this.f36807g.ek5k()) {
                if (ni7VarKi == null) {
                    ni7VarKi = ki();
                }
                return ni7VarKi == null ? toq.f36853g : ni7VarKi;
            }
            Object objNn86 = this.f36807g.nn86(jM23880u);
            ni7<?> ni7VarKi2 = ki();
            return ni7VarKi2 != null ? ni7VarKi2 : objNn86;
        }

        @Override // kotlinx.coroutines.channels.AbstractC6500k
        @InterfaceC7395n
        /* JADX INFO: renamed from: a */
        protected Object mo23879a() {
            boolean z2;
            ReentrantLock reentrantLock = this.f36808y;
            reentrantLock.lock();
            try {
                Object objY2 = y2();
                if ((objY2 instanceof ni7) || objY2 == toq.f36853g) {
                    z2 = false;
                } else {
                    c8jq(m23880u() + 1);
                    z2 = true;
                }
                reentrantLock.unlock();
                ni7 ni7Var = objY2 instanceof ni7 ? (ni7) objY2 : null;
                if (ni7Var != null) {
                    jp0y(ni7Var.f36836g);
                }
                if (t8iq() ? true : z2) {
                    f7l8.i1(this.f36807g, null, null, 3, null);
                }
                return objY2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final void c8jq(long j2) {
            this._subHead = j2;
        }

        @Override // kotlinx.coroutines.channels.zy
        protected boolean d2ok() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractC6500k
        protected boolean ek5k() {
            return false;
        }

        @Override // kotlinx.coroutines.channels.zy
        protected boolean eqxt() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.zy, kotlinx.coroutines.channels.lvui
        public boolean jp0y(@InterfaceC7395n Throwable th) {
            boolean zJp0y = super.jp0y(th);
            if (zJp0y) {
                f7l8.i1(this.f36807g, null, this, 1, null);
                ReentrantLock reentrantLock = this.f36808y;
                reentrantLock.lock();
                try {
                    c8jq(this.f36807g.ek5k());
                    was wasVar = was.f36763k;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return zJp0y;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        
            r2 = (kotlinx.coroutines.channels.ni7) r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean t8iq() {
            /*
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.bo()
                r2 = 0
                if (r1 == 0) goto L5a
                java.util.concurrent.locks.ReentrantLock r1 = r8.f36808y
                boolean r1 = r1.tryLock()
                if (r1 != 0) goto L11
                goto L5a
            L11:
                java.lang.Object r1 = r8.y2()     // Catch: java.lang.Throwable -> L53
                kotlinx.coroutines.internal.l r3 = kotlinx.coroutines.channels.toq.f36853g     // Catch: java.lang.Throwable -> L53
                if (r1 != r3) goto L1f
            L19:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f36808y
                r1.unlock()
                goto L1
            L1f:
                boolean r3 = r1 instanceof kotlinx.coroutines.channels.ni7     // Catch: java.lang.Throwable -> L53
                if (r3 == 0) goto L2c
                r2 = r1
                kotlinx.coroutines.channels.ni7 r2 = (kotlinx.coroutines.channels.ni7) r2     // Catch: java.lang.Throwable -> L53
            L26:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f36808y
                r1.unlock()
                goto L5a
            L2c:
                kotlinx.coroutines.channels.oc r3 = r8.hyr()     // Catch: java.lang.Throwable -> L53
                if (r3 != 0) goto L33
                goto L26
            L33:
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.ni7     // Catch: java.lang.Throwable -> L53
                if (r4 == 0) goto L38
                goto L26
            L38:
                kotlinx.coroutines.internal.l r2 = r3.mo23909z(r1, r2)     // Catch: java.lang.Throwable -> L53
                if (r2 != 0) goto L3f
                goto L19
            L3f:
                long r4 = r8.m23880u()     // Catch: java.lang.Throwable -> L53
                r6 = 1
                long r4 = r4 + r6
                r8.c8jq(r4)     // Catch: java.lang.Throwable -> L53
                r0 = 1
                java.util.concurrent.locks.ReentrantLock r2 = r8.f36808y
                r2.unlock()
                r3.mo23908y(r1)
                goto L1
            L53:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r8.f36808y
                r1.unlock()
                throw r0
            L5a:
                if (r2 != 0) goto L5d
                goto L62
            L5d:
                java.lang.Throwable r1 = r2.f36836g
                r8.jp0y(r1)
            L62:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.f7l8.C6494k.t8iq():boolean");
        }

        /* JADX INFO: renamed from: u */
        public final long m23880u() {
            return this._subHead;
        }

        @Override // kotlinx.coroutines.channels.AbstractC6500k
        protected boolean yz() {
            return m23880u() >= this.f36807g.ek5k();
        }

        @Override // kotlinx.coroutines.channels.AbstractC6500k
        @InterfaceC7395n
        protected Object zp(@InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
            ReentrantLock reentrantLock = this.f36808y;
            reentrantLock.lock();
            try {
                Object objY2 = y2();
                boolean z2 = false;
                if (!(objY2 instanceof ni7) && objY2 != toq.f36853g) {
                    if (interfaceC6720g.ki()) {
                        c8jq(m23880u() + 1);
                        z2 = true;
                    } else {
                        objY2 = kotlinx.coroutines.selects.f7l8.m24562q();
                    }
                }
                reentrantLock.unlock();
                ni7 ni7Var = objY2 instanceof ni7 ? (ni7) objY2 : null;
                if (ni7Var != null) {
                    jp0y(ni7Var.f36836g);
                }
                if (t8iq() ? true : z2) {
                    f7l8.i1(this.f36807g, null, null, 3, null);
                }
                return objY2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public f7l8(int i2) {
        super(null);
        this.f36803g = i2;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + hb() + " was specified").toString());
        }
        this.f36806y = new ReentrantLock();
        this.f36805s = new Object[i2];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.f36804p = C6673g.m24345q();
    }

    /* JADX INFO: renamed from: b */
    private final void m23870b(long j2) {
        this._tail = j2;
    }

    private final void bf2(C6494k<E> c6494k, C6494k<E> c6494k2) {
        d2ok d2okVarM23994f;
        while (true) {
            ReentrantLock reentrantLock = this.f36806y;
            reentrantLock.lock();
            if (c6494k != null) {
                try {
                    c6494k.c8jq(ek5k());
                    boolean zIsEmpty = this.f36804p.isEmpty();
                    this.f36804p.add(c6494k);
                    if (!zIsEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (c6494k2 != null) {
                this.f36804p.remove(c6494k2);
                if (m23873j() != c6494k2.m23880u()) {
                    return;
                }
            }
            long jM23872e = m23872e();
            long jEk5k = ek5k();
            long jM23873j = m23873j();
            long jMcp = kotlin.ranges.fn3e.mcp(jM23872e, jEk5k);
            if (jMcp <= jM23873j) {
                return;
            }
            int iM23875o = m23875o();
            while (jM23873j < jMcp) {
                this.f36805s[(int) (jM23873j % ((long) hb()))] = null;
                boolean z2 = iM23875o >= hb();
                jM23873j++;
                yz(jM23873j);
                iM23875o--;
                y9n(iM23875o);
                if (z2) {
                    do {
                        d2okVarM23994f = m23994f();
                        if (d2okVarM23994f != null && !(d2okVarM23994f instanceof ni7)) {
                        }
                    } while (d2okVarM23994f.i1(null) == null);
                    this.f36805s[(int) (jEk5k % ((long) hb()))] = d2okVarM23994f.mo23860b();
                    y9n(iM23875o + 1);
                    m23870b(jEk5k + 1);
                    was wasVar = was.f36763k;
                    reentrantLock.unlock();
                    d2okVarM23994f.y9n();
                    vyq();
                    c6494k = null;
                    c6494k2 = null;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: e */
    private final long m23872e() {
        Iterator<C6494k<E>> it = this.f36804p.iterator();
        long jMcp = Long.MAX_VALUE;
        while (it.hasNext()) {
            jMcp = kotlin.ranges.fn3e.mcp(jMcp, it.next().m23880u());
        }
        return jMcp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ek5k() {
        return this._tail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void i1(f7l8 f7l8Var, C6494k c6494k, C6494k c6494k2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c6494k = null;
        }
        if ((i2 & 2) != 0) {
            c6494k2 = null;
        }
        f7l8Var.bf2(c6494k, c6494k2);
    }

    /* JADX INFO: renamed from: j */
    private final long m23873j() {
        return this._head;
    }

    /* JADX INFO: renamed from: m */
    private static /* synthetic */ void m23874m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E nn86(long j2) {
        return (E) this.f36805s[(int) (j2 % ((long) this.f36803g))];
    }

    /* JADX INFO: renamed from: o */
    private final int m23875o() {
        return this._size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    /* JADX INFO: renamed from: uv6, reason: merged with bridge method [inline-methods] */
    public final boolean mo23876k(Throwable th) {
        boolean zJp0y = jp0y(th);
        Iterator<C6494k<E>> it = this.f36804p.iterator();
        while (it.hasNext()) {
            it.next().mo23861k(th);
        }
        return zJp0y;
    }

    private final void vyq() {
        boolean z2;
        Iterator<C6494k<E>> it = this.f36804p.iterator();
        boolean z3 = false;
        loop0: while (true) {
            z2 = z3;
            while (it.hasNext()) {
                if (it.next().t8iq()) {
                    break;
                } else {
                    z2 = true;
                }
            }
            z3 = true;
        }
        if (z3 || !z2) {
            i1(this, null, null, 3, null);
        }
    }

    private final void y9n(int i2) {
        this._size = i2;
    }

    private final void yz(long j2) {
        this._head = j2;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected String cdj() {
        return "(buffer:capacity=" + this.f36805s.length + ",size=" + m23875o() + ')';
    }

    @Override // kotlinx.coroutines.channels.zy
    protected boolean d2ok() {
        return m23875o() >= this.f36803g;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    protected Object dd(E e2, @InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        ReentrantLock reentrantLock = this.f36806y;
        reentrantLock.lock();
        try {
            ni7<?> ni7VarM23995i = m23995i();
            if (ni7VarM23995i != null) {
                return ni7VarM23995i;
            }
            int iM23875o = m23875o();
            if (iM23875o >= hb()) {
                return toq.f36855n;
            }
            if (!interfaceC6720g.ki()) {
                return kotlinx.coroutines.selects.f7l8.m24562q();
            }
            long jEk5k = ek5k();
            this.f36805s[(int) (jEk5k % ((long) hb()))] = e2;
            y9n(iM23875o + 1);
            m23870b(jEk5k + 1);
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            vyq();
            return toq.f36856q;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.zy
    protected boolean eqxt() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    @InterfaceC7396q
    public d3<E> f7l8() {
        C6494k c6494k = new C6494k(this);
        i1(this, c6494k, null, 2, null);
        return c6494k;
    }

    public final int hb() {
        return this.f36803g;
    }

    @Override // kotlinx.coroutines.channels.zy, kotlinx.coroutines.channels.lvui
    public boolean jp0y(@InterfaceC7395n Throwable th) {
        if (!super.jp0y(th)) {
            return false;
        }
        vyq();
        return true;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    /* JADX INFO: renamed from: q */
    public void mo23877q(@InterfaceC7395n CancellationException cancellationException) {
        mo23876k(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    protected Object mo23878r(E e2) {
        ReentrantLock reentrantLock = this.f36806y;
        reentrantLock.lock();
        try {
            ni7<?> ni7VarM23995i = m23995i();
            if (ni7VarM23995i != null) {
                return ni7VarM23995i;
            }
            int iM23875o = m23875o();
            if (iM23875o >= hb()) {
                return toq.f36855n;
            }
            long jEk5k = ek5k();
            this.f36805s[(int) (jEk5k % ((long) hb()))] = e2;
            y9n(iM23875o + 1);
            m23870b(jEk5k + 1);
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            vyq();
            return toq.f36856q;
        } finally {
            reentrantLock.unlock();
        }
    }
}
