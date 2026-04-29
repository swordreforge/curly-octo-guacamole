package f7l8;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: f7l8.k */
/* JADX INFO: compiled from: Compatibility.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public final class C6028k {

    /* JADX INFO: renamed from: f7l8.k$k */
    /* JADX INFO: compiled from: Compatibility.java */
    @hyr(15)
    public static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static void m22264k(@lvui Resources resources, int i2, int i3, @lvui TypedValue typedValue, boolean z2) {
            resources.getValueForDensity(i2, i3, typedValue, z2);
        }
    }

    /* JADX INFO: renamed from: f7l8.k$toq */
    /* JADX INFO: compiled from: Compatibility.java */
    @hyr(18)
    public static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static void m22265k(@lvui ObjectAnimator objectAnimator, boolean z2) {
            objectAnimator.setAutoCancel(z2);
        }
    }

    /* JADX INFO: renamed from: f7l8.k$zy */
    /* JADX INFO: compiled from: Compatibility.java */
    @hyr(21)
    public static class zy {
        private zy() {
        }

        @InterfaceC7830i
        @lvui
        /* JADX INFO: renamed from: k */
        public static Drawable m22266k(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC7830i
        public static int toq(@lvui TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC7830i
        public static void zy(@lvui Drawable drawable, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private C6028k() {
    }
}
