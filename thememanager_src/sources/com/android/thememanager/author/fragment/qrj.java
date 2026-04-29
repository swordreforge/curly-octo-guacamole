package com.android.thememanager.author.fragment;

import a98o.C0004k;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.C2082k;
import com.android.thememanager.activity.pc;
import com.android.thememanager.activity.vep5;
import com.android.thememanager.author.adapter.C1660n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.fu4;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AuthorWidgetFragment.kt */
/* JADX INFO: loaded from: classes.dex */
public final class qrj extends vep5 {
    @Override // com.android.thememanager.activity.vep5, com.android.thememanager.activity.nsb
    protected void exv8() {
        super.exv8();
        this.f9288o.setOverScrollMode(2);
    }

    @Override // com.android.thememanager.activity.nsb
    public void qh4d(@InterfaceC7396q Pair<Integer, Integer> position) {
        String onlineId;
        d2ok.m23075h(position, "position");
        List<C0004k<Resource>> listQrj = this.f9286j.qrj();
        Object second = position.second;
        d2ok.kja0(second, "second");
        C0004k c0004k = (C0004k) kja0.m7108g(listQrj, ((Number) second).intValue());
        Object first = position.first;
        d2ok.kja0(first, "first");
        Resource resource = (Resource) kja0.m7108g(c0004k, ((Number) first).intValue());
        String str = "";
        if (resource != null && (onlineId = resource.getOnlineId()) != null) {
            str = onlineId;
        }
        String str2 = str;
        Log.i("AuthorWidgetFragment", "startDetailActivityForResource: productId: " + str2);
        ActivityC0891q activityC0891qRequireActivity = requireActivity();
        d2ok.kja0(activityC0891qRequireActivity, "requireActivity(...)");
        com.android.thememanager.toq.m9549z(activityC0891qRequireActivity, str2, null, false, 8, null);
    }

    @Override // com.android.thememanager.activity.vep5, com.android.thememanager.activity.nsb
    @InterfaceC7396q
    protected pc zff0() {
        ActivityC0891q activity = getActivity();
        Intent intent = activity != null ? activity.getIntent() : null;
        fu4 qVar = intent != null ? C2082k.zy().m8001n().toq(intent) : null;
        if (qVar != null) {
            qVar.setDisplayType(11);
        }
        if (qVar == null) {
            qVar = this.f9059l;
        }
        return new C1660n(this, qVar);
    }
}
