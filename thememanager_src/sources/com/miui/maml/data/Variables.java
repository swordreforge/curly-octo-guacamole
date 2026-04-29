package com.miui.maml.data;

import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Variables {
    private static final String LOG_TAG = "Variables";
    public static final int MAX_ARRAY_SIZE = 10000;
    public static final int VARIABLE_TYPE_HIGH_PRIORITY = 1;
    public static final int VARIABLE_TYPE_NORMAL = 0;
    private DoubleBucket mDoubleBucket;
    private VarBucket<Object> mObjectBucket;

    private static abstract class BaseVarBucket {
        private HashMap<String, Integer> mIndices;
        private int mNextIndex;

        private BaseVarBucket() {
            this.mIndices = new HashMap<>();
            this.mNextIndex = 0;
        }

        public boolean exists(String str) {
            return this.mIndices.containsKey(str);
        }

        protected abstract void onAddItem(int i2);

        public synchronized int registerVariable(String str) {
            Integer numValueOf;
            numValueOf = this.mIndices.get(str);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.mNextIndex);
                this.mIndices.put(str, numValueOf);
                onAddItem(this.mNextIndex);
            }
            int iIntValue = numValueOf.intValue();
            int i2 = this.mNextIndex;
            if (iIntValue == i2) {
                this.mNextIndex = i2 + 1;
            }
            MamlLog.m17850d(Variables.LOG_TAG, "registerVariable: " + str + "  index:" + numValueOf);
            return numValueOf.intValue();
        }
    }

    private static class DoubleBucket extends BaseVarBucket {
        private ArrayList<DoubleInfo> mArray;

        private DoubleBucket() {
            super();
            this.mArray = new ArrayList<>();
        }

        public final synchronized boolean exists(int i2) {
            boolean z2;
            z2 = false;
            if (i2 >= 0) {
                try {
                    if (this.mArray.get(i2) != null) {
                        z2 = true;
                    }
                } catch (IndexOutOfBoundsException unused) {
                    return false;
                }
            }
            return z2;
        }

        public synchronized double get(int i2) {
            double d2;
            d2 = 0.0d;
            try {
                DoubleInfo doubleInfo = this.mArray.get(i2);
                if (doubleInfo != null) {
                    d2 = doubleInfo.mValue;
                }
            } catch (IndexOutOfBoundsException unused) {
                return 0.0d;
            }
            return d2;
        }

        public synchronized int getVer(int i2) {
            int i3;
            i3 = -1;
            try {
                DoubleInfo doubleInfo = this.mArray.get(i2);
                if (doubleInfo != null) {
                    i3 = doubleInfo.mVersion;
                }
            } catch (IndexOutOfBoundsException unused) {
                return -1;
            }
            return i3;
        }

        @Override // com.miui.maml.data.Variables.BaseVarBucket
        protected void onAddItem(int i2) {
            while (this.mArray.size() <= i2) {
                this.mArray.add(null);
            }
        }

        public final synchronized void put(int i2, double d2, int i3) {
            if (i2 < 0) {
                return;
            }
            try {
                DoubleInfo doubleInfo = this.mArray.get(i2);
                if (doubleInfo == null) {
                    this.mArray.set(i2, new DoubleInfo(d2, 0, i3));
                } else {
                    doubleInfo.setValue(d2, i3);
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }

        public void reset() {
            int size = this.mArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                DoubleInfo doubleInfo = this.mArray.get(i2);
                if (doubleInfo != null) {
                    doubleInfo.setValue(0.0d);
                }
            }
        }
    }

    private static class DoubleInfo {
        double mValue;
        int mVarType;
        int mVersion;

        public DoubleInfo(double d2, int i2, int i3) {
            this.mValue = d2;
            this.mVersion = i2;
            this.mVarType = i3 != 1 ? 0 : 1;
        }

        public void setValue(double d2) {
            setValue(d2, 0);
        }

        public void setValue(double d2, int i2) {
            if (i2 > this.mVarType) {
                this.mVarType = i2;
            }
            if (i2 == this.mVarType) {
                this.mValue = d2;
                this.mVersion++;
            }
        }
    }

    private static class ValueInfo<T> {
        T mValue;
        int mVarType;
        int mVersion;

        public ValueInfo(T t2, int i2, int i3) {
            this.mValue = t2;
            this.mVersion = i2;
            this.mVarType = i3 != 1 ? 0 : 1;
        }

        public void reset() {
            T t2 = this.mValue;
            int i2 = 0;
            if (t2 instanceof double[]) {
                double[] dArr = (double[]) t2;
                while (i2 < dArr.length) {
                    dArr[i2] = 0.0d;
                    i2++;
                }
                return;
            }
            if (t2 instanceof float[]) {
                float[] fArr = (float[]) t2;
                while (i2 < fArr.length) {
                    fArr[i2] = 0.0f;
                    i2++;
                }
                return;
            }
            if (t2 instanceof int[]) {
                int[] iArr = (int[]) t2;
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    iArr[i3] = 0;
                }
                return;
            }
            if (!(t2 instanceof Object[])) {
                setValue(null);
                return;
            }
            Object[] objArr = (Object[]) t2;
            while (i2 < objArr.length) {
                objArr[i2] = null;
                i2++;
            }
        }

        public void setValue(T t2) {
            setValue(t2, 0);
        }

        public void setValue(T t2, int i2) {
            if (i2 > this.mVarType) {
                this.mVarType = i2;
            }
            if (i2 == this.mVarType) {
                this.mValue = t2;
                this.mVersion++;
            }
        }
    }

    private static class VarBucket<T> extends BaseVarBucket {
        private ArrayList<ValueInfo<T>> mArray;

        private VarBucket() {
            super();
            this.mArray = new ArrayList<>();
        }

        public synchronized T get(int i2) {
            T t2;
            t2 = null;
            try {
                ValueInfo<T> valueInfo = this.mArray.get(i2);
                if (valueInfo != null) {
                    t2 = valueInfo.mValue;
                }
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
            return t2;
        }

        public synchronized int getVer(int i2) {
            int i3;
            i3 = -1;
            try {
                ValueInfo<T> valueInfo = this.mArray.get(i2);
                if (valueInfo != null) {
                    i3 = valueInfo.mVersion;
                }
            } catch (IndexOutOfBoundsException unused) {
                return -1;
            }
            return i3;
        }

        @Override // com.miui.maml.data.Variables.BaseVarBucket
        protected void onAddItem(int i2) {
            while (this.mArray.size() <= i2) {
                this.mArray.add(null);
            }
        }

        public final synchronized void put(int i2, T t2, int i3) {
            if (i2 < 0) {
                return;
            }
            try {
                ValueInfo<T> valueInfo = this.mArray.get(i2);
                if (valueInfo == null) {
                    this.mArray.set(i2, new ValueInfo<>(t2, 0, i3));
                } else {
                    valueInfo.setValue(t2, i3);
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }

        public void reset() {
            int size = this.mArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                ValueInfo<T> valueInfo = this.mArray.get(i2);
                if (valueInfo != null) {
                    valueInfo.reset();
                }
            }
        }
    }

    public Variables() {
        this.mDoubleBucket = new DoubleBucket();
        this.mObjectBucket = new VarBucket<>();
    }

    private static void dbglog(String str) {
        MamlLog.m17850d(LOG_TAG, str);
    }

    private <T> T getArrInner(int i2, int i3) {
        try {
            Object[] objArr = (Object[]) get(i2);
            if (objArr == null) {
                dbglog("getArrInner: designated object is not an array. index:" + i2);
                return null;
            }
            if (isIndexValid(objArr, i3)) {
                return (T) objArr[i3];
            }
            dbglog("getArrInner: designated array index is invalid. index:" + i2 + " arrIndex:" + i3);
            return null;
        } catch (ClassCastException unused) {
            dbglog("getArrInner: designated object type is not correct. index:" + i2);
            return null;
        } catch (IndexOutOfBoundsException unused2) {
            dbglog("getArrInner: designated index is invalid. index:" + i2 + " arrIndex:" + i3);
            return null;
        }
    }

    private static boolean isIndexValid(Object obj, int i2) {
        if (i2 >= 0) {
            try {
                if (i2 < Array.getLength(obj)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean putValueToArr(Object obj, int i2, double d2) {
        if (!isIndexValid(obj, i2)) {
            dbglog(" designated array index is invalid. arrIndex:" + i2);
            return false;
        }
        if (obj instanceof double[]) {
            ((double[]) obj)[i2] = d2;
        } else if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) d2;
        } else if (obj instanceof char[]) {
            ((char[]) obj)[i2] = (char) d2;
        } else if (obj instanceof float[]) {
            ((float[]) obj)[i2] = (float) d2;
        } else if (obj instanceof int[]) {
            ((int[]) obj)[i2] = (int) d2;
        } else if (obj instanceof long[]) {
            ((long[]) obj)[i2] = (long) d2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) d2;
        } else if (obj instanceof boolean[]) {
            ((boolean[]) obj)[i2] = d2 > 0.0d;
        }
        return true;
    }

    public boolean createArray(String str, int i2, Class<?> cls) {
        if (cls != null && i2 > 0 && i2 <= 10000) {
            int iRegisterVariable = registerVariable(str);
            if (get(iRegisterVariable) == null) {
                try {
                    put(iRegisterVariable, Array.newInstance(cls, i2));
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
        MamlLog.m17854w(LOG_TAG, "createArray failed: name= " + str + "  size=" + i2);
        return false;
    }

    public boolean existsArrItem(int i2, int i3) {
        Object obj = get(i2);
        if (obj == null || i3 < 0) {
            return false;
        }
        try {
            return i3 < Array.getLength(obj);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public boolean existsDouble(String str) {
        return this.mDoubleBucket.exists(str);
    }

    public boolean existsObj(String str) {
        return this.mObjectBucket.exists(str);
    }

    public Object get(String str) {
        return get(registerVariable(str));
    }

    public Object getArr(int i2, int i3) {
        return getArrInner(i2, i3);
    }

    public double getArrDouble(int i2, int i3) {
        try {
            Object obj = get(i2);
            if (obj == null) {
                dbglog("getArrDouble: designated array does not exist. index:" + i2);
            } else {
                if (isIndexValid(obj, i3)) {
                    return obj instanceof boolean[] ? ((boolean[]) obj)[i3] ? 1.0d : 0.0d : Array.getDouble(obj, i3);
                }
                dbglog("getArrDouble: designated index is invalid. index:" + i2 + " arrIndex:" + i3);
            }
        } catch (Exception unused) {
            dbglog("getArrDouble: designated index is invalid. index:" + i2 + " arrIndex:" + i3);
        }
        return 0.0d;
    }

    public String getArrString(int i2, int i3) {
        return (String) getArrInner(i2, i3);
    }

    public double getDouble(int i2) {
        return this.mDoubleBucket.get(i2);
    }

    public String getString(int i2) {
        try {
            return (String) get(i2);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public int getVer(int i2, boolean z2) {
        return z2 ? this.mDoubleBucket.getVer(i2) : this.mObjectBucket.getVer(i2);
    }

    public final void put(String str, double d2) {
        put(registerDoubleVariable(str), d2);
    }

    public boolean putArr(int i2, int i3, Object obj) {
        try {
            Object[] objArr = (Object[]) get(i2);
            if (objArr == null) {
                dbglog("putArr: designated array does not exist. index:" + i2);
                return false;
            }
            if (isIndexValid(objArr, i3)) {
                objArr[i3] = obj;
                put(i2, objArr);
                return true;
            }
            dbglog("putArr: designated array index is invalid. index:" + i2 + " arrIndex:" + i3);
            return false;
        } catch (ClassCastException unused) {
            dbglog("putArr: designated object is not an object array. index:" + i2);
            return false;
        } catch (IndexOutOfBoundsException unused2) {
            dbglog("putArr: designated array index is invalid. index:" + i2 + " arrIndex:" + i3);
            return false;
        }
    }

    public boolean putArrDouble(int i2, int i3, Object obj) {
        if (obj instanceof Number) {
            return putArr(i2, i3, ((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return false;
        }
        try {
            return putArr(i2, i3, Utils.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean putDouble(int i2, Object obj) {
        if (obj instanceof Number) {
            put(i2, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof Boolean) {
            put(i2, ((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        try {
            put(i2, Double.parseDouble((String) obj));
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Deprecated
    public final void putNum(String str, double d2) {
        put(str, d2);
    }

    public int registerDoubleVariable(String str) {
        return this.mDoubleBucket.registerVariable(str);
    }

    public int registerVariable(String str) {
        return this.mObjectBucket.registerVariable(str);
    }

    public void reset() {
        this.mDoubleBucket.reset();
        this.mObjectBucket.reset();
    }

    public boolean existsDouble(int i2) {
        return this.mDoubleBucket.exists(i2);
    }

    public Object get(int i2) {
        return this.mObjectBucket.get(i2);
    }

    public double getDouble(String str) {
        return getDouble(registerDoubleVariable(str));
    }

    public String getString(String str) {
        return getString(registerVariable(str));
    }

    public final void put(String str, double d2, int i2) {
        this.mDoubleBucket.put(registerDoubleVariable(str), d2, i2);
    }

    public final void put(int i2, double d2) {
        this.mDoubleBucket.put(i2, d2, 0);
    }

    public void put(String str, Object obj) {
        put(registerVariable(str), obj);
    }

    public final void put(String str, Object obj, int i2) {
        this.mObjectBucket.put(registerVariable(str), obj, i2);
    }

    public final void put(int i2, Object obj) {
        this.mObjectBucket.put(i2, obj, 0);
    }

    public boolean putArr(int i2, int i3, double d2) {
        Object obj = get(i2);
        if (obj == null) {
            dbglog("putArr: designated array does not exist. index:" + i2);
            return false;
        }
        if (!putValueToArr(obj, i3, d2)) {
            return false;
        }
        put(i2, obj);
        return true;
    }
}
