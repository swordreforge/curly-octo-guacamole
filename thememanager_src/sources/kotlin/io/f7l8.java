package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
final class f7l8 extends ByteArrayOutputStream {
    public f7l8(int i2) {
        super(i2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final byte[] m22917k() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        d2ok.kja0(buf, "buf");
        return buf;
    }
}
