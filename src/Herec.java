
public class Herec {
String jmeno;
int vek;
Pohlavi pohlavi;
public Herec(String jmeno, int vek, Pohlavi pohlavi) {
	super();
	this.jmeno = jmeno;
	this.vek = vek;
	this.pohlavi = pohlavi;
}

public String toString() {
	return "Herec: " + jmeno +", V�k herce: " + vek +", Pohlav� herce: " + pohlavi;
}

}
