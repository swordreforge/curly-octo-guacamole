package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import i1.C6077k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MoreResourceBar extends FrameLayout {

    /* JADX INFO: renamed from: q */
    private static final int f11258q = 400;

    /* JADX INFO: renamed from: k */
    private boolean f11259k;

    public MoreResourceBar(@lvui Context context) {
        this(context, null);
    }

    private void toq() {
        LayoutInflater.from(getContext()).inflate(R.layout.de_more_resource, (ViewGroup) this, true);
        C6077k.a9(this);
    }

    @Override // android.view.View
    public boolean isShown() {
        return this.f11259k;
    }

    /* JADX INFO: renamed from: k */
    public void m7776k(boolean noAnimation) {
        this.f11259k = false;
        animate().translationX(0.0f).setDuration(noAnimation ? 0 : 400).start();
    }

    public void zy(boolean noAnimation) {
        this.f11259k = true;
        int i2 = noAnimation ? 0 : 400;
        int i3 = -(getMeasuredWidth() + 22);
        if (getX() < 0.0f) {
            i3 = -i3;
        }
        animate().translationX(i3).setDuration(i2).start();
    }

    public MoreResourceBar(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MoreResourceBar(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        toq();
    }
}
