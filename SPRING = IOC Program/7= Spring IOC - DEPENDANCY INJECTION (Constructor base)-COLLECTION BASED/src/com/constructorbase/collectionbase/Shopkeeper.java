package com.constructorbase.collectionbase;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shopkeeper {

	private int id;

	private String sname;

	private List<String> items;

	private Set<String> peans;

	private Map<Integer, String> map;

	public Shopkeeper(int id, String sname, List<String> items, Set<String> peans, Map<Integer, String> map) {
		super();
		this.id = id;
		this.sname = sname;
		this.items = items;
		this.peans = peans;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Shopkeeper [id=" + id + ", sname=" + sname + ", items=" + items + ", peans=" + peans + ", map=" + map
				+ "]";
	}

}
