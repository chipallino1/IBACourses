package ru.iba.trainning.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Files {

	public static ArrayList<File> listFiles=new ArrayList<>();
	
	//get all files and subdirs and subfiles and subsubdirs(recursion)
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
			return null;
		}
		
		int lastIndex=Path.lastIndexOf('.');
		String extension=Path.substring(lastIndex+1);
		
		return extension;
		
		
		
	}
	//copy files with same extension to the same dir
	public static boolean sortFiles(ArrayList<File> filesArr,String destPath) {
		
		for(int i=0;i<filesArr.size();i++)
		{
			File file=filesArr.get(i);
			
			
			if(file.isFile())
			{
				String extension=getExtension(file.getPath());
				String dest=destPath+"\\"+extension;
				File destFile=new File(dest);
				if(destFile.exists())
				{
					copy(file,destFile);
					
				}
				else
				{
					destFile.mkdir();
					copy(file,destFile);
				}
			}
		}
		
		return true;
		
		
	}
	public static boolean copy(File srcFile,File destDirFile)
	{
		
		
		String src=srcFile.getPath();
		String destDir=destDirFile.getPath();
		String name=srcFile.getName();
		
		try(InputStream is=new FileInputStream(src);
				OutputStream os=new FileOutputStream(destDir+"\\"+name))
		{
			int length=is.available();
			byte[] buffer=new byte[length];
			int readsLen;
			while((readsLen=is.read(buffer))>0)
			{
				os.write(buffer, 0, readsLen);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		String path="D:\\Универ\\Учеб\\3 курс";//please set your path from file system
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
			
			System.out.println(files.get(i).getPath());//null mean that it is dir
			System.out.println("Extension: "+getExtension(files.get(i).getPath()));
		}
		
		Files.sortFiles(files, "D:\\Универ\\Учеб\\3 курс\\IBAcourses\\test");//please set your path from file system
		//(if you set path from properties of file may be it will be a problem because there is a hidden symbol sometimes)
		
	}
	
}
