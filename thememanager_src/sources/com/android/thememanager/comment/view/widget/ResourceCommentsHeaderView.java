package com.android.thememanager.comment.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentsHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private TextView f10819k;

    /* JADX INFO: renamed from: n */
    private RatingBar f10820n;

    /* JADX INFO: renamed from: q */
    private TextView f10821q;

    public ResourceCommentsHeaderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7445k() {
        View.inflate(getContext(), R.layout.resource_comment_header, this);
        this.f10819k = (TextView) findViewById(R.id.score);
        this.f10820n = (RatingBar) findViewById(R.id.ratingbar);
        this.f10821q = (TextView) findViewById(R.id.comment_total_count);
    }

    private void setScoreTextStyle(boolean scale) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10819k.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!scale) {
            this.f10819k.setTextSize(0, getResources().getDimension(R.dimen.de_resource_text_font_size_comment_score));
            this.f10819k.setTextColor(getResources().getColor(R.color.de_resource_comment_primary_color));
            layoutParams.bottomMargin = C1819o.qrj(-2.0f);
        } else {
            this.f10819k.setTextSize(0, getResources().getDimension(R.dimen.de_resource_text_font_size_comment_total_score_count));
            this.f10819k.setTextColor(getResources().getColor(R.color.resource_comment_text_color));
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = (int) getResources().getDimension(R.dimen.de_comment_header_margin_top);
            layoutParams.gravity = 16;
        }
    }

    public void setCommentsScore(int commentCount, float score) {
        if (score == 0.0f || score == Float.NaN) {
            this.f10819k.setText(R.string.resource_comment_no_average_score);
            setScoreTextStyle(true);
            this.f10820n.setRating(0.0f);
        } else {
            this.f10819k.setText(String.format("%.1f", Float.valueOf(score)));
            setScoreTextStyle(false);
            this.f10820n.setRating(score);
        }
        this.f10821q.setText(getContext().getResources().getQuantityString(R.plurals.resource_comment_score_count, commentCount, Integer.valueOf(commentCount)));
    }

    public ResourceCommentsHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ResourceCommentsHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f10819k = null;
        this.f10821q = null;
        this.f10820n = null;
        m7445k();
    }
}
