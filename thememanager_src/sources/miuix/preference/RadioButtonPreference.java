package miuix.preference;

import android.R;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.preference.C1016i;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.preference.kja0;
import miuix.view.C7385p;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes2.dex */
public class RadioButtonPreference extends androidx.preference.CheckBoxPreference implements Checkable, MessageQueue.IdleHandler {
    private static final int zmmu = 28;
    private View bd;
    private boolean bu;
    private InterfaceC7310s tgs;
    private View tlhn;
    private boolean w97r;
    private View yl25;

    /* JADX INFO: renamed from: miuix.preference.RadioButtonPreference$k */
    class C7281k extends View.AccessibilityDelegate {
        C7281k() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(false);
        }
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w97r = true;
        Looper.myQueue().addIdleHandler(this);
    }

    private void pc(CompoundButton compoundButton, boolean z2) {
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable instanceof StateListDrawable) {
            Drawable current = buttonDrawable.getCurrent();
            if (current instanceof AnimatedVectorDrawable) {
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) current;
                if (z2) {
                    if (animatedVectorDrawable.isRunning()) {
                        animatedVectorDrawable.stop();
                        animatedVectorDrawable.reset();
                    }
                    animatedVectorDrawable.start();
                    return;
                }
                if (animatedVectorDrawable.isRunning()) {
                    return;
                }
                animatedVectorDrawable.start();
                animatedVectorDrawable.stop();
            }
        }
    }

    void ij(InterfaceC7310s interfaceC7310s) {
        this.tgs = interfaceC7310s;
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
        View view;
        this.bu = true;
        super.mo4639m();
        if (!this.bu || (view = this.yl25) == null) {
            return;
        }
        HapticCompat.performHapticFeedbackAsync(view, C7385p.f92242jp0y, C7385p.f42280y);
    }

    @Override // androidx.preference.Preference
    public void nn86() {
        super.nn86();
        if (o1t() instanceof RadioSetPreferenceCategory) {
            zsr0(kja0.qrj.f89681ixz);
        } else {
            zsr0(kja0.qrj.f46301do);
        }
    }

    public void nsb(boolean z2) {
        this.w97r = z2;
        View view = this.tlhn;
        if (!(view instanceof TextView) || Build.VERSION.SDK_INT < 28) {
            return;
        }
        ((TextView) view).setFallbackLineSpacing(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        super.mo4638o(c1016i);
        View view = c1016i.itemView;
        this.yl25 = view;
        View viewFindViewById = view.findViewById(R.id.title);
        this.tlhn = viewFindViewById;
        if ((viewFindViewById instanceof TextView) && Build.VERSION.SDK_INT >= 28) {
            ((TextView) viewFindViewById).setFallbackLineSpacing(this.w97r);
        }
        KeyEvent.Callback callback = this.tlhn;
        if (callback instanceof Checkable) {
            ((Checkable) callback).setChecked(isChecked());
        }
        View viewFindViewById2 = view.findViewById(R.id.summary);
        if (viewFindViewById2 instanceof Checkable) {
            ((Checkable) viewFindViewById2).setChecked(isChecked());
        }
        View view2 = this.tlhn;
        if (view2 != null && viewFindViewById2 != 0 && view2.getVisibility() == 0 && viewFindViewById2.getVisibility() == 0) {
            viewFindViewById2.setAccessibilityDelegate(new C7281k());
        }
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        this.bd = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setImportantForAccessibility(2);
            if ((this.bd instanceof CompoundButton) && isChecked()) {
                pc((CompoundButton) this.bd, this.bu);
                this.bu = false;
            }
        }
        Folme.useAt(view).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(view, new AnimConfig[0]);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        return false;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.preference.Preference
    protected void uv6() {
        super.uv6();
        InterfaceC7310s interfaceC7310s = this.tgs;
        if (interfaceC7310s != null) {
            interfaceC7310s.toq(this);
        }
    }

    @Override // androidx.preference.Preference
    public void yz() {
        super.yz();
        Looper.myQueue().removeIdleHandler(this);
        d3().edit().remove(fn3e()).apply();
    }

    @Override // androidx.preference.Preference
    public boolean zy(Object obj) {
        InterfaceC7310s interfaceC7310s = this.tgs;
        boolean z2 = (interfaceC7310s != null ? interfaceC7310s.mo26471k(this, obj) : true) && super.zy(obj);
        if (!z2 && this.bu) {
            this.bu = false;
        }
        return z2;
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.uu);
    }

    public RadioButtonPreference(Context context) {
        this(context, null);
    }
}
