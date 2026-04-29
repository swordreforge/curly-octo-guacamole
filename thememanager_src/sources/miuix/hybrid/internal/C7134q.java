package miuix.hybrid.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: miuix.hybrid.internal.q */
/* JADX INFO: compiled from: Feature.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7134q {

    /* JADX INFO: renamed from: k */
    private String f40291k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<String, String> f87728toq = new HashMap();

    public void f7l8(Map<String, String> params) {
        this.f87728toq = params;
    }

    /* JADX INFO: renamed from: g */
    public void m25861g(String key, String value) {
        this.f87728toq.put(key, value);
    }

    /* JADX INFO: renamed from: k */
    public void m25862k() {
        this.f87728toq.clear();
    }

    /* JADX INFO: renamed from: n */
    public void m25863n(String name) {
        this.f40291k = name;
    }

    /* JADX INFO: renamed from: q */
    public Map<String, String> m25864q() {
        return this.f87728toq;
    }

    public String toq() {
        return this.f40291k;
    }

    public String zy(String key) {
        return this.f87728toq.get(key);
    }
}
