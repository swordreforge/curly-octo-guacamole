package com.android.thememanager.settings;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.util.C2805r;
import com.android.thememanager.util.py;
import i1.C6077k;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import miui.app.constants.ThemeManagerConstants;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSettingsActivity extends com.android.thememanager.activity.kja0 implements ThemeManagerConstants, InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: c */
    private TextView f14940c;

    /* JADX INFO: renamed from: e */
    private HashSet<String> f14941e;

    /* JADX INFO: renamed from: j */
    private GestureDetector f14942j;

    /* JADX INFO: renamed from: m */
    ncyb f14943m;

    /* JADX INFO: renamed from: o */
    private Pair<Drawable, Integer> f14944o;

    /* JADX INFO: renamed from: com.android.thememanager.settings.WallpaperSettingsActivity$k */
    class ViewOnClickListenerC2508k implements View.OnClickListener {
        ViewOnClickListenerC2508k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(WallpaperSettingsActivity.this.getPackageName(), "com.android.thememanager.activity.PadThemePreferenceActivity"));
            WallpaperSettingsActivity.this.startActivity(intent);
        }
    }

    class toq extends GestureDetector.SimpleOnGestureListener {
        toq() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e2) {
            ncyb ncybVar = WallpaperSettingsActivity.this.f14943m;
            if (ncybVar == null || !ncybVar.isAdded()) {
                return true;
            }
            WallpaperSettingsActivity.this.f14943m.vyq();
            return true;
        }
    }

    class zy extends AnimatorListenerAdapter {
        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            WallpaperSettingsActivity.this.cv06();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b3e(View view, MotionEvent motionEvent) {
        this.f14942j.onTouchEvent(motionEvent);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void bek6() {
        this.f14942j = new GestureDetector(this, new toq());
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.android.thememanager.settings.r
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f15407k.b3e(view, motionEvent);
            }
        };
        TextView textViewYqrt = yqrt();
        if (textViewYqrt != null) {
            textViewYqrt.setOnTouchListener(onTouchListener);
        }
    }

    @zy.dd
    public static Bundle bwp(Context context, Uri providerUri, String callMethod, String args, Bundle extras) {
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(providerUri);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                return null;
            }
            try {
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(callMethod, args, extras);
                contentProviderClientAcquireUnstableContentProviderClient.close();
                return bundleCall;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cv06() {
        ncyb ncybVar;
        TextView textViewYqrt = yqrt();
        if (textViewYqrt == null || (ncybVar = this.f14943m) == null || !ncybVar.isAdded()) {
            return;
        }
        if (this.f14943m.qh4d()) {
            m6709b().xwq3(R.string.wallpaper_online);
            textViewYqrt.setText(R.string.wallpaper_online);
        } else {
            m6709b().xwq3(R.string.wallpaper_settings_page_title);
            textViewYqrt.setText(R.string.wallpaper_settings_page_title);
        }
        ObjectAnimator.ofFloat(textViewYqrt, "alpha", textViewYqrt.getAlpha(), 1.0f).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean ktq(View view, MotionEvent motionEvent) {
        this.f14942j.onTouchEvent(motionEvent);
        return true;
    }

    private void mbx() {
        AbstractC6946k abstractC6946kM6709b;
        if (!C1807g.zurt() || C1807g.d2ok()) {
            return;
        }
        uj2j();
        if (getIntent() == null || !C2805r.f16757i.equals(getIntent().getStringExtra(C2805r.f16756h)) || (abstractC6946kM6709b = m6709b()) == null) {
            return;
        }
        abstractC6946kM6709b.mcp();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    @zy.dd
    private TextView yqrt() {
        TextView textView = this.f14940c;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = (TextView) findViewById(R.id.action_bar_title);
        this.f14940c = textView2;
        if (textView2 != null) {
            textView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.settings.lvui
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f15114k.ktq(view, motionEvent);
                }
            });
        }
        return this.f14940c;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.mgf;
    }

    void bz2() {
        TextView textViewYqrt = yqrt();
        if (textViewYqrt == null) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(textViewYqrt, "alpha", textViewYqrt.getAlpha(), 0.0f).setDuration(200L);
        duration.addListener(new zy());
        duration.start();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.analysis.f7l8.InterfaceC1696k
    /* JADX INFO: renamed from: f */
    public String mo6320f() {
        return "settings";
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        i9jn();
    }

    public void h7am(@zy.lvui UIImageBannerElement element) {
        ncyb ncybVar = this.f14943m;
        if (ncybVar == null || !ncybVar.isAdded()) {
            C7794k.f7l8("can not startDetailActivityForResource!");
        } else {
            this.f14943m.hyow(element);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        py.m9954q(getIntent());
        ThemeSchedulerService.m8899g();
        Intent intent = getIntent();
        intent.putExtra("REQUEST_RESOURCE_CODE", "wallpaper");
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(intent.getStringExtra(com.android.thememanager.settingssearch.toq.f15977k))) {
            bundle.putBoolean(ncyb.bb, intent.getStringExtra(com.android.thememanager.settingssearch.toq.f15977k).equals(com.android.thememanager.settingssearch.toq.f15978n));
        }
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            ncyb ncybVar = new ncyb();
            this.f14943m = ncybVar;
            ncybVar.setArguments(bundle);
            getSupportFragmentManager().ki().toq(android.R.id.content, this.f14943m).qrj();
        } else {
            this.f14943m = (ncyb) getSupportFragmentManager().ch(android.R.id.content);
        }
        this.f14941e = new HashSet<>();
        bek6();
        mbx();
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return 0;
    }

    public Set<String> se() {
        return this.f14941e;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode) {
        if (requestCode != 102) {
            super.startActivityForResult(intent, requestCode);
            return;
        }
        ncyb ncybVar = this.f14943m;
        if (ncybVar == null || !ncybVar.isAdded()) {
            return;
        }
        this.f14943m.startActivityForResult(intent, requestCode);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: u */
    protected void mo6714u() {
        vep5();
    }

    protected void uj2j() {
        ImageView imageView = new ImageView(this);
        C6077k.f7l8(imageView);
        C1812k.m7106k(imageView, R.string.accessibiliy_description_content_more);
        imageView.setBackgroundResource(R.drawable.action_immersion);
        imageView.setOnClickListener(new ViewOnClickListenerC2508k());
        setActionBarRightMenu(imageView);
    }

    public void vep5() {
        ncyb ncybVar = this.f14943m;
        if (ncybVar == null || !ncybVar.isAdded()) {
            return;
        }
        this.f14943m.xblq();
    }

    public Pair<Drawable, Integer> zkd() {
        Pair<Drawable, Integer> pair = this.f14944o;
        if (pair != null) {
            return pair;
        }
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
            Bundle bundleBwp = bwp(this, Uri.parse(eqxt.f60779toq), eqxt.f60780zy, null, null);
            int i2 = bundleBwp == null ? 0 : bundleBwp.getInt(eqxt.f15000n);
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            this.f14944o = new Pair<>(Icon.createWithResource(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.metaData.getInt("preview")).loadDrawable(this), Integer.valueOf(i2));
        }
        return this.f14944o;
    }
}
