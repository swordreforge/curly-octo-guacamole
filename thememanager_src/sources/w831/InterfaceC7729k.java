package w831;

import com.android.thememanager.basemodule.base.InterfaceC1720q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.google.gson.kja0;

/* JADX INFO: renamed from: w831.k */
/* JADX INFO: compiled from: RecommendContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7729k {

    /* JADX INFO: renamed from: w831.k$k */
    /* JADX INFO: compiled from: RecommendContract.java */
    public interface k extends InterfaceC1720q.k<toq> {
        retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart);

        retrofit2.toq<CommonResponse<kja0>> getRefreshCall();
    }

    /* JADX INFO: renamed from: w831.k$toq */
    /* JADX INFO: compiled from: RecommendContract.java */
    public interface toq extends InterfaceC1720q.toq<k> {
    }
}
