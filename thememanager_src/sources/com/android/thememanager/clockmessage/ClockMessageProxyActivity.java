package com.android.thememanager.clockmessage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.v9.f7l8;

/* JADX INFO: loaded from: classes.dex */
public class ClockMessageProxyActivity extends AbstractActivityC1717k {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data != null && !TextUtils.isEmpty(data.getLastPathSegment())) {
            String lastPathSegment = data.getLastPathSegment();
            String str = null;
            C1875q.fu4();
            C1873k c1873kF7l8 = C1875q.m7391g().f7l8(lastPathSegment);
            if (c1873kF7l8 != null) {
                String str2 = c1873kF7l8.f10655k;
                str2.hashCode();
                switch (str2) {
                    case "activity":
                    case "feed":
                    case "post":
                        C1875q.m7391g().m7401z(c1873kF7l8);
                        str = c1873kF7l8.f57853zy;
                        break;
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = C1875q.f57865x2;
            }
            C1875q.m7391g().fti(lastPathSegment);
            if (str.contains(C1875q.f10660p)) {
                f7l8.f7l8(this, str);
            } else {
                startActivity(f7l8.m10166k(str));
            }
        }
        finish();
    }
}
