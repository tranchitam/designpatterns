package org.tctam.designpatterns.structural.filter;

import java.util.List;

public class OrFilter<T> implements Filter<T> {
	private Filter<T> thisFilter;
	private Filter<T> thatFilter;

	public OrFilter(Filter<T> thisFilter, Filter<T> thatFilter) {
		this.thisFilter = thisFilter;
		this.thatFilter = thatFilter;
	}

	public List<T> filter(List<T> list) {
		List<T> firstList = this.thisFilter.filter(list);
		List<T> secondList = this.thatFilter.filter(list);
		firstList.addAll(secondList);
		return firstList;
	}
}
