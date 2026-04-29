package com.miui.maml;

import com.miui.maml.elements.ScreenElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class VibrateCommand extends ActionCommand {
    private static final String LOG_TAG = "VibrateCommand";
    public static final String TAG_NAME = "VibrateCommand";

    public VibrateCommand(ScreenElement screenElement, Element element) {
        super(screenElement);
    }

    @Override // com.miui.maml.ActionCommand
    protected void doPerform() {
    }
}
