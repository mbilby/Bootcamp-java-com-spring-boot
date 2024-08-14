import java.time.LocalDate;

import br.com.dio.desafio.dominio.model.Bootcamp;
import br.com.dio.desafio.dominio.model.Curso;
import br.com.dio.desafio.dominio.model.Dev;
import br.com.dio.desafio.dominio.model.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Descrição java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavascript = new Curso();
        cursoJavascript.setTitulo("Javascript");
        cursoJavascript.setDescricao("Descrição javascript");
        cursoJavascript.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria java");
        mentoriaJava.setDescricao("Descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        // System.out.println(cursoJava);
        // System.out.println(cursoJavascript);
        // System.out.println(mentoriaJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        System.out.println("Conteúdos inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos concluído Marcelo: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calculaTotalXp());
        

        System.out.println("-------------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calculaTotalXp());
    }
}
