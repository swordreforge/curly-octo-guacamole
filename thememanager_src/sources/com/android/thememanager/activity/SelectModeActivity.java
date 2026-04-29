package com.android.thememanager.activity;

import android.app.ActivityManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.clockmessage.model.C1873k;

/* JADX INFO: loaded from: classes.dex */
public class SelectModeActivity extends cdj implements View.OnClickListener {

    /* JADX INFO: renamed from: k */
    private Button f8817k;

    /* JADX INFO: renamed from: q */
    private Button f8818q;

    /* JADX INFO: renamed from: j */
    private void m6353j() {
        this.f8817k = (Button) findViewById(R.id.agree_btn);
        this.f8818q = (Button) findViewById(R.id.disagree_btn);
        this.f8817k.setOnClickListener(this);
        this.f8818q.setOnClickListener(this);
        nn86();
    }

    @Override // com.android.thememanager.activity.cdj
    /* JADX INFO: renamed from: e */
    protected int mo6354e() {
        return 1;
    }

    public void nn86() {
        if (findViewById(R.id.up) != null) {
            findViewById(R.id.up).setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        Fragment fragmentCh = getSupportFragmentManager().ch(R.id.select_mode_content);
        if (fragmentCh instanceof SelectModeFragment) {
            if (v2.getId() != this.f8817k.getId()) {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.yg, null, com.android.thememanager.basemodule.analysis.toq.wtds));
                ((SelectModeFragment) fragmentCh).saveUserSelected(false);
                com.android.thememanager.basemodule.utils.cdj.m7017q((ActivityManager) getSystemService(C1873k.f10652g), getPackageName());
                return;
            }
            C1781k.cdj();
            ((SelectModeFragment) fragmentCh).saveUserSelected(true);
            if (com.android.thememanager.basemodule.privacy.x2.m6914n() == 1) {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.yg, null, com.android.thememanager.basemodule.analysis.toq.w7));
            } else {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.yg, null, com.android.thememanager.basemodule.analysis.toq.p9));
            }
            setResult(com.android.thememanager.basemodule.privacy.x2.m6914n());
            finish();
        }
    }

    @Override // com.android.thememanager.activity.cdj, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.android.thememanager.util.gc3c.ni7(this);
        setContentView(R.layout.activity_select_mode);
        androidx.fragment.app.o1t o1tVarKi = getSupportFragmentManager().ki();
        o1tVarKi.m4317z(R.id.select_mode_content, new SelectModeFragment());
        o1tVarKi.qrj();
        if (p029m.zy.m24738k(getIntent().getStringExtra("request_flag"), com.android.thememanager.basemodule.privacy.x2.f57641ld6)) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.yg, null, ""));
        }
        m6353j();
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }
}
