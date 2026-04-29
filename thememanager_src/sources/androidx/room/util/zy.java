package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import androidx.room.AbstractC1141t;
import androidx.sqlite.db.InterfaceC1172g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: DBUtil.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class zy {
    private zy() {
    }

    /* JADX INFO: renamed from: k */
    public static void m5228k(androidx.sqlite.db.zy zyVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorKcsr = zyVar.kcsr("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorKcsr.moveToNext()) {
            try {
                arrayList.add(cursorKcsr.getString(0));
            } catch (Throwable th) {
                cursorKcsr.close();
                throw th;
            }
        }
        cursorKcsr.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                zyVar.mo5273i("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @lvui
    public static Cursor toq(AbstractC1141t abstractC1141t, InterfaceC1172g interfaceC1172g, boolean z2) {
        Cursor cursorZurt = abstractC1141t.zurt(interfaceC1172g);
        if (!z2 || !(cursorZurt instanceof AbstractWindowedCursor)) {
            return cursorZurt;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorZurt;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? toq.m5222k(abstractWindowedCursor) : cursorZurt;
    }

    public static int zy(@lvui File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i2 = byteBufferAllocate.getInt();
            channel.close();
            return i2;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
