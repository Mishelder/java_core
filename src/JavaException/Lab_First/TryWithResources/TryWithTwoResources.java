package JavaException.Lab_First.TryWithResources;

import JavaException.Lab_First.AutoCloseableFactory;
import JavaException.Lab_First.TryBody;

public class TryWithTwoResources {

    public static void call(AutoCloseableFactory factoryA,
                            AutoCloseableFactory factoryB, TryBody body) throws Throwable{

        try(AutoCloseable a = factoryA.create();
            AutoCloseable b = factoryB.create()){
            body.runBody();
        }

    }
}