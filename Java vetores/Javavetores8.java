import java.util.Scanner;
public class Javavetores8 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        long a,b,c,d;
       
        System.out.println("Digite um número inteiro:");
        a=teclado.nextLong();
        System.out.println("Digite mais um número inteiro:");
        b=teclado.nextLong();
        System.out.println("Digite outro número inteiro:");
        c=teclado.nextLong();
        System.out.println("Digite o ultimo número inteiro:");
        d=teclado.nextLong();
       
        if((a<b)&&(b<c)&&(c<d)){
          System.out.println("Os números digitados na ordem crescente são: "+a+b+c+d);
        }else{
            System.out.print("");
        }
        if ((a<b)&&(b<d)&&(d<c)){
          System.out.println("Os números digitados na ordem crescente são: "+a+b+d+c);
        }else{
            System.out.print("");
        }  
        if ((a<c)&&(c<b)&&(b<d)){
          System.out.println("Os números digitados na ordem crescente são: "+a+c+b+d);
        }else{
            System.out.print("");
        }  
        if ((a<c)&&(c<d)&&(d<b)){
          System.out.println("Os números digitados na ordem crescente são: "+a+c+d+b);
        }else{
            System.out.print("");
        }  
        if ((a<d)&&(d<b)&&(b<c)){
          System.out.println("Os números digitados na ordem crescente são: "+a+d+b+c);
        }else{
            System.out.print("");
        }  
        if ((a<d)&&(d<c)&&(c<b)){
          System.out.println("Os números digitados na ordem crescente são: "+a+d+c+b);
        }else{
            System.out.print("");
        }
        if((b<a)&&(a<c)&&(c<d)){
          System.out.println("Os números digitados na ordem crescente são: "+b+a+c+d);
        }else{
            System.out.print("");
        }
        if ((b<a)&&(a<d)&&(d<c)){
          System.out.println("Os números digitados na ordem crescente são: "+b+a+d+c);
        }else{
            System.out.print("");
        }  
        if ((b<c)&&(c<a)&&(a<=d)){
          System.out.println("Os números digitados na ordem crescente são: "+b+c+a+d);
        }else{
            System.out.print("");
        }  
        if ((b<c)&&(c<d)&&(d<a)){
          System.out.println("Os números digitados na ordem crescente são: "+b+c+d+a);
        }else{
            System.out.print("");
        }  
        if ((b<d)&&(d<a)&&(a<c)){
          System.out.println("Os números digitados na ordem crescente são: "+b+d+a+c);
        }else{
            System.out.print("");
        }  
        if ((b<d)&&(d<c)&&(c<a)){
          System.out.println("Os números digitados na ordem crescente são: "+b+d+c+a);
        }else{
            System.out.print("");
        }