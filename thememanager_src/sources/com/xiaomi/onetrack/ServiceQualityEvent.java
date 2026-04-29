package com.xiaomi.onetrack;

import android.text.TextUtils;
import com.xiaomi.onetrack.OneTrack;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceQualityEvent {

    /* JADX INFO: renamed from: a */
    private String f31528a;

    /* JADX INFO: renamed from: b */
    private String f31529b;

    /* JADX INFO: renamed from: c */
    private Integer f31530c;

    /* JADX INFO: renamed from: d */
    private String f31531d;

    /* JADX INFO: renamed from: e */
    private String f31532e;

    /* JADX INFO: renamed from: f */
    private Integer f31533f;

    /* JADX INFO: renamed from: g */
    private Integer f31534g;

    /* JADX INFO: renamed from: h */
    private String f31535h;

    /* JADX INFO: renamed from: i */
    private String f31536i;

    /* JADX INFO: renamed from: j */
    private Integer f31537j;

    /* JADX INFO: renamed from: k */
    private Long f31538k;

    /* JADX INFO: renamed from: l */
    private Long f31539l;

    /* JADX INFO: renamed from: m */
    private Long f31540m;

    /* JADX INFO: renamed from: n */
    private Long f31541n;

    /* JADX INFO: renamed from: o */
    private Long f31542o;

    /* JADX INFO: renamed from: p */
    private Long f31543p;

    /* JADX INFO: renamed from: q */
    private Long f31544q;

    /* JADX INFO: renamed from: r */
    private Long f31545r;

    /* JADX INFO: renamed from: s */
    private String f31546s;

    /* JADX INFO: renamed from: t */
    private String f31547t;

    /* JADX INFO: renamed from: u */
    private Map<String, Object> f31548u;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private String f31549a;

        /* JADX INFO: renamed from: b */
        private String f31550b;

        /* JADX INFO: renamed from: c */
        private Integer f31551c;

        /* JADX INFO: renamed from: d */
        private String f31552d;

        /* JADX INFO: renamed from: e */
        private String f31553e;

        /* JADX INFO: renamed from: f */
        private Integer f31554f;

        /* JADX INFO: renamed from: g */
        private Integer f31555g;

        /* JADX INFO: renamed from: h */
        private String f31556h;

        /* JADX INFO: renamed from: i */
        private ResultType f31557i;

        /* JADX INFO: renamed from: j */
        private Integer f31558j;

        /* JADX INFO: renamed from: k */
        private Long f31559k;

        /* JADX INFO: renamed from: l */
        private Long f31560l;

        /* JADX INFO: renamed from: m */
        private Long f31561m;

        /* JADX INFO: renamed from: n */
        private Long f31562n;

        /* JADX INFO: renamed from: o */
        private Long f31563o;

        /* JADX INFO: renamed from: p */
        private Long f31564p;

        /* JADX INFO: renamed from: q */
        private Long f31565q;

        /* JADX INFO: renamed from: r */
        private Long f31566r;

        /* JADX INFO: renamed from: s */
        private OneTrack.NetType f31567s;

        /* JADX INFO: renamed from: t */
        private String f31568t;

        /* JADX INFO: renamed from: u */
        private Map<String, Object> f31569u;

        public ServiceQualityEvent build() {
            return new ServiceQualityEvent(this);
        }

        public Builder setDnsLookupTime(Long l2) {
            this.f31559k = l2;
            return this;
        }

        public Builder setDuration(Long l2) {
            this.f31565q = l2;
            return this;
        }

        public Builder setExceptionTag(String str) {
            this.f31556h = str;
            return this;
        }

        public Builder setExtraParams(Map<String, Object> map) {
            this.f31569u = map;
            return this;
        }

        public Builder setHandshakeTime(Long l2) {
            this.f31561m = l2;
            return this;
        }

        public Builder setHost(String str) {
            this.f31550b = str;
            return this;
        }

        public Builder setIps(String... strArr) {
            if (strArr != null) {
                this.f31553e = TextUtils.join(",", strArr);
            }
            return this;
        }

        public Builder setNetSdkVersion(String str) {
            this.f31568t = str;
            return this;
        }

        public Builder setPath(String str) {
            this.f31552d = str;
            return this;
        }

        public Builder setPort(Integer num) {
            this.f31551c = num;
            return this;
        }

        public Builder setReceiveAllByteTime(Long l2) {
            this.f31564p = l2;
            return this;
        }

        public Builder setReceiveFirstByteTime(Long l2) {
            this.f31563o = l2;
            return this;
        }

        public Builder setRequestDataSendTime(Long l2) {
            this.f31562n = l2;
            return this;
        }

        public Builder setRequestNetType(OneTrack.NetType netType) {
            this.f31567s = netType;
            return this;
        }

        public Builder setRequestTimestamp(Long l2) {
            this.f31566r = l2;
            return this;
        }

        public Builder setResponseCode(Integer num) {
            this.f31554f = num;
            return this;
        }

        public Builder setResultType(ResultType resultType) {
            this.f31557i = resultType;
            return this;
        }

        public Builder setRetryCount(Integer num) {
            this.f31558j = num;
            return this;
        }

        public Builder setScheme(String str) {
            this.f31549a = str;
            return this;
        }

        public Builder setStatusCode(Integer num) {
            this.f31555g = num;
            return this;
        }

        public Builder setTcpConnectTime(Long l2) {
            this.f31560l = l2;
            return this;
        }
    }

    public enum ResultType {
        SUCCESS("ok"),
        FAILED("failed"),
        TIMEOUT("timeout");


        /* JADX INFO: renamed from: a */
        private String f31571a;

        ResultType(String str) {
            this.f31571a = str;
        }

        public String getResultType() {
            return this.f31571a;
        }
    }

    public Long getDnsLookupTime() {
        return this.f31538k;
    }

    public Long getDuration() {
        return this.f31544q;
    }

    public String getExceptionTag() {
        return this.f31535h;
    }

    public Map<String, Object> getExtraParams() {
        return this.f31548u;
    }

    public Long getHandshakeTime() {
        return this.f31540m;
    }

    public String getHost() {
        return this.f31529b;
    }

    public String getIps() {
        return this.f31532e;
    }

    public String getNetSdkVersion() {
        return this.f31547t;
    }

    public String getPath() {
        return this.f31531d;
    }

    public Integer getPort() {
        return this.f31530c;
    }

    public Long getReceiveAllByteTime() {
        return this.f31543p;
    }

    public Long getReceiveFirstByteTime() {
        return this.f31542o;
    }

    public Long getRequestDataSendTime() {
        return this.f31541n;
    }

    public String getRequestNetType() {
        return this.f31546s;
    }

    public Long getRequestTimestamp() {
        return this.f31545r;
    }

    public Integer getResponseCode() {
        return this.f31533f;
    }

    public String getResultType() {
        return this.f31536i;
    }

    public Integer getRetryCount() {
        return this.f31537j;
    }

    public String getScheme() {
        return this.f31528a;
    }

    public Integer getStatusCode() {
        return this.f31534g;
    }

    public Long getTcpConnectTime() {
        return this.f31539l;
    }

    private ServiceQualityEvent(Builder builder) {
        this.f31528a = builder.f31549a;
        this.f31529b = builder.f31550b;
        this.f31530c = builder.f31551c;
        this.f31531d = builder.f31552d;
        this.f31532e = builder.f31553e;
        this.f31533f = builder.f31554f;
        this.f31534g = builder.f31555g;
        this.f31535h = builder.f31556h;
        this.f31536i = builder.f31557i != null ? builder.f31557i.getResultType() : null;
        this.f31537j = builder.f31558j;
        this.f31538k = builder.f31559k;
        this.f31539l = builder.f31560l;
        this.f31540m = builder.f31561m;
        this.f31542o = builder.f31563o;
        this.f31543p = builder.f31564p;
        this.f31545r = builder.f31566r;
        this.f31546s = builder.f31567s != null ? builder.f31567s.toString() : null;
        this.f31541n = builder.f31562n;
        this.f31544q = builder.f31565q;
        this.f31547t = builder.f31568t;
        this.f31548u = builder.f31569u;
    }
}
