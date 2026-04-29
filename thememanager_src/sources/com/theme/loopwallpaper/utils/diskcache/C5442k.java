package com.theme.loopwallpaper.utils.diskcache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k */
/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C5442k implements Closeable {

    /* JADX INFO: renamed from: b */
    static final long f30347b = -1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f72567bo = "DIRTY";

    /* JADX INFO: renamed from: c */
    static final String f30348c = "journal";

    /* JADX INFO: renamed from: d */
    private static final String f30349d = "READ";

    /* JADX INFO: renamed from: e */
    static final String f30350e = "journal.tmp";

    /* JADX INFO: renamed from: j */
    static final String f30351j = "journal.bkp";

    /* JADX INFO: renamed from: m */
    static final String f30352m = "1";

    /* JADX INFO: renamed from: o */
    static final String f30353o = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: u */
    private static final String f30354u = "CLEAN";

    /* JADX INFO: renamed from: v */
    private static final String f30355v = "REMOVE";

    /* JADX INFO: renamed from: g */
    private final File f30359g;

    /* JADX INFO: renamed from: i */
    private Writer f30361i;

    /* JADX INFO: renamed from: k */
    private final File f30362k;

    /* JADX INFO: renamed from: n */
    private final File f30364n;

    /* JADX INFO: renamed from: p */
    private final int f30365p;

    /* JADX INFO: renamed from: q */
    private final File f30366q;

    /* JADX INFO: renamed from: s */
    private long f30368s;

    /* JADX INFO: renamed from: t */
    private int f30369t;

    /* JADX INFO: renamed from: y */
    private final int f30370y;

    /* JADX INFO: renamed from: a */
    static final String f30346a = "[a-z0-9_-]{1,120}";

    /* JADX INFO: renamed from: x */
    static final Pattern f30357x = Pattern.compile(f30346a);

    /* JADX INFO: renamed from: w */
    private static final OutputStream f30356w = new toq();

    /* JADX INFO: renamed from: h */
    private long f30360h = 0;

    /* JADX INFO: renamed from: z */
    private final LinkedHashMap<String, q> f30371z = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: r */
    private long f30367r = 0;

    /* JADX INFO: renamed from: l */
    final ThreadPoolExecutor f30363l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: f */
    private final Callable<Void> f30358f = new k();

    /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k$k */
    /* JADX INFO: compiled from: DiskLruCache.java */
    class k implements Callable<Void> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (C5442k.this) {
                if (C5442k.this.f30361i == null) {
                    return null;
                }
                C5442k.this.ngy();
                if (C5442k.this.t8iq()) {
                    C5442k.this.bek6();
                    C5442k.this.f30369t = 0;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k$n */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class n implements Closeable {

        /* JADX INFO: renamed from: g */
        private final long[] f30373g;

        /* JADX INFO: renamed from: k */
        private final String f30374k;

        /* JADX INFO: renamed from: n */
        private final InputStream[] f30375n;

        /* JADX INFO: renamed from: q */
        private final long f30376q;

        /* synthetic */ n(C5442k c5442k, String str, long j2, InputStream[] inputStreamArr, long[] jArr, k kVar) {
            this(str, j2, inputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f30375n) {
                C5443q.m18550k(inputStream);
            }
        }

        public String getString(int index) throws IOException {
            return C5442k.nmn5(zy(index));
        }

        /* JADX INFO: renamed from: k */
        public zy m18534k() throws IOException {
            return C5442k.this.y9n(this.f30374k, this.f30376q);
        }

        /* JADX INFO: renamed from: q */
        public long m18535q(int index) {
            return this.f30373g[index];
        }

        public InputStream zy(int index) {
            return this.f30375n[index];
        }

        private n(String key, long sequenceNumber, InputStream[] ins, long[] lengths) {
            this.f30374k = key;
            this.f30376q = sequenceNumber;
            this.f30375n = ins;
            this.f30373g = lengths;
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k$q */
    /* JADX INFO: compiled from: DiskLruCache.java */
    private final class q {

        /* JADX INFO: renamed from: k */
        private final String f30379k;

        /* JADX INFO: renamed from: n */
        private long f30380n;

        /* JADX INFO: renamed from: q */
        private zy f30381q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long[] f72568toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f72569zy;

        /* synthetic */ q(C5442k c5442k, String str, k kVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n7h(String[] strings) throws IOException {
            if (strings.length != C5442k.this.f30365p) {
                throw qrj(strings);
            }
            for (int i2 = 0; i2 < strings.length; i2++) {
                try {
                    this.f72568toq[i2] = Long.parseLong(strings[i2]);
                } catch (NumberFormatException unused) {
                    throw qrj(strings);
                }
            }
        }

        private IOException qrj(String[] strings) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strings));
        }

        public File ld6(int i2) {
            return new File(C5442k.this.f30362k, this.f30379k + "." + i2 + ".tmp");
        }

        /* JADX INFO: renamed from: p */
        public File m18542p(int i2) {
            return new File(C5442k.this.f30362k, this.f30379k + "." + i2);
        }

        public String x2() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f72568toq) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        private q(String key) {
            this.f30379k = key;
            this.f72568toq = new long[C5442k.this.f30365p];
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k$toq */
    /* JADX INFO: compiled from: DiskLruCache.java */
    class toq extends OutputStream {
        toq() {
        }

        @Override // java.io.OutputStream
        public void write(int b2) throws IOException {
        }
    }

    /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k$zy */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class zy {

        /* JADX INFO: renamed from: k */
        private final q f30382k;

        /* JADX INFO: renamed from: q */
        private boolean f30384q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean[] f72570toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f72571zy;

        /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.k$zy$k */
        /* JADX INFO: compiled from: DiskLruCache.java */
        private class k extends FilterOutputStream {
            /* synthetic */ k(zy zyVar, OutputStream outputStream, k kVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    zy.this.f72571zy = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    zy.this.f72571zy = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int oneByte) {
                try {
                    ((FilterOutputStream) this).out.write(oneByte);
                } catch (IOException unused) {
                    zy.this.f72571zy = true;
                }
            }

            private k(OutputStream out) {
                super(out);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] buffer, int offset, int length) {
                try {
                    ((FilterOutputStream) this).out.write(buffer, offset, length);
                } catch (IOException unused) {
                    zy.this.f72571zy = true;
                }
            }
        }

        /* synthetic */ zy(C5442k c5442k, q qVar, k kVar) {
            this(qVar);
        }

        public String f7l8(int index) throws IOException {
            InputStream inputStreamM18549y = m18549y(index);
            if (inputStreamM18549y != null) {
                return C5442k.nmn5(inputStreamM18549y);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public void m18545g() throws IOException {
            if (this.f72571zy) {
                C5442k.this.d2ok(this, false);
                C5442k.this.h7am(this.f30382k.f30379k);
            } else {
                C5442k.this.d2ok(this, true);
            }
            this.f30384q = true;
        }

        /* JADX INFO: renamed from: k */
        public void m18546k() throws IOException {
            C5442k.this.d2ok(this, false);
        }

        /* JADX INFO: renamed from: p */
        public void m18547p(int index, String value) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(m18548s(index), C5443q.f72572toq);
                try {
                    outputStreamWriter2.write(value);
                    C5443q.m18550k(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    C5443q.m18550k(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: s */
        public OutputStream m18548s(int index) throws IOException {
            FileOutputStream fileOutputStream;
            k kVar;
            if (index < 0 || index >= C5442k.this.f30365p) {
                throw new IllegalArgumentException("Expected index " + index + " to be greater than 0 and less than the maximum value count of " + C5442k.this.f30365p);
            }
            synchronized (C5442k.this) {
                if (this.f30382k.f30381q != this) {
                    throw new IllegalStateException();
                }
                if (!this.f30382k.f72569zy) {
                    this.f72570toq[index] = true;
                }
                File fileLd6 = this.f30382k.ld6(index);
                try {
                    fileOutputStream = new FileOutputStream(fileLd6);
                } catch (FileNotFoundException unused) {
                    C5442k.this.f30362k.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileLd6);
                    } catch (FileNotFoundException unused2) {
                        return C5442k.f30356w;
                    }
                }
                kVar = new k(this, fileOutputStream, null);
            }
            return kVar;
        }

        public void toq() {
            if (this.f30384q) {
                return;
            }
            try {
                m18546k();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: y */
        public InputStream m18549y(int index) throws IOException {
            synchronized (C5442k.this) {
                if (this.f30382k.f30381q != this) {
                    throw new IllegalStateException();
                }
                if (!this.f30382k.f72569zy) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f30382k.m18542p(index));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        private zy(q entry) {
            this.f30382k = entry;
            this.f72570toq = entry.f72569zy ? null : new boolean[C5442k.this.f30365p];
        }
    }

    private C5442k(File directory, int appVersion, int valueCount, long maxSize) {
        this.f30362k = directory;
        this.f30370y = appVersion;
        this.f30366q = new File(directory, f30348c);
        this.f30364n = new File(directory, f30350e);
        this.f30359g = new File(directory, f30351j);
        this.f30365p = valueCount;
        this.f30368s = maxSize;
    }

    private void bap7(String key) {
        if (f30357x.matcher(key).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + key + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bek6() throws IOException {
        Writer writer = this.f30361i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f30364n), C5443q.f30386k));
        try {
            bufferedWriter.write(f30353o);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f30370y));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f30365p));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (q qVar : this.f30371z.values()) {
                if (qVar.f30381q != null) {
                    bufferedWriter.write("DIRTY " + qVar.f30379k + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + qVar.f30379k + qVar.x2() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f30366q.exists()) {
                ij(this.f30366q, this.f30359g, true);
            }
            ij(this.f30364n, this.f30366q, false);
            this.f30359g.delete();
            this.f30361i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f30366q, true), C5443q.f30386k));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private void bwp(String line) throws IOException {
        String strSubstring;
        int iIndexOf = line.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = line.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = line.substring(i2);
            if (iIndexOf == 6 && line.startsWith(f30355v)) {
                this.f30371z.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i2, iIndexOf2);
        }
        q qVar = this.f30371z.get(strSubstring);
        k kVar = null;
        if (qVar == null) {
            qVar = new q(this, strSubstring, kVar);
            this.f30371z.put(strSubstring, qVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && line.startsWith(f30354u)) {
            String[] strArrSplit = line.substring(iIndexOf2 + 1).split(" ");
            qVar.f72569zy = true;
            qVar.f30381q = null;
            qVar.n7h(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && line.startsWith(f72567bo)) {
            qVar.f30381q = new zy(this, qVar, kVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && line.startsWith(f30349d)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d2ok(zy editor, boolean success) throws IOException {
        q qVar = editor.f30382k;
        if (qVar.f30381q != editor) {
            throw new IllegalStateException();
        }
        if (success && !qVar.f72569zy) {
            for (int i2 = 0; i2 < this.f30365p; i2++) {
                if (!editor.f72570toq[i2]) {
                    editor.m18546k();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!qVar.ld6(i2).exists()) {
                    editor.m18546k();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f30365p; i3++) {
            File fileLd6 = qVar.ld6(i3);
            if (!success) {
                m18525f(fileLd6);
            } else if (fileLd6.exists()) {
                File fileM18542p = qVar.m18542p(i3);
                fileLd6.renameTo(fileM18542p);
                long j2 = qVar.f72568toq[i3];
                long length = fileM18542p.length();
                qVar.f72568toq[i3] = length;
                this.f30360h = (this.f30360h - j2) + length;
            }
        }
        this.f30369t++;
        qVar.f30381q = null;
        if (qVar.f72569zy || success) {
            qVar.f72569zy = true;
            this.f30361i.write("CLEAN " + qVar.f30379k + qVar.x2() + '\n');
            if (success) {
                long j3 = this.f30367r;
                this.f30367r = 1 + j3;
                qVar.f30380n = j3;
            }
        } else {
            this.f30371z.remove(qVar.f30379k);
            this.f30361i.write("REMOVE " + qVar.f30379k + '\n');
        }
        this.f30361i.flush();
        if (this.f30360h > this.f30368s || t8iq()) {
            this.f30363l.submit(this.f30358f);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m18525f(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static C5442k g1(File directory, int appVersion, int valueCount, long maxSize) throws IOException {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (valueCount <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file = new File(directory, f30351j);
        if (file.exists()) {
            File file2 = new File(directory, f30348c);
            if (file2.exists()) {
                file.delete();
            } else {
                ij(file, file2, false);
            }
        }
        C5442k c5442k = new C5442k(directory, appVersion, valueCount, maxSize);
        if (c5442k.f30366q.exists()) {
            try {
                c5442k.ltg8();
                c5442k.was();
                return c5442k;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + directory + " is corrupt: " + e2.getMessage() + ", removing");
                c5442k.hyr();
            }
        }
        directory.mkdirs();
        C5442k c5442k2 = new C5442k(directory, appVersion, valueCount, maxSize);
        c5442k2.bek6();
        return c5442k2;
    }

    private static void ij(File from, File to, boolean deleteDestination) throws IOException {
        if (deleteDestination) {
            m18525f(to);
        }
        if (!from.renameTo(to)) {
            throw new IOException();
        }
    }

    private void ltg8() throws IOException {
        com.theme.loopwallpaper.utils.diskcache.zy zyVar = new com.theme.loopwallpaper.utils.diskcache.zy(new FileInputStream(this.f30366q), C5443q.f30386k);
        try {
            String strM18556y = zyVar.m18556y();
            String strM18556y2 = zyVar.m18556y();
            String strM18556y3 = zyVar.m18556y();
            String strM18556y4 = zyVar.m18556y();
            String strM18556y5 = zyVar.m18556y();
            if (!f30353o.equals(strM18556y) || !"1".equals(strM18556y2) || !Integer.toString(this.f30370y).equals(strM18556y3) || !Integer.toString(this.f30365p).equals(strM18556y4) || !"".equals(strM18556y5)) {
                throw new IOException("unexpected journal header: [" + strM18556y + ", " + strM18556y2 + ", " + strM18556y4 + ", " + strM18556y5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    bwp(zyVar.m18556y());
                    i2++;
                } catch (EOFException unused) {
                    this.f30369t = i2 - this.f30371z.size();
                    if (zyVar.m18555q()) {
                        bek6();
                    } else {
                        this.f30361i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f30366q, true), C5443q.f30386k));
                    }
                    C5443q.m18550k(zyVar);
                    return;
                }
            }
        } catch (Throwable th) {
            C5443q.m18550k(zyVar);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ngy() throws IOException {
        while (this.f30360h > this.f30368s) {
            h7am(this.f30371z.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nmn5(InputStream in) throws IOException {
        return C5443q.zy(new InputStreamReader(in, C5443q.f72572toq));
    }

    /* JADX INFO: renamed from: t */
    private void m18530t() {
        if (this.f30361i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t8iq() {
        int i2 = this.f30369t;
        return i2 >= 2000 && i2 >= this.f30371z.size();
    }

    private void was() throws IOException {
        m18525f(this.f30364n);
        Iterator<q> it = this.f30371z.values().iterator();
        while (it.hasNext()) {
            q next = it.next();
            int i2 = 0;
            if (next.f30381q == null) {
                while (i2 < this.f30365p) {
                    this.f30360h += next.f72568toq[i2];
                    i2++;
                }
            } else {
                next.f30381q = null;
                while (i2 < this.f30365p) {
                    m18525f(next.m18542p(i2));
                    m18525f(next.ld6(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized zy y9n(String key, long expectedSequenceNumber) throws IOException {
        m18530t();
        bap7(key);
        q qVar = this.f30371z.get(key);
        k kVar = null;
        if (expectedSequenceNumber != -1 && (qVar == null || qVar.f30380n != expectedSequenceNumber)) {
            return null;
        }
        if (qVar == null) {
            qVar = new q(this, key, kVar);
            this.f30371z.put(key, qVar);
        } else if (qVar.f30381q != null) {
            return null;
        }
        zy zyVar = new zy(this, qVar, kVar);
        qVar.f30381q = zyVar;
        this.f30361i.write("DIRTY " + key + '\n');
        this.f30361i.flush();
        return zyVar;
    }

    public File a98o() {
        return this.f30362k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f30361i == null) {
            return;
        }
        for (q qVar : new ArrayList(this.f30371z.values())) {
            if (qVar.f30381q != null) {
                qVar.f30381q.m18546k();
            }
        }
        ngy();
        this.f30361i.close();
        this.f30361i = null;
    }

    public synchronized void flush() throws IOException {
        m18530t();
        ngy();
        this.f30361i.flush();
    }

    public synchronized boolean h7am(String key) throws IOException {
        m18530t();
        bap7(key);
        q qVar = this.f30371z.get(key);
        if (qVar != null && qVar.f30381q == null) {
            for (int i2 = 0; i2 < this.f30365p; i2++) {
                File fileM18542p = qVar.m18542p(i2);
                if (fileM18542p.exists() && !fileM18542p.delete()) {
                    throw new IOException("failed to delete " + fileM18542p);
                }
                this.f30360h -= qVar.f72568toq[i2];
                qVar.f72568toq[i2] = 0;
            }
            this.f30369t++;
            this.f30361i.append((CharSequence) ("REMOVE " + key + '\n'));
            this.f30371z.remove(key);
            if (t8iq()) {
                this.f30363l.submit(this.f30358f);
            }
            return true;
        }
        return false;
    }

    public void hyr() throws IOException {
        close();
        C5443q.toq(this.f30362k);
    }

    public synchronized n i1(String key) throws IOException {
        InputStream inputStream;
        m18530t();
        bap7(key);
        q qVar = this.f30371z.get(key);
        if (qVar == null) {
            return null;
        }
        if (!qVar.f72569zy) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f30365p];
        for (int i2 = 0; i2 < this.f30365p; i2++) {
            try {
                inputStreamArr[i2] = new FileInputStream(qVar.m18542p(i2));
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < this.f30365p && (inputStream = inputStreamArr[i3]) != null; i3++) {
                    C5443q.m18550k(inputStream);
                }
                return null;
            }
        }
        this.f30369t++;
        this.f30361i.append((CharSequence) ("READ " + key + '\n'));
        if (t8iq()) {
            this.f30363l.submit(this.f30358f);
        }
        return new n(this, key, qVar.f30380n, inputStreamArr, qVar.f72568toq, null);
    }

    public synchronized boolean isClosed() {
        return this.f30361i == null;
    }

    public synchronized void nsb(long maxSize) {
        this.f30368s = maxSize;
        this.f30363l.submit(this.f30358f);
    }

    public synchronized long size() {
        return this.f30360h;
    }

    /* JADX INFO: renamed from: x */
    public synchronized long m18532x() {
        return this.f30368s;
    }

    public zy yz(String key) throws IOException {
        return y9n(key, -1L);
    }
}
