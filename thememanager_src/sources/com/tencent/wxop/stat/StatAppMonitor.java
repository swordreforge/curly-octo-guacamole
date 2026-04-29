package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
public class StatAppMonitor implements Cloneable {
    public static final int FAILURE_RESULT_TYPE = 1;
    public static final int LOGIC_FAILURE_RESULT_TYPE = 2;
    public static final int SUCCESS_RESULT_TYPE = 0;

    /* JADX INFO: renamed from: a */
    private String f29910a;

    /* JADX INFO: renamed from: b */
    private long f29911b;

    /* JADX INFO: renamed from: c */
    private long f29912c;

    /* JADX INFO: renamed from: d */
    private int f29913d;

    /* JADX INFO: renamed from: e */
    private long f29914e;

    /* JADX INFO: renamed from: f */
    private int f29915f;

    /* JADX INFO: renamed from: g */
    private int f29916g;

    public StatAppMonitor(String str) {
        this.f29911b = 0L;
        this.f29912c = 0L;
        this.f29913d = 0;
        this.f29914e = 0L;
        this.f29915f = 0;
        this.f29916g = 1;
        this.f29910a = str;
    }

    public StatAppMonitor(String str, int i2, int i3, long j2, long j3, long j4, int i4) {
        this.f29910a = str;
        this.f29911b = j2;
        this.f29912c = j3;
        this.f29913d = i2;
        this.f29914e = j4;
        this.f29915f = i3;
        this.f29916g = i4;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public StatAppMonitor m28270clone() {
        try {
            return (StatAppMonitor) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getInterfaceName() {
        return this.f29910a;
    }

    public long getMillisecondsConsume() {
        return this.f29914e;
    }

    public long getReqSize() {
        return this.f29911b;
    }

    public long getRespSize() {
        return this.f29912c;
    }

    public int getResultType() {
        return this.f29913d;
    }

    public int getReturnCode() {
        return this.f29915f;
    }

    public int getSampling() {
        return this.f29916g;
    }

    public void setInterfaceName(String str) {
        this.f29910a = str;
    }

    public void setMillisecondsConsume(long j2) {
        this.f29914e = j2;
    }

    public void setReqSize(long j2) {
        this.f29911b = j2;
    }

    public void setRespSize(long j2) {
        this.f29912c = j2;
    }

    public void setResultType(int i2) {
        this.f29913d = i2;
    }

    public void setReturnCode(int i2) {
        this.f29915f = i2;
    }

    public void setSampling(int i2) {
        if (i2 <= 0) {
            i2 = 1;
        }
        this.f29916g = i2;
    }
}
