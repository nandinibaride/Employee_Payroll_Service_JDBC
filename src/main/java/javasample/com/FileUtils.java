package javasample.com;

import java.io.File;
/*
 * @purpose: Check list of file 
 * @author: Nandini.Baride
 */

public class FileUtils
{
	public static boolean deleteFolder(File file)
	{
		for (File subFile : file.listFiles())
		{
			if (subFile.isDirectory()) {
				deleteFolder(subFile);
			} 
			else {
				subFile.delete();
			}
		}
		return file.delete();
	}
	
}

