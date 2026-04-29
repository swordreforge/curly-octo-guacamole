package com.miui.clock;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.miui.clock.C5049g;

/* JADX INFO: compiled from: MiuiClockAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: k */
    private final String f29317k;

    public toq(Context context) {
        this.f29317k = context.getString(C5049g.s.f71792yz);
    }

    /* JADX INFO: renamed from: k */
    private CharSequence m17758k(CharSequence charSequence) {
        return charSequence.toString().replace(this.f29317k, ":");
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        CharSequence contentDescription = accessibilityEvent.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            return;
        }
        accessibilityEvent.setContentDescription(m17758k(contentDescription));
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
            accessibilityNodeInfo.setText(m17758k(accessibilityNodeInfo.getText()));
        }
        if (TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
            return;
        }
        accessibilityNodeInfo.setContentDescription(m17758k(accessibilityNodeInfo.getContentDescription()));
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence text = view instanceof TextView ? ((TextView) view).getText() : accessibilityEvent.getContentDescription();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        accessibilityEvent.getText().add(m17758k(text));
    }
}
