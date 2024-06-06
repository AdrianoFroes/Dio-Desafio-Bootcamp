package br.com.desafio.dominio;

import java.time.LocalDate;

public class ClasseExecutora {

	public static void main(String[] args) {
		
		Curso c1 = new Curso();
		c1.setTitulo(" Curso Java");
		c1.setDescricao("curso de java POO");
		c1.setCargaHoraria(200);
		
		Curso c2 = new Curso();
		c2.setTitulo(" SPRING BOOT");
		c2.setDescricao("API COM SPRING");
		c2.setCargaHoraria(200);
		
		
		
		Conteudo conteudo = new Curso();
		
		
		Mentoria m = new Mentoria();
		m.setTitulo("Mentoria Java");
		m.setDescricao("Mentoria Java POO");
		m.setData(LocalDate.now());
		
		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(m);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(c1);
		bootcamp.getConteudos().add(c2);
		bootcamp.getConteudos().add(m);
		
		Dev devFroes = new Dev();
		devFroes.setNome("Adriano Froes");
		devFroes.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscritos Adriano" + devFroes.getConteudoInscritos());
		
		devFroes.progredir();
		devFroes.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscritos Adriano" + devFroes.getConteudoInscritos());
		System.out.println("Conteudo Concluido Adriano" + devFroes.getConteudoConcluidos());
		System.out.println("XP: " + devFroes.calcularTotalXp());
		
		System.out.println("---------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao Silva");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos  Joao" + devJoao.getConteudoInscritos());
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos  Joao" + devJoao.getConteudoInscritos());
		System.out.println("Conteudos Concluido  Joao" + devJoao.getConteudoConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
	}
	
}
