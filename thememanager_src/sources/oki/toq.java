package oki;

import com.miui.maml.elements.MusicLyricParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: compiled from: DimenTool.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static void m27578k() throws Throwable {
        BufferedReader bufferedReader;
        File file = new File("./keyguardtemplate/src/main/res/values/dimens.xml");
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    System.out.println("生成不同分辨率：");
                    bufferedReader = new BufferedReader(new FileReader(file));
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (IOException e3) {
                e = e3;
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
                        sb.append(dValueOf.doubleValue() * 1.5d);
                        sb.append(strSubstring2);
                        sb.append(MusicLyricParser.CRLF);
                    } else {
                        sb.append(line);
                        sb.append("");
                    }
                } catch (IOException e4) {
                    e = e4;
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
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            System.out.println("<!--  sw480 -->");
            System.out.println(sb);
            zy("./keyguardtemplate/src/main/res/values-sw480dp-land/dimens.xml", sb.toString());
            bufferedReader.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void toq(String[] strArr) throws Throwable {
        m27578k();
    }

    public static void zy(String str, String str2) {
        PrintWriter printWriter;
        PrintWriter printWriter2 = null;
        try {
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(str)));
        } catch (IOException e2) {
            e = e2;
        }
        try {
            printWriter.println(str2);
        } catch (IOException e3) {
            e = e3;
            printWriter2 = printWriter;
            e.printStackTrace();
            printWriter = printWriter2;
        }
        printWriter.close();
    }
}
