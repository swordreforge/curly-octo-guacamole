package com.tencent.wxop.stat.event;

import android.content.Context;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C5382b;
import com.tencent.wxop.stat.common.C5398r;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.wxop.stat.event.d */
/* JADX INFO: loaded from: classes3.dex */
public class C5404d extends AbstractC5405e {

    /* JADX INFO: renamed from: a */
    private String f30186a;

    /* JADX INFO: renamed from: m */
    private int f30187m;

    /* JADX INFO: renamed from: n */
    private int f30188n;

    /* JADX INFO: renamed from: o */
    private Thread f30189o;

    public C5404d(Context context, int i2, int i3, Throwable th, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30188n = 100;
        this.f30189o = null;
        m18484a(i3, th);
    }

    public C5404d(Context context, int i2, int i3, Throwable th, Thread thread, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30188n = 100;
        this.f30189o = null;
        m18484a(i3, th);
        this.f30189o = thread;
    }

    public C5404d(Context context, int i2, String str, int i3, int i4, Thread thread, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i2, statSpecifyReportedInfo);
        this.f30188n = 100;
        this.f30189o = null;
        if (str != null) {
            i4 = i4 <= 0 ? StatConfig.getMaxReportEventLength() : i4;
            if (str.length() <= i4) {
                this.f30186a = str;
            } else {
                this.f30186a = str.substring(0, i4);
            }
        }
        this.f30189o = thread;
        this.f30187m = i3;
    }

    /* JADX INFO: renamed from: a */
    private void m18484a(int i2, Throwable th) {
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            this.f30186a = stringWriter.toString();
            this.f30187m = i2;
            printWriter.close();
        }
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public EventType mo18479a() {
        return EventType.ERROR;
    }

    @Override // com.tencent.wxop.stat.event.AbstractC5405e
    /* JADX INFO: renamed from: a */
    public boolean mo18480a(JSONObject jSONObject) throws JSONException {
        C5398r.m18466a(jSONObject, "er", this.f30186a);
        jSONObject.put("ea", this.f30187m);
        int i2 = this.f30187m;
        if (i2 != 2 && i2 != 3) {
            return true;
        }
        new C5382b(this.f30201l).m18387a(jSONObject, this.f30189o);
        return true;
    }
}
