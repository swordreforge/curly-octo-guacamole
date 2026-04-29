package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lg4k implements Runnable {

    /* JADX INFO: renamed from: k */
    private Context f33300k;

    /* JADX INFO: renamed from: n */
    private Runnable f33301n;

    /* JADX INFO: renamed from: q */
    private File f33302q;

    /* synthetic */ lg4k(Context context, File file, a3dw a3dwVar) {
        this(context, file);
    }

    public static void toq(Context context, File file, Runnable runnable) {
        new a3dw(context, file, runnable).run();
    }

    /* JADX INFO: renamed from: k */
    protected abstract void mo20551k(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        d6od d6odVarM20720k = null;
        try {
            try {
                if (this.f33302q == null) {
                    this.f33302q = new File(this.f33300k.getFilesDir(), "default_locker");
                }
                d6odVarM20720k = d6od.m20720k(this.f33300k, this.f33302q);
                Runnable runnable = this.f33301n;
                if (runnable != null) {
                    runnable.run();
                }
                mo20551k(this.f33300k);
                if (d6odVarM20720k == null) {
                    return;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (d6odVarM20720k == null) {
                    return;
                }
            }
            d6odVarM20720k.toq();
        } catch (Throwable th) {
            if (d6odVarM20720k != null) {
                d6odVarM20720k.toq();
            }
            throw th;
        }
    }

    private lg4k(Context context, File file) {
        this.f33300k = context;
        this.f33302q = file;
    }
}
