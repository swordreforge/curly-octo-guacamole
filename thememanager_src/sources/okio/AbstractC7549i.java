package okio;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.i */
/* JADX INFO: compiled from: FileHandle.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class AbstractC7549i implements Closeable {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final ReentrantLock f43732g = ek5k.toq();

    /* JADX INFO: renamed from: k */
    private final boolean f43733k;

    /* JADX INFO: renamed from: n */
    private int f43734n;

    /* JADX INFO: renamed from: q */
    private boolean f43735q;

    /* JADX INFO: renamed from: okio.i$k */
    /* JADX INFO: compiled from: FileHandle.kt */
    @lv5({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    private static final class k implements vyq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final AbstractC7549i f43736k;

        /* JADX INFO: renamed from: n */
        private boolean f43737n;

        /* JADX INFO: renamed from: q */
        private long f43738q;

        public k(@InterfaceC7396q AbstractC7549i fileHandle, long j2) {
            kotlin.jvm.internal.d2ok.m23075h(fileHandle, "fileHandle");
            this.f43736k = fileHandle;
            this.f43738q = j2;
        }

        @Override // okio.vyq, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43737n) {
                return;
            }
            this.f43737n = true;
            ReentrantLock reentrantLockX2 = this.f43736k.x2();
            reentrantLockX2.lock();
            try {
                AbstractC7549i abstractC7549i = this.f43736k;
                abstractC7549i.f43734n--;
                if (this.f43736k.f43734n == 0 && this.f43736k.f43735q) {
                    was wasVar = was.f36763k;
                    reentrantLockX2.unlock();
                    this.f43736k.wvg();
                }
            } finally {
                reentrantLockX2.unlock();
            }
        }

        @Override // okio.vyq, java.io.Flushable
        public void flush() throws IOException {
            if (!(!this.f43737n)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f43736k.mo27598t();
        }

        @Override // okio.vyq
        /* JADX INFO: renamed from: j */
        public void mo26936j(@InterfaceC7396q x2 source, long j2) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(source, "source");
            if (!(!this.f43737n)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f43736k.ij(this.f43738q, source, j2);
            this.f43738q += j2;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27647k() {
            return this.f43737n;
        }

        /* JADX INFO: renamed from: p */
        public final void m27648p(long j2) {
            this.f43738q = j2;
        }

        /* JADX INFO: renamed from: q */
        public final long m27649q() {
            return this.f43738q;
        }

        @Override // okio.vyq
        @InterfaceC7396q
        public C7560j toq() {
            return C7560j.f43770n;
        }

        /* JADX INFO: renamed from: y */
        public final void m27650y(boolean z2) {
            this.f43737n = z2;
        }

        @InterfaceC7396q
        public final AbstractC7549i zy() {
            return this.f43736k;
        }
    }

    /* JADX INFO: renamed from: okio.i$toq */
    /* JADX INFO: compiled from: FileHandle.kt */
    @lv5({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    private static final class toq implements nn86 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final AbstractC7549i f43739k;

        /* JADX INFO: renamed from: n */
        private boolean f43740n;

        /* JADX INFO: renamed from: q */
        private long f43741q;

        public toq(@InterfaceC7396q AbstractC7549i fileHandle, long j2) {
            kotlin.jvm.internal.d2ok.m23075h(fileHandle, "fileHandle");
            this.f43739k = fileHandle;
            this.f43741q = j2;
        }

        @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f43740n) {
                return;
            }
            this.f43740n = true;
            ReentrantLock reentrantLockX2 = this.f43739k.x2();
            reentrantLockX2.lock();
            try {
                AbstractC7549i abstractC7549i = this.f43739k;
                abstractC7549i.f43734n--;
                if (this.f43739k.f43734n == 0 && this.f43739k.f43735q) {
                    was wasVar = was.f36763k;
                    reentrantLockX2.unlock();
                    this.f43739k.wvg();
                }
            } finally {
                reentrantLockX2.unlock();
            }
        }

        /* JADX INFO: renamed from: k */
        public final boolean m27651k() {
            return this.f43740n;
        }

        /* JADX INFO: renamed from: p */
        public final void m27652p(long j2) {
            this.f43741q = j2;
        }

        /* JADX INFO: renamed from: q */
        public final long m27653q() {
            return this.f43741q;
        }

        @Override // okio.nn86
        @InterfaceC7396q
        public C7560j toq() {
            return C7560j.f43770n;
        }

        @Override // okio.nn86
        public long wx16(@InterfaceC7396q x2 sink, long j2) throws IOException {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            if (!(!this.f43740n)) {
                throw new IllegalStateException("closed".toString());
            }
            long jA98o = this.f43739k.a98o(this.f43741q, sink, j2);
            if (jA98o != -1) {
                this.f43741q += jA98o;
            }
            return jA98o;
        }

        /* JADX INFO: renamed from: y */
        public final void m27654y(boolean z2) {
            this.f43740n = z2;
        }

        @InterfaceC7396q
        public final AbstractC7549i zy() {
            return this.f43739k;
        }
    }

    public AbstractC7549i(boolean z2) {
        this.f43733k = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long a98o(long j2, x2 x2Var, long j3) throws IOException {
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j4 = j2 + j3;
        long j5 = j2;
        while (true) {
            if (j5 >= j4) {
                break;
            }
            C7541c c7541cM58i = x2Var.m58i(1);
            int iD2ok = d2ok(j5, c7541cM58i.f43687k, c7541cM58i.f94264zy, (int) Math.min(j4 - j5, 8192 - r9));
            if (iD2ok == -1) {
                if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
                    x2Var.f43846k = c7541cM58i.toq();
                    lrht.m27786q(c7541cM58i);
                }
                if (j2 == j5) {
                    return -1L;
                }
            } else {
                c7541cM58i.f94264zy += iD2ok;
                long j6 = iD2ok;
                j5 += j6;
                x2Var.vy(x2Var.size() + j6);
            }
        }
        return j5 - j2;
    }

    public static /* synthetic */ nn86 bwp(AbstractC7549i abstractC7549i, long j2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        return abstractC7549i.ltg8(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ij(long j2, x2 x2Var, long j3) throws IOException {
        C7575s.m27855n(x2Var.size(), 0L, j3);
        long j4 = j3 + j2;
        while (j2 < j4) {
            C7541c c7541c = x2Var.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int iMin = (int) Math.min(j4 - j2, c7541c.f94264zy - c7541c.f94263toq);
            yz(j2, c7541c.f43687k, c7541c.f94263toq, iMin);
            c7541c.f94263toq += iMin;
            long j5 = iMin;
            j2 += j5;
            x2Var.vy(x2Var.size() - j5);
            if (c7541c.f94263toq == c7541c.f94264zy) {
                x2Var.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            }
        }
    }

    public static /* synthetic */ vyq was(AbstractC7549i abstractC7549i, long j2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        return abstractC7549i.g1(j2);
    }

    public final void bek6(long j2, @InterfaceC7396q x2 source, long j3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!this.f43733k) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            ij(j2, source, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (this.f43735q) {
                return;
            }
            this.f43735q = true;
            if (this.f43734n != 0) {
                return;
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            wvg();
        } finally {
            reentrantLock.unlock();
        }
    }

    protected abstract int d2ok(long j2, @InterfaceC7396q byte[] bArr, int i2, int i3) throws IOException;

    /* JADX INFO: renamed from: f */
    protected abstract long mo27597f() throws IOException;

    public final void flush() throws IOException {
        if (!this.f43733k) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            mo27598t();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long fu4(@InterfaceC7396q nn86 source) throws IOException {
        long size;
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (source instanceof C7544f) {
            C7544f c7544f = (C7544f) source;
            size = c7544f.f43703q.size();
            source = c7544f.f43701k;
        } else {
            size = 0;
        }
        if (!((source instanceof toq) && ((toq) source).zy() == this)) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        toq toqVar = (toq) source;
        if (!toqVar.m27651k()) {
            return toqVar.m27653q() - size;
        }
        throw new IllegalStateException("closed".toString());
    }

    @InterfaceC7396q
    public final vyq g1(long j2) throws IOException {
        if (!this.f43733k) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f43734n++;
            reentrantLock.unlock();
            return new k(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27645h() {
        return this.f43733k;
    }

    public final void h7am(long j2, @InterfaceC7396q byte[] array, int i2, int i3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        if (!this.f43733k) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            yz(j2, array, i2, i3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected abstract void hyr(long j2) throws IOException;

    public final long i1(long j2, @InterfaceC7396q x2 sink, long j3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            return a98o(j2, sink, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long ki(@InterfaceC7396q vyq sink) throws IOException {
        long size;
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (sink instanceof hyr) {
            hyr hyrVar = (hyr) sink;
            size = hyrVar.f43730q.size();
            sink = hyrVar.f43728k;
        } else {
            size = 0;
        }
        if (!((sink instanceof k) && ((k) sink).zy() == this)) {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        k kVar = (k) sink;
        if (!kVar.m27647k()) {
            return kVar.m27649q() + size;
        }
        throw new IllegalStateException("closed".toString());
    }

    @InterfaceC7396q
    public final vyq ld6() throws IOException {
        return g1(size());
    }

    @InterfaceC7396q
    public final nn86 ltg8(long j2) throws IOException {
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f43734n++;
            reentrantLock.unlock();
            return new toq(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void nmn5(@InterfaceC7396q nn86 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        boolean z2 = false;
        if (!(source instanceof C7544f)) {
            if ((source instanceof toq) && ((toq) source).zy() == this) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalArgumentException("source was not created by this FileHandle".toString());
            }
            toq toqVar = (toq) source;
            if (!(!toqVar.m27651k())) {
                throw new IllegalStateException("closed".toString());
            }
            toqVar.m27652p(j2);
            return;
        }
        C7544f c7544f = (C7544f) source;
        nn86 nn86Var = c7544f.f43701k;
        if (!((nn86Var instanceof toq) && ((toq) nn86Var).zy() == this)) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        toq toqVar2 = (toq) nn86Var;
        if (!(!toqVar2.m27651k())) {
            throw new IllegalStateException("closed".toString());
        }
        long size = c7544f.f43703q.size();
        long jM27653q = j2 - (toqVar2.m27653q() - size);
        if (0 <= jM27653q && jM27653q < size) {
            z2 = true;
        }
        if (z2) {
            c7544f.skip(jM27653q);
        } else {
            c7544f.f43703q.m27873y();
            toqVar2.m27652p(j2);
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            return mo27597f();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    protected abstract void mo27598t() throws IOException;

    public final void t8iq(long j2) throws IOException {
        if (!this.f43733k) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            hyr(j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected abstract void wvg() throws IOException;

    /* JADX INFO: renamed from: x */
    public final void m27646x(@InterfaceC7396q vyq sink, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        boolean z2 = false;
        if (!(sink instanceof hyr)) {
            if ((sink instanceof k) && ((k) sink).zy() == this) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
            }
            k kVar = (k) sink;
            if (!(!kVar.m27647k())) {
                throw new IllegalStateException("closed".toString());
            }
            kVar.m27648p(j2);
            return;
        }
        hyr hyrVar = (hyr) sink;
        vyq vyqVar = hyrVar.f43728k;
        if ((vyqVar instanceof k) && ((k) vyqVar).zy() == this) {
            z2 = true;
        }
        if (!z2) {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        k kVar2 = (k) vyqVar;
        if (!(!kVar2.m27647k())) {
            throw new IllegalStateException("closed".toString());
        }
        hyrVar.fn3e();
        kVar2.m27648p(j2);
    }

    @InterfaceC7396q
    public final ReentrantLock x2() {
        return this.f43732g;
    }

    public final int y9n(long j2, @InterfaceC7396q byte[] array, int i2, int i3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        ReentrantLock reentrantLock = this.f43732g;
        reentrantLock.lock();
        try {
            if (!(!this.f43735q)) {
                throw new IllegalStateException("closed".toString());
            }
            was wasVar = was.f36763k;
            reentrantLock.unlock();
            return d2ok(j2, array, i2, i3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected abstract void yz(long j2, @InterfaceC7396q byte[] bArr, int i2, int i3) throws IOException;
}
