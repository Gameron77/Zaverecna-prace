import java.util.ArrayList;

public class Film {
	
ArrayList<Herec> seznamHercu = new ArrayList<Herec>();
String jmeno;
Zanr zanr;
Cas cas;


public Film( String jmeno, Zanr zanr, Cas cas) {
	super();
	
	this.jmeno = jmeno;
	this.zanr = zanr;
	this.cas = cas;
}


public void addHerec(Herec herec) {
seznamHercu.add(herec);
}



public String toString() {
	return  cas + " Jm�no filmu: "+ jmeno  +", �anr filmu je: " + zanr + ", Hraj�: " + seznamHercu;
}

}
