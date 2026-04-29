package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.base.C4258g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import zy.InterfaceC7830i;
import zy.hyr;

/* JADX INFO: compiled from: FrameworkMediaDrm.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
public final class d3 implements wvg {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f63584kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final wvg.f7l8 f63585ld6 = new wvg.f7l8() { // from class: com.google.android.exoplayer2.drm.fti
        @Override // com.google.android.exoplayer2.drm.wvg.f7l8
        /* JADX INFO: renamed from: k */
        public final wvg mo11623k(UUID uuid) {
            return d3.eqxt(uuid);
        }
    };

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f63586n7h = "<LA_URL>https://x</LA_URL>";

    /* JADX INFO: renamed from: p */
    private static final String f19634p = "FrameworkMediaDrm";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f63587qrj = "https://x";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f63588x2 = "cenc";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final UUID f63589f7l8;

    /* JADX INFO: renamed from: s */
    private int f19635s;

    /* JADX INFO: renamed from: y */
    private final MediaDrm f19636y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d3$k */
    /* JADX INFO: compiled from: FrameworkMediaDrm.java */
    @hyr(31)
    private static class C3301k {
        private C3301k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static boolean m11599k(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private d3(UUID uuid) throws UnsupportedSchemeException {
        C3844k.f7l8(uuid);
        C3844k.toq(!C3548p.f65129b8.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63589f7l8 = uuid;
        MediaDrm mediaDrm = new MediaDrm(mcp(uuid));
        this.f19636y = mediaDrm;
        this.f19635s = 1;
        if (C3548p.f65247r25n.equals(uuid) && d2ok()) {
            a9(mediaDrm);
        }
    }

    @SuppressLint({"WrongConstant"})
    private static void a9(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static boolean d2ok() {
        return "ASUS_Z00AD".equals(lrht.f23233q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d3(wvg.InterfaceC3324n interfaceC3324n, MediaDrm mediaDrm, byte[] bArr, long j2) {
        interfaceC3324n.m11648k(this, bArr, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wvg eqxt(UUID uuid) {
        try {
            return lvui(uuid);
        } catch (x9kr unused) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(strValueOf);
            sb.append(".");
            com.google.android.exoplayer2.util.ni7.m13702q(f19634p, sb.toString());
            return new C3330z();
        }
    }

    private static DrmInitData.SchemeData fti(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z2;
        if (!C3548p.f65247r25n.equals(uuid)) {
            return list.get(0);
        }
        if (lrht.f23230k >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int length = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                DrmInitData.SchemeData schemeData2 = list.get(i2);
                byte[] bArr = (byte[]) C3844k.f7l8(schemeData2.f19629y);
                if (!lrht.zy(schemeData2.f19625g, schemeData.f19625g) || !lrht.zy(schemeData2.f19627n, schemeData.f19627n) || !com.google.android.exoplayer2.extractor.mp4.x2.zy(bArr)) {
                    z2 = false;
                    break;
                }
                length += bArr.length;
            }
            z2 = true;
            if (z2) {
                byte[] bArr2 = new byte[length];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) C3844k.f7l8(list.get(i4).f19629y);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length2);
                    i3 += length2;
                }
                return schemeData.toq(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            DrmInitData.SchemeData schemeData3 = list.get(i5);
            int iF7l8 = com.google.android.exoplayer2.extractor.mp4.x2.f7l8((byte[]) C3844k.f7l8(schemeData3.f19629y));
            int i6 = lrht.f23230k;
            if (i6 < 23 && iF7l8 == 0) {
                return schemeData3;
            }
            if (i6 >= 23 && iF7l8 == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gvn7(wvg.InterfaceC3325q interfaceC3325q, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
        interfaceC3325q.mo11649k(this, bArr, i2, i3, bArr2);
    }

    public static boolean jp0y(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(mcp(uuid));
    }

    public static d3 lvui(UUID uuid) throws x9kr {
        try {
            return new d3(uuid);
        } catch (UnsupportedSchemeException e2) {
            throw new x9kr(1, e2);
        } catch (Exception e3) {
            throw new x9kr(2, e3);
        }
    }

    private static UUID mcp(UUID uuid) {
        return (lrht.f23230k >= 27 || !C3548p.f65226nme.equals(uuid)) ? uuid : C3548p.f65129b8;
    }

    private static byte[] o1t(UUID uuid, byte[] bArr) {
        return C3548p.f65226nme.equals(uuid) ? C3313k.m11638k(bArr) : bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oc(wvg.InterfaceC3322g interfaceC3322g, MediaDrm mediaDrm, byte[] bArr, List list, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new wvg.zy(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        interfaceC3322g.m11647k(this, bArr, arrayList, z2);
    }

    /* JADX INFO: renamed from: t */
    private static String m11588t(UUID uuid, String str) {
        return (lrht.f23230k < 26 && C3548p.f65226nme.equals(uuid) && (com.google.android.exoplayer2.util.wvg.f23301g.equals(str) || com.google.android.exoplayer2.util.wvg.f67129o1t.equals(str))) ? "cenc" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] wvg(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.google.android.exoplayer2.C3548p.f65162ew
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.google.android.exoplayer2.extractor.mp4.x2.m11885n(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = m11589z(r4)
            byte[] r4 = com.google.android.exoplayer2.extractor.mp4.x2.m11884k(r0, r4)
        L18:
            int r1 = com.google.android.exoplayer2.util.lrht.f23230k
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.google.android.exoplayer2.C3548p.f65247r25n
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.google.android.exoplayer2.util.lrht.f67042zy
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.google.android.exoplayer2.util.lrht.f23233q
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.google.android.exoplayer2.extractor.mp4.x2.m11885n(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.d3.wvg(java.util.UUID, byte[]):byte[]");
    }

    /* JADX INFO: renamed from: z */
    private static byte[] m11589z(byte[] bArr) {
        com.google.android.exoplayer2.util.gvn7 gvn7Var = new com.google.android.exoplayer2.util.gvn7(bArr);
        int iKi = gvn7Var.ki();
        short sFn3e = gvn7Var.fn3e();
        short sFn3e2 = gvn7Var.fn3e();
        if (sFn3e != 1 || sFn3e2 != 1) {
            com.google.android.exoplayer2.util.ni7.m13704y(f19634p, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sFn3e3 = gvn7Var.fn3e();
        Charset charset = C4258g.f25664n;
        String strA9 = gvn7Var.a9(sFn3e3, charset);
        if (strA9.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strA9.indexOf("</DATA>");
        if (iIndexOf == -1) {
            com.google.android.exoplayer2.util.ni7.qrj(f19634p, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String strSubstring = strA9.substring(0, iIndexOf);
        String strSubstring2 = strA9.substring(iIndexOf);
        StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 26 + String.valueOf(strSubstring2).length());
        sb.append(strSubstring);
        sb.append(f63586n7h);
        sb.append(strSubstring2);
        String string = sb.toString();
        int i2 = iKi + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putShort(sFn3e);
        byteBufferAllocate.putShort(sFn3e2);
        byteBufferAllocate.putShort((short) (string.length() * 2));
        byteBufferAllocate.put(string.getBytes(charset));
        return byteBufferAllocate.array();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public byte[] cdj(String str) {
        return this.f19636y.getPropertyByteArray(str);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public void f7l8(String str, String str2) {
        this.f19636y.setPropertyString(str, str2);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: g */
    public void mo11590g(byte[] bArr, byte[] bArr2) {
        this.f19636y.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: h */
    public void mo11591h(byte[] bArr) {
        this.f19636y.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @hyr(23)
    /* JADX INFO: renamed from: i */
    public void mo11592i(@zy.dd final wvg.InterfaceC3322g interfaceC3322g) {
        if (lrht.f23230k < 23) {
            throw new UnsupportedOperationException();
        }
        this.f19636y.setOnKeyStatusChangeListener(interfaceC3322g == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: com.google.android.exoplayer2.drm.jp0y
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z2) {
                this.f19663k.oc(interfaceC3322g, mediaDrm, bArr, list, z2);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: jk, reason: merged with bridge method [inline-methods] */
    public C3321t n7h(byte[] bArr) throws MediaCryptoException {
        return new C3321t(mcp(this.f63589f7l8), bArr, lrht.f23230k < 21 && C3548p.f65247r25n.equals(this.f63589f7l8) && "L3".equals(qrj("securityLevel")));
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: k */
    public synchronized void mo11593k() {
        C3844k.m13633s(this.f19635s > 0);
        this.f19635s++;
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @zy.dd
    public byte[] ki(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (C3548p.f65226nme.equals(this.f63589f7l8)) {
            bArr2 = C3313k.toq(bArr2);
        }
        return this.f19636y.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public boolean kja0(byte[] bArr, String str) {
        if (lrht.f23230k >= 31) {
            return C3301k.m11599k(this.f19636y, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f63589f7l8, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public int ld6() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: n */
    public byte[] mo11594n() throws MediaDrmException {
        return this.f19636y.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: p */
    public void mo11595p(byte[] bArr) throws DeniedByServerException {
        this.f19636y.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @hyr(23)
    /* JADX INFO: renamed from: q */
    public void mo11596q(@zy.dd final wvg.InterfaceC3324n interfaceC3324n) {
        if (lrht.f23230k < 23) {
            throw new UnsupportedOperationException();
        }
        this.f19636y.setOnExpirationUpdateListener(interfaceC3324n == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: com.google.android.exoplayer2.drm.jk
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j2) {
                this.f19662k.d3(interfaceC3324n, mediaDrm, bArr, j2);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public String qrj(String str) {
        return this.f19636y.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public synchronized void release() {
        int i2 = this.f19635s - 1;
        this.f19635s = i2;
        if (i2 == 0) {
            this.f19636y.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @zy.dd
    /* JADX INFO: renamed from: s */
    public PersistableBundle mo11597s() {
        if (lrht.f23230k < 28) {
            return null;
        }
        return this.f19636y.getMetrics();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @SuppressLint({"WrongConstant"})
    public wvg.toq t8r(byte[] bArr, @zy.dd List<DrmInitData.SchemeData> list, int i2, @zy.dd HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArrWvg;
        String strM11588t;
        DrmInitData.SchemeData schemeDataFti = null;
        if (list != null) {
            schemeDataFti = fti(this.f63589f7l8, list);
            bArrWvg = wvg(this.f63589f7l8, (byte[]) C3844k.f7l8(schemeDataFti.f19629y));
            strM11588t = m11588t(this.f63589f7l8, schemeDataFti.f19625g);
        } else {
            bArrWvg = null;
            strM11588t = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f19636y.getKeyRequest(bArr, bArrWvg, strM11588t, i2, map);
        byte[] bArrO1t = o1t(this.f63589f7l8, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if (f63587qrj.equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeDataFti != null && !TextUtils.isEmpty(schemeDataFti.f19627n)) {
            defaultUrl = schemeDataFti.f19627n;
        }
        return new wvg.toq(bArrO1t, defaultUrl, lrht.f23230k >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public Map<String, String> toq(byte[] bArr) {
        return this.f19636y.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public void x2(String str, byte[] bArr) {
        this.f19636y.setPropertyByteArray(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: y */
    public void mo11598y(@zy.dd final wvg.InterfaceC3325q interfaceC3325q) {
        this.f19636y.setOnEventListener(interfaceC3325q == null ? null : new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.a9
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                this.f19630k.gvn7(interfaceC3325q, mediaDrm, bArr, i2, i3, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public wvg.C3327y zy() {
        MediaDrm.ProvisionRequest provisionRequest = this.f19636y.getProvisionRequest();
        return new wvg.C3327y(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }
}
