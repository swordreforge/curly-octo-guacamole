package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import gb.toq;
import miuix.appcompat.internal.app.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes3.dex */
public class ExpandTabContainer extends ScrollingTabContainerView {

    /* JADX INFO: renamed from: u */
    private int[] f39136u;

    public ExpandTabContainer(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
        this.f39136u = new int[]{context.getResources().getDimensionPixelSize(toq.f7l8.f46236do), 0, 0};
        this.f39136u[1] = context.getResources().getDimensionPixelSize(toq.f7l8.f75526ukdy);
        this.f39136u[2] = context.getResources().getDimensionPixelSize(toq.f7l8.f75404ebn);
    }

    private void ki(int[] iArr, int i2, int i3) {
        int i4 = iArr[0];
        int tabViewMarginHorizontal = getTabViewMarginHorizontal();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            i4 = iArr[i5];
            TextPaint textPaint = null;
            int iMeasureText = 0;
            for (int i6 = 0; i6 < this.f39155s.getChildCount(); i6++) {
                TextView textView = ((ScrollingTabContainerView.TabView) this.f39155s.getChildAt(i6)).getTextView();
                if (textView != null) {
                    if (textPaint == null) {
                        textPaint = new TextPaint(textView.getPaint());
                        iMeasureText += tabViewMarginHorizontal;
                    }
                    textPaint.setTextSize(i4);
                    iMeasureText = (int) (iMeasureText + textPaint.measureText(textView.getText().toString()));
                }
            }
            if (iMeasureText <= Math.max(getMeasuredWidth(), View.MeasureSpec.getSize(i2))) {
                break;
            }
        }
        for (int i7 = 0; i7 < this.f39155s.getChildCount(); i7++) {
            TextView textView2 = ((ScrollingTabContainerView.TabView) this.f39155s.getChildAt(i7)).getTextView();
            if (textView2 != null) {
                textView2.setTextSize(0, i4);
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getDefaultTabTextStyle() {
        return toq.C6055q.f76483bf2;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabBarLayoutRes() {
        return toq.qrj.f76710hyr;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabContainerHeight() {
        return -2;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabViewLayoutRes() {
        return toq.qrj.f76768x9kr;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    int getTabViewMarginHorizontal() {
        return getContext().getResources().getDimensionPixelOffset(toq.f7l8.f75443ixz);
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        ki(this.f39136u, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0), i3);
        super.onMeasure(i2, i3);
    }
}
