package androidx.core.util;

import android.util.SparseLongArray;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import kotlin.collections.hyr;
import kotlin.collections.n5r1;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SparseLongArray.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0087\b\u001a#\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u001aE\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0087\b\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0007\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroid/util/SparseLongArray;", "", InterfaceC1925p.qn, "", "k", "", "value", "Lkotlin/was;", "n7h", C2690k.k.f61039ld6, "ld6", "toq", "zy", "defaultValue", "n", "Lkotlin/Function0;", C7704k.y.toq.f95579toq, AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "qrj", "x2", "Lkotlin/Function2;", "Lkotlin/c;", "name", "action", "q", "Lkotlin/collections/n5r1;", "p", "Lkotlin/collections/hyr;", "kja0", "f7l8", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class zurt {

    /* JADX INFO: renamed from: androidx.core.util.zurt$k */
    /* JADX INFO: compiled from: SparseLongArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/util/zurt$k", "Lkotlin/collections/n5r1;", "", "hasNext", "", "nextInt", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0645k extends n5r1 {

        /* JADX INFO: renamed from: k */
        private int f3908k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseLongArray f3909q;

        C0645k(SparseLongArray sparseLongArray) {
            this.f3909q = sparseLongArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3908k < this.f3909q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m3010k() {
            return this.f3908k;
        }

        @Override // kotlin.collections.n5r1
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f3909q;
            int i2 = this.f3908k;
            this.f3908k = i2 + 1;
            return sparseLongArray.keyAt(i2);
        }

        public final void toq(int i2) {
            this.f3908k = i2;
        }
    }

    /* JADX INFO: compiled from: SparseLongArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/zurt$toq", "Lkotlin/collections/hyr;", "", "hasNext", "", "nextLong", "", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq extends hyr {

        /* JADX INFO: renamed from: k */
        private int f3910k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseLongArray f3911q;

        toq(SparseLongArray sparseLongArray) {
            this.f3911q = sparseLongArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3910k < this.f3911q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m3011k() {
            return this.f3910k;
        }

        @Override // kotlin.collections.hyr
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f3911q;
            int i2 = this.f3910k;
            this.f3910k = i2 + 1;
            return sparseLongArray.valueAt(i2);
        }

        public final void toq(int i2) {
            this.f3910k = i2;
        }
    }

    @zy.hyr(18)
    public static final int f7l8(@InterfaceC7396q SparseLongArray size) {
        d2ok.cdj(size, "$this$size");
        return size.size();
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: g */
    public static final long m3003g(@InterfaceC7396q SparseLongArray getOrElse, int i2, @InterfaceC7396q InterfaceC5981k<Long> defaultValue) {
        d2ok.cdj(getOrElse, "$this$getOrElse");
        d2ok.cdj(defaultValue, "defaultValue");
        int iIndexOfKey = getOrElse.indexOfKey(i2);
        return iIndexOfKey != -1 ? getOrElse.valueAt(iIndexOfKey) : defaultValue.invoke().longValue();
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: k */
    public static final boolean m3004k(@InterfaceC7396q SparseLongArray contains, int i2) {
        d2ok.cdj(contains, "$this$contains");
        return contains.indexOfKey(i2) >= 0;
    }

    @InterfaceC7396q
    @zy.hyr(18)
    public static final hyr kja0(@InterfaceC7396q SparseLongArray valueIterator) {
        d2ok.cdj(valueIterator, "$this$valueIterator");
        return new toq(valueIterator);
    }

    @InterfaceC7396q
    @zy.hyr(18)
    public static final SparseLongArray ld6(@InterfaceC7396q SparseLongArray plus, @InterfaceC7396q SparseLongArray other) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(other, "other");
        SparseLongArray sparseLongArray = new SparseLongArray(plus.size() + other.size());
        x2(sparseLongArray, plus);
        x2(sparseLongArray, other);
        return sparseLongArray;
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: n */
    public static final long m3005n(@InterfaceC7396q SparseLongArray getOrDefault, int i2, long j2) {
        d2ok.cdj(getOrDefault, "$this$getOrDefault");
        return getOrDefault.get(i2, j2);
    }

    @zy.hyr(18)
    public static final void n7h(@InterfaceC7396q SparseLongArray set, int i2, long j2) {
        d2ok.cdj(set, "$this$set");
        set.put(i2, j2);
    }

    @InterfaceC7396q
    @zy.hyr(18)
    /* JADX INFO: renamed from: p */
    public static final n5r1 m3006p(@InterfaceC7396q SparseLongArray keyIterator) {
        d2ok.cdj(keyIterator, "$this$keyIterator");
        return new C0645k(keyIterator);
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: q */
    public static final void m3007q(@InterfaceC7396q SparseLongArray forEach, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Long, was> action) {
        d2ok.cdj(forEach, "$this$forEach");
        d2ok.cdj(action, "action");
        int size = forEach.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Integer.valueOf(forEach.keyAt(i2)), Long.valueOf(forEach.valueAt(i2)));
        }
    }

    @zy.hyr(18)
    public static final boolean qrj(@InterfaceC7396q SparseLongArray remove, int i2, long j2) {
        d2ok.cdj(remove, "$this$remove");
        int iIndexOfKey = remove.indexOfKey(i2);
        if (iIndexOfKey == -1 || j2 != remove.valueAt(iIndexOfKey)) {
            return false;
        }
        remove.removeAt(iIndexOfKey);
        return true;
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: s */
    public static final boolean m3008s(@InterfaceC7396q SparseLongArray isNotEmpty) {
        d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.size() != 0;
    }

    @zy.hyr(18)
    public static final boolean toq(@InterfaceC7396q SparseLongArray containsKey, int i2) {
        d2ok.cdj(containsKey, "$this$containsKey");
        return containsKey.indexOfKey(i2) >= 0;
    }

    @zy.hyr(18)
    public static final void x2(@InterfaceC7396q SparseLongArray putAll, @InterfaceC7396q SparseLongArray other) {
        d2ok.cdj(putAll, "$this$putAll");
        d2ok.cdj(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            putAll.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    @zy.hyr(18)
    /* JADX INFO: renamed from: y */
    public static final boolean m3009y(@InterfaceC7396q SparseLongArray isEmpty) {
        d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.size() == 0;
    }

    @zy.hyr(18)
    public static final boolean zy(@InterfaceC7396q SparseLongArray containsValue, long j2) {
        d2ok.cdj(containsValue, "$this$containsValue");
        return containsValue.indexOfValue(j2) != -1;
    }
}
