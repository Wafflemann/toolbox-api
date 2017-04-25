package com.lundellnet.toolbox.api.data_access.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.lundellnet.toolbox.api.data_access.adapters.DataMatrixAdapter;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface MatrixComponentAdapter {
  Class<DataMatrixAdapter<?, ?>> adapter();
}
