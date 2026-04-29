package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.upstream.C3794f;
import com.google.android.exoplayer2.upstream.jp0y;
import com.google.android.exoplayer2.upstream.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.collect.zkd;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: HttpMediaDrmCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public final class oc implements lvui {

    /* JADX INFO: renamed from: n */
    private static final int f19676n = 5;

    /* JADX INFO: renamed from: k */
    private final jp0y.zy f19677k;

    /* JADX INFO: renamed from: q */
    private final Map<String, String> f19678q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final String f63623toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f63624zy;

    public oc(@zy.dd String str, jp0y.zy zyVar) {
        this(str, false, zyVar);
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    private static String m11643g(jp0y.C3799g c3799g, int i2) {
        Map<String, List<String>> map;
        List<String> list;
        int i3 = c3799g.responseCode;
        if (!((i3 == 307 || i3 == 308) && i2 < 5) || (map = c3799g.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: n */
    private static byte[] m11644n(jp0y.zy zyVar, String str, @zy.dd byte[] bArr, Map<String, String> map) throws C3319r {
        C3794f c3794f = new C3794f(zyVar.mo7265k());
        com.google.android.exoplayer2.upstream.t8r t8rVarM13519k = new t8r.toq().ld6(str).m13518g(map).m13520n(2).m13522q(bArr).zy(1).m13519k();
        int i2 = 0;
        com.google.android.exoplayer2.upstream.t8r t8rVarM13519k2 = t8rVarM13519k;
        while (true) {
            try {
                com.google.android.exoplayer2.upstream.cdj cdjVar = new com.google.android.exoplayer2.upstream.cdj(c3794f, t8rVarM13519k2);
                try {
                    return lrht.m28265do(cdjVar);
                } catch (jp0y.C3799g e2) {
                    String strM11643g = m11643g(e2, i2);
                    if (strM11643g == null) {
                        throw e2;
                    }
                    i2++;
                    t8rVarM13519k2 = t8rVarM13519k2.m13513k().ld6(strM11643g).m13519k();
                } finally {
                    lrht.m13659h(cdjVar);
                }
            } catch (Exception e3) {
                throw new C3319r(t8rVarM13519k, (Uri) C3844k.f7l8(c3794f.ni7()), c3794f.toq(), c3794f.zurt(), e3);
            }
        }
    }

    public void f7l8(String str, String str2) {
        C3844k.f7l8(str);
        C3844k.f7l8(str2);
        synchronized (this.f19678q) {
            this.f19678q.put(str, str2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.lvui
    /* JADX INFO: renamed from: k */
    public byte[] mo11587k(UUID uuid, wvg.C3327y c3327y) throws C3319r {
        String qVar = c3327y.toq();
        String strD3 = lrht.d3(c3327y.m11651k());
        StringBuilder sb = new StringBuilder(String.valueOf(qVar).length() + 15 + String.valueOf(strD3).length());
        sb.append(qVar);
        sb.append("&signedRequest=");
        sb.append(strD3);
        return m11644n(this.f19677k, sb.toString(), null, Collections.emptyMap());
    }

    /* JADX INFO: renamed from: q */
    public void m11645q(String str) {
        C3844k.f7l8(str);
        synchronized (this.f19678q) {
            this.f19678q.remove(str);
        }
    }

    @Override // com.google.android.exoplayer2.drm.lvui
    public byte[] toq(UUID uuid, wvg.toq toqVar) throws C3319r {
        String qVar = toqVar.toq();
        if (this.f63624zy || TextUtils.isEmpty(qVar)) {
            qVar = this.f63623toq;
        }
        if (TextUtils.isEmpty(qVar)) {
            throw new C3319r(new t8r.toq().m13521p(Uri.EMPTY).m13519k(), Uri.EMPTY, zkd.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C3548p.f65162ew;
        map.put(com.google.common.net.zy.f68571zy, uuid2.equals(uuid) ? "text/xml" : C3548p.f65226nme.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f19678q) {
            map.putAll(this.f19678q);
        }
        return m11644n(this.f19677k, qVar, toqVar.m11650k(), map);
    }

    public void zy() {
        synchronized (this.f19678q) {
            this.f19678q.clear();
        }
    }

    public oc(@zy.dd String str, boolean z2, jp0y.zy zyVar) {
        C3844k.m13629k((z2 && TextUtils.isEmpty(str)) ? false : true);
        this.f19677k = zyVar;
        this.f63623toq = str;
        this.f63624zy = z2;
        this.f19678q = new HashMap();
    }
}
