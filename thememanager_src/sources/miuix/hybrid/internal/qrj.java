package miuix.hybrid.internal;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: SecurityManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class qrj {

    /* JADX INFO: renamed from: g */
    private static String f40292g = null;

    /* JADX INFO: renamed from: n */
    private static final String f40293n = "hybrid_key.pem";

    /* JADX INFO: renamed from: k */
    private C7127k f40294k;

    /* JADX INFO: renamed from: q */
    private Boolean f40295q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f87729toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f87730zy;

    public qrj(C7127k config, Context context) {
        this.f40294k = config;
        if (config != null && config.qrj() != null) {
            this.f87729toq = config.qrj().toq();
            this.f87730zy = config.qrj().m25900k();
        }
        if (f40292g == null) {
            f40292g = toq(context);
        }
    }

    /* JADX INFO: renamed from: g */
    private String m25865g(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line == null) {
                return sb.substring(0, sb.length() - 1);
            }
            if (!"".equals(line.trim()) && !line.startsWith("-----")) {
                sb.append(line);
                sb.append('\r');
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private File m25866k(Context context) {
        return new File(context.getFilesDir(), "miuisdk");
    }

    /* JADX INFO: renamed from: n */
    private boolean m25867n(String content, String sign) throws Exception {
        return sign != null && n7h.ld6(content, n7h.m25830q(f40292g), sign);
    }

    private String toq(Context context) throws Throwable {
        BufferedReader bufferedReader;
        File file = new File(m25866k(context), f40293n);
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(file.exists() ? new FileInputStream(file) : context.getResources().getAssets().open("keys/hybrid_key.pem")));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            String strM25865g = m25865g(bufferedReader);
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return strM25865g;
        } catch (IOException unused2) {
            throw new IllegalStateException("cannot read hybrid key.");
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m25868q() {
        if (this.f40295q == null) {
            try {
                this.f40295q = Boolean.valueOf(m25867n(zy.m25902g(this.f40294k), this.f87730zy));
            } catch (Exception unused) {
                this.f40295q = Boolean.FALSE;
            }
        }
        return this.f40295q.booleanValue();
    }

    public boolean zy() {
        long j2 = this.f87729toq;
        return 0 < j2 && j2 < System.currentTimeMillis();
    }
}
