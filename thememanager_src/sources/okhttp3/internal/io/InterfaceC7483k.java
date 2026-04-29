package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import okio.lvui;
import okio.nn86;
import okio.vyq;

/* JADX INFO: renamed from: okhttp3.internal.io.k */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7483k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final k f43339k = k.f43340k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final InterfaceC7483k f93988toq = new k.C8125k();

    /* JADX INFO: renamed from: okhttp3.internal.io.k$k */
    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ k f43340k = new k();

        /* JADX INFO: renamed from: okhttp3.internal.io.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileSystem.kt */
        private static final class C8125k implements InterfaceC7483k {
            @Override // okhttp3.internal.io.InterfaceC7483k
            public void f7l8(@InterfaceC7396q File from, @InterfaceC7396q File to) throws IOException {
                d2ok.m23075h(from, "from");
                d2ok.m23075h(to, "to");
                mo27211y(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            @InterfaceC7396q
            /* JADX INFO: renamed from: g */
            public vyq mo27207g(@InterfaceC7396q File file) throws FileNotFoundException {
                d2ok.m23075h(file, "file");
                try {
                    return lvui.cdj(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return lvui.cdj(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            /* JADX INFO: renamed from: k */
            public void mo27208k(@InterfaceC7396q File directory) throws IOException {
                d2ok.m23075h(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        d2ok.kja0(file, "file");
                        mo27208k(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            @InterfaceC7396q
            /* JADX INFO: renamed from: n */
            public nn86 mo27209n(@InterfaceC7396q File file) throws FileNotFoundException {
                d2ok.m23075h(file, "file");
                return okio.d2ok.m27590i(file);
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            /* JADX INFO: renamed from: q */
            public long mo27210q(@InterfaceC7396q File file) {
                d2ok.m23075h(file, "file");
                return file.length();
            }

            @InterfaceC7396q
            public String toString() {
                return "FileSystem.SYSTEM";
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            public boolean toq(@InterfaceC7396q File file) {
                d2ok.m23075h(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            /* JADX INFO: renamed from: y */
            public void mo27211y(@InterfaceC7396q File file) throws IOException {
                d2ok.m23075h(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.InterfaceC7483k
            @InterfaceC7396q
            public vyq zy(@InterfaceC7396q File file) throws FileNotFoundException {
                d2ok.m23075h(file, "file");
                try {
                    return okio.d2ok.m27591k(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return okio.d2ok.m27591k(file);
                }
            }
        }

        private k() {
        }
    }

    void f7l8(@InterfaceC7396q File file, @InterfaceC7396q File file2) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    vyq mo27207g(@InterfaceC7396q File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: k */
    void mo27208k(@InterfaceC7396q File file) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    nn86 mo27209n(@InterfaceC7396q File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: q */
    long mo27210q(@InterfaceC7396q File file);

    boolean toq(@InterfaceC7396q File file);

    /* JADX INFO: renamed from: y */
    void mo27211y(@InterfaceC7396q File file) throws IOException;

    @InterfaceC7396q
    vyq zy(@InterfaceC7396q File file) throws FileNotFoundException;
}
