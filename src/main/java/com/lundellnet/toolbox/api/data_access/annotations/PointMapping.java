/*
 Copyright 2017 Appropriate Technologies LLC.

 This file is part of toolbox-api, a component of the Lundellnet Java Toolbox.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.lundellnet.toolbox.api.data_access.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.lundellnet.toolbox.api.data_access.adapters.DataMatrixAdapter;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PointMapping {
	static abstract class DEFAULT implements DataMatrixAdapter<Object, Object> {}
    
    Class<? extends DataMatrixAdapter<?, ?>> adapter() default DEFAULT.class;
    
    //int i_adapter() default 0;
    
	//int c() default 0;
	
    Class<?> component() default void.class;
	
    //int i_component() default 0;
    
    String delimiter() default "/";
    
    String domain() default "";
    
    int i_domain() default 0;
    
    String model() default "";
    
    int i_model() default 0;
  
    String path() default "";
    
    String plane() default "";
    
    int i_plane() default 0;
}
