package com.kickstarter.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;

@ParcelablePlease
public class Photo implements Parcelable {
  String full = null;
  String little = null;
  String small = null;

  public String full() {
    return full;
  }

  public String little() {
    return little;
  }

  public String small() {
    return small;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    PhotoParcelablePlease.writeToParcel(this, dest, flags);
  }

  public static final Creator<Photo> CREATOR = new Creator<Photo>() {
    public Photo createFromParcel(Parcel source) {
      Photo target = new Photo();
      PhotoParcelablePlease.readFromParcel(target, source);
      return target;
    }

    public Photo[] newArray(int size) {
      return new Photo[size];
    }
  };
}
