package bz2;

import android.util.Log;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.C4871g;
import com.google.gson.kja0;
import com.google.gson.x2;
import com.google.gson.zurt;
import java.io.IOException;
import retrofit2.C7639i;
import zy.dd;
import zy.lvui;
import zy.y9n;

/* JADX INFO: compiled from: WallpaperSettingModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f7302k = "WallpaperSettingModel";

    /* JADX INFO: renamed from: k */
    private static <T> T m5842k(retrofit2.toq<CommonResponse<T>> call) {
        C7639i<CommonResponse<T>> c7639iF7l8;
        try {
            c7639iF7l8 = call.f7l8();
        } catch (IOException e2) {
            Log.w(f7302k, "toUIPage() :" + e2);
            c7639iF7l8 = null;
        }
        if (c7639iF7l8 == null) {
            Log.i(f7302k, "toUIPage() response null.");
        } else if (c7639iF7l8.f7l8()) {
            CommonResponse<T> commonResponseM27986k = c7639iF7l8.m27986k();
            if (commonResponseM27986k != null) {
                return commonResponseM27986k.apiData;
            }
            Log.d(f7302k, "toUIPage() CommonResponse null.");
        } else {
            Log.d(f7302k, "toUIPage() res fail." + c7639iF7l8);
        }
        return null;
    }

    @dd
    @y9n
    /* JADX INFO: renamed from: n */
    public static UIPage m5843n(int cardStart) {
        return (UIPage) m5842k(((InterfaceC1382k) f7l8.m6882h().toq(InterfaceC1382k.class)).m5840n(cardStart));
    }

    @dd
    @y9n
    /* JADX INFO: renamed from: q */
    public static kja0 m5844q() {
        return (kja0) m5842k(((InterfaceC1382k) f7l8.m6882h().toq(InterfaceC1382k.class)).m5839k());
    }

    @dd
    @y9n
    public static UIPage toq(int cardStart) {
        try {
            return (UIPage) new C4871g().m17099s((x2) m5842k(((z4.zy) f7l8.m6882h().qrj(z4.zy.class)).m28207n(C1807g.m7081r() ? z4.toq.zy(C1724k.m6723p().x2().getWallpaperOnlineLibraryTrackId()) : z4.toq.m28202n(C1724k.m6723p().x2().getWallpaperOnlineLibraryTrackId()), cardStart)), UIPage.class);
        } catch (zurt unused) {
            Log.w(f7302k, "loadHeartWallpaperPicker json parse failed");
            return null;
        }
    }

    @dd
    @y9n
    public static UIPage zy(@lvui String uuid, int page) {
        return (UIPage) m5842k(((InterfaceC1382k) f7l8.m6882h().toq(InterfaceC1382k.class)).toq(uuid, page, 1, C1807g.f7l8()));
    }
}
