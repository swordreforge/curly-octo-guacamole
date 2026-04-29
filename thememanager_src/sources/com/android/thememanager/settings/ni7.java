package com.android.thememanager.settings;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.MiuiSettings;
import android.util.Log;
import com.android.thememanager.basemodule.utils.lrht;
import java.lang.reflect.Method;
import yz.C7794k;

/* JADX INFO: compiled from: VibratorHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class ni7 {

    /* JADX INFO: renamed from: g */
    private static final String f15141g = "VibratorHelper";

    /* JADX INFO: renamed from: n */
    private final boolean f15143n;

    /* JADX INFO: renamed from: q */
    private final boolean f15144q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private AudioAttributes f60797zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AudioManager f60796toq = (AudioManager) bf2.toq.toq().getSystemService(com.google.android.exoplayer2.util.wvg.f67137toq);

    /* JADX INFO: renamed from: k */
    private Vibrator f15142k = (Vibrator) bf2.toq.toq().getSystemService("vibrator");

    public ni7() {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT > 31) {
            this.f15144q = AudioManager.isHapticPlaybackSupported();
        } else {
            this.f15144q = false;
        }
        Method methodM7118n = lrht.m7118n(Vibrator.class, "hasExternalControl", new Class[0]);
        if (methodM7118n != null) {
            try {
                if (((Boolean) methodM7118n.invoke(this.f15142k, new Object[0])).booleanValue()) {
                    z2 = true;
                }
            } catch (Exception e2) {
                C7794k.zy(f15141g, "fail invoke ", e2);
            }
        }
        this.f15143n = z2;
    }

    /* JADX INFO: renamed from: k */
    private boolean m9027k() {
        return this.f60796toq.getRingerMode() != 2 ? MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), "vibrate_in_silent", true) : MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), "vibrate_in_normal", true);
    }

    public void toq(Uri playUri) {
        if (this.f15143n && this.f15144q && Build.VERSION.SDK_INT > 32 && RingtoneManager.hasHapticChannels(playUri)) {
            Log.i(f15141g, playUri + ", hasHapticChannels true");
            return;
        }
        if (m9027k()) {
            Log.i(f15141g, "try to play vibration for : " + playUri);
            VibrationEffect vibrationEffectKi = com.android.thememanager.basemodule.utils.cdj.ki(playUri, bf2.toq.toq());
            if (vibrationEffectKi == null) {
                Log.d(f15141g, "getting vibration fail.");
                return;
            }
            if (this.f15142k == null) {
                this.f15142k = (Vibrator) bf2.toq.toq().getSystemService("vibrator");
            }
            if (this.f15142k != null) {
                if (this.f60797zy == null) {
                    this.f60797zy = new AudioAttributes.Builder().setUsage(6).build();
                }
                this.f15142k.vibrate(vibrationEffectKi, this.f60797zy);
            }
        }
    }

    public void zy() {
        if (this.f15142k != null) {
            Log.d(f15141g, "stop vibration.");
            this.f15142k.cancel();
        }
    }
}
