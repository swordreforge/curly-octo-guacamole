package bo;

/* JADX INFO: compiled from: LogConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final long f54020f7l8 = 1000;

    /* JADX INFO: renamed from: g */
    public static final long f7283g = 60000;

    /* JADX INFO: renamed from: y */
    public static final long f7284y = 1;

    /* JADX INFO: renamed from: k */
    private long f7285k = 60000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f54021toq = 1000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f54022zy = 1;

    /* JADX INFO: renamed from: q */
    private EnumC7898toq f7287q = EnumC7898toq.SQLITE;

    /* JADX INFO: renamed from: n */
    private boolean f7286n = false;

    /* JADX INFO: renamed from: bo.toq$k */
    /* JADX INFO: compiled from: LogConfig.java */
    public static class C1378k {

        /* JADX INFO: renamed from: k */
        private long f7288k = 60000;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f54023toq = 1000;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f54024zy = 1;

        /* JADX INFO: renamed from: q */
        private EnumC7898toq f7290q = EnumC7898toq.SQLITE;

        /* JADX INFO: renamed from: n */
        private boolean f7289n = false;

        /* JADX INFO: renamed from: g */
        public C1378k m5833g(EnumC7898toq type) {
            this.f7290q = type;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C1378k m5834k() {
            this.f7289n = true;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C1378k m5835n(long postDuration) {
            this.f7288k = postDuration;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C1378k m5836q(long minPostSize) {
            this.f54024zy = minPostSize;
            return this;
        }

        public toq toq() {
            toq toqVar = new toq();
            toqVar.f7l8(this.f54023toq);
            toqVar.m5832y(this.f54024zy);
            toqVar.m5831s(this.f7288k);
            toqVar.m5829p(this.f7290q);
            if (this.f7289n) {
                toqVar.m5827k();
            }
            return toqVar;
        }

        public C1378k zy(long maxPostSize) {
            this.f54023toq = maxPostSize;
            return this;
        }
    }

    /* JADX INFO: renamed from: bo.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LogConfig.java */
    public enum EnumC7898toq {
        FILE,
        SQLITE,
        RAM
    }

    public void f7l8(long maxPostSize) {
        this.f54021toq = maxPostSize;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5826g() {
        return this.f7286n;
    }

    /* JADX INFO: renamed from: k */
    public void m5827k() {
        this.f7286n = true;
    }

    /* JADX INFO: renamed from: n */
    public EnumC7898toq m5828n() {
        return this.f7287q;
    }

    /* JADX INFO: renamed from: p */
    public void m5829p(EnumC7898toq storageType) {
        this.f7287q = storageType;
    }

    /* JADX INFO: renamed from: q */
    public long m5830q() {
        return this.f7285k;
    }

    /* JADX INFO: renamed from: s */
    public void m5831s(long postDuration) {
        this.f7285k = postDuration;
    }

    public long toq() {
        return this.f54021toq;
    }

    /* JADX INFO: renamed from: y */
    public void m5832y(long minPostSize) {
        this.f54022zy = minPostSize;
    }

    public long zy() {
        return this.f54022zy;
    }
}
