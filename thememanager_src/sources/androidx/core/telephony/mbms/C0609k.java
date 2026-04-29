package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.telephony.mbms.k */
/* JADX INFO: compiled from: MbmsHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0609k {

    /* JADX INFO: renamed from: androidx.core.telephony.mbms.k$k */
    /* JADX INFO: compiled from: MbmsHelper.java */
    @hyr(28)
    static class k {
        private k() {
        }

        /* JADX INFO: renamed from: k */
        static CharSequence m2840k(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i2 = 0;
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            while (it.hasNext()) {
                strArr[i2] = it.next().toLanguageTag();
                i2++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private C0609k() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static CharSequence m2839k(@lvui Context context, @lvui ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.m2840k(context, serviceInfo);
        }
        return null;
    }
}
