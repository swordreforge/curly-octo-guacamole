package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.p */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6260p extends IOException {

    @InterfaceC7396q
    private final File file;

    @InterfaceC7395n
    private final File other;

    @InterfaceC7395n
    private final String reason;

    public /* synthetic */ C6260p(File file, File file2, String str, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(file, (i2 & 2) != 0 ? null : file2, (i2 & 4) != 0 ? null : str);
    }

    @InterfaceC7396q
    public final File getFile() {
        return this.file;
    }

    @InterfaceC7395n
    public final File getOther() {
        return this.other;
    }

    @InterfaceC7395n
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6260p(@InterfaceC7396q File file, @InterfaceC7395n File file2, @InterfaceC7395n String str) {
        super(C6251g.toq(file, file2, str));
        d2ok.m23075h(file, "file");
        this.file = file;
        this.other = file2;
        this.reason = str;
    }
}
