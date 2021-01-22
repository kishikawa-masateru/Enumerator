package util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import element.Element;

public class TestEnumerator {

	@Test
	public void test() {
		List<Integer> l = new ArrayList<>();
		int loop_max = 10;
		for(int i = 0; i < loop_max; i++) {
			l.add(loop_max-i);
		}
		for(Element<Integer> e : Enumerator.enumerate(l)) {
			assertEquals(e.v+0, loop_max - e.i);
		}
	}

}
