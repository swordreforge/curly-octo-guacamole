package com.android.thememanager.recommend.view.activity;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import androidx.core.graphics.C0541p;
import androidx.fragment.app.o1t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.view.fragment.C2354q;
import i1.C6077k;
import java.util.List;
import miuix.appcompat.app.AbstractC6946k;
import miuix.os.f7l8;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f60648ab = "REQUEST_CONTENT_IS_FROM_TAG";
    private static final String an = "REQUEST_RINGTONE_FLAG";
    private static final String as = "theme";
    private static final String ax = "title";
    private static final String az = "/uipages/subjects/";
    private static final String ba = "/uipages/search/";
    private static final String bb = "REQUEST_RESOURCE_CODE";
    private static final String bg = "/uipages";
    private static final String bl = "https";
    private static final String bp = "REQUEST_IS_PICKER";
    private static final String bv = "REQUEST_IS_GRID";

    /* JADX INFO: renamed from: d */
    private static final String f13614d = "REQUEST_RELATED_TITLE";
    private static final String id = "REQUEST_IS_RANK";
    private static final String in = "http";

    /* JADX INFO: renamed from: v */
    private static ArgbEvaluator f13615v = null;

    /* JADX INFO: renamed from: w */
    private static final String f13616w = "REQUEST_LIST_URL";

    /* JADX INFO: renamed from: a */
    private boolean f13617a;

    /* JADX INFO: renamed from: b */
    private boolean f13618b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f60649bo = 1.0f;

    /* JADX INFO: renamed from: c */
    private ColorDrawable f13619c;

    /* JADX INFO: renamed from: e */
    private String f13620e;

    /* JADX INFO: renamed from: f */
    private C2354q f13621f;

    /* JADX INFO: renamed from: j */
    private String f13622j;

    /* JADX INFO: renamed from: l */
    private ImageView f13623l;

    /* JADX INFO: renamed from: m */
    private String f13624m;

    /* JADX INFO: renamed from: o */
    private boolean f13625o;

    /* JADX INFO: renamed from: r */
    private View f13626r;

    /* JADX INFO: renamed from: u */
    private int f13627u;

    /* JADX INFO: renamed from: x */
    private boolean f13628x;

    private void cfr() {
        this.f13620e = getIntent().getStringExtra("REQUEST_RELATED_TITLE");
        this.f13622j = getIntent().getStringExtra("REQUEST_LIST_URL");
        this.f13625o = getIntent().getBooleanExtra("REQUEST_CONTENT_IS_FROM_TAG", false);
        this.f13624m = getIntent().getStringExtra(bb);
        this.f13618b = getIntent().getBooleanExtra(bp, false);
        this.f13617a = getIntent().getBooleanExtra(id, false);
        this.f13628x = getIntent().getBooleanExtra(bv, false);
        this.f13627u = getIntent().getIntExtra(an, -1);
        Uri data = getIntent().getData();
        if (data == null || data.getPath() == null) {
            return;
        }
        if ("http".equals(data.getScheme()) || "theme".equals(data.getScheme()) || "https".equals(data.getScheme())) {
            String path = data.getPath();
            if (path.startsWith(bg)) {
                List<String> pathSegments = data.getPathSegments();
                String str = pathSegments.get(pathSegments.size() - 1);
                if (path.startsWith(az)) {
                    this.f13622j = z4.toq.m28200g(str);
                } else if (!path.startsWith(ba)) {
                    this.f13622j = z4.toq.m28202n(str);
                } else if (pathSegments.size() == 4) {
                    this.f13622j = z4.toq.f7l8(str, pathSegments.get(pathSegments.size() - 2));
                }
                this.f13620e = data.getQueryParameter("title");
            }
        }
    }

    public static Intent etdu(Context context, String title, String listUrl, String resCode, boolean isPicker, boolean clickFromTag, boolean isGrid, boolean isRank) {
        Intent intent = new Intent(context, (Class<?>) RecommendActivity.class);
        intent.putExtra("REQUEST_RELATED_TITLE", title);
        intent.putExtra("REQUEST_LIST_URL", listUrl);
        intent.putExtra(bb, resCode);
        intent.putExtra("REQUEST_CONTENT_IS_FROM_TAG", clickFromTag);
        intent.putExtra(bp, isPicker);
        intent.putExtra(bv, isGrid);
        intent.putExtra(id, isRank);
        return intent;
    }

    public static Intent i9jn(Context context, String title, String listUrl, String resCode, boolean isPicker, boolean clickFromTag) {
        return etdu(context, title, listUrl, resCode, isPicker, clickFromTag, false, false);
    }

    public static Intent r8s8(Context context, String title, String listUrl, String resCode, boolean isPicker, boolean clickFromTag, int ringtoneFlag) {
        Intent intentEtdu = etdu(context, title, listUrl, resCode, isPicker, clickFromTag, false, false);
        intentEtdu.putExtra(an, ringtoneFlag);
        return intentEtdu;
    }

    private static ArgbEvaluator sok() {
        if (f13615v == null) {
            f13615v = new ArgbEvaluator();
        }
        return f13615v;
    }

    public static Intent v0af(Context context, String title, String listUrl, String resCode, boolean isPicker, boolean clickFromTag, boolean isGrid, int ringtoneFlag) {
        Intent intentEtdu = etdu(context, title, listUrl, resCode, isPicker, clickFromTag, isGrid, false);
        intentEtdu.putExtra(an, ringtoneFlag);
        return intentEtdu;
    }

    private void w831() {
        o1t o1tVarKi = getSupportFragmentManager().ki();
        C2354q c2354qExv8 = C2354q.exv8(this.f13622j, false, "widget_suit".equals(this.f13624m) ? 2 : !this.f13628x ? 1 : 0, this.f13625o, this.f13624m, this.f13618b, this.f13627u);
        this.f13621f = c2354qExv8;
        o1tVarKi.m4317z(R.id.content, c2354qExv8);
        o1tVarKi.n7h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yqrt(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z4(View view) {
        startActivityForResult(com.android.thememanager.toq.kja0(this, this.f13624m), 1);
        d8wk(com.android.thememanager.basemodule.analysis.toq.r19, this.f13624m);
    }

    public static Intent zsr0(Context context, String title, String listUrl, String resCode, boolean isPicker, int ringtoneFlag) {
        return r8s8(context, title, listUrl, resCode, isPicker, false, ringtoneFlag);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        C2354q c2354q = this.f13621f;
        return c2354q != null ? c2354q.m2t() : super.mo6345a();
    }

    protected void bwp() {
        AbstractC6946k abstractC6946kM6709b = m6709b();
        abstractC6946kM6709b.hb(true);
        if (!com.android.thememanager.basemodule.utils.o1t.m7171i() || this.f13617a) {
            nmn5();
            abstractC6946kM6709b.lrht(LayoutInflater.from(this).inflate(com.android.thememanager.R.layout.rc_resource_detail_back_title_operation_bar_view, (ViewGroup) null, false), new AbstractC0096k.toq(-1, -1));
            this.f13626r = findViewById(com.android.thememanager.R.id.back_btn);
            if (!com.android.thememanager.basemodule.utils.o1t.kja0()) {
                this.f13626r.setBackgroundResource(com.android.thememanager.R.drawable.action_back);
            }
            ImageView imageView = (ImageView) findViewById(com.android.thememanager.R.id.operation_btn);
            this.f13623l = imageView;
            C6077k.m22374s(this.f13626r, imageView);
            if (!TextUtils.isEmpty(this.f13620e)) {
                ((TextView) findViewById(com.android.thememanager.R.id.title)).setText(this.f13620e);
            }
        } else {
            View viewYqrt = abstractC6946kM6709b.yqrt();
            this.f13626r = viewYqrt;
            if (viewYqrt == null) {
                this.f13626r = findViewById(com.android.thememanager.R.id.up);
            }
            if (this.f13626r == null) {
                ImageView imageView2 = new ImageView(this);
                abstractC6946kM6709b.lw(imageView2);
                this.f13626r = imageView2;
                C1812k.m7106k(imageView2, com.android.thememanager.R.string.actionbar_button_up_description);
                this.f13626r.setBackgroundResource(com.android.thememanager.R.drawable.recommend_action_bar_back_icon);
            }
            if (abstractC6946kM6709b.v0af() instanceof ImageView) {
                this.f13623l = (ImageView) abstractC6946kM6709b.v0af();
            } else {
                ImageView imageView3 = new ImageView(this);
                abstractC6946kM6709b.ij(imageView3);
                this.f13623l = imageView3;
            }
            C1812k.m7106k(this.f13623l, com.android.thememanager.R.string.miuix_appcompat_search_input_description);
            this.f13623l.setBackgroundResource(com.android.thememanager.R.drawable.recommend_action_bar_search_icon);
            if (!TextUtils.isEmpty(this.f13620e)) {
                abstractC6946kM6709b.mo173v(this.f13620e);
            }
        }
        if (!com.android.thememanager.basemodule.utils.o1t.n7h()) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.android.thememanager.R.dimen.recommend_search_padding);
            this.f13623l.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            this.f13623l.setImageResource(com.android.thememanager.R.drawable.home_search);
        }
        if (C1807g.zurt()) {
            this.f13623l.setVisibility(8);
        }
        this.f13623l.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.activity.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13629k.z4(view);
            }
        });
        this.f13626r.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.activity.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13630k.yqrt(view);
            }
        });
        abstractC6946kM6709b.hyr(new ColorDrawable(getResources().getColor(com.android.thememanager.R.color.item_color)));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        C1802c.m7008k(getIntent());
        requestExtraWindowFeature(9);
        super.onCreate(savedInstanceState);
        cfr();
        bwp();
        w831();
        if (TextUtils.equals(f7l8.m26160k("ro.vendor.audio.ringtone.type", ""), "system")) {
            setVolumeControlStream(1);
        } else {
            setVolumeControlStream(3);
        }
    }

    public void se(RecyclerView recyclerView) {
        int iKi = m6709b().ki();
        RecyclerView.AbstractC1048h layoutManager = recyclerView.getLayoutManager();
        float fMin = Math.min((layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0 ? Math.abs(recyclerView.getChildAt(0).getY()) : 2.1474836E9f : 0.0f) / iKi, 1.0f);
        if (fMin == this.f60649bo) {
            return;
        }
        if (fMin < 1.0f) {
            if (getTranslucentStatus() != 2) {
                this.f13626r.setBackgroundResource(com.android.thememanager.R.drawable.miuix_appcompat_action_bar_back_dark);
                if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
                    this.f13623l.setImageResource(com.android.thememanager.R.drawable.miuix_appcompat_action_button_search_dark);
                } else {
                    this.f13623l.setImageResource(com.android.thememanager.R.drawable.second_search_dark);
                }
                setTranslucentStatus(2);
            }
        } else if (C1819o.d2ok(this)) {
            if (getTranslucentStatus() != 2) {
                setTranslucentStatus(2);
            }
        } else if (getTranslucentStatus() != 1) {
            this.f13626r.setBackgroundResource(com.android.thememanager.R.drawable.miuix_appcompat_action_bar_back_light);
            if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
                this.f13623l.setImageResource(com.android.thememanager.R.drawable.miuix_appcompat_action_button_search_light);
            } else {
                this.f13623l.setImageResource(com.android.thememanager.R.drawable.second_search_light);
            }
            setTranslucentStatus(1);
        }
        int color = getResources().getColor(com.android.thememanager.R.color.item_color);
        ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(com.android.thememanager.R.color.transparent));
        this.f13619c = colorDrawable;
        int iIntValue = ((Integer) sok().evaluate(fMin, Integer.valueOf(C0541p.m2542t(color, 0)), Integer.valueOf(color))).intValue();
        if (iIntValue != 0) {
            ((ColorDrawable) colorDrawable.mutate()).setColor(iIntValue);
        }
        m6709b().hyr(colorDrawable);
        this.f60649bo = fMin;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    public String yz() {
        C2354q c2354q = this.f13621f;
        return c2354q != null ? c2354q.kx3() : super.yz();
    }
}
