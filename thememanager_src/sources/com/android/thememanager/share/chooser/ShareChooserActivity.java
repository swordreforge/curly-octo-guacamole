package com.android.thememanager.share.chooser;

import android.content.Intent;
import android.os.Bundle;
import com.android.thememanager.activity.bek6;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2708s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ShareChooserActivity extends bek6 {

    /* JADX INFO: renamed from: k */
    private Bundle f15985k;

    /* JADX INFO: renamed from: n */
    private C2708s f15986n;

    /* JADX INFO: renamed from: q */
    private Intent f15987q;

    /* JADX INFO: renamed from: e */
    public String m9404e() {
        Bundle bundle = this.f15985k;
        if (bundle != null) {
            return bundle.getString(C2702g.f61066a9, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    ArrayList<C2692q> m9405j() {
        return zy.m9415q(this, this.f15987q, this.f15985k);
    }

    public C2708s nn86() {
        return this.f15986n;
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f15985k = getIntent().getBundleExtra(C2702g.f16020h);
        Intent intent = (Intent) getIntent().getParcelableExtra(C2702g.f61067cdj);
        this.f15987q = intent;
        this.f15986n = new C2708s(intent.getStringExtra(C2702g.f16027t), this.f15987q.getStringExtra(C2702g.f61086wvg));
        zy.m9414n(this, this.f15987q, this.f15985k);
    }
}
