/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.arkanet.ui;

import java.util.ArrayList;
import mx.itson.arkanet.entities.Post;
import mx.itson.arkanet.entities.User;
import mx.itson.arkanet.enums.Rol;
import java.util.Date;
import java.util.List;
import mx.itson.arkanet.entities.Category;
import mx.itson.arkanet.entities.Comment;


/**
 *
 * @author dani_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos a los usuarios junto a su nombre,email, su password y por ultimo el rol que toman 
        
        User user1 = new User();
        user1.setName("Alberto21");
        user1.setEmail("alberto21@gmail.com");
        user1.setPassword("albertito2130");
        user1.setRol(Rol.ESTANDAR);
        
        User user2 = new User();
        user2.setName("DanielitoAd30");
        user2.setEmail("Danielito@gmail.com");
        user2.setPassword("Danielito3030");
        user2.setRol(Rol.ADMIN);
        
        Category category = new Category();
        category.setName("Peliculas");
        
        
       //Creamos las variables de comment para poner la descripcion, likes, dislkes, etc
        
        Comment c1 = new Comment();
        c1.setUser(user2);
        c1.setDescription("Me gustaron todas las peliculas, siento que todas fueron geniales en su manera de ser y los directores sacaron el maximo de cada produccion");
        c1.setLikes(3);
        c1.setDislikes(0);
        c1.setDate(new Date());
        
        //hacemos una arrayList por si hubiese mas de un comentario 
        
           List<Comment> comment = new ArrayList<>();
          comment.add(c1);
           
          
          
        //Declaramos las variables de la clase Post  
        Post post = new Post();
        post.setTitle("Mejores peliculas 2023");
        post.setImage("https://i.blogs.es/37d6c0/diseno-sin-titulo-25-/1366_2000.jpeg");
        post.setDescription("Estas son las peliculas mas taquilleras de lo que llevamos del año 2023 y cuales han sido amadas por la gente");
        post.setUser(user1);
        post.setDate(new Date());
        post.setCategory(category);
        post.setLikes(8);
        post.setDislikes(1);
        post.setComment(comment);
      
        
        //Vamos imprimiendo dependiendo el orden que queramos 
        System.out.println("Titulo: " + post.getTitle());
        System.out.println("" + post.getImage());
        System.out.println("Descripcion: " + post.getDescription());
        System.out.println("--------------------------------");
        System.out.println("Escritor: " + post.getUser().getName());
        System.out.println("Fecha: " + post.getDate());
        System.out.println("Categoria:" + post.getCategory().getName());
        System.out.println("Likes - " + post.getLikes());
        System.out.println("Dislikes - " + post.getDislikes());
        
        System.out.println("-----------------------------");
        
        System.out.println("Comentarios: ");
       
       //El for sirve para recorrer los datos de la lista comment
        for (Comment imprimir : comment) {
            System.out.println("Usuario: " + imprimir.getUser().getName());
            System.out.println("Descripcion: " + imprimir.getDescription());
            System.out.println("Likes - " + imprimir.getLikes());
            System.out.println("Dislikes - " + imprimir.getDislikes());
            System.out.println("Fecha: " + imprimir.getDate());
        }
         
      
     
        
        
    }
    
}
