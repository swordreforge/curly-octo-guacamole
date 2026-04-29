package com.miui.maml.elements;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.util.MamlLog;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class ButtonScreenElement extends ElementGroup {
    private static final String LOG_TAG = "ButtonScreenElement";
    public static final String TAG_NAME = "Button";
    private boolean mIsAlignChildren;
    private ButtonActionListener mListener;
    private String mListenerName;
    private ElementGroup mNormalElements;
    private ElementGroup mPressedElements;
    private float mPreviousTapPositionX;
    private float mPreviousTapPositionY;
    private long mPreviousTapUpTime;

    public interface ButtonActionListener {
        boolean onButtonDoubleClick(String str);

        boolean onButtonDown(String str);

        boolean onButtonLongClick(String str);

        boolean onButtonUp(String str);
    }

    public ButtonScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        load(element);
    }

    private void load(Element element) {
        if (element == null) {
            return;
        }
        this.mIsAlignChildren = Boolean.parseBoolean(getAttr(element, "alignChildren"));
        this.mListenerName = getAttr(element, "listener");
        this.mTouchable = true;
    }

    private void showNormalElements() {
        ElementGroup elementGroup = this.mNormalElements;
        if (elementGroup != null) {
            elementGroup.show(true);
        }
        ElementGroup elementGroup2 = this.mPressedElements;
        if (elementGroup2 != null) {
            elementGroup2.show(false);
        }
    }

    private void showPressedElements() {
        ElementGroup elementGroup = this.mPressedElements;
        if (elementGroup == null) {
            ElementGroup elementGroup2 = this.mNormalElements;
            if (elementGroup2 != null) {
                elementGroup2.show(true);
                return;
            }
            return;
        }
        elementGroup.show(true);
        ElementGroup elementGroup3 = this.mNormalElements;
        if (elementGroup3 != null) {
            elementGroup3.show(false);
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        canvas.save();
        if (!this.mIsAlignChildren) {
            canvas.translate(-getLeft(), -getTop());
        }
        super.doRender(canvas);
        canvas.restore();
    }

    @Override // com.miui.maml.elements.ElementGroup
    protected float getParentLeft() {
        float left = this.mIsAlignChildren ? getLeft() : 0.0f;
        ElementGroup elementGroup = this.mParent;
        return left + (elementGroup != null ? elementGroup.getParentLeft() : 0.0f);
    }

    @Override // com.miui.maml.elements.ElementGroup
    protected float getParentTop() {
        float top = this.mIsAlignChildren ? getTop() : 0.0f;
        ElementGroup elementGroup = this.mParent;
        return top + (elementGroup != null ? elementGroup.getParentTop() : 0.0f);
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        if (this.mListener == null && !TextUtils.isEmpty(this.mListenerName)) {
            try {
                this.mListener = (ButtonActionListener) this.mRoot.findElement(this.mListenerName);
            } catch (ClassCastException unused) {
                MamlLog.m17851e(LOG_TAG, "button listener designated by the name is not actually a listener: " + this.mListenerName);
            }
        }
        showNormalElements();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void onActionCancel() {
        super.onActionCancel();
        resetState();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void onActionDown(float f2, float f3) {
        super.onActionDown(f2, f3);
        ButtonActionListener buttonActionListener = this.mListener;
        if (buttonActionListener != null) {
            buttonActionListener.onButtonDown(this.mName);
        }
        if (SystemClock.uptimeMillis() - this.mPreviousTapUpTime <= ViewConfiguration.getDoubleTapTimeout()) {
            float f4 = f2 - this.mPreviousTapPositionX;
            float f5 = f3 - this.mPreviousTapPositionY;
            float f6 = (f4 * f4) + (f5 * f5);
            int scaledDoubleTapSlop = ViewConfiguration.get(getContext().mContext).getScaledDoubleTapSlop();
            if (f6 < scaledDoubleTapSlop * scaledDoubleTapSlop) {
                ButtonActionListener buttonActionListener2 = this.mListener;
                if (buttonActionListener2 != null) {
                    buttonActionListener2.onButtonDoubleClick(this.mName);
                }
                performAction("double");
            }
        }
        this.mPreviousTapPositionX = f2;
        this.mPreviousTapPositionY = f3;
        showPressedElements();
        ElementGroup elementGroup = this.mPressedElements;
        if (elementGroup != null) {
            elementGroup.reset();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public void onActionUp() {
        super.onActionUp();
        ButtonActionListener buttonActionListener = this.mListener;
        if (buttonActionListener != null) {
            buttonActionListener.onButtonUp(this.mName);
        }
        this.mPreviousTapUpTime = SystemClock.uptimeMillis();
        resetState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.maml.elements.ElementGroup
    public ScreenElement onCreateChild(Element element) {
        String tagName = element.getTagName();
        if (tagName.equalsIgnoreCase("Normal")) {
            ElementGroup elementGroup = new ElementGroup(element, this.mRoot);
            this.mNormalElements = elementGroup;
            return elementGroup;
        }
        if (!tagName.equalsIgnoreCase("Pressed")) {
            return super.onCreateChild(element);
        }
        ElementGroup elementGroup2 = new ElementGroup(element, this.mRoot);
        this.mPressedElements = elementGroup2;
        return elementGroup2;
    }

    protected void resetState() {
        showNormalElements();
        ElementGroup elementGroup = this.mNormalElements;
        if (elementGroup != null) {
            elementGroup.reset();
        }
    }

    public void setListener(ButtonActionListener buttonActionListener) {
        this.mListener = buttonActionListener;
    }
}
