package week5.day2;

public class C {
	
	private ISort sorter;
	private Comparable[] mas;
	
	public void sortAll(){
		sorter.sort(mas);
	}

	public ISort getSorter() {
		return sorter;
	}

	public void setSorter(ISort sorter) {
		this.sorter = sorter;
	}

	public Comparable[] getMas() {
		return mas;
	}

	public void setMas(Comparable[] mas) {
		this.mas = mas;
	}
	
	
	
}
