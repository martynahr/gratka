package app.model;

public class LoginModel {

	private String first_name;
	private String last_name;
	private boolean cbbazydanych;
	private boolean cbpython;
	private boolean cbjava;
	private boolean cbfrontend;
	private boolean cbspring;
	private int tfiloscpytan;
	public boolean isCbbazydanych() {
		return cbbazydanych;
	}

	public void setCbbazydanych(boolean cbbazydanych) {
		this.cbbazydanych = cbbazydanych;
	}

	public boolean isCbpython() {
		return cbpython;
	}

	public void setCbpython(boolean cbpython) {
		this.cbpython = cbpython;
	}

	public boolean isCbjava() {
		return cbjava;
	}

	public void setCbjava(boolean cbjava) {
		this.cbjava = cbjava;
	}

	public boolean isCbfrontend() {
		return cbfrontend;
	}

	public void setCbfrontend(boolean cbfrontend) {
		this.cbfrontend = cbfrontend;
	}

	public boolean isCbspring() {
		return cbspring;
	}

	public void setCbspring(boolean cbspring) {
		this.cbspring = cbspring;
	}

	
	public LoginModel() {
		super();
	}
	
	public LoginModel(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getTfiloscpytan() {
		return tfiloscpytan;
	}

	public void setTfiloscpytan(int tfiloscpytan) {
		this.tfiloscpytan = tfiloscpytan;
	}
	
	
	
}
