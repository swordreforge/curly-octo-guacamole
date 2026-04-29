package com.android.thememanager.recommend.view;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import i1.C6077k;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.g */
/* JADX INFO: compiled from: RecommendSearchHotView.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2357g {

    /* JADX INFO: renamed from: k */
    protected Activity f13702k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected String f60662toq;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.g$k */
    /* JADX INFO: compiled from: RecommendSearchHotView.java */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f13703k;

        k(final String val$title) {
            this.f13703k = val$title;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2357g.this.f13702k.startActivity(com.android.thememanager.toq.ld6(C2357g.this.f60662toq, this.f13703k));
        }
    }

    public C2357g(Activity activity, String resCode) {
        this.f13702k = activity;
        this.f60662toq = resCode;
    }

    private int toq(String title) {
        int iHashCode;
        return C1819o.d2ok(this.f13702k) ? R.drawable.resource_recommend_item_text_night_bg : (TextUtils.isEmpty(title) || (iHashCode = ((title.hashCode() % 5) + 5) % 5) == 0) ? R.drawable.resource_recommend_item_text_bg : iHashCode != 1 ? iHashCode != 2 ? iHashCode != 3 ? iHashCode != 4 ? R.drawable.resource_recommend_item_text_bg : R.drawable.resource_recommend_item_text_bg_4 : R.drawable.resource_recommend_item_text_bg_3 : R.drawable.resource_recommend_item_text_bg_2 : R.drawable.resource_recommend_item_text_bg_1;
    }

    private ColorStateList zy() {
        return this.f13702k.getResources().getColorStateList(R.color.resource_search_hotword_text_color);
    }

    /* JADX INFO: renamed from: k */
    public View m8534k(String title) {
        if (TextUtils.isEmpty(title)) {
            return null;
        }
        View viewM8535q = m8535q(title);
        viewM8535q.setOnClickListener(new k(title));
        return viewM8535q;
    }

    /* JADX INFO: renamed from: q */
    public View m8535q(String title) {
        View viewInflate = LayoutInflater.from(this.f13702k).inflate(R.layout.rc_resource_recommend_item_text, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        textView.setText(title);
        textView.setBackgroundResource(toq(title));
        textView.setTextColor(zy());
        C6077k.m22369i(textView);
        return viewInflate;
    }
}
