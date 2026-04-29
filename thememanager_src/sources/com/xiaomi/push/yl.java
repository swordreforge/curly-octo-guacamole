package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.InterfaceC5621k;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class yl implements InterfaceC5621k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static volatile yl f73745f7l8;

    /* JADX INFO: renamed from: k */
    private String f34216k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f73746toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Handler f73747zy;

    /* JADX INFO: renamed from: q */
    private static final SimpleDateFormat f34215q = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* JADX INFO: renamed from: n */
    public static String f34214n = "/MiPushLog";

    /* JADX INFO: renamed from: g */
    private static List<Pair<String, Throwable>> f34213g = Collections.synchronizedList(new ArrayList());

    private yl(Context context) {
        this.f73746toq = context;
        if (context.getApplicationContext() != null) {
            this.f73746toq = context.getApplicationContext();
        }
        this.f34216k = this.f73746toq.getPackageName() + C5658n.f73185t8r + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f73747zy = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: q */
    public static yl m22054q(Context context) {
        if (f73745f7l8 == null) {
            synchronized (yl.class) {
                if (f73745f7l8 == null) {
                    f73745f7l8 = new yl(context);
                }
            }
        }
        return f73745f7l8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x015b -> B:102:0x0160). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: y */
    public void m22056y() throws Throwable {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        File file;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    file = new File(this.f73746toq.getFilesDir(), f34214n);
                } catch (IOException e2) {
                    Log.e(this.f34216k, "", e2);
                }
            } catch (Exception e3) {
                e = e3;
                fileLockLock = null;
                randomAccessFile = null;
            } catch (Throwable th) {
                th = th;
                fileLockLock = null;
                randomAccessFile = null;
            }
            if (!ydj3.toq(file)) {
                Log.w(this.f34216k, "Cannot wirte internal file: " + file);
                return;
            }
            if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                Log.w(this.f34216k, "Create mipushlog directory fail.");
                return;
            }
            File file2 = new File(file, "log.lock");
            if (!file2.exists() || file2.isDirectory()) {
                file2.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                    while (!f34213g.isEmpty()) {
                        try {
                            Pair<String, Throwable> pairRemove = f34213g.remove(0);
                            String str = (String) pairRemove.first;
                            if (pairRemove.second != null) {
                                str = (str + "\n") + Log.getStackTraceString((Throwable) pairRemove.second);
                            }
                            bufferedWriter2.write(str + "\n");
                        } catch (Exception e4) {
                            e = e4;
                            bufferedWriter = bufferedWriter2;
                            Log.e(this.f34216k, "", e);
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e6) {
                                    Log.e(this.f34216k, "", e6);
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e7) {
                                    Log.e(this.f34216k, "", e7);
                                }
                            }
                            if (randomAccessFile == null) {
                                return;
                            } else {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e8) {
                                    Log.e(this.f34216k, "", e8);
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e9) {
                                    Log.e(this.f34216k, "", e9);
                                }
                            }
                            if (randomAccessFile == null) {
                                throw th;
                            }
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (IOException e10) {
                                Log.e(this.f34216k, "", e10);
                                throw th;
                            }
                        }
                    }
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                    File file3 = new File(file, "log1.txt");
                    if (file3.length() >= 1048576) {
                        File file4 = new File(file, "log0.txt");
                        if (file4.exists() && file4.isFile()) {
                            file4.delete();
                        }
                        file3.renameTo(file4);
                    }
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e11) {
                            Log.e(this.f34216k, "", e11);
                        }
                    }
                    randomAccessFile.close();
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                fileLockLock = null;
            } catch (Throwable th3) {
                th = th3;
                fileLockLock = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
    /* JADX INFO: renamed from: k */
    public final void mo8464k(String str) {
        zy(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
    public final void toq(String str) {
        this.f34216k = str;
    }

    @Override // com.xiaomi.channel.commonutils.logger.InterfaceC5621k
    public final void zy(String str, Throwable th) {
        this.f73747zy.post(new uc(this, str, th));
    }
}
