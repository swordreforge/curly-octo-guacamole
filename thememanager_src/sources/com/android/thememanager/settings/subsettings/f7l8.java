package com.android.thememanager.settings.subsettings;

import a98o.C0004k;
import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.detail.video.model.PictureDescriptionModel;
import com.android.thememanager.detail.video.model.PictureDescriptionResource;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: WallpaperGroup.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f60857cdj = 10;

    /* JADX INFO: renamed from: h */
    public static final int f15449h = 8;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f60858ki = 11;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f60859kja0 = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f60860n7h = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f60861qrj = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public boolean f60862f7l8;

    /* JADX INFO: renamed from: g */
    public String f15450g;

    /* JADX INFO: renamed from: k */
    public final int f15451k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public boolean f60863ld6;

    /* JADX INFO: renamed from: n */
    public String f15452n;

    /* JADX INFO: renamed from: p */
    public boolean f15453p;

    /* JADX INFO: renamed from: q */
    public String f15454q;

    /* JADX INFO: renamed from: s */
    public String f15455s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f60864toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    public String f60865x2;

    /* JADX INFO: renamed from: y */
    public int f15456y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public List<Resource> f60866zy;

    public f7l8(int wt2, int ct) {
        this.f15451k = wt2;
        this.f60864toq = ct;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Pair<List<f7l8>, Boolean> m9173k(UIPage uipage, int start, int mod) {
        List<UICard> list;
        if (uipage == null || (list = uipage.cards) == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UICard uICard : uipage.cards) {
            if (uICard.products != null) {
                f7l8 f7l8Var = new f7l8(4, 10);
                f7l8Var.f15454q = uICard.title;
                f7l8Var.f15456y = uICard.products.size();
                f7l8Var.f60865x2 = uICard.subjectUuid;
                f7l8Var.f15453p = true;
                f7l8Var.f15455s = uICard.trackId;
                C0004k c0004k = new C0004k();
                Iterator<UIProduct> it = uICard.products.iterator();
                while (it.hasNext()) {
                    c0004k.add(C2451n.m8801q(it.next(), false));
                }
                f7l8Var.f60866zy = c0004k;
                List<UIProduct> list2 = uICard.products;
                if (list2 != null && list2.size() > 0) {
                    f7l8Var.f15450g = uICard.products.get(0).productType;
                }
                arrayList.add(f7l8Var);
            }
        }
        return new Pair<>(arrayList, Boolean.valueOf(uipage.hasMore));
    }

    /* JADX INFO: renamed from: q */
    private <T> boolean m9174q(List<T> a2, List<T> b2) {
        if (a2 == null && b2 == null) {
            return true;
        }
        return (a2 == null || b2 == null || a2.size() != b2.size()) ? false : true;
    }

    @dd
    public static List<f7l8> toq(UIPage uipage) {
        List<UICard> list;
        if (uipage == null || (list = uipage.cards) == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UICard uICard : uipage.cards) {
            if (uICard.products != null) {
                f7l8 f7l8Var = new f7l8(4, 10);
                f7l8Var.f15454q = uICard.title;
                f7l8Var.f15452n = uICard.subTitle;
                f7l8Var.f15456y = uICard.productCount;
                f7l8Var.f60865x2 = uICard.subjectUuid;
                f7l8Var.f15455s = uICard.trackId;
                f7l8Var.f60866zy = C2320q.d3(uICard.products, -1);
                List<UIProduct> list2 = uICard.products;
                if (list2 != null && list2.size() > 0) {
                    f7l8Var.f15450g = uICard.products.get(0).productType;
                }
                arrayList.add(f7l8Var);
            }
        }
        return arrayList;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7l8)) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        return this.f15456y == f7l8Var.f15456y && this.f60864toq == f7l8Var.f60864toq && this.f15451k == f7l8Var.f15451k && TextUtils.equals(this.f15454q, f7l8Var.f15454q) && TextUtils.equals(this.f15452n, f7l8Var.f15452n) && TextUtils.equals(this.f60865x2, f7l8Var.f60865x2) && TextUtils.equals(this.f15450g, f7l8Var.f15450g) && m9174q(this.f60866zy, f7l8Var.f60866zy);
    }

    /* JADX INFO: renamed from: n */
    public void m9175n(PictureDescriptionResource pictureDescriptionResource) {
        for (Resource resource : this.f60866zy) {
            PictureDescriptionModel sameNameModel = pictureDescriptionResource.getSameNameModel(resource.getThumbName());
            if (sameNameModel != null) {
                String strM7067k = fu4.m7067k();
                resource.setPictureDescriptionTitle(sameNameModel.getTitleByLocale(strM7067k));
                resource.setPictureDescriptionContent(sameNameModel.getContentByLocale(strM7067k));
            }
        }
    }

    public String zy() {
        if (this.f15451k == 4) {
            return "online-" + this.f15451k + C5658n.f73185t8r + this.f15454q;
        }
        return "type-" + this.f15451k + C5658n.f73185t8r + this.f15454q;
    }
}
