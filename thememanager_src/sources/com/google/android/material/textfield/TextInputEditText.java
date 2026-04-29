package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.cdj;
import h4b.C6070k;
import ij.C6095k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: p */
    private boolean f25210p;

    /* JADX INFO: renamed from: s */
    private final Rect f25211s;

    public TextInputEditText(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private boolean m15014g(@dd TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f25210p;
    }

    @dd
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @dd
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @lvui
    private String zy(@lvui TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z2 = !TextUtils.isEmpty(text);
        String str = "";
        String string = TextUtils.isEmpty(hint) ^ true ? hint.toString() : "";
        if (!z2) {
            return !TextUtils.isEmpty(string) ? string : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        if (!TextUtils.isEmpty(string)) {
            str = ", " + string;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@dd Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m15014g(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f25211s);
        rect.bottom = this.f25211s.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@dd Rect rect, @dd Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return m15014g(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @dd
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.m15035e()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m15035e() && super.getHint() == null && com.google.android.material.internal.f7l8.zy()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @dd
    public InputConnection onCreateInputConnection(@lvui EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    /* JADX INFO: renamed from: q */
    public boolean m15015q() {
        return this.f25210p;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@dd Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m15014g(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f25211s.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f25211s);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z2) {
        this.f25210p = z2;
    }

    public TextInputEditText(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.py7);
    }

    public TextInputEditText(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(C6070k.zy(context, attributeSet, i2, 0), attributeSet, i2);
        this.f25211s = new Rect();
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, C6095k.kja0.hjp, i2, C6095k.n7h.tb, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayM14534p.getBoolean(C6095k.kja0.f8, false));
        typedArrayM14534p.recycle();
    }
}
