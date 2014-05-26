/**
 * maps4cim - a real world map generator for CiM 2
 * Copyright 2013 Sebastian Straub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nx42.maps4cim.config.texture.osm;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A single polygon, filled with the user defined color.
 * @see EntityDef
 * @author Sebastian Straub <sebastian-straub@gmx.net>
 */
@XmlRootElement(name = "polygon")
public class PolygonDef extends EntityDef {

	/*
	 * the polygon does not need any additional attributes, the data from the
	 * abstract superclass and the type of this class are enough to define it.
	 */

	@Override
	public String getType() {
		return "way";
	}

}