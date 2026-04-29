package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.content.res.q */
/* JADX INFO: compiled from: ComplexColorCompat.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class C0505q {

    /* JADX INFO: renamed from: q */
    private static final String f3507q = "ComplexColorCompat";

    /* JADX INFO: renamed from: k */
    private final Shader f3508k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ColorStateList f50410toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f50411zy;

    private C0505q(Shader shader, ColorStateList colorStateList, @zy.x2 int i2) {
        this.f3508k = shader;
        this.f50410toq = colorStateList;
        this.f50411zy = i2;
    }

    @dd
    public static C0505q f7l8(@lvui Resources resources, @zy.n7h int i2, @dd Resources.Theme theme) {
        try {
            return m2319k(resources, i2, theme);
        } catch (Exception e2) {
            Log.e(f3507q, "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    private static C0505q m2319k(@lvui Resources resources, @zy.n7h int i2, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m2320q(f7l8.zy(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return zy(zy.toq(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: q */
    static C0505q m2320q(@lvui Shader shader) {
        return new C0505q(shader, null, 0);
    }

    static C0505q toq(@zy.x2 int i2) {
        return new C0505q(null, null, i2);
    }

    static C0505q zy(@lvui ColorStateList colorStateList) {
        return new C0505q(null, colorStateList, colorStateList.getDefaultColor());
    }

    @dd
    /* JADX INFO: renamed from: g */
    public Shader m2321g() {
        return this.f3508k;
    }

    public void ld6(@zy.x2 int i2) {
        this.f50411zy = i2;
    }

    @zy.x2
    /* JADX INFO: renamed from: n */
    public int m2322n() {
        return this.f50411zy;
    }

    /* JADX INFO: renamed from: p */
    public boolean m2323p(int[] iArr) {
        if (m2324s()) {
            ColorStateList colorStateList = this.f50410toq;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f50411zy) {
                this.f50411zy = colorForState;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean m2324s() {
        ColorStateList colorStateList;
        return this.f3508k == null && (colorStateList = this.f50410toq) != null && colorStateList.isStateful();
    }

    public boolean x2() {
        return m2325y() || this.f50411zy != 0;
    }

    /* JADX INFO: renamed from: y */
    public boolean m2325y() {
        return this.f3508k != null;
    }
}
