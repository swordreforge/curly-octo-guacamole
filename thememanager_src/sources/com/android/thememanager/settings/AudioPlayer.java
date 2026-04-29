package com.android.thememanager.settings;

import android.app.Activity;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.ek5k;
import com.android.thememanager.basemodule.utils.nn86;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AudioPlayer implements InterfaceC0928g, AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: f */
    private static final String f14884f = "AudioExoPlayer";

    /* JADX INFO: renamed from: g */
    private final AudioFocusRequest f14885g;

    /* JADX INFO: renamed from: h */
    AudioManager f14886h;

    /* JADX INFO: renamed from: i */
    Resource f14887i;

    /* JADX INFO: renamed from: k */
    private final Context f14888k;

    /* JADX INFO: renamed from: l */
    private boolean f14889l = false;

    /* JADX INFO: renamed from: n */
    private final AudioAttributes f14890n;

    /* JADX INFO: renamed from: p */
    LocalRingFragment f14891p;

    /* JADX INFO: renamed from: q */
    @zy.lvui
    private final MediaPlayer f14892q;

    /* JADX INFO: renamed from: r */
    private Uri f14893r;

    /* JADX INFO: renamed from: s */
    Activity f14894s;

    /* JADX INFO: renamed from: t */
    private final ni7 f14895t;

    /* JADX INFO: renamed from: y */
    private boolean f14896y;

    /* JADX INFO: renamed from: z */
    C1791k f14897z;

    AudioPlayer(LocalRingFragment fragment, C1791k nrc) {
        ActivityC0891q activityC0891qRequireActivity = fragment.requireActivity();
        this.f14894s = activityC0891qRequireActivity;
        this.f14891p = fragment;
        this.f14897z = nrc;
        this.f14888k = activityC0891qRequireActivity;
        this.f14886h = (AudioManager) activityC0891qRequireActivity.getSystemService(com.google.android.exoplayer2.util.wvg.f67137toq);
        this.f14895t = new ni7();
        this.f14892q = new MediaPlayer();
        String resourceCode = this.f14897z.getResourceCode();
        int i2 = "alarm".equals(resourceCode) ? 4 : ("ringtone".equals(resourceCode) || com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode)) ? 6 : 5;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f14890n = new AudioAttributes.Builder().setUsage(i2).setHapticChannelsMuted(false).build();
        } else {
            this.f14890n = new AudioAttributes.Builder().setUsage(i2).build();
        }
        this.f14885g = new AudioFocusRequest.Builder(1).setAudioAttributes(this.f14890n).setOnAudioFocusChangeListener(this).build();
    }

    /* JADX INFO: renamed from: k */
    private void m8969k() {
        if (this.f14896y) {
            return;
        }
        ((AudioManager) this.f14888k.getSystemService(com.google.android.exoplayer2.util.wvg.f67137toq)).abandonAudioFocusRequest(this.f14885g);
        this.f14896y = true;
    }

    private Uri toq(Resource resource) {
        List<String> listM6946s = C1792n.m6946s(resource, this.f14897z);
        if (listM6946s.size() < 1) {
            return null;
        }
        Uri uriM7045q = ek5k.m7045q(listM6946s.get(0));
        this.f14893r = uriM7045q;
        return uriM7045q;
    }

    private void zy() {
        this.f14892q.setOnCompletionListener(this);
        this.f14892q.setOnErrorListener(this);
        this.f14892q.setOnPreparedListener(this);
    }

    /* JADX INFO: renamed from: n */
    public void m8970n() {
        if (this.f14889l) {
            this.f14892q.stop();
        }
        this.f14895t.zy();
        this.f14887i = null;
        this.f14891p.vss1(null);
        m8969k();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        Log.i(f14884f, "onAudioFocusChange " + focusChange);
        if (focusChange == -2 || focusChange == -1) {
            m8970n();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mp) {
        m8970n();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
        this.f14892q.release();
        m8969k();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mp, int what, int extra) {
        nn86.m7150k(R.string.resource_ringtone_playing_error, 0);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mp) {
        this.f14889l = true;
        this.f14891p.vss1(this.f14887i);
        this.f14895t.toq(this.f14893r);
        mp.start();
    }

    /* JADX INFO: renamed from: q */
    public void m8971q(Resource r2) {
        if (this.f14886h.getStreamVolume(this.f14894s.getVolumeControlStream()) == 0) {
            nn86.m7150k(R.string.resource_ringtone_volume_mute, 0);
            return;
        }
        this.f14887i = r2;
        Uri qVar = toq(r2);
        if (qVar == null) {
            return;
        }
        if (this.f14886h.requestAudioFocus(this.f14885g) != 1) {
            nn86.m7150k(R.string.theme_on_the_phone_alert, 0);
            Log.w(f14884f, "requestAudioFocus fail. can not play music." + this.f14890n.getUsage());
            return;
        }
        this.f14895t.zy();
        this.f14896y = false;
        this.f14892q.reset();
        zy();
        this.f14892q.setAudioAttributes(this.f14890n);
        try {
            this.f14892q.setDataSource(this.f14888k, qVar);
            this.f14892q.prepareAsync();
        } catch (Exception e2) {
            Log.e(f14884f, "setDataSource fail. " + e2);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@zy.lvui InterfaceC0954z owner) {
        m8970n();
    }
}
