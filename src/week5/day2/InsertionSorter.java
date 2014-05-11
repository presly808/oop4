package week5.day2;

public class InsertionSorter implements ISort {

	@Override
	public void sort(Comparable[] mas) {
		for (int i = 1; i < mas.length; i++) {
			for (int j = i; j > 0 && mas[j].compareTo(mas[j - 1]) < 0; j--) {
				Comparable temp = mas[j];
				mas[j] = mas[j - 1];
				mas[j - 1] = temp;
			}
		}
	}

}
