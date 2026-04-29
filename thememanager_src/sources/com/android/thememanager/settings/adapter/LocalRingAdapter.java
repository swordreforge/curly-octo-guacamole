package com.android.thememanager.settings.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.settings.AudioPlayer;
import com.android.thememanager.settings.LocalRingFragment;
import com.android.thememanager.util.bo;
import java.util.List;
import java.util.Set;
import ktq.C6756k;
import p029m.zy;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalRingAdapter extends BaseLocalResourceAdapter {

    /* JADX INFO: renamed from: a */
    C1791k f14957a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f60775ab;

    /* JADX INFO: renamed from: b */
    private final int f14958b;
    private int bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @dd
    private Resource f60776bo;
    private C6756k bp;

    /* JADX INFO: renamed from: d */
    private String f14959d;

    /* JADX INFO: renamed from: e */
    private final int f14960e;

    /* JADX INFO: renamed from: j */
    private final int f14961j;

    /* JADX INFO: renamed from: m */
    private final int f14962m;

    /* JADX INFO: renamed from: o */
    private final int f14963o;

    /* JADX INFO: renamed from: u */
    @dd
    private Resource f14964u;

    /* JADX INFO: renamed from: v */
    @dd
    private com.android.thememanager.settings.localaudio.toq f14965v;

    /* JADX INFO: renamed from: w */
    private boolean f14966w;

    /* JADX INFO: renamed from: x */
    private AudioPlayer f14967x;

    static class GroupVH extends BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> {

        /* JADX INFO: renamed from: p */
        TextView f14968p;

        /* JADX INFO: renamed from: s */
        RelativeLayout f14969s;

        /* JADX INFO: renamed from: y */
        FrameLayout f14970y;

        GroupVH(View r2, LocalRingAdapter adapter) {
            super(r2, adapter);
            this.f14970y = (FrameLayout) r2.findViewById(R.id.group_divider);
            this.f14969s = (RelativeLayout) r2.findViewById(R.id.item_title_container);
            this.f14968p = (TextView) r2.findViewById(R.id.item_title);
            r2.setClickable(false);
            r2.setLongClickable(false);
            r2.setFocusable(true);
            int dimensionPixelSize = r2.getContext().getResources().getDimensionPixelSize(R.dimen.ring_list_content_padding_start);
            r2.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void o1t(BaseLocalResourceAdapter.toq item, int position) {
            super.o1t(item, position);
            FrameLayout frameLayout = this.f14970y;
            if (frameLayout == null || position != 0) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
            if (zy.toq(item.m8241k().getTitle())) {
                RelativeLayout relativeLayout = this.f14969s;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout2 = this.f14969s;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            this.f14968p.setText(item.m8241k().getTitle());
        }

        @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
        protected void lvui() {
        }
    }

    public LocalRingAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, BaseLocalPresenter presenter, AudioPlayer player, C6756k vm) {
        super(viewContainer, resourceCode, presenter);
        this.f14960e = 1;
        this.f14961j = 2;
        this.f14963o = 1;
        this.f14962m = 2;
        this.f14958b = 3;
        this.f14957a = C1791k.getInstance(resourceCode);
        this.f14967x = player;
        this.bp = vm;
    }

    private void gbni(String path) {
        List<T> list;
        if (zy.m24738k(path, this.f14959d) || (list = this.f9846q) == 0 || list.isEmpty()) {
            return;
        }
        String str = this.f14959d;
        this.f14959d = path;
        C6756k c6756k = this.bp;
        if (c6756k != null) {
            c6756k.m24696f(path);
        }
        boolean z2 = false;
        for (T t2 : this.f9846q) {
            String contentPath = t2.m8241k().getContentPath();
            if (path.equals(contentPath)) {
                t2.zy(false);
                t2.m8240g(true);
                if (z2) {
                    return;
                } else {
                    z2 = true;
                }
            }
            if (zy.m24738k(str, contentPath) || (!zy.toq(str) && !zy.toq(contentPath) && zy.m24738k(bo.m9620g(str), bo.m9620g(contentPath)))) {
                t2.zy(gyi(t2.m8241k(), this.f14957a));
                t2.m8240g(dr(t2.m8241k(), this.f14957a));
                if (z2) {
                    return;
                } else {
                    z2 = true;
                }
            }
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: a */
    public void mo7308a(Set<String> deletedItemIds) {
        super.mo7308a(deletedItemIds);
        int i2 = -1;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            if (i3 >= this.f9846q.size() - 1) {
                break;
            }
            if (C1902k.ad.equals(((BaseLocalResourceAdapter.toq) this.f9846q.get(i3)).m8241k().getLocalId())) {
                if (i4 != -1) {
                    i2 = i3;
                    break;
                }
                i4 = i3;
            }
            i3++;
        }
        if (i4 < 0 || i4 + 1 != i2) {
            return;
        }
        this.f9846q.remove(i4);
        notifyItemRemoved(i4);
    }

    /* JADX INFO: renamed from: d */
    public String m8986d() {
        if (tfm() || qo()) {
            return this.f14959d;
        }
        com.android.thememanager.settings.localaudio.toq toqVar = this.f14965v;
        if (toqVar == null) {
            return null;
        }
        return toqVar.toq(this.f12772l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: d8wk, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> holder, int position, @lvui List<Object> payloads) {
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        for (Object obj : payloads) {
            if ((obj instanceof Integer) && (holder instanceof LocalRingViewHolder)) {
                int iIntValue = ((Integer) obj).intValue();
                LocalRingViewHolder localRingViewHolder = (LocalRingViewHolder) holder;
                if (iIntValue == 1) {
                    localRingViewHolder.bf2();
                } else if (iIntValue == 2) {
                    localRingViewHolder.i1();
                } else if (iIntValue == 3) {
                    localRingViewHolder.a98o();
                }
            }
        }
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    protected boolean dr(Resource resource, C1791k resourceContext) {
        if (tfm() || qo()) {
            if (C1792n.lrht(resource.getContentPath(), this.f14959d)) {
                return true;
            }
        } else if (zy.m24738k(resource.getContentPath(), mu().f15111k) || zy.m24738k(resource.getContentPath(), mu().f60790toq) || zy.m24738k(resource.getContentPath(), mu().f60791zy) || zy.m24738k(resource.getContentPath(), mu().f15113q) || zy.m24738k(resource.getContentPath(), mu().f15112n) || zy.m24738k(resource.getContentPath(), mu().f15110g)) {
            return true;
        }
        return super.dr(resource, resourceContext);
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter, com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: e */
    protected boolean mo7310e(BatchOperationAdapter.toq batchItem) {
        boolean zMo7310e = super.mo7310e(batchItem);
        if (zMo7310e) {
            this.f14967x.m8970n();
        }
        return zMo7310e;
    }

    @dd
    public Resource fnq8() {
        return this.f60776bo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType == 1 ? new GroupVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.me_item_title_divider, parent, false), this) : new LocalRingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.me_resource_item_horizontal_music, parent, false), this, this.bb);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return C1902k.ad.equals(((BaseLocalResourceAdapter.toq) this.f9846q.get(position)).m8241k().getLocalId()) ? 1 : 2;
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    protected boolean gyi(Resource resource, C1791k resourceContext) {
        String localId = resource.getLocalId();
        String contentPath = resource.getContentPath();
        if (C1902k.ad.equals(localId) || C1902k.ac.equals(localId) || C1902k.bq.equals(localId) || C1792n.nn86(contentPath) || C1792n.hyr(contentPath) || ((contentPath != null && contentPath.startsWith(com.android.thememanager.basemodule.resource.constants.toq.hze4)) || zy.m24738k(resource.getContentPath(), this.f14959d) || C1792n.lrht(resource.getContentPath(), this.f14959d))) {
            return false;
        }
        if (tfm() || qo() || !dr(resource, resourceContext)) {
            return super.gyi(resource, resourceContext);
        }
        return false;
    }

    public void i9jn(Resource select) {
        if (this.f60776bo == select) {
            return;
        }
        this.f60776bo = select;
        if (tfm() || qo()) {
            gbni(select.getContentPath());
        }
        notifyItemRangeChanged(0, getItemCount(), 2);
    }

    public void ltg8(@lvui com.android.thememanager.settings.localaudio.toq usingPath) {
        if (usingPath.equals(this.f14965v)) {
            return;
        }
        this.f14965v = usingPath;
        if (qo()) {
            gbni(usingPath.f15112n);
            notifyItemRangeChanged(0, getItemCount(), 2);
            return;
        }
        if (tfm()) {
            if (zy.toq(this.f14959d)) {
                gbni(usingPath.toq(zy.toq(this.f60775ab) ? this.f12772l : this.f60775ab));
                notifyItemRangeChanged(0, getItemCount(), 2);
                return;
            }
            return;
        }
        notifyItemRangeChanged(0, getItemCount(), 3);
        List<T> list = this.f9846q;
        if (list == 0 || list.isEmpty()) {
            return;
        }
        for (T t2 : this.f9846q) {
            String contentPath = t2.m8241k().getContentPath();
            if (contentPath == null || !usingPath.m9026k(contentPath)) {
                t2.zy(gyi(t2.m8241k(), this.f14957a));
                t2.m8240g(dr(t2.m8241k(), this.f14957a));
            } else {
                t2.zy(false);
                t2.m8240g(true);
            }
        }
    }

    @lvui
    public com.android.thememanager.settings.localaudio.toq mu() {
        if (this.f14965v == null) {
            this.f14965v = new com.android.thememanager.settings.localaudio.toq();
        }
        return this.f14965v;
    }

    public void py(Resource playingResource) {
        if (this.f14964u == playingResource) {
            return;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < this.f9846q.size(); i4++) {
            BaseLocalResourceAdapter.toq toqVar = (BaseLocalResourceAdapter.toq) this.f9846q.get(i4);
            if (toqVar.m8241k() == this.f14964u) {
                i2 = i4;
            } else if (toqVar.m8241k() == playingResource) {
                i3 = i4;
            }
            if (i2 != -1 && i3 != -1) {
                break;
            }
        }
        this.f14964u = playingResource;
        if (i2 != -1) {
            notifyItemChanged(i2, 1);
        }
        if (i3 != -1) {
            notifyItemChanged(i3, 1);
        }
    }

    @dd
    public Resource qkj8() {
        return this.f14964u;
    }

    boolean qo() {
        return "bootaudio".equals(this.f12772l);
    }

    boolean tfm() {
        return this.f14966w;
    }

    @lvui
    public AudioPlayer vq() {
        return this.f14967x;
    }

    public void was() {
        ((LocalRingFragment) m6705z()).f3f();
    }

    public boolean wo(Resource r2) {
        return r2 == this.f14964u;
    }

    public void zsr0(boolean picker, String currentPath, String ringtoneType, int ringtoneFlag) {
        this.f14966w = picker;
        this.f14959d = ((picker || qo()) && currentPath != null) ? currentPath.replace("product", "system") : null;
        this.f60775ab = ringtoneType;
        this.bb = ringtoneFlag;
    }
}
