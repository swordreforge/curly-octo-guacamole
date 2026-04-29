package com.xiaomi.push;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ew implements nme {

    /* JADX INFO: renamed from: k */
    private nme f32887k;

    /* JADX INFO: renamed from: com.xiaomi.push.ew$k */
    private static class C5861k {

        /* JADX INFO: renamed from: k */
        private static ew f32888k = new ew();
    }

    public static ew zy() {
        return C5861k.f32888k;
    }

    @Override // com.xiaomi.push.nme
    /* JADX INFO: renamed from: k */
    public void mo20819k(String str, Map<String, Object> map) {
        nme nmeVar = this.f32887k;
        if (nmeVar != null) {
            nmeVar.mo20819k(str, map);
        }
    }

    @Override // com.xiaomi.push.nme
    public void toq(b8 b8Var) {
        nme nmeVar = this.f32887k;
        if (nmeVar != null) {
            nmeVar.toq(b8Var);
        }
    }

    private ew() {
    }
}
