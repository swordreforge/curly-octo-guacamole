package gc3c;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import zy.lvui;

/* JADX INFO: renamed from: gc3c.k */
/* JADX INFO: compiled from: RemoteResourceWidgetViewHolderController.java */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6059k implements View.OnClickListener {

    /* JADX INFO: renamed from: h */
    private static final String f35008h = "RemoteResourceWidgetViewHolderController";

    /* JADX INFO: renamed from: g */
    private InterfaceC1719p f35009g;

    /* JADX INFO: renamed from: k */
    private ActivityC0891q f35010k;

    /* JADX INFO: renamed from: n */
    private UIProduct f35011n;

    /* JADX INFO: renamed from: p */
    private boolean f35012p;

    /* JADX INFO: renamed from: q */
    private zy f35013q;

    /* JADX INFO: renamed from: s */
    private boolean f35014s;

    /* JADX INFO: renamed from: y */
    private BatchOperationAdapter f35015y;

    public ViewOnClickListenerC6059k(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        boolean z2 = false;
        this.f35012p = false;
        boolean z3 = adapter != null;
        this.f35014s = z3;
        if (z3 && (adapter instanceof RemoteResourcePurchasedAdapter)) {
            z2 = true;
        }
        this.f35012p = z2;
        if (z3) {
            this.f35015y = adapter;
            this.f35010k = adapter.ki();
            this.f35009g = adapter.m6705z();
        }
        this.f35013q = new zy(adapter, itemView, 3);
        m22280g();
    }

    /* JADX INFO: renamed from: g */
    private void m22280g() {
        this.f35013q.zurt(this, this.f35014s);
        this.f35013q.qrj(this);
    }

    /* JADX INFO: renamed from: q */
    private boolean m22281q() {
        BatchOperationAdapter batchOperationAdapter = this.f35015y;
        if (batchOperationAdapter == null) {
            return false;
        }
        return batchOperationAdapter.m7312m();
    }

    public static View zy(ViewGroup parent, boolean attachToRoot) {
        return zy.zy(parent.getContext(), parent, attachToRoot);
    }

    public void f7l8(BaseRemoteResourceAdapter.toq item) {
        UIProduct product = item.getProduct();
        if (TextUtils.isEmpty(p001b.toq.zy(product.productType))) {
            this.f35013q.ni7(false);
        } else if (product.offShelf) {
            this.f35013q.m22295h(R.string.resource_is_off_shelf);
        } else {
            this.f35013q.ni7(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m22282k() {
        InterfaceC1719p interfaceC1719p;
        ActivityC0891q activityC0891q = this.f35010k;
        if (activityC0891q == null) {
            Log.w(f35008h, "gotoDesignerDetailActivity failed: activity == null");
            return;
        }
        UIProduct uIProduct = this.f35011n;
        if (uIProduct == null) {
            Log.w(f35008h, "gotoDesignerDetailActivity failed: product == null");
        } else {
            if (!com.android.thememanager.toq.zurt(activityC0891q, uIProduct.designerId, uIProduct.designerMiId, uIProduct.designerName, 1) || (interfaceC1719p = this.f35009g) == null) {
                return;
            }
            interfaceC1719p.d8wk(uIProduct.trackId, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m22283n(UIProduct product, int position) {
        this.f35011n = product;
        if (product == null) {
            Log.w(f35008h, "setInfo failed: product == null");
            return false;
        }
        String str = product.name;
        this.f35013q.cdj(str);
        this.f35013q.t8r(str);
        this.f35013q.ki(product.imageUrl, product.snapshotAspectRatio, position);
        this.f35013q.fn3e(product.name);
        this.f35013q.ld6(product.brief);
        String str2 = product.designerName;
        this.f35013q.n7h(product.designerIcon, str2);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (m22281q()) {
            Log.w(f35008h, "widget or designer info clicked, but couldn't launched. because it's in edit mode now.");
            return;
        }
        int id = v2.getId();
        if (this.f35013q.f7l8(id)) {
            toq();
        } else if (this.f35013q.m22294g(id)) {
            m22282k();
        }
    }

    public void toq() {
        InterfaceC1719p interfaceC1719p;
        ActivityC0891q activityC0891q = this.f35010k;
        if (activityC0891q == null) {
            Log.w(f35008h, "gotoWidgetDetailActivity failed: activity == null");
            return;
        }
        UIProduct uIProduct = this.f35011n;
        if (uIProduct == null) {
            Log.w(f35008h, "gotoWidgetDetailActivity failed: product == null");
            return;
        }
        String str = uIProduct.suitId;
        if (TextUtils.isEmpty(str)) {
            Log.w(f35008h, "gotoWidgetDetailActivity failed: suitId is empty");
        } else {
            if (!com.android.thememanager.toq.fu4(activityC0891q, str, uIProduct.trackId, this.f35012p) || (interfaceC1719p = this.f35009g) == null) {
                return;
            }
            interfaceC1719p.d8wk(uIProduct.trackId, null);
        }
    }

    public ViewOnClickListenerC6059k(@lvui View itemView, ActivityC0891q activity, RecommendListViewAdapter adapter, int source) {
        this.f35012p = false;
        this.f35010k = activity;
        this.f35015y = null;
        this.f35009g = adapter.m6705z();
        this.f35014s = source == 3;
        this.f35013q = new zy(activity, adapter.ncyb(), source != 2 ? adapter.x9kr() : 0, itemView, source);
        m22280g();
    }
}
