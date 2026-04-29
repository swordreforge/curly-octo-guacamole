package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.C0498q;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PreferenceManager.java */
/* JADX INFO: loaded from: classes.dex */
public class ki {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f51967cdj = 1;

    /* JADX INFO: renamed from: h */
    private static final int f5554h = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f51968kja0 = "_has_set_default_values";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f51969f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f5555g;

    /* JADX INFO: renamed from: k */
    private final Context f5556k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private AbstractC1021q f51970ld6;

    /* JADX INFO: renamed from: n */
    @dd
    private SharedPreferences.Editor f5557n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private toq f51971n7h;

    /* JADX INFO: renamed from: p */
    private PreferenceScreen f5558p;

    /* JADX INFO: renamed from: q */
    @dd
    private AbstractC1033s f5559q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private InterfaceC1019k f51972qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private zy f51974x2;

    /* JADX INFO: renamed from: y */
    private int f5561y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private SharedPreferences f51975zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f51973toq = 0;

    /* JADX INFO: renamed from: s */
    private int f5560s = 0;

    /* JADX INFO: renamed from: androidx.preference.ki$k */
    /* JADX INFO: compiled from: PreferenceManager.java */
    public interface InterfaceC1019k {
        void onDisplayPreferenceDialog(@lvui Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.ki$n */
    /* JADX INFO: compiled from: PreferenceManager.java */
    public static class C1020n extends AbstractC1021q {
        @Override // androidx.preference.ki.AbstractC1021q
        /* JADX INFO: renamed from: k */
        public boolean mo4698k(@lvui Preference preference, @lvui Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.bek6()) || !TextUtils.equals(preference.lvui(), preference2.lvui()) || !TextUtils.equals(preference.eqxt(), preference2.eqxt())) {
                return false;
            }
            Drawable drawableCdj = preference.cdj();
            Drawable drawableCdj2 = preference2.cdj();
            if ((drawableCdj != drawableCdj2 && (drawableCdj == null || !drawableCdj.equals(drawableCdj2))) || preference.ncyb() != preference2.ncyb() || preference.hyr() != preference2.hyr()) {
                return false;
            }
            if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).isChecked() == ((TwoStatePreference) preference2).isChecked()) {
                return !(preference instanceof DropDownPreference) || preference == preference2;
            }
            return false;
        }

        @Override // androidx.preference.ki.AbstractC1021q
        public boolean toq(@lvui Preference preference, @lvui Preference preference2) {
            return preference.ki() == preference2.ki();
        }
    }

    /* JADX INFO: renamed from: androidx.preference.ki$q */
    /* JADX INFO: compiled from: PreferenceManager.java */
    public static abstract class AbstractC1021q {
        /* JADX INFO: renamed from: k */
        public abstract boolean mo4698k(@lvui Preference preference, @lvui Preference preference2);

        public abstract boolean toq(@lvui Preference preference, @lvui Preference preference2);
    }

    /* JADX INFO: compiled from: PreferenceManager.java */
    public interface toq {
        void onNavigateToScreen(@lvui PreferenceScreen preferenceScreen);
    }

    /* JADX INFO: compiled from: PreferenceManager.java */
    public interface zy {
        boolean onPreferenceTreeClick(@lvui Preference preference);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ki(@lvui Context context) {
        this.f5556k = context;
        a9(m4687g(context));
    }

    public static void fn3e(@lvui Context context, int i2, boolean z2) {
        zurt(context, m4687g(context), m4688n(), i2, z2);
    }

    /* JADX INFO: renamed from: g */
    private static String m4687g(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* JADX INFO: renamed from: n */
    private static int m4688n() {
        return 0;
    }

    private void ni7(boolean z2) {
        SharedPreferences.Editor editor;
        if (!z2 && (editor = this.f5557n) != null) {
            editor.apply();
        }
        this.f5555g = z2;
    }

    /* JADX INFO: renamed from: q */
    public static SharedPreferences m4689q(@lvui Context context) {
        return context.getSharedPreferences(m4687g(context), m4688n());
    }

    public static void zurt(@lvui Context context, String str, int i2, int i3, boolean z2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f51968kja0, 0);
        if (z2 || !sharedPreferences.getBoolean(f51968kja0, false)) {
            ki kiVar = new ki(context);
            kiVar.a9(str);
            kiVar.jk(i2);
            kiVar.ki(context, i3, null);
            sharedPreferences.edit().putBoolean(f51968kja0, true).apply();
        }
    }

    public void a9(String str) {
        this.f51969f7l8 = str;
        this.f51975zy = null;
    }

    public String cdj() {
        return this.f51969f7l8;
    }

    public void d3(@lvui Preference preference) {
        InterfaceC1019k interfaceC1019k = this.f51972qrj;
        if (interfaceC1019k != null) {
            interfaceC1019k.onDisplayPreferenceDialog(preference);
        }
    }

    @dd
    SharedPreferences.Editor f7l8() {
        if (this.f5559q != null) {
            return null;
        }
        if (!this.f5555g) {
            return kja0().edit();
        }
        if (this.f5557n == null) {
            this.f5557n = kja0().edit();
        }
        return this.f5557n;
    }

    public void fti() {
        this.f5560s = 0;
        this.f51975zy = null;
    }

    public void fu4(@dd InterfaceC1019k interfaceC1019k) {
        this.f51972qrj = interfaceC1019k;
    }

    boolean gvn7() {
        return !this.f5555g;
    }

    /* JADX INFO: renamed from: h */
    public int m4690h() {
        return this.f5561y;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4691i() {
        return this.f5560s == 1;
    }

    public void jk(int i2) {
        this.f5561y = i2;
        this.f51975zy = null;
    }

    public void jp0y() {
        this.f5560s = 1;
        this.f51975zy = null;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public PreferenceScreen m4692k(@lvui Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.hb(this);
        return preferenceScreen;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen ki(@lvui Context context, int i2, @dd PreferenceScreen preferenceScreen) {
        ni7(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new cdj(context, this).m4677n(i2, preferenceScreen);
        preferenceScreen2.hb(this);
        ni7(false);
        return preferenceScreen2;
    }

    @dd
    public SharedPreferences kja0() {
        if (qrj() != null) {
            return null;
        }
        if (this.f51975zy == null) {
            this.f51975zy = (this.f5560s != 1 ? this.f5556k : C0498q.toq(this.f5556k)).getSharedPreferences(this.f51969f7l8, this.f5561y);
        }
        return this.f51975zy;
    }

    @dd
    public zy ld6() {
        return this.f51974x2;
    }

    public boolean mcp(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f5558p;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.yz();
        }
        this.f5558p = preferenceScreen;
        return true;
    }

    public PreferenceScreen n7h() {
        return this.f5558p;
    }

    public void o1t(@dd zy zyVar) {
        this.f51974x2 = zyVar;
    }

    @dd
    /* JADX INFO: renamed from: p */
    public toq m4693p() {
        return this.f51971n7h;
    }

    @dd
    public AbstractC1033s qrj() {
        return this.f5559q;
    }

    @dd
    /* JADX INFO: renamed from: s */
    public InterfaceC1019k m4694s() {
        return this.f51972qrj;
    }

    /* JADX INFO: renamed from: t */
    public void m4695t(@dd AbstractC1033s abstractC1033s) {
        this.f5559q = abstractC1033s;
    }

    public boolean t8r() {
        return this.f5560s == 0;
    }

    @dd
    public <T extends Preference> T toq(@lvui CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f5558p;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.vep5(charSequence);
    }

    public void wvg(@dd AbstractC1021q abstractC1021q) {
        this.f51970ld6 = abstractC1021q;
    }

    @dd
    public AbstractC1021q x2() {
        return this.f51970ld6;
    }

    /* JADX INFO: renamed from: y */
    long m4696y() {
        long j2;
        synchronized (this) {
            j2 = this.f51973toq;
            this.f51973toq = 1 + j2;
        }
        return j2;
    }

    /* JADX INFO: renamed from: z */
    public void m4697z(@dd toq toqVar) {
        this.f51971n7h = toqVar;
    }

    @lvui
    public Context zy() {
        return this.f5556k;
    }
}
