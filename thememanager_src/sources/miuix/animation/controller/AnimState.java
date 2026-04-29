package miuix.animation.controller;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.ISpecificProperty;
import miuix.animation.property.IntValueProperty;
import miuix.animation.property.ValueProperty;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.ObjectPool;

/* JADX INFO: loaded from: classes3.dex */
public class AnimState {
    public static final long FLAG_IN_TOUCH = 4;
    public static final long FLAG_PARALLEL = 2;
    public static final long FLAG_QUEUE = 1;
    private static final int STEP = 100;
    private static final String TAG = "TAG_";
    public static final int VIEW_POS = 1000100;
    public static final int VIEW_SIZE = 1000000;
    private static final AtomicInteger sId = new AtomicInteger();
    public long flags;
    public final boolean isTemporary;
    private final AnimConfig mConfig;
    private final Map<Object, Double> mMap;
    private volatile Object mTag;
    IntValueProperty tempIntValueProperty;
    ValueProperty tempValueProperty;

    public AnimState() {
        this(null, false);
    }

    public static void alignState(AnimState animState, Collection<UpdateInfo> collection) {
        for (UpdateInfo updateInfo : collection) {
            if (!animState.contains(updateInfo.property)) {
                if (updateInfo.useInt) {
                    animState.add(updateInfo.property, (int) updateInfo.animInfo.startValue);
                } else {
                    animState.add(updateInfo.property, (float) updateInfo.animInfo.startValue);
                }
            }
        }
        List list = (List) ObjectPool.acquire(ArrayList.class, new Object[0]);
        for (Object obj : animState.keySet()) {
            if ((obj instanceof FloatProperty ? UpdateInfo.findBy(collection, (FloatProperty) obj) : UpdateInfo.findByName(collection, (String) obj)) == null) {
                list.add(obj);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            animState.remove(it.next());
        }
        ObjectPool.release(list);
    }

    private void append(AnimState animState) {
        this.mConfig.copy(animState.mConfig);
        this.mMap.clear();
        this.mMap.putAll(animState.mMap);
    }

    private Double getMapValue(Object obj) {
        Double d2 = this.mMap.get(obj);
        return (d2 == null && (obj instanceof FloatProperty)) ? this.mMap.get(((FloatProperty) obj).getName()) : d2;
    }

    private double getProperValue(IAnimTarget iAnimTarget, FloatProperty floatProperty, double d2) {
        long configFlags = getConfigFlags(floatProperty);
        boolean zHasFlags = CommonUtils.hasFlags(configFlags, 1L);
        if (!zHasFlags && d2 != 1000000.0d && d2 != 1000100.0d && !(floatProperty instanceof ISpecificProperty)) {
            return d2;
        }
        double value = AnimValueUtils.getValue(iAnimTarget, floatProperty, d2);
        if (!zHasFlags || AnimValueUtils.isInvalid(d2)) {
            return value;
        }
        setConfigFlag(floatProperty, configFlags & (-2));
        double d4 = value + d2;
        setMapValue(floatProperty, d4);
        return d4;
    }

    private void setMapValue(Object obj, double d2) {
        if (obj instanceof FloatProperty) {
            FloatProperty floatProperty = (FloatProperty) obj;
            if (this.mMap.containsKey(floatProperty.getName())) {
                this.mMap.put(floatProperty.getName(), Double.valueOf(d2));
                return;
            }
        }
        this.mMap.put(obj, Double.valueOf(d2));
    }

    public AnimState add(String str, float f2, long... jArr) {
        if (jArr.length > 0) {
            setConfigFlag(str, jArr[0]);
        }
        return add(str, f2);
    }

    public void clear() {
        this.mConfig.clear();
        this.mMap.clear();
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.mMap.containsKey(obj)) {
            return true;
        }
        if (obj instanceof FloatProperty) {
            return this.mMap.containsKey(((FloatProperty) obj).getName());
        }
        return false;
    }

    public double get(IAnimTarget iAnimTarget, FloatProperty floatProperty) {
        Double mapValue = getMapValue(floatProperty);
        if (mapValue != null) {
            return getProperValue(iAnimTarget, floatProperty, mapValue.doubleValue());
        }
        return Double.MAX_VALUE;
    }

    public AnimConfig getConfig() {
        return this.mConfig;
    }

    public long getConfigFlags(Object obj) {
        AnimSpecialConfig specialConfig = this.mConfig.getSpecialConfig(obj instanceof FloatProperty ? ((FloatProperty) obj).getName() : (String) obj);
        if (specialConfig != null) {
            return specialConfig.flags;
        }
        return 0L;
    }

    public float getFloat(FloatProperty floatProperty) {
        Double mapValue = getMapValue(floatProperty);
        if (mapValue != null) {
            return mapValue.floatValue();
        }
        return Float.MAX_VALUE;
    }

    public int getInt(IIntValueProperty iIntValueProperty) {
        Double mapValue = getMapValue(iIntValueProperty);
        if (mapValue != null) {
            return mapValue.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public FloatProperty getProperty(Object obj) {
        if (obj instanceof FloatProperty) {
            return (FloatProperty) obj;
        }
        String str = (String) obj;
        return CommonUtils.hasFlags(getConfigFlags(str), 4L) ? new IntValueProperty(str) : new ValueProperty(str);
    }

    public Object getTag() {
        return this.mTag;
    }

    public FloatProperty getTempProperty(Object obj) {
        if (obj instanceof FloatProperty) {
            return (FloatProperty) obj;
        }
        String str = (String) obj;
        ValueProperty valueProperty = CommonUtils.hasFlags(getConfigFlags(str), 4L) ? this.tempIntValueProperty : this.tempValueProperty;
        valueProperty.setName(str);
        return valueProperty;
    }

    public boolean isEmpty() {
        return this.mMap.isEmpty();
    }

    public Set<Object> keySet() {
        return this.mMap.keySet();
    }

    public AnimState remove(Object obj) {
        this.mMap.remove(obj);
        if (obj instanceof FloatProperty) {
            this.mMap.remove(((FloatProperty) obj).getName());
        }
        return this;
    }

    public void set(AnimState animState) {
        if (animState == null) {
            return;
        }
        setTag(animState.mTag);
        append(animState);
    }

    public void setConfigFlag(Object obj, long j2) {
        this.mConfig.queryAndCreateSpecial(obj instanceof FloatProperty ? ((FloatProperty) obj).getName() : (String) obj).flags = j2;
    }

    public final void setTag(Object obj) {
        if (obj == null) {
            obj = TAG + sId.incrementAndGet();
        }
        this.mTag = obj;
    }

    public String toString() {
        return "\nAnimState{mTag='" + this.mTag + "', flags:" + this.flags + ", mConfig:" + this.mConfig + ", mMaps=" + ((Object) CommonUtils.mapToString(this.mMap, "    ")) + '}';
    }

    public AnimState(Object obj) {
        this(obj, false);
    }

    public AnimState(Object obj, boolean z2) {
        this.tempValueProperty = new ValueProperty("");
        this.tempIntValueProperty = new IntValueProperty("");
        this.mConfig = new AnimConfig();
        this.mMap = new ConcurrentHashMap();
        setTag(obj);
        this.isTemporary = z2;
    }

    public float getFloat(String str) {
        Double mapValue = getMapValue(str);
        if (mapValue != null) {
            return mapValue.floatValue();
        }
        return Float.MAX_VALUE;
    }

    public int getInt(String str) {
        return getInt(new IntValueProperty(str));
    }

    public AnimState add(String str, int i2, long... jArr) {
        if (jArr.length > 0) {
            setConfigFlag(str, jArr[0] | 4);
        } else {
            setConfigFlag(str, getConfigFlags(str) | 4);
        }
        return add(str, i2);
    }

    public AnimState add(ViewProperty viewProperty, float f2, long... jArr) {
        return add((FloatProperty) viewProperty, f2, jArr);
    }

    public AnimState add(ViewProperty viewProperty, int i2, long... jArr) {
        return add((FloatProperty) viewProperty, i2, jArr);
    }

    public AnimState add(FloatProperty floatProperty, float f2, long... jArr) {
        if (jArr.length > 0) {
            setConfigFlag(floatProperty, jArr[0]);
        }
        return add(floatProperty, f2);
    }

    public AnimState add(FloatProperty floatProperty, int i2, long... jArr) {
        if (jArr.length > 0) {
            setConfigFlag(floatProperty, jArr[0] | 4);
        } else {
            setConfigFlag(floatProperty, getConfigFlags(floatProperty) | 4);
        }
        return add(floatProperty, i2);
    }

    public AnimState add(Object obj, double d2) {
        if (Double.isNaN(d2)) {
            Log.w(CommonUtils.TAG, "warning! the add value is NaN, will not add to AnimState. key: " + obj + " trace: " + Log.getStackTraceString(new Throwable()));
            return this;
        }
        if (Double.isInfinite(d2)) {
            Log.w(CommonUtils.TAG, "warning! the add value is Infinite, will not add to AnimState. key: " + obj + " trace: " + Log.getStackTraceString(new Throwable()));
            return this;
        }
        setMapValue(obj, d2);
        return this;
    }
}
