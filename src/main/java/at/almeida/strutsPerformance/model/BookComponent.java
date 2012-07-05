package at.almeida.strutsPerformance.model;

public class BookComponent {


	public BookComponent() {
		super();
	}
	

	public BookComponent(String title) {
		super();
		this.title = title;
	}


	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
