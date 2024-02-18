package org.eserciziSpring.as;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({TYPE, METHOD, CONSTRUCTOR, PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DaCompletare {

    String descrizione();

    String assegnataA() default "da assegnare";
}
