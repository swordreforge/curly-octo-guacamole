package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.C3827z;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 implements kja0 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f66877cdj = "udp";

    /* JADX INFO: renamed from: h */
    private static final String f23042h = "rtmp";

    /* JADX INFO: renamed from: i */
    private static final String f23043i = "android.resource";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f66878ki = "data";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f66879kja0 = "content";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f66880n7h = "asset";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f66881qrj = "DefaultDataSource";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f66882t8r = "rawresource";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private kja0 f66883f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private kja0 f23044g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    private kja0 f66884ld6;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private kja0 f23045n;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private kja0 f23046p;

    /* JADX INFO: renamed from: q */
    private final kja0 f23047q;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private kja0 f23048s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Context f66885toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.dd
    private kja0 f66886x2;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private kja0 f23049y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<uv6> f66887zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.ni7$k */
    /* JADX INFO: compiled from: DefaultDataSource.java */
    public static final class C3811k implements kja0.InterfaceC3804k {

        /* JADX INFO: renamed from: k */
        private final Context f23050k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final kja0.InterfaceC3804k f66888toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private uv6 f66889zy;

        public C3811k(Context context) {
            this(context, new C3827z.toq());
        }

        /* JADX INFO: renamed from: q */
        public C3811k m13496q(@zy.dd uv6 uv6Var) {
            this.f66889zy = uv6Var;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public ni7 mo7265k() {
            ni7 ni7Var = new ni7(this.f23050k, this.f66888toq.mo7265k());
            uv6 uv6Var = this.f66889zy;
            if (uv6Var != null) {
                ni7Var.mo7271n(uv6Var);
            }
            return ni7Var;
        }

        public C3811k(Context context, kja0.InterfaceC3804k interfaceC3804k) {
            this.f23050k = context.getApplicationContext();
            this.f66888toq = interfaceC3804k;
        }
    }

    public ni7(Context context, boolean z2) {
        this(context, null, 8000, 8000, z2);
    }

    private kja0 fu4() {
        if (this.f66883f7l8 == null) {
            ld6 ld6Var = new ld6(this.f66885toq);
            this.f66883f7l8 = ld6Var;
            zurt(ld6Var);
        }
        return this.f66883f7l8;
    }

    private void jk(@zy.dd kja0 kja0Var, uv6 uv6Var) {
        if (kja0Var != null) {
            kja0Var.mo7271n(uv6Var);
        }
    }

    private kja0 mcp() {
        if (this.f23048s == null) {
            vyq vyqVar = new vyq();
            this.f23048s = vyqVar;
            zurt(vyqVar);
        }
        return this.f23048s;
    }

    private kja0 ni7() {
        if (this.f23044g == null) {
            zy zyVar = new zy(this.f66885toq);
            this.f23044g = zyVar;
            zurt(zyVar);
        }
        return this.f23044g;
    }

    private kja0 o1t() {
        if (this.f23045n == null) {
            a9 a9Var = new a9();
            this.f23045n = a9Var;
            zurt(a9Var);
        }
        return this.f23045n;
    }

    /* JADX INFO: renamed from: t */
    private kja0 m13494t() {
        if (this.f23049y == null) {
            try {
                kja0 kja0Var = (kja0) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f23049y = kja0Var;
                zurt(kja0Var);
            } catch (ClassNotFoundException unused) {
                com.google.android.exoplayer2.util.ni7.qrj(f66881qrj, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.f23049y == null) {
                this.f23049y = this.f23047q;
            }
        }
        return this.f23049y;
    }

    private kja0 wvg() {
        if (this.f66884ld6 == null) {
            x9kr x9krVar = new x9kr(this.f66885toq);
            this.f66884ld6 = x9krVar;
            zurt(x9krVar);
        }
        return this.f66884ld6;
    }

    /* JADX INFO: renamed from: z */
    private kja0 m13495z() {
        if (this.f23046p == null) {
            qrj qrjVar = new qrj();
            this.f23046p = qrjVar;
            zurt(qrjVar);
        }
        return this.f23046p;
    }

    private void zurt(kja0 kja0Var) {
        for (int i2 = 0; i2 < this.f66887zy.size(); i2++) {
            kja0Var.mo7271n(this.f66887zy.get(i2));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        kja0 kja0Var = this.f66886x2;
        if (kja0Var != null) {
            try {
                kja0Var.close();
            } finally {
                this.f66886x2 = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        kja0 kja0Var = this.f66886x2;
        if (kja0Var == null) {
            return null;
        }
        return kja0Var.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws IOException {
        C3844k.m13633s(this.f66886x2 == null);
        String scheme = t8rVar.f23103k.getScheme();
        if (com.google.android.exoplayer2.util.lrht.wo(t8rVar.f23103k)) {
            String path = t8rVar.f23103k.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f66886x2 = o1t();
            } else {
                this.f66886x2 = ni7();
            }
        } else if (f66880n7h.equals(scheme)) {
            this.f66886x2 = ni7();
        } else if ("content".equals(scheme)) {
            this.f66886x2 = fu4();
        } else if (f23042h.equals(scheme)) {
            this.f66886x2 = m13494t();
        } else if (f66877cdj.equals(scheme)) {
            this.f66886x2 = mcp();
        } else if ("data".equals(scheme)) {
            this.f66886x2 = m13495z();
        } else if ("rawresource".equals(scheme) || f23043i.equals(scheme)) {
            this.f66886x2 = wvg();
        } else {
            this.f66886x2 = this.f23047q;
        }
        return this.f66886x2.mo7270k(t8rVar);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f23047q.mo7271n(uv6Var);
        this.f66887zy.add(uv6Var);
        jk(this.f23045n, uv6Var);
        jk(this.f23044g, uv6Var);
        jk(this.f66883f7l8, uv6Var);
        jk(this.f23049y, uv6Var);
        jk(this.f23048s, uv6Var);
        jk(this.f23046p, uv6Var);
        jk(this.f66884ld6, uv6Var);
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return ((kja0) C3844k.f7l8(this.f66886x2)).read(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        kja0 kja0Var = this.f66886x2;
        return kja0Var == null ? Collections.emptyMap() : kja0Var.toq();
    }

    public ni7(Context context, @zy.dd String str, boolean z2) {
        this(context, str, 8000, 8000, z2);
    }

    public ni7(Context context, @zy.dd String str, int i2, int i3, boolean z2) {
        this(context, new C3827z.toq().ld6(str).m13530n(i2).m13533s(i3).m13532q(z2).mo7265k());
    }

    public ni7(Context context, kja0 kja0Var) {
        this.f66885toq = context.getApplicationContext();
        this.f23047q = (kja0) C3844k.f7l8(kja0Var);
        this.f66887zy = new ArrayList();
    }
}
