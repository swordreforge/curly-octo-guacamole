package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public class r6ty {

    /* JADX INFO: renamed from: k */
    private XmlPullParser f33579k;

    r6ty() {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f33579k = xmlPullParserNewPullParser;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    xtb7 m21416k(byte[] bArr, imd imdVar) throws XmlPullParserException, ovdh, IOException {
        this.f33579k.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f33579k.next();
        int eventType = this.f33579k.getEventType();
        String name = this.f33579k.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return c25.zy(this.f33579k);
        }
        if (name.equals("iq")) {
            return c25.toq(this.f33579k, imdVar);
        }
        if (name.equals("presence")) {
            return c25.m20679q(this.f33579k);
        }
        if (this.f33579k.getName().equals("stream")) {
            return null;
        }
        if (this.f33579k.getName().equals("error")) {
            throw new ovdh(c25.m20678n(this.f33579k));
        }
        if (!this.f33579k.getName().equals("warning")) {
            this.f33579k.getName().equals("bind");
            return null;
        }
        this.f33579k.next();
        this.f33579k.getName().equals("multi-login");
        return null;
    }
}
