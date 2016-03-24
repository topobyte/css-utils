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

package de.topobyte.cssutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import de.topobyte.cssutils.css.CssFile;

public class CssFileWriter
{

	public static void write(CssFile cssFile, File file) throws IOException
	{
		OutputStream out = new FileOutputStream(file);
		write(cssFile, out);
		out.close();
	}

	public static void write(CssFile cssFile, Path path) throws IOException
	{
		OutputStream out = Files.newOutputStream(path);
		write(cssFile, out);
		out.close();
	}

	public static void write(CssFile cssFile, OutputStream os)
			throws IOException
	{
		OutputStreamWriter writer = new OutputStreamWriter(os);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write(cssFile.getText());
		bufferedWriter.close();
	}

}
