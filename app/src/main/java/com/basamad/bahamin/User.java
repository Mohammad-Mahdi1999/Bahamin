package com.basamad.bahamin;

import android.provider.Contacts;

public class User {

    public User(String userLocation, String userHomeAddress, String userPayment, String userfavorite, String userSearches) {
        this.userLocation = userLocation;
        this.userHomeAddress = userHomeAddress;
        this.userPayment = userPayment;
        this.userfavorite = userfavorite;
        this.userSearches = userSearches;
    }

    public String userLocation;
    public String userHomeAddress;
    public String userPayment;
    public String userfavorite;
    public String userSearches;



}
