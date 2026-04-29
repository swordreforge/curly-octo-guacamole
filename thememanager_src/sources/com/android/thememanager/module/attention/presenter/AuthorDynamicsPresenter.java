package com.android.thememanager.module.attention.presenter;

import android.os.AsyncTask;
import android.util.Log;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.module.attention.view.C2223q;
import com.android.thememanager.recommend.model.entity.element.FeedElement;
import com.android.thememanager.router.recommend.entity.Feed;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.v9.model.AuthorAttentionDyncmicModel;
import com.android.thememanager.v9.model.AuthorUICard;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v0af.toq;
import v0af.zy;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorDynamicsPresenter implements zy.InterfaceC8138zy {

    /* JADX INFO: renamed from: k */
    @dd
    private C2223q f13031k;

    /* JADX INFO: renamed from: n */
    private long f13032n = 0;

    /* JADX INFO: renamed from: q */
    private AsyncTask<Long, Void, C2218k> f13033q;

    /* JADX INFO: renamed from: com.android.thememanager.module.attention.presenter.AuthorDynamicsPresenter$k */
    class AsyncTaskC2217k extends AsyncTask<Long, Void, C2218k> {
        AsyncTaskC2217k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C2218k doInBackground(Long... times) {
            List<AuthorUICard> list;
            AuthorAttentionDyncmicModel qVar = toq.toq(times[0].longValue());
            if (qVar == null || (list = qVar.cards) == null || list.isEmpty()) {
                return null;
            }
            AuthorDynamicsPresenter.this.f13032n = list.get(0).nextMaxUpdateTime;
            ArrayList arrayList = new ArrayList();
            List<Feed> list2 = list.get(0).feedList;
            if (list2 != null) {
                Iterator<Feed> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new FeedElement(it.next()));
                }
            } else {
                Log.w(C2755a.f16307g, "loadFeed error, get feedList is null");
            }
            return new C2218k(arrayList, -1L, qVar.cards.get(0).hasMore);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(@dd C2218k result) {
            if (AuthorDynamicsPresenter.this.f13031k == null || isCancelled()) {
                return;
            }
            AuthorDynamicsPresenter.this.f13031k.pc(result);
        }
    }

    @Override // v0af.zy.InterfaceC8138zy
    public void a9(long time) {
        this.f13032n = time;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
        if (owner instanceof C2223q) {
            this.f13031k = (C2223q) owner;
            return;
        }
        throw new IllegalStateException("invalid fragment. " + owner);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        AsyncTask<Long, Void, C2218k> asyncTask = this.f13033q;
        if (asyncTask != null) {
            asyncTask.cancel(false);
        }
        this.f13031k = null;
    }

    @Override // v0af.zy.InterfaceC8138zy
    public void zkd() {
        AsyncTask<Long, Void, C2218k> asyncTask = this.f13033q;
        if (asyncTask != null) {
            asyncTask.cancel(false);
        }
        AsyncTaskC2217k asyncTaskC2217k = new AsyncTaskC2217k();
        this.f13033q = asyncTaskC2217k;
        asyncTaskC2217k.executeOnExecutor(C6002g.x2(), Long.valueOf(this.f13032n));
    }
}
