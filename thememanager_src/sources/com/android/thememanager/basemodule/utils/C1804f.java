package com.android.thememanager.basemodule.utils;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.share.C2708s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import miui.os.Build;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.f */
/* JADX INFO: compiled from: ThemeDeviceCustom.java */
/* JADX INFO: loaded from: classes.dex */
public class C1804f {

    /* JADX INFO: renamed from: k */
    private static final String f10304k = "0";

    /* JADX INFO: renamed from: n */
    private static final String f10305n = "hatsune";

    /* JADX INFO: renamed from: q */
    private static final String f10306q = "museum";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57735toq = "32a15b84-7417-40b8-b8f9-0c933bb3f5c6";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57736zy = "0d2374dd-d93d-4448-9d25-8c5b18bc36a1";

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.f$q */
    /* JADX INFO: compiled from: ThemeDeviceCustom.java */
    private static class q {

        /* JADX INFO: renamed from: k */
        private String f10307k;

        /* JADX INFO: renamed from: q */
        private String f10308q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Map<String, String> f57737toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f57738zy;

        private q() {
            this.f57737toq = new HashMap();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.f$toq */
    /* JADX INFO: compiled from: ThemeDeviceCustom.java */
    public static class toq {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private static final String f57739cdj = "preview";

        /* JADX INFO: renamed from: h */
        private static final String f10309h = "title";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static final String f57740ki = "video";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final String f57741kja0 = "id";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final String f57742ld6 = "international";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final String f57743n7h = "online";

        /* JADX INFO: renamed from: p */
        private static final String f10310p = "subject";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final String f57744qrj = "local";

        /* JADX INFO: renamed from: s */
        public static final Set<String> f10311s = new k();

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final String f57745t8r = "guide_sort";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final String f57746x2 = "hwversion";

        /* JADX INFO: renamed from: y */
        public static final String f10312y = "custom_";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private q f57747f7l8;

        /* JADX INFO: renamed from: g */
        private q f10313g;

        /* JADX INFO: renamed from: k */
        private boolean f10314k;

        /* JADX INFO: renamed from: n */
        private List<String> f10315n = new ArrayList();

        /* JADX INFO: renamed from: q */
        private String[] f10316q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57748toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f57749zy;

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.f$toq$k */
        /* JADX INFO: compiled from: ThemeDeviceCustom.java */
        class k extends HashSet<String> {
            k() {
                add(C1804f.f57736zy);
                add(C1804f.f57735toq);
            }
        }

        public toq() {
            this.f10313g = new q();
            this.f57747f7l8 = new q();
        }

        public boolean cdj() {
            return "0".equals(this.f10313g.f10307k);
        }

        /* JADX INFO: renamed from: h */
        public boolean m7057h() {
            return !TextUtils.isEmpty(this.f57747f7l8.f10307k);
        }

        public String kja0() {
            if (this.f10314k) {
                return this.f57748toq;
            }
            return "custom_" + this.f57748toq;
        }

        public String ld6() {
            return this.f10313g.f10308q;
        }

        public Map<String, String> n7h() {
            return this.f57747f7l8.f57737toq;
        }

        /* JADX INFO: renamed from: p */
        public String m7058p() {
            return this.f10313g.f10307k;
        }

        public String qrj() {
            return this.f57747f7l8.f57738zy;
        }

        /* JADX INFO: renamed from: s */
        public String[] m7059s() {
            return this.f10316q;
        }

        public String x2() {
            return this.f57747f7l8.f10307k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.f$zy */
    /* JADX INFO: compiled from: ThemeDeviceCustom.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private static toq f10317k = C1804f.zy();

        private zy() {
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m7047q(JsonReader reader, q theme) throws IOException {
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (reader.peek() != JsonToken.NULL) {
                strNextName.hashCode();
                switch (strNextName) {
                    case "preview":
                        theme.f57738zy = reader.nextString();
                        break;
                    case "id":
                        theme.f10307k = reader.nextString();
                        break;
                    case "title":
                        reader.beginObject();
                        while (reader.hasNext()) {
                            theme.f57737toq.put(reader.nextName(), reader.nextString());
                        }
                        reader.endObject();
                        break;
                    case "video":
                        theme.f10308q = reader.nextString();
                        break;
                    default:
                        reader.skipValue();
                        break;
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
    }

    public static toq toq() {
        return zy.f10317k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static toq zy() throws Throwable {
        JsonReader jsonReader;
        JsonReader jsonReader2;
        ArrayList<toq> arrayList = new ArrayList();
        File file = new File(InterfaceC1789q.m5h3);
        JsonReader jsonReader3 = null;
        if (file.exists()) {
            try {
                jsonReader = new JsonReader(new BufferedReader(new FileReader(file)));
            } catch (IOException unused) {
                jsonReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    toq.f10311s.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                jsonReader3 = jsonReader;
                miuix.core.util.f7l8.m25531k(jsonReader3);
                throw th;
            }
            miuix.core.util.f7l8.m25531k(jsonReader);
        }
        File file2 = new File(InterfaceC1789q.xtyc);
        if (file2.exists()) {
            try {
                jsonReader2 = new JsonReader(new BufferedReader(new FileReader(file2)));
                try {
                    jsonReader2.beginArray();
                    while (jsonReader2.hasNext()) {
                        toq toqVar = new toq();
                        arrayList.add(toqVar);
                        jsonReader2.beginObject();
                        while (jsonReader2.hasNext()) {
                            String strNextName = jsonReader2.nextName();
                            if (jsonReader2.peek() == JsonToken.NULL) {
                                jsonReader2.skipValue();
                            } else {
                                byte b2 = -1;
                                switch (strNextName.hashCode()) {
                                    case -1867885268:
                                        if (strNextName.equals(C2708s.f16056n)) {
                                            b2 = 0;
                                        }
                                        break;
                                    case -1704062743:
                                        if (strNextName.equals("hwversion")) {
                                            b2 = 2;
                                        }
                                        break;
                                    case -1012222381:
                                        if (strNextName.equals(com.android.thememanager.basemodule.analysis.toq.tvn8)) {
                                            b2 = 4;
                                        }
                                        break;
                                    case 65532161:
                                        if (strNextName.equals("guide_sort")) {
                                            b2 = 5;
                                        }
                                        break;
                                    case 103145323:
                                        if (strNextName.equals("local")) {
                                            b2 = 3;
                                        }
                                        break;
                                    case 2064805518:
                                        if (strNextName.equals("international")) {
                                            b2 = 1;
                                        }
                                        break;
                                }
                                if (b2 == 0) {
                                    toqVar.f57748toq = jsonReader2.nextString();
                                } else if (b2 == 1) {
                                    toqVar.f57749zy = jsonReader2.nextBoolean();
                                } else if (b2 == 2) {
                                    jsonReader2.beginArray();
                                    while (jsonReader2.hasNext()) {
                                        toqVar.f10315n.add(jsonReader2.nextString());
                                    }
                                    jsonReader2.endArray();
                                } else if (b2 == 3) {
                                    m7047q(jsonReader2, toqVar.f10313g);
                                } else if (b2 == 4) {
                                    m7047q(jsonReader2, toqVar.f57747f7l8);
                                } else if (b2 != 5) {
                                    jsonReader2.skipValue();
                                } else {
                                    toqVar.f10316q = jsonReader2.nextString().split(",");
                                }
                            }
                        }
                        jsonReader2.endObject();
                    }
                    jsonReader2.endArray();
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    th = th3;
                    jsonReader3 = jsonReader2;
                    miuix.core.util.f7l8.m25531k(jsonReader3);
                    throw th;
                }
            } catch (IOException unused4) {
                jsonReader2 = null;
            } catch (Throwable th4) {
                th = th4;
            }
            miuix.core.util.f7l8.m25531k(jsonReader2);
        } else if (new File("/system/media/lockscreen/museum_lockscreen.jpg").exists()) {
            toq toqVar2 = new toq();
            toqVar2.f10314k = true;
            toqVar2.f57748toq = f10306q;
            toqVar2.f57749zy = false;
            toqVar2.f10313g.f10307k = com.android.thememanager.basemodule.resource.n7h.f57686kja0;
            toqVar2.f57747f7l8.f10307k = f57735toq;
            toqVar2.f57747f7l8.f57737toq.put(fu4.f57751toq, "British Museum");
            toqVar2.f57747f7l8.f57737toq.put(fu4.f57752zy, "大英博物馆");
            toqVar2.f57747f7l8.f57738zy = "file:///android_asset/theme-settings-res/precust_online_theme_museum.jpg";
            toqVar2.f10315n.add("2.4.2");
            arrayList.add(toqVar2);
        } else if (new File("/system/media/lockscreen/hatsune_lockscreen.jpg").exists()) {
            toq toqVar3 = new toq();
            toqVar3.f10314k = true;
            toqVar3.f57748toq = f10305n;
            toqVar3.f57749zy = false;
            toqVar3.f10313g.f10307k = "0";
            toqVar3.f57747f7l8.f10307k = f57736zy;
            toqVar3.f57747f7l8.f57737toq.put(fu4.f57751toq, "Hatsune");
            toqVar3.f57747f7l8.f57737toq.put(fu4.f57752zy, "初音");
            toqVar3.f57747f7l8.f57738zy = "file:///android_asset/theme-settings-res/precust_online_theme_hatsune.jpg";
            toqVar3.f10315n.add("2.31.0");
            toqVar3.f10315n.add("2.30.0");
        }
        for (toq toqVar4 : arrayList) {
            String strQrj = y9n.qrj();
            for (String str : toqVar4.f10315n) {
                if (str.equals("*") || (str.equals(strQrj) && toqVar4.f57749zy == Build.IS_INTERNATIONAL_BUILD)) {
                    return toqVar4;
                }
            }
        }
        return null;
    }
}
