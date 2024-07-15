package com.BookingReservation.Services;

import com.BookingReservation.Steps.Data1;
import com.BookingReservation.Steps.Response;
import com.BookingReservation.Steps.Support;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.util.Arrays;

public class BaseTests {

    RequestSpecification spec;

    public BaseTests(){
         spec = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .addFilters(Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter()))
                .build();
    }


}
