package org.tctam.designpatterns.structural.filter;

import java.util.List;

public class AndFilter<T> implements Filter<T> {
	private Filter<T> thisFilter;
	private Filter<T> thatFilter;

	public AndFilter(Filter<T> thisFilter, Filter<T> thatFilter) {
		this.thisFilter = thisFilter;
		this.thatFilter = thatFilter;
	}

	public List<T> filter(List<T> list) {
		List<T> firstList = this.thisFilter.filter(list);
		List<T> secondList = this.thatFilter.filter(firstList);
		return secondList;
	}
}
