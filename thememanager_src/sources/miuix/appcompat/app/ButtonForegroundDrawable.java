package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import gb.toq;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class ButtonForegroundDrawable extends AlphaBlendingDrawable {
    private void ld6(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, toq.ki.f76176r8s8, 0, 0) : resources.obtainAttributes(attributeSet, toq.ki.f76176r8s8);
        float f2 = resources.getDisplayMetrics().density;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.ki.f76196v0af, (int) (16.0f * f2));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.ki.f76136m4, (int) (f2 * 36.0f));
        typedArrayObtainStyledAttributes.recycle();
        if (miuix.core.util.kja0.kja0()) {
            zy(dimensionPixelSize);
        } else {
            zy(dimensionPixelSize2);
        }
    }

    @Override // miuix.appcompat.app.AlphaBlendingDrawable, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        ld6(resources, attributeSet, theme);
    }
}
