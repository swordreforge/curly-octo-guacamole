package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.google.gson.zurt;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.gson.internal.bind.p */
/* JADX INFO: compiled from: SqlDateTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4891p extends fu4<Date> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final InterfaceC4928z f68767toq = new k();

    /* JADX INFO: renamed from: k */
    private final DateFormat f27709k = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: renamed from: com.google.gson.internal.bind.p$k */
    /* JADX INFO: compiled from: SqlDateTypeAdapter.java */
    class k implements InterfaceC4928z {
        k() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.getRawType() == Date.class) {
                return new C4891p();
            }
            return null;
        }
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public synchronized void mo7089s(C4926q c4926q, Date date) throws IOException {
        c4926q.h7am(date == null ? null : this.f27709k.format((java.util.Date) date));
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public synchronized Date mo7087n(C4924k c4924k) throws IOException {
        if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
            c4924k.a98o();
            return null;
        }
        try {
            return new Date(this.f27709k.parse(c4924k.nmn5()).getTime());
        } catch (ParseException e2) {
            throw new zurt(e2);
        }
    }
}
