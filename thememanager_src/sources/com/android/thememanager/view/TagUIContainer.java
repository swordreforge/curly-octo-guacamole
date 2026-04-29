package com.android.thememanager.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TagUIContainer extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private int f17471k;

    /* JADX INFO: renamed from: n */
    private toq f17472n;

    /* JADX INFO: renamed from: q */
    private int f17473q;

    /* JADX INFO: renamed from: com.android.thememanager.view.TagUIContainer$k */
    class ViewOnClickListenerC2907k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f17474k;

        ViewOnClickListenerC2907k(final int val$position) {
            this.f17474k = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (TagUIContainer.this.f17472n != null) {
                TagUIContainer.this.f17472n.m10313k(this.f17474k);
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m10313k(int position);
    }

    public TagUIContainer(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int measuredWidth = getChildAt(i3).getMeasuredWidth();
            int measuredHeight = getChildAt(i3).getMeasuredHeight();
            View childAt = getChildAt(i3);
            i2 += measuredWidth;
            if (i2 < r2 - l2) {
                childAt.layout(i2 - measuredWidth, 0, i2, measuredHeight);
                i2 += this.f17471k;
            }
        }
    }

    public void setOnTagItemClickListener(toq onTagItemClickListener) {
        this.f17472n = onTagItemClickListener;
    }

    public void toq(final List<String> tagContents) {
        removeAllViews();
        int size = tagContents.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = new TextView(getContext());
            textView.setText(tagContents.get(i2));
            textView.setTextColor(getResources().getColor(R.color.tag_ui_text_color));
            textView.setTextSize(0, this.f17473q);
            textView.setBackgroundResource(R.drawable.tag_ui_bg);
            addView(textView);
            textView.setOnClickListener(new ViewOnClickListenerC2907k(i2));
        }
    }

    public TagUIContainer(Context context, @zy.dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TagUIContainer(Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17473q = context.getResources().getDimensionPixelSize(R.dimen.tagui_text_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.nqib);
        this.f17471k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 10);
        typedArrayObtainStyledAttributes.recycle();
    }
}
