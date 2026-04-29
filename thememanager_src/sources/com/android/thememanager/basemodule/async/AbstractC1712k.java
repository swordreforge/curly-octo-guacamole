package com.android.thememanager.basemodule.async;

import a98o.C0004k;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.C2755a;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.async.k */
/* JADX INFO: compiled from: AsyncAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1712k<T> extends BaseAdapter {

    /* JADX INFO: renamed from: c */
    public static final int f9810c = 3;

    /* JADX INFO: renamed from: f */
    public static final int f9811f = 2;

    /* JADX INFO: renamed from: l */
    public static final int f9812l = 1;

    /* JADX INFO: renamed from: r */
    public static final int f9813r = 0;

    /* JADX INFO: renamed from: t */
    private static final int f9814t = -1;

    /* JADX INFO: renamed from: g */
    private int f9815g;

    /* JADX INFO: renamed from: i */
    private boolean f9817i;

    /* JADX INFO: renamed from: p */
    private boolean f9820p;

    /* JADX INFO: renamed from: s */
    private boolean f9822s;

    /* JADX INFO: renamed from: z */
    private k<T> f9824z;

    /* JADX INFO: renamed from: k */
    private List<C0004k<T>> f9818k = new ArrayList();

    /* JADX INFO: renamed from: q */
    private Map<AbstractAsyncTaskC1713n<?, ?, ?>, Integer> f9821q = new HashMap();

    /* JADX INFO: renamed from: n */
    private final List<AbstractAsyncTaskC1714q<?, ?, ?>> f9819n = new ArrayList();

    /* JADX INFO: renamed from: y */
    private boolean f9823y = true;

    /* JADX INFO: renamed from: h */
    private int f9816h = 1;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.async.k$k */
    /* JADX INFO: compiled from: AsyncAdapter.java */
    public interface k<T> {
        List<T> w831(List<T> data);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.async.k$n */
    /* JADX INFO: compiled from: AsyncAdapter.java */
    public static class n {

        /* JADX INFO: renamed from: k */
        public int f9825k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f57498toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public boolean f57499zy;
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.async.k$q */
    /* JADX INFO: compiled from: AsyncAdapter.java */
    public static abstract class q<T> extends AbstractAsyncTaskC1713n<Object, List<T>, List<T>> {

        /* JADX INFO: renamed from: p */
        private static final int f9826p = 50;

        /* JADX INFO: renamed from: s */
        public static final int f9827s = 1;

        /* JADX INFO: renamed from: y */
        public static final int f9828y = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private List<T> f57500f7l8 = new a98o.zy();

        /* JADX INFO: renamed from: g */
        protected WeakReference<AbstractC1712k> f9829g;

        /* JADX INFO: renamed from: n */
        private boolean f9830n;

        /* JADX INFO: renamed from: q */
        private n f9831q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f57501zy;

        private void x2(List<T> result) {
            WeakReference<AbstractC1712k> weakReference = this.f9829g;
            AbstractC1712k abstractC1712k = weakReference != null ? weakReference.get() : null;
            if (abstractC1712k == null) {
                return;
            }
            C0004k<T> c0004kM6686p = abstractC1712k.m6686p(this.f57501zy);
            boolean z2 = true;
            if (result != null) {
                c0004kM6686p.addAll(result);
                c0004kM6686p.setPage(c0004kM6686p.getPage() + 1);
                if (this.f9830n) {
                    C0004k<T> c0004kM6686p2 = abstractC1712k.m6686p(this.f57501zy);
                    for (int size = c0004kM6686p2.size() - 1; size > 0; size--) {
                        int i2 = size - 1;
                        while (true) {
                            if (i2 < 0) {
                                break;
                            }
                            if (c0004kM6686p2.get(i2).equals(c0004kM6686p2.get(size))) {
                                C7794k.m28196p(C2755a.f16307g, "duplicate data: " + c0004kM6686p2.get(size));
                                c0004kM6686p2.remove(size);
                                break;
                            }
                            i2--;
                        }
                    }
                }
            }
            if (this.f9831q.f57498toq) {
                if (result != null && !((a98o.zy) result).isFirst()) {
                    z2 = false;
                }
                c0004kM6686p.setReachTop(z2);
            } else {
                if (result != null && !((a98o.zy) result).isLast()) {
                    z2 = false;
                }
                c0004kM6686p.setReachBottom(z2);
            }
            abstractC1712k.notifyDataSetChanged();
        }

        protected int f7l8() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<T> doInBackground(Object... args) {
            AbstractC1712k abstractC1712k;
            if (this.f9831q == null || isCancelled()) {
                return null;
            }
            WeakReference<AbstractC1712k> weakReference = this.f9829g;
            k<T> kVarF7l8 = (weakReference == null || (abstractC1712k = weakReference.get()) == null) ? null : abstractC1712k.f7l8();
            if (f7l8() != 1) {
                if (isCancelled()) {
                    return null;
                }
                List<T> listMo6404s = mo6404s(this.f9831q);
                if (isCancelled()) {
                    return null;
                }
                return kVarF7l8 != null ? kVarF7l8.w831(listMo6404s) : listMo6404s;
            }
            int i2 = this.f9831q.f9825k;
            while (this.f9831q.f9825k < i2 + 50) {
                if (!isCancelled()) {
                    List<T> listMo6404s2 = mo6404s(this.f9831q);
                    if (kVarF7l8 != null) {
                        listMo6404s2 = kVarF7l8.w831(listMo6404s2);
                    }
                    if (listMo6404s2 == null) {
                        break;
                    }
                    this.f57500f7l8.addAll(listMo6404s2);
                    publishProgress(listMo6404s2);
                    if (((a98o.zy) listMo6404s2).isLast()) {
                        break;
                    }
                    this.f9831q.f9825k++;
                } else {
                    return null;
                }
            }
            return this.f57500f7l8;
        }

        /* JADX INFO: renamed from: h */
        public void m6693h(n loadParams) {
            this.f9831q = loadParams;
        }

        public void kja0(int group) {
            this.f57501zy = group;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(List<T>... partialResult) {
            x2(partialResult[0]);
            super.onProgressUpdate(partialResult);
        }

        public void n7h(boolean unique) {
            this.f9830n = unique;
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        protected void onPreExecute() {
            WeakReference<AbstractC1712k> weakReference;
            AbstractC1712k abstractC1712k;
            super.onPreExecute();
            if (isCancelled() || (weakReference = this.f9829g) == null || (abstractC1712k = weakReference.get()) == null) {
                return;
            }
            abstractC1712k.t8r().put(this, Integer.valueOf(this.f57501zy));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<T> result) {
            AbstractC1712k abstractC1712k;
            if (f7l8() == 0) {
                x2(result);
            }
            super.onPostExecute(result);
            WeakReference<AbstractC1712k> weakReference = this.f9829g;
            if (weakReference == null || (abstractC1712k = weakReference.get()) == null) {
                return;
            }
            abstractC1712k.t8r().remove(this);
            abstractC1712k.mcp(result);
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n
        /* JADX INFO: renamed from: q */
        protected boolean mo6421q() {
            AbstractC1712k abstractC1712k;
            WeakReference<AbstractC1712k> weakReference = this.f9829g;
            if (weakReference == null || (abstractC1712k = weakReference.get()) == null) {
                return false;
            }
            return abstractC1712k.t8r().containsKey(this);
        }

        public void qrj(AbstractC1712k adapter) {
            this.f9829g = new WeakReference<>(adapter);
        }

        /* JADX INFO: renamed from: s */
        protected abstract List<T> mo6404s(n params);

        /* JADX INFO: renamed from: y */
        public boolean m6694y() {
            return this.f9829g != null;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.async.k$toq */
    /* JADX INFO: compiled from: AsyncAdapter.java */
    public static abstract class toq<T> extends AbstractAsyncTaskC1713n<Object, List<T>, List<T>> {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f57502ld6 = 2;

        /* JADX INFO: renamed from: p */
        public static final int f9832p = 1;

        /* JADX INFO: renamed from: s */
        public static final int f9833s = 0;

        /* JADX INFO: renamed from: y */
        protected WeakReference<AbstractC1712k> f9837y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f57504zy;

        /* JADX INFO: renamed from: q */
        private boolean f9836q = true;

        /* JADX INFO: renamed from: n */
        private List<T> f9835n = new ArrayList();

        /* JADX INFO: renamed from: g */
        private List<T> f9834g = new ArrayList();

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private List<zy<T>> f57503f7l8 = new ArrayList();

        private boolean ld6() {
            if (mo6388y() != 2) {
                return true;
            }
            for (int i2 = 0; i2 < this.f57503f7l8.size(); i2++) {
                if (this.f57503f7l8.get(i2).m6698k()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public List<T> doInBackground(Object... params) {
            int iMo6388y = mo6388y();
            if (iMo6388y == 2) {
                for (int i2 = 0; i2 < this.f57503f7l8.size(); i2++) {
                    this.f57503f7l8.get(i2).toq(this);
                }
            } else if (iMo6388y == 1) {
                int size = 0;
                while (true) {
                    List<T> listM6697p = m6697p(size);
                    if (listM6697p == null) {
                        break;
                    }
                    this.f9835n.addAll(listM6697p);
                    publishProgress(listM6697p);
                    size += listM6697p.size();
                }
            } else {
                List<T> listMo6387s = mo6387s();
                if (listMo6387s != null) {
                    this.f9835n.addAll(listMo6387s);
                    publishProgress(listMo6387s);
                }
            }
            return this.f9835n;
        }

        /* JADX INFO: renamed from: g */
        public void m6695g(zy<T> visitor) {
            this.f57503f7l8.add(visitor);
        }

        /* JADX INFO: renamed from: h */
        public void m6696h(int group) {
            this.f57504zy = group;
        }

        public void kja0(AbstractC1712k adapter) {
            this.f9837y = new WeakReference<>(adapter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(List<T>... values) {
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            AbstractC1712k abstractC1712k = weakReference != null ? weakReference.get() : null;
            if (abstractC1712k == null) {
                return;
            }
            if (!abstractC1712k.m6684i() || this.f9836q) {
                abstractC1712k.m6686p(this.f57504zy).addAll(values[0]);
            } else {
                this.f9834g.addAll(values[0]);
            }
            if (!abstractC1712k.m6684i() || this.f9836q) {
                abstractC1712k.notifyDataSetChanged();
            }
            super.onProgressUpdate(values);
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            if (!ld6()) {
                cancel(false);
                return;
            }
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            AbstractC1712k abstractC1712k = weakReference != null ? weakReference.get() : null;
            if (abstractC1712k == null) {
                return;
            }
            this.f9836q = abstractC1712k.m6686p(this.f57504zy).size() == 0;
            if (!abstractC1712k.m6684i() || this.f9836q) {
                abstractC1712k.m6686p(this.f57504zy).clear();
            } else {
                this.f9834g.clear();
            }
            if (isCancelled()) {
                return;
            }
            abstractC1712k.t8r().put(this, Integer.valueOf(this.f57504zy));
        }

        /* JADX INFO: renamed from: p */
        protected List<T> m6697p(int index) {
            return null;
        }

        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1713n
        /* JADX INFO: renamed from: q */
        protected boolean mo6421q() {
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            AbstractC1712k abstractC1712k = weakReference != null ? weakReference.get() : null;
            if (abstractC1712k == null) {
                return false;
            }
            return abstractC1712k.t8r().containsKey(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<T> result) {
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            AbstractC1712k abstractC1712k = weakReference != null ? weakReference.get() : null;
            if (abstractC1712k == null) {
                return;
            }
            C0004k<T> c0004kM6686p = abstractC1712k.m6686p(this.f57504zy);
            c0004kM6686p.setReachBottom(true);
            c0004kM6686p.setReachTop(true);
            if (abstractC1712k.m6684i() && !this.f9836q) {
                c0004kM6686p.clear();
                c0004kM6686p.addAll(this.f9834g);
                abstractC1712k.notifyDataSetChanged();
            }
            super.onPostExecute(result);
            abstractC1712k.t8r().remove(this);
            abstractC1712k.m6689t(result);
        }

        /* JADX INFO: renamed from: s */
        protected List<T> mo6387s() {
            return null;
        }

        public void x2(List<T>... partialDataSet) {
            this.f9835n.addAll(partialDataSet[0]);
            publishProgress(partialDataSet);
        }

        /* JADX INFO: renamed from: y */
        protected abstract int mo6388y();
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.async.k$zy */
    /* JADX INFO: compiled from: AsyncAdapter.java */
    public interface zy<T> {
        /* JADX INFO: renamed from: k */
        boolean m6698k();

        void toq(toq task);

        void zy(String keyword);
    }

    /* JADX INFO: renamed from: g */
    private void m6682g(int group) {
        y9n.m7255s();
        if (group == -1) {
            this.f9818k.clear();
        } else {
            this.f9818k.get(group).clear();
        }
        Iterator<Map.Entry<AbstractAsyncTaskC1713n<?, ?, ?>, Integer>> it = this.f9821q.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<AbstractAsyncTaskC1713n<?, ?, ?>, Integer> next = it.next();
            if (group == -1 || next.getValue().intValue() == group) {
                next.getKey().cancel(false);
                it.remove();
            }
        }
        notifyDataSetChanged();
    }

    private void ni7(int group, toq task) {
        if (task == null) {
            return;
        }
        task.m6699n("loadData-" + group);
        task.m6696h(group);
        try {
            task.executeOnExecutor(C6002g.ld6(), new Object[0]);
        } catch (IllegalStateException unused) {
        }
    }

    private void wvg(boolean upwards, int group, q task) {
        if (task == null) {
            return;
        }
        n nVar = new n();
        nVar.f57498toq = upwards;
        C0004k<T> c0004kM6686p = m6686p(group);
        if (upwards || c0004kM6686p.getPage() == 0) {
            nVar.f9825k = 0;
        } else {
            nVar.f9825k = c0004kM6686p.getPage();
        }
        nVar.f57499zy = this.f9817i;
        task.m6693h(nVar);
        task.m6699n("loadMoreData-" + group);
        task.kja0(group);
        if (!task.m6694y()) {
            task.qrj(this);
        }
        try {
            task.executeOnExecutor(C6002g.x2(), new Object[0]);
        } catch (IllegalStateException unused) {
        }
    }

    public void a9(k<T> processor) {
        this.f9824z = processor;
    }

    protected List<toq> cdj(boolean needToRefresh) {
        return null;
    }

    public void d3(List<C0004k<T>> dataSet) {
        this.f9818k = dataSet;
        notifyDataSetInvalidated();
    }

    public void eqxt(int preloadOffset) {
        this.f9815g = preloadOffset;
    }

    public k<T> f7l8() {
        return this.f9824z;
    }

    public boolean fn3e() {
        return !this.f9821q.isEmpty();
    }

    public void fti(int autoLoadMoreStyle) {
        this.f9822s = (autoLoadMoreStyle & 1) != 0;
        this.f9820p = (autoLoadMoreStyle & 2) != 0;
    }

    public void fu4(boolean needToRefresh) {
        List<toq> listCdj = cdj(needToRefresh);
        if (listCdj == null) {
            return;
        }
        for (int i2 = 0; i2 < listCdj.size(); i2++) {
            ni7(i2, listCdj.get(i2));
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int iM6690y = 0;
        for (int i2 = 0; i2 < this.f9818k.size(); i2++) {
            iM6690y += m6690y(i2);
        }
        return iM6690y;
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (getCount() == 0) {
            return null;
        }
        Pair<Integer, Integer> pairN7h = n7h(position);
        List<T> listM6683h = m6683h(((Integer) pairN7h.first).intValue(), ((Integer) pairN7h.second).intValue());
        View qVar = toq(convertView, listM6683h, position, ((Integer) pairN7h.first).intValue(), ((Integer) pairN7h.second).intValue());
        for (int i2 = 0; i2 < listM6683h.size(); i2++) {
            zy(qVar, listM6683h.get(i2), i2, ((Integer) pairN7h.second).intValue());
        }
        C0004k<T> c0004kM6686p = m6686p(((Integer) pairN7h.second).intValue());
        if (!c0004kM6686p.isReachTop() && ((Integer) pairN7h.first).intValue() == this.f9815g && this.f9822s) {
            o1t(true, ((Integer) pairN7h.second).intValue());
        } else if (!c0004kM6686p.isReachBottom() && ((Integer) pairN7h.first).intValue() == (m6690y(((Integer) pairN7h.second).intValue()) - 1) - this.f9815g && this.f9820p) {
            o1t(false, ((Integer) pairN7h.second).intValue());
        }
        return qVar;
    }

    public void gvn7(int dataPerLine) {
        this.f9816h = dataPerLine;
    }

    /* JADX INFO: renamed from: h */
    protected List<T> m6683h(int groupPos, int group) {
        int i2 = this.f9816h;
        int i3 = groupPos * i2;
        int iMin = Math.min(i2, m6688s(group) - i3);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < iMin; i4++) {
            arrayList.add(ld6(i3 + i4, group));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public boolean m6684i() {
        return this.f9823y;
    }

    public void jk(com.android.thememanager.basemodule.async.toq observer) {
        Map<AbstractAsyncTaskC1713n<?, ?, ?>, Integer> mapT8r;
        if (observer == null || (mapT8r = t8r()) == null || mapT8r.keySet() == null) {
            return;
        }
        for (AbstractAsyncTaskC1713n<?, ?, ?> abstractAsyncTaskC1713n : mapT8r.keySet()) {
            if (abstractAsyncTaskC1713n != null) {
                abstractAsyncTaskC1713n.toq(observer);
            }
        }
    }

    public void jp0y(boolean backgroundLoad) {
        this.f9823y = backgroundLoad;
    }

    /* JADX INFO: renamed from: k */
    public void m6685k(AbstractAsyncTaskC1714q<?, ?, ?> task) {
        if (task != null) {
            this.f9819n.add(task);
        }
    }

    protected List<q> ki() {
        return null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
    public List<T> getItem(int position) {
        Pair<Integer, Integer> pairN7h = n7h(position);
        return m6683h(((Integer) pairN7h.first).intValue(), ((Integer) pairN7h.second).intValue());
    }

    public T ld6(int index, int group) {
        return m6686p(group).get(index);
    }

    protected void mcp(List<T> result) {
    }

    /* JADX INFO: renamed from: n */
    public void mo6466n() {
        m6682g(-1);
    }

    public Pair<Integer, Integer> n7h(int position) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f9818k.size()) {
            int iM6690y = m6690y(i2) + i3;
            if (position < iM6690y) {
                return new Pair<>(Integer.valueOf(position - i3), Integer.valueOf(i2));
            }
            i2++;
            i3 = iM6690y;
        }
        return null;
    }

    public void o1t(boolean upwards, int group) {
        List<q> listKi = ki();
        if (listKi == null || listKi.size() <= group) {
            return;
        }
        wvg(upwards, group, listKi.get(group));
    }

    public void oc(boolean forceRefresh) {
        this.f9817i = forceRefresh;
    }

    /* JADX INFO: renamed from: p */
    protected C0004k<T> m6686p(int group) {
        if (this.f9818k.size() <= group) {
            synchronized (this) {
                if (this.f9818k.size() <= group) {
                    for (int size = this.f9818k.size(); size <= group; size++) {
                        this.f9818k.add(new C0004k<>());
                    }
                }
            }
        }
        return this.f9818k.get(group);
    }

    /* JADX INFO: renamed from: q */
    public void m6687q(com.android.thememanager.basemodule.async.toq observer) {
        if (observer != null) {
            Iterator<AbstractAsyncTaskC1714q<?, ?, ?>> it = this.f9819n.iterator();
            while (it.hasNext()) {
                it.next().toq(observer);
            }
        }
        this.f9819n.clear();
    }

    public List<C0004k<T>> qrj() {
        return this.f9818k;
    }

    /* JADX INFO: renamed from: s */
    public int m6688s(int group) {
        return m6686p(group).size();
    }

    /* JADX INFO: renamed from: t */
    protected void m6689t(List<T> result) {
    }

    public Map<AbstractAsyncTaskC1713n<?, ?, ?>, Integer> t8r() {
        return this.f9821q;
    }

    protected abstract View toq(View view, List<T> data, int position, int groupPos, int group);

    public int x2() {
        return this.f9816h;
    }

    /* JADX INFO: renamed from: y */
    protected int m6690y(int group) {
        int iM6688s = m6688s(group);
        if (iM6688s == 0) {
            return 0;
        }
        return ((iM6688s - 1) / this.f9816h) + 1;
    }

    /* JADX INFO: renamed from: z */
    public void m6691z(boolean upwards) {
        List<q> listKi = ki();
        if (listKi == null) {
            return;
        }
        for (int i2 = 0; i2 < listKi.size(); i2++) {
            wvg(upwards, i2, listKi.get(i2));
        }
    }

    public void zurt(int group) {
        List<toq> listCdj = cdj(false);
        if (listCdj == null || listCdj.size() <= group) {
            return;
        }
        ni7(group, listCdj.get(group));
    }

    protected void zy(View view, T data, int offset, int group) {
    }
}
