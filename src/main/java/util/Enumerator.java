package util;

import java.util.Collections;
import java.util.Iterator;

import element.Element;

/**
 *
 * @author masa
 *
 */
public class Enumerator<T extends Collections> implements Iterable<Element<T>>{

	private Collections collection;

	@Override
	public Iterator<Element<T>> iterator() {
		return new Iterator<Element<T>>(){

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Element<T> next() {
				// TODO 自動生成されたメソッド・スタブ
				return null;
			}

			@Override
			public void remove() {
				// TODO 自動生成されたメソッド・スタブ

			}

		};
	}

}
