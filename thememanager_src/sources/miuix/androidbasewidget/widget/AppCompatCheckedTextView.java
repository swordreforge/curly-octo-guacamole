package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import kbj.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class AppCompatCheckedTextView extends androidx.appcompat.widget.AppCompatCheckedTextView {

    /* JADX INFO: renamed from: y */
    private static final String f38616y = "RecyclerView";

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean toq(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            view.setHovered(true);
        } else if (motionEvent.getAction() == 10) {
            view.setHovered(false);
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = (View) getParent();
        boolean z2 = view instanceof ListView;
        boolean z3 = view != null && view.getClass().getSimpleName().contains(f38616y);
        if (!z2 && !z3) {
            Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
        } else {
            if (isClickable()) {
                return;
            }
            if (getForeground() != null) {
                setOnHoverListener(new View.OnHoverListener() { // from class: miuix.androidbasewidget.widget.k
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view2, MotionEvent motionEvent) {
                        return AppCompatCheckedTextView.toq(view2, motionEvent);
                    }
                });
            } else {
                Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
            }
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.n7h.ydj3, i2, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(toq.n7h.qppo, 0);
        if (resourceId != 0) {
            setCheckMarkDrawable(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
