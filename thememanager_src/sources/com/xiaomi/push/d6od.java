package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d6od {

    /* JADX INFO: renamed from: n */
    private static final Set<String> f32796n = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: k */
    private Context f32797k;

    /* JADX INFO: renamed from: q */
    private RandomAccessFile f32798q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private FileLock f73304toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f73305zy;

    private d6od(Context context) {
        this.f32797k = context;
    }

    /* JADX INFO: renamed from: k */
    public static d6od m20720k(Context context, File file) throws IOException {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        Set<String> set = f32796n;
        if (!set.add(str)) {
            throw new IOException("abtain lock failure");
        }
        d6od d6odVar = new d6od(context);
        d6odVar.f73305zy = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            d6odVar.f32798q = randomAccessFile;
            d6odVar.f73304toq = randomAccessFile.getChannel().lock();
            com.xiaomi.channel.commonutils.logger.zy.m19300t("Locked: " + str + " :" + d6odVar.f73304toq);
            if (d6odVar.f73304toq == null) {
                RandomAccessFile randomAccessFile2 = d6odVar.f32798q;
                if (randomAccessFile2 != null) {
                    f26p.toq(randomAccessFile2);
                }
                set.remove(d6odVar.f73305zy);
            }
            return d6odVar;
        } catch (Throwable th) {
            if (d6odVar.f73304toq == null) {
                RandomAccessFile randomAccessFile3 = d6odVar.f32798q;
                if (randomAccessFile3 != null) {
                    f26p.toq(randomAccessFile3);
                }
                f32796n.remove(d6odVar.f73305zy);
            }
            throw th;
        }
    }

    public void toq() {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("unLock: " + this.f73304toq);
        FileLock fileLock = this.f73304toq;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f73304toq.release();
            } catch (IOException unused) {
            }
            this.f73304toq = null;
        }
        RandomAccessFile randomAccessFile = this.f32798q;
        if (randomAccessFile != null) {
            f26p.toq(randomAccessFile);
        }
        f32796n.remove(this.f73305zy);
    }
}
