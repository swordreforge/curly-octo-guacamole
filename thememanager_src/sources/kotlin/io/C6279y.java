package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.y */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6279y extends C6260p {
    public /* synthetic */ C6279y(File file, File file2, String str, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(file, (i2 & 2) != 0 ? null : file2, (i2 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6279y(@InterfaceC7396q File file, @InterfaceC7395n File file2, @InterfaceC7395n String str) {
        super(file, file2, str);
        d2ok.m23075h(file, "file");
    }
}
