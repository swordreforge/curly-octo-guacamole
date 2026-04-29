package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.d2ok;
import kotlin.text.a9;
import kotlin.text.gvn7;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
final class qrj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final qrj f36353k = new qrj();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Path f81820toq = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Path f81821zy = Paths.get("..", new String[0]);

    private qrj() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Path m22981k(@InterfaceC7396q Path path, @InterfaceC7396q Path base) {
        d2ok.m23075h(path, "path");
        d2ok.m23075h(base, "base");
        Path pathNormalize = base.normalize();
        Path r2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(r2);
        int iMin = Math.min(pathNormalize.getNameCount(), r2.getNameCount());
        for (int i2 = 0; i2 < iMin; i2++) {
            Path name = pathNormalize.getName(i2);
            Path path2 = f81821zy;
            if (!d2ok.f7l8(name, path2)) {
                break;
            }
            if (!d2ok.f7l8(r2.getName(i2), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (d2ok.f7l8(r2, pathNormalize) || !d2ok.f7l8(pathNormalize, f81820toq)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            d2ok.kja0(separator, "rn.fileSystem.separator");
            r2 = a9.ga(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(gvn7.i0(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        d2ok.kja0(r2, "r");
        return r2;
    }
}
