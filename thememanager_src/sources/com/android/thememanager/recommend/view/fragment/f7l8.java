package com.android.thememanager.recommend.view.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.qrj;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.jp0y;
import androidx.lifecycle.kja0;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceTabActivity;
import com.android.thememanager.basemodule.guideview.InterfaceC1727k;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.view.x2;
import zy.dd;

/* JADX INFO: compiled from: RecommendHomepageTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends AbstractC2351k implements com.android.thememanager.basemodule.analysis.toq, View.OnClickListener, InterfaceC1727k.k {

    /* JADX INFO: renamed from: b */
    private ViewStub f13632b;

    /* JADX INFO: renamed from: m */
    private RestoreHomeIconHelper.AsyncTaskC1726k f13633m;

    /* JADX INFO: renamed from: u */
    private x2 f13634u;

    /* JADX INFO: renamed from: a */
    private boolean f13631a = false;

    /* JADX INFO: renamed from: x */
    private int f13636x = 0;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f60650bo = 0.0f;

    /* JADX INFO: renamed from: v */
    private final jp0y<Intent> f13635v = new C2349k();

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.f7l8$k */
    /* JADX INFO: compiled from: RecommendHomepageTabFragment.java */
    class C2349k implements jp0y<Intent> {
        C2349k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (f7l8.this.getLifecycle().toq().isAtLeast(kja0.zy.RESUMED)) {
                f7l8.this.f13631a = false;
                f7l8.this.tww7(false);
            }
        }
    }

    /* JADX INFO: compiled from: RecommendHomepageTabFragment.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f13638k;

        toq(final View val$container) {
            this.f13638k = val$container;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f13638k.setVisibility(8);
            this.f13638k.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f13638k.setVisibility(8);
            this.f13638k.setAlpha(1.0f);
        }
    }

    private void f1bi() {
        ViewStub viewStub = (ViewStub) this.f13648t.findViewById(R.id.restore_home_icon);
        this.f13632b = viewStub;
        if (viewStub != null) {
            this.f13631a = true;
            View viewInflate = viewStub.inflate();
            View viewFindViewById = viewInflate.findViewById(R.id.close);
            View viewFindViewById2 = viewInflate.findViewById(R.id.confirm_button);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
            Context context = this.f13632b.getContext();
            androidx.core.graphics.drawable.x2 x2VarM2430k = qrj.m2430k(viewFindViewById2.getResources(), ((BitmapDrawable) context.getDrawable(R.drawable.icon)).getBitmap());
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.top_tab_text_size);
            viewInflate.setClickable(true);
            x2VarM2430k.qrj(dimensionPixelOffset);
            x2VarM2430k.ld6(true);
            imageView.setImageDrawable(x2VarM2430k);
            viewFindViewById.setOnClickListener(this);
            viewFindViewById2.setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tww7(boolean anim) {
        if (this.f13632b != null) {
            View viewFindViewById = this.f13648t.findViewById(R.id.guideContainer);
            if (anim) {
                viewFindViewById.animate().alpha(0.1f).setListener(new toq(viewFindViewById)).start();
            } else {
                viewFindViewById.setVisibility(8);
                Toast.makeText(this.f13632b.getContext(), R.string.add_home_icon_success, 0).show();
            }
        }
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2351k
    protected String cyoe() {
        return "homepage";
    }

    public void kbj(x2 floatingWindowManager) {
        this.f13634u = floatingWindowManager;
    }

    @Override // com.android.thememanager.basemodule.guideview.InterfaceC1727k.k
    public void ki(boolean need) {
        if (need && this.f13632b == null) {
            f1bi();
        }
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2351k
    protected String l05() {
        return com.android.thememanager.basemodule.analysis.toq.r3w;
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2351k
    protected String o5() {
        return p001b.toq.f7209h;
    }

    public void ob(int dy) {
        ViewStub viewStub = this.f13632b;
        if (viewStub == null || !this.f13631a) {
            return;
        }
        int i2 = this.f13636x + dy;
        this.f13636x = i2;
        if (i2 >= C1819o.mcp(viewStub.getContext())) {
            this.f13631a = false;
            View viewFindViewById = this.f13648t.findViewById(R.id.guideContainer);
            float f2 = 0.92f;
            if (viewFindViewById != null && this.f13648t != null) {
                int measuredHeight = viewFindViewById.getMeasuredHeight();
                int measuredHeight2 = this.f13648t.getMeasuredHeight();
                if (measuredHeight != 0 && measuredHeight2 != 0) {
                    f2 = 1.0f - (((measuredHeight + 10) * 1.0f) / measuredHeight2);
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f13648t;
            C0397q c0397q = new C0397q();
            c0397q.gvn7(constraintLayout);
            c0397q.gc3c(R.id.left_guide, 0.03f);
            c0397q.gc3c(R.id.right_guide, 0.97f);
            c0397q.gc3c(R.id.bottom_guide, f2);
            TransitionManager.beginDelayedTransition(constraintLayout);
            c0397q.ki(constraintLayout);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() != R.id.close) {
            if (v2.getId() == R.id.confirm_button) {
                RestoreHomeIconHelper.ld6(null, RestoreHomeIconHelper.f9911z);
            }
        } else {
            tww7(true);
            ActivityC0891q activity = getActivity();
            if (C1819o.eqxt(activity)) {
                Toast.makeText(activity, R.string.restore_icon_later, 0).show();
            }
            RestoreHomeIconHelper.m6734p(RestoreHomeIconHelper.f9911z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ni7.m7146k().m7147n(RestoreHomeIconHelper.f9903l, this.f13635v);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!C1781k.toq(this.f13648t.getContext()) || y9n.vyq()) {
            return;
        }
        RestoreHomeIconHelper.AsyncTaskC1726k asyncTaskC1726k = this.f13633m;
        if (asyncTaskC1726k != null) {
            asyncTaskC1726k.cancel(false);
        }
        RestoreHomeIconHelper.AsyncTaskC1726k asyncTaskC1726k2 = new RestoreHomeIconHelper.AsyncTaskC1726k(this);
        this.f13633m = asyncTaskC1726k2;
        asyncTaskC1726k2.toq(RestoreHomeIconHelper.f9911z);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2351k, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @dd Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ni7.m7146k().toq(RestoreHomeIconHelper.f9903l, this.f13635v);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2351k
    protected void yp31() {
        x2 x2Var;
        super.yp31();
        if (!(getActivity() instanceof ThemeResourceTabActivity) || (x2Var = this.f13634u) == null) {
            return;
        }
        if (x2Var.kja0()) {
            this.f13634u.m10448y(getActivity());
        }
        this.f13634u.t8r("homepage", rp());
    }
}
