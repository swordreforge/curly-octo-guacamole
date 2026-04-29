package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import com.google.android.exoplayer2.upstream.x2;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.mediaparser.k */
/* JADX INFO: compiled from: InputReaderAdapterV30.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(30)
@SuppressLint({"Override"})
public final class C3614k implements MediaParser.SeekableInputReader {

    /* JADX INFO: renamed from: k */
    @dd
    private x2 f21607k;

    /* JADX INFO: renamed from: q */
    private long f21608q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f65429toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f65430zy;

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.f65429toq;
    }

    public long getPosition() {
        return this.f65430zy;
    }

    /* JADX INFO: renamed from: k */
    public long m12776k() {
        long j2 = this.f21608q;
        this.f21608q = -1L;
        return j2;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = ((x2) lrht.ld6(this.f21607k)).read(bArr, i2, i3);
        this.f65430zy += (long) i4;
        return i4;
    }

    public void seekToPosition(long j2) {
        this.f21608q = j2;
    }

    public void toq(long j2) {
        this.f65430zy = j2;
    }

    public void zy(x2 x2Var, long j2) {
        this.f21607k = x2Var;
        this.f65429toq = j2;
        this.f21608q = -1L;
    }
}
