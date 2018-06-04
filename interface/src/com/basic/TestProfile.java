package com.basic;

public class TestProfile {
	public static void printProfile(IProfile profile){
		profile.mybasicInfo();
		profile.myHobbies();
	}
public static void main(String[] args) {
	IProfile myprofile1=new VinoProfile();
	TestProfile.printProfile(myprofile1);
}
}
