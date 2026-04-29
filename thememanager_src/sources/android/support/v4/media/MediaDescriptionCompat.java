package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel in) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(in));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int size) {
            return new MediaDescriptionCompat[size];
        }
    };

    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";

    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    @hyr(21)
    private static class Api21Impl {
        private Api21Impl() {
        }

        @InterfaceC7830i
        static MediaDescription build(MediaDescription.Builder builder) {
            return builder.build();
        }

        @InterfaceC7830i
        static MediaDescription.Builder createBuilder() {
            return new MediaDescription.Builder();
        }

        @InterfaceC7830i
        @dd
        static CharSequence getDescription(MediaDescription description) {
            return description.getDescription();
        }

        @InterfaceC7830i
        @dd
        static Bundle getExtras(MediaDescription description) {
            return description.getExtras();
        }

        @InterfaceC7830i
        @dd
        static Bitmap getIconBitmap(MediaDescription description) {
            return description.getIconBitmap();
        }

        @InterfaceC7830i
        @dd
        static Uri getIconUri(MediaDescription description) {
            return description.getIconUri();
        }

        @InterfaceC7830i
        @dd
        static String getMediaId(MediaDescription description) {
            return description.getMediaId();
        }

        @InterfaceC7830i
        @dd
        static CharSequence getSubtitle(MediaDescription description) {
            return description.getSubtitle();
        }

        @InterfaceC7830i
        @dd
        static CharSequence getTitle(MediaDescription description) {
            return description.getTitle();
        }

        @InterfaceC7830i
        static void setDescription(MediaDescription.Builder builder, @dd CharSequence description) {
            builder.setDescription(description);
        }

        @InterfaceC7830i
        static void setExtras(MediaDescription.Builder builder, @dd Bundle extras) {
            builder.setExtras(extras);
        }

        @InterfaceC7830i
        static void setIconBitmap(MediaDescription.Builder builder, @dd Bitmap icon) {
            builder.setIconBitmap(icon);
        }

        @InterfaceC7830i
        static void setIconUri(MediaDescription.Builder builder, @dd Uri iconUri) {
            builder.setIconUri(iconUri);
        }

        @InterfaceC7830i
        static void setMediaId(MediaDescription.Builder builder, @dd String mediaId) {
            builder.setMediaId(mediaId);
        }

        @InterfaceC7830i
        static void setSubtitle(MediaDescription.Builder builder, @dd CharSequence subtitle) {
            builder.setSubtitle(subtitle);
        }

        @InterfaceC7830i
        static void setTitle(MediaDescription.Builder builder, @dd CharSequence title) {
            builder.setTitle(title);
        }
    }

    @hyr(23)
    private static class Api23Impl {
        private Api23Impl() {
        }

        @InterfaceC7830i
        @dd
        static Uri getMediaUri(MediaDescription description) {
            return description.getMediaUri();
        }

        @InterfaceC7830i
        static void setMediaUri(MediaDescription.Builder builder, @dd Uri mediaUri) {
            builder.setMediaUri(mediaUri);
        }
    }

    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }

        public Builder setDescription(@dd CharSequence description) {
            this.mDescription = description;
            return this;
        }

        public Builder setExtras(@dd Bundle extras) {
            this.mExtras = extras;
            return this;
        }

        public Builder setIconBitmap(@dd Bitmap icon) {
            this.mIcon = icon;
            return this;
        }

        public Builder setIconUri(@dd Uri iconUri) {
            this.mIconUri = iconUri;
            return this;
        }

        public Builder setMediaId(@dd String mediaId) {
            this.mMediaId = mediaId;
            return this;
        }

        public Builder setMediaUri(@dd Uri mediaUri) {
            this.mMediaUri = mediaUri;
            return this;
        }

        public Builder setSubtitle(@dd CharSequence subtitle) {
            this.mSubtitle = subtitle;
            return this;
        }

        public Builder setTitle(@dd CharSequence title) {
            this.mTitle = title;
            return this;
        }
    }

    MediaDescriptionCompat(String mediaId, CharSequence title, CharSequence subtitle, CharSequence description, Bitmap icon, Uri iconUri, Bundle extras, Uri mediaUri) {
        this.mMediaId = mediaId;
        this.mTitle = title;
        this.mSubtitle = subtitle;
        this.mDescription = description;
        this.mIcon = icon;
        this.mIconUri = iconUri;
        this.mExtras = extras;
        this.mMediaUri = mediaUri;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object descriptionObj) {
        Bundle bundle = null;
        if (descriptionObj == null) {
            return null;
        }
        Builder builder = new Builder();
        MediaDescription mediaDescription = (MediaDescription) descriptionObj;
        builder.setMediaId(Api21Impl.getMediaId(mediaDescription));
        builder.setTitle(Api21Impl.getTitle(mediaDescription));
        builder.setSubtitle(Api21Impl.getSubtitle(mediaDescription));
        builder.setDescription(Api21Impl.getDescription(mediaDescription));
        builder.setIconBitmap(Api21Impl.getIconBitmap(mediaDescription));
        builder.setIconUri(Api21Impl.getIconUri(mediaDescription));
        Bundle extras = Api21Impl.getExtras(mediaDescription);
        if (extras != null) {
            extras = MediaSessionCompat.unparcelWithClassLoader(extras);
        }
        Uri uri = extras != null ? (Uri) extras.getParcelable(DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uri == null) {
            bundle = extras;
        } else if (!extras.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || extras.size() != 2) {
            extras.remove(DESCRIPTION_KEY_MEDIA_URI);
            extras.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = extras;
        }
        builder.setExtras(bundle);
        if (uri != null) {
            builder.setMediaUri(uri);
        } else {
            builder.setMediaUri(Api23Impl.getMediaUri(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = builder.build();
        mediaDescriptionCompatBuild.mDescriptionFwk = mediaDescription;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @dd
    public CharSequence getDescription() {
        return this.mDescription;
    }

    @dd
    public Bundle getExtras() {
        return this.mExtras;
    }

    @dd
    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    @dd
    public Uri getIconUri() {
        return this.mIconUri;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderCreateBuilder = Api21Impl.createBuilder();
        Api21Impl.setMediaId(builderCreateBuilder, this.mMediaId);
        Api21Impl.setTitle(builderCreateBuilder, this.mTitle);
        Api21Impl.setSubtitle(builderCreateBuilder, this.mSubtitle);
        Api21Impl.setDescription(builderCreateBuilder, this.mDescription);
        Api21Impl.setIconBitmap(builderCreateBuilder, this.mIcon);
        Api21Impl.setIconUri(builderCreateBuilder, this.mIconUri);
        Api21Impl.setExtras(builderCreateBuilder, this.mExtras);
        Api23Impl.setMediaUri(builderCreateBuilder, this.mMediaUri);
        MediaDescription mediaDescriptionBuild = Api21Impl.build(builderCreateBuilder);
        this.mDescriptionFwk = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    @dd
    public String getMediaId() {
        return this.mMediaId;
    }

    @dd
    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    @dd
    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    @dd
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((MediaDescription) getMediaDescription()).writeToParcel(dest, flags);
    }

    MediaDescriptionCompat(Parcel in) {
        this.mMediaId = in.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.mDescription = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) in.readParcelable(classLoader);
        this.mIconUri = (Uri) in.readParcelable(classLoader);
        this.mExtras = in.readBundle(classLoader);
        this.mMediaUri = (Uri) in.readParcelable(classLoader);
    }
}
