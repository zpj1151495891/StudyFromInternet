package com.suray.springStudy.DI.Collection;

import java.util.*;

public class JavaCollection {
	private List<Object> addressList;
	private Set<Object> addressSet;
	private Map<Object,Object> addressMap;
	private Properties addressProp;
	
	public void setAddressList(List<Object> addressList) {
		this.addressList=addressList;
	}
	public List<Object> getAddressList() {
		System.out.println("List Elements :"  + addressList);
		return addressList;
	}
	
	public void setAddressSet(Set<Object> addressSet) {
		
		this.addressSet=addressSet;
	}
	public Set<Object> getAddressSet(){
		System.out.println("Set Elements :"  + addressSet);
		return addressSet;
	}
	
	public void setAddressMap(Map<Object,Object> addressMap) {
		this.addressMap=addressMap;
	}
	public Map<Object,Object> getAddressMap(){
		System.out.println("Map Elements :"  + addressMap);
		return addressMap;
	}
	
	public void setAddressProp(Properties addressProp) {
		this.addressProp=addressProp;
	}
	public Properties getAddressProp() {
		System.out.println("Property Elements :"  + addressProp);
		return addressProp;
	}
	

}
