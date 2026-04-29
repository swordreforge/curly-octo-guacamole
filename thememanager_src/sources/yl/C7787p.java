package yl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: yl.p */
/* JADX INFO: compiled from: TranslucentWindowController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7787p extends zy {

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private View f45955n;

    /* JADX INFO: renamed from: q */
    private boolean f45956q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final Activity f100620toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f100621zy = true;

    public C7787p(@InterfaceC7395n Activity activity) {
        Window window;
        this.f100620toq = activity;
        if (((activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView()) instanceof FrameLayout) {
            View view = new View(activity);
            this.f45955n = view;
            d2ok.qrj(view);
            view.setAlpha(0.0f);
            View view2 = this.f45955n;
            d2ok.qrj(view2);
            view2.setBackgroundColor(activity.getResources().getColor(R.color.pa_picker_window_background_color));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            View decorView = activity.getWindow().getDecorView();
            d2ok.n7h(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(this.f45955n, 0, layoutParams);
        }
    }

    @InterfaceC7396q
    public final C7787p f7l8(boolean z2) {
        this.f100621zy = z2;
        return this;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final Activity m28170g() {
        return this.f100620toq;
    }

    @Override // yl.zy
    /* JADX INFO: renamed from: n */
    public void mo28171n(boolean z2) {
        if (this.f100621zy) {
            if (z2) {
                mo28172q(1.0f);
            } else {
                mo28172q(0.0f);
            }
        }
    }

    @Override // yl.zy
    /* JADX INFO: renamed from: q */
    public void mo28172q(float f2) {
        View view;
        if (this.f100621zy && (view = this.f45955n) != null) {
            view.setAlpha(f2);
        }
    }

    @Override // yl.zy
    public boolean toq() {
        return this.f100621zy && this.f45956q;
    }
}
