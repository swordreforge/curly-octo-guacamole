package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.kja0;
import androidx.savedstate.InterfaceC1157n;
import androidx.savedstate.zy;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: k */
    static final String f5003k = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: renamed from: androidx.lifecycle.LegacySavedStateHandleController$k */
    static final class C0913k implements zy.InterfaceC1159k {
        C0913k() {
        }

        @Override // androidx.savedstate.zy.InterfaceC1159k
        /* JADX INFO: renamed from: k */
        public void mo4379k(@zy.lvui InterfaceC1157n interfaceC1157n) {
            if (!(interfaceC1157n instanceof InterfaceC0931j)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            hb viewModelStore = ((InterfaceC0931j) interfaceC1157n).getViewModelStore();
            androidx.savedstate.zy savedStateRegistry = interfaceC1157n.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.zy().iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.m4378k(viewModelStore.toq(it.next()), savedStateRegistry, interfaceC1157n.getLifecycle());
            }
            if (viewModelStore.zy().isEmpty()) {
                return;
            }
            savedStateRegistry.ld6(C0913k.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    /* JADX INFO: renamed from: k */
    static void m4378k(lrht lrhtVar, androidx.savedstate.zy zyVar, kja0 kja0Var) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) lrhtVar.x9kr(f5003k);
        if (savedStateHandleController == null || savedStateHandleController.zy()) {
            return;
        }
        savedStateHandleController.m4397k(zyVar, kja0Var);
        zy(zyVar, kja0Var);
    }

    static SavedStateHandleController toq(androidx.savedstate.zy zyVar, kja0 kja0Var, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, dd.f7l8(zyVar.toq(str), bundle));
        savedStateHandleController.m4397k(zyVar, kja0Var);
        zy(zyVar, kja0Var);
        return savedStateHandleController;
    }

    private static void zy(final androidx.savedstate.zy zyVar, final kja0 kja0Var) {
        kja0.zy qVar = kja0Var.toq();
        if (qVar == kja0.zy.INITIALIZED || qVar.isAtLeast(kja0.zy.STARTED)) {
            zyVar.ld6(C0913k.class);
        } else {
            kja0Var.mo4451k(new fn3e() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.fn3e
                public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
                    if (toqVar == kja0.toq.ON_START) {
                        kja0Var.zy(this);
                        zyVar.ld6(C0913k.class);
                    }
                }
            });
        }
    }
}
