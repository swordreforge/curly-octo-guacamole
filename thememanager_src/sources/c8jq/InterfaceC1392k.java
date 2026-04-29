package c8jq;

import android.util.Pair;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.view.widget.RewardDialog;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UIPage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;

/* JADX INFO: renamed from: c8jq.k */
/* JADX INFO: compiled from: ResourceDetailContract.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1392k {

    /* JADX INFO: renamed from: c8jq.k$k */
    /* JADX INFO: compiled from: ResourceDetailContract.java */
    public interface k extends n {
        void cnbm();

        /* JADX INFO: renamed from: g */
        retrofit2.toq<CommonResponse<UIPage>> mo5846g(int randIndex, int cardStart);
    }

    /* JADX INFO: renamed from: c8jq.k$n */
    /* JADX INFO: compiled from: ResourceDetailContract.java */
    public interface n {

        /* JADX INFO: renamed from: c8jq.k$n$k */
        /* JADX INFO: compiled from: ResourceDetailContract.java */
        public interface k {
            /* JADX INFO: renamed from: k */
            void mo5850k();
        }

        default void ek5k(int count) {
        }

        default void jbh() {
        }

        /* JADX INFO: renamed from: t */
        default void mo5847t(boolean like, int count) {
        }

        /* JADX INFO: renamed from: u */
        default void mo5848u(@dd k callback) {
        }

        /* JADX INFO: renamed from: v */
        void mo5849v(int progress);

        default void v0af(boolean favorite) {
        }

        default void zwy(int count) {
        }
    }

    /* JADX INFO: renamed from: c8jq.k$q */
    /* JADX INFO: compiled from: ResourceDetailContract.java */
    public interface q extends n {
        retrofit2.toq<CommonResponse<UIPage>> bap7(int cardStart);

        void oc(boolean follow, int count);
    }

    /* JADX INFO: renamed from: c8jq.k$toq */
    /* JADX INFO: compiled from: ResourceDetailContract.java */
    public interface toq {
        public static final int ap23 = 5;
        public static final int dbf = 7;
        public static final int eklw = 1;
        public static final int es7 = 8;
        public static final int ip = 6;
        public static final int izu = 4;
        public static final int koj = 10;
        public static final int oei = 11;
        public static final int owi = 2;
        public static final int s31 = 1;
        public static final int sb = 0;
        public static final int vahq = 2;
        public static final int vc = 3;
        public static final int zah1 = 9;

        /* JADX INFO: renamed from: c8jq.k$toq$k */
        /* JADX INFO: compiled from: ResourceDetailContract.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface k {
        }

        /* JADX INFO: renamed from: c8jq.k$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ResourceDetailContract.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC7900toq {
        }

        void apply();

        void cdj(RewardDialog.kja0 responseCallback);

        void d2ok();

        void f7l8();

        void fn3e(InterfaceC0954z lifecycleOwner, jp0y<Pair<OnlineResourceDetail, Integer>> observer);

        Resource getResource();

        int getState();

        void gvn7(ActivityC0891q activity, boolean addLike);

        /* JADX INFO: renamed from: h */
        void mo5851h(InterfaceC0954z lifecycleOwner, jp0y<ThemeStatus> observer);

        /* JADX INFO: renamed from: i */
        void mo5852i();

        void jk(ActivityC0891q activity, boolean addFavorite);

        @dd
        /* JADX INFO: renamed from: k */
        String mo5853k();

        void kja0(String onlineId, int pageIndex, int requestRankCount, RewardDialog.kja0 responseCallback);

        void ld6(ActivityC0891q activity);

        void mcp(InterfaceC0954z lifecycleOwner, jp0y<Integer> observer);

        /* JADX INFO: renamed from: n */
        void mo5854n();

        boolean o1t();

        boolean oc();

        /* JADX INFO: renamed from: p */
        boolean mo5855p();

        /* JADX INFO: renamed from: q */
        void mo5856q();

        boolean qrj();

        /* JADX INFO: renamed from: t */
        boolean mo5857t();

        void wvg(String onlineId, String rewardAmount, String verifyResult, RewardDialog.kja0 responseCallback);

        boolean x2();

        /* JADX INFO: renamed from: y */
        void mo5858y(String redeemCode);

        boolean zurt();

        boolean zy();
    }

    /* JADX INFO: renamed from: c8jq.k$zy */
    /* JADX INFO: compiled from: ResourceDetailContract.java */
    public interface zy extends n {
        /* JADX INFO: renamed from: g */
        retrofit2.toq<CommonResponse<UIPage>> mo5859g(int randIndex, int cardStart);
    }
}
