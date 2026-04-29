package androidx.core.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: compiled from: Person.java */
/* JADX INFO: loaded from: classes.dex */
public class a98o {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50035f7l8 = "name";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50036ld6 = "isBot";

    /* JADX INFO: renamed from: p */
    private static final String f3113p = "key";

    /* JADX INFO: renamed from: s */
    private static final String f3114s = "uri";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f50037x2 = "isImportant";

    /* JADX INFO: renamed from: y */
    private static final String f3115y = "icon";

    /* JADX INFO: renamed from: g */
    boolean f3116g;

    /* JADX INFO: renamed from: k */
    @zy.dd
    CharSequence f3117k;

    /* JADX INFO: renamed from: n */
    boolean f3118n;

    /* JADX INFO: renamed from: q */
    @zy.dd
    String f3119q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    IconCompat f50038toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    String f50039zy;

    /* JADX INFO: renamed from: androidx.core.app.a98o$k */
    /* JADX INFO: compiled from: Person.java */
    @zy.hyr(22)
    static class C0412k {
        private C0412k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static a98o m1798k(PersistableBundle persistableBundle) {
            return new zy().m1800g(persistableBundle.getString("name")).f7l8(persistableBundle.getString(a98o.f3114s)).m1802n(persistableBundle.getString("key")).toq(persistableBundle.getBoolean(a98o.f50036ld6)).m1803q(persistableBundle.getBoolean(a98o.f50037x2)).m1801k();
        }

        @InterfaceC7830i
        static PersistableBundle toq(a98o a98oVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = a98oVar.f3117k;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString(a98o.f3114s, a98oVar.f50039zy);
            persistableBundle.putString("key", a98oVar.f3119q);
            persistableBundle.putBoolean(a98o.f50036ld6, a98oVar.f3118n);
            persistableBundle.putBoolean(a98o.f50037x2, a98oVar.f3116g);
            return persistableBundle;
        }
    }

    /* JADX INFO: compiled from: Person.java */
    @zy.hyr(28)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static a98o m1799k(Person person) {
            return new zy().m1800g(person.getName()).zy(person.getIcon() != null ? IconCompat.f7l8(person.getIcon()) : null).f7l8(person.getUri()).m1802n(person.getKey()).toq(person.isBot()).m1803q(person.isImportant()).m1801k();
        }

        @InterfaceC7830i
        static Person toq(a98o a98oVar) {
            return new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z2);

                @NonNull
                public native /* synthetic */ Builder setIcon(@Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z2);

                @NonNull
                public native /* synthetic */ Builder setKey(@Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@Nullable String str);
            }.setName(a98oVar.m1792g()).setIcon(a98oVar.m1795q() != null ? a98oVar.m1795q().eqxt() : null).setUri(a98oVar.f7l8()).setKey(a98oVar.m1793n()).setBot(a98oVar.m1797y()).setImportant(a98oVar.m1796s()).build();
        }
    }

    /* JADX INFO: compiled from: Person.java */
    public static class zy {

        /* JADX INFO: renamed from: g */
        boolean f3120g;

        /* JADX INFO: renamed from: k */
        @zy.dd
        CharSequence f3121k;

        /* JADX INFO: renamed from: n */
        boolean f3122n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        String f3123q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        IconCompat f50040toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        String f50041zy;

        public zy() {
        }

        @zy.lvui
        public zy f7l8(@zy.dd String str) {
            this.f50041zy = str;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public zy m1800g(@zy.dd CharSequence charSequence) {
            this.f3121k = charSequence;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public a98o m1801k() {
            return new a98o(this);
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public zy m1802n(@zy.dd String str) {
            this.f3123q = str;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public zy m1803q(boolean z2) {
            this.f3120g = z2;
            return this;
        }

        @zy.lvui
        public zy toq(boolean z2) {
            this.f3122n = z2;
            return this;
        }

        @zy.lvui
        public zy zy(@zy.dd IconCompat iconCompat) {
            this.f50040toq = iconCompat;
            return this;
        }

        zy(a98o a98oVar) {
            this.f3121k = a98oVar.f3117k;
            this.f50040toq = a98oVar.f50038toq;
            this.f50041zy = a98oVar.f50039zy;
            this.f3123q = a98oVar.f3119q;
            this.f3122n = a98oVar.f3118n;
            this.f3120g = a98oVar.f3116g;
        }
    }

    a98o(zy zyVar) {
        this.f3117k = zyVar.f3121k;
        this.f50038toq = zyVar.f50040toq;
        this.f50039zy = zyVar.f50041zy;
        this.f3119q = zyVar.f3123q;
        this.f3118n = zyVar.f3122n;
        this.f3116g = zyVar.f3120g;
    }

    @zy.hyr(28)
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public static a98o m1791k(@zy.lvui Person person) {
        return toq.m1799k(person);
    }

    @zy.lvui
    public static a98o toq(@zy.lvui Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new zy().m1800g(bundle.getCharSequence("name")).zy(bundle2 != null ? IconCompat.m2400n(bundle2) : null).f7l8(bundle.getString(f3114s)).m1802n(bundle.getString("key")).toq(bundle.getBoolean(f50036ld6)).m1803q(bundle.getBoolean(f50037x2)).m1801k();
    }

    @zy.hyr(22)
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static a98o zy(@zy.lvui PersistableBundle persistableBundle) {
        return C0412k.m1798k(persistableBundle);
    }

    @zy.dd
    public String f7l8() {
        return this.f50039zy;
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public CharSequence m1792g() {
        return this.f3117k;
    }

    @zy.hyr(28)
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public Person ld6() {
        return toq.toq(this);
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public String m1793n() {
        return this.f3119q;
    }

    @zy.hyr(22)
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PersistableBundle n7h() {
        return C0412k.toq(this);
    }

    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    public String m1794p() {
        String str = this.f50039zy;
        if (str != null) {
            return str;
        }
        if (this.f3117k == null) {
            return "";
        }
        return "name:" + ((Object) this.f3117k);
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    public IconCompat m1795q() {
        return this.f50038toq;
    }

    @zy.lvui
    public Bundle qrj() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f3117k);
        IconCompat iconCompat = this.f50038toq;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.oc() : null);
        bundle.putString(f3114s, this.f50039zy);
        bundle.putString("key", this.f3119q);
        bundle.putBoolean(f50036ld6, this.f3118n);
        bundle.putBoolean(f50037x2, this.f3116g);
        return bundle;
    }

    /* JADX INFO: renamed from: s */
    public boolean m1796s() {
        return this.f3116g;
    }

    @zy.lvui
    public zy x2() {
        return new zy(this);
    }

    /* JADX INFO: renamed from: y */
    public boolean m1797y() {
        return this.f3118n;
    }
}
