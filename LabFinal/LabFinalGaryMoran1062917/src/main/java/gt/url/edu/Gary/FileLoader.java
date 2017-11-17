/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.edu.Gary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author t203
 */
public class FileLoader {
        public void loadFileWithJava7() {
		File file = new File("C:\\Users\\t203\\Desktop\\Hola.txt");

		try (FileInputStream fis = new FileInputStream(file)) {

			System.out.println("Total file size to read (in bytes) : " + fis.available());

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
                String totalText="";
	public String loadFileWithJava8(String ruta) {
		String fileName = ruta;

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(x-> { totalText+=totalText.concat(x);
                        System.out.println(x);});

		} catch (IOException e) {
			e.printStackTrace();
		}
                return totalText;
	}
                String Text="";
    public void leerArchivo(){
        String ruta="C:\\Users\\t203\\Desktop";

        Stream <String> stream;
        try {
            stream=Files.lines(Paths.get(ruta));
            stream.forEach(linea->{Text+=Text.concat(linea); System.out.println(linea);});
        }
        catch(Exception e){
            e.printStackTrace();
    }
    }
	public void writeUsingFileWriter(String data, String ruta) {
		File file = new File(ruta);

		try (FileWriter fw = new FileWriter(file)) {
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
