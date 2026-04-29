package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ActivityChooserModel.java */
/* JADX INFO: loaded from: classes.dex */
class zy extends DataSetObservable {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final String f46983cdj = "historical-record";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f46984fn3e = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final float f46985fu4 = 1.0f;

    /* JADX INFO: renamed from: h */
    static final String f1243h = "historical-records";

    /* JADX INFO: renamed from: i */
    static final String f1244i = "weight";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    static final String f46986ki = "activity";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final boolean f46988n7h = false;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f46989ni7 = 5;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f46990o1t = -1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static final String f46991t8r = "time";

    /* JADX INFO: renamed from: z */
    private static final String f1246z = ".xml";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f46993zurt = 50;

    /* JADX INFO: renamed from: g */
    private Intent f1247g;

    /* JADX INFO: renamed from: n */
    final String f1249n;

    /* JADX INFO: renamed from: q */
    final Context f1251q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private InterfaceC0226g f46996qrj;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final String f46987kja0 = zy.class.getSimpleName();

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final Object f46992wvg = new Object();

    /* JADX INFO: renamed from: t */
    private static final Map<String, zy> f1245t = new HashMap();

    /* JADX INFO: renamed from: k */
    private final Object f1248k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<toq> f46997toq = new ArrayList();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final List<C0228n> f46999zy = new ArrayList();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private InterfaceC7852zy f46994f7l8 = new C0229q();

    /* JADX INFO: renamed from: y */
    private int f1253y = 50;

    /* JADX INFO: renamed from: s */
    boolean f1252s = true;

    /* JADX INFO: renamed from: p */
    private boolean f1250p = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f46995ld6 = true;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f46998x2 = false;

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    private final class f7l8 extends AsyncTask<Object, Void, Void> {
        f7l8() {
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.zy.f7l8.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.zy$g */
    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public interface InterfaceC0226g {
        /* JADX INFO: renamed from: k */
        boolean mo690k(zy zyVar, Intent intent);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.zy$k */
    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public interface InterfaceC0227k {
        void setActivityChooserModel(zy zyVar);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.zy$n */
    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public static final class C0228n {

        /* JADX INFO: renamed from: k */
        public final ComponentName f1255k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f47000toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final float f47001zy;

        public C0228n(String str, long j2, float f2) {
            this(ComponentName.unflattenFromString(str), j2, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0228n.class != obj.getClass()) {
                return false;
            }
            C0228n c0228n = (C0228n) obj;
            ComponentName componentName = this.f1255k;
            if (componentName == null) {
                if (c0228n.f1255k != null) {
                    return false;
                }
            } else if (!componentName.equals(c0228n.f1255k)) {
                return false;
            }
            return this.f47000toq == c0228n.f47000toq && Float.floatToIntBits(this.f47001zy) == Float.floatToIntBits(c0228n.f47001zy);
        }

        public int hashCode() {
            ComponentName componentName = this.f1255k;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j2 = this.f47000toq;
            return ((((iHashCode + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.f47001zy);
        }

        public String toString() {
            return "[; activity:" + this.f1255k + "; time:" + this.f47000toq + "; weight:" + new BigDecimal(this.f47001zy) + "]";
        }

        public C0228n(ComponentName componentName, long j2, float f2) {
            this.f1255k = componentName;
            this.f47000toq = j2;
            this.f47001zy = f2;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.zy$q */
    /* JADX INFO: compiled from: ActivityChooserModel.java */
    private static final class C0229q implements InterfaceC7852zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final float f47002toq = 0.95f;

        /* JADX INFO: renamed from: k */
        private final Map<ComponentName, toq> f1256k = new HashMap();

        C0229q() {
        }

        @Override // androidx.appcompat.widget.zy.InterfaceC7852zy
        /* JADX INFO: renamed from: k */
        public void mo761k(Intent intent, List<toq> list, List<C0228n> list2) {
            Map<ComponentName, toq> map = this.f1256k;
            map.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                toq toqVar = list.get(i2);
                toqVar.f1258q = 0.0f;
                ActivityInfo activityInfo = toqVar.f1257k.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), toqVar);
            }
            float f2 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C0228n c0228n = list2.get(size2);
                toq toqVar2 = map.get(c0228n.f1255k);
                if (toqVar2 != null) {
                    toqVar2.f1258q += c0228n.f47001zy * f2;
                    f2 *= f47002toq;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public static final class toq implements Comparable<toq> {

        /* JADX INFO: renamed from: k */
        public final ResolveInfo f1257k;

        /* JADX INFO: renamed from: q */
        public float f1258q;

        public toq(ResolveInfo resolveInfo) {
            this.f1257k = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && toq.class == obj.getClass() && Float.floatToIntBits(this.f1258q) == Float.floatToIntBits(((toq) obj).f1258q);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1258q) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f1257k.toString() + "; weight:" + new BigDecimal(this.f1258q) + "]";
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(toq toqVar) {
            return Float.floatToIntBits(toqVar.f1258q) - Float.floatToIntBits(this.f1258q);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public interface InterfaceC7852zy {
        /* JADX INFO: renamed from: k */
        void mo761k(Intent intent, List<toq> list, List<C0228n> list2);
    }

    private zy(Context context, String str) {
        this.f1251q = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1249n = str;
            return;
        }
        this.f1249n = str + ".xml";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m751h() {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.f1251q     // Catch: java.io.FileNotFoundException -> Lc2
            java.lang.String r2 = r10.f1249n     // Catch: java.io.FileNotFoundException -> Lc2
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> Lc2
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3 = 0
        L14:
            r4 = 1
            if (r3 == r4) goto L1f
            r5 = 2
            if (r3 == r5) goto L1f
            int r3 = r2.next()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            goto L14
        L1f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r3 == 0) goto L7c
            java.util.List<androidx.appcompat.widget.zy$n> r3 = r10.f46999zy     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3.clear()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L30:
            int r5 = r2.next()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r5 != r4) goto L3d
            if (r1 == 0) goto Lbb
        L38:
            r1.close()     // Catch: java.io.IOException -> Lbb
            goto Lbb
        L3d:
            r6 = 3
            if (r5 == r6) goto L30
            r6 = 4
            if (r5 != r6) goto L44
            goto L30
        L44:
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r5 == 0) goto L74
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            androidx.appcompat.widget.zy$n r9 = new androidx.appcompat.widget.zy$n     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3.add(r9)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            goto L30
        L74:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L7c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L84:
            r0 = move-exception
            goto Lbc
        L86:
            r2 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.zy.f46987kja0     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r10.f1249n     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto Lbb
            goto L38
        La0:
            r2 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.zy.f46987kja0     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r10.f1249n     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto Lbb
            goto L38
        Lbb:
            return
        Lbc:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.io.IOException -> Lc1
        Lc1:
            throw r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.zy.m751h():void");
    }

    /* JADX INFO: renamed from: k */
    private boolean m752k(C0228n c0228n) {
        boolean zAdd = this.f46999zy.add(c0228n);
        if (zAdd) {
            this.f46995ld6 = true;
            n7h();
            qrj();
            zurt();
            notifyChanged();
        }
        return zAdd;
    }

    private boolean kja0() {
        if (!this.f1252s || !this.f46995ld6 || TextUtils.isEmpty(this.f1249n)) {
            return false;
        }
        this.f1252s = false;
        this.f1250p = true;
        m751h();
        return true;
    }

    private void n7h() {
        int size = this.f46999zy.size() - this.f1253y;
        if (size <= 0) {
            return;
        }
        this.f46995ld6 = true;
        for (int i2 = 0; i2 < size; i2++) {
            this.f46999zy.remove(0);
        }
    }

    /* JADX INFO: renamed from: q */
    public static zy m753q(Context context, String str) {
        zy zyVar;
        synchronized (f46992wvg) {
            Map<String, zy> map = f1245t;
            zyVar = map.get(str);
            if (zyVar == null) {
                zyVar = new zy(context, str);
                map.put(str, zyVar);
            }
        }
        return zyVar;
    }

    private void qrj() {
        if (!this.f1250p) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f46995ld6) {
            this.f46995ld6 = false;
            if (TextUtils.isEmpty(this.f1249n)) {
                return;
            }
            new f7l8().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f46999zy), this.f1249n);
        }
    }

    private boolean x2() {
        if (!this.f46998x2 || this.f1247g == null) {
            return false;
        }
        this.f46998x2 = false;
        this.f46997toq.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f1251q.getPackageManager().queryIntentActivities(this.f1247g, 0);
        int size = listQueryIntentActivities.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f46997toq.add(new toq(listQueryIntentActivities.get(i2)));
        }
        return true;
    }

    private boolean zurt() {
        if (this.f46994f7l8 == null || this.f1247g == null || this.f46997toq.isEmpty() || this.f46999zy.isEmpty()) {
            return false;
        }
        this.f46994f7l8.mo761k(this.f1247g, this.f46997toq, Collections.unmodifiableList(this.f46999zy));
        return true;
    }

    private void zy() {
        boolean zX2 = x2() | kja0();
        n7h();
        if (zX2) {
            zurt();
            notifyChanged();
        }
    }

    public void cdj(InterfaceC7852zy interfaceC7852zy) {
        synchronized (this.f1248k) {
            if (this.f46994f7l8 == interfaceC7852zy) {
                return;
            }
            this.f46994f7l8 = interfaceC7852zy;
            if (zurt()) {
                notifyChanged();
            }
        }
    }

    public int f7l8(ResolveInfo resolveInfo) {
        synchronized (this.f1248k) {
            zy();
            List<toq> list = this.f46997toq;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i2).f1257k == resolveInfo) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public void fn3e(InterfaceC0226g interfaceC0226g) {
        synchronized (this.f1248k) {
            this.f46996qrj = interfaceC0226g;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m754g() {
        int size;
        synchronized (this.f1248k) {
            zy();
            size = this.f46997toq.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: i */
    public void m755i(Intent intent) {
        synchronized (this.f1248k) {
            if (this.f1247g == intent) {
                return;
            }
            this.f1247g = intent;
            this.f46998x2 = true;
            zy();
        }
    }

    public void ki(int i2) {
        synchronized (this.f1248k) {
            zy();
            toq toqVar = this.f46997toq.get(i2);
            toq toqVar2 = this.f46997toq.get(0);
            float f2 = toqVar2 != null ? (toqVar2.f1258q - toqVar.f1258q) + 5.0f : 1.0f;
            ActivityInfo activityInfo = toqVar.f1257k.activityInfo;
            m752k(new C0228n(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f2));
        }
    }

    public Intent ld6() {
        Intent intent;
        synchronized (this.f1248k) {
            intent = this.f1247g;
        }
        return intent;
    }

    /* JADX INFO: renamed from: n */
    public ResolveInfo m756n(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.f1248k) {
            zy();
            resolveInfo = this.f46997toq.get(i2).f1257k;
        }
        return resolveInfo;
    }

    /* JADX INFO: renamed from: p */
    public int m757p() {
        int size;
        synchronized (this.f1248k) {
            zy();
            size = this.f46999zy.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: s */
    public int m758s() {
        int i2;
        synchronized (this.f1248k) {
            i2 = this.f1253y;
        }
        return i2;
    }

    public void t8r(int i2) {
        synchronized (this.f1248k) {
            if (this.f1253y == i2) {
                return;
            }
            this.f1253y = i2;
            n7h();
            if (zurt()) {
                notifyChanged();
            }
        }
    }

    public Intent toq(int i2) {
        synchronized (this.f1248k) {
            if (this.f1247g == null) {
                return null;
            }
            zy();
            ActivityInfo activityInfo = this.f46997toq.get(i2).f1257k.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1247g);
            intent.setComponent(componentName);
            if (this.f46996qrj != null) {
                if (this.f46996qrj.mo690k(this, new Intent(intent))) {
                    return null;
                }
            }
            m752k(new C0228n(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* JADX INFO: renamed from: y */
    public ResolveInfo m759y() {
        synchronized (this.f1248k) {
            zy();
            if (this.f46997toq.isEmpty()) {
                return null;
            }
            return this.f46997toq.get(0).f1257k;
        }
    }
}
