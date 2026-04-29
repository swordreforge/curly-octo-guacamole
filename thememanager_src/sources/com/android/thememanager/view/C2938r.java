package com.android.thememanager.view;

import com.android.thememanager.model.LargeIconElement;
import java.util.Objects;
import p001b.InterfaceC1356n;

/* JADX INFO: renamed from: com.android.thememanager.view.r */
/* JADX INFO: compiled from: SelectedElement.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2938r {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f61537f7l8 = 4;

    /* JADX INFO: renamed from: g */
    public static final int f17673g = 3;

    /* JADX INFO: renamed from: n */
    public static final int f17674n = 2;

    /* JADX INFO: renamed from: q */
    public static final int f17675q = 1;

    /* JADX INFO: renamed from: k */
    public int f17676k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f61538toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public LargeIconElement f61539zy;

    public C2938r(int type, LargeIconElement element) {
        this.f17676k = type;
        this.f61539zy = element;
    }

    /* JADX INFO: renamed from: k */
    public static int m10421k(String size) {
        if (size == null) {
            return -1;
        }
        switch (size) {
            case "1x1":
                return 1;
            case "1x2":
                return 3;
            case "2x1":
                return 2;
            case "2x2":
                return 4;
            default:
                return -1;
        }
    }

    public static String toq(int type) {
        if (type == 1) {
            return InterfaceC1356n.f7200k;
        }
        if (type == 2) {
            return InterfaceC1356n.f53838toq;
        }
        if (type == 3) {
            return InterfaceC1356n.f53839zy;
        }
        if (type != 4) {
            return null;
        }
        return InterfaceC1356n.f7201q;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        C2938r c2938r = (C2938r) o2;
        return this.f17676k == c2938r.f17676k && this.f61538toq == c2938r.f61538toq && Objects.equals(this.f61539zy, c2938r.f61539zy);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17676k), Integer.valueOf(this.f61538toq), this.f61539zy);
    }
}
