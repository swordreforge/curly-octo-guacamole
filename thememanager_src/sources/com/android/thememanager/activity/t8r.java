package com.android.thememanager.activity;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AbstractC0096k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.h5.C2069n;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.v9.InterfaceC2873s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: BaseTabActivity.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class t8r extends kja0 implements AbstractC0096k.f7l8, AbstractC6946k.k, InterfaceC2873s, InterfaceC1357q {

    /* JADX INFO: renamed from: x */
    private static final String f9329x = "SAVED_TAB_LIST_STATE";

    /* JADX INFO: renamed from: b */
    private String f9331b;

    /* JADX INFO: renamed from: j */
    protected com.android.thememanager.basemodule.base.toq f9334j;

    /* JADX INFO: renamed from: m */
    protected int f9335m;

    /* JADX INFO: renamed from: o */
    protected boolean f9336o;

    /* JADX INFO: renamed from: c */
    protected int f9332c = -1;

    /* JADX INFO: renamed from: e */
    protected int f9333e = -1;

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f9330a = new ArrayList<>();

    /* JADX INFO: renamed from: com.android.thememanager.activity.t8r$k */
    /* JADX INFO: compiled from: BaseTabActivity.java */
    protected static class C1625k {

        /* JADX INFO: renamed from: k */
        public String f9337k;

        /* JADX INFO: renamed from: q */
        public boolean f9338q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Class<? extends Fragment> f57348toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public Bundle f57349zy;

        public C1625k(String title, Class<? extends Fragment> clazz, Bundle args, boolean hasActionMenu) {
            this.f9337k = title;
            this.f57348toq = clazz;
            this.f57349zy = args;
            this.f9338q = hasActionMenu;
        }
    }

    private void bz2(int color) {
        this.f9332c = color;
        if (com.android.thememanager.util.wvg.m10067k(color)) {
            setTranslucentStatus(2);
        } else {
            setTranslucentStatus(1);
        }
    }

    private void cfr(int position, boolean visible) {
        Fragment fragmentW831 = m6709b().w831(position);
        if (!(fragmentW831 instanceof C1582h)) {
            this.f9334j = null;
            return;
        }
        C1582h c1582h = (C1582h) fragmentW831;
        this.f9334j = c1582h;
        c1582h.nnh(visible);
    }

    protected void bwp(List<C1625k> tabs) {
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void d3(int position, float ratio, boolean fromHasActionMenu, boolean toHasActionMenu) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k.f7l8
    public void fn3e(AbstractC0096k.g tab, androidx.fragment.app.o1t ft) {
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    /* JADX INFO: renamed from: k */
    public void mo6476k(int state) {
    }

    protected void ktq() {
        if (TextUtils.isEmpty(this.f9331b)) {
            return;
        }
        m6709b().mo173v(this.f9331b);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.android.thememanager.basemodule.base.toq toqVar = this.f9334j;
        if (toqVar != null && (toqVar instanceof C1582h) && ((C1582h) toqVar).gyi()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        List<C1625k> listYqrt = yqrt();
        int size = listYqrt.size();
        this.f9335m = size;
        if (size == 1) {
            zkd();
        }
        Iterator<C1625k> it = listYqrt.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (C2069n.class.getName().equals(it.next().f57348toq.getName())) {
                this.f9336o = true;
                break;
            }
        }
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList(f9329x);
            this.f9330a.clear();
            this.f9330a.addAll(stringArrayList);
        }
        if (this.f9335m == 0) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC6946k abstractC6946kM6709b = m6709b();
        if (!this.f9330a.isEmpty()) {
            androidx.fragment.app.o1t o1tVarKi = supportFragmentManager.ki();
            for (String str : this.f9330a) {
                if (abstractC6946kM6709b.uj2j()) {
                    abstractC6946kM6709b.mbx(str);
                }
                Fragment fragmentNmn5 = supportFragmentManager.nmn5(str);
                if (fragmentNmn5 != null) {
                    o1tVarKi.fu4(fragmentNmn5);
                }
            }
            o1tVarKi.n7h();
            supportFragmentManager.a98o();
        }
        this.f9330a.clear();
        if (listYqrt.size() == 1) {
            setContentView(R.layout.resource_list_container);
            try {
                Fragment fragmentNmn52 = supportFragmentManager.nmn5("tag-dynamic");
                C1625k c1625k = listYqrt.get(0);
                this.f9331b = c1625k.f9337k;
                ktq();
                if (fragmentNmn52 == null) {
                    androidx.fragment.app.o1t o1tVarKi2 = supportFragmentManager.ki();
                    fragmentNmn52 = c1625k.f57348toq.newInstance();
                    fragmentNmn52.setArguments(c1625k.f57349zy);
                    o1tVarKi2.zy(R.id.container, fragmentNmn52, "tag-dynamic");
                    o1tVarKi2.qrj();
                }
                this.f9330a.add("tag-dynamic");
                com.android.thememanager.basemodule.base.toq toqVar = (com.android.thememanager.basemodule.base.toq) fragmentNmn52;
                this.f9334j = toqVar;
                if (toqVar instanceof C1582h) {
                    ((C1582h) toqVar).cyoe(c1625k.f57349zy);
                } else {
                    toqVar.setArguments(c1625k.f57349zy);
                }
                this.f9334j.nnh(true);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (getIntent().getBooleanExtra(InterfaceC1357q.f53943tfm, false)) {
            bwp(listYqrt);
        } else {
            if (!lv5() && !getIntent().getBooleanExtra(InterfaceC1357q.f53976zwy, false)) {
                abstractC6946kM6709b.b8(false);
                abstractC6946kM6709b.t8iq(2);
            }
            abstractC6946kM6709b.bap7(this, false);
            abstractC6946kM6709b.gbni(this);
            for (int i2 = 0; i2 < listYqrt.size(); i2++) {
                C1625k c1625k2 = listYqrt.get(i2);
                AbstractC0096k.g gVarCdj = abstractC6946kM6709b.gvn7().cdj(c1625k2.f9337k);
                String str2 = "tag-" + i2;
                this.f9330a.add(str2);
                abstractC6946kM6709b.was(str2, gVarCdj, c1625k2.f57348toq, c1625k2.f57349zy, c1625k2.f9338q);
                ((C1582h) abstractC6946kM6709b.w831(i2)).cyoe(c1625k2.f57349zy);
            }
            abstractC6946kM6709b.ix(listYqrt.size() - 1);
            int iZ4 = z4();
            if (iZ4 >= listYqrt.size()) {
                iZ4 = 0;
            }
            Fragment fragmentW831 = abstractC6946kM6709b.w831(iZ4);
            if (fragmentW831 instanceof C1582h) {
                this.f9333e = iZ4;
                C1582h c1582h = (C1582h) fragmentW831;
                this.f9334j = c1582h;
                c1582h.nnh(true);
            }
            abstractC6946kM6709b.mo172u(iZ4);
        }
        if (abstractC6946kM6709b != null && this.f9330a.size() > 1) {
            abstractC6946kM6709b.ew(false);
        }
        this.f9331b = w831();
        ktq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.putStringArrayList(f9329x, this.f9330a);
        super.onSaveInstanceState(outState);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        SearchableInfo searchableInfo = ((SearchManager) getSystemService(C2656k.f15718s)).getSearchableInfo(getComponentName());
        if (searchableInfo == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setComponent(searchableInfo.getSearchActivity());
        startActivityForResult(intent, 1);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k.f7l8
    /* JADX INFO: renamed from: p */
    public void mo201p(AbstractC0096k.g tab, androidx.fragment.app.o1t ft) {
    }

    @Override // com.android.thememanager.v9.InterfaceC2873s
    /* JADX INFO: renamed from: r */
    public void mo6477r(String type) {
    }

    @Override // com.android.thememanager.activity.kja0
    protected final int r8s8() {
        return 0;
    }

    protected boolean se() {
        return false;
    }

    @Override // com.android.thememanager.v9.InterfaceC2873s
    public void t8r(int color) {
        bz2(color);
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void toq(int position) {
        int i2 = this.f9333e;
        if (position == i2) {
            return;
        }
        if (i2 > -1) {
            cfr(i2, false);
        }
        this.f9333e = position;
        cfr(position, true);
    }

    public void uj2j(View.OnClickListener listener, @zy.nn86 int accessibilityRes, @zy.fn3e int drawableResId) {
        if (C1807g.zurt()) {
            return;
        }
        ImageView imageView = new ImageView(this);
        imageView.setOnClickListener(listener);
        imageView.setBackgroundResource(drawableResId);
        C1812k.m7106k(imageView, accessibilityRes);
        m6709b().ij(imageView);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: v */
    public void mo6478v(String title) {
        if (TextUtils.isEmpty(this.f9331b)) {
            m6709b().mo173v(title);
        }
    }

    @Override // com.android.thememanager.activity.kja0
    protected com.android.thememanager.fu4 v0af() {
        Iterator<String> it = this.f9330a.iterator();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        while (it.hasNext()) {
            Fragment fragmentNmn5 = supportFragmentManager.nmn5(it.next());
            if (fragmentNmn5 instanceof C1582h) {
                C1582h c1582h = (C1582h) fragmentNmn5;
                if (c1582h.ps()) {
                    return c1582h.f9059l;
                }
            }
        }
        return super.v0af();
    }

    protected String w831() {
        int intExtra = getIntent().getIntExtra(InterfaceC1357q.f53857d2ok, -1);
        String stringExtra = intExtra == -1 ? getIntent().getStringExtra(InterfaceC1357q.f53866eqxt) : getString(intExtra);
        return stringExtra == null ? this.f9137r.getResourceTitle() : stringExtra;
    }

    protected abstract List<C1625k> yqrt();

    @Override // androidx.appcompat.app.AbstractC0096k.f7l8
    /* JADX INFO: renamed from: z */
    public void mo202z(AbstractC0096k.g tab, androidx.fragment.app.o1t ft) {
    }

    protected int z4() {
        return 0;
    }

    protected void zkd() {
    }
}
