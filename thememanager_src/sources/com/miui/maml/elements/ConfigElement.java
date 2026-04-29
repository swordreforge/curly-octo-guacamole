package com.miui.maml.elements;

import android.graphics.Canvas;
import androidx.collection.zy;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.folme.ConfigValue;
import com.miui.maml.folme.MamlTransitionListener;
import com.miui.maml.folme.TransitionListenerWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import miuix.animation.base.AnimConfig;
import miuix.animation.property.FloatProperty;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConfigElement extends ScreenElement {
    protected static final String ATTR_DELAY = "delay";
    protected static final String ATTR_EASE = "ease";
    protected static final String ATTR_FROM_SPEED = "fromSpeed";
    protected static final String ATTR_ON_BEGIN = "onBegin";
    protected static final String ATTR_ON_COMPLETE = "onComplete";
    protected static final String ATTR_ON_UPDATE = "onUpdate";
    protected static final String ATTR_PROPERTY = "property";
    protected ArrayList<AnimConfig> mTempAnimConfigs;
    protected ArrayList<ConfigValue> mTempValueList;

    public ConfigElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mTempAnimConfigs = new ArrayList<>();
        this.mTempValueList = new ArrayList<>();
    }

    private void setupCallbacks(Collection<FunctionElement> collection, zy<String> zyVar) {
        collection.clear();
        Iterator<String> it = zyVar.iterator();
        while (it.hasNext()) {
            ScreenElement screenElementFindElement = getRoot().findElement(it.next());
            if (screenElementFindElement instanceof FunctionElement) {
                collection.add((FunctionElement) screenElementFindElement);
            }
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
    }

    protected abstract void evaluateConfigValue();

    public AnimConfig getAnimConfig(TransitionListenerWrapper transitionListenerWrapper) {
        MamlTransitionListener listener = transitionListenerWrapper.getListener();
        if (listener == null) {
            return new AnimConfig();
        }
        evaluateConfigValue();
        AnimConfig animConfig = new AnimConfig();
        for (ConfigValue configValue : this.mTempValueList) {
            zy<String> zyVar = configValue.mRelatedProperty;
            if (zyVar == null || zyVar.isEmpty()) {
                if (configValue.mHasFromSpeed) {
                    animConfig.setFromSpeed(configValue.mFromSpeed);
                }
                animConfig.setEase(configValue.mEase);
                animConfig.setDelay(configValue.mDelay);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = configValue.mRelatedProperty.iterator();
                while (it.hasNext()) {
                    FloatProperty propertyByName = AnimatedProperty.getPropertyByName(it.next());
                    if (propertyByName != null) {
                        arrayList.add(propertyByName);
                    }
                    if (configValue.mHasFromSpeed) {
                        animConfig.setSpecial(propertyByName, configValue.mEase, configValue.mDelay, configValue.mFromSpeed);
                    } else {
                        animConfig.setSpecial(propertyByName, configValue.mEase, configValue.mDelay, new float[0]);
                    }
                }
            }
            setupCallbacks(listener.mBeginCallback, configValue.mOnBeginCallback);
            setupCallbacks(listener.mUpdateCallback, configValue.mOnUpdateCallback);
            setupCallbacks(listener.mCompleteCallback, configValue.mOnCompleteCallback);
        }
        animConfig.addListeners(transitionListenerWrapper);
        return animConfig;
    }

    @Override // com.miui.maml.elements.ScreenElement
    public boolean isVisible() {
        return false;
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void tick(long j2) {
    }
}
