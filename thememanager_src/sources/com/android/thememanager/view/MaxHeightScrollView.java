package com.android.thememanager.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.android.thememanager.fn3e;

/* JADX INFO: loaded from: classes2.dex */
public class MaxHeightScrollView extends ScrollView {

    /* JADX INFO: renamed from: q */
    private static final float f17310q = 100.0f;

    /* JADX INFO: renamed from: k */
    private float f17311k;

    public MaxHeightScrollView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) this.f17311k, Integer.MIN_VALUE));
    }

    public MaxHeightScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaxHeightScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, fn3e.C2036i.u2, 0, 0);
            try {
                this.f17311k = typedArrayObtainStyledAttributes.getDimension(0, f17310q);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }
}
