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

package de.topobyte.htmlutils.css;

import de.topobyte.cssutils.css.CssEntry;
import de.topobyte.cssutils.css.CssFile;
import de.topobyte.cssutils.css.Property;

public class CssCreationTest
{

	public static void main(String[] args)
	{
		CssFile cssFile = new CssFile();

		CssEntry entry1 = new CssEntry(".header");
		entry1.addProperty(new Property("foo", "bar"));
		entry1.addProperty(new Property("misc", "test"));
		cssFile.addEntry(entry1);

		CssEntry entry2 = new CssEntry(".tool");
		entry2.addProperty(new Property("this", "that"));
		cssFile.addEntry(entry2);

		CssEntry entry3 = new CssEntry("div.tool, div.foo.bar");
		entry3.addProperty(new Property("this", "that"));
		cssFile.addEntry(entry3);

		String css = cssFile.getText();
		System.out.println(css);
	}

}
