package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.x9kr;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: androidx.core.app.m */
/* JADX INFO: compiled from: NotificationCompatJellybean.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(16)
class C0439m {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50103f7l8 = "extras";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static Field f50104fn3e = null;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static Field f50105fu4 = null;

    /* JADX INFO: renamed from: g */
    private static final String f3214g = "actionIntent";

    /* JADX INFO: renamed from: h */
    private static final String f3215h = "showsUserInterface";

    /* JADX INFO: renamed from: k */
    public static final String f3217k = "NotificationCompat";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static Field f50106ki = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f50107kja0 = "semanticAction";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50108ld6 = "label";

    /* JADX INFO: renamed from: n */
    private static final String f3218n = "title";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f50109n7h = "allowedDataTypes";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static Field f50110ni7 = null;

    /* JADX INFO: renamed from: p */
    private static final String f3219p = "resultKey";

    /* JADX INFO: renamed from: q */
    private static final String f3220q = "icon";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f50111qrj = "allowFreeFormInput";

    /* JADX INFO: renamed from: s */
    private static final String f3221s = "dataOnlyRemoteInputs";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static boolean f50112t8r = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f50113toq = "android.support.dataRemoteInputs";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f50114x2 = "choices";

    /* JADX INFO: renamed from: y */
    private static final String f3222y = "remoteInputs";

    /* JADX INFO: renamed from: z */
    private static boolean f3223z = false;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static Field f50115zurt = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final String f50116zy = "android.support.allowGeneratedReplies";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final Object f50102cdj = new Object();

    /* JADX INFO: renamed from: i */
    private static final Object f3216i = new Object();

    private C0439m() {
    }

    static x9kr.toq f7l8(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new x9kr.toq(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f3214g), bundle.getBundle("extras"), m1935q(m1936s(bundle, f3222y)), m1935q(m1936s(bundle, f3221s)), bundle2 != null ? bundle2.getBoolean(f50116zy, false) : false, bundle.getInt(f50107kja0), bundle.getBoolean(f3215h), false, false);
    }

    /* JADX INFO: renamed from: g */
    public static int m1931g(Notification notification) {
        int length;
        synchronized (f3216i) {
            Object[] objArrM1937y = m1937y(notification);
            length = objArrM1937y != null ? objArrM1937y.length : 0;
        }
        return length;
    }

    /* JADX INFO: renamed from: k */
    public static SparseArray<Bundle> m1932k(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle kja0(Notification.Builder builder, x9kr.toq toqVar) {
        IconCompat iconCompatM2098g = toqVar.m2098g();
        builder.addAction(iconCompatM2098g != null ? iconCompatM2098g.m2405z() : 0, toqVar.m2101p(), toqVar.m2099k());
        Bundle bundle = new Bundle(toqVar.m2102q());
        if (toqVar.f7l8() != null) {
            bundle.putParcelableArray(C0443o.f3227g, n7h(toqVar.f7l8()));
        }
        if (toqVar.zy() != null) {
            bundle.putParcelableArray(f50113toq, n7h(toqVar.zy()));
        }
        bundle.putBoolean(f50116zy, toqVar.toq());
        return bundle;
    }

    public static Bundle ld6(Notification notification) {
        synchronized (f50102cdj) {
            if (f50112t8r) {
                return null;
            }
            try {
                if (f50106ki == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f3217k, "Notification.extras field is not of type Bundle");
                        f50112t8r = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f50106ki = declaredField;
                }
                Bundle bundle = (Bundle) f50106ki.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f50106ki.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e(f3217k, "Unable to access notification extras", e2);
                f50112t8r = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e(f3217k, "Unable to access notification extras", e3);
                f50112t8r = true;
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static x9kr.toq m1933n(Notification notification, int i2) {
        SparseArray sparseParcelableArray;
        synchronized (f3216i) {
            try {
                try {
                    Object[] objArrM1937y = m1937y(notification);
                    if (objArrM1937y != null) {
                        Object obj = objArrM1937y[i2];
                        Bundle bundleLd6 = ld6(notification);
                        return x2(f50115zurt.getInt(obj), (CharSequence) f50110ni7.get(obj), (PendingIntent) f50105fu4.get(obj), (bundleLd6 == null || (sparseParcelableArray = bundleLd6.getSparseParcelableArray(C0443o.f3229n)) == null) ? null : (Bundle) sparseParcelableArray.get(i2));
                    }
                } catch (IllegalAccessException e2) {
                    Log.e(f3217k, "Unable to access notification actions", e2);
                    f3223z = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Bundle[] n7h(ch[] chVarArr) {
        if (chVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[chVarArr.length];
        for (int i2 = 0; i2 < chVarArr.length; i2++) {
            bundleArr[i2] = qrj(chVarArr[i2]);
        }
        return bundleArr;
    }

    /* JADX INFO: renamed from: p */
    static Bundle m1934p(x9kr.toq toqVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM2098g = toqVar.m2098g();
        bundle.putInt("icon", iconCompatM2098g != null ? iconCompatM2098g.m2405z() : 0);
        bundle.putCharSequence("title", toqVar.m2101p());
        bundle.putParcelable(f3214g, toqVar.m2099k());
        Bundle bundle2 = toqVar.m2102q() != null ? new Bundle(toqVar.m2102q()) : new Bundle();
        bundle2.putBoolean(f50116zy, toqVar.toq());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f3222y, n7h(toqVar.f7l8()));
        bundle.putBoolean(f3215h, toqVar.m2103s());
        bundle.putInt(f50107kja0, toqVar.m2104y());
        return bundle;
    }

    /* JADX INFO: renamed from: q */
    private static ch[] m1935q(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        ch[] chVarArr = new ch[bundleArr.length];
        for (int i2 = 0; i2 < bundleArr.length; i2++) {
            chVarArr[i2] = zy(bundleArr[i2]);
        }
        return chVarArr;
    }

    private static Bundle qrj(ch chVar) {
        Bundle bundle = new Bundle();
        bundle.putString(f3219p, chVar.kja0());
        bundle.putCharSequence(f50108ld6, chVar.n7h());
        bundle.putCharSequenceArray(f50114x2, chVar.m1845y());
        bundle.putBoolean(f50111qrj, chVar.m1844g());
        bundle.putBundle("extras", chVar.qrj());
        Set<String> setF7l8 = chVar.f7l8();
        if (setF7l8 != null && !setF7l8.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setF7l8.size());
            Iterator<String> it = setF7l8.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f50109n7h, arrayList);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: s */
    private static Bundle[] m1936s(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    private static boolean toq() {
        if (f3223z) {
            return false;
        }
        try {
            if (f50104fn3e == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f50115zurt = cls.getDeclaredField("icon");
                f50110ni7 = cls.getDeclaredField("title");
                f50105fu4 = cls.getDeclaredField(f3214g);
                Field declaredField = Notification.class.getDeclaredField("actions");
                f50104fn3e = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e2) {
            Log.e(f3217k, "Unable to access notification actions", e2);
            f3223z = true;
        } catch (NoSuchFieldException e3) {
            Log.e(f3217k, "Unable to access notification actions", e3);
            f3223z = true;
        }
        return !f3223z;
    }

    public static x9kr.toq x2(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        ch[] chVarArrM1935q;
        ch[] chVarArrM1935q2;
        boolean z2;
        if (bundle != null) {
            chVarArrM1935q = m1935q(m1936s(bundle, C0443o.f3227g));
            chVarArrM1935q2 = m1935q(m1936s(bundle, f50113toq));
            z2 = bundle.getBoolean(f50116zy);
        } else {
            chVarArrM1935q = null;
            chVarArrM1935q2 = null;
            z2 = false;
        }
        return new x9kr.toq(i2, charSequence, pendingIntent, bundle, chVarArrM1935q, chVarArrM1935q2, z2, 0, true, false, false);
    }

    /* JADX INFO: renamed from: y */
    private static Object[] m1937y(Notification notification) {
        synchronized (f3216i) {
            if (!toq()) {
                return null;
            }
            try {
                return (Object[]) f50104fn3e.get(notification);
            } catch (IllegalAccessException e2) {
                Log.e(f3217k, "Unable to access notification actions", e2);
                f3223z = true;
                return null;
            }
        }
    }

    private static ch zy(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f50109n7h);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new ch(bundle.getString(f3219p), bundle.getCharSequence(f50108ld6), bundle.getCharSequenceArray(f50114x2), bundle.getBoolean(f50111qrj), 0, bundle.getBundle("extras"), hashSet);
    }
}
