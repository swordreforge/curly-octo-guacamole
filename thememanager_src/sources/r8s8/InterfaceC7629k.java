package r8s8;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.google.gson.kja0;
import java.util.List;

/* JADX INFO: renamed from: r8s8.k */
/* JADX INFO: compiled from: FontSettingContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7629k {

    /* JADX INFO: renamed from: r8s8.k$k */
    /* JADX INFO: compiled from: FontSettingContract.java */
    public interface k extends InterfaceC1720q.k<toq> {
        retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart);

        retrofit2.toq<CommonResponse<kja0>> getRefreshCall();

        /* JADX INFO: renamed from: h */
        String mo8297h(Resource resource);

        String n7h(Resource resource);

        void x2(InterfaceC0954z lifecycleOwner, jp0y<List<Resource>> observer);
    }

    /* JADX INFO: renamed from: r8s8.k$toq */
    /* JADX INFO: compiled from: FontSettingContract.java */
    public interface toq extends InterfaceC1720q.toq<k> {
    }
}
