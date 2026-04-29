package com.android.thememanager.comment.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.toq;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.comment.model.ResourceCommentOverview;
import com.android.thememanager.comment.util.zy;
import com.android.thememanager.comment.view.fragment.C1888g;
import com.android.thememanager.comment.view.fragment.n7h;
import com.android.thememanager.comment.view.widget.ResourceCommentsHeaderView;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentsActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: c */
    private static final String f10708c = "resource";

    /* JADX INFO: renamed from: e */
    private static final String f10709e = "comment_id";

    /* JADX INFO: renamed from: f */
    private static final String f10710f = "tag_all";

    /* JADX INFO: renamed from: j */
    private static final String f10711j = "auto_comment_edit";

    /* JADX INFO: renamed from: l */
    private FragmentManager.kja0 f10712l = new FragmentManager.kja0() { // from class: com.android.thememanager.comment.view.activity.k
        @Override // androidx.fragment.app.FragmentManager.kja0
        public final void onBackStackChanged() {
            this.f10714k.v0af();
        }
    };

    /* JADX INFO: renamed from: r */
    Resource f10713r;

    private n7h r8s8(o1t trans, String tag) {
        n7h n7hVar = (n7h) getSupportFragmentManager().nmn5(tag);
        if (n7hVar != null) {
            return n7hVar;
        }
        n7h n7hVarYp31 = n7h.yp31(this.f10713r);
        trans.zy(R.id.resource_comment_fragment_container, n7hVarYp31, tag);
        return n7hVarYp31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0af() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            m6709b().mo173v(getString(R.string.resource_comment_title, this.f10713r.getTitle()));
        } else if (getFragmentManager().getBackStackEntryCount() == 1) {
            m6709b().xwq3(R.string.theme_comment_detail_title);
        }
    }

    public static Intent was(Context context, Resource resource, boolean autoJumpCommentEdit, long commentId) {
        Intent intent = new Intent(context, (Class<?>) ResourceCommentsActivity.class);
        intent.putExtra("resource", resource.m28251clone());
        intent.putExtra("auto_comment_edit", autoJumpCommentEdit);
        if (commentId > 0) {
            intent.putExtra("comment_id", commentId);
        }
        return intent;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return toq.klfn;
    }

    protected void etdu() {
        long longExtra = getIntent().getLongExtra("comment_id", 0L);
        if (longExtra > 0) {
            zsr0(null, longExtra, null);
        } else {
            i9jn();
        }
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        ResourceCommentOverview qVar = zy.toq(this.f10713r);
        Intent intent = new Intent();
        intent.putExtra(InterfaceC1357q.f53953vq, qVar);
        setResult(-1, intent);
        super.finish();
    }

    public void i9jn() {
        o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.x9kr(r8s8(o1tVarKi, f10710f));
        o1tVarKi.n7h();
        m6709b().mo173v(getString(R.string.resource_comment_title, this.f10713r.getTitle()));
        getSupportFragmentManager().qrj(this.f10712l);
        sok();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.f10713r = (Resource) getIntent().getSerializableExtra("resource");
        } catch (Exception unused) {
        }
        if (this.f10713r == null) {
            finish();
            return;
        }
        getWindow().setSoftInputMode(3);
        setContentView(R.layout.resource_comment_list);
        if (!getIntent().getBooleanExtra("auto_comment_edit", false)) {
            etdu();
        } else {
            zy.m7428n(this, this.f10713r, null);
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
        if (getFragmentManager().getBackStackEntryCount() <= 0) {
            return super.onNavigateUp();
        }
        getFragmentManager().popBackStack();
        return true;
    }

    public void sok() {
        ResourceCommentsHeaderView resourceCommentsHeaderView = (ResourceCommentsHeaderView) findViewById(R.id.resource_comment_header);
        ResourceCommentOverview qVar = zy.toq(this.f10713r);
        resourceCommentsHeaderView.setCommentsScore(qVar.count, qVar.score);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean zp() {
        return false;
    }

    public void zsr0(ResourceCommentGroup commentGroup, long commentId, Fragment target) {
        C1888g c1888gYp31 = C1888g.yp31(commentGroup, commentId, this.f10713r);
        c1888gYp31.setTargetFragment(target, 0);
        o1t qVar = getSupportFragmentManager().ki().m4313r(4097).oc(R.animator.slide_fragment_inn, R.animator.slide_fragment_outt, R.animator.slide_fragment_inn, R.animator.slide_fragment_outt).toq(R.id.container, c1888gYp31);
        if (!getIntent().hasExtra("comment_id")) {
            qVar.ld6(null);
        }
        qVar.n7h();
    }
}
