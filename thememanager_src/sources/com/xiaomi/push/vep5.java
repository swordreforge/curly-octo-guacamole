package com.xiaomi.push;

import com.xiaomi.push.h7am;
import com.xiaomi.push.h7am.zy;
import java.io.File;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class vep5 extends h7am.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final /* synthetic */ String f73705f7l8;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ Date f34024g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Date f34025n;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ h7am f34026p;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ int f34027q;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ boolean f34028s;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ String f34029y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    File f73706zy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vep5(h7am h7amVar, int i2, Date date, Date date2, String str, String str2, boolean z2) {
        super();
        this.f34026p = h7amVar;
        this.f34027q = i2;
        this.f34025n = date;
        this.f34024g = date2;
        this.f73705f7l8 = str;
        this.f34029y = str2;
        this.f34028s = z2;
    }

    @Override // com.xiaomi.push.h7am.toq, com.xiaomi.push.qrj.toq
    public void toq() {
        try {
            File file = new File(this.f34026p.f73351toq.getFilesDir() + "/.logcache");
            if (ydj3.toq(file)) {
                file.mkdirs();
                if (file.isDirectory()) {
                    cv06 cv06Var = new cv06();
                    cv06Var.m20702q(this.f34027q);
                    this.f73706zy = cv06Var.zy(this.f34026p.f73351toq, this.f34025n, this.f34024g, file);
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.xiaomi.push.qrj.toq
    public void zy() {
        File file = this.f73706zy;
        if (file != null && file.exists()) {
            this.f34026p.f32999k.add(this.f34026p.new zy(this.f73705f7l8, this.f34029y, this.f73706zy, this.f34028s));
        }
        this.f34026p.m20949n(0L);
    }
}
