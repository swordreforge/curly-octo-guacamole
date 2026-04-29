package miuix.hybrid.internal;

import java.util.TreeSet;

/* JADX INFO: compiled from: ConfigUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f87743f7l8 = "permissions";

    /* JADX INFO: renamed from: g */
    private static final String f40332g = "value";

    /* JADX INFO: renamed from: k */
    private static final String f40333k = "timestamp";

    /* JADX INFO: renamed from: n */
    private static final String f40334n = "name";

    /* JADX INFO: renamed from: q */
    private static final String f40335q = "params";

    /* JADX INFO: renamed from: s */
    private static final String f40336s = "subdomains";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87744toq = "vendor";

    /* JADX INFO: renamed from: y */
    private static final String f40337y = "origin";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87745zy = "features";

    private zy() {
    }

    /* JADX INFO: renamed from: g */
    public static String m25902g(C7127k config) {
        return "{timestamp:" + config.qrj().toq() + "," + f87744toq + ":\"" + config.n7h() + "\"," + toq(config) + "," + m25904n(config) + "}";
    }

    /* JADX INFO: renamed from: k */
    private static String m25903k(C7127k config) {
        StringBuilder sb = new StringBuilder();
        TreeSet<String> treeSet = new TreeSet(config.m25816y().keySet());
        if (treeSet.isEmpty()) {
            return "";
        }
        for (String str : treeSet) {
            sb.append("{");
            sb.append("name");
            sb.append(":");
            sb.append("\"");
            sb.append(str);
            sb.append("\"");
            sb.append(",");
            sb.append(f40335q);
            sb.append(":");
            sb.append("[");
            sb.append(zy(config.f7l8(str)));
            sb.append("]");
            sb.append("}");
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX INFO: renamed from: n */
    private static String m25904n(C7127k config) {
        return f87743f7l8 + ":[" + m25905q(config) + "]";
    }

    /* JADX INFO: renamed from: q */
    private static Object m25905q(C7127k config) {
        StringBuilder sb = new StringBuilder();
        TreeSet<String> treeSet = new TreeSet(config.m25813p().keySet());
        if (treeSet.isEmpty()) {
            return "";
        }
        for (String str : treeSet) {
            sb.append("{");
            sb.append("origin");
            sb.append(":");
            sb.append("\"");
            sb.append(str);
            sb.append("\"");
            sb.append(",");
            sb.append(f40336s);
            sb.append(":");
            sb.append(config.m25815s(str).toq());
            sb.append("}");
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    private static String toq(C7127k config) {
        return f87745zy + ":[" + m25903k(config) + "]";
    }

    private static String zy(C7134q feature) {
        StringBuilder sb = new StringBuilder();
        TreeSet<String> treeSet = new TreeSet(feature.m25864q().keySet());
        if (treeSet.isEmpty()) {
            return "";
        }
        for (String str : treeSet) {
            sb.append("{");
            sb.append("name");
            sb.append(":");
            sb.append("\"");
            sb.append(str);
            sb.append("\"");
            sb.append(",");
            sb.append("value");
            sb.append(":");
            sb.append("\"");
            sb.append(feature.zy(str));
            sb.append("\"");
            sb.append("}");
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
