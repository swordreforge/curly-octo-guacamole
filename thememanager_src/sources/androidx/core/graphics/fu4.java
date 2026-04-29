package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Iterator;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;
import v5yj.C7704k;

/* JADX INFO: compiled from: Region.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a0\u0010\u0018\u001a\u00020\u0016*\u00020\u00002!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0086\b\u001a\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019*\u00020\u0000H\u0086\u0002¨\u0006\u001b"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "zy", "Landroid/graphics/Rect;", "r", "ld6", "x2", C7704k.y.toq.f95579toq, "f7l8", "qrj", AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "k", "toq", "n7h", "kja0", "Lkotlin/Function1;", "Lkotlin/c;", "name", "rect", "Lkotlin/was;", "action", "q", "", "n", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class fu4 {

    /* JADX INFO: renamed from: androidx.core.graphics.fu4$k */
    /* JADX INFO: compiled from: Region.kt */
    @d3(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/graphics/fu4$k", "", "Landroid/graphics/Rect;", "", "hasNext", "k", "Landroid/graphics/RegionIterator;", "Landroid/graphics/RegionIterator;", "iterator", "q", "Landroid/graphics/Rect;", "rect", "n", com.market.sdk.reflect.toq.f68929toq, "hasMore", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0531k implements Iterator<Rect>, InterfaceC7625k {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Region f3565g;

        /* JADX INFO: renamed from: k */
        private final RegionIterator f3566k;

        /* JADX INFO: renamed from: n */
        private boolean f3567n;

        /* JADX INFO: renamed from: q */
        private final Rect f3568q;

        C0531k(Region region) {
            this.f3565g = region;
            RegionIterator regionIterator = new RegionIterator(region);
            this.f3566k = regionIterator;
            Rect rect = new Rect();
            this.f3568q = rect;
            this.f3567n = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3567n;
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (!this.f3567n) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.f3568q);
            this.f3567n = this.f3566k.next(this.f3568q);
            return rect;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @InterfaceC7396q
    public static final Region f7l8(@InterfaceC7396q Region minus, @InterfaceC7396q Region r2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(r2, "r");
        Region region = new Region(minus);
        region.op(r2, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Region m2476g(@InterfaceC7396q Region minus, @InterfaceC7396q Rect r2) {
        d2ok.cdj(minus, "$this$minus");
        d2ok.cdj(r2, "r");
        Region region = new Region(minus);
        region.op(r2, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Region m2477k(@InterfaceC7396q Region and, @InterfaceC7396q Rect r2) {
        d2ok.cdj(and, "$this$and");
        d2ok.cdj(r2, "r");
        Region region = new Region(and);
        region.op(r2, Region.Op.INTERSECT);
        return region;
    }

    @InterfaceC7396q
    public static final Region kja0(@InterfaceC7396q Region xor, @InterfaceC7396q Region r2) {
        d2ok.cdj(xor, "$this$xor");
        d2ok.cdj(r2, "r");
        Region region = new Region(xor);
        region.op(r2, Region.Op.XOR);
        return region;
    }

    @InterfaceC7396q
    public static final Region ld6(@InterfaceC7396q Region plus, @InterfaceC7396q Rect r2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(r2, "r");
        Region region = new Region(plus);
        region.union(r2);
        return region;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final Iterator<Rect> m2478n(@InterfaceC7396q Region iterator) {
        d2ok.cdj(iterator, "$this$iterator");
        return new C0531k(iterator);
    }

    @InterfaceC7396q
    public static final Region n7h(@InterfaceC7396q Region xor, @InterfaceC7396q Rect r2) {
        d2ok.cdj(xor, "$this$xor");
        d2ok.cdj(r2, "r");
        Region region = new Region(xor);
        region.op(r2, Region.Op.XOR);
        return region;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final Region m2479p(@InterfaceC7396q Region or, @InterfaceC7396q Region r2) {
        d2ok.cdj(or, "$this$or");
        d2ok.cdj(r2, "r");
        Region region = new Region(or);
        region.op(r2, Region.Op.UNION);
        return region;
    }

    /* JADX INFO: renamed from: q */
    public static final void m2480q(@InterfaceC7396q Region forEach, @InterfaceC7396q cyoe.x2<? super Rect, was> action) {
        d2ok.cdj(forEach, "$this$forEach");
        d2ok.cdj(action, "action");
        RegionIterator regionIterator = new RegionIterator(forEach);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                action.invoke(rect);
            }
        }
    }

    @InterfaceC7396q
    public static final Region qrj(@InterfaceC7396q Region unaryMinus) {
        d2ok.cdj(unaryMinus, "$this$unaryMinus");
        Region region = new Region(unaryMinus.getBounds());
        region.op(unaryMinus, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final Region m2481s(@InterfaceC7396q Region or, @InterfaceC7396q Rect r2) {
        d2ok.cdj(or, "$this$or");
        d2ok.cdj(r2, "r");
        Region region = new Region(or);
        region.union(r2);
        return region;
    }

    @InterfaceC7396q
    public static final Region toq(@InterfaceC7396q Region and, @InterfaceC7396q Region r2) {
        d2ok.cdj(and, "$this$and");
        d2ok.cdj(r2, "r");
        Region region = new Region(and);
        region.op(r2, Region.Op.INTERSECT);
        return region;
    }

    @InterfaceC7396q
    public static final Region x2(@InterfaceC7396q Region plus, @InterfaceC7396q Region r2) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(r2, "r");
        Region region = new Region(plus);
        region.op(r2, Region.Op.UNION);
        return region;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final Region m2482y(@InterfaceC7396q Region not) {
        d2ok.cdj(not, "$this$not");
        Region region = new Region(not.getBounds());
        region.op(not, Region.Op.DIFFERENCE);
        return region;
    }

    public static final boolean zy(@InterfaceC7396q Region contains, @InterfaceC7396q Point p2) {
        d2ok.cdj(contains, "$this$contains");
        d2ok.cdj(p2, "p");
        return contains.contains(p2.x, p2.y);
    }
}
