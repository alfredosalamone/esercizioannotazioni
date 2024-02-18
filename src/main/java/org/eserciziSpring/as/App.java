package org.eserciziSpring.as;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {

        System.out.println( "Hello World!" );

        Articoli articolo = new Articoli("1234", "pasta barilla");

        articolo.method1();

        articolo.method2();

        Map<String, String> map = new HashMap<String, String>();

        Method[] methods = Class.forName("org.eserciziSpring.as.Articoli").getMethods();

        for (Method m : methods){
            DaCompletare dc = null;
            if ((dc = m.getAnnotation(DaCompletare.class)) != null) {
                map.put(dc.descrizione(), dc.assegnataA());
            }
        }

        publicaIntranet(map);
    }

    private static void publicaIntranet(Map<String, String> map) {
        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println("Descrizione: " + key + "; Assegnata a: " + map.get(key));
        }
    }



}
