package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.was;
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i2) {
            return new TextInformationFrame[i2];
        }
    };

    /* JADX INFO: renamed from: n */
    public final String f20818n;

    /* JADX INFO: renamed from: q */
    @dd
    public final String f20819q;

    public TextInformationFrame(String str, @dd String str2, String str3) {
        super(str);
        this.f20819q = str2;
        this.f20818n = str3;
    }

    /* JADX INFO: renamed from: k */
    private static List<Integer> m12306k(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return lrht.zy(this.f20804k, textInformationFrame.f20804k) && lrht.zy(this.f20819q, textInformationFrame.f20819q) && lrht.zy(this.f20818n, textInformationFrame.f20818n);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f20804k.hashCode()) * 31;
        String str = this.f20819q;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20818n;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void qrj(was.toq toqVar) {
        String str = this.f20804k;
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b2 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b2 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b2 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b2 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b2 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b2 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b2 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b2 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b2 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b2 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b2 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b2 = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b2 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b2 = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b2 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b2 = com.google.common.base.zy.f68119fu4;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b2 = com.google.common.base.zy.f25761z;
                }
                break;
        }
        try {
            switch (b2) {
                case 0:
                case 10:
                    toqVar.lvui(this.f20818n);
                    break;
                case 1:
                case 11:
                    toqVar.n5r1(this.f20818n);
                    break;
                case 2:
                case 12:
                    toqVar.m13901m(Integer.valueOf(Integer.parseInt(this.f20818n.substring(2, 4)))).m13902o(Integer.valueOf(Integer.parseInt(this.f20818n.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    toqVar.m13903r(this.f20818n);
                    break;
                case 4:
                case 18:
                    toqVar.d2ok(this.f20818n);
                    break;
                case 5:
                case 19:
                    toqVar.hyr(this.f20818n);
                    break;
                case 6:
                case 20:
                    String[] strArrMbx = lrht.mbx(this.f20818n, "/");
                    toqVar.m13904x(Integer.valueOf(Integer.parseInt(strArrMbx[0]))).zp(strArrMbx.length > 1 ? Integer.valueOf(Integer.parseInt(strArrMbx[1])) : null);
                    break;
                case 7:
                case 16:
                    toqVar.a98o(this.f20818n);
                    break;
                case 8:
                case 15:
                    toqVar.nmn5(this.f20818n);
                    break;
                case 9:
                case 21:
                    toqVar.ek5k(Integer.valueOf(Integer.parseInt(this.f20818n)));
                    break;
                case 13:
                    List<Integer> listM12306k = m12306k(this.f20818n);
                    int size = listM12306k.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                toqVar.m13902o(listM12306k.get(2));
                            }
                        }
                        toqVar.m13901m(listM12306k.get(1));
                    }
                    toqVar.ek5k(listM12306k.get(0));
                    break;
                case 14:
                    List<Integer> listM12306k2 = m12306k(this.f20818n);
                    int size2 = listM12306k2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                toqVar.yz(listM12306k2.get(2));
                            }
                        }
                        toqVar.y9n(listM12306k2.get(1));
                    }
                    toqVar.m13895b(listM12306k2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20819q;
        String str3 = this.f20818n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20804k);
        parcel.writeString(this.f20819q);
        parcel.writeString(this.f20818n);
    }

    TextInformationFrame(Parcel parcel) {
        super((String) lrht.ld6(parcel.readString()));
        this.f20819q = parcel.readString();
        this.f20818n = (String) lrht.ld6(parcel.readString());
    }
}
