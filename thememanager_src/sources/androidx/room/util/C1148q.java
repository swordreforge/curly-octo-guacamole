package androidx.room.util;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.util.q */
/* JADX INFO: compiled from: FileUtil.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1148q {
    private C1148q() {
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: k */
    public static void m5220k(@lvui ReadableByteChannel readableByteChannel, @lvui FileChannel fileChannel) throws IOException {
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
