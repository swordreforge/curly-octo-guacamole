package com.miui.maml.data;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.text.TextUtils;
import com.android.thememanager.basemodule.analysis.toq;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.VariableBinder;
import com.miui.maml.util.Utils;
import java.util.Iterator;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class SensorBinder extends VariableBinder {
    private static final String LOG_TAG = "SensorBinder";
    public static final String TAG_NAME = "SensorBinder";
    private static final float THRESHOLD = 0.1f;
    private boolean mEnable;
    private boolean mPaused;
    private int mRate;
    private boolean mRegistered;
    private SensorEventListener mSensorEventListener;
    private float mThreshold;
    private String mType;

    private static class Variable extends VariableBinder.Variable {
        public int mIndex;

        public Variable(Element element, Variables variables) {
            super(element, variables);
            this.mIndex = Utils.getAttrAsInt(element, "index", 0);
        }
    }

    public SensorBinder(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mEnable = true;
        this.mType = element.getAttribute("type");
        this.mRate = Utils.getAttrAsInt(element, "rate", 3);
        this.mThreshold = Utils.getAttrAsFloat(element, "threshold", 0.1f);
        String attribute = element.getAttribute(toq.u0z);
        if (!TextUtils.isEmpty(attribute)) {
            this.mEnable = Boolean.parseBoolean(attribute);
        }
        this.mSensorEventListener = new SensorEventListener() { // from class: com.miui.maml.data.SensorBinder.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i2) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                int length = sensorEvent.values.length;
                Iterator<VariableBinder.Variable> it = SensorBinder.this.mVariables.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    Variable variable = (Variable) it.next();
                    int i2 = variable.mIndex;
                    if (i2 >= 0 && i2 < length && Math.abs(variable.getNumber() - ((double) sensorEvent.values[variable.mIndex])) > SensorBinder.this.mThreshold) {
                        variable.set(sensorEvent.values[variable.mIndex]);
                        z2 = true;
                    }
                }
                if (z2) {
                    SensorBinder.this.onUpdateComplete();
                }
            }
        };
        loadVariables(element);
    }

    private void registerListener() {
        if (!this.mEnable || this.mPaused) {
            return;
        }
        MamlSensorManager.getInstance().registerListener(getContext().mContext, this.mType, this.mRate, this.mSensorEventListener);
    }

    private void unregisterListener() {
        MamlSensorManager.getInstance().unregisterListener(this.mType, this.mSensorEventListener);
    }

    @Override // com.miui.maml.data.VariableBinder
    public void finish() {
        unregisterListener();
        super.finish();
    }

    @Override // com.miui.maml.data.VariableBinder
    public void init() {
        super.init();
    }

    @Override // com.miui.maml.data.VariableBinder
    public void pause() {
        super.pause();
        this.mPaused = true;
        unregisterListener();
    }

    @Override // com.miui.maml.data.VariableBinder
    public void resume() {
        super.resume();
        this.mPaused = false;
        registerListener();
    }

    public void turnOffSensorBinder() {
        this.mEnable = false;
        unregisterListener();
    }

    public void turnOnSensorBinder() {
        this.mEnable = true;
        registerListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.maml.data.VariableBinder
    public Variable onLoadVariable(Element element) {
        return new Variable(element, getContext().mVariables);
    }
}
