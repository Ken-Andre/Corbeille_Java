class Animal{
    public String Nom;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

}
class Vertebre extends Animal{
    public int nbrVertebres;
}
class Invertebre extends Animal{

}
class Mammifere extends Vertebre{

}
class Poisson extends Vertebre{

}
class Reptile extends Vertebre{

}
class Ours extends Mammifere{
    public static  void toString(){
        return getNom("Ours");
    }

    private static void getNom(String ours) {
    }
}
class Chimpanze extends Mammifere { public static  void toString(){
    return getNom("Chimpanze");
}}
class Rats extends Mammifere { public static  void toString(){
    return getNom("Rats");
}}

class Requin extends Poisson { public static  void toString(){
    return getNom("Requin");
}}
class Raies extends Poisson { public static  void toString(){
    return getNom("Raies");
}}
class Truies extends Poisson { public static  void toString(){
    return getNom("Truies");
}}

class Tortue extends Reptile { public static  void toString(){
    return getNom("Tortue");
}}
class Serpent extends Reptile { public static  void toString(){
    return getNom("Serpent");
}}

