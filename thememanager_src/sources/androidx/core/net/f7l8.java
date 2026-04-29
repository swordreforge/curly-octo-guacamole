package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0006"}, d2 = {"", "Landroid/net/Uri;", "zy", "Ljava/io/File;", "toq", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class f7l8 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final File m2695k(@InterfaceC7396q Uri toFile) {
        d2ok.cdj(toFile, "$this$toFile");
        if (!d2ok.f7l8(toFile.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + toFile).toString());
        }
        String path = toFile.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + toFile).toString());
    }

    @InterfaceC7396q
    public static final Uri toq(@InterfaceC7396q File toUri) {
        d2ok.cdj(toUri, "$this$toUri");
        Uri uriFromFile = Uri.fromFile(toUri);
        d2ok.m23085y(uriFromFile, "Uri.fromFile(this)");
        return uriFromFile;
    }

    @InterfaceC7396q
    public static final Uri zy(@InterfaceC7396q String toUri) {
        d2ok.cdj(toUri, "$this$toUri");
        Uri uri = Uri.parse(toUri);
        d2ok.m23085y(uri, "Uri.parse(this)");
        return uri;
    }
}
