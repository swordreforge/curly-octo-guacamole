package com.tencent.wxop.stat.common;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.k */
/* JADX INFO: loaded from: classes3.dex */
class C5391k extends AbstractC5389i {

    /* JADX INFO: renamed from: g */
    static final /* synthetic */ boolean f30137g = true;

    /* JADX INFO: renamed from: h */
    private static final byte[] f30138h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: i */
    private static final byte[] f30139i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c */
    int f30140c;

    /* JADX INFO: renamed from: d */
    public final boolean f30141d;

    /* JADX INFO: renamed from: e */
    public final boolean f30142e;

    /* JADX INFO: renamed from: f */
    public final boolean f30143f;

    /* JADX INFO: renamed from: j */
    private final byte[] f30144j;

    /* JADX INFO: renamed from: k */
    private int f30145k;

    /* JADX INFO: renamed from: l */
    private final byte[] f30146l;

    public C5391k(int i2, byte[] bArr) {
        this.f30130a = bArr;
        this.f30141d = (i2 & 1) == 0;
        boolean z2 = (i2 & 2) == 0;
        this.f30142e = z2;
        this.f30143f = (i2 & 4) != 0;
        this.f30146l = (i2 & 8) == 0 ? f30138h : f30139i;
        this.f30144j = new byte[2];
        this.f30140c = 0;
        this.f30145k = z2 ? 19 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e6 A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m18403a(byte[] r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.common.C5391k.m18403a(byte[], int, int, boolean):boolean");
    }
}
