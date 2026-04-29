package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u0018\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010 \u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\"\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010$\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010%\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010&\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010(\u001a\u00020'*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010)\u001a\u00020'*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0086\n\u001a\r\u0010*\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010+\u001a\u00020\u0000*\u00020\u0006H\u0086\b\u001a\r\u0010,\u001a\u00020\u0016*\u00020\u0000H\u0086\b\u001a\r\u0010-\u001a\u00020\u0016*\u00020\u0006H\u0086\b\u001a\u0015\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0086\b¨\u00061"}, d2 = {"Landroid/graphics/Rect;", "", "q", C7704k.y.toq.f95579toq, AnimatedProperty.PROPERTY_NAME_Y, "p", "Landroid/graphics/RectF;", "", "zy", "n", "f7l8", C7704k.y.toq.f44691k, "r", "ni7", "o1t", "xy", "fn3e", "fu4", "Landroid/graphics/Point;", "zurt", "Landroid/graphics/PointF;", "z", "Landroid/graphics/Region;", "cdj", "ki", "qrj", "kja0", "n7h", AnimatedProperty.PROPERTY_NAME_H, "factor", "wvg", "mcp", "t", "t8r", "i", "k", "toq", "d3", "oc", "", "ld6", "x2", "a9", "jk", "fti", "jp0y", "Landroid/graphics/Matrix;", "m", "gvn7", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ni7 {
    @InterfaceC7396q
    public static final RectF a9(@InterfaceC7396q Rect toRectF) {
        d2ok.cdj(toRectF, "$this$toRectF");
        return new RectF(toRectF);
    }

    @InterfaceC7396q
    public static final Region cdj(@InterfaceC7396q Rect minus, @InterfaceC7396q Rect r2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(r2, "r");
        Region region = new Region(minus);
        region.op(r2, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC7396q
    public static final Region d3(@InterfaceC7396q Rect xor, @InterfaceC7396q Rect r2) {
        d2ok.cdj(xor, "$this$xor");
        d2ok.cdj(r2, "r");
        Region region = new Region(xor);
        region.op(r2, Region.Op.XOR);
        return region;
    }

    public static final float f7l8(@InterfaceC7396q RectF component3) {
        d2ok.cdj(component3, "$this$component3");
        return component3.right;
    }

    @InterfaceC7396q
    public static final Rect fn3e(@InterfaceC7396q Rect plus, int i2) {
        d2ok.cdj(plus, "$this$plus");
        Rect rect = new Rect(plus);
        rect.offset(i2, i2);
        return rect;
    }

    @InterfaceC7396q
    public static final Region fti(@InterfaceC7396q Rect toRegion) {
        d2ok.cdj(toRegion, "$this$toRegion");
        return new Region(toRegion);
    }

    @InterfaceC7396q
    public static final RectF fu4(@InterfaceC7396q RectF plus, float f2) {
        d2ok.cdj(plus, "$this$plus");
        RectF rectF = new RectF(plus);
        rectF.offset(f2, f2);
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public static final int m2515g(@InterfaceC7396q Rect component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.top;
    }

    @InterfaceC7396q
    public static final RectF gvn7(@InterfaceC7396q RectF transform, @InterfaceC7396q Matrix m2) {
        d2ok.cdj(transform, "$this$transform");
        d2ok.cdj(m2, "m");
        m2.mapRect(transform);
        return transform;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final RectF m2516h(@InterfaceC7396q RectF minus, @InterfaceC7396q PointF xy) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(xy, "xy");
        RectF rectF = new RectF(minus);
        rectF.offset(-xy.x, -xy.y);
        return rectF;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: i */
    public static final RectF m2517i(@InterfaceC7396q RectF or, @InterfaceC7396q RectF r2) {
        d2ok.cdj(or, "$this$or");
        d2ok.cdj(r2, "r");
        RectF rectF = new RectF(or);
        rectF.union(r2);
        return rectF;
    }

    @InterfaceC7396q
    public static final Rect jk(@InterfaceC7396q RectF toRect) {
        d2ok.cdj(toRect, "$this$toRect");
        Rect rect = new Rect();
        toRect.roundOut(rect);
        return rect;
    }

    @InterfaceC7396q
    public static final Region jp0y(@InterfaceC7396q RectF toRegion) {
        d2ok.cdj(toRegion, "$this$toRegion");
        Rect rect = new Rect();
        toRegion.roundOut(rect);
        return new Region(rect);
    }

    @InterfaceC7396q
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: k */
    public static final Rect m2518k(@InterfaceC7396q Rect and, @InterfaceC7396q Rect r2) {
        d2ok.cdj(and, "$this$and");
        d2ok.cdj(r2, "r");
        Rect rect = new Rect(and);
        rect.intersect(r2);
        return rect;
    }

    @InterfaceC7396q
    public static final Region ki(@InterfaceC7396q RectF minus, @InterfaceC7396q RectF r2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(r2, "r");
        Rect rect = new Rect();
        minus.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC7396q
    public static final RectF kja0(@InterfaceC7396q RectF minus, float f2) {
        d2ok.cdj(minus, "$this$minus");
        RectF rectF = new RectF(minus);
        float f3 = -f2;
        rectF.offset(f3, f3);
        return rectF;
    }

    public static final boolean ld6(@InterfaceC7396q Rect contains, @InterfaceC7396q Point p2) {
        d2ok.cdj(contains, "$this$contains");
        d2ok.cdj(p2, "p");
        return contains.contains(p2.x, p2.y);
    }

    @InterfaceC7396q
    public static final RectF mcp(@InterfaceC7396q RectF times, int i2) {
        d2ok.cdj(times, "$this$times");
        float f2 = i2;
        RectF rectF = new RectF(times);
        rectF.top *= f2;
        rectF.left *= f2;
        rectF.right *= f2;
        rectF.bottom *= f2;
        return rectF;
    }

    /* JADX INFO: renamed from: n */
    public static final float m2519n(@InterfaceC7396q RectF component2) {
        d2ok.cdj(component2, "$this$component2");
        return component2.top;
    }

    @InterfaceC7396q
    public static final Rect n7h(@InterfaceC7396q Rect minus, @InterfaceC7396q Point xy) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(xy, "xy");
        Rect rect = new Rect(minus);
        rect.offset(-xy.x, -xy.y);
        return rect;
    }

    @InterfaceC7396q
    public static final Rect ni7(@InterfaceC7396q Rect plus, @InterfaceC7396q Rect r2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(r2, "r");
        Rect rect = new Rect(plus);
        rect.union(r2);
        return rect;
    }

    @InterfaceC7396q
    public static final RectF o1t(@InterfaceC7396q RectF plus, @InterfaceC7396q RectF r2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(r2, "r");
        RectF rectF = new RectF(plus);
        rectF.union(r2);
        return rectF;
    }

    @InterfaceC7396q
    public static final Region oc(@InterfaceC7396q RectF xor, @InterfaceC7396q RectF r2) {
        d2ok.cdj(xor, "$this$xor");
        d2ok.cdj(r2, "r");
        Rect rect = new Rect();
        xor.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    /* JADX INFO: renamed from: p */
    public static final int m2520p(@InterfaceC7396q Rect component4) {
        d2ok.cdj(component4, "$this$component4");
        return component4.bottom;
    }

    /* JADX INFO: renamed from: q */
    public static final int m2521q(@InterfaceC7396q Rect component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.left;
    }

    @InterfaceC7396q
    public static final Rect qrj(@InterfaceC7396q Rect minus, int i2) {
        d2ok.cdj(minus, "$this$minus");
        Rect rect = new Rect(minus);
        int i3 = -i2;
        rect.offset(i3, i3);
        return rect;
    }

    /* JADX INFO: renamed from: s */
    public static final float m2522s(@InterfaceC7396q RectF component4) {
        d2ok.cdj(component4, "$this$component4");
        return component4.bottom;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public static final RectF m2523t(@InterfaceC7396q RectF times, float f2) {
        d2ok.cdj(times, "$this$times");
        RectF rectF = new RectF(times);
        rectF.top *= f2;
        rectF.left *= f2;
        rectF.right *= f2;
        rectF.bottom *= f2;
        return rectF;
    }

    @InterfaceC7396q
    public static final Rect t8r(@InterfaceC7396q Rect or, @InterfaceC7396q Rect r2) {
        d2ok.cdj(or, "$this$or");
        d2ok.cdj(r2, "r");
        Rect rect = new Rect(or);
        rect.union(r2);
        return rect;
    }

    @InterfaceC7396q
    @SuppressLint({"CheckResult"})
    public static final RectF toq(@InterfaceC7396q RectF and, @InterfaceC7396q RectF r2) {
        d2ok.cdj(and, "$this$and");
        d2ok.cdj(r2, "r");
        RectF rectF = new RectF(and);
        rectF.intersect(r2);
        return rectF;
    }

    @InterfaceC7396q
    public static final Rect wvg(@InterfaceC7396q Rect times, int i2) {
        d2ok.cdj(times, "$this$times");
        Rect rect = new Rect(times);
        rect.top *= i2;
        rect.left *= i2;
        rect.right *= i2;
        rect.bottom *= i2;
        return rect;
    }

    public static final boolean x2(@InterfaceC7396q RectF contains, @InterfaceC7396q PointF p2) {
        d2ok.cdj(contains, "$this$contains");
        d2ok.cdj(p2, "p");
        return contains.contains(p2.x, p2.y);
    }

    /* JADX INFO: renamed from: y */
    public static final int m2524y(@InterfaceC7396q Rect component3) {
        d2ok.cdj(component3, "$this$component3");
        return component3.right;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final RectF m2525z(@InterfaceC7396q RectF plus, @InterfaceC7396q PointF xy) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(xy, "xy");
        RectF rectF = new RectF(plus);
        rectF.offset(xy.x, xy.y);
        return rectF;
    }

    @InterfaceC7396q
    public static final Rect zurt(@InterfaceC7396q Rect plus, @InterfaceC7396q Point xy) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(xy, "xy");
        Rect rect = new Rect(plus);
        rect.offset(xy.x, xy.y);
        return rect;
    }

    public static final float zy(@InterfaceC7396q RectF component1) {
        d2ok.cdj(component1, "$this$component1");
        return component1.left;
    }
}
