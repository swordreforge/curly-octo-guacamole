package com.android.thememanager.module.attention.presenter;

import android.os.AsyncTask;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.recommend.model.entity.element.DesignerElement;
import com.android.thememanager.recommend.model.entity.element.PlaceHolderElement;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.v9.model.AuthorAttentionDyncmicModel;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.List;
import v0af.zy;
import z4.C7796k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorAttentionPresenter implements zy.InterfaceC7703k {

    /* JADX INFO: renamed from: g */
    public int f13024g = 0;

    /* JADX INFO: renamed from: k */
    @dd
    private com.android.thememanager.module.attention.view.zy f13025k;

    /* JADX INFO: renamed from: n */
    private AsyncTask<String, Void, Boolean> f13026n;

    /* JADX INFO: renamed from: q */
    private AsyncTask<Integer, Void, C2218k> f13027q;

    /* JADX INFO: renamed from: com.android.thememanager.module.attention.presenter.AuthorAttentionPresenter$k */
    class AsyncTaskC2216k extends AsyncTask<Integer, Void, C2218k> {
        AsyncTaskC2216k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C2218k doInBackground(Integer... start) {
            AuthorAttentionDyncmicModel authorAttentionDyncmicModelZy = v0af.toq.zy(start[0].intValue());
            if (authorAttentionDyncmicModelZy == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long j2 = authorAttentionDyncmicModelZy.total;
            C2782h.f16520p = j2;
            if (j2 == 0) {
                arrayList.add(new PlaceHolderElement(94));
            }
            List<C7796k> list = authorAttentionDyncmicModelZy.userList;
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(new DesignerElement(list.get(i2), authorAttentionDyncmicModelZy.total));
            }
            AuthorAttentionPresenter.this.f13024g += list.size();
            return new C2218k(arrayList, authorAttentionDyncmicModelZy.total, authorAttentionDyncmicModelZy.hasMore);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(@dd C2218k result) {
            if (isCancelled() || AuthorAttentionPresenter.this.f13025k == null) {
                return;
            }
            AuthorAttentionPresenter.this.f13025k.pc(result);
        }
    }

    class toq extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f13029k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f60505toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ boolean f60506zy;

        toq(final String val$id, final String val$name, final boolean val$attention) {
            this.f13029k = val$id;
            this.f60505toq = val$name;
            this.f60506zy = val$attention;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... param) {
            Boolean boolM28098k = v0af.toq.m28098k(this.f13029k, this.f60505toq, this.f60506zy);
            if (boolM28098k == null || !boolM28098k.booleanValue()) {
                return null;
            }
            return Boolean.valueOf(this.f60506zy);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean aBoolean) {
            if (isCancelled() || AuthorAttentionPresenter.this.f13025k == null) {
                return;
            }
            AuthorAttentionPresenter.this.f13025k.b9ub(aBoolean);
        }
    }

    @Override // v0af.zy.InterfaceC7703k
    public void d3() {
        AsyncTask<Integer, Void, C2218k> asyncTask = this.f13027q;
        if (asyncTask != null) {
            asyncTask.cancel(false);
        }
        AsyncTaskC2216k asyncTaskC2216k = new AsyncTaskC2216k();
        this.f13027q = asyncTaskC2216k;
        asyncTaskC2216k.executeOnExecutor(C6002g.x2(), Integer.valueOf(this.f13024g));
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
        if (owner instanceof com.android.thememanager.module.attention.view.zy) {
            this.f13025k = (com.android.thememanager.module.attention.view.zy) owner;
            return;
        }
        throw new IllegalStateException("invalid owner/fragment! " + owner);
    }

    @Override // v0af.zy.InterfaceC7703k
    public void fti(boolean attention, String id, String name) {
        toq toqVar = new toq(id, name, attention);
        this.f13026n = toqVar;
        toqVar.executeOnExecutor(C6002g.n7h(), new String[0]);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        AsyncTask<Integer, Void, C2218k> asyncTask = this.f13027q;
        if (asyncTask != null) {
            asyncTask.cancel(false);
        }
        AsyncTask<String, Void, Boolean> asyncTask2 = this.f13026n;
        if (asyncTask2 != null) {
            asyncTask2.cancel(false);
        }
        this.f13025k = null;
    }

    @Override // v0af.zy.InterfaceC7703k
    public void wx16() {
        this.f13024g = 0;
    }
}
