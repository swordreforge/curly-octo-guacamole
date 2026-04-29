package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.internal.C4898g;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.google.gson.zurt;
import dxef.C5995k;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: DateTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy extends fu4<Date> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final InterfaceC4928z f68779toq = new C4897k();

    /* JADX INFO: renamed from: k */
    private final List<DateFormat> f27739k;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.zy$k */
    /* JADX INFO: compiled from: DateTypeAdapter.java */
    class C4897k implements InterfaceC4928z {
        C4897k() {
        }

        @Override // com.google.gson.InterfaceC4928z
        /* JADX INFO: renamed from: k */
        public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
            if (c4922k.getRawType() == Date.class) {
                return new zy();
            }
            return null;
        }
    }

    public zy() {
        ArrayList arrayList = new ArrayList();
        this.f27739k = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C4898g.m17163n()) {
            arrayList.add(com.google.gson.internal.x2.m17206n(2, 2));
        }
    }

    /* JADX INFO: renamed from: p */
    private synchronized Date m17159p(String str) {
        Iterator<DateFormat> it = this.f27739k.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C5995k.f7l8(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new zurt(str, e2);
        }
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public Date mo7087n(C4924k c4924k) throws IOException {
        if (c4924k.g1() != com.google.gson.stream.zy.NULL) {
            return m17159p(c4924k.nmn5());
        }
        c4924k.a98o();
        return null;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public synchronized void mo7089s(C4926q c4926q, Date date) throws IOException {
        if (date == null) {
            c4926q.hyr();
        } else {
            c4926q.h7am(this.f27739k.get(0).format(date));
        }
    }
}
