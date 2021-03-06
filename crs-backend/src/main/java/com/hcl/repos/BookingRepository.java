package com.hcl.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.model.Booking;

@Repository
@Transactional
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	@Query(value = "select * from booking", nativeQuery = true)
	public List<Booking> getAllBookings();

	@Query(value = "select * from booking where ctype=?1", nativeQuery = true)
	public List<Booking> selectBookingByType(String ctype);

	@Query(value = "select * from booking where uname=?1", nativeQuery = true)
	public List<Booking> selectBookingByUname(String uname);

	@Query(value = "select * from booking where start=?1", nativeQuery = true)
	public List<Booking> selectBookingByDate(Date start);

	@Modifying
	@Query(value = "update booking set status1=?1, comments=?2 where bid=?3", nativeQuery = true)
	public int updateStatus(String status, String comments, Integer bid);

	@Modifying
	@Query(value = "insert into booking (uname, cname, ctype, start, end, quantity) values (?1,?2,?3,?4,?5,?6)", nativeQuery = true)
	public int insertBooking(String uname, String cname, String ctype, Date start, Date end, Integer quantity);

}
