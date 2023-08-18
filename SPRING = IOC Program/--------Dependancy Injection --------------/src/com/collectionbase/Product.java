package com.collectionbase;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {

	private int id;

	private List<String> Pname;

	private Set<String> electronic;

	private Map<Integer, String> map;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getPname() {
		return Pname;
	}

	public void setPname(List<String> pname) {
		Pname = pname;
	}

	public Set<String> getElectronic() {
		return electronic;
	}

	public void setElectronic(Set<String> electronic) {
		this.electronic = electronic;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Pname=" + Pname + ", electronic=" + electronic + ", map=" + map + "]";
	}

}
