package com.xiaomi.accountsdk.account.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.accountsdk.request.wvg;

/* JADX INFO: loaded from: classes3.dex */
public class Step1LoginContext implements Parcelable {
    public static final Parcelable.Creator<Step1LoginContext> CREATOR = new Parcelable.Creator<Step1LoginContext>() { // from class: com.xiaomi.accountsdk.account.data.Step1LoginContext.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Step1LoginContext createFromParcel(Parcel parcel) {
            return new Step1LoginContext(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Step1LoginContext[] newArray(int i2) {
            return new Step1LoginContext[i2];
        }
    };
    private InterfaceC5471k mLoginContext;
    private EnumC5473q mNextStep;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.Step1LoginContext$k */
    public interface InterfaceC5471k {
        /* JADX INFO: renamed from: k */
        String mo18647k();
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.Step1LoginContext$n */
    public static class C5472n implements InterfaceC5471k {

        /* JADX INFO: renamed from: k */
        public String f30563k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public MetaLoginData f72609toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f72610zy;

        @Override // com.xiaomi.accountsdk.account.data.Step1LoginContext.InterfaceC5471k
        /* JADX INFO: renamed from: k */
        public String mo18647k() {
            return this.f30563k;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.Step1LoginContext$q */
    public enum EnumC5473q {
        NONE,
        NOTIFICATION,
        VERIFICATION
    }

    public static class toq implements InterfaceC5471k {

        /* JADX INFO: renamed from: k */
        public AccountInfo f30565k;

        @Override // com.xiaomi.accountsdk.account.data.Step1LoginContext.InterfaceC5471k
        /* JADX INFO: renamed from: k */
        public String mo18647k() {
            return this.f30565k.getUserId();
        }
    }

    public static class zy implements InterfaceC5471k {

        /* JADX INFO: renamed from: k */
        public String f30566k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f72611toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public wvg.C5555y f72612zy;

        @Override // com.xiaomi.accountsdk.account.data.Step1LoginContext.InterfaceC5471k
        /* JADX INFO: renamed from: k */
        public String mo18647k() {
            return this.f30566k;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InterfaceC5471k getLoginContext() {
        return this.mLoginContext;
    }

    public EnumC5473q getNextStep() {
        return this.mNextStep;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.mNextStep.name());
        EnumC5473q enumC5473q = this.mNextStep;
        if (enumC5473q == EnumC5473q.NOTIFICATION) {
            zy zyVar = (zy) this.mLoginContext;
            parcel.writeString(zyVar.f30566k);
            parcel.writeString(zyVar.f72611toq);
            parcel.writeString(zyVar.f72612zy.m19020s());
            return;
        }
        if (enumC5473q != EnumC5473q.VERIFICATION) {
            if (enumC5473q == EnumC5473q.NONE) {
                parcel.writeParcelable(((toq) this.mLoginContext).f30565k, i2);
            }
        } else {
            C5472n c5472n = (C5472n) this.mLoginContext;
            parcel.writeString(c5472n.f30563k);
            parcel.writeString(c5472n.f72609toq.f30443k);
            parcel.writeString(c5472n.f72609toq.f30445q);
            parcel.writeString(c5472n.f72609toq.f30444n);
            parcel.writeString(c5472n.f72610zy);
        }
    }

    public Step1LoginContext(AccountInfo accountInfo) {
        this.mNextStep = EnumC5473q.NONE;
        toq toqVar = new toq();
        toqVar.f30565k = accountInfo;
        this.mLoginContext = toqVar;
    }

    public Step1LoginContext(Exception exc) {
        if (exc instanceof p039w.kja0) {
            p039w.kja0 kja0Var = (p039w.kja0) exc;
            this.mNextStep = EnumC5473q.NOTIFICATION;
            zy zyVar = new zy();
            zyVar.f30566k = kja0Var.getUserId();
            zyVar.f72611toq = kja0Var.getNotificationUrl();
            zyVar.f72612zy = kja0Var.getLoginContent();
            this.mLoginContext = zyVar;
            return;
        }
        if (exc instanceof p039w.cdj) {
            p039w.cdj cdjVar = (p039w.cdj) exc;
            this.mNextStep = EnumC5473q.VERIFICATION;
            C5472n c5472n = new C5472n();
            c5472n.f30563k = cdjVar.getUserId();
            c5472n.f72609toq = cdjVar.getMetaLoginData();
            c5472n.f72610zy = cdjVar.getStep1Token();
            this.mLoginContext = c5472n;
            return;
        }
        throw new IllegalArgumentException("Exception type " + exc.getClass().getName() + " not supported. ");
    }

    private Step1LoginContext(Parcel parcel) {
        EnumC5473q enumC5473qValueOf = EnumC5473q.valueOf(parcel.readString());
        this.mNextStep = enumC5473qValueOf;
        if (enumC5473qValueOf == EnumC5473q.NOTIFICATION) {
            zy zyVar = new zy();
            zyVar.f30566k = parcel.readString();
            zyVar.f72611toq = parcel.readString();
            zyVar.f72612zy = new wvg.C5555y(parcel.readString());
            this.mLoginContext = zyVar;
            return;
        }
        if (enumC5473qValueOf == EnumC5473q.VERIFICATION) {
            C5472n c5472n = new C5472n();
            c5472n.f30563k = parcel.readString();
            c5472n.f72609toq = new MetaLoginData(parcel.readString(), parcel.readString(), parcel.readString());
            c5472n.f72610zy = parcel.readString();
            this.mLoginContext = c5472n;
            return;
        }
        if (enumC5473qValueOf == EnumC5473q.NONE) {
            toq toqVar = new toq();
            toqVar.f30565k = (AccountInfo) parcel.readParcelable(getClass().getClassLoader());
            this.mLoginContext = toqVar;
        }
    }
}
