package com.xiaomi.settingsdk.backup;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.settingsdk.backup.data.DataPackage;
import com.xiaomi.settingsdk.backup.data.SettingItem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsBackupHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f34367k = "SettingsBackup";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73785toq = "version";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f73786zy = "data";

    private zy() {
    }

    public static void f7l8(Context context, ParcelFileDescriptor parcelFileDescriptor, InterfaceC5976k interfaceC5976k) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(parcelFileDescriptor.getFileDescriptor()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (JSONException e3) {
            e = e3;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String property = System.getProperty("line.separator");
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(property);
            }
            JSONObject jSONObject = new JSONObject(sb.toString());
            if (jSONObject.length() > 0) {
                int iOptInt = jSONObject.optInt("version");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                DataPackage dataPackage = new DataPackage();
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            SettingItem<?> settingItemM22212p = SettingItem.m22212p(jSONObjectOptJSONObject);
                            dataPackage.toq(settingItemM22212p.f34362k, settingItemM22212p);
                        }
                    }
                }
                interfaceC5976k.toq(context, dataPackage, iOptInt);
            }
            m22225q(bufferedReader);
        } catch (IOException e4) {
            e = e4;
            bufferedReader2 = bufferedReader;
            Log.e("SettingsBackup", "IOException in restoreSettings", e);
            m22225q(bufferedReader2);
        } catch (JSONException e6) {
            e = e6;
            bufferedReader2 = bufferedReader;
            Log.e("SettingsBackup", "JSONException in restoreSettings", e);
            m22225q(bufferedReader2);
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            m22225q(bufferedReader2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.OutputStream] */
    /* JADX INFO: renamed from: g */
    public static void m22222g(String str, ParcelFileDescriptor parcelFileDescriptor) throws Throwable {
        ?? r7;
        FileInputStream fileInputStream;
        IOException e2;
        FileOutputStream fileOutputStream;
        FileNotFoundException e3;
        byte[] bArr;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e4) {
            fileInputStream = null;
            e3 = e4;
            fileOutputStream = null;
        } catch (IOException e6) {
            fileInputStream = null;
            e2 = e6;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            r7 = 0;
            toq(fileInputStream2);
            zy(r7);
            throw th;
        }
        try {
            new File(str.substring(0, str.lastIndexOf(File.separator))).mkdirs();
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                bArr = new byte[1024];
            } catch (FileNotFoundException e7) {
                e3 = e7;
                Log.e("SettingsBackup", "FileNotFoundException in restoreFiles: " + str, e3);
            } catch (IOException e8) {
                e2 = e8;
                Log.e("SettingsBackup", "IOException in restoreFiles: " + str, e2);
            }
        } catch (FileNotFoundException e9) {
            e3 = e9;
            fileOutputStream = null;
        } catch (IOException e10) {
            e2 = e10;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = null;
            fileInputStream2 = fileInputStream;
            r7 = parcelFileDescriptor;
            toq(fileInputStream2);
            zy(r7);
            throw th;
        }
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 <= 0) {
                break;
            } else {
                fileOutputStream.write(bArr, 0, i2);
            }
            toq(fileInputStream);
            zy(fileOutputStream);
        }
        fileOutputStream.flush();
        toq(fileInputStream);
        zy(fileOutputStream);
    }

    /* JADX INFO: renamed from: k */
    public static DataPackage m22223k(Context context, ParcelFileDescriptor parcelFileDescriptor, InterfaceC5976k interfaceC5976k) throws Throwable {
        JSONException e2;
        IOException e3;
        FileOutputStream fileOutputStream;
        DataPackage dataPackage = new DataPackage();
        interfaceC5976k.mo7413k(context, dataPackage);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Collection<SettingItem<?>> collectionValues = dataPackage.getDataItems().values();
        FileOutputStream fileOutputStream2 = null;
        try {
            if (collectionValues != null) {
                try {
                    Iterator<SettingItem<?>> it = collectionValues.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().toJson());
                    }
                    jSONObject.put("packageName", context.getPackageName());
                    jSONObject.put("version", interfaceC5976k.zy(context));
                    jSONObject.put("data", jSONArray);
                } catch (IOException e4) {
                    e3 = e4;
                    Log.e("SettingsBackup", "IOException in backupSettings", e3);
                    zy(fileOutputStream2);
                    return dataPackage;
                } catch (JSONException e6) {
                    e2 = e6;
                    Log.e("SettingsBackup", "JSONException in backupSettings", e2);
                    zy(fileOutputStream2);
                    return dataPackage;
                }
            }
            fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(jSONObject.toString().getBytes(wvg.f72949toq));
            fileOutputStream.flush();
            fileOutputStream.close();
            zy(fileOutputStream);
        } catch (IOException e7) {
            fileOutputStream2 = fileOutputStream;
            e3 = e7;
            Log.e("SettingsBackup", "IOException in backupSettings", e3);
            zy(fileOutputStream2);
        } catch (JSONException e8) {
            fileOutputStream2 = fileOutputStream;
            e2 = e8;
            Log.e("SettingsBackup", "JSONException in backupSettings", e2);
            zy(fileOutputStream2);
        } catch (Throwable th2) {
            fileOutputStream2 = fileOutputStream;
            th = th2;
            zy(fileOutputStream2);
            throw th;
        }
        return dataPackage;
    }

    /* JADX INFO: renamed from: n */
    public static void m22224n(DataPackage dataPackage) throws Throwable {
        for (Map.Entry<String, ParcelFileDescriptor> entry : dataPackage.getFileItems().entrySet()) {
            m22222g(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m22225q(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void toq(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void zy(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException unused) {
            }
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
        }
    }
}
