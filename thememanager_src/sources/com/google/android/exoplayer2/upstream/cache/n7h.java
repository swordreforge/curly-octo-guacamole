package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: compiled from: ContentMetadataMutations.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h {

    /* JADX INFO: renamed from: k */
    private final Map<String, Object> f22923k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<String> f66776toq = new ArrayList();

    /* JADX INFO: renamed from: k */
    private n7h m13403k(String str, Object obj) {
        this.f22923k.put((String) C3844k.f7l8(str), C3844k.f7l8(obj));
        this.f66776toq.remove(str);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public static n7h m13404s(n7h n7hVar, @dd Uri uri) {
        return uri == null ? n7hVar.m13408q(qrj.f66781toq) : n7hVar.m13406g(qrj.f66781toq, uri.toString());
    }

    /* JADX INFO: renamed from: y */
    public static n7h m13405y(n7h n7hVar, long j2) {
        return n7hVar.m13407n(qrj.f66782zy, j2);
    }

    public n7h f7l8(String str, byte[] bArr) {
        return m13403k(str, Arrays.copyOf(bArr, bArr.length));
    }

    /* JADX INFO: renamed from: g */
    public n7h m13406g(String str, String str2) {
        return m13403k(str, str2);
    }

    /* JADX INFO: renamed from: n */
    public n7h m13407n(String str, long j2) {
        return m13403k(str, Long.valueOf(j2));
    }

    /* JADX INFO: renamed from: q */
    public n7h m13408q(String str) {
        this.f66776toq.add(str);
        this.f22923k.remove(str);
        return this;
    }

    public Map<String, Object> toq() {
        HashMap map = new HashMap(this.f22923k);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> zy() {
        return Collections.unmodifiableList(new ArrayList(this.f66776toq));
    }
}
