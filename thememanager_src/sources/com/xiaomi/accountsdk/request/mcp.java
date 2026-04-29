package com.xiaomi.accountsdk.request;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

/* JADX INFO: compiled from: UploadFileRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public class mcp {

    /* JADX INFO: renamed from: k */
    private static final String f30965k = "\r\n";

    /* JADX INFO: renamed from: k */
    public static String m18971k(String str, InputStream inputStream, String str2, String str3) throws n7h, IOException {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                byte[] bArr = new byte[16];
                new Random().nextBytes(bArr);
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(com.google.common.net.zy.f68524kja0, "Keep-Alive");
                httpURLConnection.setRequestProperty(com.google.common.net.zy.f68571zy, "multipart/form-data;boundary=" + strEncodeToString);
                httpURLConnection.setRequestProperty(com.google.common.net.zy.f27254k, "no-cache");
                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream2.writeBytes("--" + strEncodeToString + "\r\n");
                    dataOutputStream2.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str3 + "\"\r\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Content-Type: ");
                    sb.append(toq(str3));
                    sb.append("\r\n");
                    dataOutputStream2.writeBytes(sb.toString());
                    dataOutputStream2.writeBytes("\r\n");
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int i2 = inputStream.read(bArr2);
                        if (i2 == -1) {
                            break;
                        }
                        dataOutputStream2.write(bArr2, 0, i2);
                    }
                    dataOutputStream2.flush();
                    dataOutputStream2.writeBytes("\r\n");
                    dataOutputStream2.flush();
                    dataOutputStream2.writeBytes("--" + strEncodeToString + "--\r\n");
                    dataOutputStream2.flush();
                    inputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new n7h(responseCode, "failed to upload file");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()), 1024);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (Throwable th) {
                            com.xiaomi.accountsdk.utils.ki.zy(bufferedReader);
                            throw th;
                        }
                    }
                    com.xiaomi.accountsdk.utils.ki.zy(bufferedReader);
                    String string = sb2.toString();
                    try {
                        dataOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    httpURLConnection.disconnect();
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (httpURLConnection == null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    private static String toq(String str) {
        return (str.endsWith("png") || str.endsWith(com.android.thememanager.basemodule.analysis.toq.gd)) ? "image/png" : "image/jpg";
    }
}
