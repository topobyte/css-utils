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

public class Property
{

	private String key;
	private String value;

	public Property(String key, String value)
	{
		this.key = key;
		this.value = value;
	}

	public String getKey()
	{
		return key;
	}

	public String getValue()
	{
		return value;
	}

}
