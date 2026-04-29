package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: PathUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class t8r {

    /* JADX INFO: renamed from: androidx.core.graphics.t8r$k */
    /* JADX INFO: compiled from: PathUtils.java */
    @hyr(26)
    static class C0545k {
        private C0545k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static float[] m2570k(Path path, float f2) {
            return path.approximate(f2);
        }
    }

    private t8r() {
    }

    @hyr(26)
    @lvui
    /* JADX INFO: renamed from: k */
    public static Collection<ki> m2569k(@lvui Path path) {
        return toq(path, 0.5f);
    }

    @hyr(26)
    @lvui
    public static Collection<ki> toq(@lvui Path path, @zy.zurt(from = 0.0d) float f2) {
        float[] fArrM2570k = C0545k.m2570k(path, f2);
        int length = fArrM2570k.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 1; i2 < length; i2++) {
            int i3 = i2 * 3;
            int i4 = (i2 - 1) * 3;
            float f3 = fArrM2570k[i3];
            float f4 = fArrM2570k[i3 + 1];
            float f5 = fArrM2570k[i3 + 2];
            float f6 = fArrM2570k[i4];
            float f7 = fArrM2570k[i4 + 1];
            float f8 = fArrM2570k[i4 + 2];
            if (f3 != f6 && (f4 != f7 || f5 != f8)) {
                arrayList.add(new ki(new PointF(f7, f8), f6, new PointF(f4, f5), f3));
            }
        }
        return arrayList;
    }
}
