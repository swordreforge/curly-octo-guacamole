package com.android.thememanager.detail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.fn3e;
import com.bumptech.glide.zy;
import i1.C6077k;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class VerticalFlipView extends FrameLayout {

    /* JADX INFO: renamed from: q */
    private static final String f11600q = VerticalFlipView.class.getName();

    /* JADX INFO: renamed from: k */
    private ViewFlipper f11601k;

    public VerticalFlipView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7894k(int resId) {
        ImageView imageView = new ImageView(getContext());
        zy.a9(getContext()).ki(Integer.valueOf(resId)).ixz(imageView);
        this.f11601k.addView(imageView);
    }

    private void zy(String title) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.de_vertical_flip_view, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title)).setText(title);
        this.f11601k = (ViewFlipper) viewInflate.findViewById(R.id.view_flipper);
        C6077k.f7l8(this);
    }

    public void toq(List<Integer> resIds) {
        if (kja0.qrj(resIds)) {
            this.f11601k.setBackgroundResource(R.drawable.de_icon_theme_detail_share);
            Log.d(f11600q, "installed packages for share is empty.");
        } else {
            if (resIds.size() == 1) {
                this.f11601k.setBackgroundResource(resIds.get(0).intValue());
                return;
            }
            Iterator<Integer> it = resIds.iterator();
            while (it.hasNext()) {
                m7894k(it.next().intValue());
            }
            this.f11601k.startFlipping();
        }
    }

    public VerticalFlipView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VerticalFlipView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.y3rt);
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        zy(string);
    }
}
