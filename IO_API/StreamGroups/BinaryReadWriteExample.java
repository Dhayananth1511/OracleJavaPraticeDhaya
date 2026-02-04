import java.io.*;

public class BinaryReadWriteExample {
    public static void main(String[] args) throws Exception {

        InputStream in = new FileInputStream("source.bin");
        OutputStream out = new FileOutputStream("dest.bin");

        // 1️⃣ read() and write(int)
        int singleByte = in.read();
        out.write(singleByte);

        // 2️⃣ read(byte[])
        byte[] buffer = new byte[1024];
        int bytesRead = in.read(buffer);
        out.write(buffer, 0, bytesRead);

        // 3️⃣ read(byte[], offset, length)
        bytesRead = in.read(buffer, 10, 100);
        if (bytesRead != -1) {
            out.write(buffer, 10, bytesRead);
        }

        // 4️⃣ write(byte[])
        out.write(buffer);

        // 5️⃣ flush()
        out.flush();

        // 6️⃣ close streams
        in.close();
        out.close();

        System.out.println("Binary file copied successfully");
    }
}
