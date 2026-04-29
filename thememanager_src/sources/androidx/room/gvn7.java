package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.util.C1146k;
import androidx.room.util.C1148q;
import androidx.sqlite.db.InterfaceC1175q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import zy.hyr;

/* JADX INFO: compiled from: SQLiteCopyOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
class gvn7 implements InterfaceC1175q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f52353f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private C1138q f6170g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final Context f6171k;

    /* JADX INFO: renamed from: n */
    @zy.lvui
    private final InterfaceC1175q f6172n;

    /* JADX INFO: renamed from: q */
    private final int f6173q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final String f52354toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private final File f52355zy;

    gvn7(@zy.lvui Context context, @zy.dd String str, @zy.dd File file, int i2, @zy.lvui InterfaceC1175q interfaceC1175q) {
        this.f6171k = context;
        this.f52354toq = str;
        this.f52355zy = file;
        this.f6173q = i2;
        this.f6172n = interfaceC1175q;
    }

    /* JADX INFO: renamed from: n */
    private void m5149n() {
        String qVar = toq();
        File databasePath = this.f6171k.getDatabasePath(qVar);
        C1138q c1138q = this.f6170g;
        C1146k c1146k = new C1146k(qVar, this.f6171k.getFilesDir(), c1138q == null || c1138q.f6216p);
        try {
            c1146k.toq();
            if (!databasePath.exists()) {
                try {
                    zy(databasePath);
                    c1146k.zy();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.f6170g == null) {
                c1146k.zy();
                return;
            }
            try {
                int iZy = androidx.room.util.zy.zy(databasePath);
                int i2 = this.f6173q;
                if (iZy == i2) {
                    c1146k.zy();
                    return;
                }
                if (this.f6170g.m5178k(iZy, i2)) {
                    c1146k.zy();
                    return;
                }
                if (this.f6171k.deleteDatabase(qVar)) {
                    try {
                        zy(databasePath);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + qVar + ") for a copy destructive migration.");
                }
                c1146k.zy();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                c1146k.zy();
                return;
            }
        } catch (Throwable th) {
            c1146k.zy();
            throw th;
        }
        c1146k.zy();
        throw th;
    }

    private void zy(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f52354toq != null) {
            channel = Channels.newChannel(this.f6171k.getAssets().open(this.f52354toq));
        } else {
            if (this.f52355zy == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f52355zy).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f6171k.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        C1148q.m5220k(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public synchronized void close() {
        this.f6172n.close();
        this.f52353f7l8 = false;
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public synchronized androidx.sqlite.db.zy getReadableDatabase() {
        if (!this.f52353f7l8) {
            m5149n();
            this.f52353f7l8 = true;
        }
        return this.f6172n.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public synchronized androidx.sqlite.db.zy getWritableDatabase() {
        if (!this.f52353f7l8) {
            m5149n();
            this.f52353f7l8 = true;
        }
        return this.f6172n.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    @hyr(api = 16)
    /* JADX INFO: renamed from: k */
    public void mo5150k(boolean z2) {
        this.f6172n.mo5150k(z2);
    }

    /* JADX INFO: renamed from: q */
    void m5151q(@zy.dd C1138q c1138q) {
        this.f6170g = c1138q;
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public String toq() {
        return this.f6172n.toq();
    }
}
