package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MediaChunkIterator.java */
/* JADX INFO: loaded from: classes2.dex */
public interface kja0 {

    /* JADX INFO: renamed from: k */
    public static final kja0 f21372k = new C3584k();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.kja0$k */
    /* JADX INFO: compiled from: MediaChunkIterator.java */
    class C3584k implements kja0 {
        C3584k() {
        }

        @Override // com.google.android.exoplayer2.source.chunk.kja0
        /* JADX INFO: renamed from: k */
        public long mo12656k() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.kja0
        public boolean next() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.chunk.kja0
        /* JADX INFO: renamed from: q */
        public com.google.android.exoplayer2.upstream.t8r mo12657q() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.kja0
        public void reset() {
        }

        @Override // com.google.android.exoplayer2.source.chunk.kja0
        public long toq() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.kja0
        public boolean zy() {
            return true;
        }
    }

    /* JADX INFO: renamed from: k */
    long mo12656k();

    boolean next();

    /* JADX INFO: renamed from: q */
    com.google.android.exoplayer2.upstream.t8r mo12657q();

    void reset();

    long toq();

    boolean zy();
}
