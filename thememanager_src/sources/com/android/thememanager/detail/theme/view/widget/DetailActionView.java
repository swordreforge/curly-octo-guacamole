package com.android.thememanager.detail.theme.view.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import i1.C6077k;
import zy.dd;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DetailActionView extends FrameLayout {

    /* JADX INFO: renamed from: k */
    private ImageView f11211k;

    /* JADX INFO: renamed from: q */
    private TextView f11212q;

    public DetailActionView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7756k(@dd Drawable drawable, @dd String text) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.de_action_view, (ViewGroup) this, true);
        this.f11211k = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f11212q = (TextView) viewInflate.findViewById(R.id.text);
        if (drawable != null) {
            this.f11211k.setImageDrawable(drawable);
        }
        if (!TextUtils.isEmpty(text)) {
            this.f11212q.setText(text);
        }
        C6077k.f7l8(this);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f11211k.isSelected();
    }

    public void setDynamicResource(Activity activity, @fn3e int drawableRes, @zy.n7h int colorRes) {
        com.android.thememanager.basemodule.imageloader.x2.zy(activity, Integer.valueOf(drawableRes), this.f11211k);
        this.f11212q.setTextColor(getResources().getColor(colorRes));
    }

    public void setInfo(boolean selected, @dd String text) {
        this.f11211k.setSelected(selected);
        this.f11212q.setSelected(selected);
        if (!TextUtils.isEmpty(text)) {
            this.f11212q.setText(text);
        }
        this.f11212q.setTextColor(getResources().getColor(selected ? R.color.de_color_100_fcbb50 : R.color.de_color_70_000000));
    }

    public DetailActionView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DetailActionView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.y3rt);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        m7756k(drawable, string);
    }
}
