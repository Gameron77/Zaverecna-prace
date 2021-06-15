import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	PrintWriter writer = new PrintWriter("vypis.txt");
	writer.print("");
	writer.close();
	PrintStream stream = new PrintStream("vypis.txt"); 
	System.setOut(stream);
	
	Herec herec1 = new Herec("Emma",28, Pohlavi.ZENA );
	Herec herec2 = new Herec("Viki",22, Pohlavi.ZENA );
	Herec herec3 = new Herec("Krystof",30, Pohlavi.MUZ );
	Herec herec4 = new Herec("Martin",29, Pohlavi.MUZ );
	Herec herec5 = new Herec("Ales",27, Pohlavi.MUZ );
	
	Herec herec6 = new Herec("Anna",18, Pohlavi.ZENA );
	Herec herec7 = new Herec("Laduška",20, Pohlavi.ZENA );
	Herec herec8 = new Herec("Adam",19, Pohlavi.MUZ );
	Herec herec9 = new Herec("Tomáš",21, Pohlavi.MUZ );
	Herec herec10 = new Herec("Marek",22, Pohlavi.MUZ );
	
	Herec herec11 = new Herec("Karolína",16, Pohlavi.ZENA );
	Herec herec12 = new Herec("Tereza",15, Pohlavi.ZENA );
	Herec herec13 = new Herec("Jaroslav",14, Pohlavi.MUZ );
	Herec herec14 = new Herec("Jakub",18, Pohlavi.MUZ );
	Herec herec15 = new Herec("Richard",17, Pohlavi.MUZ );
	
	Film film1 = new Film("Bratislava moje mìsto", Zanr.ROMANTICKY, new Cas (11, 6, 2021, 13, 30));
    film1.addHerec(herec1);
    film1.addHerec(herec2);
    film1.addHerec(herec3);
    film1.addHerec(herec4);
    film1.addHerec(herec5);
    
    
    Film film2 = new Film("Liána", Zanr.AKCNI, new Cas (12, 6, 2021, 15, 45));
    film2.addHerec(herec6);
    film2.addHerec(herec7);
    film2.addHerec(herec8);
    film2.addHerec(herec9);
    film2.addHerec(herec10);
    
    Film film3 = new Film("Výlet", Zanr.DOBRUZNY, new Cas (13, 6, 2021, 17, 15));
    film3.addHerec(herec11);
    film3.addHerec(herec12);
    film3.addHerec(herec13);
    film3.addHerec(herec14);
    film3.addHerec(herec15);
    
    
    Sal sal1 = new Sal(1);
    sal1.addFilm(film1);
    
    Sal sal2 = new Sal(2);
    sal2.addFilm(film2);
    
    Sal sal3 = new Sal(3);
    sal3.addFilm(film3);
    
    
    Kino kino1 = new Kino();
    kino1.addSal(sal1);
    kino1.addSal(sal2);
    kino1.addSal(sal3);
    System.out.println(kino1);
    
 
  
    
    
	}

}
