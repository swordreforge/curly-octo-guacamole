package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class LoadingView extends FrameLayout {
    public LoadingView(@lvui Context context) {
        this(context, null);
    }

    public LoadingView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.wgc);
        String string = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        ((TextView) LayoutInflater.from(getContext()).inflate(R.layout.loading_view_layout, (ViewGroup) this, true).findViewById(R.id.loading_title_tv)).setText(string);
    }
}
