package com.google.android.exoplayer2.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.extractor.C3400s;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.source.chunk.f7l8;
import com.google.android.exoplayer2.source.mediaparser.C3614k;
import com.google.android.exoplayer2.source.mediaparser.C3618y;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: MediaParserChunkExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(30)
public final class cdj implements f7l8 {

    /* JADX INFO: renamed from: i */
    private static final String f21354i = "MediaPrsrChunkExtractor";

    /* JADX INFO: renamed from: z */
    public static final f7l8.InterfaceC3580k f21355z = new f7l8.InterfaceC3580k() { // from class: com.google.android.exoplayer2.source.chunk.h
        @Override // com.google.android.exoplayer2.source.chunk.f7l8.InterfaceC3580k
        /* JADX INFO: renamed from: k */
        public final f7l8 mo12648k(int i2, xwq3 xwq3Var, boolean z2, List list, InterfaceC3401t interfaceC3401t) {
            return cdj.m12642p(i2, xwq3Var, z2, list, interfaceC3401t);
        }
    };

    /* JADX INFO: renamed from: g */
    private final toq f21356g;

    /* JADX INFO: renamed from: h */
    @dd
    private xwq3[] f21357h;

    /* JADX INFO: renamed from: k */
    private final C3618y f21358k;

    /* JADX INFO: renamed from: n */
    private final MediaParser f21359n;

    /* JADX INFO: renamed from: p */
    @dd
    private f7l8.toq f21360p;

    /* JADX INFO: renamed from: q */
    private final C3614k f21361q;

    /* JADX INFO: renamed from: s */
    private long f21362s;

    /* JADX INFO: renamed from: y */
    private final C3400s f21363y;

    /* JADX INFO: compiled from: MediaParserChunkExtractor.java */
    private class toq implements com.google.android.exoplayer2.extractor.x2 {
        private toq() {
        }

        @Override // com.google.android.exoplayer2.extractor.x2
        public void cdj(o1t o1tVar) {
        }

        @Override // com.google.android.exoplayer2.extractor.x2
        /* JADX INFO: renamed from: i */
        public void mo11753i() {
            cdj cdjVar = cdj.this;
            cdjVar.f21357h = cdjVar.f21358k.m12787p();
        }

        @Override // com.google.android.exoplayer2.extractor.x2
        public InterfaceC3401t toq(int i2, int i3) {
            return cdj.this.f21360p != null ? cdj.this.f21360p.toq(i2, i3) : cdj.this.f21363y;
        }
    }

    @SuppressLint({"WrongConstant"})
    public cdj(int i2, xwq3 xwq3Var, List<xwq3> list) {
        C3618y c3618y = new C3618y(xwq3Var, i2, true);
        this.f21358k = c3618y;
        this.f21361q = new C3614k();
        String str = wvg.ki((String) C3844k.f7l8(xwq3Var.f23684t)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        c3618y.ki(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, c3618y);
        this.f21359n = mediaParserCreateByName;
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f21610k, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f65432toq, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f65433zy, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f21612q, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f21611n, bool);
        mediaParserCreateByName.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f21609g, bool);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(com.google.android.exoplayer2.source.mediaparser.toq.m12779k(list.get(i3)));
        }
        this.f21359n.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f65431f7l8, arrayList);
        this.f21358k.m12785h(list);
        this.f21356g = new toq();
        this.f21363y = new C3400s();
        this.f21362s = C3548p.f65257toq;
    }

    private void ld6() {
        MediaParser.SeekMap seekMapM12784g = this.f21358k.m12784g();
        long j2 = this.f21362s;
        if (j2 == C3548p.f65257toq || seekMapM12784g == null) {
            return;
        }
        this.f21359n.seek((MediaParser.SeekPoint) seekMapM12784g.getSeekPoints(j2).first);
        this.f21362s = C3548p.f65257toq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ f7l8 m12642p(int i2, xwq3 xwq3Var, boolean z2, List list, InterfaceC3401t interfaceC3401t) {
        if (!wvg.t8r(xwq3Var.f23684t)) {
            return new cdj(i2, xwq3Var, list);
        }
        ni7.qrj(f21354i, "Ignoring an unsupported text track.");
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    /* JADX INFO: renamed from: k */
    public boolean mo12645k(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        ld6();
        this.f21361q.zy(ld6Var, ld6Var.getLength());
        return this.f21359n.advance(this.f21361q);
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    @dd
    /* JADX INFO: renamed from: n */
    public xwq3[] mo12646n() {
        return this.f21357h;
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    @dd
    /* JADX INFO: renamed from: q */
    public C3398q mo12647q() {
        return this.f21358k.m12788q();
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    public void release() {
        this.f21359n.release();
    }

    @Override // com.google.android.exoplayer2.source.chunk.f7l8
    public void zy(@dd f7l8.toq toqVar, long j2, long j3) {
        this.f21360p = toqVar;
        this.f21358k.cdj(j3);
        this.f21358k.kja0(this.f21356g);
        this.f21362s = j2;
    }
}
