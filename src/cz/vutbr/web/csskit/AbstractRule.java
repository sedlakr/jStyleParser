package cz.vutbr.web.csskit;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cz.vutbr.web.css.Rule;

public class AbstractRule<T> extends AbstractList<T> implements Rule<T> {
	
	protected List<T> list = Collections.emptyList();
	
	public List<T> asList() {
		return this.list;
	}
	
	public Rule<T> replaceAll(List<T> replacement) {
		this.list = replacement;
		return this;
	}
	
	public Rule<T> unlock() {
		this.list = new ArrayList<T>();
		return this;
	}
	
	@Override
	public int size() {
		return list.size();
	}
	
	@Override
	public T get(int index) {
		return list.get(index);
	}	
	
	@Override
	public T set(int index, T element) {
		return list.set(index, element);
	}
	
	@Override
	public void add(int index, T element) {
		list.add(index, element);
	}
	
	@Override
	public T remove(int index) {
		return list.remove(index);
	}
	
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	public boolean add(T o) {
		return list.add(o);
	};
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof AbstractRule))
			return false;
		AbstractRule<?> other = (AbstractRule<?>) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	
	
}