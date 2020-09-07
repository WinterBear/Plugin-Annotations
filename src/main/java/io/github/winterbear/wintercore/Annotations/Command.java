package io.github.winterbear.wintercore.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by WinterBear on 10/06/2019.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    String aliases() default "";

    String description() default "";

    String permission() default "";

    String usage() default "";
}
