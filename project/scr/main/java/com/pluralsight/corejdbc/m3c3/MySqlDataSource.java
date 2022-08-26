package com.pluralsight.corejdbc.m3c3;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.inject.Qualifier;

@Qualifier
@Target({FIELD, TYPE, METHOD})
@Retention(RUNTIME)
public @interface MySqlDataSource {

}
