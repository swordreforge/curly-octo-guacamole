package com.xiaomi.push;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class yp31 extends o5 {
    public yp31() {
        x2("PING", null);
        ld6("0");
        m21353y(0);
    }

    @Override // com.xiaomi.push.o5
    public int fu4() {
        if (m21346h().length == 0) {
            return 0;
        }
        return super.fu4();
    }

    @Override // com.xiaomi.push.o5
    /* JADX INFO: renamed from: g */
    ByteBuffer mo21345g(ByteBuffer byteBuffer) {
        return m21346h().length == 0 ? byteBuffer : super.mo21345g(byteBuffer);
    }
}
