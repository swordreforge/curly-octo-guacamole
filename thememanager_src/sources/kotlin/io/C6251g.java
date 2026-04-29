package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.d2ok;

/* JADX INFO: renamed from: kotlin.io.g */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6251g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toq(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        d2ok.kja0(string, "sb.toString()");
        return string;
    }
}
