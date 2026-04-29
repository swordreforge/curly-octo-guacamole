package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: compiled from: RemoteInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class ch {

    /* JADX INFO: renamed from: h */
    public static final int f3138h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50049kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50050ld6 = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50051n7h = 0;

    /* JADX INFO: renamed from: p */
    private static final String f3139p = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50052qrj = 1;

    /* JADX INFO: renamed from: s */
    public static final String f3140s = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50053x2 = 0;

    /* JADX INFO: renamed from: y */
    public static final String f3141y = "android.remoteinput.results";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Set<String> f50054f7l8;

    /* JADX INFO: renamed from: g */
    private final Bundle f3142g;

    /* JADX INFO: renamed from: k */
    private final String f3143k;

    /* JADX INFO: renamed from: n */
    private final int f3144n;

    /* JADX INFO: renamed from: q */
    private final boolean f3145q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final CharSequence f50055toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final CharSequence[] f50056zy;

    /* JADX INFO: compiled from: RemoteInput.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: androidx.core.app.ch$g */
    /* JADX INFO: compiled from: RemoteInput.java */
    public static final class C0418g {

        /* JADX INFO: renamed from: k */
        private final String f3147k;

        /* JADX INFO: renamed from: n */
        private CharSequence[] f3148n;

        /* JADX INFO: renamed from: q */
        private CharSequence f3149q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Set<String> f50058toq = new HashSet();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Bundle f50059zy = new Bundle();

        /* JADX INFO: renamed from: g */
        private boolean f3146g = true;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f50057f7l8 = 0;

        public C0418g(@zy.lvui String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f3147k = str;
        }

        @zy.lvui
        public C0418g f7l8(int i2) {
            this.f50057f7l8 = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public C0418g m1846g(@zy.dd CharSequence[] charSequenceArr) {
            this.f3148n = charSequenceArr;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public C0418g m1847k(@zy.lvui Bundle bundle) {
            if (bundle != null) {
                this.f50059zy.putAll(bundle);
            }
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public C0418g m1848n(boolean z2) {
            this.f3146g = z2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public C0418g m1849q(@zy.lvui String str, boolean z2) {
            if (z2) {
                this.f50058toq.add(str);
            } else {
                this.f50058toq.remove(str);
            }
            return this;
        }

        @zy.lvui
        public ch toq() {
            return new ch(this.f3147k, this.f3149q, this.f3148n, this.f3146g, this.f50057f7l8, this.f50059zy, this.f50058toq);
        }

        @zy.lvui
        /* JADX INFO: renamed from: y */
        public C0418g m1850y(@zy.dd CharSequence charSequence) {
            this.f3149q = charSequence;
            return this;
        }

        @zy.lvui
        public Bundle zy() {
            return this.f50059zy;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ch$k */
    /* JADX INFO: compiled from: RemoteInput.java */
    @zy.hyr(16)
    static class C0419k {
        private C0419k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ClipData m1851k(Intent intent) {
            return intent.getClipData();
        }

        @InterfaceC7830i
        static void toq(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ch$n */
    /* JADX INFO: compiled from: RemoteInput.java */
    @zy.hyr(29)
    static class C0420n {
        private C0420n() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m1852k(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @InterfaceC7830i
        static RemoteInput.Builder toq(RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ch$q */
    /* JADX INFO: compiled from: RemoteInput.java */
    @zy.hyr(28)
    static class C0421q {
        private C0421q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m1853k(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @InterfaceC7830i
        static void toq(Intent intent, int i2) {
            RemoteInput.setResultsSource(intent, i2);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @zy.hyr(20)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1854k(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static Bundle m1855q(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }

        public static RemoteInput toq(ch chVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(chVar.kja0()).setLabel(chVar.n7h()).setChoices(chVar.m1845y()).setAllowFreeFormInput(chVar.m1844g()).addExtras(chVar.qrj());
            Set<String> setF7l8 = chVar.f7l8();
            if (setF7l8 != null) {
                Iterator<String> it = setF7l8.iterator();
                while (it.hasNext()) {
                    zy.m1857q(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C0420n.toq(builderAddExtras, chVar.ld6());
            }
            return builderAddExtras.build();
        }

        static ch zy(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            C0418g c0418gM1847k = new C0418g(remoteInput.getResultKey()).m1850y(remoteInput.getLabel()).m1846g(remoteInput.getChoices()).m1848n(remoteInput.getAllowFreeFormInput()).m1847k(remoteInput.getExtras());
            Set<String> qVar = zy.toq(remoteInput);
            if (qVar != null) {
                Iterator<String> it = qVar.iterator();
                while (it.hasNext()) {
                    c0418gM1847k.m1849q(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c0418gM1847k.f7l8(C0420n.m1852k(remoteInput));
            }
            return c0418gM1847k.toq();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.ch$y */
    /* JADX INFO: compiled from: RemoteInput.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0422y {
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @zy.hyr(26)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1856k(ch chVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(ch.zy(chVar), intent, map);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static RemoteInput.Builder m1857q(RemoteInput.Builder builder, String str, boolean z2) {
            return builder.setAllowDataType(str, z2);
        }

        @InterfaceC7830i
        static Set<String> toq(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @InterfaceC7830i
        static Map<String, Uri> zy(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }
    }

    ch(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z2, int i2, Bundle bundle, Set<String> set) {
        this.f3143k = str;
        this.f50055toq = charSequence;
        this.f50056zy = charSequenceArr;
        this.f3145q = z2;
        this.f3144n = i2;
        this.f3142g = bundle;
        this.f50054f7l8 = set;
        if (ld6() == 2 && !m1844g()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static int cdj(@zy.lvui Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0421q.m1853k(intent);
        }
        Intent intentM1843s = m1843s(intent);
        if (intentM1843s == null) {
            return 0;
        }
        return intentM1843s.getExtras().getInt(f50050ld6, 0);
    }

    @zy.dd
    /* JADX INFO: renamed from: h */
    public static Bundle m1838h(@zy.lvui Intent intent) {
        return toq.m1855q(intent);
    }

    /* JADX INFO: renamed from: k */
    public static void m1839k(@zy.lvui ch chVar, @zy.lvui Intent intent, @zy.lvui Map<String, Uri> map) {
        zy.m1856k(chVar, intent, map);
    }

    @zy.hyr(20)
    /* JADX INFO: renamed from: n */
    static ch m1840n(RemoteInput remoteInput) {
        return toq.zy(remoteInput);
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public static Map<String, Uri> m1841p(@zy.lvui Intent intent, @zy.lvui String str) {
        return zy.zy(intent, str);
    }

    @zy.hyr(20)
    /* JADX INFO: renamed from: q */
    static RemoteInput[] m1842q(ch[] chVarArr) {
        if (chVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[chVarArr.length];
        for (int i2 = 0; i2 < chVarArr.length; i2++) {
            remoteInputArr[i2] = zy(chVarArr[i2]);
        }
        return remoteInputArr;
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: s */
    private static Intent m1843s(Intent intent) {
        ClipData clipDataM1851k = C0419k.m1851k(intent);
        if (clipDataM1851k == null) {
            return null;
        }
        ClipDescription description = clipDataM1851k.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f3141y)) {
            return clipDataM1851k.getItemAt(0).getIntent();
        }
        return null;
    }

    public static void t8r(@zy.lvui Intent intent, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0421q.toq(intent, i2);
            return;
        }
        Intent intentM1843s = m1843s(intent);
        if (intentM1843s == null) {
            intentM1843s = new Intent();
        }
        intentM1843s.putExtra(f50050ld6, i2);
        C0419k.toq(intent, ClipData.newIntent(f3141y, intentM1843s));
    }

    public static void toq(@zy.lvui ch[] chVarArr, @zy.lvui Intent intent, @zy.lvui Bundle bundle) {
        toq.m1854k(m1842q(chVarArr), intent, bundle);
    }

    private static String x2(String str) {
        return f3139p + str;
    }

    @zy.hyr(20)
    static RemoteInput zy(ch chVar) {
        return toq.toq(chVar);
    }

    @zy.dd
    public Set<String> f7l8() {
        return this.f50054f7l8;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1844g() {
        return this.f3145q;
    }

    public boolean ki() {
        return (m1844g() || (m1845y() != null && m1845y().length != 0) || f7l8() == null || f7l8().isEmpty()) ? false : true;
    }

    @zy.lvui
    public String kja0() {
        return this.f3143k;
    }

    public int ld6() {
        return this.f3144n;
    }

    @zy.dd
    public CharSequence n7h() {
        return this.f50055toq;
    }

    @zy.lvui
    public Bundle qrj() {
        return this.f3142g;
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    public CharSequence[] m1845y() {
        return this.f50056zy;
    }
}
