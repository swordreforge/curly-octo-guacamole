package miuix.animation;

import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public interface IBlinkStyle extends IStateContainer {

    public enum BlinkType {
        HIGHLIGHT,
        NORMAL
    }

    IBlinkStyle resetConfig();

    IBlinkStyle setInterval(long j2);

    IBlinkStyle setLimitCount(int i2);

    IBlinkStyle setToHighlightConfig(AnimConfig animConfig);

    IBlinkStyle setToNormalConfig(AnimConfig animConfig);

    void startBlink(int i2, AnimConfig... animConfigArr);

    void startBlink(AnimConfig... animConfigArr);

    void stopBlink();
}
