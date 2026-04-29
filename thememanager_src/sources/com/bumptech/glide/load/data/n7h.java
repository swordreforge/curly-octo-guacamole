package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: StreamLocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h extends x2<InputStream> {

    /* JADX INFO: renamed from: h */
    private static final int f18227h = 4;

    /* JADX INFO: renamed from: i */
    private static final int f18228i = 5;

    /* JADX INFO: renamed from: p */
    private static final int f18229p = 3;

    /* JADX INFO: renamed from: s */
    private static final int f18230s = 2;

    /* JADX INFO: renamed from: y */
    private static final int f18231y = 1;

    /* JADX INFO: renamed from: z */
    private static final UriMatcher f18232z;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f18232z = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n7h(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: renamed from: p */
    private InputStream m10649p(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* JADX INFO: renamed from: s */
    private InputStream m10650s(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f18232z.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m10649p(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m10649p(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.x2
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public void zy(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: k */
    public Class<InputStream> mo10634k() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.x2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InputStream mo10635q(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM10650s = m10650s(uri, contentResolver);
        if (inputStreamM10650s != null) {
            return inputStreamM10650s;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
