package i9jn;

import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;
import java.util.Set;
import zy.lvui;

/* JADX INFO: renamed from: i9jn.k */
/* JADX INFO: compiled from: RemoteResourceContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6094k {

    /* JADX INFO: renamed from: i9jn.k$f7l8 */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface f7l8 extends InterfaceC1720q.toq<q> {
        void e5(List<UIProduct> products, boolean refresh, boolean hasMore);

        default void hb(List<UICard> products, boolean refresh, boolean hasMore) {
        }

        /* JADX INFO: renamed from: s */
        void mo8272s();
    }

    /* JADX INFO: renamed from: i9jn.k$g */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface g extends f7l8 {
        void ngy(boolean hide);

        void xwq3(boolean hide, Set<String> itemIds);
    }

    /* JADX INFO: renamed from: i9jn.k$k */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface k extends q {
        /* JADX INFO: renamed from: k */
        void mo8268k(@lvui Set<String> checkedItemIds);
    }

    /* JADX INFO: renamed from: i9jn.k$n */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface n extends q {
        /* JADX INFO: renamed from: g */
        void mo8271g(@lvui Set<String> checkedItemIds);

        void ld6(@lvui Set<String> checkedItemIds);
    }

    /* JADX INFO: renamed from: i9jn.k$q */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface q extends InterfaceC1720q.k<f7l8> {
        void ki();

        /* JADX INFO: renamed from: z */
        void mo8265z();
    }

    /* JADX INFO: renamed from: i9jn.k$toq */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface toq extends f7l8 {
        void kja0();

        void ld6(Set<String> deletedItemIds);
    }

    /* JADX INFO: renamed from: i9jn.k$zy */
    /* JADX INFO: compiled from: RemoteResourceContract.java */
    public interface zy extends f7l8 {
        void a98o();
    }
}
