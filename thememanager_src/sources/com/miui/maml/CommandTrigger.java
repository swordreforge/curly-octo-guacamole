package com.miui.maml;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.zurt;
import com.miui.maml.ActionCommand;
import com.miui.maml.data.Expression;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class CommandTrigger {
    public static final String TAG_NAME = "Trigger";
    private String[] mActionStrings;
    private ArrayList<ActionCommand> mCommands = new ArrayList<>();
    private Expression mCondition;
    private ActionCommand.PropertyCommand mPropertyCommand;
    private ScreenElement mScreenElement;

    public CommandTrigger(Element element, ScreenElement screenElement) {
        if (element != null) {
            load(element, screenElement);
        }
    }

    public static CommandTrigger fromElement(Element element, ScreenElement screenElement) {
        if (element == null) {
            return null;
        }
        return new CommandTrigger(element, screenElement);
    }

    public static CommandTrigger fromParentElement(Element element, ScreenElement screenElement) {
        return fromElement(Utils.getChild(element, TAG_NAME), screenElement);
    }

    private void load(Element element, ScreenElement screenElement) {
        ActionCommand actionCommandCreate;
        this.mScreenElement = screenElement;
        String attribute = element.getAttribute(zurt.InterfaceC0290k.f47416lvui);
        String attribute2 = element.getAttribute("property");
        String attribute3 = element.getAttribute("value");
        if (!TextUtils.isEmpty(attribute2) && !TextUtils.isEmpty(attribute) && !TextUtils.isEmpty(attribute3)) {
            this.mPropertyCommand = ActionCommand.PropertyCommand.create(screenElement, attribute + "." + attribute2, attribute3);
        }
        this.mActionStrings = element.getAttribute("action").split(",");
        this.mCondition = Expression.build(this.mScreenElement.getVariables(), element.getAttribute("condition"));
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            if (childNodes.item(i2).getNodeType() == 1 && (actionCommandCreate = ActionCommand.create((Element) childNodes.item(i2), screenElement)) != null) {
                this.mCommands.add(actionCommandCreate);
            }
        }
    }

    public void finish() {
        ActionCommand.PropertyCommand propertyCommand = this.mPropertyCommand;
        if (propertyCommand != null) {
            propertyCommand.finish();
        }
        Iterator<ActionCommand> it = this.mCommands.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
    }

    public void init() {
        ActionCommand.PropertyCommand propertyCommand = this.mPropertyCommand;
        if (propertyCommand != null) {
            propertyCommand.init();
        }
        Iterator<ActionCommand> it = this.mCommands.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }

    public boolean isAction(String str) {
        for (String str2 : this.mActionStrings) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void onAction(String str) {
        if (isAction(str)) {
            perform();
        }
    }

    public void pause() {
        ActionCommand.PropertyCommand propertyCommand = this.mPropertyCommand;
        if (propertyCommand != null) {
            propertyCommand.pause();
        }
        Iterator<ActionCommand> it = this.mCommands.iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    public void perform() {
        Expression expression = this.mCondition;
        if (expression == null || expression.evaluate() > 0.0d) {
            ActionCommand.PropertyCommand propertyCommand = this.mPropertyCommand;
            if (propertyCommand != null) {
                propertyCommand.perform();
            }
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().perform();
            }
        }
    }

    public void resume() {
        ActionCommand.PropertyCommand propertyCommand = this.mPropertyCommand;
        if (propertyCommand != null) {
            propertyCommand.resume();
        }
        Iterator<ActionCommand> it = this.mCommands.iterator();
        while (it.hasNext()) {
            it.next().resume();
        }
    }
}
