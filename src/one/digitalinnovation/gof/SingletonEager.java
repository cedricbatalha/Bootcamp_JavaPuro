package one.digitalinnovation.gof;

/*

Singleton "Apressado"

 */
public class SingletonEager {

    //instancia de forma apressadinha
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
        return instancia;
    }
}

