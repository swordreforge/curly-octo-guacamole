package com.miui.maml.elements;

import android.text.TextUtils;
import androidx.collection.zy;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.folme.ConfigValue;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.utils.EaseManager;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class AnimConfigElement extends ConfigElement {
    public static final String TAG_NAME = "AnimConfig";
    private ConcurrentHashMap<String, ConfigData> mConfigs;

    private class ConfigData {
        public IndexedVariable mDelay;
        public IndexedVariable mEase;
        public IndexedVariable mEaseLen;
        public IndexedVariable mFromSpeed;
        public IndexedVariable mOnBeginCallback;
        public IndexedVariable mOnBeginCallbackLen;
        public IndexedVariable mOnCompleteCallback;
        public IndexedVariable mOnCompleteCallbackLen;
        public IndexedVariable mOnUpdateCallback;
        public IndexedVariable mOnUpdateCallbackLen;
        public IndexedVariable mProperty;
        public IndexedVariable mPropertyLen;

        private ConfigData() {
        }
    }

    public AnimConfigElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        ConcurrentHashMap<String, ConfigData> concurrentHashMap = new ConcurrentHashMap<>();
        this.mConfigs = concurrentHashMap;
        if (this.mHasName) {
            String str = this.mName;
            concurrentHashMap.put(str, getConfigData(element, str));
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                if (childNodes.item(i2).getNodeType() == 1) {
                    Element element2 = (Element) childNodes.item(i2);
                    if ("Special".equals(element2.getTagName())) {
                        String attribute = element2.getAttribute("name");
                        if (!TextUtils.isEmpty(attribute)) {
                            String str2 = this.mName + "." + attribute;
                            this.mConfigs.put(str2, getConfigData(element2, str2));
                        }
                    }
                }
            }
        }
    }

    private ConfigData getConfigData(Element element, String str) {
        Variables variables = getVariables();
        ConfigData configData = new ConfigData();
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            String nodeName = attributes.item(i2).getNodeName();
            Expression[] expressionArrBuildMultiple = Expression.buildMultiple(variables, element.getAttribute(nodeName));
            if (expressionArrBuildMultiple != null) {
                updateConfigIndexVariable(configData, str, nodeName, expressionArrBuildMultiple);
            }
        }
        return configData;
    }

    private void getConfigValueFromVarToSet(IndexedVariable indexedVariable, zy<String> zyVar) {
        Object obj = indexedVariable != null ? indexedVariable.get() : null;
        if (obj == null || !(obj instanceof String[])) {
            return;
        }
        for (String str : (String[]) obj) {
            zyVar.add(str);
        }
    }

    private EaseManager.EaseStyle getEase(IndexedVariable indexedVariable) {
        Object obj = indexedVariable != null ? indexedVariable.get() : null;
        if (obj != null && (obj instanceof double[])) {
            double[] dArr = (double[]) obj;
            if (dArr.length > 0) {
                int i2 = (int) dArr[0];
                float[] fArr = new float[dArr.length - 1];
                int length = dArr.length;
                for (int i3 = 1; i3 < length; i3++) {
                    fArr[i3 - 1] = (float) dArr[i3];
                }
                try {
                    return EaseManager.getStyle(i2, fArr);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    private void removeConfigIndexVariable(ConfigData configData, String str) {
        str.hashCode();
        switch (str) {
            case "onComplete":
                IndexedVariable indexedVariable = configData.mOnCompleteCallback;
                if (indexedVariable != null) {
                    indexedVariable.set((Object) null);
                    configData.mOnCompleteCallback = null;
                }
                IndexedVariable indexedVariable2 = configData.mOnCompleteCallbackLen;
                if (indexedVariable2 != null) {
                    indexedVariable2.set(0.0d);
                    configData.mOnCompleteCallbackLen = null;
                    break;
                }
                break;
            case "onBegin":
                IndexedVariable indexedVariable3 = configData.mOnBeginCallback;
                if (indexedVariable3 != null) {
                    indexedVariable3.set((Object) null);
                    configData.mOnBeginCallback = null;
                }
                IndexedVariable indexedVariable4 = configData.mOnBeginCallbackLen;
                if (indexedVariable4 != null) {
                    indexedVariable4.set(0.0d);
                    configData.mOnBeginCallbackLen = null;
                    break;
                }
                break;
            case "property":
                IndexedVariable indexedVariable5 = configData.mProperty;
                if (indexedVariable5 != null) {
                    indexedVariable5.set((Object) null);
                    configData.mProperty = null;
                }
                IndexedVariable indexedVariable6 = configData.mPropertyLen;
                if (indexedVariable6 != null) {
                    indexedVariable6.set(0.0d);
                    configData.mPropertyLen = null;
                    break;
                }
                break;
            case "ease":
                IndexedVariable indexedVariable7 = configData.mEase;
                if (indexedVariable7 != null) {
                    indexedVariable7.set((Object) null);
                    configData.mEase = null;
                }
                IndexedVariable indexedVariable8 = configData.mEaseLen;
                if (indexedVariable8 != null) {
                    indexedVariable8.set(0.0d);
                    configData.mEaseLen = null;
                    break;
                }
                break;
            case "fromSpeed":
                IndexedVariable indexedVariable9 = configData.mFromSpeed;
                if (indexedVariable9 != null) {
                    indexedVariable9.set(0.0d);
                    configData.mFromSpeed = null;
                    break;
                }
                break;
            case "delay":
                IndexedVariable indexedVariable10 = configData.mDelay;
                if (indexedVariable10 != null) {
                    indexedVariable10.set(0.0d);
                    configData.mDelay = null;
                    break;
                }
                break;
            case "onUpdate":
                IndexedVariable indexedVariable11 = configData.mOnUpdateCallback;
                if (indexedVariable11 != null) {
                    indexedVariable11.set((Object) null);
                    configData.mOnUpdateCallback = null;
                }
                IndexedVariable indexedVariable12 = configData.mOnUpdateCallbackLen;
                if (indexedVariable12 != null) {
                    indexedVariable12.set(0.0d);
                    configData.mOnUpdateCallbackLen = null;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [double[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Double] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateConfigIndexVariable(com.miui.maml.elements.AnimConfigElement.ConfigData r6, java.lang.String r7, java.lang.String r8, @zy.lvui com.miui.maml.data.Expression[] r9) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.elements.AnimConfigElement.updateConfigIndexVariable(com.miui.maml.elements.AnimConfigElement$ConfigData, java.lang.String, java.lang.String, com.miui.maml.data.Expression[]):void");
    }

    public void clearConfigData() {
        for (ConfigData configData : this.mConfigs.values()) {
            removeConfigIndexVariable(configData, "fromSpeed");
            removeConfigIndexVariable(configData, "delay");
            removeConfigIndexVariable(configData, "ease");
            removeConfigIndexVariable(configData, "property");
            removeConfigIndexVariable(configData, "onUpdate");
            removeConfigIndexVariable(configData, "onBegin");
            removeConfigIndexVariable(configData, "onComplete");
        }
        this.mConfigs.clear();
    }

    @Override // com.miui.maml.elements.ConfigElement
    protected void evaluateConfigValue() {
        this.mTempValueList.clear();
        for (ConfigData configData : this.mConfigs.values()) {
            ConfigValue configValue = new ConfigValue();
            IndexedVariable indexedVariable = configData.mDelay;
            if (indexedVariable != null) {
                configValue.mDelay = (long) indexedVariable.getDouble();
            }
            if (configData.mFromSpeed != null) {
                configValue.mFromSpeed = (long) r3.getDouble();
                configValue.mHasFromSpeed = true;
            }
            IndexedVariable indexedVariable2 = configData.mEase;
            if (indexedVariable2 != null) {
                configValue.mEase = getEase(indexedVariable2);
            }
            IndexedVariable indexedVariable3 = configData.mProperty;
            if (indexedVariable3 != null) {
                getConfigValueFromVarToSet(indexedVariable3, configValue.mRelatedProperty);
            }
            IndexedVariable indexedVariable4 = configData.mOnBeginCallback;
            if (indexedVariable4 != null) {
                getConfigValueFromVarToSet(indexedVariable4, configValue.mOnBeginCallback);
            }
            IndexedVariable indexedVariable5 = configData.mOnCompleteCallback;
            if (indexedVariable5 != null) {
                getConfigValueFromVarToSet(indexedVariable5, configValue.mOnCompleteCallback);
            }
            IndexedVariable indexedVariable6 = configData.mOnUpdateCallback;
            if (indexedVariable6 != null) {
                getConfigValueFromVarToSet(indexedVariable6, configValue.mOnUpdateCallback);
            }
            this.mTempValueList.add(configValue);
        }
    }

    public void removeConfigData(String str, String str2) {
        ConfigData configData = this.mConfigs.get(str);
        if (configData != null) {
            removeConfigIndexVariable(configData, str2);
        }
    }

    public void updateConfigData(String str, String str2, Expression[] expressionArr) {
        ConfigData configData = this.mConfigs.get(str);
        if (configData == null) {
            configData = new ConfigData();
            this.mConfigs.put(str, configData);
        }
        updateConfigIndexVariable(configData, str, str2, expressionArr);
    }
}
