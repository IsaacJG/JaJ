package com.isaacjg.JaJ;

import java.util.ArrayList;

/*
 * This file is part of JaJ.
 *
 * JaJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JaJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JaJ.  If not, see <http://www.gnu.org/licenses/>.
 */

public class JsonObject extends JsonData {
	private ArrayList<JsonData> data;
	
	public JsonObject(String name) {
		super(name);
		data = new ArrayList<JsonData>();
	}
	
	public JsonObject(String name, ArrayList<JsonData> data) {
		super(name);
		this.data = data;
	}
	
	public void addData(JsonData newData) {
		data.add(newData);
	}
	
	public String jsonify() {
		String json;
		String dataString = "";
		for (int i = 0; i < data.size() - 1; i++) {
			dataString += '\t' + data.get(i).jsonify() + ",\n";
		}
		dataString += '\t' + data.get(data.size() - 1).jsonify() + '\n';
		json = '\"' + getName() + "\": {\n" + dataString + '}';
		return json;
	}
}
