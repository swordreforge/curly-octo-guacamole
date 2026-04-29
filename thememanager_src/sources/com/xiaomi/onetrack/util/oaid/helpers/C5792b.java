package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.onetrack.util.C5781n;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.ab;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5792b {

    /* JADX INFO: renamed from: a */
    static String f32359a = "b";

    /* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.b$a */
    enum a {
        asus("ASUS"),
        huawei("HUAWEI"),
        lenovo("LENOVO"),
        motolora("MOTOLORA"),
        meizu("MEIZU"),
        oppo("OPPO"),
        samsung("SAMSUNG"),
        numbia("NUBIA"),
        vivo("VIVO"),
        xiaomi("XIAOMI"),
        redmi("REDMI"),
        blackshark("BLACKSHARK"),
        oneplus("ONEPLUS"),
        zte("ZTE"),
        freemeos("FERRMEOS"),
        ssui("SSUI");


        /* JADX INFO: renamed from: q */
        public final String f32377q;

        a(String str) {
            this.f32377q = str;
        }

        /* JADX INFO: renamed from: b */
        static a m20323b(String str) {
            for (a aVar : values()) {
                if (aVar.f32377q.equals(str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m20316c() {
        return Build.MANUFACTURER.toUpperCase();
    }

    /* JADX INFO: renamed from: a */
    public String m20317a(Context context) {
        try {
            return m20318a(context, m20316c());
        } catch (Exception e2) {
            C5804p.m20342a(f32359a, e2.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m20320b() {
        String strM20218a = ab.m20218a("ro.ssui.product");
        return (TextUtils.isEmpty(strM20218a) || strM20218a.equalsIgnoreCase("unknown")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    String m20318a(Context context, String str) throws Exception {
        a aVarM20323b = a.m20323b(str);
        if (m20319a()) {
            aVarM20323b = a.freemeos;
        }
        if (m20320b()) {
            aVarM20323b = a.ssui;
        }
        if (aVarM20323b != null) {
            switch (C5793c.f32378a[aVarM20323b.ordinal()]) {
                case 1:
                    return new C5791a().m20315a(context);
                case 2:
                    return new C5794d().m20324a(context);
                case 3:
                case 4:
                    return new C5795e().m20325a(context);
                case 5:
                    return new C5796f().m20327a(context);
                case 6:
                    return new C5800j().m20335a(context);
                case 7:
                    return new C5801k().m20336a(context);
                case 8:
                    return new C5798h().m20329a(context);
                case 9:
                    return new C5802l().m20337a(context);
                case 10:
                case 11:
                case 12:
                    return C5781n.m20283a(context);
                case 13:
                    return new C5799i().m20332a(context);
                case 14:
                case 15:
                case 16:
                    return new C5803m().m20339a(context);
                default:
                    return "";
            }
        }
        throw new Exception(String.format("undefined oaid method of manufacturer %s", str));
    }

    /* JADX INFO: renamed from: a */
    public boolean m20319a() {
        String strM20218a = ab.m20218a("ro.build.freeme.label");
        return !TextUtils.isEmpty(strM20218a) && strM20218a.equalsIgnoreCase("FREEMEOS");
    }
}
