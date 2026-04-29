package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.fn3e;
import zy.dd;

/* JADX INFO: loaded from: classes.dex */
public class ThemeTextView extends TextView {

    /* JADX INFO: renamed from: k */
    private boolean f10579k;

    public ThemeTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7329k() {
        if (this.f10579k && o1t.fn3e()) {
            setTextSize(0, getResources().getDimension(R.dimen.elder_mode_text_size));
        }
    }

    public ThemeTextView(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemeTextView(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public ThemeTextView(Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, fn3e.C2036i.ax0p);
        this.f10579k = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m7329k();
    }
}
