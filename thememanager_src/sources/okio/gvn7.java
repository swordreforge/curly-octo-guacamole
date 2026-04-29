package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.ncyb;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
public class gvn7 extends zurt {
    private final void dd(ncyb ncybVar) throws IOException {
        if (ni7(ncybVar)) {
            throw new IOException(ncybVar + " already exists.");
        }
    }

    /* JADX INFO: renamed from: r */
    private final List<ncyb> m27624r(ncyb ncybVar, boolean z2) throws IOException {
        File file = ncybVar.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                kotlin.jvm.internal.d2ok.qrj(str);
                arrayList.add(ncybVar.ni7(str));
            }
            kotlin.collections.wvg.bf2(arrayList);
            return arrayList;
        }
        if (!z2) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + ncybVar);
        }
        throw new FileNotFoundException("no such file: " + ncybVar);
    }

    private final void x9kr(ncyb ncybVar) throws IOException {
        if (ni7(ncybVar)) {
            return;
        }
        throw new IOException(ncybVar + " doesn't exist.");
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public fn3e a9(@InterfaceC7396q ncyb path) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new fn3e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public vyq eqxt(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        if (z2) {
            dd(file);
        }
        return lvui.cdj(file.toFile(), false, 1, null);
    }

    @Override // okio.zurt
    public void f7l8(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i fti(@InterfaceC7396q ncyb file) {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return new jp0y(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i gvn7(@InterfaceC7396q ncyb file, boolean z2, boolean z3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        if (!((z2 && z3) ? false : true)) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z2) {
            dd(file);
        }
        if (z3) {
            x9kr(file);
        }
        return new jp0y(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.zurt
    /* JADX INFO: renamed from: h */
    public void mo27608h(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.zurt
    public void ki(@InterfaceC7396q ncyb path, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z2) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public nn86 lvui(@InterfaceC7396q ncyb file) {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return d2ok.m27590i(file.toFile());
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27625n(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        if (z2) {
            x9kr(file);
        }
        return d2ok.kja0(file.toFile(), true);
    }

    @Override // okio.zurt
    public void n7h(@InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        fn3e fn3eVarA9 = a9(dir);
        if (!(fn3eVarA9 != null && fn3eVarA9.m27618p())) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z2) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public List<ncyb> o1t(@InterfaceC7396q ncyb dir) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        return m27624r(dir, false);
    }

    @InterfaceC7396q
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public ncyb mo27626y(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        ncyb.C7569k c7569k = ncyb.f43814q;
        kotlin.jvm.internal.d2ok.qrj(canonicalFile);
        return ncyb.C7569k.f7l8(c7569k, canonicalFile, false, 1, null);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public List<ncyb> mo27627z(@InterfaceC7396q ncyb dir) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        List<ncyb> listM27624r = m27624r(dir, true);
        kotlin.jvm.internal.d2ok.qrj(listM27624r);
        return listM27624r;
    }
}
