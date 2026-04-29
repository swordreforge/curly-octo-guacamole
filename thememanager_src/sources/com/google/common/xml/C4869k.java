package com.google.common.xml;

import com.google.common.escape.AbstractC4601g;
import com.google.common.escape.f7l8;
import kotlin.text.eqxt;
import okio.C7571o;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.xml.k */
/* JADX INFO: compiled from: XmlEscapers.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
@InterfaceC7731k
public class C4869k {

    /* JADX INFO: renamed from: k */
    private static final char f27632k = 0;

    /* JADX INFO: renamed from: n */
    private static final AbstractC4601g f27633n;

    /* JADX INFO: renamed from: q */
    private static final AbstractC4601g f27634q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final char f68692toq = 31;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final AbstractC4601g f68693zy;

    static {
        f7l8.zy qVar = f7l8.toq();
        qVar.m16147q((char) 0, C7571o.f94298toq);
        qVar.m16146n("�");
        for (char c2 = 0; c2 <= 31; c2 = (char) (c2 + 1)) {
            if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                qVar.toq(c2, "�");
            }
        }
        qVar.toq(eqxt.f36674q, "&amp;");
        qVar.toq(eqxt.f36672n, "&lt;");
        qVar.toq(eqxt.f36668g, "&gt;");
        f27634q = qVar.zy();
        qVar.toq('\'', "&apos;");
        qVar.toq(eqxt.f81913toq, "&quot;");
        f68693zy = qVar.zy();
        qVar.toq('\t', "&#x9;");
        qVar.toq('\n', "&#xA;");
        qVar.toq('\r', "&#xD;");
        f27633n = qVar.zy();
    }

    private C4869k() {
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC4601g m17071k() {
        return f27633n;
    }

    public static AbstractC4601g toq() {
        return f27634q;
    }
}
