// Copyright 2019 Sebastian Kuerten
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

public class Style
{

	private List<Property> properties = new ArrayList<>();

	public Style add(Property property)
	{
		properties.add(property);
		return this;
	}

	public Style add(String key, String value)
	{
		properties.add(new Property(key, value));
		return this;
	}

	public String getText()
	{
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < properties.size(); i++) {
			Property property = properties.get(i);
			builder.append(property.getKey());
			builder.append(": ");
			builder.append(property.getValue());
			if (i < properties.size() - 1) {
				builder.append("; ");
			}
		}
		return builder.toString();
	}

	@Override
	public String toString()
	{
		return getText();
	}

}
