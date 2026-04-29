package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.x9kr;
import com.google.android.exoplayer2.offline.C3531n;
import java.util.List;
import pc.toq;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.p */
/* JADX INFO: compiled from: DownloadNotificationHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3761p {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.nn86
    private static final int f66710toq = 0;

    /* JADX INFO: renamed from: k */
    private final x9kr.f7l8 f22834k;

    public C3761p(Context context, String str) {
        this.f22834k = new x9kr.f7l8(context.getApplicationContext(), str);
    }

    /* JADX INFO: renamed from: q */
    private Notification m13326q(Context context, @zy.fn3e int i2, @zy.dd PendingIntent pendingIntent, @zy.dd String str, @zy.nn86 int i3, int i4, int i5, boolean z2, boolean z3, boolean z5) {
        this.f22834k.m2048u(i2);
        this.f22834k.x9kr(i3 == 0 ? null : context.getResources().getString(i3));
        this.f22834k.m2046r(pendingIntent);
        this.f22834k.xwq3(str != null ? new x9kr.C0462n().wvg(str) : null);
        this.f22834k.a98o(i4, i5, z2);
        this.f22834k.m2030b(z3);
        this.f22834k.lv5(z5);
        return this.f22834k.m2051y();
    }

    private Notification zy(Context context, @zy.fn3e int i2, @zy.dd PendingIntent pendingIntent, @zy.dd String str, @zy.nn86 int i3) {
        return m13326q(context, i2, pendingIntent, str, i3, 0, 0, false, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification m13327g(android.content.Context r22, @zy.fn3e int r23, @zy.dd android.app.PendingIntent r24, @zy.dd java.lang.String r25, java.util.List<com.google.android.exoplayer2.offline.C3531n> r26, int r27) {
        /*
            r21 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r9 = r0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        La:
            int r10 = r26.size()
            if (r3 >= r10) goto L4a
            r10 = r26
            java.lang.Object r11 = r10.get(r3)
            com.google.android.exoplayer2.offline.n r11 = (com.google.android.exoplayer2.offline.C3531n) r11
            int r12 = r11.f65039toq
            if (r12 == 0) goto L46
            r13 = 2
            if (r12 == r13) goto L28
            r13 = 5
            if (r12 == r13) goto L26
            r13 = 7
            if (r12 == r13) goto L28
            goto L47
        L26:
            r7 = r0
            goto L47
        L28:
            float r4 = r11.toq()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L34
            float r2 = r2 + r4
            r9 = r1
        L34:
            long r11 = r11.m12391k()
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L40
            r4 = r0
            goto L41
        L40:
            r4 = r1
        L41:
            r6 = r6 | r4
            int r8 = r8 + 1
            r4 = r0
            goto L47
        L46:
            r5 = r0
        L47:
            int r3 = r3 + 1
            goto La
        L4a:
            if (r4 == 0) goto L51
            int r3 = pc.toq.C7606y.f94429zy
        L4e:
            r15 = r3
            r3 = r0
            goto L6f
        L51:
            if (r5 == 0) goto L68
            if (r27 == 0) goto L68
            r3 = r27 & 2
            if (r3 == 0) goto L5e
            int r3 = pc.toq.C7606y.f43940y
        L5b:
            r15 = r3
            r3 = r1
            goto L6f
        L5e:
            r3 = r27 & 1
            if (r3 == 0) goto L65
            int r3 = pc.toq.C7606y.f94427f7l8
            goto L5b
        L65:
            int r3 = pc.toq.C7606y.f43934g
            goto L5b
        L68:
            if (r7 == 0) goto L6d
            int r3 = pc.toq.C7606y.f43939s
            goto L4e
        L6d:
            r3 = r0
            r15 = r1
        L6f:
            if (r3 == 0) goto L8a
            r3 = 100
            if (r4 == 0) goto L83
            float r4 = (float) r8
            float r2 = r2 / r4
            int r2 = (int) r2
            if (r9 == 0) goto L7d
            if (r6 == 0) goto L7d
            goto L7e
        L7d:
            r0 = r1
        L7e:
            r18 = r0
            r17 = r2
            goto L87
        L83:
            r18 = r0
            r17 = r1
        L87:
            r16 = r3
            goto L90
        L8a:
            r16 = r1
            r17 = r16
            r18 = r17
        L90:
            r19 = 1
            r20 = 0
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            android.app.Notification r0 = r10.m13326q(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.C3761p.m13327g(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List, int):android.app.Notification");
    }

    /* JADX INFO: renamed from: k */
    public Notification m13328k(Context context, @zy.fn3e int i2, @zy.dd PendingIntent pendingIntent, @zy.dd String str) {
        return zy(context, i2, pendingIntent, str, toq.C7606y.f43935k);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public Notification m13329n(Context context, @zy.fn3e int i2, @zy.dd PendingIntent pendingIntent, @zy.dd String str, List<C3531n> list) {
        return m13327g(context, i2, pendingIntent, str, list, 0);
    }

    public Notification toq(Context context, @zy.fn3e int i2, @zy.dd PendingIntent pendingIntent, @zy.dd String str) {
        return zy(context, i2, pendingIntent, str, toq.C7606y.f43938q);
    }
}
