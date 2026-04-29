package com.tencent.wxop.stat.common;

import android.content.Context;
import com.tencent.wxop.stat.C5378a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5382b {

    /* JADX INFO: renamed from: a */
    static C5384d f30099a;

    /* JADX INFO: renamed from: d */
    private static StatLogger f30100d = C5392l.m18418b();

    /* JADX INFO: renamed from: e */
    private static JSONObject f30101e = new JSONObject();

    /* JADX INFO: renamed from: b */
    Integer f30102b;

    /* JADX INFO: renamed from: c */
    String f30103c;

    public C5382b(Context context) {
        this.f30102b = null;
        this.f30103c = null;
        try {
            m18385a(context);
            this.f30102b = C5392l.m18435k(context.getApplicationContext());
            this.f30103c = C5378a.m18307a(context).m18316b();
        } catch (Throwable th) {
            f30100d.m18376e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    static synchronized C5384d m18385a(Context context) {
        if (f30099a == null) {
            f30099a = new C5384d(context.getApplicationContext());
        }
        return f30099a;
    }

    /* JADX INFO: renamed from: a */
    public static void m18386a(Context context, Map<String, String> map) throws JSONException {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : new HashMap(map).entrySet()) {
            f30101e.put((String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public void m18387a(JSONObject jSONObject, Thread thread) {
        String str;
        Object string;
        JSONObject jSONObject2 = new JSONObject();
        try {
            C5384d c5384d = f30099a;
            if (c5384d != null) {
                c5384d.m18388a(jSONObject2, thread);
            }
            C5398r.m18466a(jSONObject2, "cn", this.f30103c);
            Integer num = this.f30102b;
            if (num != null) {
                jSONObject2.put("tn", num);
            }
            if (thread == null) {
                str = "ev";
                string = jSONObject2;
            } else {
                str = "errkv";
                string = jSONObject2.toString();
            }
            jSONObject.put(str, string);
            JSONObject jSONObject3 = f30101e;
            if (jSONObject3 == null || jSONObject3.length() <= 0) {
                return;
            }
            jSONObject.put("eva", f30101e);
        } catch (Throwable th) {
            f30100d.m18376e(th);
        }
    }
}
