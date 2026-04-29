package hb;

/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public String f77069f7l8;

    /* JADX INFO: renamed from: g */
    public String f35090g;

    /* JADX INFO: renamed from: k */
    public String f35091k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public boolean f77070ld6;

    /* JADX INFO: renamed from: n */
    public String f35092n;

    /* JADX INFO: renamed from: p */
    public int f35093p;

    /* JADX INFO: renamed from: q */
    public String f35094q;

    /* JADX INFO: renamed from: s */
    public boolean f35095s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public String f77071toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public boolean f77072x2;

    /* JADX INFO: renamed from: y */
    public String f35096y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public String f77073zy;

    /* JADX INFO: renamed from: hb.toq$k */
    /* JADX INFO: compiled from: DownloadRequest.java */
    public static class C6073k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f77074f7l8;

        /* JADX INFO: renamed from: g */
        private String f35097g;

        /* JADX INFO: renamed from: k */
        private String f35098k;

        /* JADX INFO: renamed from: n */
        private String f35099n;

        /* JADX INFO: renamed from: q */
        private String f35101q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f77076toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f77077x2;

        /* JADX INFO: renamed from: y */
        private String f35103y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f77078zy;

        /* JADX INFO: renamed from: s */
        private boolean f35102s = true;

        /* JADX INFO: renamed from: p */
        private int f35100p = 1;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f77075ld6 = true;

        public C6073k f7l8(boolean launchWhenInstalled) {
            this.f77077x2 = launchWhenInstalled;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C6073k m22360g(String floatCardUrlV2) {
            this.f35103y = floatCardUrlV2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C6073k m22361k(String appClientId) {
            this.f77078zy = appClientId;
            return this;
        }

        public C6073k ld6(String senderPackageName) {
            this.f35101q = senderPackageName;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C6073k m22362n(String extraQueryParams) {
            this.f77074f7l8 = extraQueryParams;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C6073k m22363p(String packageName) {
            this.f35098k = packageName;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m22364q() {
            toq toqVar = new toq();
            toqVar.f35096y = this.f35103y;
            toqVar.f77073zy = this.f77078zy;
            toqVar.f77071toq = this.f77076toq;
            toqVar.f35092n = this.f35099n;
            toqVar.f77069f7l8 = this.f77074f7l8;
            toqVar.f35090g = this.f35097g;
            toqVar.f35093p = this.f35100p;
            toqVar.f35091k = this.f35098k;
            if (this.f35101q == null) {
                this.f35101q = bf2.toq.toq().getPackageName();
            }
            toqVar.f35094q = this.f35101q;
            toqVar.f35095s = this.f35102s;
            toqVar.f77070ld6 = this.f77075ld6;
            toqVar.f77072x2 = this.f77077x2;
            return toqVar;
        }

        public C6073k qrj(boolean startDown) {
            this.f77075ld6 = startDown;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C6073k m22365s(int overlayPosition) {
            this.f35100p = overlayPosition;
            return this;
        }

        public C6073k toq(String appRef) {
            this.f77076toq = appRef;
            return this;
        }

        public C6073k x2(boolean show_cta) {
            this.f35102s = show_cta;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C6073k m22366y(String nonce) {
            this.f35097g = nonce;
            return this;
        }

        public C6073k zy(String appSignature) {
            this.f35099n = appSignature;
            return this;
        }
    }
}
