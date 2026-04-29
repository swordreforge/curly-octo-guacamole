package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
final class x2 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Path f36359k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private Iterator<x2> f36360q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final Object f81825toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final x2 f81826zy;

    public x2(@InterfaceC7396q Path path, @InterfaceC7395n Object obj, @InterfaceC7395n x2 x2Var) {
        d2ok.m23075h(path, "path");
        this.f36359k = path;
        this.f81825toq = obj;
        this.f81826zy = x2Var;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Iterator<x2> m22989k() {
        return this.f36360q;
    }

    /* JADX INFO: renamed from: n */
    public final void m22990n(@InterfaceC7395n Iterator<x2> it) {
        this.f36360q = it;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final Path m22991q() {
        return this.f36359k;
    }

    @InterfaceC7395n
    public final Object toq() {
        return this.f81825toq;
    }

    @InterfaceC7395n
    public final x2 zy() {
        return this.f81826zy;
    }
}
