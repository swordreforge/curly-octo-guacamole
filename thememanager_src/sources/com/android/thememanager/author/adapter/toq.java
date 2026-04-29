package com.android.thememanager.author.adapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.fu4;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.author.fragment.C1662g;
import com.android.thememanager.author.fragment.C1665p;
import com.android.thememanager.author.fragment.qrj;
import com.android.thememanager.author.fragment.x2;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.views.NestViewPager;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.router.recommend.entity.AuthorEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: AuthorPagerAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class toq extends fu4 implements NestViewPager.InterfaceC1846k<Fragment> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @InterfaceC7396q
    private final AuthorEntity f57391cdj;

    /* JADX INFO: renamed from: h */
    @InterfaceC7396q
    private final FragmentManager f9568h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7396q
    private Map<Integer, C1582h> f9569i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @InterfaceC7396q
    private final C1662g f57392ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f57393t8r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toq(@InterfaceC7396q FragmentManager fm, @InterfaceC7396q AuthorEntity authorEntity, @InterfaceC7396q C1662g containerFragment) {
        super(fm);
        d2ok.m23075h(fm, "fm");
        d2ok.m23075h(authorEntity, "authorEntity");
        d2ok.m23075h(containerFragment, "containerFragment");
        this.f9568h = fm;
        this.f57391cdj = authorEntity;
        this.f57392ki = containerFragment;
        this.f9569i = new LinkedHashMap();
        this.f57393t8r = 0;
        if (authorEntity.getWidget()) {
            Map<Integer, C1582h> map = this.f9569i;
            Integer numValueOf = Integer.valueOf(this.f57393t8r);
            qrj qrjVar = new qrj();
            qrjVar.cyoe(ni7("WIDGET_SUIT"));
            map.put(numValueOf, qrjVar);
            this.f57393t8r++;
        }
        if (authorEntity.getLargeIcons()) {
            Map<Integer, C1582h> map2 = this.f9569i;
            Integer numValueOf2 = Integer.valueOf(this.f57393t8r);
            C1665p c1665p = new C1665p();
            c1665p.cyoe(ni7(InterfaceC1789q.ym5));
            map2.put(numValueOf2, c1665p);
            this.f57393t8r++;
        }
        if (authorEntity.getTheme()) {
            Map<Integer, C1582h> map3 = this.f9569i;
            Integer numValueOf3 = Integer.valueOf(this.f57393t8r);
            x2 x2Var = new x2();
            x2Var.cyoe(ni7(InterfaceC1789q.q68));
            map3.put(numValueOf3, x2Var);
            this.f57393t8r++;
        }
    }

    private final Bundle ni7(String str) {
        List<Page> pages;
        Page page;
        Bundle arguments = this.f57392ki.getArguments();
        zurt listUrl = null;
        Bundle bundleDeepCopy = arguments != null ? arguments.deepCopy() : null;
        PageGroup pageGroup = (PageGroup) com.android.thememanager.library.util.app.toq.toq(com.android.thememanager.library.util.app.toq.m8027g((PageGroup) (bundleDeepCopy != null ? bundleDeepCopy.getSerializable(InterfaceC1357q.f53848bf2) : null)), PageGroup.class);
        if (pageGroup != null && (pages = pageGroup.getPages()) != null && (page = pages.get(0)) != null) {
            listUrl = page.getListUrl();
        }
        if (listUrl != null) {
            listUrl.addParameter("category", str);
        }
        if (bundleDeepCopy != null) {
            bundleDeepCopy.putSerializable(InterfaceC1357q.f53848bf2, pageGroup);
        }
        return bundleDeepCopy;
    }

    @InterfaceC7396q
    public final FragmentManager fu4() {
        return this.f9568h;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: n */
    public int mo5575n() {
        return this.f57393t8r;
    }

    @Override // com.android.thememanager.basemodule.views.NestViewPager.InterfaceC1846k
    @InterfaceC7396q
    /* JADX INFO: renamed from: zurt */
    public Fragment getItem(int i2) {
        C1582h c1582h = this.f9569i.get(Integer.valueOf(i2));
        d2ok.qrj(c1582h);
        return c1582h;
    }
}
