package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.jvm.internal.d2ok;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class kja0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Object m22967q(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            d2ok.kja0(attributes, "readAttributes(this, A::class.java, *options)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zy(x2 x2Var) {
        for (x2 x2VarZy = x2Var.zy(); x2VarZy != null; x2VarZy = x2VarZy.zy()) {
            if (x2VarZy.toq() == null || x2Var.toq() == null) {
                try {
                    if (Files.isSameFile(x2VarZy.m22991q(), x2Var.m22991q())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (d2ok.f7l8(x2VarZy.toq(), x2Var.toq())) {
                return true;
            }
        }
        return false;
    }
}
