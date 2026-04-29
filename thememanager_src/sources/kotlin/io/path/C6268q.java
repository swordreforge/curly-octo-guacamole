package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.path.q */
/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
final class C6268q extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: k */
    private final boolean f36352k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private x2 f81818toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private kotlin.collections.ld6<x2> f81819zy = new kotlin.collections.ld6<>();

    public C6268q(boolean z2) {
        this.f36352k = z2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22979k() {
        return this.f36352k;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC7396q
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@InterfaceC7396q Path file, @InterfaceC7396q BasicFileAttributes attrs) throws IOException {
        d2ok.m23075h(file, "file");
        d2ok.m23075h(attrs, "attrs");
        this.f81819zy.add(new x2(file, null, this.f81818toq));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        d2ok.kja0(fileVisitResultVisitFile, "super.visitFile(file, attrs)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC7396q
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@InterfaceC7396q Path dir, @InterfaceC7396q BasicFileAttributes attrs) throws IOException {
        d2ok.m23075h(dir, "dir");
        d2ok.m23075h(attrs, "attrs");
        this.f81819zy.add(new x2(dir, attrs.fileKey(), this.f81818toq));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        d2ok.kja0(fileVisitResultPreVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return fileVisitResultPreVisitDirectory;
    }

    @InterfaceC7396q
    public final List<x2> zy(@InterfaceC7396q x2 directoryNode) throws IOException {
        d2ok.m23075h(directoryNode, "directoryNode");
        this.f81818toq = directoryNode;
        Files.walkFileTree(directoryNode.m22991q(), C6267p.f36349k.toq(this.f36352k), 1, this);
        this.f81819zy.removeFirst();
        kotlin.collections.ld6<x2> ld6Var = this.f81819zy;
        this.f81819zy = new kotlin.collections.ld6<>();
        return ld6Var;
    }
}
