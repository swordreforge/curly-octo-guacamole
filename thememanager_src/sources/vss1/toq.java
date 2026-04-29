package vss1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: RecyclerViewHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {
    private toq() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static <T> void m28118k(List<T> list, int i2, int i3, int i4) {
        int i5;
        boolean z2 = i2 < i3;
        if (i4 == 1) {
            Object obj = list.get(i2);
            if (z2) {
                while (i2 < i3) {
                    int i6 = i2 + 1;
                    list.set(i2, list.get(i6));
                    i2 = i6;
                }
            } else {
                while (i2 > i3) {
                    list.set(i2, list.get(i2 - 1));
                    i2--;
                }
            }
            list.set(i3, obj);
            return;
        }
        ArrayList arrayList = new ArrayList(i4);
        int i7 = i2;
        while (true) {
            i5 = i2 + i4;
            if (i7 >= i5) {
                break;
            }
            arrayList.add(list.get(i7));
            i7++;
        }
        if (z2) {
            while (i2 < i3) {
                list.set(i2, list.get(i2 + i4));
                i2++;
            }
        } else {
            for (int i8 = i5 - 1; i8 >= i3 + i4; i8--) {
                list.set(i8, list.get(i8 - i4));
            }
        }
        for (int i9 = 0; i9 < i4; i9++) {
            list.set(i3 + i9, arrayList.get(i9));
        }
    }
}
