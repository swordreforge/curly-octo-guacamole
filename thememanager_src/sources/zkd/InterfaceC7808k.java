package zkd;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.google.gson.kja0;
import java.util.List;

/* JADX INFO: renamed from: zkd.k */
/* JADX INFO: compiled from: ThemeSettingsContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7808k {

    /* JADX INFO: renamed from: zkd.k$k */
    /* JADX INFO: compiled from: ThemeSettingsContract.java */
    public interface k extends InterfaceC1720q.k<toq> {
        retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart);

        retrofit2.toq<CommonResponse<kja0>> getRefreshCall();

        /* JADX INFO: renamed from: s */
        void mo9134s(InterfaceC0954z owner, jp0y<List<Resource>> observer);
    }

    /* JADX INFO: renamed from: zkd.k$toq */
    /* JADX INFO: compiled from: ThemeSettingsContract.java */
    public interface toq extends InterfaceC1720q.toq<k> {
    }
}
