package com.google.android.exoplayer2.drm;

import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import java.util.Map;

/* JADX INFO: compiled from: WidevineUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ncyb {

    /* JADX INFO: renamed from: k */
    public static final String f19674k = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f63622toq = "PlaybackDurationRemaining";

    private ncyb() {
    }

    /* JADX INFO: renamed from: k */
    private static long m11641k(Map<String, String> map, String str) {
        if (map == null) {
            return C3548p.f65257toq;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : C3548p.f65257toq;
        } catch (NumberFormatException unused) {
            return C3548p.f65257toq;
        }
    }

    @zy.dd
    public static Pair<Long, Long> toq(qrj qrjVar) {
        Map<String, String> mapMo11615s = qrjVar.mo11615s();
        if (mapMo11615s == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m11641k(mapMo11615s, f19674k)), Long.valueOf(m11641k(mapMo11615s, f63622toq)));
    }
}
