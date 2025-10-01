package com.hw1.model.dto;

import java.util.List;

public class Friend {

	private String name;

	public Friend() {
	}
 
	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public   void pickLeader(List<Friend> FriendList) {

		int rand = (int) (Math.random() * FriendList.size());
		Friend leader = FriendList.get(rand);
		System.out.println(leader.name+"가 떡잎마을방범대 대장이다!");
	}
}
