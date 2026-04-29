package miuix.miuixbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import p023g.C6045k;
import vwb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class MessageView extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private int f40611g;

    /* JADX INFO: renamed from: k */
    private TextView f40612k;

    /* JADX INFO: renamed from: n */
    private Drawable f40613n;

    /* JADX INFO: renamed from: q */
    private boolean f40614q;

    /* JADX INFO: renamed from: y */
    private toq f40615y;

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.MessageView$k */
    class ViewOnClickListenerC7194k implements View.OnClickListener {
        ViewOnClickListenerC7194k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Folme.useAt(view).visible().setFlags(1L).hide(new AnimConfig[0]);
            MessageView.this.setVisibility(8);
            if (MessageView.this.f40615y != null) {
                MessageView.this.f40615y.m26101k();
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m26101k();
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void toq() {
        View imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(toq.f7l8.f95646h4b));
        imageView.setId(toq.C7714s.f96732py);
        imageView.setBackground(this.f40613n);
        imageView.setContentDescription(getContext().getResources().getString(toq.qrj.f44873t));
        imageView.setOnClickListener(new ViewOnClickListenerC7194k());
        addView(imageView, layoutParams);
        Folme.useAt(imageView).touch().handleTouchOf(imageView, new AnimConfig[0]);
    }

    private void zy(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.lptj, i2, toq.n7h.qyk);
        String string = typedArrayObtainStyledAttributes.getString(toq.kja0.u3);
        ColorStateList colorStateListM22274k = C6045k.m22274k(context, typedArrayObtainStyledAttributes.getResourceId(toq.kja0.nvn, toq.C7709g.f95882r25n));
        this.f40613n = C6045k.toq(context, typedArrayObtainStyledAttributes.getResourceId(toq.kja0.mmdq, toq.C7715y.ff));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.ly, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f40612k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        this.f40612k.setId(R.id.text1);
        this.f40612k.setPaddingRelative(getResources().getDimensionPixelSize(toq.f7l8.f95724wlev), 0, 0, 0);
        this.f40612k.setText(string);
        this.f40612k.setTextColor(colorStateListM22274k);
        this.f40612k.setTextSize(0, getResources().getDimensionPixelSize(toq.f7l8.f95640ga));
        this.f40612k.setTextDirection(5);
        addView(this.f40612k, layoutParams);
        setClosable(z2);
        setGravity(16);
        Folme.useAt(this).touch().setTintMode(0).setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED).handleHoverOf(this, new AnimConfig[0]);
    }

    public void setClosable(boolean z2) {
        View viewFindViewById = findViewById(toq.C7714s.f96732py);
        if (z2) {
            if (viewFindViewById == null) {
                toq();
            }
        } else if (viewFindViewById != null) {
            removeView(viewFindViewById);
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f40612k.setText(charSequence);
    }

    public void setOnMessageViewCloseListener(toq toqVar) {
        this.f40615y = toqVar;
    }

    public MessageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        zy(context, attributeSet, i2);
    }
}
