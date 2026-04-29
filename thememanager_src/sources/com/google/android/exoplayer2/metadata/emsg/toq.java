package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private final ByteArrayOutputStream f20751k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final DataOutputStream f64977toq;

    public toq() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f20751k = byteArrayOutputStream;
        this.f64977toq = new DataOutputStream(byteArrayOutputStream);
    }

    private static void toq(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* JADX INFO: renamed from: k */
    public byte[] m12288k(EventMessage eventMessage) {
        this.f20751k.reset();
        try {
            toq(this.f64977toq, eventMessage.f20746k);
            String str = eventMessage.f20748q;
            if (str == null) {
                str = "";
            }
            toq(this.f64977toq, str);
            this.f64977toq.writeLong(eventMessage.f20747n);
            this.f64977toq.writeLong(eventMessage.f20745g);
            this.f64977toq.write(eventMessage.f20750y);
            this.f64977toq.flush();
            return this.f20751k.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
