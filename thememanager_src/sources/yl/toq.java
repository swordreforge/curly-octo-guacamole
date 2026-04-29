package yl;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.utils.y9n;
import kotlin.jvm.internal.d2ok;
import kotlin.ranges.fn3e;
import mub.InterfaceC7396q;
import yl.AbstractC7785k;

/* JADX INFO: compiled from: BlurAnimationController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements jp0y<C7789s> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private Context f45958k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private zy f100625toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private View f100626zy;

    public toq(@InterfaceC7396q Context context, @InterfaceC7396q zy blurController, @InterfaceC7396q View mContentView) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(blurController, "blurController");
        d2ok.m23075h(mContentView, "mContentView");
        this.f45958k = context;
        this.f100625toq = blurController;
        this.f100626zy = mContentView;
    }

    private final float zy(int i2) {
        if (y9n.fn3e().y == 0) {
            return -1.0f;
        }
        return fn3e.wvg(i2 / y9n.fn3e().y, 1.0f);
    }

    @InterfaceC7396q
    public final View f7l8() {
        return this.f100626zy;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final Context m28183g() {
        return this.f45958k;
    }

    public final void ld6(@InterfaceC7396q View view) {
        d2ok.m23075h(view, "<set-?>");
        this.f100626zy = view;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final zy m28184n() {
        return this.f100625toq;
    }

    /* JADX INFO: renamed from: p */
    public final void m28185p(@InterfaceC7396q Context context) {
        d2ok.m23075h(context, "<set-?>");
        this.f45958k = context;
    }

    /* JADX INFO: renamed from: q */
    public final void m28186q(boolean z2, int i2) {
        if (z2) {
            if (i2 <= 0) {
                x2(1.0f);
            } else if (i2 >= y9n.fn3e().y) {
                x2(0.0f);
            } else {
                float fZy = zy(i2);
                if (fZy >= 0.0f) {
                    x2(1 - fZy);
                }
            }
            Log.d("", "BlurAnimationController offsetY = " + i2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m28187s(@InterfaceC7396q zy zyVar) {
        d2ok.m23075h(zyVar, "<set-?>");
        this.f100625toq = zyVar;
    }

    public final void x2(float f2) {
        zy zyVar = this.f100625toq;
        if (zyVar != null) {
            zyVar.mo28172q(f2);
        }
    }

    @Override // androidx.lifecycle.jp0y
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void toq(@InterfaceC7396q C7789s animStatus) {
        d2ok.m23075h(animStatus, "animStatus");
        boolean z2 = (animStatus.m28177g() instanceof AbstractC7785k.toq) || (animStatus.m28177g() instanceof AbstractC7785k.k);
        boolean zM28182y = animStatus.m28182y();
        float fF7l8 = animStatus.f7l8();
        if (z2) {
            fF7l8 = zM28182y ? 1.0f : 0.0f;
        } else if (!zM28182y) {
            fF7l8 = 1 - fF7l8;
        }
        float f2 = (zM28182y || ((double) fF7l8) >= 0.05d) ? fF7l8 : 0.0f;
        Log.d("", "BlurAnimationController change blur alpha " + f2);
        x2(f2);
    }
}
