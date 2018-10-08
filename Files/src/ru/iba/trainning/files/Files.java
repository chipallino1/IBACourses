package ru.iba.trainning.files;

import java.io.File;
import java.util.ArrayList;

public class Files {

	public static ArrayList<File> listFiles=new ArrayList<>();
	
	public static ArrayList<File> getFilesSub(String Path)
	{
		
		if(Path==null || Path=="" )
		{
			return null;
		}
		File file=new File(Path);
		if(!file.isDirectory())
		{
			return null;
		}
		
		String[] files=file.list();
		for(int i=0;i<files.length;i++)
		{
			String subPath=Path+"\\"+files[i];			
			File innerFile=new File(subPath);
			listFiles.add(innerFile);
			if(innerFile.isDirectory())
			{
				
				getFilesSub(subPath);
			}
		}
			
		return listFiles;
		
	}
	public static String getExtension(String Path) {
		
		
		if(Path==null || Path=="" )
		{
			return null;
		}
		File file=new File(Path);
		if(file.isDirectory())
		{
			return "it is directory";
		}
		
		int lastIndex=Path.lastIndexOf('.');
		String extension=Path.substring(lastIndex+1);
		
		return extension;
		
		
		
	}
	public static boolean SortFiles(String srcPath,String destPath) {
		
		
		
		return false;
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		//get all files and subdirs and subfiles and subsubdirs(recursion)
		String path="D:\\Универ\\Учеб\\3 курс\\пкп\\Tasks\\Task01";//please set your path from file system
		//(if you set path from properties of file may be it will be a problem because there is a hidden symbol sometimes)
		//
		ArrayList<File> files;
		if((files=Files.getFilesSub(path))==null)
		{
			System.out.println("File must be a directory.");
			return;
		}
		for(int i=0;i<files.size();i++)
		{
			
			System.out.println(files.get(i).getPath());
			System.out.println("Extension: "+getExtension(files.get(i).getPath()));
		}
	}
	
}
