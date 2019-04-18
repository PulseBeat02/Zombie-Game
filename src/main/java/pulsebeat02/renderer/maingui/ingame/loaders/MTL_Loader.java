package main.java.pulsebeat02.renderer.maingui.ingame.loaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;

import com.mokiat.data.front.parser.IMTLParser;
import com.mokiat.data.front.parser.MTLColor;
import com.mokiat.data.front.parser.MTLLibrary;
import com.mokiat.data.front.parser.MTLMaterial;
import com.mokiat.data.front.parser.MTLParser;

public class MTL_Loader {
	
	MTL_Loader (File file, boolean isLoad) {
		
		final MTLMaterial material = ;
		final MTLColor diffuseColor = material.getDiffuseColor();
		final MTLColor ambientColor = material.getAmbientColor();
		final MTLColor specularColor = material.getSpecularColor();
		
		if (isLoad) {
		
			try (InputStream in = new FileInputStream(file)) {
				final IMTLParser parser = new MTLParser();
				final MTLLibrary library = parser.parse(in);
					for (MTLMaterial material : library.getMaterials()) {
						System.out.println(MessageFormat.format("Material with name `{0}`.", material.getName()));
					}  
			  
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
