package androidx.room;

import android.database.Cursor;
import androidx.sqlite.db.InterfaceC1175q;
import java.util.Iterator;
import java.util.List;
import n5r1.AbstractC7399k;
import zy.uv6;

/* JADX INFO: compiled from: RoomOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class jk extends InterfaceC1175q.k {

    /* JADX INFO: renamed from: g */
    @zy.lvui
    private final String f6174g;

    /* JADX INFO: renamed from: n */
    @zy.lvui
    private final String f6175n;

    /* JADX INFO: renamed from: q */
    @zy.lvui
    private final AbstractC1130k f6176q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private C1138q f52356zy;

    /* JADX INFO: renamed from: androidx.room.jk$k */
    /* JADX INFO: compiled from: RoomOpenHelper.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static abstract class AbstractC1130k {

        /* JADX INFO: renamed from: k */
        public final int f6177k;

        public AbstractC1130k(int i2) {
            this.f6177k = i2;
        }

        @zy.lvui
        protected toq f7l8(@zy.lvui androidx.sqlite.db.zy zyVar) {
            m5162y(zyVar);
            return new toq(true, null);
        }

        /* JADX INFO: renamed from: g */
        protected void mo5158g(androidx.sqlite.db.zy zyVar) {
        }

        /* JADX INFO: renamed from: k */
        protected abstract void mo5159k(androidx.sqlite.db.zy zyVar);

        /* JADX INFO: renamed from: n */
        protected void mo5160n(androidx.sqlite.db.zy zyVar) {
        }

        /* JADX INFO: renamed from: q */
        protected abstract void mo5161q(androidx.sqlite.db.zy zyVar);

        protected abstract void toq(androidx.sqlite.db.zy zyVar);

        @Deprecated
        /* JADX INFO: renamed from: y */
        protected void m5162y(androidx.sqlite.db.zy zyVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        protected abstract void zy(androidx.sqlite.db.zy zyVar);
    }

    /* JADX INFO: compiled from: RoomOpenHelper.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class toq {

        /* JADX INFO: renamed from: k */
        public final boolean f6178k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public final String f52357toq;

        public toq(boolean z2, @zy.dd String str) {
            this.f6178k = z2;
            this.f52357toq = str;
        }
    }

    public jk(@zy.lvui C1138q c1138q, @zy.lvui AbstractC1130k abstractC1130k, @zy.lvui String str, @zy.lvui String str2) {
        super(abstractC1130k.f6177k);
        this.f52356zy = c1138q;
        this.f6176q = abstractC1130k;
        this.f6175n = str;
        this.f6174g = str2;
    }

    private static boolean ld6(androidx.sqlite.db.zy zyVar) {
        Cursor cursorKcsr = zyVar.kcsr("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z2 = false;
            if (cursorKcsr.moveToFirst()) {
                if (cursorKcsr.getInt(0) != 0) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            cursorKcsr.close();
        }
    }

    /* JADX INFO: renamed from: p */
    private static boolean m5152p(androidx.sqlite.db.zy zyVar) {
        Cursor cursorKcsr = zyVar.kcsr("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (cursorKcsr.moveToFirst()) {
                if (cursorKcsr.getInt(0) == 0) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            cursorKcsr.close();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m5153s(androidx.sqlite.db.zy zyVar) {
        zyVar.mo5273i(mcp.f6200g);
    }

    private void x2(androidx.sqlite.db.zy zyVar) {
        m5153s(zyVar);
        zyVar.mo5273i(mcp.m5165k(this.f6175n));
    }

    /* JADX INFO: renamed from: y */
    private void m5154y(androidx.sqlite.db.zy zyVar) {
        if (!ld6(zyVar)) {
            toq toqVarF7l8 = this.f6176q.f7l8(zyVar);
            if (toqVarF7l8.f6178k) {
                this.f6176q.mo5160n(zyVar);
                x2(zyVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + toqVarF7l8.f52357toq);
            }
        }
        Cursor cursorMo5270a = zyVar.mo5270a(new androidx.sqlite.db.toq(mcp.f52375f7l8));
        try {
            String string = cursorMo5270a.moveToFirst() ? cursorMo5270a.getString(0) : null;
            cursorMo5270a.close();
            if (!this.f6175n.equals(string) && !this.f6174g.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorMo5270a.close();
            throw th;
        }
    }

    @Override // androidx.sqlite.db.InterfaceC1175q.k
    public void f7l8(androidx.sqlite.db.zy zyVar, int i2, int i3) {
        boolean z2;
        List<AbstractC7399k> listZy;
        C1138q c1138q = this.f52356zy;
        if (c1138q == null || (listZy = c1138q.f6217q.zy(i2, i3)) == null) {
            z2 = false;
        } else {
            this.f6176q.mo5158g(zyVar);
            Iterator<AbstractC7399k> it = listZy.iterator();
            while (it.hasNext()) {
                it.next().m26799k(zyVar);
            }
            toq toqVarF7l8 = this.f6176q.f7l8(zyVar);
            if (!toqVarF7l8.f6178k) {
                throw new IllegalStateException("Migration didn't properly handle: " + toqVarF7l8.f52357toq);
            }
            this.f6176q.mo5160n(zyVar);
            x2(zyVar);
            z2 = true;
        }
        if (z2) {
            return;
        }
        C1138q c1138q2 = this.f52356zy;
        if (c1138q2 != null && !c1138q2.m5178k(i2, i3)) {
            this.f6176q.toq(zyVar);
            this.f6176q.mo5159k(zyVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // androidx.sqlite.db.InterfaceC1175q.k
    /* JADX INFO: renamed from: g */
    public void mo5155g(androidx.sqlite.db.zy zyVar) {
        super.mo5155g(zyVar);
        m5154y(zyVar);
        this.f6176q.mo5161q(zyVar);
        this.f52356zy = null;
    }

    @Override // androidx.sqlite.db.InterfaceC1175q.k
    /* JADX INFO: renamed from: n */
    public void mo5156n(androidx.sqlite.db.zy zyVar, int i2, int i3) {
        f7l8(zyVar, i2, i3);
    }

    @Override // androidx.sqlite.db.InterfaceC1175q.k
    /* JADX INFO: renamed from: q */
    public void mo5157q(androidx.sqlite.db.zy zyVar) {
        boolean zM5152p = m5152p(zyVar);
        this.f6176q.mo5159k(zyVar);
        if (!zM5152p) {
            toq toqVarF7l8 = this.f6176q.f7l8(zyVar);
            if (!toqVarF7l8.f6178k) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + toqVarF7l8.f52357toq);
            }
        }
        x2(zyVar);
        this.f6176q.zy(zyVar);
    }

    @Override // androidx.sqlite.db.InterfaceC1175q.k
    public void toq(androidx.sqlite.db.zy zyVar) {
        super.toq(zyVar);
    }

    public jk(@zy.lvui C1138q c1138q, @zy.lvui AbstractC1130k abstractC1130k, @zy.lvui String str) {
        this(c1138q, abstractC1130k, "", str);
    }
}
