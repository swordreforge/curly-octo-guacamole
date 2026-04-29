package com.android.thememanager.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.OriginalViewPager;
import com.android.thememanager.R;
import com.android.thememanager.activity.t8r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: SecondaryTabActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class n2t extends ThemeTabActivity {
    protected bf2 aj;
    private ViewPager ay;
    protected LinearLayout be;
    protected LayoutInflater k0;
    protected Map<String, View> bs = new HashMap();
    private OriginalViewPager.InterfaceC1274p ar = new C1613k();

    /* JADX INFO: renamed from: com.android.thememanager.activity.n2t$k */
    /* JADX INFO: compiled from: SecondaryTabActivity.java */
    class C1613k implements OriginalViewPager.InterfaceC1274p {
        C1613k() {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        /* JADX INFO: renamed from: k */
        public void mo5546k(int state) {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void toq(int position) {
            n2t n2tVar = n2t.this;
            n2tVar.be.getChildAt(n2tVar.f9333e).setSelected(false);
            n2t.this.be.getChildAt(position).setSelected(true);
            n2t n2tVar2 = n2t.this;
            int i2 = n2tVar2.f9333e;
            if (position != i2) {
                if (i2 > -1) {
                    n2tVar2.cfr(i2, false);
                }
                n2t n2tVar3 = n2t.this;
                n2tVar3.f9333e = position;
                n2tVar3.cfr(position, true);
            }
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void zy(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: compiled from: SecondaryTabActivity.java */
    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f9246k;

        toq(final int val$index) {
            this.f9246k = val$index;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            n2t.this.ay.setCurrentItem(this.f9246k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cfr(int position, boolean visible) {
        Fragment fragmentM6391z = this.aj.m6391z(position, false);
        if (fragmentM6391z instanceof C1582h) {
            ((C1582h) fragmentM6391z).nnh(visible);
        }
    }

    @Override // com.android.thememanager.activity.t8r
    protected void bwp(List<t8r.C1625k> tabs) {
        this.k0 = LayoutInflater.from(this);
        setContentView(R.layout.secondary_tab_activity);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        this.ay = viewPager;
        viewPager.setOffscreenPageLimit(tabs.size() - 1);
        this.ay.zy(this.ar);
        this.aj = new bf2(this, getSupportFragmentManager(), this.ay);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tablayout);
        this.be = linearLayout;
        linearLayout.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        for (int i2 = 0; i2 < tabs.size(); i2++) {
            t8r.C1625k c1625k = tabs.get(i2);
            View viewH4b = h4b(i2, c1625k);
            viewH4b.setOnClickListener(new toq(i2));
            this.be.addView(viewH4b, layoutParams);
            this.bs.put(c1625k.f9337k, viewH4b);
            this.aj.ni7(c1625k.f9337k, c1625k.f57348toq, c1625k.f57349zy);
            Fragment fragmentM6391z = this.aj.m6391z(i2, true);
            if (fragmentM6391z instanceof C1582h) {
                ((C1582h) fragmentM6391z).cyoe(c1625k.f57349zy);
            }
        }
        int iZ4 = z4();
        Fragment fragmentM6391z2 = this.aj.m6391z(iZ4, true);
        if (fragmentM6391z2 instanceof C1582h) {
            this.f9333e = iZ4;
            C1582h c1582h = (C1582h) fragmentM6391z2;
            this.f9334j = c1582h;
            c1582h.nnh(true);
        }
        if (iZ4 == this.ay.getCurrentItem()) {
            this.be.getChildAt(iZ4).setSelected(true);
        }
        this.ay.setCurrentItem(iZ4);
    }

    protected View h4b(int index, t8r.C1625k info) {
        TextView textView = (TextView) this.k0.inflate(R.layout.resource_secondary_tab, (ViewGroup) null);
        textView.setText(info.f9337k);
        return textView;
    }

    public void wlev(String tag, String text) {
        ((TextView) this.bs.get(tag)).setText(text);
    }
}
