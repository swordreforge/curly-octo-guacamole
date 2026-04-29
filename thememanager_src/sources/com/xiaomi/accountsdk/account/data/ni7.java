package com.xiaomi.accountsdk.account.data;

import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.C5582z;
import com.xiaomi.onetrack.BuildConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: XiaomiUserCoreInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final ArrayList<C5482g> f72667f7l8;

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> f30639g;

    /* JADX INFO: renamed from: h */
    public final EnumC5484n f30640h;

    /* JADX INFO: renamed from: k */
    public final String f30641k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public final zy f72668kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public final boolean f72669ld6;

    /* JADX INFO: renamed from: n */
    public final String f30642n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public final String f72670n7h;

    /* JADX INFO: renamed from: p */
    public final Calendar f30643p;

    /* JADX INFO: renamed from: q */
    public final String f30644q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public final String f72671qrj;

    /* JADX INFO: renamed from: s */
    public final EnumC5492y f30645s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f72672toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final String f72673x2;

    /* JADX INFO: renamed from: y */
    public final String f30646y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f72674zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.ni7$g */
    /* JADX INFO: compiled from: XiaomiUserCoreInfo.java */
    public static class C5482g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f72675f7l8 = "snsTypeName";

        /* JADX INFO: renamed from: g */
        private static final String f30647g = "snsType";

        /* JADX INFO: renamed from: n */
        private static final String f30648n = "SnsInfo";

        /* JADX INFO: renamed from: s */
        private static final String f30649s = "snsIcon";

        /* JADX INFO: renamed from: y */
        private static final String f30650y = "snsNickName";

        /* JADX INFO: renamed from: k */
        private final int f30651k;

        /* JADX INFO: renamed from: q */
        private final String f30652q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f72676toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f72677zy;

        public C5482g(int i2, String str, String str2, String str3) {
            this.f30651k = i2;
            this.f72676toq = str;
            this.f72677zy = str2;
            this.f30652q = str3;
        }

        public static ArrayList<C5482g> f7l8(List list) {
            ArrayList<C5482g> arrayList = new ArrayList<>();
            if (list != null) {
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        arrayList.add(m18698g((Map) obj));
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        public static C5482g m18698g(Map map) {
            return new C5482g(ni7.zy(map, f30647g, 0), ni7.m18697q(map, f72675f7l8), ni7.m18697q(map, f30650y), ni7.m18697q(map, f30649s));
        }

        /* JADX INFO: renamed from: k */
        public static C5482g m18699k(List<C5482g> list, int i2) {
            if (list == null) {
                return null;
            }
            for (C5482g c5482g : list) {
                if (c5482g != null && c5482g.f30651k == i2) {
                    return c5482g;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: s */
        public static JSONArray m18700s(ArrayList<C5482g> arrayList) {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                for (C5482g c5482g : arrayList) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(f30647g, c5482g.f30651k);
                        jSONObject.put(f72675f7l8, c5482g.f72676toq);
                        jSONObject.put(f30649s, c5482g.f30652q);
                        jSONObject.put(f30650y, c5482g.f72677zy);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        AbstractC5574n.o1t(f30648n, e2);
                    }
                }
            }
            return jSONArray;
        }

        /* JADX INFO: renamed from: y */
        public static List<C5482g> m18701y(String str) {
            List<Object> listM19161g = C5582z.m19161g(str);
            if (listM19161g == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM19161g) {
                if (obj instanceof Map) {
                    arrayList.add(m18698g((Map) obj));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: n */
        public String m18702n() {
            return this.f72676toq;
        }

        /* JADX INFO: renamed from: q */
        public int m18703q() {
            return this.f30651k;
        }

        public String toq() {
            return this.f30652q;
        }

        public String zy() {
            return this.f72677zy;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.ni7$n */
    /* JADX INFO: compiled from: XiaomiUserCoreInfo.java */
    public enum EnumC5484n {
        LESS_2K("less2000"),
        BETWEEN_2K_4K("less4000"),
        BETWEEN_4K_6K("less6000"),
        BETWEEN_6K_8K("less8000"),
        BETWEEN_8K_12K("less12000"),
        OVER_12K("over12000");

        public final String level;

        EnumC5484n(String str) {
            this.level = str;
        }

        public static EnumC5484n getIncomeTypeByName(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (EnumC5484n enumC5484n : values()) {
                if (enumC5484n.level.equals(str)) {
                    return enumC5484n;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.ni7$q */
    /* JADX INFO: compiled from: XiaomiUserCoreInfo.java */
    public enum EnumC5485q {
        BASE_INFO(1),
        BIND_ADDRESS(2),
        EXTRA_INFO(4),
        SETTING_INFO(8),
        SECURITY_STATUS(16);

        public final int value;

        EnumC5485q(int i2) {
            this.value = i2;
        }
    }

    /* JADX INFO: compiled from: XiaomiUserCoreInfo.java */
    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private ArrayList<C5482g> f72678f7l8;

        /* JADX INFO: renamed from: g */
        private ArrayList<String> f30655g;

        /* JADX INFO: renamed from: h */
        private EnumC5484n f30656h;

        /* JADX INFO: renamed from: k */
        private String f30657k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private zy f72679kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f72680ld6;

        /* JADX INFO: renamed from: n */
        private String f30658n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private String f72681n7h;

        /* JADX INFO: renamed from: p */
        private Calendar f30659p;

        /* JADX INFO: renamed from: q */
        private String f30660q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private String f72682qrj;

        /* JADX INFO: renamed from: s */
        private EnumC5492y f30661s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72683toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f72684x2;

        /* JADX INFO: renamed from: y */
        private String f30662y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72685zy;

        public toq(String str) {
            this.f30657k = str;
        }

        public toq f7l8(EnumC5484n enumC5484n) {
            this.f30656h = enumC5484n;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m18704g(EnumC5492y enumC5492y) {
            this.f30661s = enumC5492y;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public toq m18705h(String str) {
            this.f72683toq = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public ni7 m18706k() {
            return new ni7(this.f30657k, this.f72683toq, this.f72685zy, this.f30660q, this.f30658n, this.f30655g, this.f72678f7l8, this.f30662y, this.f30661s, this.f30659p, this.f72680ld6, this.f72684x2, this.f72682qrj, this.f72681n7h, this.f72679kja0, this.f30656h);
        }

        public void kja0(ArrayList<C5482g> arrayList) {
            this.f72678f7l8 = arrayList;
        }

        @Deprecated
        public toq ld6(String str) {
            this.f72685zy = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public toq m18707n(String str) {
            this.f30662y = str;
            return this;
        }

        public toq n7h(String str) {
            this.f30658n = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public toq m18708p(String str) {
            this.f72681n7h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m18709q(zy zyVar) {
            this.f72679kja0 = zyVar;
            return this;
        }

        public toq qrj(String str) {
            this.f72682qrj = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public toq m18710s(String str) {
            this.f72684x2 = str;
            return this;
        }

        public toq toq(String str) {
            this.f30660q = str;
            return this;
        }

        public toq x2(ArrayList<String> arrayList) {
            this.f30655g = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m18711y(boolean z2) {
            this.f72680ld6 = z2;
            return this;
        }

        public toq zy(Calendar calendar) {
            this.f30659p = calendar;
            return this;
        }
    }

    /* JADX INFO: compiled from: XiaomiUserCoreInfo.java */
    public enum zy {
        MIDDLE_SCHOOL("junior"),
        PREP_SCHOOL("technical"),
        HIGH_SCHOOL("senior"),
        VOCATIONAL_SCHOOL("college"),
        COLLEGE("bachelor"),
        MASTER_DEGREE(BuildConfig.FLAVOR),
        DOCTOR_AND_ABOVE("doctor");

        public final String level;

        zy(String str) {
            this.level = str;
        }

        public static zy getEducationTypeByName(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (zy zyVar : values()) {
                if (zyVar.level.equals(str)) {
                    return zyVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m18697q(Map map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zy(Map map, String str, int i2) {
        if (map != null && !TextUtils.isEmpty(str)) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return i2;
    }

    private ni7(String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList, ArrayList<C5482g> arrayList2, String str6, EnumC5492y enumC5492y, Calendar calendar, boolean z2, String str7, String str8, String str9, zy zyVar, EnumC5484n enumC5484n) {
        this.f30641k = str;
        this.f72672toq = str2;
        this.f72674zy = str3;
        this.f30644q = str4;
        this.f30642n = str5;
        this.f30639g = arrayList;
        this.f72667f7l8 = arrayList2;
        this.f30646y = str6;
        this.f30645s = enumC5492y;
        this.f30643p = calendar;
        this.f72669ld6 = z2;
        this.f72673x2 = str7;
        this.f72671qrj = str8;
        this.f72670n7h = str9;
        this.f72668kja0 = zyVar;
        this.f30640h = enumC5484n;
    }
}
