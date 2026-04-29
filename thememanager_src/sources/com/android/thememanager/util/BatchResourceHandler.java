package com.android.thememanager.util;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeSettingsActivity;
import com.android.thememanager.activity.nsb;
import com.android.thememanager.activity.pc;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.detail.theme.util.C1976k;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.t8r;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import miuix.appcompat.app.ki;
import miuix.view.InterfaceC7387s;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class BatchResourceHandler extends t8r implements InterfaceC1755y, InterfaceC0928g, InterfaceC1357q {

    /* JADX INFO: renamed from: f */
    private f7l8 f16225f;

    /* JADX INFO: renamed from: g */
    protected nsb f16226g;

    /* JADX INFO: renamed from: h */
    protected InterfaceC7387s f16227h;

    /* JADX INFO: renamed from: i */
    private boolean f16228i;

    /* JADX INFO: renamed from: n */
    protected ActivityC0891q f16230n;

    /* JADX INFO: renamed from: p */
    protected com.android.thememanager.controller.x2 f16231p;

    /* JADX INFO: renamed from: r */
    protected boolean f16232r;

    /* JADX INFO: renamed from: s */
    protected com.android.thememanager.fu4 f16233s;

    /* JADX INFO: renamed from: t */
    protected boolean f16234t;

    /* JADX INFO: renamed from: y */
    protected pc f16235y;

    /* JADX INFO: renamed from: z */
    protected Set<String> f16236z = new HashSet();

    /* JADX INFO: renamed from: l */
    protected int f16229l = 0;

    /* JADX INFO: renamed from: c */
    private ActionMode.Callback f16224c = new ActionModeCallbackC2741k();

    public interface f7l8 {
        /* JADX INFO: renamed from: h */
        void mo6399h();

        void x2();
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandler$g */
    public static class AsyncTaskC2740g extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private miuix.appcompat.app.dd f16237k;

        /* JADX INFO: renamed from: n */
        private List<Resource> f16238n;

        /* JADX INFO: renamed from: q */
        private com.android.thememanager.controller.x2 f16239q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f61171toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<BatchResourceHandler> f61172zy;

        public AsyncTaskC2740g(BatchResourceHandler handler, boolean inLocalResourcePage, List<Resource> list) {
            this.f61171toq = inLocalResourcePage;
            this.f61172zy = new WeakReference<>(handler);
            this.f16239q = handler.f16231p;
            this.f16238n = list;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            this.f16239q.m7690k().jp0y(this.f16238n);
            Iterator<Resource> it = this.f16238n.iterator();
            while (it.hasNext()) {
                C1976k.m7741y().n7h(it.next().getProductId(), false);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            if (!this.f61171toq) {
                cancel(false);
                return;
            }
            BatchResourceHandler batchResourceHandler = this.f61172zy.get();
            if (batchResourceHandler != null) {
                miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(batchResourceHandler.f16230n);
                this.f16237k = ddVar;
                ddVar.y2(0);
                this.f16237k.n5r1(batchResourceHandler.f16230n.getString(R.string.deleting));
                this.f16237k.setCancelable(false);
                this.f16237k.show();
            }
            C1976k.m7741y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            BatchResourceHandler batchResourceHandler = this.f61172zy.get();
            if (batchResourceHandler == null || !gc3c.cdj(batchResourceHandler.f16230n)) {
                return;
            }
            batchResourceHandler.f16235y.fu4(false);
            batchResourceHandler.mo9372s();
            this.f16237k.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandler$k */
    class ActionModeCallbackC2741k implements ActionMode.Callback {
        ActionModeCallbackC2741k() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return BatchResourceHandler.this.o1t(mode, item);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            BatchResourceHandler batchResourceHandler = BatchResourceHandler.this;
            batchResourceHandler.x2(menu, batchResourceHandler.f16229l);
            BatchResourceHandler batchResourceHandler2 = BatchResourceHandler.this;
            batchResourceHandler2.f16227h = (InterfaceC7387s) mode;
            batchResourceHandler2.m9555r();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            BatchResourceHandler batchResourceHandler = BatchResourceHandler.this;
            batchResourceHandler.f16227h = null;
            batchResourceHandler.mo9372s();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandler$n */
    class RunnableC2742n implements Runnable {
        RunnableC2742n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BatchResourceHandler.this.mo9372s();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandler$q */
    class C2743q implements t8r.zy {
        C2743q() {
        }

        @Override // com.android.thememanager.util.t8r.zy
        /* JADX INFO: renamed from: k */
        public void mo9559k(Resource r2) {
            BatchResourceHandler.this.cdj(r2);
        }
    }

    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            BatchResourceHandler.this.m9550h();
        }
    }

    class zy implements t8r.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f16244k;

        zy(final List val$rs) {
            this.f16244k = val$rs;
        }

        @Override // com.android.thememanager.util.t8r.zy
        /* JADX INFO: renamed from: k */
        public void mo9559k(Resource r2) {
            this.f16244k.add(r2);
        }
    }

    public BatchResourceHandler(nsb fragment, pc adapter, com.android.thememanager.fu4 resContext) {
        if (fragment == null || adapter == null) {
            throw new IllegalArgumentException("BatchResourceOperationHandler() parameters can not be null!");
        }
        this.f16226g = fragment;
        this.f16230n = fragment.getActivity();
        this.f16235y = adapter;
        this.f16233s = resContext;
    }

    private void d2ok(View v2) {
        Pair<Integer, Integer> pair;
        if (ld6() && (pair = (Pair) v2.getTag()) != null) {
            Resource resourceNi7 = ni7(pair);
            boolean z2 = this.f16228i && this.f16236z.contains(fu4(resourceNi7));
            boolean z3 = this.f16228i && mo9552k(resourceNi7);
            CheckBox checkBox = (CheckBox) v2.findViewById(android.R.id.checkbox);
            if (checkBox != null) {
                checkBox.setVisibility(z3 ? 0 : 8);
                checkBox.setChecked(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m9550h() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        ArrayList arrayList = new ArrayList();
        mo9553n(new zy(arrayList));
        new AsyncTaskC2740g(this, this.f16234t, arrayList).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    private void ki() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        mo9553n(new C2743q());
    }

    protected void cdj(Resource r2) {
        C2082k.zy().m8000g().m8436q(r2, this.f16233s);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@zy.lvui InterfaceC0954z owner) {
    }

    protected void fn3e(View v2, Pair<Integer, Integer> position) {
        this.f16228i = true;
        this.f16236z.add(fu4(ni7(position)));
        this.f16230n.startActionMode(this.f16224c);
        Button button = (Button) this.f16230n.findViewById(16908313);
        Button button2 = (Button) this.f16230n.findViewById(16908314);
        C1812k.m7106k(button, android.R.string.cancel);
        C1812k.m7106k(button2, android.R.string.selectAll);
        this.f16235y.notifyDataSetChanged();
        f7l8 f7l8Var = this.f16225f;
        if (f7l8Var != null) {
            f7l8Var.x2();
        }
    }

    protected String fu4(Resource r2) {
        return (this.f16234t || r2.getOnlineId() == null) ? r2.getLocalId() : r2.getOnlineId();
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: g */
    protected void mo9371g(View v2) {
        Pair<Integer, Integer> pair = (Pair) v2.getTag();
        if (pair == null) {
            return;
        }
        if (!this.f16228i) {
            lvui(pair);
            return;
        }
        Resource resourceNi7 = ni7(pair);
        if (!mo9552k(resourceNi7)) {
            this.f16230n.getString(R.string.resource_system_title);
            com.android.thememanager.basemodule.utils.nn86.toq(this.f16230n.getString(R.string.resource_can_not_selected, this.f16234t ? TextUtils.equals(this.f16233s.getCurrentUsingPath(), new ResourceResolver(resourceNi7, this.f16233s).getMetaPath()) ? this.f16230n.getString(R.string.resource_current_using_title) : this.f16230n.getString(R.string.resource_system_title) : this.f16230n.getString(R.string.resource_downloaded_title)), 0);
            return;
        }
        if (this.f16236z.contains(fu4(resourceNi7))) {
            this.f16236z.remove(fu4(resourceNi7));
        } else {
            this.f16236z.add(fu4(resourceNi7));
        }
        d2ok(v2);
        if (this.f16236z.isEmpty()) {
            v2.postDelayed(new RunnableC2742n(), 300L);
        } else {
            m9555r();
        }
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadComplete(String downloadPath, String assemblyId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
        if (downloadSuccess) {
            this.f16235y.fu4(false);
        } else {
            com.android.thememanager.basemodule.utils.nn86.toq(this.f16230n.getResources().getString(R.string.download_failed) + ":" + downloadFailCode, 0);
        }
        this.f16235y.notifyDataSetChanged();
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
    }

    public void jk(com.android.thememanager.controller.x2 resController) {
        this.f16231p = resController;
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: k */
    public boolean mo9552k(Resource r2) {
        if (C1902k.bq.equals(r2.getLocalId()) || C1902k.ac.equals(r2.getLocalId()) || C1902k.sok(r2.getLocalId())) {
            return false;
        }
        return (this.f16234t && n7h(r2)) || (!this.f16234t && kja0(r2)) || (!this.f16234t && qrj(r2));
    }

    protected boolean kja0(Resource r2) {
        return (!this.f16231p.m7690k().mo7478t(r2) || this.f16231p.m7690k().mcp(r2)) && !C2082k.zy().m8000g().n7h(r2);
    }

    protected boolean ld6() {
        return false;
    }

    protected void lvui(Pair<Integer, Integer> position) {
        this.f16226g.qh4d(position);
    }

    public void mcp(f7l8 editActionModeCallback) {
        this.f16225f = editActionModeCallback;
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: n */
    public void mo9553n(t8r.zy callback) {
        for (int i2 = 0; i2 < this.f16235y.qrj().size(); i2++) {
            for (Resource resource : this.f16235y.qrj().get(i2)) {
                if (this.f16236z.contains(fu4(resource)) && callback != null) {
                    callback.mo9559k(resource);
                }
            }
        }
    }

    protected boolean n7h(Resource r2) {
        String metaPath = new ResourceResolver(r2, this.f16233s).getMetaPath();
        return (TextUtils.isEmpty(metaPath) || ch.vyq(metaPath) || ch.n5r1(metaPath) || !this.f16231p.m7690k().mo7478t(r2) || TextUtils.equals(metaPath, this.f16233s.getCurrentUsingPath())) ? false : true;
    }

    protected Resource ni7(Pair<Integer, Integer> position) {
        if (position == null) {
            return null;
        }
        try {
            return this.f16235y.ld6(((Integer) position.first).intValue(), ((Integer) position.second).intValue());
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    protected boolean o1t(ActionMode mode, MenuItem item) {
        if (item.getItemId() == 16908313) {
            mo9372s();
        } else {
            if (item.getItemId() == 16908314) {
                if (this.f16232r) {
                    for (int i2 = 0; i2 < this.f16235y.qrj().size(); i2++) {
                        for (Resource resource : this.f16235y.qrj().get(i2)) {
                            if (mo9552k(resource)) {
                                this.f16236z.add(fu4(resource));
                            }
                        }
                    }
                } else {
                    this.f16236z.clear();
                }
                this.f16235y.notifyDataSetChanged();
                m9555r();
            } else if (item.getItemId() == R.string.resource_delete) {
                if (this.f16236z.isEmpty()) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_tip_select_none, 0);
                } else {
                    new ki.C6947k(this.f16230n).m25039i(android.R.attr.alertDialogIcon).m25050z(this.f16230n.getString(R.string.resource_delete_all, Integer.valueOf(this.f16236z.size()))).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new toq()).hb();
                }
            } else if (item.getItemId() == R.string.resource_download) {
                ki();
            }
        }
        return true;
    }

    public void oc(int sourceType) {
        this.f16234t = sourceType == 1;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: q */
    public boolean mo9554q() {
        return this.f16228i;
    }

    protected boolean qrj(Resource r2) {
        return true;
    }

    /* JADX INFO: renamed from: r */
    protected void m9555r() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16235y.qrj().size(); i3++) {
            Iterator<Resource> it = this.f16235y.qrj().get(i3).iterator();
            while (it.hasNext()) {
                if (mo9552k(it.next())) {
                    i2++;
                }
            }
        }
        if (fti.f61240zy) {
            this.f16227h.cdj(16908313, "", R.drawable.action_title_cancel);
        }
        boolean z2 = this.f16236z.size() != i2;
        this.f16232r = z2;
        gc3c.zurt(this.f16227h, z2);
        ((ActionMode) this.f16227h).setTitle(String.format(this.f16230n.getResources().getQuantityString(R.plurals.miuix_appcompat_items_selected, 1), Integer.valueOf(this.f16236z.size())));
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: s */
    public void mo9372s() {
        if (this.f16228i) {
            this.f16228i = false;
            Object obj = this.f16227h;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            this.f16236z.clear();
            this.f16235y.notifyDataSetChanged();
        }
        f7l8 f7l8Var = this.f16225f;
        if (f7l8Var != null) {
            f7l8Var.mo6399h();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m9556t(int flag) {
        this.f16229l = flag;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@zy.lvui InterfaceC0954z owner) {
        C2082k.zy().m8000g().zy(this);
    }

    @Override // com.android.thememanager.util.t8r
    public void toq() {
    }

    public void wvg() {
        this.f16235y.mo6466n();
        this.f16235y.m6691z(false);
    }

    protected void x2(Menu menu, int actionFlag) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (((1 << i2) & actionFlag) != 0) {
                int i3 = zurt.f16942y[i2];
                menu.add(0, i3, 0, i3).setIcon(zurt.f16941s[i2]);
            }
        }
    }

    @Override // com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: y */
    protected boolean mo9373y(View v2) {
        Pair<Integer, Integer> pair;
        if ((this.f16230n instanceof ThemeSettingsActivity) || (pair = (Pair) v2.getTag()) == null) {
            return false;
        }
        if (!((this.f16234t && this.f16235y.fn3e()) ? false : true) || this.f16228i || !mo9552k(ni7(pair)) || !ld6()) {
            return false;
        }
        fn3e(v2, pair);
        return true;
    }

    /* JADX INFO: renamed from: z */
    protected boolean m9557z(Resource r2) {
        return C2082k.zy().m8000g().n7h(r2);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@zy.lvui InterfaceC0954z owner) {
        C2082k.zy().m8000g().t8r(this);
    }

    @Override // com.android.thememanager.util.t8r
    public void zy(View v2, Pair<Integer, Integer> position) {
        super.zy(v2, position);
        d2ok(v2);
    }
}
