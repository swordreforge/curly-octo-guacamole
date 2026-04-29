package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtractorsFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface kja0 {

    /* JADX INFO: renamed from: k */
    public static final kja0 f19867k = new kja0() { // from class: com.google.android.exoplayer2.extractor.n7h
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return kja0.m11779k();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    static /* synthetic */ InterfaceC3397p[] m11779k() {
        return new InterfaceC3397p[0];
    }

    default InterfaceC3397p[] toq(Uri uri, Map<String, List<String>> map) {
        return zy();
    }

    InterfaceC3397p[] zy();
}
