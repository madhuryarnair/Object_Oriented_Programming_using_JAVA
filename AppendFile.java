import java.io.*;

class AppendFile
{
	public static void main(String args[]) throws Exception
	{
		FileWriter f = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\Java\\file1.txt");
		
		String str = "Welcome to Java Programming";
		
		f.write(str);
		
		String str1 = "Write Once, Run Anywhere";
		
		f.append(str1);
		
		f.close();
	}
}

		