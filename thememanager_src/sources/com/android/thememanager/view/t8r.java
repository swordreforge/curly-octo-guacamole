package com.android.thememanager.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.gc3c;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.miuixbasewidget.widget.MessageView;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: LocalOperationViewHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r implements com.android.thememanager.basemodule.resource.constants.toq, InterfaceC1357q, com.android.thememanager.basemodule.analysis.ld6 {

    /* JADX INFO: renamed from: g */
    private MessageView f17689g;

    /* JADX INFO: renamed from: k */
    private WeakReference<Activity> f17691k;

    /* JADX INFO: renamed from: n */
    private com.android.thememanager.controller.x2 f17692n;

    /* JADX INFO: renamed from: q */
    private com.android.thememanager.fu4 f17694q;

    /* JADX INFO: renamed from: s */
    private List<Resource> f17695s;

    /* JADX INFO: renamed from: y */
    private toq f17696y;

    /* JADX INFO: renamed from: p */
    private boolean f17693p = false;

    /* JADX INFO: renamed from: h */
    private View.OnClickListener f17690h = new ViewOnClickListenerC2941k();

    /* JADX INFO: renamed from: com.android.thememanager.view.t8r$k */
    /* JADX INFO: compiled from: LocalOperationViewHelper.java */
    class ViewOnClickListenerC2941k implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.view.t8r$k$k */
        /* JADX INFO: compiled from: LocalOperationViewHelper.java */
        class k implements C1688q.n {
            k() {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
                Activity activity = (Activity) t8r.this.f17691k.get();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                    ch.yz(activity);
                } else {
                    nn86.m7150k(R.string.fail_to_add_account, 0);
                }
                Log.i(C2755a.f16307g, "fail to login");
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                t8r.this.m10434p();
            }
        }

        ViewOnClickListenerC2941k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            Context context = (Context) t8r.this.f17691k.get();
            if (context == null) {
                return;
            }
            if (t8r.this.f17693p) {
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.putExtra(com.android.thememanager.basemodule.utils.cdj.f10286n, context.getPackageName());
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            if (t8r.this.f17695s == null) {
                return;
            }
            k kVar = new k();
            Activity activity = (Activity) t8r.this.f17691k.get();
            if (activity != null) {
                C1688q.cdj().fti(activity, kVar);
            }
        }
    }

    /* JADX INFO: compiled from: LocalOperationViewHelper.java */
    private static class toq extends AsyncTask<Void, Void, List<Resource>> {

        /* JADX INFO: renamed from: k */
        int f17699k;

        /* JADX INFO: renamed from: q */
        private com.android.thememanager.controller.x2 f17700q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f61546toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<t8r> f61547zy;

        public toq(t8r helper) {
            this.f61547zy = new WeakReference<>(helper);
            this.f17700q = helper.f17692n;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<Resource> doInBackground(Void... params) {
            ArrayList arrayList = new ArrayList();
            this.f17699k = 0;
            this.f61546toq = 0;
            int iX2 = this.f17700q.m7690k().x2();
            this.f17699k = iX2;
            if (iX2 > 0) {
                for (Object obj : this.f17700q.m7690k().kja0().toArray()) {
                    Resource resource = (Resource) obj;
                    if (C2082k.zy().m8000g().kja0(resource) || C2082k.zy().f7l8().jk(resource)) {
                        this.f61546toq++;
                    }
                    arrayList.add(resource);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<Resource> result) {
            t8r t8rVar = this.f61547zy.get();
            if (t8rVar == null) {
                return;
            }
            t8rVar.cdj(this.f61546toq, this.f17699k);
            t8rVar.f17696y = null;
            t8rVar.f17695s = result;
        }
    }

    public t8r(Activity context, com.android.thememanager.fu4 resContext, com.android.thememanager.controller.x2 resController) {
        this.f17691k = new WeakReference<>(context);
        this.f17694q = resContext;
        this.f17692n = resController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj(int updatingNum, int oldNum) {
        kja0(8);
        if (oldNum > 0) {
            kja0(0);
            Activity activity = this.f17691k.get();
            if (activity == null) {
                return;
            }
            if (updatingNum > oldNum / 2) {
                this.f17693p = true;
                String string = activity.getString(R.string.theme_batch_updating_text, Integer.valueOf(oldNum));
                if ("aod".equals(this.f17694q.getResourceCode())) {
                    string = activity.getResources().getQuantityString(R.plurals.aod_batch_updating_text, oldNum, Integer.valueOf(oldNum));
                } else if ("icons".equals(this.f17694q.getResourceCode())) {
                    string = activity.getResources().getQuantityString(R.plurals.icon_batch_updating_text, oldNum, Integer.valueOf(oldNum));
                } else if ("largeicons".equals(this.f17694q.getResourceCode())) {
                    string = activity.getResources().getQuantityString(R.plurals.large_icon_batch_updating_text, oldNum, Integer.valueOf(oldNum));
                }
                this.f17689g.setMessage(string);
                return;
            }
            this.f17693p = false;
            int i2 = R.plurals.theme_batch_has_update_text;
            if ("aod".equals(this.f17694q.getResourceCode())) {
                i2 = R.plurals.aod_batch_has_update_text;
            } else if ("icons".equals(this.f17694q.getResourceCode())) {
                i2 = R.plurals.icon_batch_has_update_text;
            } else if ("largeicons".equals(this.f17694q.getResourceCode())) {
                i2 = R.plurals.large_icon_batch_has_update_text;
            }
            this.f17689g.setMessage(activity.getResources().getQuantityString(i2, oldNum, Integer.valueOf(oldNum)));
        }
    }

    /* JADX INFO: renamed from: h */
    private void m10431h() {
        toq toqVar = this.f17696y;
        if (toqVar != null) {
            toqVar.cancel(true);
        }
        toq toqVar2 = new toq(this);
        this.f17696y = toqVar2;
        toqVar2.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    private void kja0(int visibility) {
        this.f17689g.setVisibility(visibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m10434p() {
        Activity activity = this.f17691k.get();
        if (gc3c.cdj(activity)) {
            String strM9744h = g1.m9744h(null);
            ArrayList arrayList = new ArrayList();
            com.android.thememanager.controller.ld6 ld6VarM7690k = this.f17692n.m7690k();
            com.android.thememanager.o1t o1tVarM8000g = C2082k.zy().m8000g();
            for (Resource resource : this.f17695s) {
                if (ld6VarM7690k.mo7478t(resource) && ld6VarM7690k.mcp(resource) && !o1tVarM8000g.kja0(resource)) {
                    if (strM9744h == null || !strM9744h.equals(resource.getLocalId())) {
                        arrayList.add(resource);
                    } else {
                        arrayList.add(0, resource);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                kja0(8);
            } else {
                ThemeSchedulerService.ki(activity, this.f17694q.getResourceCode(), arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qrj(List list) throws Throwable {
        com.android.thememanager.o1t o1tVarM8000g = C2082k.zy().m8000g();
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f9808n = true;
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.wvka;
        c1711k.f57497zy = "";
        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Resource resource = (Resource) it.next();
            if (!o1tVarM8000g.n7h(resource)) {
                o1tVarM8000g.m8431g(resource, this.f17694q, c1711k, false);
            }
        }
    }

    public int ld6() {
        MessageView messageView = this.f17689g;
        if (messageView != null) {
            return messageView.getVisibility();
        }
        return 8;
    }

    public void n7h() {
        m10431h();
    }

    public View x2() {
        Activity activity = this.f17691k.get();
        if (activity == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.theme_oper_info_bar, (ViewGroup) null, false);
        MessageView messageView = (MessageView) viewInflate.findViewById(R.id.info_bar);
        this.f17689g = messageView;
        messageView.setOnClickListener(this.f17690h);
        C6077k.m22369i(this.f17689g);
        return viewInflate;
    }
}
