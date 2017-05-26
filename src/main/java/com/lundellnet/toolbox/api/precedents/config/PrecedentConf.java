package com.lundellnet.toolbox.api.precedents.config;

import java.util.function.Function;

public interface PrecedentConf <T, R> {

	Function<T, R> applicant();
}
