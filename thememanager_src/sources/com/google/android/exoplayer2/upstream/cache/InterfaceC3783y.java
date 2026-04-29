package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.y */
/* JADX INFO: compiled from: CacheKeyFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3783y {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC3783y f22966k = new InterfaceC3783y() { // from class: com.google.android.exoplayer2.upstream.cache.f7l8
        @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC3783y
        /* JADX INFO: renamed from: k */
        public final String mo13368k(com.google.android.exoplayer2.upstream.t8r t8rVar) {
            return InterfaceC3783y.toq(t8rVar);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String toq(com.google.android.exoplayer2.upstream.t8r t8rVar) {
        String str = t8rVar.f23107s;
        return str != null ? str : t8rVar.f23103k.toString();
    }

    /* JADX INFO: renamed from: k */
    String mo13368k(com.google.android.exoplayer2.upstream.t8r t8rVar);
}
