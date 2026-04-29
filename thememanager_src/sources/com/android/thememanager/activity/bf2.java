package com.android.thememanager.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.AbstractC1288k;
import com.android.thememanager.qrj;
import java.util.ArrayList;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: FragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class bf2 extends AbstractC1288k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ViewPager f57290f7l8;

    /* JADX INFO: renamed from: g */
    private FragmentManager f8935g;

    /* JADX INFO: renamed from: n */
    private Context f8936n;

    /* JADX INFO: renamed from: y */
    private ArrayList<qrj.C2321k> f8939y = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    private androidx.fragment.app.o1t f8938s = null;

    /* JADX INFO: renamed from: p */
    private Fragment f8937p = null;

    public bf2(Context context, FragmentManager fm, ViewPager viewPager) {
        this.f8936n = context;
        this.f8935g = fm;
        this.f57290f7l8 = viewPager;
        viewPager.setAdapter(this);
    }

    private qrj.C2321k fu4(String tag) {
        for (qrj.C2321k c2321k : this.f8939y) {
            if (TextUtils.equals(c2321k.f13525k, tag)) {
                return c2321k;
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void cdj(ViewGroup container, int position, Object object) {
        Fragment fragment = (Fragment) object;
        Fragment fragment2 = this.f8937p;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f8937p.setUserVisibleHint(false);
                Fragment fragment3 = this.f8937p;
                if (fragment3 instanceof C1582h) {
                    ((C1582h) fragment3).nnh(false);
                }
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            if (fragment != null && (fragment instanceof C1582h)) {
                ((C1582h) fragment).nnh(true);
            }
            this.f8937p = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public CharSequence f7l8(int arg0) {
        return this.f8939y.get(arg0).f13525k;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: g */
    public int mo5572g(Object object) {
        int size = this.f8939y.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (object == this.f8939y.get(i2).f13526n) {
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
        return this.f8939y.size();
    }

    public boolean ni7(String tag, Class<? extends Fragment> clazz, Bundle args) {
        if (fu4(tag) != null) {
            return false;
        }
        this.f8939y.add(new qrj.C2321k(tag, clazz, args));
        x2();
        return true;
    }

    public int o1t(String tag) {
        int size = this.f8939y.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(this.f8939y.get(i2).f13525k, tag)) {
                return i2;
            }
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: p */
    public Object mo4276p(ViewGroup container, int position) {
        if (this.f8938s == null) {
            this.f8938s = this.f8935g.ki();
        }
        Fragment fragmentM6391z = m6391z(position, true);
        if (fragmentM6391z.getFragmentManager() != null) {
            this.f8938s.x2(fragmentM6391z);
        } else {
            this.f8938s.zy(container.getId(), fragmentM6391z, this.f8939y.get(position).f13525k);
        }
        if (fragmentM6391z != this.f8937p) {
            fragmentM6391z.setMenuVisibility(false);
            fragmentM6391z.setUserVisibleHint(false);
            ((C1582h) fragmentM6391z).nnh(false);
        }
        return fragmentM6391z;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: q */
    public void mo4277q(ViewGroup container) {
        androidx.fragment.app.o1t o1tVar = this.f8938s;
        if (o1tVar != null) {
            o1tVar.mo4296h();
            this.f8938s = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m6390t(String tag) {
        qrj.C2321k c2321kFu4 = fu4(tag);
        if (c2321kFu4 == null) {
            return false;
        }
        this.f8939y.remove(c2321kFu4);
        x2();
        return true;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(ViewGroup container, int position, Object object) {
        if (this.f8938s == null) {
            this.f8938s = this.f8935g.ki();
        }
        this.f8938s.ki((Fragment) object);
    }

    public boolean wvg(int position) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public Fragment m6391z(int position, boolean create) {
        qrj.C2321k c2321k = this.f8939y.get(position);
        if (c2321k.f13526n == null) {
            Fragment fragmentNmn5 = this.f8935g.nmn5(c2321k.f13525k);
            c2321k.f13526n = fragmentNmn5;
            if (fragmentNmn5 == null && create) {
                c2321k.f13526n = Fragment.instantiate(this.f8936n, c2321k.f60623toq.getName(), c2321k.f60624zy);
                c2321k.f60623toq = null;
                c2321k.f60624zy = null;
            }
        }
        return c2321k.f13526n;
    }

    public int zurt(String tag, int index, Class<? extends Fragment> clazz, Bundle args) {
        this.f8939y.add(index, new qrj.C2321k(tag, clazz, args));
        x2();
        return index;
    }
}
