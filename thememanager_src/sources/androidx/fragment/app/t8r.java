package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.kja0;
import androidx.viewpager.widget.AbstractC1288k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class t8r extends AbstractC1288k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final boolean f51537ld6 = false;

    /* JADX INFO: renamed from: p */
    private static final String f4910p = "FragmentPagerAdapter";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f51538qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @Deprecated
    public static final int f51539x2 = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private o1t f51540f7l8;

    /* JADX INFO: renamed from: g */
    private final int f4911g;

    /* JADX INFO: renamed from: n */
    private final FragmentManager f4912n;

    /* JADX INFO: renamed from: s */
    private boolean f4913s;

    /* JADX INFO: renamed from: y */
    private Fragment f4914y;

    @Deprecated
    public t8r(@lvui FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String fu4(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void cdj(@lvui ViewGroup viewGroup, int i2, @lvui Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f4914y;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f4911g == 1) {
                    if (this.f51540f7l8 == null) {
                        this.f51540f7l8 = this.f4912n.ki();
                    }
                    this.f51540f7l8.eqxt(this.f4914y, kja0.zy.STARTED);
                } else {
                    this.f4914y.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f4911g == 1) {
                if (this.f51540f7l8 == null) {
                    this.f51540f7l8 = this.f4912n.ki();
                }
                this.f51540f7l8.eqxt(fragment, kja0.zy.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f4914y = fragment;
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
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public boolean ld6(@lvui View view, @lvui Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void n7h(@dd Parcelable parcelable, @dd ClassLoader classLoader) {
    }

    public long ni7(int i2) {
        return i2;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    @lvui
    /* JADX INFO: renamed from: p */
    public Object mo4276p(@lvui ViewGroup viewGroup, int i2) {
        if (this.f51540f7l8 == null) {
            this.f51540f7l8 = this.f4912n.ki();
        }
        long jNi7 = ni7(i2);
        Fragment fragmentNmn5 = this.f4912n.nmn5(fu4(viewGroup.getId(), jNi7));
        if (fragmentNmn5 != null) {
            this.f51540f7l8.x2(fragmentNmn5);
        } else {
            fragmentNmn5 = zurt(i2);
            this.f51540f7l8.zy(viewGroup.getId(), fragmentNmn5, fu4(viewGroup.getId(), jNi7));
        }
        if (fragmentNmn5 != this.f4914y) {
            fragmentNmn5.setMenuVisibility(false);
            if (this.f4911g == 1) {
                this.f51540f7l8.eqxt(fragmentNmn5, kja0.zy.STARTED);
            } else {
                fragmentNmn5.setUserVisibleHint(false);
            }
        }
        return fragmentNmn5;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: q */
    public void mo4277q(@lvui ViewGroup viewGroup) {
        o1t o1tVar = this.f51540f7l8;
        if (o1tVar != null) {
            if (!this.f4913s) {
                try {
                    this.f4913s = true;
                    o1tVar.mo4296h();
                } finally {
                    this.f4913s = false;
                }
            }
            this.f51540f7l8 = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(@lvui ViewGroup viewGroup, int i2, @lvui Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f51540f7l8 == null) {
            this.f51540f7l8 = this.f4912n.ki();
        }
        this.f51540f7l8.ki(fragment);
        if (fragment.equals(this.f4914y)) {
            this.f4914y = null;
        }
    }

    @lvui
    public abstract Fragment zurt(int i2);

    public t8r(@lvui FragmentManager fragmentManager, int i2) {
        this.f51540f7l8 = null;
        this.f4914y = null;
        this.f4912n = fragmentManager;
        this.f4911g = i2;
    }
}
