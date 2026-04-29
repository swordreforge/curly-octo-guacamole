package com.android.thememanager.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import i1.C6077k;
import miuix.appcompat.app.AbstractC6946k;

/* JADX INFO: loaded from: classes.dex */
public class LargeIconAllActivity extends kja0 {

    /* JADX INFO: renamed from: j */
    private static final String f8780j = "largeIcon";

    /* JADX INFO: renamed from: c */
    private TextView f8781c;

    /* JADX INFO: renamed from: e */
    private TextView f8782e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bwp(View view) {
        startActivity(com.android.thememanager.toq.kja0(this, "largeicons"));
    }

    private void se(boolean isDisplayTitle) {
        AbstractC6946k abstractC6946kM6709b = m6709b();
        abstractC6946kM6709b.hb(true);
        abstractC6946kM6709b.mo157f(R.layout.large_icon_action_bar_view);
        ImageView imageView = (ImageView) findViewById(R.id.back_btn);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9067k.yqrt(view);
            }
        });
        C6077k.m22374s(imageView);
        TextView textView = (TextView) findViewById(isDisplayTitle ? R.id.operation_btn : R.id.search_view);
        this.f8781c = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.title);
        this.f8782e = textView2;
        if (isDisplayTitle) {
            textView2.setVisibility(0);
            this.f8782e.setText(getIntent().getStringExtra(p001b.f7l8.uv));
        } else {
            GradientDrawable gradientDrawable = (GradientDrawable) this.f8781c.getBackground();
            gradientDrawable.setCornerRadius(getResources().getDimensionPixelSize(R.dimen.large_icon_all_page_search_radius));
            gradientDrawable.setSize(-1, getResources().getDimensionPixelSize(R.dimen.large_icon_all_page_search_height));
        }
        this.f8781c.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.a98o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8918k.bwp(view);
            }
        });
        abstractC6946kM6709b.hyr(new ColorDrawable(getResources().getColor(R.color.item_color)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yqrt(View view) {
        onBackPressed();
    }

    public static Intent z4(Context context, String onlineId, String title, boolean isNeedSelectList) {
        Intent intent = new Intent(context, (Class<?>) LargeIconAllActivity.class);
        intent.putExtra(p001b.f7l8.a8p6, onlineId);
        intent.putExtra(p001b.f7l8.uv, title);
        intent.putExtra(p001b.f7l8.qla, isNeedSelectList);
        return intent;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!C1807g.m7077l()) {
            finish();
            return;
        }
        nmn5 nmn5Var = (nmn5) getSupportFragmentManager().nmn5(f8780j);
        Bundle bundle = new Bundle();
        bundle.putString(p001b.f7l8.a8p6, getIntent().getStringExtra(p001b.f7l8.a8p6));
        bundle.putString(p001b.f7l8.uv, getIntent().getStringExtra(p001b.f7l8.uv));
        bundle.putBoolean(p001b.f7l8.qla, getIntent().getBooleanExtra(p001b.f7l8.qla, true));
        if (nmn5Var == null) {
            nmn5 nmn5Var2 = new nmn5();
            nmn5Var2.setArguments(bundle);
            getSupportFragmentManager().ki().zy(android.R.id.content, nmn5Var2, f8780j).qrj();
        }
        se(!getIntent().getBooleanExtra(p001b.f7l8.qla, true));
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return 0;
    }
}
