package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.app.a98o;
import androidx.core.content.C0508s;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.C0573g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: ShortcutInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f50364a9 = "extraLocusId";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f50365fti = "extraLongLived";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f50366gvn7 = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f50367jk = "extraPerson_";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f50368jp0y = "extraSliceUri";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f50369mcp = "extraPersonCount";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    Bundle f50370cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    CharSequence f50371f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    boolean f50372fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    boolean f50373fu4;

    /* JADX INFO: renamed from: g */
    CharSequence f3459g;

    /* JADX INFO: renamed from: h */
    PersistableBundle f3460h;

    /* JADX INFO: renamed from: i */
    boolean f3461i;

    /* JADX INFO: renamed from: k */
    Context f3462k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    long f50374ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    int f50375kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    a98o[] f50376ld6;

    /* JADX INFO: renamed from: n */
    ComponentName f3463n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    boolean f50377n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    boolean f50378ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    boolean f50379o1t;

    /* JADX INFO: renamed from: p */
    boolean f3464p;

    /* JADX INFO: renamed from: q */
    Intent[] f3465q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    C0508s f50380qrj;

    /* JADX INFO: renamed from: s */
    IconCompat f3466s;

    /* JADX INFO: renamed from: t */
    int f3467t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    UserHandle f50381t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    String f50382toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    int f50383wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    Set<String> f50384x2;

    /* JADX INFO: renamed from: y */
    CharSequence f3468y;

    /* JADX INFO: renamed from: z */
    boolean f3469z = true;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    boolean f50385zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    String f50386zy;

    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface toq {
    }

    kja0() {
    }

    @hyr(25)
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    private static C0508s cdj(@dd PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(f50364a9)) == null) {
            return null;
        }
        return new C0508s(string);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @hyr(25)
    @dd
    @yz
    static a98o[] fn3e(@lvui PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f50369mcp)) {
            return null;
        }
        int i2 = persistableBundle.getInt(f50369mcp);
        a98o[] a98oVarArr = new a98o[i2];
        int i3 = 0;
        while (i3 < i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(f50367jk);
            int i4 = i3 + 1;
            sb.append(i4);
            a98oVarArr[i3] = a98o.zy(persistableBundle.getPersistableBundle(sb.toString()));
            i3 = i4;
        }
        return a98oVarArr;
    }

    @hyr(25)
    @dd
    /* JADX INFO: renamed from: h */
    static C0508s m2213h(@lvui ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return cdj(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return C0508s.m2362q(shortcutInfo.getLocusId());
    }

    @hyr(25)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @yz
    static boolean t8r(@dd PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(f50365fti)) {
            return false;
        }
        return persistableBundle.getBoolean(f50365fti);
    }

    @hyr(22)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    private PersistableBundle toq() {
        if (this.f3460h == null) {
            this.f3460h = new PersistableBundle();
        }
        a98o[] a98oVarArr = this.f50376ld6;
        if (a98oVarArr != null && a98oVarArr.length > 0) {
            this.f3460h.putInt(f50369mcp, a98oVarArr.length);
            int i2 = 0;
            while (i2 < this.f50376ld6.length) {
                PersistableBundle persistableBundle = this.f3460h;
                StringBuilder sb = new StringBuilder();
                sb.append(f50367jk);
                int i3 = i2 + 1;
                sb.append(i3);
                persistableBundle.putPersistableBundle(sb.toString(), this.f50376ld6[i2].n7h());
                i2 = i3;
            }
        }
        C0508s c0508s = this.f50380qrj;
        if (c0508s != null) {
            this.f3460h.putString(f50364a9, c0508s.m2363k());
        }
        this.f3460h.putBoolean(f50365fti, this.f50377n7h);
        return this.f3460h;
    }

    @hyr(25)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static List<kja0> zy(@lvui Context context, @lvui List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0492k(context, it.next()).zy());
        }
        return arrayList;
    }

    public boolean a9(int i2) {
        return (i2 & this.f3467t) != 0;
    }

    public int f7l8() {
        return this.f50383wvg;
    }

    public boolean fti() {
        return this.f50373fu4;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public Bundle fu4() {
        return this.f50370cdj;
    }

    @dd
    /* JADX INFO: renamed from: g */
    public CharSequence m2214g() {
        return this.f3468y;
    }

    @hyr(25)
    public ShortcutInfo gvn7() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f3462k, this.f50382toq).setShortLabel(this.f3459g).setIntents(this.f3465q);
        IconCompat iconCompat = this.f3466s;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.d2ok(this.f3462k));
        }
        if (!TextUtils.isEmpty(this.f50371f7l8)) {
            intents.setLongLabel(this.f50371f7l8);
        }
        if (!TextUtils.isEmpty(this.f3468y)) {
            intents.setDisabledMessage(this.f3468y);
        }
        ComponentName componentName = this.f3463n;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f50384x2;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f50375kja0);
        PersistableBundle persistableBundle = this.f3460h;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            a98o[] a98oVarArr = this.f50376ld6;
            if (a98oVarArr != null && a98oVarArr.length > 0) {
                int length = a98oVarArr.length;
                Person[] personArr = new Person[length];
                for (int i2 = 0; i2 < length; i2++) {
                    personArr[i2] = this.f50376ld6[i2].ld6();
                }
                intents.setPersons(personArr);
            }
            C0508s c0508s = this.f50380qrj;
            if (c0508s != null) {
                intents.setLocusId(c0508s.zy());
            }
            intents.setLongLived(this.f50377n7h);
        } else {
            intents.setExtras(toq());
        }
        return intents.build();
    }

    @lvui
    /* JADX INFO: renamed from: i */
    public String m2215i() {
        return this.f50386zy;
    }

    public boolean jk() {
        return this.f3469z;
    }

    public boolean jp0y() {
        return this.f50385zurt;
    }

    /* JADX INFO: renamed from: k */
    Intent m2216k(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f3465q[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f3459g.toString());
        if (this.f3466s != null) {
            Drawable activityIcon = null;
            if (this.f3464p) {
                PackageManager packageManager = this.f3462k.getPackageManager();
                ComponentName componentName = this.f3463n;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f3462k.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f3466s.zy(intent, activityIcon, this.f3462k);
        }
        return intent;
    }

    @dd
    public CharSequence ki() {
        return this.f50371f7l8;
    }

    @dd
    public C0508s kja0() {
        return this.f50380qrj;
    }

    @lvui
    public String ld6() {
        return this.f50382toq;
    }

    public boolean mcp() {
        return this.f50372fn3e;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public Set<String> m2217n() {
        return this.f50384x2;
    }

    public long n7h() {
        return this.f50374ki;
    }

    @lvui
    public CharSequence ni7() {
        return this.f3459g;
    }

    public boolean o1t() {
        return this.f50379o1t;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    public IconCompat m2218p() {
        return this.f3466s;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public ComponentName m2219q() {
        return this.f3463n;
    }

    @lvui
    public Intent[] qrj() {
        Intent[] intentArr = this.f3465q;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    @dd
    /* JADX INFO: renamed from: s */
    public PersistableBundle m2220s() {
        return this.f3460h;
    }

    /* JADX INFO: renamed from: t */
    public boolean m2221t() {
        return this.f50378ni7;
    }

    public boolean wvg() {
        return this.f3461i;
    }

    @lvui
    public Intent x2() {
        return this.f3465q[r0.length - 1];
    }

    /* JADX INFO: renamed from: y */
    public int m2222y() {
        return this.f3467t;
    }

    @dd
    /* JADX INFO: renamed from: z */
    public UserHandle m2223z() {
        return this.f50381t8r;
    }

    public int zurt() {
        return this.f50375kja0;
    }

    /* JADX INFO: renamed from: androidx.core.content.pm.kja0$k */
    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    public static class C0492k {

        /* JADX INFO: renamed from: k */
        private final kja0 f3470k;

        /* JADX INFO: renamed from: n */
        private Uri f3471n;

        /* JADX INFO: renamed from: q */
        private Map<String, Map<String, List<String>>> f3472q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f50387toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Set<String> f50388zy;

        public C0492k(@lvui Context context, @lvui String str) {
            kja0 kja0Var = new kja0();
            this.f3470k = kja0Var;
            kja0Var.f3462k = context;
            kja0Var.f50382toq = str;
        }

        @lvui
        public C0492k cdj(boolean z2) {
            this.f3470k.f50377n7h = z2;
            return this;
        }

        @lvui
        public C0492k f7l8(@lvui CharSequence charSequence) {
            this.f3470k.f3468y = charSequence;
            return this;
        }

        @lvui
        public C0492k fn3e(@lvui CharSequence charSequence) {
            this.f3470k.f3459g = charSequence;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public C0492k m2224g(@lvui Set<String> set) {
            this.f3470k.f50384x2 = set;
            return this;
        }

        @lvui
        @Deprecated
        /* JADX INFO: renamed from: h */
        public C0492k m2225h() {
            this.f3470k.f50377n7h = true;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: i */
        public C0492k m2226i(int i2) {
            this.f3470k.f50375kja0 = i2;
            return this;
        }

        @lvui
        @SuppressLint({"MissingGetterMatchingBuilder"})
        /* JADX INFO: renamed from: k */
        public C0492k m2227k(@lvui String str) {
            if (this.f50388zy == null) {
                this.f50388zy = new HashSet();
            }
            this.f50388zy.add(str);
            return this;
        }

        @lvui
        public C0492k ki(@lvui a98o a98oVar) {
            return t8r(new a98o[]{a98oVar});
        }

        @lvui
        public C0492k kja0(@lvui CharSequence charSequence) {
            this.f3470k.f50371f7l8 = charSequence;
            return this;
        }

        @lvui
        public C0492k ld6(@lvui Intent intent) {
            return x2(new Intent[]{intent});
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public C0492k m2228n() {
            this.f3470k.f3464p = true;
            return this;
        }

        @lvui
        public C0492k n7h(@dd C0508s c0508s) {
            this.f3470k.f50380qrj = c0508s;
            return this;
        }

        @lvui
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public C0492k ni7(@lvui Bundle bundle) {
            this.f3470k.f50370cdj = (Bundle) androidx.core.util.n7h.x2(bundle);
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: p */
        public C0492k m2229p(IconCompat iconCompat) {
            this.f3470k.f3466s = iconCompat;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public C0492k m2230q(@lvui ComponentName componentName) {
            this.f3470k.f3463n = componentName;
            return this;
        }

        @lvui
        public C0492k qrj() {
            this.f50387toq = true;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: s */
        public C0492k m2231s(@lvui PersistableBundle persistableBundle) {
            this.f3470k.f3460h = persistableBundle;
            return this;
        }

        @lvui
        public C0492k t8r(@lvui a98o[] a98oVarArr) {
            this.f3470k.f50376ld6 = a98oVarArr;
            return this;
        }

        @lvui
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public C0492k toq(@lvui String str, @lvui String str2, @lvui List<String> list) {
            m2227k(str);
            if (!list.isEmpty()) {
                if (this.f3472q == null) {
                    this.f3472q = new HashMap();
                }
                if (this.f3472q.get(str) == null) {
                    this.f3472q.put(str, new HashMap());
                }
                this.f3472q.get(str).put(str2, list);
            }
            return this;
        }

        @lvui
        public C0492k x2(@lvui Intent[] intentArr) {
            this.f3470k.f3465q = intentArr;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: y */
        public C0492k m2232y(int i2) {
            this.f3470k.f3467t = i2;
            return this;
        }

        @lvui
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public C0492k zurt(@lvui Uri uri) {
            this.f3471n = uri;
            return this;
        }

        @lvui
        public kja0 zy() {
            if (TextUtils.isEmpty(this.f3470k.f3459g)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            kja0 kja0Var = this.f3470k;
            Intent[] intentArr = kja0Var.f3465q;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f50387toq) {
                if (kja0Var.f50380qrj == null) {
                    kja0Var.f50380qrj = new C0508s(kja0Var.f50382toq);
                }
                this.f3470k.f50377n7h = true;
            }
            if (this.f50388zy != null) {
                kja0 kja0Var2 = this.f3470k;
                if (kja0Var2.f50384x2 == null) {
                    kja0Var2.f50384x2 = new HashSet();
                }
                this.f3470k.f50384x2.addAll(this.f50388zy);
            }
            if (this.f3472q != null) {
                kja0 kja0Var3 = this.f3470k;
                if (kja0Var3.f3460h == null) {
                    kja0Var3.f3460h = new PersistableBundle();
                }
                for (String str : this.f3472q.keySet()) {
                    Map<String, List<String>> map = this.f3472q.get(str);
                    this.f3470k.f3460h.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f3470k.f3460h.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f3471n != null) {
                kja0 kja0Var4 = this.f3470k;
                if (kja0Var4.f3460h == null) {
                    kja0Var4.f3460h = new PersistableBundle();
                }
                this.f3470k.f3460h.putString(kja0.f50368jp0y, C0573g.m2696k(this.f3471n));
            }
            return this.f3470k;
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public C0492k(@lvui kja0 kja0Var) {
            kja0 kja0Var2 = new kja0();
            this.f3470k = kja0Var2;
            kja0Var2.f3462k = kja0Var.f3462k;
            kja0Var2.f50382toq = kja0Var.f50382toq;
            kja0Var2.f50386zy = kja0Var.f50386zy;
            Intent[] intentArr = kja0Var.f3465q;
            kja0Var2.f3465q = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            kja0Var2.f3463n = kja0Var.f3463n;
            kja0Var2.f3459g = kja0Var.f3459g;
            kja0Var2.f50371f7l8 = kja0Var.f50371f7l8;
            kja0Var2.f3468y = kja0Var.f3468y;
            kja0Var2.f50383wvg = kja0Var.f50383wvg;
            kja0Var2.f3466s = kja0Var.f3466s;
            kja0Var2.f3464p = kja0Var.f3464p;
            kja0Var2.f50381t8r = kja0Var.f50381t8r;
            kja0Var2.f50374ki = kja0Var.f50374ki;
            kja0Var2.f3461i = kja0Var.f3461i;
            kja0Var2.f50372fn3e = kja0Var.f50372fn3e;
            kja0Var2.f50385zurt = kja0Var.f50385zurt;
            kja0Var2.f50378ni7 = kja0Var.f50378ni7;
            kja0Var2.f50373fu4 = kja0Var.f50373fu4;
            kja0Var2.f3469z = kja0Var.f3469z;
            kja0Var2.f50380qrj = kja0Var.f50380qrj;
            kja0Var2.f50377n7h = kja0Var.f50377n7h;
            kja0Var2.f50379o1t = kja0Var.f50379o1t;
            kja0Var2.f50375kja0 = kja0Var.f50375kja0;
            a98o[] a98oVarArr = kja0Var.f50376ld6;
            if (a98oVarArr != null) {
                kja0Var2.f50376ld6 = (a98o[]) Arrays.copyOf(a98oVarArr, a98oVarArr.length);
            }
            if (kja0Var.f50384x2 != null) {
                kja0Var2.f50384x2 = new HashSet(kja0Var.f50384x2);
            }
            PersistableBundle persistableBundle = kja0Var.f3460h;
            if (persistableBundle != null) {
                kja0Var2.f3460h = persistableBundle;
            }
            kja0Var2.f3467t = kja0Var.f3467t;
        }

        @hyr(25)
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public C0492k(@lvui Context context, @lvui ShortcutInfo shortcutInfo) {
            kja0 kja0Var = new kja0();
            this.f3470k = kja0Var;
            kja0Var.f3462k = context;
            kja0Var.f50382toq = shortcutInfo.getId();
            kja0Var.f50386zy = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            kja0Var.f3465q = (Intent[]) Arrays.copyOf(intents, intents.length);
            kja0Var.f3463n = shortcutInfo.getActivity();
            kja0Var.f3459g = shortcutInfo.getShortLabel();
            kja0Var.f50371f7l8 = shortcutInfo.getLongLabel();
            kja0Var.f3468y = shortcutInfo.getDisabledMessage();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                kja0Var.f50383wvg = shortcutInfo.getDisabledReason();
            } else {
                kja0Var.f50383wvg = shortcutInfo.isEnabled() ? 0 : 3;
            }
            kja0Var.f50384x2 = shortcutInfo.getCategories();
            kja0Var.f50376ld6 = kja0.fn3e(shortcutInfo.getExtras());
            kja0Var.f50381t8r = shortcutInfo.getUserHandle();
            kja0Var.f50374ki = shortcutInfo.getLastChangedTimestamp();
            if (i2 >= 30) {
                kja0Var.f3461i = shortcutInfo.isCached();
            }
            kja0Var.f50372fn3e = shortcutInfo.isDynamic();
            kja0Var.f50385zurt = shortcutInfo.isPinned();
            kja0Var.f50378ni7 = shortcutInfo.isDeclaredInManifest();
            kja0Var.f50373fu4 = shortcutInfo.isImmutable();
            kja0Var.f3469z = shortcutInfo.isEnabled();
            kja0Var.f50379o1t = shortcutInfo.hasKeyFieldsOnly();
            kja0Var.f50380qrj = kja0.m2213h(shortcutInfo);
            kja0Var.f50375kja0 = shortcutInfo.getRank();
            kja0Var.f3460h = shortcutInfo.getExtras();
        }
    }
}
