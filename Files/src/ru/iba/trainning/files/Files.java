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
	
	
	
	public static void main(String[] args)
	{
		String path="D:\\Универ\\Учеб\\3 курс\\ос";
		ArrayList<File> files;
		if((files=Files.getFilesSub(path))==null)
		{
			System.out.println("File must be a directory.");
			return;
		}
		for(int i=0;i<files.size();i++)
		{
			System.out.println(files.get(i).getPath());
		}
	}
	
}
