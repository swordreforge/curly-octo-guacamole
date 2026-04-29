package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.utils.C1510q;
import com.airbnb.lottie.utils.C1512y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import zy.y9n;

/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class ni7 {

    /* JADX INFO: renamed from: k */
    private static final Map<String, C1429c<ld6>> f8132k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final byte[] f56151toq = {80, 75, 3, 4};

    private ni7() {
    }

    @y9n
    public static hyr<ld6> a9(Context context, @zy.n5r1 int i2) {
        return fti(context, i2, nn86(context, i2));
    }

    @y9n
    public static hyr<ld6> cdj(Context context, String str) {
        return ki(context, str, "asset_" + str);
    }

    @y9n
    public static hyr<ld6> d2ok(ZipInputStream zipInputStream, @zy.dd String str) {
        try {
            return lvui(zipInputStream, str);
        } finally {
            C1512y.zy(zipInputStream);
        }
    }

    @y9n
    public static hyr<ld6> d3(Context context, String str) {
        return oc(context, str, str);
    }

    private static Boolean dd(okio.n7h n7hVar) {
        try {
            okio.n7h n7hVarPeek = n7hVar.peek();
            for (byte b2 : f56151toq) {
                if (n7hVarPeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            n7hVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e2) {
            C1510q.zy("Failed to check zip file header", e2);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static C1429c<ld6> eqxt(final ZipInputStream zipInputStream, @zy.dd final String str) {
        return x2(str, new Callable() { // from class: com.airbnb.lottie.fn3e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.d2ok(zipInputStream, str);
            }
        });
    }

    @y9n
    public static hyr<ld6> fn3e(InputStream inputStream, @zy.dd String str) {
        return zurt(inputStream, str, true);
    }

    @y9n
    public static hyr<ld6> fti(Context context, @zy.n5r1 int i2, @zy.dd String str) {
        try {
            okio.n7h n7hVarM27592n = okio.d2ok.m27592n(okio.d2ok.fn3e(context.getResources().openRawResource(i2)));
            return dd(n7hVarM27592n).booleanValue() ? d2ok(new ZipInputStream(n7hVarM27592n.pjz9()), str) : fn3e(n7hVarM27592n.pjz9(), str);
        } catch (Resources.NotFoundException e2) {
            return new hyr<>((Throwable) e2);
        }
    }

    @y9n
    public static hyr<ld6> fu4(com.airbnb.lottie.parser.moshi.zy zyVar, @zy.dd String str) {
        return m6137z(zyVar, str, true);
    }

    public static C1429c<ld6> gvn7(final Context context, final String str, @zy.dd final String str2) {
        return x2(str2, new Callable() { // from class: com.airbnb.lottie.n7h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.vyq(context, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C1429c<ld6> m6126h(Context context, final String str, @zy.dd final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return x2(str2, new Callable() { // from class: com.airbnb.lottie.zurt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.ki(applicationContext, str, str2);
            }
        });
    }

    public static void hb(int i2) {
        com.airbnb.lottie.model.f7l8.zy().m6058n(i2);
    }

    /* JADX INFO: renamed from: i */
    public static C1429c<ld6> m6127i(final InputStream inputStream, @zy.dd final String str) {
        return x2(str, new Callable() { // from class: com.airbnb.lottie.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.fn3e(inputStream, str);
            }
        });
    }

    public static C1429c<ld6> jk(Context context, @zy.n5r1 final int i2, @zy.dd final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return x2(str, new Callable() { // from class: com.airbnb.lottie.qrj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.uv6(weakReference, applicationContext, i2, str);
            }
        });
    }

    public static C1429c<ld6> jp0y(Context context, String str) {
        return gvn7(context, str, "url_" + str);
    }

    @y9n
    public static hyr<ld6> ki(Context context, String str, @zy.dd String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return fn3e(context.getAssets().open(str), str2);
            }
            return d2ok(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new hyr<>((Throwable) e2);
        }
    }

    public static C1429c<ld6> kja0(Context context, String str) {
        return m6126h(context, str, "asset_" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6129l(String str, AtomicBoolean atomicBoolean, ld6 ld6Var) {
        f8132k.remove(str);
        atomicBoolean.set(true);
    }

    @y9n
    private static hyr<ld6> lvui(ZipInputStream zipInputStream, @zy.dd String str) {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ld6 qVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    qVar = m6137z(com.airbnb.lottie.parser.moshi.zy.m6177t(okio.d2ok.m27592n(okio.d2ok.fn3e(zipInputStream))), null, false).toq();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(com.android.thememanager.basemodule.resource.constants.toq.ybu) || name.contains(".jpeg")) {
                    map.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (qVar == null) {
                return new hyr<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                dd ddVarN7h = n7h(qVar, (String) entry.getKey());
                if (ddVarN7h != null) {
                    ddVarN7h.m5958y(C1512y.qrj((Bitmap) entry.getValue(), ddVarN7h.m5954g(), ddVarN7h.m5957q()));
                }
            }
            for (Map.Entry<String, dd> entry2 : qVar.m5976p().entrySet()) {
                if (entry2.getValue().m5955k() == null) {
                    return new hyr<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().zy()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f7l8.zy().m6059q(str, qVar);
            }
            return new hyr<>(qVar);
        } catch (IOException e2) {
            return new hyr<>((Throwable) e2);
        }
    }

    public static C1429c<ld6> mcp(Context context, @zy.n5r1 int i2) {
        return jk(context, i2, nn86(context, i2));
    }

    @zy.dd
    private static dd n7h(ld6 ld6Var, String str) {
        for (dd ddVar : ld6Var.m5976p().values()) {
            if (ddVar.zy().equals(str)) {
                return ddVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hyr ncyb(ld6 ld6Var) throws Exception {
        return new hyr(ld6Var);
    }

    public static C1429c<ld6> ni7(final com.airbnb.lottie.parser.moshi.zy zyVar, @zy.dd final String str) {
        return x2(str, new Callable() { // from class: com.airbnb.lottie.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.fu4(zyVar, str);
            }
        });
    }

    private static String nn86(Context context, @zy.n5r1 int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m6133r(context) ? "_night_" : "_day_");
        sb.append(i2);
        return sb.toString();
    }

    public static C1429c<ld6> o1t(final String str, @zy.dd final String str2) {
        return x2(str2, new Callable() { // from class: com.airbnb.lottie.t8r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.wvg(str, str2);
            }
        });
    }

    @y9n
    public static hyr<ld6> oc(Context context, String str, @zy.dd String str2) {
        hyr<ld6> hyrVarZy = C1476n.m6105q(context).zy(str, str2);
        if (str2 != null && hyrVarZy.toq() != null) {
            com.airbnb.lottie.model.f7l8.zy().m6059q(str2, hyrVarZy.toq());
        }
        return hyrVarZy;
    }

    public static void qrj(Context context) {
        f8132k.clear();
        com.airbnb.lottie.model.f7l8.zy().m6057k();
        C1476n.zy(context).m6112k();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m6133r(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Deprecated
    @y9n
    /* JADX INFO: renamed from: t */
    public static hyr<ld6> m6135t(JSONObject jSONObject, @zy.dd String str) {
        return wvg(jSONObject.toString(), str);
    }

    @Deprecated
    public static C1429c<ld6> t8r(final JSONObject jSONObject, @zy.dd final String str) {
        return x2(str, new Callable() { // from class: com.airbnb.lottie.kja0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ni7.m6135t(jSONObject, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hyr uv6(WeakReference weakReference, Context context, int i2, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fti(context, i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hyr vyq(Context context, String str, String str2) throws Exception {
        hyr<ld6> hyrVarZy = C1476n.m6105q(context).zy(str, str2);
        if (str2 != null && hyrVarZy.toq() != null) {
            com.airbnb.lottie.model.f7l8.zy().m6059q(str2, hyrVarZy.toq());
        }
        return hyrVarZy;
    }

    @y9n
    public static hyr<ld6> wvg(String str, @zy.dd String str2) {
        return fu4(com.airbnb.lottie.parser.moshi.zy.m6177t(okio.d2ok.m27592n(okio.d2ok.fn3e(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    private static C1429c<ld6> x2(@zy.dd final String str, Callable<hyr<ld6>> callable) {
        final ld6 qVar = str == null ? null : com.airbnb.lottie.model.f7l8.zy().toq(str);
        if (qVar != null) {
            return new C1429c<>(new Callable() { // from class: com.airbnb.lottie.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ni7.ncyb(qVar);
                }
            });
        }
        if (str != null) {
            Map<String, C1429c<ld6>> map = f8132k;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C1429c<ld6> c1429c = new C1429c<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c1429c.m5952q(new x9kr() { // from class: com.airbnb.lottie.cdj
                @Override // com.airbnb.lottie.x9kr
                public final void onResult(Object obj) {
                    ni7.m6129l(str, atomicBoolean, (ld6) obj);
                }
            });
            c1429c.zy(new x9kr() { // from class: com.airbnb.lottie.ki
                @Override // com.airbnb.lottie.x9kr
                public final void onResult(Object obj) {
                    ni7.x9kr(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f8132k.put(str, c1429c);
            }
        }
        return c1429c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x9kr(String str, AtomicBoolean atomicBoolean, Throwable th) {
        f8132k.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: z */
    private static hyr<ld6> m6137z(com.airbnb.lottie.parser.moshi.zy zyVar, @zy.dd String str, boolean z2) {
        try {
            try {
                ld6 ld6VarM6182k = com.airbnb.lottie.parser.ni7.m6182k(zyVar);
                if (str != null) {
                    com.airbnb.lottie.model.f7l8.zy().m6059q(str, ld6VarM6182k);
                }
                hyr<ld6> hyrVar = new hyr<>(ld6VarM6182k);
                if (z2) {
                    C1512y.zy(zyVar);
                }
                return hyrVar;
            } catch (Exception e2) {
                hyr<ld6> hyrVar2 = new hyr<>(e2);
                if (z2) {
                    C1512y.zy(zyVar);
                }
                return hyrVar2;
            }
        } catch (Throwable th) {
            if (z2) {
                C1512y.zy(zyVar);
            }
            throw th;
        }
    }

    @y9n
    private static hyr<ld6> zurt(InputStream inputStream, @zy.dd String str, boolean z2) {
        try {
            return fu4(com.airbnb.lottie.parser.moshi.zy.m6177t(okio.d2ok.m27592n(okio.d2ok.fn3e(inputStream))), str);
        } finally {
            if (z2) {
                C1512y.zy(inputStream);
            }
        }
    }
}
