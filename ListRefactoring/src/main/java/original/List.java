package original;

public class List {
	private static final int INIT_SIZE = 10;
	private static final int INCREASE_SIZE = 10;

	private Object[] elements = new Object[INIT_SIZE];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;

			if (newSize > elements.length) {
				Object[] newElements = new Object[elements.length + INCREASE_SIZE];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}

				elements = newElements;
			}

			elements[size] = element;
			size++;
		}
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		return elements[index];
	}
}