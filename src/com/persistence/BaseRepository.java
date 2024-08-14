package com.persistence;

public interface BaseRepository {

	public default void dbConnect() {
		System.out.println("db connect");
	}

	public default void dbClose() {
		System.out.println("db close");
	}
	
	
	

}
