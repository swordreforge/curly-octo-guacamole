package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.push.lh;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes3.dex */
class rp {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile boolean f73549f7l8;

    /* JADX INFO: renamed from: g */
    private zff0 f33614g;

    /* JADX INFO: renamed from: n */
    private InputStream f33616n;

    /* JADX INFO: renamed from: y */
    private byte[] f33618y;

    /* JADX INFO: renamed from: k */
    private ByteBuffer f33615k = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ByteBuffer f73550toq = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Adler32 f73551zy = new Adler32();

    /* JADX INFO: renamed from: q */
    private r6ty f33617q = new r6ty();

    rp(InputStream inputStream, zff0 zff0Var) {
        this.f33616n = new BufferedInputStream(inputStream);
        this.f33614g = zff0Var;
    }

    /* JADX INFO: renamed from: g */
    private void m21453g() throws IOException {
        boolean z2 = false;
        this.f73549f7l8 = false;
        o5 o5VarM21455k = m21455k();
        if ("CONN".equals(o5VarM21455k.m21349n())) {
            lh.C5875g c5875gN7h = lh.C5875g.n7h(o5VarM21455k.m21346h());
            if (c5875gN7h.m21159h()) {
                this.f33614g.n7h(c5875gN7h.kja0());
                z2 = true;
            }
            if (c5875gN7h.m21160i()) {
                lh.toq toqVarM21161p = c5875gN7h.m21161p();
                o5 o5Var = new o5();
                o5Var.x2("SYNC", "CONF");
                o5Var.n7h(toqVarM21161p.m20674y(), null);
                this.f33614g.lrht(o5Var);
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] CONN: host = " + c5875gN7h.ki());
        }
        if (!z2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        this.f33618y = this.f33614g.uv6();
        while (!this.f73549f7l8) {
            o5 o5VarM21455k2 = m21455k();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f33614g.mcp();
            short sF7l8 = o5VarM21455k2.f7l8();
            if (sF7l8 == 1) {
                this.f33614g.lrht(o5VarM21455k2);
            } else if (sF7l8 != 2) {
                if (sF7l8 != 3) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] unknow blob type " + ((int) o5VarM21455k2.f7l8()));
                } else {
                    try {
                        this.f33614g.vyq(this.f33617q.m21416k(o5VarM21455k2.m21346h(), this.f33614g));
                    } catch (Exception e2) {
                        com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] Parse packet from Blob chid=" + o5VarM21455k2.m21348k() + "; Id=" + o5VarM21455k2.jk() + " failure:" + e2.getMessage());
                    }
                }
            } else if ("SECMSG".equals(o5VarM21455k2.m21349n()) && ((o5VarM21455k2.m21348k() == 2 || o5VarM21455k2.m21348k() == 3) && TextUtils.isEmpty(o5VarM21455k2.m21347i()))) {
                try {
                    xtb7 xtb7VarM21416k = this.f33617q.m21416k(o5VarM21455k2.cdj(com.xiaomi.push.service.eqxt.zy().toq(Integer.valueOf(o5VarM21455k2.m21348k()).toString(), o5VarM21455k2.fti()).f33765s), this.f33614g);
                    xtb7VarM21416k.f34184p = jCurrentTimeMillis;
                    this.f33614g.vyq(xtb7VarM21416k);
                } catch (Exception e3) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim] Parse packet from Blob chid=" + o5VarM21455k2.m21348k() + "; Id=" + o5VarM21455k2.jk() + " failure:" + e3.getMessage());
                }
            } else {
                this.f33614g.lrht(o5VarM21455k2);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m21454q(ByteBuffer byteBuffer, int i2) throws IOException {
        int iPosition = byteBuffer.position();
        do {
            int i3 = this.f33616n.read(byteBuffer.array(), iPosition, i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 -= i3;
            iPosition += i3;
        } while (i2 > 0);
        byteBuffer.position(iPosition);
    }

    private ByteBuffer toq() throws IOException {
        this.f33615k.clear();
        m21454q(this.f33615k, 8);
        short s2 = this.f33615k.getShort(0);
        short s3 = this.f33615k.getShort(2);
        if (s2 != -15618 || s3 != 5) {
            throw new IOException("Malformed Input");
        }
        int i2 = this.f33615k.getInt(4);
        int iPosition = this.f33615k.position();
        if (i2 > 32768) {
            throw new IOException("Blob size too large");
        }
        if (i2 + 4 > this.f33615k.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2 + 2048);
            byteBufferAllocate.put(this.f33615k.array(), 0, this.f33615k.arrayOffset() + this.f33615k.position());
            this.f33615k = byteBufferAllocate;
        } else if (this.f33615k.capacity() > 4096 && i2 < 2048) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.put(this.f33615k.array(), 0, this.f33615k.arrayOffset() + this.f33615k.position());
            this.f33615k = byteBufferAllocate2;
        }
        m21454q(this.f33615k, i2);
        this.f73550toq.clear();
        m21454q(this.f73550toq, 4);
        this.f73550toq.position(0);
        int i3 = this.f73550toq.getInt();
        this.f73551zy.reset();
        this.f73551zy.update(this.f33615k.array(), 0, this.f33615k.position());
        if (i3 == ((int) this.f73551zy.getValue())) {
            byte[] bArr = this.f33618y;
            if (bArr != null) {
                com.xiaomi.push.service.n5r1.m21695p(bArr, this.f33615k.array(), true, iPosition, i2);
            }
            return this.f33615k;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("CRC = " + ((int) this.f73551zy.getValue()) + " and " + i3);
        throw new IOException("Corrupted Blob bad CRC");
    }

    /* JADX INFO: renamed from: k */
    o5 m21455k() throws IOException {
        int iPosition;
        ByteBuffer qVar;
        try {
            qVar = toq();
            iPosition = qVar.position();
        } catch (IOException e2) {
            e = e2;
            iPosition = 0;
        }
        try {
            qVar.flip();
            qVar.position(8);
            o5 yp31Var = iPosition == 8 ? new yp31() : o5.m21344q(qVar.slice());
            com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] Read {cmd=" + yp31Var.m21349n() + ";chid=" + yp31Var.m21348k() + ";len=" + iPosition + "}");
            return yp31Var;
        } catch (IOException e3) {
            e = e3;
            if (iPosition == 0) {
                iPosition = this.f33615k.position();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[Slim] read Blob [");
            byte[] bArrArray = this.f33615k.array();
            if (iPosition > 128) {
                iPosition = 128;
            }
            sb.append(f7l8.m20835k(bArrArray, 0, iPosition));
            sb.append("] Err:");
            sb.append(e.getMessage());
            com.xiaomi.channel.commonutils.logger.zy.kja0(sb.toString());
            throw e;
        }
    }

    /* JADX INFO: renamed from: n */
    void m21456n() {
        this.f73549f7l8 = true;
    }

    void zy() throws IOException {
        try {
            m21453g();
        } catch (IOException e2) {
            if (!this.f73549f7l8) {
                throw e2;
            }
        }
    }
}
