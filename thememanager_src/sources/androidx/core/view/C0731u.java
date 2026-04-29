package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.C5693g;
import cyoe.InterfaceC5979h;
import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7627q;
import v5yj.C7704k;
import zy.InterfaceC7833l;

/* JADX INFO: renamed from: androidx.core.view.u */
/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a0\u0010\u0011\u001a\u00020\b*\u00020\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\rH\u0086\b\u001aE\u0010\u0013\u001a\u00020\b*\u00020\u000026\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0086\b\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u00020\u0000H\u0086\u0002\u001a\u0017\u0010\u0018\u001a\u00020\b*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0001H\u0086\b\u001a5\u0010\u001d\u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a5\u0010 \u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u001e\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0087\b\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "q", C5693g.ae, "", "k", "Lkotlin/was;", "ld6", "p", "f7l8", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlin/Function1;", "Lkotlin/c;", "name", "action", "toq", "Lkotlin/Function2;", "zy", "", C7704k.y.toq.f44691k, "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "x2", "left", "top", "right", com.android.thememanager.util.hb.f61266fu4, "qrj", "start", C3678q.f65807ch, "kja0", C7704k.y.toq.f95579toq, "(Landroid/view/ViewGroup;)I", "Lkotlin/sequences/qrj;", "n", "(Landroid/view/ViewGroup;)Lkotlin/sequences/qrj;", "children", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0731u {

    /* JADX INFO: renamed from: androidx.core.view.u$k */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/u$k", "Lkotlin/sequences/qrj;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class k implements kotlin.sequences.qrj<View> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f4156k;

        k(ViewGroup viewGroup) {
            this.f4156k = viewGroup;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<View> iterator() {
            return C0731u.m3518s(this.f4156k);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.u$toq */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"androidx/core/view/u$toq", "", "Landroid/view/View;", "", "hasNext", "k", "Lkotlin/was;", "remove", "", com.market.sdk.reflect.toq.f28131g, "index", "core-ktx_release"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq implements Iterator<View>, InterfaceC7627q {

        /* JADX INFO: renamed from: k */
        private int f4157k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewGroup f4158q;

        toq(ViewGroup viewGroup) {
            this.f4158q = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4157k < this.f4158q.getChildCount();
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f4158q;
            int i2 = this.f4157k;
            this.f4157k = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f4158q;
            int i2 = this.f4157k - 1;
            this.f4157k = i2;
            viewGroup.removeViewAt(i2);
        }
    }

    public static final boolean f7l8(@InterfaceC7396q ViewGroup isEmpty) {
        kotlin.jvm.internal.d2ok.cdj(isEmpty, "$this$isEmpty");
        return isEmpty.getChildCount() == 0;
    }

    /* JADX INFO: renamed from: g */
    public static final int m3512g(@InterfaceC7396q ViewGroup size) {
        kotlin.jvm.internal.d2ok.cdj(size, "$this$size");
        return size.getChildCount();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m3513h(ViewGroup.MarginLayoutParams updateMarginsRelative, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = updateMarginsRelative.getMarginStart();
        }
        if ((i6 & 2) != 0) {
            i3 = updateMarginsRelative.topMargin;
        }
        if ((i6 & 4) != 0) {
            i4 = updateMarginsRelative.getMarginEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = updateMarginsRelative.bottomMargin;
        }
        kotlin.jvm.internal.d2ok.cdj(updateMarginsRelative, "$this$updateMarginsRelative");
        updateMarginsRelative.setMarginStart(i2);
        updateMarginsRelative.topMargin = i3;
        updateMarginsRelative.setMarginEnd(i4);
        updateMarginsRelative.bottomMargin = i5;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m3514k(@InterfaceC7396q ViewGroup contains, @InterfaceC7396q View view) {
        kotlin.jvm.internal.d2ok.cdj(contains, "$this$contains");
        kotlin.jvm.internal.d2ok.cdj(view, "view");
        return contains.indexOfChild(view) != -1;
    }

    @zy.hyr(17)
    public static final void kja0(@InterfaceC7396q ViewGroup.MarginLayoutParams updateMarginsRelative, @InterfaceC7833l int i2, @InterfaceC7833l int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        kotlin.jvm.internal.d2ok.cdj(updateMarginsRelative, "$this$updateMarginsRelative");
        updateMarginsRelative.setMarginStart(i2);
        updateMarginsRelative.topMargin = i3;
        updateMarginsRelative.setMarginEnd(i4);
        updateMarginsRelative.bottomMargin = i5;
    }

    public static final void ld6(@InterfaceC7396q ViewGroup plusAssign, @InterfaceC7396q View view) {
        kotlin.jvm.internal.d2ok.cdj(plusAssign, "$this$plusAssign");
        kotlin.jvm.internal.d2ok.cdj(view, "view");
        plusAssign.addView(view);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final kotlin.sequences.qrj<View> m3515n(@InterfaceC7396q ViewGroup children) {
        kotlin.jvm.internal.d2ok.cdj(children, "$this$children");
        return new k(children);
    }

    public static /* synthetic */ void n7h(ViewGroup.MarginLayoutParams updateMargins, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = updateMargins.leftMargin;
        }
        if ((i6 & 2) != 0) {
            i3 = updateMargins.topMargin;
        }
        if ((i6 & 4) != 0) {
            i4 = updateMargins.rightMargin;
        }
        if ((i6 & 8) != 0) {
            i5 = updateMargins.bottomMargin;
        }
        kotlin.jvm.internal.d2ok.cdj(updateMargins, "$this$updateMargins");
        updateMargins.setMargins(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: p */
    public static final void m3516p(@InterfaceC7396q ViewGroup minusAssign, @InterfaceC7396q View view) {
        kotlin.jvm.internal.d2ok.cdj(minusAssign, "$this$minusAssign");
        kotlin.jvm.internal.d2ok.cdj(view, "view");
        minusAssign.removeView(view);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final View m3517q(@InterfaceC7396q ViewGroup get, int i2) {
        kotlin.jvm.internal.d2ok.cdj(get, "$this$get");
        View childAt = get.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + get.getChildCount());
    }

    public static final void qrj(@InterfaceC7396q ViewGroup.MarginLayoutParams updateMargins, @InterfaceC7833l int i2, @InterfaceC7833l int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        kotlin.jvm.internal.d2ok.cdj(updateMargins, "$this$updateMargins");
        updateMargins.setMargins(i2, i3, i4, i5);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final Iterator<View> m3518s(@InterfaceC7396q ViewGroup iterator) {
        kotlin.jvm.internal.d2ok.cdj(iterator, "$this$iterator");
        return new toq(iterator);
    }

    public static final void toq(@InterfaceC7396q ViewGroup forEach, @InterfaceC7396q cyoe.x2<? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(forEach, "$this$forEach");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        int childCount = forEach.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = forEach.getChildAt(i2);
            kotlin.jvm.internal.d2ok.m23085y(childAt, "getChildAt(index)");
            action.invoke(childAt);
        }
    }

    public static final void x2(@InterfaceC7396q ViewGroup.MarginLayoutParams setMargins, @InterfaceC7833l int i2) {
        kotlin.jvm.internal.d2ok.cdj(setMargins, "$this$setMargins");
        setMargins.setMargins(i2, i2, i2, i2);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m3519y(@InterfaceC7396q ViewGroup isNotEmpty) {
        kotlin.jvm.internal.d2ok.cdj(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.getChildCount() != 0;
    }

    public static final void zy(@InterfaceC7396q ViewGroup forEachIndexed, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super View, kotlin.was> action) {
        kotlin.jvm.internal.d2ok.cdj(forEachIndexed, "$this$forEachIndexed");
        kotlin.jvm.internal.d2ok.cdj(action, "action");
        int childCount = forEachIndexed.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Integer numValueOf = Integer.valueOf(i2);
            View childAt = forEachIndexed.getChildAt(i2);
            kotlin.jvm.internal.d2ok.m23085y(childAt, "getChildAt(index)");
            action.invoke(numValueOf, childAt);
        }
    }
}
