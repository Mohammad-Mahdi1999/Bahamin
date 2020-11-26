package com.basamad.bahamin;

public class UserInformation {

    //Variables
    public String userFirstName;
    public String userLastName;
    public String userProfileImage;
    public String userGender;

    public UserInformation(String userFirstName, String userLastName, String userProfileImage, String userGender, String userAge)
    {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userProfileImage = userProfileImage;
        this.userGender = userGender;
        this.userAge = userAge;
    }



    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        this.userProfileImage = userProfileImage;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String userAge;



}
