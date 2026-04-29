package kotlin.io.path;

import cyoe.InterfaceC5979h;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.path.y */
/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6261g
public final class C6274y implements f7l8 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f36361k;

    /* JADX INFO: renamed from: n */
    private boolean f36362n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> f36363q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f81827toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> f81828zy;

    private final void f7l8(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    /* JADX INFO: renamed from: g */
    private final void m22992g() {
        if (this.f36362n) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    @Override // kotlin.io.path.f7l8
    /* JADX INFO: renamed from: k */
    public void mo22943k(@InterfaceC7396q InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        d2ok.m23075h(function, "function");
        m22992g();
        f7l8(this.f36363q, "onPostVisitDirectory");
        this.f36363q = function;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final FileVisitor<Path> m22993n() {
        m22992g();
        this.f36362n = true;
        return new C6269s(this.f36361k, this.f81827toq, this.f81828zy, this.f36363q);
    }

    @Override // kotlin.io.path.f7l8
    /* JADX INFO: renamed from: q */
    public void mo22944q(@InterfaceC7396q InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        d2ok.m23075h(function, "function");
        m22992g();
        f7l8(this.f81828zy, "onVisitFileFailed");
        this.f81828zy = function;
    }

    @Override // kotlin.io.path.f7l8
    public void toq(@InterfaceC7396q InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        d2ok.m23075h(function, "function");
        m22992g();
        f7l8(this.f36361k, "onPreVisitDirectory");
        this.f36361k = function;
    }

    @Override // kotlin.io.path.f7l8
    public void zy(@InterfaceC7396q InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        d2ok.m23075h(function, "function");
        m22992g();
        f7l8(this.f81827toq, "onVisitFile");
        this.f81827toq = function;
    }
}
