package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.push.y2;

/* JADX INFO: loaded from: classes3.dex */
class gyi implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f32995k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ y2.AbstractRunnableC5962k f32996q;

    gyi(y2.AbstractRunnableC5962k abstractRunnableC5962k, Context context) {
        this.f32996q = abstractRunnableC5962k;
        this.f32995k = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        SQLiteDatabase sQLiteDatabaseMo22041k = null;
        try {
            try {
                sQLiteDatabaseMo22041k = this.f32996q.mo22041k();
                if (sQLiteDatabaseMo22041k != null && sQLiteDatabaseMo22041k.isOpen()) {
                    sQLiteDatabaseMo22041k.beginTransaction();
                    this.f32996q.mo22042n(this.f32995k, sQLiteDatabaseMo22041k);
                    sQLiteDatabaseMo22041k.setTransactionSuccessful();
                }
                if (sQLiteDatabaseMo22041k != null) {
                    try {
                        sQLiteDatabaseMo22041k.endTransaction();
                    } catch (Exception e2) {
                        e = e2;
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                    }
                }
                AbstractC5949u abstractC5949u = this.f32996q.f34196q;
                if (abstractC5949u != null) {
                    abstractC5949u.close();
                }
            } catch (Exception e3) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                if (sQLiteDatabaseMo22041k != null) {
                    try {
                        sQLiteDatabaseMo22041k.endTransaction();
                    } catch (Exception e4) {
                        e = e4;
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e);
                    }
                }
                AbstractC5949u abstractC5949u2 = this.f32996q.f34196q;
                if (abstractC5949u2 != null) {
                    abstractC5949u2.close();
                }
            }
            this.f32996q.mo22044q(this.f32995k);
        } catch (Throwable th) {
            if (sQLiteDatabaseMo22041k != null) {
                try {
                    sQLiteDatabaseMo22041k.endTransaction();
                } catch (Exception e6) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e6);
                    this.f32996q.mo22044q(this.f32995k);
                    throw th;
                }
            }
            AbstractC5949u abstractC5949u3 = this.f32996q.f34196q;
            if (abstractC5949u3 != null) {
                abstractC5949u3.close();
            }
            this.f32996q.mo22044q(this.f32995k);
            throw th;
        }
    }
}
