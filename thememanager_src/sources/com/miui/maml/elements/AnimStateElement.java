package com.miui.maml.elements;

import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public class AnimStateElement extends StateElement {
    public static final String TAG_NAME = "AnimState";
    private ConcurrentHashMap<String, IndexedVariable> mAttrs;

    public AnimStateElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mAttrs = new ConcurrentHashMap<>();
        if (this.mHasName) {
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            Variables variables = getVariables();
            for (int i2 = 0; i2 < length; i2++) {
                Node nodeItem = attributes.item(i2);
                String nodeName = nodeItem.getNodeName();
                if (!"name".equals(nodeName)) {
                    Expression expressionBuild = Expression.build(variables, nodeItem.getNodeValue());
                    double dEvaluate = expressionBuild != null ? expressionBuild.evaluate() : 0.0d;
                    IndexedVariable indexedVariable = new IndexedVariable(this.mName + "." + nodeName, variables, true);
                    indexedVariable.set(dEvaluate);
                    this.mAttrs.put(nodeName, indexedVariable);
                }
            }
        }
    }

    public void clear() {
        Iterator<IndexedVariable> it = this.mAttrs.values().iterator();
        while (it.hasNext()) {
            it.next().set(0.0d);
        }
        this.mAttrs.clear();
    }

    @Override // com.miui.maml.elements.StateElement
    public AnimState getAnimState(String str) {
        AnimState animState = new AnimState(str);
        for (Map.Entry<String, IndexedVariable> entry : this.mAttrs.entrySet()) {
            FloatProperty propertyByName = AnimatedProperty.getPropertyByName(entry.getKey());
            if (propertyByName != null) {
                if (propertyByName instanceof ColorProperty) {
                    animState.add(propertyByName, (int) entry.getValue().getDouble(), 2);
                } else {
                    animState.add(propertyByName, (float) entry.getValue().getDouble(), 2);
                }
            }
        }
        return animState;
    }

    @Override // com.miui.maml.elements.StateElement
    public Collection<String> getProperties() {
        return this.mAttrs.keySet();
    }

    public void removeAttr(String[] strArr) {
        for (String str : strArr) {
            IndexedVariable indexedVariable = this.mAttrs.get(str);
            if (indexedVariable != null) {
                indexedVariable.set(0.0d);
                this.mAttrs.remove(str);
            }
        }
    }

    public void updateAttr(String[] strArr, double[] dArr) {
        if (strArr == null || dArr == null || strArr.length != dArr.length) {
            return;
        }
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            IndexedVariable indexedVariable = this.mAttrs.get(strArr[i2]);
            if (indexedVariable == null) {
                indexedVariable = new IndexedVariable(this.mName + "." + strArr[i2], getVariables(), true);
                this.mAttrs.put(strArr[i2], indexedVariable);
            }
            indexedVariable.set(dArr[i2]);
        }
    }
}
