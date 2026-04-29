package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.p */
/* JADX INFO: compiled from: AudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3262p {

    /* JADX INFO: renamed from: k */
    public static final ByteBuffer f19442k = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.p$k */
    /* JADX INFO: compiled from: AudioProcessor.java */
    public static final class k {

        /* JADX INFO: renamed from: n */
        public static final k f19443n = new k(-1, -1, -1);

        /* JADX INFO: renamed from: k */
        public final int f19444k;

        /* JADX INFO: renamed from: q */
        public final int f19445q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63498toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63499zy;

        public k(int i2, int i3, int i4) {
            this.f19444k = i2;
            this.f63498toq = i3;
            this.f63499zy = i4;
            this.f19445q = com.google.android.exoplayer2.util.lrht.qo(i4) ? com.google.android.exoplayer2.util.lrht.m13674x(i4, i3) : -1;
        }

        public String toString() {
            int i2 = this.f19444k;
            int i3 = this.f63498toq;
            int i4 = this.f63499zy;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i2);
            sb.append(", channelCount=");
            sb.append(i3);
            sb.append(", encoding=");
            sb.append(i4);
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.p$toq */
    /* JADX INFO: compiled from: AudioProcessor.java */
    public static final class toq extends Exception {
        public toq(k kVar) {
            String strValueOf = String.valueOf(kVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
            sb.append("Unhandled format: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    void flush();

    boolean isActive();

    /* JADX INFO: renamed from: k */
    ByteBuffer mo11407k();

    /* JADX INFO: renamed from: n */
    void mo11408n();

    /* JADX INFO: renamed from: q */
    k mo11409q(k kVar) throws toq;

    void reset();

    void toq(ByteBuffer byteBuffer);

    boolean zy();
}
