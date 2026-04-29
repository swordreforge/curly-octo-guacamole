package yqrt;

import android.util.Pair;
import com.android.thememanager.basemodule.utils.C1808h;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import java.util.List;
import zy.dd;
import zy.y9n;

/* JADX INFO: renamed from: yqrt.k */
/* JADX INFO: compiled from: UICardParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7792k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f100627toq = "UICardParser";

    /* JADX INFO: renamed from: k */
    private boolean f45961k;

    public C7792k(boolean hasCardDivider) {
        this.f45961k = hasCardDivider;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m28191k(int cardTypeOrdinal) {
        return (cardTypeOrdinal == 25 || cardTypeOrdinal == 24 || cardTypeOrdinal == 22 || cardTypeOrdinal == 23 || cardTypeOrdinal == 41 || cardTypeOrdinal == 42 || cardTypeOrdinal == 43 || cardTypeOrdinal == 44 || cardTypeOrdinal == 60 || cardTypeOrdinal == 65 || cardTypeOrdinal == 71 || cardTypeOrdinal == 0 || cardTypeOrdinal == 72 || cardTypeOrdinal == 5 || cardTypeOrdinal == 67 || cardTypeOrdinal == 76 || cardTypeOrdinal == 86 || cardTypeOrdinal == 11 || cardTypeOrdinal == 29 || cardTypeOrdinal == 58 || cardTypeOrdinal == 97 || cardTypeOrdinal == 99 || cardTypeOrdinal == 102 || cardTypeOrdinal == 103 || cardTypeOrdinal == 104 || cardTypeOrdinal == 66 || cardTypeOrdinal == 125 || cardTypeOrdinal == 127) ? false : true;
    }

    @dd
    @y9n
    public static Pair<UIPage, List<UIElement>> zy(kja0 object, boolean firstPage) {
        UIPage uIPage;
        if (object == null || (uIPage = (UIPage) C1808h.m7086k().m17099s(object, UIPage.class)) == null) {
            return null;
        }
        return new Pair<>(uIPage, new C7792k(false).toq(uIPage.cards, firstPage, uIPage.hasMore));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b A[PHI: r7
      0x016b: PHI (r7v7 com.android.thememanager.recommend.model.adapter.factory.qrj) = 
      (r7v5 com.android.thememanager.recommend.model.adapter.factory.qrj)
      (r7v6 com.android.thememanager.recommend.model.adapter.factory.qrj)
      (r7v11 com.android.thememanager.recommend.model.adapter.factory.qrj)
      (r7v12 com.android.thememanager.recommend.model.adapter.factory.qrj)
     binds: [B:86:0x0166, B:85:0x0160, B:72:0x00f5, B:69:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bd  */
    @zy.y9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.android.thememanager.router.recommend.entity.UIElement> toq(java.util.List<com.android.thememanager.router.recommend.entity.UICard> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yqrt.C7792k.toq(java.util.List, boolean, boolean):java.util.List");
    }
}
