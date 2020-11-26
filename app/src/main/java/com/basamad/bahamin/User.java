package com.basamad.bahamin;

import android.provider.Contacts;

public class User {

    //Variables
    public String userLocation;
    public String userHomeAddress;
    public String userPayment;
    public String userfavorite;
    public String userSearches;

    public User(String userLocation, String userHomeAddress, String userPayment, String userfavorite, String userSearches) {
        this.userLocation = userLocation;
        this.userHomeAddress = userHomeAddress;
        this.userPayment = userPayment;
        this.userfavorite = userfavorite;
        this.userSearches = userSearches;
    }



    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserHomeAddress() {
        return userHomeAddress;
    }

    public void setUserHomeAddress(String userHomeAddress) {
        this.userHomeAddress = userHomeAddress;
    }

    public String getUserPayment() {
        return userPayment;
    }

    public void setUserPayment(String userPayment) {
        this.userPayment = userPayment;
    }

    public String getUserfavorite() {
        return userfavorite;
    }

    public void setUserfavorite(String userfavorite) {
        this.userfavorite = userfavorite;
    }

    public String getUserSearches() {
        return userSearches;
    }

    public void setUserSearches(String userSearches) {
        this.userSearches = userSearches;
    }




}
