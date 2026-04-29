package com.android.thememanager;

import android.graphics.Typeface;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.activity.lv5;
import com.android.thememanager.activity.nmn5;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.model.LargeIconSplitResource;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.List;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LargeIconAllCategoryAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class ki extends RecyclerView.AbstractC1060y<C2083k> {

    /* JADX INFO: renamed from: y */
    private static final String f12308y = "LargeIconAllCategoryAda";

    /* JADX INFO: renamed from: k */
    private lv5 f12310k;

    /* JADX INFO: renamed from: q */
    private WeakReference<nmn5> f12312q;

    /* JADX INFO: renamed from: g */
    private Typeface f12309g = Typeface.create(com.android.thememanager.util.dd.f16402k, 0);

    /* JADX INFO: renamed from: n */
    private Typeface f12311n = Typeface.create("mipro-regular", 0);

    /* JADX INFO: renamed from: com.android.thememanager.ki$k */
    /* JADX INFO: compiled from: LargeIconAllCategoryAdapter.java */
    public static class C2083k extends RecyclerView.fti {

        /* JADX INFO: renamed from: g */
        private WeakReference<nmn5> f12313g;

        /* JADX INFO: renamed from: k */
        private TextView f12314k;

        /* JADX INFO: renamed from: n */
        private lv5 f12315n;

        /* JADX INFO: renamed from: q */
        private LargeIconSplitResource f12316q;

        /* JADX INFO: renamed from: y */
        private ki f12317y;

        public C2083k(ki adapter, View itemView) {
            super(itemView);
            this.f12317y = adapter;
            this.f12313g = adapter.cdj();
            this.f12315n = adapter.ki();
            ni7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fu4(LargeIconSplitResource largeIconSplitResource) {
            if (this.f12316q == null) {
                return;
            }
            o1t(largeIconSplitResource);
        }

        private void ni7() {
            this.f12314k = (TextView) this.itemView.findViewById(R.id.title);
            C6077k.cdj(this.itemView);
            this.f12315n.hyr().m4391p((AbstractActivityC1717k) this.itemView.getContext(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.cdj
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    this.f10636k.fu4((LargeIconSplitResource) obj);
                }
            });
        }

        private void o1t(LargeIconSplitResource largeIconSplitResource) {
            if (largeIconSplitResource == null) {
                Log.w(ki.f12308y, "notifyButtonStatus: largeIconSplitResource is null");
            } else if (p029m.zy.m24738k(this.f12316q.getLink(), largeIconSplitResource.getLink())) {
                this.f12314k.setTextColor(this.itemView.getContext().getColor(R.color.large_icon_category_icon));
                this.f12314k.setTypeface(this.f12317y.ni7());
            } else {
                this.f12314k.setTextColor(this.itemView.getContext().getColor(R.color.de_color_60_000000));
                this.f12314k.setTypeface(this.f12317y.fu4());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m8006z(View view) {
            androidx.lifecycle.fti<LargeIconSplitResource> ftiVarHyr = this.f12315n.hyr();
            if (ftiVarHyr.m4388g() == null || this.f12316q == null || p029m.zy.m24738k(ftiVarHyr.m4388g().getLink(), this.f12316q.getLink())) {
                return;
            }
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(com.android.thememanager.basemodule.analysis.toq.tkle, ftiVarHyr.m4388g().getTitle());
            C1708s.f7l8().ld6().ni7(C1706p.m6650h(this.f12316q.getTitle(), null, null, com.android.thememanager.basemodule.analysis.toq.wime, arrayMap));
            if (this.f12313g.get() != null) {
                this.f12313g.get().wtop();
            }
            ftiVarHyr.cdj(this.f12316q);
        }

        public void wvg(LargeIconSplitResource item) {
            this.f12316q = item;
            this.f12314k.setText(item.getTitle());
            o1t(this.f12315n.hyr().m4388g());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12004k.m8006z(view);
                }
            });
        }
    }

    public ki(@InterfaceC7396q nmn5 largeIconAllFragment) {
        this.f12310k = largeIconAllFragment.ob();
        this.f12312q = new WeakReference<>(largeIconAllFragment);
    }

    private List<LargeIconSplitResource> fn3e() {
        return this.f12310k.m6434f().m4388g();
    }

    public WeakReference<nmn5> cdj() {
        return this.f12312q;
    }

    public Typeface fu4() {
        return this.f12311n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        if (y9n.mcp(fn3e())) {
            return 0;
        }
        return fn3e().size();
    }

    public lv5 ki() {
        return this.f12310k;
    }

    public Typeface ni7() {
        return this.f12309g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7396q
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public C2083k onCreateViewHolder(ViewGroup parent, int viewType) {
        return new C2083k(this, LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_icon_all_category_item, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@InterfaceC7396q C2083k holder, int position) {
        holder.wvg(fn3e().get(position));
    }
}
