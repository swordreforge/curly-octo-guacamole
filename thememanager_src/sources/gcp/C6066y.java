package gcp;

import com.miui.clock.hct.C5055q;

/* JADX INFO: renamed from: gcp.y */
/* JADX INFO: compiled from: GlobalColorUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6066y {
    /* JADX INFO: renamed from: k */
    public static int m22346k(int i2) {
        com.miui.clock.hct.zy qVar = com.miui.clock.hct.zy.toq(i2);
        return C5055q.ki(qVar.m17693q(), qVar.zy(), (Math.cos((qVar.m17691n() * 0.04833199828863144d) - 4.833199977874756d) * 18.0d) + 68.0d);
    }

    public static int toq(int i2) {
        com.miui.clock.hct.zy qVar = com.miui.clock.hct.zy.toq(m22346k(i2));
        return C5055q.ki(qVar.m17693q(), Math.log((qVar.zy() * 3.0d) + 1.0d) * 8.0d, qVar.m17691n());
    }
}
