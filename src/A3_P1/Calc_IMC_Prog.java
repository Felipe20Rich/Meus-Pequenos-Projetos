package A3_P1;
import java.util.Scanner;
import java.util.ArrayList;

public class Calc_IMC_Prog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<MetodoIMC_1> list = new ArrayList<>();
        String Externo;
        String Interno;
        String Interno2;
        String Interninho;

        do {
            System.out.println("\nSEJA BEM-VINDO À CALCULADORA DE IMC!");
            System.out.println("\nDeseja executar o Programa? " +
                                "\nA) Sim  \nB) Não \n");
            Externo = scan.nextLine();
            if (Externo.equalsIgnoreCase("a")) {
                do {
                    System.out.println("\nDigite O Nome Do Paciente: ");
                    String nome = scan.nextLine();

                    System.out.println("Digite O Sobrenome Do Paciente: ");
                    String sobrenome = scan.nextLine();

                    System.out.println("Digite A Idade Do Paciente: ");
                    int idade = scan.nextInt();

                    System.out.println("Digite O Peso Do Paciente: ");
                    double peso = scan.nextDouble();

                    System.out.println("Digite A Altura Do Paciente: ");
                    double altura = scan.nextDouble();

                    scan.nextLine();

                    MetodoIMC_1 paciente = new MetodoIMC_1(nome, sobrenome, idade, peso, altura);

                    list.add(paciente);

                    for (MetodoIMC_1 p : list) {
                        System.out.println(p);
                    }

                    System.out.println("\nDeseja adicionar outro paciente? " +
                                       "\nA) Sim  \nB) Não");
                    Interno = scan.nextLine();
                } while (Interno.equalsIgnoreCase("a"));

                System.out.println("\nDeseja procurar algum paciente que foi adicionado? " +
                                   "\nA) Sim  \nB) Não");
                Interno2 = scan.nextLine();


                do {
                    if (Interno2.equalsIgnoreCase("a"))  {
                        System.out.println("\nDigite o ID do paciente que deseja procurar: ");
                        Interninho = scan.nextLine();

                        boolean encontrado = false;

                        for (MetodoIMC_1 paciente : list) {
                            if (paciente.getId() == Integer.parseInt(Interninho)) {
                                encontrado = true;
                                System.out.println("\n- Paciente encontrado:");
                                System.out.println(paciente);
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("\n- Paciente não encontrado");
                        }

                        System.out.println("\nDeseja procurar algum paciente que foi adicionado? " +
                                           "\nA) Sim  \nB) Não\n");
                        Interno2 = scan.nextLine();

                    }
                } while(Interno2.equalsIgnoreCase("a"));


                String loading1 = "...";
                for (int i = 0; i < 5; i++) {
                    System.out.println("\nReiniciando o programa" + "\n" + loading1);
                }

            }


        } while (!Externo.equalsIgnoreCase("b"));


        String loading2 = "...";

        for (int i = 0; i < 5; i++) {
            System.out.println("\n" + loading2);
        }
        System.out.println("\nPrograma encerrado!");
    }
}
