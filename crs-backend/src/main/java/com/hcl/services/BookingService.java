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

	public Booking selectBookingByType(String ctype) {
		return bookingRepository.selectBookingByType(ctype);
	}

	public Booking selectBookingByDate(Date start) {
		return bookingRepository.selectBookingByDate(start);
	}

	public int updateStatus(String status, Integer bid) {
		return bookingRepository.updateStatus(status, bid);
	}

}
