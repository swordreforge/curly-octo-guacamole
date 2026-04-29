package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.clientreport.data.C5623k;
import com.xiaomi.push.oaex;

/* JADX INFO: loaded from: classes3.dex */
public class ek5k {
    /* JADX INFO: renamed from: k */
    public static <T extends oaex<T, ?>> void m19436k(Context context, C5623k c5623k) {
        if (c5623k == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_cr_config");
        intent.putExtra("action_cr_event_switch", c5623k.f7l8());
        intent.putExtra("action_cr_event_frequency", c5623k.zy());
        intent.putExtra("action_cr_perf_switch", c5623k.m19307y());
        intent.putExtra("action_cr_perf_frequency", c5623k.m19305n());
        intent.putExtra("action_cr_event_en", c5623k.m19304g());
        intent.putExtra("action_cr_max_file_size", c5623k.m19306q());
        d3.m19429y(context).ki(intent);
    }
}
