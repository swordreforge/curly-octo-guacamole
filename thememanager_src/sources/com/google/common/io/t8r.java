package com.google.common.io;

import com.android.thememanager.basemodule.network.theme.C1775k;
import com.google.common.base.d3;
import com.google.common.collect.vep5;
import com.google.common.collect.wlev;
import com.google.common.collect.wtop;
import com.google.common.graph.ncyb;
import com.google.common.graph.x9kr;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Files.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class t8r {

    /* JADX INFO: renamed from: k */
    private static final int f27104k = 10000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final wtop<File> f68339toq = new toq();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final x9kr<File> f68340zy = new zy();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.io.t8r$g */
    /* JADX INFO: compiled from: Files.java */
    private static abstract class EnumC4704g implements com.google.common.base.a9<File> {
        public static final EnumC4704g IS_DIRECTORY;
        public static final EnumC4704g IS_FILE;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4704g[] f27105k;

        /* JADX INFO: renamed from: com.google.common.io.t8r$g$k */
        /* JADX INFO: compiled from: Files.java */
        enum k extends EnumC4704g {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }

            @Override // com.google.common.base.a9
            public boolean apply(File file) {
                return file.isDirectory();
            }
        }

        /* JADX INFO: renamed from: com.google.common.io.t8r$g$toq */
        /* JADX INFO: compiled from: Files.java */
        enum toq extends EnumC4704g {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }

            @Override // com.google.common.base.a9
            public boolean apply(File file) {
                return file.isFile();
            }
        }

        static {
            k kVar = new k("IS_DIRECTORY", 0);
            IS_DIRECTORY = kVar;
            toq toqVar = new toq("IS_FILE", 1);
            IS_FILE = toqVar;
            f27105k = new EnumC4704g[]{kVar, toqVar};
        }

        private EnumC4704g(String str, int i2) {
        }

        public static EnumC4704g valueOf(String str) {
            return (EnumC4704g) Enum.valueOf(EnumC4704g.class, str);
        }

        public static EnumC4704g[] values() {
            return (EnumC4704g[]) f27105k.clone();
        }

        /* synthetic */ EnumC4704g(String str, int i2, C4705k c4705k) {
            this(str, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.t8r$k */
    /* JADX INFO: compiled from: Files.java */
    static class C4705k implements zurt<List<String>> {

        /* JADX INFO: renamed from: k */
        final List<String> f27106k = wlev.cdj();

        C4705k() {
        }

        @Override // com.google.common.io.zurt
        /* JADX INFO: renamed from: k */
        public boolean mo16408k(String str) {
            this.f27106k.add(str);
            return true;
        }

        @Override // com.google.common.io.zurt
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f27106k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.t8r$n */
    /* JADX INFO: compiled from: Files.java */
    private static final class C4706n extends f7l8 {

        /* JADX INFO: renamed from: k */
        private final File f27107k;

        /* synthetic */ C4706n(File file, C4705k c4705k) {
            this(file);
        }

        @Override // com.google.common.io.f7l8
        public com.google.common.base.o1t<Long> cdj() {
            return this.f27107k.isFile() ? com.google.common.base.o1t.of(Long.valueOf(this.f27107k.length())) : com.google.common.base.o1t.absent();
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: h */
        public long mo16388h() throws IOException {
            if (this.f27107k.isFile()) {
                return this.f27107k.length();
            }
            throw new FileNotFoundException(this.f27107k.toString());
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public FileInputStream qrj() throws IOException {
            return new FileInputStream(this.f27107k);
        }

        @Override // com.google.common.io.f7l8
        public byte[] kja0() throws Throwable {
            try {
                FileInputStream fileInputStream = (FileInputStream) n7h.m16425k().zy(qrj());
                return C4717y.zurt(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        public String toString() {
            return "Files.asByteSource(" + this.f27107k + ")";
        }

        private C4706n(File file) {
            this.f27107k = (File) com.google.common.base.jk.a9(file);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.t8r$q */
    /* JADX INFO: compiled from: Files.java */
    private static final class C4707q extends AbstractC4688g {

        /* JADX INFO: renamed from: k */
        private final File f27108k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final vep5<ki> f68341toq;

        /* synthetic */ C4707q(File file, ki[] kiVarArr, C4705k c4705k) {
            this(file, kiVarArr);
        }

        @Override // com.google.common.io.AbstractC4688g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public FileOutputStream zy() throws IOException {
            return new FileOutputStream(this.f27108k, this.f68341toq.contains(ki.APPEND));
        }

        public String toString() {
            return "Files.asByteSink(" + this.f27108k + ", " + this.f68341toq + ")";
        }

        private C4707q(File file, ki... kiVarArr) {
            this.f27108k = (File) com.google.common.base.jk.a9(file);
            this.f68341toq = vep5.copyOf(kiVarArr);
        }
    }

    /* JADX INFO: compiled from: Files.java */
    static class toq extends wtop<File> {
        toq() {
        }

        public String toString() {
            return "Files.fileTreeTraverser()";
        }

        @Override // com.google.common.collect.wtop
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Iterable<File> toq(File file) {
            return t8r.n7h(file);
        }
    }

    /* JADX INFO: compiled from: Files.java */
    static class zy implements x9kr<File> {
        zy() {
        }

        @Override // com.google.common.graph.x9kr, com.google.common.graph.InterfaceC4618f
        /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
        public Iterable<File> toq(File file) {
            return t8r.n7h(file);
        }
    }

    private t8r() {
    }

    @InterfaceC7731k
    public static List<String> a9(File file, Charset charset) throws IOException {
        return (List) m16440g(file, charset).cdj(new C4705k());
    }

    @InterfaceC7731k
    public static String cdj(String str) {
        com.google.common.base.jk.a9(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    @InterfaceC7731k
    public static void d3(File file) throws IOException {
        com.google.common.base.jk.a9(file);
        if (file.createNewFile() || file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to update modification time of " + file);
    }

    @InterfaceC7731k
    public static void eqxt(byte[] bArr, File file) throws Throwable {
        zy(file, new ki[0]).m16399q(bArr);
    }

    @InterfaceC7731k
    public static void f7l8(File file, File file2) throws Throwable {
        com.google.common.base.jk.m15391z(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        m16446q(file).m16387g(zy(file2, new ki[0]));
    }

    @InterfaceC7731k
    public static MappedByteBuffer fn3e(File file) throws IOException {
        com.google.common.base.jk.a9(file);
        return zurt(file, FileChannel.MapMode.READ_ONLY);
    }

    @InterfaceC7731k
    public static String fti(String str) {
        com.google.common.base.jk.a9(str);
        if (str.length() == 0) {
            return ".";
        }
        Iterable<String> iterableN7h = d3.m15307y('/').f7l8().n7h(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterableN7h) {
            str2.hashCode();
            if (!str2.equals(".")) {
                if (!str2.equals("..")) {
                    arrayList.add(str2);
                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.add("..");
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String strLd6 = com.google.common.base.ni7.kja0('/').ld6(arrayList);
        if (str.charAt(0) == '/') {
            strLd6 = "/" + strLd6;
        }
        while (strLd6.startsWith("/../")) {
            strLd6 = strLd6.substring(3);
        }
        return strLd6.equals("/..") ? "/" : "".equals(strLd6) ? "." : strLd6;
    }

    private static MappedByteBuffer fu4(File file, FileChannel.MapMode mapMode, long j2) throws Throwable {
        com.google.common.base.jk.a9(file);
        com.google.common.base.jk.a9(mapMode);
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            FileChannel fileChannel = (FileChannel) n7hVarM16425k.zy(((RandomAccessFile) n7hVarM16425k.zy(new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? "r" : "rw"))).getChannel());
            if (j2 == -1) {
                j2 = fileChannel.size();
            }
            return fileChannel.map(mapMode, 0L, j2);
        } finally {
        }
    }

    /* JADX INFO: renamed from: g */
    public static ld6 m16440g(File file, Charset charset) {
        return m16446q(file).mo16389k(charset);
    }

    @InterfaceC7731k
    @Deprecated
    public static String gvn7(File file, Charset charset) throws IOException {
        return m16440g(file, charset).n7h();
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: h */
    public static String m16441h(String str) {
        com.google.common.base.jk.a9(str);
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: i */
    public static com.google.common.base.a9<File> m16442i() {
        return EnumC4704g.IS_FILE;
    }

    @InterfaceC7731k
    @Deprecated
    @CanIgnoreReturnValue
    public static <T> T jk(File file, Charset charset, zurt<T> zurtVar) throws IOException {
        return (T) m16440g(file, charset).cdj(zurtVar);
    }

    @InterfaceC7731k
    public static byte[] jp0y(File file) throws IOException {
        return m16446q(file).kja0();
    }

    @InterfaceC7731k
    @Deprecated
    public static com.google.common.hash.n7h ki(File file, com.google.common.hash.kja0 kja0Var) throws IOException {
        return m16446q(file).mo16391p(kja0Var);
    }

    @Deprecated
    static wtop<File> kja0() {
        return f68339toq;
    }

    @InterfaceC7731k
    public static File ld6() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        String str = System.currentTimeMillis() + C5658n.f73185t8r;
        for (int i2 = 0; i2 < 10000; i2++) {
            File file2 = new File(file, str + i2);
            if (file2.mkdir()) {
                return file2;
            }
        }
        throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + C1775k.f57607zy + ')');
    }

    @InterfaceC7731k
    @Deprecated
    public static String mcp(File file, Charset charset) throws IOException {
        return m16440g(file, charset).kja0();
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC4700p m16444n(File file, Charset charset, ki... kiVarArr) {
        return zy(file, kiVarArr).m16397k(charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<File> n7h(File file) {
        File[] fileArrListFiles;
        return (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) ? Collections.emptyList() : Collections.unmodifiableList(Arrays.asList(fileArrListFiles));
    }

    @InterfaceC7731k
    public static MappedByteBuffer ni7(File file, FileChannel.MapMode mapMode, long j2) throws IOException {
        com.google.common.base.jk.m15374h(j2 >= 0, "size (%s) may not be negative", j2);
        return fu4(file, mapMode, j2);
    }

    @InterfaceC7731k
    public static BufferedReader o1t(File file, Charset charset) throws FileNotFoundException {
        com.google.common.base.jk.a9(file);
        com.google.common.base.jk.a9(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    @InterfaceC7731k
    @Deprecated
    public static void oc(CharSequence charSequence, File file, Charset charset) throws Throwable {
        m16444n(file, charset, new ki[0]).zy(charSequence);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static void m16445p(File file) throws IOException {
        com.google.common.base.jk.a9(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    /* JADX INFO: renamed from: q */
    public static f7l8 m16446q(File file) {
        return new C4706n(file, null);
    }

    @InterfaceC7731k
    public static ncyb<File> qrj() {
        return ncyb.m16278y(f68340zy);
    }

    @InterfaceC7731k
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m16447s(File file, Charset charset, Appendable appendable) throws Throwable {
        m16440g(file, charset).mo16413g(appendable);
    }

    @InterfaceC7731k
    @Deprecated
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: t */
    public static <T> T m16448t(File file, InterfaceC4697n<T> interfaceC4697n) throws IOException {
        return (T) m16446q(file).n7h(interfaceC4697n);
    }

    @InterfaceC7731k
    public static com.google.common.base.a9<File> t8r() {
        return EnumC4704g.IS_DIRECTORY;
    }

    @InterfaceC7731k
    @Deprecated
    public static void toq(CharSequence charSequence, File file, Charset charset) throws Throwable {
        m16444n(file, charset, ki.APPEND).zy(charSequence);
    }

    @InterfaceC7731k
    public static BufferedWriter wvg(File file, Charset charset) throws FileNotFoundException {
        com.google.common.base.jk.a9(file);
        com.google.common.base.jk.a9(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @InterfaceC7731k
    public static boolean x2(File file, File file2) throws IOException {
        com.google.common.base.jk.a9(file);
        com.google.common.base.jk.a9(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return m16446q(file).m16390n(m16446q(file2));
        }
        return false;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static void m16449y(File file, OutputStream outputStream) throws Throwable {
        m16446q(file).f7l8(outputStream);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: z */
    public static void m16450z(File file, File file2) throws Throwable {
        com.google.common.base.jk.a9(file);
        com.google.common.base.jk.a9(file2);
        com.google.common.base.jk.m15391z(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        f7l8(file, file2);
        if (file.delete()) {
            return;
        }
        if (file2.delete()) {
            throw new IOException("Unable to delete " + file);
        }
        throw new IOException("Unable to delete " + file2);
    }

    @InterfaceC7731k
    public static MappedByteBuffer zurt(File file, FileChannel.MapMode mapMode) throws IOException {
        return fu4(file, mapMode, -1L);
    }

    public static AbstractC4688g zy(File file, ki... kiVarArr) {
        return new C4707q(file, kiVarArr, null);
    }
}
