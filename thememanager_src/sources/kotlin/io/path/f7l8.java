package kotlin.io.path;

import cyoe.InterfaceC5979h;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.7")
@InterfaceC6261g
public interface f7l8 {
    /* JADX INFO: renamed from: k */
    void mo22943k(@InterfaceC7396q InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC5979h);

    /* JADX INFO: renamed from: q */
    void mo22944q(@InterfaceC7396q InterfaceC5979h<? super Path, ? super IOException, ? extends FileVisitResult> interfaceC5979h);

    void toq(@InterfaceC7396q InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5979h);

    void zy(@InterfaceC7396q InterfaceC5979h<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> interfaceC5979h);
}
