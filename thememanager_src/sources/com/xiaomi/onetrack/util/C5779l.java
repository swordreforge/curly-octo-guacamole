package com.xiaomi.onetrack.util;

import android.text.TextUtils;
import android.util.LruCache;
import com.xiaomi.onetrack.util.C5778k;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.l */
/* JADX INFO: loaded from: classes3.dex */
final class C5779l extends LruCache<String, C5778k.a> {
    C5779l(int i2) {
        super(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int sizeOf(String str, C5778k.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f32316a)) {
            return 0;
        }
        return aVar.f32316a.length();
    }
}
