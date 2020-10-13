
package pct;

import java.util.Scanner;


public class calculadoraJuros {
    
    public static void main(String[] args) {
        // Julia 
        // Declaração de variáveis 
        int prazo, op;
        int taxa, juros, cap;
        
        //Criação e instância de objeto
        Scanner entrada =  new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t Escolha sua opção: ");
        System.out.println("\n [1] - Juros Simples \n [2] - Cálculo do capital \n [3] - Cálculo da taxa \n [4] - Cálculo do prazo");
        
        //Entrada de dados
        op = entrada.nextInt();
        
        //Estrutura de decisão/Processamento 
        if (op == 1)
        {
            //Entrada de Dados
            System.out.println("\n\t\t\t Digite o valor do capital: ");
            cap = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o valor da taxa: ");
            taxa = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o prazo: ");
            prazo = entrada.nextInt();
            
            //Processamento
            juros = (cap*taxa*prazo)/100;
            
            //Saída
            System.out.printf("\n\t\t\t Juros de: %d\n",juros);
        }
        else if (op == 2)
        {
            //Entrada de dados
            System.out.println("\n\t\t\t Digite o valor do juros: ");
            juros = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o valor da taxa: ");
            taxa = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o prazo: ");
            prazo = entrada.nextInt();
            
            //Processamento
            cap = ((taxa/100)*prazo)/juros;
            
            //Saída
            System.out.printf("\n\t\t\t O valor do capital é: %d",cap );
        }
        // Iasmin
        else if (op == 3)
        {
            // entrada de dados
            System.out.println("\n\t\t\t Digite o valor do juros: ");
            juros = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o valor do capital: ");
            cap = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o valor do prazo: ");
            prazo = entrada.nextInt();
            
            // processamento  
            taxa= (juros/(cap*prazo))*100;
            
            // saida 
            System.out.printf("\n\t\t\t O valor da taxa é: %d",taxa);   
        }
        else if (op == 4)
        {
            // entrada de dados 
            System.out.println("\n\t\t\t Digite o valor do juros: ");
            juros = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o valor do capital: ");
            cap = entrada.nextInt();
            System.out.println("\n\t\t\t Digite o valor da taxa: ");
            taxa = entrada.nextInt();
            
            // processamento 
            prazo= juros/(cap*(taxa/100));
            
            //saida 
            System.out.printf("\n\t\t\t Ovalor do pazo é: %d",prazo);
           
        }
    }
    
}