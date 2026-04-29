package n2t;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import zy.InterfaceC7824b;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: n2t.k */
/* JADX INFO: compiled from: DrawableUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class C7398k {
    private C7398k() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static AttributeSet m26798k(@lvui Context context, @InterfaceC7824b int i2, @lvui CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException | XmlPullParserException e2) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
            notFoundException.initCause(e2);
            throw notFoundException;
        }
    }

    @TargetApi(21)
    public static void toq(@dd RippleDrawable rippleDrawable, int i2) {
        rippleDrawable.setRadius(i2);
    }

    @dd
    public static PorterDuffColorFilter zy(@lvui Drawable drawable, @dd ColorStateList colorStateList, @dd PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
