package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.fn3e;
import com.android.thememanager.util.dd;
import zy.lvui;
import zy.n7h;

/* JADX INFO: loaded from: classes.dex */
public class DiscountPriceView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private float f10546g;

    /* JADX INFO: renamed from: k */
    private TextView f10547k;

    /* JADX INFO: renamed from: n */
    private float f10548n;

    /* JADX INFO: renamed from: q */
    private TextView f10549q;

    /* JADX INFO: renamed from: s */
    private int f10550s;

    /* JADX INFO: renamed from: y */
    private int f10551y;

    public DiscountPriceView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7315k() {
        this.f10551y = getResources().getColor(R.color.resource_secondary_color_v11);
        this.f10550s = getResources().getColor(R.color.resource_secondary_color_v11);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.card_resource_item_price_view, (ViewGroup) this, true);
        this.f10547k = (TextView) viewInflate.findViewById(R.id.origin_price);
        this.f10549q = (TextView) viewInflate.findViewById(R.id.discounted_price);
        if (o1t.n7h()) {
            this.f10547k.setTypeface(Typeface.create(dd.f16402k, 0));
        }
    }

    /* JADX INFO: renamed from: q */
    private void m7316q(int currentPrice) {
        this.f10547k.setVisibility(8);
        this.f10549q.setText(C1815m.toq(getContext(), currentPrice));
        this.f10549q.setTextColor(this.f10551y);
        this.f10549q.setVisibility(0);
    }

    private void toq(int originPrice, int currentPrice) {
        this.f10547k.setText(C1815m.toq(getContext(), originPrice));
        this.f10547k.setTextColor(this.f10551y);
        this.f10547k.setBackgroundResource(R.drawable.resource_strickout);
        this.f10547k.setVisibility(0);
        this.f10549q.setText(C1815m.toq(getContext(), currentPrice));
        this.f10549q.setTextColor(this.f10550s);
        this.f10549q.setVisibility(0);
    }

    private void zy() {
        this.f10547k.setVisibility(8);
        this.f10549q.setText(R.string.resource_price_free);
        this.f10549q.setTextColor(this.f10550s);
        this.f10549q.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f10549q.setFallbackLineSpacing(false);
        }
    }

    public TextView getCurrentPriceView() {
        return this.f10549q;
    }

    public TextView getOriginPriceView() {
        return this.f10547k;
    }

    public void setPrice(int originPrice, int currentPrice) {
        if (originPrice < 0 || currentPrice < 0) {
            setVisibility(4);
            return;
        }
        if (originPrice == 0 && currentPrice == 0) {
            zy();
        } else if (currentPrice < originPrice) {
            toq(originPrice, currentPrice);
        } else {
            m7316q(currentPrice);
        }
        setVisibility(0);
    }

    public void setTextStyle(float originSize, float currentSize, @n7h int originColor, @n7h int currentColor) {
        this.f10547k.setTextSize(0, originSize);
        this.f10547k.setTextColor(getResources().getColor(originColor));
        this.f10549q.setTextSize(0, currentSize);
        this.f10549q.setTextColor(getResources().getColor(currentColor));
    }

    public DiscountPriceView(@lvui Context context, @zy.dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DiscountPriceView(@lvui Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        float f2 = getResources().getDisplayMetrics().scaledDensity;
        this.f10548n = 8.0f * f2;
        this.f10546g = f2 * 11.6f;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, fn3e.C2036i.ch1s, 0, 0);
            try {
                this.f10548n = typedArrayObtainStyledAttributes.getDimension(1, this.f10548n);
                this.f10546g = typedArrayObtainStyledAttributes.getDimension(0, this.f10546g);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        m7315k();
    }
}
