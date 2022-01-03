package com.hcl.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.model.Car;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car, Integer> {

	@Query(value = "select * from car", nativeQuery = true)
	public List<Car> getAllCars();

	@Modifying
	@Query(value = "insert into car (cname,ctype) values (?1,?2)", nativeQuery = true)
	public int insertCar(String cname, String ctype);

	@Query(value = "select * from car where cname=?1", nativeQuery = true)
	public Car selectCarByName(String cname);

	@Query(value = "select * from car where cid=?1", nativeQuery = true)
	public Car selectCarById(Integer cid);

	@Modifying
	@Query(value = "update car set cname=?2 where cid=?1", nativeQuery = true)
	public int updateCar(Integer cid, String cname2);

	@Modifying
	@Query(value = "delete from car where cname=?", nativeQuery = true)
	public int deleteCar(String cname);

}
