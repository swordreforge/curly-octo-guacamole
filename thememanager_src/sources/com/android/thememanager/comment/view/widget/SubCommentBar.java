package com.android.thememanager.comment.view.widget;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.comment.model.CommentRequestInterface;
import com.android.thememanager.comment.model.CommentResult;
import com.android.thememanager.comment.util.C1881q;
import com.android.thememanager.comment.util.zy;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import ek5k.C6002g;
import i1.C6077k;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.C7639i;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class SubCommentBar extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private ResourceCommentItem f10828g;

    /* JADX INFO: renamed from: k */
    private EditText f10829k;

    /* JADX INFO: renamed from: n */
    private toq f10830n;

    /* JADX INFO: renamed from: p */
    private String f10831p;

    /* JADX INFO: renamed from: q */
    private FrameLayout f10832q;

    /* JADX INFO: renamed from: s */
    private Long f10833s;

    /* JADX INFO: renamed from: y */
    private Resource f10834y;

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.widget.SubCommentBar$k */
    class C1897k implements C1688q.n {
        C1897k() {
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
                return;
            }
            SubCommentBar subCommentBar = SubCommentBar.this;
            SubCommentBar subCommentBar2 = SubCommentBar.this;
            subCommentBar.f10830n = new toq(subCommentBar2, subCommentBar2.f10828g, SubCommentBar.this.f10834y, SubCommentBar.this.f10833s);
            SubCommentBar.this.f10830n.executeOnExecutor(C6002g.x2(), SubCommentBar.this.f10829k.getText().toString());
        }
    }

    private static class toq extends AsyncTask<String, Void, Integer> {

        /* JADX INFO: renamed from: k */
        private WeakReference<SubCommentBar> f10836k;

        /* JADX INFO: renamed from: q */
        private Long f10837q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ResourceCommentItem f57894toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Resource f57895zy;

        public toq(SubCommentBar subCommentBar, ResourceCommentItem commentItem, Resource resource, Long mainCommentId) {
            this.f10836k = new WeakReference<>(subCommentBar);
            this.f57894toq = commentItem;
            this.f57895zy = resource;
            this.f10837q = mainCommentId;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... strings) {
            if (strings.length == 0 || this.f57895zy == null) {
                return -1;
            }
            if (C1688q.cdj().m6590z() == null) {
                return -14;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("content", strings[0]);
                jSONObject.put("toUserKey", this.f57894toq.userKey);
                jSONObject.put("toCommentId", this.f57894toq.commentId);
                jSONObject.put("userName", C1688q.cdj().m6590z().f57421toq);
            } catch (JSONException unused) {
            }
            String version = this.f57895zy.getLocalInfo().getVersion();
            if (TextUtils.isEmpty(version)) {
                version = this.f57895zy.getOnlineInfo().getVersion();
                if (TextUtils.isEmpty(version)) {
                    version = "0.0.0.0";
                }
            }
            try {
                C7639i<CommonResponse<CommentResult>> c7639iF7l8 = ((CommentRequestInterface) f7l8.m6882h().qrj(CommentRequestInterface.class)).doSubComment(this.f57895zy.getOnlineId(), String.valueOf(this.f10837q), jSONObject.toString(), version).f7l8();
                if (com.android.thememanager.basemodule.network.theme.toq.m6892k(c7639iF7l8)) {
                    return Integer.valueOf(c7639iF7l8.m27986k().apiData.status);
                }
                return -1;
            } catch (IOException unused2) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer resultCode) {
            SubCommentBar subCommentBar = this.f10836k.get();
            if (subCommentBar == null || resultCode == null) {
                return;
            }
            zy.m7429q(resultCode.intValue(), this.f57895zy);
            if (resultCode.intValue() == 1) {
                ((InputMethodManager) subCommentBar.getContext().getSystemService("input_method")).hideSoftInputFromWindow(subCommentBar.getWindowToken(), 0);
            }
        }
    }

    public SubCommentBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7453s(View view) {
        if (TextUtils.isEmpty(this.f10829k.getText())) {
            return;
        }
        toq toqVar = this.f10830n;
        if (toqVar != null && toqVar.getStatus() != AsyncTask.Status.FINISHED) {
            this.f10830n.cancel(true);
        }
        C1897k c1897k = new C1897k();
        if (getContext() instanceof Activity) {
            C1688q.cdj().fti((Activity) getContext(), c1897k);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m7454y() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sub_comment_bar, this);
        this.f10829k = (EditText) viewInflate.findViewById(R.id.sub_comment_edit);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.sub_comment_submit_fl);
        this.f10832q = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.widget.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10838k.m7453s(view);
            }
        });
        C6077k.m22377z(this.f10829k, this.f10832q);
    }

    public EditText getCommentEdit() {
        return this.f10829k;
    }

    /* JADX INFO: renamed from: p */
    public void m7455p(@dd String hint) {
        ResourceCommentItem resourceCommentItem;
        this.f10829k.setText("");
        if (hint == null && (resourceCommentItem = this.f10828g) != null) {
            hint = this.f10831p + (TextUtils.isEmpty(resourceCommentItem.userName) ? getContext().getString(R.string.resource_comment_name_default) : this.f10828g.userName);
        }
        this.f10829k.setHint(hint);
    }

    public void setInfo(ResourceCommentItem commentItem, Long mainCommentId, Resource resource) {
        this.f10828g = commentItem;
        this.f10833s = mainCommentId;
        this.f10834y = resource;
    }

    public SubCommentBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SubCommentBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f10831p = C1881q.m7423q(context);
        m7454y();
    }
}
