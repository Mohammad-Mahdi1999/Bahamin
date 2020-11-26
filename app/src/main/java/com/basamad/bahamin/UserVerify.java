package com.basamad.bahamin;

public class UserVerify {

    //Variables
    public Boolean isUserVerified;
    public String userName;
    public String userID;
    public String userPassword;
    public String userPhoneNumber;

    Register register;

    public UserVerify(Boolean isUserVerified, String userName, String userID, String userPassword, String userPhoneNumber) {

        this.isUserVerified = isUserVerified;
        this.userName = userName;
        this.userID = userID;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
    }
}
