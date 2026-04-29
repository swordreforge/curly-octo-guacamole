package com.miui.maml.util;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.ki;
import androidx.customview.widget.AbstractC0778k;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.elements.AnimatedScreenElement;
import com.miui.maml.elements.ButtonScreenElement;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class MamlAccessHelper extends AbstractC0778k {
    private static final String TAG = "MamlAccessHelper";
    View mHostView;
    ScreenElementRoot mRoot;

    public MamlAccessHelper(ScreenElementRoot screenElementRoot, View view) {
        super(view);
        this.mRoot = screenElementRoot;
        this.mHostView = view;
        screenElementRoot.setMamlAccessHelper(this);
    }

    @Override // androidx.customview.widget.AbstractC0778k
    protected int getVirtualViewAt(float f2, float f3) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot == null) {
            return Integer.MIN_VALUE;
        }
        List<AnimatedScreenElement> accessibleElements = screenElementRoot.getAccessibleElements();
        for (int size = accessibleElements.size() - 1; size >= 0; size--) {
            AnimatedScreenElement animatedScreenElement = accessibleElements.get(size);
            if (animatedScreenElement.isVisible() && animatedScreenElement.touched(f2, f3)) {
                return size;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.AbstractC0778k
    protected void getVisibleVirtualViews(List<Integer> list) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            List<AnimatedScreenElement> accessibleElements = screenElementRoot.getAccessibleElements();
            for (int i2 = 0; i2 < accessibleElements.size(); i2++) {
                if (accessibleElements.get(i2).isVisible()) {
                    list.add(Integer.valueOf(i2));
                }
            }
        }
    }

    @Override // androidx.customview.widget.AbstractC0778k
    protected boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot == null || i3 != 16) {
            return false;
        }
        List<AnimatedScreenElement> accessibleElements = screenElementRoot.getAccessibleElements();
        if (i2 >= 0 && i2 < accessibleElements.size()) {
            AnimatedScreenElement animatedScreenElement = accessibleElements.get(i2);
            animatedScreenElement.performAction("up");
            if (!(animatedScreenElement instanceof ButtonScreenElement)) {
                return true;
            }
            ((ButtonScreenElement) animatedScreenElement).onActionUp();
            return true;
        }
        return false;
    }

    @Override // androidx.customview.widget.AbstractC0778k
    protected void onPopulateEventForVirtualView(int i2, AccessibilityEvent accessibilityEvent) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            List<AnimatedScreenElement> accessibleElements = screenElementRoot.getAccessibleElements();
            if (i2 < 0 || i2 >= accessibleElements.size()) {
                return;
            }
            accessibilityEvent.setContentDescription(accessibleElements.get(i2).getContentDescription());
        }
    }

    @Override // androidx.customview.widget.AbstractC0778k
    protected void onPopulateNodeForVirtualView(int i2, @lvui ki kiVar) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        String str = "";
        if (screenElementRoot == null) {
            MamlLog.m17851e(TAG, "mRoot == null, add an empty content description");
            kiVar.yqrt("");
            kiVar.ltg8(new Rect(0, 0, 0, 0));
            return;
        }
        List<AnimatedScreenElement> accessibleElements = screenElementRoot.getAccessibleElements();
        if (i2 < 0 || i2 >= accessibleElements.size()) {
            MamlLog.m17851e(TAG, "virtualViewId not found " + i2);
            kiVar.yqrt("");
            kiVar.ltg8(new Rect(0, 0, 0, 0));
            return;
        }
        AnimatedScreenElement animatedScreenElement = accessibleElements.get(i2);
        String contentDescription = animatedScreenElement.getContentDescription();
        if (contentDescription == null) {
            MamlLog.m17851e(TAG, "element.getContentDescription() == null " + animatedScreenElement.getName());
        } else {
            str = contentDescription;
        }
        kiVar.yqrt(str);
        kiVar.m3052k(16);
        kiVar.ltg8(new Rect((int) animatedScreenElement.getAbsoluteLeft(), (int) animatedScreenElement.getAbsoluteTop(), (int) (animatedScreenElement.getAbsoluteLeft() + animatedScreenElement.getWidth()), (int) (animatedScreenElement.getAbsoluteTop() + animatedScreenElement.getHeight())));
    }

    public void performAccessibilityAction(final int i2, final int i3) {
        this.mHostView.post(new Runnable() { // from class: com.miui.maml.util.MamlAccessHelper.1
            @Override // java.lang.Runnable
            public void run() {
                MamlAccessHelper mamlAccessHelper = MamlAccessHelper.this;
                mamlAccessHelper.getAccessibilityNodeProvider(mamlAccessHelper.mHostView).mo3086g(i2, i3, null);
            }
        });
    }

    public void removeRoot() {
        this.mRoot = null;
    }
}
