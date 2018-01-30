package cn.bdqn.HomeSys.entity;

import java.sql.Timestamp;

public class Reserve {
	private Integer Id;
	private String name;
	private String phone;
	private Timestamp startTime;
	private Timestamp endTime;
	private Roomtype roomtype;
	private Room room;
	
	public Reserve(){}

	public Reserve(Integer id, String name, String phone, Timestamp startTime,
			Timestamp endTime, Roomtype roomtype, Room room) {
		super();
		Id = id;
		this.name = name;
		this.phone = phone;
		this.startTime = startTime;
		this.endTime = endTime;
		this.roomtype = roomtype;
		this.room = room;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Roomtype getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
}