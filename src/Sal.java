import java.util.ArrayList;

public class Sal {
	

int cisloSalu;
ArrayList<Film> seznamFilmu = new ArrayList<Film>();

public Sal(int cisloSalu) {
	super();
	this.cisloSalu = cisloSalu;

}
public void addFilm(Film film) {
seznamFilmu.add(film);
}

public String toString() {
	return "V salu " + cisloSalu +" se bude promítat " + seznamFilmu ;
}

}

