package com.android.thememanager.view.largeicon;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.jp0y;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.presenter.zy;
import com.android.thememanager.recommend.view.listview.RecommendVMListView;
import com.android.thememanager.view.C2938r;
import com.google.android.exoplayer2.t8r;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.view.largeicon.q */
/* JADX INFO: compiled from: LargeIconPickerSelectorAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2927q<V extends com.android.thememanager.module.detail.presenter.zy> extends RecyclerView.AbstractC1060y<k> {

    /* JADX INFO: renamed from: i */
    private static final List<String> f17597i;

    /* JADX INFO: renamed from: g */
    private int f17598g;

    /* JADX INFO: renamed from: h */
    private int f17599h;

    /* JADX INFO: renamed from: k */
    private List<Integer> f17600k;

    /* JADX INFO: renamed from: n */
    private int f17601n;

    /* JADX INFO: renamed from: p */
    private int f17602p;

    /* JADX INFO: renamed from: q */
    private V f17603q;

    /* JADX INFO: renamed from: s */
    private long f17604s;

    /* JADX INFO: renamed from: y */
    private Toast f17605y;

    /* JADX INFO: renamed from: com.android.thememanager.view.largeicon.q$k */
    /* JADX INFO: compiled from: LargeIconPickerSelectorAdapter.java */
    protected static class k extends RecyclerView.fti {

        /* JADX INFO: renamed from: g */
        private final View f17606g;

        /* JADX INFO: renamed from: h */
        private final TextView f17607h;

        /* JADX INFO: renamed from: i */
        private int f17608i;

        /* JADX INFO: renamed from: k */
        private View f17609k;

        /* JADX INFO: renamed from: n */
        private final SmoothFrameLayout2 f17610n;

        /* JADX INFO: renamed from: p */
        private final com.android.thememanager.module.detail.presenter.zy f17611p;

        /* JADX INFO: renamed from: q */
        private C2927q f17612q;

        /* JADX INFO: renamed from: r */
        private int f17613r;

        /* JADX INFO: renamed from: s */
        private final int f17614s;

        /* JADX INFO: renamed from: t */
        private boolean f17615t;

        /* JADX INFO: renamed from: y */
        private final View f17616y;

        /* JADX INFO: renamed from: z */
        private int f17617z;

        public k(C2927q adapter, @lvui View itemView, com.android.thememanager.module.detail.presenter.zy viewModel, int viewType, int itemSize, int itemSlideLength, int titleMarginTop) {
            super(itemView);
            this.f17612q = adapter;
            this.f17611p = viewModel;
            this.f17614s = viewType;
            this.f17608i = itemSize;
            this.f17617z = itemSlideLength;
            this.f17613r = titleMarginTop;
            this.f17606g = itemView.findViewById(R.id.select_vh);
            this.f17610n = (SmoothFrameLayout2) itemView.findViewById(R.id.selector_logo);
            this.f17616y = itemView.findViewById(R.id.using_flag);
            this.f17607h = (TextView) itemView.findViewById(R.id.title);
            this.f17609k = itemView.findViewById(R.id.select_container);
            fu4(viewType);
            ni7(viewType);
            C6077k.cdj(itemView);
        }

        private void fu4(int viewType) {
            if (this.f17607h.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) this.f17607h.getLayoutParams()).topMargin = this.f17613r;
            }
            ViewGroup.LayoutParams layoutParams = this.f17609k.getLayoutParams();
            if (layoutParams == null) {
                int i2 = this.f17608i;
                layoutParams = new ViewGroup.LayoutParams(i2, i2);
            }
            int i3 = this.f17608i;
            layoutParams.width = i3;
            layoutParams.height = i3;
            this.f17609k.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f17610n.getLayoutParams();
            int i4 = this.f17617z;
            layoutParams2.width = i4;
            layoutParams2.height = i4;
            int i5 = 0;
            this.f17607h.setText(C2938r.toq(viewType));
            if (viewType != 1) {
                if (viewType == 2) {
                    layoutParams2.width *= 2;
                } else if (viewType == 3) {
                    layoutParams2.height *= 2;
                } else if (viewType == 4) {
                    layoutParams2.width *= 2;
                    layoutParams2.height *= 2;
                    i5 = R.dimen.large_icon_logo_corner_2_2;
                }
                i5 = R.dimen.large_icon_logo_corner_1_2;
            } else {
                i5 = R.dimen.large_icon_logo_corner_1_1;
            }
            this.f17610n.setCornerRadius(this.itemView.getContext().getResources().getDimensionPixelSize(i5));
        }

        private void ni7(int type) {
            this.f17611p.mo8330g((AbstractActivityC1717k) this.itemView.getContext(), new jp0y() { // from class: com.android.thememanager.view.largeicon.toq
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    this.f17618k.o1t((C2938r) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o1t(C2938r c2938r) {
            m10379t(c2938r.f61539zy, c2938r.f17676k);
            this.f17616y.setVisibility(c2938r.f17676k == this.f17614s ? 0 : 4);
        }

        /* JADX INFO: renamed from: t */
        private void m10379t(LargeIconElement element, int selectedType) {
            boolean zM10380z = m10380z(this.f17614s, element);
            this.f17615t = zM10380z;
            this.f17610n.setEnabled(zM10380z);
            this.f17606g.setEnabled(this.f17615t);
            if (selectedType == this.f17614s) {
                this.f17607h.setTextColor(this.itemView.getContext().getResources().getColor(R.color.large_icon_detail_head_select_item_color));
            } else {
                this.f17607h.setTextColor(this.itemView.getContext().getResources().getColor(this.f17615t ? R.color.large_icon_header_selector_title_enable : R.color.large_icon_header_selector_title_disable));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wvg(int i2, View view) {
            LargeIconElement largeIconElementFu4 = this.f17611p.fu4();
            if (this.f17615t || largeIconElementFu4 == null || !TextUtils.equals(largeIconElementFu4.id, LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID)) {
                this.f17611p.mo8331s(null, this.f17614s);
            } else {
                this.f17612q.fn3e(this.itemView.getContext(), i2, C2927q.f17597i.contains(largeIconElementFu4.packageName) && TextUtils.isEmpty(vyq.ni7("icons")));
            }
        }

        /* JADX INFO: renamed from: z */
        private boolean m10380z(int viewType, LargeIconElement element) {
            if (viewType != 1) {
                if (viewType != 2) {
                    if (viewType != 3) {
                        if (viewType != 4) {
                            throw new RuntimeException("error type");
                        }
                        if (element == null || element.preview_2_2 == null) {
                            return false;
                        }
                    } else if (element == null || element.preview_1_2 == null) {
                        return false;
                    }
                } else if (element == null || element.preview_2_1 == null) {
                    return false;
                }
            } else if (element == null || element.preview_1_1 == null) {
                return false;
            }
            return true;
        }

        public void mcp(final int viewType) {
            m10379t(this.f17611p.fu4(), this.f17611p.ni7());
            this.f17616y.setVisibility(this.f17611p.ni7() == this.f17614s ? 0 : 4);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.view.largeicon.zy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17619k.wvg(viewType, view);
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(3);
        f17597i = arrayList;
        arrayList.add("com.miui.weather2");
        arrayList.add(InterfaceC1789q.rxcq);
        arrayList.add("com.android.calendar");
    }

    public C2927q(V v2, int itemCount, int edgePadding, int centerPadding, int logoSlideLength, int titleMarginTop) {
        this.f17601n = 0;
        this.f17603q = v2;
        this.f17601n = RecommendVMListView.n7h(itemCount, edgePadding, centerPadding);
        this.f17598g = logoSlideLength;
        this.f17599h = titleMarginTop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(Context context, int viewType, boolean isDynamic) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f17602p != viewType || jCurrentTimeMillis - this.f17604s > t8r.f65475toq) {
                this.f17604s = jCurrentTimeMillis;
                this.f17602p = viewType;
                Toast toast = this.f17605y;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toastMakeText = Toast.makeText(context, String.format(context.getResources().getString(isDynamic ? R.string.dynamic_large_icon_not_support_current_type : R.string.large_icon_not_support_current_type), C2938r.toq(viewType)), 0);
                this.f17605y = toastMakeText;
                toastMakeText.show();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7396q
    @lvui
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public k onCreateViewHolder(@InterfaceC7396q @lvui ViewGroup parent, int viewType) {
        return new k(this, LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_selector_vh, parent, false), this.f17603q, viewType, this.f17601n, this.f17598g, this.f17599h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        List<Integer> list = this.f17600k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return this.f17600k.get(position).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(k holder, int position) {
        holder.mcp(this.f17600k.get(position).intValue());
    }

    /* JADX INFO: renamed from: z */
    public void m10378z(List<Integer> list) {
        this.f17600k = list;
    }
}
