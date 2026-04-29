package com.android.thememanager.settings;

import a98o.C0004k;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.sok;
import com.android.thememanager.v9.model.PurchasedOrFavoritedCategory;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: WallpaperListAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class o1t extends RecyclerView.AbstractC1060y<jp0y> {

    /* JADX INFO: renamed from: c */
    private final int f15145c;

    /* JADX INFO: renamed from: f */
    private final String f15146f;

    /* JADX INFO: renamed from: g */
    private AsyncTaskC2531q f15147g;

    /* JADX INFO: renamed from: h */
    private List<Resource> f15148h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private Set<View> f15149i = new HashSet();

    /* JADX INFO: renamed from: k */
    private com.android.thememanager.fu4 f15150k;

    /* JADX INFO: renamed from: l */
    private int f15151l;

    /* JADX INFO: renamed from: n */
    private wvg f15152n;

    /* JADX INFO: renamed from: p */
    private toq f15153p;

    /* JADX INFO: renamed from: q */
    private fti f15154q;

    /* JADX INFO: renamed from: r */
    private boolean f15155r;

    /* JADX INFO: renamed from: s */
    private AsyncTaskC2530k f15156s;

    /* JADX INFO: renamed from: t */
    private boolean f15157t;

    /* JADX INFO: renamed from: y */
    private zy f15158y;

    /* JADX INFO: renamed from: z */
    private int f15159z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.o1t$k */
    /* JADX INFO: compiled from: WallpaperListAdapter.java */
    private static class AsyncTaskC2530k extends AsyncTask<Integer, Void, Pair<List<Resource>, Boolean>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<o1t> f15160k;

        AsyncTaskC2530k(o1t adapter) {
            this.f15160k = new WeakReference<>(adapter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<List<Resource>, Boolean> doInBackground(Integer... integers) {
            T t2;
            o1t o1tVar = this.f15160k.get();
            if (o1tVar == null) {
                return null;
            }
            com.android.thememanager.controller.online.zurt zurtVarD2ok = com.android.thememanager.controller.online.ld6.d2ok("wallpaper");
            zurtVarD2ok.addParameter("page", Integer.toString(o1tVar.f15151l));
            zurtVarD2ok.addParameter(InterfaceC1925p.a7on, Boolean.toString(false));
            zurtVarD2ok.addParameter(InterfaceC1925p.ae9n, "30");
            CommonResponse commonResponseMo7476p = C2082k.zy().m8001n().ld6(o1tVar.f15150k).m7690k().mo7476p(zurtVarD2ok, true, PurchasedOrFavoritedCategory.class);
            if (commonResponseMo7476p == null || commonResponseMo7476p.apiCode != 0 || (t2 = commonResponseMo7476p.apiData) == 0 || ((PurchasedOrFavoritedCategory) t2).products == null) {
                return new Pair<>(null, Boolean.FALSE);
            }
            C0004k<Resource> c0004kM10167n = com.android.thememanager.v9.f7l8.m10167n(((PurchasedOrFavoritedCategory) t2).products, ((PurchasedOrFavoritedCategory) t2).products.size());
            AbstractC1918k.m7561k(EnumC1933t.FAVORITE, true, (Resource[]) c0004kM10167n.toArray(new Resource[c0004kM10167n.size()]));
            o1t.wvg(o1tVar);
            return new Pair<>(c0004kM10167n, Boolean.valueOf(((PurchasedOrFavoritedCategory) commonResponseMo7476p.apiData).hasMore));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<List<Resource>, Boolean> result) {
            o1t o1tVar = this.f15160k.get();
            if (o1tVar == null || !gc3c.cdj(o1tVar.f15154q.getActivity())) {
                return;
            }
            if (result.first != null) {
                o1tVar.f15148h.addAll((Collection) result.first);
                o1tVar.notifyDataSetChanged();
                o1tVar.f15152n.fu4();
            }
            o1tVar.f15154q.kbj(result.first != null, ((Boolean) result.second).booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.o1t$q */
    /* JADX INFO: compiled from: WallpaperListAdapter.java */
    private static class AsyncTaskC2531q extends AsyncTask<Boolean, Void, List<Resource>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<o1t> f15161k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private com.android.thememanager.fu4 f60798toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f60799zy;

        AsyncTaskC2531q(o1t adapter) {
            this.f15161k = new WeakReference<>(adapter);
            this.f60798toq = adapter.f15150k;
            this.f60799zy = adapter.f15146f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<Resource> doInBackground(Boolean... params) {
            ArrayList arrayList = null;
            if (isCancelled()) {
                return null;
            }
            boolean zBooleanValue = params[0].booleanValue();
            if (TextUtils.isEmpty(this.f60799zy)) {
                return eqxt.m8999i(zBooleanValue, this.f60798toq);
            }
            List<Resource> listCdj = eqxt.cdj(this.f60799zy);
            if (listCdj != null && !listCdj.isEmpty()) {
                arrayList = new ArrayList();
                for (Resource resource : listCdj) {
                    if ((!zBooleanValue) == "wallpaper".equals(resource.getCategory())) {
                        arrayList.add(resource);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<Resource> result) {
            o1t o1tVar = this.f15161k.get();
            if (o1tVar == null || !gc3c.cdj(o1tVar.f15154q.getActivity())) {
                return;
            }
            if (result != null && result.size() > 0) {
                o1tVar.f15148h.addAll(result);
                o1tVar.notifyDataSetChanged();
            }
            o1tVar.f15154q.kbj(true, false);
        }
    }

    /* JADX INFO: compiled from: WallpaperListAdapter.java */
    private static class toq extends AsyncTask<String, Void, Pair<List<Resource>, Boolean>> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<o1t> f15162k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f60800toq;

        toq(o1t a2) {
            this.f15162k = new WeakReference<>(a2);
            this.f60800toq = a2.f15151l;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<List<Resource>, Boolean> doInBackground(String... strings) {
            C0004k<Resource> c0004kD3;
            boolean z2;
            List<UICard> list;
            UIPage uIPageZy = bz2.toq.zy(strings[0], this.f60800toq);
            if (uIPageZy == null || (list = uIPageZy.cards) == null || list.size() <= 0) {
                c0004kD3 = null;
                z2 = false;
            } else {
                c0004kD3 = C2320q.d3(uIPageZy.cards.get(0).products, -1);
                z2 = uIPageZy.hasMore;
            }
            return new Pair<>(c0004kD3, Boolean.valueOf(z2));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<List<Resource>, Boolean> result) {
            o1t o1tVar = this.f15162k.get();
            if (o1tVar == null || !gc3c.cdj(o1tVar.f15154q.getActivity())) {
                return;
            }
            if (result.first != null) {
                o1t.o1t(o1tVar);
                o1tVar.f15148h.addAll((Collection) result.first);
                o1tVar.notifyDataSetChanged();
                o1tVar.f15152n.fu4();
            }
            o1tVar.f15154q.kbj(result.first != null, ((Boolean) result.second).booleanValue());
        }
    }

    /* JADX INFO: compiled from: WallpaperListAdapter.java */
    private static class zy extends AsyncTask<Boolean, Void, List<Resource>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<o1t> f15163k;

        zy(o1t adapter) {
            this.f15163k = new WeakReference<>(adapter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<Resource> doInBackground(Boolean... boolArr) {
            List<sok<String, Matrix, Long>> listF7l8 = C2687z.f7l8(boolArr[0].booleanValue() ? 1 : 0);
            ArrayList arrayList = new ArrayList();
            for (sok<String, Matrix, Long> sokVar : listF7l8) {
                Resource resource = new Resource();
                resource.setContentPath(sokVar.f16799k);
                arrayList.add(resource);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<Resource> result) {
            o1t o1tVar = this.f15163k.get();
            if (o1tVar == null || !gc3c.cdj(o1tVar.f15154q.getActivity())) {
                return;
            }
            o1tVar.f15149i.clear();
            o1tVar.f15148h.clear();
            o1tVar.f15148h.addAll(result);
            o1tVar.notifyDataSetChanged();
            o1tVar.f15154q.kbj(true, false);
        }
    }

    o1t(fti fragment, com.android.thememanager.fu4 resContext, int category, boolean isSquare, boolean isVideo, String key, int itemW) {
        this.f15150k = resContext;
        this.f15154q = fragment;
        this.f15159z = category;
        this.f15157t = isVideo;
        this.f15155r = isSquare;
        this.f15146f = key;
        this.f15152n = new wvg(fragment, this, category, isVideo, (category == 4 || category == 16) ? false : true);
        this.f15145c = itemW;
    }

    static /* synthetic */ int o1t(o1t o1tVar) {
        int i2 = o1tVar.f15151l + 1;
        o1tVar.f15151l = i2;
        return i2;
    }

    static /* synthetic */ int wvg(o1t o1tVar) {
        int i2 = o1tVar.f15151l;
        o1tVar.f15151l = i2 + 1;
        return i2;
    }

    public void d2ok(boolean refresh) {
        if (refresh) {
            this.f15148h.clear();
            this.f15149i.clear();
            this.f15151l = 0;
        }
        int i2 = this.f15159z;
        if (i2 == 4) {
            AsyncTaskC2531q asyncTaskC2531q = this.f15147g;
            if (asyncTaskC2531q != null) {
                asyncTaskC2531q.cancel(true);
            }
            AsyncTaskC2531q asyncTaskC2531q2 = new AsyncTaskC2531q(this);
            this.f15147g = asyncTaskC2531q2;
            asyncTaskC2531q2.executeOnExecutor(C6002g.ld6(), Boolean.valueOf(this.f15157t));
            return;
        }
        if (i2 == 8) {
            zy zyVar = this.f15158y;
            if (zyVar != null) {
                zyVar.cancel(true);
            }
            zy zyVar2 = new zy(this);
            this.f15158y = zyVar2;
            zyVar2.executeOnExecutor(C6002g.ld6(), Boolean.valueOf(this.f15157t));
            return;
        }
        if (i2 == 12) {
            AsyncTaskC2530k asyncTaskC2530k = this.f15156s;
            if (asyncTaskC2530k != null) {
                asyncTaskC2530k.cancel(true);
            }
            AsyncTaskC2530k asyncTaskC2530k2 = new AsyncTaskC2530k(this);
            this.f15156s = asyncTaskC2530k2;
            asyncTaskC2530k2.executeOnExecutor(C6002g.x2(), Integer.valueOf(this.f15151l));
            return;
        }
        if (i2 != 16) {
            return;
        }
        toq toqVar = this.f15153p;
        if (toqVar != null) {
            toqVar.cancel(true);
        }
        toq toqVar2 = new toq(this);
        this.f15153p = toqVar2;
        toqVar2.executeOnExecutor(C6002g.x2(), this.f15146f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: dd, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@zy.lvui jp0y holder) {
        holder.mo9024n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f15148h.size();
    }

    @zy.lvui
    public List<Resource> jk() {
        return this.f15148h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@zy.lvui jp0y viewHolder, int position) {
        this.f15149i.add(viewHolder.itemView);
        this.f15152n.ki(viewHolder.itemView, position);
        viewHolder.o1t(this.f15148h, position, this.f15159z);
    }

    public void mcp() {
        this.f15152n.mo9372s();
    }

    public void ncyb() {
        this.f15152n.cdj(-1);
    }

    public Set<View> oc() {
        return this.f15149i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @zy.lvui
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public jp0y onCreateViewHolder(@zy.lvui ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f15155r ? R.layout.wallpaper_settings_square_wallpaper_item : R.layout.wallpaper_settings_wallpaper_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams != null) {
            int i3 = this.f15145c;
            layoutParams.width = i3;
            if (this.f15155r) {
                layoutParams.height = i3;
            } else {
                layoutParams.height = (int) ((i3 * 16.0f) / 9.0f);
            }
        }
        return new jp0y(this.f15154q, viewInflate, this.f15155r, this.f15157t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: x9kr, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@zy.lvui jp0y holder) {
        holder.zy();
    }
}
