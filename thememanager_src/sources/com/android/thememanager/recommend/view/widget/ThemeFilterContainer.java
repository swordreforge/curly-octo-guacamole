package com.android.thememanager.recommend.view.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeFilterContainer extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private int f14564g;

    /* JADX INFO: renamed from: k */
    private List<C2461k> f14565k;

    /* JADX INFO: renamed from: n */
    private int f14566n;

    /* JADX INFO: renamed from: q */
    private int f14567q;

    /* JADX INFO: renamed from: y */
    private int f14568y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ThemeFilterContainer$k */
    public class C2461k extends RecyclerView.AbstractC1060y<k> {

        /* JADX INFO: renamed from: k */
        private String[] f14570k;

        /* JADX INFO: renamed from: n */
        private toq f14571n;

        /* JADX INFO: renamed from: q */
        private boolean[] f14572q;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.ThemeFilterContainer$k$k */
        class k extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            TextView f14573k;

            k(@lvui View itemView) {
                super(itemView);
                this.f14573k = (TextView) itemView.findViewById(R.id.filter_title_tv);
            }
        }

        public C2461k(String[] mFilterTitleList, toq changeClickCallback) {
            this.f14570k = mFilterTitleList;
            this.f14571n = changeClickCallback;
            this.f14572q = new boolean[mFilterTitleList.length];
            ki();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(int i2, View view) {
            if (this.f14572q[i2]) {
                return;
            }
            this.f14571n.uj2j(this.f14570k[i2]);
            int i3 = 0;
            while (true) {
                boolean[] zArr = this.f14572q;
                if (i3 >= zArr.length) {
                    notifyDataSetChanged();
                    return;
                }
                if (i3 == i2) {
                    zArr[i3] = true;
                } else {
                    zArr[i3] = false;
                }
                i3++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public k onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
            return new k(LayoutInflater.from(ThemeFilterContainer.this.getContext()).inflate(R.layout.rc_filter_text, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f14570k.length;
        }

        public void ki() {
            for (int i2 = 0; i2 < this.f14570k.length; i2++) {
                if (i2 == 1) {
                    this.f14572q[i2] = true;
                } else {
                    this.f14572q[i2] = false;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public void mo6707z(@lvui k searcViewHolder, final int i2) {
            searcViewHolder.f14573k.setText(this.f14570k[i2]);
            if (i2 == 0) {
                searcViewHolder.f14573k.setTextColor(ThemeFilterContainer.this.getResources().getColor(R.color.search_title_color));
                searcViewHolder.f14573k.setBackground(null);
                searcViewHolder.f14573k.setEnabled(false);
                searcViewHolder.f14573k.setSelected(false);
                return;
            }
            if (this.f14572q[i2]) {
                searcViewHolder.f14573k.setBackgroundResource(R.drawable.search_subtitle_bg);
                searcViewHolder.f14573k.setTextColor(ThemeFilterContainer.this.getResources().getColor(R.color.search_sub_title_select_color));
                searcViewHolder.f14573k.setSelected(true);
                C6077k.m22367g(searcViewHolder.f14573k);
                C6077k.m22369i(searcViewHolder.f14573k);
            } else {
                searcViewHolder.f14573k.setBackground(null);
                searcViewHolder.f14573k.setSelected(false);
                searcViewHolder.f14573k.setTextColor(ThemeFilterContainer.this.getResources().getColor(R.color.search_sub_title_color));
                C6077k.m22367g(searcViewHolder.f14573k);
                C6077k.f7l8(searcViewHolder.f14573k);
            }
            searcViewHolder.f14573k.setEnabled(true);
            searcViewHolder.f14573k.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.widget.zy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14614k.fn3e(i2, view);
                }
            });
        }
    }

    public interface toq {
        void uj2j(String name);
    }

    public class zy extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f14575k;

        /* JADX INFO: renamed from: q */
        private int f14577q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60741toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60742zy;

        public zy(int left, int top, int right, int bottom) {
            this.f14575k = left;
            this.f60741toq = top;
            this.f60742zy = right;
            this.f14577q = bottom;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
            outRect.left = this.f14575k;
            outRect.right = this.f60742zy;
            outRect.bottom = this.f14577q;
            outRect.top = this.f60741toq;
        }
    }

    public ThemeFilterContainer(Context context) {
        super(context);
        this.f14568y = 1;
        toq(context);
    }

    private void toq(Context context) {
        this.f14567q = context.getResources().getDimensionPixelSize(R.dimen.search_title_margin_top);
        this.f14566n = context.getResources().getDimensionPixelSize(R.dimen.search_title_margin_right);
        this.f14564g = context.getResources().getDimensionPixelSize(R.dimen.search_title_margin_bottom);
    }

    /* JADX INFO: renamed from: k */
    public void m8839k(Map<String, String[]> searchMap, toq searchChangeCallback) {
        this.f14565k = new ArrayList();
        for (int i2 = 0; i2 < searchMap.size(); i2++) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setHorizontalScrollBarEnabled(false);
            C2461k c2461k = new C2461k(searchMap.get(i2 + ""), searchChangeCallback);
            recyclerView.addItemDecoration(new zy(0, this.f14567q, this.f14566n, this.f14564g));
            recyclerView.setAdapter(c2461k);
            this.f14565k.add(c2461k);
            recyclerView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, recyclerView.getMeasuredHeight()));
            addView(recyclerView);
        }
        setOrientation(1);
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f14568y = getMeasuredHeight();
    }

    public void setVisibleChange(boolean visible) {
        int i2 = this.f14568y;
        if (i2 == 1) {
            return;
        }
        if (visible) {
            C6077k.m22368h(this, 1, i2);
        } else {
            C6077k.m22368h(this, i2, 1);
        }
    }

    public void zy() {
        for (int i2 = 0; i2 < this.f14565k.size(); i2++) {
            this.f14565k.get(i2).ki();
            this.f14565k.get(i2).notifyDataSetChanged();
        }
    }

    public ThemeFilterContainer(Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.f14568y = 1;
        toq(context);
    }

    public ThemeFilterContainer(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14568y = 1;
    }
}
