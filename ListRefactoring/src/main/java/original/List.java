package original;

public class List {
	private static final int INIT_SIZE = 10;
	private static final int INCREASE_SIZE = 10;

	private Object[] elementsStore = new Object[INIT_SIZE];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;

			if (newSize > elementsStore.length) {
				Object[] newElementsStore = new Object[elementsStore.length + INCREASE_SIZE];
				for (int i = 0; i < size; i++) {
					newElementsStore[i] = elementsStore[i];
				}

				elementsStore = newElementsStore;
			}

			elementsStore[size] = element;
			size++;
		}
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		return elementsStore[index];
	}
}