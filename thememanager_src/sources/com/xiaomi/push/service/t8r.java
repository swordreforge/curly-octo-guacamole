package com.xiaomi.push.service;

import com.xiaomi.push.bih;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class t8r implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ List f33910k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ boolean f33911q;

    t8r(List list, boolean z2) {
        this.f33910k = list;
        this.f33911q = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM21657g = ki.m21657g("www.baidu.com:80");
        Iterator it = this.f33910k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zM21657g = zM21657g || ki.m21657g((String) it.next());
            if (zM21657g && !this.f33911q) {
                break;
            }
        }
        bih.toq(zM21657g ? 1 : 2);
    }
}
