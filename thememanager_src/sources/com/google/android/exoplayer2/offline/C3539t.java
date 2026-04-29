package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.wvg;
import com.google.android.exoplayer2.upstream.d2ok;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.t */
/* JADX INFO: compiled from: FilteringManifestParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3539t<T extends wvg<T>> implements d2ok.InterfaceC3789k<T> {

    /* JADX INFO: renamed from: k */
    private final d2ok.InterfaceC3789k<? extends T> f21008k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final List<StreamKey> f65052toq;

    public C3539t(d2ok.InterfaceC3789k<? extends T> interfaceC3789k, @dd List<StreamKey> list) {
        this.f21008k = interfaceC3789k;
        this.f65052toq = list;
    }

    @Override // com.google.android.exoplayer2.upstream.d2ok.InterfaceC3789k
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public T mo12420k(Uri uri, InputStream inputStream) throws IOException {
        T tMo12420k = this.f21008k.mo12420k(uri, inputStream);
        List<StreamKey> list = this.f65052toq;
        return (list == null || list.isEmpty()) ? tMo12420k : (T) tMo12420k.m12453k(this.f65052toq);
    }
}
