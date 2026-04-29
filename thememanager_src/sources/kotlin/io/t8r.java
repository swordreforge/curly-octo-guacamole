package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes3.dex */
final class t8r implements kotlin.sequences.qrj<String> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final BufferedReader f36366k;

    /* JADX INFO: renamed from: kotlin.io.t8r$k */
    /* JADX INFO: compiled from: ReadWrite.kt */
    public static final class C6277k implements Iterator<String>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7395n
        private String f36367k;

        /* JADX INFO: renamed from: q */
        private boolean f36369q;

        C6277k() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f36367k == null && !this.f36369q) {
                String line = t8r.this.f36366k.readLine();
                this.f36367k = line;
                if (line == null) {
                    this.f36369q = true;
                }
            }
            return this.f36367k != null;
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f36367k;
            this.f36367k = null;
            d2ok.qrj(str);
            return str;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t8r(@InterfaceC7396q BufferedReader reader) {
        d2ok.m23075h(reader, "reader");
        this.f36366k = reader;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<String> iterator() {
        return new C6277k();
    }
}
