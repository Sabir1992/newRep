package com.BookingReservation.Steps;

import com.BookingReservation.Models.Booking;
import com.BookingReservation.Models.BookingResponse;
import com.BookingReservation.Services.BookingServives;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BookingSteps {


    BookingServives bookingServives;
    String authToken;

    BookingResponse bookingResponse;

    @Given("User yeni bir booking yaradir")
    public  void requestStart(){
         System.out.println("test1");
         bookingServives = new BookingServives();
    }

    @Given("User create ucun lazim olan datani verir")
    public void user_create_ucun_lazim_olan_datani_verir() {
       // System.out.println("test2");
        authToken = bookingServives.createToken();
    }

    @When("Booking create")
    public void booking_create_olur() {
        bookingResponse = bookingServives.createBooking();

    }

    @Then("Assertions")
    public void asssertions() {
        System.out.println("test4");
        Assertions.assertEquals("Sabir", bookingResponse.getBooking().getFirstname());
        Assertions.assertEquals("Tahirli", bookingResponse.getBooking().getLastname());
    }

    @Then("Booking ugurlu sekilde yaradildi")
    public void booking_ugurlu_sekilde_yaradildi() {
        System.out.println("test5");
        bookingServives.deleteBooking(authToken,bookingResponse.getBookingid());

    }
}
