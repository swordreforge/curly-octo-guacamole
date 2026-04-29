package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import com.google.common.collect.se;
import com.google.common.primitives.C4746s;
import java.util.Arrays;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.y */
/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3270y {

    /* JADX INFO: renamed from: q */
    private static final int f19511q = 48000;

    /* JADX INFO: renamed from: y */
    private static final String f19512y = "external_surround_sound_enabled";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f63531zy = 8;

    /* JADX INFO: renamed from: k */
    private final int[] f19513k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f63532toq;

    /* JADX INFO: renamed from: n */
    public static final C3270y f19510n = new C3270y(new int[]{2}, 8);

    /* JADX INFO: renamed from: g */
    private static final C3270y f19509g = new C3270y(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f63530f7l8 = {5, 6, 18, 17, 14, 7, 8};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.y$k */
    /* JADX INFO: compiled from: AudioCapabilities.java */
    @zy.hyr(29)
    private static final class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static int[] m11540k() {
            se.C4520k c4520kBuilder = se.builder();
            for (int i2 : C3270y.f63530f7l8) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i2).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    c4520kBuilder.mo15569k(Integer.valueOf(i2));
                }
            }
            c4520kBuilder.mo15569k(2);
            return C4746s.m16720t(c4520kBuilder.mo15570n());
        }
    }

    public C3270y(@zy.dd int[] iArr, int i2) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f19513k = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f19513k = new int[0];
        }
        this.f63532toq = i2;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    static Uri m11537n() {
        if (toq()) {
            return Settings.Global.getUriFor(f19512y);
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: q */
    static C3270y m11538q(Context context, @zy.dd Intent intent) {
        return (toq() && Settings.Global.getInt(context.getContentResolver(), f19512y, 0) == 1) ? f19509g : (com.google.android.exoplayer2.util.lrht.f23230k < 29 || !(com.google.android.exoplayer2.util.lrht.g1(context) || com.google.android.exoplayer2.util.lrht.qkj8(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f19510n : new C3270y(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new C3270y(k.m11540k(), 8);
    }

    private static boolean toq() {
        if (com.google.android.exoplayer2.util.lrht.f23230k >= 17) {
            String str = com.google.android.exoplayer2.util.lrht.f67042zy;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C3270y zy(Context context) {
        return m11538q(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3270y)) {
            return false;
        }
        C3270y c3270y = (C3270y) obj;
        return Arrays.equals(this.f19513k, c3270y.f19513k) && this.f63532toq == c3270y.f63532toq;
    }

    public boolean f7l8(int i2) {
        return Arrays.binarySearch(this.f19513k, i2) >= 0;
    }

    /* JADX INFO: renamed from: g */
    public int m11539g() {
        return this.f63532toq;
    }

    public int hashCode() {
        return this.f63532toq + (Arrays.hashCode(this.f19513k) * 31);
    }

    public String toString() {
        int i2 = this.f63532toq;
        String string = Arrays.toString(this.f19513k);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
