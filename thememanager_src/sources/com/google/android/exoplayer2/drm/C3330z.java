package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.util.lrht;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.z */
/* JADX INFO: compiled from: DummyExoMediaDrm.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
public final class C3330z implements wvg {
    public static C3330z fn3e() {
        return new C3330z();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public byte[] cdj(String str) {
        return lrht.f23228g;
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public void f7l8(String str, String str2) {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: g */
    public void mo11590g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: h */
    public void mo11591h(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: i */
    public void mo11592i(@zy.dd wvg.InterfaceC3322g interfaceC3322g) {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: k */
    public void mo11593k() {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @zy.dd
    public byte[] ki(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public boolean kja0(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public int ld6() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: n */
    public byte[] mo11594n() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public com.google.android.exoplayer2.decoder.zy n7h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: p */
    public void mo11595p(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: q */
    public void mo11596q(@zy.dd wvg.InterfaceC3324n interfaceC3324n) {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public String qrj(String str) {
        return "";
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    @zy.dd
    /* JADX INFO: renamed from: s */
    public PersistableBundle mo11597s() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public wvg.toq t8r(byte[] bArr, @zy.dd List<DrmInitData.SchemeData> list, int i2, @zy.dd HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public Map<String, String> toq(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public void x2(String str, byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    /* JADX INFO: renamed from: y */
    public void mo11598y(@zy.dd wvg.InterfaceC3325q interfaceC3325q) {
    }

    @Override // com.google.android.exoplayer2.drm.wvg
    public wvg.C3327y zy() {
        throw new IllegalStateException();
    }
}
