package com.theme.loopwallpaper.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import i1.C6077k;
import zy.fn3e;

/* JADX INFO: renamed from: com.theme.loopwallpaper.view.k */
/* JADX INFO: compiled from: PreferenceItemView.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5449k {

    /* JADX INFO: renamed from: g */
    private ImageView f30409g;

    /* JADX INFO: renamed from: k */
    public View f30410k;

    /* JADX INFO: renamed from: n */
    private View f30411n;

    /* JADX INFO: renamed from: q */
    private ImageView f30412q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private TextView f72575toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private TextView f72576zy;

    public C5449k(View root) {
        this.f30410k = root;
        this.f72575toq = (TextView) root.findViewById(R.id.title);
        this.f72576zy = (TextView) this.f30410k.findViewById(R.id.summary);
        this.f30412q = (ImageView) this.f30410k.findViewById(R.id.icon);
        this.f30411n = this.f30410k.findViewById(R.id.new_message);
        this.f30409g = (ImageView) this.f30410k.findViewById(R.id.arrow);
        C6077k.ld6(this.f30410k);
    }

    public void f7l8(String summary) {
        this.f72576zy.setText(summary);
    }

    /* JADX INFO: renamed from: g */
    public void m18558g(int id) {
        this.f72576zy.setText(id);
    }

    /* JADX INFO: renamed from: k */
    public void m18559k() {
        this.f30412q.setVisibility(8);
    }

    public void kja0(boolean show) {
        if ((this.f30410k.getVisibility() == 0) != show) {
            this.f30410k.setVisibility(show ? 0 : 8);
        }
    }

    public void ld6(int color) {
        this.f72575toq.setTextColor(color);
    }

    /* JADX INFO: renamed from: n */
    public void m18560n(@fn3e int id) {
        this.f30412q.setImageResource(id);
    }

    public void n7h(boolean visibility) {
        if (visibility) {
            this.f30411n.setVisibility(0);
        } else {
            this.f30411n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m18561p(int resId) {
        this.f72575toq.setText(resId);
    }

    /* JADX INFO: renamed from: q */
    public void m18562q(int resId) {
        this.f30409g.setImageResource(resId);
    }

    public void qrj(float spSize) {
        this.f72575toq.setTextSize(2, spSize);
    }

    /* JADX INFO: renamed from: s */
    public void m18563s(float spSize) {
        this.f72576zy.setTextSize(2, spSize);
    }

    public void toq() {
        this.f30410k.setVisibility(8);
    }

    public void x2(int marginStart) {
        ((LinearLayout.LayoutParams) this.f72575toq.getLayoutParams()).setMarginStart(marginStart);
    }

    /* JADX INFO: renamed from: y */
    public void m18564y(int color) {
        this.f72576zy.setTextColor(color);
    }

    public void zy(int marginEnd) {
        ((LinearLayout.LayoutParams) this.f30409g.getLayoutParams()).setMarginEnd(marginEnd);
    }
}
