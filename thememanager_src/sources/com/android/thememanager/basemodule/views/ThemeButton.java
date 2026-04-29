package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.fn3e;

/* JADX INFO: loaded from: classes.dex */
public class ThemeButton extends Button {

    /* JADX INFO: renamed from: k */
    private boolean f10569k;

    public ThemeButton(Context context) {
        super(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7324k() {
        if (this.f10569k && o1t.fn3e()) {
            setTextSize(0, getResources().getDimension(R.dimen.elder_mode_text_size));
        }
    }

    public ThemeButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public ThemeButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, fn3e.C2036i.hx);
        this.f10569k = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m7324k();
    }
}
