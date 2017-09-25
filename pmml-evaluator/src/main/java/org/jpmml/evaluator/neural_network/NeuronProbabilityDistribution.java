/*
 * Copyright (c) 2013 Villu Ruusmann
 *
 * This file is part of JPMML-Evaluator
 *
 * JPMML-Evaluator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPMML-Evaluator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with JPMML-Evaluator.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jpmml.evaluator.neural_network;

import java.util.Set;

import com.google.common.collect.BiMap;
import org.dmg.pmml.Entity;
import org.jpmml.evaluator.EntityClassification;
import org.jpmml.evaluator.HasProbability;

public class NeuronProbabilityDistribution<V extends Number> extends EntityClassification<Entity, V> implements HasProbability {

	NeuronProbabilityDistribution(BiMap<String, Entity> entityRegistry){
		super(Type.PROBABILITY, entityRegistry);
	}

	@Override
	public Set<String> getCategoryValues(){
		return keySet();
	}

	@Override
	public Double getProbability(String value){
		return getValue(value);
	}
}