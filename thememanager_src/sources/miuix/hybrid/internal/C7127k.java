package miuix.hybrid.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: miuix.hybrid.internal.k */
/* JADX INFO: compiled from: Config.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7127k {

    /* JADX INFO: renamed from: k */
    private x2 f40266k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f87704toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f87705zy;

    /* JADX INFO: renamed from: q */
    private Map<String, C7134q> f40268q = new HashMap();

    /* JADX INFO: renamed from: n */
    private Map<String, String> f40267n = new HashMap();

    /* JADX INFO: renamed from: g */
    private Map<String, C7129p> f40265g = new HashMap();

    public void cdj(Map<String, C7129p> permissions) {
        this.f40265g = permissions;
    }

    public C7134q f7l8(String name) {
        return this.f40268q.get(name);
    }

    public void fn3e(String vendor) {
        this.f87704toq = vendor;
    }

    /* JADX INFO: renamed from: g */
    public String m25808g() {
        return this.f87705zy;
    }

    /* JADX INFO: renamed from: h */
    public void m25809h(Map<String, C7134q> features) {
        this.f40268q = features;
    }

    /* JADX INFO: renamed from: i */
    public void m25810i(x2 security) {
        this.f40266k = security;
    }

    /* JADX INFO: renamed from: k */
    public void m25811k(C7134q feature) {
        this.f40268q.put(feature.toq(), feature);
    }

    public void ki(String key, String value) {
        this.f40267n.put(key, value);
    }

    public void kja0(String content) {
        this.f87705zy = content;
    }

    public String ld6(String key) {
        return this.f40267n.get(key);
    }

    /* JADX INFO: renamed from: n */
    public void m25812n() {
        this.f40267n.clear();
    }

    public String n7h() {
        return this.f87704toq;
    }

    /* JADX INFO: renamed from: p */
    public Map<String, C7129p> m25813p() {
        return this.f40265g;
    }

    /* JADX INFO: renamed from: q */
    public void m25814q() {
        this.f40265g.clear();
    }

    public x2 qrj() {
        return this.f40266k;
    }

    /* JADX INFO: renamed from: s */
    public C7129p m25815s(String url) {
        return this.f40265g.get(url);
    }

    public void t8r(Map<String, String> preferences) {
        this.f40267n = preferences;
    }

    public void toq(C7129p permission) {
        this.f40265g.put(permission.m25834k(), permission);
    }

    public Map<String, String> x2() {
        return this.f40267n;
    }

    /* JADX INFO: renamed from: y */
    public Map<String, C7134q> m25816y() {
        return this.f40268q;
    }

    public void zy() {
        this.f40268q.clear();
    }
}
