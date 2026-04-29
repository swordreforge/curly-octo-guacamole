package miuix.androidbasewidget.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class SingleCenterTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: p */
    private boolean f38691p;

    public SingleCenterTextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f38691p && getLayout().getLineCount() == 1 && getGravity() != 1) {
            setGravity(1);
        }
    }

    public void setEnableSingleCenter(boolean z2) {
        this.f38691p = z2;
    }

    public SingleCenterTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleCenterTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}
