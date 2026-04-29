package com.android.thememanager.detail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.x2;
import com.android.thememanager.fn3e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class LikeCountBubble extends FrameLayout {

    /* JADX INFO: renamed from: s */
    public static final int f11579s = 2;

    /* JADX INFO: renamed from: y */
    public static final int f11580y = 1;

    /* JADX INFO: renamed from: g */
    private float f11581g;

    /* JADX INFO: renamed from: k */
    private ImageView f11582k;

    /* JADX INFO: renamed from: n */
    private int f11583n;

    /* JADX INFO: renamed from: q */
    private TextView f11584q;

    /* JADX INFO: renamed from: com.android.thememanager.detail.widget.LikeCountBubble$k */
    @Retention(RetentionPolicy.SOURCE)
    @interface InterfaceC2032k {
    }

    public LikeCountBubble(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7888k() {
        this.f11582k = new ImageView(getContext());
        addView(this.f11582k, new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(getContext());
        this.f11584q = textView;
        textView.setTextColor(getResources().getColor(R.color.de_like_text_color));
        this.f11584q.setTextSize(0, this.f11581g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams.bottomMargin = C1819o.qrj(6.0f);
        addView(this.f11584q, layoutParams);
        toq();
        setVisibility(4);
    }

    private void toq() {
        if (this.f11583n == 1) {
            this.f11582k.setImageResource(R.drawable.like_count_light_bg);
            this.f11584q.setTextColor(-16777216);
        } else {
            this.f11582k.setImageResource(R.drawable.like_count_dark_bg);
            this.f11584q.setTextColor(getResources().getColor(R.color.de_like_text_color));
        }
    }

    public void setCount(boolean isLike, int count) {
        if (isLike) {
            setVisibility(4);
        } else {
            this.f11584q.setText(x2.zy(count));
            setVisibility(0);
        }
    }

    public void setStyle(int style) {
        this.f11583n = style;
        toq();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
    }

    public LikeCountBubble(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LikeCountBubble(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11583n = 1;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, fn3e.C2036i.byf, 0, 0);
            try {
                this.f11583n = typedArrayObtainStyledAttributes.getBoolean(1, false) ? 2 : 1;
                this.f11581g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.de_support_text_count_size));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.f11581g = getContext().getResources().getDimensionPixelSize(R.dimen.de_support_text_count_size);
        }
        m7888k();
    }
}
