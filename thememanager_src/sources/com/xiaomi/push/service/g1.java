package com.xiaomi.push.service;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.xiaomi.push.ab;
import com.xiaomi.push.hyow;
import com.xiaomi.push.i3x9;
import com.xiaomi.push.wtop;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class g1 implements wtop {
    /* JADX INFO: renamed from: k */
    public static hyow m21615k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArr;
        String[] strArr2;
        String strTrim;
        ArrayList arrayList;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                strArr3[i2] = xmlPullParser.getAttributeName(i2);
                strArr4[i2] = i3x9.m20970n(xmlPullParser.getAttributeValue(i2));
            }
            strArr = strArr3;
            strTrim = null;
            arrayList = null;
            strArr2 = strArr4;
        } else {
            strArr = null;
            strArr2 = null;
            strTrim = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new hyow(name, namespace, strArr, strArr2, strTrim, arrayList);
            }
            if (next == 4) {
                strTrim = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                hyow hyowVarM21615k = m21615k(xmlPullParser);
                if (hyowVarM21615k != null) {
                    arrayList.add(hyowVarM21615k);
                }
            }
        }
    }

    public void toq() {
        ab.m20575k().m20576n(C3678q.f65828lv5, "xm:chat", this);
    }

    public hyow zy(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m21615k(xmlPullParser);
        }
        return null;
    }
}
