package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;
import okio.qrj;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.ws.s */
/* JADX INFO: compiled from: WebSocketWriter.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class C7509s implements Closeable {

    /* JADX INFO: renamed from: g */
    private final boolean f43429g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final x2 f43430h;

    /* JADX INFO: renamed from: i */
    private boolean f43431i;

    /* JADX INFO: renamed from: k */
    private final boolean f43432k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Random f43433n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final x2 f43434p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final qrj f43435q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7395n
    private final x2.C7577k f43436r;

    /* JADX INFO: renamed from: s */
    private final long f43437s;

    /* JADX INFO: renamed from: t */
    @InterfaceC7395n
    private final byte[] f43438t;

    /* JADX INFO: renamed from: y */
    private final boolean f43439y;

    /* JADX INFO: renamed from: z */
    @InterfaceC7395n
    private C7506k f43440z;

    public C7509s(boolean z2, @InterfaceC7396q qrj sink, @InterfaceC7396q Random random, boolean z3, boolean z5, long j2) {
        d2ok.m23075h(sink, "sink");
        d2ok.m23075h(random, "random");
        this.f43432k = z2;
        this.f43435q = sink;
        this.f43433n = random;
        this.f43429g = z3;
        this.f43439y = z5;
        this.f43437s = j2;
        this.f43434p = new x2();
        this.f43430h = sink.mo27638g();
        this.f43438t = z2 ? new byte[4] : null;
        this.f43436r = z2 ? new x2.C7577k() : null;
    }

    /* JADX INFO: renamed from: y */
    private final void m27295y(int i2, kja0 kja0Var) throws IOException {
        if (this.f43431i) {
            throw new IOException("closed");
        }
        int size = kja0Var.size();
        if (!(((long) size) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f43430h.writeByte(i2 | 128);
        if (this.f43432k) {
            this.f43430h.writeByte(size | 128);
            Random random = this.f43433n;
            byte[] bArr = this.f43438t;
            d2ok.qrj(bArr);
            random.nextBytes(bArr);
            this.f43430h.write(this.f43438t);
            if (size > 0) {
                long size2 = this.f43430h.size();
                this.f43430h.uc(kja0Var);
                x2 x2Var = this.f43430h;
                x2.C7577k c7577k = this.f43436r;
                d2ok.qrj(c7577k);
                x2Var.nsb(c7577k);
                this.f43436r.m27875p(size2);
                f7l8.f43391k.zy(this.f43436r, this.f43438t);
                this.f43436r.close();
            }
        } else {
            this.f43430h.writeByte(size);
            this.f43430h.uc(kja0Var);
        }
        this.f43435q.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        C7506k c7506k = this.f43440z;
        if (c7506k != null) {
            c7506k.close();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Random m27296k() {
        return this.f43433n;
    }

    public final void ld6(@InterfaceC7396q kja0 payload) throws IOException {
        d2ok.m23075h(payload, "payload");
        m27295y(9, payload);
    }

    /* JADX INFO: renamed from: p */
    public final void m27297p(int i2, @InterfaceC7396q kja0 data) throws IOException {
        d2ok.m23075h(data, "data");
        if (this.f43431i) {
            throw new IOException("closed");
        }
        this.f43434p.uc(data);
        int i3 = i2 | 128;
        if (this.f43429g && data.size() >= this.f43437s) {
            C7506k c7506k = this.f43440z;
            if (c7506k == null) {
                c7506k = new C7506k(this.f43439y);
                this.f43440z = c7506k;
            }
            c7506k.m27279k(this.f43434p);
            i3 |= 64;
        }
        long size = this.f43434p.size();
        this.f43430h.writeByte(i3);
        int i4 = this.f43432k ? 128 : 0;
        if (size <= 125) {
            this.f43430h.writeByte(((int) size) | i4);
        } else if (size <= f7l8.f43390i) {
            this.f43430h.writeByte(i4 | 126);
            this.f43430h.writeShort((int) size);
        } else {
            this.f43430h.writeByte(i4 | 127);
            this.f43430h.writeLong(size);
        }
        if (this.f43432k) {
            Random random = this.f43433n;
            byte[] bArr = this.f43438t;
            d2ok.qrj(bArr);
            random.nextBytes(bArr);
            this.f43430h.write(this.f43438t);
            if (size > 0) {
                x2 x2Var = this.f43434p;
                x2.C7577k c7577k = this.f43436r;
                d2ok.qrj(c7577k);
                x2Var.nsb(c7577k);
                this.f43436r.m27875p(0L);
                f7l8.f43391k.zy(this.f43436r, this.f43438t);
                this.f43436r.close();
            }
        }
        this.f43430h.mo26936j(this.f43434p, size);
        this.f43435q.fn3e();
    }

    /* JADX INFO: renamed from: q */
    public final void m27298q(int i2, @InterfaceC7395n kja0 kja0Var) throws IOException {
        kja0 kja0VarUj2j = kja0.EMPTY;
        if (i2 != 0 || kja0Var != null) {
            if (i2 != 0) {
                f7l8.f43391k.m27271q(i2);
            }
            x2 x2Var = new x2();
            x2Var.writeShort(i2);
            if (kja0Var != null) {
                x2Var.uc(kja0Var);
            }
            kja0VarUj2j = x2Var.uj2j();
        }
        try {
            m27295y(8, kja0VarUj2j);
        } finally {
            this.f43431i = true;
        }
    }

    public final void x2(@InterfaceC7396q kja0 payload) throws IOException {
        d2ok.m23075h(payload, "payload");
        m27295y(10, payload);
    }

    @InterfaceC7396q
    public final qrj zy() {
        return this.f43435q;
    }
}
