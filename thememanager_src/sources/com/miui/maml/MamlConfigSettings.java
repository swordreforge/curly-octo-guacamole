package com.miui.maml;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import com.android.thememanager.activity.bek6;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.util.y9n;
import com.miui.maml.util.ConfigFile;
import com.miui.maml.util.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import miui.app.constants.ResourceBrowserConstants;
import miui.content.res.ThemeResources;

/* JADX INFO: loaded from: classes3.dex */
public class MamlConfigSettings extends bek6 {
    static final String CONFIG_NAME = "config.xml";
    public static final String EXTRA_MAML_CODE = "maml_code";
    public static final String EXTRA_MAML_ID = "maml_id";
    public static final String EXTRA_MAML_PATH = "maml_path";
    static final String TAG_ROOT = "Config";

    static class ConfigFileHelper {
        protected Context mAppContext;
        protected ConfigFile mConfigFile;
        private String mPath;
        private ZipFile mZipFile;

        public ConfigFileHelper(String mamlPath, Context context) {
            this.mPath = mamlPath;
            this.mAppContext = context;
            if (mamlPath != null) {
                try {
                    this.mZipFile = new ZipFile(this.mPath);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            ConfigFile configFile = new ConfigFile();
            this.mConfigFile = configFile;
            try {
                configFile.load(getConfigPath());
            } catch (Exception | NoSuchMethodError e3) {
                Log.w("LockScreenFHelper", "no such method error: ", e3);
            }
        }

        public void close() {
            ZipFile zipFile = this.mZipFile;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }

        public boolean containsFile(String file) {
            ZipFile zipFile = this.mZipFile;
            return (zipFile == null || zipFile.getEntry(file) == null) ? false : true;
        }

        public ConfigFile getConfigFile() {
            return this.mConfigFile;
        }

        public InputStream getConfigFileStream(Locale locale) throws IOException {
            if (locale != null) {
                InputStream fileStream = getFileStream(Utils.addFileNameSuffix(MamlConfigSettings.CONFIG_NAME, locale.toString()));
                if (fileStream != null) {
                    return fileStream;
                }
                InputStream fileStream2 = getFileStream(Utils.addFileNameSuffix(MamlConfigSettings.CONFIG_NAME, locale.getLanguage()));
                if (fileStream2 != null) {
                    return fileStream2;
                }
            }
            return getFileStream(MamlConfigSettings.CONFIG_NAME);
        }

        public String getConfigPath() {
            return this.mPath + ".config";
        }

        protected InputStream getFileStream(String file) throws IOException {
            ZipEntry entry;
            ZipFile zipFile = this.mZipFile;
            if (zipFile == null || (entry = zipFile.getEntry(file)) == null) {
                return null;
            }
            return this.mZipFile.getInputStream(entry);
        }

        public void save() {
            try {
                this.mConfigFile.save(this.mAppContext);
            } catch (Exception | NoSuchMethodError e2) {
                Log.e("LockScreenFHelper", "save: ", e2);
            }
        }
    }

    static class LockscreenConfigFileHelper extends ConfigFileHelper {
        private String mId;

        public LockscreenConfigFileHelper(String id, Context context) {
            super(null, context);
            this.mId = id;
        }

        @Override // com.miui.maml.MamlConfigSettings.ConfigFileHelper
        public boolean containsFile(String file) {
            return ThemeResources.getSystem().containsAwesomeLockscreenEntry(file);
        }

        @Override // com.miui.maml.MamlConfigSettings.ConfigFileHelper
        public String getConfigPath() {
            return "/data/system/theme/config.config";
        }

        @Override // com.miui.maml.MamlConfigSettings.ConfigFileHelper
        protected InputStream getFileStream(String file) {
            return ThemeResources.getSystem().getAwesomeLockscreenFileStream(file, (long[]) null);
        }

        @Override // com.miui.maml.MamlConfigSettings.ConfigFileHelper
        public void save() {
            super.save();
            try {
                this.mConfigFile.save(ResourceBrowserConstants.MAML_CONFIG_PATH + InterfaceC1789q.gx2z + "/" + this.mId + ".config", this.mAppContext);
            } catch (Exception | NoSuchMethodError e2) {
                Log.e("LockScreenFHelper", "save: ", e2);
            }
        }
    }

    public static boolean containsConfig(String packagePath) {
        return containsConfig(packagePath, null);
    }

    public static boolean containsLockstyleConfig() {
        return ThemeResources.getSystem().containsAwesomeLockscreenEntry(CONFIG_NAME);
    }

    static ConfigFileHelper createConfigFileHelper(Context context, String code, String path, String id) {
        if (!InterfaceC1789q.gx2z.equals(code)) {
            return new ConfigFileHelper(path, context.getApplicationContext());
        }
        if (TextUtils.isEmpty(id)) {
            id = getComponentId(context, code);
        }
        return new LockscreenConfigFileHelper(id, context.getApplicationContext());
    }

    public static String getComponentId(Context c2, String code) {
        Cursor cursorQuery = c2.getContentResolver().query(Uri.parse("content://com.android.thememanager.provider/" + code), new String[]{y9n.f16911m}, null, null, null);
        if (cursorQuery != null) {
            try {
                cursorQuery.moveToFirst();
                if (cursorQuery.getCount() != 0) {
                    String string = cursorQuery.getString(0);
                    cursorQuery.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getAppCompatActionBar().mo152a(true);
        getAppCompatActionBar().xwq3(com.android.thememanager.R.string.theme_description_title_customized);
        if (savedInstanceState == null) {
            getSupportFragmentManager().ki().m4317z(android.R.id.content, new MamlConfigSettingsFragment()).qrj();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public static boolean containsConfig(String packagePath, String innerPath) {
        if (packagePath == null) {
            return false;
        }
        try {
            ZipFile zipFile = new ZipFile(packagePath);
            try {
                StringBuilder sb = new StringBuilder();
                if (innerPath == null) {
                    innerPath = "";
                }
                sb.append(innerPath);
                sb.append(CONFIG_NAME);
                boolean z2 = zipFile.getEntry(sb.toString()) != null;
                zipFile.close();
                return z2;
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
