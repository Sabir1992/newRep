package com.BookingReservation.Steps;

public class Response {

    private Data1 data;
    private Support support;


    public Response() {
    }

    public Response(Data1 data, Support support) {
        this.data = data;
        this.support = support;
    }

    public Data1 getData() {
        return data;
    }

    public void setData(Data1 data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}

