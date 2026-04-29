package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.toq;
import com.google.android.material.resources.zy;
import h4b.C6070k;
import ij.C6095k;
import zy.InterfaceC7831j;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@lvui Context context) {
        this(context, null);
    }

    private static int ld6(@lvui Context context, @lvui TypedArray typedArray, @InterfaceC7831j @lvui int... iArr) {
        int iM14756q = -1;
        for (int i2 = 0; i2 < iArr.length && iM14756q < 0; i2++) {
            iM14756q = zy.m14756q(context, typedArray, iArr[i2], -1);
        }
        return iM14756q;
    }

    /* JADX INFO: renamed from: p */
    private static int m15093p(@lvui Resources.Theme theme, @dd AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6095k.kja0.qzh, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.vjz, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m15094s(Context context) {
        return toq.toq(context, C6095k.zy.b37y, true);
    }

    private static boolean x2(@lvui Context context, @lvui Resources.Theme theme, @dd AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6095k.kja0.qzh, i2, i3);
        int iLd6 = ld6(context, typedArrayObtainStyledAttributes, C6095k.kja0.p9k9, C6095k.kja0.y9i5);
        typedArrayObtainStyledAttributes.recycle();
        return iLd6 != -1;
    }

    /* JADX INFO: renamed from: y */
    private void m15095y(@lvui Resources.Theme theme, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i2, C6095k.kja0.cu);
        int iLd6 = ld6(getContext(), typedArrayObtainStyledAttributes, C6095k.kja0.gi, C6095k.kja0.ah9);
        typedArrayObtainStyledAttributes.recycle();
        if (iLd6 >= 0) {
            setLineHeight(iLd6);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@lvui Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (m15094s(context)) {
            m15095y(context.getTheme(), i2);
        }
    }

    public MaterialTextView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        int iM15093p;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        if (m15094s(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (x2(context2, theme, attributeSet, i2, i3) || (iM15093p = m15093p(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            m15095y(theme, iM15093p);
        }
    }
}
