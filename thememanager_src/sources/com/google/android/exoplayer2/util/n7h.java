package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.thememanager.search.C2478g;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import com.google.android.exoplayer2.audio.C3248g;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.se;
import com.google.android.exoplayer2.source.C3564a;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.trackselection.ld6;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: compiled from: EventLogger.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h implements InterfaceC3239x {

    /* JADX INFO: renamed from: a */
    private static final int f23249a = 3;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final String f67054a98o = "EventLogger";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final NumberFormat f67055zp;

    /* JADX INFO: renamed from: b */
    private final pc.C3550q f23250b;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private final pc.toq f67056bf2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private final long f67057i1;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private final String f67058y9n;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    @zy.dd
    private final com.google.android.exoplayer2.trackselection.ld6 f67059yz;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f67055zp = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public n7h(@zy.dd com.google.android.exoplayer2.trackselection.ld6 ld6Var) {
        this(ld6Var, f67054a98o);
    }

    /* JADX INFO: renamed from: d */
    private static String m13688d(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private void d8wk(InterfaceC3239x.toq toqVar, String str) {
        was(lv5(toqVar, str, null, null));
    }

    private static String fnq8(long j2) {
        return j2 == C3548p.f65257toq ? "?" : f67055zp.format(j2 / 1000.0f);
    }

    private void g1(InterfaceC3239x.toq toqVar, String str, String str2) {
        was(lv5(toqVar, str, str2, null));
    }

    private void gbni(InterfaceC3239x.toq toqVar, String str, String str2, @zy.dd Throwable th) {
        py(lv5(toqVar, str, str2, th));
    }

    private void i9jn(InterfaceC3239x.toq toqVar, String str, Exception exc) {
        gbni(toqVar, "internalError", str, exc);
    }

    private static String ikck(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private void ltg8(Metadata metadata, String str) {
        for (int i2 = 0; i2 < metadata.m12282g(); i2++) {
            String strValueOf = String.valueOf(metadata.zy(i2));
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + strValueOf.length());
            sb.append(str);
            sb.append(strValueOf);
            was(sb.toString());
        }
    }

    private String lv5(InterfaceC3239x.toq toqVar, String str, @zy.dd String str2, @zy.dd Throwable th) {
        String strXwq3 = xwq3(toqVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(strXwq3).length());
        sb.append(str);
        sb.append(" [");
        sb.append(strXwq3);
        String string = sb.toString();
        if (th instanceof yqrt) {
            String strValueOf = String.valueOf(string);
            String errorCodeName = ((yqrt) th).getErrorCodeName();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12 + String.valueOf(errorCodeName).length());
            sb2.append(strValueOf);
            sb2.append(", errorCode=");
            sb2.append(errorCodeName);
            string = sb2.toString();
        }
        if (str2 != null) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 2 + str2.length());
            sb3.append(strValueOf2);
            sb3.append(", ");
            sb3.append(str2);
            string = sb3.toString();
        }
        String strF7l8 = ni7.f7l8(th);
        if (!TextUtils.isEmpty(strF7l8)) {
            String strValueOf3 = String.valueOf(string);
            String strReplace = strF7l8.replace("\n", "\n  ");
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 4 + String.valueOf(strReplace).length());
            sb4.append(strValueOf3);
            sb4.append("\n  ");
            sb4.append(strReplace);
            sb4.append('\n');
            string = sb4.toString();
        }
        return String.valueOf(string).concat("]");
    }

    /* JADX INFO: renamed from: m */
    private static String m13689m(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    private static String mu(int i2) {
        return i2 != 0 ? i2 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    /* JADX INFO: renamed from: o */
    private static String m13690o(int i2, int i3) {
        if (i2 < 2) {
            return "N/A";
        }
        if (i3 == 0) {
            return "NO";
        }
        if (i3 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i3 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static String qkj8(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String qo(int i2) {
        return i2 != 0 ? i2 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String tfm(@zy.dd com.google.android.exoplayer2.trackselection.n7h n7hVar, C3564a c3564a, int i2) {
        return wo((n7hVar == null || n7hVar.qrj() != c3564a || n7hVar.x2(i2) == -1) ? false : true);
    }

    private static String vq(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "?" : C2478g.f14642k : "ONE" : "OFF";
    }

    private static String wo(boolean z2) {
        return z2 ? "[X]" : "[ ]";
    }

    private String xwq3(InterfaceC3239x.toq toqVar) {
        int i2 = toqVar.f63298zy;
        StringBuilder sb = new StringBuilder(18);
        sb.append("window=");
        sb.append(i2);
        String string = sb.toString();
        if (toqVar.f19268q != null) {
            String strValueOf = String.valueOf(string);
            int iMo12147g = toqVar.f63297toq.mo12147g(toqVar.f19268q.f21225k);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
            sb2.append(strValueOf);
            sb2.append(", period=");
            sb2.append(iMo12147g);
            string = sb2.toString();
            if (toqVar.f19268q.zy()) {
                String strValueOf2 = String.valueOf(string);
                int i3 = toqVar.f19268q.f65325toq;
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 21);
                sb3.append(strValueOf2);
                sb3.append(", adGroup=");
                sb3.append(i3);
                String strValueOf3 = String.valueOf(sb3.toString());
                int i4 = toqVar.f19268q.f65326zy;
                StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 16);
                sb4.append(strValueOf3);
                sb4.append(", ad=");
                sb4.append(i4);
                string = sb4.toString();
            }
        }
        String strFnq8 = fnq8(toqVar.f19265k - this.f67057i1);
        String strFnq82 = fnq8(toqVar.f19266n);
        StringBuilder sb5 = new StringBuilder(String.valueOf(strFnq8).length() + 23 + String.valueOf(strFnq82).length() + String.valueOf(string).length());
        sb5.append("eventTime=");
        sb5.append(strFnq8);
        sb5.append(", mediaPos=");
        sb5.append(strFnq82);
        sb5.append(", ");
        sb5.append(string);
        return sb5.toString();
    }

    private void zsr0(InterfaceC3239x.toq toqVar, String str, @zy.dd Throwable th) {
        py(lv5(toqVar, str, null, th));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: a */
    public void mo11322a(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.wvg wvgVar) {
        g1(toqVar, "downstreamFormat", xwq3.o1t(wvgVar.f65468zy));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void a9(InterfaceC3239x.toq toqVar, int i2) {
        int iQrj = toqVar.f63297toq.qrj();
        int iZurt = toqVar.f63297toq.zurt();
        String strXwq3 = xwq3(toqVar);
        String strQo = qo(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(strXwq3).length() + 69 + String.valueOf(strQo).length());
        sb.append("timeline [");
        sb.append(strXwq3);
        sb.append(", periodCount=");
        sb.append(iQrj);
        sb.append(", windowCount=");
        sb.append(iZurt);
        sb.append(", reason=");
        sb.append(strQo);
        was(sb.toString());
        for (int i3 = 0; i3 < Math.min(iQrj, 3); i3++) {
            toqVar.f63297toq.m12485p(i3, this.f67056bf2);
            String strFnq8 = fnq8(this.f67056bf2.qrj());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strFnq8).length() + 11);
            sb2.append("  period [");
            sb2.append(strFnq8);
            sb2.append("]");
            was(sb2.toString());
        }
        if (iQrj > 3) {
            was("  ...");
        }
        for (int i4 = 0; i4 < Math.min(iZurt, 3); i4++) {
            toqVar.f63297toq.m12484i(i4, this.f23250b);
            String strFnq82 = fnq8(this.f23250b.f7l8());
            pc.C3550q c3550q = this.f23250b;
            boolean z2 = c3550q.f21130h;
            boolean z3 = c3550q.f21131i;
            StringBuilder sb3 = new StringBuilder(String.valueOf(strFnq82).length() + 42);
            sb3.append("  window [");
            sb3.append(strFnq82);
            sb3.append(", seekable=");
            sb3.append(z2);
            sb3.append(", dynamic=");
            sb3.append(z3);
            sb3.append("]");
            was(sb3.toString());
        }
        if (iZurt > 3) {
            was("  ...");
        }
        was("]");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: b */
    public void mo11336b(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void bf2(InterfaceC3239x.toq toqVar, C3629x c3629x, com.google.android.exoplayer2.trackselection.kja0 kja0Var) {
        com.google.android.exoplayer2.trackselection.ld6 ld6Var = this.f67059yz;
        ld6.C3709k c3709kLd6 = ld6Var != null ? ld6Var.ld6() : null;
        if (c3709kLd6 == null) {
            g1(toqVar, "tracks", okhttp3.zurt.f43629h);
            return;
        }
        String strValueOf = String.valueOf(xwq3(toqVar));
        was(strValueOf.length() != 0 ? "tracks [".concat(strValueOf) : new String("tracks ["));
        int iZy = c3709kLd6.zy();
        int i2 = 0;
        while (true) {
            String str = "    Group:";
            String str2 = " [";
            if (i2 >= iZy) {
                break;
            }
            C3629x c3629xF7l8 = c3709kLd6.f7l8(i2);
            com.google.android.exoplayer2.trackselection.n7h n7hVarM13137k = kja0Var.m13137k(i2);
            int i3 = iZy;
            if (c3629xF7l8.f21701k == 0) {
                String strM13145q = c3709kLd6.m13145q(i2);
                StringBuilder sb = new StringBuilder(String.valueOf(strM13145q).length() + 5);
                sb.append("  ");
                sb.append(strM13145q);
                sb.append(" []");
                was(sb.toString());
            } else {
                String strM13145q2 = c3709kLd6.m13145q(i2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strM13145q2).length() + 4);
                sb2.append("  ");
                sb2.append(strM13145q2);
                sb2.append(" [");
                was(sb2.toString());
                int i4 = 0;
                while (i4 < c3629xF7l8.f21701k) {
                    C3564a qVar = c3629xF7l8.toq(i4);
                    C3629x c3629x2 = c3629xF7l8;
                    String strM13690o = m13690o(qVar.f21222k, c3709kLd6.m13142k(i2, i4, false));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strM13690o).length() + 44);
                    sb3.append(str);
                    sb3.append(i4);
                    sb3.append(", adaptive_supported=");
                    sb3.append(strM13690o);
                    sb3.append(str2);
                    was(sb3.toString());
                    int i5 = 0;
                    while (i5 < qVar.f21222k) {
                        String strTfm = tfm(n7hVarM13137k, qVar, i5);
                        String strYz = lrht.yz(c3709kLd6.m13147y(i2, i4, i5));
                        C3564a c3564a = qVar;
                        String strO1t = xwq3.o1t(qVar.toq(i5));
                        String str3 = str;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(strTfm).length() + 38 + String.valueOf(strO1t).length() + String.valueOf(strYz).length());
                        sb4.append("      ");
                        sb4.append(strTfm);
                        sb4.append(" Track:");
                        sb4.append(i5);
                        sb4.append(", ");
                        sb4.append(strO1t);
                        sb4.append(", supported=");
                        sb4.append(strYz);
                        was(sb4.toString());
                        i5++;
                        str = str3;
                        qVar = c3564a;
                        str2 = str2;
                    }
                    was("    ]");
                    i4++;
                    c3629xF7l8 = c3629x2;
                }
                if (n7hVarM13137k != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= n7hVarM13137k.length()) {
                            break;
                        }
                        Metadata metadata = n7hVarM13137k.f7l8(i6).f23690z;
                        if (metadata != null) {
                            was("    Metadata [");
                            ltg8(metadata, "      ");
                            was("    ]");
                            break;
                        }
                        i6++;
                    }
                }
                was("  ]");
            }
            i2++;
            iZy = i3;
        }
        String str4 = "    Group:";
        String str5 = " [";
        C3629x c3629xM13144p = c3709kLd6.m13144p();
        if (c3629xM13144p.f21701k > 0) {
            was("  Unmapped [");
            int i7 = 0;
            while (i7 < c3629xM13144p.f21701k) {
                StringBuilder sb5 = new StringBuilder(23);
                String str6 = str4;
                sb5.append(str6);
                sb5.append(i7);
                String str7 = str5;
                sb5.append(str7);
                was(sb5.toString());
                C3564a qVar2 = c3629xM13144p.toq(i7);
                int i8 = 0;
                while (i8 < qVar2.f21222k) {
                    String strWo = wo(false);
                    String strYz2 = lrht.yz(0);
                    String strO1t2 = xwq3.o1t(qVar2.toq(i8));
                    String str8 = str6;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(strWo).length() + 38 + String.valueOf(strO1t2).length() + String.valueOf(strYz2).length());
                    sb6.append("      ");
                    sb6.append(strWo);
                    sb6.append(" Track:");
                    sb6.append(i8);
                    sb6.append(", ");
                    sb6.append(strO1t2);
                    sb6.append(", supported=");
                    sb6.append(strYz2);
                    was(sb6.toString());
                    i8++;
                    c3629xM13144p = c3629xM13144p;
                    str6 = str8;
                }
                str4 = str6;
                was("    ]");
                i7++;
                str5 = str7;
            }
            was("  ]");
        }
        was("]");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: c */
    public void mo11337c(InterfaceC3239x.toq toqVar, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder(55);
        sb.append(i2);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        gbni(toqVar, "audioTrackUnderrun", sb.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void c8jq(InterfaceC3239x.toq toqVar, Object obj, long j2) {
        g1(toqVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void cdj(InterfaceC3239x.toq toqVar, int i2) {
        g1(toqVar, "state", qkj8(i2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void ch(InterfaceC3239x.toq toqVar, gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(m13689m(i2));
        sb.append(", PositionInfo:old [");
        sb.append("mediaItem=");
        sb.append(x2Var.f20525n);
        sb.append(", period=");
        sb.append(x2Var.f20528s);
        sb.append(", pos=");
        sb.append(x2Var.f20526p);
        if (x2Var.f20523i != -1) {
            sb.append(", contentPos=");
            sb.append(x2Var.f20522h);
            sb.append(", adGroup=");
            sb.append(x2Var.f20523i);
            sb.append(", ad=");
            sb.append(x2Var.f20530z);
        }
        sb.append("], PositionInfo:new [");
        sb.append("mediaItem=");
        sb.append(x2Var2.f20525n);
        sb.append(", period=");
        sb.append(x2Var2.f20528s);
        sb.append(", pos=");
        sb.append(x2Var2.f20526p);
        if (x2Var2.f20523i != -1) {
            sb.append(", contentPos=");
            sb.append(x2Var2.f20522h);
            sb.append(", adGroup=");
            sb.append(x2Var2.f20523i);
            sb.append(", ad=");
            sb.append(x2Var2.f20530z);
        }
        sb.append("]");
        g1(toqVar, "positionDiscontinuity", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void d2ok(InterfaceC3239x.toq toqVar, int i2, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void dr(InterfaceC3239x.toq toqVar, boolean z2) {
        g1(toqVar, "loading", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: e */
    public void mo11338e(InterfaceC3239x.toq toqVar, int i2) {
        g1(toqVar, "repeatMode", vq(i2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void eqxt(InterfaceC3239x.toq toqVar) {
        d8wk(toqVar, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: f */
    public void mo11339f(InterfaceC3239x.toq toqVar, se seVar) {
        g1(toqVar, "playbackParameters", seVar.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void fn3e(InterfaceC3239x.toq toqVar, int i2, int i3) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        g1(toqVar, "surfaceSize", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: g */
    public void mo11340g(InterfaceC3239x.toq toqVar, int i2) {
        g1(toqVar, "playbackSuppressionReason", mu(i2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void hyr(InterfaceC3239x.toq toqVar) {
        d8wk(toqVar, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void i1(InterfaceC3239x.toq toqVar, boolean z2) {
        g1(toqVar, "isPlaying", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: j */
    public void mo11324j(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.video.wvg wvgVar) {
        int i2 = wvgVar.f23577k;
        int i3 = wvgVar.f23579q;
        StringBuilder sb = new StringBuilder(24);
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        g1(toqVar, "videoSize", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void jp0y(InterfaceC3239x.toq toqVar, @zy.dd tfm tfmVar, int i2) {
        String strXwq3 = xwq3(toqVar);
        String strIkck = ikck(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(strXwq3).length() + 21 + String.valueOf(strIkck).length());
        sb.append("mediaItem [");
        sb.append(strXwq3);
        sb.append(", reason=");
        sb.append(strIkck);
        sb.append("]");
        was(sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: k */
    public void mo11343k(InterfaceC3239x.toq toqVar, String str) {
        g1(toqVar, "videoDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void ki(InterfaceC3239x.toq toqVar, int i2) {
        g1(toqVar, "audioSessionId", Integer.toString(i2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: l */
    public void mo11344l(InterfaceC3239x.toq toqVar, yqrt yqrtVar) {
        zsr0(toqVar, "playerFailed", yqrtVar);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void lrht(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        d8wk(toqVar, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: n */
    public void mo11345n(InterfaceC3239x.toq toqVar) {
        d8wk(toqVar, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void n7h(InterfaceC3239x.toq toqVar, Metadata metadata) {
        String strValueOf = String.valueOf(xwq3(toqVar));
        was(strValueOf.length() != 0 ? "metadata [".concat(strValueOf) : new String("metadata ["));
        ltg8(metadata, "  ");
        was("]");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void ni7(InterfaceC3239x.toq toqVar, int i2, long j2) {
        g1(toqVar, "droppedFrames", Integer.toString(i2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void nmn5(InterfaceC3239x.toq toqVar, String str) {
        g1(toqVar, "audioDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void nn86(InterfaceC3239x.toq toqVar, C3248g c3248g) {
        int i2 = c3248g.f19340k;
        int i3 = c3248g.f19342q;
        int i4 = c3248g.f19341n;
        int i5 = c3248g.f19339g;
        StringBuilder sb = new StringBuilder(47);
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        sb.append(",");
        sb.append(i5);
        g1(toqVar, "audioAttributes", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void o1t(InterfaceC3239x.toq toqVar, boolean z2, int i2) {
        String strM13688d = m13688d(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(strM13688d).length() + 7);
        sb.append(z2);
        sb.append(", ");
        sb.append(strM13688d);
        g1(toqVar, "playWhenReady", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void oc(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        d8wk(toqVar, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: p */
    public void mo11325p(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar, IOException iOException, boolean z2) {
        i9jn(toqVar, "loadError", iOException);
    }

    protected void py(String str) {
        ni7.m13702q(this.f67058y9n, str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: q */
    public void mo11326q(InterfaceC3239x.toq toqVar, Exception exc) {
        i9jn(toqVar, "drmSessionManagerError", exc);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void qrj(InterfaceC3239x.toq toqVar, String str, long j2) {
        g1(toqVar, "audioDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: s */
    public void mo11347s(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        d8wk(toqVar, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: t */
    public void mo11348t(InterfaceC3239x.toq toqVar, xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
        g1(toqVar, "videoInputFormat", xwq3.o1t(xwq3Var));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void t8iq(InterfaceC3239x.toq toqVar, String str, long j2) {
        g1(toqVar, "videoDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: u */
    public void mo11349u(InterfaceC3239x.toq toqVar, xwq3 xwq3Var, @zy.dd com.google.android.exoplayer2.decoder.ld6 ld6Var) {
        g1(toqVar, "audioInputFormat", xwq3.o1t(xwq3Var));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void uv6(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        d8wk(toqVar, "videoEnabled");
    }

    protected void was(String str) {
        ni7.toq(this.f67058y9n, str);
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: x */
    public void mo11351x(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.wvg wvgVar) {
        g1(toqVar, "upstreamDiscarded", xwq3.o1t(wvgVar.f65468zy));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void x9kr(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void y9n(InterfaceC3239x.toq toqVar, float f2) {
        g1(toqVar, "volume", Float.toString(f2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void yz(InterfaceC3239x.toq toqVar) {
        d8wk(toqVar, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    /* JADX INFO: renamed from: z */
    public void mo11353z(InterfaceC3239x.toq toqVar, boolean z2) {
        g1(toqVar, "skipSilenceEnabled", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void zp(InterfaceC3239x.toq toqVar, com.google.android.exoplayer2.source.ni7 ni7Var, com.google.android.exoplayer2.source.wvg wvgVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void zurt(InterfaceC3239x.toq toqVar, boolean z2) {
        g1(toqVar, "shuffleModeEnabled", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.InterfaceC3239x
    public void zy(InterfaceC3239x.toq toqVar, int i2) {
        StringBuilder sb = new StringBuilder(17);
        sb.append("state=");
        sb.append(i2);
        g1(toqVar, "drmSessionAcquired", sb.toString());
    }

    public n7h(@zy.dd com.google.android.exoplayer2.trackselection.ld6 ld6Var, String str) {
        this.f67059yz = ld6Var;
        this.f67058y9n = str;
        this.f23250b = new pc.C3550q();
        this.f67056bf2 = new pc.toq();
        this.f67057i1 = SystemClock.elapsedRealtime();
    }
}
