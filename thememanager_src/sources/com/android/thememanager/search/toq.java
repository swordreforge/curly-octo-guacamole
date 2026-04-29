package com.android.thememanager.search;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.gc3c;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ResourceSearchHintAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends BaseAdapter {

    /* JADX INFO: renamed from: h */
    private static final int f14653h = 11;

    /* JADX INFO: renamed from: k */
    private final Activity f14655k;

    /* JADX INFO: renamed from: p */
    private AsyncTaskC7930toq f14657p;

    /* JADX INFO: renamed from: q */
    private final com.android.thememanager.search.zy f14658q;

    /* JADX INFO: renamed from: s */
    private InterfaceC2483q f14659s;

    /* JADX INFO: renamed from: y */
    private zy f14660y;

    /* JADX INFO: renamed from: n */
    private String f14656n = "";

    /* JADX INFO: renamed from: g */
    private List<C2481q> f14654g = new ArrayList();

    /* JADX INFO: renamed from: com.android.thememanager.search.toq$k */
    /* JADX INFO: compiled from: ResourceSearchHintAdapter.java */
    class ViewOnClickListenerC2482k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C2481q f14661k;

        ViewOnClickListenerC2482k(final C2481q val$data) {
            this.f14661k = val$data;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (toq.this.f14659s != null) {
                toq.this.f14659s.mo8867k(this.f14661k);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.toq$q */
    /* JADX INFO: compiled from: ResourceSearchHintAdapter.java */
    public interface InterfaceC2483q {
        /* JADX INFO: renamed from: k */
        void mo8867k(C2481q hintItem);
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ResourceSearchHintAdapter.java */
    private static class AsyncTaskC7930toq extends AsyncTask<Void, Void, C2481q[]> {

        /* JADX INFO: renamed from: k */
        private WeakReference<toq> f14663k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60753toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private com.android.thememanager.search.zy f60754zy;

        public AsyncTaskC7930toq(toq adapter, String filterText, com.android.thememanager.search.zy dataManager) {
            this.f14663k = new WeakReference<>(adapter);
            this.f60753toq = filterText;
            this.f60754zy = dataManager;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C2481q[] doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            return TextUtils.isEmpty(this.f60753toq) ? (C2481q[]) this.f60754zy.m8887q().toArray(new C2481q[0]) : this.f60754zy.m8886n(this.f60753toq);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C2481q[] result) {
            toq toqVar = this.f14663k.get();
            if (toqVar == null || !gc3c.cdj(toqVar.f14655k)) {
                return;
            }
            toqVar.f14657p = null;
            toqVar.f14654g.clear();
            if (result != null) {
                for (C2481q c2481q : result) {
                    toqVar.f14654g.add(c2481q);
                }
            }
            if (!TextUtils.isEmpty(toqVar.f14656n) && (toqVar.f14654g.size() == 0 || !TextUtils.equals(toqVar.f14656n, ((C2481q) toqVar.f14654g.get(0)).f14652k))) {
                toqVar.f14654g.add(0, new C2481q(toqVar.f14656n, false));
            }
            toqVar.notifyDataSetChanged();
            super.onPostExecute(result);
            if (toqVar.f14660y != null) {
                toqVar.f14660y.mo8869k();
            }
        }
    }

    /* JADX INFO: compiled from: ResourceSearchHintAdapter.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo8869k();
    }

    public toq(Activity activity, com.android.thememanager.search.zy dataManager) {
        this.f14655k = activity;
        this.f14658q = dataManager;
    }

    public void f7l8() {
        y9n.m7255s();
        AsyncTaskC7930toq asyncTaskC7930toq = this.f14657p;
        if (asyncTaskC7930toq != null) {
            asyncTaskC7930toq.cancel(false);
        }
        AsyncTaskC7930toq asyncTaskC7930toq2 = new AsyncTaskC7930toq(this, this.f14656n, this.f14658q);
        this.f14657p = asyncTaskC7930toq2;
        try {
            asyncTaskC7930toq2.executeOnExecutor(C6002g.n7h(), new Void[0]);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return Math.min(11, this.f14654g.size());
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        return this.f14654g.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        C2481q c2481q = (C2481q) getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(this.f14655k).inflate(R.layout.resource_search_hint_item, (ViewGroup) null);
            C6077k.n7h(convertView);
        }
        ((TextView) convertView.findViewById(R.id.hint)).setText(c2481q.f14652k);
        convertView.setOnClickListener(new ViewOnClickListenerC2482k(c2481q));
        if (c2481q.f60752toq) {
            ((ImageView) convertView.findViewById(R.id.tip)).setBackgroundResource(R.drawable.resource_search_history_tip);
        } else {
            ((ImageView) convertView.findViewById(R.id.tip)).setBackgroundResource(R.drawable.resource_search_suggest_tip);
        }
        return convertView;
    }

    /* JADX INFO: renamed from: p */
    public void m8864p(InterfaceC2483q onHintActionListener) {
        this.f14659s = onHintActionListener;
    }

    /* JADX INFO: renamed from: s */
    public void m8865s(zy listener) {
        this.f14660y = listener;
    }

    /* JADX INFO: renamed from: y */
    public void m8866y(String filterText) {
        if (TextUtils.equals(this.f14656n, filterText)) {
            return;
        }
        if (filterText == null) {
            filterText = "";
        }
        this.f14656n = filterText;
    }
}
