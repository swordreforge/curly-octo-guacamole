package androidx.room.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.util.k */
/* JADX INFO: compiled from: CopyLock.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1146k {

    /* JADX INFO: renamed from: n */
    private static final Map<String, Lock> f6255n = new HashMap();

    /* JADX INFO: renamed from: k */
    private final File f6256k;

    /* JADX INFO: renamed from: q */
    private FileChannel f6257q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Lock f52426toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f52427zy;

    public C1146k(@lvui String str, @lvui File file, boolean z2) {
        File file2 = new File(file, str + ".lck");
        this.f6256k = file2;
        this.f52426toq = m5217k(file2.getAbsolutePath());
        this.f52427zy = z2;
    }

    /* JADX INFO: renamed from: k */
    private static Lock m5217k(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = f6255n;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    public void toq() {
        this.f52426toq.lock();
        if (this.f52427zy) {
            try {
                FileChannel channel = new FileOutputStream(this.f6256k).getChannel();
                this.f6257q = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            }
        }
    }

    public void zy() {
        FileChannel fileChannel = this.f6257q;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f52426toq.unlock();
    }
}
