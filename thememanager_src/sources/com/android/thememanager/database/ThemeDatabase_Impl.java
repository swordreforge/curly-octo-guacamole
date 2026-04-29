package com.android.thememanager.database;

import androidx.room.AbstractC1141t;
import androidx.room.C1138q;
import androidx.room.jk;
import androidx.room.mcp;
import androidx.room.t8r;
import androidx.room.util.C1150y;
import androidx.sqlite.db.InterfaceC1175q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ThemeDatabase_Impl extends ThemeDatabase {

    /* JADX INFO: renamed from: h */
    private volatile toq f11123h;

    /* JADX INFO: renamed from: com.android.thememanager.database.ThemeDatabase_Impl$k */
    class C1959k extends jk.AbstractC1130k {
        C1959k(int version) {
            super(version);
        }

        @Override // androidx.room.jk.AbstractC1130k
        protected jk.toq f7l8(androidx.sqlite.db.zy _db) {
            HashMap map = new HashMap(8);
            map.put("id", new C1150y.k("id", "INTEGER", true, 1, null, 1));
            map.put("packageName", new C1150y.k("packageName", "TEXT", true, 0, null, 1));
            map.put("packageTitle", new C1150y.k("packageTitle", "TEXT", false, 0, null, 1));
            map.put("support", new C1150y.k("support", "INTEGER", true, 0, null, 1));
            map.put(InterfaceC1925p.tgkg, new C1150y.k(InterfaceC1925p.tgkg, "INTEGER", true, 0, null, 1));
            map.put("onlineOrder", new C1150y.k("onlineOrder", "INTEGER", true, 0, null, 1));
            map.put("relativePackage", new C1150y.k("relativePackage", "TEXT", false, 0, null, 1));
            map.put("originalPackage", new C1150y.k("originalPackage", "TEXT", false, 0, null, 1));
            C1150y c1150y = new C1150y("largeicon_info", map, new HashSet(0), new HashSet(0));
            C1150y c1150yM5224k = C1150y.m5224k(_db, "largeicon_info");
            if (c1150y.equals(c1150yM5224k)) {
                return new jk.toq(true, null);
            }
            return new jk.toq(false, "largeicon_info(com.android.thememanager.database.LargeIconInfo).\n Expected:\n" + c1150y + "\n Found:\n" + c1150yM5224k);
        }

        @Override // androidx.room.jk.AbstractC1130k
        /* JADX INFO: renamed from: g */
        public void mo5158g(androidx.sqlite.db.zy _db) {
            androidx.room.util.zy.m5228k(_db);
        }

        @Override // androidx.room.jk.AbstractC1130k
        /* JADX INFO: renamed from: k */
        public void mo5159k(androidx.sqlite.db.zy _db) {
            _db.mo5273i("CREATE TABLE IF NOT EXISTS `largeicon_info` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packageName` TEXT NOT NULL, `packageTitle` TEXT, `support` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `onlineOrder` INTEGER NOT NULL, `relativePackage` TEXT, `originalPackage` TEXT)");
            _db.mo5273i(mcp.f6200g);
            _db.mo5273i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9a4ff182ddbf4de1a6c887e9f98225ef')");
        }

        @Override // androidx.room.jk.AbstractC1130k
        /* JADX INFO: renamed from: n */
        public void mo5160n(androidx.sqlite.db.zy _db) {
        }

        @Override // androidx.room.jk.AbstractC1130k
        /* JADX INFO: renamed from: q */
        public void mo5161q(androidx.sqlite.db.zy _db) {
            ((AbstractC1141t) ThemeDatabase_Impl.this).f6221k = _db;
            ThemeDatabase_Impl.this.t8r(_db);
            if (((AbstractC1141t) ThemeDatabase_Impl.this).f6226y != null) {
                int size = ((AbstractC1141t) ThemeDatabase_Impl.this).f6226y.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC1141t.toq) ((AbstractC1141t) ThemeDatabase_Impl.this).f6226y.get(i2)).toq(_db);
                }
            }
        }

        @Override // androidx.room.jk.AbstractC1130k
        public void toq(androidx.sqlite.db.zy _db) {
            _db.mo5273i("DROP TABLE IF EXISTS `largeicon_info`");
        }

        @Override // androidx.room.jk.AbstractC1130k
        protected void zy(androidx.sqlite.db.zy _db) {
            if (((AbstractC1141t) ThemeDatabase_Impl.this).f6226y != null) {
                int size = ((AbstractC1141t) ThemeDatabase_Impl.this).f6226y.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC1141t.toq) ((AbstractC1141t) ThemeDatabase_Impl.this).f6226y.get(i2)).m5201k(_db);
                }
            }
        }
    }

    @Override // androidx.room.AbstractC1141t
    protected t8r f7l8() {
        return new t8r(this, new HashMap(0), new HashMap(0), "largeicon_info");
    }

    @Override // androidx.room.AbstractC1141t
    /* JADX INFO: renamed from: q */
    public void mo5188q() {
        super.m5185k();
        androidx.sqlite.db.zy writableDatabase = super.qrj().getWritableDatabase();
        try {
            super.zy();
            writableDatabase.mo5273i("DELETE FROM `largeicon_info`");
            super.o1t();
        } finally {
            super.m5189s();
            writableDatabase.kcsr("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.mbx()) {
                writableDatabase.mo5273i("VACUUM");
            }
        }
    }

    @Override // com.android.thememanager.database.ThemeDatabase
    /* JADX INFO: renamed from: t */
    public toq mo7698t() {
        toq toqVar;
        if (this.f11123h != null) {
            return this.f11123h;
        }
        synchronized (this) {
            if (this.f11123h == null) {
                this.f11123h = new zy(this);
            }
            toqVar = this.f11123h;
        }
        return toqVar;
    }

    @Override // androidx.room.AbstractC1141t
    /* JADX INFO: renamed from: y */
    protected InterfaceC1175q mo5190y(C1138q configuration) {
        return configuration.f6214k.mo5148k(InterfaceC1175q.toq.m5282k(configuration.f52390toq).zy(configuration.f52392zy).toq(new jk(configuration, new C1959k(1), "9a4ff182ddbf4de1a6c887e9f98225ef", "6cdf7c0ad4394390b42176d5e529d651")).m5283k());
    }
}
