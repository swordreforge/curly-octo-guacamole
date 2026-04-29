package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.tabs.q */
/* JADX INFO: compiled from: TabLayoutMediator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C4146q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f67913f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private RecyclerView.AbstractC1060y<?> f25193g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final TabLayout f25194k;

    /* JADX INFO: renamed from: n */
    private final toq f25195n;

    /* JADX INFO: renamed from: p */
    @dd
    private RecyclerView.AbstractC1053p f25196p;

    /* JADX INFO: renamed from: q */
    private final boolean f25197q;

    /* JADX INFO: renamed from: s */
    @dd
    private TabLayout.InterfaceC4138g f25198s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final ViewPager2 f67914toq;

    /* JADX INFO: renamed from: y */
    @dd
    private zy f25199y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f67915zy;

    /* JADX INFO: renamed from: com.google.android.material.tabs.q$k */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    private class k extends RecyclerView.AbstractC1053p {
        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            C4146q.this.m15008q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3) {
            C4146q.this.m15008q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int i2, int i3) {
            C4146q.this.m15008q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int i2, int i3, int i4) {
            C4146q.this.m15008q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int i2, int i3) {
            C4146q.this.m15008q();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3, @dd Object obj) {
            C4146q.this.m15008q();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.q$q */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    private static class q implements TabLayout.InterfaceC4138g {

        /* JADX INFO: renamed from: k */
        private final ViewPager2 f25201k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f67916toq;

        q(ViewPager2 viewPager2, boolean z2) {
            this.f25201k = viewPager2;
            this.f67916toq = z2;
        }

        @Override // com.google.android.material.tabs.TabLayout.zy
        /* JADX INFO: renamed from: k */
        public void mo14983k(@lvui TabLayout.C4143s c4143s) {
            this.f25201k.setCurrentItem(c4143s.ld6(), this.f67916toq);
        }

        @Override // com.google.android.material.tabs.TabLayout.zy
        public void toq(TabLayout.C4143s c4143s) {
        }

        @Override // com.google.android.material.tabs.TabLayout.zy
        public void zy(TabLayout.C4143s c4143s) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.q$toq */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m15009k(@lvui TabLayout.C4143s c4143s, int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.q$zy */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    private static class zy extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: k */
        @lvui
        private final WeakReference<TabLayout> f25202k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f67917toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f67918zy;

        zy(TabLayout tabLayout) {
            this.f25202k = new WeakReference<>(tabLayout);
            m15010k();
        }

        /* JADX INFO: renamed from: k */
        void m15010k() {
            this.f67918zy = 0;
            this.f67917toq = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i2) {
            this.f67917toq = this.f67918zy;
            this.f67918zy = i2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i2, float f2, int i3) {
            TabLayout tabLayout = this.f25202k.get();
            if (tabLayout != null) {
                int i4 = this.f67918zy;
                tabLayout.setScrollPosition(i2, f2, i4 != 2 || this.f67917toq == 1, (i4 == 2 && this.f67917toq == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
            TabLayout tabLayout = this.f25202k.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f67918zy;
            tabLayout.dd(tabLayout.o1t(i2), i3 == 0 || (i3 == 2 && this.f67917toq == 0));
        }
    }

    public C4146q(@lvui TabLayout tabLayout, @lvui ViewPager2 viewPager2, @lvui toq toqVar) {
        this(tabLayout, viewPager2, true, toqVar);
    }

    /* JADX INFO: renamed from: k */
    public void m15007k() {
        if (this.f67913f7l8) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.AbstractC1060y<?> adapter = this.f67914toq.getAdapter();
        this.f25193g = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f67913f7l8 = true;
        zy zyVar = new zy(this.f25194k);
        this.f25199y = zyVar;
        this.f67914toq.registerOnPageChangeCallback(zyVar);
        q qVar = new q(this.f67914toq, this.f25197q);
        this.f25198s = qVar;
        this.f25194k.m14969q(qVar);
        if (this.f67915zy) {
            k kVar = new k();
            this.f25196p = kVar;
            this.f25193g.registerAdapterDataObserver(kVar);
        }
        m15008q();
        this.f25194k.setScrollPosition(this.f67914toq.getCurrentItem(), 0.0f, true);
    }

    /* JADX INFO: renamed from: q */
    void m15008q() {
        this.f25194k.gvn7();
        RecyclerView.AbstractC1060y<?> abstractC1060y = this.f25193g;
        if (abstractC1060y != null) {
            int itemCount = abstractC1060y.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                TabLayout.C4143s c4143sA9 = this.f25194k.a9();
                this.f25195n.m15009k(c4143sA9, i2);
                this.f25194k.m14972y(c4143sA9, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f67914toq.getCurrentItem(), this.f25194k.getTabCount() - 1);
                if (iMin != this.f25194k.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f25194k;
                    tabLayout.m14970r(tabLayout.o1t(iMin));
                }
            }
        }
    }

    public void toq() {
        RecyclerView.AbstractC1060y<?> abstractC1060y;
        if (this.f67915zy && (abstractC1060y = this.f25193g) != null) {
            abstractC1060y.unregisterAdapterDataObserver(this.f25196p);
            this.f25196p = null;
        }
        this.f25194k.oc(this.f25198s);
        this.f67914toq.unregisterOnPageChangeCallback(this.f25199y);
        this.f25198s = null;
        this.f25199y = null;
        this.f25193g = null;
        this.f67913f7l8 = false;
    }

    public boolean zy() {
        return this.f67913f7l8;
    }

    public C4146q(@lvui TabLayout tabLayout, @lvui ViewPager2 viewPager2, boolean z2, @lvui toq toqVar) {
        this(tabLayout, viewPager2, z2, true, toqVar);
    }

    public C4146q(@lvui TabLayout tabLayout, @lvui ViewPager2 viewPager2, boolean z2, boolean z3, @lvui toq toqVar) {
        this.f25194k = tabLayout;
        this.f67914toq = viewPager2;
        this.f67915zy = z2;
        this.f25197q = z3;
        this.f25195n = toqVar;
    }
}
