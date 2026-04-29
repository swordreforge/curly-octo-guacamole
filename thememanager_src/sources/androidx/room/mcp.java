package androidx.room;

import zy.uv6;

/* JADX INFO: compiled from: RoomMasterTable.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class mcp {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f52375f7l8 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    /* JADX INFO: renamed from: g */
    public static final String f6200g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* JADX INFO: renamed from: k */
    public static final String f6201k = "room_master_table";

    /* JADX INFO: renamed from: n */
    public static final String f6202n = "42";

    /* JADX INFO: renamed from: q */
    private static final String f6203q = "identity_hash";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f52376toq = "room_master_table";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f52377zy = "id";

    private mcp() {
    }

    /* JADX INFO: renamed from: k */
    public static String m5165k(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
