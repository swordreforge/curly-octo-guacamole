package com.miui.systemAdSolution.landingPageV2.task.action;

import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.miui.systemAdSolution.landingPageV2.listener.IDownloadListener;
import com.xiaomi.ad.entity.contract.zy;
import e5.InterfaceC5997k;
import u38j.C7683q;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadAction extends Action<IDownloadListener> {
    private static final String TAG = "DownloadAction";

    /* JADX INFO: renamed from: h */
    public static final int f29810h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f29811i = 2;

    /* JADX INFO: renamed from: z */
    public static final int f29812z = 3;
    private C5337k mDownloadInfo;
    private toq mMiniCardConfig;
    private String mPackageName;

    /* JADX INFO: renamed from: p */
    private boolean f29813p;

    /* JADX INFO: renamed from: s */
    private boolean f29814s;

    /* JADX INFO: renamed from: y */
    private int f29815y;

    /* JADX INFO: renamed from: com.miui.systemAdSolution.landingPageV2.task.action.DownloadAction$k */
    public class C5337k extends zy {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final double f72485ld6 = 1.0d;

        /* JADX INFO: renamed from: p */
        private static final String f29816p = "DownloadInfo";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC5997k
        int f72486f7l8;

        /* JADX INFO: renamed from: g */
        @InterfaceC5997k
        String f29817g;

        /* JADX INFO: renamed from: n */
        @InterfaceC5997k
        String f29818n;

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        String f29819q;

        /* JADX INFO: renamed from: y */
        @InterfaceC5997k
        String f29821y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        String f72487zy;

        public C5337k() {
        }

        public void cdj(String str) {
            this.f29817g = str;
        }

        /* JADX INFO: renamed from: h */
        public void m18165h(String str) {
            this.f29819q = str;
        }

        public void ki(String str) {
            this.f29818n = str;
        }

        public String kja0() {
            return this.f29818n;
        }

        public String ld6() {
            return this.f72487zy;
        }

        public String n7h() {
            return this.f29817g;
        }

        /* JADX INFO: renamed from: p */
        public String m18166p() {
            return this.f29821y;
        }

        public int qrj() {
            return this.f72486f7l8;
        }

        public String x2() {
            return this.f29819q;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f29816p;
        }
    }

    public class toq extends zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final double f72488f7l8 = 1.0d;

        /* JADX INFO: renamed from: g */
        private static final String f29822g = "MiniCardConfig";

        /* JADX INFO: renamed from: q */
        @InterfaceC5997k
        boolean f29824q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC5997k
        boolean f72489zy;

        public toq() {
        }

        public boolean ld6() {
            return this.f29824q;
        }

        /* JADX INFO: renamed from: p */
        public boolean m18167p() {
            return this.f72489zy;
        }

        @Override // com.xiaomi.ad.entity.contract.zy
        /* JADX INFO: renamed from: y */
        protected String mo18161y() {
            return f29822g;
        }
    }

    protected DownloadAction(Parcel parcel) {
        super(parcel);
        if (parcel != null) {
            try {
                String string = parcel.readString();
                this.mPackageName = string;
                if (TextUtils.isEmpty(string)) {
                    this.mPackageName = ld6();
                }
                this.f29815y = parcel.readInt();
                this.f29814s = f7l8(parcel.readInt());
                this.f29813p = f7l8(parcel.readInt());
                this.mMiniCardConfig = zurt(parcel.readString());
                this.mDownloadInfo = t8r(parcel.readString());
            } catch (Exception e2) {
                C7683q.m28055n(TAG, "DownloadAction parse parcel e : ", e2);
            }
        }
    }

    private static String ld6() {
        String str = "FAKE_PACKAGE:" + String.valueOf(System.currentTimeMillis()).hashCode();
        C7683q.kja0(TAG, "generate fake packageName[" + str + "]");
        return str;
    }

    private final C5337k t8r(String str) {
        try {
            return (C5337k) com.xiaomi.ad.entity.util.zy.zy(C5337k.class, str, TAG);
        } catch (Exception e2) {
            C7683q.m28055n(TAG, "parse DownloadInfo e : ", e2);
            return null;
        }
    }

    private final toq zurt(String str) {
        try {
            return (toq) com.xiaomi.ad.entity.util.zy.zy(toq.class, str, TAG);
        } catch (Exception e2) {
            C7683q.m28055n(TAG, "parse MiniCardConfig e : ", e2);
            return null;
        }
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void fu4(String str) {
        this.mPackageName = str;
    }

    public C5337k getDownloadInfo() {
        return this.mDownloadInfo;
    }

    public toq getMiniCardConfig() {
        return this.mMiniCardConfig;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    /* JADX INFO: renamed from: h */
    public boolean m18163h() {
        return this.f29814s;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action
    /* JADX INFO: renamed from: k */
    protected int mo18157k() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public IDownloadListener mo18158y(IBinder iBinder) {
        return IDownloadListener.Stub.asInterface(iBinder);
    }

    /* JADX INFO: renamed from: p */
    public int m18164p() {
        return this.f29815y;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.action.Action, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.mPackageName);
        parcel.writeInt(this.f29815y);
        parcel.writeInt(m18156g(this.f29814s));
        parcel.writeInt(m18156g(this.f29813p));
        parcel.writeString(this.mMiniCardConfig.serialize());
        parcel.writeString(this.mDownloadInfo.serialize());
    }

    public boolean x2() {
        return this.f29813p;
    }

    public DownloadAction(Action<IDownloadListener>.C5336k c5336k, IDownloadListener iDownloadListener, boolean z2, String str, int i2, boolean z3, boolean z5, toq toqVar, C5337k c5337k) {
        super(c5336k, iDownloadListener, z2);
        if (toqVar == null || c5337k == null) {
            C7683q.m28057q(TAG, "config info can't be null");
        }
        this.mPackageName = str;
        this.f29815y = i2;
        this.f29814s = z3;
        this.f29813p = z5;
        this.mMiniCardConfig = toqVar;
        this.mDownloadInfo = c5337k;
    }
}
