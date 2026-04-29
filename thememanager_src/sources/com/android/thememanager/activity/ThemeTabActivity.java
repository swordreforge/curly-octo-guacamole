package com.android.thememanager.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.activity.t8r;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.h5.f7l8;
import com.android.thememanager.h5.toq;
import com.android.thememanager.mine.setting.view.fragment.C2202k;
import com.android.thememanager.miuixcompat.AsyncTaskC2208n;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.search.ThemeSearchActivity;
import com.android.thememanager.util.C2755a;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import miui.os.Build;
import miuix.appcompat.app.AbstractC6946k;
import org.json.JSONArray;
import org.json.JSONObject;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes.dex */
public class ThemeTabActivity extends t8r implements InterfaceC1357q, InterfaceC1925p, p001b.f7l8 {
    public static final String ac = "ringExtra";
    public static boolean ad = true;
    public static boolean am = false;
    private static final String as = "isDarkButton";
    public static final String ax = "purchase_account";
    public static final String az = "pageType";
    public static final String ba = "account";
    private static final String bg = "isImmersive";
    private static final String bl = "ThemeTabActivity";
    public static final String bq = "reward_account";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f57278ab;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected String f57279bo;
    private Handler bp;
    private String bv;

    /* JADX INFO: renamed from: d */
    private String f8880d;

    /* JADX INFO: renamed from: u */
    protected List<PageGroup> f8881u;

    /* JADX INFO: renamed from: v */
    protected String f8882v;

    /* JADX INFO: renamed from: w */
    private boolean f8883w;
    public androidx.lifecycle.fti<Integer> bb = new androidx.lifecycle.fti<>();
    private View.OnClickListener an = new ViewOnClickListenerC1553k();
    private f7l8.zy id = new toq();
    private p000a.zy in = new C1554n();

    /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeTabActivity$k */
    class ViewOnClickListenerC1553k implements View.OnClickListener {
        ViewOnClickListenerC1553k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ThemeTabActivity.this.onSearchRequested();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeTabActivity$n */
    class C1554n implements p000a.zy {
        C1554n() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ThemeTabActivity.this, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ThemeTabActivity$q */
    class C1555q implements androidx.lifecycle.jp0y<Integer> {
        C1555q() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Integer newColor) {
            ThemeTabActivity.this.vep5(newColor.intValue());
        }
    }

    class toq implements f7l8.zy {
        toq() {
        }

        @Override // com.android.thememanager.h5.f7l8.zy
        /* JADX INFO: renamed from: k */
        public void mo6362k() {
            ThemeTabActivity themeTabActivity = ThemeTabActivity.this;
            if (themeTabActivity.f9336o) {
                themeTabActivity.recreate();
            }
        }
    }

    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Bundle f8888k;

        zy(final Bundle val$savedInstanceState) {
            this.f8888k = val$savedInstanceState;
        }

        @Override // java.lang.Runnable
        public void run() {
            ThemeTabActivity.this.m6711e(this.f8888k);
        }
    }

    private boolean nsb() {
        boolean zEquals = "fonts".equals(getIntent().getStringExtra("REQUEST_RESOURCE_CODE"));
        String strQrj = com.android.thememanager.basemodule.analysis.f7l8.qrj(getIntent());
        return zEquals && (!TextUtils.isEmpty(strQrj) && strQrj.endsWith("com.android.settings"));
    }

    private boolean zwy() {
        String action = getIntent().getAction();
        return "android.intent.action.RINGTONE_PICKER".equals(action) || C2965z.f17864k.equals(action);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return (this.f9336o && this.f8881u.size() == 1) ? com.android.thememanager.basemodule.analysis.toq.z3jl : super.mo6345a();
    }

    protected List<PageGroup> bek6() {
        ArrayList arrayList = new ArrayList();
        PageGroup pageGroupM7965q = com.android.thememanager.h5.toq.m7965q(C2082k.zy().toq(), this.f9137r);
        if (pageGroupM7965q != null) {
            arrayList.add(pageGroupM7965q);
        }
        return arrayList;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean bo() {
        return zwy();
    }

    protected t8r.C1625k cv06(PageGroup group) {
        Iterator<Page> it = group.getPages().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key != null && key.endsWith(InterfaceC1925p.rax)) {
                this.f57278ab = true;
                group.setResourceCode(p001b.toq.m5744q(key.substring(0, key.length() - 5)));
                return yl(group);
            }
        }
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent.hasExtra(InterfaceC1357q.f53922nn86)) {
            bundle.putInt(InterfaceC1357q.f53922nn86, intent.getIntExtra(InterfaceC1357q.f53922nn86, 0));
        }
        if (intent.hasExtra(InterfaceC1357q.f53873fu4)) {
            bundle.putInt(InterfaceC1357q.f53873fu4, intent.getIntExtra(InterfaceC1357q.f53873fu4, 1));
        }
        if (intent.hasExtra(InterfaceC1357q.f53955vyq)) {
            bundle.putInt(InterfaceC1357q.f53955vyq, intent.getIntExtra(InterfaceC1357q.f53955vyq, 0));
        }
        if (intent.hasExtra(InterfaceC1357q.f53883hb)) {
            bundle.putBoolean(InterfaceC1357q.f53883hb, intent.getBooleanExtra(InterfaceC1357q.f53883hb, false));
        }
        if (intent.hasExtra(InterfaceC1357q.f53966y9n)) {
            bundle.putSerializable(InterfaceC1357q.f53966y9n, intent.getSerializableExtra(InterfaceC1357q.f53966y9n));
        }
        if (intent.hasExtra(InterfaceC1357q.f53911mbx)) {
            bundle.putString(InterfaceC1357q.f53911mbx, intent.getStringExtra(InterfaceC1357q.f53911mbx));
        }
        int intExtra = intent.getIntExtra(InterfaceC1357q.f53949uv6, 0);
        if (group.getPageGroupType() == 1) {
            intExtra = 4;
        }
        n2t(bundle);
        return h7am(group, jbh(intExtra), false, bundle);
    }

    public void ebn(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap map = (HashMap) intent.getSerializableExtra(ac);
            if (map == null) {
                return;
            }
            for (String str : map.keySet()) {
                if (TextUtils.equals(str, com.android.thememanager.basemodule.analysis.toq.c7g)) {
                    Object obj = map.get(com.android.thememanager.basemodule.analysis.toq.c7g);
                    if (obj instanceof List) {
                        jSONObject.put(com.android.thememanager.basemodule.analysis.toq.c7g, new JSONArray(((List) obj).toArray()));
                    }
                } else {
                    jSONObject.put(str, map.get(str));
                }
            }
            this.bv = jSONObject.toString();
        } catch (Exception e2) {
            Log.w(bl, "init ring parameter fail " + e2);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.analysis.f7l8.InterfaceC1696k
    /* JADX INFO: renamed from: f */
    public String mo6320f() {
        Intent intent = getIntent();
        String action = intent.getAction();
        return "miui.intent.action.PICK_GADGET".equals(action) ? "clock".equals(intent.getStringExtra("REQUEST_GADGET_NAME")) ? com.android.thememanager.basemodule.analysis.toq.t4 : com.android.thememanager.basemodule.analysis.toq.gai : "miui.intent.action.PICK_RESOURCE".equals(action) ? "alarmscreen".equals(this.f9137r.getResourceCode()) ? com.android.thememanager.basemodule.analysis.toq.b1 : com.android.thememanager.basemodule.analysis.toq.lbeq : super.mo6320f();
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        if (se()) {
            i9jn();
        }
    }

    protected t8r.C1625k h7am(PageGroup group, Class<? extends Fragment> clazz, boolean hasActionMenu, Bundle info) {
        if (info == null) {
            info = new Bundle();
        }
        info.putSerializable(InterfaceC1357q.f53848bf2, group);
        info.putString(InterfaceC1357q.f53927oc, this.f57279bo);
        Intent intent = getIntent();
        if (intent.hasExtra(InterfaceC1357q.f53954vy)) {
            info.putBoolean(InterfaceC1357q.f53954vy, intent.getBooleanExtra(InterfaceC1357q.f53954vy, false));
        }
        return new t8r.C1625k(group.getTitle(), clazz, info, hasActionMenu);
    }

    protected boolean ixz() {
        List<PageGroup> list = this.f8881u;
        return (list == null || list.isEmpty()) ? false : true;
    }

    protected Class<? extends Fragment> jbh(int fragmentType) {
        return bap7.m6389k(fragmentType);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return t8iq() ? C1807g.lvui() ? 0 : 1 : super.mo6344m();
    }

    public String mbx() {
        return this.f8880d;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean mu() {
        if (C1807g.m7081r()) {
            return false;
        }
        return super.mu();
    }

    protected void n2t(Bundle args) {
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null || TextUtils.isEmpty(data.getStringExtra("RESPONSE_PICKED_RESOURCE"))) {
            return;
        }
        setResult(resultCode, data);
        if (C1807g.m7081r()) {
            return;
        }
        finish();
    }

    @Override // com.android.thememanager.activity.t8r, com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        if (C1807g.lvui()) {
            Handler handler = new Handler();
            this.bp = handler;
            handler.postDelayed(new zy(savedInstanceState), 600L);
        } else {
            m6711e(savedInstanceState);
        }
        com.android.thememanager.util.py.m9954q(getIntent());
        List<PageGroup> list = (List) getIntent().getSerializableExtra(InterfaceC1357q.f53865ek5k);
        this.f8881u = list;
        if (list != null && !list.isEmpty()) {
            this.f8883w = true;
        }
        this.f57279bo = getIntent().getStringExtra(InterfaceC1357q.f53927oc);
        this.f8880d = getIntent().getStringExtra(az);
        sok();
        C2082k.zy().m8001n().ld6(this.f9137r).m7690k().mo7670n(this.f9137r);
        ukdy();
        if (ad) {
            this.bb.cdj(1);
        } else {
            this.bb.cdj(0);
        }
        this.bb.m4391p(this, new C1555q());
        com.android.thememanager.h5.toq toqVarQrj = com.android.thememanager.h5.f7l8.ld6().qrj();
        List<PageGroup> list2 = this.f8881u;
        if (list2 == null || list2.isEmpty()) {
            toq.C2071k c2071kM7968s = toqVarQrj.m7968s(this.f9137r.getResourceStamp());
            if (c2071kM7968s != null) {
                getIntent().putExtra(InterfaceC1357q.f53969yz, c2071kM7968s.toq());
                ArrayList arrayList = new ArrayList();
                this.f8881u = arrayList;
                arrayList.addAll(c2071kM7968s.zy());
            }
            List<PageGroup> list3 = this.f8881u;
            if (list3 == null || list3.isEmpty()) {
                this.f8881u = bek6();
            }
        }
        super.onCreate(savedInstanceState);
        if (Build.IS_TABLET) {
            m6709b().b8(true);
        } else if (com.android.thememanager.basemodule.utils.toq.m7224q(this.f9137r.getResourceCode())) {
            if (this.f9335m == 1) {
                if (getIntent().getIntExtra("category_type", -1) != 0 && !this.f57278ab && !pc()) {
                    uj2j(this.an, R.string.accessibiliy_description_content_search, C1819o.jp0y());
                }
            } else if (toqVarQrj.x2()) {
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(C1819o.jp0y());
                imageView.setOnClickListener(this.an);
                C1812k.m7106k(imageView, R.string.accessibiliy_description_content_search);
                setActionBarRightMenu(imageView);
            }
        }
        if (isFinishing()) {
            return;
        }
        new AsyncTaskC2208n(this, null, false).executeOnExecutor(C6002g.ld6(), new Void[0]);
        com.android.thememanager.util.g1.mu(this, this.f9137r.getResourceCode());
        ebn(getIntent());
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        if (this.bb.m4392s()) {
            this.bb.kja0(new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.vy
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    this.f9362k.vep5(((Integer) obj).intValue());
                }
            });
        }
        Handler handler = this.bp;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.bp = null;
        }
        super.onDestroy();
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @zy.lvui MenuItem item) {
        if (item.getItemId() == 16908332 && "theme".equals(com.android.thememanager.basemodule.analysis.f7l8.m6607g())) {
            onBackPressed();
            return true;
        }
        if (pc()) {
            Intent intent = new Intent();
            intent.putExtra(az, mbx());
            setResult(0, intent);
        }
        return super.onMenuItemSelected(featureId, item);
    }

    @Override // com.android.thememanager.activity.t8r, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(com.android.thememanager.basemodule.analysis.toq.c4k8, this.f8882v);
        super.onSaveInstanceState(outState);
    }

    @Override // com.android.thememanager.activity.t8r, android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        if (!nsb()) {
            return super.onSearchRequested();
        }
        Intent intent = new Intent(this, (Class<?>) ThemeSearchActivity.class);
        intent.putExtra("REQUEST_RESOURCE_CODE", "fonts");
        Intent intent2 = new Intent();
        intent2.setAction(ThemeResourceProxyTabActivity.bl);
        intent2.setPackage(bf2.toq.toq().getPackageName());
        intent2.putExtra("EXTRA_TAB_ID", "fonts");
        startActivities(new Intent[]{intent2, intent});
        return true;
    }

    public boolean pc() {
        String str = this.f8880d;
        return str != null && str.contains("account");
    }

    public void pjz9(String result) {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(result);
            String strOptString = jSONObject.optString("master_id");
            int iOptInt = jSONObject.optInt("order_result", -1);
            int iOptInt2 = jSONObject.optInt("set_result", -1);
            HashMap map = (HashMap) intent.getSerializableExtra(ac);
            String stringExtra = intent.getStringExtra("uuid");
            if (map != null) {
                if (map.containsKey(com.android.thememanager.basemodule.analysis.toq.c7g)) {
                    map.put(com.android.thememanager.basemodule.analysis.toq.fpn, map.remove(com.android.thememanager.basemodule.analysis.toq.c7g));
                }
                map.put("content", stringExtra);
                map.put("master_id", strOptString);
                map.put("order_result", Integer.valueOf(iOptInt));
                map.put("set_result", Integer.valueOf(iOptInt2));
                C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.ybb, map);
                Log.d(bl, "track Color Ring Data success ");
            }
        } catch (Exception e2) {
            Log.e(bl, "track Color Ring Data fail error: " + e2);
        }
    }

    @Override // com.android.thememanager.activity.t8r
    protected boolean se() {
        String resourceCode = this.f9137r.getResourceCode();
        return com.android.thememanager.util.bwp.jk(resourceCode) || com.android.thememanager.util.bwp.ni7(resourceCode) || com.android.thememanager.util.bwp.fn3e(resourceCode);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    public boolean t8iq() {
        return com.android.thememanager.basemodule.utils.o1t.ld6(getIntent());
    }

    protected Class<? extends Fragment> uc() {
        if (nsb()) {
            return C2202k.class;
        }
        return getIntent().getBooleanExtra(p001b.f7l8.sb1e, false) || p001b.f7l8.f53794le7.equals(getIntent().getAction()) ? ktq.class : com.android.thememanager.util.bwp.ld6(this.f9137r.getResourceCode());
    }

    protected void ukdy() {
    }

    public void vep5(int colorCode) {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        getWindow().getDecorView().setSystemUiVisibility(colorCode == 1 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public String wx16() {
        return this.bv;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected void y2(int newMode) {
        if (!zwy() || newMode < 1) {
            return;
        }
        recreate();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        if (!C1807g.lvui()) {
            super.y9n(agree);
        }
        if (agree) {
            com.android.thememanager.basemodule.utils.lvui.qrj(this, this.in);
        }
    }

    protected t8r.C1625k yl(PageGroup group) {
        return h7am(group, uc(), InterfaceC1789q.gx2z.equals(this.f9137r.getResourceCode()), new Bundle());
    }

    @Override // com.android.thememanager.activity.t8r
    protected List<t8r.C1625k> yqrt() {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (ixz() && this.f9137r != null) {
            boolean z3 = true;
            for (PageGroup pageGroup : this.f8881u) {
                if (!pageGroup.getPages().isEmpty() || pageGroup.getPageGroupType() != 0) {
                    t8r.C1625k c1625kCv06 = cv06(pageGroup);
                    try {
                        Uri uri = Uri.parse(pageGroup.getUrl());
                        boolean zEquals = uri.getQueryParameter(bg).equals("true");
                        am = zEquals;
                        if (zEquals) {
                            ad = false;
                            ad = uri.getQueryParameter(as).equals("true");
                        }
                    } catch (Exception unused) {
                        Log.d(bl, "Param isDarkMode/isImmersive not in url");
                    }
                    if (z3 && !this.f8883w) {
                        Iterator<Page> it = pageGroup.getPages().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (String.format(InterfaceC1925p.vx4g, this.f9137r.getResourceStamp()).equals(it.next().getKey())) {
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            c1625kCv06.f57349zy.putBoolean(InterfaceC1357q.f53871fnq8, true);
                        }
                    }
                    if (!getString(R.string.wallpaper_dynamic).equals(c1625kCv06.f9337k) || !com.android.thememanager.basemodule.utils.qrj.zy(qrj.toq.VIDEO_WALLPAPER)) {
                        arrayList.add(c1625kCv06);
                        z3 = false;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.android.thememanager.activity.t8r
    protected int z4() {
        if (ixz()) {
            return getIntent().getIntExtra(InterfaceC1357q.f53969yz, 0);
        }
        Log.e(C2755a.f16307g, "getDefaultVisibleTabIndex should have PageData");
        return super.z4();
    }

    @Override // com.android.thememanager.activity.t8r
    protected void zkd() {
        if (!am && !pc()) {
            if (com.android.thememanager.basemodule.utils.o1t.kja0() && t8iq()) {
                return;
            }
            super.zkd();
            return;
        }
        requestExtraWindowFeature(9);
        AbstractC6946k abstractC6946kM6709b = m6709b();
        abstractC6946kM6709b.hb(true);
        abstractC6946kM6709b.mcp();
        am = false;
        ad = true;
    }
}
