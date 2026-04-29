package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.io.path.C6263i;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.ncyb;

/* JADX INFO: compiled from: NioFileSystemWrappingFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
public final class oc extends eqxt {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final FileSystem f43823n;

    public oc(@InterfaceC7396q FileSystem nioFileSystem) {
        kotlin.jvm.internal.d2ok.m23075h(nioFileSystem, "nioFileSystem");
        this.f43823n = nioFileSystem;
    }

    private final Path n5r1(ncyb ncybVar) {
        Path path = this.f43823n.getPath(ncybVar.toString(), new String[0]);
        kotlin.jvm.internal.d2ok.kja0(path, "getPath(...)");
        return path;
    }

    /* JADX INFO: renamed from: r */
    private final List<ncyb> m27838r(ncyb ncybVar, boolean z2) throws IOException {
        Path pathN5r1 = n5r1(ncybVar);
        try {
            List listJz5 = C6263i.jz5(pathN5r1, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listJz5.iterator();
            while (it.hasNext()) {
                arrayList.add(ncyb.C7569k.m27823s(ncyb.f43814q, (Path) it.next(), false, 1, null));
            }
            kotlin.collections.wvg.bf2(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z2) {
                return null;
            }
            if (Files.exists(pathN5r1, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + ncybVar);
            }
            throw new FileNotFoundException("no such file: " + ncybVar);
        }
    }

    @Override // okio.eqxt, okio.gvn7, okio.zurt
    @InterfaceC7395n
    public fn3e a9(@InterfaceC7396q ncyb path) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        return ncyb(n5r1(path));
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    public vyq eqxt(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        List listM22678s = kotlin.collections.zurt.m22678s();
        if (z2) {
            listM22678s.add(StandardOpenOption.CREATE_NEW);
        }
        List listM22674k = kotlin.collections.zurt.m22674k(listM22678s);
        try {
            Path pathN5r1 = n5r1(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM22674k.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathN5r1, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.d2ok.kja0(outputStreamNewOutputStream, "newOutputStream(this, *options)");
            return d2ok.m27589h(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.eqxt, okio.gvn7, okio.zurt
    public void f7l8(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        try {
            kotlin.jvm.internal.d2ok.kja0(Files.move(n5r1(source), n5r1(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    public AbstractC7549i fti(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(n5r1(file), StandardOpenOption.READ);
            kotlin.jvm.internal.d2ok.qrj(fileChannelOpen);
            return new d3(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    public AbstractC7549i gvn7(@InterfaceC7396q ncyb file, boolean z2, boolean z3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        if (!((z2 && z3) ? false : true)) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        List listM22678s = kotlin.collections.zurt.m22678s();
        listM22678s.add(StandardOpenOption.READ);
        listM22678s.add(StandardOpenOption.WRITE);
        if (z2) {
            listM22678s.add(StandardOpenOption.CREATE_NEW);
        } else if (!z3) {
            listM22678s.add(StandardOpenOption.CREATE);
        }
        List listM22674k = kotlin.collections.zurt.m22674k(listM22678s);
        try {
            Path pathN5r1 = n5r1(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM22674k.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathN5r1, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            kotlin.jvm.internal.d2ok.qrj(fileChannelOpen);
            return new d3(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.eqxt, okio.gvn7, okio.zurt
    /* JADX INFO: renamed from: h */
    public void mo27608h(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        kotlin.jvm.internal.d2ok.kja0(Files.createSymbolicLink(n5r1(source), n5r1(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(this, target, *attributes)");
    }

    @Override // okio.gvn7, okio.zurt
    public void ki(@InterfaceC7396q ncyb path, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathN5r1 = n5r1(path);
        try {
            Files.delete(pathN5r1);
        } catch (NoSuchFileException unused) {
            if (z2) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } catch (IOException unused2) {
            if (Files.exists(pathN5r1, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + path);
            }
        }
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    public nn86 lvui(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(n5r1(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            kotlin.jvm.internal.d2ok.kja0(inputStreamNewInputStream, "newInputStream(this, *options)");
            return d2ok.fn3e(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27625n(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        List listM22678s = kotlin.collections.zurt.m22678s();
        listM22678s.add(StandardOpenOption.APPEND);
        if (!z2) {
            listM22678s.add(StandardOpenOption.CREATE);
        }
        List listM22674k = kotlin.collections.zurt.m22674k(listM22678s);
        Path pathN5r1 = n5r1(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM22674k.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathN5r1, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.d2ok.kja0(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return d2ok.m27589h(outputStreamNewOutputStream);
    }

    @Override // okio.gvn7, okio.zurt
    public void n7h(@InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        fn3e fn3eVarA9 = a9(dir);
        boolean z3 = fn3eVarA9 != null && fn3eVarA9.m27618p();
        if (z3 && z2) {
            throw new IOException(dir + " already exists.");
        }
        try {
            kotlin.jvm.internal.d2ok.kja0(Files.createDirectory(n5r1(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(this, *attributes)");
        } catch (IOException e2) {
            if (z3) {
                return;
            }
            throw new IOException("failed to create directory: " + dir, e2);
        }
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7395n
    public List<ncyb> o1t(@InterfaceC7396q ncyb dir) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        return m27838r(dir, false);
    }

    @Override // okio.eqxt, okio.gvn7
    @InterfaceC7396q
    public String toString() {
        String strZurt = a98o.m23050q(this.f43823n.getClass()).zurt();
        kotlin.jvm.internal.d2ok.qrj(strZurt);
        return strZurt;
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public ncyb mo27626y(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        try {
            ncyb.C7569k c7569k = ncyb.f43814q;
            Path realPath = n5r1(path).toRealPath(new LinkOption[0]);
            kotlin.jvm.internal.d2ok.kja0(realPath, "toRealPath(...)");
            return ncyb.C7569k.m27823s(c7569k, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public List<ncyb> mo27627z(@InterfaceC7396q ncyb dir) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        List<ncyb> listM27838r = m27838r(dir, true);
        kotlin.jvm.internal.d2ok.qrj(listM27838r);
        return listM27838r;
    }
}
