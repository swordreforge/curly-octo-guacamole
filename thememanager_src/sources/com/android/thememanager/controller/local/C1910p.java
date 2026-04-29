package com.android.thememanager.controller.local;

import com.android.thememanager.basemodule.local.AbstractC1753q;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.p */
/* JADX INFO: compiled from: LocalSerializableDataParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1910p extends AbstractC1753q {
    public C1910p(fu4 context) {
        super(context.getNewResourceContext());
    }

    @Override // com.android.thememanager.basemodule.local.AbstractC1753q
    /* JADX INFO: renamed from: k */
    public Resource mo6852k(File file) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (StreamCorruptedException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        } catch (Exception e6) {
            e = e6;
        }
        try {
            Resource resource = (Resource) objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            return resource;
        } catch (FileNotFoundException e8) {
            e = e8;
            throw new C1743g(e.getMessage());
        } catch (StreamCorruptedException e9) {
            e = e9;
            throw new C1743g(e.getMessage());
        } catch (IOException e10) {
            e = e10;
            throw new C1743g(e.getMessage());
        } catch (Exception e11) {
            e = e11;
            throw new C1743g(e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                try {
                    objectInputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // com.android.thememanager.basemodule.local.AbstractC1753q
    public void toq(File file, Resource resource) throws C1743g {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        try {
            objectOutputStream.writeObject(resource);
            try {
                objectOutputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            throw new C1743g(e.getMessage());
        } catch (IOException e7) {
            e = e7;
            throw new C1743g(e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }
}
