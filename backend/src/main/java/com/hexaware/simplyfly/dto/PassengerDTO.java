package com.hexaware.simplyfly.dto;

import lombok.*;
/**
 * PassengerDTO represents passenger details required during flight booking.
 * It includes full name, age, and gender of a passenger.
 *
 * This DTO is used as part of the BookingRequest to handle multiple passengers.
 *
 * Developer: N Lohith Reddy  
 * Created on: May 30, 2025  
 * Last Modified: May 31, 2025  
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDTO {
    private String fullName;
    private int age;
    private String gender;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
    
}
