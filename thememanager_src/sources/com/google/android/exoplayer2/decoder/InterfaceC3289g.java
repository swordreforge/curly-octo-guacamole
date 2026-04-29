package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.decoder.C3298y;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.g */
/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3289g<I, O, E extends C3298y> {
    void flush();

    String getName();

    @dd
    /* JADX INFO: renamed from: q */
    I mo11564q() throws C3298y;

    void release();

    @dd
    O toq() throws C3298y;

    void zy(I i2) throws C3298y;
}
