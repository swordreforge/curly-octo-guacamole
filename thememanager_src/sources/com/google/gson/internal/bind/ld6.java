package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.google.gson.zurt;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: TimeTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ld6 extends fu4<Time> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final InterfaceC4928z f68725toq = new C4877k();

    /* JADX INFO: renamed from: k */
    private final DateFormat f27672k = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ld6$k */
    /* JADX INFO: compiled from: TimeTypeAdapter.java */
    class C4877k implements InterfaceC4928z {
        C4877k() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.getRawType() == Time.class) {
                return new ld6();
            }
            return null;
        }
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public synchronized void mo7089s(C4926q c4926q, Time time) throws IOException {
        c4926q.h7am(time == null ? null : this.f27672k.format((Date) time));
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public synchronized Time mo7087n(C4924k c4924k) throws IOException {
        if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
            c4924k.a98o();
            return null;
        }
        try {
            return new Time(this.f27672k.parse(c4924k.nmn5()).getTime());
        } catch (ParseException e2) {
            throw new zurt(e2);
        }
    }
}
