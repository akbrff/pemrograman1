package P9_MuhamadAkbarFebiansyah.SourcePackage;

abstract class latihan1 {
    public void breath() {
        System.out.println(" Bernafas Melalui hidung");
    }

    public void eat() {
        System.out.println("Makan melalui mulut");
    }
    public abstract void walk();
}

class Human extends latihan1{
    public void walk(){
        System.out.println("Berjalan dengan dua kaki");
    }
}
