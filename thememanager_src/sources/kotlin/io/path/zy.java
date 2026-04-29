package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6261g
final class zy implements InterfaceC6264k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f36364k = new zy();

    private zy() {
    }

    @Override // kotlin.io.path.InterfaceC6264k
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public toq mo22954k(@InterfaceC7396q Path path, @InterfaceC7396q Path target, boolean z2) {
        d2ok.m23075h(path, "<this>");
        d2ok.m23075h(target, "target");
        LinkOption[] linkOptionArrM22978k = C6267p.f36349k.m22978k(z2);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrM22978k, linkOptionArrM22978k.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(target, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArrM22978k, linkOptionArrM22978k.length);
            d2ok.kja0(Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
        }
        return toq.CONTINUE;
    }
}
