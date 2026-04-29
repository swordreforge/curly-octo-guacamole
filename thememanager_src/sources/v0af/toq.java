package v0af;

import android.util.Log;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.mine.follow.model.FollowInterface;
import com.android.thememanager.module.attention.view.C2223q;
import com.android.thememanager.v9.model.AuthorAttentionDyncmicModel;
import java.io.IOException;
import retrofit2.C7639i;
import zy.dd;
import zy.y9n;

/* JADX INFO: compiled from: AttentionModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f44660k = "AttentionModel";

    @dd
    @y9n
    /* JADX INFO: renamed from: k */
    public static Boolean m28098k(String userId, String userName, boolean attention) {
        try {
            return Boolean.valueOf(((FollowInterface) f7l8.m6882h().qrj(FollowInterface.class)).follow(userId, attention, userName).f7l8().f7l8());
        } catch (IOException e2) {
            Log.w(f44660k, "doAttention fail. " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    private static AuthorAttentionDyncmicModel m28099q(retrofit2.toq<CommonResponse<AuthorAttentionDyncmicModel>> call) {
        C7639i<CommonResponse<AuthorAttentionDyncmicModel>> c7639iF7l8;
        try {
            c7639iF7l8 = call.f7l8();
        } catch (IOException e2) {
            Log.w(f44660k, "toAttentionModel() :" + e2);
            c7639iF7l8 = null;
        }
        if (c7639iF7l8 == null) {
            Log.i(f44660k, "toAttentionModel() response null.");
        } else if (c7639iF7l8.f7l8()) {
            CommonResponse<AuthorAttentionDyncmicModel> commonResponseM27986k = c7639iF7l8.m27986k();
            if (commonResponseM27986k != null) {
                return commonResponseM27986k.apiData;
            }
            Log.d(f44660k, "toAttentionModel() CommonResponse null.");
        } else {
            Log.d(f44660k, "toAttentionModel() res fail." + c7639iF7l8);
        }
        return null;
    }

    @dd
    @y9n
    public static AuthorAttentionDyncmicModel toq(long lastUpdateTime) {
        return m28099q(((InterfaceC7702k) f7l8.m6882h().qrj(InterfaceC7702k.class)).m28097k(C2223q.f13050d, String.valueOf(lastUpdateTime)));
    }

    @dd
    @y9n
    public static AuthorAttentionDyncmicModel zy(int start) {
        return m28099q(((InterfaceC7702k) f7l8.m6882h().qrj(InterfaceC7702k.class)).toq(InterfaceC1925p.zr, "attention", String.valueOf(start)));
    }
}
