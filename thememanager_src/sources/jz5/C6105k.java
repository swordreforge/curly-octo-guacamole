package jz5;

import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import java.io.IOException;
import java.util.List;
import yqrt.C7792k;
import z4.zy;
import zy.dd;
import zy.y9n;

/* JADX INFO: renamed from: jz5.k */
/* JADX INFO: compiled from: PickerOnlineRingRepository.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6105k {
    @dd
    @y9n
    /* JADX INFO: renamed from: k */
    public static Pair<UIPage, List<UIElement>> m22389k(int cardStart) {
        try {
            CommonResponse<kja0> commonResponseM27986k = ((zy) f7l8.m6882h().qrj(zy.class)).m28207n("https://api.zhuti.xiaomi.com/app/v9/uipages/search/tag?cardCount=1&type=RINGTONE&tag=流行", cardStart).f7l8().m27986k();
            if (commonResponseM27986k != null) {
                return C7792k.zy(commonResponseM27986k.apiData, cardStart == 0);
            }
            toq("CommonResponse is null.");
            return null;
        } catch (IOException e2) {
            toq("fail." + e2);
            return null;
        }
    }

    private static void toq(String msg) {
        Log.i("PickerORRepo", msg);
    }
}
