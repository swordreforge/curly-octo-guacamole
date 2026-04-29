package com.android.thememanager.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import ch.InterfaceC1395k;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.model.WallpaperHistoryItem;
import com.android.thememanager.module.detail.view.ikck;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.sok;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.y9n;

/* JADX INFO: renamed from: com.android.thememanager.settings.z */
/* JADX INFO: compiled from: WallpaperHistoryHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2687z {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61019f7l8 = "wallpaper_history_migrate";

    /* JADX INFO: renamed from: g */
    private static final String f15937g;

    /* JADX INFO: renamed from: h */
    private static InterfaceC1395k f15938h = null;

    /* JADX INFO: renamed from: k */
    private static final String f15939k = "WallpaperHistoryHelper";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f61020kja0 = "wallpaper_used_history";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final long f61021ld6 = 7776000000L;

    /* JADX INFO: renamed from: n */
    private static final String f15940n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final Object f61022n7h;

    /* JADX INFO: renamed from: p */
    private static final int f15941p = 40;

    /* JADX INFO: renamed from: q */
    public static final String f15942q = ".wallpaper_history";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f61023qrj = 11;

    /* JADX INFO: renamed from: s */
    private static final int f15943s = 300;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f61024toq = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f61025x2 = 10;

    /* JADX INFO: renamed from: y */
    private static final String f15944y = " ";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f61026zy = 1;

    /* JADX INFO: renamed from: com.android.thememanager.settings.z$k */
    /* JADX INFO: compiled from: WallpaperHistoryHelper.java */
    public static class k {

        /* JADX INFO: renamed from: g */
        public int f15945g = 10;

        /* JADX INFO: renamed from: k */
        public String f15946k;

        /* JADX INFO: renamed from: n */
        public String f15947n;

        /* JADX INFO: renamed from: q */
        public int f15948q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f61027toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f61028zy;
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.z$toq */
    /* JADX INFO: compiled from: WallpaperHistoryHelper.java */
    public @interface toq {
    }

    static {
        String str = C1788k.f10175k + f15942q + "/";
        f15940n = str;
        f15937g = str + "config.json";
        f61022n7h = new Object();
    }

    public static void cdj(Resource resource, sok<String, Matrix, Long> triple) {
        k kVar = triple.f16800q;
        if (kVar == null) {
            Log.w(f15939k, "updateVideoResource para error");
            return;
        }
        if (C1807g.zurt()) {
            resource.setSensorVideoMessage(kVar.f61027toq, kVar.f61028zy, kVar.f15948q, kVar.f15945g);
            PathEntry pathEntry = new PathEntry();
            pathEntry.setLocalPath(kVar.f15947n);
            resource.setThumbnails(Collections.singletonList(pathEntry));
            resource.setCategory(kVar.f15946k);
        }
    }

    public static List<sok<String, Matrix, Long>> f7l8(@toq int type) {
        ArrayList arrayList;
        synchronized (f61022n7h) {
            int i2 = type == 0 ? 300 : 40;
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<String> listM9383s = m9383s(type);
            arrayList = new ArrayList();
            if (listM9383s.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : listM9383s) {
                    sok<String, Matrix, Long> sokVarM9380n = m9380n(str);
                    if (sokVarM9380n != null) {
                        long jLongValue = sokVarM9380n.f61414zy.longValue();
                        if (jLongValue == 0 || jCurrentTimeMillis - jLongValue <= f61021ld6) {
                            if (new File(sokVarM9380n.f16799k).exists()) {
                                arrayList2.add(str);
                                arrayList.add(sokVarM9380n);
                                if (arrayList2.size() == i2) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (arrayList2.size() != listM9383s.size()) {
                    ki(arrayList2, type);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<sok<String, Matrix, Long>> m9377g() {
        return f7l8(0);
    }

    /* JADX INFO: renamed from: h */
    public static void m9378h(List<String> paths, @toq int type) {
        synchronized (f61022n7h) {
            if (paths != null) {
                if (paths.size() != 0) {
                    List<String> listM9383s = m9383s(type);
                    for (String str : paths) {
                        String str2 = null;
                        Iterator<String> it = listM9383s.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String next = it.next();
                                if (str.equals(ld6(next))) {
                                    str2 = next;
                                    break;
                                }
                            }
                        }
                        listM9383s.remove(str2);
                    }
                    ki(listM9383s, type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m9379k(String key, Matrix matrix) {
        toq(key, matrix, 0);
    }

    @y9n
    private static void ki(List<String> list, @toq int type) {
        int i2;
        if (f15938h == null) {
            m9382q();
        }
        StringBuffer stringBuffer = new StringBuffer("");
        int size = list.size();
        if (size > 0) {
            int i3 = 0;
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                stringBuffer.append(list.get(i3) + "\n");
                i3++;
            }
            stringBuffer.append(list.get(i2));
            f15938h.putString(String.valueOf(type), stringBuffer.toString());
        } else {
            f15938h.remove(String.valueOf(type));
        }
        f15938h.commit();
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7148q(ikck.dy, new Intent(ikck.dy));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("must access on Worker-Thread!");
        }
    }

    public static void kja0() {
        m9382q();
    }

    private static String ld6(String record) {
        String[] strArrSplit = record.split(f15944y);
        if (strArrSplit == null) {
            return null;
        }
        try {
            if (strArrSplit.length > 0) {
                return URLDecoder.decode(strArrSplit[0], com.xiaomi.accountsdk.request.wvg.f72949toq);
            }
            return null;
        } catch (UnsupportedEncodingException | IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private static sok<String, Matrix, Long> m9380n(String record) {
        float[] fArr = new float[9];
        String[] strArrSplit = record.split(f15944y);
        try {
            String strDecode = URLDecoder.decode(strArrSplit[0], com.xiaomi.accountsdk.request.wvg.f72949toq);
            int length = strArrSplit.length;
            int i2 = length - 1;
            if (length < 10) {
                return null;
            }
            for (int i3 = 1; i3 < 10; i3++) {
                fArr[i3 - 1] = Float.parseFloat(strArrSplit[i3]);
                i2--;
            }
            Matrix matrix = new Matrix();
            matrix.setValues(fArr);
            long j2 = 0;
            if (length >= 11) {
                i2--;
                j2 = Long.parseLong(strArrSplit[10]);
            }
            if (i2 <= 0 || length < 12) {
                return new sok<>(strDecode, matrix, Long.valueOf(j2));
            }
            return new sok<>(strDecode, matrix, Long.valueOf(j2), n7h(strArrSplit[11]));
        } catch (UnsupportedEncodingException | IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static k n7h(String infos) {
        return (k) com.android.thememanager.library.util.app.toq.toq(infos, k.class);
    }

    @zy.lvui
    /* JADX INFO: renamed from: p */
    public static Pair<Integer, WallpaperHistoryItem> m9381p() {
        Matrix matrix;
        Matrix matrix2;
        String str;
        Pair<Integer, WallpaperHistoryItem> pair;
        synchronized (f61022n7h) {
            boolean z2 = false;
            List<sok<String, Matrix, Long>> listF7l8 = f7l8(0);
            List<sok<String, Matrix, Long>> listF7l82 = f7l8(1);
            int size = listF7l8.size() + listF7l82.size();
            long j2 = 0;
            String str2 = null;
            if (listF7l8.size() > 0) {
                str2 = listF7l8.get(0).f16799k;
                Matrix matrix3 = listF7l8.get(0).f61413toq;
                long jLongValue = listF7l8.get(0).f61414zy.longValue();
                matrix = matrix3;
                j2 = jLongValue;
            } else {
                matrix = null;
            }
            if (listF7l82.size() <= 0 || listF7l82.get(0).f61414zy.longValue() <= j2) {
                matrix2 = matrix;
                str = str2;
            } else {
                String str3 = listF7l82.get(0).f16799k;
                matrix2 = listF7l82.get(0).f61413toq;
                z2 = true;
                str = str3;
            }
            pair = new Pair<>(Integer.valueOf(size), new WallpaperHistoryItem(str, matrix2, j2, z2));
        }
        return pair;
    }

    /* JADX INFO: renamed from: q */
    private static void m9382q() {
        if (g1.x2(f61019f7l8, false) || new File(f15940n).exists()) {
            f15938h = new ch.zy(f15937g);
        } else {
            f15938h = x2();
            g1.gyi(f61019f7l8, true);
        }
    }

    public static String qrj(k infos) {
        return com.android.thememanager.library.util.app.toq.m8027g(infos);
    }

    /* JADX INFO: renamed from: s */
    private static List<String> m9383s(@toq int type) {
        ArrayList arrayList = new ArrayList();
        if (f15938h == null) {
            m9382q();
        }
        if (f15938h.contains(String.valueOf(type))) {
            for (String str : f15938h.getString(String.valueOf(type), "").split("\n")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void toq(String key, Matrix matrix, @toq int type) {
        zy(key, matrix, type, null);
    }

    private static InterfaceC1395k x2() {
        SharedPreferences sharedPreferences = C2082k.zy().toq().getSharedPreferences(f61020kja0, 0);
        ch.zy zyVar = new ch.zy(f15937g);
        if (sharedPreferences.contains("0")) {
            zyVar.putString("0", sharedPreferences.getString("0", ""));
        }
        if (sharedPreferences.contains("1")) {
            zyVar.putString("1", sharedPreferences.getString("1", ""));
        }
        sharedPreferences.edit().clear().apply();
        zyVar.commit();
        return zyVar;
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    public static String m9384y() {
        String str = f15940n;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static void zy(String key, Matrix matrix, @toq int type, k paras) {
        synchronized (f61022n7h) {
            if (TextUtils.isEmpty(key)) {
                return;
            }
            if (matrix == null) {
                matrix = new Matrix();
            }
            List<String> listM9383s = m9383s(type);
            String str = null;
            for (String str2 : listM9383s) {
                if (key.equals(ld6(str2))) {
                    str = str2;
                }
            }
            listM9383s.remove(str);
            try {
                StringBuffer stringBuffer = new StringBuffer(URLEncoder.encode(key, com.xiaomi.accountsdk.request.wvg.f72949toq));
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                for (int i2 = 0; i2 < 9; i2++) {
                    stringBuffer.append(f15944y + fArr[i2]);
                }
                stringBuffer.append(f15944y + System.currentTimeMillis());
                if (paras != null) {
                    String strQrj = qrj(paras);
                    if (!TextUtils.isEmpty(strQrj)) {
                        stringBuffer.append(f15944y);
                        stringBuffer.append(strQrj);
                    }
                }
                listM9383s.add(0, stringBuffer.toString());
                ki(listM9383s, type);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
    }
}
