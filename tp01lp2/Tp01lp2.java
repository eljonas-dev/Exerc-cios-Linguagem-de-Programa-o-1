/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp04.tp01lp2;

/**
 *
 * @author PICHAU
 */
public class Tp01lp2 {

    public static void main(String[] args) {
// 1. Criar e preencher o array de autores
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        // 2. Instanciar o livro
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

        // 3. Testar o toString()
        System.out.println("--- Teste toString() ---");
        System.out.println(testeBook);

        // 4. Testar o getAuthorNames()
        System.out.println("\n--- Teste getAuthorNames() ---");
        System.out.println(testeBook.getAuthorNames());
    
    System.out.println("-----------------------------");
    System.out.println("=== 1. TESTANDO A CLASSE PERSON ===");
        Person p1 = new Person("Carlos Silva", "Rua A, 123");
        
        // Testando toString() e getters de Person
        System.out.println("toString(): " + p1.toString());
        System.out.println("getName(): " + p1.getName());
        System.out.println("getAddress(): " + p1.getAddress());
        
        // Testando setter de Person
        p1.setAddress("Rua B, 456");
        System.out.println("Novo getAddress() após setAddress: " + p1.getAddress());
        System.out.println();


        System.out.println("=== 2. TESTANDO A CLASSE STUDENT ===");
        Student s1 = new Student("Ana Costa", "Av. Central, 1000", "Engenharia", 2024, 1500.50);
        
        // Testando toString() e getters herdados e próprios
        System.out.println("toString(): " + s1.toString());
        System.out.println("getName() [Herdado]: " + s1.getName());
        System.out.println("getAddress() [Herdado]: " + s1.getAddress());
        System.out.println("getProgram(): " + s1.getProgram());
        System.out.println("getYear(): " + s1.getYear());
        System.out.println("getFee(): " + s1.getFee());
        
        // Testando setters de Student e de Person
        s1.setAddress("Av. Paulista, 500");
        s1.setProgram("Ciência da Computação");
        s1.setYear(2025);
        s1.setFee(1800.00);
        System.out.println("toString() após alterações: " + s1.toString());
        System.out.println();


        System.out.println("=== 3. TESTANDO A CLASSE STAFF ===");
        Staff st1 = new Staff("Roberto Santos", "Rua das Flores, 50", "Escola Politécnica", 4500.00);
        
        // Testando toString() e getters herdados e próprios
        System.out.println("toString(): " + st1.toString());
        System.out.println("getName() [Herdado]: " + st1.getName());
        System.out.println("getAddress() [Herdado]: " + st1.getAddress());
        System.out.println("getSchool(): " + st1.getSchool());
        System.out.println("getPay(): " + st1.getPay());
        
        // Testando setters de Staff e de Person
        st1.setAddress("Rua dos Pinheiros, 80");
        st1.setSchool("Instituto de Matemática");
        st1.setPay(5200.00);
        System.out.println("toString() após alterações: " + st1.toString());
    }
}
