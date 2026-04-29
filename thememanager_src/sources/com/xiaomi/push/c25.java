package com.xiaomi.push;

import android.text.TextUtils;
import com.android.thememanager.share.C2708s;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.xiaomi.onetrack.p014c.C5729c;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.vwb;
import com.xiaomi.push.xblq;
import com.xiaomi.push.z617;
import gyi.C6068k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v5yj.C7704k;

/* JADX INFO: loaded from: classes3.dex */
public class c25 {

    /* JADX INFO: renamed from: k */
    private static XmlPullParser f32766k;

    private static String f7l8(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    /* JADX INFO: renamed from: g */
    public static z617 m20676g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        String attributeValue = C6068k.f35060p;
        String attributeValue2 = null;
        String attributeValue3 = null;
        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
            if (xmlPullParser.getAttributeName(i2).equals("code")) {
                attributeValue = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i2).equals("type")) {
                attributeValue3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i2).equals("reason")) {
                attributeValue2 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str = null;
        String strNextText = null;
        while (!z2) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    strNextText = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str = name;
                    } else {
                        arrayList.add(m20677k(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z2 = true;
                }
            } else if (next == 4) {
                strNextText = xmlPullParser.getText();
            }
        }
        return new z617(Integer.parseInt(attributeValue), attributeValue3 == null ? "cancel" : attributeValue3, attributeValue2, str, strNextText, arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static hyow m20677k(String str, String str2, XmlPullParser xmlPullParser) {
        Object qVar = ab.m20575k().toq(C3678q.f65828lv5, "xm:chat");
        if (qVar == null || !(qVar instanceof com.xiaomi.push.service.g1)) {
            return null;
        }
        return ((com.xiaomi.push.service.g1) qVar).zy(xmlPullParser);
    }

    /* JADX INFO: renamed from: n */
    public static lk m20678n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        lk lkVar = null;
        boolean z2 = false;
        while (!z2) {
            int next = xmlPullParser.next();
            if (next == 2) {
                lkVar = new lk(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z2 = true;
            }
        }
        return lkVar;
    }

    /* JADX INFO: renamed from: q */
    public static vwb m20679q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        vwb.toq toqVarValueOf = vwb.toq.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                toqVarValueOf = vwb.toq.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        vwb vwbVar = new vwb(toqVarValueOf);
        vwbVar.ki(xmlPullParser.getAttributeValue("", "to"));
        vwbVar.m22027i(xmlPullParser.getAttributeValue("", "from"));
        vwbVar.m22026h(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        vwbVar.n7h(attributeValue2);
        boolean z2 = false;
        while (!z2) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    vwbVar.m21920t(xmlPullParser.nextText());
                } else if (name.equals(C5729c.a.f32003g)) {
                    try {
                        vwbVar.m21921z(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        vwbVar.m21921z(0);
                    }
                } else if (name.equals("show")) {
                    String strNextText = xmlPullParser.nextText();
                    try {
                        vwbVar.o1t(vwb.EnumC5954k.valueOf(strNextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + strNextText);
                    }
                } else if (name.equals("error")) {
                    vwbVar.m22031s(m20676g(xmlPullParser));
                } else {
                    vwbVar.m22032y(m20677k(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z2 = true;
            }
        }
        return vwbVar;
    }

    /* JADX INFO: renamed from: s */
    private static String m20680s(XmlPullParser xmlPullParser) {
        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i2)))) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static xblq toq(XmlPullParser xmlPullParser, imd imdVar) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        xblq.C5960k c5960kM22023k = xblq.C5960k.m22023k(xmlPullParser.getAttributeValue("", "type"));
        HashMap map = new HashMap();
        boolean z2 = false;
        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            map.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        xblq f3fVar = null;
        z617 z617VarM20676g = null;
        while (!z2) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    z617VarM20676g = m20676g(xmlPullParser);
                } else {
                    f3fVar = new xblq();
                    f3fVar.m22032y(m20677k(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z2 = true;
            }
        }
        if (f3fVar == null) {
            if (xblq.C5960k.f73729toq == c5960kM22023k || xblq.C5960k.f73730zy == c5960kM22023k) {
                tjz5 tjz5Var = new tjz5();
                tjz5Var.n7h(attributeValue);
                tjz5Var.ki(attributeValue3);
                tjz5Var.m22027i(attributeValue2);
                tjz5Var.o1t(xblq.C5960k.f34174n);
                tjz5Var.m22026h(attributeValue4);
                tjz5Var.m22031s(new z617(z617.C5968k.f34240g));
                imdVar.x2(tjz5Var);
                com.xiaomi.channel.commonutils.logger.zy.jk("iq usage error. send packet in packet parser.");
                return null;
            }
            f3fVar = new f3f();
        }
        f3fVar.n7h(attributeValue);
        f3fVar.ki(attributeValue2);
        f3fVar.m22026h(attributeValue4);
        f3fVar.m22027i(attributeValue3);
        f3fVar.o1t(c5960kM22023k);
        f3fVar.m22031s(z617VarM20676g);
        f3fVar.wvg(map);
        return f3fVar;
    }

    /* JADX INFO: renamed from: y */
    private static void m20681y(byte[] bArr) throws XmlPullParserException {
        if (f32766k == null) {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f32766k = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
            }
        }
        f32766k.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    public static xtb7 zy(XmlPullParser xmlPullParser) throws XmlPullParserException, ovdh, IOException {
        String attributeValue;
        boolean z2 = false;
        String strNextText = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", C7704k.y.toq.f44691k))) {
            String attributeValue2 = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue6 = xmlPullParser.getAttributeValue("", "type");
            eqxt.toq qVar = com.xiaomi.push.service.eqxt.zy().toq(attributeValue2, attributeValue5);
            if (qVar == null) {
                qVar = com.xiaomi.push.service.eqxt.zy().toq(attributeValue2, attributeValue4);
            }
            if (qVar == null) {
                throw new ovdh("the channel id is wrong while receiving a encrypted message");
            }
            xtb7 xtb7VarZy = null;
            while (!z2) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!C7704k.y.toq.f44691k.equals(xmlPullParser.getName())) {
                        throw new ovdh("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new ovdh("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue2) || "6".equals(attributeValue2)) {
                        pnt2 pnt2Var = new pnt2();
                        pnt2Var.m22026h(attributeValue2);
                        pnt2Var.jk(true);
                        pnt2Var.m22027i(attributeValue4);
                        pnt2Var.ki(attributeValue5);
                        pnt2Var.n7h(attributeValue3);
                        pnt2Var.d2ok(attributeValue6);
                        hyow hyowVar = new hyow(C7704k.y.toq.f44691k, null, null, null);
                        hyowVar.m20963y(text);
                        pnt2Var.m22032y(hyowVar);
                        return pnt2Var;
                    }
                    m20681y(com.xiaomi.push.service.n5r1.m21698y(com.xiaomi.push.service.n5r1.f7l8(qVar.f33765s, attributeValue3), text));
                    f32766k.next();
                    xtb7VarZy = zy(f32766k);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z2 = true;
                }
            }
            if (xtb7VarZy != null) {
                return xtb7VarZy;
            }
            throw new ovdh("error while receiving a encrypted message with wrong format");
        }
        pnt2 pnt2Var2 = new pnt2();
        String attributeValue7 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue7 == null) {
            attributeValue7 = "ID_NOT_AVAILABLE";
        }
        pnt2Var2.n7h(attributeValue7);
        pnt2Var2.ki(xmlPullParser.getAttributeValue("", "to"));
        pnt2Var2.m22027i(xmlPullParser.getAttributeValue("", "from"));
        pnt2Var2.m22026h(xmlPullParser.getAttributeValue("", "chid"));
        pnt2Var2.m21387z(xmlPullParser.getAttributeValue("", "appid"));
        try {
            attributeValue = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            attributeValue = null;
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                pnt2Var2.mcp(attributeValue8);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                pnt2Var2.fti(attributeValue9);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue10)) {
                pnt2Var2.gvn7(attributeValue10);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue11 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue11)) {
                pnt2Var2.oc(attributeValue11);
            }
        } catch (Exception unused5) {
        }
        pnt2Var2.wvg(!TextUtils.isEmpty(attributeValue) && attributeValue.equalsIgnoreCase("true"));
        pnt2Var2.d2ok(xmlPullParser.getAttributeValue("", "type"));
        String strM20680s = m20680s(xmlPullParser);
        if (strM20680s == null || "".equals(strM20680s.trim())) {
            xtb7.fu4();
        } else {
            pnt2Var2.m21384l(strM20680s);
        }
        while (!z2) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals(C2708s.f16056n)) {
                    m20680s(xmlPullParser);
                    pnt2Var2.m21385r(f7l8(xmlPullParser));
                } else if (name.equals(C3678q.f22041h)) {
                    String attributeValue12 = xmlPullParser.getAttributeValue("", "encode");
                    String strF7l8 = f7l8(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue12)) {
                        pnt2Var2.x9kr(strF7l8);
                    } else {
                        pnt2Var2.o1t(strF7l8, attributeValue12);
                    }
                } else if (name.equals("thread")) {
                    if (strNextText == null) {
                        strNextText = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    pnt2Var2.m22031s(m20676g(xmlPullParser));
                } else {
                    pnt2Var2.m22032y(m20677k(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z2 = true;
            }
        }
        pnt2Var2.ncyb(strNextText);
        return pnt2Var2;
    }
}
