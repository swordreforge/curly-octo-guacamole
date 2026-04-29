package com.android.thememanager.settings.superwallpaper.utils;

import com.miui.maml.elements.MusicLyricParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.n */
/* JADX INFO: compiled from: DimenTool.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2665n {
    /* JADX INFO: renamed from: k */
    public static void m9280k() throws Throwable {
        BufferedReader bufferedReader;
        File file = new File("./app/res/values/dimens.xml");
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    System.out.println("生成不同分辨率：");
                    bufferedReader = new BufferedReader(new FileReader(file));
                } catch (IOException e2) {
                    e = e2;
                }
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains("</dimen>")) {
                            String strSubstring = line.substring(0, line.indexOf(">") + 1);
                            String strSubstring2 = line.substring(line.lastIndexOf("<") - 2);
                            Double dValueOf = Double.valueOf(Double.parseDouble(line.substring(line.indexOf(">") + 1, line.indexOf("</dimen>") - 2)));
                            sb.append(strSubstring);
                            sb.append(String.format("%.2f", Double.valueOf((dValueOf.doubleValue() * 3.0d) / 2.75d)));
                            sb.append(strSubstring2);
                            sb.append(MusicLyricParser.CRLF);
                        } else {
                            sb.append(line);
                            sb.append("");
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bufferedReader2 = bufferedReader;
                        e.printStackTrace();
                        if (bufferedReader2 == null) {
                            return;
                        } else {
                            bufferedReader2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                System.out.println("<!--  sw240 -->");
                System.out.println(sb);
                File file2 = new File("./app/res/values-nxhdpi/dimens.xml");
                toq(file2);
                m9281q(file2, sb.toString());
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m9281q(File file, String text) throws Throwable {
        PrintWriter printWriter;
        PrintWriter printWriter2 = null;
        try {
            try {
                printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            printWriter.println(text);
            printWriter.close();
        } catch (IOException e3) {
            e = e3;
            printWriter2 = printWriter;
            e.printStackTrace();
            printWriter2.close();
        } catch (Throwable th2) {
            th = th2;
            printWriter2 = printWriter;
            printWriter2.close();
            throw th;
        }
    }

    public static void toq(File file) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void zy(String[] args) throws Throwable {
        m9280k();
    }
}
