package ordenarray;

import java.util.Scanner;

public class OrdenArray {
    
    public static void main(String[] args) {
        // pongon nombre a mi escanner para poder llamar a mis bariables depues
     Scanner EF=new Scanner(System.in);   
     
       //es lo que quiero qeu vea el usuario y la peticion es que increce un numero
        System.out.println("-*Ingresa primer numero: ");
        int num1 = EF.nextInt();
        System.out.println("-*Ingresa segundo numero: ");
        int num2 = EF.nextInt();
        System.out.println("-*Ingresa tercer numero: ");
        int num3 = EF.nextInt();
         
        //Parte 1 ordenamiento(num1)
     if (num1>num2 && num2>num3){
            System.out.println("-*Mayor a Menor: "+num1+","+num2+","+num3);
            
            }else if (num1>num3 && num3>num2){
                System.out.println("-*Mayor a Menor: "+num1+","+num3+","+num2);
                
        //Parte 2 ordenamiento(num2)
                
            }else if (num2>num1 && num1>num3){
                System.out.println("-*Mayor a Menor: "+num2+","+num1+","+num3);
               
            }else if (num2>num3 && num3>num1){
                System.out.println("-*Mayor a Menor: "+num2+","+num3+","+num1);
                
        //parte 3 ordenamiento (num3)
                
            }else if (num3>num1 && num1>num2){
                System.out.println("-*Mayor a Menor: "+num3+","+num1+","+num2);
                
            }else if (num3>num2 && num2>num1){
                System.out.println("-*Mayor a Menor: "+num3+","+num2+","+num1);
                        
    }
  }
}

                
                
