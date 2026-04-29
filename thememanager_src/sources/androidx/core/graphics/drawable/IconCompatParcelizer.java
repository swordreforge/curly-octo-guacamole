package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1266n abstractC1266n) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3533k = abstractC1266n.lvui(iconCompat.f3533k, 1);
        iconCompat.f50447zy = abstractC1266n.m5515i(iconCompat.f50447zy, 2);
        iconCompat.f3536q = abstractC1266n.lrht(iconCompat.f3536q, 3);
        iconCompat.f3534n = abstractC1266n.lvui(iconCompat.f3534n, 4);
        iconCompat.f3532g = abstractC1266n.lvui(iconCompat.f3532g, 5);
        iconCompat.f50445f7l8 = (ColorStateList) abstractC1266n.lrht(iconCompat.f50445f7l8, 6);
        iconCompat.f3537s = abstractC1266n.m5517o(iconCompat.f3537s, 7);
        iconCompat.f3535p = abstractC1266n.m5517o(iconCompat.f3535p, 8);
        iconCompat.mo2402k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1266n abstractC1266n) {
        abstractC1266n.bf2(true, true);
        iconCompat.toq(abstractC1266n.mo5504s());
        int i2 = iconCompat.f3533k;
        if (-1 != i2) {
            abstractC1266n.was(i2, 1);
        }
        byte[] bArr = iconCompat.f50447zy;
        if (bArr != null) {
            abstractC1266n.bo(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3536q;
        if (parcelable != null) {
            abstractC1266n.cfr(parcelable, 3);
        }
        int i3 = iconCompat.f3534n;
        if (i3 != 0) {
            abstractC1266n.was(i3, 4);
        }
        int i4 = iconCompat.f3532g;
        if (i4 != 0) {
            abstractC1266n.was(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f50445f7l8;
        if (colorStateList != null) {
            abstractC1266n.cfr(colorStateList, 6);
        }
        String str = iconCompat.f3537s;
        if (str != null) {
            abstractC1266n.zkd(str, 7);
        }
        String str2 = iconCompat.f3535p;
        if (str2 != null) {
            abstractC1266n.zkd(str2, 8);
        }
    }
}
