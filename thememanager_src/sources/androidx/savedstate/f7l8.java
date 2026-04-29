package androidx.savedstate;

import android.view.View;
import androidx.savedstate.C1156k;
import com.xiaomi.onetrack.api.C5693g;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.sequences.fn3e;
import kotlin.sequences.t8r;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/savedstate/n;", "owner", "Lkotlin/was;", "toq", "(Landroid/view/View;Landroidx/savedstate/n;)V", "k", "(Landroid/view/View;)Landroidx/savedstate/n;", "savedstate_release"}, m22787k = 2, mv = {1, 6, 0})
@InterfaceC6769y(name = "ViewTreeSavedStateRegistryOwner")
public final class f7l8 {

    /* JADX INFO: renamed from: androidx.savedstate.f7l8$k */
    /* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", C5693g.ae, "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C1154k extends AbstractC6308r implements x2<View, View> {
        public static final C1154k INSTANCE = new C1154k();

        C1154k() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final View invoke(@InterfaceC7396q View view) {
            d2ok.m23075h(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", C5693g.ae, "Landroidx/savedstate/n;", "invoke", "(Landroid/view/View;)Landroidx/savedstate/n;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements x2<View, InterfaceC1157n> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final InterfaceC1157n invoke(@InterfaceC7396q View view) {
            d2ok.m23075h(view, "view");
            Object tag = view.getTag(C1156k.k.f6284k);
            if (tag instanceof InterfaceC1157n) {
                return (InterfaceC1157n) tag;
            }
            return null;
        }
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "get")
    /* JADX INFO: renamed from: k */
    public static final InterfaceC1157n m5231k(@InterfaceC7396q View view) {
        d2ok.m23075h(view, "<this>");
        return (InterfaceC1157n) fn3e.qkj8(fn3e.mbx(t8r.n7h(view, C1154k.INSTANCE), toq.INSTANCE));
    }

    @InterfaceC6769y(name = "set")
    public static final void toq(@InterfaceC7396q View view, @InterfaceC7395n InterfaceC1157n interfaceC1157n) {
        d2ok.m23075h(view, "<this>");
        view.setTag(C1156k.k.f6284k, interfaceC1157n);
    }
}
