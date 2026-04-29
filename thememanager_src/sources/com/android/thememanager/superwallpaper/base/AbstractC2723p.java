package com.android.thememanager.superwallpaper.base;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.thememanager.library.util.app.C2088k;
import com.android.thememanager.view.eqxt;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Iterator;
import vep5.C7705k;

/* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.p */
/* JADX INFO: compiled from: BaseSuperWallpaperPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2723p {

    /* JADX INFO: renamed from: k */
    protected ld6 f16111k;

    /* JADX INFO: renamed from: n */
    protected int f16112n;

    /* JADX INFO: renamed from: q */
    protected C7705k f16113q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected String f61148toq;

    /* JADX INFO: renamed from: y */
    protected String f16114y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected ArrayList<vep5.toq> f61149zy;

    /* JADX INFO: renamed from: g */
    protected SharedPreferences f16110g = PreferenceManager.getDefaultSharedPreferences(C2088k.m8026k());

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ArrayList<k> f61147f7l8 = new ArrayList<>();

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.p$k */
    /* JADX INFO: compiled from: BaseSuperWallpaperPresenter.java */
    public interface k {
        void vyq(int position);
    }

    public AbstractC2723p(ld6 view, String id) {
        this.f16111k = view;
        this.f16114y = id;
    }

    public ArrayList<vep5.toq> f7l8() {
        return this.f61149zy;
    }

    /* JADX INFO: renamed from: g */
    public String mo9490g() {
        return this.f61148toq;
    }

    /* JADX INFO: renamed from: k */
    public void m9491k(k iPositionChangedCallback) {
        this.f61147f7l8.add(iPositionChangedCallback);
    }

    public void ld6(AbstractViewOnClickListenerC2725s activity) {
        new eqxt(activity).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: n */
    public String m9492n() {
        return this.f16114y;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo9493p(String path);

    /* JADX INFO: renamed from: q */
    public C7705k m9494q() {
        return this.f16113q;
    }

    /* JADX INFO: renamed from: s */
    public abstract int mo9495s();

    public abstract void toq();

    /* JADX INFO: renamed from: y */
    public int m9496y() {
        return this.f16112n;
    }

    public void zy(int positionCur) {
        this.f16112n = positionCur;
        Iterator<k> it = this.f61147f7l8.iterator();
        while (it.hasNext()) {
            it.next().vyq(this.f16112n);
        }
    }
}
