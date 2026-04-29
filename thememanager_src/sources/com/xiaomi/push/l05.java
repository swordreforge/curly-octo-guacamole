package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.push.lh;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes3.dex */
public class l05 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f73404f7l8;

    /* JADX INFO: renamed from: g */
    private int f33288g;

    /* JADX INFO: renamed from: n */
    private OutputStream f33290n;

    /* JADX INFO: renamed from: q */
    private zff0 f33291q;

    /* JADX INFO: renamed from: y */
    private byte[] f33292y;

    /* JADX INFO: renamed from: k */
    ByteBuffer f33289k = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ByteBuffer f73405toq = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Adler32 f73406zy = new Adler32();

    l05(OutputStream outputStream, zff0 zff0Var) {
        this.f33290n = new BufferedOutputStream(outputStream);
        this.f33291q = zff0Var;
        TimeZone timeZone = TimeZone.getDefault();
        this.f33288g = timeZone.getRawOffset() / 3600000;
        this.f73404f7l8 = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* JADX INFO: renamed from: k */
    public int m21151k(o5 o5Var) {
        int iFu4 = o5Var.fu4();
        if (iFu4 > 32768) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Blob size=" + iFu4 + " should be less than 32768 Drop blob chid=" + o5Var.m21348k() + " id=" + o5Var.jk());
            return 0;
        }
        this.f33289k.clear();
        int i2 = iFu4 + 8 + 4;
        if (i2 > this.f33289k.capacity() || this.f33289k.capacity() > 4096) {
            this.f33289k = ByteBuffer.allocate(i2);
        }
        this.f33289k.putShort((short) -15618);
        this.f33289k.putShort((short) 5);
        this.f33289k.putInt(iFu4);
        int iPosition = this.f33289k.position();
        this.f33289k = o5Var.mo21345g(this.f33289k);
        if (!"CONN".equals(o5Var.m21349n())) {
            if (this.f33292y == null) {
                this.f33292y = this.f33291q.uv6();
            }
            com.xiaomi.push.service.n5r1.m21695p(this.f33292y, this.f33289k.array(), true, iPosition, iFu4);
        }
        this.f73406zy.reset();
        this.f73406zy.update(this.f33289k.array(), 0, this.f33289k.position());
        this.f73405toq.putInt(0, (int) this.f73406zy.getValue());
        this.f33290n.write(this.f33289k.array(), 0, this.f33289k.position());
        this.f33290n.write(this.f73405toq.array(), 0, 4);
        this.f33290n.flush();
        int iPosition2 = this.f33289k.position() + 4;
        com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] Wrote {cmd=" + o5Var.m21349n() + ";chid=" + o5Var.m21348k() + ";len=" + iPosition2 + "}");
        return iPosition2;
    }

    public void toq() {
        lh.C5877n c5877n = new lh.C5877n();
        c5877n.x2(106);
        String str = Build.MODEL;
        c5877n.m21178h(str);
        c5877n.zurt(wu.m21970q());
        c5877n.wvg(com.xiaomi.push.service.nn86.f7l8());
        c5877n.m21179i(48);
        c5877n.fti(this.f33291q.m20982i());
        c5877n.oc(this.f33291q.mo20666q());
        c5877n.m21182r(Locale.getDefault().toString());
        int i2 = Build.VERSION.SDK_INT;
        c5877n.o1t(i2);
        c5877n.a9(uf.toq(this.f33291q.fti(), "com.xiaomi.xmsf"));
        byte[] bArrQrj = this.f33291q.zy().qrj();
        if (bArrQrj != null) {
            c5877n.kja0(lh.toq.qrj(bArrQrj));
        }
        o5 o5Var = new o5();
        o5Var.m21353y(0);
        o5Var.x2("CONN", null);
        o5Var.m21350p(0L, "xiaomi.com", null);
        o5Var.n7h(c5877n.m20674y(), null);
        m21151k(o5Var);
        com.xiaomi.channel.commonutils.logger.zy.kja0("[slim] open conn: andver=" + i2 + " sdk=48 tz=" + this.f33288g + ":" + this.f73404f7l8 + " Model=" + str + " os=" + Build.VERSION.INCREMENTAL);
    }

    public void zy() throws IOException {
        o5 o5Var = new o5();
        o5Var.x2("CLOSE", null);
        m21151k(o5Var);
        this.f33290n.close();
    }
}
