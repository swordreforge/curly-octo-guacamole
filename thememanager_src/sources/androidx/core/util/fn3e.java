package androidx.core.util;

import android.util.SparseIntArray;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import kotlin.collections.n5r1;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SparseIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0086\b\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aE\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0000\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroid/util/SparseIntArray;", "", InterfaceC1925p.qn, "", "k", "value", "Lkotlin/was;", "n7h", C2690k.k.f61039ld6, "ld6", "toq", "zy", "defaultValue", "n", "Lkotlin/Function0;", C7704k.y.toq.f95579toq, AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "qrj", "x2", "Lkotlin/Function2;", "Lkotlin/c;", "name", "action", "q", "Lkotlin/collections/n5r1;", "p", "kja0", "f7l8", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class fn3e {

    /* JADX INFO: renamed from: androidx.core.util.fn3e$k */
    /* JADX INFO: compiled from: SparseIntArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/util/fn3e$k", "Lkotlin/collections/n5r1;", "", "hasNext", "", "nextInt", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0633k extends n5r1 {

        /* JADX INFO: renamed from: k */
        private int f3872k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseIntArray f3873q;

        C0633k(SparseIntArray sparseIntArray) {
            this.f3873q = sparseIntArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3872k < this.f3873q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2940k() {
            return this.f3872k;
        }

        @Override // kotlin.collections.n5r1
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f3873q;
            int i2 = this.f3872k;
            this.f3872k = i2 + 1;
            return sparseIntArray.keyAt(i2);
        }

        public final void toq(int i2) {
            this.f3872k = i2;
        }
    }

    /* JADX INFO: compiled from: SparseIntArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/util/fn3e$toq", "Lkotlin/collections/n5r1;", "", "hasNext", "", "nextInt", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq extends n5r1 {

        /* JADX INFO: renamed from: k */
        private int f3874k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseIntArray f3875q;

        toq(SparseIntArray sparseIntArray) {
            this.f3875q = sparseIntArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3874k < this.f3875q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2941k() {
            return this.f3874k;
        }

        @Override // kotlin.collections.n5r1
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f3875q;
            int i2 = this.f3874k;
            this.f3874k = i2 + 1;
            return sparseIntArray.valueAt(i2);
        }

        public final void toq(int i2) {
            this.f3874k = i2;
        }
    }

    public static final int f7l8(@InterfaceC7396q SparseIntArray size) {
        d2ok.cdj(size, "$this$size");
        return size.size();
    }

    /* JADX INFO: renamed from: g */
    public static final int m2933g(@InterfaceC7396q SparseIntArray getOrElse, int i2, @InterfaceC7396q InterfaceC5981k<Integer> defaultValue) {
        d2ok.cdj(getOrElse, "$this$getOrElse");
        d2ok.cdj(defaultValue, "defaultValue");
        int iIndexOfKey = getOrElse.indexOfKey(i2);
        return iIndexOfKey != -1 ? getOrElse.valueAt(iIndexOfKey) : defaultValue.invoke().intValue();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m2934k(@InterfaceC7396q SparseIntArray contains, int i2) {
        d2ok.cdj(contains, "$this$contains");
        return contains.indexOfKey(i2) >= 0;
    }

    @InterfaceC7396q
    public static final n5r1 kja0(@InterfaceC7396q SparseIntArray valueIterator) {
        d2ok.cdj(valueIterator, "$this$valueIterator");
        return new toq(valueIterator);
    }

    @InterfaceC7396q
    public static final SparseIntArray ld6(@InterfaceC7396q SparseIntArray plus, @InterfaceC7396q SparseIntArray other) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(other, "other");
        SparseIntArray sparseIntArray = new SparseIntArray(plus.size() + other.size());
        x2(sparseIntArray, plus);
        x2(sparseIntArray, other);
        return sparseIntArray;
    }

    /* JADX INFO: renamed from: n */
    public static final int m2935n(@InterfaceC7396q SparseIntArray getOrDefault, int i2, int i3) {
        d2ok.cdj(getOrDefault, "$this$getOrDefault");
        return getOrDefault.get(i2, i3);
    }

    public static final void n7h(@InterfaceC7396q SparseIntArray set, int i2, int i3) {
        d2ok.cdj(set, "$this$set");
        set.put(i2, i3);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final n5r1 m2936p(@InterfaceC7396q SparseIntArray keyIterator) {
        d2ok.cdj(keyIterator, "$this$keyIterator");
        return new C0633k(keyIterator);
    }

    /* JADX INFO: renamed from: q */
    public static final void m2937q(@InterfaceC7396q SparseIntArray forEach, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Integer, was> action) {
        d2ok.cdj(forEach, "$this$forEach");
        d2ok.cdj(action, "action");
        int size = forEach.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Integer.valueOf(forEach.keyAt(i2)), Integer.valueOf(forEach.valueAt(i2)));
        }
    }

    public static final boolean qrj(@InterfaceC7396q SparseIntArray remove, int i2, int i3) {
        d2ok.cdj(remove, "$this$remove");
        int iIndexOfKey = remove.indexOfKey(i2);
        if (iIndexOfKey == -1 || i3 != remove.valueAt(iIndexOfKey)) {
            return false;
        }
        remove.removeAt(iIndexOfKey);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m2938s(@InterfaceC7396q SparseIntArray isNotEmpty) {
        d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.size() != 0;
    }

    public static final boolean toq(@InterfaceC7396q SparseIntArray containsKey, int i2) {
        d2ok.cdj(containsKey, "$this$containsKey");
        return containsKey.indexOfKey(i2) >= 0;
    }

    public static final void x2(@InterfaceC7396q SparseIntArray putAll, @InterfaceC7396q SparseIntArray other) {
        d2ok.cdj(putAll, "$this$putAll");
        d2ok.cdj(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            putAll.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m2939y(@InterfaceC7396q SparseIntArray isEmpty) {
        d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.size() == 0;
    }

    public static final boolean zy(@InterfaceC7396q SparseIntArray containsValue, int i2) {
        d2ok.cdj(containsValue, "$this$containsValue");
        return containsValue.indexOfValue(i2) != -1;
    }
}
