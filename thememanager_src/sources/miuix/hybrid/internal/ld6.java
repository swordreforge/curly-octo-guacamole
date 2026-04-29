package miuix.hybrid.internal;

import android.net.Uri;
import com.xiaomi.onetrack.util.C5814z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PermissionManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private Map<String, Boolean> f40277k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C7127k f87715toq;

    public ld6(C7127k config) {
        this.f87715toq = config;
    }

    /* JADX INFO: renamed from: k */
    private boolean m25824k(String url) {
        Uri uri = Uri.parse(url);
        String host = "file".equals(uri.getScheme()) ? "*" : uri.getHost();
        Iterator<Map.Entry<String, C7129p>> it = this.f87715toq.m25813p().entrySet().iterator();
        boolean zEquals = false;
        while (it.hasNext()) {
            C7129p value = it.next().getValue();
            String strM25834k = value.m25834k();
            String host2 = "*".equals(strM25834k) ? "*" : Uri.parse(strM25834k).getHost();
            if (value.toq()) {
                String[] strArrSplit = host2.split(C5814z.f32495a);
                String[] strArrSplit2 = host.split(C5814z.f32495a);
                if (strArrSplit2.length >= strArrSplit.length) {
                    int i2 = 1;
                    while (true) {
                        if (i2 > strArrSplit.length) {
                            zEquals = true;
                            break;
                        }
                        if (!strArrSplit2[strArrSplit2.length - i2].equals(strArrSplit[strArrSplit.length - i2])) {
                            zEquals = false;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                zEquals = host.equals(host2);
            }
            if (zEquals) {
                break;
            }
        }
        return zEquals;
    }

    public boolean toq(String url) {
        if (!this.f40277k.containsKey(url)) {
            this.f40277k.put(url, Boolean.valueOf(m25824k(url)));
        }
        return this.f40277k.get(url).booleanValue();
    }
}
