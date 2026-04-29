package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.C0605y;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceCompatUtil.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class jp0y {

    /* JADX INFO: renamed from: k */
    private static final String f3571k = "TypefaceCompatUtil";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50463toq = ".font";

    /* JADX INFO: renamed from: androidx.core.graphics.jp0y$k */
    /* JADX INFO: compiled from: TypefaceCompatUtil.java */
    @hyr(19)
    static class C0535k {
        private C0535k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ParcelFileDescriptor m2494k(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    private jp0y() {
    }

    @hyr(19)
    @dd
    private static ByteBuffer f7l8(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @hyr(19)
    @dd
    /* JADX INFO: renamed from: g */
    public static ByteBuffer m2489g(@lvui Context context, @dd CancellationSignal cancellationSignal, @lvui Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorM2494k = C0535k.m2494k(context.getContentResolver(), uri, "r", cancellationSignal);
            if (parcelFileDescriptorM2494k == null) {
                if (parcelFileDescriptorM2494k != null) {
                    parcelFileDescriptorM2494k.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorM2494k.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorM2494k.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2490k(@dd Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static File m2491n(@lvui Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f50463toq + Process.myPid() + C5658n.f73185t8r + Process.myTid() + C5658n.f73185t8r;
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2492q(@lvui File file, @lvui InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    m2490k(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e(f3571k, "Error copying resource contents to temp file: " + e.getMessage());
            m2490k(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m2490k(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    @hyr(19)
    @dd
    public static ByteBuffer toq(@lvui Context context, @lvui Resources resources, int i2) {
        File fileM2491n = m2491n(context);
        if (fileM2491n == null) {
            return null;
        }
        try {
            if (zy(fileM2491n, resources, i2)) {
                return f7l8(fileM2491n);
            }
            return null;
        } finally {
            fileM2491n.delete();
        }
    }

    @hyr(19)
    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: y */
    public static Map<Uri, ByteBuffer> m2493y(@lvui Context context, @lvui C0605y.zy[] zyVarArr, @dd CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (C0605y.zy zyVar : zyVarArr) {
            if (zyVar.toq() == 0) {
                Uri uriM2823q = zyVar.m2823q();
                if (!map.containsKey(uriM2823q)) {
                    map.put(uriM2823q, m2489g(context, cancellationSignal, uriM2823q));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static boolean zy(@lvui File file, @lvui Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zM2492q = m2492q(file, inputStreamOpenRawResource);
                m2490k(inputStreamOpenRawResource);
                return zM2492q;
            } catch (Throwable th) {
                th = th;
                m2490k(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }
}
