package androidx.room;

import android.content.Context;
import androidx.room.AbstractC1141t;

/* JADX INFO: compiled from: Room.java */
/* JADX INFO: loaded from: classes.dex */
public class wvg {

    /* JADX INFO: renamed from: k */
    static final String f6278k = "ROOM";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f52441toq = "room_master_table";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f52442zy = "_CursorConverter";

    @Deprecated
    public wvg() {
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static <T extends AbstractC1141t> AbstractC1141t.k<T> m5229k(@zy.lvui Context context, @zy.lvui Class<T> cls, @zy.lvui String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new AbstractC1141t.k<>(context, cls, str);
    }

    @zy.lvui
    static <T, C> T toq(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    @zy.lvui
    public static <T extends AbstractC1141t> AbstractC1141t.k<T> zy(@zy.lvui Context context, @zy.lvui Class<T> cls) {
        return new AbstractC1141t.k<>(context, cls, null);
    }
}
