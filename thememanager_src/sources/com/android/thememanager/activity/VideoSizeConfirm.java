package com.android.thememanager.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import miuix.appcompat.app.ki;

/* JADX INFO: loaded from: classes.dex */
public class VideoSizeConfirm implements InterfaceC0928g {

    /* JADX INFO: renamed from: k */
    miuix.appcompat.app.ki f8904k;

    /* JADX INFO: renamed from: q */
    Toast f8905q;

    VideoSizeConfirm(@zy.lvui lvui fragment) {
        fragment.getLifecycle().mo4451k(this);
    }

    /* JADX INFO: renamed from: k */
    public static miuix.appcompat.app.ki m6372k(Activity activity) {
        ki.C6947k c6947kFu4 = new ki.C6947k(activity, 2131951635).lrht(R.string.application_notify_title).fu4(R.string.apply_not_support_video_wallpaper_warning);
        c6947kFu4.dd(R.string.i_know, null);
        return c6947kFu4.m25037g();
    }

    private miuix.appcompat.app.ki toq(lvui fragment, Runnable apply) {
        ki.C6947k c6947kFu4 = new ki.C6947k(fragment.requireActivity(), 2131951635).lrht(R.string.application_notify_title).fu4(R.string.apply_4k_video_wallpaper_warning);
        c6947kFu4.dd(R.string.i_know, null);
        return c6947kFu4.m25037g();
    }

    public static boolean zy(int videoWidth, int videoHeight) {
        return videoHeight > 10000 || videoWidth > 10000 || videoHeight * videoWidth >= 8294400;
    }

    @SuppressLint({"ShowToast"})
    /* JADX INFO: renamed from: n */
    void m6373n(lvui fragment) {
        Toast toast = this.f8905q;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(fragment.requireContext(), R.string.can_not_apply_error, 1);
        this.f8905q = toastMakeText;
        toastMakeText.show();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
        miuix.appcompat.app.ki kiVar = this.f8904k;
        if (kiVar != null && kiVar.isShowing()) {
            this.f8904k.n7h();
        }
        Toast toast = this.f8905q;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* JADX INFO: renamed from: q */
    void m6374q(lvui fragment, @zy.lvui Runnable apply) {
        if (C1819o.eqxt(fragment.getActivity())) {
            int iKq = fragment.kq();
            if (iKq == 2) {
                miuix.appcompat.app.ki qVar = toq(fragment, apply);
                this.f8904k = qVar;
                qVar.show();
            } else if (iKq == 3) {
                miuix.appcompat.app.ki kiVarM6372k = m6372k(fragment.requireActivity());
                this.f8904k = kiVarM6372k;
                kiVarM6372k.show();
            } else if (iKq == 1) {
                m6373n(fragment);
            } else {
                apply.run();
            }
        }
    }
}
