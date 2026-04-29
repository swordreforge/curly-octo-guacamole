package com.android.thememanager.recommend.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class TagUIContainer extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private int f14559k;

    /* JADX INFO: renamed from: n */
    private toq f14560n;

    /* JADX INFO: renamed from: q */
    private int f14561q;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.TagUIContainer$k */
    class ViewOnClickListenerC2460k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f14562k;

        ViewOnClickListenerC2460k(final int val$position) {
            this.f14562k = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (TagUIContainer.this.f14560n != null) {
                TagUIContainer.this.f14560n.mo8755k(this.f14562k);
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo8755k(int position);
    }

    public TagUIContainer(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                int measuredWidth = getChildAt(i3).getMeasuredWidth();
                int measuredHeight = getChildAt(i3).getMeasuredHeight();
                View childAt = getChildAt(i3);
                i2 += measuredWidth;
                if (i2 < r2 - l2) {
                    childAt.layout(i2 - measuredWidth, 0, i2, measuredHeight);
                    i2 += this.f14559k;
                }
            }
            return;
        }
        if (layoutDirection != 1) {
            return;
        }
        int i4 = r2 - l2;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int measuredWidth2 = getChildAt(i5).getMeasuredWidth();
            int measuredHeight2 = getChildAt(i5).getMeasuredHeight();
            View childAt2 = getChildAt(i5);
            i4 -= measuredWidth2;
            if (i4 > l2) {
                childAt2.layout(i4, 0, measuredWidth2 + i4, measuredHeight2);
                i4 -= this.f14559k;
            }
        }
    }

    public void setOnTagItemClickListener(toq onTagItemClickListener) {
        this.f14560n = onTagItemClickListener;
    }

    public void toq(final List<String> tagContents) {
        removeAllViews();
        int size = tagContents.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = new TextView(getContext());
            textView.setText(tagContents.get(i2));
            textView.setTextColor(getResources().getColor(R.color.tag_ui_text_color));
            textView.setTextSize(0, this.f14561q);
            textView.setBackgroundResource(R.drawable.tag_ui_bg);
            addView(textView);
            textView.setOnClickListener(new ViewOnClickListenerC2460k(i2));
        }
    }

    public TagUIContainer(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TagUIContainer(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14561q = context.getResources().getDimensionPixelSize(R.dimen.tagui_text_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.nqib);
        this.f14559k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 10);
        typedArrayObtainStyledAttributes.recycle();
    }
}
