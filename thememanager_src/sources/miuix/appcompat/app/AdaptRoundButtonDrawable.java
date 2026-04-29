package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import gb.toq;
import java.io.IOException;
import miuix.smooth.SmoothContainerDrawable2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class AdaptRoundButtonDrawable extends SmoothContainerDrawable2 {

    /* JADX INFO: renamed from: l */
    private float f38735l;

    /* JADX INFO: renamed from: r */
    private float f38736r;

    private void ni7(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayQrj = SmoothContainerDrawable2.qrj(resources, theme, attributeSet, toq.ki.f76176r8s8);
        float f2 = resources.getDisplayMetrics().density;
        this.f38736r = typedArrayQrj.getDimension(toq.ki.f76196v0af, 16.0f * f2);
        this.f38735l = typedArrayQrj.getDimension(toq.ki.f76136m4, f2 * 36.0f);
        typedArrayQrj.recycle();
    }

    @Override // miuix.smooth.SmoothContainerDrawable2, android.graphics.drawable.Drawable
    public void inflate(@zy.lvui Resources resources, @zy.lvui XmlPullParser xmlPullParser, @zy.lvui AttributeSet attributeSet, @zy.dd Resources.Theme theme) throws XmlPullParserException, IOException {
        ni7(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        if (miuix.core.util.kja0.kja0()) {
            m26587h(this.f38736r);
        } else {
            m26587h(this.f38735l);
        }
    }
}
