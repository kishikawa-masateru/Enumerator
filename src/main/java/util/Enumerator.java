package util;

import java.util.Collection;
import java.util.Iterator;

import element.Element;

/**
 *	Pythonの enumerate をJavaで実装したクラス
 * @author masa
 *
 */
public class Enumerator<T> implements Iterable<Element<T>>{

	// enumerate 対象のコレクション
	private int index;
	private T[] array;

	@SuppressWarnings("unchecked")
	public Enumerator(Collection<T> t) {
		this.array = (T[]) t.toArray();
		this.index = 0;
	}

	/**
	 *
	 * @param <T> コレクションの要素の型
	 * @param t
	 * @return
	 */
	public  static <T> Enumerator<T> enumerate(Collection<T> t){
		return new Enumerator<>(t);
	}

	@Override
	public Iterator<Element<T>> iterator() {
		return new Iterator<Element<T>>(){
			@Override
			public boolean hasNext() {
				return array.length > index;
			}

			@Override
			public Element<T> next() {
				return new Element<>(array[index], index++);
			}

			@Override
			public void remove() {

			}
		};
	}
}