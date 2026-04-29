package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.toq;
import androidx.appcompat.widget.lrht;
import androidx.core.content.res.kja0;
import f7l8.C6028k;
import f7l8.toq;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.n */
/* JADX INFO: compiled from: StateListDrawable.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class C0110n extends toq {

    /* JADX INFO: renamed from: m */
    private static final boolean f352m = false;

    /* JADX INFO: renamed from: o */
    private static final String f353o = "StateListDrawable";

    /* JADX INFO: renamed from: e */
    private k f354e;

    /* JADX INFO: renamed from: j */
    private boolean f355j;

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.n$k */
    /* JADX INFO: compiled from: StateListDrawable.java */
    static class k extends toq.AbstractC0113q {

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        int[][] f46637oc;

        k(k kVar, C0110n c0110n, Resources resources) {
            super(kVar, c0110n, resources);
            if (kVar != null) {
                this.f46637oc = kVar.f46637oc;
            } else {
                this.f46637oc = new int[f7l8()][];
            }
        }

        int a9(int[] iArr) {
            int[][] iArr2 = this.f46637oc;
            int iM286s = m286s();
            for (int i2 = 0; i2 < iM286s; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        int jk(int[] iArr, Drawable drawable) {
            int iM282k = m282k(drawable);
            this.f46637oc[iM282k] = iArr;
            return iM282k;
        }

        @Override // androidx.appcompat.graphics.drawable.toq.AbstractC0113q
        public void ki(int i2, int i3) {
            super.ki(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f46637oc, 0, iArr, 0, i2);
            this.f46637oc = iArr;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new C0110n(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.toq.AbstractC0113q
        void zurt() {
            int[][] iArr = this.f46637oc;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f46637oc[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f46637oc = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(Resources resources) {
            return new C0110n(this, resources);
        }
    }

    C0110n() {
        this(null, null);
    }

    private void fu4(TypedArray typedArray) {
        k kVar = this.f354e;
        kVar.f386q |= C6028k.zy.toq(typedArray);
        kVar.f387s = typedArray.getBoolean(toq.C8045toq.f75158t8r, kVar.f387s);
        kVar.f46668x2 = typedArray.getBoolean(toq.C8045toq.f34688i, kVar.f46668x2);
        kVar.f46667wvg = typedArray.getInt(toq.C8045toq.f75150fn3e, kVar.f46667wvg);
        kVar.f388t = typedArray.getInt(toq.C8045toq.f75161zurt, kVar.f388t);
        kVar.f46653fu4 = typedArray.getBoolean(toq.C8045toq.f75148cdj, kVar.f46653fu4);
    }

    private void ni7(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        k kVar = this.f354e;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, toq.C8045toq.f75156ni7);
                int resourceId = typedArrayT8r.getResourceId(toq.C8045toq.f75151fu4, -1);
                Drawable drawableM650p = resourceId > 0 ? lrht.m648y().m650p(context, resourceId) : null;
                typedArrayT8r.recycle();
                int[] iArrM262h = m262h(attributeSet);
                if (drawableM650p == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    drawableM650p = C6028k.zy.m22266k(resources, xmlPullParser, attributeSet, theme);
                }
                kVar.jk(iArrM262h, drawableM650p);
            }
        }
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    @hyr(21)
    public void applyTheme(@lvui Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    int cdj() {
        return this.f354e.m286s();
    }

    int[] fn3e(int i2) {
        return this.f354e.f46637oc[i2];
    }

    /* JADX INFO: renamed from: h */
    int[] m262h(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i4 = i2 + 1;
                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i2] = attributeNameResource;
                i2 = i4;
            }
        }
        return StateSet.trimStateSet(iArr, i2);
    }

    /* JADX INFO: renamed from: i */
    k m263i() {
        return this.f354e;
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    Drawable ki(int i2) {
        return this.f354e.m288y(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.toq
    /* JADX INFO: renamed from: kja0 */
    public k zy() {
        return new k(this.f354e, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    @lvui
    public Drawable mutate() {
        if (!this.f355j && super.mutate() == this) {
            this.f354e.zurt();
            this.f355j = true;
        }
        return this;
    }

    public void n7h(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f354e.jk(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.graphics.drawable.toq, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iA9 = this.f354e.a9(iArr);
        if (iA9 < 0) {
            iA9 = this.f354e.a9(StateSet.WILD_CARD);
        }
        return m278y(iA9) || zOnStateChange;
    }

    @Override // androidx.appcompat.graphics.drawable.toq
    /* JADX INFO: renamed from: s */
    void mo257s(@lvui toq.AbstractC0113q abstractC0113q) {
        super.mo257s(abstractC0113q);
        if (abstractC0113q instanceof k) {
            this.f354e = (k) abstractC0113q;
        }
    }

    int t8r(int[] iArr) {
        return this.f354e.a9(iArr);
    }

    @Override // androidx.appcompat.graphics.drawable.toq
    void toq() {
        super.toq();
        this.f355j = false;
    }

    public void zurt(@lvui Context context, @lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, toq.C8045toq.f34687h);
        setVisible(typedArrayT8r.getBoolean(toq.C8045toq.f75152ki, true), true);
        fu4(typedArrayT8r);
        qrj(resources);
        typedArrayT8r.recycle();
        ni7(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    C0110n(k kVar, Resources resources) {
        mo257s(new k(kVar, this, resources));
        onStateChange(getState());
    }

    C0110n(@dd k kVar) {
        if (kVar != null) {
            mo257s(kVar);
        }
    }
}
