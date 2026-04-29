package se;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o1t;
import androidx.viewpager.widget.AbstractC1288k;
import com.android.thememanager.basemodule.model.flextab.toq;
import com.android.thememanager.basemodule.views.NestViewPager;
import com.android.thememanager.recommend.view.fragment.ld6;
import java.util.ArrayList;

/* JADX INFO: renamed from: se.k */
/* JADX INFO: compiled from: FragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7669k extends AbstractC1288k implements NestViewPager.InterfaceC1846k<Fragment> {

    /* JADX INFO: renamed from: g */
    private ArrayList<toq> f44338g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Activity f94878ld6;

    /* JADX INFO: renamed from: n */
    private FragmentManager f44339n;

    /* JADX INFO: renamed from: p */
    private String f44340p;

    /* JADX INFO: renamed from: s */
    private String f44341s;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private o1t f94877f7l8 = null;

    /* JADX INFO: renamed from: y */
    private Fragment f44342y = null;

    public C7669k(Activity activity, FragmentManager fm, ArrayList<toq> flexTabs, String pageType, String tabType) {
        this.f94878ld6 = activity;
        this.f44339n = fm;
        this.f44338g = flexTabs;
        this.f44341s = pageType;
        this.f44340p = tabType;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void cdj(ViewGroup container, int position, Object object) {
        Fragment fragment = (Fragment) object;
        Fragment fragment2 = this.f44342y;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f44342y.setUserVisibleHint(false);
                Fragment fragment3 = this.f44342y;
                if (fragment3 instanceof com.android.thememanager.basemodule.base.toq) {
                    ((com.android.thememanager.basemodule.base.toq) fragment3).nnh(false);
                }
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            if (fragment instanceof com.android.thememanager.basemodule.base.toq) {
                ((com.android.thememanager.basemodule.base.toq) fragment).nnh(true);
            }
            this.f44342y = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public CharSequence f7l8(int arg0) {
        return this.f94878ld6.getResources().getString(this.f44338g.get(arg0).mo6879n());
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: g */
    public int mo5572g(Object object) {
        int size = this.f44338g.size();
        Fragment fragment = (Fragment) object;
        Resources resources = this.f94878ld6.getResources();
        for (int i2 = 0; i2 < size; i2++) {
            if (resources.getString(this.f44338g.get(i2).mo6879n()).equals(fragment.getTag())) {
                return i2;
            }
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: i */
    public void mo4275i(ViewGroup container) {
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public boolean ld6(View view, Object object) {
        return ((Fragment) object).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: n */
    public int mo5575n() {
        return this.f44338g.size();
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: p */
    public Object mo4276p(ViewGroup container, int position) {
        if (this.f94877f7l8 == null) {
            this.f94877f7l8 = this.f44339n.ki();
        }
        toq toqVar = this.f44338g.get(position);
        String string = this.f94878ld6.getResources().getString(this.f44338g.get(position).mo6879n());
        Fragment fragmentNmn5 = this.f44339n.nmn5(string);
        if (fragmentNmn5 != null) {
            this.f94877f7l8.x2(fragmentNmn5);
        } else {
            fragmentNmn5 = ld6.exv8(this.f44340p, toqVar.m6881q(), toqVar.f7l8(this.f44341s), toqVar.zy(this.f44341s), toqVar.mo6878k(this.f44341s));
            this.f94877f7l8.zy(container.getId(), fragmentNmn5, string);
        }
        if (fragmentNmn5 != this.f44342y) {
            fragmentNmn5.setMenuVisibility(false);
            fragmentNmn5.setUserVisibleHint(false);
            if (fragmentNmn5 instanceof com.android.thememanager.basemodule.base.toq) {
                ((com.android.thememanager.basemodule.base.toq) fragmentNmn5).nnh(false);
            }
        }
        return fragmentNmn5;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: q */
    public void mo4277q(ViewGroup container) {
        o1t o1tVar = this.f94877f7l8;
        if (o1tVar != null) {
            o1tVar.mo4296h();
            this.f94877f7l8 = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(ViewGroup container, int position, Object object) {
        if (this.f94877f7l8 == null) {
            this.f94877f7l8 = this.f44339n.ki();
        }
        this.f94877f7l8.ki((Fragment) object);
    }

    @Override // com.android.thememanager.basemodule.views.NestViewPager.InterfaceC1846k
    /* JADX INFO: renamed from: zurt, reason: merged with bridge method [inline-methods] */
    public Fragment getItem(int pos) {
        if (pos <= -1 || pos >= this.f44338g.size()) {
            return null;
        }
        return this.f44339n.nmn5(this.f94878ld6.getResources().getString(this.f44338g.get(pos).mo6879n()));
    }
}
