package gbni;

import android.net.Uri;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.local.n7h;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.util.List;
import java.util.Set;
import zy.lvui;

/* JADX INFO: renamed from: gbni.k */
/* JADX INFO: compiled from: LocalResourceContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6058k {

    /* JADX INFO: renamed from: gbni.k$k */
    /* JADX INFO: compiled from: LocalResourceContract.java */
    public interface k<V extends toq> extends InterfaceC1720q.k<V> {
        void fn3e(InterfaceC0954z owner, jp0y<List<Resource>> observer);

        /* JADX INFO: renamed from: k */
        void mo8223k(@lvui Set<String> checkedItemIds);

        void kja0(String resourceCode);

        void qrj();

        /* JADX INFO: renamed from: t */
        void mo8224t(Uri uri, C1791k resourceContext, int requestCode, n7h listener);

        void wvg(String resourceCode);

        /* JADX INFO: renamed from: y */
        List<Resource> mo8225y();
    }

    /* JADX INFO: renamed from: gbni.k$toq */
    /* JADX INFO: compiled from: LocalResourceContract.java */
    public interface toq<P extends k> extends InterfaceC1720q.toq<P> {
        boolean dd();

        /* JADX INFO: renamed from: do */
        void mo28253do();

        void dr();

        void dxef();

        void gc3c(List<Resource> resources);

        void kcsr();

        void kja0();

        void ld6(Set<String> deletedItemIds);

        void m4();

        void m58i(int updatingNum, int oldNum);

        /* JADX INFO: renamed from: s */
        void mo8237s();
    }
}
