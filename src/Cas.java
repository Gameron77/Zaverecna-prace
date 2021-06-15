
public class Cas {
int den;
int mesic;
int rok;
int hodiny;
int minuty;
public Cas(int den, int mesic, int rok, int hodiny, int minuty) {
	super();
	this.den = den;
	this.mesic = mesic;
	this.rok = rok;
	this.hodiny = hodiny;
	this.minuty = minuty;
}

public String toString() {
	return  +den +"."+mesic +"."+rok +" V "+hodiny +":"+minuty; 
}}


