package com.hcl.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Booking;
import com.hcl.services.BookingService;
import com.hcl.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;

	@Autowired
	UserService userService;

	@GetMapping("/booking/getAllBookings")
	public List<Booking> getAllCars() {
		return bookingService.getAllBookings();
	}

	@GetMapping("/booking/getBookingByType")
	public List<Booking> selectBookingByType(@RequestParam("ctype") String ctype) {
		return bookingService.selectBookingByType(ctype);
	}

	@GetMapping("/booking/getBookingByUname")
	public List<Booking> selectBookingByUname(@RequestParam("uname") String uname) {
		return bookingService.selectBookingByUname(uname);
	}

	@GetMapping("/booking/getBookingByDate")
	public List<Booking> selectBookingByDate(@RequestParam("date") String start) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(start);
		return bookingService.selectBookingByDate(date);
	}

	@GetMapping("/booking/updateStatus")
	public int updateStatus(@RequestParam("status") String status, @RequestParam("comments") String comments,
			@RequestParam("bid") Integer bid) {
		return bookingService.updateStatus(status, comments, bid);
	}

	@PostMapping("/booking/insert")
	public int insertBooking(@RequestBody Booking booking) {
		return bookingService.insertBooking(booking.getUname(), booking.getCname(), booking.getCtype(),
				booking.getStart(), booking.getEnd(), booking.getQuantity());
	}
}
