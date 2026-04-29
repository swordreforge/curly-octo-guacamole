package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bumptech.glide.disklrucache.k */
/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C2968k implements Closeable {

    /* JADX INFO: renamed from: a */
    private static final String f17868a = "CLEAN";

    /* JADX INFO: renamed from: b */
    static final long f17869b = -1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f61592bo = "READ";

    /* JADX INFO: renamed from: c */
    static final String f17870c = "journal";

    /* JADX INFO: renamed from: e */
    static final String f17871e = "journal.tmp";

    /* JADX INFO: renamed from: j */
    static final String f17872j = "journal.bkp";

    /* JADX INFO: renamed from: m */
    static final String f17873m = "1";

    /* JADX INFO: renamed from: o */
    static final String f17874o = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: u */
    private static final String f17875u = "REMOVE";

    /* JADX INFO: renamed from: x */
    private static final String f17876x = "DIRTY";

    /* JADX INFO: renamed from: g */
    private final File f17878g;

    /* JADX INFO: renamed from: i */
    private Writer f17880i;

    /* JADX INFO: renamed from: k */
    private final File f17881k;

    /* JADX INFO: renamed from: n */
    private final File f17883n;

    /* JADX INFO: renamed from: p */
    private final int f17884p;

    /* JADX INFO: renamed from: q */
    private final File f17885q;

    /* JADX INFO: renamed from: s */
    private long f17887s;

    /* JADX INFO: renamed from: t */
    private int f17888t;

    /* JADX INFO: renamed from: y */
    private final int f17889y;

    /* JADX INFO: renamed from: h */
    private long f17879h = 0;

    /* JADX INFO: renamed from: z */
    private final LinkedHashMap<String, q> f17890z = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: r */
    private long f17886r = 0;

    /* JADX INFO: renamed from: l */
    final ThreadPoolExecutor f17882l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new toq(null));

    /* JADX INFO: renamed from: f */
    private final Callable<Void> f17877f = new k();

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.k$k */
    /* JADX INFO: compiled from: DiskLruCache.java */
    class k implements Callable<Void> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (C2968k.this) {
                if (C2968k.this.f17880i == null) {
                    return null;
                }
                C2968k.this.bap7();
                if (C2968k.this.g1()) {
                    C2968k.this.h7am();
                    C2968k.this.f17888t = 0;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.k$n */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class n {

        /* JADX INFO: renamed from: k */
        private final String f17892k;

        /* JADX INFO: renamed from: q */
        private final File[] f17894q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f61593toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final long[] f61594zy;

        /* synthetic */ n(C2968k c2968k, String str, long j2, File[] fileArr, long[] jArr, k kVar) {
            this(str, j2, fileArr, jArr);
        }

        /* JADX INFO: renamed from: k */
        public zy m10555k() throws IOException {
            return C2968k.this.y9n(this.f17892k, this.f61593toq);
        }

        /* JADX INFO: renamed from: q */
        public String m10556q(int i2) throws IOException {
            return C2968k.t8iq(new FileInputStream(this.f17894q[i2]));
        }

        public File toq(int i2) {
            return this.f17894q[i2];
        }

        public long zy(int i2) {
            return this.f61594zy[i2];
        }

        private n(String str, long j2, File[] fileArr, long[] jArr) {
            this.f17892k = str;
            this.f61593toq = j2;
            this.f17894q = fileArr;
            this.f61594zy = jArr;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.k$q */
    /* JADX INFO: compiled from: DiskLruCache.java */
    private final class q {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f61595f7l8;

        /* JADX INFO: renamed from: g */
        private zy f17895g;

        /* JADX INFO: renamed from: k */
        private final String f17896k;

        /* JADX INFO: renamed from: n */
        private boolean f17897n;

        /* JADX INFO: renamed from: q */
        File[] f17898q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long[] f61596toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        File[] f61597zy;

        /* synthetic */ q(C2968k c2968k, String str, k kVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n7h(String[] strArr) throws IOException {
            if (strArr.length != C2968k.this.f17884p) {
                throw qrj(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.f61596toq[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw qrj(strArr);
                }
            }
        }

        private IOException qrj(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File ld6(int i2) {
            return this.f17898q[i2];
        }

        /* JADX INFO: renamed from: p */
        public File m10563p(int i2) {
            return this.f61597zy[i2];
        }

        public String x2() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f61596toq) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        private q(String str) {
            this.f17896k = str;
            this.f61596toq = new long[C2968k.this.f17884p];
            this.f61597zy = new File[C2968k.this.f17884p];
            this.f17898q = new File[C2968k.this.f17884p];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C2968k.this.f17884p; i2++) {
                sb.append(i2);
                this.f61597zy[i2] = new File(C2968k.this.f17881k, sb.toString());
                sb.append(".tmp");
                this.f17898q[i2] = new File(C2968k.this.f17881k, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.k$toq */
    /* JADX INFO: compiled from: DiskLruCache.java */
    private static final class toq implements ThreadFactory {
        private toq() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ toq(k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.k$zy */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class zy {

        /* JADX INFO: renamed from: k */
        private final q f17900k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean[] f61598toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f61599zy;

        /* synthetic */ zy(C2968k c2968k, q qVar, k kVar) {
            this(qVar);
        }

        /* JADX INFO: renamed from: y */
        private InputStream m10565y(int i2) throws IOException {
            synchronized (C2968k.this) {
                if (this.f17900k.f17895g != this) {
                    throw new IllegalStateException();
                }
                if (!this.f17900k.f17897n) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f17900k.m10563p(i2));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public String f7l8(int i2) throws IOException {
            InputStream inputStreamM10565y = m10565y(i2);
            if (inputStreamM10565y != null) {
                return C2968k.t8iq(inputStreamM10565y);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public File m10566g(int i2) throws IOException {
            File fileLd6;
            synchronized (C2968k.this) {
                if (this.f17900k.f17895g != this) {
                    throw new IllegalStateException();
                }
                if (!this.f17900k.f17897n) {
                    this.f61598toq[i2] = true;
                }
                fileLd6 = this.f17900k.ld6(i2);
                C2968k.this.f17881k.mkdirs();
            }
            return fileLd6;
        }

        /* JADX INFO: renamed from: k */
        public void m10567k() throws IOException {
            C2968k.this.d2ok(this, false);
        }

        /* JADX INFO: renamed from: n */
        public void m10568n() throws IOException {
            C2968k.this.d2ok(this, true);
            this.f61599zy = true;
        }

        /* JADX INFO: renamed from: s */
        public void m10569s(int i2, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(m10566g(i2)), com.bumptech.glide.disklrucache.zy.f61600toq);
                try {
                    outputStreamWriter2.write(str);
                    com.bumptech.glide.disklrucache.zy.m10573k(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.bumptech.glide.disklrucache.zy.m10573k(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public void toq() {
            if (this.f61599zy) {
                return;
            }
            try {
                m10567k();
            } catch (IOException unused) {
            }
        }

        private zy(q qVar) {
            this.f17900k = qVar;
            this.f61598toq = qVar.f17897n ? null : new boolean[C2968k.this.f17884p];
        }
    }

    private C2968k(File file, int i2, int i3, long j2) {
        this.f17881k = file;
        this.f17889y = i2;
        this.f17885q = new File(file, f17870c);
        this.f17883n = new File(file, f17871e);
        this.f17878g = new File(file, f17872j);
        this.f17884p = i3;
        this.f17887s = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bap7() throws IOException {
        while (this.f17879h > this.f17887s) {
            ij(this.f17890z.entrySet().iterator().next().getKey());
        }
    }

    private void bek6(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith(f17875u)) {
                this.f17890z.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        q qVar = this.f17890z.get(strSubstring);
        k kVar = null;
        if (qVar == null) {
            qVar = new q(this, strSubstring, kVar);
            this.f17890z.put(strSubstring, qVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f17868a)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            qVar.f17897n = true;
            qVar.f17895g = null;
            qVar.n7h(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f17876x)) {
            qVar.f17895g = new zy(this, qVar, kVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(f61592bo)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void bwp() throws IOException {
        com.bumptech.glide.disklrucache.toq toqVar = new com.bumptech.glide.disklrucache.toq(new FileInputStream(this.f17885q), com.bumptech.glide.disklrucache.zy.f17910k);
        try {
            String strM10572y = toqVar.m10572y();
            String strM10572y2 = toqVar.m10572y();
            String strM10572y3 = toqVar.m10572y();
            String strM10572y4 = toqVar.m10572y();
            String strM10572y5 = toqVar.m10572y();
            if (!f17874o.equals(strM10572y) || !"1".equals(strM10572y2) || !Integer.toString(this.f17889y).equals(strM10572y3) || !Integer.toString(this.f17884p).equals(strM10572y4) || !"".equals(strM10572y5)) {
                throw new IOException("unexpected journal header: [" + strM10572y + ", " + strM10572y2 + ", " + strM10572y4 + ", " + strM10572y5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    bek6(toqVar.m10572y());
                    i2++;
                } catch (EOFException unused) {
                    this.f17888t = i2 - this.f17890z.size();
                    if (toqVar.m10571q()) {
                        h7am();
                    } else {
                        this.f17880i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17885q, true), com.bumptech.glide.disklrucache.zy.f17910k));
                    }
                    com.bumptech.glide.disklrucache.zy.m10573k(toqVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bumptech.glide.disklrucache.zy.m10573k(toqVar);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d2ok(zy zyVar, boolean z2) throws IOException {
        q qVar = zyVar.f17900k;
        if (qVar.f17895g != zyVar) {
            throw new IllegalStateException();
        }
        if (z2 && !qVar.f17897n) {
            for (int i2 = 0; i2 < this.f17884p; i2++) {
                if (!zyVar.f61598toq[i2]) {
                    zyVar.m10567k();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!qVar.ld6(i2).exists()) {
                    zyVar.m10567k();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f17884p; i3++) {
            File fileLd6 = qVar.ld6(i3);
            if (!z2) {
                m10546f(fileLd6);
            } else if (fileLd6.exists()) {
                File fileM10563p = qVar.m10563p(i3);
                fileLd6.renameTo(fileM10563p);
                long j2 = qVar.f61596toq[i3];
                long length = fileM10563p.length();
                qVar.f61596toq[i3] = length;
                this.f17879h = (this.f17879h - j2) + length;
            }
        }
        this.f17888t++;
        qVar.f17895g = null;
        if (qVar.f17897n || z2) {
            qVar.f17897n = true;
            this.f17880i.append((CharSequence) f17868a);
            this.f17880i.append(' ');
            this.f17880i.append((CharSequence) qVar.f17896k);
            this.f17880i.append((CharSequence) qVar.x2());
            this.f17880i.append('\n');
            if (z2) {
                long j3 = this.f17886r;
                this.f17886r = 1 + j3;
                qVar.f61595f7l8 = j3;
            }
        } else {
            this.f17890z.remove(qVar.f17896k);
            this.f17880i.append((CharSequence) f17875u);
            this.f17880i.append(' ');
            this.f17880i.append((CharSequence) qVar.f17896k);
            this.f17880i.append('\n');
        }
        i1(this.f17880i);
        if (this.f17879h > this.f17887s || g1()) {
            this.f17882l.submit(this.f17877f);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m10546f(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g1() {
        int i2 = this.f17888t;
        return i2 >= 2000 && i2 >= this.f17890z.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h7am() throws IOException {
        Writer writer = this.f17880i;
        if (writer != null) {
            m10551t(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17883n), com.bumptech.glide.disklrucache.zy.f17910k));
        try {
            bufferedWriter.write(f17874o);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f17889y));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f17884p));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (q qVar : this.f17890z.values()) {
                if (qVar.f17895g != null) {
                    bufferedWriter.write("DIRTY " + qVar.f17896k + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + qVar.f17896k + qVar.x2() + '\n');
                }
            }
            m10551t(bufferedWriter);
            if (this.f17885q.exists()) {
                nsb(this.f17885q, this.f17878g, true);
            }
            nsb(this.f17883n, this.f17885q, false);
            this.f17878g.delete();
            this.f17880i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17885q, true), com.bumptech.glide.disklrucache.zy.f17910k));
        } catch (Throwable th) {
            m10551t(bufferedWriter);
            throw th;
        }
    }

    @TargetApi(26)
    private static void i1(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private void ltg8() throws IOException {
        m10546f(this.f17883n);
        Iterator<q> it = this.f17890z.values().iterator();
        while (it.hasNext()) {
            q next = it.next();
            int i2 = 0;
            if (next.f17895g == null) {
                while (i2 < this.f17884p) {
                    this.f17879h += next.f61596toq[i2];
                    i2++;
                }
            } else {
                next.f17895g = null;
                while (i2 < this.f17884p) {
                    m10546f(next.m10563p(i2));
                    m10546f(next.ld6(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private static void nsb(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            m10546f(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: t */
    private static void m10551t(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t8iq(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.zy.zy(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.zy.f61600toq));
    }

    public static C2968k was(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f17872j);
        if (file2.exists()) {
            File file3 = new File(file, f17870c);
            if (file3.exists()) {
                file2.delete();
            } else {
                nsb(file2, file3, false);
            }
        }
        C2968k c2968k = new C2968k(file, i2, i3, j2);
        if (c2968k.f17885q.exists()) {
            try {
                c2968k.bwp();
                c2968k.ltg8();
                return c2968k;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c2968k.hyr();
            }
        }
        file.mkdirs();
        C2968k c2968k2 = new C2968k(file, i2, i3, j2);
        c2968k2.h7am();
        return c2968k2;
    }

    private void wvg() {
        if (this.f17880i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized zy y9n(String str, long j2) throws IOException {
        wvg();
        q qVar = this.f17890z.get(str);
        k kVar = null;
        if (j2 != -1 && (qVar == null || qVar.f61595f7l8 != j2)) {
            return null;
        }
        if (qVar == null) {
            qVar = new q(this, str, kVar);
            this.f17890z.put(str, qVar);
        } else if (qVar.f17895g != null) {
            return null;
        }
        zy zyVar = new zy(this, qVar, kVar);
        qVar.f17895g = zyVar;
        this.f17880i.append((CharSequence) f17876x);
        this.f17880i.append(' ');
        this.f17880i.append((CharSequence) str);
        this.f17880i.append('\n');
        i1(this.f17880i);
        return zyVar;
    }

    public synchronized n a98o(String str) throws IOException {
        wvg();
        q qVar = this.f17890z.get(str);
        if (qVar == null) {
            return null;
        }
        if (!qVar.f17897n) {
            return null;
        }
        for (File file : qVar.f61597zy) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f17888t++;
        this.f17880i.append((CharSequence) f61592bo);
        this.f17880i.append(' ');
        this.f17880i.append((CharSequence) str);
        this.f17880i.append('\n');
        if (g1()) {
            this.f17882l.submit(this.f17877f);
        }
        return new n(this, str, qVar.f61595f7l8, qVar.f61597zy, qVar.f61596toq, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f17880i == null) {
            return;
        }
        for (q qVar : new ArrayList(this.f17890z.values())) {
            if (qVar.f17895g != null) {
                qVar.f17895g.m10567k();
            }
        }
        bap7();
        m10551t(this.f17880i);
        this.f17880i = null;
    }

    public synchronized void flush() throws IOException {
        wvg();
        bap7();
        i1(this.f17880i);
    }

    public void hyr() throws IOException {
        close();
        com.bumptech.glide.disklrucache.zy.toq(this.f17881k);
    }

    public synchronized boolean ij(String str) throws IOException {
        wvg();
        q qVar = this.f17890z.get(str);
        if (qVar != null && qVar.f17895g == null) {
            for (int i2 = 0; i2 < this.f17884p; i2++) {
                File fileM10563p = qVar.m10563p(i2);
                if (fileM10563p.exists() && !fileM10563p.delete()) {
                    throw new IOException("failed to delete " + fileM10563p);
                }
                this.f17879h -= qVar.f61596toq[i2];
                qVar.f61596toq[i2] = 0;
            }
            this.f17888t++;
            this.f17880i.append((CharSequence) f17875u);
            this.f17880i.append(' ');
            this.f17880i.append((CharSequence) str);
            this.f17880i.append('\n');
            this.f17890z.remove(str);
            if (g1()) {
                this.f17882l.submit(this.f17877f);
            }
            return true;
        }
        return false;
    }

    public synchronized boolean isClosed() {
        return this.f17880i == null;
    }

    public synchronized void ngy(long j2) {
        this.f17887s = j2;
        this.f17882l.submit(this.f17877f);
    }

    public synchronized long nmn5() {
        return this.f17887s;
    }

    public synchronized long size() {
        return this.f17879h;
    }

    /* JADX INFO: renamed from: x */
    public File m10553x() {
        return this.f17881k;
    }

    public zy yz(String str) throws IOException {
        return y9n(str, -1L);
    }
}
