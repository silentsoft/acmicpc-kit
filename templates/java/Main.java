import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        solve(createReader(), createWriter());
    }

    private static BufferedReader createReader() {
        InputStream inputStream = Main.class.getResourceAsStream("SampleData.txt");
        inputStream = (inputStream == null) ? System.in : inputStream;
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private static BufferedWriter createWriter() {
        return new BufferedWriter(new OutputStreamWriter(System.out));
    }

    private static void solve(BufferedReader reader, BufferedWriter writer) throws Exception {
        String line = null;
        while ((line = reader.readLine()) != null) {
            //
        }
        writer.flush();
        writer.close();
    }

}