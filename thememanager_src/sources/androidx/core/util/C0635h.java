package androidx.core.util;

import android.util.Range;
import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.ranges.f7l8;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.util.h */
/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¨\u0006\u000f"}, d2 = {"", C0846k.zaso, "that", "Landroid/util/Range;", "q", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "zy", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", C2690k.k.f61039ld6, "toq", "k", "Lkotlin/ranges/f7l8;", "n", C7704k.y.toq.f95579toq, "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0635h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.h$k */
    /* JADX INFO: compiled from: Range.kt */
    @d3(bv = {}, d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/core/util/h$k", "Lkotlin/ranges/f7l8;", "kotlin.jvm.PlatformType", "zy", "()Ljava/lang/Comparable;", "endInclusive", "k", "start", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class k<T> implements kotlin.ranges.f7l8<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Range f3882k;

        k(Range<T> range) {
            this.f3882k = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // kotlin.ranges.f7l8
        public boolean contains(@InterfaceC7396q Comparable value) {
            d2ok.cdj(value, "value");
            return f7l8.C6340k.m23290k(this, value);
        }

        @Override // kotlin.ranges.f7l8
        public boolean isEmpty() {
            return f7l8.C6340k.toq(this);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.f7l8
        /* JADX INFO: renamed from: k */
        public Comparable mo2951k() {
            return this.f3882k.getLower();
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.f7l8
        public Comparable zy() {
            return this.f3882k.getUpper();
        }
    }

    @InterfaceC7396q
    @hyr(21)
    /* JADX INFO: renamed from: g */
    public static final <T extends Comparable<? super T>> Range<T> m2947g(@InterfaceC7396q kotlin.ranges.f7l8<T> toRange) {
        d2ok.cdj(toRange, "$this$toRange");
        return new Range<>(toRange.mo2951k(), toRange.zy());
    }

    @InterfaceC7396q
    @hyr(21)
    /* JADX INFO: renamed from: k */
    public static final <T extends Comparable<? super T>> Range<T> m2948k(@InterfaceC7396q Range<T> and, @InterfaceC7396q Range<T> other) {
        d2ok.cdj(and, "$this$and");
        d2ok.cdj(other, "other");
        Range<T> rangeIntersect = and.intersect(other);
        d2ok.m23085y(rangeIntersect, "intersect(other)");
        return rangeIntersect;
    }

    @InterfaceC7396q
    @hyr(21)
    /* JADX INFO: renamed from: n */
    public static final <T extends Comparable<? super T>> kotlin.ranges.f7l8<T> m2949n(@InterfaceC7396q Range<T> toClosedRange) {
        d2ok.cdj(toClosedRange, "$this$toClosedRange");
        return new k(toClosedRange);
    }

    @InterfaceC7396q
    @hyr(21)
    /* JADX INFO: renamed from: q */
    public static final <T extends Comparable<? super T>> Range<T> m2950q(@InterfaceC7396q T rangeTo, @InterfaceC7396q T that) {
        d2ok.cdj(rangeTo, "$this$rangeTo");
        d2ok.cdj(that, "that");
        return new Range<>(rangeTo, that);
    }

    @InterfaceC7396q
    @hyr(21)
    public static final <T extends Comparable<? super T>> Range<T> toq(@InterfaceC7396q Range<T> plus, @InterfaceC7396q Range<T> other) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(other, "other");
        Range<T> rangeExtend = plus.extend(other);
        d2ok.m23085y(rangeExtend, "extend(other)");
        return rangeExtend;
    }

    @InterfaceC7396q
    @hyr(21)
    public static final <T extends Comparable<? super T>> Range<T> zy(@InterfaceC7396q Range<T> plus, @InterfaceC7396q T value) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(value, "value");
        Range<T> rangeExtend = plus.extend(value);
        d2ok.m23085y(rangeExtend, "extend(value)");
        return rangeExtend;
    }
}
