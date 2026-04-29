package okhttp3.internal.ws;

import b7.C1359g;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.kja0;
import okio.n7h;
import okio.x2;

/* JADX INFO: renamed from: okhttp3.internal.ws.y */
/* JADX INFO: compiled from: WebSocketReader.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class C7510y implements Closeable {

    /* JADX INFO: renamed from: c */
    @InterfaceC7395n
    private final byte[] f43442c;

    /* JADX INFO: renamed from: e */
    @InterfaceC7395n
    private final x2.C7577k f43443e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7395n
    private zy f43444f;

    /* JADX INFO: renamed from: g */
    private final boolean f43445g;

    /* JADX INFO: renamed from: h */
    private long f43446h;

    /* JADX INFO: renamed from: i */
    private boolean f43447i;

    /* JADX INFO: renamed from: k */
    private final boolean f43448k;

    /* JADX INFO: renamed from: l */
    @InterfaceC7396q
    private final x2 f43449l;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final k f43450n;

    /* JADX INFO: renamed from: p */
    private int f43451p;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final n7h f43452q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7396q
    private final x2 f43453r;

    /* JADX INFO: renamed from: s */
    private boolean f43454s;

    /* JADX INFO: renamed from: t */
    private boolean f43455t;

    /* JADX INFO: renamed from: y */
    private final boolean f43456y;

    /* JADX INFO: renamed from: z */
    private boolean f43457z;

    /* JADX INFO: renamed from: okhttp3.internal.ws.y$k */
    /* JADX INFO: compiled from: WebSocketReader.kt */
    public interface k {
        /* JADX INFO: renamed from: g */
        void mo27281g(@InterfaceC7396q kja0 kja0Var);

        /* JADX INFO: renamed from: n */
        void mo27285n(@InterfaceC7396q String str) throws IOException;

        /* JADX INFO: renamed from: p */
        void mo27286p(int i2, @InterfaceC7396q String str);

        /* JADX INFO: renamed from: q */
        void mo27287q(@InterfaceC7396q kja0 kja0Var) throws IOException;

        /* JADX INFO: renamed from: y */
        void mo27289y(@InterfaceC7396q kja0 kja0Var);
    }

    public C7510y(boolean z2, @InterfaceC7396q n7h source, @InterfaceC7396q k frameCallback, boolean z3, boolean z5) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(frameCallback, "frameCallback");
        this.f43448k = z2;
        this.f43452q = source;
        this.f43450n = frameCallback;
        this.f43445g = z3;
        this.f43456y = z5;
        this.f43453r = new x2();
        this.f43449l = new x2();
        this.f43442c = z2 ? null : new byte[4];
        this.f43443e = z2 ? null : new x2.C7577k();
    }

    private final void ld6() throws IOException {
        int i2 = this.f43451p;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Unknown opcode: " + C1359g.m5761o(i2));
        }
        m27300p();
        if (this.f43455t) {
            zy zyVar = this.f43444f;
            if (zyVar == null) {
                zyVar = new zy(this.f43456y);
                this.f43444f = zyVar;
            }
            zyVar.m27304k(this.f43449l);
        }
        if (i2 == 1) {
            this.f43450n.mo27285n(this.f43449l.jbh());
        } else {
            this.f43450n.mo27287q(this.f43449l.uj2j());
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m27300p() throws IOException {
        while (!this.f43454s) {
            long j2 = this.f43446h;
            if (j2 > 0) {
                this.f43452q.jp0y(this.f43449l, j2);
                if (!this.f43448k) {
                    x2 x2Var = this.f43449l;
                    x2.C7577k c7577k = this.f43443e;
                    d2ok.qrj(c7577k);
                    x2Var.nsb(c7577k);
                    this.f43443e.m27875p(this.f43449l.size() - this.f43446h);
                    f7l8 f7l8Var = f7l8.f43391k;
                    x2.C7577k c7577k2 = this.f43443e;
                    byte[] bArr = this.f43442c;
                    d2ok.qrj(bArr);
                    f7l8Var.zy(c7577k2, bArr);
                    this.f43443e.close();
                }
            }
            if (this.f43447i) {
                return;
            }
            x2();
            if (this.f43451p != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + C1359g.m5761o(this.f43451p));
            }
        }
        throw new IOException("closed");
    }

    /* JADX INFO: renamed from: q */
    private final void m27301q() throws IOException {
        String strJbh;
        long j2 = this.f43446h;
        if (j2 > 0) {
            this.f43452q.jp0y(this.f43453r, j2);
            if (!this.f43448k) {
                x2 x2Var = this.f43453r;
                x2.C7577k c7577k = this.f43443e;
                d2ok.qrj(c7577k);
                x2Var.nsb(c7577k);
                this.f43443e.m27875p(0L);
                f7l8 f7l8Var = f7l8.f43391k;
                x2.C7577k c7577k2 = this.f43443e;
                byte[] bArr = this.f43442c;
                d2ok.qrj(bArr);
                f7l8Var.zy(c7577k2, bArr);
                this.f43443e.close();
            }
        }
        switch (this.f43451p) {
            case 8:
                short s2 = 1005;
                long size = this.f43453r.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s2 = this.f43453r.readShort();
                    strJbh = this.f43453r.jbh();
                    String qVar = f7l8.f43391k.toq(s2);
                    if (qVar != null) {
                        throw new ProtocolException(qVar);
                    }
                } else {
                    strJbh = "";
                }
                this.f43450n.mo27286p(s2, strJbh);
                this.f43454s = true;
                return;
            case 9:
                this.f43450n.mo27281g(this.f43453r.uj2j());
                return;
            case 10:
                this.f43450n.mo27289y(this.f43453r.uj2j());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C1359g.m5761o(this.f43451p));
        }
    }

    private final void x2() throws IOException {
        while (!this.f43454s) {
            m27302y();
            if (!this.f43457z) {
                return;
            } else {
                m27301q();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m27302y() throws IOException {
        boolean z2;
        if (this.f43454s) {
            throw new IOException("closed");
        }
        long jLd6 = this.f43452q.toq().ld6();
        this.f43452q.toq().zy();
        try {
            int iM5763q = C1359g.m5763q(this.f43452q.readByte(), 255);
            this.f43452q.toq().mo27758p(jLd6, TimeUnit.NANOSECONDS);
            int i2 = iM5763q & 15;
            this.f43451p = i2;
            boolean z3 = (iM5763q & 128) != 0;
            this.f43447i = z3;
            boolean z5 = (iM5763q & 8) != 0;
            this.f43457z = z5;
            if (z5 && !z3) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z6 = (iM5763q & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z6) {
                    z2 = false;
                } else {
                    if (!this.f43445g) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z2 = true;
                }
                this.f43455t = z2;
            } else if (z6) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iM5763q & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iM5763q & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iM5763q2 = C1359g.m5763q(this.f43452q.readByte(), 255);
            boolean z7 = (iM5763q2 & 128) != 0;
            if (z7 == this.f43448k) {
                throw new ProtocolException(this.f43448k ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j2 = iM5763q2 & 127;
            this.f43446h = j2;
            if (j2 == 126) {
                this.f43446h = C1359g.m5760n(this.f43452q.readShort(), 65535);
            } else if (j2 == 127) {
                long j3 = this.f43452q.readLong();
                this.f43446h = j3;
                if (j3 < 0) {
                    throw new ProtocolException("Frame length 0x" + C1359g.m5759m(this.f43446h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f43457z && this.f43446h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z7) {
                n7h n7hVar = this.f43452q;
                byte[] bArr = this.f43442c;
                d2ok.qrj(bArr);
                n7hVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f43452q.toq().mo27758p(jLd6, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        zy zyVar = this.f43444f;
        if (zyVar != null) {
            zyVar.close();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final n7h m27303k() {
        return this.f43452q;
    }

    public final void zy() throws IOException {
        m27302y();
        if (this.f43457z) {
            m27301q();
        } else {
            ld6();
        }
    }
}
