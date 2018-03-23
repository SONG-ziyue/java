package com.dao;

import java.util.List;

import com.model.Hospital;

public interface HospitalDao {
	public void insert(Hospital hospital);

	public void delete(Hospital hospital);

	public Hospital update(Hospital hospital);
	
	public Hospital query(int id);

	public List<Hospital> query(String region);

	public List<Hospital> query();

}
