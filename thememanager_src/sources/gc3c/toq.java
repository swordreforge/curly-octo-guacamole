package gc3c;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.recommend.model.entity.element.WidgetSuitElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: compiled from: StaggerWidgetViewHolderController.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    private static final String f35016s = "StaggerWidgetViewHolderController";

    /* JADX INFO: renamed from: g */
    private WidgetSuitElement f35017g;

    /* JADX INFO: renamed from: k */
    private ActivityC0891q f35018k;

    /* JADX INFO: renamed from: n */
    private RecommendListViewAdapter f35019n;

    /* JADX INFO: renamed from: q */
    private Fragment f35020q;

    /* JADX INFO: renamed from: y */
    private zy f35021y;

    public toq(@lvui View itemView, RecommendListViewAdapter adapter) {
        this.f35018k = null;
        this.f35020q = null;
        this.f35019n = null;
        this.f35017g = null;
        if (adapter != null) {
            this.f35018k = adapter.ki();
            this.f35020q = adapter.fu4();
            this.f35019n = adapter;
        }
        this.f35021y = new zy(adapter, itemView, 1);
        m22284g();
    }

    private void f7l8(String trackId) {
        InterfaceC1719p interfaceC1719pM6705z;
        RecommendListViewAdapter recommendListViewAdapter = this.f35019n;
        if (recommendListViewAdapter == null || (interfaceC1719pM6705z = recommendListViewAdapter.m6705z()) == null) {
            return;
        }
        interfaceC1719pM6705z.d8wk(trackId, null);
    }

    /* JADX INFO: renamed from: g */
    private void m22284g() {
        this.f35021y.zurt(this, false);
        this.f35021y.qrj(this);
    }

    /* JADX INFO: renamed from: q */
    public static View m22285q(ViewGroup parent, boolean attachToRoot) {
        return zy.zy(parent.getContext(), parent, attachToRoot);
    }

    private void toq() {
        if (this.f35018k == null) {
            Log.w(f35016s, "gotoDesignerDetailActivity failed: mActivity == null");
            return;
        }
        WidgetSuitElement widgetSuitElement = this.f35017g;
        if (widgetSuitElement == null) {
            Log.w(f35016s, "gotoDesignerDetailActivity failed: element == null");
            return;
        }
        UIImageWithLink imageBanner = widgetSuitElement.getImageBanner();
        if (imageBanner == null) {
            Log.w(f35016s, "gotoDesignerDetailActivity failed: imageWithLink == null");
            return;
        }
        String str = imageBanner.designerId;
        if (p029m.zy.toq(str)) {
            Log.w(f35016s, "gotoDesignerDetailActivity failed: designerId is empty");
            return;
        }
        String str2 = imageBanner.designerMiId;
        if (p029m.zy.toq(str2)) {
            Log.w(f35016s, "gotoDesignerDetailActivity failed: designerMiId is empty");
        } else {
            com.android.thememanager.toq.zurt(this.f35018k, str, str2, imageBanner.designerName, 1);
        }
    }

    private void zy() {
        if (this.f35018k == null) {
            Log.w(f35016s, "gotoDesignerDetailActivity failed: mActivity == null");
            return;
        }
        WidgetSuitElement widgetSuitElement = this.f35017g;
        if (widgetSuitElement == null) {
            Log.w(f35016s, "gotoWidgetDetailActivity failed: element == null");
            return;
        }
        UIImageWithLink imageBanner = widgetSuitElement.getImageBanner();
        if (imageBanner == null) {
            Log.w(f35016s, "gotoWidgetDetailActivity failed: imageWithLink == null");
            return;
        }
        UILink uILink = imageBanner.link;
        if (uILink == null) {
            Log.w(f35016s, "gotoWidgetDetailActivity failed: link == null");
            return;
        }
        RecommendListViewAdapter recommendListViewAdapter = this.f35019n;
        C2451n.toq toqVarZy = recommendListViewAdapter instanceof RecommendListViewAdapter ? C2451n.zy(recommendListViewAdapter) : C2451n.m8797g();
        toqVarZy.toq(uILink.productType);
        toqVarZy.ld6(imageBanner.suitId);
        C2451n.m8803y(this.f35018k, this.f35020q, imageBanner.link, toqVarZy);
        f7l8(uILink.trackId);
    }

    /* JADX INFO: renamed from: k */
    public List<String> m22286k() {
        WidgetSuitElement widgetSuitElement = this.f35017g;
        if (widgetSuitElement == null || widgetSuitElement.getImageBanner() == null || this.f35017g.getImageBanner().link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f35017g.getImageBanner().link.trackId);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m22287n(WidgetSuitElement item, int position) {
        this.f35017g = item;
        UIImageWithLink imageBanner = item.getImageBanner();
        if (imageBanner == null) {
            Log.w(f35016s, "setInfo failed: imageWithLink == null");
            return;
        }
        String str = imageBanner.title;
        this.f35021y.cdj(str);
        this.f35021y.t8r(str);
        this.f35021y.ki(imageBanner.imageUrl, imageBanner.snapshotAspectRatio, position);
        this.f35021y.fn3e(str);
        this.f35021y.ld6(imageBanner.brief);
        String str2 = imageBanner.designerName;
        this.f35021y.n7h(imageBanner.designerIcon, str2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (this.f35021y == null) {
            return;
        }
        int id = v2.getId();
        if (this.f35021y.f7l8(id)) {
            zy();
        } else if (this.f35021y.m22294g(id)) {
            toq();
        }
    }

    public toq(@lvui View itemView, ActivityC0891q activity, Fragment fragment, boolean isDarkMode, int staggerViewHolderWidth, int source) {
        this.f35019n = null;
        this.f35017g = null;
        this.f35018k = activity;
        this.f35020q = fragment;
        this.f35021y = new zy(activity, isDarkMode, staggerViewHolderWidth, itemView, source);
        m22284g();
    }
}
