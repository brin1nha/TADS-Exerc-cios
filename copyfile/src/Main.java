import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main source_file destination_file");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            // Read the source file
            FileInputStream is = new FileInputStream(sourceFile);
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ir);

            // Write to the destination file
            FileOutputStream os = new FileOutputStream(destinationFile);
            OutputStreamWriter or = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(or);

            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line + "\n");
            }

            // Close the files
            br.close();
            bw.close();

            System.out.println("Copy completed successfully!");

        } catch (FileNotFoundException ex) {
            System.out.println("Error: Source file not found: " + sourceFile);
        } catch (IOException ex) {
            System.out.println("Error opening or writing to the file: " + ex);
        }
    }
}
