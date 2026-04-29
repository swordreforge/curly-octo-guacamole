package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: KeyCache.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    HashMap<Object, HashMap<String, float[]>> f1562k = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public float m987k(Object obj, String str, int i2) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.f1562k.containsKey(obj) && (map = this.f1562k.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i2) {
            return fArr[i2];
        }
        return Float.NaN;
    }

    public void toq(Object obj, String str, int i2, float f2) {
        if (!this.f1562k.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i2 + 1];
            fArr[i2] = f2;
            map.put(str, fArr);
            this.f1562k.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.f1562k.get(obj);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i2 + 1];
            fArr2[i2] = f2;
            map2.put(str, fArr2);
            this.f1562k.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i2) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i2 + 1);
        }
        fArrCopyOf[i2] = f2;
        map2.put(str, fArrCopyOf);
    }
}
