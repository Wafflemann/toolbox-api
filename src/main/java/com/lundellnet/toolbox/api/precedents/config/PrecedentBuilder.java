package com.lundellnet.toolbox.api.precedents.config;

import com.lundellnet.toolbox.api.precedents.Precedent;

public interface PrecedentBuilder <C extends PrecedentConf<?, ?>, P extends Precedent<?, ?, ?, C>> {
	P build(C conf);
}
