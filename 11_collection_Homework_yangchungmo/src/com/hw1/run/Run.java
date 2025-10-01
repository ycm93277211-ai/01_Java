package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;


public class Run {

	public static void main(String[] args) {

		
	 List<Friend> FriendList = new ArrayList<>();
		
	 FriendList.add (new Friend("짱구"));
	 FriendList.add (new Friend("철수"));
	 FriendList.add (new Friend("유리"));
	 FriendList.add (new Friend("훈이"));
	 FriendList.add (new Friend("맹구"));
		
	 Friend friends = new Friend();
	 
	 friends.pickLeader(FriendList);
	
	

	}
}
