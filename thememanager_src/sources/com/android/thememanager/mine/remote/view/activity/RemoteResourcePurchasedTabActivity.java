package com.android.thememanager.mine.remote.view.activity;

import android.content.Context;
import android.content.Intent;
import com.android.thememanager.mine.remote.view.fragment.f7l8;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourcePurchasedTabActivity extends AbstractActivityC2183k {
    public static Intent w831(Context context, String resCode) {
        Intent intent = new Intent(context, (Class<?>) RemoteResourcePurchasedTabActivity.class);
        List<com.android.thememanager.basemodule.model.flextab.toq> listZurt = p001b.toq.zurt(p001b.toq.f7221t);
        int i2 = 0;
        if (listZurt != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= listZurt.size()) {
                    break;
                }
                if (listZurt.get(i3).m6881q().equals(resCode)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        intent.putExtra(InterfaceC1357q.f53969yz, i2);
        return intent;
    }

    @Override // com.android.thememanager.mine.remote.view.activity.AbstractActivityC2183k
    protected String cfr() {
        return com.android.thememanager.basemodule.analysis.toq.syl2;
    }

    @Override // com.android.thememanager.mine.remote.view.activity.zy
    protected String r8s8() {
        return p001b.toq.f7221t;
    }

    @Override // com.android.thememanager.mine.remote.view.activity.AbstractActivityC2183k
    protected Class sok() {
        return f7l8.class;
    }
}
