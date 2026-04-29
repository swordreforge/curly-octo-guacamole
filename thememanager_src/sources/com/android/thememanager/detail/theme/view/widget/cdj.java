package com.android.thememanager.detail.theme.view.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;

/* JADX INFO: compiled from: ResourceInfoPopup.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj extends PopupWindow {

    /* JADX INFO: renamed from: k */
    private View f11363k;

    public cdj(Context context, String title, float score, String description, String changelog, int height, boolean hideScore) {
        setContentView(toq(context, title, score, description, changelog, hideScore));
        setWidth(-1);
        setHeight(height);
        setFocusable(true);
        setOutsideTouchable(false);
    }

    private View toq(Context context, String title, float score, String description, String changelog, boolean hideScore) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.de_theme_info_popup, (ViewGroup) null);
        this.f11363k = viewInflate;
        ((TextView) viewInflate.findViewById(R.id.title)).setText(title);
        this.f11363k.findViewById(R.id.hide).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.detail.theme.view.widget.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11368k.zy(view);
            }
        });
        m7814q(hideScore, score);
        DetailExpandableInfo detailExpandableInfo = (DetailExpandableInfo) this.f11363k.findViewById(R.id.description);
        if (TextUtils.isEmpty(description)) {
            detailExpandableInfo.setVisibility(8);
        } else {
            detailExpandableInfo.setInfo(context.getString(R.string.description_summary), description);
        }
        DetailExpandableInfo detailExpandableInfo2 = (DetailExpandableInfo) this.f11363k.findViewById(R.id.changelog);
        if (TextUtils.isEmpty(changelog)) {
            detailExpandableInfo2.setVisibility(8);
        } else {
            detailExpandableInfo2.setInfo(context.getString(R.string.resource_detail_update_log_title), changelog);
        }
        return this.f11363k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zy(View view) {
        dismiss();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        if (getContentView() != null && (getContentView().getContext() instanceof Activity) && y9n.m7258z() && C1819o.d3() && C1819o.eqxt((Activity) getContentView().getContext())) {
            o1t.fti((Activity) getContentView().getContext(), true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m7814q(boolean hideScore, float score) {
        DetailInfoStar detailInfoStar = (DetailInfoStar) this.f11363k.findViewById(R.id.star);
        TextView textView = (TextView) this.f11363k.findViewById(R.id.score);
        if (hideScore || score < 0.0f) {
            detailInfoStar.setVisibility(8);
            textView.setVisibility(8);
        } else {
            detailInfoStar.setScore((int) score);
            textView.setText(String.valueOf(score));
            detailInfoStar.setVisibility(0);
            textView.setVisibility(0);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View parent, int gravity, int x3, int y3) {
        super.showAtLocation(parent, gravity, x3, y3);
        if (parent == null || (!(parent.getContext() instanceof Activity) || !y9n.m7258z()) || !C1819o.d3() || !C1819o.eqxt((Activity) parent.getContext())) {
            return;
        }
        o1t.fti((Activity) parent.getContext(), false);
    }
}
