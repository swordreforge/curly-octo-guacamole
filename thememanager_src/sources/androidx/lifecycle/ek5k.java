package androidx.lifecycle;

import android.view.View;
import eqxt.C6007g;

/* JADX INFO: compiled from: ViewTreeViewModelStoreOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class ek5k {
    private ek5k() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static InterfaceC0931j m4432k(@zy.lvui View view) {
        InterfaceC0931j interfaceC0931j = (InterfaceC0931j) view.getTag(C6007g.k.f34399k);
        if (interfaceC0931j != null) {
            return interfaceC0931j;
        }
        Object parent = view.getParent();
        while (interfaceC0931j == null && (parent instanceof View)) {
            View view2 = (View) parent;
            interfaceC0931j = (InterfaceC0931j) view2.getTag(C6007g.k.f34399k);
            parent = view2.getParent();
        }
        return interfaceC0931j;
    }

    public static void toq(@zy.lvui View view, @zy.dd InterfaceC0931j interfaceC0931j) {
        view.setTag(C6007g.k.f34399k, interfaceC0931j);
    }
}
