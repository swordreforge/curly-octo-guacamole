package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gb.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.core.util.ld6;

/* JADX INFO: compiled from: ActionMenuItemViewChildren.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: n */
    private static final int f39493n = 28;

    /* JADX INFO: renamed from: k */
    private int f39494k;

    /* JADX INFO: renamed from: q */
    private LinearLayout f39495q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ImageView f87004toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private TextView f87005zy;

    public zy(LinearLayout linearLayout) {
        this.f39495q = linearLayout;
        Context context = linearLayout.getContext();
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        View.inflate(context, toq.qrj.f34943e, linearLayout);
        this.f87004toq = (ImageView) linearLayout.findViewById(toq.C6054p.f34887a);
        this.f87005zy = (TextView) linearLayout.findViewById(toq.C6054p.f76467zp);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f87004toq.setForceDarkAllowed(false);
        }
        this.f39494k = context.getResources().getDisplayMetrics().densityDpi;
        Folme.useAt(linearLayout).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, ITouchStyle.TouchType.DOWN).setAlpha(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(linearLayout, new AnimConfig[0]);
        Folme.useAt(linearLayout).hover().setAlpha(1.0f, new IHoverStyle.HoverType[0]).setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(linearLayout, new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: g */
    public void m25317g(CharSequence charSequence) {
        this.f87005zy.setText(charSequence);
    }

    /* JADX INFO: renamed from: k */
    void m25318k(Configuration configuration) {
        int i2 = configuration.densityDpi;
        if (i2 != this.f39494k) {
            this.f39494k = i2;
            Context context = this.f87004toq.getContext();
            int iM25581q = ld6.m25581q(context, 28.0f);
            this.f87004toq.setLayoutParams(new LinearLayout.LayoutParams(iM25581q, iM25581q));
            this.f87005zy.setTextSize(0, context.getResources().getDimension(toq.f7l8.jl));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m25319n(boolean z2) {
        this.f87004toq.setSelected(z2);
        this.f87005zy.setSelected(z2);
    }

    /* JADX INFO: renamed from: q */
    public void m25320q(Drawable drawable) {
        if (this.f87004toq.getDrawable() != drawable) {
            this.f87004toq.setImageDrawable(drawable);
        }
    }

    public void toq(CharSequence charSequence) {
        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            this.f39495q.setContentDescription(this.f87005zy.getText());
        } else {
            this.f39495q.setContentDescription(charSequence);
        }
    }

    public void zy(boolean z2) {
        this.f87004toq.setEnabled(z2);
        this.f87005zy.setEnabled(z2);
    }
}
