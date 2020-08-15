package IO;
/*
功能点在于：
将文件中的单行注释删除。
 * */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class huancun_liu_text_1 {

	public static void main(String[] args) {
		

	}
	public static void paichu(File file) {
		StringBuffer sb = new StringBuffer();
		try(
			FileReader in = new FileReader(file);
			BufferedReader bf = new BufferedReader(in);
		   ) {
			while(true) {
				String line = bf.readLine();
				if(line==null)
					break;
				if(!line.trim().startsWith("//")) {
					sb.append(line).append("\r\n");
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		try(
			FileWriter out = new FileWriter(file);
			PrintWriter pw = new PrintWriter(out);
			) {
			pw.write(sb.toString());
		} catch (Exception e) {
			e.getMessage();
		}
	}
}