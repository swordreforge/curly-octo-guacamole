package com.google.android.exoplayer2.source;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.mediaparser.C3614k;
import com.google.android.exoplayer2.source.mediaparser.C3618y;
import com.google.android.exoplayer2.source.ncyb;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: MediaParserExtractorAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
@zy.hyr(30)
public final class mcp implements ncyb {

    /* JADX INFO: renamed from: n */
    public static final ncyb.InterfaceC3621k f21604n = new ncyb.InterfaceC3621k() { // from class: com.google.android.exoplayer2.source.t
        @Override // com.google.android.exoplayer2.source.ncyb.InterfaceC3621k
        /* JADX INFO: renamed from: k */
        public final ncyb mo12754k() {
            return new mcp();
        }
    };

    /* JADX INFO: renamed from: k */
    private final C3618y f21605k;

    /* JADX INFO: renamed from: q */
    private String f21606q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3614k f65427toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final MediaParser f65428zy;

    @SuppressLint({"WrongConstant"})
    public mcp() {
        C3618y c3618y = new C3618y();
        this.f21605k = c3618y;
        this.f65427toq = new C3614k();
        MediaParser mediaParserCreate = MediaParser.create(c3618y, new String[0]);
        this.f65428zy = mediaParserCreate;
        Boolean bool = Boolean.TRUE;
        mediaParserCreate.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f65433zy, bool);
        mediaParserCreate.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f21610k, bool);
        mediaParserCreate.setParameter(com.google.android.exoplayer2.source.mediaparser.toq.f65432toq, bool);
        this.f21606q = "android.media.mediaparser.UNKNOWN";
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    /* JADX INFO: renamed from: k */
    public void mo12771k(long j2, long j3) {
        this.f65427toq.toq(j2);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> pairLd6 = this.f21605k.ld6(j3);
        MediaParser mediaParser = this.f65428zy;
        Object obj = pairLd6.second;
        mediaParser.seek(((MediaParser.SeekPoint) obj).position == j2 ? (MediaParser.SeekPoint) obj : (MediaParser.SeekPoint) pairLd6.first);
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    /* JADX INFO: renamed from: n */
    public long mo12772n() {
        return this.f65427toq.getPosition();
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    /* JADX INFO: renamed from: q */
    public void mo12773q(com.google.android.exoplayer2.upstream.x2 x2Var, Uri uri, Map<String, List<String>> map, long j2, long j3, com.google.android.exoplayer2.extractor.x2 x2Var2) throws IOException {
        this.f21605k.kja0(x2Var2);
        this.f65427toq.zy(x2Var, j3);
        this.f65427toq.toq(j2);
        String parserName = this.f65428zy.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.f65428zy.advance(this.f65427toq);
            String parserName2 = this.f65428zy.getParserName();
            this.f21606q = parserName2;
            this.f21605k.ki(parserName2);
            return;
        }
        if (parserName.equals(this.f21606q)) {
            return;
        }
        String parserName3 = this.f65428zy.getParserName();
        this.f21606q = parserName3;
        this.f21605k.ki(parserName3);
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    public void release() {
        this.f65428zy.release();
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    public int toq(com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        boolean zAdvance = this.f65428zy.advance(this.f65427toq);
        long jM12776k = this.f65427toq.m12776k();
        fu4Var.f19818k = jM12776k;
        if (zAdvance) {
            return jM12776k != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    public void zy() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f21606q)) {
            this.f21605k.m12786k();
        }
    }
}
