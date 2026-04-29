package com.android.thememanager.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.cv06;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.io.Serializable;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeRecommendEmptyView extends ResourceEmptyView {

    /* JADX INFO: renamed from: c */
    public static final int f17483c = 2;

    /* JADX INFO: renamed from: f */
    private Button f17484f;

    /* JADX INFO: renamed from: l */
    private cv06 f17485l;

    /* JADX INFO: renamed from: r */
    private ResourceListExpandableView f17486r;

    /* JADX INFO: renamed from: t */
    private View f17487t;

    /* JADX INFO: renamed from: z */
    private TextView f17488z;

    /* JADX INFO: renamed from: com.android.thememanager.view.ThemeRecommendEmptyView$k */
    class C2908k extends com.android.thememanager.util.t8r {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ com.android.thememanager.fu4 f17490n;

        C2908k(final com.android.thememanager.fu4 val$resourceContext) {
            this.f17490n = val$resourceContext;
        }

        @Override // com.android.thememanager.util.t8r
        /* JADX INFO: renamed from: g */
        protected void mo9371g(View v2) {
            C2082k.zy().qrj(ThemeRecommendEmptyView.this.f17485l.qrj());
            Pair pair = (Pair) v2.getTag();
            Intent intent = new Intent();
            intent.setClassName(this.f17490n.getDetailActivityPackage(), this.f17490n.getDetailActivityClass());
            intent.putExtra(InterfaceC1357q.f53879gvn7, (Serializable) pair.first);
            intent.putExtra(InterfaceC1357q.f53893jp0y, (Serializable) pair.second);
            intent.putExtra(InterfaceC1357q.f53965y2, 2);
            ((Activity) ThemeRecommendEmptyView.this.getContext()).startActivityForResult(intent, 1);
        }
    }

    public ThemeRecommendEmptyView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    public void m10314g(com.android.thememanager.controller.online.zurt url, com.android.thememanager.basemodule.async.toq<Object, List<Resource>, List<Resource>> observer) {
        cv06 cv06Var = this.f17485l;
        if (cv06Var != null) {
            cv06Var.m6402u(url);
            this.f17485l.yz(observer);
            this.f17485l.mo6466n();
            this.f17485l.m6691z(false);
        }
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    protected int getLayoutResId() {
        return R.layout.theme_recommend_empty_view;
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    /* JADX INFO: renamed from: k */
    protected void mo10290k() {
        this.f17488z = (TextView) findViewById(R.id.text_view);
        this.f17487t = findViewById(R.id.compound_view);
        this.f17484f = (Button) findViewById(R.id.button);
        this.f17486r = (ResourceListExpandableView) findViewById(R.id.recommend_list);
    }

    /* JADX INFO: renamed from: n */
    public void m10315n(final C1582h f2, final com.android.thememanager.fu4 resourceContext) {
        com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(resourceContext);
        cv06 cv06Var = new cv06(f2, resourceContext);
        this.f17485l = cv06Var;
        cv06Var.zp(x2VarLd6);
        this.f17485l.a98o(new C2908k(resourceContext));
        this.f17486r.setAdapter(this.f17485l);
    }

    /* JADX INFO: renamed from: q */
    public void m10316q(int cleanMsg) {
        cv06 cv06Var = this.f17485l;
        if (cv06Var != null) {
            cv06Var.onClean(cleanMsg);
        }
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    public void setButtonOnClickListener(View.OnClickListener listener) {
        this.f17484f.setOnClickListener(listener);
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    public void setButtonTitle(int resId) {
        this.f17484f.setText(resId);
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    public void setImage(int resId) {
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    public void setText(int resId) {
        this.f17488z.setText(resId);
    }

    @Override // com.android.thememanager.view.ResourceEmptyView
    public void setViewStyle(int style) {
        if (style == 2) {
            this.f17487t.setVisibility(0);
            this.f17486r.setVisibility(0);
            this.f17484f.setVisibility(0);
            this.f17488z.setVisibility(8);
            return;
        }
        this.f17487t.setVisibility(8);
        this.f17486r.setVisibility(8);
        this.f17484f.setVisibility(8);
        this.f17488z.setVisibility(0);
    }

    public ThemeRecommendEmptyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemeRecommendEmptyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
