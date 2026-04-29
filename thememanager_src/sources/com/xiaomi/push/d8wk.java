package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class d8wk extends mu {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    final /* synthetic */ tfm f73306cdj;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ mu f32799h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    mu f73307kja0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d8wk(tfm tfmVar, String str, mu muVar) {
        super(str);
        this.f73306cdj = tfmVar;
        this.f32799h = muVar;
        this.f73307kja0 = muVar;
        this.f33428q = this.f33428q;
        if (muVar != null) {
            this.f33430y = muVar.f33430y;
        }
    }

    @Override // com.xiaomi.push.mu
    public boolean fn3e() {
        return false;
    }

    @Override // com.xiaomi.push.mu
    /* JADX INFO: renamed from: n */
    public synchronized ArrayList<String> mo20721n(boolean z2) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        mu muVar = this.f73307kja0;
        if (muVar != null) {
            arrayList.addAll(muVar.mo20721n(true));
        }
        Map<String, mu> map = tfm.f33967s;
        synchronized (map) {
            mu muVar2 = map.get(this.f33428q);
            if (muVar2 != null) {
                for (String str : muVar2.mo20721n(true)) {
                    if (arrayList.indexOf(str) == -1) {
                        arrayList.add(str);
                    }
                }
                arrayList.remove(this.f33428q);
                arrayList.add(this.f33428q);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.mu
    public synchronized void n7h(String str, C5857d c5857d) {
        mu muVar = this.f73307kja0;
        if (muVar != null) {
            muVar.n7h(str, c5857d);
        }
    }
}
