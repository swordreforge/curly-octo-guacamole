package androidx.core.util;

import android.util.SparseBooleanArray;
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

/* JADX INFO: renamed from: androidx.core.util.i */
/* JADX INFO: compiled from: SparseBooleanArray.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0086\b\u001a#\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0086\b\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aE\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\"\u0016\u0010\u001f\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroid/util/SparseBooleanArray;", "", InterfaceC1925p.qn, "", "k", "value", "Lkotlin/was;", "n7h", C2690k.k.f61039ld6, "ld6", "toq", "zy", "defaultValue", "n", "Lkotlin/Function0;", C7704k.y.toq.f95579toq, AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "qrj", "x2", "Lkotlin/Function2;", "Lkotlin/c;", "name", "action", "q", "Lkotlin/collections/n5r1;", "p", "Lkotlin/collections/ki;", "kja0", "f7l8", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0636i {

    /* JADX INFO: renamed from: androidx.core.util.i$k */
    /* JADX INFO: compiled from: SparseBooleanArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/util/i$k", "Lkotlin/collections/n5r1;", "", "hasNext", "", "nextInt", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class k extends n5r1 {

        /* JADX INFO: renamed from: k */
        private int f3883k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseBooleanArray f3884q;

        k(SparseBooleanArray sparseBooleanArray) {
            this.f3884q = sparseBooleanArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3883k < this.f3884q.size();
        }

        /* JADX INFO: renamed from: k */
        public final int m2959k() {
            return this.f3883k;
        }

        @Override // kotlin.collections.n5r1
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f3884q;
            int i2 = this.f3883k;
            this.f3883k = i2 + 1;
            return sparseBooleanArray.keyAt(i2);
        }

        public final void toq(int i2) {
            this.f3883k = i2;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.i$toq */
    /* JADX INFO: compiled from: SparseBooleanArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/core/util/i$toq", "Lkotlin/collections/ki;", "", "hasNext", "toq", "", "k", com.market.sdk.reflect.toq.f28131g, "zy", "()I", C7704k.y.toq.f95579toq, "(I)V", "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq extends kotlin.collections.ki {

        /* JADX INFO: renamed from: k */
        private int f3885k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ SparseBooleanArray f3886q;

        toq(SparseBooleanArray sparseBooleanArray) {
            this.f3886q = sparseBooleanArray;
        }

        /* JADX INFO: renamed from: g */
        public final void m2960g(int i2) {
            this.f3885k = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3885k < this.f3886q.size();
        }

        @Override // kotlin.collections.ki
        public boolean toq() {
            SparseBooleanArray sparseBooleanArray = this.f3886q;
            int i2 = this.f3885k;
            this.f3885k = i2 + 1;
            return sparseBooleanArray.valueAt(i2);
        }

        public final int zy() {
            return this.f3885k;
        }
    }

    public static final int f7l8(@InterfaceC7396q SparseBooleanArray size) {
        d2ok.cdj(size, "$this$size");
        return size.size();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m2952g(@InterfaceC7396q SparseBooleanArray getOrElse, int i2, @InterfaceC7396q InterfaceC5981k<Boolean> defaultValue) {
        d2ok.cdj(getOrElse, "$this$getOrElse");
        d2ok.cdj(defaultValue, "defaultValue");
        int iIndexOfKey = getOrElse.indexOfKey(i2);
        return iIndexOfKey != -1 ? getOrElse.valueAt(iIndexOfKey) : defaultValue.invoke().booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m2953k(@InterfaceC7396q SparseBooleanArray contains, int i2) {
        d2ok.cdj(contains, "$this$contains");
        return contains.indexOfKey(i2) >= 0;
    }

    @InterfaceC7396q
    public static final kotlin.collections.ki kja0(@InterfaceC7396q SparseBooleanArray valueIterator) {
        d2ok.cdj(valueIterator, "$this$valueIterator");
        return new toq(valueIterator);
    }

    @InterfaceC7396q
    public static final SparseBooleanArray ld6(@InterfaceC7396q SparseBooleanArray plus, @InterfaceC7396q SparseBooleanArray other) {
        d2ok.cdj(plus, "$this$plus");
        d2ok.cdj(other, "other");
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(plus.size() + other.size());
        x2(sparseBooleanArray, plus);
        x2(sparseBooleanArray, other);
        return sparseBooleanArray;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m2954n(@InterfaceC7396q SparseBooleanArray getOrDefault, int i2, boolean z2) {
        d2ok.cdj(getOrDefault, "$this$getOrDefault");
        return getOrDefault.get(i2, z2);
    }

    public static final void n7h(@InterfaceC7396q SparseBooleanArray set, int i2, boolean z2) {
        d2ok.cdj(set, "$this$set");
        set.put(i2, z2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final n5r1 m2955p(@InterfaceC7396q SparseBooleanArray keyIterator) {
        d2ok.cdj(keyIterator, "$this$keyIterator");
        return new k(keyIterator);
    }

    /* JADX INFO: renamed from: q */
    public static final void m2956q(@InterfaceC7396q SparseBooleanArray forEach, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Boolean, was> action) {
        d2ok.cdj(forEach, "$this$forEach");
        d2ok.cdj(action, "action");
        int size = forEach.size();
        for (int i2 = 0; i2 < size; i2++) {
            action.invoke(Integer.valueOf(forEach.keyAt(i2)), Boolean.valueOf(forEach.valueAt(i2)));
        }
    }

    public static final boolean qrj(@InterfaceC7396q SparseBooleanArray remove, int i2, boolean z2) {
        d2ok.cdj(remove, "$this$remove");
        int iIndexOfKey = remove.indexOfKey(i2);
        if (iIndexOfKey == -1 || z2 != remove.valueAt(iIndexOfKey)) {
            return false;
        }
        remove.delete(i2);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m2957s(@InterfaceC7396q SparseBooleanArray isNotEmpty) {
        d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.size() != 0;
    }

    public static final boolean toq(@InterfaceC7396q SparseBooleanArray containsKey, int i2) {
        d2ok.cdj(containsKey, "$this$containsKey");
        return containsKey.indexOfKey(i2) >= 0;
    }

    public static final void x2(@InterfaceC7396q SparseBooleanArray putAll, @InterfaceC7396q SparseBooleanArray other) {
        d2ok.cdj(putAll, "$this$putAll");
        d2ok.cdj(other, "other");
        int size = other.size();
        for (int i2 = 0; i2 < size; i2++) {
            putAll.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m2958y(@InterfaceC7396q SparseBooleanArray isEmpty) {
        d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.size() == 0;
    }

    public static final boolean zy(@InterfaceC7396q SparseBooleanArray containsValue, boolean z2) {
        d2ok.cdj(containsValue, "$this$containsValue");
        return containsValue.indexOfValue(z2) != -1;
    }
}
