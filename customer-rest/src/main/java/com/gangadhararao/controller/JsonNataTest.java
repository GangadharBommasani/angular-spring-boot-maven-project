package com.gangadhararao.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.core.io.ClassPathResource;

public class JsonNataTest {
	
	public static void main(String args[]) throws ScriptException, IOException, NoSuchMethodException {
		
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		Invocable inv = (Invocable) engine;
		
		FileReader jsonata = new FileReader(new ClassPathResource("jsonata-es5.min.js").getFile());

		// load the JSONata processor
		engine.eval(jsonata);

		// read and JSON.parse the input data
		byte[] sample = Files.readAllBytes(Paths.get(new ClassPathResource("sample.json").getURI()));
		engine.put("input", new String(sample));
		Object inputjson = engine.eval("JSON.parse(input);");

		// query the data
		String expression = "Account.'Account Name'";  // JSONata expression
		Object expr = inv.invokeFunction("jsonata", expression);
		Object resultjson = inv.invokeMethod(expr, "evaluate", inputjson);

		// JSON.stringify the result
		engine.put("resultjson", resultjson);
		Object result = engine.eval("resultjson");
		
		if("".equals(String.valueOf(result))){
			System.out.println("hello");
		}
		System.out.println(result);
	}

}
