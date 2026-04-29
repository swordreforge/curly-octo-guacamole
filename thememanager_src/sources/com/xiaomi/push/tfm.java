package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.mipush.sdk.C5658n;
import com.xiaomi.onetrack.api.at;
import com.xiaomi.onetrack.util.ac;
import com.xiaomi.push.service.C5926m;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tfm {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static tfm f73682ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static String f73683n7h;

    /* JADX INFO: renamed from: p */
    protected static Context f33966p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static String f73684qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static InterfaceC5948k f73685x2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f73686f7l8;

    /* JADX INFO: renamed from: g */
    private final long f33968g;

    /* JADX INFO: renamed from: k */
    protected final Map<String, vq> f33969k;

    /* JADX INFO: renamed from: n */
    private long f33970n;

    /* JADX INFO: renamed from: q */
    private String f33971q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private qo f73687toq;

    /* JADX INFO: renamed from: y */
    private String f33972y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected toq f73688zy;

    /* JADX INFO: renamed from: s */
    protected static final Map<String, mu> f33967s = new HashMap();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected static boolean f73681kja0 = false;

    /* JADX INFO: renamed from: com.xiaomi.push.tfm$k */
    public interface InterfaceC5948k {
        /* JADX INFO: renamed from: k */
        tfm mo21799k(Context context, qo qoVar, toq toqVar, String str);
    }

    public interface toq {
        /* JADX INFO: renamed from: a */
        String mo21800a(String str);
    }

    protected tfm(Context context, qo qoVar, toq toqVar, String str) {
        this(context, qoVar, toqVar, str, null, null);
    }

    private String a9() {
        try {
            PackageInfo packageInfo = f33966p.getPackageManager().getPackageInfo(f33966p.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    private ArrayList<mu> f7l8(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        mcp();
        synchronized (this.f33969k) {
            kja0();
            for (String str : this.f33969k.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Map<String, mu> map = f33967s;
        synchronized (map) {
            for (Object obj : map.values().toArray()) {
                mu muVar = (mu) obj;
                if (!muVar.fn3e()) {
                    f33967s.remove(muVar.f33428q);
                }
            }
        }
        if (!arrayList.contains(ki())) {
            arrayList.add(ki());
        }
        ArrayList<mu> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(null);
        }
        try {
            String str2 = oc.m21365z(f33966p) ? "wifi" : "wap";
            String strMo21801g = mo21801g(arrayList, str2, this.f33971q, true);
            if (!TextUtils.isEmpty(strMo21801g)) {
                JSONObject jSONObject3 = new JSONObject(strMo21801g);
                com.xiaomi.channel.commonutils.logger.zy.m19302z(strMo21801g);
                if ("OK".equalsIgnoreCase(jSONObject3.getString("S"))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString(at.f31714h);
                    String string2 = jSONObject4.getString(at.f31715i);
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString("ip");
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.zy.m19300t("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        String str3 = arrayList.get(i3);
                        JSONArray jSONArrayOptJSONArray = jSONObject5.optJSONArray(str3);
                        if (jSONArrayOptJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.zy.kja0("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            mu muVar2 = new mu(str3);
                            int i4 = 0;
                            while (i4 < jSONArrayOptJSONArray.length()) {
                                String string6 = jSONArrayOptJSONArray.getString(i4);
                                if (TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                } else {
                                    jSONObject2 = jSONObject5;
                                    muVar2.m21296s(new gbni(string6, jSONArrayOptJSONArray.length() - i4));
                                }
                                i4++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i3, muVar2);
                            muVar2.f33429s = string5;
                            muVar2.f33426n = string;
                            muVar2.f73494f7l8 = string3;
                            muVar2.f33430y = string4;
                            muVar2.f33424g = string2;
                            if (jSONObject4.has("stat-percent")) {
                                muVar2.f7l8(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                muVar2.ki(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has("ttl")) {
                                muVar2.m21297y(((long) jSONObject4.getInt("ttl")) * 1000);
                            }
                            x2(muVar2.toq());
                        }
                        i3++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("reserved");
                    if (jSONObjectOptJSONObject != null) {
                        long j2 = ac.f32265a;
                        if (jSONObject4.has("reserved-ttl")) {
                            j2 = ((long) jSONObject4.getInt("reserved-ttl")) * 1000;
                        }
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.zy.kja0("no bucket found for " + next);
                            } else {
                                mu muVar3 = new mu(next);
                                muVar3.m21297y(j2);
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                                    String string7 = jSONArrayOptJSONArray2.getString(i5);
                                    if (!TextUtils.isEmpty(string7)) {
                                        muVar3.m21296s(new gbni(string7, jSONArrayOptJSONArray2.length() - i5));
                                    }
                                }
                                Map<String, mu> map2 = f33967s;
                                synchronized (map2) {
                                    if (this.f73687toq.mo21401a(next)) {
                                        map2.put(next, muVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("failed to get bucket " + e2.getMessage());
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            mu muVar4 = arrayList2.get(i6);
            if (muVar4 != null) {
                qrj(arrayList.get(i6), muVar4);
            }
        }
        ni7();
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    private byte[] m21845h() {
        return C5874l.zy(f33966p.getPackageName() + "_key_salt");
    }

    private String jk() {
        return "host_fallbacks";
    }

    public static synchronized void ld6(InterfaceC5948k interfaceC5948k) {
        f73685x2 = interfaceC5948k;
        f73682ld6 = null;
    }

    /* JADX INFO: renamed from: n */
    static String m21846n(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i2 = 0; i2 < bytes.length; i2++) {
                byte b2 = bytes[i2];
                int i3 = b2 & 240;
                if (i3 != 240) {
                    bytes[i2] = (byte) (((b2 & com.google.common.base.zy.f68111cdj) ^ ((byte) (((b2 >> 4) + length) & 15))) | i3);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static void n7h(String str, String str2) {
        Map<String, mu> map = f33967s;
        mu muVar = map.get(str);
        synchronized (map) {
            if (muVar == null) {
                mu muVar2 = new mu(str);
                muVar2.m21297y(ac.f32265a);
                muVar2.m21294p(str2);
                map.put(str, muVar2);
            } else {
                muVar.m21294p(str2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static synchronized void m21847p(Context context, qo qoVar, toq toqVar, String str, String str2, String str3) {
        Context applicationContext = context.getApplicationContext();
        f33966p = applicationContext;
        if (applicationContext == null) {
            f33966p = context;
        }
        if (f73682ld6 == null) {
            InterfaceC5948k interfaceC5948k = f73685x2;
            if (interfaceC5948k == null) {
                f73682ld6 = new tfm(context, qoVar, toqVar, str, str2, str3);
            } else {
                f73682ld6 = interfaceC5948k.mo21799k(context, qoVar, toqVar, str);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    static String m21848q() {
        if (f33966p == null) {
            return "unknown";
        }
        try {
            lvui lvuiVarM21359n = oc.m21359n();
            if (lvuiVarM21359n == null) {
                return "unknown";
            }
            if (lvuiVarM21359n.m21210k() == 1) {
                return "WIFI-UNKNOWN";
            }
            return lvuiVarM21359n.m21211n() + C5658n.f73185t8r + lvuiVarM21359n.m21213y();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static synchronized tfm zy() {
        tfm tfmVar;
        tfmVar = f73682ld6;
        if (tfmVar == null) {
            throw new IllegalStateException("the host manager is not initialized yet.");
        }
        return tfmVar;
    }

    public mu cdj(String str) {
        return toq(str, true);
    }

    protected mu fn3e(String str) {
        vq vqVar;
        mu muVarM21917k;
        synchronized (this.f33969k) {
            kja0();
            vqVar = this.f33969k.get(str);
        }
        if (vqVar == null || (muVarM21917k = vqVar.m21917k()) == null) {
            return null;
        }
        return muVarM21917k;
    }

    public mu fu4(String str) {
        mu muVar;
        Map<String, mu> map = f33967s;
        synchronized (map) {
            muVar = map.get(str);
        }
        return muVar;
    }

    /* JADX INFO: renamed from: g */
    protected String mo21801g(ArrayList<String> arrayList, String str, String str2, boolean z2) throws IOException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<d3> arrayList3 = new ArrayList();
        arrayList3.add(new jp0y("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new jp0y("conpt", m21846n(oc.m21360p(f33966p))));
        }
        if (z2) {
            arrayList3.add(new jp0y("reserved", "1"));
        }
        arrayList3.add(new jp0y("uuid", str2));
        arrayList3.add(new jp0y("list", n5r1.m21305q(arrayList, ",")));
        arrayList3.add(new jp0y("countrycode", C5926m.m21688k(f33966p).m21690g()));
        arrayList3.add(new jp0y("push_sdk_vc", String.valueOf(C5872k.f33109n)));
        String strKi = ki();
        mu muVarFn3e = fn3e(strKi);
        String str3 = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", strKi);
        if (muVarFn3e == null) {
            arrayList2.add(str3);
            Map<String, mu> map = f33967s;
            synchronized (map) {
                mu muVar = map.get(strKi);
                if (muVar != null) {
                    Iterator<String> it = muVar.mo20721n(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                    }
                }
            }
        } else {
            arrayList2 = muVarFn3e.m21295q(str3);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e2 = null;
        while (it2.hasNext()) {
            Uri.Builder builderBuildUpon = Uri.parse(it2.next()).buildUpon();
            for (d3 d3Var : arrayList3) {
                builderBuildUpon.appendQueryParameter(d3Var.mo20717a(), d3Var.mo20718b());
            }
            try {
                toq toqVar = this.f73688zy;
                return toqVar == null ? oc.ld6(f33966p, new URL(builderBuildUpon.toString())) : toqVar.mo21800a(builderBuildUpon.toString());
            } catch (IOException e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("network exception: " + e2.getMessage());
        throw e2;
    }

    /* JADX INFO: renamed from: i */
    protected void m21849i(String str) {
        synchronized (this.f33969k) {
            this.f33969k.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(InterfaceC1925p.w1) != 2) {
                throw new JSONException("Bad version");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    vq qVar = new vq().toq(jSONArrayOptJSONArray.getJSONObject(i2));
                    this.f33969k.put(qVar.zy(), qVar);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("reserved");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
                    String strOptString = jSONObject2.optString("host");
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            mu muVarM21293k = new mu(strOptString).m21293k(jSONObject2);
                            f33967s.put(muVarM21293k.f33428q, muVarM21293k);
                            com.xiaomi.channel.commonutils.logger.zy.kja0("load local reserved host for " + muVarM21293k.f33428q);
                        } catch (JSONException unused) {
                            com.xiaomi.channel.commonutils.logger.zy.kja0("parse reserved host fail.");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public mu m21850k(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return toq(new URL(str).getHost(), true);
    }

    protected String ki() {
        return "resolver.msg.xiaomi.net";
    }

    protected boolean kja0() {
        synchronized (this.f33969k) {
            if (f73681kja0) {
                return true;
            }
            f73681kja0 = true;
            this.f33969k.clear();
            try {
                String strM21854z = m21854z();
                if (!TextUtils.isEmpty(strM21854z)) {
                    m21849i(strM21854z);
                    com.xiaomi.channel.commonutils.logger.zy.m19302z("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("load bucket failure: " + th.getMessage());
            }
            return false;
        }
    }

    public void mcp() {
        String next;
        synchronized (this.f33969k) {
            Iterator<vq> it = this.f33969k.values().iterator();
            while (it.hasNext()) {
                it.next().f7l8(true);
            }
            while (true) {
                for (boolean z2 = false; !z2; z2 = true) {
                    Iterator<String> it2 = this.f33969k.keySet().iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        if (this.f33969k.get(next).m21919q().isEmpty()) {
                            break;
                        }
                    }
                }
                this.f33969k.remove(next);
            }
        }
    }

    public void ni7() {
        FileOutputStream fileOutputStreamOpenFileOutput;
        Closeable closeable;
        BufferedOutputStream bufferedOutputStream;
        Exception e2;
        synchronized (this.f33969k) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    String string = m21853y().toString();
                    com.xiaomi.channel.commonutils.logger.zy.m19302z("persist host fallbacks = " + string);
                    if (TextUtils.isEmpty(string)) {
                        fileOutputStreamOpenFileOutput = null;
                    } else {
                        fileOutputStreamOpenFileOutput = f33966p.openFileOutput(jk(), 0);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStreamOpenFileOutput);
                            try {
                                bufferedOutputStream.write(cn02.zy(m21845h(), string.getBytes(StandardCharsets.UTF_8)));
                                bufferedOutputStream.flush();
                                bufferedOutputStream2 = bufferedOutputStream;
                            } catch (Exception e3) {
                                e2 = e3;
                                com.xiaomi.channel.commonutils.logger.zy.kja0("persist bucket failure: " + e2.getMessage());
                                f26p.toq(bufferedOutputStream);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            bufferedOutputStream = null;
                            e2 = e;
                            com.xiaomi.channel.commonutils.logger.zy.kja0("persist bucket failure: " + e2.getMessage());
                            f26p.toq(bufferedOutputStream);
                            f26p.toq(fileOutputStreamOpenFileOutput);
                        } catch (Throwable th) {
                            th = th;
                            closeable = null;
                            th = th;
                            f26p.toq(closeable);
                            f26p.toq(fileOutputStreamOpenFileOutput);
                            throw th;
                        }
                    }
                    f26p.toq(bufferedOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    f26p.toq(closeable);
                    f26p.toq(fileOutputStreamOpenFileOutput);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileOutputStreamOpenFileOutput = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStreamOpenFileOutput = null;
                closeable = null;
            }
            f26p.toq(fileOutputStreamOpenFileOutput);
        }
    }

    public void o1t() {
        String strM21852t = m21852t();
        try {
            File file = new File(f33966p.getFilesDir(), strM21852t);
            if (file.exists()) {
                boolean zDelete = file.delete();
                StringBuilder sb = new StringBuilder();
                sb.append("Delete old host fallbacks file ");
                sb.append(strM21852t);
                sb.append(zDelete ? " successful." : " failed.");
                com.xiaomi.channel.commonutils.logger.zy.kja0(sb.toString());
            } else {
                com.xiaomi.channel.commonutils.logger.zy.m19302z("Old host fallbacks file " + strM21852t + " does not exist.");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Delete old host fallbacks file " + strM21852t + " error: " + e2.getMessage());
        }
    }

    public void qrj(String str, mu muVar) {
        if (TextUtils.isEmpty(str) || muVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + muVar);
        }
        if (this.f73687toq.mo21401a(str)) {
            synchronized (this.f33969k) {
                kja0();
                if (this.f33969k.containsKey(str)) {
                    this.f33969k.get(str).m21916g(muVar);
                } else {
                    vq vqVar = new vq(str);
                    vqVar.m21916g(muVar);
                    this.f33969k.put(str, vqVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m21851s() {
        synchronized (this.f33969k) {
            this.f33969k.clear();
        }
    }

    /* JADX INFO: renamed from: t */
    protected String m21852t() {
        if ("com.xiaomi.xmsf".equals(f73684qrj)) {
            return f73684qrj;
        }
        return f73684qrj + ":pushservice";
    }

    public void t8r() {
        ArrayList<String> arrayList;
        synchronized (this.f33969k) {
            kja0();
            arrayList = new ArrayList<>(this.f33969k.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vq vqVar = this.f33969k.get(arrayList.get(size));
                if (vqVar != null && vqVar.m21917k() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<mu> arrayListF7l8 = f7l8(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayListF7l8.get(i2) != null) {
                qrj(arrayList.get(i2), arrayListF7l8.get(i2));
            }
        }
    }

    public mu toq(String str, boolean z2) {
        mu muVarWvg;
        com.xiaomi.channel.commonutils.logger.zy.wvg("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z2));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        if (!this.f73687toq.mo21401a(str)) {
            return null;
        }
        mu muVarFn3e = fn3e(str);
        return (muVarFn3e == null || !muVarFn3e.fn3e()) ? (z2 && oc.zurt(f33966p) && (muVarWvg = wvg(str)) != null) ? muVarWvg : new d8wk(this, str, muVarFn3e) : muVarFn3e;
    }

    protected mu wvg(String str) {
        if (System.currentTimeMillis() - this.f73686f7l8 <= this.f33970n * 60 * 1000) {
            return null;
        }
        this.f73686f7l8 = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        mu muVar = f7l8(arrayList).get(0);
        if (muVar != null) {
            this.f33970n = 0L;
            return muVar;
        }
        long j2 = this.f33970n;
        if (j2 >= 15) {
            return null;
        }
        this.f33970n = j2 + 1;
        return null;
    }

    public void x2(String str) {
        this.f33972y = str;
    }

    /* JADX INFO: renamed from: y */
    protected JSONObject m21853y() {
        JSONObject jSONObject;
        synchronized (this.f33969k) {
            jSONObject = new JSONObject();
            jSONObject.put(InterfaceC1925p.w1, 2);
            JSONArray jSONArray = new JSONArray();
            Iterator<vq> it = this.f33969k.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m21918n());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<mu> it2 = f33967s.values().iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next().m21290g());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: z */
    protected String m21854z() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        File file;
        try {
            file = new File(f33966p.getFilesDir(), jk());
        } catch (Throwable th) {
            th = th;
            bufferedInputStream = null;
            fileInputStream = null;
        }
        try {
            if (!file.isFile()) {
                f26p.toq(null);
                f26p.toq(null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    String str = new String(cn02.toq(m21845h(), f26p.f7l8(bufferedInputStream)), StandardCharsets.UTF_8);
                    com.xiaomi.channel.commonutils.logger.zy.m19302z("load host fallbacks = " + str);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("load host exception " + th.getMessage());
            return null;
        } finally {
            f26p.toq(bufferedInputStream);
            f26p.toq(fileInputStream);
        }
    }

    public String zurt() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f33969k) {
            for (Map.Entry<String, vq> entry : this.f33969k.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":\n");
                sb.append(entry.getValue().toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    protected tfm(Context context, qo qoVar, toq toqVar, String str, String str2, String str3) {
        this.f33969k = new HashMap();
        this.f33971q = "0";
        this.f33970n = 0L;
        this.f33968g = 15L;
        this.f73686f7l8 = 0L;
        this.f33972y = "isp_prov_city_country_ip";
        this.f73688zy = toqVar;
        if (qoVar == null) {
            this.f73687toq = new wo(this);
        } else {
            this.f73687toq = qoVar;
        }
        this.f33971q = str;
        f73684qrj = str2 == null ? context.getPackageName() : str2;
        f73683n7h = str3 == null ? a9() : str3;
    }
}
