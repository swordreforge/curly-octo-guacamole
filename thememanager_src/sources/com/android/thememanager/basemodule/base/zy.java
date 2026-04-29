package com.android.thememanager.basemodule.base;

import android.os.Bundle;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.contract.toq;
import com.android.thememanager.basemodule.utils.lvui;
import miuix.preference.qrj;
import p000a.InterfaceC0001q;
import zy.dd;

/* JADX INFO: compiled from: AbstractBasePreferenceFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends qrj implements InterfaceC0001q {

    /* JADX INFO: renamed from: k */
    protected AbstractC0067g f9885k;

    @Override // p000a.InterfaceC0001q
    public AbstractC0067g a5id(toq.C0066y permissions, InterfaceC0068k callback) {
        return registerForActivityResult(permissions, callback);
    }

    public p000a.zy jz5() {
        return null;
    }

    @Override // miuix.preference.qrj, androidx.preference.qrj, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f9885k = lvui.n5r1(this);
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle bundle, String s2) {
    }
}
