package com.miui.maml.data;

import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.ContentProviderBinder;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.TextFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class VariableBinderManager implements ContentProviderBinder.QueryCompleteListener {
    private static final String LOG_TAG = "VariableBinderManager";
    public static final String TAG_NAME = "VariableBinders";
    private ScreenElementRoot mRoot;
    private ArrayList<VariableBinder> mVariableBinders = new ArrayList<>();

    public VariableBinderManager(Element element, ScreenElementRoot screenElementRoot) {
        this.mRoot = screenElementRoot;
        if (element != null) {
            load(element, screenElementRoot);
        }
    }

    private static VariableBinder createBinder(Element element, ScreenElementRoot screenElementRoot, VariableBinderManager variableBinderManager) {
        String tagName = element.getTagName();
        VariableBinder contentProviderBinder = tagName.equalsIgnoreCase(ContentProviderBinder.TAG_NAME) ? new ContentProviderBinder(element, screenElementRoot) : tagName.equalsIgnoreCase(SensorBinder.TAG_NAME) ? new SensorBinder(element, screenElementRoot) : tagName.equalsIgnoreCase(BroadcastBinder.TAG_NAME) ? new BroadcastBinder(element, screenElementRoot) : tagName.equalsIgnoreCase(FileBinder.TAG_NAME) ? new FileBinder(element, screenElementRoot) : tagName.equalsIgnoreCase(SettingsBinder.TAG_NAME) ? new SettingsBinder(element, screenElementRoot) : null;
        if (contentProviderBinder != null) {
            contentProviderBinder.setQueryCompleteListener(variableBinderManager);
        }
        return contentProviderBinder;
    }

    private void load(Element element, ScreenElementRoot screenElementRoot) {
        if (element != null) {
            loadBinders(element, screenElementRoot);
        } else {
            MamlLog.m17851e(LOG_TAG, "node is null");
            throw new NullPointerException("node is null");
        }
    }

    private void loadBinders(Element element, ScreenElementRoot screenElementRoot) {
        VariableBinder variableBinderCreateBinder;
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            if (childNodes.item(i2).getNodeType() == 1 && (variableBinderCreateBinder = createBinder((Element) childNodes.item(i2), screenElementRoot, this)) != null) {
                this.mVariableBinders.add(variableBinderCreateBinder);
            }
        }
    }

    public final void acceptVisitor(VariableBinderVisitor variableBinderVisitor) {
        Iterator<VariableBinder> it = this.mVariableBinders.iterator();
        while (it.hasNext()) {
            it.next().accept(variableBinderVisitor);
        }
    }

    public ContentProviderBinder.Builder addContentProviderBinder(String str) {
        return addContentProviderBinder(new TextFormatter(this.mRoot.getVariables(), str));
    }

    public VariableBinder findBinder(String str) {
        for (VariableBinder variableBinder : this.mVariableBinders) {
            if (TextUtils.equals(str, variableBinder.getName())) {
                return variableBinder;
            }
        }
        return null;
    }

    public void finish() {
        Iterator<VariableBinder> it = this.mVariableBinders.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
    }

    public void init() {
        Iterator<VariableBinder> it = this.mVariableBinders.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }

    @Override // com.miui.maml.data.ContentProviderBinder.QueryCompleteListener
    public void onQueryCompleted(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (VariableBinder variableBinder : this.mVariableBinders) {
            String dependency = variableBinder.getDependency();
            if (!TextUtils.isEmpty(dependency) && dependency.equals(str)) {
                variableBinder.startQuery();
            }
        }
    }

    public void pause() {
        Iterator<VariableBinder> it = this.mVariableBinders.iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    public void resume() {
        Iterator<VariableBinder> it = this.mVariableBinders.iterator();
        while (it.hasNext()) {
            it.next().resume();
        }
    }

    public void tick() {
        Iterator<VariableBinder> it = this.mVariableBinders.iterator();
        while (it.hasNext()) {
            it.next().tick();
        }
    }

    public ContentProviderBinder.Builder addContentProviderBinder(String str, String str2) {
        return addContentProviderBinder(new TextFormatter(this.mRoot.getVariables(), str, str2));
    }

    public ContentProviderBinder.Builder addContentProviderBinder(TextFormatter textFormatter) {
        ContentProviderBinder contentProviderBinder = new ContentProviderBinder(this.mRoot);
        contentProviderBinder.setQueryCompleteListener(this);
        contentProviderBinder.mUriFormatter = textFormatter;
        this.mVariableBinders.add(contentProviderBinder);
        return new ContentProviderBinder.Builder(contentProviderBinder);
    }
}
