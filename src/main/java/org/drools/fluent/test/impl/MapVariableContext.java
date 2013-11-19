/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.fluent.test.impl;

import java.util.HashMap;
import java.util.Map;

import org.drools.fluent.VariableContext;

public class MapVariableContext<P> implements VariableContext<P>{
	
	private Map<String, P> vars;
	
	public MapVariableContext() {
		this.vars = new HashMap<String, P>();
	}

	public P get(String name) {
		return vars.get( name );
	}

	public <T> T get(String name, Class<T> type) {
		return (T) vars.get( name );
	}

}
