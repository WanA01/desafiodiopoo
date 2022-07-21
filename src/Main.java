import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTITULO("curso java");
        curso1.setDESCRICAO("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTITULO("curso js");
        curso2.setDESCRICAO("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTITULO("mentoria de java");
        mentoria.setDESCRICAO("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Larissa:" + devLarissa.getConteudosEscritos());
        devLarissa.progredir();
        devLarissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Larissa:" + devLarissa.getConteudosEscritos());
        System.out.println("Conteúdos Concluídos Larissa:" + devLarissa.getConteudosConcluidos());
        System.out.println("XP:" + devLarissa.calcularTotalXP());

        System.out.println("-------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo:" + devPaulo.getConteudosEsscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devPaulo.getConteudosEscritos());
        System.out.println("Conteúdos Concluidos João:" + devPaulo.getConteudosConcluidos());
        System.out.println("XP:" + devPaulo.calcularTotalXP());

    }
}


