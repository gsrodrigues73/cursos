package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadas = LocalDate.of(2016, Month.JUNE, 5);
		int anos = hoje.getYear() - olimpiadas.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(olimpiadas, hoje);
		
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadas.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = proximasOlimpiadas.format(formatador);
		
		System.out.println(dataFormatada);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(23, 45);
		
		System.out.println(intervalo);
	}
}
