package miuix.animation.controller;

import java.util.Collection;
import miuix.animation.IAnimTarget;
import miuix.animation.IVisibleStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeVisible extends FolmeBase implements IVisibleStyle {
    private final AnimConfig mDefConfig;
    private boolean mHasMove;
    private boolean mHasScale;
    private boolean mSetBound;

    public FolmeVisible(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        this.mDefConfig = new AnimConfig().addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeVisible.1
            @Override // miuix.animation.listener.TransitionListener
            public void onBegin(Object obj, Collection<UpdateInfo> collection) {
                if (obj.equals(IVisibleStyle.VisibleType.SHOW) && FolmeVisible.this.mSetBound) {
                    AnimState.alignState(FolmeVisible.this.mState.getState(IVisibleStyle.VisibleType.HIDE), collection);
                }
            }
        });
        useAutoAlpha(true);
    }

    private AnimConfig[] getConfig(IVisibleStyle.VisibleType visibleType, AnimConfig... animConfigArr) {
        boolean z2 = this.mHasScale;
        if (!z2 && !this.mHasMove) {
            this.mDefConfig.setEase(visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(16, 300.0f) : EaseManager.getStyle(-2, 1.0f, 0.15f));
        } else if (z2 && !this.mHasMove) {
            this.mDefConfig.setEase(visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(-2, 0.6f, 0.35f) : EaseManager.getStyle(-2, 0.75f, 0.2f));
        } else if (z2) {
            this.mDefConfig.setEase(visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(-2, 0.65f, 0.35f) : EaseManager.getStyle(-2, 0.75f, 0.25f));
        } else {
            this.mDefConfig.setEase(visibleType == IVisibleStyle.VisibleType.SHOW ? EaseManager.getStyle(-2, 0.75f, 0.35f) : EaseManager.getStyle(-2, 0.75f, 0.25f));
        }
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mDefConfig);
    }

    private IVisibleStyle.VisibleType getType(IVisibleStyle.VisibleType... visibleTypeArr) {
        return visibleTypeArr.length > 0 ? visibleTypeArr[0] : IVisibleStyle.VisibleType.HIDE;
    }

    @Override // miuix.animation.controller.FolmeBase, miuix.animation.IStateContainer
    public void clean() {
        super.clean();
        this.mHasScale = false;
        this.mHasMove = false;
    }

    @Override // miuix.animation.IVisibleStyle
    public void hide(AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        IVisibleStyle.VisibleType visibleType = IVisibleStyle.VisibleType.HIDE;
        iFolmeStateStyle.to(visibleType, getConfig(visibleType, animConfigArr));
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setAlpha(float f2, IVisibleStyle.VisibleType... visibleTypeArr) {
        this.mState.getState(getType(visibleTypeArr)).add(ViewProperty.AUTO_ALPHA, f2);
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setBound(int i2, int i3, int i4, int i5) {
        this.mSetBound = true;
        this.mState.getState(IVisibleStyle.VisibleType.SHOW).add(ViewProperty.f38713X, i2).add(ViewProperty.f38714Y, i3).add(ViewProperty.WIDTH, i4).add(ViewProperty.HEIGHT, i5);
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setFlags(long j2) {
        this.mState.setFlags(j2);
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setHide() {
        this.mState.setTo(IVisibleStyle.VisibleType.HIDE);
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setMove(int i2, int i3) {
        return setMove(i2, i3, IVisibleStyle.VisibleType.HIDE);
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setScale(float f2, IVisibleStyle.VisibleType... visibleTypeArr) {
        this.mHasScale = true;
        double d2 = f2;
        this.mState.getState(getType(visibleTypeArr)).add(ViewProperty.SCALE_Y, d2).add(ViewProperty.SCALE_X, d2);
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setShow() {
        this.mState.setTo(IVisibleStyle.VisibleType.SHOW);
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setShowDelay(long j2) {
        this.mState.getState(IVisibleStyle.VisibleType.SHOW).getConfig().delay = j2;
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public void show(AnimConfig... animConfigArr) {
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        IVisibleStyle.VisibleType visibleType = IVisibleStyle.VisibleType.SHOW;
        iFolmeStateStyle.to(visibleType, getConfig(visibleType, animConfigArr));
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle useAutoAlpha(boolean z2) {
        ViewProperty viewProperty = ViewProperty.AUTO_ALPHA;
        ViewProperty viewProperty2 = ViewProperty.ALPHA;
        if (z2) {
            this.mState.getState(IVisibleStyle.VisibleType.SHOW).remove(viewProperty2).add(viewProperty, 1.0d);
            this.mState.getState(IVisibleStyle.VisibleType.HIDE).remove(viewProperty2).add(viewProperty, 0.0d);
        } else {
            this.mState.getState(IVisibleStyle.VisibleType.SHOW).remove(viewProperty).add(viewProperty2, 1.0d);
            this.mState.getState(IVisibleStyle.VisibleType.HIDE).remove(viewProperty).add(viewProperty2, 0.0d);
        }
        return this;
    }

    @Override // miuix.animation.IVisibleStyle
    public IVisibleStyle setMove(int i2, int i3, IVisibleStyle.VisibleType... visibleTypeArr) {
        boolean z2 = Math.abs(i2) > 0 || Math.abs(i3) > 0;
        this.mHasMove = z2;
        if (z2) {
            this.mState.getState(getType(visibleTypeArr)).add(ViewProperty.f38713X, i2, 1).add(ViewProperty.f38714Y, i3, 1);
        }
        return this;
    }
}
