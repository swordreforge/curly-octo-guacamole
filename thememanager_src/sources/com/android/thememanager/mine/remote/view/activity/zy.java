package com.android.thememanager.mine.remote.view.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.google.gson.C4871g;
import java.util.ArrayList;
import miuix.appcompat.app.AbstractC6946k;
import miuix.viewpager.widget.ViewPager;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: compiled from: BaseRemoteResourceTabActivity.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zy extends AbstractActivityC1717k implements AbstractC6946k.k {

    /* JADX INFO: renamed from: j */
    public static final String f12846j = "tab_type";

    /* JADX INFO: renamed from: m */
    protected static final String f12847m = "REQUEST_HOME_INDEX";

    /* JADX INFO: renamed from: o */
    public static final String f12848o = "tab_page_name";

    /* JADX INFO: renamed from: c */
    private ActionMode f12849c;

    /* JADX INFO: renamed from: e */
    private Handler f12850e;

    /* JADX INFO: renamed from: f */
    protected String f12851f;

    /* JADX INFO: renamed from: r */
    protected ArrayList<C2184k> f12853r = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    protected int f12852l = -1;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.activity.zy$k */
    /* JADX INFO: compiled from: BaseRemoteResourceTabActivity.java */
    static class C2184k {

        /* JADX INFO: renamed from: k */
        String f12854k;

        /* JADX INFO: renamed from: q */
        Bundle f12855q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f60461toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Class<? extends Fragment> f60462zy;

        C2184k(String tag, String title, Class<? extends Fragment> fragmentCls, Bundle args) {
            this.f12854k = tag;
            this.f60461toq = title;
            this.f60462zy = fragmentCls;
            this.f12855q = args;
        }
    }

    private void i9jn(int position, boolean visible) {
        ((com.android.thememanager.basemodule.base.toq) m6709b().w831(position)).nnh(visible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0af(int i2) {
        if (this.f12852l == -1) {
            toq(i2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void d3(int i2, float v2, boolean b2, boolean b1) {
    }

    protected abstract void etdu();

    @Override // miuix.appcompat.app.AbstractC6946k.k
    /* JADX INFO: renamed from: k */
    public void mo6476k(int i2) {
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode mode) {
        super.onActionModeFinished(mode);
        View viewFindViewById = findViewById(R.id.view_pager);
        if (viewFindViewById instanceof ViewPager) {
            ((ViewPager) viewFindViewById).setDraggable(false);
        }
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        View viewFindViewById = findViewById(R.id.view_pager);
        if (viewFindViewById instanceof ViewPager) {
            ((ViewPager) viewFindViewById).setDraggable(false);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        appCompatActionBar.b8(false);
        int intExtra = getIntent().getIntExtra(InterfaceC1357q.f53857d2ok, -1);
        appCompatActionBar.mo173v(intExtra == -1 ? getIntent().getStringExtra(InterfaceC1357q.f53866eqxt) : getString(intExtra));
        appCompatActionBar.lh(this);
        appCompatActionBar.gbni(this);
        appCompatActionBar.cv06();
        this.f12853r.clear();
        etdu();
        for (C2184k c2184k : this.f12853r) {
            appCompatActionBar.was(c2184k.f12854k, appCompatActionBar.gvn7().cdj(c2184k.f60461toq).kja0(c2184k.f12854k), c2184k.f60462zy, c2184k.f12855q, false);
        }
        if (this.f12853r.size() < 1) {
            return;
        }
        appCompatActionBar.ix(this.f12853r.size() - 1);
        appCompatActionBar.ew(false);
        final int intExtra2 = getIntent().getIntExtra("REQUEST_HOME_INDEX", 0);
        appCompatActionBar.mo172u(intExtra2);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f12850e = handler;
        handler.post(new Runnable() { // from class: com.android.thememanager.mine.remote.view.activity.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f12844k.v0af(intExtra2);
            }
        });
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Handler handler = this.f12850e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@lvui MenuItem item) {
        Fragment fragmentW831 = m6709b().w831(this.f12852l);
        return fragmentW831 instanceof com.android.thememanager.mine.remote.view.fragment.zy ? ((com.android.thememanager.mine.remote.view.fragment.zy) fragmentW831).cn02(item) : super.onOptionsItemSelected(item);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.f12852l < 0) {
            return super.onPrepareOptionsMenu(menu);
        }
        AbstractC6946k abstractC6946kM6709b = m6709b();
        Fragment fragmentW831 = abstractC6946kM6709b.w831(this.f12852l);
        abstractC6946kM6709b.mo176z(this.f12852l);
        Log.i("ThemeRemote", "onPrepareOptionsMenu: " + this.f12852l);
        if (fragmentW831.getActivity() == null) {
            return super.onPrepareOptionsMenu(menu);
        }
        C2184k c2184k = this.f12853r.get(this.f12852l);
        String string = c2184k.f12855q.getString(f12846j);
        String string2 = c2184k.f12855q.getString(f12848o);
        com.android.thememanager.basemodule.model.flextab.toq toqVarM5740i = p001b.toq.m5740i(string);
        return ((fragmentW831 instanceof com.android.thememanager.mine.remote.view.fragment.zy) && (toqVarM5740i != null && toqVarM5740i.mo6877g(string2))) ? ((com.android.thememanager.mine.remote.view.fragment.zy) fragmentW831).ovdh(menu) : super.onPrepareOptionsMenu(menu);
    }

    protected abstract String r8s8();

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionMode actionModeStartActionMode = super.startActionMode(callback);
        this.f12849c = actionModeStartActionMode;
        return actionModeStartActionMode;
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void toq(int position) {
        int i2 = this.f12852l;
        if (position == i2) {
            return;
        }
        boolean z2 = false;
        if (i2 > -1) {
            i9jn(i2, false);
        }
        this.f12852l = position;
        i9jn(position, true);
        C2184k c2184k = this.f12853r.get(position);
        String string = c2184k.f12855q.getString(f12846j);
        String string2 = c2184k.f12855q.getString(f12848o);
        com.android.thememanager.basemodule.model.flextab.toq toqVarM5740i = p001b.toq.m5740i(string);
        if (toqVarM5740i != null && toqVarM5740i.mo6877g(string2)) {
            z2 = true;
        }
        setEndActionMenuEnabled(z2);
        ActionMode actionMode = this.f12849c;
        if (actionMode != null) {
            actionMode.finish();
            this.f12849c = null;
        }
        this.f9864s = string2;
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(this.f12851f);
        arrayMapZy.put("contentType", this.f12853r.get(position).f12854k);
        String stringExtra = getIntent().getStringExtra("REQUEST_RESOURCE_CODE");
        if (!TextUtils.isEmpty(stringExtra)) {
            arrayMapZy.put("resourceType", stringExtra);
        }
        d8wk(this.f12851f, new C4871g().o1t(arrayMapZy));
    }

    protected void was(String tag, int titleId, Class<? extends Fragment> fragmentCls, Bundle args) {
        zsr0(tag, getResources().getString(titleId), fragmentCls, args);
    }

    protected void zsr0(String tag, String title, Class<? extends Fragment> fragmentCls, Bundle args) {
        this.f12853r.add(new C2184k(tag, title, fragmentCls, args));
    }
}
