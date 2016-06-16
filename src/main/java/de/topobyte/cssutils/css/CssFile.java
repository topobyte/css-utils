// Copyright 2016
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
import java.util.Iterator;
import java.util.List;

public class CssFile
{

	private static String newline = System.getProperty("line.separator");

	private List<CssEntry> entries = new ArrayList<>();

	public void addEntry(CssEntry entry)
	{
		entries.add(entry);
	}

	public String getText()
	{
		StringBuilder builder = new StringBuilder();
		Iterator<CssEntry> iterator = entries.iterator();
		while (iterator.hasNext()) {
			CssEntry entry = iterator.next();
			builder.append(entry.getText());
			if (iterator.hasNext()) {
				builder.append(newline);
			}
		}
		return builder.toString();
	}

}
