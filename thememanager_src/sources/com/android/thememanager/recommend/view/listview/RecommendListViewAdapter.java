package com.android.thememanager.recommend.view.listview;

import android.content.Intent;
import android.util.Log;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.recommend.model.entity.PlayingElement;
import com.android.thememanager.recommend.model.entity.element.FooterElement;
import com.android.thememanager.recommend.presenter.audio.AudioResourceHandler;
import com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.List;
import miuix.appcompat.app.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendListViewAdapter extends BaseThemeAdapter<UIElement, BaseViewHolder> implements InterfaceC2366k {

    /* JADX INFO: renamed from: t */
    private static final int f13727t = 1;

    /* JADX INFO: renamed from: z */
    private static final String f13728z = "RecommendListViewAdapter";

    /* JADX INFO: renamed from: g */
    private C2367n f13729g;

    /* JADX INFO: renamed from: h */
    private IRecommendListView.ExViewHolder f13730h;

    /* JADX INFO: renamed from: i */
    private final boolean f13731i;

    /* JADX INFO: renamed from: p */
    private final C2368q f13732p;

    /* JADX INFO: renamed from: s */
    private AudioResourceHandler f13733s;

    /* JADX INFO: renamed from: y */
    private int f13734y;

    private class toq implements AudioResourceHandler.toq {

        /* JADX INFO: renamed from: k */
        private dd f13735k;

        private toq() {
        }

        @Override // com.android.thememanager.recommend.presenter.audio.AudioResourceHandler.toq
        /* JADX INFO: renamed from: k */
        public void mo8528k(int currBytes, int totalBytes) {
            dd ddVar = this.f13735k;
            if (ddVar == null || totalBytes <= 0 || currBytes < 0) {
                return;
            }
            ddVar.lv5((int) Math.round((((double) currBytes) * 100.0d) / ((double) totalBytes)));
        }

        @Override // com.android.thememanager.recommend.presenter.audio.AudioResourceHandler.toq
        /* JADX INFO: renamed from: n */
        public void mo8529n() {
            if (RecommendListViewAdapter.this.ki().isFinishing()) {
                return;
            }
            try {
                dd ddVar = this.f13735k;
                if (ddVar != null) {
                    ddVar.dismiss();
                }
            } catch (Exception unused) {
            }
            nn86.m7150k(R.string.theme_apply_failured, 0);
        }

        @Override // com.android.thememanager.recommend.presenter.audio.AudioResourceHandler.toq
        /* JADX INFO: renamed from: q */
        public void mo8530q(String path) {
            if (RecommendListViewAdapter.this.ki().isFinishing()) {
                return;
            }
            try {
                dd ddVar = this.f13735k;
                if (ddVar != null) {
                    ddVar.dismiss();
                }
            } catch (Exception unused) {
            }
            Intent intent = new Intent();
            intent.putExtra("RESPONSE_PICKED_RESOURCE", path);
            RecommendListViewAdapter.this.ki().setResult(-1, intent);
            RecommendListViewAdapter.this.ki().finish();
        }

        @Override // com.android.thememanager.recommend.presenter.audio.AudioResourceHandler.toq
        public void toq() {
        }

        @Override // com.android.thememanager.recommend.presenter.audio.AudioResourceHandler.toq
        public void zy() {
            dd ddVar = new dd(RecommendListViewAdapter.this.fn3e());
            this.f13735k = ddVar;
            ddVar.y2(1);
            this.f13735k.n5r1(RecommendListViewAdapter.this.fn3e().getString(R.string.resource_downloading));
            this.f13735k.setCancelable(false);
            this.f13735k.setCanceledOnTouchOutside(false);
            try {
                this.f13735k.show();
            } catch (Exception unused) {
            }
        }
    }

    public RecommendListViewAdapter(InterfaceC1719p viewContainer, C2367n builder, C2368q preload) {
        super(viewContainer);
        this.f13734y = -1;
        this.f13733s = null;
        this.f13729g = builder;
        this.f13732p = preload;
        this.f13731i = C1819o.d2ok(bf2.toq.toq());
    }

    private void hb() {
        AudioResourceHandler audioResourceHandler = this.f13733s;
        if (audioResourceHandler == null || !audioResourceHandler.ld6()) {
            return;
        }
        this.f13733s.n7h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui BaseViewHolder holder, int position, @lvui List<Object> payloads) {
        if (payloads.isEmpty()) {
            mo6707z(holder, position);
            return;
        }
        for (Object obj : payloads) {
            if ((obj instanceof Integer) && (holder instanceof com.android.thememanager.recommend.view.listview.toq) && ((Integer) obj).intValue() == 1) {
                ((com.android.thememanager.recommend.view.listview.toq) holder).mo8570y();
            }
        }
    }

    public int d2ok() {
        return this.f13729g.m8564s();
    }

    public int dd() {
        return this.f13729g.n7h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@lvui BaseViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.zy();
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui BaseViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        C2368q c2368q = this.f13732p;
        if (c2368q != null) {
            c2368q.m8569q(position, getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return ((UIElement) this.f9846q.get(position)).getCardTypeOrdinal();
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    /* JADX INFO: renamed from: h */
    public void mo8547h(IRecommendListView.ExViewHolder evh) {
        this.f13730h = evh;
    }

    /* JADX INFO: renamed from: j */
    public void m8548j(String uuid) {
        for (int i2 = 0; i2 < this.f9846q.size(); i2++) {
            Object obj = (UIElement) this.f9846q.get(i2);
            if ((obj instanceof PlayingElement.IPlaying) && ((PlayingElement.IPlaying) obj).setPlaying(uuid)) {
                notifyItemChanged(i2, 1);
            }
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1721s
    public void jp0y(@lvui InterfaceC0954z owner) {
        hb();
    }

    /* JADX INFO: renamed from: l */
    public boolean m8549l() {
        return this.f13729g.zurt();
    }

    public String lvui() {
        return this.f13729g.ld6();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    @oc
    /* JADX INFO: renamed from: n */
    public void mo8550n(List<UIElement> list, boolean z2, boolean z3) {
        if (!z3 && this.f13729g.fn3e()) {
            list.add(new FooterElement());
        }
        if (z2) {
            int itemCount = getItemCount();
            int size = list.size();
            this.f9846q.addAll(list);
            notifyItemRangeInserted(itemCount, size);
            return;
        }
        int size2 = this.f9846q.size();
        this.f9846q.clear();
        notifyItemRangeRemoved(0, size2);
        this.f9846q.addAll(list);
        notifyItemRangeInserted(0, list.size());
    }

    public boolean n5r1() {
        return this.f13729g.fu4();
    }

    public boolean ncyb() {
        return this.f13731i;
    }

    public boolean nn86(int position) {
        if (position >= ni7().size() || position < 0) {
            return false;
        }
        ni7().remove(position);
        notifyItemRemoved(position);
        return true;
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1721s
    /* JADX INFO: renamed from: o */
    public boolean mo6719o() {
        C2367n c2367n = this.f13729g;
        if (c2367n != null) {
            return c2367n.cdj();
        }
        Log.d(f13728z, "getViewHolderLifecycleEnable: mBuilder is null");
        return true;
    }

    public AudioResourceHandler oc() {
        if (this.f13733s == null) {
            AudioResourceHandler audioResourceHandler = new AudioResourceHandler(ki(), this, m8549l());
            this.f13733s = audioResourceHandler;
            audioResourceHandler.qrj(new toq());
            m6705z().bf2(this.f13733s);
        }
        return this.f13733s;
    }

    /* JADX INFO: renamed from: r */
    public int m8551r() {
        return this.f13734y;
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    public void setRingtoneFlag(int ringtoneFlag) {
        this.f13734y = ringtoneFlag;
    }

    @Override // com.android.thememanager.recommend.view.listview.InterfaceC2366k
    public void toq(List<UIElement> elements, boolean hasMore) {
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e2  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @zy.lvui
    /* JADX INFO: renamed from: uv6, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder onCreateViewHolder(@zy.lvui android.view.ViewGroup r3, int r4) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.listview.RecommendListViewAdapter.onCreateViewHolder(android.view.ViewGroup, int):com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@lvui BaseViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.mo8580n();
    }

    public int x9kr() {
        return this.f13729g.kja0();
    }
}
