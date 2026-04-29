package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import gb.toq;
import miuix.appcompat.internal.view.C7010k;

/* JADX INFO: loaded from: classes3.dex */
public class CollapseTabContainer extends ScrollingTabContainerView {
    public CollapseTabContainer(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getDefaultTabTextStyle() {
        return R.attr.actionBarTabTextStyle;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabBarLayoutRes() {
        return toq.qrj.f34950l;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabContainerHeight() {
        return C7010k.toq(getContext()).m25256g();
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabViewLayoutRes() {
        return toq.qrj.f76692dd;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabViewMarginHorizontal() {
        return 0;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public View kja0(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        ViewParent parent = view.getParent();
        if (parent != this) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        return view;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.f39155s.getMeasuredHeight();
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.f39155s.layout(i2, i6, this.f39155s.getMeasuredWidth(), measuredHeight2 + i6);
    }
}
