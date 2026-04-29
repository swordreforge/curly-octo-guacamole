package bwp;

import com.android.thememanager.recommend.presenter.RecommendCategoryPresenter;
import com.android.thememanager.recommend.presenter.RecommendHomepageAodIconPresenter;
import com.android.thememanager.recommend.presenter.RecommendHomepagePresenter;
import com.android.thememanager.recommend.presenter.RecommendHomepageWallpaperPresenter;
import w831.InterfaceC7729k;

/* JADX INFO: renamed from: bwp.k */
/* JADX INFO: compiled from: RecommendPresenterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1381k {
    /* JADX INFO: renamed from: k */
    public static InterfaceC7729k.k m5838k(String tabType, String subTabType) {
        return "homepage".equals(tabType) ? ("wallpaper".equals(subTabType) || "videowallpaper".equals(subTabType)) ? new RecommendHomepageWallpaperPresenter(tabType, subTabType) : ("aod".equals(subTabType) || "icons".equals(subTabType)) ? new RecommendHomepageAodIconPresenter(subTabType) : new RecommendHomepagePresenter(tabType, subTabType) : new RecommendCategoryPresenter(tabType, subTabType);
    }
}
