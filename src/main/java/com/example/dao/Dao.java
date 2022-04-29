package com.example.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
	List<T> list();
	
	int create(T t);
	
	
	int update(T t,int id);
	
	int delete(int id);


}
