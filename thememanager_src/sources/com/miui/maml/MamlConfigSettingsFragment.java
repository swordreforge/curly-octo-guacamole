package com.miui.maml;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.fragment.app.ActivityC0891q;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.miui.maml.MamlConfigSettings;
import com.miui.maml.elements.ListScreenElement;
import com.miui.maml.util.ConfigFile;
import com.miui.maml.util.Task;
import com.miui.maml.util.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import miuix.preference.qrj;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class MamlConfigSettingsFragment extends qrj implements Preference.zy, Preference.InterfaceC0998q {
    private MamlConfigSettings.ConfigFileHelper mConfigFileHelper;
    private final HashMap<String, Item> mPreferenceMap = new HashMap<>();
    private int mNextRequestCode = 100;
    private final HashMap<Integer, Object> mRequestCodeObjMap = new HashMap<>();

    private class AppPickerItem extends PickerItem {
        private Task mDefaultTask;

        private AppPickerItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            String str;
            Task task = (Task) objValue;
            MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putTask(task);
            if (task == null || (str = task.name) == null) {
                str = "";
            }
            setValuePreview(str);
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.PickerItem
        public boolean onActivityResult(int resultCode, Intent data) {
            if (resultCode != -1) {
                return false;
            }
            Task task = new Task();
            task.id = this.mId;
            if (data != null) {
                task.name = data.getStringExtra("name");
                task.packageName = data.getComponent().getPackageName();
                task.className = data.getComponent().getClassName();
                task.action = "android.intent.action.MAIN";
                Log.i("AppPickerItem", "selected component: " + task.packageName + " " + task.className);
            } else {
                task = this.mDefaultTask;
            }
            return OnValueChange(task);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.PickerItem, com.miui.maml.MamlConfigSettingsFragment.Item
        protected void onBuild(Element ele) {
            super.onBuild(ele);
            this.mDefaultTask = Task.load(ele);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean onClick() {
            MamlConfigSettingsFragment.this.startActivityForResult(new Intent(MamlConfigSettingsFragment.this.getContext(), (Class<?>) ThirdAppPicker.class), this.mRequestCode);
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public void updateValue() {
            Task task = MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().getTask(this.mId);
            if (task != null) {
                setValuePreview(task.name);
            } else {
                OnValueChange(this.mDefaultTask);
            }
        }
    }

    private class CheckboxItem extends VariableItem {
        private CheckboxItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putNumber(this.mId, objValue instanceof Boolean ? ((Boolean) objValue).booleanValue() : objValue instanceof String ? "1".equals(objValue) : false ? "1" : "0");
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected Preference createPreference(Context c2) {
            return new CheckBoxPreference(c2);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.VariableItem
        protected void setValue(String value) {
            ((CheckBoxPreference) this.mPreference).setChecked("1".equals(value));
        }
    }

    private class ImagePickerItem extends PickerItem {
        private ImagePickerItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            Uri uri = (Uri) objValue;
            String string = uri == null ? null : uri.toString();
            MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putString(this.mId, string);
            setValuePreview(string);
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.PickerItem
        public boolean onActivityResult(int resultCode, Intent data) {
            return resultCode == -1 && OnValueChange(data.getData());
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean onClick() {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.PICK");
            MamlConfigSettingsFragment.this.startActivityForResult(Intent.createChooser(intent, null), this.mRequestCode);
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public void updateValue() {
            setValuePreview(MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().getVariable(this.mId));
        }
    }

    private abstract class Item {
        protected String mDefaultValue;
        protected String mId;
        protected Preference mPreference;
        protected String mSummary;
        protected String mTitle;

        private Item() {
        }

        public abstract boolean OnValueChange(Object objValue);

        public final boolean build(PreferenceCategory category, Element ele) {
            this.mId = ele.getAttribute("id");
            this.mTitle = ele.getAttribute("text");
            this.mSummary = ele.getAttribute(C2656k.f60926n7h);
            this.mDefaultValue = ele.getAttribute("default");
            Preference preferenceCreatePreference = createPreference(MamlConfigSettingsFragment.this.getActivity());
            this.mPreference = preferenceCreatePreference;
            if (preferenceCreatePreference == null) {
                return false;
            }
            category.h7am(preferenceCreatePreference);
            this.mPreference.bwp(this.mTitle);
            this.mPreference.z4(this.mSummary);
            this.mPreference.gbni(this.mId);
            this.mPreference.i9jn(MamlConfigSettingsFragment.this);
            this.mPreference.m4(false);
            onBuild(ele);
            updateValue();
            return true;
        }

        protected abstract Preference createPreference(Context c2);

        protected void onBuild(Element ele) {
        }

        public boolean onClick() {
            return false;
        }

        protected void setValuePreview(String value) {
            StringBuilder sb = new StringBuilder();
            if (value == null) {
                value = "";
            }
            sb.append(value);
            if (!TextUtils.isEmpty(this.mSummary)) {
                sb.append("\n");
                sb.append(this.mSummary);
            }
            this.mPreference.z4(sb.toString());
        }

        public abstract void updateValue();
    }

    private class NumberChoiceItem extends ValueChoiceItem {
        private NumberChoiceItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.ValueChoiceItem, com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            super.OnValueChange(objValue);
            MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putNumber(this.mId, (String) objValue);
            return true;
        }
    }

    private class NumberInputItem extends VariableItem {
        private NumberInputItem() {
            super();
        }

        private String getValueString(String value) {
            double d2;
            try {
                d2 = Double.parseDouble(value);
            } catch (NumberFormatException unused) {
                d2 = 0.0d;
            }
            return Utils.doubleToString(d2);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            try {
                String strDoubleToString = Utils.doubleToString(Double.parseDouble((String) objValue));
                MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putNumber(this.mId, strDoubleToString);
                setValuePreview(strDoubleToString);
                return true;
            } catch (NumberFormatException unused) {
                return false;
            }
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected Preference createPreference(Context c2) {
            return new EditTextPreference(c2);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected void onBuild(Element ele) {
            super.onBuild(ele);
            ((EditTextPreference) this.mPreference).pc(this.mTitle);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.VariableItem
        protected void setValue(String value) {
            String valueString = getValueString(value);
            ((EditTextPreference) this.mPreference).bap7(valueString);
            setValuePreview(valueString);
        }
    }

    private abstract class PickerItem extends Item {
        protected int mRequestCode;

        private PickerItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected Preference createPreference(Context c2) {
            return new Preference(c2);
        }

        public abstract boolean onActivityResult(int resultCode, Intent data);

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected void onBuild(Element ele) {
            this.mPreference.ltg8(MamlConfigSettingsFragment.this);
            int nextRequestCode = MamlConfigSettingsFragment.this.getNextRequestCode();
            this.mRequestCode = nextRequestCode;
            MamlConfigSettingsFragment.this.putRequestCodeObj(nextRequestCode, this);
        }
    }

    private class StringChoiceItem extends ValueChoiceItem {
        private StringChoiceItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.ValueChoiceItem, com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            super.OnValueChange(objValue);
            MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putString(this.mId, (String) objValue);
            return true;
        }
    }

    private class StringInputItem extends VariableItem {
        private StringInputItem() {
            super();
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            String str = (String) objValue;
            MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().putString(this.mId, str);
            setValuePreview(str);
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected Preference createPreference(Context c2) {
            return new EditTextPreference(c2);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected void onBuild(Element ele) {
            super.onBuild(ele);
            ((EditTextPreference) this.mPreference).pc(this.mTitle);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.VariableItem
        protected void setValue(String value) {
            ((EditTextPreference) this.mPreference).bap7(value);
            setValuePreview(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class ValueChoiceItem extends VariableItem {
        protected ArrayList<String> mItemsText;
        protected ArrayList<String> mItemsValue;

        private ValueChoiceItem() {
            super();
            this.mItemsText = new ArrayList<>();
            this.mItemsValue = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBuild$0(Element element) {
            this.mItemsText.add(element.getAttribute("text"));
            this.mItemsValue.add(element.getAttribute("value"));
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public boolean OnValueChange(Object objValue) {
            ListPreference listPreference = (ListPreference) this.mPreference;
            int iPjz9 = listPreference.pjz9((String) objValue);
            if (iPjz9 == -1) {
                return false;
            }
            setValuePreview(listPreference.ngy()[iPjz9].toString());
            return true;
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected Preference createPreference(Context c2) {
            return new ListPreference(c2);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        protected void onBuild(Element ele) {
            this.mItemsText.clear();
            this.mItemsValue.clear();
            Utils.traverseXmlElementChildren(ele, ListScreenElement.ListItemElement.TAG_NAME, new Utils.XmlTraverseListener() { // from class: com.miui.maml.n
                @Override // com.miui.maml.util.Utils.XmlTraverseListener
                public final void onChild(Element element) {
                    this.f29478k.lambda$onBuild$0(element);
                }
            });
            ListPreference listPreference = (ListPreference) this.mPreference;
            ArrayList<String> arrayList = this.mItemsText;
            listPreference.e5((CharSequence[]) arrayList.toArray(new String[arrayList.size()]));
            ArrayList<String> arrayList2 = this.mItemsValue;
            listPreference.vy((CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]));
            listPreference.pc(this.mTitle);
        }

        @Override // com.miui.maml.MamlConfigSettingsFragment.VariableItem
        protected void setValue(String value) {
            ListPreference listPreference = (ListPreference) this.mPreference;
            int iPjz9 = listPreference.pjz9(value);
            if (iPjz9 != -1) {
                listPreference.lw(iPjz9);
                setValuePreview(listPreference.ngy()[iPjz9].toString());
            }
        }
    }

    private abstract class VariableItem extends Item {
        private VariableItem() {
            super();
        }

        protected abstract void setValue(String value);

        @Override // com.miui.maml.MamlConfigSettingsFragment.Item
        public void updateValue() {
            String variable = MamlConfigSettingsFragment.this.mConfigFileHelper.getConfigFile().getVariable(this.mId);
            if (variable != null) {
                setValue(variable);
            } else {
                setValue(this.mDefaultValue);
                OnValueChange(this.mDefaultValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createGroup, reason: merged with bridge method [inline-methods] */
    public void lambda$createPreferenceScreen$0(PreferenceScreen rootScreen, Element group) {
        if (group == null) {
            return;
        }
        final PreferenceCategory preferenceCategory = new PreferenceCategory(rootScreen.x2());
        rootScreen.h7am(preferenceCategory);
        preferenceCategory.bwp(group.getAttribute("text"));
        preferenceCategory.z4(group.getAttribute(C2656k.f60926n7h));
        Utils.traverseXmlElementChildren(group, null, new Utils.XmlTraverseListener() { // from class: com.miui.maml.zy
            @Override // com.miui.maml.util.Utils.XmlTraverseListener
            public final void onChild(Element element) {
                this.f29488k.lambda$createGroup$1(preferenceCategory, element);
            }
        });
    }

    private Item createItem(String tag) {
        if (ConfigFile.TAG_STRING_INPUT.equals(tag)) {
            return new StringInputItem();
        }
        if (ConfigFile.TAG_CHECK_BOX.equals(tag)) {
            return new CheckboxItem();
        }
        if (ConfigFile.TAG_NUMBER_INPUT.equals(tag)) {
            return new NumberInputItem();
        }
        if (ConfigFile.TAG_STRING_CHOICE.equals(tag)) {
            return new StringChoiceItem();
        }
        if (ConfigFile.TAG_NUMBER_CHOICE.equals(tag)) {
            return new NumberChoiceItem();
        }
        if (ConfigFile.TAG_APP_PICKER.equals(tag)) {
            return new AppPickerItem();
        }
        if (ConfigFile.TAG_IMAGE_PICKER.equals(tag)) {
            return new ImagePickerItem();
        }
        return null;
    }

    private void createPreferenceScreen(Activity activity) {
        final PreferenceScreen preferenceScreenM4692k = getPreferenceManager().m4692k(activity);
        setPreferenceScreen(preferenceScreenM4692k);
        InputStream configFileStream = null;
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                configFileStream = this.mConfigFileHelper.getConfigFileStream(getResources().getConfiguration().locale);
                if (configFileStream == null) {
                    if (configFileStream != null) {
                        try {
                            configFileStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                Element documentElement = documentBuilderNewDocumentBuilder.parse(configFileStream).getDocumentElement();
                if (documentElement == null) {
                    try {
                        configFileStream.close();
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                } else {
                    if (!documentElement.getNodeName().equals("Config")) {
                        try {
                            configFileStream.close();
                            return;
                        } catch (IOException unused3) {
                            return;
                        }
                    }
                    Utils.traverseXmlElementChildren(documentElement, "Group", new Utils.XmlTraverseListener() { // from class: com.miui.maml.q
                        @Override // com.miui.maml.util.Utils.XmlTraverseListener
                        public final void onChild(Element element) {
                            this.f29479k.lambda$createPreferenceScreen$0(preferenceScreenM4692k, element);
                        }
                    });
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (0 == 0) {
                    return;
                }
            }
            try {
                configFileStream.close();
            } catch (IOException unused4) {
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    configFileStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNextRequestCode() {
        int i2 = this.mNextRequestCode;
        this.mNextRequestCode = i2 + 1;
        return i2;
    }

    private Object getRequestCodeObj(int code) {
        return this.mRequestCodeObjMap.get(Integer.valueOf(code));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroup$1(PreferenceCategory preferenceCategory, Element element) {
        Item itemCreateItem = createItem(element.getNodeName());
        if (itemCreateItem == null || !itemCreateItem.build(preferenceCategory, element)) {
            return;
        }
        this.mPreferenceMap.put(itemCreateItem.mId, itemCreateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void putRequestCodeObj(int code, Object obj) {
        this.mRequestCodeObjMap.put(Integer.valueOf(code), obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Object requestCodeObj = getRequestCodeObj(requestCode);
        if (requestCodeObj != null && (requestCodeObj instanceof PickerItem) && ((PickerItem) requestCodeObj).onActivityResult(resultCode, data)) {
            this.mConfigFileHelper.save();
        }
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        ActivityC0891q activity = getActivity();
        this.mConfigFileHelper = MamlConfigSettings.createConfigFileHelper(activity, activity.getIntent().getStringExtra(MamlConfigSettings.EXTRA_MAML_CODE), activity.getIntent().getStringExtra(MamlConfigSettings.EXTRA_MAML_PATH), activity.getIntent().getStringExtra(MamlConfigSettings.EXTRA_MAML_ID));
        createPreferenceScreen(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mConfigFileHelper.save();
        this.mConfigFileHelper.close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            getActivity().finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mConfigFileHelper.save();
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, Object objValue) {
        Item item = this.mPreferenceMap.get(preference.fn3e());
        if (item == null) {
            return false;
        }
        boolean zOnValueChange = item.OnValueChange(objValue);
        if (zOnValueChange) {
            this.mConfigFileHelper.save();
        }
        return zOnValueChange;
    }

    @Override // androidx.preference.Preference.InterfaceC0998q
    public boolean onPreferenceClick(Preference preference) {
        Item item = this.mPreferenceMap.get(preference.fn3e());
        return item != null && item.onClick();
    }
}
