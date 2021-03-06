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
import com.lundellnet.toolbox.api.data_access.annotations.PointMapping.DEFAULT;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface MatrixComponent {
	static abstract class DEFAULT implements DataMatrixAdapter<Object, Object> {}
	
	enum DEFAULT_ENUM {}
	
	Class<? extends DataMatrixAdapter<?, ?>> adapter() default DEFAULT.class;
	
	//int id_int() default 0;
	
	//String id_name() default "";
	
	Class<? extends Enum<?>> planeEnum() default DEFAULT_ENUM.class;
	
	PointMapping[] planes() default {};
	
	MappingProperty[] properties() default {};
	
	PointMapping[] providerMappings() default {};
	
	Class<?>[] providers() default {};
	
	//int[] i_providers() default {};
	
	PointMapping[] rootMappings() default {};
	
	Class<?> span() default void.class;
	
	Class<?>[] subs() default {};
	
	//int[] i_subs() default {};
	
	PointMapping[] valueMappings() default {};
}
