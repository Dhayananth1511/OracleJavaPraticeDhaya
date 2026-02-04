import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ConnectDifferentSrcDesti {

    // FileInputStream (Binary Read)

    // public static void main(String[] args) throws Exception {
    // FileInputStream fis = new FileInputStream("input.bin");
    // int data;
    // while((data=fis.read())!=-1)
    // {
    // System.out.print(data + " ");
    // }
    // fis.close();
    // }

    // FileOutputStream (Binary Write)

    // public static void main(String[] args) throws Exception {
    // FileOutputStream fos = new FileOutputStream("output.bin");
    // fos.write(97); // a
    // fos.close();
    // }

    // 🔹 FileReader (Text Read)

    // public static void main(String[] args) throws Exception {
    // FileReader fr = new FileReader("input.txt");
    // int ch;
    // while ((ch = fr.read()) != -1) {
    // System.out.print((char) ch);
    // }
    // fr.close();

    // }

    // FileWriter (Text Write)

    // public static void main(String[] args) throws Exception {
    // FileWriter fw = new FileWriter("output.txt");
    // String data = """
    // Hello, World!
    // dvxfbgh
    // 123456
    // """;
    // fw.write(data);
    // fw.close();
    // }

    // ✅ 2️⃣ Transform Stream Content (Byte ↔ Character)
    // 🔹 InputStreamReader

    // public static void main(String[] args)throws Exception {
    // InputStream in = new FileInputStream("input.txt");
    // InputStreamReader isr = new InputStreamReader(in);

    // int ch;
    // while ((ch = isr.read()) != -1) {
    // System.out.print((char) ch);
    // }
    // isr.close();

    // }

    // 🔹 OutputStreamWriter

    // public static void main(String[] args)throws Exception {
    // OutputStream out = new FileOutputStream("out.txt");
    // OutputStreamWriter osw = new OutputStreamWriter(out);

    // osw.write("Converted text");
    // osw.close();

    // }

    // ✅ 3️⃣ Perform Content Buffering (Fast I/O)
    // 🔹 BufferedInputStream

    // public static void main(String[] args) throws Exception {
    // BufferedInputStream bis = new BufferedInputStream(new
    // FileInputStream("a.bin"));

    // int data;
    // while ((data = bis.read()) != -1) {
    // System.out.print(data + " ");
    // }
    // bis.close();

    // }

    // 🔹 BufferedOutputStream

    // public static void main(String[] args) throws Exception {
    // OutputStream out = new FileOutputStream("outpu.bin");
    // BufferedOutputStream bos = new BufferedOutputStream(out);

    // bos.write(97); // a
    // bos.flush(); // Ensure data is written to the file
    // bos.close();

    // }

    // BufferedReader and BufferedWriter can also be used similarly for text files.

    // public static void main(String[] args) throws Exception {
    // BufferedReader br = new BufferedReader(new FileReader("input.txt"));

    // String line;
    // while ((line = br.readLine()) != null) {
    // System.out.println(line);
    // }
    // br.close();

    // }

    // public static void main(String[] args)throws Exception {
    // BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

    // bw.write("Buffered writing");
    // bw.newLine();
    // bw.close();

    // }

    // ✅ 4️⃣ Provide Convenience Methods
    // 🔹 PrintWriter
    // public static void main(String[] args) throws Exception {
    //     PrintWriter pw = new PrintWriter("print.txt");
    //     pw.println("Hello");
    //     pw.println(100);
    //     pw.close();
    // }

    // //
    // public static void main(String[] args) throws Exception {
    //     // 🔹 ObjectOutputStream (Write Object)
    //     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));

    //     oos.writeObject("Java");
    //     oos.close();
    // }

    // // 🔹 ObjectInputStream (Read Object)
    // public static void main(String[] args) throws Exception {

    //     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.dat"));

    //     String s = (String) ois.readObject();
    //     System.out.println(s);
    //     ois.close();
    // }



    // ✅ 5️⃣ Reading & Writing Binary Data (All Methods)
    // 🔹 read() / write(int)
    // int b = in.read();
    // out.write(b);

}
