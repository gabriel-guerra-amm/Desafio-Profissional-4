import java.time.LocalDateTime;

public class Calendario {

	private LocalDateTime data;
	
	public Calendario(Date data) {
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public Date setData() {
		this.data = data;
	}
	
}