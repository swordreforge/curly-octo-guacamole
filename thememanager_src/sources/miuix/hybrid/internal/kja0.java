package miuix.hybrid.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: XmlConfigParser.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 implements toq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f87706cdj = "vendor";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f87707f7l8 = "param";

    /* JADX INFO: renamed from: g */
    private static final String f40269g = "feature";

    /* JADX INFO: renamed from: h */
    private static final String f40270h = "timestamp";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f87708kja0 = "signature";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f87709ld6 = "origin";

    /* JADX INFO: renamed from: n */
    private static final String f40271n = "content";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f87710n7h = "value";

    /* JADX INFO: renamed from: p */
    private static final String f40272p = "src";

    /* JADX INFO: renamed from: q */
    private static final String f40273q = "widget";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f87711qrj = "name";

    /* JADX INFO: renamed from: s */
    private static final String f40274s = "access";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87712toq = "com.miui.sdk.hybrid.config";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f87713x2 = "subdomains";

    /* JADX INFO: renamed from: y */
    private static final String f40275y = "preference";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87714zy = "miui_hybrid_config";

    /* JADX INFO: renamed from: k */
    private XmlResourceParser f40276k;

    private kja0(XmlResourceParser parser) {
        this.f40276k = parser;
    }

    private void f7l8(C7127k config, XmlResourceParser parser) {
        C7129p c7129p = new C7129p();
        c7129p.m25833g(parser.getAttributeValue(null, "origin"));
        c7129p.m25836q(parser.getAttributeBooleanValue(null, f87713x2, false));
        c7129p.m25835n(false);
        config.toq(c7129p);
    }

    /* JADX INFO: renamed from: g */
    private x2 m25817g(C7127k config) {
        x2 x2VarQrj = config.qrj();
        if (x2VarQrj != null) {
            return x2VarQrj;
        }
        x2 x2Var = new x2();
        config.m25810i(x2Var);
        return x2Var;
    }

    private void ld6(C7127k config, XmlResourceParser parser) {
        String lowerCase = parser.getAttributeValue(null, "name").toLowerCase();
        String attributeValue = parser.getAttributeValue(null, "value");
        if ("signature".equals(lowerCase)) {
            m25817g(config).zy(attributeValue);
            return;
        }
        if ("timestamp".equals(lowerCase)) {
            m25817g(config).m25901q(Long.parseLong(attributeValue));
        } else if (f87706cdj.equals(lowerCase)) {
            config.fn3e(attributeValue);
        } else {
            config.ki(lowerCase, attributeValue);
        }
    }

    /* JADX INFO: renamed from: n */
    public static kja0 m25818n(XmlResourceParser parser) {
        return new kja0(parser);
    }

    /* JADX INFO: renamed from: p */
    private void m25819p(C7134q feature, XmlResourceParser parser) throws XmlPullParserException, IOException {
        feature.m25861g(parser.getAttributeValue(null, "name").toLowerCase(), parser.getAttributeValue(null, "value"));
    }

    /* JADX INFO: renamed from: q */
    public static kja0 m25820q(Context context, int resId) throws C7126g {
        try {
            return m25818n(context.getResources().getXml(resId));
        } catch (Resources.NotFoundException e2) {
            throw new C7126g(201, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m25821s(C7127k config, XmlResourceParser parser) throws XmlPullParserException, IOException {
        C7134q c7134q = new C7134q();
        c7134q.m25863n(parser.getAttributeValue(null, "name"));
        int depth = parser.getDepth();
        while (true) {
            int next = parser.next();
            if (next == 1 || (next == 3 && parser.getDepth() <= depth)) {
                break;
            }
            if (next != 3 && next != 4 && f87707f7l8.equals(parser.getName())) {
                m25819p(c7134q, parser);
            }
        }
        config.m25811k(c7134q);
    }

    private C7127k toq(C7127k config, Map<String, Object> metaData) {
        return config;
    }

    private void x2(C7127k config, XmlResourceParser parser) throws XmlPullParserException, IOException {
        int depth = parser.getDepth();
        while (true) {
            int next = parser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && parser.getDepth() <= depth) {
                return;
            }
            if (next != 3 && next != 4) {
                String name = parser.getName();
                if ("content".equals(name)) {
                    m25822y(config, parser);
                } else if ("feature".equals(name)) {
                    m25821s(config, parser);
                } else if ("preference".equals(name)) {
                    ld6(config, parser);
                } else if (f40274s.equals(name)) {
                    f7l8(config, parser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m25822y(C7127k config, XmlResourceParser parser) {
        config.kja0(parser.getAttributeValue(null, f40272p));
    }

    public static kja0 zy(Context context) throws C7126g {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int identifier = bundle != null ? bundle.getInt(f87712toq) : 0;
            if (identifier == 0) {
                identifier = context.getResources().getIdentifier(f87714zy, "xml", context.getPackageName());
            }
            return m25820q(context, identifier);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new C7126g(201, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.internal.toq
    /* JADX INFO: renamed from: k */
    public C7127k mo25823k(Map<String, Object> metaData) throws C7126g {
        int next;
        if (metaData == null) {
            metaData = new HashMap<>();
        }
        C7127k c7127k = new C7127k();
        XmlResourceParser xmlResourceParser = this.f40276k;
        if (xmlResourceParser != null) {
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (IOException e2) {
                        throw new C7126g(201, e2.getMessage());
                    } catch (XmlPullParserException e3) {
                        throw new C7126g(201, e3.getMessage());
                    }
                } finally {
                    this.f40276k.close();
                }
            } while (next != 1);
            if ("widget".equals(xmlResourceParser.getName())) {
                x2(c7127k, xmlResourceParser);
            }
        }
        return toq(c7127k, metaData);
    }
}
