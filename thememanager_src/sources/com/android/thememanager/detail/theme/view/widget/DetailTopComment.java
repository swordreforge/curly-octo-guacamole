package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.zurt;
import i1.C6077k;
import java.util.Calendar;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class DetailTopComment extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private TextView f11227g;

    /* JADX INFO: renamed from: h */
    private LinearLayout f11228h;

    /* JADX INFO: renamed from: k */
    private View f11229k;

    /* JADX INFO: renamed from: n */
    private TextView f11230n;

    /* JADX INFO: renamed from: p */
    private TextView f11231p;

    /* JADX INFO: renamed from: q */
    private View f11232q;

    /* JADX INFO: renamed from: s */
    private TextView f11233s;

    /* JADX INFO: renamed from: y */
    private DetailCommentStar f11234y;

    public DetailTopComment(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7765k() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getResources().getColor(R.color.sub_comment_bg));
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.de_detail_corner_radius));
        setBackground(gradientDrawable);
        View viewInflate = LayoutInflater.from(getContext()).inflate(zurt.m7261k(R.layout.de_detail_top_comment, R.layout.de_detail_top_comment_elder), (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.top_comment_container);
        this.f11229k = viewFindViewById;
        this.f11230n = (TextView) viewFindViewById.findViewById(R.id.comment_name);
        this.f11227g = (TextView) this.f11229k.findViewById(R.id.comment_time);
        this.f11234y = (DetailCommentStar) this.f11229k.findViewById(R.id.comment_star);
        this.f11233s = (TextView) this.f11229k.findViewById(R.id.comment_preview);
        this.f11231p = (TextView) this.f11229k.findViewById(R.id.comment_more);
        this.f11232q = viewInflate.findViewById(R.id.empty_container);
        this.f11228h = (LinearLayout) viewInflate.findViewById(R.id.comment_more_ll);
        C6077k.m22369i(this);
        C6077k.f7l8(this.f11228h);
    }

    public void setInfo(String authorName, long timestamp, float score, String commentContent, int totalCommentCount) {
        if (TextUtils.isEmpty(authorName)) {
            this.f11229k.setVisibility(8);
            this.f11232q.setVisibility(0);
            return;
        }
        this.f11229k.setVisibility(0);
        this.f11232q.setVisibility(8);
        this.f11230n.setText(authorName);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        this.f11227g.setText(getResources().getString(R.string.resource_comment_date, Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))));
        this.f11234y.setScore((int) score);
        this.f11233s.setText(commentContent);
        this.f11231p.setText(getResources().getQuantityString(R.plurals.de_more_comment, totalCommentCount, Integer.valueOf(totalCommentCount)));
    }

    @Override // android.view.View
    public void setOnClickListener(@dd View.OnClickListener l2) {
        super.setOnClickListener(l2);
        this.f11228h.setOnClickListener(l2);
    }

    public DetailTopComment(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DetailTopComment(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7765k();
    }
}
