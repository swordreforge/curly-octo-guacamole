package com.android.thememanager.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.util.gc3c;
import ek5k.C6002g;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import miui.os.Build;
import miuix.view.InterfaceC7387s;
import org.json.JSONObject;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: WallpaperListBatchHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class wvg extends com.android.thememanager.util.t8r {

    /* JADX INFO: renamed from: g */
    private C1582h f15919g;

    /* JADX INFO: renamed from: h */
    private boolean f15920h;

    /* JADX INFO: renamed from: n */
    private ActivityC0891q f15923n;

    /* JADX INFO: renamed from: p */
    private InterfaceC7387s f15924p;

    /* JADX INFO: renamed from: r */
    private boolean f15925r;

    /* JADX INFO: renamed from: s */
    private o1t f15926s;

    /* JADX INFO: renamed from: t */
    private int f15927t;

    /* JADX INFO: renamed from: y */
    private final boolean f15928y;

    /* JADX INFO: renamed from: z */
    private boolean f15929z;

    /* JADX INFO: renamed from: i */
    private boolean f15921i = false;

    /* JADX INFO: renamed from: l */
    private Set<Integer> f15922l = new HashSet();

    /* JADX INFO: renamed from: f */
    private ActionMode.Callback f15918f = new ActionModeCallbackC2685k();

    /* JADX INFO: renamed from: com.android.thememanager.settings.wvg$k */
    /* JADX INFO: compiled from: WallpaperListBatchHandler.java */
    class ActionModeCallbackC2685k implements ActionMode.Callback {
        ActionModeCallbackC2685k() {
        }

        /* JADX INFO: renamed from: k */
        private void m9374k(Menu menu) {
            if (menu.findItem(R.string.resource_delete) == null) {
                menu.add(0, R.string.resource_delete, 0, R.string.resource_delete).setIcon(R.drawable.action_icon_delete);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return wvg.this.fn3e(mode, item);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            m9374k(menu);
            wvg.this.f15924p = (InterfaceC7387s) mode;
            wvg.this.fu4();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            wvg.this.f15924p = null;
            wvg.this.mo9372s();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: compiled from: WallpaperListBatchHandler.java */
    private static class toq extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private miuix.appcompat.app.dd f15931k;

        /* JADX INFO: renamed from: q */
        private Set<Integer> f15932q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<wvg> f61017toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<Activity> f61018zy;

        public toq(wvg handler, Activity activity) {
            this.f61017toq = new WeakReference<>(handler);
            this.f61018zy = new WeakReference<>(activity);
            this.f15932q = handler.f15922l;
        }

        /* JADX INFO: renamed from: k */
        private boolean m9375k(wvg handler) {
            Object obj;
            ArrayList arrayList = new ArrayList(this.f15932q.size());
            Iterator<Integer> it = this.f15932q.iterator();
            while (it.hasNext()) {
                String onlineId = handler.f15926s.jk().get(it.next().intValue()).getOnlineId();
                if (!TextUtils.isEmpty(onlineId)) {
                    arrayList.add(onlineId);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            try {
                Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(com.android.thememanager.controller.online.ld6.eqxt(strArr)));
                if (((Integer) pairKi.first).intValue() != 0 || (obj = pairKi.second) == null || !TextUtils.equals(((JSONObject) obj).optString("result", ""), "ok")) {
                    return false;
                }
                AbstractC1918k.toq(EnumC1933t.FAVORITE, false, strArr);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        private void toq(wvg wvgVar) {
            ArrayList<String> arrayList = new ArrayList(this.f15932q.size());
            Iterator<Integer> it = this.f15932q.iterator();
            while (it.hasNext()) {
                arrayList.add(wvgVar.f15926s.jk().get(it.next().intValue()).getContentPath());
            }
            C2687z.m9378h(arrayList, wvgVar.f15925r ? 1 : 0);
            for (String str : arrayList) {
                if (str.contains("wallpaper_history")) {
                    File file = new File(str);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
            if (Build.IS_TABLET) {
                for (String str2 : arrayList) {
                    if (str2.startsWith(C1788k.f10190z) || str2.startsWith(C1788k.f10173i)) {
                        File file2 = new File(str2);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                }
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            Activity activity = this.f61018zy.get();
            if (gc3c.cdj(activity)) {
                miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(activity);
                this.f15931k = ddVar;
                ddVar.y2(0);
                this.f15931k.n5r1(activity.getString(R.string.deleting));
                this.f15931k.setCancelable(false);
                this.f15931k.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            if (gc3c.cdj(this.f61018zy.get())) {
                this.f15931k.dismiss();
                wvg wvgVar = this.f61017toq.get();
                if (wvgVar == null) {
                    return;
                }
                if (result.booleanValue()) {
                    wvgVar.f15926s.d2ok(true);
                    wvgVar.mo9372s();
                } else if (wvgVar.f15927t == 12) {
                    nn86.m7150k(R.string.theme_favorite_delete_fail, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... Voids) {
            if (isCancelled()) {
                return Boolean.FALSE;
            }
            wvg wvgVar = this.f61017toq.get();
            if (wvgVar == null) {
                return Boolean.FALSE;
            }
            if (wvgVar.f15927t != 8) {
                return wvgVar.f15927t == 12 ? Boolean.valueOf(m9375k(wvgVar)) : Boolean.FALSE;
            }
            toq(wvgVar);
            return Boolean.TRUE;
        }
    }

    public wvg(C1582h fragment, o1t adapter, int category, boolean isVideo, boolean editable) {
        this.f15919g = fragment;
        ActivityC0891q activity = fragment.getActivity();
        this.f15923n = activity;
        this.f15926s = adapter;
        this.f15927t = category;
        this.f15925r = isVideo;
        this.f15920h = editable;
        this.f15928y = C1819o.d2ok(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fn3e(ActionMode mode, MenuItem item) {
        if (item.getItemId() == 16908313) {
            mo9372s();
        } else {
            if (item.getItemId() == 16908314) {
                if (this.f15929z) {
                    for (int i2 = 0; i2 < this.f15926s.jk().size(); i2++) {
                        this.f15922l.add(Integer.valueOf(i2));
                    }
                } else {
                    this.f15922l.clear();
                }
                Iterator<View> it = this.f15926s.oc().iterator();
                while (it.hasNext()) {
                    ni7(it.next());
                }
                fu4();
            } else if (item.getItemId() == R.string.resource_delete) {
                if (this.f15922l.size() == 0) {
                    nn86.m7150k(R.string.resource_tip_select_none, 0);
                    return true;
                }
                m9369h();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private void m9369h() {
        new toq(this, this.f15923n).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    private void ni7(View v2) {
        Pair pair;
        if (v2 == null || (pair = (Pair) v2.getTag()) == null) {
            return;
        }
        boolean z2 = this.f15921i && this.f15922l.contains(pair.first);
        boolean z3 = this.f15921i;
        CheckBox checkBox = (CheckBox) v2.findViewById(android.R.id.checkbox);
        if (checkBox != null) {
            checkBox.setVisibility(z3 ? 0 : 8);
            checkBox.setChecked(z2);
        }
        View viewFindViewById = v2.findViewById(R.id.thumbnail);
        if (viewFindViewById != null) {
            viewFindViewById.setSelected(z2);
        }
    }

    public boolean cdj(int position) {
        if (!this.f15920h || this.f15926s.jk().isEmpty()) {
            return false;
        }
        this.f15921i = true;
        if (position >= 0 && position < this.f15926s.jk().size()) {
            this.f15922l.add(Integer.valueOf(position));
        }
        this.f15923n.startActionMode(this.f15918f);
        Iterator<View> it = this.f15926s.oc().iterator();
        while (it.hasNext()) {
            ni7(it.next());
        }
        return true;
    }

    public void fu4() {
        if (this.f15921i) {
            if (com.android.thememanager.util.fti.f61240zy) {
                this.f15924p.cdj(16908313, "", this.f15928y ? R.drawable.miuix_appcompat_action_mode_title_button_cancel_dark : R.drawable.miuix_appcompat_action_mode_title_button_cancel_light);
            }
            boolean z2 = this.f15922l.size() != this.f15926s.jk().size();
            this.f15929z = z2;
            this.f15924p.cdj(16908314, "", z2 ? this.f15928y ? R.drawable.miuix_appcompat_action_mode_title_button_select_all_dark : R.drawable.miuix_appcompat_action_mode_title_button_select_all_light : this.f15928y ? R.drawable.miuix_appcompat_action_mode_title_button_deselect_all_dark : R.drawable.miuix_appcompat_action_mode_title_button_deselect_all_light);
            ((ActionMode) this.f15924p).setTitle(String.format(this.f15923n.getResources().getQuantityString(R.plurals.miuix_appcompat_items_selected, 1), Integer.valueOf(this.f15922l.size())));
        }
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: g */
    protected void mo9371g(View v2) {
        Pair pair = (Pair) v2.getTag();
        if (pair == null) {
            return;
        }
        if (this.f15921i) {
            if (this.f15922l.contains(pair.first)) {
                this.f15922l.remove(pair.first);
            } else {
                this.f15922l.add((Integer) pair.first);
            }
            if (this.f15922l.isEmpty()) {
                mo9372s();
                return;
            } else {
                fu4();
                ni7(v2);
                return;
            }
        }
        List<Resource> listJk = this.f15926s.jk();
        if (this.f15923n.getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false)) {
            com.android.thememanager.x2.f17856k.m10531k().mo8412k(listJk.get(((Integer) pair.first).intValue()), this.f15925r, this.f15923n);
            return;
        }
        if (this.f15925r) {
            Resource resource = listJk.get(((Integer) pair.first).intValue());
            if (resource.getContentPath() == null) {
                resource.getOnlinePath();
            }
            Intent intentT8r = com.android.thememanager.v9.f7l8.t8r(this.f15923n, VideoInfoUtils.fromResourceList(listJk), ((Integer) pair.first).intValue());
            com.android.thememanager.basemodule.analysis.f7l8.m6612q(intentT8r, com.android.thememanager.basemodule.analysis.toq.nr0);
            com.android.thememanager.basemodule.analysis.f7l8.zy(intentT8r, "personalize");
            this.f15923n.startActivity(intentT8r);
        } else {
            Intent intentMcp = com.android.thememanager.toq.mcp(this.f15923n, listJk, com.android.thememanager.basemodule.analysis.toq.npjo);
            intentMcp.putExtra(InterfaceC1357q.f53879gvn7, (Serializable) pair.first);
            this.f15923n.startActivity(intentMcp);
        }
        this.f15919g.d8wk(jp0y.fu4(this.f15926s.jk(), ((Integer) pair.first).intValue(), this.f15927t, this.f15925r), null);
    }

    public void ki(View v2, int position) {
        super.zy(v2, new Pair<>(Integer.valueOf(position), 0));
        ni7(v2);
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: s */
    public void mo9372s() {
        if (this.f15921i) {
            this.f15921i = false;
            Object obj = this.f15924p;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            this.f15922l.clear();
            Iterator<View> it = this.f15926s.oc().iterator();
            while (it.hasNext()) {
                ni7(it.next());
            }
        }
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: y */
    protected boolean mo9373y(View v2) {
        Pair pair = (Pair) v2.getTag();
        if (pair == null) {
            return false;
        }
        return cdj(((Integer) pair.first).intValue());
    }
}
