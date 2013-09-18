package com.isaacjg.JaJ;

import java.util.ArrayList;

/*
 * JaJ - Object Oriented JSON in Java
 * Copyright (C) 2013  Isaac Grant
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class JaJ {
	
	public static String jsonify(ArrayList<JsonData> data) {
		String json = "{\n";
		for (int i = 0; i < data.size() - 1; i++) {
			json += '\t' + data.get(i).jsonify().replace("\n", "\n\t") + ",\n";
		}
		json += '\t' + data.get(data.size() - 1).jsonify() + "\n}";
		return json;
	}
}
