package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import androidx.core.content.C0498q;
import kbj.toq;
import miuix.androidbasewidget.widget.StateEditText;
import miuix.internal.util.C7164n;

/* JADX INFO: loaded from: classes3.dex */
public class PasswordWidgetManager extends StateEditText.AbstractC6833k {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private boolean mIsChecked;
    private StateEditText mMaster;
    private Drawable mWidgetDrawable;

    public PasswordWidgetManager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsChecked = false;
        Drawable drawableM25952s = C7164n.m25952s(context, toq.zy.f81721tjz5);
        this.mWidgetDrawable = drawableM25952s;
        if (drawableM25952s == null) {
            if (C7164n.m25951q(context, R.attr.isLightTheme, true)) {
                this.mWidgetDrawable = C0498q.m2259s(context, toq.f7l8.f80597xtb7);
            } else {
                this.mWidgetDrawable = C0498q.m2259s(context, toq.f7l8.f80547pnt2);
            }
        }
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.AbstractC6833k
    public Drawable[] getWidgetDrawables() {
        return new Drawable[]{this.mWidgetDrawable};
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.AbstractC6833k
    public void onAttached(StateEditText stateEditText) {
        this.mMaster = stateEditText;
        if (stateEditText != null) {
            stateEditText.setTransformationMethod(this.mIsChecked ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
        }
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.AbstractC6833k
    protected void onDetached() {
        super.onDetached();
        StateEditText stateEditText = this.mMaster;
        if (stateEditText != null) {
            stateEditText.setTransformationMethod(null);
        }
    }

    @Override // miuix.androidbasewidget.widget.StateEditText.AbstractC6833k
    public void onWidgetClick(int i2) {
        this.mIsChecked = !this.mIsChecked;
        StateEditText stateEditText = this.mMaster;
        if (stateEditText != null) {
            int selectionStart = stateEditText.getSelectionStart();
            int selectionEnd = this.mMaster.getSelectionEnd();
            this.mMaster.setTransformationMethod(this.mIsChecked ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
            this.mMaster.setTextDirection(2);
            this.mMaster.setSelection(selectionStart, selectionEnd);
        }
        this.mWidgetDrawable.setState(this.mIsChecked ? CHECKED_STATE_SET : new int[0]);
    }
}
