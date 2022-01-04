package com.hcl.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Booking;
import com.hcl.repos.BookingRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepository;

	public List<Booking> getAllBookings() {
		return bookingRepository.getAllBookings();
	}

	public List<Booking> selectBookingByType(String ctype) {
		return bookingRepository.selectBookingByType(ctype);
	}

	public List<Booking> selectBookingByDate(Date start) {
		return bookingRepository.selectBookingByDate(start);
	}

	public List<Booking> selectBookingByUname(String uname) {
		return bookingRepository.selectBookingByUname(uname);
	}

	public int updateStatus(String status, Integer bid) {
		return bookingRepository.updateStatus(status, bid);
	}

	public int insertBooking(String uname, String cname, String ctype, Date start, Date end, Integer quantity) {
		return bookingRepository.insertBooking(uname, cname, ctype, start, end, quantity);
	}
}
