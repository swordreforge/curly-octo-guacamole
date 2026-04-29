package com.android.thememanager.settings;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.lrht;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: WallpaperListViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class gvn7 extends lrht {

    /* JADX INFO: renamed from: g */
    private androidx.lifecycle.fti<List<Resource>> f15040g;

    /* JADX INFO: renamed from: p */
    private boolean f15041p = true;

    /* JADX INFO: renamed from: s */
    private androidx.lifecycle.fti<HashSet<Integer>> f15042s;

    /* JADX INFO: renamed from: y */
    private androidx.lifecycle.fti<Integer> f15043y;

    /* JADX INFO: renamed from: c */
    public HashSet<Integer> m9017c() {
        return m9019f().m4388g();
    }

    /* JADX INFO: renamed from: e */
    public boolean m9018e() {
        return this.f15041p;
    }

    /* JADX INFO: renamed from: f */
    public androidx.lifecycle.fti<HashSet<Integer>> m9019f() {
        if (this.f15042s == null) {
            this.f15042s = new androidx.lifecycle.fti<>(new HashSet());
        }
        return this.f15042s;
    }

    public void hb(InterfaceC0954z owner, androidx.lifecycle.jp0y<List<Resource>> observer) {
        lrht().m4391p(owner, observer);
    }

    public void hyr() {
        List<Resource> listVyq = vyq();
        if (listVyq != null) {
            listVyq.clear();
        }
        lrht().cdj(listVyq);
    }

    /* JADX INFO: renamed from: j */
    public void m9020j(boolean hasMore) {
        this.f15041p = hasMore;
    }

    public androidx.lifecycle.fti<List<Resource>> lrht() {
        if (this.f15040g == null) {
            this.f15040g = new androidx.lifecycle.fti<>();
        }
        return this.f15040g;
    }

    public void n5r1() {
        HashSet<Integer> hashSetM9017c = m9017c();
        if (hashSetM9017c != null) {
            hashSetM9017c.clear();
        }
        m9019f().cdj(hashSetM9017c);
    }

    public void nn86(List<Resource> newList, boolean append) {
        List<Resource> listVyq = vyq();
        if (listVyq != null) {
            if (!append) {
                listVyq.clear();
            }
            listVyq.addAll(newList);
            newList = listVyq;
        }
        lrht().cdj(newList);
    }

    public androidx.lifecycle.fti<Integer> uv6() {
        if (this.f15043y == null) {
            this.f15043y = new androidx.lifecycle.fti<>(0);
        }
        return this.f15043y;
    }

    public List<Resource> vyq() {
        return lrht().m4388g();
    }
}
