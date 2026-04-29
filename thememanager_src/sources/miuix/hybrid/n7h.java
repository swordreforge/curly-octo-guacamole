package miuix.hybrid;

import java.util.Map;

/* JADX INFO: compiled from: HybridFeature.java */
/* JADX INFO: loaded from: classes3.dex */
public interface n7h {

    /* JADX INFO: renamed from: miuix.hybrid.n7h$k */
    /* JADX INFO: compiled from: HybridFeature.java */
    public enum EnumC7150k {
        SYNC,
        ASYNC,
        CALLBACK
    }

    EnumC7150k getInvocationMode(C7156z request);

    o1t invoke(C7156z request);

    void setParams(Map<String, String> params);
}
