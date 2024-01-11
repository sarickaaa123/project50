package project51;

class Adresalok {
private int stanBr;
private String lokacija;
public Adresalok (int stanBr, String lokacija){

this.stanBr = stanBr;
this.lokacija = lokacija;
}
public int getStanBr(){
return stanBr;
}
public String getLokacija(){
return lokacija;
 }
}

 class Kupuvac{
private int kupuvacID;
private Adresalok adresalinija;
public Kupuvac (int kupuvacID, Adresalok adresalinija){
this.kupuvacID = kupuvacID;
this.adresalinija = adresalinija;
}
public int getKupuvacID(){
return kupuvacID;
}
public Adresalok getAdresalinija(){
return adresalinija;
 }
}

class Dostava {
public static void main(String[] args) {
String lokacija = new String ("Naselba1, Zgrada2");
Adresalok adresa1 = new Adresalok (15, lokacija);
Kupuvac tom = new Kupuvac(1212,adresa1);
System.out.println("Kupuvac Id:" + tom.getKupuvacID());
System.out.println("Stanbr:" + tom.getAdresalinija().getStanBr());
System.out.println("Lokacija:"+ tom.getAdresalinija().getLokacija());
System.out.println();
Adresalok adresa2 = new Adresalok (32, lokacija);
Kupuvac marko = new Kupuvac(1673,adresa2);
System.out.println("Kupuvac Id:" + marko.getKupuvacID());
System.out.println("Stan br:" + marko.getAdresalinija().getStanBr());
System.out.println("Lokacija:" + marko.getAdresalinija().getLokacija());
 }
} 