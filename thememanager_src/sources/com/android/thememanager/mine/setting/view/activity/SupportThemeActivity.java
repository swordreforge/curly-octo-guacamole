package com.android.thememanager.mine.setting.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0498q;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.jp0y;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.mine.setting.model.SupportTheme;
import com.android.thememanager.mine.setting.presenter.C2199k;
import i1.C6077k;

/* JADX INFO: loaded from: classes2.dex */
public class SupportThemeActivity extends AbstractActivityC1717k {

    /* JADX INFO: renamed from: c */
    private boolean f12967c;

    /* JADX INFO: renamed from: f */
    private SupportTheme f12968f;

    /* JADX INFO: renamed from: l */
    private C2199k f12969l;

    /* JADX INFO: renamed from: r */
    private TextView f12970r;

    /* JADX INFO: Access modifiers changed from: private */
    public void r8s8(SupportTheme supportTheme) {
        Drawable drawableM2259s;
        this.f12967c = false;
        if (supportTheme == null) {
            this.f12970r.setVisibility(4);
            return;
        }
        this.f12970r.setVisibility(0);
        this.f12968f = supportTheme;
        this.f12970r.setText(String.valueOf(supportTheme.count));
        if (this.f12968f.like) {
            this.f12970r.setTextColor(C0498q.m2252g(this, R.color.me_support_text_p));
            drawableM2259s = C0498q.m2259s(this, R.drawable.me_support_theme_support_p);
        } else {
            this.f12970r.setTextColor(C0498q.m2252g(this, R.color.me_support_text_n));
            drawableM2259s = C0498q.m2259s(this, R.drawable.me_support_theme_support_n);
        }
        drawableM2259s.setBounds(0, 0, drawableM2259s.getMinimumWidth(), drawableM2259s.getMinimumHeight());
        this.f12970r.setCompoundDrawablesRelative(drawableM2259s, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zsr0(View view) {
        SupportTheme supportTheme;
        if (this.f12967c || (supportTheme = this.f12968f) == null) {
            return;
        }
        if (supportTheme.like) {
            nn86.m7150k(R.string.support_theme_store_supported, 0);
        } else {
            this.f12967c = true;
            this.f12969l.lrht();
        }
    }

    public void i9jn(Pair<Integer, Exception> fail) {
        this.f12967c = false;
        int iIntValue = ((Integer) fail.first).intValue();
        Exception exc = (Exception) fail.second;
        if (iIntValue > 0 || !(exc == null || exc.getCause() == null)) {
            nn86.m7150k(R.string.network_exception, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me_activity_support_theme);
        m6709b().xwq3(R.string.support_theme_store_title);
        TextView textView = (TextView) findViewById(R.id.support);
        this.f12970r = textView;
        C6077k.f7l8(textView);
        this.f12969l = (C2199k) new C0924e(this).m4420k(C2199k.class);
        this.f12970r.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.mine.setting.view.activity.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12971k.zsr0(view);
            }
        });
        this.f12969l.m8299f().m4391p(this, new jp0y() { // from class: com.android.thememanager.mine.setting.view.activity.toq
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f12972k.r8s8((SupportTheme) obj);
            }
        });
        this.f12969l.m8298c().m4391p(this, new jp0y() { // from class: com.android.thememanager.mine.setting.view.activity.zy
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f12973k.i9jn((Pair) obj);
            }
        });
    }
}
