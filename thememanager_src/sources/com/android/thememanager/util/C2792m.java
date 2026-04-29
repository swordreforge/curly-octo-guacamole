package com.android.thememanager.util;

import android.content.Context;
import android.text.TextUtils;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.android.thememanager.util.m */
/* JADX INFO: compiled from: NewUITemporarySolutionUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2792m {

    /* JADX INFO: renamed from: k */
    private static String f16626k = "%sHotSubject";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f61340toq = InterfaceC1925p.rkfn + "page/key/%sHotSubject";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<String, String> f61341zy;

    static {
        HashMap map = new HashMap();
        f61341zy = map;
        map.put(InterfaceC1789q.q68, String.format(f61340toq, InterfaceC1789q.q68));
    }

    /* JADX INFO: renamed from: k */
    public static String m9861k(String resourceStamp) {
        return String.format(f16626k, resourceStamp);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9862q() {
        return true;
    }

    public static com.android.thememanager.controller.online.zurt toq(String resourceStamp) {
        String str = f61341zy.get(resourceStamp);
        if (TextUtils.isEmpty(str)) {
            str = String.format(f61340toq, resourceStamp);
        }
        return new com.android.thememanager.controller.online.zurt(str, 1, zurt.EnumC1946k.API_PROXY);
    }

    public static int zy(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.resource_multiple_button_default_offset);
    }
}
