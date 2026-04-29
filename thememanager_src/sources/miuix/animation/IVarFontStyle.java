package miuix.animation;

import android.widget.TextView;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public interface IVarFontStyle extends IStateContainer {
    IVarFontStyle fromTo(int i2, int i3, AnimConfig... animConfigArr);

    IVarFontStyle setTo(int i2);

    IVarFontStyle to(int i2, AnimConfig... animConfigArr);

    IVarFontStyle useAt(TextView textView, int i2, int i3);
}
