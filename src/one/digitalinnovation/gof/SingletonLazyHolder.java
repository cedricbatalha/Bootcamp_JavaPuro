package one.digitalinnovation.gof;

/*

Singleton "Lazy Holder"

@see Ver referencia do Stackoverflow /a/24018148

 */
public class SingletonLazyHolder {

    //encapsular a instancia
    public static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}

