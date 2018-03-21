package refactoring.chap03;

import java.util.Arrays;

public class SortSample {
	private final int[] _data;

	public SortSample(int[] data) {
		_data = new int[data.length];
		System.arraycopy(data, 0, _data, 0, data.length);
	}

	public void sort() {
	//	Arrays.sort(_data);  최종단계 리팩토링
		for (int x = 0; x < _data.length - 1; x++) {
			int m = x;
			for (int y = x + 1; y < _data.length; y++) {
				if (_data[m] > _data[y]) {
					m = y;
				}
			}
			int v = _data[m];
			_data[m] = _data[x];
			_data[x] = v;
		}
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("[");
		for (int i = 0; i < _data.length; i++) {
			buffer.append(_data[i]);
			buffer.append(", ");
		}
		buffer.append("]");
		return buffer.toString();
	}
}
