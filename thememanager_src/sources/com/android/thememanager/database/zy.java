package com.android.thememanager.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.AbstractC1136p;
import androidx.room.AbstractC1140s;
import androidx.room.AbstractC1141t;
import androidx.room.a9;
import androidx.room.oc;
import androidx.sqlite.db.InterfaceC1176y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements com.android.thememanager.database.toq {

    /* JADX INFO: renamed from: g */
    private final oc f11129g;

    /* JADX INFO: renamed from: k */
    private final AbstractC1141t f11130k;

    /* JADX INFO: renamed from: n */
    private final oc f11131n;

    /* JADX INFO: renamed from: q */
    private final AbstractC1140s<C1960k> f11132q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AbstractC1136p<C1960k> f58005toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final AbstractC1140s<C1960k> f58006zy;

    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class f7l8 implements Callable<C1960k> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ a9 f11133k;

        f7l8(final a9 val$_statement) {
            this.f11133k = val$_statement;
        }

        protected void finalize() {
            this.f11133k.ki();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C1960k call() throws Exception {
            C1960k c1960k;
            Cursor qVar = androidx.room.util.zy.toq(zy.this.f11130k, this.f11133k, false);
            try {
                int iZy = androidx.room.util.toq.zy(qVar, "id");
                int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
                int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
                int iZy4 = androidx.room.util.toq.zy(qVar, "support");
                int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
                int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
                int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
                int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
                if (qVar.moveToFirst()) {
                    c1960k = new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8));
                } else {
                    c1960k = null;
                }
                return c1960k;
            } finally {
                qVar.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.database.zy$g */
    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class CallableC1962g implements Callable<List<C1960k>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ a9 f11135k;

        CallableC1962g(final a9 val$_statement) {
            this.f11135k = val$_statement;
        }

        protected void finalize() {
            this.f11135k.ki();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public List<C1960k> call() throws Exception {
            Cursor qVar = androidx.room.util.zy.toq(zy.this.f11130k, this.f11135k, false);
            try {
                int iZy = androidx.room.util.toq.zy(qVar, "id");
                int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
                int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
                int iZy4 = androidx.room.util.toq.zy(qVar, "support");
                int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
                int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
                int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
                int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
                ArrayList arrayList = new ArrayList(qVar.getCount());
                while (qVar.moveToNext()) {
                    arrayList.add(new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8)));
                }
                return arrayList;
            } finally {
                qVar.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.database.zy$k */
    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class C1963k extends AbstractC1136p<C1960k> {
        C1963k(AbstractC1141t database) {
            super(database);
        }

        @Override // androidx.room.AbstractC1136p
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public void f7l8(InterfaceC1176y interfaceC1176y, C1960k c1960k) {
            interfaceC1176y.v0af(1, c1960k.f11125k);
            String str = c1960k.f58003toq;
            if (str == null) {
                interfaceC1176y.b3e(2);
            } else {
                interfaceC1176y.tfm(2, str);
            }
            String str2 = c1960k.f58004zy;
            if (str2 == null) {
                interfaceC1176y.b3e(3);
            } else {
                interfaceC1176y.tfm(3, str2);
            }
            interfaceC1176y.v0af(4, c1960k.f11127q ? 1L : 0L);
            interfaceC1176y.v0af(5, c1960k.f11126n);
            interfaceC1176y.v0af(6, c1960k.f11124g);
            String strM7699k = C1961q.m7699k(c1960k.f58002f7l8);
            if (strM7699k == null) {
                interfaceC1176y.b3e(7);
            } else {
                interfaceC1176y.tfm(7, strM7699k);
            }
            String str3 = c1960k.f11128y;
            if (str3 == null) {
                interfaceC1176y.b3e(8);
            } else {
                interfaceC1176y.tfm(8, str3);
            }
        }

        @Override // androidx.room.oc
        /* JADX INFO: renamed from: q */
        public String mo5169q() {
            return "INSERT OR REPLACE INTO `largeicon_info` (`id`,`packageName`,`packageTitle`,`support`,`updateTime`,`onlineOrder`,`relativePackage`,`originalPackage`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.database.zy$n */
    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class C1964n extends oc {
        C1964n(AbstractC1141t database) {
            super(database);
        }

        @Override // androidx.room.oc
        /* JADX INFO: renamed from: q */
        public String mo5169q() {
            return "UPDATE largeicon_info SET support = :support , updateTime = :updatetime WHERE packageName = :packagename";
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.database.zy$q */
    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class C1965q extends oc {
        C1965q(AbstractC1141t database) {
            super(database);
        }

        @Override // androidx.room.oc
        /* JADX INFO: renamed from: q */
        public String mo5169q() {
            return "DELETE FROM largeicon_info";
        }
    }

    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class toq extends AbstractC1140s<C1960k> {
        toq(AbstractC1141t database) {
            super(database);
        }

        @Override // androidx.room.AbstractC1140s
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void f7l8(InterfaceC1176y stmt, C1960k value) {
            stmt.v0af(1, value.f11125k);
        }

        @Override // androidx.room.AbstractC1140s, androidx.room.oc
        /* JADX INFO: renamed from: q */
        public String mo5169q() {
            return "DELETE FROM `largeicon_info` WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.database.zy$y */
    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class CallableC1966y implements Callable<C1960k> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ a9 f11141k;

        CallableC1966y(final a9 val$_statement) {
            this.f11141k = val$_statement;
        }

        protected void finalize() {
            this.f11141k.ki();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C1960k call() throws Exception {
            C1960k c1960k;
            Cursor qVar = androidx.room.util.zy.toq(zy.this.f11130k, this.f11141k, false);
            try {
                int iZy = androidx.room.util.toq.zy(qVar, "id");
                int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
                int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
                int iZy4 = androidx.room.util.toq.zy(qVar, "support");
                int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
                int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
                int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
                int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
                if (qVar.moveToFirst()) {
                    c1960k = new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8));
                } else {
                    c1960k = null;
                }
                return c1960k;
            } finally {
                qVar.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.database.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LargeIconInfoDao_Impl.java */
    class C7915zy extends AbstractC1140s<C1960k> {
        C7915zy(AbstractC1141t database) {
            super(database);
        }

        @Override // androidx.room.AbstractC1140s
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void f7l8(InterfaceC1176y interfaceC1176y, C1960k c1960k) {
            interfaceC1176y.v0af(1, c1960k.f11125k);
            String str = c1960k.f58003toq;
            if (str == null) {
                interfaceC1176y.b3e(2);
            } else {
                interfaceC1176y.tfm(2, str);
            }
            String str2 = c1960k.f58004zy;
            if (str2 == null) {
                interfaceC1176y.b3e(3);
            } else {
                interfaceC1176y.tfm(3, str2);
            }
            interfaceC1176y.v0af(4, c1960k.f11127q ? 1L : 0L);
            interfaceC1176y.v0af(5, c1960k.f11126n);
            interfaceC1176y.v0af(6, c1960k.f11124g);
            String strM7699k = C1961q.m7699k(c1960k.f58002f7l8);
            if (strM7699k == null) {
                interfaceC1176y.b3e(7);
            } else {
                interfaceC1176y.tfm(7, strM7699k);
            }
            String str3 = c1960k.f11128y;
            if (str3 == null) {
                interfaceC1176y.b3e(8);
            } else {
                interfaceC1176y.tfm(8, str3);
            }
            interfaceC1176y.v0af(9, c1960k.f11125k);
        }

        @Override // androidx.room.AbstractC1140s, androidx.room.oc
        /* JADX INFO: renamed from: q */
        public String mo5169q() {
            return "UPDATE OR ABORT `largeicon_info` SET `id` = ?,`packageName` = ?,`packageTitle` = ?,`support` = ?,`updateTime` = ?,`onlineOrder` = ?,`relativePackage` = ?,`originalPackage` = ? WHERE `id` = ?";
        }
    }

    public zy(AbstractC1141t __db) {
        this.f11130k = __db;
        this.f58005toq = new C1963k(__db);
        this.f58006zy = new toq(__db);
        this.f11132q = new C7915zy(__db);
        this.f11131n = new C1965q(__db);
        this.f11129g = new C1964n(__db);
    }

    @Override // com.android.thememanager.database.toq
    public LiveData<C1960k> cdj(final String packageName) {
        a9 a9VarM5144y = a9.m5144y("SELECT * FROM largeicon_info WHERE packageName = :packageName", 1);
        if (packageName == null) {
            a9VarM5144y.b3e(1);
        } else {
            a9VarM5144y.tfm(1, packageName);
        }
        return this.f11130k.x2().m5205n(new String[]{"largeicon_info"}, false, new CallableC1966y(a9VarM5144y));
    }

    @Override // com.android.thememanager.database.toq
    public LiveData<List<C1960k>> f7l8() {
        return this.f11130k.x2().m5205n(new String[]{"largeicon_info"}, false, new CallableC1962g(a9.m5144y("SELECT * FROM largeicon_info", 0)));
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: g */
    public C1960k mo7700g(final int id) {
        C1960k c1960k;
        a9 a9VarM5144y = a9.m5144y("SELECT * FROM largeicon_info WHERE id = :id", 1);
        a9VarM5144y.v0af(1, id);
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            int iZy = androidx.room.util.toq.zy(qVar, "id");
            int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
            int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
            int iZy4 = androidx.room.util.toq.zy(qVar, "support");
            int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
            int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
            int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
            int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
            if (qVar.moveToFirst()) {
                c1960k = new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8));
            } else {
                c1960k = null;
            }
            return c1960k;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: h */
    public long mo7701h(final C1960k largeIconSupport) {
        this.f11130k.toq();
        this.f11130k.zy();
        try {
            long jLd6 = this.f58005toq.ld6(largeIconSupport);
            this.f11130k.o1t();
            return jLd6;
        } finally {
            this.f11130k.m5189s();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: k */
    public int mo7702k() {
        a9 a9VarM5144y = a9.m5144y("SELECT count(id) FROM largeicon_info", 0);
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            return qVar.moveToFirst() ? qVar.getInt(0) : 0;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    public List<C1960k> kja0(final int... id) {
        StringBuilder sbZy = androidx.room.util.f7l8.zy();
        sbZy.append("SELECT ");
        sbZy.append("*");
        sbZy.append(" FROM largeicon_info WHERE id = ");
        int length = id.length;
        androidx.room.util.f7l8.m5214k(sbZy, length);
        a9 a9VarM5144y = a9.m5144y(sbZy.toString(), length + 0);
        int i2 = 1;
        for (int i3 : id) {
            a9VarM5144y.v0af(i2, i3);
            i2++;
        }
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            int iZy = androidx.room.util.toq.zy(qVar, "id");
            int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
            int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
            int iZy4 = androidx.room.util.toq.zy(qVar, "support");
            int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
            int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
            int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
            int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
            ArrayList arrayList = new ArrayList(qVar.getCount());
            while (qVar.moveToNext()) {
                arrayList.add(new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8)));
            }
            return arrayList;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    public List<String> ld6() {
        a9 a9VarM5144y = a9.m5144y("SELECT packageName FROM largeicon_info order by onlineOrder", 0);
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            ArrayList arrayList = new ArrayList(qVar.getCount());
            while (qVar.moveToNext()) {
                arrayList.add(qVar.getString(0));
            }
            return arrayList;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: n */
    public List<C1960k> mo7703n(final String... packageName) {
        StringBuilder sbZy = androidx.room.util.f7l8.zy();
        sbZy.append("SELECT ");
        sbZy.append("*");
        sbZy.append(" FROM largeicon_info WHERE packageName = ");
        int length = packageName.length;
        androidx.room.util.f7l8.m5214k(sbZy, length);
        a9 a9VarM5144y = a9.m5144y(sbZy.toString(), length + 0);
        int i2 = 1;
        for (String str : packageName) {
            if (str == null) {
                a9VarM5144y.b3e(i2);
            } else {
                a9VarM5144y.tfm(i2, str);
            }
            i2++;
        }
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            int iZy = androidx.room.util.toq.zy(qVar, "id");
            int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
            int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
            int iZy4 = androidx.room.util.toq.zy(qVar, "support");
            int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
            int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
            int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
            int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
            ArrayList arrayList = new ArrayList(qVar.getCount());
            while (qVar.moveToNext()) {
                arrayList.add(new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8)));
            }
            return arrayList;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    public int n7h(final C1960k... largeIconSupport) {
        this.f11130k.toq();
        this.f11130k.zy();
        try {
            int iM5179p = this.f11132q.m5179p(largeIconSupport) + 0;
            this.f11130k.o1t();
            return iM5179p;
        } finally {
            this.f11130k.m5189s();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: p */
    public List<String> mo7704p() {
        a9 a9VarM5144y = a9.m5144y("SELECT packageTitle FROM largeicon_info order by onlineOrder", 0);
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            ArrayList arrayList = new ArrayList(qVar.getCount());
            while (qVar.moveToNext()) {
                arrayList.add(qVar.getString(0));
            }
            return arrayList;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: q */
    public int mo7705q(final C1960k largeIconSupport) {
        this.f11130k.toq();
        this.f11130k.zy();
        try {
            int iM5181y = this.f58006zy.m5181y(largeIconSupport) + 0;
            this.f11130k.o1t();
            return iM5181y;
        } finally {
            this.f11130k.m5189s();
        }
    }

    @Override // com.android.thememanager.database.toq
    public void qrj(final List<C1960k> largeIconSupports) {
        this.f11130k.toq();
        this.f11130k.zy();
        try {
            this.f58005toq.m5173y(largeIconSupports);
            this.f11130k.o1t();
        } finally {
            this.f11130k.m5189s();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: s */
    public int mo7706s(String str, boolean z2, long j2) {
        this.f11130k.toq();
        InterfaceC1176y interfaceC1176yM5168k = this.f11129g.m5168k();
        interfaceC1176yM5168k.v0af(1, z2 ? 1L : 0L);
        interfaceC1176yM5168k.v0af(2, j2);
        if (str == null) {
            interfaceC1176yM5168k.b3e(3);
        } else {
            interfaceC1176yM5168k.tfm(3, str);
        }
        this.f11130k.zy();
        try {
            int iMo5277z = interfaceC1176yM5168k.mo5277z();
            this.f11130k.o1t();
            return iMo5277z;
        } finally {
            this.f11130k.m5189s();
            this.f11129g.m5167g(interfaceC1176yM5168k);
        }
    }

    @Override // com.android.thememanager.database.toq
    public List<C1960k> toq() {
        a9 a9VarM5144y = a9.m5144y("SELECT * FROM largeicon_info", 0);
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            int iZy = androidx.room.util.toq.zy(qVar, "id");
            int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
            int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
            int iZy4 = androidx.room.util.toq.zy(qVar, "support");
            int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
            int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
            int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
            int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
            ArrayList arrayList = new ArrayList(qVar.getCount());
            while (qVar.moveToNext()) {
                arrayList.add(new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8)));
            }
            return arrayList;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    public C1960k x2(final String packageName) {
        C1960k c1960k;
        a9 a9VarM5144y = a9.m5144y("SELECT * FROM largeicon_info WHERE packageName = :packageName", 1);
        if (packageName == null) {
            a9VarM5144y.b3e(1);
        } else {
            a9VarM5144y.tfm(1, packageName);
        }
        this.f11130k.toq();
        Cursor qVar = androidx.room.util.zy.toq(this.f11130k, a9VarM5144y, false);
        try {
            int iZy = androidx.room.util.toq.zy(qVar, "id");
            int iZy2 = androidx.room.util.toq.zy(qVar, "packageName");
            int iZy3 = androidx.room.util.toq.zy(qVar, "packageTitle");
            int iZy4 = androidx.room.util.toq.zy(qVar, "support");
            int iZy5 = androidx.room.util.toq.zy(qVar, InterfaceC1925p.tgkg);
            int iZy6 = androidx.room.util.toq.zy(qVar, "onlineOrder");
            int iZy7 = androidx.room.util.toq.zy(qVar, "relativePackage");
            int iZy8 = androidx.room.util.toq.zy(qVar, "originalPackage");
            if (qVar.moveToFirst()) {
                c1960k = new C1960k(qVar.getInt(iZy), qVar.getString(iZy2), qVar.getString(iZy3), qVar.getInt(iZy4) != 0, qVar.getLong(iZy5), qVar.getInt(iZy6), C1961q.toq(qVar.getString(iZy7)), qVar.getString(iZy8));
            } else {
                c1960k = null;
            }
            return c1960k;
        } finally {
            qVar.close();
            a9VarM5144y.ki();
        }
    }

    @Override // com.android.thememanager.database.toq
    /* JADX INFO: renamed from: y */
    public int mo7707y() {
        this.f11130k.toq();
        InterfaceC1176y interfaceC1176yM5168k = this.f11131n.m5168k();
        this.f11130k.zy();
        try {
            int iMo5277z = interfaceC1176yM5168k.mo5277z();
            this.f11130k.o1t();
            return iMo5277z;
        } finally {
            this.f11130k.m5189s();
            this.f11131n.m5167g(interfaceC1176yM5168k);
        }
    }

    @Override // com.android.thememanager.database.toq
    public LiveData<C1960k> zy(final String packageName) {
        a9 a9VarM5144y = a9.m5144y("SELECT * FROM largeicon_info WHERE packageName = :packageName", 1);
        if (packageName == null) {
            a9VarM5144y.b3e(1);
        } else {
            a9VarM5144y.tfm(1, packageName);
        }
        return this.f11130k.x2().m5205n(new String[]{"largeicon_info"}, false, new f7l8(a9VarM5144y));
    }
}
