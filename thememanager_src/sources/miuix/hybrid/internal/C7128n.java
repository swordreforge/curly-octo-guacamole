package miuix.hybrid.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: miuix.hybrid.internal.n */
/* JADX INFO: compiled from: FeatureManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7128n {

    /* JADX INFO: renamed from: k */
    private Map<String, miuix.hybrid.n7h> f40278k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C7127k f87716toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ClassLoader f87717zy;

    public C7128n(C7127k config, ClassLoader loader) {
        this.f87716toq = config;
        this.f87717zy = loader;
    }

    /* JADX INFO: renamed from: k */
    private miuix.hybrid.n7h m25825k(String name) throws C7126g {
        try {
            return (miuix.hybrid.n7h) this.f87717zy.loadClass(name).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new C7126g(204, "feature not found: " + name);
        } catch (IllegalAccessException unused2) {
            throw new C7126g(204, "feature cannot be accessed: " + name);
        } catch (InstantiationException unused3) {
            throw new C7126g(204, "feature cannot be instantiated: " + name);
        }
    }

    public miuix.hybrid.n7h toq(String name) throws C7126g {
        miuix.hybrid.n7h n7hVar = this.f40278k.get(name);
        if (n7hVar != null) {
            return n7hVar;
        }
        C7134q c7134qF7l8 = this.f87716toq.f7l8(name);
        if (c7134qF7l8 != null) {
            miuix.hybrid.n7h n7hVarM25825k = m25825k(name);
            n7hVarM25825k.setParams(c7134qF7l8.m25864q());
            this.f40278k.put(name, n7hVarM25825k);
            return n7hVarM25825k;
        }
        throw new C7126g(204, "feature not declared: " + name);
    }
}
