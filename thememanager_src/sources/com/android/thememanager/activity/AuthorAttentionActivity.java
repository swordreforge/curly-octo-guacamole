package com.android.thememanager.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC0096k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.module.attention.view.C2223q;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.v9.model.NavItemFac;
import java.util.ArrayList;
import java.util.List;
import miuix.appcompat.app.AbstractC6946k;

/* JADX INFO: loaded from: classes.dex */
public class AuthorAttentionActivity extends kja0 implements C2223q.k {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f57267bo = "hide_dot";

    /* JADX INFO: renamed from: d */
    public static final int f8762d = 1;

    /* JADX INFO: renamed from: u */
    public static final String f8763u = "dynamic_message";

    /* JADX INFO: renamed from: v */
    public static final int f8764v = 0;

    /* JADX INFO: renamed from: x */
    public static final String f8765x = "AuthorAttentionActivity";

    /* JADX INFO: renamed from: a */
    private boolean f8766a;

    /* JADX INFO: renamed from: b */
    private boolean f8767b;

    /* JADX INFO: renamed from: c */
    private String[] f8768c = {"attention", "dynamics"};

    /* JADX INFO: renamed from: e */
    private List<C1857k> f8769e = new ArrayList();

    /* JADX INFO: renamed from: j */
    private List<Fragment> f8770j = new ArrayList();

    /* JADX INFO: renamed from: o */
    private List<AbstractC0096k.g> f8772o = new ArrayList();

    /* JADX INFO: renamed from: m */
    private SparseArray<String> f8771m = new SparseArray<>();

    private void cfr() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.o1t o1tVarKi = supportFragmentManager.ki();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f8768c;
            if (i2 >= strArr.length) {
                o1tVarKi.n7h();
                supportFragmentManager.a98o();
                return;
            } else {
                Fragment fragmentNmn5 = supportFragmentManager.nmn5(strArr[i2]);
                if (fragmentNmn5 != null) {
                    o1tVarKi.fu4(fragmentNmn5);
                }
                i2++;
            }
        }
    }

    private void w831() {
        int i2 = 0;
        this.f8767b = getIntent().getBooleanExtra(f8763u, false);
        while (true) {
            String[] strArr = this.f8768c;
            if (i2 >= strArr.length) {
                return;
            }
            this.f8769e.add(NavItemFac.NavItemFactory.create(strArr[i2]));
            i2++;
        }
    }

    private void yqrt() {
        AbstractC6946k abstractC6946kM6709b = m6709b();
        z4(abstractC6946kM6709b);
        int i2 = getIntent().getStringExtra("packIds") != null ? 1 : 0;
        abstractC6946kM6709b.mo172u(i2);
        abstractC6946kM6709b.n5r1(this.f8772o.get(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z4(AbstractC6946k actionBar) {
        this.f8770j.clear();
        this.f8770j.add(new com.android.thememanager.module.attention.view.zy());
        this.f8770j.add(new C2223q());
        this.f8771m.clear();
        int i2 = 0;
        actionBar.bap7(this, false);
        while (true) {
            String[] strArr = this.f8768c;
            if (i2 >= strArr.length) {
                actionBar.o05(1, this.f8767b);
                return;
            }
            this.f8771m.put(i2, strArr[i2]);
            AbstractC0096k.g gVarMo178h = actionBar.gvn7().mo178h(this.f8769e.get(i2).zy());
            this.f8772o.add(gVarMo178h);
            actionBar.was(this.f8768c[i2], gVarMo178h, this.f8770j.get(i2).getClass(), null, false);
            i2++;
        }
    }

    @Override // com.android.thememanager.module.attention.view.C2223q.k
    public void d2ok() {
        this.f8766a = true;
        m6709b().o05(1, false);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            for (String str : this.f8768c) {
                Fragment fragmentNmn5 = getSupportFragmentManager().nmn5(str);
                if (fragmentNmn5 != null) {
                    fragmentNmn5.onActivityResult(requestCode, resultCode, data);
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra(f57267bo, this.f8766a);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        C2782h.f16522s.clear();
        C1802c.m7008k(getIntent());
        getIntent().putExtra(com.android.thememanager.basemodule.utils.x9kr.f57819zy, false);
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            cfr();
        }
        w831();
        yqrt();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@zy.lvui MenuItem item) {
        if (item.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.detail_author_content;
    }
}
