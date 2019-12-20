// Copyright 2016 Sebastian Kuerten
//
// This file is part of css-utils.
//
// css-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// css-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with css-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.cssutils.css;

import java.util.ArrayList;
import java.util.List;

public class CssEntry
{

	private static String newline = System.getProperty("line.separator");

	private String identifier;
	private List<Property> properties = new ArrayList<>();

	public CssEntry(String identifier)
	{
		this.identifier = identifier;
	}

	public void addProperty(Property property)
	{
		properties.add(property);
	}

	public String getText()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(identifier);
		builder.append(" {");
		builder.append(newline);
		for (Property property : properties) {
			builder.append("  ");
			builder.append(property.getKey());
			builder.append(":");
			builder.append(property.getValue());
			builder.append(";");
			builder.append(newline);
		}
		builder.append("}");
		return builder.toString();
	}

}
