package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC3433g;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.cv06;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.n */
/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3507n extends AbstractC3433g implements Handler.Callback {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f64991bo = 0;

    /* JADX INFO: renamed from: u */
    private static final String f20848u = "MetadataRenderer";

    /* JADX INFO: renamed from: a */
    private long f20849a;

    /* JADX INFO: renamed from: b */
    private long f20850b;

    /* JADX INFO: renamed from: c */
    @dd
    private final Handler f20851c;

    /* JADX INFO: renamed from: e */
    private final zy f20852e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC3508q f20853f;

    /* JADX INFO: renamed from: j */
    @dd
    private InterfaceC3500k f20854j;

    /* JADX INFO: renamed from: l */
    private final toq f20855l;

    /* JADX INFO: renamed from: m */
    private boolean f20856m;

    /* JADX INFO: renamed from: o */
    private boolean f20857o;

    /* JADX INFO: renamed from: x */
    @dd
    private Metadata f20858x;

    public C3507n(InterfaceC3508q interfaceC3508q, @dd Looper looper) {
        this(interfaceC3508q, looper, toq.f20892k);
    }

    /* JADX INFO: renamed from: c */
    private boolean m12327c(long j2) {
        boolean z2;
        Metadata metadata = this.f20858x;
        if (metadata == null || this.f20849a > j2) {
            z2 = false;
        } else {
            hyr(metadata);
            this.f20858x = null;
            this.f20849a = C3548p.f65257toq;
            z2 = true;
        }
        if (this.f20857o && this.f20858x == null) {
            this.f20856m = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: f */
    private void m12328f(Metadata metadata) {
        this.f20853f.n7h(metadata);
    }

    private void hyr(Metadata metadata) {
        Handler handler = this.f20851c;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            m12328f(metadata);
        }
    }

    private void lrht() {
        if (this.f20857o || this.f20858x != null) {
            return;
        }
        this.f20852e.mo11567s();
        C3865v c3865vA9 = a9();
        int iNcyb = ncyb(c3865vA9, this.f20852e, 0);
        if (iNcyb != -4) {
            if (iNcyb == -5) {
                this.f20850b = ((xwq3) C3844k.f7l8(c3865vA9.f67166toq)).f23669e;
                return;
            }
            return;
        }
        if (this.f20852e.n7h()) {
            this.f20857o = true;
            return;
        }
        zy zyVar = this.f20852e;
        zyVar.f20893l = this.f20850b;
        zyVar.m11579i();
        Metadata metadataMo12291k = ((InterfaceC3500k) lrht.ld6(this.f20854j)).mo12291k(this.f20852e);
        if (metadataMo12291k != null) {
            ArrayList arrayList = new ArrayList(metadataMo12291k.m12282g());
            n5r1(metadataMo12291k, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.f20858x = new Metadata(arrayList);
            this.f20849a = this.f20852e.f19618s;
        }
    }

    private void n5r1(Metadata metadata, List<Metadata.Entry> list) {
        for (int i2 = 0; i2 < metadata.m12282g(); i2++) {
            xwq3 wrappedMetadataFormat = metadata.zy(i2).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f20855l.mo12345k(wrappedMetadataFormat)) {
                list.add(metadata.zy(i2));
            } else {
                InterfaceC3500k qVar = this.f20855l.toq(wrappedMetadataFormat);
                byte[] bArr = (byte[]) C3844k.f7l8(metadata.zy(i2).mo12285i());
                this.f20852e.mo11567s();
                this.f20852e.ki(bArr.length);
                ((ByteBuffer) lrht.ld6(this.f20852e.f19612g)).put(bArr);
                this.f20852e.m11579i();
                Metadata metadataMo12291k = qVar.mo12291k(this.f20852e);
                if (metadataMo12291k != null) {
                    n5r1(metadataMo12291k, list);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void d2ok(long j2, boolean z2) {
        this.f20858x = null;
        this.f20849a = C3548p.f65257toq;
        this.f20857o = false;
        this.f20856m = false;
    }

    @Override // com.google.android.exoplayer2.bek6, com.google.android.exoplayer2.cv06
    public String getName() {
        return f20848u;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m12328f((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.cv06
    /* JADX INFO: renamed from: k */
    public int mo11518k(xwq3 xwq3Var) {
        if (this.f20855l.mo12345k(xwq3Var)) {
            return cv06.m11557p(xwq3Var.bv == 0 ? 4 : 2);
        }
        return cv06.m11557p(0);
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void oc() {
        this.f20858x = null;
        this.f20849a = C3548p.f65257toq;
        this.f20854j = null;
    }

    @Override // com.google.android.exoplayer2.AbstractC3433g
    protected void x9kr(xwq3[] xwq3VarArr, long j2, long j3) {
        this.f20854j = this.f20855l.toq(xwq3VarArr[0]);
    }

    @Override // com.google.android.exoplayer2.bek6
    public void zurt(long j2, long j3) {
        boolean zM12327c = true;
        while (zM12327c) {
            lrht();
            zM12327c = m12327c(j2);
        }
    }

    @Override // com.google.android.exoplayer2.bek6
    public boolean zy() {
        return this.f20856m;
    }

    public C3507n(InterfaceC3508q interfaceC3508q, @dd Looper looper, toq toqVar) {
        super(5);
        this.f20853f = (InterfaceC3508q) C3844k.f7l8(interfaceC3508q);
        this.f20851c = looper == null ? null : lrht.fu4(looper, this);
        this.f20855l = (toq) C3844k.f7l8(toqVar);
        this.f20852e = new zy();
        this.f20849a = C3548p.f65257toq;
    }
}
