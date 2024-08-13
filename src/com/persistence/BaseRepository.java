package com.persistence;

public interface BaseRepository {

	public default void dbConnect() {
		System.out.println("db connect");
	}

	public default void dbClose() {
		System.out.println("db close");
	}
	
	public void save();
	public void delete();
	public void getAll();
	public void getOne();
	public void put();
	
	
	

}
