/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.edu.Gary;

import guru.nidi.graphviz.attribute.Records;
import static guru.nidi.graphviz.attribute.Records.turn;
import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.Node;
import guru.nidi.graphviz.parse.Parser;
/**
 *
 * @author t203
 */
public class DemoGraphviz {
    Graph g =null;
    public void createDemoGraph(char[] Datos) throws IOException{
	//Graph g = graph("example1").with(node("a").link(node("b")));
           Node Lista=node("Stack").with(Records.of(turn(Datos.toString())));
           g = graph("eje2").directed().with(Lista);
 
        
        
    }
    
    public void GuardarGrafo() throws IOException{
        Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("C:\\Users\\garya\\Desktop\\eje2.PNG"));
    }
	
	public void createDemoFromDot() throws IOException {
		File file = new File("/Users/tuxtor/Downloads/linked_list.dot");
		FileInputStream fis = null;
		
		fis = new FileInputStream(file);
		
		MutableGraph g = Parser.read(fis);
		Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("example/ex4-1.png"));
	}
}
