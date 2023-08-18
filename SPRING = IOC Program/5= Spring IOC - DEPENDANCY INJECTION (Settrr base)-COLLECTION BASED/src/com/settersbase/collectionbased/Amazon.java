package com.settersbase.collectionbased;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Amazon {
	
	private int id;
	
	private List<String> clouth;
	
	private Set<String> electronic;
	
	private Map<Integer, String> Map;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getClouth() {
		return clouth;
	}

	public void setClouth(List<String> clouth) {
		this.clouth = clouth;
	}

	public Set<String> getElectronic() {
		return electronic;
	}

	public void setElectronic(Set<String> electronic) {
		this.electronic = electronic;
	}

	public Map<Integer, String> getMap() {
		return Map;
	}

	public void setMap(Map<Integer, String> map) {
		Map = map;
	}

	@Override
	public String toString() {
		return "Amazon [id=" + id + ", clouth=" + clouth + ", electronic=" + electronic + ", Map=" + Map + "]";
	}
	
	

}
