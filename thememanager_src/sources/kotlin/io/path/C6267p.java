package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.a98o;
import kotlin.collections.i1;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.path.p */
/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
public final class C6267p {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6267p f36349k = new C6267p();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final LinkOption[] f81816toq = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final LinkOption[] f81817zy = new LinkOption[0];

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final Set<FileVisitOption> f36351q = a98o.ld6();

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final Set<FileVisitOption> f36350n = i1.m22499g(FileVisitOption.FOLLOW_LINKS);

    private C6267p() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final LinkOption[] m22978k(boolean z2) {
        return z2 ? f81817zy : f81816toq;
    }

    @InterfaceC7396q
    public final Set<FileVisitOption> toq(boolean z2) {
        return z2 ? f36350n : f36351q;
    }
}
