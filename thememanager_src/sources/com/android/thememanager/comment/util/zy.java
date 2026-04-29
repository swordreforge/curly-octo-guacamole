package com.android.thememanager.comment.util;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.comment.model.CommentResult;
import com.android.thememanager.comment.model.ResourceCommentOverview;
import com.android.thememanager.comment.view.activity.ResourceCommentEditActivity;
import com.android.thememanager.router.detail.callback.StartCommentEditActivityListener;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: compiled from: ResourceCommentHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: com.android.thememanager.comment.util.zy$k */
    /* JADX INFO: compiled from: ResourceCommentHelper.java */
    class C1882k implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f10684k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Activity f57878toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ StartCommentEditActivityListener f57879zy;

        C1882k(final Resource val$resource, final Activity val$activity, final StartCommentEditActivityListener val$listener) {
            this.f10684k = val$resource;
            this.f57878toq = val$activity;
            this.f57879zy = val$listener;
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
            if (!mcp.m7138k() || !mcp.m7139n()) {
                nn86.m7150k(R.string.online_no_network, 0);
            } else if (this.f10684k.isProductBought()) {
                zy.zy(this.f57878toq, this.f10684k);
            } else {
                new toq(this.f57878toq, this.f10684k, this.f57879zy).executeOnExecutor(C6002g.n7h(), new Void[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ResourceCommentHelper.java */
    private static class toq extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private WeakReference<StartCommentEditActivityListener> f10685k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<Activity> f57880toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Resource f57881zy;

        public toq(Activity activity, Resource resource, StartCommentEditActivityListener listener) {
            this.f10685k = new WeakReference<>(listener);
            this.f57880toq = new WeakReference<>(activity);
            this.f57881zy = resource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... params) {
            String onlineId = this.f57881zy.getOnlineId();
            boolean zBooleanValue = false;
            if (!TextUtils.isEmpty(onlineId)) {
                try {
                    zBooleanValue = C2320q.m8479h(p001b.toq.fu4(p001b.toq.m5744q(this.f57881zy.getCategory())), onlineId).get(onlineId).booleanValue();
                } catch (Exception unused) {
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            StartCommentEditActivityListener startCommentEditActivityListener = this.f10685k.get();
            if (startCommentEditActivityListener != null) {
                startCommentEditActivityListener.onPostExecute(this, false);
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            StartCommentEditActivityListener startCommentEditActivityListener = this.f10685k.get();
            if (startCommentEditActivityListener != null) {
                startCommentEditActivityListener.onPreExecute(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            Activity activity = this.f57880toq.get();
            if (activity != null && !activity.isFinishing()) {
                if (result.booleanValue()) {
                    zy.zy(activity, this.f57881zy);
                } else {
                    zy.m7429q(-6, this.f57881zy);
                }
            }
            StartCommentEditActivityListener startCommentEditActivityListener = this.f10685k.get();
            if (startCommentEditActivityListener != null) {
                startCommentEditActivityListener.onPostExecute(this, result.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7426g(ResourceCommentOverview stat, Resource res) {
        ResourceInfo onlineInfo = res.getOnlineInfo();
        onlineInfo.putExtraMeta("count", String.valueOf(stat.count));
        onlineInfo.putExtraMeta("score", String.valueOf(stat.score));
        onlineInfo.putExtraMeta("averageScore", String.valueOf(stat.averageScore));
    }

    /* JADX INFO: renamed from: n */
    public static void m7428n(final Activity activity, final Resource resource, final StartCommentEditActivityListener listener) {
        C1688q.cdj().fti(activity, new C1882k(resource, activity, listener));
    }

    /* JADX INFO: renamed from: q */
    public static void m7429q(int resultCode, @lvui Resource resource) {
        if (resultCode == -9) {
            nn86.m7150k(R.string.resource_comment_limit, 0);
        }
        if (resultCode == -4) {
            nn86.m7150k(R.string.resource_comment_over_limit, 1);
            return;
        }
        if (resultCode == 1) {
            nn86.m7150k(R.string.resource_comment_upload_success, 0);
            return;
        }
        if (resultCode == -7) {
            nn86.m7150k(R.string.resource_comment_upload_data_invalid, 0);
            return;
        }
        if (resultCode == -6) {
            int iKja0 = p001b.toq.kja0(p001b.toq.m5744q(resource.getCategory()));
            if (iKja0 != 0) {
                bf2.toq.toq().getString(iKja0);
            } else {
                bf2.toq.toq().getString(R.string.theme_component_title_all);
            }
            nn86.m7150k(R.string.resource_comment_error_not_bought, 1);
            return;
        }
        switch (resultCode) {
            case CommentResult.CODE_FAIL_NO_NETWORK /* -13 */:
                nn86.m7150k(R.string.online_no_network, 0);
                break;
            case CommentResult.CODE_FAIL_INVALID_COMMENT /* -12 */:
                nn86.m7150k(R.string.resource_comment_invalid, 1);
                break;
            case CommentResult.CODE_FAIL_NOT_LOGIN /* -11 */:
                nn86.m7150k(R.string.resource_comment_upload_not_logined, 1);
                break;
            default:
                nn86.m7150k(R.string.resource_comment_upload_failed, 0);
                break;
        }
    }

    public static ResourceCommentOverview toq(Resource res) {
        ResourceInfo onlineInfo = res.getOnlineInfo();
        ResourceCommentOverview resourceCommentOverview = new ResourceCommentOverview();
        try {
            resourceCommentOverview.score = Float.parseFloat(onlineInfo.getExtraMeta("score"));
        } catch (Exception unused) {
        }
        try {
            resourceCommentOverview.count = Integer.parseInt(onlineInfo.getExtraMeta("count"));
        } catch (Exception unused2) {
        }
        try {
            resourceCommentOverview.averageScore = Float.parseFloat(onlineInfo.getExtraMeta("averageScore"));
        } catch (Exception unused3) {
        }
        return resourceCommentOverview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zy(final Activity activity, final Resource resource) {
        Intent intent = new Intent(activity, (Class<?>) ResourceCommentEditActivity.class);
        intent.putExtra(InterfaceC1357q.f53858d3, resource.m28251clone());
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_up_in, android.R.anim.fade_out);
    }
}
