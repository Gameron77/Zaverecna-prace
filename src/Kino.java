import java.util.ArrayList;

public class Kino {
	
ArrayList<Sal> seznamSalu = new ArrayList<Sal>();

	

public Kino() {
	super();
	// TODO Auto-generated constructor stub
}


public void addSal(Sal sal) {
seznamSalu.add(sal);


}

@Override
public String toString() {
	return "Kino [Seznam salù: " + seznamSalu + "]";
}}
