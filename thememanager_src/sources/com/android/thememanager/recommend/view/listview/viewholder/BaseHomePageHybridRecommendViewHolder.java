package com.android.thememanager.recommend.view.listview.viewholder;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.HomePageHybridRecommendElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class BaseHomePageHybridRecommendViewHolder<T> extends BaseViewHolder<T> implements View.OnClickListener {

    /* JADX INFO: renamed from: h */
    private static final String f13788h = "BaseHomePageHybridRecommendViewHolder";

    /* JADX INFO: renamed from: g */
    protected NinePatchImageView f13789g;

    /* JADX INFO: renamed from: p */
    private final x2.C1735g f13790p;

    /* JADX INFO: renamed from: s */
    protected TextView f13791s;

    /* JADX INFO: renamed from: y */
    protected TextView f13792y;

    public BaseHomePageHybridRecommendViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        Resources resources = itemView.getResources();
        this.f13790p = com.android.thememanager.basemodule.imageloader.x2.fn3e().wvg(0).x9kr(resources.getDimensionPixelSize(R.dimen.hot_list_header_title_logo_width), resources.getDimensionPixelSize(R.dimen.hot_list_header_title_logo_height));
    }

    /* JADX INFO: renamed from: l */
    private String m8581l(HomePageHybridRecommendElement item) {
        RecommendListViewAdapter recommendListViewAdapterWvg = wvg();
        return recommendListViewAdapterWvg == null ? item.getTitlePic() : recommendListViewAdapterWvg.ncyb() ? item.getDarkTitlePic() : item.getTitlePic();
    }

    /* JADX INFO: renamed from: f */
    protected void m8582f(HomePageHybridRecommendElement item) {
        String strM8581l = m8581l(item);
        if (p029m.zy.toq(strM8581l)) {
            this.f13789g.setVisibility(8);
            String title = item.getTitle();
            if (p029m.zy.toq(title)) {
                this.f13792y.setVisibility(4);
            } else {
                this.f13792y.setVisibility(0);
                this.f13792y.setText(title);
            }
        } else {
            this.f13792y.setVisibility(8);
            this.f13789g.setVisibility(0);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), strM8581l, this.f13789g, this.f13790p);
        }
        String guide = item.getGuide();
        if (p029m.zy.toq(guide)) {
            this.f13791s.setVisibility(4);
        } else {
            this.f13791s.setVisibility(0);
            this.f13791s.setText(guide);
        }
    }

    protected void n5r1(Activity activity, UIProduct uiProduct) {
        Intent intentM9548y;
        if (activity == null) {
            Log.d(f13788h, "JumpToDetail: prams activity is null");
            return;
        }
        if (uiProduct == null) {
            Log.w(f13788h, "gotoWidgetDetailActivity failed: product == null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(uiProduct);
        if ("WIDGET_SUIT".equals(uiProduct.productType)) {
            String str = uiProduct.suitId;
            if (p029m.zy.toq(str)) {
                Log.w(f13788h, "gotoWidgetDetailActivity failed: suitId is empty");
                return;
            }
            intentM9548y = com.android.thememanager.toq.m9546s((ActivityC0891q) activity, str, uiProduct.trackId, false);
        } else {
            intentM9548y = "WALLPAPER".equals(uiProduct.productType) ? com.android.thememanager.toq.m9548y(ki(), 0, arrayList, 3, 0, uiProduct.uuid) : com.android.thememanager.toq.ki(ki(), ni7(), uiProduct.uuid, uiProduct.imageUrl, uiProduct.trackId, Boolean.FALSE, uiProduct.productType);
        }
        activity.startActivity(intentM9548y);
    }

    protected void ncyb(NinePatchImageView ninePatchImageView, Activity activity, UIProduct uIProduct, int i2) {
        if (ninePatchImageView == null) {
            Log.w(f13788h, "displayPreviewImage ignored: previewView == null");
        } else {
            if (activity == null) {
                Log.w(f13788h, "displayPreviewImage ignored: activity == null");
                return;
            }
            float f2 = i2;
            com.android.thememanager.basemodule.imageloader.x2.m6782y(activity, uIProduct.imageUrl, ninePatchImageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(C1819o.m7166t(bf2.toq.toq().getResources().getColor(R.color.home_page_hybrid_recommend_card_placeholder_bg_color), f2)).m6794t(f2).jk("THEME".equals(uIProduct.productType) ? 1 : 0).a9(false));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HomePageHybridRecommendElement homePageHybridRecommendElement;
        if (view.getId() != R.id.tv_guide || (homePageHybridRecommendElement = (HomePageHybridRecommendElement) fu4()) == null) {
            return;
        }
        UIProduct uIProduct = homePageHybridRecommendElement.getProducts().get(0);
        if (uIProduct == null) {
            Log.d(f13788h, "onClick: click failed , product is null");
            return;
        }
        m8595r(homePageHybridRecommendElement.getSubjectUuid(), homePageHybridRecommendElement.getTitle(), false, false, "WALLPAPER".equals(uIProduct.productType) ? "wallpaper" : "WIDGET_SUIT".equals(uIProduct.productType) ? "widget_suit" : "theme");
        InterfaceC1719p interfaceC1719pM6706z = m6706z();
        if (interfaceC1719pM6706z != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("content", "more");
            } catch (JSONException e2) {
                Log.e(f13788h, e2.toString());
            }
            interfaceC1719pM6706z.d8wk(homePageHybridRecommendElement.getTrackId(), jSONObject.toString());
        }
    }
}
