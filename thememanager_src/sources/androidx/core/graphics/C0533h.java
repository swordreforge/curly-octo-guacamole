package androidx.core.graphics;

import android.graphics.Path;
import java.util.Collection;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.graphics.h */
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¨\u0006\f"}, d2 = {"Landroid/graphics/Path;", "", "error", "", "Landroidx/core/graphics/ki;", "toq", "p", C7704k.y.toq.f95579toq, "q", "n", "k", "f7l8", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0533h {
    @InterfaceC7396q
    @hyr(19)
    public static final Path f7l8(@InterfaceC7396q Path xor, @InterfaceC7396q Path p2) {
        d2ok.cdj(xor, "$this$xor");
        d2ok.cdj(p2, "p");
        Path path = new Path(xor);
        path.op(p2, Path.Op.XOR);
        return path;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: g */
    public static final Path m2484g(@InterfaceC7396q Path plus, @InterfaceC7396q Path p2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(p2, "p");
        Path path = new Path(plus);
        path.op(p2, Path.Op.UNION);
        return path;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: k */
    public static final Path m2485k(@InterfaceC7396q Path and, @InterfaceC7396q Path p2) {
        d2ok.cdj(and, "$this$and");
        d2ok.cdj(p2, "p");
        Path path = new Path();
        path.op(and, p2, Path.Op.INTERSECT);
        return path;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: n */
    public static final Path m2486n(@InterfaceC7396q Path or, @InterfaceC7396q Path p2) {
        d2ok.cdj(or, "$this$or");
        d2ok.cdj(p2, "p");
        Path path = new Path(or);
        path.op(p2, Path.Op.UNION);
        return path;
    }

    @InterfaceC7396q
    @hyr(19)
    /* JADX INFO: renamed from: q */
    public static final Path m2487q(@InterfaceC7396q Path minus, @InterfaceC7396q Path p2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(p2, "p");
        Path path = new Path(minus);
        path.op(p2, Path.Op.DIFFERENCE);
        return path;
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Iterable<ki> toq(@InterfaceC7396q Path flatten, float f2) {
        d2ok.cdj(flatten, "$this$flatten");
        Collection<ki> qVar = t8r.toq(flatten, f2);
        d2ok.m23085y(qVar, "PathUtils.flatten(this, error)");
        return qVar;
    }

    public static /* synthetic */ Iterable zy(Path path, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.5f;
        }
        return toq(path, f2);
    }
}
