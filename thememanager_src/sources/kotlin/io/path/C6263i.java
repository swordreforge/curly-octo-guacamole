package kotlin.io.path;

import androidx.exifinterface.media.C0846k;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6480z;
import kotlin.collections.a9;
import kotlin.collections.a98o;
import kotlin.collections.i1;
import kotlin.hb;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import kotlin.jvm.internal.lv5;
import kotlin.nn86;
import kotlin.text.fti;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.io.path.i */
/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
public class C6263i extends t8r {
    @InterfaceC7396q
    @yz(version = "1.9")
    /* JADX INFO: renamed from: a */
    public static final Path m22945a(@InterfaceC7396q Path path, @InterfaceC7396q FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attributes, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                d2ok.kja0(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(this, *attributes)");
            } catch (FileAlreadyExistsException e2) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e2;
                }
            }
        }
        return path;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path a98o(Path path, Path target) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        Path pathCreateLink = Files.createLink(path, target);
        d2ok.kja0(pathCreateLink, "createLink(this, target)");
        return pathCreateLink;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: b */
    private static final Path m22946b(Path path, FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateDirectories, "createDirectories(this, *attributes)");
        return pathCreateDirectories;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path b3e(Path path, Path target, CopyOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        d2ok.m23075h(options, "options");
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    static /* synthetic */ Path bek6(Path path, Path target, boolean z2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        d2ok.kja0(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path bf2(Path path, FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateDirectory, "createDirectory(this, *attributes)");
        return pathCreateDirectory;
    }

    static /* synthetic */ Path bo(String str, String str2, FileAttribute[] attributes, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateTempFile, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean bwp(Path path) {
        d2ok.m23075h(path, "<this>");
        return Files.isReadable(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean bz2(Path path) {
        d2ok.m23075h(path, "<this>");
        return Files.isWritable(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final void c8jq(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        Files.delete(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    public static /* synthetic */ void cfr(Path path) {
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final Path ch(@InterfaceC7395n Path path, @InterfaceC7395n String str, @InterfaceC7396q FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            d2ok.kja0(pathCreateTempDirectory, "createTempDirectory(dire…ory, prefix, *attributes)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateTempDirectory2, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory2;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean cv06(Path path, LinkOption... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ <V extends FileAttributeView> V m22947d(Path path, LinkOption... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        d2ok.m23086z(4, "V");
        V v2 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        if (v2 != null) {
            return v2;
        }
        d2ok.m23086z(4, "V");
        ikck(path, FileAttributeView.class);
        throw new C6480z();
    }

    @InterfaceC7396q
    public static final String d8wk(@InterfaceC7396q Path path) {
        String string;
        String strPy7;
        d2ok.m23075h(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strPy7 = fti.py7(string, '.', "")) == null) ? "" : strPy7;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final Path m28278do(Path path, UserPrincipal value) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(value, "value");
        Path owner = Files.setOwner(path, value);
        d2ok.kja0(owner, "setOwner(this, value)");
        return owner;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path dr(Path path, String other) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(other, "other");
        Path pathResolve = path.resolve(other);
        d2ok.kja0(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path ebn(URI uri) {
        d2ok.m23075h(uri, "<this>");
        Path path = Paths.get(uri);
        d2ok.kja0(path, "get(this)");
        return path;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path ek5k(Path path, Path target, boolean z2) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        d2ok.kja0(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final UserPrincipal etdu(Path path, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @InterfaceC7396q
    @yz(version = "1.7")
    @InterfaceC6261g
    public static final FileVisitor<Path> fnq8(@InterfaceC7396q cyoe.x2<? super f7l8, was> builderAction) {
        d2ok.m23075h(builderAction, "builderAction");
        C6274y c6274y = new C6274y();
        builderAction.invoke(c6274y);
        return c6274y.m22993n();
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @yz(version = "1.5")
    public static /* synthetic */ void g1(Path path) {
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @hb(expression = "invariantSeparatorsPathString", imports = {}))
    @yz(version = "1.4")
    @InterfaceC6261g
    public static /* synthetic */ void gbni(Path path) {
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean gc3c(Path path, Path other) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(other, "other");
        return Files.isSameFile(path, other);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean gyi(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final /* synthetic */ <A extends BasicFileAttributes> A h7am(Path path, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        d2ok.m23086z(4, C0846k.l0);
        A a2 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(a2, "readAttributes(this, A::class.java, *options)");
        return a2;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path hb(String path) {
        d2ok.m23075h(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        d2ok.kja0(path2, "get(path)");
        return path2;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path i1(Path path, FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateFile, "createFile(this, *attributes)");
        return pathCreateFile;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final FileTime i9jn(Path path, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    static /* synthetic */ Object ij(Path path, String glob, cyoe.x2 block, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            glob = "*";
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(glob, "glob");
        d2ok.m23075h(block, "block");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            d2ok.kja0(it, "it");
            Object objInvoke = block.invoke(a9.ebn(it));
            d3.m23090q(1);
            kotlin.io.zy.m23032k(it, null);
            d3.zy(1);
            return objInvoke;
        } finally {
        }
    }

    @nn86
    @InterfaceC7396q
    public static final Void ikck(@InterfaceC7396q Path path, @InterfaceC7396q Class<?> attributeViewClass) {
        d2ok.m23075h(path, "path");
        d2ok.m23075h(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path ixz(Path path, FileTime value) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(value, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, value);
        d2ok.kja0(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: j */
    private static final Path m22948j(String base, String... subpaths) {
        d2ok.m23075h(base, "base");
        d2ok.m23075h(subpaths, "subpaths");
        Path path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        d2ok.kja0(path, "get(base, *subpaths)");
        return path;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final Path jbh(@InterfaceC7396q Path path, @InterfaceC7396q Path base) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(base, "base");
        try {
            return qrj.f36353k.m22981k(path, base);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e2);
        }
    }

    public static /* synthetic */ List jz5(Path path, String str, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            str = "*";
        }
        return uj2j(path, str);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean kcsr(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        return Files.isHidden(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path ktq(Path path, Path target, boolean z2) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathMove = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        d2ok.kja0(pathMove, "move(this, target, *options)");
        return pathMove;
    }

    @InterfaceC7396q
    public static final String ltg8(@InterfaceC7396q Path path) {
        d2ok.m23075h(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    public static /* synthetic */ Path lv5(Path path, String str, FileAttribute[] fileAttributeArr, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return ch(path, str, fileAttributeArr);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: m */
    private static final String m22949m(Path path) {
        d2ok.m23075h(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @InterfaceC7396q
    public static final String m4(@InterfaceC7396q Path path) {
        String string;
        String strFupf;
        d2ok.m23075h(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strFupf = fti.fupf(string, ".", null, 2, null)) == null) ? "" : strFupf;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path mbx(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        Path symbolicLink = Files.readSymbolicLink(path);
        d2ok.kja0(symbolicLink, "readSymbolicLink(this)");
        return symbolicLink;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final /* synthetic */ <V extends FileAttributeView> V mu(Path path, LinkOption... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        d2ok.m23086z(4, "V");
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    public static /* synthetic */ void n2t(Path path, int i2, boolean z2, cyoe.x2 x2Var, int i3, Object obj) throws IOException {
        if ((i3 & 1) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        nsb(path, i2, z2, x2Var);
    }

    @InterfaceC7396q
    @yz(version = "1.7")
    @InterfaceC6261g
    public static final kotlin.sequences.qrj<Path> ngy(@InterfaceC7396q Path path, @InterfaceC7396q EnumC6262h... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        return new n7h(path, options);
    }

    static /* synthetic */ Path nmn5(String str, FileAttribute[] attributes, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            str = null;
        }
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateTempDirectory, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    @yz(version = "1.7")
    @InterfaceC6261g
    public static final void nsb(@InterfaceC7396q Path path, int i2, boolean z2, @InterfaceC7396q cyoe.x2<? super f7l8, was> builderAction) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(builderAction, "builderAction");
        zwy(path, fnq8(builderAction), i2, z2);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: o */
    private static final Path m22950o(Path path) {
        d2ok.m23075h(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        d2ok.kja0(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final <T> T pc(Path path, String glob, cyoe.x2<? super kotlin.sequences.qrj<? extends Path>, ? extends T> block) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(glob, "glob");
        d2ok.m23075h(block, "block");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            d2ok.kja0(it, "it");
            T tInvoke = block.invoke(a9.ebn(it));
            d3.m23090q(1);
            kotlin.io.zy.m23032k(it, null);
            d3.zy(1);
            return tInvoke;
        } finally {
        }
    }

    public static /* synthetic */ void pjz9(Path path, FileVisitor fileVisitor, int i2, boolean z2, int i3, Object obj) throws IOException {
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        zwy(path, fileVisitor, i2, z2);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @yz(version = "1.5")
    public static /* synthetic */ void py(Path path) {
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final FileStore qkj8(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        d2ok.kja0(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final void qo(Path path, String glob, cyoe.x2<? super Path, was> action) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(glob, "glob");
        d2ok.m23075h(action, "action");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            d2ok.kja0(it, "it");
            Iterator<Path> it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            was wasVar = was.f36763k;
            d3.m23090q(1);
            kotlin.io.zy.m23032k(it, null);
            d3.zy(1);
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @yz(version = "1.5")
    public static /* synthetic */ void r8s8(Path path) {
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean se(Path path, LinkOption... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final String sok(Path path) {
        d2ok.m23075h(path, "<this>");
        return path.toString();
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path t8iq(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateTempFile, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    static /* synthetic */ void tfm(Path path, String glob, cyoe.x2 action, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            glob = "*";
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(glob, "glob");
        d2ok.m23075h(action, "action");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            d2ok.kja0(it, "it");
            Iterator<Path> it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            was wasVar = was.f36763k;
            d3.m23090q(1);
            kotlin.io.zy.m23032k(it, null);
            d3.zy(1);
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    /* JADX INFO: renamed from: u */
    public static final Path m22951u(@InterfaceC7395n Path path, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7396q FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            d2ok.kja0(pathCreateTempFile, "createTempFile(directory…fix, suffix, *attributes)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateTempFile2, "createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile2;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final Path uc(@InterfaceC7396q Path path, @InterfaceC7396q Path base) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(base, "base");
        Path pathYl = yl(path, base);
        return pathYl == null ? path : pathYl;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7396q
    @yz(version = "1.5")
    public static final List<Path> uj2j(@InterfaceC7396q Path path, @InterfaceC7396q String glob) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(glob, "glob");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            d2ok.kja0(it, "it");
            List<Path> listWr = a9.wr(it);
            kotlin.io.zy.m23032k(it, null);
            return listWr;
        } finally {
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path ukdy(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(value, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, value);
        d2ok.kja0(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: v */
    private static final boolean m22952v(Path path, LinkOption... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @yz(version = "1.5")
    public static /* synthetic */ void v0af(Path path) {
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Map<String, Object> vep5(Path path, String attributes, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attributes, "attributes");
        d2ok.m23075h(options, "options");
        Map<String, Object> attributes2 = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(attributes2, "readAttributes(this, attributes, *options)");
        return attributes2;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long vq(Path path) throws IOException {
        d2ok.m23075h(path, "<this>");
        return Files.size(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Set<PosixFilePermission> w831(Path path, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    private static final String was(Path path) {
        d2ok.m23075h(path, "<this>");
        return zsr0(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Object wo(Path path, String attribute, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attribute, "attribute");
        d2ok.m23075h(options, "options");
        return Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path wx16(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(attribute, "attribute");
        d2ok.m23075h(options, "options");
        Path attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(attribute2, "setAttribute(this, attribute, value, *options)");
        return attribute2;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: x */
    private static final Path m22953x(String str, FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateTempDirectory, "createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path xwq3(Path path, Path other) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(other, "other");
        Path pathResolve = path.resolve(other);
        d2ok.kja0(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    public static /* synthetic */ Path y2(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return m22951u(path, str, str2, fileAttributeArr);
    }

    static /* synthetic */ Path y9n(Path path, Path target, boolean z2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        CopyOption[] copyOptionArr = z2 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        d2ok.kja0(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC7395n
    @yz(version = "1.5")
    public static final Path yl(@InterfaceC7396q Path path, @InterfaceC7396q Path base) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(base, "base");
        try {
            return qrj.f36353k.m22981k(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean yqrt(Path path) {
        d2ok.m23075h(path, "<this>");
        return Files.isExecutable(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path yz(Path path, Path target, CopyOption... options) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        d2ok.m23075h(options, "options");
        Path pathCopy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        d2ok.kja0(pathCopy, "copy(this, target, *options)");
        return pathCopy;
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean z4(Path path, LinkOption... options) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(options, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final boolean zkd(Path path) {
        d2ok.m23075h(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @i9jn(markerClass = {InterfaceC6261g.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final Path zp(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        d2ok.m23075h(attributes, "attributes");
        Path pathCreateSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        d2ok.kja0(pathCreateSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return pathCreateSymbolicLink;
    }

    @InterfaceC7396q
    public static final String zsr0(@InterfaceC7396q Path path) {
        d2ok.m23075h(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (d2ok.f7l8(separator, "/")) {
            return path.toString();
        }
        String string = path.toString();
        d2ok.kja0(separator, "separator");
        return kotlin.text.a9.uf(string, separator, "/", false, 4, null);
    }

    @yz(version = "1.7")
    @InterfaceC6261g
    public static final void zwy(@InterfaceC7396q Path path, @InterfaceC7396q FileVisitor<Path> visitor, int i2, boolean z2) throws IOException {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(visitor, "visitor");
        Files.walkFileTree(path, z2 ? i1.m22499g(FileVisitOption.FOLLOW_LINKS) : a98o.ld6(), i2, visitor);
    }
}
