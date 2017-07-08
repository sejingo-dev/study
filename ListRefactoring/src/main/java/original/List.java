package original;

public class List {
	private static final int INIT_SIZE = 10;
	private static final int INCREASE_SIZE = 10;

	private Object[] elementsStore = new Object[INIT_SIZE];
	private boolean readOnly;
	private int size = 0;

	public void add(Object element) {
		if (!readOnly) {
			if (isElementsStoreFull()) {
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

	private boolean isElementsStoreFull() {
		return size + 1 > elementsStore.length;
	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		return elementsStore[index];
	}
}