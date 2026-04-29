package com.android.thememanager.database;

import androidx.room.InterfaceC1131k;
import androidx.room.InterfaceC1151y;
import androidx.room.dd;
import androidx.room.kja0;
import androidx.room.zurt;
import com.android.thememanager.controller.online.InterfaceC1925p;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.database.k */
/* JADX INFO: compiled from: LargeIconInfo.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1151y(tableName = "largeicon_info")
public class C1960k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd({C1961q.class})
    @InterfaceC1131k(name = "relativePackage", typeAffinity = 2)
    public String[] f58002f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC1131k(name = "onlineOrder", typeAffinity = 3)
    public int f11124g;

    /* JADX INFO: renamed from: k */
    @zurt(autoGenerate = true)
    @InterfaceC1131k(name = "id", typeAffinity = 3)
    public int f11125k;

    /* JADX INFO: renamed from: n */
    @InterfaceC1131k(name = InterfaceC1925p.tgkg, typeAffinity = 3)
    public long f11126n;

    /* JADX INFO: renamed from: q */
    @InterfaceC1131k(name = "support", typeAffinity = 3)
    public boolean f11127q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC1131k(name = "packageName", typeAffinity = 2)
    @lvui
    public String f58003toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC1131k(name = "originalPackage", typeAffinity = 2)
    public String f11128y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC1131k(name = "packageTitle", typeAffinity = 2)
    public String f58004zy;

    public C1960k(int id, @InterfaceC7396q String packageName, String packageTitle, boolean support, long updateTime, int order, String[] relativePackage, String originalPackage) {
        this.f11125k = id;
        this.f58003toq = packageName;
        this.f58004zy = packageTitle;
        this.f11127q = support;
        this.f11126n = updateTime;
        this.f11124g = order;
        this.f58002f7l8 = relativePackage;
        this.f11128y = originalPackage;
    }

    @kja0
    public C1960k(@InterfaceC7396q String packageName, String packageTitle, boolean support, long updateTime, int order, String[] relativePackage, String originalPackage) {
        this.f58003toq = packageName;
        this.f58004zy = packageTitle;
        this.f11127q = support;
        this.f11126n = updateTime;
        this.f11124g = order;
        this.f58002f7l8 = relativePackage;
        this.f11128y = originalPackage;
    }
}
