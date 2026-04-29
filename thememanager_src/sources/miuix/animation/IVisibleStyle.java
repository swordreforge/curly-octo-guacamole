package miuix.animation;

import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public interface IVisibleStyle extends IStateContainer {

    public enum VisibleType {
        SHOW,
        HIDE
    }

    void hide(AnimConfig... animConfigArr);

    IVisibleStyle setAlpha(float f2, VisibleType... visibleTypeArr);

    IVisibleStyle setBound(int i2, int i3, int i4, int i5);

    IVisibleStyle setFlags(long j2);

    IVisibleStyle setHide();

    IVisibleStyle setMove(int i2, int i3);

    IVisibleStyle setMove(int i2, int i3, VisibleType... visibleTypeArr);

    IVisibleStyle setScale(float f2, VisibleType... visibleTypeArr);

    IVisibleStyle setShow();

    IVisibleStyle setShowDelay(long j2);

    void show(AnimConfig... animConfigArr);

    IVisibleStyle useAutoAlpha(boolean z2);
}
