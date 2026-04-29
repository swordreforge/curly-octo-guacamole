package kotlin.io.path;

import cyoe.InterfaceC5979h;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.path.s */
/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6269s extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final InterfaceC5979h<Path, BasicFileAttributes, FileVisitResult> f36354k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final InterfaceC5979h<Path, IOException, FileVisitResult> f36355q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final InterfaceC5979h<Path, BasicFileAttributes, FileVisitResult> f81822toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final InterfaceC5979h<Path, IOException, FileVisitResult> f81823zy;

    /* JADX WARN: Multi-variable type inference failed */
    public C6269s(@InterfaceC7395n InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5979h, @InterfaceC7395n InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5979h2, @InterfaceC7395n InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC5979h3, @InterfaceC7395n InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC5979h4) {
        this.f36354k = interfaceC5979h;
        this.f81822toq = interfaceC5979h2;
        this.f81823zy = interfaceC5979h3;
        this.f36355q = interfaceC5979h4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC7396q
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@InterfaceC7396q Path dir, @InterfaceC7395n IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        d2ok.m23075h(dir, "dir");
        InterfaceC5979h<Path, IOException, FileVisitResult> interfaceC5979h = this.f36355q;
        if (interfaceC5979h != null && (fileVisitResultInvoke = interfaceC5979h.invoke(dir, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        d2ok.kja0(fileVisitResultPostVisitDirectory, "super.postVisitDirectory(dir, exc)");
        return fileVisitResultPostVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC7396q
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@InterfaceC7396q Path file, @InterfaceC7396q IOException exc) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        d2ok.m23075h(file, "file");
        d2ok.m23075h(exc, "exc");
        InterfaceC5979h<Path, IOException, FileVisitResult> interfaceC5979h = this.f81823zy;
        if (interfaceC5979h != null && (fileVisitResultInvoke = interfaceC5979h.invoke(file, exc)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        d2ok.kja0(fileVisitResultVisitFileFailed, "super.visitFileFailed(file, exc)");
        return fileVisitResultVisitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC7396q
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@InterfaceC7396q Path dir, @InterfaceC7396q BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        d2ok.m23075h(dir, "dir");
        d2ok.m23075h(attrs, "attrs");
        InterfaceC5979h<Path, BasicFileAttributes, FileVisitResult> interfaceC5979h = this.f36354k;
        if (interfaceC5979h != null && (fileVisitResultInvoke = interfaceC5979h.invoke(dir, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        d2ok.kja0(fileVisitResultPreVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @InterfaceC7396q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@InterfaceC7396q Path file, @InterfaceC7396q BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        d2ok.m23075h(file, "file");
        d2ok.m23075h(attrs, "attrs");
        InterfaceC5979h<Path, BasicFileAttributes, FileVisitResult> interfaceC5979h = this.f81822toq;
        if (interfaceC5979h != null && (fileVisitResultInvoke = interfaceC5979h.invoke(file, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        d2ok.kja0(fileVisitResultVisitFile, "super.visitFile(file, attrs)");
        return fileVisitResultVisitFile;
    }
}
