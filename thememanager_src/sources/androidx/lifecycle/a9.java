package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import zy.uv6;

/* JADX INFO: compiled from: MethodCallsLogger.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class a9 {

    /* JADX INFO: renamed from: k */
    private Map<String, Integer> f5048k = new HashMap();

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public boolean m4406k(String str, int i2) {
        Integer num = this.f5048k.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z2 = (iIntValue & i2) != 0;
        this.f5048k.put(str, Integer.valueOf(i2 | iIntValue));
        return !z2;
    }
}
