package com.BookingReservation.Services;

import com.BookingReservation.Models.Booking;
import com.BookingReservation.Models.BookingResponse;
import com.BookingReservation.Models.Bookingdates;
import com.BookingReservation.Models.TokenBody;
import com.BookingReservation.Steps.Data1;
import com.BookingReservation.Steps.Support;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class BookingServives extends BaseTests {

    public String createToken(){

        TokenBody tok = new TokenBody("admin","password123");

        Response response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(tok)
                .post("/auth");
        return  response.jsonPath().getJsonObject("token");
    }

    public void testsjbfsjvb(){
        Data1 data = new Data1("testEmail",44);
        Support support = new Support("test1","test2");
        com.BookingReservation.Steps.Response response1 = new com.BookingReservation.Steps.Response(data, support);
    }

    public BookingResponse createBooking(){

        Bookingdates bookingdates = new Bookingdates("2024-07-07","2024-08-08");
        Booking booking = new Booking("Sabir","Tahirli",999,
                false,bookingdates,"test");


        Response response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(booking)
                .post("/booking");

        response
                .then()
                .statusCode(200);
        return  response.as(BookingResponse.class);
    }

    public void deleteBooking(String token, int bookingid){

        Response response = given(spec)
                .contentType(ContentType.JSON)
                .header("Cookie","token="+token)
                .when()
                .delete("/booking/"+bookingid);
        response
                .then()
                .statusCode(201);
    }
}
