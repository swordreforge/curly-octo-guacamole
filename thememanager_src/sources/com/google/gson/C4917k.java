package com.google.gson;

import com.google.gson.internal.C4898g;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import dxef.C5995k;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.gson.k */
/* JADX INFO: compiled from: DefaultDateTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
final class C4917k extends fu4<Date> {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f68797zy = "DefaultDateTypeAdapter";

    /* JADX INFO: renamed from: k */
    private final Class<? extends Date> f27818k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<DateFormat> f68798toq;

    C4917k(Class<? extends Date> cls) {
        ArrayList arrayList = new ArrayList();
        this.f68798toq = arrayList;
        this.f27818k = x2(cls);
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
    private Date m17210p(String str) {
        synchronized (this.f68798toq) {
            Iterator<DateFormat> it = this.f68798toq.iterator();
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
    }

    private static Class<? extends Date> x2(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public Date mo7087n(C4924k c4924k) throws IOException {
        if (c4924k.g1() == com.google.gson.stream.zy.NULL) {
            c4924k.a98o();
            return null;
        }
        Date dateM17210p = m17210p(c4924k.nmn5());
        Class<? extends Date> cls = this.f27818k;
        if (cls == Date.class) {
            return dateM17210p;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateM17210p.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateM17210p.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public void mo7089s(C4926q c4926q, Date date) throws IOException {
        if (date == null) {
            c4926q.hyr();
            return;
        }
        synchronized (this.f68798toq) {
            c4926q.h7am(this.f68798toq.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f68798toq.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    C4917k(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f68798toq = arrayList;
        this.f27818k = x2(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    C4917k(Class<? extends Date> cls, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f68798toq = arrayList;
        this.f27818k = x2(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i2));
        }
        if (C4898g.m17163n()) {
            arrayList.add(com.google.gson.internal.x2.m17207q(i2));
        }
    }

    public C4917k(int i2, int i3) {
        this(Date.class, i2, i3);
    }

    public C4917k(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f68798toq = arrayList;
        this.f27818k = x2(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (C4898g.m17163n()) {
            arrayList.add(com.google.gson.internal.x2.m17206n(i2, i3));
        }
    }
}
