package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.C0683f;
import androidx.preference.fn3e;
import androidx.preference.ki;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p023g.C6045k;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public static final int am = Integer.MAX_VALUE;
    private static final String ay = "Preference";

    /* JADX INFO: renamed from: a */
    private boolean f5408a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f51761ab;
    private InterfaceC0995g ac;
    private final View.OnClickListener ad;
    private boolean an;
    private toq as;
    private boolean ax;
    private PreferenceGroup az;

    /* JADX INFO: renamed from: b */
    private boolean f5409b;
    private boolean ba;
    private boolean bb;
    private List<Preference> bg;
    private int bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f51762bo;
    private boolean bp;
    private ViewOnCreateContextMenuListenerC0997n bq;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    private Intent f5410c;

    /* JADX INFO: renamed from: d */
    private boolean f5411d;

    /* JADX INFO: renamed from: e */
    private String f5412e;

    /* JADX INFO: renamed from: f */
    private String f5413f;

    /* JADX INFO: renamed from: g */
    private long f5414g;

    /* JADX INFO: renamed from: h */
    private int f5415h;

    /* JADX INFO: renamed from: i */
    private int f5416i;
    private boolean id;
    private int in;

    /* JADX INFO: renamed from: j */
    private Bundle f5417j;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Context f5418k;

    /* JADX INFO: renamed from: l */
    private Drawable f5419l;

    /* JADX INFO: renamed from: m */
    private boolean f5420m;

    /* JADX INFO: renamed from: n */
    @dd
    private AbstractC1033s f5421n;

    /* JADX INFO: renamed from: o */
    private boolean f5422o;

    /* JADX INFO: renamed from: p */
    private InterfaceC0998q f5423p;

    /* JADX INFO: renamed from: q */
    @dd
    private ki f5424q;

    /* JADX INFO: renamed from: r */
    private int f5425r;

    /* JADX INFO: renamed from: s */
    private zy f5426s;

    /* JADX INFO: renamed from: t */
    private CharSequence f5427t;

    /* JADX INFO: renamed from: u */
    private Object f5428u;

    /* JADX INFO: renamed from: v */
    private boolean f5429v;

    /* JADX INFO: renamed from: w */
    private boolean f5430w;

    /* JADX INFO: renamed from: x */
    private String f5431x;

    /* JADX INFO: renamed from: y */
    private boolean f5432y;

    /* JADX INFO: renamed from: z */
    private CharSequence f5433z;

    public static class BaseSavedState extends AbsSavedState {

        @lvui
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i2) {
                return new BaseSavedState[i2];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$g */
    public interface InterfaceC0995g<T extends Preference> {
        @dd
        /* JADX INFO: renamed from: k */
        CharSequence mo4643k(@lvui T t2);
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$k */
    class ViewOnClickListenerC0996k implements View.OnClickListener {
        ViewOnClickListenerC0996k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.lv5(view);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$n */
    private static class ViewOnCreateContextMenuListenerC0997n implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: k */
        private final Preference f5435k;

        ViewOnCreateContextMenuListenerC0997n(@lvui Preference preference) {
            this.f5435k = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceEqxt = this.f5435k.eqxt();
            if (!this.f5435k.x9kr() || TextUtils.isEmpty(charSequenceEqxt)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceEqxt);
            contextMenu.add(0, 0, 0, fn3e.C1012s.f5529k).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f5435k.x2().getSystemService("clipboard");
            CharSequence charSequenceEqxt = this.f5435k.eqxt();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.ay, charSequenceEqxt));
            Toast.makeText(this.f5435k.x2(), this.f5435k.x2().getString(fn3e.C1012s.f5531q, charSequenceEqxt), 0).show();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$q */
    public interface InterfaceC0998q {
        boolean onPreferenceClick(@lvui Preference preference);
    }

    interface toq {
        /* JADX INFO: renamed from: g */
        void mo4666g(@lvui Preference preference);

        /* JADX INFO: renamed from: s */
        void mo4667s(@lvui Preference preference);

        void zy(@lvui Preference preference);
    }

    public interface zy {
        boolean onPreferenceChange(@lvui Preference preference, Object obj);
    }

    public Preference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        this.f5415h = Integer.MAX_VALUE;
        this.f5416i = 0;
        this.f5422o = true;
        this.f5420m = true;
        this.f5408a = true;
        this.f51762bo = true;
        this.f5429v = true;
        this.f5411d = true;
        this.f5430w = true;
        this.f51761ab = true;
        this.bp = true;
        this.id = true;
        int i4 = fn3e.C1013y.f51963zy;
        this.in = i4;
        this.ad = new ViewOnClickListenerC0996k();
        this.f5418k = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51833eqxt, i2, i3);
        this.f5425r = androidx.core.content.res.kja0.n7h(typedArrayObtainStyledAttributes, fn3e.ld6.f5488b, fn3e.ld6.f51826d2ok, 0);
        this.f5413f = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51813a98o, fn3e.ld6.f5498l);
        this.f5433z = androidx.core.content.res.kja0.m2301h(typedArrayObtainStyledAttributes, fn3e.ld6.f5507u, fn3e.ld6.f51912x9kr);
        this.f5427t = androidx.core.content.res.kja0.m2301h(typedArrayObtainStyledAttributes, fn3e.ld6.f51893t8iq, fn3e.ld6.f51874n5r1);
        this.f5415h = androidx.core.content.res.kja0.m2306q(typedArrayObtainStyledAttributes, fn3e.ld6.f51921zp, fn3e.ld6.f51849hyr, Integer.MAX_VALUE);
        this.f5412e = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51915y9n, fn3e.ld6.f51904vyq);
        this.in = androidx.core.content.res.kja0.n7h(typedArrayObtainStyledAttributes, fn3e.ld6.f5487a, fn3e.ld6.f51829dd, i4);
        this.bl = androidx.core.content.res.kja0.n7h(typedArrayObtainStyledAttributes, fn3e.ld6.f51818bo, fn3e.ld6.f5492f, 0);
        this.f5422o = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f51918yz, fn3e.ld6.f5504r, true);
        this.f5420m = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f51824ch, fn3e.ld6.f51876ncyb, true);
        this.f5408a = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f5509x, fn3e.ld6.f51868lvui, true);
        this.f5431x = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f5499m, fn3e.ld6.f5489c);
        int i5 = fn3e.ld6.f51848hb;
        this.f5430w = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i5, i5, this.f5420m);
        int i6 = fn3e.ld6.f5496j;
        this.f51761ab = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i6, i6, this.f5420m);
        int i7 = fn3e.ld6.f5501o;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.f5428u = y9n(typedArrayObtainStyledAttributes, i7);
        } else {
            int i8 = fn3e.ld6.f51865lrht;
            if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                this.f5428u = y9n(typedArrayObtainStyledAttributes, i8);
            }
        }
        this.id = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f51879nmn5, fn3e.ld6.f51900uv6, true);
        int i9 = fn3e.ld6.f51867lv5;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i9);
        this.bb = zHasValue;
        if (zHasValue) {
            this.bp = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i9, fn3e.ld6.f5491e, true);
        }
        this.bv = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f51817bf2, fn3e.ld6.f51880nn86, false);
        int i10 = fn3e.ld6.f51850i1;
        this.f5411d = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i10, i10, true);
        int i11 = fn3e.ld6.f51832ek5k;
        this.an = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i11, i11, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b3e(Preference preference) {
        List<Preference> list = this.bg;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void dr() {
        if (TextUtils.isEmpty(this.f5431x)) {
            return;
        }
        Preference preferenceLd6 = ld6(this.f5431x);
        if (preferenceLd6 != null) {
            preferenceLd6.xwq3(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f5431x + "\" not found for preference \"" + this.f5413f + "\" (title: \"" + ((Object) this.f5433z) + "\"");
    }

    private void jz5(@lvui SharedPreferences.Editor editor) {
        if (this.f5424q.gvn7()) {
            editor.apply();
        }
    }

    private void ktq() {
        Preference preferenceLd6;
        String str = this.f5431x;
        if (str == null || (preferenceLd6 = ld6(str)) == null) {
            return;
        }
        preferenceLd6.b3e(this);
    }

    /* JADX INFO: renamed from: p */
    private void m4646p() {
        if (jp0y() != null) {
            m4663x(true, this.f5428u);
            return;
        }
        if (uj2j() && d3().contains(this.f5413f)) {
            m4663x(true, null);
            return;
        }
        Object obj = this.f5428u;
        if (obj != null) {
            m4663x(false, obj);
        }
    }

    private void qo(@lvui View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                qo(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    private void xwq3(Preference preference) {
        if (this.bg == null) {
            this.bg = new ArrayList();
        }
        this.bg.add(preference);
        preference.ek5k(this, bz2());
    }

    @dd
    /* JADX INFO: renamed from: a */
    protected Parcelable mo4640a() {
        this.ax = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected String a9(String str) {
        if (!uj2j()) {
            return str;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        return abstractC1033sJp0y != null ? abstractC1033sJp0y.m4717n(this.f5413f, str) : this.f5424q.kja0().getString(this.f5413f, str);
    }

    protected void a98o(@dd Parcelable parcelable) {
        this.ax = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @Deprecated
    @InterfaceC7842s
    /* JADX INFO: renamed from: b */
    public void m4647b(androidx.core.view.accessibility.ki kiVar) {
    }

    final boolean bek6() {
        return this.ba;
    }

    public void bf2(@lvui Preference preference, boolean z2) {
        if (this.f5429v == z2) {
            this.f5429v = !z2;
            vyq(bz2());
            uv6();
        }
    }

    protected boolean bo(int i2) {
        if (!uj2j()) {
            return false;
        }
        if (i2 == mcp(~i2)) {
            return true;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        if (abstractC1033sJp0y != null) {
            abstractC1033sJp0y.m4720s(this.f5413f, i2);
        } else {
            SharedPreferences.Editor editorF7l8 = this.f5424q.f7l8();
            editorF7l8.putInt(this.f5413f, i2);
            jz5(editorF7l8);
        }
        return true;
    }

    public void bwp(@dd CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5433z)) {
            return;
        }
        this.f5433z = charSequence;
        uv6();
    }

    public boolean bz2() {
        return !ncyb();
    }

    /* JADX INFO: renamed from: c */
    public boolean m4648c() {
        return this.bp;
    }

    protected boolean c8jq(String str) {
        if (!uj2j()) {
            return false;
        }
        if (TextUtils.equals(str, a9(null))) {
            return true;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        if (abstractC1033sJp0y != null) {
            abstractC1033sJp0y.ld6(this.f5413f, str);
        } else {
            SharedPreferences.Editor editorF7l8 = this.f5424q.f7l8();
            editorF7l8.putString(this.f5413f, str);
            jz5(editorF7l8);
        }
        return true;
    }

    @dd
    public Drawable cdj() {
        int i2;
        if (this.f5419l == null && (i2 = this.f5425r) != 0) {
            this.f5419l = C6045k.toq(this.f5418k, i2);
        }
        return this.f5419l;
    }

    public void cfr(boolean z2) {
        this.bb = true;
        this.bp = z2;
    }

    @dd
    public Bundle ch() {
        return this.f5417j;
    }

    /* JADX INFO: renamed from: d */
    public void m4649d(@lvui Bundle bundle) {
        mo4659s(bundle);
    }

    @dd
    public final InterfaceC0995g d2ok() {
        return this.ac;
    }

    @dd
    public SharedPreferences d3() {
        if (this.f5424q == null || jp0y() != null) {
            return null;
        }
        return this.f5424q.kja0();
    }

    public void d8wk(@dd Drawable drawable) {
        if (this.f5419l != drawable) {
            this.f5419l = drawable;
            this.f5425r = 0;
            uv6();
        }
    }

    public boolean dd() {
        return !TextUtils.isEmpty(this.f5413f);
    }

    /* JADX INFO: renamed from: e */
    protected void m4650e() {
        toq toqVar = this.as;
        if (toqVar != null) {
            toqVar.mo4667s(this);
        }
    }

    public void ek5k(@lvui Preference preference, boolean z2) {
        if (this.f51762bo == z2) {
            this.f51762bo = !z2;
            vyq(bz2());
            uv6();
        }
    }

    @dd
    public CharSequence eqxt() {
        return d2ok() != null ? d2ok().mo4643k(this) : this.f5427t;
    }

    public void etdu(boolean z2) {
        if (this.f5420m != z2) {
            this.f5420m = z2;
            uv6();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4651f() {
        if (!lrht() || gvn7() == null) {
            return false;
        }
        if (this == gvn7().n7h()) {
            return true;
        }
        PreferenceGroup preferenceGroupO1t = o1t();
        if (preferenceGroupO1t == null) {
            return false;
        }
        return preferenceGroupO1t.m4651f();
    }

    void f7l8(@lvui Bundle bundle) {
        Parcelable parcelable;
        if (!dd() || (parcelable = bundle.getParcelable(this.f5413f)) == null) {
            return;
        }
        this.ax = false;
        a98o(parcelable);
        if (!this.ax) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public String fn3e() {
        return this.f5413f;
    }

    public void fnq8(boolean z2) {
        if (this.f5422o != z2) {
            this.f5422o = z2;
            vyq(bz2());
            uv6();
        }
    }

    public Set<String> fti(Set<String> set) {
        if (!uj2j()) {
            return set;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        return abstractC1033sJp0y != null ? abstractC1033sJp0y.m4715g(this.f5413f, set) : this.f5424q.kja0().getStringSet(this.f5413f, set);
    }

    @dd
    public InterfaceC0998q fu4() {
        return this.f5423p;
    }

    public void g1(boolean z2) {
        if (this.bv != z2) {
            this.bv = z2;
            uv6();
        }
    }

    public void gbni(String str) {
        this.f5413f = str;
        if (!this.f5409b || dd()) {
            return;
        }
        m4662v();
    }

    public final void gc3c(boolean z2) {
        if (this.f5411d != z2) {
            this.f5411d = z2;
            toq toqVar = this.as;
            if (toqVar != null) {
                toqVar.zy(this);
            }
        }
    }

    public ki gvn7() {
        return this.f5424q;
    }

    public boolean gyi(Set<String> set) {
        if (!uj2j()) {
            return false;
        }
        if (set.equals(fti(null))) {
            return true;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        if (abstractC1033sJp0y != null) {
            abstractC1033sJp0y.x2(this.f5413f, set);
        } else {
            SharedPreferences.Editor editorF7l8 = this.f5424q.f7l8();
            editorF7l8.putStringSet(this.f5413f, set);
            jz5(editorF7l8);
        }
        return true;
    }

    @dd
    /* JADX INFO: renamed from: h */
    public String m4652h() {
        return this.f5412e;
    }

    protected void hb(@lvui ki kiVar) {
        this.f5424q = kiVar;
        if (!this.f5432y) {
            this.f5414g = kiVar.m4696y();
        }
        m4646p();
    }

    public boolean hyr() {
        return this.f5420m;
    }

    @dd
    /* JADX INFO: renamed from: i */
    public Intent m4653i() {
        return this.f5410c;
    }

    protected void i1() {
        ktq();
    }

    public void i9jn(@dd zy zyVar) {
        this.f5426s = zyVar;
    }

    public void ikck(@lvui Bundle bundle) {
        f7l8(bundle);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: j */
    protected void m4654j(@lvui ki kiVar, long j2) {
        this.f5414g = j2;
        this.f5432y = true;
        try {
            hb(kiVar);
        } finally {
            this.f5432y = false;
        }
    }

    protected long jk(long j2) {
        if (!uj2j()) {
            return j2;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        return abstractC1033sJp0y != null ? abstractC1033sJp0y.m4719q(this.f5413f, j2) : this.f5424q.kja0().getLong(this.f5413f, j2);
    }

    @dd
    public AbstractC1033s jp0y() {
        AbstractC1033s abstractC1033s = this.f5421n;
        if (abstractC1033s != null) {
            return abstractC1033s;
        }
        ki kiVar = this.f5424q;
        if (kiVar != null) {
            return kiVar.qrj();
        }
        return null;
    }

    public void kcsr(int i2) {
        bwp(this.f5418k.getString(i2));
    }

    long ki() {
        return this.f5414g;
    }

    @lvui
    StringBuilder kja0() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceLvui = lvui();
        if (!TextUtils.isEmpty(charSequenceLvui)) {
            sb.append(charSequenceLvui);
            sb.append(' ');
        }
        CharSequence charSequenceEqxt = eqxt();
        if (!TextUtils.isEmpty(charSequenceEqxt)) {
            sb.append(charSequenceEqxt);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* JADX INFO: renamed from: l */
    public boolean m4655l() {
        return this.bv;
    }

    @dd
    protected <T extends Preference> T ld6(@lvui String str) {
        ki kiVar = this.f5424q;
        if (kiVar == null) {
            return null;
        }
        return (T) kiVar.toq(str);
    }

    public final boolean lrht() {
        return this.f5411d;
    }

    public void ltg8(@dd InterfaceC0998q interfaceC0998q) {
        this.f5423p = interfaceC0998q;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void lv5(@lvui View view) {
        nmn5();
    }

    @dd
    public CharSequence lvui() {
        return this.f5433z;
    }

    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
    }

    public void m4(boolean z2) {
        this.f5408a = z2;
    }

    protected int mcp(int i2) {
        if (!uj2j()) {
            return i2;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        return abstractC1033sJp0y != null ? abstractC1033sJp0y.zy(this.f5413f, i2) : this.f5424q.kja0().getInt(this.f5413f, i2);
    }

    public void mu(boolean z2) {
        if (this.an != z2) {
            this.an = z2;
            uv6();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(@lvui Preference preference) {
        int i2 = this.f5415h;
        int i3 = preference.f5415h;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.f5433z;
        CharSequence charSequence2 = preference.f5433z;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f5433z.toString());
    }

    public boolean n5r1() {
        return this.f5408a;
    }

    @lvui
    public Bundle n7h() {
        if (this.f5417j == null) {
            this.f5417j = new Bundle();
        }
        return this.f5417j;
    }

    public boolean ncyb() {
        return this.f5422o && this.f51762bo && this.f5429v;
    }

    @dd
    public zy ni7() {
        return this.f5426s;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void nmn5() {
        ki.zy zyVarLd6;
        if (ncyb() && hyr()) {
            mo4639m();
            InterfaceC0998q interfaceC0998q = this.f5423p;
            if (interfaceC0998q == null || !interfaceC0998q.onPreferenceClick(this)) {
                ki kiVarGvn7 = gvn7();
                if ((kiVarGvn7 == null || (zyVarLd6 = kiVarGvn7.ld6()) == null || !zyVarLd6.onPreferenceTreeClick(this)) && this.f5410c != null) {
                    x2().startActivity(this.f5410c);
                }
            }
        }
    }

    public void nn86() {
        dr();
    }

    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        Integer numValueOf;
        View view = c1016i.itemView;
        view.setOnClickListener(this.ad);
        view.setId(this.f5416i);
        TextView textView = (TextView) c1016i.fn3e(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceEqxt = eqxt();
            if (TextUtils.isEmpty(charSequenceEqxt)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceEqxt);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) c1016i.fn3e(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceLvui = lvui();
            if (TextUtils.isEmpty(charSequenceLvui)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceLvui);
                textView2.setVisibility(0);
                if (this.bb) {
                    textView2.setSingleLine(this.bp);
                }
                if (!hyr() && ncyb() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) c1016i.fn3e(R.id.icon);
        if (imageView != null) {
            int i2 = this.f5425r;
            if (i2 != 0 || this.f5419l != null) {
                if (this.f5419l == null) {
                    this.f5419l = C6045k.toq(this.f5418k, i2);
                }
                Drawable drawable = this.f5419l;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f5419l != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.bv ? 4 : 8);
            }
        }
        View viewFn3e = c1016i.fn3e(fn3e.C1007g.f5462k);
        if (viewFn3e == null) {
            viewFn3e = c1016i.fn3e(16908350);
        }
        if (viewFn3e != null) {
            if (this.f5419l != null) {
                viewFn3e.setVisibility(0);
            } else {
                viewFn3e.setVisibility(this.bv ? 4 : 8);
            }
        }
        if (this.id) {
            qo(view, ncyb());
        } else {
            qo(view, true);
        }
        boolean zHyr = hyr();
        view.setFocusable(zHyr);
        view.setClickable(zHyr);
        c1016i.o1t(this.f5430w);
        c1016i.wvg(this.f51761ab);
        boolean zX9kr = x9kr();
        if (zX9kr && this.bq == null) {
            this.bq = new ViewOnCreateContextMenuListenerC0997n(this);
        }
        view.setOnCreateContextMenuListener(zX9kr ? this.bq : null);
        view.setLongClickable(zX9kr);
        if (!zX9kr || zHyr) {
            return;
        }
        C0683f.wlev(view, null);
    }

    @dd
    public PreferenceGroup o1t() {
        return this.az;
    }

    public boolean oc() {
        return this.id;
    }

    final void py(@dd toq toqVar) {
        this.as = toqVar;
    }

    /* JADX INFO: renamed from: q */
    final void m4657q() {
        this.ba = false;
    }

    public void qkj8(@dd String str) {
        ktq();
        this.f5431x = str;
        dr();
    }

    @dd
    public String qrj() {
        return this.f5431x;
    }

    /* JADX INFO: renamed from: r */
    public final int m4658r() {
        return this.bl;
    }

    public void r8s8(int i2) {
        if (i2 != this.f5415h) {
            this.f5415h = i2;
            m4650e();
        }
    }

    /* JADX INFO: renamed from: s */
    void mo4659s(@lvui Bundle bundle) {
        if (dd()) {
            this.ax = false;
            Parcelable parcelableMo4640a = mo4640a();
            if (!this.ax) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableMo4640a != null) {
                bundle.putParcelable(this.f5413f, parcelableMo4640a);
            }
        }
    }

    public void se(int i2) {
        this.f5416i = i2;
    }

    public void sok(boolean z2) {
        if (this.id != z2) {
            this.id = z2;
            uv6();
        }
    }

    /* JADX INFO: renamed from: t */
    protected float m4660t(float f2) {
        if (!uj2j()) {
            return f2;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        return abstractC1033sJp0y != null ? abstractC1033sJp0y.toq(this.f5413f, f2) : this.f5424q.kja0().getFloat(this.f5413f, f2);
    }

    protected boolean t8iq(boolean z2) {
        if (!uj2j()) {
            return false;
        }
        if (z2 == wvg(!z2)) {
            return true;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        if (abstractC1033sJp0y != null) {
            abstractC1033sJp0y.f7l8(this.f5413f, z2);
        } else {
            SharedPreferences.Editor editorF7l8 = this.f5424q.f7l8();
            editorF7l8.putBoolean(this.f5413f, z2);
            jz5(editorF7l8);
        }
        return true;
    }

    public void tfm(@dd String str) {
        this.f5412e = str;
    }

    @lvui
    public String toString() {
        return kja0().toString();
    }

    void toq(@dd PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.az != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.az = preferenceGroup;
    }

    /* JADX INFO: renamed from: u */
    protected boolean m4661u(float f2) {
        if (!uj2j()) {
            return false;
        }
        if (f2 == m4660t(Float.NaN)) {
            return true;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        if (abstractC1033sJp0y != null) {
            abstractC1033sJp0y.m4721y(this.f5413f, f2);
        } else {
            SharedPreferences.Editor editorF7l8 = this.f5424q.f7l8();
            editorF7l8.putFloat(this.f5413f, f2);
            jz5(editorF7l8);
        }
        return true;
    }

    protected boolean uj2j() {
        return this.f5424q != null && n5r1() && dd();
    }

    protected void uv6() {
        toq toqVar = this.as;
        if (toqVar != null) {
            toqVar.mo4666g(this);
        }
    }

    /* JADX INFO: renamed from: v */
    void m4662v() {
        if (TextUtils.isEmpty(this.f5413f)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f5409b = true;
    }

    public void v0af(@dd AbstractC1033s abstractC1033s) {
        this.f5421n = abstractC1033s;
    }

    public void vq(Object obj) {
        this.f5428u = obj;
    }

    public void vyq(boolean z2) {
        List<Preference> list = this.bg;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).ek5k(this, z2);
        }
    }

    public void w831(int i2) {
        z4(this.f5418k.getString(i2));
    }

    public void was(@dd Intent intent) {
        this.f5410c = intent;
    }

    public void wo(int i2) {
        d8wk(C6045k.toq(this.f5418k, i2));
        this.f5425r = i2;
    }

    protected boolean wvg(boolean z2) {
        if (!uj2j()) {
            return z2;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        return abstractC1033sJp0y != null ? abstractC1033sJp0y.m4716k(this.f5413f, z2) : this.f5424q.kja0().getBoolean(this.f5413f, z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    protected void m4663x(boolean z2, Object obj) {
        zp(obj);
    }

    @lvui
    public Context x2() {
        return this.f5418k;
    }

    public boolean x9kr() {
        return this.an;
    }

    protected boolean y2(long j2) {
        if (!uj2j()) {
            return false;
        }
        if (j2 == jk(~j2)) {
            return true;
        }
        AbstractC1033s abstractC1033sJp0y = jp0y();
        if (abstractC1033sJp0y != null) {
            abstractC1033sJp0y.m4718p(this.f5413f, j2);
        } else {
            SharedPreferences.Editor editorF7l8 = this.f5424q.f7l8();
            editorF7l8.putLong(this.f5413f, j2);
            jz5(editorF7l8);
        }
        return true;
    }

    @dd
    protected Object y9n(@lvui TypedArray typedArray, int i2) {
        return null;
    }

    public final void yqrt(@dd InterfaceC0995g interfaceC0995g) {
        this.ac = interfaceC0995g;
        uv6();
    }

    public void yz() {
        ktq();
        this.ba = true;
    }

    /* JADX INFO: renamed from: z */
    public int m4664z() {
        return this.f5415h;
    }

    public void z4(@dd CharSequence charSequence) {
        if (d2ok() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f5427t, charSequence)) {
            return;
        }
        this.f5427t = charSequence;
        uv6();
    }

    public void zkd(int i2) {
        this.bl = i2;
    }

    protected void zp(@dd Object obj) {
    }

    public void zsr0(int i2) {
        this.in = i2;
    }

    public final int zurt() {
        return this.in;
    }

    public boolean zy(Object obj) {
        zy zyVar = this.f5426s;
        return zyVar == null || zyVar.onPreferenceChange(this, obj);
    }

    public Preference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51795ncyb, R.attr.preferenceStyle));
    }

    public Preference(@lvui Context context) {
        this(context, null);
    }
}
