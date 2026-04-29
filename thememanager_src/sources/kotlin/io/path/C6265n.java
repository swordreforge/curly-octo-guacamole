package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.path.n */
/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6265n {

    /* JADX INFO: renamed from: k */
    private final int f36346k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private Path f36347q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f81813toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final List<Exception> f81814zy;

    public C6265n() {
        this(0, 1, null);
    }

    public C6265n(int i2) {
        this.f36346k = i2;
        this.f81814zy = new ArrayList();
    }

    public final void f7l8(@InterfaceC7395n Path path) {
        this.f36347q = path;
    }

    /* JADX INFO: renamed from: g */
    public final int m22968g() {
        return this.f81813toq;
    }

    /* JADX INFO: renamed from: k */
    public final void m22969k(@InterfaceC7396q Exception exception) {
        d2ok.m23075h(exception, "exception");
        this.f81813toq++;
        if (this.f81814zy.size() < this.f36346k) {
            if (this.f36347q != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.f36347q)).initCause(exception);
                d2ok.n7h(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = (FileSystemException) thInitCause;
            }
            this.f81814zy.add(exception);
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Path m22970n() {
        return this.f36347q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final List<Exception> m22971q() {
        return this.f81814zy;
    }

    public final void toq(@InterfaceC7396q Path name) {
        d2ok.m23075h(name, "name");
        Path path = this.f36347q;
        this.f36347q = path != null ? path.resolve(name) : null;
    }

    public final void zy(@InterfaceC7396q Path name) {
        d2ok.m23075h(name, "name");
        Path path = this.f36347q;
        if (!d2ok.f7l8(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path2 = this.f36347q;
        this.f36347q = path2 != null ? path2.getParent() : null;
    }

    public /* synthetic */ C6265n(int i2, int i3, ni7 ni7Var) {
        this((i3 & 1) != 0 ? 64 : i2);
    }
}
