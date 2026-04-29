package h4b;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C0136q;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: h4b.k */
/* JADX INFO: compiled from: MaterialThemeOverlay.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6070k {

    /* JADX INFO: renamed from: k */
    private static final int[] f35073k = {R.attr.theme, C6095k.zy.re5};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int[] f77052toq = {C6095k.zy.b1};

    private C6070k() {
    }

    @hb
    /* JADX INFO: renamed from: k */
    private static int m22359k(@lvui Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35073k);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @hb
    private static int toq(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f77052toq, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @lvui
    public static Context zy(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        int qVar = toq(context, attributeSet, i2, i3);
        boolean z2 = (context instanceof C0136q) && ((C0136q) context).zy() == qVar;
        if (qVar == 0 || z2) {
            return context;
        }
        C0136q c0136q = new C0136q(context, qVar);
        int iM22359k = m22359k(context, attributeSet);
        if (iM22359k != 0) {
            c0136q.getTheme().applyStyle(iM22359k, true);
        }
        return c0136q;
    }
}
