package kotlin.io;

import cyoe.InterfaceC5979h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.a9;
import kotlin.text.fti;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
public class cdj extends C6252h {

    /* JADX INFO: renamed from: kotlin.io.cdj$k */
    /* JADX INFO: compiled from: Utils.kt */
    static final class C6245k extends AbstractC6308r implements InterfaceC5979h {
        public static final C6245k INSTANCE = new C6245k();

        C6245k() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final Void invoke(@InterfaceC7396q File file, @InterfaceC7396q IOException exception) throws IOException {
            d2ok.m23075h(file, "<anonymous parameter 0>");
            d2ok.m23075h(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: compiled from: Utils.kt */
    static final class toq extends AbstractC6308r implements InterfaceC5979h<File, IOException, was> {
        final /* synthetic */ InterfaceC5979h<File, IOException, fn3e> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(InterfaceC5979h<? super File, ? super IOException, ? extends fn3e> interfaceC5979h) {
            super(2);
            this.$onError = interfaceC5979h;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ was invoke(File file, IOException iOException) throws fu4 {
            invoke2(file, iOException);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q File f2, @InterfaceC7396q IOException e2) throws fu4 {
            d2ok.m23075h(f2, "f");
            d2ok.m23075h(e2, "e");
            if (this.$onError.invoke(f2, e2) == fn3e.TERMINATE) {
                throw new fu4(f2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m22879a(@InterfaceC7396q File file, @InterfaceC7396q String other) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(other, "other");
        return a98o(file, new File(other));
    }

    public static final boolean a98o(@InterfaceC7396q File file, @InterfaceC7396q File other) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(other, "other");
        C6276s c6276sM22938g = n7h.m22938g(file);
        C6276s c6276sM22938g2 = n7h.m22938g(other);
        if (d2ok.f7l8(c6276sM22938g.m23007n(), c6276sM22938g2.m23007n()) && c6276sM22938g.m23010y() >= c6276sM22938g2.m23010y()) {
            return c6276sM22938g.f7l8().subList(0, c6276sM22938g2.m23010y()).equals(c6276sM22938g2.f7l8());
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: b */
    public static final File m22880b(@InterfaceC7396q File file, @InterfaceC7396q String relative) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(relative, "relative");
        return y9n(file, new File(relative));
    }

    @InterfaceC7396q
    public static final File bf2(@InterfaceC7396q File file, @InterfaceC7396q File relative) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(relative, "relative");
        C6276s c6276sM22938g = n7h.m22938g(file);
        return y9n(y9n(c6276sM22938g.m23007n(), c6276sM22938g.m23010y() == 0 ? new File("..") : c6276sM22938g.m23008p(0, c6276sM22938g.m23010y() - 1)), relative);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22881c(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        while (true) {
            boolean z2 = true;
            for (File file2 : C6252h.d2ok(file)) {
                if (!file2.delete() && file2.exists()) {
                    z2 = false;
                } else {
                    if (z2) {
                        break;
                    }
                    z2 = false;
                }
            }
            return z2;
        }
    }

    public static /* synthetic */ boolean dd(File file, File file2, boolean z2, InterfaceC5979h interfaceC5979h, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            interfaceC5979h = C6245k.INSTANCE;
        }
        return m22888r(file, file2, z2, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: e */
    public static final String m22882e(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            d2ok.kja0(path, "path");
            return a9.nnh(path, File.separatorChar, '/', false, 4, null);
        }
        String path2 = file.getPath();
        d2ok.kja0(path2, "path");
        return path2;
    }

    @InterfaceC7395n
    public static final File ek5k(@InterfaceC7396q File file, @InterfaceC7396q File base) throws IOException {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(base, "base");
        String strM22889x = m22889x(file, base);
        if (strM22889x != null) {
            return new File(strM22889x);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ File m22883f(String str, String str2, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "tmp";
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            file = null;
        }
        return hyr(str, str2, file);
    }

    @InterfaceC7396q
    public static final File hb(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        C6276s c6276sM22938g = n7h.m22938g(file);
        File fileM23007n = c6276sM22938g.m23007n();
        List<File> listM22884j = m22884j(c6276sM22938g.f7l8());
        String separator = File.separator;
        d2ok.kja0(separator, "separator");
        return m22880b(fileM23007n, kotlin.collections.a9.uo(listM22884j, separator, null, null, 0, null, null, 62, null));
    }

    @InterfaceC7396q
    @kotlin.ld6(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File hyr(@InterfaceC7396q String prefix, @InterfaceC7395n String str, @InterfaceC7395n File file) throws IOException {
        d2ok.m23075h(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        d2ok.kja0(fileCreateTempFile, "createTempFile(prefix, suffix, directory)");
        return fileCreateTempFile;
    }

    @InterfaceC7396q
    public static final File i1(@InterfaceC7396q File file, @InterfaceC7396q String relative) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(relative, "relative");
        return bf2(file, new File(relative));
    }

    /* JADX INFO: renamed from: j */
    private static final List<File> m22884j(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!d2ok.f7l8(name, ".")) {
                if (!d2ok.f7l8(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || d2ok.f7l8(((File) kotlin.collections.a9.wwp(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.ld6(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    /* JADX INFO: renamed from: l */
    public static final File m22885l(@InterfaceC7396q String prefix, @InterfaceC7395n String str, @InterfaceC7395n File file) throws IOException {
        d2ok.m23075h(prefix, "prefix");
        File dir = File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            d2ok.kja0(dir, "dir");
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + '.');
    }

    public static final boolean lrht(@InterfaceC7396q File file, @InterfaceC7396q File other) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(other, "other");
        C6276s c6276sM22938g = n7h.m22938g(file);
        C6276s c6276sM22938g2 = n7h.m22938g(other);
        if (c6276sM22938g2.m23009s()) {
            return d2ok.f7l8(file, other);
        }
        int iM23010y = c6276sM22938g.m23010y() - c6276sM22938g2.m23010y();
        if (iM23010y < 0) {
            return false;
        }
        return c6276sM22938g.f7l8().subList(iM23010y, c6276sM22938g.m23010y()).equals(c6276sM22938g2.f7l8());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: m */
    public static final File m22886m(@InterfaceC7396q File file, @InterfaceC7396q File base) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(base, "base");
        return new File(zp(file, base));
    }

    public static /* synthetic */ File n5r1(String str, String str2, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "tmp";
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            file = null;
        }
        return m22885l(str, str2, file);
    }

    public static /* synthetic */ File ncyb(File file, File file2, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 8192;
        }
        return x9kr(file, file2, z2, i2);
    }

    @InterfaceC7396q
    public static final String nn86(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        String name = file.getName();
        d2ok.kja0(name, "name");
        return fti.fupf(name, ".", null, 2, null);
    }

    /* JADX INFO: renamed from: o */
    private static final C6276s m22887o(C6276s c6276s) {
        return new C6276s(c6276s.m23007n(), m22884j(c6276s.f7l8()));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m22888r(@mub.InterfaceC7396q java.io.File r11, @mub.InterfaceC7396q java.io.File r12, boolean r13, @mub.InterfaceC7396q cyoe.InterfaceC5979h<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.fn3e> r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.cdj.m22888r(java.io.File, java.io.File, boolean, cyoe.h):boolean");
    }

    public static final boolean uv6(@InterfaceC7396q File file, @InterfaceC7396q String other) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(other, "other");
        return lrht(file, new File(other));
    }

    @InterfaceC7396q
    public static final String vyq(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        String name = file.getName();
        d2ok.kja0(name, "name");
        return fti.py7(name, '.', "");
    }

    /* JADX INFO: renamed from: x */
    private static final String m22889x(File file, File file2) throws IOException {
        C6276s c6276sM22887o = m22887o(n7h.m22938g(file));
        C6276s c6276sM22887o2 = m22887o(n7h.m22938g(file2));
        if (!d2ok.f7l8(c6276sM22887o.m23007n(), c6276sM22887o2.m23007n())) {
            return null;
        }
        int iM23010y = c6276sM22887o2.m23010y();
        int iM23010y2 = c6276sM22887o.m23010y();
        int i2 = 0;
        int iMin = Math.min(iM23010y2, iM23010y);
        while (i2 < iMin && d2ok.f7l8(c6276sM22887o.f7l8().get(i2), c6276sM22887o2.f7l8().get(i2))) {
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = iM23010y - 1;
        if (i2 <= i3) {
            while (!d2ok.f7l8(c6276sM22887o2.f7l8().get(i3).getName(), "..")) {
                sb.append("..");
                if (i3 != i2) {
                    sb.append(File.separatorChar);
                }
                if (i3 != i2) {
                    i3--;
                }
            }
            return null;
        }
        if (i2 < iM23010y2) {
            if (i2 < iM23010y) {
                sb.append(File.separatorChar);
            }
            List listIx = kotlin.collections.a9.ix(c6276sM22887o.f7l8(), i2);
            String separator = File.separator;
            d2ok.kja0(separator, "separator");
            kotlin.collections.a9.kt06(listIx, sb, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    @InterfaceC7396q
    public static final File x9kr(@InterfaceC7396q File file, @InterfaceC7396q File target, boolean z2, int i2) throws C6260p {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(target, "target");
        if (!file.exists()) {
            throw new C6253i(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z2) {
                throw new C6279y(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new C6279y(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    kotlin.io.toq.ld6(fileInputStream, fileOutputStream, i2);
                    zy.m23032k(fileOutputStream, null);
                    zy.m23032k(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new C6260p(file, target, "Failed to create target directory.");
        }
        return target;
    }

    @InterfaceC7396q
    public static final File y9n(@InterfaceC7396q File file, @InterfaceC7396q File relative) {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(relative, "relative");
        if (n7h.m22941q(relative)) {
            return relative;
        }
        String string = file.toString();
        d2ok.kja0(string, "this.toString()");
        if ((string.length() == 0) || fti.c25(string, File.separatorChar, false, 2, null)) {
            return new File(string + relative);
        }
        return new File(string + File.separatorChar + relative);
    }

    @InterfaceC7396q
    public static final File yz(@InterfaceC7396q File file, @InterfaceC7396q File base) throws IOException {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(base, "base");
        String strM22889x = m22889x(file, base);
        return strM22889x != null ? new File(strM22889x) : file;
    }

    @InterfaceC7396q
    public static final String zp(@InterfaceC7396q File file, @InterfaceC7396q File base) throws IOException {
        d2ok.m23075h(file, "<this>");
        d2ok.m23075h(base, "base");
        String strM22889x = m22889x(file, base);
        if (strM22889x != null) {
            return strM22889x;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }
}
