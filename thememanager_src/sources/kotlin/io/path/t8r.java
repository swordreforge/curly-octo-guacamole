package kotlin.io.path;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C6231h;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.gvn7;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.t8iq;
import kotlin.oc;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"})
class t8r extends ki {

    /* JADX INFO: renamed from: kotlin.io.path.t8r$g */
    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    static final class C6270g extends AbstractC6308r implements cyoe.x2<f7l8, was> {
        final /* synthetic */ cyoe.cdj<InterfaceC6264k, Path, Path, kotlin.io.path.toq> $copyAction;
        final /* synthetic */ cyoe.cdj<Path, Path, Exception, ld6> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX INFO: renamed from: kotlin.io.path.t8r$g$k */
        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        /* synthetic */ class k extends gvn7 implements InterfaceC5979h<Path, BasicFileAttributes, FileVisitResult> {
            final /* synthetic */ cyoe.cdj<InterfaceC6264k, Path, Path, kotlin.io.path.toq> $copyAction;
            final /* synthetic */ cyoe.cdj<Path, Path, Exception, ld6> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(cyoe.cdj<? super InterfaceC6264k, ? super Path, ? super Path, ? extends kotlin.io.path.toq> cdjVar, Path path, Path path2, cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar2) {
                super(2, d2ok.C6287k.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.$copyAction = cdjVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
                this.$onError = cdjVar2;
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7396q
            public final FileVisitResult invoke(@InterfaceC7396q Path p0, @InterfaceC7396q BasicFileAttributes p1) {
                d2ok.m23075h(p0, "p0");
                d2ok.m23075h(p1, "p1");
                return t8r.lvui(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p0, p1);
            }
        }

        /* JADX INFO: renamed from: kotlin.io.path.t8r$g$q */
        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        static final class q extends AbstractC6308r implements InterfaceC5979h<Path, IOException, FileVisitResult> {
            final /* synthetic */ cyoe.cdj<Path, Path, Exception, ld6> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            q(cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar, Path path, Path path2) {
                super(2);
                this.$onError = cdjVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7396q
            public final FileVisitResult invoke(@InterfaceC7396q Path directory, @InterfaceC7395n IOException iOException) {
                d2ok.m23075h(directory, "directory");
                return iOException == null ? FileVisitResult.CONTINUE : t8r.ncyb(this.$onError, this.$this_copyToRecursively, this.$target, directory, iOException);
            }
        }

        /* JADX INFO: renamed from: kotlin.io.path.t8r$g$toq */
        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        /* synthetic */ class toq extends gvn7 implements InterfaceC5979h<Path, BasicFileAttributes, FileVisitResult> {
            final /* synthetic */ cyoe.cdj<InterfaceC6264k, Path, Path, kotlin.io.path.toq> $copyAction;
            final /* synthetic */ cyoe.cdj<Path, Path, Exception, ld6> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(cyoe.cdj<? super InterfaceC6264k, ? super Path, ? super Path, ? extends kotlin.io.path.toq> cdjVar, Path path, Path path2, cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar2) {
                super(2, d2ok.C6287k.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.$copyAction = cdjVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
                this.$onError = cdjVar2;
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7396q
            public final FileVisitResult invoke(@InterfaceC7396q Path p0, @InterfaceC7396q BasicFileAttributes p1) {
                d2ok.m23075h(p0, "p0");
                d2ok.m23075h(p1, "p1");
                return t8r.lvui(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p0, p1);
            }
        }

        /* JADX INFO: renamed from: kotlin.io.path.t8r$g$zy */
        /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
        /* synthetic */ class zy extends gvn7 implements InterfaceC5979h<Path, Exception, FileVisitResult> {
            final /* synthetic */ cyoe.cdj<Path, Path, Exception, ld6> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            zy(cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar, Path path, Path path2) {
                super(2, d2ok.C6287k.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.$onError = cdjVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7396q
            public final FileVisitResult invoke(@InterfaceC7396q Path p0, @InterfaceC7396q Exception p1) {
                d2ok.m23075h(p0, "p0");
                d2ok.m23075h(p1, "p1");
                return t8r.ncyb(this.$onError, this.$this_copyToRecursively, this.$target, p0, p1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6270g(cyoe.cdj<? super InterfaceC6264k, ? super Path, ? super Path, ? extends kotlin.io.path.toq> cdjVar, Path path, Path path2, cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar2) {
            super(1);
            this.$copyAction = cdjVar;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = cdjVar2;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(f7l8 f7l8Var) {
            invoke2(f7l8Var);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q f7l8 visitFileTree) {
            d2ok.m23075h(visitFileTree, "$this$visitFileTree");
            visitFileTree.toq(new k(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
            visitFileTree.zy(new toq(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
            visitFileTree.mo22944q(new zy(this.$onError, this.$this_copyToRecursively, this.$target));
            visitFileTree.mo22943k(new q(this.$onError, this.$this_copyToRecursively, this.$target));
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.t8r$k */
    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    public /* synthetic */ class C6271k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f36356k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final /* synthetic */ int[] f81824toq;

        static {
            int[] iArr = new int[kotlin.io.path.toq.values().length];
            try {
                iArr[kotlin.io.path.toq.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.io.path.toq.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.io.path.toq.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36356k = iArr;
            int[] iArr2 = new int[ld6.values().length];
            try {
                iArr2[ld6.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ld6.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f81824toq = iArr2;
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.t8r$n */
    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    static final class C6272n extends AbstractC6308r implements cyoe.cdj<InterfaceC6264k, Path, Path, kotlin.io.path.toq> {
        final /* synthetic */ boolean $followLinks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6272n(boolean z2) {
            super(3);
            this.$followLinks = z2;
        }

        @Override // cyoe.cdj
        @InterfaceC7396q
        public final kotlin.io.path.toq invoke(@InterfaceC7396q InterfaceC6264k interfaceC6264k, @InterfaceC7396q Path src, @InterfaceC7396q Path dst) {
            d2ok.m23075h(interfaceC6264k, "$this$null");
            d2ok.m23075h(src, "src");
            d2ok.m23075h(dst, "dst");
            return interfaceC6264k.mo22954k(src, dst, this.$followLinks);
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.t8r$q */
    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    static final class C6273q extends AbstractC6308r implements cyoe.cdj {
        public static final C6273q INSTANCE = new C6273q();

        C6273q() {
            super(3);
        }

        @Override // cyoe.cdj
        @InterfaceC7396q
        public final Void invoke(@InterfaceC7396q Path path, @InterfaceC7396q Path path2, @InterfaceC7396q Exception exception) throws Exception {
            d2ok.m23075h(path, "<anonymous parameter 0>");
            d2ok.m23075h(path2, "<anonymous parameter 1>");
            d2ok.m23075h(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    static final class toq extends AbstractC6308r implements cyoe.cdj {
        public static final toq INSTANCE = new toq();

        toq() {
            super(3);
        }

        @Override // cyoe.cdj
        @InterfaceC7396q
        public final Void invoke(@InterfaceC7396q Path path, @InterfaceC7396q Path path2, @InterfaceC7396q Exception exception) throws Exception {
            d2ok.m23075h(path, "<anonymous parameter 0>");
            d2ok.m23075h(path2, "<anonymous parameter 1>");
            d2ok.m23075h(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    static final class zy extends AbstractC6308r implements cyoe.cdj<InterfaceC6264k, Path, Path, kotlin.io.path.toq> {
        final /* synthetic */ boolean $followLinks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(boolean z2) {
            super(3);
            this.$followLinks = z2;
        }

        @Override // cyoe.cdj
        @InterfaceC7396q
        public final kotlin.io.path.toq invoke(@InterfaceC7396q InterfaceC6264k copyToRecursively, @InterfaceC7396q Path src, @InterfaceC7396q Path dst) throws FileSystemException {
            d2ok.m23075h(copyToRecursively, "$this$copyToRecursively");
            d2ok.m23075h(src, "src");
            d2ok.m23075h(dst, "dst");
            LinkOption[] linkOptionArrM22978k = C6267p.f36349k.m22978k(this.$followLinks);
            boolean zIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM22978k, linkOptionArrM22978k.length);
            if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                if (zIsDirectory) {
                    t8r.m22987l(dst);
                }
                t8iq t8iqVar = new t8iq(2);
                t8iqVar.toq(linkOptionArrM22978k);
                t8iqVar.m23149k(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) t8iqVar.m23150q(new CopyOption[t8iqVar.zy()]);
                d2ok.kja0(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
            }
            return kotlin.io.path.toq.CONTINUE;
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m22984c(Path path, C6265n c6265n) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception e2) {
                c6265n.m22969k(e2);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStreamNewDirectoryStream = null;
        }
        if (directoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            for (Path entry : directoryStreamNewDirectoryStream) {
                d2ok.kja0(entry, "entry");
                lrht(entry, c6265n);
            }
            was wasVar = was.f36763k;
            kotlin.io.zy.m23032k(directoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    @InterfaceC7396q
    @yz(version = "1.8")
    @InterfaceC6261g
    public static final Path d2ok(@InterfaceC7396q Path path, @InterfaceC7396q Path target, @InterfaceC7396q cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> onError, boolean z2, boolean z3) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        d2ok.m23075h(onError, "onError");
        return z3 ? eqxt(path, target, onError, z2, new zy(z2)) : m22988r(path, target, onError, z2, null, 8, null);
    }

    public static /* synthetic */ Path dd(Path path, Path path2, cyoe.cdj cdjVar, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cdjVar = toq.INSTANCE;
        }
        return d2ok(path, path2, cdjVar, z2, z3);
    }

    @InterfaceC6261g
    /* JADX INFO: renamed from: e */
    private static final FileVisitResult m22985e(ld6 ld6Var) {
        int i2 = C6271k.f81824toq[ld6Var.ordinal()];
        if (i2 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i2 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new oc();
    }

    @InterfaceC7396q
    @yz(version = "1.8")
    @InterfaceC6261g
    public static final Path eqxt(@InterfaceC7396q Path path, @InterfaceC7396q Path target, @InterfaceC7396q cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> onError, boolean z2, @InterfaceC7396q cyoe.cdj<? super InterfaceC6264k, ? super Path, ? super Path, ? extends kotlin.io.path.toq> copyAction) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        d2ok.m23075h(onError, "onError");
        d2ok.m23075h(copyAction, "copyAction");
        LinkOption[] linkOptionArrM22978k = C6267p.f36349k.m22978k(z2);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM22978k, linkOptionArrM22978k.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), target.toString(), "The source file doesn't exist.");
        }
        boolean zStartsWith = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z2 || !Files.isSymbolicLink(path))) {
            boolean z3 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
            if (!z3 || !Files.isSameFile(path, target)) {
                if (d2ok.f7l8(path.getFileSystem(), target.getFileSystem())) {
                    if (z3) {
                        zStartsWith = target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = target.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            zStartsWith = true;
                        }
                    }
                }
                if (zStartsWith) {
                    throw new FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        C6263i.n2t(path, 0, z2, new C6270g(copyAction, path, target, onError), 1, null);
        return target;
    }

    /* JADX INFO: renamed from: f */
    private static final void m22986f(SecureDirectoryStream<Path> secureDirectoryStream, Path path, C6265n c6265n) {
        c6265n.toq(path);
        try {
        } catch (Exception e2) {
            c6265n.m22969k(e2);
        }
        if (uv6(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int iM22968g = c6265n.m22968g();
            hyr(secureDirectoryStream, path, c6265n);
            if (iM22968g == c6265n.m22968g()) {
                secureDirectoryStream.deleteDirectory(path);
                was wasVar = was.f36763k;
            }
            c6265n.zy(path);
        }
        secureDirectoryStream.deleteFile(path);
        was wasVar2 = was.f36763k;
        c6265n.zy(path);
    }

    private static final void hyr(SecureDirectoryStream<Path> secureDirectoryStream, Path path, C6265n c6265n) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e2) {
                c6265n.m22969k(e2);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                Path fileName = it.next().getFileName();
                d2ok.kja0(fileName, "entry.fileName");
                m22986f(secureDirectoryStreamNewDirectoryStream, fileName, c6265n);
            }
            was wasVar = was.f36763k;
            kotlin.io.zy.m23032k(secureDirectoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    @yz(version = "1.8")
    @InterfaceC6261g
    /* JADX INFO: renamed from: l */
    public static final void m22987l(@InterfaceC7396q Path path) throws FileSystemException {
        d2ok.m23075h(path, "<this>");
        List<Exception> listN5r1 = n5r1(path);
        if (!listN5r1.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterator<T> it = listN5r1.iterator();
            while (it.hasNext()) {
                C6231h.m22845k(fileSystemException, (Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    private static final void lrht(Path path, C6265n c6265n) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int iM22968g = c6265n.m22968g();
                m22984c(path, c6265n);
                if (iM22968g == c6265n.m22968g()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e2) {
            c6265n.m22969k(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult lvui(cyoe.cdj<? super InterfaceC6264k, ? super Path, ? super Path, ? extends kotlin.io.path.toq> cdjVar, Path path, Path path2, cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return vyq(cdjVar.invoke(kotlin.io.path.zy.f36364k, path3, x9kr(path, path2, path3)));
        } catch (Exception e2) {
            return ncyb(cdjVar2, path, path2, path3, e2);
        }
    }

    private static final List<Exception> n5r1(Path path) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z2 = false;
        boolean z3 = true;
        C6265n c6265n = new C6265n(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                        c6265n.f7l8(parent);
                        Path fileName = path.getFileName();
                        d2ok.kja0(fileName, "this.fileName");
                        m22986f((SecureDirectoryStream) directoryStreamNewDirectoryStream, fileName, c6265n);
                    } else {
                        z2 = true;
                    }
                    was wasVar = was.f36763k;
                    kotlin.io.zy.m23032k(directoryStreamNewDirectoryStream, null);
                    z3 = z2;
                } finally {
                }
            }
        }
        if (z3) {
            lrht(path, c6265n);
        }
        return c6265n.m22971q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult ncyb(cyoe.cdj<? super Path, ? super Path, ? super Exception, ? extends ld6> cdjVar, Path path, Path path2, Path path3, Exception exc) {
        return m22985e(cdjVar.invoke(path3, x9kr(path, path2, path3), exc));
    }

    private static final <R> R nn86(InterfaceC5981k<? extends R> interfaceC5981k) {
        try {
            return interfaceC5981k.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }

    private static final void oc(C6265n c6265n, InterfaceC5981k<was> interfaceC5981k) {
        try {
            interfaceC5981k.invoke();
        } catch (Exception e2) {
            c6265n.m22969k(e2);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Path m22988r(Path path, Path path2, cyoe.cdj cdjVar, boolean z2, cyoe.cdj cdjVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cdjVar = C6273q.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            cdjVar2 = new C6272n(z2);
        }
        return eqxt(path, path2, cdjVar, z2, cdjVar2);
    }

    private static final boolean uv6(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @InterfaceC6261g
    private static final FileVisitResult vyq(kotlin.io.path.toq toqVar) {
        int i2 = C6271k.f36356k[toqVar.ordinal()];
        if (i2 == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i2 == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i2 == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new oc();
    }

    private static final Path x9kr(Path path, Path path2, Path path3) {
        Path pathResolve = path2.resolve(C6263i.jbh(path3, path).toString());
        d2ok.kja0(pathResolve, "target.resolve(relativePath.pathString)");
        return pathResolve;
    }
}
