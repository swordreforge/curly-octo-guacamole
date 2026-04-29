package com.android.thememanager.settings.superwallpaper.activity.data;

import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.android.thememanager.model.SuperWallpaperBanner;

/* JADX INFO: loaded from: classes2.dex */
public class SuperWallpaperSummaryData implements Parcelable {
    public static final Parcelable.Creator<SuperWallpaperSummaryData> CREATOR = new Parcelable.Creator<SuperWallpaperSummaryData>() { // from class: com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SuperWallpaperSummaryData createFromParcel(Parcel in) {
            return new SuperWallpaperSummaryData(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SuperWallpaperSummaryData[] newArray(int size) {
            return new SuperWallpaperSummaryData[size];
        }
    };

    /* JADX INFO: renamed from: b */
    public String f15591b;

    /* JADX INFO: renamed from: c */
    public Pair<Integer, Integer> f15592c;

    /* JADX INFO: renamed from: e */
    public boolean f15593e;

    /* JADX INFO: renamed from: f */
    public SuperWallpaperLandData f15594f;

    /* JADX INFO: renamed from: g */
    public float f15595g;

    /* JADX INFO: renamed from: h */
    public String f15596h;

    /* JADX INFO: renamed from: i */
    public String f15597i;

    /* JADX INFO: renamed from: j */
    public String f15598j;

    /* JADX INFO: renamed from: k */
    public int f15599k;

    /* JADX INFO: renamed from: l */
    public boolean f15600l;

    /* JADX INFO: renamed from: m */
    public String f15601m;

    /* JADX INFO: renamed from: n */
    public float f15602n;

    /* JADX INFO: renamed from: o */
    public String f15603o;

    /* JADX INFO: renamed from: p */
    public String f15604p;

    /* JADX INFO: renamed from: q */
    public float f15605q;

    /* JADX INFO: renamed from: r */
    public boolean f15606r;

    /* JADX INFO: renamed from: s */
    public String f15607s;

    /* JADX INFO: renamed from: t */
    public Icon f15608t;

    /* JADX INFO: renamed from: y */
    public float f15609y;

    /* JADX INFO: renamed from: z */
    public String f15610z;

    public static class SuperWallpaperLandData implements Parcelable {
        public static final Parcelable.Creator<SuperWallpaperLandData> CREATOR = new Parcelable.Creator<SuperWallpaperLandData>() { // from class: com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData.SuperWallpaperLandData.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SuperWallpaperLandData createFromParcel(Parcel in) {
                return new SuperWallpaperLandData(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SuperWallpaperLandData[] newArray(int size) {
                return new SuperWallpaperLandData[size];
            }
        };

        /* JADX INFO: renamed from: g */
        public Icon f15611g;

        /* JADX INFO: renamed from: h */
        public Icon f15612h;

        /* JADX INFO: renamed from: i */
        public Icon f15613i;

        /* JADX INFO: renamed from: k */
        public Icon[] f15614k;

        /* JADX INFO: renamed from: n */
        public LandPositionData[] f15615n;

        /* JADX INFO: renamed from: p */
        public Icon f15616p;

        /* JADX INFO: renamed from: q */
        public Icon[] f15617q;

        /* JADX INFO: renamed from: s */
        public Icon f15618s;

        /* JADX INFO: renamed from: y */
        public Icon f15619y;

        public static class LandPositionData implements Parcelable {
            public static final Parcelable.Creator<LandPositionData> CREATOR = new Parcelable.Creator<LandPositionData>() { // from class: com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public LandPositionData createFromParcel(Parcel in) {
                    return new LandPositionData(in);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
                public LandPositionData[] newArray(int size) {
                    return new LandPositionData[size];
                }
            };

            /* JADX INFO: renamed from: g */
            public String f15620g;

            /* JADX INFO: renamed from: k */
            public String f15621k;

            /* JADX INFO: renamed from: n */
            public String f15622n;

            /* JADX INFO: renamed from: q */
            public String f15623q;

            /* JADX INFO: renamed from: y */
            public String f15624y;

            public LandPositionData() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.f15621k);
                dest.writeString(this.f15623q);
                dest.writeString(this.f15622n);
                dest.writeString(this.f15620g);
                dest.writeString(this.f15624y);
            }

            protected LandPositionData(Parcel in) {
                this.f15621k = in.readString();
                this.f15623q = in.readString();
                this.f15622n = in.readString();
                this.f15620g = in.readString();
                this.f15624y = in.readString();
            }
        }

        public SuperWallpaperLandData() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeTypedArray(this.f15614k, flags);
            dest.writeTypedArray(this.f15617q, flags);
            dest.writeTypedArray(this.f15615n, flags);
            dest.writeParcelable(this.f15611g, flags);
            dest.writeParcelable(this.f15619y, flags);
            dest.writeParcelable(this.f15618s, flags);
            dest.writeParcelable(this.f15616p, flags);
        }

        protected SuperWallpaperLandData(Parcel in) {
            this.f15614k = (Icon[]) in.createTypedArray(Icon.CREATOR);
            this.f15617q = (Icon[]) in.createTypedArray(Icon.CREATOR);
            this.f15615n = (LandPositionData[]) in.createTypedArray(LandPositionData.CREATOR);
            this.f15611g = (Icon) in.readParcelable(Icon.class.getClassLoader());
            this.f15619y = (Icon) in.readParcelable(Icon.class.getClassLoader());
            this.f15618s = (Icon) in.readParcelable(Icon.class.getClassLoader());
            this.f15616p = (Icon) in.readParcelable(Icon.class.getClassLoader());
        }
    }

    public SuperWallpaperSummaryData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f15599k);
        parcel.writeFloat(this.f15605q);
        parcel.writeFloat(this.f15602n);
        parcel.writeFloat(this.f15595g);
        parcel.writeFloat(this.f15609y);
        parcel.writeString(this.f15607s);
        parcel.writeString(this.f15604p);
        parcel.writeString(this.f15596h);
        parcel.writeString(this.f15597i);
        parcel.writeString(this.f15610z);
        parcel.writeParcelable(this.f15608t, i2);
        parcel.writeByte(this.f15606r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15600l ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f15594f, i2);
    }

    public SuperWallpaperSummaryData(SuperWallpaperBanner banner) {
        this.f15607s = banner.id;
        this.f15604p = banner.title;
        this.f15596h = banner.summary;
    }

    protected SuperWallpaperSummaryData(Parcel in) {
        this.f15599k = in.readInt();
        this.f15605q = in.readFloat();
        this.f15602n = in.readFloat();
        this.f15595g = in.readFloat();
        this.f15609y = in.readFloat();
        this.f15607s = in.readString();
        this.f15604p = in.readString();
        this.f15596h = in.readString();
        this.f15597i = in.readString();
        this.f15610z = in.readString();
        this.f15608t = (Icon) in.readParcelable(Icon.class.getClassLoader());
        this.f15606r = in.readByte() != 0;
        this.f15600l = in.readByte() != 0;
        this.f15594f = (SuperWallpaperLandData) in.readParcelable(SuperWallpaperLandData.class.getClassLoader());
    }
}
