package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.kja0;
import androidx.viewpager.widget.AbstractC1288k;
import java.util.ArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentStatePagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class fu4 extends AbstractC1288k {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f51480kja0 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @Deprecated
    public static final int f51481n7h = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final boolean f51482qrj = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f51483x2 = "FragmentStatePagerAdapt";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private o1t f51484f7l8;

    /* JADX INFO: renamed from: g */
    private final int f4784g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f51485ld6;

    /* JADX INFO: renamed from: n */
    private final FragmentManager f4785n;

    /* JADX INFO: renamed from: p */
    private Fragment f4786p;

    /* JADX INFO: renamed from: s */
    private ArrayList<Fragment> f4787s;

    /* JADX INFO: renamed from: y */
    private ArrayList<Fragment.SavedState> f4788y;

    @Deprecated
    public fu4(@lvui FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void cdj(@lvui ViewGroup viewGroup, int i2, @lvui Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4786p;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4784g == 1) {
                    if (this.f51484f7l8 == null) {
                        this.f51484f7l8 = this.f4785n.ki();
                    }
                    this.f51484f7l8.eqxt(this.f4786p, kja0.zy.STARTED);
                } else {
                    this.f4786p.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4784g == 1) {
                if (this.f51484f7l8 == null) {
                    this.f51484f7l8 = this.f4785n.ki();
                }
                this.f51484f7l8.eqxt(fragment, kja0.zy.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4786p = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: i */
    public void mo4275i(@lvui ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    @dd
    public Parcelable kja0() {
        Bundle bundle;
        if (this.f4788y.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f4788y.size()];
            this.f4788y.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.f4787s.size(); i2++) {
            Fragment fragment = this.f4787s.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f4785n.ixz(bundle, "f" + i2, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public boolean ld6(@lvui View view, @lvui Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void n7h(@dd Parcelable parcelable, @dd ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f4788y.clear();
            this.f4787s.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f4788y.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i2 = Integer.parseInt(str.substring(1));
                    Fragment fragmentM4196d = this.f4785n.m4196d(bundle, str);
                    if (fragmentM4196d != null) {
                        while (this.f4787s.size() <= i2) {
                            this.f4787s.add(null);
                        }
                        fragmentM4196d.setMenuVisibility(false);
                        this.f4787s.set(i2, fragmentM4196d);
                    } else {
                        Log.w(f51483x2, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    @lvui
    /* JADX INFO: renamed from: p */
    public Object mo4276p(@lvui ViewGroup viewGroup, int i2) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f4787s.size() > i2 && (fragment = this.f4787s.get(i2)) != null) {
            return fragment;
        }
        if (this.f51484f7l8 == null) {
            this.f51484f7l8 = this.f4785n.ki();
        }
        Fragment item = getItem(i2);
        if (this.f4788y.size() > i2 && (savedState = this.f4788y.get(i2)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.f4787s.size() <= i2) {
            this.f4787s.add(null);
        }
        item.setMenuVisibility(false);
        if (this.f4784g == 0) {
            item.setUserVisibleHint(false);
        }
        this.f4787s.set(i2, item);
        this.f51484f7l8.toq(viewGroup.getId(), item);
        if (this.f4784g == 1) {
            this.f51484f7l8.eqxt(item, kja0.zy.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: q */
    public void mo4277q(@lvui ViewGroup viewGroup) {
        o1t o1tVar = this.f51484f7l8;
        if (o1tVar != null) {
            if (!this.f51485ld6) {
                try {
                    this.f51485ld6 = true;
                    o1tVar.mo4296h();
                } finally {
                    this.f51485ld6 = false;
                }
            }
            this.f51484f7l8 = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(@lvui ViewGroup viewGroup, int i2, @lvui Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f51484f7l8 == null) {
            this.f51484f7l8 = this.f4785n.ki();
        }
        while (this.f4788y.size() <= i2) {
            this.f4788y.add(null);
        }
        this.f4788y.set(i2, fragment.isAdded() ? this.f4785n.wlev(fragment) : null);
        this.f4787s.set(i2, null);
        this.f51484f7l8.fu4(fragment);
        if (fragment.equals(this.f4786p)) {
            this.f4786p = null;
        }
    }

    @lvui
    /* JADX INFO: renamed from: zurt */
    public abstract Fragment getItem(int i2);

    public fu4(@lvui FragmentManager fragmentManager, int i2) {
        this.f51484f7l8 = null;
        this.f4788y = new ArrayList<>();
        this.f4787s = new ArrayList<>();
        this.f4786p = null;
        this.f4785n = fragmentManager;
        this.f4784g = i2;
    }
}
