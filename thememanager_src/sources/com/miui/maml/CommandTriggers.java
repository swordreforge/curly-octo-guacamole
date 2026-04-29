package com.miui.maml;

import com.miui.maml.elements.ScreenElement;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class CommandTriggers {
    public static final String TAG_NAME = "Triggers";
    private ArrayList<CommandTrigger> mTriggers = new ArrayList<>();

    public CommandTriggers(Element element, ScreenElement screenElement) {
        if (element != null) {
            load(element, screenElement);
        }
    }

    private void load(Element element, ScreenElement screenElement) {
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            if (childNodes.item(i2).getNodeType() == 1) {
                Element element2 = (Element) childNodes.item(i2);
                if (element2.getNodeName().equals(CommandTrigger.TAG_NAME)) {
                    this.mTriggers.add(new CommandTrigger(element2, screenElement));
                }
            }
        }
    }

    public void add(CommandTrigger commandTrigger) {
        this.mTriggers.add(commandTrigger);
    }

    public CommandTrigger find(String str) {
        for (CommandTrigger commandTrigger : this.mTriggers) {
            if (commandTrigger.isAction(str)) {
                return commandTrigger;
            }
        }
        return null;
    }

    public void finish() {
        Iterator<CommandTrigger> it = this.mTriggers.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
    }

    public void init() {
        Iterator<CommandTrigger> it = this.mTriggers.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }

    public void onAction(String str) {
        Iterator<CommandTrigger> it = this.mTriggers.iterator();
        while (it.hasNext()) {
            it.next().onAction(str);
        }
    }

    public void pause() {
        Iterator<CommandTrigger> it = this.mTriggers.iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    public void resume() {
        Iterator<CommandTrigger> it = this.mTriggers.iterator();
        while (it.hasNext()) {
            it.next().resume();
        }
    }
}
