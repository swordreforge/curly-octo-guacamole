package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.x9kr;
import androidx.core.app.y9n;
import androidx.media.app.C0969k;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.ui.C3748h;
import com.google.android.exoplayer2.util.C3844k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PlayerNotificationManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: c */
    public static final String f22792c = "INSTANCE_ID";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f66655dd = "com.google.android.exoplayer.play";

    /* JADX INFO: renamed from: e */
    private static int f22793e = 0;

    /* JADX INFO: renamed from: f */
    public static final String f22794f = "com.google.android.exoplayer.stop";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f66656hyr = "com.google.android.exoplayer.rewind";

    /* JADX INFO: renamed from: l */
    public static final String f22795l = "com.google.android.exoplayer.next";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final String f66657lrht = "com.google.android.exoplayer.dismiss";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f66658n5r1 = "com.google.android.exoplayer.ffwd";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f66659ncyb = "com.google.android.exoplayer.prev";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int f66660uv6 = 0;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final int f66661vyq = 1;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f66662x9kr = "com.google.android.exoplayer.pause";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private boolean f66663a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @zy.dd
    private List<x9kr.toq> f66664cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private int f66665d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private int f66666d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private int f66667eqxt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Handler f66668f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @zy.dd
    private MediaSessionCompat.Token f66669fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f66670fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private boolean f66671fu4;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private final InterfaceC3756q f22796g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private int f66672gvn7;

    /* JADX INFO: renamed from: h */
    @zy.dd
    private x9kr.f7l8 f22797h;

    /* JADX INFO: renamed from: i */
    private int f22798i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f66673jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f66674jp0y;

    /* JADX INFO: renamed from: k */
    private final Context f22799k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @zy.dd
    private gc3c f66675ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final int f66676kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final C3752g f66677ld6;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private boolean f66678lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f66679mcp;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final f7l8 f22800n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final PendingIntent f66680n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private boolean f66681ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private boolean f66682o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    @zy.fn3e
    private int f66683oc;

    /* JADX INFO: renamed from: p */
    private final gc3c.InterfaceC3440y f22801p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3754n f22802q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final Map<String, x9kr.toq> f66684qrj;

    /* JADX INFO: renamed from: r */
    @zy.dd
    private String f22803r;

    /* JADX INFO: renamed from: s */
    private final IntentFilter f22804s;

    /* JADX INFO: renamed from: t */
    private boolean f22805t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f66685t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f66686toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f66687wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final Map<String, x9kr.toq> f66688x2;

    /* JADX INFO: renamed from: y */
    private final y9n f22806y;

    /* JADX INFO: renamed from: z */
    private boolean f22807z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f66689zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f66690zy;

    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        default void m13306k(int i2, Notification notification, boolean z2) {
        }

        default void toq(int i2, boolean z2) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.kja0$g */
    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    private class C3752g extends BroadcastReceiver {
        private C3752g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            gc3c gc3cVar = kja0.this.f66675ki;
            if (gc3cVar != null && kja0.this.f66685t8r && intent.getIntExtra(kja0.f22792c, kja0.this.f66676kja0) == kja0.this.f66676kja0) {
                String action = intent.getAction();
                if (kja0.f66655dd.equals(action)) {
                    if (gc3cVar.getPlaybackState() == 1) {
                        gc3cVar.prepare();
                    } else if (gc3cVar.getPlaybackState() == 4) {
                        gc3cVar.pc(gc3cVar.lw());
                    }
                    gc3cVar.play();
                    return;
                }
                if (kja0.f66662x9kr.equals(action)) {
                    gc3cVar.pause();
                    return;
                }
                if (kja0.f66659ncyb.equals(action)) {
                    gc3cVar.ch();
                    return;
                }
                if (kja0.f66656hyr.equals(action)) {
                    gc3cVar.ps();
                    return;
                }
                if (kja0.f66658n5r1.equals(action)) {
                    gc3cVar.m2t();
                    return;
                }
                if (kja0.f22795l.equals(action)) {
                    gc3cVar.zsr0();
                    return;
                }
                if (kja0.f22794f.equals(action)) {
                    gc3cVar.bwp(true);
                    return;
                }
                if (kja0.f66657lrht.equals(action)) {
                    kja0.this.ncyb(true);
                } else {
                    if (action == null || kja0.this.f22796g == null || !kja0.this.f66684qrj.containsKey(action)) {
                        return;
                    }
                    kja0.this.f22796g.zy(gc3cVar, action, intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.kja0$n */
    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    public interface InterfaceC3754n {
        @zy.dd
        /* JADX INFO: renamed from: k */
        PendingIntent mo13292k(gc3c gc3cVar);

        @zy.dd
        /* JADX INFO: renamed from: n */
        default CharSequence m13307n(gc3c gc3cVar) {
            return null;
        }

        @zy.dd
        /* JADX INFO: renamed from: q */
        Bitmap mo13293q(gc3c gc3cVar, toq toqVar);

        CharSequence toq(gc3c gc3cVar);

        @zy.dd
        CharSequence zy(gc3c gc3cVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.kja0$p */
    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3755p {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.kja0$q */
    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    public interface InterfaceC3756q {
        /* JADX INFO: renamed from: k */
        List<String> m13308k(gc3c gc3cVar);

        Map<String, x9kr.toq> toq(Context context, int i2);

        void zy(gc3c gc3cVar, String str, Intent intent);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.kja0$s */
    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3757s {
    }

    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    public final class toq {

        /* JADX INFO: renamed from: k */
        private final int f22809k;

        /* JADX INFO: renamed from: k */
        public void m13309k(Bitmap bitmap) {
            if (bitmap != null) {
                kja0.this.t8r(bitmap, this.f22809k);
            }
        }

        private toq(int i2) {
            this.f22809k = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.kja0$y */
    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    private class C3758y implements gc3c.InterfaceC3440y {
        private C3758y() {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void fu4(gc3c gc3cVar, gc3c.f7l8 f7l8Var) {
            if (f7l8Var.toq(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                kja0.this.ki();
            }
        }
    }

    protected kja0(Context context, String str, int i2, InterfaceC3754n interfaceC3754n, @zy.dd f7l8 f7l8Var, @zy.dd InterfaceC3756q interfaceC3756q, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, @zy.dd String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f22799k = applicationContext;
        this.f66686toq = str;
        this.f66690zy = i2;
        this.f22802q = interfaceC3754n;
        this.f22800n = f7l8Var;
        this.f22796g = interfaceC3756q;
        this.f66683oc = i3;
        this.f22803r = str2;
        int i11 = f22793e;
        f22793e = i11 + 1;
        this.f66676kja0 = i11;
        this.f66668f7l8 = com.google.android.exoplayer2.util.lrht.fu4(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.n7h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f22830k.m13295h(message);
            }
        });
        this.f22806y = y9n.m2138h(applicationContext);
        this.f22801p = new C3758y();
        this.f66677ld6 = new C3752g();
        this.f22804s = new IntentFilter();
        this.f66689zurt = true;
        this.f66681ni7 = true;
        this.f66673jk = true;
        this.f66682o1t = true;
        this.f66687wvg = true;
        this.f66674jp0y = true;
        this.f66678lvui = true;
        this.f66666d3 = 0;
        this.f66672gvn7 = 0;
        this.f66665d2ok = -1;
        this.f66670fti = 1;
        this.f66667eqxt = 1;
        Map<String, x9kr.toq> mapX2 = x2(applicationContext, i11, i4, i5, i6, i7, i8, i9, i10);
        this.f66688x2 = mapX2;
        Iterator<String> it = mapX2.keySet().iterator();
        while (it.hasNext()) {
            this.f22804s.addAction(it.next());
        }
        Map<String, x9kr.toq> qVar = interfaceC3756q != null ? interfaceC3756q.toq(applicationContext, this.f66676kja0) : Collections.emptyMap();
        this.f66684qrj = qVar;
        Iterator<String> it2 = qVar.keySet().iterator();
        while (it2.hasNext()) {
            this.f22804s.addAction(it2.next());
        }
        this.f66680n7h = m13298p(f66657lrht, applicationContext, this.f66676kja0);
        this.f22804s.addAction(f66657lrht);
    }

    private boolean dd(gc3c gc3cVar) {
        return (gc3cVar.getPlaybackState() == 4 || gc3cVar.getPlaybackState() == 1 || !gc3cVar.yqrt()) ? false : true;
    }

    private static void fu4(x9kr.f7l8 f7l8Var, @zy.dd Bitmap bitmap) {
        f7l8Var.m2038j(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m13295h(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            gc3c gc3cVar = this.f66675ki;
            if (gc3cVar != null) {
                x9kr(gc3cVar, null);
            }
        } else {
            if (i2 != 1) {
                return false;
            }
            gc3c gc3cVar2 = this.f66675ki;
            if (gc3cVar2 != null && this.f66685t8r && this.f22798i == message.arg1) {
                x9kr(gc3cVar2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki() {
        if (this.f66668f7l8.hasMessages(0)) {
            return;
        }
        this.f66668f7l8.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ncyb(boolean z2) {
        if (this.f66685t8r) {
            this.f66685t8r = false;
            this.f66668f7l8.removeMessages(0);
            this.f22806y.toq(this.f66690zy);
            this.f22799k.unregisterReceiver(this.f66677ld6);
            f7l8 f7l8Var = this.f22800n;
            if (f7l8Var != null) {
                f7l8Var.toq(this.f66690zy, z2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private static PendingIntent m13298p(String str, Context context, int i2) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(f22792c, i2);
        return PendingIntent.getBroadcast(context, i2, intent, com.google.android.exoplayer2.util.lrht.f23230k >= 23 ? 201326592 : 134217728);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r(Bitmap bitmap, int i2) {
        this.f66668f7l8.obtainMessage(1, i2, -1, bitmap).sendToTarget();
    }

    private static Map<String, x9kr.toq> x2(Context context, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        HashMap map = new HashMap();
        map.put(f66655dd, new x9kr.toq(i3, context.getString(C3748h.ld6.f66269x2), m13298p(f66655dd, context, i2)));
        map.put(f66662x9kr, new x9kr.toq(i4, context.getString(C3748h.ld6.f66252ld6), m13298p(f66662x9kr, context, i2)));
        map.put(f22794f, new x9kr.toq(i5, context.getString(C3748h.ld6.f22658z), m13298p(f22794f, context, i2)));
        map.put(f66656hyr, new x9kr.toq(i6, context.getString(C3748h.ld6.f66264t8r), m13298p(f66656hyr, context, i2)));
        map.put(f66658n5r1, new x9kr.toq(i7, context.getString(C3748h.ld6.f22653q), m13298p(f66658n5r1, context, i2)));
        map.put(f66659ncyb, new x9kr.toq(i8, context.getString(C3748h.ld6.f66251kja0), m13298p(f66659ncyb, context, i2)));
        map.put(f22795l, new x9kr.toq(i9, context.getString(C3748h.ld6.f22657y), m13298p(f22795l, context, i2)));
        return map;
    }

    private void x9kr(gc3c gc3cVar, @zy.dd Bitmap bitmap) {
        boolean zKja0 = kja0(gc3cVar);
        x9kr.f7l8 f7l8VarLd6 = ld6(gc3cVar, this.f22797h, zKja0, bitmap);
        this.f22797h = f7l8VarLd6;
        if (f7l8VarLd6 == null) {
            ncyb(false);
            return;
        }
        Notification notificationM2051y = f7l8VarLd6.m2051y();
        this.f22806y.mcp(this.f66690zy, notificationM2051y);
        if (!this.f66685t8r) {
            this.f22799k.registerReceiver(this.f66677ld6, this.f22804s);
        }
        f7l8 f7l8Var = this.f22800n;
        if (f7l8Var != null) {
            f7l8Var.m13306k(this.f66690zy, notificationM2051y, zKja0 || !this.f66685t8r);
        }
        this.f66685t8r = true;
    }

    public final void a9(boolean z2) {
        if (this.f66679mcp != z2) {
            this.f66679mcp = z2;
            if (z2) {
                this.f22807z = false;
            }
            cdj();
        }
    }

    public final void cdj() {
        if (this.f66685t8r) {
            ki();
        }
    }

    public final void d2ok(boolean z2) {
        if (this.f22805t != z2) {
            this.f22805t = z2;
            if (z2) {
                this.f66671fu4 = false;
            }
            cdj();
        }
    }

    public final void d3(boolean z2) {
        if (this.f66689zurt != z2) {
            this.f66689zurt = z2;
            cdj();
        }
    }

    public final void eqxt(boolean z2) {
        if (this.f66682o1t != z2) {
            this.f66682o1t = z2;
            cdj();
        }
    }

    public final void fn3e(int i2) {
        if (this.f66666d3 != i2) {
            this.f66666d3 = i2;
            cdj();
        }
    }

    public final void fti(boolean z2) {
        if (this.f66681ni7 != z2) {
            this.f66681ni7 = z2;
            cdj();
        }
    }

    public final void gvn7(boolean z2) {
        if (this.f66673jk != z2) {
            this.f66673jk = z2;
            cdj();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13302i(int i2) {
        if (this.f66670fti == i2) {
            return;
        }
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.f66670fti = i2;
        cdj();
    }

    public final void jk(boolean z2) {
        if (this.f66687wvg != z2) {
            this.f66687wvg = z2;
            cdj();
        }
    }

    public final void jp0y(boolean z2) {
        if (this.f22807z != z2) {
            this.f22807z = z2;
            if (z2) {
                this.f66679mcp = false;
            }
            cdj();
        }
    }

    protected boolean kja0(gc3c gc3cVar) {
        int playbackState = gc3cVar.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && gc3cVar.yqrt();
    }

    @zy.dd
    protected x9kr.f7l8 ld6(gc3c gc3cVar, @zy.dd x9kr.f7l8 f7l8Var, boolean z2, @zy.dd Bitmap bitmap) {
        if (gc3cVar.getPlaybackState() == 1 && gc3cVar.d8wk().ni7()) {
            this.f66664cdj = null;
            return null;
        }
        List<String> listN7h = n7h(gc3cVar);
        ArrayList arrayList = new ArrayList(listN7h.size());
        for (int i2 = 0; i2 < listN7h.size(); i2++) {
            String str = listN7h.get(i2);
            x9kr.toq toqVar = this.f66688x2.containsKey(str) ? this.f66688x2.get(str) : this.f66684qrj.get(str);
            if (toqVar != null) {
                arrayList.add(toqVar);
            }
        }
        if (f7l8Var == null || !arrayList.equals(this.f66664cdj)) {
            f7l8Var = new x9kr.f7l8(this.f22799k, this.f66686toq);
            this.f66664cdj = arrayList;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                f7l8Var.toq((x9kr.toq) arrayList.get(i3));
            }
        }
        C0969k.n nVar = new C0969k.n();
        MediaSessionCompat.Token token = this.f66669fn3e;
        if (token != null) {
            nVar.gvn7(token);
        }
        nVar.d3(qrj(listN7h, gc3cVar));
        nVar.oc(!z2);
        nVar.jp0y(this.f66680n7h);
        f7l8Var.xwq3(nVar);
        f7l8Var.m2034f(this.f66680n7h);
        f7l8Var.a9(this.f66670fti).m2030b(z2).oc(this.f66666d3).eqxt(this.f66674jp0y).m2048u(this.f66683oc).fnq8(this.f66667eqxt).i1(this.f66665d2ok).hyr(this.f66672gvn7);
        if (com.google.android.exoplayer2.util.lrht.f23230k < 21 || !this.f66678lvui || !gc3cVar.isPlaying() || gc3cVar.mo12088r() || gc3cVar.fnq8() || gc3cVar.f7l8().f21216k != 1.0f) {
            f7l8Var.lv5(false).vq(false);
        } else {
            f7l8Var.qo(System.currentTimeMillis() - gc3cVar.n2t()).lv5(true).vq(true);
        }
        f7l8Var.x9kr(this.f22802q.toq(gc3cVar));
        f7l8Var.dd(this.f22802q.zy(gc3cVar));
        f7l8Var.m2049v(this.f22802q.m13307n(gc3cVar));
        if (bitmap == null) {
            InterfaceC3754n interfaceC3754n = this.f22802q;
            int i4 = this.f22798i + 1;
            this.f22798i = i4;
            bitmap = interfaceC3754n.mo13293q(gc3cVar, new toq(i4));
        }
        fu4(f7l8Var, bitmap);
        f7l8Var.m2046r(this.f22802q.mo13292k(gc3cVar));
        String str2 = this.f22803r;
        if (str2 != null) {
            f7l8Var.m2033e(str2);
        }
        f7l8Var.bf2(true);
        return f7l8Var;
    }

    public final void lvui(boolean z2) {
        if (this.f66663a9 == z2) {
            return;
        }
        this.f66663a9 = z2;
        cdj();
    }

    public final void mcp(boolean z2) {
        if (this.f66678lvui != z2) {
            this.f66678lvui = z2;
            cdj();
        }
    }

    protected List<String> n7h(gc3c gc3cVar) {
        boolean zMo12080d = gc3cVar.mo12080d(7);
        boolean zMo12080d2 = gc3cVar.mo12080d(11);
        boolean zMo12080d3 = gc3cVar.mo12080d(12);
        boolean zMo12080d4 = gc3cVar.mo12080d(9);
        ArrayList arrayList = new ArrayList();
        if (this.f66689zurt && zMo12080d) {
            arrayList.add(f66659ncyb);
        }
        if (this.f66682o1t && zMo12080d2) {
            arrayList.add(f66656hyr);
        }
        if (this.f66673jk) {
            if (dd(gc3cVar)) {
                arrayList.add(f66662x9kr);
            } else {
                arrayList.add(f66655dd);
            }
        }
        if (this.f66687wvg && zMo12080d3) {
            arrayList.add(f66658n5r1);
        }
        if (this.f66681ni7 && zMo12080d4) {
            arrayList.add(f22795l);
        }
        InterfaceC3756q interfaceC3756q = this.f22796g;
        if (interfaceC3756q != null) {
            arrayList.addAll(interfaceC3756q.m13308k(gc3cVar));
        }
        if (this.f66663a9) {
            arrayList.add(f22794f);
        }
        return arrayList;
    }

    public final void ni7(int i2) {
        if (this.f66672gvn7 != i2) {
            this.f66672gvn7 = i2;
            cdj();
        }
    }

    public final void o1t(@zy.dd gc3c gc3cVar) {
        boolean z2 = true;
        C3844k.m13633s(Looper.myLooper() == Looper.getMainLooper());
        if (gc3cVar != null && gc3cVar.g1() != Looper.getMainLooper()) {
            z2 = false;
        }
        C3844k.m13629k(z2);
        gc3c gc3cVar2 = this.f66675ki;
        if (gc3cVar2 == gc3cVar) {
            return;
        }
        if (gc3cVar2 != null) {
            gc3cVar2.mo12081e(this.f22801p);
            if (gc3cVar == null) {
                ncyb(false);
            }
        }
        this.f66675ki = gc3cVar;
        if (gc3cVar != null) {
            gc3cVar.ngy(this.f22801p);
            ki();
        }
    }

    public final void oc(boolean z2) {
        if (this.f66671fu4 != z2) {
            this.f66671fu4 = z2;
            if (z2) {
                this.f22805t = false;
            }
            cdj();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int[] qrj(java.util.List<java.lang.String> r7, com.google.android.exoplayer2.gc3c r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r7.indexOf(r1)
            boolean r2 = r6.f66671fu4
            r3 = -1
            if (r2 == 0) goto L18
            java.lang.String r2 = "com.google.android.exoplayer.prev"
            int r2 = r7.indexOf(r2)
            goto L24
        L18:
            boolean r2 = r6.f22805t
            if (r2 == 0) goto L23
            java.lang.String r2 = "com.google.android.exoplayer.rewind"
            int r2 = r7.indexOf(r2)
            goto L24
        L23:
            r2 = r3
        L24:
            boolean r4 = r6.f22807z
            if (r4 == 0) goto L2f
            java.lang.String r4 = "com.google.android.exoplayer.next"
            int r7 = r7.indexOf(r4)
            goto L3b
        L2f:
            boolean r4 = r6.f66679mcp
            if (r4 == 0) goto L3a
            java.lang.String r4 = "com.google.android.exoplayer.ffwd"
            int r7 = r7.indexOf(r4)
            goto L3b
        L3a:
            r7 = r3
        L3b:
            r4 = 3
            int[] r4 = new int[r4]
            r5 = 0
            if (r2 == r3) goto L44
            r4[r5] = r2
            r5 = 1
        L44:
            boolean r8 = r6.dd(r8)
            if (r0 == r3) goto L52
            if (r8 == 0) goto L52
            int r8 = r5 + 1
            r4[r5] = r0
        L50:
            r5 = r8
            goto L5b
        L52:
            if (r1 == r3) goto L5b
            if (r8 != 0) goto L5b
            int r8 = r5 + 1
            r4[r5] = r1
            goto L50
        L5b:
            if (r7 == r3) goto L62
            int r8 = r5 + 1
            r4[r5] = r7
            r5 = r8
        L62:
            int[] r7 = java.util.Arrays.copyOf(r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.kja0.qrj(java.util.List, com.google.android.exoplayer2.gc3c):int[]");
    }

    /* JADX INFO: renamed from: r */
    public final void m13303r(int i2) {
        if (this.f66667eqxt == i2) {
            return;
        }
        if (i2 != -1 && i2 != 0 && i2 != 1) {
            throw new IllegalStateException();
        }
        this.f66667eqxt = i2;
        cdj();
    }

    /* JADX INFO: renamed from: t */
    public final void m13304t(@zy.fn3e int i2) {
        if (this.f66683oc != i2) {
            this.f66683oc = i2;
            cdj();
        }
    }

    public final void wvg(int i2) {
        if (this.f66665d2ok == i2) {
            return;
        }
        if (i2 != -2 && i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.f66665d2ok = i2;
        cdj();
    }

    /* JADX INFO: renamed from: z */
    public final void m13305z(MediaSessionCompat.Token token) {
        if (com.google.android.exoplayer2.util.lrht.zy(this.f66669fn3e, token)) {
            return;
        }
        this.f66669fn3e = token;
        cdj();
    }

    public final void zurt(boolean z2) {
        if (this.f66674jp0y != z2) {
            this.f66674jp0y = z2;
            cdj();
        }
    }

    /* JADX INFO: compiled from: PlayerNotificationManager.java */
    public static class zy {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        protected int f66692cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        protected int f66693f7l8;

        /* JADX INFO: renamed from: g */
        protected InterfaceC3754n f22811g;

        /* JADX INFO: renamed from: h */
        protected int f22812h;

        /* JADX INFO: renamed from: k */
        protected final Context f22813k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        @zy.dd
        protected String f66694ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        protected int f66695kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        protected int f66696ld6;

        /* JADX INFO: renamed from: n */
        @zy.dd
        protected InterfaceC3756q f22814n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        protected int f66697n7h;

        /* JADX INFO: renamed from: p */
        protected int f22815p;

        /* JADX INFO: renamed from: q */
        @zy.dd
        protected f7l8 f22816q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        protected int f66698qrj;

        /* JADX INFO: renamed from: s */
        protected int f22817s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        protected final int f66699toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        protected int f66700x2;

        /* JADX INFO: renamed from: y */
        protected int f22818y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        protected final String f66701zy;

        @Deprecated
        public zy(Context context, int i2, String str, InterfaceC3754n interfaceC3754n) {
            this(context, i2, str);
            this.f22811g = interfaceC3754n;
        }

        public zy f7l8(String str) {
            this.f66694ki = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public zy m13310g(int i2) {
            this.f66695kja0 = i2;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public zy m13311h(int i2) {
            this.f66697n7h = i2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public kja0 m13312k() {
            int i2 = this.f66693f7l8;
            if (i2 != 0) {
                com.google.android.exoplayer2.util.fti.m13582k(this.f22813k, this.f66701zy, i2, this.f22818y, this.f22817s);
            }
            return new kja0(this.f22813k, this.f66701zy, this.f66699toq, this.f22811g, this.f22816q, this.f22814n, this.f22815p, this.f66700x2, this.f66698qrj, this.f66697n7h, this.f66696ld6, this.f66695kja0, this.f22812h, this.f66692cdj, this.f66694ki);
        }

        public zy kja0(int i2) {
            this.f22815p = i2;
            return this;
        }

        public zy ld6(int i2) {
            this.f66698qrj = i2;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public zy m13313n(InterfaceC3756q interfaceC3756q) {
            this.f22814n = interfaceC3756q;
            return this;
        }

        public zy n7h(int i2) {
            this.f66696ld6 = i2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public zy m13314p(f7l8 f7l8Var) {
            this.f22816q = f7l8Var;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public zy m13315q(int i2) {
            this.f66693f7l8 = i2;
            return this;
        }

        public zy qrj(int i2) {
            this.f22812h = i2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public zy m13316s(int i2) {
            this.f66692cdj = i2;
            return this;
        }

        public zy toq(int i2) {
            this.f22818y = i2;
            return this;
        }

        public zy x2(int i2) {
            this.f66700x2 = i2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public zy m13317y(InterfaceC3754n interfaceC3754n) {
            this.f22811g = interfaceC3754n;
            return this;
        }

        public zy zy(int i2) {
            this.f22817s = i2;
            return this;
        }

        public zy(Context context, @zy.a9(from = 1) int i2, String str) {
            C3844k.m13629k(i2 > 0);
            this.f22813k = context;
            this.f66699toq = i2;
            this.f66701zy = str;
            this.f22817s = 2;
            this.f22811g = new C3747g(null);
            this.f22815p = C3748h.n.f22668j;
            this.f66700x2 = C3748h.n.f22663e;
            this.f66698qrj = C3748h.n.f66326vyq;
            this.f66697n7h = C3748h.n.f22673o;
            this.f66696ld6 = C3748h.n.f66295hb;
            this.f66695kja0 = C3748h.n.f66304lrht;
            this.f22812h = C3748h.n.f66314nn86;
            this.f66692cdj = C3748h.n.f66324uv6;
        }
    }
}
