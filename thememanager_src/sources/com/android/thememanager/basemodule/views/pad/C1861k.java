package com.android.thememanager.basemodule.views.pad;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.views.pad.k */
/* JADX INFO: compiled from: Edit.java */
/* JADX INFO: loaded from: classes.dex */
public class C1861k implements toq {

    /* JADX INFO: renamed from: k */
    private boolean f10622k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f57846toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Set<String> f57847zy = new HashSet();

    @Override // com.android.thememanager.basemodule.views.pad.toq
    public void clear() {
        this.f57847zy.clear();
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    public void f7l8(String id) {
        this.f57847zy.remove(id);
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    /* JADX INFO: renamed from: g */
    public void mo7361g(String id) {
        this.f57847zy.add(id);
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    /* JADX INFO: renamed from: k */
    public void mo7362k(boolean editMode) {
        this.f10622k = editMode;
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    /* JADX INFO: renamed from: n */
    public void mo7363n(boolean all) {
        this.f57846toq = all;
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    /* JADX INFO: renamed from: q */
    public int mo7364q() {
        return this.f57847zy.size();
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    /* JADX INFO: renamed from: s */
    public Set<String> mo7365s() {
        return this.f57847zy;
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    public boolean toq() {
        return this.f10622k;
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    /* JADX INFO: renamed from: y */
    public boolean mo7366y(String id) {
        return this.f57847zy.contains(id);
    }

    @Override // com.android.thememanager.basemodule.views.pad.toq
    public boolean zy() {
        return this.f57846toq;
    }
}
