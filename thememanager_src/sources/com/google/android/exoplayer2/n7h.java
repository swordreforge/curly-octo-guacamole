package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.C3270y;
import com.google.android.exoplayer2.audio.InterfaceC3262p;
import com.google.android.exoplayer2.audio.gvn7;
import com.google.android.exoplayer2.mediacodec.C3467p;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.metadata.C3507n;
import com.google.android.exoplayer2.metadata.InterfaceC3508q;
import com.google.android.exoplayer2.video.C3881s;
import com.google.android.exoplayer2.video.InterfaceC3894z;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h implements vep5 {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f65005kja0 = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f65006ld6 = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f65007n7h = 50;

    /* JADX INFO: renamed from: p */
    public static final long f20901p = 5000;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f65008qrj = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f65009x2 = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f65010f7l8;

    /* JADX INFO: renamed from: g */
    private com.google.android.exoplayer2.mediacodec.cdj f20902g;

    /* JADX INFO: renamed from: k */
    private final Context f20903k;

    /* JADX INFO: renamed from: n */
    private boolean f20904n;

    /* JADX INFO: renamed from: q */
    private long f20905q;

    /* JADX INFO: renamed from: s */
    private boolean f20906s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C3467p f65011toq;

    /* JADX INFO: renamed from: y */
    private boolean f20907y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f65012zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n7h$k */
    /* JADX INFO: compiled from: DefaultRenderersFactory.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3519k {
    }

    public n7h(Context context) {
        this.f20903k = context;
        this.f65011toq = new C3467p();
        this.f65012zy = 0;
        this.f20905q = 5000L;
        this.f20902g = com.google.android.exoplayer2.mediacodec.cdj.f20643k;
    }

    public n7h cdj(boolean z2) {
        this.f20907y = z2;
        return this;
    }

    protected void f7l8(Context context, com.google.android.exoplayer2.text.n7h n7hVar, Looper looper, int i2, ArrayList<bek6> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.text.kja0(n7hVar, looper));
    }

    /* JADX INFO: renamed from: g */
    protected void m12349g(Context context, Handler handler, int i2, ArrayList<bek6> arrayList) {
    }

    /* JADX INFO: renamed from: h */
    public n7h m12350h(boolean z2) {
        this.f20906s = z2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public n7h m12351i(com.google.android.exoplayer2.mediacodec.cdj cdjVar) {
        this.f20902g = cdjVar;
        return this;
    }

    @Override // com.google.android.exoplayer2.vep5
    /* JADX INFO: renamed from: k */
    public bek6[] mo12352k(Handler handler, InterfaceC3894z interfaceC3894z, com.google.android.exoplayer2.audio.fn3e fn3eVar, com.google.android.exoplayer2.text.n7h n7hVar, InterfaceC3508q interfaceC3508q) {
        ArrayList<bek6> arrayList = new ArrayList<>();
        m12357y(this.f20903k, this.f65012zy, this.f20902g, this.f20904n, handler, interfaceC3894z, this.f20905q, arrayList);
        com.google.android.exoplayer2.audio.zurt zurtVarZy = zy(this.f20903k, this.f65010f7l8, this.f20907y, this.f20906s);
        if (zurtVarZy != null) {
            toq(this.f20903k, this.f65012zy, this.f20902g, this.f20904n, zurtVarZy, handler, fn3eVar, arrayList);
        }
        f7l8(this.f20903k, n7hVar, handler.getLooper(), this.f65012zy, arrayList);
        m12353n(this.f20903k, interfaceC3508q, handler.getLooper(), this.f65012zy, arrayList);
        m12355q(this.f20903k, this.f65012zy, arrayList);
        m12349g(this.f20903k, handler, this.f65012zy, arrayList);
        return (bek6[]) arrayList.toArray(new bek6[0]);
    }

    public n7h ki(boolean z2) {
        this.f20904n = z2;
        return this;
    }

    public n7h kja0(boolean z2) {
        this.f65010f7l8 = z2;
        return this;
    }

    public n7h ld6() {
        this.f65011toq.m12257q();
        return this;
    }

    /* JADX INFO: renamed from: n */
    protected void m12353n(Context context, InterfaceC3508q interfaceC3508q, Looper looper, int i2, ArrayList<bek6> arrayList) {
        arrayList.add(new C3507n(interfaceC3508q, looper));
    }

    public n7h n7h(long j2) {
        this.f20905q = j2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public n7h m12354p(boolean z2) {
        this.f65011toq.zy(z2);
        return this;
    }

    /* JADX INFO: renamed from: q */
    protected void m12355q(Context context, int i2, ArrayList<bek6> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.video.spherical.toq());
    }

    protected x2.toq qrj() {
        return this.f65011toq;
    }

    /* JADX INFO: renamed from: s */
    public n7h m12356s(boolean z2) {
        this.f65011toq.toq(z2);
        return this;
    }

    public n7h t8r(int i2) {
        this.f65012zy = i2;
        return this;
    }

    protected void toq(Context context, int i2, com.google.android.exoplayer2.mediacodec.cdj cdjVar, boolean z2, com.google.android.exoplayer2.audio.zurt zurtVar, Handler handler, com.google.android.exoplayer2.audio.fn3e fn3eVar, ArrayList<bek6> arrayList) {
        int i3;
        int i4;
        arrayList.add(new com.google.android.exoplayer2.audio.dd(context, qrj(), cdjVar, z2, handler, fn3eVar, zurtVar));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                i3 = size + 1;
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating Opus extension", e2);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (bek6) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.fn3e.class, com.google.android.exoplayer2.audio.zurt.class).newInstance(handler, fn3eVar, zurtVar));
            com.google.android.exoplayer2.util.ni7.m13704y(f65005kja0, "Loaded LibopusAudioRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i3;
            i3 = size;
        }
        try {
            try {
                i4 = i3 + 1;
                try {
                    arrayList.add(i3, (bek6) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.fn3e.class, com.google.android.exoplayer2.audio.zurt.class).newInstance(handler, fn3eVar, zurtVar));
                    com.google.android.exoplayer2.util.ni7.m13704y(f65005kja0, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i3 = i4;
                    i4 = i3;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i4, (bek6) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.fn3e.class, com.google.android.exoplayer2.audio.zurt.class).newInstance(handler, fn3eVar, zurtVar));
                com.google.android.exoplayer2.util.ni7.m13704y(f65005kja0, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating FLAC extension", e4);
        }
    }

    public n7h x2() {
        this.f65011toq.m12256n();
        return this;
    }

    /* JADX INFO: renamed from: y */
    protected void m12357y(Context context, int i2, com.google.android.exoplayer2.mediacodec.cdj cdjVar, boolean z2, Handler handler, InterfaceC3894z interfaceC3894z, long j2, ArrayList<bek6> arrayList) {
        int i3;
        arrayList.add(new C3881s(context, qrj(), cdjVar, j2, z2, handler, interfaceC3894z, 50));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                i3 = size + 1;
                try {
                    arrayList.add(size, (bek6) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC3894z.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, interfaceC3894z, 50));
                    com.google.android.exoplayer2.util.ni7.m13704y(f65005kja0, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i3;
                    i3 = size;
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i3, (bek6) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC3894z.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, interfaceC3894z, 50));
            com.google.android.exoplayer2.util.ni7.m13704y(f65005kja0, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating AV1 extension", e3);
        }
    }

    @zy.dd
    protected com.google.android.exoplayer2.audio.zurt zy(Context context, boolean z2, boolean z3, boolean z5) {
        return new com.google.android.exoplayer2.audio.gvn7(C3270y.zy(context), new gvn7.C3253q(new InterfaceC3262p[0]), z2, z3, z5 ? 1 : 0);
    }

    @Deprecated
    public n7h(Context context, int i2) {
        this(context, i2, 5000L);
    }

    @Deprecated
    public n7h(Context context, int i2, long j2) {
        this.f20903k = context;
        this.f65012zy = i2;
        this.f20905q = j2;
        this.f20902g = com.google.android.exoplayer2.mediacodec.cdj.f20643k;
        this.f65011toq = new C3467p();
    }
}
