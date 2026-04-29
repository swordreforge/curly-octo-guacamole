package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7627q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a0\u0010\u0010\u001a\u00020\b*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\fH\u0086\b\u001aE\u0010\u0012\u001a\u00020\b*\u00020\u000026\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0011H\u0086\b\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0086\u0002\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "q", "item", "", "k", "Lkotlin/was;", "p", "f7l8", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlin/Function1;", "Lkotlin/c;", "name", "action", "toq", "Lkotlin/Function2;", "zy", "", C7704k.y.toq.f44691k, C7704k.y.toq.f95579toq, "(Landroid/view/Menu;)I", "size", "Lkotlin/sequences/qrj;", "n", "(Landroid/view/Menu;)Lkotlin/sequences/qrj;", "children", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class o1t {

    /* JADX INFO: renamed from: androidx.core.view.o1t$k */
    /* JADX INFO: compiled from: Menu.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/o1t$k", "Lkotlin/sequences/qrj;", "Landroid/view/MenuItem;", "", "iterator", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0709k implements kotlin.sequences.qrj<MenuItem> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Menu f4079k;

        C0709k(Menu menu) {
            this.f4079k = menu;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<MenuItem> iterator() {
            return o1t.m3394s(this.f4079k);
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"androidx/core/view/o1t$toq", "", "Landroid/view/MenuItem;", "", "hasNext", "k", "Lkotlin/was;", "remove", "", com.market.sdk.reflect.toq.f28131g, "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq implements Iterator<MenuItem>, InterfaceC7627q {

        /* JADX INFO: renamed from: k */
        private int f4080k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Menu f4081q;

        toq(Menu menu) {
            this.f4081q = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4080k < this.f4081q.size();
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f4081q;
            int i2 = this.f4080k;
            this.f4080k = i2 + 1;
            MenuItem item = menu.getItem(i2);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.f4081q;
            int i2 = this.f4080k - 1;
            this.f4080k = i2;
            menu.removeItem(i2);
        }
    }

    public static final boolean f7l8(@InterfaceC7396q Menu isEmpty) {
        kotlin.jvm.internal.d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.size() == 0;
    }

    /* JADX INFO: renamed from: g */
    public static final int m3389g(@InterfaceC7396q Menu size) {
        kotlin.jvm.internal.d2ok.cdj(size, "$this$size");
        return size.size();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m3390k(@InterfaceC7396q Menu contains, @InterfaceC7396q MenuItem item) {
        kotlin.jvm.internal.d2ok.cdj(contains, "$this$contains");
        kotlin.jvm.internal.d2ok.cdj(item, "item");
        int size = contains.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (kotlin.jvm.internal.d2ok.f7l8(contains.getItem(i2), item)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final kotlin.sequences.qrj<MenuItem> m3391n(@InterfaceC7396q Menu children) {
        kotlin.jvm.internal.d2ok.cdj(children, "$this$children");
        return new C0709k(children);
    }

    /* JADX INFO: renamed from: p */
    public static final void m3392p(@InterfaceC7396q Menu minusAssign, @InterfaceC7396q MenuItem item) {
        kotlin.jvm.internal.d2ok.cdj(minusAssign, "$this$minusAssign");
        kotlin.jvm.internal.d2ok.cdj(item, "item");
        minusAssign.removeItem(item.getItemId());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final MenuItem m3393q(@InterfaceC7396q Menu get, int i2) {
        kotlin.jvm.internal.d2ok.cdj(get, "$this$get");
        MenuItem item = get.getItem(i2);
        kotlin.jvm.internal.d2ok.m23085y(item, "getItem(index)");
        return item;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final Iterator<MenuItem> m3394s(@InterfaceC7396q Menu iterator) {
        kotlin.jvm.internal.d2ok.cdj(iterator, "$this$iterator");
        return new toq(iterator);
    }

    public static final void toq(@InterfaceC7396q Menu forEach, @InterfaceC7396q cyoe.x2<? super MenuItem, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(forEach, "$this$forEach");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        int size = forEach.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = forEach.getItem(i2);
            kotlin.jvm.internal.d2ok.m23085y(item, "getItem(index)");
            action.invoke(item);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m3395y(@InterfaceC7396q Menu isNotEmpty) {
        kotlin.jvm.internal.d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.size() != 0;
    }

    public static final void zy(@InterfaceC7396q Menu forEachIndexed, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super MenuItem, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(forEachIndexed, "$this$forEachIndexed");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        int size = forEachIndexed.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer numValueOf = Integer.valueOf(i2);
            MenuItem item = forEachIndexed.getItem(i2);
            kotlin.jvm.internal.d2ok.m23085y(item, "getItem(index)");
            action.invoke(numValueOf, item);
        }
    }
}
