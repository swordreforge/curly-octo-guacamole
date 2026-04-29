package com.android.thememanager.settings.personalize.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.t8r;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import miuix.smooth.SmoothFrameLayout2;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FontCardView extends SmoothFrameLayout2 {

    /* JADX INFO: renamed from: l */
    private TextView f15313l;

    public FontCardView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: s */
    private void m9107s() {
        this.f15313l = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.personalize_font_card_view, (ViewGroup) this, true).findViewById(R.id.font_card_title);
        m9108y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0("personalize", "personalize_font_card", ""));
        }
    }

    /* JADX INFO: renamed from: y */
    public void m9108y() {
        if (p001b.toq.t8r("fonts").equals(C1792n.toq(getContext(), "fonts"))) {
            this.f15313l.setText(R.string.personalize_default_font);
            setContentDescription(getResources().getString(R.string.personalize_default_font));
        } else {
            this.f15313l.setText(R.string.personalize_third_font);
            setContentDescription(getResources().getString(R.string.personalize_third_font));
        }
        this.f15313l.setMaxLines(2);
        t8r.ki(this.f15313l, 10, 22, 2, 2);
    }

    public FontCardView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FontCardView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m9107s();
    }
}
