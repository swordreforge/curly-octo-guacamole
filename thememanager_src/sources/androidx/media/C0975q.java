package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import zy.uv6;

/* JADX INFO: renamed from: androidx.media.q */
/* JADX INFO: compiled from: MediaBrowserCompatUtils.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class C0975q {
    private C0975q() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4618k(Bundle options1, Bundle options2) {
        if (options1 == options2) {
            return true;
        }
        return options1 == null ? options2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && options2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : options2 == null ? options1.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && options1.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : options1.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == options2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && options1.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == options2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    public static boolean toq(Bundle options1, Bundle options2) {
        int i2;
        int i3;
        int i4;
        int i5 = options1 == null ? -1 : options1.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i6 = options2 == null ? -1 : options2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i7 = options1 == null ? -1 : options1.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i8 = options2 == null ? -1 : options2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i9 = Integer.MAX_VALUE;
        if (i5 == -1 || i7 == -1) {
            i2 = Integer.MAX_VALUE;
            i3 = 0;
        } else {
            i3 = i5 * i7;
            i2 = (i7 + i3) - 1;
        }
        if (i6 == -1 || i8 == -1) {
            i4 = 0;
        } else {
            i4 = i6 * i8;
            i9 = (i8 + i4) - 1;
        }
        return i2 >= i4 && i9 >= i3;
    }
}
