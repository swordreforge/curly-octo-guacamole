package com.miui.maml.data;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.ArrayMap;
import com.miui.maml.util.MamlLog;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MamlSensorManager {
    private static final int INVALID_TYPE = -1;
    private static final String TAG = "MAML_SensorManager";
    private static ArrayMap<String, MamlSensor> sSensors = new ArrayMap<>();
    private static final Object sLock = new Object();

    private static class MamlSensor {
        private int mRate;
        private boolean mRegistered;
        private Sensor mSensor;
        private SensorManager mSensorManager;
        private int mType;
        private WeakHashMap<SensorEventListener, Integer> mCallbacks = new WeakHashMap<>();
        private final Object mLock = new Object();
        private SensorEventListener mListener = new SensorEventListener() { // from class: com.miui.maml.data.MamlSensorManager.MamlSensor.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i2) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                synchronized (MamlSensor.this.mLock) {
                    Iterator it = MamlSensor.this.mCallbacks.keySet().iterator();
                    while (it.hasNext()) {
                        ((SensorEventListener) it.next()).onSensorChanged(sensorEvent);
                    }
                }
            }
        };

        public MamlSensor(Context context, int i2, int i3) {
            if (i2 == -1) {
                MamlLog.m17851e(MamlSensorManager.TAG, "Wront sensor type: " + i2);
                return;
            }
            this.mType = i2;
            this.mRate = i3;
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.mSensorManager = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(i2);
            this.mSensor = defaultSensor;
            if (defaultSensor == null) {
                MamlLog.m17851e(MamlSensorManager.TAG, "Fail to get sensor! TYPE: " + this.mType);
            }
        }

        private boolean registerListener() {
            Sensor sensor = this.mSensor;
            if (sensor != null && !this.mRegistered) {
                try {
                    this.mRegistered = this.mSensorManager.registerListener(this.mListener, sensor, this.mRate);
                    MamlLog.m17850d(MamlSensorManager.TAG, "registerListener " + this.mType);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return this.mRegistered;
        }

        private void unRegisterListener() {
            Sensor sensor = this.mSensor;
            if (sensor == null || !this.mRegistered) {
                return;
            }
            try {
                this.mSensorManager.unregisterListener(this.mListener, sensor);
                this.mRegistered = false;
                MamlLog.m17850d(MamlSensorManager.TAG, "unregisterListener " + this.mType);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public void addCallback(int i2, SensorEventListener sensorEventListener) {
            synchronized (this.mLock) {
                this.mCallbacks.put(sensorEventListener, Integer.valueOf(i2));
            }
            boolean z2 = false;
            if (this.mRate < i2) {
                this.mRate = i2;
                z2 = true;
            }
            if (z2 && this.mRegistered) {
                unRegisterListener();
            }
            registerListener();
        }

        public void removeCallback(SensorEventListener sensorEventListener) {
            synchronized (this.mLock) {
                Integer num = this.mCallbacks.get(sensorEventListener);
                if (num == null) {
                    return;
                }
                this.mCallbacks.remove(sensorEventListener);
                boolean z2 = false;
                if (this.mRate == num.intValue()) {
                    this.mRate = 3;
                    for (Integer num2 : this.mCallbacks.values()) {
                        if (this.mRate > num2.intValue()) {
                            this.mRate = num2.intValue();
                        }
                    }
                    if (this.mRate != num.intValue()) {
                        z2 = true;
                    }
                }
                if (this.mCallbacks.size() == 0) {
                    unRegisterListener();
                } else if (z2) {
                    unRegisterListener();
                    registerListener();
                }
            }
        }
    }

    private static class MamlSensorManagerHolder {
        public static final MamlSensorManager INSTANCE = new MamlSensorManager();

        private MamlSensorManagerHolder() {
        }
    }

    public static MamlSensorManager getInstance() {
        return MamlSensorManagerHolder.INSTANCE;
    }

    private int getType(String str) {
        str.hashCode();
        switch (str) {
            case "orientation":
                return 3;
            case "pressure":
                return 6;
            case "proximity":
                return 8;
            case "light":
                return 5;
            case "gravity":
                return 9;
            case "gyroscope":
                return 4;
            case "linear_acceleration":
                return 10;
            case "accelerometer":
                return 1;
            default:
                return -1;
        }
    }

    private int getValidRate(int i2) {
        int i3 = 1;
        if (i2 != 0 && i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 3;
            }
        }
        return i3;
    }

    public void registerListener(Context context, String str, int i2, SensorEventListener sensorEventListener) {
        int validRate = getValidRate(i2);
        synchronized (sLock) {
            MamlSensor mamlSensor = sSensors.get(str);
            if (mamlSensor != null) {
                mamlSensor.addCallback(validRate, sensorEventListener);
            } else {
                MamlSensor mamlSensor2 = new MamlSensor(context, getType(str), validRate);
                if (mamlSensor2.mSensor != null) {
                    mamlSensor2.addCallback(validRate, sensorEventListener);
                    sSensors.put(str, mamlSensor2);
                }
            }
        }
    }

    public void unregisterListener(String str, SensorEventListener sensorEventListener) {
        synchronized (sLock) {
            MamlSensor mamlSensor = sSensors.get(str);
            if (mamlSensor != null) {
                mamlSensor.removeCallback(sensorEventListener);
                if (mamlSensor.mCallbacks.size() == 0) {
                    sSensors.remove(str);
                }
            }
        }
    }

    private MamlSensorManager() {
    }
}
