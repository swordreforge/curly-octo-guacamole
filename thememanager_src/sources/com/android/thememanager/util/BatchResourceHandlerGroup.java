package com.android.thememanager.util;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.C2082k;
import com.android.thememanager.activity.pc;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.t8r;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import miuix.view.InterfaceC7387s;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class BatchResourceHandlerGroup implements zurt {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected Activity f61177ld6;

    /* JADX INFO: renamed from: p */
    protected Fragment f16246p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected InterfaceC7387s f61179qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected zp f61181x2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f61178n7h = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected Set<String> f61176kja0 = new HashSet();

    /* JADX INFO: renamed from: h */
    protected boolean f16245h = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected int f61174cdj = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected ArrayList<GroupItemBatchResourceHandler> f61175ki = new ArrayList<>();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private ActionMode.Callback f61180t8r = new ActionModeCallbackC2745k();

    public class GroupItemBatchResourceHandler extends t8r implements InterfaceC0928g, InterfaceC1755y, InterfaceC1357q {

        /* JADX INFO: renamed from: g */
        protected com.android.thememanager.fu4 f16247g;

        /* JADX INFO: renamed from: n */
        protected pc f16249n;

        /* JADX INFO: renamed from: p */
        protected Bundle f16250p;

        /* JADX INFO: renamed from: s */
        protected boolean f16251s;

        /* JADX INFO: renamed from: y */
        protected com.android.thememanager.controller.x2 f16252y;

        /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandlerGroup$GroupItemBatchResourceHandler$k */
        class C2744k implements t8r.zy {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ List f16253k;

            C2744k(final List val$rs) {
                this.f16253k = val$rs;
            }

            @Override // com.android.thememanager.util.t8r.zy
            /* JADX INFO: renamed from: k */
            public void mo9559k(Resource r2) {
                this.f16253k.add(r2);
            }
        }

        class toq implements t8r.zy {
            toq() {
            }

            @Override // com.android.thememanager.util.t8r.zy
            /* JADX INFO: renamed from: k */
            public void mo9559k(Resource r2) {
                GroupItemBatchResourceHandler.this.ki(r2);
            }
        }

        public GroupItemBatchResourceHandler(pc adapter, com.android.thememanager.fu4 resContext, Bundle data) {
            this.f16249n = adapter;
            this.f16247g = resContext;
            this.f16250p = data;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cdj() {
            if (this.f16251s) {
                ArrayList arrayList = new ArrayList();
                mo9553n(new C2744k(arrayList));
                this.f16252y.m7690k().jp0y(arrayList);
            }
        }

        private void dd(View v2) {
            boolean z2;
            if (x2()) {
                boolean zQrj = BatchResourceHandlerGroup.this.f61178n7h;
                Pair<Integer, Integer> pair = (Pair) v2.getTag();
                if (pair != null) {
                    Resource resourceFu4 = fu4(pair);
                    z2 = BatchResourceHandlerGroup.this.f61178n7h && BatchResourceHandlerGroup.this.f61176kja0.contains(m9572z(resourceFu4));
                    zQrj &= qrj(resourceFu4);
                } else {
                    z2 = false;
                }
                CheckBox checkBox = (CheckBox) v2.findViewById(R.id.checkbox);
                if (checkBox != null) {
                    checkBox.setVisibility(zQrj ? 0 : 8);
                    checkBox.setChecked(z2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn3e() {
            if (this.f16251s) {
                return;
            }
            mo9553n(new toq());
        }

        public void d2ok() {
            this.f16249n.mo6466n();
            this.f16249n.m6691z(false);
        }

        @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
        public void f7l8(@zy.lvui InterfaceC0954z owner) {
        }

        protected Resource fu4(Pair<Integer, Integer> position) {
            if (position == null) {
                return null;
            }
            try {
                return this.f16249n.ld6(((Integer) position.first).intValue(), ((Integer) position.second).intValue());
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }

        @Override // com.android.thememanager.util.t8r
        /* JADX INFO: renamed from: g */
        protected void mo9371g(View v2) {
            Pair<Integer, Integer> pair = (Pair) v2.getTag();
            if (pair == null) {
                return;
            }
            if (!BatchResourceHandlerGroup.this.f61178n7h) {
                C2082k.zy().qrj(this.f16249n.qrj());
                BatchResourceHandlerGroup.this.f61181x2.m10102k(this.f16247g, pair, fu4(pair), this.f16250p);
                return;
            }
            Resource resourceFu4 = fu4(pair);
            if (!qrj(resourceFu4)) {
                com.android.thememanager.basemodule.utils.nn86.toq(BatchResourceHandlerGroup.this.f61177ld6.getString(com.android.thememanager.R.string.resource_can_not_selected, this.f16251s ? TextUtils.equals(this.f16247g.getCurrentUsingPath(), new ResourceResolver(resourceFu4, this.f16247g).getMetaPath()) ? BatchResourceHandlerGroup.this.f61177ld6.getString(com.android.thememanager.R.string.resource_current_using_title) : BatchResourceHandlerGroup.this.f61177ld6.getString(com.android.thememanager.R.string.resource_system_title) : BatchResourceHandlerGroup.this.f61177ld6.getString(com.android.thememanager.R.string.resource_downloaded_title)), 0);
                return;
            }
            if (BatchResourceHandlerGroup.this.f61176kja0.contains(m9572z(resourceFu4))) {
                BatchResourceHandlerGroup.this.f61176kja0.remove(m9572z(resourceFu4));
            } else {
                BatchResourceHandlerGroup.this.f61176kja0.add(m9572z(resourceFu4));
            }
            if (BatchResourceHandlerGroup.this.f61176kja0.isEmpty()) {
                mo9372s();
            } else {
                dd(v2);
                BatchResourceHandlerGroup.this.ki();
            }
        }

        /* JADX INFO: renamed from: h */
        protected boolean m9569h(Resource r2) {
            return (!this.f16252y.m7690k().mo7478t(r2) || this.f16252y.m7690k().mcp(r2)) && !C2082k.zy().m8000g().n7h(r2);
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadComplete(String downloadPath, String assemblyId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
            if (downloadSuccess) {
                this.f16249n.fu4(false);
            } else {
                for (int i2 = 0; i2 < this.f16249n.qrj().size(); i2++) {
                    Iterator<Resource> it = this.f16249n.qrj().get(i2).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (TextUtils.equals(assemblyId, it.next().getAssemblyId())) {
                            com.android.thememanager.basemodule.utils.nn86.toq(BatchResourceHandlerGroup.this.f61177ld6.getResources().getString(com.android.thememanager.R.string.download_failed) + ":" + downloadFailCode, 0);
                            break;
                        }
                    }
                }
            }
            this.f16249n.notifyDataSetChanged();
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
        }

        @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
        public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
        }

        public void jk() {
            if (BatchResourceHandlerGroup.this.f16245h) {
                for (int i2 = 0; i2 < this.f16249n.qrj().size(); i2++) {
                    for (Resource resource : this.f16249n.qrj().get(i2)) {
                        if (qrj(resource)) {
                            BatchResourceHandlerGroup.this.f61176kja0.add(m9572z(resource));
                        }
                    }
                }
            }
            this.f16249n.notifyDataSetChanged();
        }

        protected void ki(Resource r2) {
            C2082k.zy().m8000g().m8436q(r2, this.f16247g);
        }

        protected boolean kja0(Resource r2) {
            String metaPath = new ResourceResolver(r2, this.f16247g).getMetaPath();
            return (TextUtils.isEmpty(metaPath) || ch.vyq(metaPath) || ch.n5r1(metaPath) || !this.f16252y.m7690k().mo7478t(r2) || TextUtils.equals(metaPath, this.f16247g.getCurrentUsingPath())) ? false : true;
        }

        public void lvui(com.android.thememanager.controller.x2 resController) {
            this.f16252y = resController;
        }

        public void mcp() {
            this.f16249n.notifyDataSetChanged();
        }

        @Override // com.android.thememanager.util.t8r
        /* JADX INFO: renamed from: n */
        public void mo9553n(t8r.zy callback) {
            for (int i2 = 0; i2 < this.f16249n.qrj().size(); i2++) {
                for (Resource resource : this.f16249n.qrj().get(i2)) {
                    if (BatchResourceHandlerGroup.this.f61176kja0.contains(m9572z(resource)) && callback != null) {
                        callback.mo9559k(resource);
                    }
                }
            }
        }

        protected boolean n7h(Resource r2) {
            return true;
        }

        protected void ni7(View v2, Pair<Integer, Integer> position) {
            if (BatchResourceHandlerGroup.this.f61178n7h) {
                return;
            }
            BatchResourceHandlerGroup.this.f61178n7h = true;
            BatchResourceHandlerGroup.this.f61176kja0.add(m9572z(fu4(position)));
            BatchResourceHandlerGroup batchResourceHandlerGroup = BatchResourceHandlerGroup.this;
            batchResourceHandlerGroup.f61177ld6.startActionMode(batchResourceHandlerGroup.f61180t8r);
            BatchResourceHandlerGroup.this.m9566s();
        }

        public int o1t() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f16249n.qrj().size(); i3++) {
                Iterator<Resource> it = this.f16249n.qrj().get(i3).iterator();
                while (it.hasNext()) {
                    if (qrj(it.next())) {
                        i2++;
                    }
                }
            }
            return i2;
        }

        public void oc() {
            this.f16249n.fu4(false);
        }

        @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
        public void onDestroy(@zy.lvui InterfaceC0954z owner) {
        }

        @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
        public void onStop(@zy.lvui InterfaceC0954z owner) {
        }

        @Override // com.android.thememanager.util.t8r
        /* JADX INFO: renamed from: q */
        public boolean mo9554q() {
            return BatchResourceHandlerGroup.this.f61178n7h;
        }

        protected boolean qrj(Resource r2) {
            if (C1902k.bq.equals(r2.getLocalId()) || C1902k.ac.equals(r2.getLocalId()) || C1902k.sok(r2.getLocalId())) {
                return false;
            }
            return (this.f16251s && kja0(r2)) || (!this.f16251s && m9569h(r2)) || (!this.f16251s && n7h(r2));
        }

        /* JADX INFO: renamed from: r */
        public void m9570r(int sourceType) {
            this.f16251s = sourceType == 1;
        }

        @Override // com.android.thememanager.util.t8r
        /* JADX INFO: renamed from: s */
        public void mo9372s() {
            BatchResourceHandlerGroup.this.m9567y();
        }

        /* JADX INFO: renamed from: t */
        protected boolean m9571t(Resource r2) {
            return C2082k.zy().m8000g().n7h(r2);
        }

        @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
        public void t8r(@zy.lvui InterfaceC0954z owner) {
            C2082k.zy().m8000g().zy(this);
        }

        public void wvg() {
            C2082k.zy().m8000g().zy(this);
        }

        protected boolean x2() {
            return false;
        }

        @Override // com.android.thememanager.util.t8r
        /* JADX INFO: renamed from: y */
        protected boolean mo9373y(View v2) {
            Pair<Integer, Integer> pair = (Pair) v2.getTag();
            if (pair == null) {
                return false;
            }
            if (!((this.f16251s && this.f16249n.fn3e()) ? false : true) || BatchResourceHandlerGroup.this.f61178n7h || !qrj(fu4(pair)) || !x2()) {
                return false;
            }
            ni7(v2, pair);
            return true;
        }

        /* JADX INFO: renamed from: z */
        protected String m9572z(Resource r2) {
            return (this.f16251s || r2.getOnlineId() == null) ? r2.getLocalId() : r2.getOnlineId();
        }

        @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
        public void zurt(@zy.lvui InterfaceC0954z owner) {
            C2082k.zy().m8000g().t8r(this);
            BatchResourceHandlerGroup.this.m9567y();
        }

        @Override // com.android.thememanager.util.t8r
        public void zy(View v2, Pair<Integer, Integer> position) {
            super.zy(v2, position);
            dd(v2);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandlerGroup$k */
    class ActionModeCallbackC2745k implements ActionMode.Callback {
        ActionModeCallbackC2745k() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            BatchResourceHandlerGroup.this.x2(mode, item);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            BatchResourceHandlerGroup batchResourceHandlerGroup = BatchResourceHandlerGroup.this;
            batchResourceHandlerGroup.m9565g(menu, batchResourceHandlerGroup.f61174cdj);
            BatchResourceHandlerGroup batchResourceHandlerGroup2 = BatchResourceHandlerGroup.this;
            batchResourceHandlerGroup2.f61179qrj = (InterfaceC7387s) mode;
            batchResourceHandlerGroup2.ki();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            BatchResourceHandlerGroup batchResourceHandlerGroup = BatchResourceHandlerGroup.this;
            batchResourceHandlerGroup.f61179qrj = null;
            batchResourceHandlerGroup.m9567y();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.BatchResourceHandlerGroup$q */
    public static class AsyncTaskC2746q extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private WeakReference<BatchResourceHandlerGroup> f16256k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ArrayList<GroupItemBatchResourceHandler> f61183toq;

        public AsyncTaskC2746q(BatchResourceHandlerGroup group, ArrayList<GroupItemBatchResourceHandler> handlers) {
            this.f16256k = new WeakReference<>(group);
            this.f61183toq = handlers;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            Iterator<GroupItemBatchResourceHandler> it = this.f61183toq.iterator();
            while (it.hasNext()) {
                it.next().fn3e();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            BatchResourceHandlerGroup batchResourceHandlerGroup = this.f16256k.get();
            if (batchResourceHandlerGroup == null || !gc3c.cdj(batchResourceHandlerGroup.f61177ld6)) {
                return;
            }
            batchResourceHandlerGroup.m9566s();
            batchResourceHandlerGroup.m9567y();
        }
    }

    class toq implements DialogInterface.OnClickListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            BatchResourceHandlerGroup.this.n7h();
        }
    }

    public static class zy extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private miuix.appcompat.app.dd f16258k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<BatchResourceHandlerGroup> f61184toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ArrayList<GroupItemBatchResourceHandler> f61185zy;

        public zy(BatchResourceHandlerGroup group, ArrayList<GroupItemBatchResourceHandler> handlers) {
            this.f61184toq = new WeakReference<>(group);
            this.f61185zy = handlers;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            Iterator<GroupItemBatchResourceHandler> it = this.f61185zy.iterator();
            while (it.hasNext()) {
                it.next().cdj();
            }
            return null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            Activity activity;
            BatchResourceHandlerGroup batchResourceHandlerGroup = this.f61184toq.get();
            if (batchResourceHandlerGroup == null || (activity = batchResourceHandlerGroup.f61177ld6) == null || activity.isFinishing()) {
                return;
            }
            miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(batchResourceHandlerGroup.f61177ld6);
            this.f16258k = ddVar;
            ddVar.y2(0);
            this.f16258k.n5r1(batchResourceHandlerGroup.f61177ld6.getString(com.android.thememanager.R.string.deleting));
            this.f16258k.setCancelable(false);
            this.f16258k.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            BatchResourceHandlerGroup batchResourceHandlerGroup = this.f61184toq.get();
            if (batchResourceHandlerGroup == null || !gc3c.cdj(batchResourceHandlerGroup.f61177ld6)) {
                return;
            }
            batchResourceHandlerGroup.m9563p();
            batchResourceHandlerGroup.m9567y();
            this.f16258k.dismiss();
        }
    }

    public BatchResourceHandlerGroup(Fragment fragment, zp delegate) {
        this.f16246p = fragment;
        this.f61177ld6 = fragment.getActivity();
        this.f61181x2 = delegate;
    }

    /* JADX INFO: renamed from: h */
    private void m9560h() {
        if (this.f16245h) {
            Iterator<GroupItemBatchResourceHandler> it = this.f61175ki.iterator();
            while (it.hasNext()) {
                it.next().jk();
            }
        } else {
            this.f61176kja0.clear();
            m9566s();
        }
        ki();
    }

    private void kja0() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        if (this.f61176kja0.isEmpty()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(com.android.thememanager.R.string.resource_tip_select_none, 0);
        } else {
            new AsyncTaskC2746q(this, this.f61175ki).executeOnExecutor(C6002g.n7h(), new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        new zy(this, this.f61175ki).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m9563p() {
        Iterator<GroupItemBatchResourceHandler> it = this.f61175ki.iterator();
        while (it.hasNext()) {
            it.next().oc();
        }
    }

    private void qrj() {
        if (this.f61176kja0.isEmpty()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(com.android.thememanager.R.string.resource_tip_select_none, 0);
        } else {
            new DialogInterfaceC0102q.k(this.f61177ld6).f7l8(R.attr.alertDialogIcon).x2(this.f61177ld6.getString(com.android.thememanager.R.string.resource_delete_all, Integer.valueOf(this.f61176kja0.size()))).setNegativeButton(R.string.cancel, null).setPositiveButton(R.string.ok, new toq()).d3();
        }
    }

    public void cdj(int flag) {
        this.f61174cdj = flag;
    }

    public GroupItemBatchResourceHandler f7l8(pc adapter, com.android.thememanager.fu4 resContext, Bundle data) {
        GroupItemBatchResourceHandler groupItemBatchResourceHandler = new GroupItemBatchResourceHandler(adapter, resContext, data);
        this.f61175ki.add(groupItemBatchResourceHandler);
        return groupItemBatchResourceHandler;
    }

    /* JADX INFO: renamed from: g */
    protected void m9565g(Menu menu, int actionFlag) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (((1 << i2) & actionFlag) != 0) {
                int i3 = zurt.f16942y[i2];
                menu.add(0, i3, 0, i3).setIcon(zurt.f16941s[i2]);
            }
        }
    }

    protected void ki() {
        Iterator<GroupItemBatchResourceHandler> it = this.f61175ki.iterator();
        int iO1t = 0;
        while (it.hasNext()) {
            iO1t += it.next().o1t();
        }
        if (fti.f61240zy) {
            this.f61179qrj.cdj(16908313, "", com.android.thememanager.R.drawable.action_title_cancel);
        }
        boolean z2 = this.f61176kja0.size() != iO1t;
        this.f16245h = z2;
        gc3c.zurt(this.f61179qrj, z2);
        ((ActionMode) this.f61179qrj).setTitle(String.format(this.f61177ld6.getResources().getQuantityString(com.android.thememanager.R.plurals.miuix_appcompat_items_selected, 1), Integer.valueOf(this.f61176kja0.size())));
    }

    protected void ld6() {
        Iterator<GroupItemBatchResourceHandler> it = this.f61175ki.iterator();
        while (it.hasNext()) {
            it.next().d2ok();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m9566s() {
        Iterator<GroupItemBatchResourceHandler> it = this.f61175ki.iterator();
        while (it.hasNext()) {
            it.next().mcp();
        }
    }

    protected boolean x2(ActionMode mode, MenuItem item) {
        if (item.getItemId() == 16908313) {
            m9567y();
            return true;
        }
        if (item.getItemId() == 16908314) {
            m9560h();
            return true;
        }
        if (item.getItemId() == com.android.thememanager.R.string.resource_delete) {
            qrj();
            return true;
        }
        if (item.getItemId() != com.android.thememanager.R.string.resource_download) {
            return true;
        }
        kja0();
        return true;
    }

    /* JADX INFO: renamed from: y */
    protected void m9567y() {
        if (this.f61178n7h) {
            this.f61178n7h = false;
            Object obj = this.f61179qrj;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            this.f61176kja0.clear();
            m9566s();
        }
    }
}
