package com.android.thememanager.database;

import androidx.lifecycle.LiveData;
import androidx.room.InterfaceC1127g;
import androidx.room.cdj;
import androidx.room.ni7;
import androidx.room.x9kr;
import java.util.List;
import zy.oc;
import zy.y9n;

/* JADX INFO: compiled from: LargeIconInfoDao.java */
/* JADX INFO: loaded from: classes2.dex */
@androidx.room.toq
public interface toq {
    @ni7("SELECT * FROM largeicon_info WHERE packageName = :packageName")
    LiveData<C1960k> cdj(String packageName);

    @ni7("SELECT * FROM largeicon_info")
    @oc
    LiveData<List<C1960k>> f7l8();

    @ni7("SELECT * FROM largeicon_info WHERE id = :id")
    /* JADX INFO: renamed from: g */
    C1960k mo7700g(int id);

    @cdj(onConflict = 1)
    @y9n
    /* JADX INFO: renamed from: h */
    long mo7701h(C1960k largeIconSupport);

    @ni7("SELECT count(id) FROM largeicon_info")
    /* JADX INFO: renamed from: k */
    int mo7702k();

    @ni7("SELECT * FROM largeicon_info WHERE id = :id")
    List<C1960k> kja0(int... id);

    @ni7("SELECT packageName FROM largeicon_info order by onlineOrder")
    List<String> ld6();

    @ni7("SELECT * FROM largeicon_info WHERE packageName = :packageName")
    /* JADX INFO: renamed from: n */
    List<C1960k> mo7703n(String... packageName);

    @x9kr
    @y9n
    int n7h(C1960k... largeIconSupport);

    @ni7("SELECT packageTitle FROM largeicon_info order by onlineOrder")
    /* JADX INFO: renamed from: p */
    List<String> mo7704p();

    @InterfaceC1127g
    @y9n
    /* JADX INFO: renamed from: q */
    int mo7705q(C1960k largeIconSupport);

    @cdj(onConflict = 1)
    @y9n
    void qrj(List<C1960k> largeIconSupports);

    @ni7("UPDATE largeicon_info SET support = :support , updateTime = :updatetime WHERE packageName = :packagename")
    @y9n
    /* JADX INFO: renamed from: s */
    int mo7706s(String packagename, boolean support, long updatetime);

    @ni7("SELECT * FROM largeicon_info")
    @y9n
    List<C1960k> toq();

    @ni7("SELECT * FROM largeicon_info WHERE packageName = :packageName")
    C1960k x2(String packageName);

    @ni7("DELETE FROM largeicon_info")
    @y9n
    /* JADX INFO: renamed from: y */
    int mo7707y();

    @ni7("SELECT * FROM largeicon_info WHERE packageName = :packageName")
    @oc
    LiveData<C1960k> zy(String packageName);
}
