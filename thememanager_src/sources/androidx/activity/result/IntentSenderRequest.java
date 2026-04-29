package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @lvui
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    private final int f123k;

    @dd
    private final Intent mFillInIntent;

    @lvui
    private final IntentSender mIntentSender;

    /* JADX INFO: renamed from: q */
    private final int f124q;

    IntentSenderRequest(@lvui IntentSender intentSender, @dd Intent intent, int i2, int i3) {
        this.mIntentSender = intentSender;
        this.mFillInIntent = intent;
        this.f123k = i2;
        this.f124q = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @dd
    public Intent getFillInIntent() {
        return this.mFillInIntent;
    }

    @lvui
    public IntentSender getIntentSender() {
        return this.mIntentSender;
    }

    /* JADX INFO: renamed from: k */
    public int m33k() {
        return this.f123k;
    }

    public int toq() {
        return this.f124q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeParcelable(this.mIntentSender, i2);
        parcel.writeParcelable(this.mFillInIntent, i2);
        parcel.writeInt(this.f123k);
        parcel.writeInt(this.f124q);
    }

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$k */
    public static final class C0058k {

        /* JADX INFO: renamed from: k */
        private IntentSender f125k;

        /* JADX INFO: renamed from: q */
        private int f126q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Intent f46466toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f46467zy;

        public C0058k(@lvui IntentSender intentSender) {
            this.f125k = intentSender;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public IntentSenderRequest m35k() {
            return new IntentSenderRequest(this.f125k, this.f46466toq, this.f46467zy, this.f126q);
        }

        @lvui
        public C0058k toq(@dd Intent intent) {
            this.f46466toq = intent;
            return this;
        }

        @lvui
        public C0058k zy(int i2, int i3) {
            this.f126q = i2;
            this.f46467zy = i3;
            return this;
        }

        public C0058k(@lvui PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    IntentSenderRequest(@lvui Parcel parcel) {
        this.mIntentSender = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.mFillInIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f123k = parcel.readInt();
        this.f124q = parcel.readInt();
    }
}
