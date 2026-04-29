package pjz9;

import android.content.Context;
import com.google.android.material.color.kja0;
import ij.C6095k;
import zy.InterfaceC7829h;
import zy.cdj;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: SurfaceColors.java */
/* JADX INFO: loaded from: classes2.dex */
public enum toq {
    SURFACE_0(C6095k.g.izu),
    SURFACE_1(C6095k.g.ap23),
    SURFACE_2(C6095k.g.ip),
    SURFACE_3(C6095k.g.dbf),
    SURFACE_4(C6095k.g.es7),
    SURFACE_5(C6095k.g.zah1);

    private final int elevationResId;

    toq(@InterfaceC7829h int i2) {
        this.elevationResId = i2;
    }

    @x2
    public static int getColorForElevation(@lvui Context context, @cdj float f2) {
        return new C7607k(context).zy(kja0.toq(context, C6095k.zy.f80274sc, 0), f2);
    }

    @x2
    public int getColor(@lvui Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
