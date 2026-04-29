package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.ncyb;

/* JADX INFO: compiled from: NioSystemFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public class eqxt extends gvn7 {
    /* JADX INFO: renamed from: l */
    private final Long m27607l(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.gvn7, okio.zurt
    @InterfaceC7395n
    public fn3e a9(@InterfaceC7396q ncyb path) {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        return ncyb(path.fti());
    }

    @Override // okio.gvn7, okio.zurt
    public void f7l8(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        try {
            Files.move(source.fti(), target.fti(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // okio.gvn7, okio.zurt
    /* JADX INFO: renamed from: h */
    public void mo27608h(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        Files.createSymbolicLink(source.fti(), target.fti(), new FileAttribute[0]);
    }

    @InterfaceC7395n
    protected final fn3e ncyb(@InterfaceC7396q Path nioPath) {
        kotlin.jvm.internal.d2ok.m23075h(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            ncyb ncybVarM27823s = symbolicLink != null ? ncyb.C7569k.m27823s(ncyb.f43814q, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM27607l = fileTimeCreationTime != null ? m27607l(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM27607l2 = fileTimeLastModifiedTime != null ? m27607l(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new fn3e(zIsRegularFile, zIsDirectory, ncybVarM27823s, lValueOf, lM27607l, lM27607l2, fileTimeLastAccessTime != null ? m27607l(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.gvn7
    @InterfaceC7396q
    public String toString() {
        return "NioSystemFileSystem";
    }
}
