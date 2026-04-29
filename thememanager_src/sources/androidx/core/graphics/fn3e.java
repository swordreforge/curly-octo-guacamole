package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\u0012\u001a\u00020\u0004*\u00020\u0004H\u0086\n\u001a\r\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\u0086\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0004H\u0086\b¨\u0006\u0015"}, d2 = {"Landroid/graphics/Point;", "", "toq", "q", "Landroid/graphics/PointF;", "", "k", "zy", "p", "x2", "xy", C7704k.y.toq.f44691k, "ld6", C7704k.y.toq.f95579toq, AnimatedProperty.PROPERTY_NAME_Y, "n", "f7l8", "kja0", AnimatedProperty.PROPERTY_NAME_H, "n7h", "qrj", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class fn3e {
    @InterfaceC7396q
    public static final PointF f7l8(@InterfaceC7396q PointF minus, float f2) {
        d2ok.cdj(minus, "$this$minus");
        PointF pointF = new PointF(minus.x, minus.y);
        float f3 = -f2;
        pointF.offset(f3, f3);
        return pointF;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Point m2461g(@InterfaceC7396q Point minus, @InterfaceC7396q Point p2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(p2, "p");
        Point point = new Point(minus.x, minus.y);
        point.offset(-p2.x, -p2.y);
        return point;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final PointF m2462h(@InterfaceC7396q PointF unaryMinus) {
        d2ok.cdj(unaryMinus, "$this$unaryMinus");
        return new PointF(-unaryMinus.x, -unaryMinus.y);
    }

    /* JADX INFO: renamed from: k */
    public static final float m2463k(@InterfaceC7396q PointF component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.x;
    }

    @InterfaceC7396q
    public static final Point kja0(@InterfaceC7396q Point unaryMinus) {
        d2ok.cdj(unaryMinus, "$this$unaryMinus");
        return new Point(-unaryMinus.x, -unaryMinus.y);
    }

    @InterfaceC7396q
    public static final PointF ld6(@InterfaceC7396q PointF plus, float f2) {
        d2ok.cdj(plus, "$this$plus");
        PointF pointF = new PointF(plus.x, plus.y);
        pointF.offset(f2, f2);
        return pointF;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final Point m2464n(@InterfaceC7396q Point minus, int i2) {
        d2ok.cdj(minus, "$this$minus");
        Point point = new Point(minus.x, minus.y);
        int i3 = -i2;
        point.offset(i3, i3);
        return point;
    }

    @InterfaceC7396q
    public static final PointF n7h(@InterfaceC7396q Point toPointF) {
        d2ok.cdj(toPointF, "$this$toPointF");
        return new PointF(toPointF);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final Point m2465p(@InterfaceC7396q Point plus, @InterfaceC7396q Point p2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(p2, "p");
        Point point = new Point(plus.x, plus.y);
        point.offset(p2.x, p2.y);
        return point;
    }

    /* JADX INFO: renamed from: q */
    public static final int m2466q(@InterfaceC7396q Point component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.y;
    }

    @InterfaceC7396q
    public static final Point qrj(@InterfaceC7396q PointF toPoint) {
        d2ok.cdj(toPoint, "$this$toPoint");
        return new Point((int) toPoint.x, (int) toPoint.y);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final Point m2467s(@InterfaceC7396q Point plus, int i2) {
        d2ok.cdj(plus, "$this$plus");
        Point point = new Point(plus.x, plus.y);
        point.offset(i2, i2);
        return point;
    }

    public static final int toq(@InterfaceC7396q Point component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.x;
    }

    @InterfaceC7396q
    public static final PointF x2(@InterfaceC7396q PointF plus, @InterfaceC7396q PointF p2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(p2, "p");
        PointF pointF = new PointF(plus.x, plus.y);
        pointF.offset(p2.x, p2.y);
        return pointF;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final PointF m2468y(@InterfaceC7396q PointF minus, @InterfaceC7396q PointF p2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(p2, "p");
        PointF pointF = new PointF(minus.x, minus.y);
        pointF.offset(-p2.x, -p2.y);
        return pointF;
    }

    public static final float zy(@InterfaceC7396q PointF component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.y;
    }
}
