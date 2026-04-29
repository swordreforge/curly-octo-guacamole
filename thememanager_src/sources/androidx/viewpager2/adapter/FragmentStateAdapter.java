package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.C0252s;
import androidx.core.util.n7h;
import androidx.core.view.C0683f;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC1060y<C1295k> implements androidx.viewpager2.adapter.toq {

    /* JADX INFO: renamed from: i */
    private static final String f7047i = "f#";

    /* JADX INFO: renamed from: t */
    private static final long f7048t = 10000;

    /* JADX INFO: renamed from: z */
    private static final String f7049z = "s#";

    /* JADX INFO: renamed from: g */
    private final C0252s<Fragment.SavedState> f7050g;

    /* JADX INFO: renamed from: h */
    private boolean f7051h;

    /* JADX INFO: renamed from: k */
    final kja0 f7052k;

    /* JADX INFO: renamed from: n */
    final C0252s<Fragment> f7053n;

    /* JADX INFO: renamed from: p */
    boolean f7054p;

    /* JADX INFO: renamed from: q */
    final FragmentManager f7055q;

    /* JADX INFO: renamed from: s */
    private FragmentMaxLifecycleEnforcer f7056s;

    /* JADX INFO: renamed from: y */
    private final C0252s<Integer> f7057y;

    class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: k */
        private ViewPager2.OnPageChangeCallback f7064k;

        /* JADX INFO: renamed from: n */
        private long f7065n = -1;

        /* JADX INFO: renamed from: q */
        private ViewPager2 f7066q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private RecyclerView.AbstractC1053p f53694toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private fn3e f53695zy;

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$k */
        class C1292k extends ViewPager2.OnPageChangeCallback {
            C1292k() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i2) {
                FragmentMaxLifecycleEnforcer.this.m5584q(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i2) {
                FragmentMaxLifecycleEnforcer.this.m5584q(false);
            }
        }

        class toq extends AbstractC1294q {
            toq() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC1294q, androidx.recyclerview.widget.RecyclerView.AbstractC1053p
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.m5584q(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @lvui
        /* JADX INFO: renamed from: k */
        private ViewPager2 m5583k(@lvui RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* JADX INFO: renamed from: q */
        void m5584q(boolean z2) {
            int currentItem;
            Fragment fragmentN7h;
            if (FragmentStateAdapter.this.n5r1() || this.f7066q.getScrollState() != 0 || FragmentStateAdapter.this.f7053n.t8r() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f7066q.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f7065n || z2) && (fragmentN7h = FragmentStateAdapter.this.f7053n.n7h(itemId)) != null && fragmentN7h.isAdded()) {
                this.f7065n = itemId;
                o1t o1tVarKi = FragmentStateAdapter.this.f7055q.ki();
                Fragment fragment = null;
                for (int i2 = 0; i2 < FragmentStateAdapter.this.f7053n.jk(); i2++) {
                    long jM877i = FragmentStateAdapter.this.f7053n.m877i(i2);
                    Fragment fragmentA9 = FragmentStateAdapter.this.f7053n.a9(i2);
                    if (fragmentA9.isAdded()) {
                        if (jM877i != this.f7065n) {
                            o1tVarKi.eqxt(fragmentA9, kja0.zy.STARTED);
                        } else {
                            fragment = fragmentA9;
                        }
                        fragmentA9.setMenuVisibility(jM877i == this.f7065n);
                    }
                }
                if (fragment != null) {
                    o1tVarKi.eqxt(fragment, kja0.zy.RESUMED);
                }
                if (o1tVarKi.ni7()) {
                    return;
                }
                o1tVarKi.kja0();
            }
        }

        void toq(@lvui RecyclerView recyclerView) {
            this.f7066q = m5583k(recyclerView);
            C1292k c1292k = new C1292k();
            this.f7064k = c1292k;
            this.f7066q.registerOnPageChangeCallback(c1292k);
            toq toqVar = new toq();
            this.f53694toq = toqVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(toqVar);
            fn3e fn3eVar = new fn3e() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.fn3e
                public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar2) {
                    FragmentMaxLifecycleEnforcer.this.m5584q(false);
                }
            };
            this.f53695zy = fn3eVar;
            FragmentStateAdapter.this.f7052k.mo4451k(fn3eVar);
        }

        void zy(@lvui RecyclerView recyclerView) {
            m5583k(recyclerView).unregisterOnPageChangeCallback(this.f7064k);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f53694toq);
            FragmentStateAdapter.this.f7052k.zy(this.f53695zy);
            this.f7066q = null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$k */
    class ViewOnLayoutChangeListenerC1293k implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ FrameLayout f7070k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C1295k f7072q;

        ViewOnLayoutChangeListenerC1293k(FrameLayout frameLayout, C1295k c1295k) {
            this.f7070k = frameLayout;
            this.f7072q = c1295k;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (this.f7070k.getParent() != null) {
                this.f7070k.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.dd(this.f7072q);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$q */
    private static abstract class AbstractC1294q extends RecyclerView.AbstractC1053p {
        private AbstractC1294q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public final void onItemRangeMoved(int i2, int i3, int i4) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }

        /* synthetic */ AbstractC1294q(ViewOnLayoutChangeListenerC1293k viewOnLayoutChangeListenerC1293k) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public final void onItemRangeChanged(int i2, int i3, @dd Object obj) {
            onChanged();
        }
    }

    class toq extends FragmentManager.qrj {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Fragment f7073k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ FrameLayout f53696toq;

        toq(Fragment fragment, FrameLayout frameLayout) {
            this.f7073k = fragment;
            this.f53696toq = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.qrj
        public void qrj(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @lvui View view, @dd Bundle bundle) {
            if (fragment == this.f7073k) {
                fragmentManager.cnbm(this);
                FragmentStateAdapter.this.cdj(view, this.f53696toq);
            }
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f7054p = false;
            fragmentStateAdapter.m5582z();
        }
    }

    public FragmentStateAdapter(@lvui ActivityC0891q activityC0891q) {
        this(activityC0891q.getSupportFragmentManager(), activityC0891q.getLifecycle());
    }

    private void fu4(int i2) {
        long itemId = getItemId(i2);
        if (this.f7053n.m876g(itemId)) {
            return;
        }
        Fragment fragmentFn3e = fn3e(i2);
        fragmentFn3e.setInitialSavedState(this.f7050g.n7h(itemId));
        this.f7053n.fn3e(itemId, fragmentFn3e);
    }

    /* JADX INFO: renamed from: l */
    private void m5578l(Fragment fragment, @lvui FrameLayout frameLayout) {
        this.f7055q.m28244do(new toq(fragment, frameLayout), false);
    }

    private void ncyb() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final zy zyVar = new zy();
        this.f7052k.mo4451k(new fn3e() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
                if (toqVar == kja0.toq.ON_DESTROY) {
                    handler.removeCallbacks(zyVar);
                    interfaceC0954z.getLifecycle().zy(this);
                }
            }
        });
        handler.postDelayed(zyVar, f7048t);
    }

    @lvui
    private static String ni7(@lvui String str, long j2) {
        return str + j2;
    }

    private boolean o1t(long j2) {
        View view;
        if (this.f7057y.m876g(j2)) {
            return true;
        }
        Fragment fragmentN7h = this.f7053n.n7h(j2);
        return (fragmentN7h == null || (view = fragmentN7h.getView()) == null || view.getParent() == null) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    private static long m5579r(@lvui String str, @lvui String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* JADX INFO: renamed from: t */
    private Long m5580t(int i2) {
        Long lValueOf = null;
        for (int i3 = 0; i3 < this.f7057y.jk(); i3++) {
            if (this.f7057y.a9(i3).intValue() == i2) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f7057y.m877i(i3));
            }
        }
        return lValueOf;
    }

    private static boolean wvg(@lvui String str, @lvui String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private void x9kr(long j2) {
        ViewParent parent;
        Fragment fragmentN7h = this.f7053n.n7h(j2);
        if (fragmentN7h == null) {
            return;
        }
        if (fragmentN7h.getView() != null && (parent = fragmentN7h.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!ki(j2)) {
            this.f7050g.fu4(j2);
        }
        if (!fragmentN7h.isAdded()) {
            this.f7053n.fu4(j2);
            return;
        }
        if (n5r1()) {
            this.f7051h = true;
            return;
        }
        if (fragmentN7h.isAdded() && ki(j2)) {
            this.f7050g.fn3e(j2, this.f7055q.wlev(fragmentN7h));
        }
        this.f7055q.ki().fu4(fragmentN7h).kja0();
        this.f7053n.fu4(j2);
    }

    void cdj(@lvui View view, @lvui FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@lvui C1295k c1295k) {
        dd(c1295k);
        m5582z();
    }

    void dd(@lvui final C1295k c1295k) {
        Fragment fragmentN7h = this.f7053n.n7h(c1295k.getItemId());
        if (fragmentN7h == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutFn3e = c1295k.fn3e();
        View view = fragmentN7h.getView();
        if (!fragmentN7h.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentN7h.isAdded() && view == null) {
            m5578l(fragmentN7h, frameLayoutFn3e);
            return;
        }
        if (fragmentN7h.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutFn3e) {
                cdj(view, frameLayoutFn3e);
                return;
            }
            return;
        }
        if (fragmentN7h.isAdded()) {
            cdj(view, frameLayoutFn3e);
            return;
        }
        if (n5r1()) {
            if (this.f7055q.r8s8()) {
                return;
            }
            this.f7052k.mo4451k(new fn3e() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.fn3e
                public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
                    if (FragmentStateAdapter.this.n5r1()) {
                        return;
                    }
                    interfaceC0954z.getLifecycle().zy(this);
                    if (C0683f.zsr0(c1295k.fn3e())) {
                        FragmentStateAdapter.this.dd(c1295k);
                    }
                }
            });
            return;
        }
        m5578l(fragmentN7h, frameLayoutFn3e);
        this.f7055q.ki().f7l8(fragmentN7h, "f" + c1295k.getItemId()).eqxt(fragmentN7h, kja0.zy.STARTED).kja0();
        this.f7056s.m5584q(false);
    }

    @lvui
    public abstract Fragment fn3e(int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public long getItemId(int i2) {
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: jk, reason: merged with bridge method [inline-methods] */
    public final C1295k onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        return C1295k.ki(viewGroup);
    }

    @Override // androidx.viewpager2.adapter.toq
    @lvui
    /* JADX INFO: renamed from: k */
    public final Parcelable mo5581k() {
        Bundle bundle = new Bundle(this.f7053n.jk() + this.f7050g.jk());
        for (int i2 = 0; i2 < this.f7053n.jk(); i2++) {
            long jM877i = this.f7053n.m877i(i2);
            Fragment fragmentN7h = this.f7053n.n7h(jM877i);
            if (fragmentN7h != null && fragmentN7h.isAdded()) {
                this.f7055q.ixz(bundle, ni7(f7047i, jM877i), fragmentN7h);
            }
        }
        for (int i3 = 0; i3 < this.f7050g.jk(); i3++) {
            long jM877i2 = this.f7050g.m877i(i3);
            if (ki(jM877i2)) {
                bundle.putParcelable(ni7(f7049z, jM877i2), this.f7050g.n7h(jM877i2));
            }
        }
        return bundle;
    }

    public boolean ki(long j2) {
        return j2 >= 0 && j2 < ((long) getItemCount());
    }

    @Override // androidx.viewpager2.adapter.toq
    public final void ld6(@lvui Parcelable parcelable) {
        if (!this.f7050g.t8r() || !this.f7053n.t8r()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (wvg(str, f7047i)) {
                this.f7053n.fn3e(m5579r(str, f7047i), this.f7055q.m4196d(bundle, str));
            } else {
                if (!wvg(str, f7049z)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jM5579r = m5579r(str, f7049z);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (ki(jM5579r)) {
                    this.f7050g.fn3e(jM5579r, savedState);
                }
            }
        }
        if (this.f7053n.t8r()) {
            return;
        }
        this.f7051h = true;
        this.f7054p = true;
        m5582z();
        ncyb();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@lvui C1295k c1295k) {
        Long lM5580t = m5580t(c1295k.fn3e().getId());
        if (lM5580t != null) {
            x9kr(lM5580t.longValue());
            this.f7057y.fu4(lM5580t.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: mcp, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@lvui C1295k c1295k, int i2) {
        long itemId = c1295k.getItemId();
        int id = c1295k.fn3e().getId();
        Long lM5580t = m5580t(id);
        if (lM5580t != null && lM5580t.longValue() != itemId) {
            x9kr(lM5580t.longValue());
            this.f7057y.fu4(lM5580t.longValue());
        }
        this.f7057y.fn3e(itemId, Integer.valueOf(id));
        fu4(i2);
        FrameLayout frameLayoutFn3e = c1295k.fn3e();
        if (C0683f.zsr0(frameLayoutFn3e)) {
            if (frameLayoutFn3e.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutFn3e.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1293k(frameLayoutFn3e, c1295k));
        }
        m5582z();
    }

    boolean n5r1() {
        return this.f7055q.w831();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: oc, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@lvui C1295k c1295k) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7842s
    public void onAttachedToRecyclerView(@lvui RecyclerView recyclerView) {
        n7h.m2975k(this.f7056s == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f7056s = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.toq(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7842s
    public void onDetachedFromRecyclerView(@lvui RecyclerView recyclerView) {
        this.f7056s.zy(recyclerView);
        this.f7056s = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public final void setHasStableIds(boolean z2) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* JADX INFO: renamed from: z */
    void m5582z() {
        if (!this.f7051h || n5r1()) {
            return;
        }
        androidx.collection.zy zyVar = new androidx.collection.zy();
        for (int i2 = 0; i2 < this.f7053n.jk(); i2++) {
            long jM877i = this.f7053n.m877i(i2);
            if (!ki(jM877i)) {
                zyVar.add(Long.valueOf(jM877i));
                this.f7057y.fu4(jM877i);
            }
        }
        if (!this.f7054p) {
            this.f7051h = false;
            for (int i3 = 0; i3 < this.f7053n.jk(); i3++) {
                long jM877i2 = this.f7053n.m877i(i3);
                if (!o1t(jM877i2)) {
                    zyVar.add(Long.valueOf(jM877i2));
                }
            }
        }
        Iterator<E> it = zyVar.iterator();
        while (it.hasNext()) {
            x9kr(((Long) it.next()).longValue());
        }
    }

    public FragmentStateAdapter(@lvui Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@lvui FragmentManager fragmentManager, @lvui kja0 kja0Var) {
        this.f7053n = new C0252s<>();
        this.f7050g = new C0252s<>();
        this.f7057y = new C0252s<>();
        this.f7054p = false;
        this.f7051h = false;
        this.f7055q = fragmentManager;
        this.f7052k = kja0Var;
        super.setHasStableIds(true);
    }
}
