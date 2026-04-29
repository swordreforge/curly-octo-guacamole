package miuix.animation.controller;

import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.IVarFontStyle;
import miuix.animation.ViewTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.font.FontWeightProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeFont extends FolmeBase implements IVarFontStyle {
    private AnimConfig mDefaultTo;
    private int mInitValue;
    private boolean mIsInitSet;
    private FontWeightProperty mProperty;

    public enum FontType {
        INIT,
        TARGET
    }

    public FolmeFont() {
        super(new IAnimTarget[0]);
        AnimConfig animConfig = new AnimConfig();
        this.mDefaultTo = animConfig;
        animConfig.setEase(EaseManager.getStyle(0, 350.0f, 0.9f, 0.86f));
    }

    @Override // miuix.animation.controller.FolmeBase, miuix.animation.IStateContainer
    public void clean() {
        super.clean();
        this.mState = null;
        this.mProperty = null;
        this.mInitValue = 0;
    }

    @Override // miuix.animation.IVarFontStyle
    public IVarFontStyle fromTo(int i2, int i3, AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        if (iFolmeStateStyle != null) {
            FontType fontType = FontType.INIT;
            iFolmeStateStyle.getState(fontType).add(this.mProperty, i2);
            IFolmeStateStyle iFolmeStateStyle2 = this.mState;
            FontType fontType2 = FontType.TARGET;
            iFolmeStateStyle2.getState(fontType2).add(this.mProperty, i3);
            this.mState.fromTo(fontType, fontType2, animConfigArr);
        }
        return this;
    }

    @Override // miuix.animation.IVarFontStyle
    public IVarFontStyle setTo(int i2) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        if (iFolmeStateStyle != null) {
            FontType fontType = FontType.TARGET;
            iFolmeStateStyle.getState(fontType).add(this.mProperty, i2);
            this.mState.setTo(fontType);
        }
        return this;
    }

    @Override // miuix.animation.IVarFontStyle
    public IVarFontStyle to(int i2, AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        if (iFolmeStateStyle != null) {
            if (!this.mIsInitSet) {
                this.mIsInitSet = true;
                iFolmeStateStyle.setTo(FontType.INIT);
            }
            AnimConfig[] animConfigArr2 = (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mDefaultTo);
            if (this.mInitValue == i2) {
                this.mState.to(FontType.INIT, animConfigArr2);
            } else {
                IFolmeStateStyle iFolmeStateStyle2 = this.mState;
                FontType fontType = FontType.TARGET;
                iFolmeStateStyle2.getState(fontType).add(this.mProperty, i2);
                this.mState.to(fontType, animConfigArr2);
            }
        }
        return this;
    }

    @Override // miuix.animation.IVarFontStyle
    public IVarFontStyle useAt(TextView textView, int i2, int i3) {
        this.mState = new FolmeState(Folme.getTarget(textView, ViewTarget.sCreator));
        this.mProperty = new FontWeightProperty(textView, i2);
        this.mInitValue = i3;
        this.mState.getState(FontType.INIT).add(this.mProperty, i3);
        this.mIsInitSet = false;
        return this;
    }
}
