package luiz;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        //ENTRADA
        Scanner sc = new Scanner(System.in);
        
        //VARIÁVEIS
        String[] nome = new String[5];
        String resp,resp1,resp2,resp3,fimm;
        int c = 1,quant = 1,fim;
        int[] acertos = new int[5];
        int[] erros = new int[5];
        int[] pontuacao = new int[5];

        //PROGRAMA
        //MENU INICIAL
        for (c = 1;c<5;c++){
        System.out.println("Olá,qual o seu nome? ");
        nome[c] = sc.next().toUpperCase();
        System.out.println("Seja bem vindo(a) "+nome[c]);
        System.out.println("Deseja iniciar o quiz?\nS/N ");
        resp = sc.next();
        switch (resp.toUpperCase()){
            case "S": 
                //PRIMEIRA PERGUNTA
                System.out.println("---------------------------------");
                System.out.println("1-Qual é o maior rio do Brasil?\nA)Amazonas\nB)São Francisco\nC)Tietê\nD)Paraná");
                resp1 = sc.next().toUpperCase();
                //INÍCIO PRIMEIRO IF
                if (resp1.equals("A")){
                pontuacao[c] = pontuacao[c] + 20;
                acertos[c] = acertos[c]+1;
                } 
                else{
                pontuacao[c] = pontuacao[c] - 3;   
                erros[c] = erros[c]+1;
                }
                //FIM DO PRIMEIRO IF
                //SEGUNDA PERGUNTA
                System.out.println("---------------------------------");
                System.out.println("2-Qual é o planeta mais próximo do sol?\nA)Vênus\nB)Marte\nC)Mercúrio\nD)Urano");
                resp2 = sc.next().toUpperCase();
                //INÍCIO SEGUNDO IF
                if (resp2.equals("C")){
                pontuacao[c] = pontuacao[c] + 30;
                acertos[c] = acertos[c]+1;
                } 
                else{
               pontuacao[c] = pontuacao[c] - 4;
                erros[c] = erros[c]+1;
                }
                //FIM DO SEGUNDO IF
                //TERCEIRA PERGUNTA
                System.out.println("---------------------------------");
                System.out.println("3-Qual é a cor da língua da girafa?\nA)Preta ou cinza\nB)Roxa ou azul\nC)Amarelo ou verde escuro\nD)Rosa ou vermelho");
                resp3 = sc.next().toUpperCase();
                if (resp3.equals("B")) {
                pontuacao[c] = pontuacao[c] + 50;
                acertos[c] = acertos[c]+1;
                } 
                else{
                pontuacao[c] = pontuacao[c] - 5;
                erros[c] = erros[c]+1;
                }//FIM DO TERCEIRO IF
                quant = quant + 1;
                //MENU FINAL
                System.out.println("---------------------------------");
                System.out.println("Selecione uma das opcões abaixo\n1-Continuar\n2-Ver resultados\n3-Sair");
                fim = sc.nextInt();
                if(fim == 1){
                    System.out.println("........................................");
                } 
                else if(fim == 2){
                    for(c = 1;c<quant;c++){
                    System.out.println("--------------------"+"\nNome:"+nome[c]+"\nAcertos:"+acertos[c]+"\nErros:"+erros[c]);
                    System.out.println("Pontuação:"+pontuacao[c]);}
                    System.out.println("Deseja ver o gabarito?\nS/N");
                    fimm = sc.next().toUpperCase();
                    if (fimm.equals("S")) {
                        System.out.println("----------Questão 1----------\n"+"Você marcou:"+resp1+"   Correta:A\n"+"----------Questão 2----------\n"+"Você marcou:"+resp2+"   Correta:C\n"+"----------Questão 3----------\nVocê marcou:"+resp3+"   Correta:B");
                        System.exit(0);
                    }
                    else{
                    System.exit(0);
                    }
                }
                else{
                System.exit(0);
                }
                break;
            //SEGUNDA OPÇÃO DO MENU INICIAL
            case "N":
                System.exit(0);
                break;
            default:
                System.out.println("Escolha uma opção válida!");
                c = c - 1;
        }//FIM DO SWITCH
        }//FIM DO FOR
        
    }
}