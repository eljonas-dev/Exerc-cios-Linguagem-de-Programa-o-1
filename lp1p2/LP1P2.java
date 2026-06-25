/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp04.lp1p2;

/**
 
 * João Victor dos Santos, Luis Tiago Ferreira
 * 
Exercício 01(1,0)
Reescreva as propriedades e métodos da classe Data, deixando-os de acordo com
o padrão UML (Getter e Setter).
Exercício 02 (5,0)
Crie a classe ConsultaAgendada conforme especificado abaixo (2,0):

ConsultaAgendada

- data: Data
- hora: Hora
- nomePaciente: String
- quantidade: int (static)
- nomeMedico: String
+ ConsultaAgendada ()
+ ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p,
String m)
+ ConsultaAgendada (Data d, Hora h, String p, String m)
+ setData(int a, int b, int c)
+ setData()
+ setHora(int a, int b, int c)
+ setHora()
+ setNomePaciente(String p)
+ setNomePaciente()
+ setNomeMedico(String m)
+ setNomeMedico()
+ getAmostra(): int
+ getData(): String
+ getHora(): String
+ getNomePaciente (): String
+ getNomeMedico(): String

• O construtor ConsultaAgendada deve nos permitir a digitação dos valores de data,
hora, nome do paciente e do médico;
• Os outros dois construtores devem receber os valores de data, hora, nome do
paciente e do médico sob a forma de parâmetros;
• Qualquer construtor chamado deve acrescer 1 no atributo quantidade.
• Os métodos setData(), setHora(), setNomePaciente(), setNomeMedico() devem nos
permitir alterar os valores das respectivas propriedades através da digitação de
novos valores;
• Os demais métodos “set” devem alterar os valores das propriedades a partir dos
parâmetros recebidos;
• O método getData() deve nos devolver a data no formato: dd/mm/aa;
• O método getHora() deve nos devolver a hora no formato: hh:mm:ss.

Exercício 03 (2,0)
Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles
serão solicitados:
• Usando a classe ConsultaAgendada instancie o objeto p1 inicializado-o com o
construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String
m);
• Exiba todas as propriedades de p1;
• Agora instancie o objeto p2 usando o construtor ConsultaAgendada ();
• Exiba todas as propriedades de p2;
• Usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico altere
as propriedades de p1;
• Exiba todas as propriedades de p1 novamente.
• Exiba a quantidade final de consultas.
Exercício 04 (2,0)
• Escreva todo o resultado obtido no exercício 3 em um arquivo texto.
 * @author PICHAU
 */

public class LP1P2 {

    public static void main(String[] args) {
        //p1
        ConsultaAgenda p1 = new ConsultaAgenda(2, 30, 0, 26, 6, 2026, "Jorge", "Fábio");
        System.out.println("Propriedades do objeto p1");
        System.out.println("---------------------------------");
        System.out.println("Dia: " + p1.data.getDia());
        System.out.println("Mês: " + p1.data.getMes());
        System.out.println("Ano: " + p1.data.getAno());
        System.out.println("");
        System.out.println("Hora: " + p1.hora.getHora());
        System.out.println("Minuto: " + p1.hora.getMin());
        System.out.println("Segundo: " + p1.hora.getSeg());
        System.out.println("");
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        System.out.println("Nome do médico: " + p1.getNomeMedico());
        System.out.println("---------------------------------");
        
        //p2
        ConsultaAgenda p2 = new ConsultaAgenda();
        System.out.println("---------------------------------");
        System.out.println("Propriedades do objeto p2");
        System.out.println("Dia: " + p2.data.getDia());
        System.out.println("Mês: " + p2.data.getMes());
        System.out.println("Ano: " + p2.data.getAno());
        System.out.println("");
        System.out.println("Hora: " + p2.hora.getHora());
        System.out.println("Minuto: " + p2.hora.getMin());
        System.out.println("Segundo: " + p2.hora.getSeg());
        System.out.println("");
        System.out.println("Nome do paciente: " + p2.getNomePaciente());
        System.out.println("Nome do médico: " + p2.getNomeMedico());
        
        //alterando p1
        System.out.println("---------------------------------");
        System.out.println("Alterando valores denro de p1 com setters!");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        
        //re-exibindo p1
        System.out.println("Propriedades do objeto p1 foram ATUALIZADAS!");
        System.out.println("---------------------------------");
        System.out.println("Dia: " + p1.data.getDia());
        System.out.println("Mês: " + p1.data.getMes());
        System.out.println("Ano: " + p1.data.getAno());
        System.out.println("");
        System.out.println("Hora: " + p1.hora.getHora());
        System.out.println("Minuto: " + p1.hora.getMin());
        System.out.println("Segundo: " + p1.hora.getSeg());
        System.out.println("");
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        System.out.println("Nome do médico: " + p1.getNomeMedico());
        System.out.println("---------------------------------");
        System.out.println("Sistema finalizado!");
        System.out.println("Quantidade final de consultas foi de: " + ConsultaAgenda.quantidade);
    }
}
