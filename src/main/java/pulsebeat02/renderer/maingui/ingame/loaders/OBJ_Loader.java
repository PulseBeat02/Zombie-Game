package main.java.pulsebeat02.renderer.maingui.ingame.loaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import com.mokiat.data.front.parser.IOBJParser;
import com.mokiat.data.front.parser.OBJModel;
import com.mokiat.data.front.parser.OBJParser;

public class OBJ_Loader extends MTL_Loader {
	
	OBJ_Loader (File file, boolean isLoad) {
		
		if (isLoad) {
		
			try (InputStream in = new FileInputStream(file)) {
			  // Create an OBJParser and parse the resource
				final IOBJParser parser = new OBJParser();
				final OBJModel model = parser.parse(in);

				// Use the model representation to get some basic info
				
				int vertices = model.getVertices().size();
			    int normals = model.getNormals().size();
			    int TexCoords = model.getTexCoords().size();
			    int ObjectSize = model.getObjects().size();
			          
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
				}

			}
		
		}
	
	}






