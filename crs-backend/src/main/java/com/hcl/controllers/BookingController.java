package com.hcl.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Booking;
import com.hcl.services.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;

	@GetMapping("/booking/getAllBookings")
	public List<Booking> getAllCars() {
		return bookingService.getAllBookings();
	}

	@GetMapping("/booking/getBookingByType")
	public Booking selectBookingByType(@RequestParam("ctype") String ctype) {
		return bookingService.selectBookingByType(ctype);
	}

	@GetMapping("/booking/getBookingByDate")
	public Booking selectBookingByDate(@RequestParam("date") String start) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(start);
		return bookingService.selectBookingByDate(date);
	}

	@GetMapping("/booking/updateStatus")
	public int updateStatus(@RequestParam("status") String status, @RequestParam("bid") Integer bid) {
		return bookingService.updateStatus(status, bid);
	}
}
