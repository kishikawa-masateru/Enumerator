package element;

/**
 * ループ要素
 * @author masa
 *
 */
public class Element<T>{
	public T v;		// i番目の要素
	public int i;	// リストのインデックス
	public Element(T v, int i) {
		this.v = v;
		this.i = i;
	}

	@Override
	public String toString() {
		return v.toString();
	}
}
