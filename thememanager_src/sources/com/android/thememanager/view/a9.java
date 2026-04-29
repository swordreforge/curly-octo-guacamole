package com.android.thememanager.view;

import a98o.C0004k;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.ItemOrderLayout;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.util.C2755a;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: compiled from: RecommendItemBaseFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a9 implements InterfaceC1357q, com.android.thememanager.basemodule.resource.constants.toq, ItemOrderLayout.InterfaceC1845k<RecommendItem> {

    /* JADX INFO: renamed from: k */
    protected Activity f17505k;

    /* JADX INFO: renamed from: q */
    protected com.android.thememanager.fu4 f17506q;

    /* JADX INFO: renamed from: com.android.thememanager.view.a9$k */
    /* JADX INFO: compiled from: RecommendItemBaseFactory.java */
    class ViewOnClickListenerC2911k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecommendItem f17507k;

        /* JADX INFO: renamed from: com.android.thememanager.view.a9$k$k */
        /* JADX INFO: compiled from: RecommendItemBaseFactory.java */
        class k implements C1688q.n {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f17509k;

            k(final View val$v) {
                this.f17509k = val$v;
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
                if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                    nn86.m7150k(R.string.account_unactivated, 1);
                } else {
                    nn86.m7150k(R.string.fail_to_add_account, 0);
                }
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                ViewOnClickListenerC2911k viewOnClickListenerC2911k = ViewOnClickListenerC2911k.this;
                a9.this.mo10331g(this.f17509k, viewOnClickListenerC2911k.f17507k);
            }
        }

        ViewOnClickListenerC2911k(final RecommendItem val$item) {
            this.f17507k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View v2) {
            if (this.f17507k.isLoginRequried() && !C1688q.cdj().wvg()) {
                C1688q.cdj().fti(a9.this.f17505k, new k(v2));
                return;
            }
            a9.this.mo10331g(v2, this.f17507k);
            if (a9.this.f17505k instanceof AbstractActivityC1717k) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("hint", "1");
                    jSONObject.put(com.android.thememanager.basemodule.analysis.toq.bao0, this.f17507k.getTitle());
                    jSONObject.put("resourceType", a9.this.f17506q.getResourceCode());
                } catch (JSONException e2) {
                    Log.e("RecommendBaseFactory", e2.toString());
                }
                com.android.thememanager.basemodule.analysis.kja0.f7l8(((AbstractActivityC1717k) a9.this.f17505k).mo6345a(), this.f17507k.getTitle(), jSONObject.toString());
                ArrayMap<String, Object> arrayMapKja0 = C1706p.kja0(((AbstractActivityC1717k) a9.this.f17505k).mo6345a(), this.f17507k.getTitle(), "");
                arrayMapKja0.put("hint", "1");
                arrayMapKja0.put(com.android.thememanager.basemodule.analysis.toq.bao0, this.f17507k.getTitle());
                arrayMapKja0.put("resourceType", a9.this.f17506q.getResourceCode());
                C1708s.f7l8().ld6().ni7(arrayMapKja0);
            }
        }
    }

    public a9(Activity activity, com.android.thememanager.fu4 resContext) {
        this.f17505k = activity;
        this.f17506q = resContext;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:22:0x00a1). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: g */
    protected void mo10331g(View view, RecommendItem item) {
        boolean z2;
        com.android.thememanager.fu4 fu4VarF7l8 = this.f17506q;
        String resourceStamp = item.getResourceStamp();
        if (TextUtils.equals(resourceStamp, this.f17506q.getResourceStamp())) {
            z2 = false;
        } else {
            if (this.f17506q.isPicker()) {
                C7794k.toq(C2755a.f16307g, "Change ResourceContext on picker mode");
            }
            fu4VarF7l8 = C2082k.zy().m8001n().f7l8(resourceStamp);
            z2 = true;
        }
        Intent intentZy = zy(item, fu4VarF7l8, z2);
        if (intentZy != null) {
            if (item.getItemType() == RecommendItem.RecommendType.SINGLE) {
                ArrayList arrayList = new ArrayList();
                Resource resource = new Resource();
                resource.setOnlineId(item.getContentId());
                C0004k c0004k = new C0004k();
                c0004k.add(resource);
                arrayList.add(c0004k);
                C2082k.zy().qrj(arrayList);
            }
            try {
                if (item.getItemType() == RecommendItem.RecommendType.SEARCH) {
                    intentZy.putExtra(InterfaceC1357q.f53884hyr, item.getExtraMeta().getBoolean(RecommendItem.RECOMMEND_ITEM_IS_TAG, false));
                    this.f17505k.startActivity(intentZy);
                    this.f17505k.overridePendingTransition(R.anim.appear, R.anim.disappear);
                } else {
                    this.f17505k.startActivityForResult(intentZy, 1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                nn86.toq(this.f17505k.getString(R.string.resource_no_match_app), 0);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    protected abstract View mo10332n(RecommendItem item, ViewGroup parent);

    /* JADX INFO: renamed from: q */
    protected View.OnClickListener mo10333q(final RecommendItem item) {
        return new ViewOnClickListenerC2911k(item);
    }

    @Override // com.android.thememanager.basemodule.views.ItemOrderLayout.InterfaceC1845k
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public View mo7319k(RecommendItem item, ViewGroup parent) {
        if (item == null || item.getItemType() == RecommendItem.RecommendType.UNKNOWN) {
            return null;
        }
        View viewMo10332n = mo10332n(item, parent);
        viewMo10332n.setOnClickListener(mo10333q(item));
        return viewMo10332n;
    }

    protected Intent zy(RecommendItem item, com.android.thememanager.fu4 resContext, boolean isBelt) {
        return new RecommendItemResolver(item, resContext, isBelt).getForwardIntent();
    }
}
