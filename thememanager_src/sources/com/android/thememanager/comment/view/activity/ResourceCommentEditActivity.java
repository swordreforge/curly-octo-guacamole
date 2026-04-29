package com.android.thememanager.comment.view.activity;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.ItemOrderLayout;
import com.android.thememanager.comment.model.CommentRequestInterface;
import com.android.thememanager.comment.model.CommentResult;
import com.android.thememanager.comment.model.ResourceCommentTags;
import ek5k.C6002g;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.appcompat.app.dd;
import miuix.appcompat.app.ki;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;
import retrofit2.C7639i;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentEditActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: a */
    private static final String f10686a = "ResourceCommentEditActivity";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f57882bo = "0/";

    /* JADX INFO: renamed from: u */
    private static final String f10687u = "/";

    /* JADX INFO: renamed from: x */
    private static final int f10688x = 100;

    /* JADX INFO: renamed from: c */
    private ItemOrderLayout f10690c;

    /* JADX INFO: renamed from: e */
    private RatingBar f10691e;

    /* JADX INFO: renamed from: f */
    private EditText f10692f;

    /* JADX INFO: renamed from: j */
    private ResourceCommentTags f10693j;

    /* JADX INFO: renamed from: l */
    private dd f10694l;

    /* JADX INFO: renamed from: m */
    private ArrayList<ResourceCommentTags.Tag> f10695m;

    /* JADX INFO: renamed from: r */
    private Resource f10697r;

    /* JADX INFO: renamed from: o */
    private int f10696o = 5;

    /* JADX INFO: renamed from: b */
    private boolean f10689b = false;

    private static class f7l8 extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: k */
        private String f10698k;

        /* JADX INFO: renamed from: n */
        private ArrayList<ResourceCommentTags.Tag> f10699n;

        /* JADX INFO: renamed from: q */
        private Resource f10700q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f57883toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<ResourceCommentEditActivity> f57884zy;

        public f7l8(ResourceCommentEditActivity activity, String content, int rate, ArrayList<ResourceCommentTags.Tag> scoreTagList) {
            this.f10698k = content;
            this.f57883toq = rate;
            this.f10699n = scoreTagList;
            this.f57884zy = new WeakReference<>(activity);
            this.f10700q = activity.f10697r;
        }

        /* JADX INFO: renamed from: k */
        private void m7431k(int resultCode) {
            ResourceCommentEditActivity resourceCommentEditActivity = this.f57884zy.get();
            if (resourceCommentEditActivity == null || resourceCommentEditActivity.isFinishing()) {
                return;
            }
            if (resourceCommentEditActivity.f10694l != null) {
                resourceCommentEditActivity.f10694l.dismiss();
            }
            com.android.thememanager.comment.util.zy.m7429q(resultCode, resourceCommentEditActivity.f10697r);
            if (resultCode != -6) {
                if (resultCode != 1) {
                    return;
                }
                resourceCommentEditActivity.finish();
                resourceCommentEditActivity.g1();
                return;
            }
            C7794k.m28195n(ResourceCommentEditActivity.f10686a, "Fail to comment: id=" + resourceCommentEditActivity.f10697r.getOnlineId());
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            ResourceCommentEditActivity resourceCommentEditActivity = this.f57884zy.get();
            if (C1819o.eqxt(resourceCommentEditActivity)) {
                int i2 = !resourceCommentEditActivity.uj2j(this.f10698k, this.f57883toq) ? -12 : !mcp.m7139n() ? -13 : 0;
                if (i2 == 0) {
                    resourceCommentEditActivity.f10694l = dd.gyi(resourceCommentEditActivity, "", resourceCommentEditActivity.getString(R.string.resource_comment_sending));
                } else {
                    m7431k(i2);
                    cancel(false);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            if (!C1688q.cdj().o1t()) {
                return -11;
            }
            String version = this.f10700q.getLocalInfo().getVersion();
            if (TextUtils.isEmpty(version)) {
                version = this.f10700q.getOnlineInfo().getVersion();
                if (TextUtils.isEmpty(version)) {
                    C7794k.toq(ResourceCommentEditActivity.f10686a, "Error: version should not be null for uploading " + this.f10700q.getTitle());
                    version = "0.0.0.0";
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.f10698k)) {
                    jSONObject.put("content", this.f10698k);
                }
                int i2 = this.f57883toq;
                if (i2 > 0) {
                    jSONObject.put("score", String.valueOf(i2));
                }
                if (!kja0.qrj(this.f10699n)) {
                    JSONArray jSONArray = new JSONArray();
                    for (ResourceCommentTags.Tag tag : this.f10699n) {
                        if (tag.selected) {
                            jSONArray.put(tag.id);
                        }
                    }
                    jSONObject.put("tagIds", jSONArray);
                }
            } catch (JSONException unused) {
            }
            int i3 = -1;
            try {
                C7639i<CommonResponse<CommentResult>> c7639iF7l8 = ((CommentRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(CommentRequestInterface.class)).doComment(this.f10700q.getOnlineId(), jSONObject.toString(), version).f7l8();
                if (com.android.thememanager.basemodule.network.theme.toq.m6892k(c7639iF7l8)) {
                    i3 = c7639iF7l8.m27986k().apiData.status;
                }
            } catch (IOException e2) {
                C7794k.m28195n(ResourceCommentEditActivity.f10686a, "Fail to parse response of comments uploading: " + e2.toString());
                e2.printStackTrace();
            }
            return Integer.valueOf(i3);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            if (C1819o.eqxt(this.f57884zy.get())) {
                m7431k(result.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.activity.ResourceCommentEditActivity$g */
    private static class AsyncTaskC1883g extends AsyncTask<Void, Void, ResourceCommentTags> {

        /* JADX INFO: renamed from: k */
        private WeakReference<ResourceCommentEditActivity> f10701k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Resource f57885toq;

        public AsyncTaskC1883g(ResourceCommentEditActivity activity) {
            this.f10701k = new WeakReference<>(activity);
            this.f57885toq = activity.f10697r;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ResourceCommentTags doInBackground(Void... voids) {
            try {
                C7639i<CommonResponse<ResourceCommentTags>> c7639iF7l8 = ((CommentRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(CommentRequestInterface.class)).getCommentTags(this.f57885toq.getOnlineId()).f7l8();
                if (com.android.thememanager.basemodule.network.theme.toq.m6892k(c7639iF7l8)) {
                    return c7639iF7l8.m27986k().apiData;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ResourceCommentTags resourceCommentTags) {
            super.onPostExecute(resourceCommentTags);
            ResourceCommentEditActivity resourceCommentEditActivity = this.f10701k.get();
            if (resourceCommentTags == null || !C1819o.eqxt(resourceCommentEditActivity)) {
                return;
            }
            resourceCommentEditActivity.f10693j = resourceCommentTags;
            resourceCommentEditActivity.b3e(true);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.activity.ResourceCommentEditActivity$k */
    class ViewOnClickListenerC1884k implements View.OnClickListener {
        ViewOnClickListenerC1884k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ResourceCommentEditActivity.this.ktq();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.activity.ResourceCommentEditActivity$n */
    class DialogInterfaceOnClickListenerC1885n implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC1885n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            ResourceCommentEditActivity.this.finish();
            ResourceCommentEditActivity.this.g1();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.activity.ResourceCommentEditActivity$q */
    class C1886q implements TextWatcher {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ TextView f10704k;

        C1886q(final TextView val$countNow) {
            this.f10704k = val$countNow;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int start, int before, int count) {
            this.f10704k.setText(s2.length() + ResourceCommentEditActivity.f10687u);
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            String string = ResourceCommentEditActivity.this.f10692f.getText().toString();
            if (string.length() > 100) {
                nn86.m7150k(R.string.resource_comment_over_limit, 1);
                return;
            }
            if (string.trim().equals("")) {
                ResourceCommentEditActivity.this.ktq();
                return;
            }
            int rating = (int) ResourceCommentEditActivity.this.f10691e.getRating();
            ResourceCommentEditActivity resourceCommentEditActivity = ResourceCommentEditActivity.this;
            new f7l8(resourceCommentEditActivity, string, rating, resourceCommentEditActivity.f10695m).executeOnExecutor(C6002g.x2(), new Void[0]);
            ResourceCommentEditActivity.this.f10689b = true;
        }
    }

    class zy implements RatingBar.OnRatingBarChangeListener {
        zy() {
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            if (rating < 1.0f) {
                ResourceCommentEditActivity.this.f10691e.setRating(1.0f);
                return;
            }
            ResourceCommentEditActivity.this.f10696o = (int) rating;
            if (ResourceCommentEditActivity.this.f10696o >= 4) {
                ResourceCommentEditActivity.this.f10692f.setHint(R.string.resource_comment_edit_text_default);
            } else {
                ResourceCommentEditActivity.this.f10692f.setHint(R.string.resource_comment_edit_text_second_hint);
            }
            ResourceCommentEditActivity.this.b3e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3e(boolean isInit) {
        ResourceCommentTags.CommentTags commentTags;
        ResourceCommentTags resourceCommentTags = this.f10693j;
        if (resourceCommentTags == null || (commentTags = resourceCommentTags.commentTags) == null) {
            return;
        }
        int i2 = this.f10696o;
        if (i2 == 1) {
            this.f10695m = commentTags.score1;
        } else if (i2 == 2) {
            this.f10695m = commentTags.score2;
        } else if (i2 == 3) {
            this.f10695m = commentTags.score3;
        } else if (i2 == 4) {
            this.f10695m = commentTags.score4;
        } else if (i2 == 5) {
            this.f10695m = commentTags.score5;
        }
        ArrayList<ResourceCommentTags.Tag> arrayList = this.f10695m;
        if (arrayList != null) {
            if (isInit && !kja0.qrj(arrayList)) {
                this.f10695m.get(0).selected = true;
            }
            if (kja0.qrj(this.f10695m)) {
                this.f10690c.setVisibility(8);
            } else {
                this.f10690c.setVisibility(0);
                this.f10690c.toq(this.f10695m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        overridePendingTransition(android.R.anim.fade_in, R.anim.push_down_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ktq() {
        if (!this.f10689b) {
            new ki.C6947k(this).fu4(R.string.resource_comment_detainment_msg).mcp(R.string.resource_comment_detainment_fail, new DialogInterfaceOnClickListenerC1885n()).dd(R.string.resource_comment_detainment_success, null).hb();
        } else {
            finish();
            g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uj2j(String text, int rate) {
        return rate > 0 && (text == null || text.length() <= 100);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.m1;
    }

    public void bek6() {
        boolean zQrj = o1t.qrj();
        View viewKja0 = m6709b().kja0();
        ((TextView) viewKja0.findViewById(android.R.id.title)).setText(getString(R.string.resource_comment_edit_title, this.f10697r.getTitle()));
        ((Button) viewKja0.findViewById(16908313)).setText("");
        ((Button) viewKja0.findViewById(16908313)).setBackgroundResource(zQrj ? R.drawable.action_title_cancel : R.drawable.action_title_cancel_custom);
        viewKja0.findViewById(16908313).setOnClickListener(new ViewOnClickListenerC1884k());
        ((Button) viewKja0.findViewById(16908314)).setText("");
        ((Button) viewKja0.findViewById(16908314)).setBackgroundResource(zQrj ? R.drawable.action_title_confirm : R.drawable.action_title_confirm_custom);
        viewKja0.findViewById(16908314).setOnClickListener(new toq());
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        this.f10691e = ratingBar;
        ratingBar.setRating(this.f10696o);
        this.f10691e.setOnRatingBarChangeListener(new zy());
        ItemOrderLayout itemOrderLayout = (ItemOrderLayout) findViewById(R.id.tags);
        this.f10690c = itemOrderLayout;
        itemOrderLayout.setItemFactory(new com.android.thememanager.comment.util.toq(this, true));
        this.f10690c.setGap(getResources().getDimensionPixelSize(R.dimen.de_comment_edit_recommend_text_gap));
        TextView textView = (TextView) findViewById(R.id.count_total);
        TextView textView2 = (TextView) findViewById(R.id.count_now);
        textView.setText(String.valueOf(100));
        textView2.setText(f57882bo);
        EditText editText = (EditText) findViewById(R.id.edit);
        this.f10692f = editText;
        editText.addTextChangedListener(new C1886q(textView2));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ktq();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resource_comment_edit);
        Resource resource = (Resource) getIntent().getSerializableExtra(InterfaceC1357q.f53858d3);
        this.f10697r = resource;
        if (resource == null) {
            finish();
        } else {
            bek6();
            new AsyncTaskC1883g(this).executeOnExecutor(C6002g.x2(), new Void[0]);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (C1688q.cdj().wvg()) {
            return;
        }
        finish();
    }
}
