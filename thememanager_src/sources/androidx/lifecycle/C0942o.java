package androidx.lifecycle;

import android.view.View;
import oc.C7426k;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: compiled from: ViewTreeLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class C0942o {
    private C0942o() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static InterfaceC0954z m4466k(@zy.lvui View view) {
        InterfaceC0954z interfaceC0954z = (InterfaceC0954z) view.getTag(C7426k.k.f42916k);
        if (interfaceC0954z != null) {
            return interfaceC0954z;
        }
        Object parent = view.getParent();
        while (interfaceC0954z == null && (parent instanceof View)) {
            View view2 = (View) parent;
            interfaceC0954z = (InterfaceC0954z) view2.getTag(C7426k.k.f42916k);
            parent = view2.getParent();
        }
        return interfaceC0954z;
    }

    public static void toq(@zy.lvui View view, @zy.dd InterfaceC0954z interfaceC0954z) {
        view.setTag(C7426k.k.f42916k, interfaceC0954z);
    }
}
