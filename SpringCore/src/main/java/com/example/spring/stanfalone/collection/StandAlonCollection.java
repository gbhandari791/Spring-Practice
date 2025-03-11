package com.example.spring.stanfalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StandAlonCollection {

	private List<String> friends;
	private Set<Long> phoneNo;
	private Map<String, Integer> age;
	private Properties props;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Long> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Set<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Map<String, Integer> getAge() {
		return age;
	}
	public void setAge(Map<String, Integer> age) {
		this.age = age;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
}
