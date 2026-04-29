package com.android.thememanager.v9.holder;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.FeedElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.Feed;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.settings.subsettings.InterfaceC2616k;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.view.f7l8;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import yz.C7794k;

/* JADX INFO: compiled from: ElementDetailAuthorDynamicListViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.fti implements com.android.thememanager.basemodule.analysis.toq, View.OnClickListener, InterfaceC2616k {

    /* JADX INFO: renamed from: c */
    private ArrayList<String> f17135c;

    /* JADX INFO: renamed from: e */
    private UILink f17136e;

    /* JADX INFO: renamed from: f */
    private List<f7l8> f17137f;

    /* JADX INFO: renamed from: g */
    private TextView f17138g;

    /* JADX INFO: renamed from: h */
    private int f17139h;

    /* JADX INFO: renamed from: i */
    private int f17140i;

    /* JADX INFO: renamed from: k */
    private ImageView f17141k;

    /* JADX INFO: renamed from: l */
    private String f17142l;

    /* JADX INFO: renamed from: n */
    private TextView f17143n;

    /* JADX INFO: renamed from: p */
    private kja0 f17144p;

    /* JADX INFO: renamed from: q */
    private TextView f17145q;

    /* JADX INFO: renamed from: r */
    private String f17146r;

    /* JADX INFO: renamed from: s */
    private f7l8 f17147s;

    /* JADX INFO: renamed from: t */
    private String f17148t;

    /* JADX INFO: renamed from: y */
    private f7l8 f17149y;

    /* JADX INFO: renamed from: z */
    private int f17150z;

    public zy(View itemView) {
        super(itemView);
        this.f17137f = new ArrayList();
        Activity activityKi = C1819o.ki(itemView.getContext());
        if (activityKi instanceof kja0) {
            this.f17144p = (kja0) activityKi;
        } else {
            C7794k.f7l8("activity is " + activityKi);
        }
        this.f17139h = this.f17144p.getResources().getDimensionPixelSize(R.dimen.author_dynamic_portrait_size);
        this.f17140i = this.f17144p.getResources().getDimensionPixelSize(R.dimen.author_dynamic_portrait_size);
        this.f17150z = this.f17144p.getResources().getDimensionPixelSize(R.dimen.author_dynamic_name_size);
        ki();
    }

    private void ki() {
        this.f17141k = (ImageView) this.itemView.findViewById(R.id.author_portrait);
        TextView textView = (TextView) this.itemView.findViewById(R.id.author_name);
        this.f17145q = textView;
        textView.setTextSize(0, this.f17150z);
        this.f17138g = (TextView) this.itemView.findViewById(R.id.element_author_theme_title);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.author_update_time);
        this.f17143n = textView2;
        textView2.setVisibility(0);
        this.f17149y = new f7l8(this.itemView.findViewById(R.id.item_0));
        this.f17147s = new f7l8(this.itemView.findViewById(R.id.item_1));
        this.f17137f.add(this.f17149y);
        this.f17137f.add(this.f17147s);
        SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) this.itemView.findViewById(R.id.portrait_container);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) smoothFrameLayout2.getLayoutParams();
        layoutParams.setMarginEnd(this.f17144p.getResources().getDimensionPixelSize(R.dimen.author_dynamic_portrait_end_size));
        smoothFrameLayout2.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f17141k.getLayoutParams();
        layoutParams2.width = this.f17139h;
        layoutParams2.height = this.f17140i;
        this.f17141k.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.item_ll);
        linearLayout.setOnClickListener(this);
        this.f17141k.setOnClickListener(this);
        this.f17145q.setOnClickListener(this);
        C6077k.ld6(linearLayout);
        C6077k.m22369i(this.f17141k);
        C6077k.f7l8(this.f17145q);
    }

    public void fn3e(FeedElement item, int position) {
        Feed feed = item.feed;
        if (feed == null) {
            return;
        }
        this.f17136e = feed.link;
        this.f17145q.setText(feed.authorName);
        this.f17143n.setText(C2782h.m9788n(feed.publishTime));
        x2.m6782y(this.f17144p, feed.authorIcon, this.f17141k, x2.fn3e().gvn7(R.drawable.icon_default_avatar));
        this.f17135c = feed.snapshotsUrl;
        int i2 = 0;
        while (true) {
            ArrayList<String> arrayList = this.f17135c;
            if (arrayList == null || arrayList.size() < 2 || i2 >= 2) {
                break;
            }
            x2.m6782y(this.f17144p, this.f17135c.get(i2), this.f17137f.get(i2).m10355k(), x2.fn3e().m6793r(x2.ki(x2.x2(), 0.0f)).jk(3));
            i2++;
        }
        this.f17138g.setText(feed.productName);
        this.f17148t = feed.designerId;
        this.f17142l = feed.designerMiId;
        this.f17146r = feed.authorName;
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    /* JADX INFO: renamed from: n */
    public void mo9024n() {
        UILink uILink;
        kja0 kja0Var = this.f17144p;
        if (kja0Var == null || (uILink = this.f17136e) == null) {
            return;
        }
        kja0Var.n5r1(uILink.trackId);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        int id = v2.getId();
        if (id == R.id.author_name || id == R.id.author_portrait) {
            com.android.thememanager.toq.fn3e(this.f17144p, this.f17148t, this.f17142l, this.f17146r);
            return;
        }
        if (id != R.id.item_ll) {
            return;
        }
        C2451n.f7l8(this.f17144p, null, this.f17136e);
        UILink uILink = this.f17136e;
        if (uILink != null) {
            com.android.thememanager.basemodule.analysis.kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.je, uILink.trackId, null);
            C1708s.f7l8().ld6().ni7(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.je, this.f17136e.trackId, ""));
        }
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    public void zy() {
        UILink uILink;
        kja0 kja0Var = this.f17144p;
        if (kja0Var == null || (uILink = this.f17136e) == null) {
            return;
        }
        kja0Var.ncyb(uILink.trackId);
    }
}
