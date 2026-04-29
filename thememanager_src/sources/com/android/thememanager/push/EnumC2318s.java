package com.android.thememanager.push;

/* JADX INFO: renamed from: com.android.thememanager.push.s */
/* JADX INFO: compiled from: ThemePushType.java */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC2318s {
    PUSH_AD,
    PUSH_GIFT,
    PUSH_PC,
    PUSH_APP,
    PUSH_DEFAULT;

    static EnumC2318s getType(String type) {
        return InterfaceC2316n.f60612zy.equals(type) ? PUSH_AD : InterfaceC2316n.f13502q.equals(type) ? PUSH_GIFT : InterfaceC2316n.f13501n.equals(type) ? PUSH_PC : InterfaceC2316n.f13499g.equals(type) ? PUSH_APP : PUSH_DEFAULT;
    }
}
